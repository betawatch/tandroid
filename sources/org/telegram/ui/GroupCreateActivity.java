package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GroupCreateDividerItemDecoration;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PermanentLinkBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.GroupCreateActivity;
/* loaded from: classes4.dex */
public class GroupCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener {
    private GroupCreateAdapter adapter;
    private boolean addToGroup;
    private ArrayList<GroupCreateSpan> allSpans;
    private boolean allowPremium;
    private long channelId;
    private int chatAddType;
    private long chatId;
    private int chatType;
    private int containerHeight;
    private AnimatorSet currentAnimation;
    private GroupCreateSpan currentDeletingSpan;
    private AnimatorSet currentDoneButtonAnimation;
    private GroupCreateActivityDelegate delegate;
    private ContactsAddActivityDelegate delegate2;
    private boolean doneButtonVisible;
    private EditTextBoldCursor editText;
    private StickerEmptyView emptyView;
    private int fieldY;
    private ImageView floatingButton;
    private boolean forImport;
    private boolean ignoreScrollEvent;
    private LongSparseArray<TLObject> ignoreUsers;
    private TLRPC$ChatFull info;
    private boolean isAlwaysShare;
    private boolean isNeverShare;
    private GroupCreateDividerItemDecoration itemDecoration;
    private RecyclerListView listView;
    private int maxCount;
    int maxSize;
    private int measuredContainerHeight;
    private ScrollView scrollView;
    private boolean searchWas;
    private boolean searching;
    private LongSparseArray<GroupCreateSpan> selectedContacts;
    private GroupCreateSpan selectedPremium;
    private PermanentLinkBottomSheet sharedLinkBottomSheet;
    private int shiftDp;
    private SpansContainer spansContainer;
    private ArrayList<Long> toSelectIds;
    private boolean toSelectPremium;

    /* loaded from: classes4.dex */
    public interface ContactsAddActivityDelegate {

        /* loaded from: classes4.dex */
        public final /* synthetic */ class -CC {
            public static void $default$needAddBot(ContactsAddActivityDelegate contactsAddActivityDelegate, TLRPC$User tLRPC$User) {
            }
        }

        void didSelectUsers(ArrayList<TLRPC$User> arrayList, int i);

        void needAddBot(TLRPC$User tLRPC$User);
    }

    /* loaded from: classes4.dex */
    public interface GroupCreateActivityDelegate {
        void didSelectUsers(boolean z, ArrayList<Long> arrayList);
    }

    public void select(ArrayList<Long> arrayList, boolean z) {
        GroupCreateSpan groupCreateSpan;
        Object user;
        SpansContainer spansContainer = this.spansContainer;
        if (spansContainer == null) {
            this.toSelectIds = arrayList;
            this.toSelectPremium = z;
            return;
        }
        if (z && this.selectedPremium == null) {
            GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(getContext(), "premium");
            this.selectedPremium = groupCreateSpan2;
            this.spansContainer.addSpan(groupCreateSpan2);
            this.selectedPremium.setOnClickListener(this);
        } else if (!z && (groupCreateSpan = this.selectedPremium) != null) {
            spansContainer.removeSpan(groupCreateSpan);
            this.selectedPremium = null;
        }
        Iterator<Long> it = arrayList.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            long longValue = next.longValue();
            if (longValue < 0) {
                user = getMessagesController().getChat(Long.valueOf(-longValue));
            } else {
                user = getMessagesController().getUser(next);
            }
            if (user != null) {
                GroupCreateSpan groupCreateSpan3 = new GroupCreateSpan(getContext(), user);
                this.spansContainer.addSpan(groupCreateSpan3);
                groupCreateSpan3.setOnClickListener(this);
            }
        }
        this.spansContainer.endAnimation();
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class SpansContainer extends ViewGroup {
        private View addingSpan;
        private int animationIndex;
        private boolean animationStarted;
        private ArrayList<Animator> animators;
        private final ArrayList<View> removingSpans;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList<>();
            this.removingSpans = new ArrayList<>();
            this.animationIndex = -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int min;
            boolean z;
            int i3;
            int i4;
            char c;
            int size = View.MeasureSpec.getSize(i);
            int dp = size - AndroidUtilities.dp(26.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int childCount = getChildCount(); i5 < childCount; childCount = i3) {
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    boolean contains = this.removingSpans.contains(childAt);
                    if (!contains && childAt.getMeasuredWidth() + i6 > dp) {
                        dp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i6 = 0;
                    }
                    if (childAt.getMeasuredWidth() + i7 > dp) {
                        dp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i7 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(13.0f) + i6;
                    if (!this.animationStarted) {
                        if (contains) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i7);
                            childAt.setTranslationY(dp3);
                        } else {
                            if (!this.removingSpans.isEmpty()) {
                                float f = dp4;
                                if (childAt.getTranslationX() != f) {
                                    i3 = childCount;
                                    i4 = 1;
                                    c = 0;
                                    this.animators.add(ObjectAnimator.ofFloat(childAt, "translationX", f));
                                } else {
                                    i3 = childCount;
                                    i4 = 1;
                                    c = 0;
                                }
                                float f2 = dp2;
                                if (childAt.getTranslationY() != f2) {
                                    ArrayList<Animator> arrayList = this.animators;
                                    float[] fArr = new float[i4];
                                    fArr[c] = f2;
                                    arrayList.add(ObjectAnimator.ofFloat(childAt, "translationY", fArr));
                                }
                            } else {
                                i3 = childCount;
                                childAt.setTranslationX(dp4);
                                childAt.setTranslationY(dp2);
                            }
                            if (!contains) {
                                i6 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                            }
                            i7 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                        }
                    }
                    i3 = childCount;
                    if (!contains) {
                    }
                    i7 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                } else {
                    i3 = childCount;
                }
                i5++;
            }
            if (AndroidUtilities.isTablet()) {
                min = AndroidUtilities.dp(372.0f) / 3;
            } else {
                Point point = AndroidUtilities.displaySize;
                min = (Math.min(point.x, point.y) - AndroidUtilities.dp(158.0f)) / 3;
            }
            if (dp - i6 < min) {
                dp2 += AndroidUtilities.dp(40.0f);
                i6 = 0;
            }
            if (dp - i7 < min) {
                dp3 += AndroidUtilities.dp(40.0f);
            }
            GroupCreateActivity.this.editText.measure(View.MeasureSpec.makeMeasureSpec(dp - i6, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            if (this.animationStarted) {
                if (GroupCreateActivity.this.currentAnimation != null && !GroupCreateActivity.this.ignoreScrollEvent && this.removingSpans.isEmpty()) {
                    GroupCreateActivity.this.editText.bringPointIntoView(GroupCreateActivity.this.editText.getSelectionStart());
                }
            } else {
                int dp5 = dp3 + AndroidUtilities.dp(42.0f);
                int dp6 = i6 + AndroidUtilities.dp(16.0f);
                GroupCreateActivity.this.fieldY = dp2;
                if (GroupCreateActivity.this.currentAnimation != null) {
                    int dp7 = dp2 + AndroidUtilities.dp(42.0f);
                    if (GroupCreateActivity.this.containerHeight != dp7) {
                        this.animators.add(ObjectAnimator.ofInt(GroupCreateActivity.this, "containerHeight", dp7));
                    }
                    GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                    groupCreateActivity.measuredContainerHeight = Math.max(groupCreateActivity.containerHeight, dp7);
                    float f3 = dp6;
                    if (GroupCreateActivity.this.editText.getTranslationX() != f3) {
                        this.animators.add(ObjectAnimator.ofFloat(GroupCreateActivity.this.editText, "translationX", f3));
                    }
                    if (GroupCreateActivity.this.editText.getTranslationY() != GroupCreateActivity.this.fieldY) {
                        z = false;
                        this.animators.add(ObjectAnimator.ofFloat(GroupCreateActivity.this.editText, "translationY", GroupCreateActivity.this.fieldY));
                    } else {
                        z = false;
                    }
                    GroupCreateActivity.this.editText.setAllowDrawCursor(z);
                    GroupCreateActivity.this.currentAnimation.playTogether(this.animators);
                    GroupCreateActivity.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCreateActivity.SpansContainer.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            GroupCreateActivity.this.getNotificationCenter().onAnimationFinish(SpansContainer.this.animationIndex);
                            SpansContainer.this.requestLayout();
                        }
                    });
                    this.animationIndex = GroupCreateActivity.this.getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
                    GroupCreateActivity.this.currentAnimation.start();
                    this.animationStarted = true;
                } else {
                    GroupCreateActivity groupCreateActivity2 = GroupCreateActivity.this;
                    groupCreateActivity2.measuredContainerHeight = groupCreateActivity2.containerHeight = dp5;
                    GroupCreateActivity.this.editText.setTranslationX(dp6);
                    GroupCreateActivity.this.editText.setTranslationY(GroupCreateActivity.this.fieldY);
                }
            }
            setMeasuredDimension(size, GroupCreateActivity.this.measuredContainerHeight);
            GroupCreateActivity.this.listView.setTranslationY(0.0f);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan) {
            GroupCreateActivity.this.allSpans.add(groupCreateSpan);
            if (!groupCreateSpan.isFlag) {
                GroupCreateActivity.this.selectedContacts.put(groupCreateSpan.getUid(), groupCreateSpan);
            }
            GroupCreateActivity.this.editText.setHintVisible(false, TextUtils.isEmpty(GroupCreateActivity.this.editText.getText()));
            if (GroupCreateActivity.this.currentAnimation != null && GroupCreateActivity.this.currentAnimation.isRunning()) {
                GroupCreateActivity.this.currentAnimation.setupEndValues();
                GroupCreateActivity.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            GroupCreateActivity.this.currentAnimation = new AnimatorSet();
            GroupCreateActivity.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCreateActivity.SpansContainer.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.addingSpan = null;
                    GroupCreateActivity.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                    GroupCreateActivity.this.editText.setAllowDrawCursor(true);
                }
            });
            GroupCreateActivity.this.currentAnimation.setDuration(150L);
            this.addingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.SCALE_X, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.SCALE_Y, 0.01f, 1.0f));
            this.animators.add(ObjectAnimator.ofFloat(this.addingSpan, View.ALPHA, 0.0f, 1.0f));
            addView(groupCreateSpan);
        }

        public void endAnimation() {
            if (GroupCreateActivity.this.currentAnimation == null || !GroupCreateActivity.this.currentAnimation.isRunning()) {
                return;
            }
            GroupCreateActivity.this.currentAnimation.setupEndValues();
            GroupCreateActivity.this.currentAnimation.cancel();
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            GroupCreateActivity.this.ignoreScrollEvent = true;
            if (!groupCreateSpan.isFlag) {
                GroupCreateActivity.this.selectedContacts.remove(groupCreateSpan.getUid());
            }
            if (groupCreateSpan == GroupCreateActivity.this.selectedPremium) {
                GroupCreateActivity.this.selectedPremium = null;
            }
            GroupCreateActivity.this.allSpans.remove(groupCreateSpan);
            groupCreateSpan.setOnClickListener(null);
            if (GroupCreateActivity.this.currentAnimation != null) {
                GroupCreateActivity.this.currentAnimation.setupEndValues();
                GroupCreateActivity.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            GroupCreateActivity.this.currentAnimation = new AnimatorSet();
            GroupCreateActivity.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCreateActivity.SpansContainer.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpans.clear();
                    GroupCreateActivity.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                    GroupCreateActivity.this.editText.setAllowDrawCursor(true);
                    if (GroupCreateActivity.this.allSpans.isEmpty()) {
                        GroupCreateActivity.this.editText.setHintVisible(true, true);
                    }
                }
            });
            GroupCreateActivity.this.currentAnimation.setDuration(150L);
            this.removingSpans.clear();
            this.removingSpans.add(groupCreateSpan);
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }

        public void removeAllSpans(boolean z) {
            GroupCreateActivity.this.ignoreScrollEvent = true;
            final ArrayList arrayList = new ArrayList(GroupCreateActivity.this.allSpans);
            GroupCreateActivity.this.allSpans.clear();
            this.removingSpans.clear();
            this.removingSpans.addAll(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                ((GroupCreateSpan) arrayList.get(i)).setOnClickListener(null);
            }
            endAnimation();
            if (z) {
                this.animationStarted = false;
                GroupCreateActivity.this.currentAnimation = new AnimatorSet();
                GroupCreateActivity.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCreateActivity.SpansContainer.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            SpansContainer.this.removeView((View) arrayList.get(i2));
                        }
                        SpansContainer.this.removingSpans.clear();
                        GroupCreateActivity.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                        GroupCreateActivity.this.editText.setAllowDrawCursor(true);
                        if (GroupCreateActivity.this.allSpans.isEmpty()) {
                            GroupCreateActivity.this.editText.setHintVisible(true, true);
                        }
                    }
                });
                this.animators.clear();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) arrayList.get(i2);
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.SCALE_X, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.SCALE_Y, 1.0f, 0.01f));
                    this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, View.ALPHA, 1.0f, 0.0f));
                }
            } else {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    removeView((View) arrayList.get(i3));
                }
                this.removingSpans.clear();
                GroupCreateActivity.this.currentAnimation = null;
                this.animationStarted = false;
                GroupCreateActivity.this.editText.setAllowDrawCursor(true);
                if (GroupCreateActivity.this.allSpans.isEmpty()) {
                    GroupCreateActivity.this.editText.setHintVisible(true, true);
                }
            }
            requestLayout();
        }
    }

    public GroupCreateActivity() {
        this.maxCount = getMessagesController().maxMegagroupCount;
        this.chatType = 0;
        this.selectedContacts = new LongSparseArray<>();
        this.allSpans = new ArrayList<>();
        this.shiftDp = -4;
    }

    public GroupCreateActivity(Bundle bundle) {
        super(bundle);
        this.maxCount = getMessagesController().maxMegagroupCount;
        this.chatType = 0;
        this.selectedContacts = new LongSparseArray<>();
        this.allSpans = new ArrayList<>();
        this.shiftDp = -4;
        this.chatType = bundle.getInt("chatType", 0);
        this.forImport = bundle.getBoolean("forImport", false);
        this.isAlwaysShare = bundle.getBoolean("isAlwaysShare", false);
        this.isNeverShare = bundle.getBoolean("isNeverShare", false);
        this.addToGroup = bundle.getBoolean("addToGroup", false);
        this.chatAddType = bundle.getInt("chatAddType", 0);
        this.allowPremium = bundle.getBoolean("allowPremium", false);
        this.chatId = bundle.getLong("chatId");
        this.channelId = bundle.getLong("channelId");
        if (this.isAlwaysShare || this.isNeverShare || this.addToGroup) {
            this.maxCount = 0;
        } else {
            this.maxCount = this.chatType == 0 ? getMessagesController().maxMegagroupCount : getMessagesController().maxBroadcastCount;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            updateHint();
            checkVisibleRows();
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(final Context context) {
        int i;
        String str;
        this.searching = false;
        this.searchWas = false;
        this.allSpans.clear();
        this.selectedContacts.clear();
        this.currentDeletingSpan = null;
        if (this.chatType == 2) {
            this.doneButtonVisible = true;
        } else {
            this.doneButtonVisible = !this.addToGroup;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.chatType;
        if (i2 == 2) {
            this.actionBar.setTitle(LocaleController.getString("ChannelAddSubscribers", R.string.ChannelAddSubscribers));
        } else if (this.addToGroup) {
            if (this.channelId != 0) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddSubscribers", R.string.ChannelAddSubscribers));
            } else {
                this.actionBar.setTitle(LocaleController.getString("GroupAddMembers", R.string.GroupAddMembers));
            }
        } else if (this.isAlwaysShare) {
            int i3 = this.chatAddType;
            if (i3 == 2) {
                this.actionBar.setTitle(LocaleController.getString("FilterAlwaysShow", R.string.FilterAlwaysShow));
            } else if (i3 == 1) {
                this.actionBar.setTitle(LocaleController.getString("AlwaysAllow", R.string.AlwaysAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString("AlwaysShareWithTitle", R.string.AlwaysShareWithTitle));
            }
        } else if (this.isNeverShare) {
            int i4 = this.chatAddType;
            if (i4 == 2) {
                this.actionBar.setTitle(LocaleController.getString("FilterNeverShow", R.string.FilterNeverShow));
            } else if (i4 == 1) {
                this.actionBar.setTitle(LocaleController.getString("NeverAllow", R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString("NeverShareWithTitle", R.string.NeverShareWithTitle));
            }
        } else {
            ActionBar actionBar = this.actionBar;
            if (i2 == 0) {
                i = R.string.NewGroup;
                str = "NewGroup";
            } else {
                i = R.string.NewBroadcastList;
                str = "NewBroadcastList";
            }
            actionBar.setTitle(LocaleController.getString(str, i));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.GroupCreateActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    GroupCreateActivity.this.finishFragment();
                } else if (i5 == 1) {
                    GroupCreateActivity.this.onDonePressed(true);
                }
            }
        });
        ViewGroup viewGroup = new ViewGroup(context) { // from class: org.telegram.ui.GroupCreateActivity.2
            private VerticalPositionAutoAnimator verticalPositionAutoAnimator;

            @Override // android.view.ViewGroup
            public void onViewAdded(View view) {
                if (view == GroupCreateActivity.this.floatingButton && this.verticalPositionAutoAnimator == null) {
                    this.verticalPositionAutoAnimator = VerticalPositionAutoAnimator.attach(view);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                VerticalPositionAutoAnimator verticalPositionAutoAnimator = this.verticalPositionAutoAnimator;
                if (verticalPositionAutoAnimator != null) {
                    verticalPositionAutoAnimator.ignoreNextLayout();
                }
            }

            @Override // android.view.View
            protected void onMeasure(int i5, int i6) {
                int size = View.MeasureSpec.getSize(i5);
                int size2 = View.MeasureSpec.getSize(i6);
                setMeasuredDimension(size, size2);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    GroupCreateActivity.this.maxSize = AndroidUtilities.dp(144.0f);
                } else {
                    GroupCreateActivity.this.maxSize = AndroidUtilities.dp(56.0f);
                }
                GroupCreateActivity.this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(GroupCreateActivity.this.maxSize, Integer.MIN_VALUE));
                GroupCreateActivity.this.listView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - GroupCreateActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                GroupCreateActivity.this.emptyView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - GroupCreateActivity.this.scrollView.getMeasuredHeight(), 1073741824));
                if (GroupCreateActivity.this.floatingButton != null) {
                    int dp = AndroidUtilities.dp(Build.VERSION.SDK_INT < 21 ? 60.0f : 56.0f);
                    GroupCreateActivity.this.floatingButton.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                GroupCreateActivity.this.scrollView.layout(0, 0, GroupCreateActivity.this.scrollView.getMeasuredWidth(), GroupCreateActivity.this.scrollView.getMeasuredHeight());
                GroupCreateActivity.this.listView.layout(0, GroupCreateActivity.this.scrollView.getMeasuredHeight(), GroupCreateActivity.this.listView.getMeasuredWidth(), GroupCreateActivity.this.scrollView.getMeasuredHeight() + GroupCreateActivity.this.listView.getMeasuredHeight());
                GroupCreateActivity.this.emptyView.layout(0, GroupCreateActivity.this.scrollView.getMeasuredHeight(), GroupCreateActivity.this.emptyView.getMeasuredWidth(), GroupCreateActivity.this.scrollView.getMeasuredHeight() + GroupCreateActivity.this.emptyView.getMeasuredHeight());
                if (GroupCreateActivity.this.floatingButton != null) {
                    int dp = LocaleController.isRTL ? AndroidUtilities.dp(14.0f) : ((i7 - i5) - AndroidUtilities.dp(14.0f)) - GroupCreateActivity.this.floatingButton.getMeasuredWidth();
                    int dp2 = ((i8 - i6) - AndroidUtilities.dp(14.0f)) - GroupCreateActivity.this.floatingButton.getMeasuredHeight();
                    GroupCreateActivity.this.floatingButton.layout(dp, dp2, GroupCreateActivity.this.floatingButton.getMeasuredWidth() + dp, GroupCreateActivity.this.floatingButton.getMeasuredHeight() + dp2);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                INavigationLayout iNavigationLayout = ((BaseFragment) GroupCreateActivity.this).parentLayout;
                GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                iNavigationLayout.drawHeaderShadow(canvas, Math.min(groupCreateActivity.maxSize, (groupCreateActivity.measuredContainerHeight + GroupCreateActivity.this.containerHeight) - GroupCreateActivity.this.measuredContainerHeight));
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view != GroupCreateActivity.this.listView) {
                    if (view == GroupCreateActivity.this.scrollView) {
                        canvas.save();
                        int left = view.getLeft();
                        int top = view.getTop();
                        int right = view.getRight();
                        GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                        canvas.clipRect(left, top, right, Math.min(groupCreateActivity.maxSize, (groupCreateActivity.measuredContainerHeight + GroupCreateActivity.this.containerHeight) - GroupCreateActivity.this.measuredContainerHeight));
                        boolean drawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                int left2 = view.getLeft();
                GroupCreateActivity groupCreateActivity2 = GroupCreateActivity.this;
                canvas.clipRect(left2, Math.min(groupCreateActivity2.maxSize, (groupCreateActivity2.measuredContainerHeight + GroupCreateActivity.this.containerHeight) - GroupCreateActivity.this.measuredContainerHeight), view.getRight(), view.getBottom());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
        };
        this.fragmentView = viewGroup;
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setDescendantFocusability(131072);
        ScrollView scrollView = new ScrollView(context) { // from class: org.telegram.ui.GroupCreateActivity.3
            @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                if (GroupCreateActivity.this.ignoreScrollEvent) {
                    GroupCreateActivity.this.ignoreScrollEvent = false;
                    return false;
                }
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top += GroupCreateActivity.this.fieldY + AndroidUtilities.dp(20.0f);
                rect.bottom += GroupCreateActivity.this.fieldY + AndroidUtilities.dp(50.0f);
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.scrollView = scrollView;
        scrollView.setClipChildren(false);
        viewGroup.setClipChildren(false);
        this.scrollView.setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_windowBackgroundWhite));
        viewGroup.addView(this.scrollView);
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.scrollView.addView(spansContainer, LayoutHelper.createFrame(-1, -2.0f));
        this.spansContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCreateActivity.this.lambda$createView$0(view);
            }
        });
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) { // from class: org.telegram.ui.GroupCreateActivity.4
            @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (GroupCreateActivity.this.currentDeletingSpan != null) {
                    GroupCreateActivity.this.currentDeletingSpan.cancelDeleteAnimation();
                    GroupCreateActivity.this.currentDeletingSpan = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.editText.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText));
        this.editText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.editText.setCursorColor(Theme.getColor(Theme.key_groupcreate_cursor));
        this.editText.setCursorWidth(1.5f);
        this.editText.setInputType(655536);
        this.editText.setSingleLine(true);
        this.editText.setBackgroundDrawable(null);
        this.editText.setVerticalScrollBarEnabled(false);
        this.editText.setHorizontalScrollBarEnabled(false);
        this.editText.setTextIsSelectable(false);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setImeOptions(268435462);
        this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.spansContainer.addView(this.editText);
        updateEditTextHint();
        this.editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: org.telegram.ui.GroupCreateActivity.5
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        this.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                boolean lambda$createView$1;
                lambda$createView$1 = GroupCreateActivity.this.lambda$createView$1(textView, i5, keyEvent);
                return lambda$createView$1;
            }
        });
        this.editText.setOnKeyListener(new View.OnKeyListener() { // from class: org.telegram.ui.GroupCreateActivity.6
            private boolean wasEmpty;

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i5, KeyEvent keyEvent) {
                if (i5 == 67) {
                    if (keyEvent.getAction() == 0) {
                        this.wasEmpty = GroupCreateActivity.this.editText.length() == 0;
                    } else if (keyEvent.getAction() == 1 && this.wasEmpty && !GroupCreateActivity.this.allSpans.isEmpty()) {
                        GroupCreateActivity.this.spansContainer.removeSpan((GroupCreateSpan) GroupCreateActivity.this.allSpans.get(GroupCreateActivity.this.allSpans.size() - 1));
                        GroupCreateActivity.this.updateHint();
                        GroupCreateActivity.this.checkVisibleRows();
                        return true;
                    }
                }
                return false;
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.GroupCreateActivity.7
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (GroupCreateActivity.this.editText.length() == 0) {
                    GroupCreateActivity.this.closeSearch();
                    return;
                }
                if (!GroupCreateActivity.this.adapter.searching) {
                    GroupCreateActivity.this.searching = true;
                    GroupCreateActivity.this.searchWas = true;
                    GroupCreateActivity.this.adapter.setSearching(true);
                    GroupCreateActivity.this.itemDecoration.setSearching(true);
                    GroupCreateActivity.this.listView.setFastScrollVisible(false);
                    GroupCreateActivity.this.listView.setVerticalScrollBarEnabled(true);
                }
                GroupCreateActivity.this.adapter.searchDialogs(GroupCreateActivity.this.editText.getText().toString());
                GroupCreateActivity.this.emptyView.showProgress(true, false);
            }
        });
        ArrayList<Long> arrayList = this.toSelectIds;
        if (arrayList != null) {
            select(arrayList, this.toSelectPremium);
        }
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
        viewGroup.addView(this.emptyView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setFastScrollEnabled(0);
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerListView recyclerListView3 = this.listView;
        GroupCreateDividerItemDecoration groupCreateDividerItemDecoration = new GroupCreateDividerItemDecoration();
        this.itemDecoration = groupCreateDividerItemDecoration;
        recyclerListView3.addItemDecoration(groupCreateDividerItemDecoration);
        viewGroup.addView(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i5) {
                GroupCreateActivity.this.lambda$createView$3(context, view, i5);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.GroupCreateActivity.8
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                if (i5 == 1) {
                    GroupCreateActivity.this.editText.hideActionMode();
                    AndroidUtilities.hideKeyboard(GroupCreateActivity.this.editText);
                }
            }
        });
        this.listView.setAnimateEmptyView(true, 0);
        ImageView imageView = new ImageView(context);
        this.floatingButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
        if (this.isNeverShare || this.isAlwaysShare || this.addToGroup) {
            this.floatingButton.setImageResource(R.drawable.floating_check);
        } else {
            BackDrawable backDrawable = new BackDrawable(false);
            backDrawable.setArrowRotation(NotificationCenter.updateBotMenuButton);
            this.floatingButton.setImageDrawable(backDrawable);
        }
        if (i5 >= 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(this.floatingButton, "translationZ", AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButton, "translationZ", AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
            this.floatingButton.setStateListAnimator(stateListAnimator);
            this.floatingButton.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.GroupCreateActivity.9
                @Override // android.view.ViewOutlineProvider
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
        }
        viewGroup.addView(this.floatingButton);
        this.floatingButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupCreateActivity.this.lambda$createView$4(view);
            }
        });
        if (!this.doneButtonVisible) {
            this.floatingButton.setVisibility(4);
            this.floatingButton.setScaleX(0.0f);
            this.floatingButton.setScaleY(0.0f);
            this.floatingButton.setAlpha(0.0f);
        }
        this.floatingButton.setContentDescription(LocaleController.getString("Next", R.string.Next));
        updateHint();
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(View view) {
        this.editText.clearFocus();
        this.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 && onDonePressed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(Context context, View view, int i) {
        long j;
        if (i == 0 && this.adapter.inviteViaLink != 0 && !this.adapter.searching) {
            PermanentLinkBottomSheet permanentLinkBottomSheet = new PermanentLinkBottomSheet(context, false, this, this.info, this.chatId, this.channelId != 0);
            this.sharedLinkBottomSheet = permanentLinkBottomSheet;
            showDialog(permanentLinkBottomSheet);
        } else if (view instanceof GroupCreateUserCell) {
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            if (groupCreateUserCell.currentPremium) {
                GroupCreateSpan groupCreateSpan = this.selectedPremium;
                if (groupCreateSpan == null) {
                    GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(this.editText.getContext(), "premium");
                    this.selectedPremium = groupCreateSpan2;
                    this.spansContainer.addSpan(groupCreateSpan2);
                    this.selectedPremium.setOnClickListener(this);
                } else {
                    this.spansContainer.removeSpan(groupCreateSpan);
                    this.selectedPremium = null;
                }
                checkVisibleRows();
                return;
            }
            Object object = groupCreateUserCell.getObject();
            boolean z = object instanceof TLRPC$User;
            if (z) {
                j = ((TLRPC$User) object).id;
            } else if (!(object instanceof TLRPC$Chat)) {
                return;
            } else {
                j = -((TLRPC$Chat) object).id;
            }
            LongSparseArray<TLObject> longSparseArray = this.ignoreUsers;
            if (longSparseArray == null || longSparseArray.indexOfKey(j) < 0) {
                if (groupCreateUserCell.isBlocked()) {
                    showPremiumBlockedToast(groupCreateUserCell, j);
                    return;
                }
                if (this.selectedContacts.indexOfKey(j) >= 0) {
                    this.spansContainer.removeSpan(this.selectedContacts.get(j));
                } else if (this.maxCount != 0 && this.selectedContacts.size() == this.maxCount) {
                    return;
                } else {
                    if (this.chatType == 0 && this.selectedContacts.size() == getMessagesController().maxGroupCount) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                        builder.setMessage(LocaleController.getString("SoftUserLimitAlert", R.string.SoftUserLimitAlert));
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                        showDialog(builder.create());
                        return;
                    }
                    if (z) {
                        final TLRPC$User tLRPC$User = (TLRPC$User) object;
                        if (this.addToGroup && tLRPC$User.bot) {
                            long j2 = this.channelId;
                            if (j2 == 0 && tLRPC$User.bot_nochats) {
                                try {
                                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString("BotCantJoinGroups", R.string.BotCantJoinGroups)).show();
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            } else if (j2 != 0) {
                                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                                if (ChatObject.canAddAdmins(chat)) {
                                    builder2.setTitle(LocaleController.getString("AddBotAdminAlert", R.string.AddBotAdminAlert));
                                    builder2.setMessage(LocaleController.getString("AddBotAsAdmin", R.string.AddBotAsAdmin));
                                    builder2.setPositiveButton(LocaleController.getString("AddAsAdmin", R.string.AddAsAdmin), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda6
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            GroupCreateActivity.this.lambda$createView$2(tLRPC$User, dialogInterface, i2);
                                        }
                                    });
                                    builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                                } else {
                                    builder2.setMessage(LocaleController.getString("CantAddBotAsAdmin", R.string.CantAddBotAsAdmin));
                                    builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                                }
                                showDialog(builder2.create());
                                return;
                            }
                        }
                        getMessagesController().putUser(tLRPC$User, true ^ this.searching);
                    } else if (object instanceof TLRPC$Chat) {
                        getMessagesController().putChat((TLRPC$Chat) object, true ^ this.searching);
                    }
                    GroupCreateSpan groupCreateSpan3 = new GroupCreateSpan(this.editText.getContext(), object);
                    this.spansContainer.addSpan(groupCreateSpan3);
                    groupCreateSpan3.setOnClickListener(this);
                }
                updateHint();
                if (this.searching || this.searchWas) {
                    AndroidUtilities.showKeyboard(this.editText);
                } else {
                    checkVisibleRows();
                }
                if (this.editText.length() > 0) {
                    this.editText.setText((CharSequence) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        this.delegate2.needAddBot(tLRPC$User);
        if (this.editText.length() > 0) {
            this.editText.setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(View view) {
        onDonePressed(true);
    }

    private void showPremiumBlockedToast(View view, long j) {
        String str;
        Bulletin createSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            str = "";
        } else {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            createSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            createSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCreateActivity.this.lambda$showPremiumBlockedToast$5();
                }
            });
        }
        createSimpleBulletin.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlockedToast$5() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateEditTextHint() {
        GroupCreateAdapter groupCreateAdapter;
        EditTextBoldCursor editTextBoldCursor = this.editText;
        if (editTextBoldCursor == null) {
            return;
        }
        if (this.chatType == 2) {
            editTextBoldCursor.setHintText(LocaleController.getString("AddMutual", R.string.AddMutual));
        } else if (this.addToGroup || ((groupCreateAdapter = this.adapter) != null && groupCreateAdapter.noContactsStubRow == 0)) {
            this.editText.setHintText(LocaleController.getString("SearchForPeople", R.string.SearchForPeople));
        } else if (this.isAlwaysShare || this.isNeverShare) {
            this.editText.setHintText(LocaleController.getString("SearchForPeopleAndGroups", R.string.SearchForPeopleAndGroups));
        } else {
            this.editText.setHintText(LocaleController.getString("SendMessageTo", R.string.SendMessageTo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showItemsAnimated(final int i) {
        if (this.isPaused) {
            return;
        }
        this.listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.GroupCreateActivity.10
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                GroupCreateActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = GroupCreateActivity.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = GroupCreateActivity.this.listView.getChildAt(i2);
                    if (GroupCreateActivity.this.listView.getChildAdapterPosition(childAt) >= i) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(GroupCreateActivity.this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / GroupCreateActivity.this.listView.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.contactsDidLoad) {
            GroupCreateAdapter groupCreateAdapter = this.adapter;
            if (groupCreateAdapter != null) {
                groupCreateAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            if (this.listView != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int childCount = this.listView.getChildCount();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                    return;
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.listView.getChildAt(i3);
                    if (childAt instanceof GroupCreateUserCell) {
                        ((GroupCreateUserCell) childAt).update(intValue);
                    }
                }
            }
        } else if (i == NotificationCenter.chatDidCreated) {
            removeSelfFromStack();
        }
    }

    public void setIgnoreUsers(LongSparseArray<TLObject> longSparseArray) {
        this.ignoreUsers = longSparseArray;
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
    }

    @Keep
    public void setContainerHeight(int i) {
        int i2 = this.containerHeight - i;
        this.containerHeight = i;
        int min = Math.min(this.maxSize, this.measuredContainerHeight);
        int min2 = Math.min(this.maxSize, this.containerHeight);
        ScrollView scrollView = this.scrollView;
        scrollView.scrollTo(0, Math.max(0, scrollView.getScrollY() - i2));
        this.listView.setTranslationY(min2 - min);
        this.fragmentView.invalidate();
    }

    @Keep
    public int getContainerHeight() {
        return this.containerHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVisibleRows() {
        long j;
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) childAt;
                Object object = groupCreateUserCell.getObject();
                if (object instanceof TLRPC$User) {
                    j = ((TLRPC$User) object).id;
                } else if (object instanceof TLRPC$Chat) {
                    j = -((TLRPC$Chat) object).id;
                } else if ((object instanceof String) && "premium".equalsIgnoreCase((String) object)) {
                    groupCreateUserCell.setChecked(this.selectedPremium != null, true);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    j = 0;
                }
                if (j != 0) {
                    LongSparseArray<TLObject> longSparseArray = this.ignoreUsers;
                    if (longSparseArray != null && longSparseArray.indexOfKey(j) >= 0) {
                        groupCreateUserCell.setChecked(true, false);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                    } else {
                        groupCreateUserCell.setChecked(this.selectedContacts.indexOfKey(j) >= 0, true);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                    }
                }
            } else if ((childAt instanceof GraySectionCell) && this.listView.getChildAdapterPosition(childAt) == this.adapter.firstSectionRow) {
                ((GraySectionCell) childAt).setRightText((this.selectedPremium == null && this.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), true, new View.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupCreateActivity.this.lambda$checkVisibleRows$6(view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkVisibleRows$6(View view) {
        this.selectedPremium = null;
        this.selectedContacts.clear();
        this.spansContainer.removeAllSpans(true);
        checkVisibleRows();
        updateEditTextHint();
    }

    private void onAddToGroupDone(int i) {
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
        }
        ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate2;
        if (contactsAddActivityDelegate != null) {
            contactsAddActivityDelegate.didSelectUsers(arrayList, i);
        }
        finishFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onDonePressed(boolean z) {
        if (this.selectedContacts.size() == 0 && this.chatType != 2 && this.addToGroup) {
            return false;
        }
        if (z && this.addToGroup) {
            if (getParentActivity() == null) {
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.formatPluralString("AddManyMembersAlertTitle", this.selectedContacts.size(), new Object[0]));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.selectedContacts.size(); i++) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i)));
                if (user != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append("**");
                    sb.append(ContactsController.formatName(user.first_name, user.last_name));
                    sb.append("**");
                }
            }
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            if (j == 0) {
                j = this.channelId;
            }
            TLRPC$Chat chat = messagesController.getChat(Long.valueOf(j));
            if (this.selectedContacts.size() > 5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.selectedContacts.size(), chat == null ? "" : chat.title)));
                String format = String.format("%d", Integer.valueOf(this.selectedContacts.size()));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                }
                builder.setMessage(spannableStringBuilder);
            } else {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat == null ? "" : chat.title)));
            }
            final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
            if (!ChatObject.isChannel(chat)) {
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, this.resourceProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setMultiline(true);
                if (this.selectedContacts.size() == 1) {
                    checkBoxCellArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(0)))))), "", true, false);
                } else {
                    checkBoxCellArr[0].setText(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false);
                }
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GroupCreateActivity.lambda$onDonePressed$7(checkBoxCellArr, view);
                    }
                });
                builder.setView(linearLayout);
            }
            builder.setPositiveButton(LocaleController.getString("Add", R.string.Add), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    GroupCreateActivity.this.lambda$onDonePressed$8(checkBoxCellArr, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(builder.create());
        } else if (this.chatType == 2) {
            ArrayList<TLRPC$InputUser> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
                TLRPC$InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
                if (inputUser != null) {
                    arrayList.add(inputUser);
                }
            }
            getMessagesController().addUsersToChannel(this.chatId, arrayList, null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.chatId);
            bundle.putBoolean("just_created_chat", true);
            presentFragment(new ChatActivity(bundle), true);
        } else if (!this.doneButtonVisible) {
            return false;
        } else {
            if (this.addToGroup) {
                onAddToGroupDone(0);
            } else {
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i3 = 0; i3 < this.selectedContacts.size(); i3++) {
                    arrayList2.add(Long.valueOf(this.selectedContacts.keyAt(i3)));
                }
                if (this.isAlwaysShare || this.isNeverShare) {
                    GroupCreateActivityDelegate groupCreateActivityDelegate = this.delegate;
                    if (groupCreateActivityDelegate != null) {
                        groupCreateActivityDelegate.didSelectUsers(this.selectedPremium != null, arrayList2);
                    }
                    finishFragment();
                } else {
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        jArr[i4] = arrayList2.get(i4).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", this.chatType);
                    bundle2.putBoolean("forImport", this.forImport);
                    presentFragment(new GroupCreateFinalActivity(bundle2));
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDonePressed$7(CheckBoxCell[] checkBoxCellArr, View view) {
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDonePressed$8(CheckBoxCell[] checkBoxCellArr, DialogInterface dialogInterface, int i) {
        int i2 = 0;
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            i2 = 100;
        }
        onAddToGroupDone(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeSearch() {
        this.searching = false;
        this.searchWas = false;
        this.itemDecoration.setSearching(false);
        this.adapter.setSearching(false);
        this.adapter.searchDialogs(null);
        this.listView.setFastScrollVisible(true);
        this.listView.setVerticalScrollBarEnabled(false);
        showItemsAnimated(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHint() {
        if (!this.isAlwaysShare && !this.isNeverShare && !this.addToGroup) {
            if (this.chatType == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.selectedContacts.size(), new Object[0]));
            } else if (this.selectedContacts.size() == 0) {
                this.actionBar.setSubtitle(LocaleController.formatString("MembersCountZero", R.string.MembersCountZero, LocaleController.formatPluralString("Members", this.maxCount, new Object[0])));
            } else {
                this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.selectedContacts.size()), Integer.valueOf(this.selectedContacts.size()), Integer.valueOf(this.maxCount)));
            }
        }
        if (this.chatType == 2 || !this.addToGroup) {
            return;
        }
        if (this.doneButtonVisible && this.allSpans.isEmpty()) {
            AnimatorSet animatorSet = this.currentDoneButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentDoneButtonAnimation = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.floatingButton, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this.floatingButton, View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.floatingButton, View.ALPHA, 0.0f));
            this.currentDoneButtonAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.GroupCreateActivity.11
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    GroupCreateActivity.this.floatingButton.setVisibility(4);
                }
            });
            this.currentDoneButtonAnimation.setDuration(180L);
            this.currentDoneButtonAnimation.start();
            this.doneButtonVisible = false;
        } else if (this.doneButtonVisible || this.allSpans.isEmpty()) {
        } else {
            AnimatorSet animatorSet3 = this.currentDoneButtonAnimation;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            this.currentDoneButtonAnimation = new AnimatorSet();
            this.floatingButton.setVisibility(0);
            this.currentDoneButtonAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingButton, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.floatingButton, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.floatingButton, View.ALPHA, 1.0f));
            this.currentDoneButtonAnimation.setDuration(180L);
            this.currentDoneButtonAnimation.start();
            this.doneButtonVisible = true;
        }
    }

    public void setDelegate(GroupCreateActivityDelegate groupCreateActivityDelegate) {
        this.delegate = groupCreateActivityDelegate;
    }

    public void setDelegate2(ContactsAddActivityDelegate contactsAddActivityDelegate) {
        this.delegate2 = contactsAddActivityDelegate;
    }

    /* loaded from: classes4.dex */
    public static class Comparator implements java.util.Comparator<TLObject> {
        /* JADX INFO: Access modifiers changed from: private */
        public static String getName(TLObject tLObject) {
            if (tLObject instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                return ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
            } else if (tLObject instanceof TLRPC$Chat) {
                return ((TLRPC$Chat) tLObject).title;
            } else {
                return "";
            }
        }

        @Override // java.util.Comparator
        public int compare(TLObject tLObject, TLObject tLObject2) {
            return getName(tLObject).compareTo(getName(tLObject2));
        }
    }

    /* loaded from: classes4.dex */
    public class GroupCreateAdapter extends RecyclerListView.FastScrollAdapter {
        private Context context;
        private int currentItemsCount;
        private int firstSectionRow;
        private int inviteViaLink;
        private int noContactsStubRow;
        private int premiumRow;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private boolean searching;
        private int userTypesHeaderRow;
        private int usersStartRow;
        private ArrayList<Object> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private ArrayList<TLObject> contacts = new ArrayList<>();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            GroupCreateActivity.this.updateEditTextHint();
        }

        public GroupCreateAdapter(Context context) {
            TLRPC$Chat chat;
            this.context = context;
            ArrayList<TLRPC$TL_contact> arrayList = GroupCreateActivity.this.getContactsController().contacts;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$User user = GroupCreateActivity.this.getMessagesController().getUser(Long.valueOf(arrayList.get(i).user_id));
                if (user != null && !user.self && !user.deleted) {
                    this.contacts.add(user);
                }
            }
            if (GroupCreateActivity.this.isNeverShare || GroupCreateActivity.this.isAlwaysShare) {
                ArrayList<TLRPC$Dialog> allDialogs = GroupCreateActivity.this.getMessagesController().getAllDialogs();
                int size = allDialogs.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC$Dialog tLRPC$Dialog = allDialogs.get(i2);
                    if (DialogObject.isChatDialog(tLRPC$Dialog.id) && (chat = GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(-tLRPC$Dialog.id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.contacts.add(chat);
                    }
                }
                Collections.sort(this.contacts, new Comparator());
                TLObject tLObject = null;
                int i3 = 0;
                while (i3 < this.contacts.size()) {
                    TLObject tLObject2 = this.contacts.get(i3);
                    if (tLObject == null || !firstLetter(Comparator.getName(tLObject)).equals(firstLetter(Comparator.getName(tLObject2)))) {
                        this.contacts.add(i3, new Letter(firstLetter(Comparator.getName(tLObject2))));
                    }
                    i3++;
                    tLObject = tLObject2;
                }
            }
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ boolean canApplySearchResults(int i4) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$canApplySearchResults(this, i4);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeUsers(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public final void onDataSetChanged(int i4) {
                    GroupCreateActivity.GroupCreateAdapter.this.lambda$new$0(i4);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ void onSetHashtags(ArrayList arrayList2, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList2, hashMap);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i) {
            GroupCreateActivity.this.showItemsAnimated(this.currentItemsCount);
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress() && getItemCount() == 0) {
                GroupCreateActivity.this.emptyView.showProgress(false, true);
            }
            notifyDataSetChanged();
        }

        private String firstLetter(String str) {
            return TextUtils.isEmpty(str) ? "" : str.substring(0, 1);
        }

        public void setSearching(boolean z) {
            if (this.searching == z) {
                return;
            }
            this.searching = z;
            notifyDataSetChanged();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            String str;
            String str2;
            if (this.searching || i < this.usersStartRow) {
                return null;
            }
            int size = this.contacts.size();
            int i2 = this.usersStartRow;
            if (i >= size + i2) {
                return null;
            }
            TLObject tLObject = this.contacts.get(i - i2);
            if (tLObject instanceof Letter) {
                return ((Letter) tLObject).letter;
            }
            if (tLObject instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                str = tLRPC$User.first_name;
                str2 = tLRPC$User.last_name;
            } else {
                str = ((TLRPC$Chat) tLObject).title;
                str2 = "";
            }
            if (LocaleController.nameDisplayOrder == 1) {
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
                if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                }
            } else if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            } else {
                if (!TextUtils.isEmpty(str)) {
                    return str.substring(0, 1).toUpperCase();
                }
            }
            return "";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i;
            this.noContactsStubRow = -1;
            this.userTypesHeaderRow = -1;
            this.firstSectionRow = -1;
            this.premiumRow = -1;
            if (!this.searching) {
                int i2 = 2;
                if (GroupCreateActivity.this.allowPremium) {
                    this.firstSectionRow = 0;
                    this.userTypesHeaderRow = 0;
                    this.premiumRow = 1;
                    i = 2;
                } else {
                    this.firstSectionRow = 0;
                    i = 0;
                }
                this.usersStartRow = i;
                int size = i + this.contacts.size();
                if (GroupCreateActivity.this.addToGroup) {
                    if (GroupCreateActivity.this.chatId != 0) {
                        this.inviteViaLink = ChatObject.canUserDoAdminAction(GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(GroupCreateActivity.this.chatId)), 3) ? 1 : 0;
                    } else if (GroupCreateActivity.this.channelId != 0) {
                        TLRPC$Chat chat = GroupCreateActivity.this.getMessagesController().getChat(Long.valueOf(GroupCreateActivity.this.channelId));
                        this.inviteViaLink = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 0;
                    } else {
                        this.inviteViaLink = 0;
                    }
                    if (this.inviteViaLink != 0) {
                        this.usersStartRow++;
                        size++;
                    }
                }
                if (size == 0) {
                    this.noContactsStubRow = 0;
                    size++;
                }
                this.currentItemsCount = size;
                return size;
            }
            int size2 = this.searchResult.size();
            int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
            int size4 = this.searchAdapterHelper.getGlobalSearch().size();
            int i3 = size2 + size3;
            if (size4 != 0) {
                i3 += size4 + 1;
            }
            this.currentItemsCount = i3;
            return i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            GroupCreateUserCell groupCreateUserCell;
            if (i != 0) {
                if (i == 1) {
                    groupCreateUserCell = new GroupCreateUserCell(this.context, 1, 0, false);
                } else if (i == 3) {
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(this.context, null, 0) { // from class: org.telegram.ui.GroupCreateActivity.GroupCreateAdapter.1
                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // org.telegram.ui.Components.StickerEmptyView, android.view.ViewGroup, android.view.View
                        public void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            this.stickerView.getImageReceiver().startAnimation();
                        }
                    };
                    stickerEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    stickerEmptyView.subtitle.setVisibility(8);
                    stickerEmptyView.title.setText(LocaleController.getString("NoContacts", R.string.NoContacts));
                    stickerEmptyView.setAnimateLayoutChange(true);
                    groupCreateUserCell = stickerEmptyView;
                } else {
                    graySectionCell = new TextCell(this.context);
                }
                graySectionCell = groupCreateUserCell;
            } else {
                graySectionCell = new GraySectionCell(this.context);
            }
            return new RecyclerListView.Holder(graySectionCell);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
            if (r12.toString().startsWith("@" + r5) != false) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            long j;
            String publicUsername;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                if (this.searching) {
                    graySectionCell.setText(LocaleController.getString("GlobalSearch", R.string.GlobalSearch));
                } else if (i == this.userTypesHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.PrivacyUserTypes));
                } else {
                    int i2 = i - this.usersStartRow;
                    if (i2 >= 0 && i2 < this.contacts.size()) {
                        TLObject tLObject2 = this.contacts.get(i - this.usersStartRow);
                        if (tLObject2 instanceof Letter) {
                            graySectionCell.setText(((Letter) tLObject2).letter.toUpperCase());
                        }
                    }
                }
                if (i == this.firstSectionRow) {
                    graySectionCell.setRightText((GroupCreateActivity.this.selectedPremium == null && GroupCreateActivity.this.selectedContacts.isEmpty()) ? "" : LocaleController.getString(R.string.DeselectAll), true, new View.OnClickListener() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupCreateActivity.GroupCreateAdapter.this.lambda$onBindViewHolder$1(view);
                        }
                    });
                }
            } else if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (this.inviteViaLink == 2) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, false);
                } else {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString("InviteToGroupByLink", R.string.InviteToGroupByLink), R.drawable.msg_link2, false);
                }
            } else {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                CharSequence charSequence2 = null;
                if (this.searching) {
                    int size = this.searchResult.size();
                    int size2 = this.searchAdapterHelper.getGlobalSearch().size();
                    int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
                    if (i >= 0 && i < size) {
                        tLObject = (TLObject) this.searchResult.get(i);
                    } else if (i >= size && i < size3 + size) {
                        tLObject = this.searchAdapterHelper.getLocalServerSearch().get(i - size);
                    } else {
                        tLObject = (i <= size + size3 || i > (size2 + size) + size3) ? null : this.searchAdapterHelper.getGlobalSearch().get(((i - size) - size3) - 1);
                    }
                    if (tLObject != null) {
                        if (tLObject instanceof TLRPC$User) {
                            publicUsername = ((TLRPC$User) tLObject).username;
                        } else if (!(tLObject instanceof TLRPC$Chat)) {
                            return;
                        } else {
                            publicUsername = ChatObject.getPublicUsername((TLRPC$Chat) tLObject);
                        }
                        if (i < size) {
                            charSequence = this.searchResultNames.get(i);
                            if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            }
                            charSequence2 = charSequence;
                            charSequence = null;
                        } else if (i > size && !TextUtils.isEmpty(publicUsername)) {
                            String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                            if (lastFoundUsername.startsWith("@")) {
                                lastFoundUsername = lastFoundUsername.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                spannableStringBuilder.append((CharSequence) "@");
                                spannableStringBuilder.append((CharSequence) publicUsername);
                                int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, lastFoundUsername);
                                if (indexOfIgnoreCase != -1) {
                                    int length = lastFoundUsername.length();
                                    if (indexOfIgnoreCase == 0) {
                                        length++;
                                    } else {
                                        indexOfIgnoreCase++;
                                    }
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                                }
                                charSequence = spannableStringBuilder;
                            } catch (Exception unused) {
                                charSequence = publicUsername;
                            }
                        }
                        groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
                        if (!(tLObject instanceof TLRPC$User)) {
                            j = ((TLRPC$User) tLObject).id;
                        } else {
                            j = tLObject instanceof TLRPC$Chat ? -((TLRPC$Chat) tLObject).id : 0L;
                        }
                        if (j == 0) {
                            if (GroupCreateActivity.this.ignoreUsers == null || GroupCreateActivity.this.ignoreUsers.indexOfKey(j) < 0) {
                                groupCreateUserCell.setChecked(GroupCreateActivity.this.selectedContacts.indexOfKey(j) >= 0, false);
                                groupCreateUserCell.setCheckBoxEnabled(true);
                                return;
                            }
                            groupCreateUserCell.setChecked(true, false);
                            groupCreateUserCell.setCheckBoxEnabled(false);
                            return;
                        }
                        return;
                    }
                } else if (i == this.premiumRow) {
                    groupCreateUserCell.setPremium();
                    groupCreateUserCell.setChecked(GroupCreateActivity.this.selectedPremium != null, false);
                    return;
                } else {
                    tLObject = this.contacts.get(i - this.usersStartRow);
                }
                charSequence = null;
                groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
                if (!(tLObject instanceof TLRPC$User)) {
                }
                if (j == 0) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$1(View view) {
            GroupCreateActivity.this.selectedPremium = null;
            GroupCreateActivity.this.selectedContacts.clear();
            GroupCreateActivity.this.spansContainer.removeAllSpans(true);
            GroupCreateActivity.this.checkVisibleRows();
            GroupCreateActivity.this.updateEditTextHint();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (this.searching) {
                return i == this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size() ? 0 : 1;
            } else if (i == this.userTypesHeaderRow) {
                return 0;
            } else {
                if (i == this.premiumRow) {
                    return 1;
                }
                if (this.inviteViaLink == 0 || i != 0) {
                    if (this.noContactsStubRow == i) {
                        return 3;
                    }
                    int i2 = i - this.usersStartRow;
                    return (i2 < 0 || i2 >= this.contacts.size() || !(this.contacts.get(i - this.usersStartRow) instanceof Letter)) ? 1 : 0;
                }
                return 2;
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof GroupCreateUserCell) {
                ((GroupCreateUserCell) view).recycle();
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                return false;
            }
            if (GroupCreateActivity.this.ignoreUsers != null) {
                View view = viewHolder.itemView;
                if (view instanceof GroupCreateUserCell) {
                    Object object = ((GroupCreateUserCell) view).getObject();
                    return !(object instanceof TLRPC$User) || GroupCreateActivity.this.ignoreUsers.indexOfKey(((TLRPC$User) object).id) < 0;
                }
            }
            return true;
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, GroupCreateActivity.this.isAlwaysShare || GroupCreateActivity.this.isNeverShare, false, false, false, 0L, false, 0, 0);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCreateActivity.GroupCreateAdapter.this.lambda$searchDialogs$4(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$searchDialogs$4(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCreateActivity.GroupCreateAdapter.this.lambda$searchDialogs$3(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$searchDialogs$3(final String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, GroupCreateActivity.this.isAlwaysShare || GroupCreateActivity.this.isNeverShare, true, false, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCreateActivity.GroupCreateAdapter.this.lambda$searchDialogs$2(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
            if (r13.contains(" " + r3) != false) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[LOOP:1: B:31:0x0094->B:58:0x0134, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e0 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$searchDialogs$2(String str) {
            String str2;
            String publicUsername;
            Object obj;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList<CharSequence> arrayList2 = new ArrayList<>();
            for (int i2 = 0; i2 < this.contacts.size(); i2++) {
                TLObject tLObject = this.contacts.get(i2);
                boolean z = tLObject instanceof TLRPC$User;
                if (z) {
                    TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
                    str2 = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name).toLowerCase();
                    publicUsername = UserObject.getPublicUsername(tLRPC$User);
                } else {
                    if (tLObject instanceof TLRPC$Chat) {
                        TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject;
                        str2 = tLRPC$Chat.title;
                        publicUsername = ChatObject.getPublicUsername(tLRPC$Chat);
                    }
                }
                String translitString2 = LocaleController.getInstance().getTranslitString(str2);
                if (str2.equals(translitString2)) {
                    translitString2 = null;
                }
                char c = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    String str3 = strArr[i3];
                    if (!str2.startsWith(str3)) {
                        if (!str2.contains(" " + str3)) {
                            if (translitString2 != null) {
                                if (!translitString2.startsWith(str3)) {
                                }
                            }
                            if (publicUsername != null && publicUsername.startsWith(str3)) {
                                c = 2;
                            }
                            if (c == 0) {
                                if (c == 1) {
                                    if (z) {
                                        TLRPC$User tLRPC$User2 = (TLRPC$User) tLObject;
                                        arrayList2.add(AndroidUtilities.generateSearchName(tLRPC$User2.first_name, tLRPC$User2.last_name, str3));
                                    } else if (tLObject instanceof TLRPC$Chat) {
                                        arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC$Chat) tLObject).title, null, str3));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList2.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str3));
                                }
                                arrayList.add(tLObject);
                            }
                        }
                    }
                    c = 1;
                    if (c == 0) {
                    }
                }
            }
            updateSearchResults(arrayList, arrayList2);
        }

        private void updateSearchResults(final ArrayList<Object> arrayList, final ArrayList<CharSequence> arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCreateActivity$GroupCreateAdapter$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCreateActivity.GroupCreateAdapter.this.lambda$updateSearchResults$5(arrayList, arrayList2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateSearchResults$5(ArrayList arrayList, ArrayList arrayList2) {
            if (this.searching) {
                this.searchRunnable = null;
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList);
                GroupCreateActivity.this.showItemsAnimated(this.currentItemsCount);
                notifyDataSetChanged();
                if (this.searching && !this.searchAdapterHelper.isSearchInProgress() && getItemCount() == 0) {
                    GroupCreateActivity.this.emptyView.showProgress(false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.GroupCreateActivity$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                GroupCreateActivity.this.lambda$getThemeDescriptions$9();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        ActionBar actionBar = this.actionBar;
        int i3 = ThemeDescription.FLAG_BACKGROUND;
        int i4 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        EditTextBoldCursor editTextBoldCursor = this.editText;
        int i5 = ThemeDescription.FLAG_TEXTCOLOR;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(editTextBoldCursor, i5, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_groupcreate_hintText));
        arrayList.add(new ThemeDescription(this.editText, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_groupcreate_cursor));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GroupCreateSectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateSectionCell.class}, new String[]{"drawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_groupcreate_sectionShadow));
        int i7 = Theme.key_groupcreate_sectionText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxDisabled));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{GroupCreateUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText));
        int i8 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        int i9 = Theme.key_avatar_backgroundBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i9));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanBackground));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanText));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, Theme.key_groupcreate_spanDelete));
        arrayList.add(new ThemeDescription(this.spansContainer, 0, new Class[]{GroupCreateSpan.class}, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i8));
        PermanentLinkBottomSheet permanentLinkBottomSheet = this.sharedLinkBottomSheet;
        if (permanentLinkBottomSheet != null) {
            arrayList.addAll(permanentLinkBottomSheet.getThemeDescriptions());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getThemeDescriptions$9() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(0);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class Letter extends TLRPC$TL_contact {
        public final String letter;

        public Letter(String str) {
            this.letter = str;
        }
    }
}
