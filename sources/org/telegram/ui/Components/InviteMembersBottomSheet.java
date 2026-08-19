package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GroupCreateSectionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UsersAlertBase;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LaunchActivity;

/* loaded from: classes5.dex */
public class InviteMembersBottomSheet extends UsersAlertBase implements NotificationCenter.NotificationCenterDelegate {
    private int additionalHeight;
    private long chatId;
    private ArrayList contacts;
    private int contactsEndRow;
    private int contactsStartRow;
    private int copyLinkRow;
    private AnimatorSet currentAnimation;
    private GroupCreateSpan currentDeletingSpan;
    private GroupCreateActivity.ContactsAddActivityDelegate delegate;
    private InviteMembersBottomSheetDelegate dialogsDelegate;
    private ArrayList dialogsServerOnly;
    private int emptyRow;
    boolean enterEventSent;
    private final FragmentFloatingButton floatingButton;
    private LongSparseArray ignoreUsers;
    TLRPC.TL_chatInviteExported invite;
    private int lastRow;
    boolean linkGenerating;
    private int maxSize;
    private int noContactsStubRow;
    private BaseFragment parentFragment;
    private int rowCount;
    private int scrollViewH;
    private SearchAdapter searchAdapter;
    private int searchAdditionalHeight;
    private LongSparseArray selectedContacts;
    private View.OnClickListener spanClickListener;
    private boolean spanEnter;
    private final SpansContainer spansContainer;
    private ValueAnimator spansEnterAnimator;
    private float spansEnterProgress;
    private final ScrollView spansScrollView;
    private float touchSlop;
    float y;

    public interface InviteMembersBottomSheetDelegate {
        void didSelectDialogs(ArrayList arrayList);
    }

    protected boolean canGenerateLink() {
        return true;
    }

    public InviteMembersBottomSheet(final Context context, int i, final LongSparseArray longSparseArray, final long j, final BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, i, resourcesProvider);
        this.contacts = new ArrayList();
        this.selectedContacts = new LongSparseArray();
        this.spansEnterProgress = 0.0f;
        this.spanClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
                if (groupCreateSpan.isDeleting()) {
                    InviteMembersBottomSheet.this.currentDeletingSpan = null;
                    InviteMembersBottomSheet.this.selectedContacts.remove(groupCreateSpan.getUid());
                    InviteMembersBottomSheet.this.spansContainer.removeSpan(groupCreateSpan);
                    InviteMembersBottomSheet.this.spansCountChanged(true);
                    AndroidUtilities.updateVisibleRows(InviteMembersBottomSheet.this.listView);
                    return;
                }
                if (InviteMembersBottomSheet.this.currentDeletingSpan != null) {
                    InviteMembersBottomSheet.this.currentDeletingSpan.cancelDeleteAnimation();
                }
                InviteMembersBottomSheet.this.currentDeletingSpan = groupCreateSpan;
                groupCreateSpan.startDeleteAnimation();
            }
        };
        this.ignoreUsers = longSparseArray;
        this.needSnapToTop = false;
        this.parentFragment = baseFragment;
        this.chatId = j;
        fixNavigationBar();
        this.searchView.searchEditText.setHint(LocaleController.getString(R.string.SearchForChats));
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        SearchAdapter searchAdapter = new SearchAdapter();
        this.searchAdapter = searchAdapter;
        this.searchListViewAdapter = searchAdapter;
        RecyclerListView recyclerListView = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.listViewAdapter = listAdapter;
        recyclerListView.setAdapter(listAdapter);
        this.emptyView.showProgress(false, false);
        this.emptyView.setVisibility(8);
        ArrayList<TLRPC.TL_contact> arrayList = ContactsController.getInstance(i).contacts;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(arrayList.get(i2).user_id));
            if (user != null && !user.self && !user.deleted) {
                this.contacts.add(user);
            }
        }
        SpansContainer spansContainer = new SpansContainer(context);
        this.spansContainer = spansContainer;
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i3) {
                InviteMembersBottomSheet.$r8$lambda$60h1CqH-YVHgQNlddRT-rxNU3fw(InviteMembersBottomSheet.this, j, baseFragment, longSparseArray, context, view, i3);
            }
        });
        this.listView.setItemAnimator(new ItemAnimator());
        updateRows();
        ScrollView scrollView = new ScrollView(context) { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.2
            @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i4);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    InviteMembersBottomSheet.this.maxSize = AndroidUtilities.dp(144.0f);
                } else {
                    InviteMembersBottomSheet.this.maxSize = AndroidUtilities.dp(56.0f);
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(InviteMembersBottomSheet.this.maxSize, TLObject.FLAG_31));
            }
        };
        this.spansScrollView = scrollView;
        scrollView.setVisibility(8);
        scrollView.setClipChildren(false);
        scrollView.addView(spansContainer);
        this.containerView.addView(scrollView);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, resourcesProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_check);
        fragmentFloatingButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InviteMembersBottomSheet.$r8$lambda$DWJph8e5tjxFu99nIZJWSYECYz4(InviteMembersBottomSheet.this, context, j, view);
            }
        });
        fragmentFloatingButton.setButtonVisible(false, false);
        fragmentFloatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.containerView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).leftMargin = AndroidUtilities.dp(4.0f);
        ((ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams()).rightMargin = AndroidUtilities.dp(4.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$60h1CqH-YVHgQNlddRT-rxNU3fw(InviteMembersBottomSheet inviteMembersBottomSheet, long j, BaseFragment baseFragment, LongSparseArray longSparseArray, Context context, View view, int i) {
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        long j2;
        RecyclerView.Adapter adapter = inviteMembersBottomSheet.listView.getAdapter();
        SearchAdapter searchAdapter = inviteMembersBottomSheet.searchAdapter;
        TLObject tLObject = null;
        if (adapter != searchAdapter) {
            if (i == inviteMembersBottomSheet.copyLinkRow) {
                TLRPC.Chat chat = MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).getChat(Long.valueOf(j));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).getChatFull(j);
                if (chat != null) {
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str = "https://" + MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).linkPrefix + "/" + publicUsername;
                        if (str != null) {
                            return;
                        }
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                        inviteMembersBottomSheet.dismiss();
                        BulletinFactory.createCopyLinkBulletin(baseFragment).show();
                    }
                }
                if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    inviteMembersBottomSheet.generateLink();
                    str = null;
                }
                if (str != null) {
                }
            } else if (i >= inviteMembersBottomSheet.contactsStartRow && i < inviteMembersBottomSheet.contactsEndRow) {
                tLObject = ((ListAdapter) inviteMembersBottomSheet.listViewAdapter).getObject(i);
            }
        } else {
            int size = searchAdapter.searchResult.size();
            int size2 = inviteMembersBottomSheet.searchAdapter.searchAdapterHelper.getGlobalSearch().size();
            int size3 = inviteMembersBottomSheet.searchAdapter.searchAdapterHelper.getLocalServerSearch().size();
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                tLObject = (TLObject) inviteMembersBottomSheet.searchAdapter.searchResult.get(i2);
            } else if (i2 >= size && i2 < size3 + size) {
                tLObject = (TLObject) inviteMembersBottomSheet.searchAdapter.searchAdapterHelper.getLocalServerSearch().get(i2 - size);
            } else if (i2 > size + size3 && i2 <= size2 + size + size3) {
                tLObject = (TLObject) inviteMembersBottomSheet.searchAdapter.searchAdapterHelper.getGlobalSearch().get(((i2 - size) - size3) - 1);
            }
            if (inviteMembersBottomSheet.dialogsDelegate != null) {
                inviteMembersBottomSheet.searchView.closeSearch();
            }
        }
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                j2 = ((TLRPC.User) tLObject).id;
            } else {
                j2 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
            }
            if (longSparseArray == null || longSparseArray.indexOfKey(j2) < 0) {
                if (j2 != 0) {
                    if (inviteMembersBottomSheet.selectedContacts.indexOfKey(j2) >= 0) {
                        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) inviteMembersBottomSheet.selectedContacts.get(j2);
                        inviteMembersBottomSheet.selectedContacts.remove(j2);
                        inviteMembersBottomSheet.spansContainer.removeSpan(groupCreateSpan);
                    } else {
                        GroupCreateSpan groupCreateSpan2 = new GroupCreateSpan(context, tLObject);
                        groupCreateSpan2.setOnClickListener(inviteMembersBottomSheet.spanClickListener);
                        inviteMembersBottomSheet.selectedContacts.put(j2, groupCreateSpan2);
                        inviteMembersBottomSheet.spansContainer.addSpan(groupCreateSpan2, true);
                    }
                }
                inviteMembersBottomSheet.spansCountChanged(true);
                AndroidUtilities.updateVisibleRows(inviteMembersBottomSheet.listView);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$DWJph8e5tjxFu99nIZJWSYECYz4(final InviteMembersBottomSheet inviteMembersBottomSheet, Context context, long j, View view) {
        Activity findActivity;
        if ((inviteMembersBottomSheet.dialogsDelegate == null && inviteMembersBottomSheet.selectedContacts.isEmpty()) || (findActivity = AndroidUtilities.findActivity(context)) == null) {
            return;
        }
        if (inviteMembersBottomSheet.dialogsDelegate != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < inviteMembersBottomSheet.selectedContacts.size(); i++) {
                arrayList.add(Long.valueOf(inviteMembersBottomSheet.selectedContacts.keyAt(i)));
            }
            inviteMembersBottomSheet.dialogsDelegate.didSelectDialogs(arrayList);
            inviteMembersBottomSheet.dismiss();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(findActivity);
        builder.setTitle(LocaleController.formatPluralString("AddManyMembersAlertTitle", inviteMembersBottomSheet.selectedContacts.size(), new Object[0]));
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < inviteMembersBottomSheet.selectedContacts.size(); i2++) {
            TLRPC.User user = MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).getUser(Long.valueOf(inviteMembersBottomSheet.selectedContacts.keyAt(i2)));
            if (user != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("**");
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append("**");
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).getChat(Long.valueOf(j));
        if (inviteMembersBottomSheet.selectedContacts.size() > 5) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", inviteMembersBottomSheet.selectedContacts.size(), chat.title)));
            String format = String.format("%d", Integer.valueOf(inviteMembersBottomSheet.selectedContacts.size()));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
            }
            builder.setMessage(spannableStringBuilder);
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, sb, chat.title)));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Add), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i3) {
                InviteMembersBottomSheet.this.onAddToGroupDone(0);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.create();
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAddToGroupDone(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.selectedContacts.keyAt(i2))));
        }
        GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate = this.delegate;
        if (contactsAddActivityDelegate != null) {
            contactsAddActivityDelegate.didSelectUsers(arrayList, i);
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.UsersAlertBase, org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedContacts(ArrayList arrayList) {
        float max;
        int i;
        int i2;
        int max2;
        Object user;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Long l = (Long) arrayList.get(i3);
            long longValue = l.longValue();
            if (DialogObject.isChatDialog(longValue)) {
                user = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-longValue));
            } else {
                user = MessagesController.getInstance(this.currentAccount).getUser(l);
            }
            GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.spansContainer.getContext(), user);
            this.spansContainer.addSpan(groupCreateSpan, false);
            groupCreateSpan.setOnClickListener(this.spanClickListener);
        }
        spansCountChanged(false);
        int childCount = this.spansContainer.getChildCount();
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x < point.y;
        if (AndroidUtilities.isTablet() || z) {
            this.maxSize = AndroidUtilities.dp(144.0f);
        } else {
            this.maxSize = AndroidUtilities.dp(56.0f);
        }
        if (AndroidUtilities.isTablet()) {
            Point point2 = AndroidUtilities.displaySize;
            max = Math.min(point2.x, point2.y) * 0.8f;
        } else {
            if (z) {
                i = AndroidUtilities.displaySize.x;
                int dp = i - AndroidUtilities.dp(26.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i4 = 0;
                for (i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.spansContainer.getChildAt(i2);
                    if (childAt instanceof GroupCreateSpan) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                        if (childAt.getMeasuredWidth() + i4 > dp) {
                            dp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                            i4 = 0;
                        }
                        i4 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                    }
                }
                int dp3 = dp2 + AndroidUtilities.dp(42.0f);
                if (this.dialogsDelegate == null) {
                    max2 = this.spanEnter ? Math.min(this.maxSize, dp3) : 0;
                } else {
                    max2 = Math.max(0, Math.min(this.maxSize, dp3) - AndroidUtilities.dp(52.0f));
                }
                int i5 = this.searchAdditionalHeight;
                int dp4 = this.selectedContacts.size() > 0 ? AndroidUtilities.dp(56.0f) : 0;
                this.searchAdditionalHeight = dp4;
                if (max2 == this.additionalHeight || i5 != dp4) {
                    this.additionalHeight = max2;
                }
                return;
            }
            max = Math.max(AndroidUtilities.displaySize.x * 0.8f, Math.min(AndroidUtilities.dp(480.0f), AndroidUtilities.displaySize.x));
        }
        i = (int) max;
        int dp5 = i - AndroidUtilities.dp(26.0f);
        int dp22 = AndroidUtilities.dp(10.0f);
        int i42 = 0;
        while (i2 < childCount) {
        }
        int dp32 = dp22 + AndroidUtilities.dp(42.0f);
        if (this.dialogsDelegate == null) {
        }
        int i52 = this.searchAdditionalHeight;
        if (this.selectedContacts.size() > 0) {
        }
        this.searchAdditionalHeight = dp4;
        if (max2 == this.additionalHeight) {
        }
        this.additionalHeight = max2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void spansCountChanged(boolean z) {
        boolean z2 = true;
        final boolean z3 = this.selectedContacts.size() > 0;
        if (this.spanEnter != z3) {
            ValueAnimator valueAnimator = this.spansEnterAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.spansEnterAnimator.cancel();
            }
            this.spanEnter = z3;
            if (z3) {
                this.spansScrollView.setVisibility(0);
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.spansEnterProgress, z3 ? 1.0f : 0.0f);
                this.spansEnterAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        InviteMembersBottomSheet.$r8$lambda$dfxa6Fc6u18xPr2bFdpzMzshZis(InviteMembersBottomSheet.this, valueAnimator2);
                    }
                });
                this.spansEnterAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.spansEnterProgress = z3 ? 1.0f : 0.0f;
                        ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
                        if (z3) {
                            return;
                        }
                        InviteMembersBottomSheet.this.spansScrollView.setVisibility(8);
                    }
                });
                this.spansEnterAnimator.setDuration(150L);
                this.spansEnterAnimator.start();
            } else {
                this.spansEnterProgress = z3 ? 1.0f : 0.0f;
                this.containerView.invalidate();
                if (!z3) {
                    this.spansScrollView.setVisibility(8);
                }
            }
            FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
            if (!this.spanEnter && this.dialogsDelegate == null) {
                z2 = false;
            }
            fragmentFloatingButton.setButtonVisible(z2, z);
        }
    }

    public static /* synthetic */ void $r8$lambda$dfxa6Fc6u18xPr2bFdpzMzshZis(InviteMembersBottomSheet inviteMembersBottomSheet, ValueAnimator valueAnimator) {
        inviteMembersBottomSheet.getClass();
        inviteMembersBottomSheet.spansEnterProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        inviteMembersBottomSheet.containerView.invalidate();
    }

    private void updateRows() {
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.copyLinkRow = -1;
        this.noContactsStubRow = -1;
        this.rowCount = 1;
        this.emptyRow = 0;
        if (this.dialogsDelegate == null) {
            if (hasLink()) {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.copyLinkRow = i;
            }
            if (this.contacts.size() != 0) {
                int i2 = this.rowCount;
                this.contactsStartRow = i2;
                int size = i2 + this.contacts.size();
                this.rowCount = size;
                this.contactsEndRow = size;
            } else {
                int i3 = this.rowCount;
                this.rowCount = i3 + 1;
                this.noContactsStubRow = i3;
            }
        } else if (this.dialogsServerOnly.size() != 0) {
            int i4 = this.rowCount;
            this.contactsStartRow = i4;
            int size2 = i4 + this.dialogsServerOnly.size();
            this.rowCount = size2;
            this.contactsEndRow = size2;
        } else {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.noContactsStubRow = i5;
        }
        int i6 = this.rowCount;
        this.rowCount = i6 + 1;
        this.lastRow = i6;
    }

    protected boolean hasLink() {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
        if (chat != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return true;
        }
        if (chatFull == null || chatFull.exported_invite == null) {
            return canGenerateLink();
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogsNeedReload && this.dialogsDelegate != null && this.dialogsServerOnly.isEmpty()) {
            this.dialogsServerOnly = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
            this.listViewAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private ListAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            if (i != 2) {
                int i2 = 0;
                if (i == 3) {
                    view = new GroupCreateUserCell(context, 1, 0, InviteMembersBottomSheet.this.dialogsDelegate != null);
                } else if (i == 4) {
                    view = new View(context);
                } else if (i != 5) {
                    ManageChatTextCell manageChatTextCell = new ManageChatTextCell(context);
                    manageChatTextCell.setText(LocaleController.getString(R.string.VoipGroupCopyInviteLink), null, R.drawable.msg_link, 7, true);
                    int i3 = Theme.key_dialogTextBlue2;
                    manageChatTextCell.setColors(i3, i3);
                    view = manageChatTextCell;
                } else {
                    StickerEmptyView stickerEmptyView = new StickerEmptyView(context, null, i2) { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.ListAdapter.2
                        @Override // org.telegram.ui.Components.StickerEmptyView, android.view.ViewGroup, android.view.View
                        protected void onAttachedToWindow() {
                            super.onAttachedToWindow();
                            this.stickerView.getImageReceiver().startAnimation();
                        }
                    };
                    stickerEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    stickerEmptyView.subtitle.setVisibility(8);
                    if (InviteMembersBottomSheet.this.dialogsDelegate != null) {
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.FilterNoChats));
                    } else {
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoContacts));
                    }
                    stickerEmptyView.setAnimateLayoutChange(true);
                    view = stickerEmptyView;
                }
            } else {
                view = new View(context) { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.ListAdapter.1
                    @Override // android.view.View
                    protected void onMeasure(int i4, int i5) {
                        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + InviteMembersBottomSheet.this.additionalHeight, TLObject.FLAG_30));
                    }
                };
            }
            return new RecyclerListView.Holder(view);
        }

        public TLObject getObject(int i) {
            if (InviteMembersBottomSheet.this.dialogsDelegate != null) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) InviteMembersBottomSheet.this.dialogsServerOnly.get(i - InviteMembersBottomSheet.this.contactsStartRow);
                return DialogObject.isUserDialog(dialog.id) ? MessagesController.getInstance(((BottomSheet) InviteMembersBottomSheet.this).currentAccount).getUser(Long.valueOf(dialog.id)) : MessagesController.getInstance(((BottomSheet) InviteMembersBottomSheet.this).currentAccount).getChat(Long.valueOf(-dialog.id));
            }
            return (TLObject) InviteMembersBottomSheet.this.contacts.get(i - InviteMembersBottomSheet.this.contactsStartRow);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            long j2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 2) {
                viewHolder.itemView.requestLayout();
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            TLObject object = getObject(i);
            Object object2 = groupCreateUserCell.getObject();
            if (object2 instanceof TLRPC.User) {
                j = ((TLRPC.User) object2).id;
            } else {
                j = object2 instanceof TLRPC.Chat ? -((TLRPC.Chat) object2).id : 0L;
            }
            groupCreateUserCell.setObject(object, null, null, i != InviteMembersBottomSheet.this.contactsEndRow);
            if (object instanceof TLRPC.User) {
                j2 = ((TLRPC.User) object).id;
            } else {
                j2 = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            }
            if (j2 != 0) {
                if (InviteMembersBottomSheet.this.ignoreUsers == null || InviteMembersBottomSheet.this.ignoreUsers.indexOfKey(j2) < 0) {
                    groupCreateUserCell.setChecked(InviteMembersBottomSheet.this.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                    groupCreateUserCell.setCheckBoxEnabled(true);
                } else {
                    groupCreateUserCell.setChecked(true, false);
                    groupCreateUserCell.setCheckBoxEnabled(false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == InviteMembersBottomSheet.this.copyLinkRow) {
                return 1;
            }
            if (i == InviteMembersBottomSheet.this.emptyRow) {
                return 2;
            }
            if (i >= InviteMembersBottomSheet.this.contactsStartRow && i < InviteMembersBottomSheet.this.contactsEndRow) {
                return 3;
            }
            if (i == InviteMembersBottomSheet.this.lastRow) {
                return 4;
            }
            return i == InviteMembersBottomSheet.this.noContactsStubRow ? 5 : 0;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return InviteMembersBottomSheet.this.rowCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int currentItemsCount;
        private final SearchAdapterHelper searchAdapterHelper;
        private ArrayList searchResult = new ArrayList();
        private ArrayList searchResultNames = new ArrayList();
        private Runnable searchRunnable;

        public SearchAdapter() {
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$canApplySearchResults(this, i);
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
                public final void onDataSetChanged(int i) {
                    InviteMembersBottomSheet.SearchAdapter.$r8$lambda$3TSneWtgzb-wLU99AoxTzJMSWh0(InviteMembersBottomSheet.SearchAdapter.this, i);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$3TSneWtgzb-wLU99AoxTzJMSWh0(SearchAdapter searchAdapter, int i) {
            InviteMembersBottomSheet.this.showItemsAnimated(searchAdapter.currentItemsCount - 1);
            if (searchAdapter.searchRunnable == null && !searchAdapter.searchAdapterHelper.isSearchInProgress() && searchAdapter.getItemCount() <= 2) {
                InviteMembersBottomSheet.this.emptyView.showProgress(false, true);
            }
            searchAdapter.notifyDataSetChanged();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Context context = viewGroup.getContext();
            if (i == 1) {
                groupCreateUserCell = new GroupCreateUserCell(context, 1, 0, false);
            } else if (i == 2) {
                groupCreateUserCell = new View(context) { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.SearchAdapter.1
                    @Override // android.view.View
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + InviteMembersBottomSheet.this.additionalHeight + InviteMembersBottomSheet.this.searchAdditionalHeight, TLObject.FLAG_30));
                    }
                };
            } else if (i != 4) {
                groupCreateUserCell = new GroupCreateSectionCell(context);
            } else {
                groupCreateUserCell = new View(context);
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
        
            if (r13.toString().startsWith("@" + r3) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            CharSequence charSequence;
            Object object;
            long j;
            long j2;
            String publicUsername;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((GroupCreateSectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.GlobalSearch));
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                viewHolder.itemView.requestLayout();
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            int size = this.searchResult.size();
            int size2 = this.searchAdapterHelper.getGlobalSearch().size();
            int size3 = this.searchAdapterHelper.getLocalServerSearch().size();
            int i2 = i - 1;
            CharSequence charSequence2 = null;
            if (i2 >= 0 && i2 < size) {
                tLObject = (TLObject) this.searchResult.get(i2);
            } else if (i2 >= size && i2 < size3 + size) {
                tLObject = (TLObject) this.searchAdapterHelper.getLocalServerSearch().get(i2 - size);
            } else {
                tLObject = (i2 <= size + size3 || i2 > (size2 + size) + size3) ? null : (TLObject) this.searchAdapterHelper.getGlobalSearch().get(((i2 - size) - size3) - 1);
            }
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i2 < size) {
                    charSequence = (CharSequence) this.searchResultNames.get(i2);
                    if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                    }
                    charSequence2 = charSequence;
                    charSequence = null;
                } else if (i2 > size && !TextUtils.isEmpty(publicUsername)) {
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
                object = groupCreateUserCell.getObject();
                if (!(object instanceof TLRPC.User)) {
                    j = ((TLRPC.User) object).id;
                } else {
                    j = object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
                }
                groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
                if (!(tLObject instanceof TLRPC.User)) {
                    j2 = ((TLRPC.User) tLObject).id;
                } else {
                    j2 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                }
                if (j2 == 0) {
                    if (InviteMembersBottomSheet.this.ignoreUsers == null || InviteMembersBottomSheet.this.ignoreUsers.indexOfKey(j2) < 0) {
                        groupCreateUserCell.setChecked(InviteMembersBottomSheet.this.selectedContacts.indexOfKey(j2) >= 0, j == j2);
                        groupCreateUserCell.setCheckBoxEnabled(true);
                        return;
                    } else {
                        groupCreateUserCell.setChecked(true, j == j2);
                        groupCreateUserCell.setCheckBoxEnabled(false);
                        return;
                    }
                }
                return;
            }
            charSequence = null;
            object = groupCreateUserCell.getObject();
            if (!(object instanceof TLRPC.User)) {
            }
            groupCreateUserCell.setObject(tLObject, charSequence2, charSequence);
            if (!(tLObject instanceof TLRPC.User)) {
            }
            if (j2 == 0) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0) {
                return 2;
            }
            if (i == this.currentItemsCount - 1) {
                return 4;
            }
            return i + (-1) == this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size() ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.searchAdapterHelper.getLocalServerSearch().size();
            int size3 = this.searchAdapterHelper.getGlobalSearch().size();
            int i = size + size2;
            if (size3 != 0) {
                i += size3 + 1;
            }
            int i2 = i + 2;
            this.currentItemsCount = i2;
            return i2;
        }

        private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    InviteMembersBottomSheet.SearchAdapter.$r8$lambda$o2HU2KD4-9Ho7yJnTX4xVsD2kVw(InviteMembersBottomSheet.SearchAdapter.this, arrayList, arrayList2);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$o2HU2KD4-9Ho7yJnTX4xVsD2kVw(SearchAdapter searchAdapter, ArrayList arrayList, ArrayList arrayList2) {
            searchAdapter.searchRunnable = null;
            searchAdapter.searchResult = arrayList;
            searchAdapter.searchResultNames = arrayList2;
            searchAdapter.searchAdapterHelper.mergeResults(arrayList);
            InviteMembersBottomSheet.this.showItemsAnimated(searchAdapter.currentItemsCount - 1);
            searchAdapter.notifyDataSetChanged();
            if (searchAdapter.searchAdapterHelper.isSearchInProgress() || searchAdapter.getItemCount() > 2) {
                return;
            }
            InviteMembersBottomSheet.this.emptyView.showProgress(false, true);
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, false, false, false, 0L, false, 0, 0);
            notifyDataSetChanged();
            if (!TextUtils.isEmpty(str)) {
                RecyclerView.Adapter adapter = InviteMembersBottomSheet.this.listView.getAdapter();
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                RecyclerView.Adapter adapter2 = inviteMembersBottomSheet.searchListViewAdapter;
                if (adapter != adapter2) {
                    inviteMembersBottomSheet.listView.setAdapter(adapter2);
                }
                InviteMembersBottomSheet.this.emptyView.showProgress(true, false);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteMembersBottomSheet.SearchAdapter.$r8$lambda$oQTJao8AoPQU4nFyT_oBs1MIRTc(InviteMembersBottomSheet.SearchAdapter.this, str);
                    }
                };
                this.searchRunnable = runnable;
                dispatchQueue.postRunnable(runnable, 300L);
                return;
            }
            RecyclerView.Adapter adapter3 = InviteMembersBottomSheet.this.listView.getAdapter();
            InviteMembersBottomSheet inviteMembersBottomSheet2 = InviteMembersBottomSheet.this;
            RecyclerView.Adapter adapter4 = inviteMembersBottomSheet2.listViewAdapter;
            if (adapter3 != adapter4) {
                inviteMembersBottomSheet2.listView.setAdapter(adapter4);
            }
        }

        public static /* synthetic */ void $r8$lambda$oQTJao8AoPQU4nFyT_oBs1MIRTc(final SearchAdapter searchAdapter, final String str) {
            searchAdapter.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    InviteMembersBottomSheet.SearchAdapter.$r8$lambda$kJ7ix-IhHh2e4JaQ_cX-NttJmOA(InviteMembersBottomSheet.SearchAdapter.this, str);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$kJ7ix-IhHh2e4JaQ_cX-NttJmOA(final SearchAdapter searchAdapter, final String str) {
            searchAdapter.searchAdapterHelper.queryServerSearch(str, true, InviteMembersBottomSheet.this.dialogsDelegate != null, true, InviteMembersBottomSheet.this.dialogsDelegate != null, false, 0L, false, 0, 0);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SearchAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    InviteMembersBottomSheet.SearchAdapter.$r8$lambda$C5hGV4f_WxqbXvmxQX7ZLJxcVS4(InviteMembersBottomSheet.SearchAdapter.this, str);
                }
            };
            searchAdapter.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
        
            if (r13.contains(" " + r5) != false) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0138 A[LOOP:1: B:26:0x009b->B:41:0x0138, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $r8$lambda$C5hGV4f_WxqbXvmxQX7ZLJxcVS4(SearchAdapter searchAdapter, String str) {
            String str2;
            String publicUsername;
            Object obj;
            searchAdapter.getClass();
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                searchAdapter.updateSearchResults(new ArrayList(), new ArrayList());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < InviteMembersBottomSheet.this.contacts.size(); i2++) {
                TLObject tLObject = (TLObject) InviteMembersBottomSheet.this.contacts.get(i2);
                boolean z = tLObject instanceof TLRPC.User;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str2 = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                    publicUsername = UserObject.getPublicUsername(user);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.title;
                    publicUsername = ChatObject.getPublicUsername(chat);
                }
                String translitString2 = LocaleController.getInstance().getTranslitString(str2);
                if (str2.equals(translitString2)) {
                    translitString2 = null;
                }
                int i3 = 0;
                char c = 0;
                while (true) {
                    if (i3 < i) {
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
                                            TLRPC.User user2 = (TLRPC.User) tLObject;
                                            arrayList2.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str3));
                                        } else {
                                            arrayList2.add(AndroidUtilities.generateSearchName(((TLRPC.Chat) tLObject).title, null, str3));
                                        }
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList2.add(AndroidUtilities.generateSearchName("@" + publicUsername, null, "@" + str3));
                                    }
                                    arrayList.add(tLObject);
                                } else {
                                    i3++;
                                }
                            }
                        }
                        c = 1;
                        if (c == 0) {
                        }
                    }
                }
            }
            searchAdapter.updateSearchResults(arrayList, arrayList2);
        }
    }

    @Override // org.telegram.ui.Components.UsersAlertBase
    protected void onSearchViewTouched(MotionEvent motionEvent, final EditTextBoldCursor editTextBoldCursor) {
        BaseFragment baseFragment;
        if (motionEvent.getAction() == 0) {
            this.y = this.scrollOffsetY;
            return;
        }
        if (motionEvent.getAction() != 1 || Math.abs(this.scrollOffsetY - this.y) >= this.touchSlop || this.enterEventSent) {
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            baseFragment = (BaseFragment) launchActivity.getActionBarLayout().getFragmentStack().get(launchActivity.getActionBarLayout().getFragmentStack().size() - 1);
        } else {
            baseFragment = null;
        }
        if (baseFragment instanceof ChatActivity) {
            boolean needEnterText = ((ChatActivity) baseFragment).needEnterText();
            this.enterEventSent = true;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InviteMembersBottomSheet.$r8$lambda$ZvdpehcT4RY6ChYyGCLMlHQIwqg(InviteMembersBottomSheet.this, editTextBoldCursor);
                }
            }, needEnterText ? 200L : 0L);
        } else {
            this.enterEventSent = true;
            setFocusable(true);
            editTextBoldCursor.requestFocus();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$ZvdpehcT4RY6ChYyGCLMlHQIwqg(InviteMembersBottomSheet inviteMembersBottomSheet, final EditTextBoldCursor editTextBoldCursor) {
        inviteMembersBottomSheet.setFocusable(true);
        editTextBoldCursor.requestFocus();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SpansContainer extends ViewGroup {
        boolean addAnimation;
        private int animationIndex;
        private boolean animationStarted;
        private ArrayList animators;
        private View removingSpan;

        public SpansContainer(Context context) {
            super(context);
            this.animators = new ArrayList();
            this.animationIndex = -1;
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            int childCount = getChildCount();
            int size = View.MeasureSpec.getSize(i);
            int dp = size - AndroidUtilities.dp(26.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof GroupCreateSpan) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                    if (childAt != this.removingSpan && childAt.getMeasuredWidth() + i3 > dp) {
                        dp2 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i3 = 0;
                    }
                    if (childAt.getMeasuredWidth() + i4 > dp) {
                        dp3 += childAt.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                        i4 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(13.0f) + i3;
                    if (!this.animationStarted) {
                        View view = this.removingSpan;
                        if (childAt == view) {
                            childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i4);
                            childAt.setTranslationY(dp3);
                        } else if (view != null) {
                            float f = dp4;
                            if (childAt.getTranslationX() != f) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f));
                            }
                            float f2 = dp2;
                            if (childAt.getTranslationY() != f2) {
                                this.animators.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f2));
                            }
                        } else {
                            childAt.setTranslationX(dp4);
                            childAt.setTranslationY(dp2);
                        }
                    }
                    if (childAt != this.removingSpan) {
                        i3 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                    }
                    i4 += childAt.getMeasuredWidth() + AndroidUtilities.dp(9.0f);
                }
            }
            int dp5 = dp3 + AndroidUtilities.dp(42.0f);
            final int dp6 = dp2 + AndroidUtilities.dp(42.0f);
            int min = InviteMembersBottomSheet.this.dialogsDelegate != null ? InviteMembersBottomSheet.this.spanEnter ? Math.min(InviteMembersBottomSheet.this.maxSize, dp6) : 0 : Math.max(0, Math.min(InviteMembersBottomSheet.this.maxSize, dp6) - AndroidUtilities.dp(52.0f));
            int i6 = InviteMembersBottomSheet.this.searchAdditionalHeight;
            InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
            inviteMembersBottomSheet.searchAdditionalHeight = (inviteMembersBottomSheet.dialogsDelegate != null || InviteMembersBottomSheet.this.selectedContacts.size() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
            if (min != InviteMembersBottomSheet.this.additionalHeight || i6 != InviteMembersBottomSheet.this.searchAdditionalHeight) {
                InviteMembersBottomSheet.this.additionalHeight = min;
                if (InviteMembersBottomSheet.this.listView.getAdapter() != null && InviteMembersBottomSheet.this.listView.getAdapter().getItemCount() > 0 && (findViewHolderForAdapterPosition = InviteMembersBottomSheet.this.listView.findViewHolderForAdapterPosition(0)) != null) {
                    InviteMembersBottomSheet.this.listView.getAdapter().notifyItemChanged(0);
                    InviteMembersBottomSheet.this.layoutManager.scrollToPositionWithOffset(0, findViewHolderForAdapterPosition.itemView.getTop() - InviteMembersBottomSheet.this.listView.getPaddingTop());
                    if (InviteMembersBottomSheet.this.listView.getItemAnimator() != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.SpansContainer.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                InviteMembersBottomSheet.this.listView.updateSelector();
                            }
                        });
                        ofFloat.setDuration(InviteMembersBottomSheet.this.listView.getItemAnimator().getChangeDuration()).start();
                    }
                }
            }
            int min2 = Math.min(InviteMembersBottomSheet.this.maxSize, dp6);
            if (InviteMembersBottomSheet.this.scrollViewH != min2) {
                ValueAnimator ofInt = ValueAnimator.ofInt(InviteMembersBottomSheet.this.scrollViewH, min2);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SpansContainer$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InviteMembersBottomSheet.SpansContainer.$r8$lambda$MfQh7cY2v2J_fTb7UA4v3aIMN7A(InviteMembersBottomSheet.SpansContainer.this, valueAnimator);
                    }
                });
                this.animators.add(ofInt);
            }
            if (this.addAnimation && dp6 > InviteMembersBottomSheet.this.maxSize) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SpansContainer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteMembersBottomSheet.this.spansScrollView.smoothScrollTo(0, dp6 - InviteMembersBottomSheet.this.maxSize);
                    }
                });
            } else if (!this.addAnimation && InviteMembersBottomSheet.this.spansScrollView.getScrollY() + InviteMembersBottomSheet.this.spansScrollView.getMeasuredHeight() > dp6) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$SpansContainer$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InviteMembersBottomSheet.this.spansScrollView.smoothScrollTo(0, dp6 - InviteMembersBottomSheet.this.maxSize);
                    }
                });
            }
            if (!this.animationStarted && InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.playTogether(this.animators);
                InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.SpansContainer.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        SpansContainer.this.requestLayout();
                    }
                });
                InviteMembersBottomSheet.this.currentAnimation.start();
                this.animationStarted = true;
            }
            if (InviteMembersBottomSheet.this.currentAnimation == null) {
                InviteMembersBottomSheet.this.scrollViewH = min2;
                ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
            }
            setMeasuredDimension(size, Math.max(dp6, dp5));
            InviteMembersBottomSheet.this.listView.setTranslationY(0.0f);
        }

        public static /* synthetic */ void $r8$lambda$MfQh7cY2v2J_fTb7UA4v3aIMN7A(SpansContainer spansContainer, ValueAnimator valueAnimator) {
            InviteMembersBottomSheet.this.scrollViewH = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((BottomSheet) InviteMembersBottomSheet.this).containerView.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        public void addSpan(GroupCreateSpan groupCreateSpan, boolean z) {
            this.addAnimation = true;
            InviteMembersBottomSheet.this.selectedContacts.put(groupCreateSpan.getUid(), groupCreateSpan);
            if (InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.setupEndValues();
                InviteMembersBottomSheet.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            if (z) {
                InviteMembersBottomSheet.this.currentAnimation = new AnimatorSet();
                InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.SpansContainer.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        InviteMembersBottomSheet.this.currentAnimation = null;
                        SpansContainer.this.animationStarted = false;
                    }
                });
                InviteMembersBottomSheet.this.currentAnimation.setDuration(150L);
                InviteMembersBottomSheet.this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animators.clear();
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_X, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.SCALE_Y, 0.01f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(groupCreateSpan, (Property<GroupCreateSpan, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            addView(groupCreateSpan);
        }

        public void removeSpan(final GroupCreateSpan groupCreateSpan) {
            this.addAnimation = false;
            InviteMembersBottomSheet.this.selectedContacts.remove(groupCreateSpan.getUid());
            groupCreateSpan.setOnClickListener(null);
            if (InviteMembersBottomSheet.this.currentAnimation != null) {
                InviteMembersBottomSheet.this.currentAnimation.setupEndValues();
                InviteMembersBottomSheet.this.currentAnimation.cancel();
            }
            this.animationStarted = false;
            InviteMembersBottomSheet.this.currentAnimation = new AnimatorSet();
            InviteMembersBottomSheet.this.currentAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.SpansContainer.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SpansContainer.this.removeView(groupCreateSpan);
                    SpansContainer.this.removingSpan = null;
                    InviteMembersBottomSheet.this.currentAnimation = null;
                    SpansContainer.this.animationStarted = false;
                }
            });
            InviteMembersBottomSheet.this.currentAnimation.setDuration(150L);
            this.removingSpan = groupCreateSpan;
            this.animators.clear();
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_X, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.01f));
            this.animators.add(ObjectAnimator.ofFloat(this.removingSpan, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.UsersAlertBase
    protected UsersAlertBase.ContainerView createContainerView(Context context) {
        return new UsersAlertBase.ContainerView(context) { // from class: org.telegram.ui.Components.InviteMembersBottomSheet.4
            float animateToEmptyViewOffset;
            float deltaOffset;
            float emptyViewOffset;
            Paint paint = new Paint();
            private VerticalPositionAutoAnimator verticalPositionAutoAnimator;

            @Override // android.view.ViewGroup
            public void onViewAdded(View view) {
                if (view == InviteMembersBottomSheet.this.floatingButton && this.verticalPositionAutoAnimator == null) {
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

            @Override // org.telegram.ui.Components.UsersAlertBase.ContainerView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
                InviteMembersBottomSheet.this.spansScrollView.setTranslationY((inviteMembersBottomSheet.scrollOffsetY - ((BottomSheet) inviteMembersBottomSheet).backgroundPaddingTop) + AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(64.0f));
                float f = InviteMembersBottomSheet.this.additionalHeight + InviteMembersBottomSheet.this.searchAdditionalHeight;
                if (InviteMembersBottomSheet.this.emptyView.getVisibility() != 0) {
                    this.emptyViewOffset = f;
                    this.animateToEmptyViewOffset = f;
                } else if (this.animateToEmptyViewOffset != f) {
                    this.animateToEmptyViewOffset = f;
                    this.deltaOffset = (f - this.emptyViewOffset) * 0.10666667f;
                }
                float f2 = this.emptyViewOffset;
                float f3 = this.animateToEmptyViewOffset;
                if (f2 != f3) {
                    float f4 = this.deltaOffset;
                    float f5 = f2 + f4;
                    this.emptyViewOffset = f5;
                    if (f4 > 0.0f && f5 > f3) {
                        this.emptyViewOffset = f3;
                    } else if (f4 < 0.0f && f5 < f3) {
                        this.emptyViewOffset = f3;
                    } else {
                        invalidate();
                    }
                }
                InviteMembersBottomSheet.this.emptyView.setTranslationY(r0.scrollOffsetY + this.emptyViewOffset);
                super.dispatchDraw(canvas);
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == InviteMembersBottomSheet.this.spansScrollView) {
                    canvas.save();
                    canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + InviteMembersBottomSheet.this.scrollViewH + 1.0f);
                    canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), (int) (InviteMembersBottomSheet.this.spansEnterProgress * 255.0f)));
                    this.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_divider), (int) (InviteMembersBottomSheet.this.spansEnterProgress * 255.0f)));
                    canvas.drawRect(0.0f, view.getY() + InviteMembersBottomSheet.this.scrollViewH, getMeasuredWidth(), view.getY() + InviteMembersBottomSheet.this.scrollViewH + 1.0f, this.paint);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
    }

    @Override // org.telegram.ui.Components.UsersAlertBase
    protected void search(String str) {
        this.searchAdapter.searchDialogs(str);
    }

    public void setDelegate(GroupCreateActivity.ContactsAddActivityDelegate contactsAddActivityDelegate) {
        this.delegate = contactsAddActivityDelegate;
    }

    public void setDelegate(InviteMembersBottomSheetDelegate inviteMembersBottomSheetDelegate, ArrayList arrayList) {
        this.dialogsDelegate = inviteMembersBottomSheetDelegate;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        this.dialogsServerOnly = new ArrayList(MessagesController.getInstance(this.currentAccount).dialogsServerOnly);
        updateRows();
    }

    private class ItemAnimator extends DefaultItemAnimator {
        public ItemAnimator() {
            this.translationInterpolator = CubicBezierInterpolator.DEFAULT;
            setMoveDuration(150L);
            setAddDuration(150L);
            setRemoveDuration(150L);
            InviteMembersBottomSheet.this.setShowWithoutAnimation(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        super.dismissInternal();
        if (this.enterEventSent) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                BaseFragment baseFragment = (BaseFragment) launchActivity.getActionBarLayout().getFragmentStack().get(launchActivity.getActionBarLayout().getFragmentStack().size() - 1);
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).onEditTextDialogClose(true, true);
                }
            }
        }
    }

    private void generateLink() {
        if (this.linkGenerating) {
            return;
        }
        this.linkGenerating = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.chatId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda7
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                InviteMembersBottomSheet.$r8$lambda$pTcK69kS7pqfGrGxmKbK0qJHYFQ(InviteMembersBottomSheet.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$pTcK69kS7pqfGrGxmKbK0qJHYFQ(final InviteMembersBottomSheet inviteMembersBottomSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        inviteMembersBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.InviteMembersBottomSheet$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                InviteMembersBottomSheet.$r8$lambda$HPhb5555Pw3t2cLui7n7p1s9SmQ(InviteMembersBottomSheet.this, tL_error, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$HPhb5555Pw3t2cLui7n7p1s9SmQ(InviteMembersBottomSheet inviteMembersBottomSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            inviteMembersBottomSheet.getClass();
            inviteMembersBottomSheet.invite = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(inviteMembersBottomSheet.currentAccount).getChatFull(inviteMembersBottomSheet.chatId);
            if (chatFull != null) {
                chatFull.exported_invite = inviteMembersBottomSheet.invite;
            }
            if (inviteMembersBottomSheet.invite.link == null) {
                return;
            }
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", inviteMembersBottomSheet.invite.link));
            BulletinFactory.createCopyLinkBulletin(inviteMembersBottomSheet.parentFragment).show();
            inviteMembersBottomSheet.dismiss();
        }
        inviteMembersBottomSheet.linkGenerating = false;
    }
}
