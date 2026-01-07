package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.SearchTextWatcher;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.ContactsAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LetterSectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ContactsEmptyView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

/* loaded from: classes4.dex */
public class ContactsActivity extends BaseFragment implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate, WindowAnimatedInsetsProvider.Listener {
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private View actionBarBackgroundView;
    private ImageView actionModeCloseView;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private float additionalFloatingTranslation;
    private boolean allowBots;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private final FactorAnimator animatorSearchFieldHeight;
    private final BoolAnimator animatorSearchFieldVisible;
    private final BoolAnimator animatorSearchHasQuery;
    private boolean askAboutContacts;
    private BackDrawable backDrawable;
    private boolean canScrollByAnimation;
    private long channelId;
    private long chatId;
    private boolean checkPermission;
    private SizeNotifierFrameLayout contentView;
    private boolean createSecretChat;
    private boolean creatingChat;
    private ContactsActivityDelegate delegate;
    private boolean destroyAfterSelect;
    private boolean disableSections;
    private StickerEmptyView emptyView;
    private FragmentFloatingButton floatingButton;
    private boolean floatingButtonVisibleByScroll;
    private boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private LongSparseArray ignoreUsers;
    private int imeInsetAnimatedHeight;
    private String initialSearchString;
    private boolean lastIsEmpty;
    private int lastListScrollState;
    private float lastSearchFieldHeight;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ContactsAdapter listViewAdapter;
    private int navigationBarHeight;
    private boolean needFinishFragment;
    private boolean needForwardCount;
    private boolean needPhonebook;
    private boolean onlyUsers;
    private AlertDialog permissionDialog;
    private long permissionRequestTime;
    private boolean resetDelegate;
    private boolean returnAsResult;
    boolean scheduled;
    private float scrollByAcc;
    private RecyclerAnimationScrollHelper scrollHelper;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private FragmentSearchField searchField;
    private ActionBarMenuItem searchItem;
    private SearchAdapter searchListViewAdapter;
    private String searchQuery;
    private boolean searchWas;
    private boolean searching;
    private String selectAlertString;
    private final LongSparseArray selectedContacts;
    private NumberTextView selectedContactsCountTextView;
    private boolean sortByName;
    Runnable sortContactsRunnable;
    private ActionBarMenuItem sortItem;
    private final Rect tmpClipRect;

    public interface ContactsActivityDelegate {
        void didSelectContact(TLRPC.User user, String str, ContactsActivity contactsActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 350L);
        this.animatorSearchFieldHeight = new FactorAnimator(1, this, cubicBezierInterpolator, 350L);
        this.animatorSearchHasQuery = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.floatingButtonVisibleByScroll = true;
        this.allowSelf = true;
        this.allowBots = true;
        this.needForwardCount = true;
        this.needFinishFragment = true;
        this.resetDelegate = true;
        this.selectAlertString = null;
        this.allowUsernameSearch = true;
        this.askAboutContacts = true;
        this.selectedContacts = new LongSparseArray();
        this.checkPermission = true;
        this.sortContactsRunnable = new Runnable() { // from class: org.telegram.ui.ContactsActivity.10
            @Override // java.lang.Runnable
            public void run() {
                ContactsActivity.this.listViewAdapter.sortOnlineContacts();
                ContactsActivity.this.scheduled = false;
            }
        };
        this.tmpClipRect = new Rect();
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.checkPermission = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.onlyUsers = bundle.getBoolean("onlyUsers", false);
            this.destroyAfterSelect = this.arguments.getBoolean("destroyAfterSelect", false);
            this.returnAsResult = this.arguments.getBoolean("returnAsResult", false);
            this.createSecretChat = this.arguments.getBoolean("createSecretChat", false);
            this.selectAlertString = this.arguments.getString("selectAlertString");
            this.allowUsernameSearch = this.arguments.getBoolean("allowUsernameSearch", true);
            this.needForwardCount = this.arguments.getBoolean("needForwardCount", true);
            this.allowBots = this.arguments.getBoolean("allowBots", true);
            this.allowSelf = this.arguments.getBoolean("allowSelf", true);
            this.channelId = this.arguments.getLong("channelId", 0L);
            this.needFinishFragment = this.arguments.getBoolean("needFinishFragment", true);
            this.chatId = this.arguments.getLong("chat_id", 0L);
            this.disableSections = this.arguments.getBoolean("disableSections", false);
            this.resetDelegate = this.arguments.getBoolean("resetDelegate", false);
            this.needPhonebook = this.arguments.getBoolean("needPhonebook", false);
            this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.needPhonebook = true;
        }
        if (!this.createSecretChat && !this.returnAsResult) {
            this.sortByName = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadHiddenStories();
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.delegate = null;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public View createView(Context context) {
        final int i;
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.destroyAfterSelect) {
            if (this.returnAsResult) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
            } else {
                this.actionBar.setTitle(LocaleController.getString(this.createSecretChat ? R.string.NewSecretChat : R.string.NewMessageTitle));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        }
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        if (!this.hasMainTabs) {
            this.actionBar.setBackButtonDrawable(backDrawable);
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourceProvider);
        this.searchField = fragmentSearchField;
        fragmentSearchField.setPivotY(0.0f);
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, null);
        createActionMode.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        if (this.hasMainTabs) {
            ImageView imageView = new ImageView(context);
            this.actionModeCloseView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
            this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
            this.actionModeCloseView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactsActivity.this.lambda$createView$0(view);
                }
            });
            createActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedContactsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedContactsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedContactsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        createActionMode.addView(this.selectedContactsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.hasMainTabs ? 18 : 72, 0, 0, 0));
        this.selectedContactsCountTextView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$1;
                lambda$createView$1 = ContactsActivity.lambda$createView$1(view, motionEvent);
                return lambda$createView$1;
            }
        });
        createActionMode.addItemWithWidth(100, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new 1());
        ActionBarMenu createMenu = this.actionBar.createMenu();
        ActionBarMenuItem addItem = createMenu.addItem(0, R.drawable.ic_ab_search);
        this.searchItem = addItem;
        addItem.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        EditTextBoldCursor editTextBoldCursor = this.searchField.editText;
        editTextBoldCursor.addTextChangedListener(new SearchTextWatcher(editTextBoldCursor, new ActionBarMenuItem.ActionBarMenuItemSearchListener() { // from class: org.telegram.ui.ContactsActivity.2
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
            public void onSearchExpand() {
                ContactsActivity.this.searching = true;
                ContactsActivity.this.checkUi_floatingButtonVisible();
            }

            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
            public void onSearchCollapse() {
                ContactsActivity.this.searchListViewAdapter.searchDialogs(null);
                ContactsActivity.this.searching = false;
                ContactsActivity.this.searchWas = false;
                ContactsActivity.this.listView.setAdapter(ContactsActivity.this.listViewAdapter);
                ContactsActivity.this.listView.setSectionsType(1);
                ContactsActivity.this.listViewAdapter.notifyDataSetChanged();
                ContactsActivity.this.listView.setFastScrollVisible(true);
                ContactsActivity.this.listView.setVerticalScrollBarEnabled(false);
                ContactsActivity.this.listView.getFastScroll().topOffset = AndroidUtilities.dp(90.0f);
                ContactsActivity.this.checkUi_floatingButtonVisible();
            }

            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
            public void onTextChanged(EditText editText) {
                if (ContactsActivity.this.searchListViewAdapter == null) {
                    return;
                }
                String obj = editText.getText().toString();
                ContactsActivity.this.animatorSearchHasQuery.setValue(!obj.isEmpty(), true);
                ContactsActivity.this.searchQuery = obj;
                if (!obj.isEmpty()) {
                    ContactsActivity.this.searchWas = true;
                    if (ContactsActivity.this.listView != null) {
                        ContactsActivity.this.listView.setAdapter(ContactsActivity.this.searchListViewAdapter);
                        ContactsActivity.this.listView.setSectionsType(0);
                        ContactsActivity.this.searchListViewAdapter.notifyDataSetChanged();
                        ContactsActivity.this.listView.setFastScrollVisible(false);
                        ContactsActivity.this.listView.setVerticalScrollBarEnabled(true);
                    }
                    ContactsActivity.this.emptyView.showProgress(true, true);
                    ContactsActivity.this.searchListViewAdapter.searchDialogs(obj);
                    return;
                }
                if (ContactsActivity.this.listView != null) {
                    ContactsActivity.this.listView.setAdapter(ContactsActivity.this.listViewAdapter);
                    ContactsActivity.this.listView.setSectionsType(1);
                }
            }
        }));
        if (!this.createSecretChat && !this.returnAsResult) {
            ActionBarMenuItem addItem2 = createMenu.addItem(1, this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.sortItem = addItem2;
            addItem2.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.searchListViewAdapter = new SearchAdapter(context, this.ignoreUsers, this.selectedContacts, this.allowUsernameSearch, false, false, this.allowBots, this.allowSelf, true, 0) { // from class: org.telegram.ui.ContactsActivity.3
            @Override // org.telegram.ui.Adapters.SearchAdapter
            protected void onSearchProgressChanged() {
                if (!searchInProgress() && getItemCount() == 0) {
                    ContactsActivity.this.emptyView.showProgress(false, true);
                }
                ContactsActivity.this.showItemsAnimated();
            }
        };
        int i2 = 2;
        if (this.chatId != 0) {
            i = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.chatId)), 3) ? 1 : 0;
        } else {
            if (this.channelId != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i = 2;
                }
            }
            i = 0;
        }
        ContactsAdapter contactsAdapter = new ContactsAdapter(context, this, this.onlyUsers ? 1 : 0, this.needPhonebook, this.ignoreUsers, this.selectedContacts, i, false) { // from class: org.telegram.ui.ContactsActivity.4
            @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                if (ContactsActivity.this.listView == null || ContactsActivity.this.listView.getAdapter() != this) {
                    return;
                }
                int itemCount = super.getItemCount();
                if (ContactsActivity.this.needPhonebook) {
                    ContactsActivity.this.listView.setFastScrollVisible(itemCount != 2);
                } else {
                    ContactsActivity.this.listView.setFastScrollVisible(itemCount != 0);
                }
            }

            @Override // org.telegram.ui.Adapters.ContactsAdapter, org.telegram.ui.Components.RecyclerListView.SectionsAdapter
            public int getSectionCount() {
                int sectionCount = super.getSectionCount();
                ContactsActivity.this.checkUi_floatingButtonVisible();
                ContactsActivity.this.checkUi_sortItem();
                ContactsActivity.this.checkUi_searchFieldHint();
                return sectionCount;
            }
        };
        this.listViewAdapter = contactsAdapter;
        if (this.sortItem == null) {
            i2 = 0;
        } else if (this.sortByName) {
            i2 = 1;
        }
        contactsAdapter.setSortType(i2, false);
        this.listViewAdapter.setDisableSections(this.disableSections);
        this.listView = new RecyclerListView(context);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.ContactsActivity.5
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && ContactsActivity.this.scrollableViewNoiseSuppressor != null) {
                    ContactsActivity.this.blur3_InvalidateBlur();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (ContactsActivity.this.iBlur3SourceGlassFrosted != null && !ContactsActivity.this.iBlur3SourceGlassFrosted.inRecording()) {
                        RecordingCanvas beginRecording = ContactsActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        beginRecording.drawColor(ContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            ContactsActivity.this.scrollableViewNoiseSuppressor.draw(beginRecording, -3);
                        }
                        ContactsActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (ContactsActivity.this.iBlur3SourceGlass != null && !ContactsActivity.this.iBlur3SourceGlass.inRecording()) {
                        RecordingCanvas beginRecording2 = ContactsActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        beginRecording2.drawColor(ContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            ContactsActivity.this.scrollableViewNoiseSuppressor.draw(beginRecording2, -2);
                        }
                        ContactsActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    ContactsActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
                if (ContactsActivity.this.hasMainTabs) {
                    return;
                }
                AndroidUtilities.drawNavigationBarProtection(canvas, this, ContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), ContactsActivity.this.navigationBarHeight);
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || ContactsActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                ContactsActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(NotificationCenter.configLoaded);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i3, int i4) {
                measureChildWithMargins(((BaseFragment) ContactsActivity.this).actionBar, i3, 0, i4, 0);
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.emptyView.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(48.0f);
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.searchField.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.actionBarBackgroundView.getLayoutParams()).height = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(53.0f);
                ContactsActivity.this.checkUi_listViewPadding();
                super.onMeasure(i3, i4);
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                ContactsActivity.this.checkUi_emptyView();
                ContactsActivity.this.checkUi_searchButton();
                ContactsActivity.this.checkUi_sortItem();
                ContactsActivity.this.checkUi_floatingButtonPosition();
                ContactsActivity.this.checkUi_listClip();
            }
        };
        this.contentView = sizeNotifierFrameLayout;
        this.fragmentView = sizeNotifierFrameLayout;
        RecyclerListView recyclerListView = this.listView;
        Objects.requireNonNull(recyclerListView);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView, sizeNotifierFrameLayout, new CallLogActivity$$ExternalSyntheticLambda2(recyclerListView));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.contentView.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setDurations(150L);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setSectionsType(1);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setAdapter(this.listViewAdapter);
        this.listView.setClipToPadding(false);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new RecyclerAnimationScrollHelper.ScrollListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda4
            @Override // org.telegram.ui.Components.RecyclerAnimationScrollHelper.ScrollListener
            public final void onScroll() {
                ContactsActivity.this.blur3_InvalidateBlur();
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        RecyclerListView recyclerListView3 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        sizeNotifierFrameLayout2.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda5
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i3, float f2, float f3) {
                RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i3, f2, f3);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i3, float f2, float f3) {
                ContactsActivity.this.lambda$createView$3(i, view, i3, f2, f3);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda6
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i3) {
                boolean lambda$createView$11;
                lambda$createView$11 = ContactsActivity.this.lambda$createView$11(view, i3);
                return lambda$createView$11;
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.ContactsActivity.6
            private boolean lastScrollToDown;
            private boolean scrollUpdated;
            private boolean scrollingManually;

            /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                boolean z;
                float dp;
                if (this.scrollingManually && i3 != 1) {
                    int findFirstVisibleItemPosition = ContactsActivity.this.layoutManager.findFirstVisibleItemPosition();
                    View childAt = recyclerView.getChildAt(0);
                    int top = childAt != null ? childAt.getTop() : 0;
                    if (!ContactsActivity.this.animatorSearchHasQuery.getValue() && (findFirstVisibleItemPosition != 0 || top < ContactsActivity.this.listView.getPaddingTop() - AndroidUtilities.dp(48.0f))) {
                        if (ContactsActivity.this.animatorSearchFieldHeight.getFactor() <= AndroidUtilities.dp(((this.lastScrollToDown ? 1 : 4) * 48) / 5.0f)) {
                            z = false;
                            dp = AndroidUtilities.dp(z ? 48.0f : 0.0f);
                            if (ContactsActivity.this.animatorSearchFieldHeight.getToFactor() != dp) {
                                ContactsActivity.this.animatorSearchFieldHeight.animateTo(dp);
                                ContactsActivity.this.canScrollByAnimation = true;
                            }
                            ContactsActivity.this.animatorSearchFieldVisible.setValue(z, true);
                        }
                    }
                    z = true;
                    dp = AndroidUtilities.dp(z ? 48.0f : 0.0f);
                    if (ContactsActivity.this.animatorSearchFieldHeight.getToFactor() != dp) {
                    }
                    ContactsActivity.this.animatorSearchFieldVisible.setValue(z, true);
                }
                if (i3 == 1) {
                    if ((ContactsActivity.this.searching && ContactsActivity.this.searchWas) || ContactsActivity.this.searchField.editText.isFocused()) {
                        AndroidUtilities.hideKeyboard(ContactsActivity.this.getParentActivity().getCurrentFocus());
                    }
                    this.scrollingManually = true;
                } else {
                    this.scrollingManually = false;
                }
                ContactsActivity.this.lastListScrollState = i3;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                int findFirstVisibleItemPosition = ContactsActivity.this.layoutManager.findFirstVisibleItemPosition();
                View childAt = recyclerView.getChildAt(0);
                int top = childAt != null ? childAt.getTop() : 0;
                if (ContactsActivity.this.floatingButton != null && !ContactsActivity.this.searching) {
                    boolean z = i4 > 0;
                    if (i4 != 0 && this.scrollUpdated && (z || this.scrollingManually)) {
                        ContactsActivity.this.floatingButtonVisibleByScroll = !z;
                        ContactsActivity.this.checkUi_floatingButtonVisible();
                    }
                    this.scrollUpdated = true;
                }
                if (this.scrollingManually) {
                    boolean z2 = ContactsActivity.this.animatorSearchHasQuery.getValue() || (findFirstVisibleItemPosition == 0 && top >= ContactsActivity.this.listView.getPaddingTop());
                    float factor = ContactsActivity.this.animatorSearchFieldHeight.getFactor();
                    if (!z2 && i4 != 0) {
                        ContactsActivity.this.animatorSearchFieldHeight.forceFactor(MathUtils.clamp(factor - i4, 0.0f, AndroidUtilities.dp(48.0f)));
                    }
                    ContactsActivity.this.animatorSearchFieldVisible.setValue(z2 || ContactsActivity.this.animatorSearchFieldHeight.getFactor() > 0.0f, true);
                }
                ContactsActivity.this.headerShadowView.setShadowVisible(findFirstVisibleItemPosition != 0 || top < ContactsActivity.this.listView.getPaddingTop(), true);
                ContactsActivity.this.actionBarBackgroundView.invalidate();
                this.lastScrollToDown = i4 < 0;
                if (Build.VERSION.SDK_INT < 31 || ContactsActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                ContactsActivity.this.scrollableViewNoiseSuppressor.onScrolled(i3, i4);
                ContactsActivity.this.blur3_InvalidateBlur();
            }
        });
        if (!this.createSecretChat && !this.returnAsResult) {
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
            this.floatingButton = fragmentFloatingButton;
            this.contentView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
            this.floatingButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactsActivity.this.lambda$createView$12(view);
                }
            });
            this.floatingButton.setAnimation(R.raw.write_contacts_fab_icon, 44);
            this.floatingButton.imageView.getAnimatedDrawable().setCurrentFrame(this.floatingButton.imageView.getAnimatedDrawable().getFramesCount() - 1);
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.initialSearchString;
        if (str != null) {
            this.actionBar.openSearchField(str, false);
            this.initialSearchString = null;
        }
        View view = new View(context) { // from class: org.telegram.ui.ContactsActivity.7
            private final Rect rectTmp = new Rect();
            private final Paint paint = new Paint(1);

            @Override // android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                int factor = (int) ContactsActivity.this.animatorSearchFieldHeight.getFactor();
                this.paint.setColor(ContactsActivity.this.getThemedColor(Theme.key_actionBarDefault));
                this.rectTmp.set(0, 0, getMeasuredWidth(), ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight() + factor);
                ContactsActivity.this.contentView.drawBlurRect(canvas, 0.0f, this.rectTmp, this.paint, true);
            }
        };
        this.actionBarBackgroundView = view;
        this.contentView.addView(view, LayoutHelper.createFrame(-1, 0, 48));
        this.contentView.addView(this.actionBar);
        this.contentView.addView(this.searchField, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        this.listViewAdapter.setStories(getMessagesController().storiesController.getHiddenList(), false);
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.animatorSearchFieldHeight.forceFactor(AndroidUtilities.dp(48.0f));
        this.animatorSearchFieldVisible.setValue(true, false);
        checkUi_searchFieldHint();
        Bulletin.addDelegate(this, new Bulletin.Delegate() { // from class: org.telegram.ui.ContactsActivity.8
            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean allowLayoutChanges() {
                return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.-CC.$default$clipWithGradient(this, i3);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ int getTopOffset(int i3) {
                return Bulletin.Delegate.-CC.$default$getTopOffset(this, i3);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onHide(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onHide(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onShow(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onShow(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public void onBottomOffsetChange(float f2) {
                ContactsActivity.this.additionalFloatingTranslation = Math.max(0.0f, (f2 - r0.navigationBarHeight) - ContactsActivity.this.additionFloatingButtonOffset);
                ContactsActivity.this.checkUi_floatingButtonPosition();
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public int getBottomOffset(int i3) {
                return ContactsActivity.this.navigationBarHeight + ContactsActivity.this.additionFloatingButtonOffset;
            }
        });
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.getRootAnimatedInsetsListener().subscribeToWindowInsetsAnimation(this);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.fragmentView, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda8
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = ContactsActivity.this.onApplyWindowInsets(view2, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
        return this.fragmentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$0(View view) {
        hideActionMode();
    }

    class 1 extends ActionBar.ActionBarMenuOnItemClick {
        1() {
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) ContactsActivity.this).actionBar.isActionModeShowed()) {
                    ContactsActivity.this.hideActionMode();
                    return;
                } else {
                    ContactsActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 100) {
                ContactsActivity.this.performSelectedContactsDelete();
                return;
            }
            if (i == 1) {
                SharedConfig.toggleSortContactsByName();
                ContactsActivity.this.sortByName = SharedConfig.sortContactsByName;
                ContactsActivity.this.listViewAdapter.setSortType(ContactsActivity.this.sortByName ? 1 : 2, false);
                ContactsActivity.this.sortItem.setIcon(ContactsActivity.this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                return;
            }
            if (i == 0) {
                ContactsActivity.this.animatorSearchFieldVisible.setValue(true, true);
                ContactsActivity.this.animatorSearchFieldHeight.animateTo(AndroidUtilities.dp(48.0f));
                AndroidUtilities.doOnPreDraw(ContactsActivity.this.searchField.editText, new Runnable() { // from class: org.telegram.ui.ContactsActivity$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.1.this.lambda$onItemClick$0();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onItemClick$0() {
            ContactsActivity.this.searchField.editText.requestFocus();
            AndroidUtilities.showKeyboard(ContactsActivity.this.searchField.editText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$3(int i, View view, int i2, float f, float f2) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchListViewAdapter;
        if (adapter == searchAdapter) {
            Object item = searchAdapter.getItem(i2);
            if (!this.selectedContacts.isEmpty() && (view instanceof ProfileSearchCell)) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                if (profileSearchCell.getUser() == null || !profileSearchCell.getUser().contact) {
                    return;
                }
                showOrUpdateActionMode(profileSearchCell);
                return;
            }
            if (item instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) item;
                if (this.searchListViewAdapter.isGlobalSearch(i2)) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (this.returnAsResult) {
                    LongSparseArray longSparseArray = this.ignoreUsers;
                    if (longSparseArray == null || longSparseArray.indexOfKey(user.id) < 0) {
                        didSelectResult(user, true, null);
                        return;
                    }
                    return;
                }
                if (this.createSecretChat) {
                    if (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                        return;
                    }
                    this.creatingChat = true;
                    SecretChatHelper.getInstance(this.currentAccount).startSecretChat(getParentActivity(), user);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new ChatActivity(bundle), this.needFinishFragment);
                    return;
                }
                return;
            }
            if (item instanceof String) {
                String str = (String) item;
                if (str.equals("section")) {
                    return;
                }
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                }
                NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(this, getContext());
                newContactBottomSheet.setInitialPhoneNumber(str, true);
                newContactBottomSheet.show();
                return;
            }
            if (item instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) item;
                AlertsCreator.createContactInviteDialog(this, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            }
            return;
        }
        int sectionForPosition = this.listViewAdapter.getSectionForPosition(i2);
        int positionInSectionForPosition = this.listViewAdapter.getPositionInSectionForPosition(i2);
        if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof ContactsEmptyView)) {
            FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
            if (fragmentFloatingButton != null) {
                fragmentFloatingButton.performClick();
                return;
            }
            return;
        }
        if (!this.selectedContacts.isEmpty() && (view instanceof UserCell)) {
            showOrUpdateActionMode((UserCell) view);
            return;
        }
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        boolean z = contactsAdapter.hasStories;
        if (z && sectionForPosition == 1) {
            if (view instanceof UserCell) {
                getOrCreateStoryViewer().open(getContext(), ((UserCell) view).getDialogId(), StoriesListPlaceProvider.of(this.listView));
                return;
            }
            return;
        }
        if (z && sectionForPosition > 1) {
            sectionForPosition--;
        }
        if ((!this.onlyUsers || i != 0) && sectionForPosition == 0) {
            if (this.needPhonebook) {
                if (positionInSectionForPosition == 0) {
                    if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                        AccountFrozenAlert.show(this.currentAccount);
                        return;
                    } else {
                        presentFragment(new InviteContactsActivity());
                        return;
                    }
                }
                return;
            }
            if (i != 0) {
                if (positionInSectionForPosition == 0) {
                    if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                        AccountFrozenAlert.show(this.currentAccount);
                        return;
                    }
                    long j = this.chatId;
                    if (j == 0) {
                        j = this.channelId;
                    }
                    presentFragment(new GroupInviteActivity(j));
                    return;
                }
                return;
            }
            if (positionInSectionForPosition == 0) {
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                } else {
                    presentFragment(new GroupCreateActivity(new Bundle()), false);
                    return;
                }
            }
            if (positionInSectionForPosition == 1) {
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                } else {
                    new NewContactBottomSheet(this, getContext()).show();
                    return;
                }
            }
            if (positionInSectionForPosition == 2) {
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                }
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle2));
                    return;
                } else {
                    presentFragment(new ActionIntroActivity(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                    return;
                }
            }
            return;
        }
        Object item2 = this.listViewAdapter.getItem(contactsAdapter.getSectionForPosition(i2), this.listViewAdapter.getPositionInSectionForPosition(i2));
        if (item2 instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) item2;
            if (this.returnAsResult) {
                LongSparseArray longSparseArray2 = this.ignoreUsers;
                if (longSparseArray2 == null || longSparseArray2.indexOfKey(user2.id) < 0) {
                    didSelectResult(user2, true, null);
                    return;
                }
                return;
            }
            if (this.createSecretChat) {
                this.creatingChat = true;
                SecretChatHelper.getInstance(this.currentAccount).startSecretChat(getParentActivity(), user2);
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", user2.id);
            if (getMessagesController().checkCanOpenChat(bundle3, this)) {
                presentFragment(new ChatActivity(bundle3), this.needFinishFragment);
                return;
            }
            return;
        }
        if (item2 instanceof ContactsController.Contact) {
            ContactsController.Contact contact2 = (ContactsController.Contact) item2;
            final String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
            if (str2 == null || getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setMessage(LocaleController.getString(R.string.InviteUser));
            builder.setTitle(LocaleController.getString(R.string.AppName));
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda10
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i3) {
                    ContactsActivity.this.lambda$createView$2(str2, alertDialog, i3);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$2(String str, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createView$11(View view, int i) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (adapter == contactsAdapter) {
            int sectionForPosition = contactsAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = this.listViewAdapter.getPositionInSectionForPosition(i);
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().hide();
            }
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return false;
            }
            if (this.listViewAdapter.hasStories && sectionForPosition == 1 && (view instanceof UserCell)) {
                final long dialogId = ((UserCell) view).getDialogId();
                final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId));
                final String sharedPrefKey = NotificationsController.getSharedPrefKey(dialogId, 0L);
                boolean areStoriesNotMuted = NotificationsCustomSettingsActivity.areStoriesNotMuted(this.currentAccount, dialogId);
                ItemOptions addIf = ItemOptions.makeOptions(this, view).setScrimViewBackground(Theme.createRoundRectDrawable(0, 0, getThemedColor(Theme.key_windowBackgroundWhite))).add(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.this.lambda$createView$4(dialogId);
                    }
                }).add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.this.lambda$createView$5(dialogId);
                    }
                }).addIf(areStoriesNotMuted, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute), new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.this.lambda$createView$6(sharedPrefKey, dialogId, user);
                    }
                }).addIf(!areStoriesNotMuted, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute), new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.this.lambda$createView$7(sharedPrefKey, dialogId, user);
                    }
                });
                addIf.add(R.drawable.msg_viewintopic, LocaleController.getString(R.string.ShowInChats), new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContactsActivity.this.lambda$createView$10(dialogId, user);
                    }
                });
                addIf.setGravity(5).show();
                return true;
            }
        }
        boolean z = this.returnAsResult;
        if (!z && !this.createSecretChat && (view instanceof UserCell)) {
            showOrUpdateActionMode((UserCell) view);
            return true;
        }
        if (z || this.createSecretChat || !(view instanceof ProfileSearchCell)) {
            return false;
        }
        ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
        if (profileSearchCell.getUser() == null || !profileSearchCell.getUser().contact) {
            return true;
        }
        showOrUpdateActionMode(profileSearchCell);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$4(long j) {
        presentFragment(ChatActivity.of(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$5(long j) {
        presentFragment(ProfileActivity.of(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$6(String str, long j, TLRPC.User user) {
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
        getNotificationsController().updateServerNotificationsSettings(j, 0L);
        String trim = user == null ? "" : user.first_name.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        BulletinFactory.of(this).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim))).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$7(String str, long j, TLRPC.User user) {
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
        getNotificationsController().updateServerNotificationsSettings(j, 0L);
        String trim = user == null ? "" : user.first_name.trim();
        int indexOf = trim.indexOf(" ");
        if (indexOf > 0) {
            trim = trim.substring(0, indexOf);
        }
        BulletinFactory.of(this).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim))).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$10(final long j, TLRPC.User user) {
        getMessagesController().getStoriesController().toggleHidden(j, false, false, true);
        BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
        undoObject.onUndo = new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ContactsActivity.this.lambda$createView$8(j);
            }
        };
        undoObject.onAction = new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                ContactsActivity.this.lambda$createView$9(j);
            }
        };
        BulletinFactory.global().createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, ContactsController.formatName(user.first_name, null, 20))), null, undoObject).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$8(long j) {
        getMessagesController().getStoriesController().toggleHidden(j, true, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$9(long j) {
        getMessagesController().getStoriesController().toggleHidden(j, false, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createView$12(View view) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            new NewContactBottomSheet(this, getContext()).show();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ActionBar createActionBar(Context context) {
        ActionBar createActionBar = super.createActionBar(context);
        createActionBar.setUseContainerForTitles();
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setBackgroundColor(0);
        createActionBar.setAddToContainer(false);
        createActionBar.createTitleOverlayContainer();
        createActionBar.getTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return createActionBar;
    }

    public boolean addOrRemoveSelectedContact(UserCell userCell) {
        long dialogId = userCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            userCell.setChecked(false, true);
        } else if (userCell.getCurrentObject() instanceof TLRPC.User) {
            this.selectedContacts.put(dialogId, (TLRPC.User) userCell.getCurrentObject());
            userCell.setChecked(true, true);
            return true;
        }
        return false;
    }

    public boolean addOrRemoveSelectedContact(ProfileSearchCell profileSearchCell) {
        long dialogId = profileSearchCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            profileSearchCell.setChecked(false, true);
        } else if (profileSearchCell.getUser() != null) {
            this.selectedContacts.put(dialogId, profileSearchCell.getUser());
            profileSearchCell.setChecked(true, true);
            return true;
        }
        return false;
    }

    private void showOrUpdateActionMode(Object obj) {
        boolean addOrRemoveSelectedContact;
        if (obj instanceof UserCell) {
            addOrRemoveSelectedContact = addOrRemoveSelectedContact((UserCell) obj);
        } else if (!(obj instanceof ProfileSearchCell)) {
            return;
        } else {
            addOrRemoveSelectedContact = addOrRemoveSelectedContact((ProfileSearchCell) obj);
        }
        boolean z = true;
        if (!this.actionBar.isActionModeShowed()) {
            if (addOrRemoveSelectedContact) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
                this.actionBar.showActionMode();
                this.backDrawable.setRotation(1.0f, true);
            }
            z = false;
        } else if (this.selectedContacts.isEmpty()) {
            hideActionMode();
            return;
        }
        this.selectedContactsCountTextView.setNumber(this.selectedContacts.size(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideActionMode() {
        this.actionBar.hideActionMode();
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof UserCell) {
                UserCell userCell = (UserCell) childAt;
                if (this.selectedContacts.indexOfKey(userCell.getDialogId()) >= 0) {
                    userCell.setChecked(false, true);
                }
            } else if (childAt instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) childAt;
                if (this.selectedContacts.indexOfKey(profileSearchCell.getDialogId()) >= 0) {
                    profileSearchCell.setChecked(false, true);
                }
            }
        }
        this.selectedContacts.clear();
        this.backDrawable.setRotation(0.0f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performSelectedContactsDelete() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), getResourceProvider());
        if (this.selectedContacts.size() == 1) {
            builder.setTitle(LocaleController.getString(R.string.DeleteContactTitle));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactSubtitle));
        } else {
            builder.setTitle(LocaleController.formatPluralString("DeleteContactsTitle", this.selectedContacts.size(), new Object[0]));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactsSubtitle));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda21
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                ContactsActivity.this.lambda$performSelectedContactsDelete$13(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda22
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog create = builder.create();
        create.show();
        create.redPositive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performSelectedContactsDelete$13(AlertDialog alertDialog, int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(this.selectedContacts.size());
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add((TLRPC.User) this.selectedContacts.get(this.selectedContacts.keyAt(i2)));
        }
        getContactsController().deleteContactsUndoable(getContext(), this, arrayList);
        hideActionMode();
    }

    private void didSelectResult(final TLRPC.User user, boolean z, final String str) {
        final EditTextBoldCursor editTextBoldCursor;
        if (z && this.selectAlertString != null) {
            if (getParentActivity() == null) {
                return;
            }
            if (user.bot) {
                if (user.bot_nochats) {
                    try {
                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups)).show();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (this.channelId != 0) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    if (ChatObject.canAddAdmins(chat)) {
                        builder.setTitle(LocaleController.getString(R.string.AddBotAdminAlert));
                        builder.setMessage(LocaleController.getString(R.string.AddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda19
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i) {
                                ContactsActivity.this.lambda$didSelectResult$15(user, str, alertDialog, i);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.CantAddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    }
                    showDialog(builder.create());
                    return;
                }
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString(R.string.AppName));
            String formatStringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user));
            if (user.bot || !this.needForwardCount) {
                editTextBoldCursor = null;
            } else {
                formatStringSimple = String.format("%s\n\n%s", formatStringSimple, LocaleController.getString(R.string.AddToTheGroupForwardCount));
                editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setText("50");
                editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                editTextBoldCursor.setGravity(17);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setBackground(Theme.createEditTextDrawable(getParentActivity(), true));
                editTextBoldCursor.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.ContactsActivity.9
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        try {
                            String obj = editable.toString();
                            if (!obj.isEmpty()) {
                                int intValue = Utilities.parseInt((CharSequence) obj).intValue();
                                if (intValue < 0) {
                                    editTextBoldCursor.setText("0");
                                    EditText editText = editTextBoldCursor;
                                    editText.setSelection(editText.length());
                                } else if (intValue > 300) {
                                    editTextBoldCursor.setText("300");
                                    EditText editText2 = editTextBoldCursor;
                                    editText2.setSelection(editText2.length());
                                } else {
                                    if (!obj.equals("" + intValue)) {
                                        editTextBoldCursor.setText("" + intValue);
                                        EditText editText3 = editTextBoldCursor;
                                        editText3.setSelection(editText3.length());
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                });
                builder2.setView(editTextBoldCursor);
            }
            builder2.setMessage(formatStringSimple);
            builder2.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda20
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ContactsActivity.this.lambda$didSelectResult$16(user, editTextBoldCursor, alertDialog, i);
                }
            });
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder2.create());
            if (editTextBoldCursor != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                    }
                    int dp = AndroidUtilities.dp(24.0f);
                    marginLayoutParams.leftMargin = dp;
                    marginLayoutParams.rightMargin = dp;
                    marginLayoutParams.height = AndroidUtilities.dp(36.0f);
                    editTextBoldCursor.setLayoutParams(marginLayoutParams);
                }
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            }
            return;
        }
        ContactsActivityDelegate contactsActivityDelegate = this.delegate;
        if (contactsActivityDelegate != null) {
            contactsActivityDelegate.didSelectContact(user, str, this);
            if (this.resetDelegate) {
                this.delegate = null;
            }
        }
        if (this.needFinishFragment) {
            finishFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didSelectResult$15(TLRPC.User user, String str, AlertDialog alertDialog, int i) {
        ContactsActivityDelegate contactsActivityDelegate = this.delegate;
        if (contactsActivityDelegate != null) {
            contactsActivityDelegate.didSelectContact(user, str, this);
            this.delegate = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didSelectResult$16(TLRPC.User user, EditText editText, AlertDialog alertDialog, int i) {
        didSelectResult(user, false, editText != null ? editText.getText().toString() : "0");
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        if (this.actionBar.isActionModeShowed()) {
            if (z) {
                hideActionMode();
            }
            return false;
        }
        if (!this.animatorSearchHasQuery.getValue()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.searchField.editText.getText().clear();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        super.onResume();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (contactsAdapter != null) {
            contactsAdapter.notifyDataSetChanged();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyVisible() {
        Activity parentActivity;
        int checkSelfPermission;
        boolean shouldShowRequestPermissionRationale;
        super.onBecomeFullyVisible();
        if (!this.checkPermission || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.checkPermission = false;
        checkSelfPermission = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS");
        if (checkSelfPermission != 0) {
            shouldShowRequestPermissionRationale = parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
            if (shouldShowRequestPermissionRationale) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.MessagesStorage.IntCallback
                    public final void run(int i) {
                        ContactsActivity.this.lambda$onBecomeFullyVisible$17(i);
                    }
                }).create();
                this.permissionDialog = create;
                showDialog(create);
                return;
            }
            askForPermissons(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBecomeFullyVisible$17(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    protected RecyclerListView getListView() {
        return this.listView;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    protected void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null || !this.askAboutContacts) {
            return;
        }
        askForPermissons(false);
    }

    private void askForPermissons(boolean z) {
        int checkSelfPermission;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts) {
            return;
        }
        checkSelfPermission = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS");
        if (checkSelfPermission == 0) {
            return;
        }
        if (z && this.askAboutContacts) {
            showDialog(AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.MessagesStorage.IntCallback
                public final void run(int i) {
                    ContactsActivity.this.lambda$askForPermissons$18(i);
                }
            }).create());
            return;
        }
        this.permissionRequestTime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$askForPermissons$18(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.askAboutContacts = false;
                    edit.putBoolean("askAboutContacts", false).commit();
                    if (SystemClock.elapsedRealtime() - this.permissionRequestTime < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            ContactsAdapter contactsAdapter = this.listViewAdapter;
            if (contactsAdapter != null) {
                contactsAdapter.setStories(getMessagesController().getStoriesController().getHiddenList(), true);
            }
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadHiddenStories();
            return;
        }
        if (i == NotificationCenter.contactsDidLoad) {
            ContactsAdapter contactsAdapter2 = this.listViewAdapter;
            if (contactsAdapter2 != null) {
                if (!this.sortByName) {
                    contactsAdapter2.setSortType(2, true);
                }
                this.listViewAdapter.notifyDataSetChanged();
            }
            if (this.searchListViewAdapter != null) {
                RecyclerView.Adapter adapter = this.listView.getAdapter();
                SearchAdapter searchAdapter = this.searchListViewAdapter;
                if (adapter == searchAdapter) {
                    searchAdapter.searchDialogs(this.searchQuery);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                updateVisibleRows(intValue);
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.sortByName || this.listViewAdapter == null) {
                return;
            }
            scheduleSort();
            return;
        }
        if (i == NotificationCenter.encryptedChatCreated) {
            if (this.createSecretChat && this.creatingChat) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new ChatActivity(bundle), false);
                return;
            }
            return;
        }
        if (i != NotificationCenter.closeChats || this.creatingChat) {
            return;
        }
        removeSelfFromStack(true);
    }

    private void scheduleSort() {
        if (this.scheduled) {
            return;
        }
        this.scheduled = true;
        AndroidUtilities.cancelRunOnUIThread(this.sortContactsRunnable);
        AndroidUtilities.runOnUIThread(this.sortContactsRunnable, 5000L);
    }

    private void updateVisibleRows(int i) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.listView.getChildAt(i2);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(i);
                }
            }
        }
    }

    public void setDelegate(ContactsActivityDelegate contactsActivityDelegate) {
        this.delegate = contactsActivityDelegate;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showItemsAnimated() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        final int findLastVisibleItemPosition = linearLayoutManager == null ? 0 : linearLayoutManager.findLastVisibleItemPosition();
        this.listView.invalidate();
        AndroidUtilities.doOnPreDraw(this.listView, new Runnable() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                ContactsActivity.this.lambda$showItemsAnimated$19(findLastVisibleItemPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showItemsAnimated$19(int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        int childCount = this.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (this.listView.getChildAdapterPosition(childAt) > i) {
                childAt.setAlpha(0.0f);
                int min = (int) ((Math.min(this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.listView.getMeasuredHeight()) * 100.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setStartDelay(min);
                ofFloat.setDuration(200L);
                animatorSet.playTogether(ofFloat);
            }
        }
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                ContactsActivity.this.lambda$getThemeDescriptions$20();
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        if (!this.hasMainTabs) {
            arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{LetterSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollText));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        if (this.floatingButton != null) {
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chats_actionIcon));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_chats_actionBackground));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_chats_actionPressedBackground));
        }
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_offlinePaint, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getThemeDescriptions$20() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                }
            }
        }
        ImageView imageView = this.actionModeCloseView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
        }
        FragmentSearchField fragmentSearchField = this.searchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.updateColors();
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.updateColors();
        }
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            this.searchField.setAlpha(this.animatorSearchFieldVisible.getFloatValue() * (this.animatorSearchFieldHeight.getFactor() / AndroidUtilities.dp(48.0f)));
            this.searchField.setVisibility(f <= 0.0f ? 8 : 0);
            checkUi_searchButton();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                checkUi_searchButton();
                checkUi_sortItem();
                return;
            }
            return;
        }
        this.searchField.setAlpha(this.animatorSearchFieldVisible.getFloatValue() * (this.animatorSearchFieldHeight.getFactor() / AndroidUtilities.dp(48.0f)));
        this.headerShadowView.setTranslationY(f);
        this.searchField.setClipHeight(f / AndroidUtilities.dp(48.0f));
        this.actionBarBackgroundView.invalidate();
        if (this.canScrollByAnimation && this.lastListScrollState == 0) {
            float f3 = this.scrollByAcc + (this.lastSearchFieldHeight - f);
            this.scrollByAcc = f3;
            int round = Math.round(f3);
            this.scrollByAcc -= round;
            this.listView.scrollBy(0, round);
        }
        this.lastSearchFieldHeight = f;
        checkUi_listClip();
    }

    @Override // org.telegram.ui.MainTabsActivity.TabFragmentDelegate
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || recyclerListView.getFastScroll() == null || !this.listView.getFastScroll().isPressed()) {
            return !this.animatorSearchHasQuery.getValue();
        }
        return false;
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        if (i == 1) {
            this.canScrollByAnimation = false;
            this.scrollByAcc = 0.0f;
        }
    }

    @Override // org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider.Listener
    public View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider.Listener
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.imeInsetAnimatedHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        checkUi_emptyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        checkUi_listViewPadding();
        checkUi_floatingButtonPosition();
        checkUi_emptyView();
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_emptyView() {
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(this.navigationBarHeight + this.additionNavigationBarHeight, this.imeInsetAnimatedHeight), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP + 48) + this.actionBar.getMeasuredHeight(), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_searchFieldHint() {
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        boolean z = contactsAdapter != null && contactsAdapter.isEmpty();
        if (this.lastIsEmpty != z || TextUtils.isEmpty(this.searchField.editText.getHint())) {
            this.searchField.editText.setHint(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.searchField.editText.setContentDescription(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.lastIsEmpty = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_sortItem() {
        float floatValue = 1.0f - this.animatorSearchHasQuery.getFloatValue();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        FragmentFloatingButton.setAnimatedVisibility(this.sortItem, floatValue * ((contactsAdapter == null || contactsAdapter.isEmpty()) ? 0.0f : 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_searchButton() {
        FragmentFloatingButton.setAnimatedVisibility(this.searchItem, (1.0f - this.animatorSearchFieldVisible.getFloatValue()) * (1.0f - this.animatorSearchHasQuery.getFloatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_floatingButtonPosition() {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_floatingButtonVisible() {
        ContactsAdapter contactsAdapter;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton == null || (contactsAdapter = this.listViewAdapter) == null) {
            return;
        }
        fragmentFloatingButton.setButtonVisible((!this.floatingButtonVisibleByScroll || this.searching || contactsAdapter.isEmpty()) ? false : true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_listClip() {
        this.tmpClipRect.set(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.actionBar.getMeasuredHeight() + ((int) this.animatorSearchFieldHeight.getFactor()), this.listView.getMeasuredWidth(), this.listView.getMeasuredHeight() - AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP));
        this.listView.setClipBounds(this.tmpClipRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + dp2);
        this.iBlur3PositionMainTabs.set(0.0f, dp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, this.hasMainTabs ? 2 : 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.MainTabsActivity.TabFragmentDelegate
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override // org.telegram.ui.MainTabsActivity.TabFragmentDelegate
    public void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
        } else {
            this.scrollHelper.setScrollDirection(1);
            this.scrollHelper.scrollToPosition(0, 0, false, true);
        }
        this.animatorSearchFieldHeight.animateTo(AndroidUtilities.dp(48.0f));
        this.animatorSearchFieldVisible.setValue(true, true);
    }
}
