package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_channels_sendAsPeers;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetID;
import org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImportPeer;
import org.telegram.tgnet.TLRPC$TL_messages_checkedHistoryImportPeer;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_updateDialogFilter;
import org.telegram.tgnet.TLRPC$TL_recentMeUrlChat;
import org.telegram.tgnet.TLRPC$TL_recentMeUrlChatInvite;
import org.telegram.tgnet.TLRPC$TL_recentMeUrlStickerSet;
import org.telegram.tgnet.TLRPC$TL_recentMeUrlUnknown;
import org.telegram.tgnet.TLRPC$TL_recentMeUrlUser;
import org.telegram.tgnet.TLRPC$TL_userEmpty;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.Cells.ArchiveHintInnerCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.DrawerActionCell;
import org.telegram.ui.Cells.DrawerAddCell;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.DrawerUserCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsItemAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PacmanAnimation;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.GroupCreateFinalActivity;
/* loaded from: classes3.dex */
public class DialogsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static boolean[] dialogsLoaded = new boolean[4];
    private static final Interpolator interpolator = DialogsActivity$$ExternalSyntheticLambda29.INSTANCE;
    public static float viewOffset = 0.0f;
    private ValueAnimator actionBarColorAnimator;
    private ActionBarMenuSubItem addToFolderItem;
    private String addToGroupAlertString;
    private float additionalFloatingTranslation;
    private float additionalFloatingTranslation2;
    private float additionalOffset;
    private boolean afterSignup;
    private boolean allowBots;
    private boolean allowChannels;
    private boolean allowGroups;
    private boolean allowMoving;
    private boolean allowSwipeDuringCurrentTouch;
    private boolean allowSwitchAccount;
    private boolean allowUsers;
    private boolean animatingForward;
    private ActionBarMenuItem archive2Item;
    private ActionBarMenuSubItem archiveItem;
    private boolean askingForPermissions;
    private ChatAvatarContainer avatarContainer;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private ActionBarMenuSubItem blockItem;
    private View blurredView;
    private int canClearCacheCount;
    private boolean canDeletePsaSelected;
    private int canMuteCount;
    private int canPinCount;
    private int canReadCount;
    private int canReportSpamCount;
    private boolean canShowFilterTabsView;
    private boolean canShowHiddenArchive;
    private int canUnarchiveCount;
    private int canUnmuteCount;
    private boolean cantSendToChannels;
    private boolean checkCanWrite;
    private boolean checkingImportDialog;
    private ActionBarMenuSubItem clearItem;
    private boolean closeFragment;
    private boolean closeSearchFieldOnHide;
    private ChatActivityEnterView commentView;
    private AnimatorSet commentViewAnimator;
    private View commentViewBg;
    private ValueAnimator contactsAlphaAnimator;
    private int currentConnectionState;
    View databaseMigrationHint;
    private DialogsActivityDelegate delegate;
    private ActionBarMenuItem deleteItem;
    private int dialogChangeFinished;
    private int dialogInsertFinished;
    private int dialogRemoveFinished;
    private boolean dialogsListFrozen;
    private boolean disableActionBarScrolling;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimator;
    private ActionBarMenuItem downloadsItem;
    private boolean downloadsItemVisible;
    private float filterTabsMoveFrom;
    private float filterTabsProgress;
    private FilterTabsView filterTabsView;
    private boolean filterTabsViewIsVisible;
    private ValueAnimator filtersTabAnimator;
    private FiltersView filtersView;
    private RLottieImageView floatingButton;
    private FrameLayout floatingButtonContainer;
    private float floatingButtonHideProgress;
    private float floatingButtonTranslation;
    private boolean floatingForceVisible;
    private boolean floatingHidden;
    private AnimatorSet floatingProgressAnimator;
    private RadialProgressView floatingProgressView;
    private boolean floatingProgressVisible;
    private int folderId;
    private FragmentContextView fragmentContextView;
    private FragmentContextView fragmentLocationContextView;
    private ArrayList<TLRPC$Dialog> frozenDialogsList;
    private boolean hasInvoice;
    private int hasPoll;
    private int initialDialogsType;
    private String initialSearchString;
    boolean isDrawerTransition;
    boolean isSlideBackTransition;
    private int lastMeasuredTopPadding;
    private int maximumVelocity;
    private boolean maybeStartTracking;
    private MenuDrawable menuDrawable;
    private int messagesCount;
    private DialogCell movingView;
    private boolean movingWas;
    private ActionBarMenuItem muteItem;
    private boolean onlySelect;
    private long openedDialogId;
    private PacmanAnimation pacmanAnimation;
    private RLottieDrawable passcodeDrawable;
    private ActionBarMenuItem passcodeItem;
    private boolean passcodeItemVisible;
    private AlertDialog permissionDialog;
    private ActionBarMenuSubItem pin2Item;
    private ActionBarMenuItem pinItem;
    private int prevPosition;
    private int prevTop;
    private float progressToActionMode;
    private ProxyDrawable proxyDrawable;
    private ActionBarMenuItem proxyItem;
    private boolean proxyItemVisible;
    private ActionBarMenuSubItem readItem;
    private ActionBarMenuSubItem removeFromFolderItem;
    private AnimatorSet scrimAnimatorSet;
    private Paint scrimPaint;
    private ActionBarPopupWindow scrimPopupWindow;
    private ActionBarMenuSubItem[] scrimPopupWindowItems;
    private View scrimView;
    private boolean scrimViewAppearing;
    private Drawable scrimViewBackground;
    private boolean scrimViewSelected;
    private float scrollAdditionalOffset;
    private boolean scrollUpdated;
    private boolean scrollingManually;
    private float searchAnimationProgress;
    private boolean searchAnimationTabsDelayedCrossfade;
    private AnimatorSet searchAnimator;
    private long searchDialogId;
    private boolean searchFiltersWasShowed;
    private boolean searchIsShowed;
    private ActionBarMenuItem searchItem;
    private TLObject searchObject;
    private String searchString;
    private ViewPagerFixed.TabsView searchTabsView;
    private SearchViewPager searchViewPager;
    private boolean searchWas;
    private boolean searchWasFullyShowed;
    private boolean searching;
    private String selectAlertString;
    private String selectAlertStringGroup;
    private View selectedCountView;
    private NumberTextView selectedDialogsCountTextView;
    private ActionBarPopupWindow sendPopupWindow;
    private boolean showSetPasswordConfirm;
    private String showingSuggestion;
    private RecyclerView sideMenu;
    ValueAnimator slideBackTransitionAnimator;
    private DialogCell slidingView;
    private boolean slowedReloadAfterDialogClick;
    private long startArchivePullingTime;
    private boolean startedTracking;
    private ActionBarMenuItem switchItem;
    private Animator tabsAlphaAnimator;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private float tabsYOffset;
    private int topPadding;
    private FrameLayout updateLayout;
    private AnimatorSet updateLayoutAnimator;
    private RadialProgress2 updateLayoutIcon;
    private boolean updatePullAfterScroll;
    private TextView updateTextView;
    private ViewPage[] viewPages;
    private boolean waitingForScrollFinished;
    private boolean whiteActionBar;
    private ImageView[] writeButton;
    private FrameLayout writeButtonContainer;
    private int initialSearchType = -1;
    private float contactsAlpha = 1.0f;
    private UndoView[] undoView = new UndoView[2];
    private int[] scrimViewLocation = new int[2];
    private ArrayList<MessagesController.DialogFilter> movingDialogFilters = new ArrayList<>();
    private Paint actionBarDefaultPaint = new Paint();
    private ArrayList<View> actionModeViews = new ArrayList<>();
    private RectF rect = new RectF();
    private Paint paint = new Paint(1);
    private TextPaint textPaint = new TextPaint(1);
    private boolean askAboutContacts = true;
    private final AccelerateDecelerateInterpolator floatingInterpolator = new AccelerateDecelerateInterpolator();
    private boolean checkPermission = true;
    private boolean resetDelegate = true;
    private ArrayList<Long> selectedDialogs = new ArrayList<>();
    public boolean notify = true;
    private int animationIndex = -1;
    private int debugLastUpdateAction = -1;
    public final Property<DialogsActivity, Float> SCROLL_Y = new AnonymousClass1("animationValue");
    private boolean scrollBarVisible = true;
    private boolean isNextButton = false;
    float slideFragmentProgress = 1.0f;

    /* loaded from: classes3.dex */
    public interface DialogsActivityDelegate {
        void didSelectDialogs(DialogsActivity dialogsActivity, ArrayList<Long> arrayList, CharSequence charSequence, boolean z);
    }

    public static /* synthetic */ boolean lambda$createActionMode$15(View view, MotionEvent motionEvent) {
        return true;
    }

    public static /* synthetic */ float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void updateCommentView() {
    }

    public boolean shouldShowNextButton(DialogsActivity dialogsActivity, ArrayList<Long> arrayList, CharSequence charSequence, boolean z) {
        return false;
    }

    /* loaded from: classes3.dex */
    public static class ViewPage extends FrameLayout {
        private int archivePullViewState;
        private DialogsAdapter dialogsAdapter;
        private DialogsItemAnimator dialogsItemAnimator;
        private int dialogsType;
        private boolean isLocked;
        private ItemTouchHelper itemTouchhelper;
        private int lastItemsCount;
        private LinearLayoutManager layoutManager;
        private DialogsRecyclerView listView;
        private FlickerLoadingView progressView;
        private PullForegroundDrawable pullForegroundDrawable;
        private RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        private RecyclerAnimationScrollHelper scrollHelper;
        private int selectedType;
        private SwipeController swipeController;

        static /* synthetic */ int access$11208(ViewPage viewPage) {
            int i = viewPage.lastItemsCount;
            viewPage.lastItemsCount = i + 1;
            return i;
        }

        static /* synthetic */ int access$11210(ViewPage viewPage) {
            int i = viewPage.lastItemsCount;
            viewPage.lastItemsCount = i - 1;
            return i;
        }

        public ViewPage(Context context) {
            super(context);
        }

        public boolean isDefaultDialogType() {
            int i = this.dialogsType;
            return i == 0 || i == 7 || i == 8;
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends AnimationProperties.FloatProperty<DialogsActivity> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(str);
            DialogsActivity.this = r1;
        }

        public void setValue(DialogsActivity dialogsActivity, float f) {
            dialogsActivity.setScrollY(f);
        }

        public Float get(DialogsActivity dialogsActivity) {
            return Float.valueOf(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
        }
    }

    /* loaded from: classes3.dex */
    public class ContentView extends SizeNotifierFrameLayout {
        private int inputFieldHeight;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker velocityTracker;
        private Paint actionBarSearchPaint = new Paint(1);
        private Paint windowBackgroundPaint = new Paint();
        private int[] pos = new int[2];

        @Override // android.view.View
        public boolean hasOverlappingRendering() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentView(Context context) {
            super(context);
            DialogsActivity.this = r1;
            this.needBlur = true;
            this.blurBehindViews.add(this);
        }

        private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
            int nextPageId = DialogsActivity.this.filterTabsView.getNextPageId(z);
            if (nextPageId < 0) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            DialogsActivity.this.maybeStartTracking = false;
            DialogsActivity.this.startedTracking = true;
            this.startedTrackingX = (int) (motionEvent.getX() + DialogsActivity.this.additionalOffset);
            ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(false);
            DialogsActivity.this.filterTabsView.setEnabled(false);
            DialogsActivity.this.viewPages[1].selectedType = nextPageId;
            DialogsActivity.this.viewPages[1].setVisibility(0);
            DialogsActivity.this.animatingForward = z;
            DialogsActivity.this.showScrollbars(false);
            DialogsActivity.this.switchToCurrentSelectedMode(true);
            if (z) {
                DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth());
            } else {
                DialogsActivity.this.viewPages[1].setTranslationX(-DialogsActivity.this.viewPages[0].getMeasuredWidth());
            }
            return true;
        }

        @Override // android.view.View
        public void setPadding(int i, int i2, int i3, int i4) {
            DialogsActivity.this.topPadding = i2;
            DialogsActivity.this.updateContextViewPosition();
            if (DialogsActivity.this.whiteActionBar && DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.setTranslationY(DialogsActivity.this.topPadding - DialogsActivity.this.lastMeasuredTopPadding);
            } else {
                requestLayout();
            }
        }

        public boolean checkTabsAnimationInProgress() {
            boolean z;
            if (DialogsActivity.this.tabsAnimationInProgress) {
                int i = -1;
                if (DialogsActivity.this.backAnimation) {
                    if (Math.abs(DialogsActivity.this.viewPages[0].getTranslationX()) < 1.0f) {
                        DialogsActivity.this.viewPages[0].setTranslationX(0.0f);
                        ViewPage viewPage = DialogsActivity.this.viewPages[1];
                        int measuredWidth = DialogsActivity.this.viewPages[0].getMeasuredWidth();
                        if (DialogsActivity.this.animatingForward) {
                            i = 1;
                        }
                        viewPage.setTranslationX(measuredWidth * i);
                        z = true;
                    }
                    z = false;
                } else {
                    if (Math.abs(DialogsActivity.this.viewPages[1].getTranslationX()) < 1.0f) {
                        ViewPage viewPage2 = DialogsActivity.this.viewPages[0];
                        int measuredWidth2 = DialogsActivity.this.viewPages[0].getMeasuredWidth();
                        if (!DialogsActivity.this.animatingForward) {
                            i = 1;
                        }
                        viewPage2.setTranslationX(measuredWidth2 * i);
                        DialogsActivity.this.viewPages[1].setTranslationX(0.0f);
                        z = true;
                    }
                    z = false;
                }
                if (z) {
                    DialogsActivity.this.showScrollbars(true);
                    if (DialogsActivity.this.tabsAnimation != null) {
                        DialogsActivity.this.tabsAnimation.cancel();
                        DialogsActivity.this.tabsAnimation = null;
                    }
                    DialogsActivity.this.tabsAnimationInProgress = false;
                }
                return DialogsActivity.this.tabsAnimationInProgress;
            }
            return false;
        }

        public int getActionBarFullHeight() {
            float height = ((BaseFragment) DialogsActivity.this).actionBar.getHeight();
            float f = 0.0f;
            float measuredHeight = (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() == 8) ? 0.0f : DialogsActivity.this.filterTabsView.getMeasuredHeight() - ((1.0f - DialogsActivity.this.filterTabsProgress) * DialogsActivity.this.filterTabsView.getMeasuredHeight());
            if (DialogsActivity.this.searchTabsView != null && DialogsActivity.this.searchTabsView.getVisibility() != 8) {
                f = DialogsActivity.this.searchTabsView.getMeasuredHeight();
            }
            return (int) (height + (measuredHeight * (1.0f - DialogsActivity.this.searchAnimationProgress)) + (f * DialogsActivity.this.searchAnimationProgress));
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            if ((view != DialogsActivity.this.fragmentContextView || !DialogsActivity.this.fragmentContextView.isCallStyle()) && view != DialogsActivity.this.blurredView) {
                int i = 0;
                if (view != DialogsActivity.this.viewPages[0] && ((DialogsActivity.this.viewPages.length <= 1 || view != DialogsActivity.this.viewPages[1]) && view != DialogsActivity.this.fragmentContextView && view != DialogsActivity.this.fragmentLocationContextView && view != DialogsActivity.this.searchViewPager)) {
                    if (view == ((BaseFragment) DialogsActivity.this).actionBar && DialogsActivity.this.slideFragmentProgress != 1.0f) {
                        canvas.save();
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        float f = 1.0f - ((1.0f - dialogsActivity.slideFragmentProgress) * 0.05f);
                        canvas.translate((dialogsActivity.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        float measuredWidth = DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f;
                        if (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar()) {
                            i = AndroidUtilities.statusBarHeight;
                        }
                        canvas.scale(f, f, measuredWidth, i + (ActionBar.getCurrentActionBarHeight() / 2.0f));
                        z = super.drawChild(canvas, view, j);
                        canvas.restore();
                    } else {
                        z = super.drawChild(canvas, view, j);
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(0.0f, (-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight(), getMeasuredWidth(), getMeasuredHeight());
                    DialogsActivity dialogsActivity2 = DialogsActivity.this;
                    float f2 = dialogsActivity2.slideFragmentProgress;
                    if (f2 != 1.0f) {
                        float f3 = 1.0f - ((1.0f - f2) * 0.05f);
                        canvas.translate((dialogsActivity2.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        canvas.scale(f3, f3, DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f, (-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight());
                    }
                    z = super.drawChild(canvas, view, j);
                    canvas.restore();
                }
                if (view == ((BaseFragment) DialogsActivity.this).actionBar && ((BaseFragment) DialogsActivity.this).parentLayout != null) {
                    int y = (int) (((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight());
                    ((BaseFragment) DialogsActivity.this).parentLayout.drawHeaderShadow(canvas, (int) ((1.0f - DialogsActivity.this.searchAnimationProgress) * 255.0f), y);
                    if (DialogsActivity.this.searchAnimationProgress > 0.0f) {
                        if (DialogsActivity.this.searchAnimationProgress < 1.0f) {
                            int alpha = Theme.dividerPaint.getAlpha();
                            Theme.dividerPaint.setAlpha((int) (alpha * DialogsActivity.this.searchAnimationProgress));
                            float f4 = y;
                            canvas.drawLine(0.0f, f4, getMeasuredWidth(), f4, Theme.dividerPaint);
                            Theme.dividerPaint.setAlpha(alpha);
                        } else {
                            float f5 = y;
                            canvas.drawLine(0.0f, f5, getMeasuredWidth(), f5, Theme.dividerPaint);
                        }
                    }
                }
                return z;
            }
            return true;
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int i;
            Paint paint;
            int i2;
            int actionBarFullHeight = getActionBarFullHeight();
            if (!((BaseFragment) DialogsActivity.this).inPreviewMode) {
                i = (int) ((-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY());
            } else {
                i = AndroidUtilities.statusBarHeight;
            }
            int i3 = i;
            String str = "actionBarDefault";
            if (DialogsActivity.this.whiteActionBar) {
                if (DialogsActivity.this.searchAnimationProgress != 1.0f) {
                    if (DialogsActivity.this.searchAnimationProgress == 0.0f && DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                        DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                    }
                } else {
                    this.actionBarSearchPaint.setColor(Theme.getColor("windowBackgroundWhite"));
                    if (DialogsActivity.this.searchTabsView != null) {
                        DialogsActivity.this.searchTabsView.setTranslationY(0.0f);
                        DialogsActivity.this.searchTabsView.setAlpha(1.0f);
                        if (DialogsActivity.this.filtersView != null) {
                            DialogsActivity.this.filtersView.setTranslationY(0.0f);
                            DialogsActivity.this.filtersView.setAlpha(1.0f);
                        }
                    }
                }
                Rect rect = AndroidUtilities.rectTmp2;
                int i4 = i3 + actionBarFullHeight;
                rect.set(0, i3, getMeasuredWidth(), i4);
                drawBlurRect(canvas, 0.0f, rect, DialogsActivity.this.searchAnimationProgress == 1.0f ? this.actionBarSearchPaint : DialogsActivity.this.actionBarDefaultPaint, true);
                if (DialogsActivity.this.searchAnimationProgress > 0.0f && DialogsActivity.this.searchAnimationProgress < 1.0f) {
                    Paint paint2 = this.actionBarSearchPaint;
                    if (DialogsActivity.this.folderId != 0) {
                        str = "actionBarDefaultArchived";
                    }
                    paint2.setColor(ColorUtils.blendARGB(Theme.getColor(str), Theme.getColor("windowBackgroundWhite"), DialogsActivity.this.searchAnimationProgress));
                    if (DialogsActivity.this.searchIsShowed || !DialogsActivity.this.searchWasFullyShowed) {
                        canvas.save();
                        canvas.clipRect(0, i3, getMeasuredWidth(), i4);
                        drawBlurCircle(canvas, 0.0f, getMeasuredWidth() - AndroidUtilities.dp(24.0f), (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ((((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() - i2) / 2.0f), getMeasuredWidth() * 1.3f * DialogsActivity.this.searchAnimationProgress, this.actionBarSearchPaint, true);
                        canvas.restore();
                    } else {
                        rect.set(0, i3, getMeasuredWidth(), i4);
                        drawBlurRect(canvas, 0.0f, rect, this.actionBarSearchPaint, true);
                    }
                    if (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                        DialogsActivity.this.filterTabsView.setTranslationY(actionBarFullHeight - (((BaseFragment) DialogsActivity.this).actionBar.getHeight() + DialogsActivity.this.filterTabsView.getMeasuredHeight()));
                    }
                    if (DialogsActivity.this.searchTabsView != null) {
                        float height = actionBarFullHeight - (((BaseFragment) DialogsActivity.this).actionBar.getHeight() + DialogsActivity.this.searchTabsView.getMeasuredHeight());
                        float f = DialogsActivity.this.searchAnimationTabsDelayedCrossfade ? DialogsActivity.this.searchAnimationProgress < 0.5f ? 0.0f : (DialogsActivity.this.searchAnimationProgress - 0.5f) / 0.5f : DialogsActivity.this.searchAnimationProgress;
                        DialogsActivity.this.searchTabsView.setTranslationY(height);
                        DialogsActivity.this.searchTabsView.setAlpha(f);
                        if (DialogsActivity.this.filtersView != null) {
                            DialogsActivity.this.filtersView.setTranslationY(height);
                            DialogsActivity.this.filtersView.setAlpha(f);
                        }
                    }
                }
            } else if (!((BaseFragment) DialogsActivity.this).inPreviewMode) {
                if (DialogsActivity.this.progressToActionMode > 0.0f) {
                    Paint paint3 = this.actionBarSearchPaint;
                    if (DialogsActivity.this.folderId != 0) {
                        str = "actionBarDefaultArchived";
                    }
                    paint3.setColor(ColorUtils.blendARGB(Theme.getColor(str), Theme.getColor("windowBackgroundWhite"), DialogsActivity.this.progressToActionMode));
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rect2.set(0, i3, getMeasuredWidth(), i3 + actionBarFullHeight);
                    drawBlurRect(canvas, 0.0f, rect2, this.actionBarSearchPaint, true);
                } else {
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    rect3.set(0, i3, getMeasuredWidth(), i3 + actionBarFullHeight);
                    drawBlurRect(canvas, 0.0f, rect3, DialogsActivity.this.actionBarDefaultPaint, true);
                }
            }
            DialogsActivity.this.tabsYOffset = 0.0f;
            if (DialogsActivity.this.filtersTabAnimator == null || DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                if (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                    DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                    DialogsActivity.this.filterTabsView.setAlpha(1.0f);
                }
            } else {
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.tabsYOffset = (-(1.0f - dialogsActivity.filterTabsProgress)) * DialogsActivity.this.filterTabsView.getMeasuredHeight();
                DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY() + DialogsActivity.this.tabsYOffset);
                DialogsActivity.this.filterTabsView.setAlpha(DialogsActivity.this.filterTabsProgress);
                DialogsActivity.this.viewPages[0].setTranslationY((-(1.0f - DialogsActivity.this.filterTabsProgress)) * DialogsActivity.this.filterTabsMoveFrom);
            }
            DialogsActivity.this.updateContextViewPosition();
            super.dispatchDraw(canvas);
            if (DialogsActivity.this.whiteActionBar && DialogsActivity.this.searchAnimationProgress > 0.0f && DialogsActivity.this.searchAnimationProgress < 1.0f && DialogsActivity.this.searchTabsView != null) {
                this.windowBackgroundPaint.setColor(Theme.getColor("windowBackgroundWhite"));
                this.windowBackgroundPaint.setAlpha((int) (paint.getAlpha() * DialogsActivity.this.searchAnimationProgress));
                canvas.drawRect(0.0f, actionBarFullHeight + i3, getMeasuredWidth(), i3 + ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + DialogsActivity.this.searchTabsView.getMeasuredHeight(), this.windowBackgroundPaint);
            }
            if (DialogsActivity.this.fragmentContextView != null && DialogsActivity.this.fragmentContextView.isCallStyle()) {
                canvas.save();
                canvas.translate(DialogsActivity.this.fragmentContextView.getX(), DialogsActivity.this.fragmentContextView.getY());
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                float f2 = dialogsActivity2.slideFragmentProgress;
                if (f2 != 1.0f) {
                    float f3 = 1.0f - ((1.0f - f2) * 0.05f);
                    canvas.translate((dialogsActivity2.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                    canvas.scale(f3, 1.0f, DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f, DialogsActivity.this.fragmentContextView.getY());
                }
                DialogsActivity.this.fragmentContextView.setDrawOverlay(true);
                DialogsActivity.this.fragmentContextView.draw(canvas);
                DialogsActivity.this.fragmentContextView.setDrawOverlay(false);
                canvas.restore();
            }
            if (DialogsActivity.this.blurredView != null && DialogsActivity.this.blurredView.getVisibility() == 0) {
                if (DialogsActivity.this.blurredView.getAlpha() != 1.0f) {
                    if (DialogsActivity.this.blurredView.getAlpha() != 0.0f) {
                        canvas.saveLayerAlpha(DialogsActivity.this.blurredView.getLeft(), DialogsActivity.this.blurredView.getTop(), DialogsActivity.this.blurredView.getRight(), DialogsActivity.this.blurredView.getBottom(), (int) (DialogsActivity.this.blurredView.getAlpha() * 255.0f), 31);
                        canvas.translate(DialogsActivity.this.blurredView.getLeft(), DialogsActivity.this.blurredView.getTop());
                        DialogsActivity.this.blurredView.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    DialogsActivity.this.blurredView.draw(canvas);
                }
            }
            if (DialogsActivity.this.scrimView != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), DialogsActivity.this.scrimPaint);
                canvas.save();
                getLocationInWindow(this.pos);
                canvas.translate(DialogsActivity.this.scrimViewLocation[0] - this.pos[0], DialogsActivity.this.scrimViewLocation[1] - (Build.VERSION.SDK_INT < 21 ? AndroidUtilities.statusBarHeight : 0));
                if (DialogsActivity.this.scrimViewBackground != null) {
                    DialogsActivity.this.scrimViewBackground.setAlpha(DialogsActivity.this.scrimViewAppearing ? 255 : (int) ((DialogsActivity.this.scrimPaint.getAlpha() / 50.0f) * 255.0f));
                    DialogsActivity.this.scrimViewBackground.setBounds(0, 0, DialogsActivity.this.scrimView.getWidth(), DialogsActivity.this.scrimView.getHeight());
                    DialogsActivity.this.scrimViewBackground.draw(canvas);
                }
                Drawable selectorDrawable = DialogsActivity.this.filterTabsView.getListView().getSelectorDrawable();
                if (DialogsActivity.this.scrimViewAppearing && selectorDrawable != null) {
                    canvas.save();
                    Rect bounds = selectorDrawable.getBounds();
                    canvas.translate(-bounds.left, -bounds.top);
                    selectorDrawable.draw(canvas);
                    canvas.restore();
                }
                DialogsActivity.this.scrimView.draw(canvas);
                if (DialogsActivity.this.scrimViewSelected) {
                    Drawable selectorDrawable2 = DialogsActivity.this.filterTabsView.getSelectorDrawable();
                    canvas.translate(-DialogsActivity.this.scrimViewLocation[0], (-selectorDrawable2.getIntrinsicHeight()) - 1);
                    selectorDrawable2.draw(canvas);
                }
                canvas.restore();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int paddingTop = size2 - getPaddingTop();
            if (DialogsActivity.this.doneItem != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DialogsActivity.this.doneItem.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = ActionBar.getCurrentActionBarHeight();
            }
            measureChildWithMargins(((BaseFragment) DialogsActivity.this).actionBar, i, 0, i2, 0);
            int measureKeyboardHeight = measureKeyboardHeight();
            int childCount = getChildCount();
            float f = 0.0f;
            if (DialogsActivity.this.commentView != null) {
                measureChildWithMargins(DialogsActivity.this.commentView, i, 0, i2, 0);
                Object tag = DialogsActivity.this.commentView.getTag();
                if (tag != null && tag.equals(2)) {
                    if (measureKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow) {
                        paddingTop -= DialogsActivity.this.commentView.getEmojiPadding();
                    }
                    this.inputFieldHeight = DialogsActivity.this.commentView.getMeasuredHeight();
                } else {
                    this.inputFieldHeight = 0;
                }
                if (SharedConfig.smoothKeyboard && DialogsActivity.this.commentView.isPopupShowing()) {
                    ((BaseFragment) DialogsActivity.this).fragmentView.setTranslationY(0.0f);
                    for (int i3 = 0; i3 < DialogsActivity.this.viewPages.length; i3++) {
                        if (DialogsActivity.this.viewPages[i3] != null) {
                            DialogsActivity.this.viewPages[i3].setTranslationY(0.0f);
                        }
                    }
                    if (!DialogsActivity.this.onlySelect) {
                        ((BaseFragment) DialogsActivity.this).actionBar.setTranslationY(0.0f);
                    }
                    DialogsActivity.this.searchViewPager.setTranslationY(0.0f);
                }
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && childAt != DialogsActivity.this.commentView && childAt != ((BaseFragment) DialogsActivity.this).actionBar) {
                    if (childAt instanceof DatabaseMigrationHint) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), (((View.MeasureSpec.getSize(i2) + measureKeyboardHeight) - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight()), 1073741824));
                    } else if (!(childAt instanceof ViewPage)) {
                        if (childAt == DialogsActivity.this.searchViewPager) {
                            DialogsActivity.this.searchViewPager.setTranslationY(0.0f);
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), ((((View.MeasureSpec.getSize(i2) + measureKeyboardHeight) - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - (DialogsActivity.this.onlySelect ? 0 : ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight())) - DialogsActivity.this.topPadding) - (DialogsActivity.this.searchTabsView == null ? 0 : AndroidUtilities.dp(44.0f)), 1073741824));
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2);
                        } else if (DialogsActivity.this.commentView != null && DialogsActivity.this.commentView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), ((paddingTop - this.inputFieldHeight) - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((paddingTop - this.inputFieldHeight) - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        }
                        i4++;
                        f = 0.0f;
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp = (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) ? (((paddingTop - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - (DialogsActivity.this.onlySelect ? 0 : ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight())) - DialogsActivity.this.topPadding : (((paddingTop - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - AndroidUtilities.dp(44.0f)) - DialogsActivity.this.topPadding;
                        if (DialogsActivity.this.filtersTabAnimator != null && DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                            dp = (int) (dp + DialogsActivity.this.filterTabsMoveFrom);
                        } else {
                            childAt.setTranslationY(f);
                        }
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        int i5 = (dialogsActivity.isSlideBackTransition || dialogsActivity.isDrawerTransition) ? (int) (dp * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i5);
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), dp + i5), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2);
                    }
                }
                i4++;
                f = 0.0f;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int measuredHeight;
            int i7;
            int i8;
            int i9;
            int i10;
            int childCount = getChildCount();
            Object tag = DialogsActivity.this.commentView != null ? DialogsActivity.this.commentView.getTag() : null;
            int measureKeyboardHeight = measureKeyboardHeight();
            int emojiPadding = (tag == null || !tag.equals(2) || measureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : DialogsActivity.this.commentView.getEmojiPadding();
            setBottomClip(emojiPadding);
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.lastMeasuredTopPadding = dialogsActivity.topPadding;
            int i11 = -1;
            while (i11 < childCount) {
                View childAt = i11 == -1 ? DialogsActivity.this.commentView : getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i12 = layoutParams.gravity;
                    if (i12 == -1) {
                        i12 = 51;
                    }
                    int i13 = i12 & 7;
                    int i14 = i12 & 112;
                    int i15 = i13 & 7;
                    if (i15 == 1) {
                        i10 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                        i9 = layoutParams.rightMargin;
                    } else if (i15 == 5) {
                        i10 = i3 - measuredWidth;
                        i9 = layoutParams.rightMargin;
                    } else {
                        i5 = layoutParams.leftMargin;
                        if (i14 == 16) {
                            if (i14 == 48) {
                                i6 = layoutParams.topMargin + getPaddingTop();
                            } else if (i14 == 80) {
                                i7 = ((i4 - emojiPadding) - i2) - measuredHeight2;
                                i8 = layoutParams.bottomMargin;
                            } else {
                                i6 = layoutParams.topMargin;
                            }
                            if (DialogsActivity.this.commentView != null || !DialogsActivity.this.commentView.isPopupView(childAt)) {
                                if (childAt != DialogsActivity.this.filterTabsView || childAt == DialogsActivity.this.searchTabsView || childAt == DialogsActivity.this.filtersView) {
                                    i6 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                                } else {
                                    if (childAt == DialogsActivity.this.searchViewPager) {
                                        i6 = (DialogsActivity.this.onlySelect ? 0 : ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight()) + DialogsActivity.this.topPadding;
                                        measuredHeight = DialogsActivity.this.searchTabsView == null ? 0 : AndroidUtilities.dp(44.0f);
                                    } else if (childAt instanceof DatabaseMigrationHint) {
                                        i6 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                                    } else if (childAt instanceof ViewPage) {
                                        if (!DialogsActivity.this.onlySelect) {
                                            if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                                                i6 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                                            } else {
                                                i6 = AndroidUtilities.dp(44.0f);
                                            }
                                        }
                                        measuredHeight = DialogsActivity.this.topPadding;
                                    } else if (childAt instanceof FragmentContextView) {
                                        measuredHeight = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                                    }
                                    i6 += measuredHeight;
                                }
                                childAt.layout(i5, i6, measuredWidth + i5, measuredHeight2 + i6);
                            } else if (AndroidUtilities.isInMultiwindow) {
                                i6 = DialogsActivity.this.commentView.getTop() - childAt.getMeasuredHeight();
                                measuredHeight = AndroidUtilities.dp(1.0f);
                                i6 += measuredHeight;
                                childAt.layout(i5, i6, measuredWidth + i5, measuredHeight2 + i6);
                            } else {
                                i6 = DialogsActivity.this.commentView.getBottom();
                                childAt.layout(i5, i6, measuredWidth + i5, measuredHeight2 + i6);
                            }
                        } else {
                            i7 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i8 = layoutParams.bottomMargin;
                        }
                        i6 = i7 - i8;
                        if (DialogsActivity.this.commentView != null) {
                        }
                        if (childAt != DialogsActivity.this.filterTabsView) {
                        }
                        i6 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight2 + i6);
                    }
                    i5 = i10 - i9;
                    if (i14 == 16) {
                    }
                    i6 = i7 - i8;
                    if (DialogsActivity.this.commentView != null) {
                    }
                    if (childAt != DialogsActivity.this.filterTabsView) {
                    }
                    i6 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                    childAt.layout(i5, i6, measuredWidth + i5, measuredHeight2 + i6);
                }
                i11++;
            }
            DialogsActivity.this.searchViewPager.setKeyboardHeight(measureKeyboardHeight);
            notifyHeightChanged();
            DialogsActivity.this.updateContextViewPosition();
            DialogsActivity.this.updateCommentView();
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 1 || actionMasked == 3) && ((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                DialogsActivity.this.allowMoving = true;
            }
            if (!checkTabsAnimationInProgress()) {
                return (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.isAnimatingIndicator()) || onTouchEvent(motionEvent);
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
            if (DialogsActivity.this.maybeStartTracking && !DialogsActivity.this.startedTracking) {
                onTouchEvent(null);
            }
            super.requestDisallowInterceptTouchEvent(z);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float f;
            float f2;
            float f3;
            int i;
            boolean z = false;
            if (((BaseFragment) DialogsActivity.this).parentLayout == null || DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.isEditing() || DialogsActivity.this.searching || ((BaseFragment) DialogsActivity.this).parentLayout.checkTransitionAnimation() || ((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode() || ((BaseFragment) DialogsActivity.this).parentLayout.isPreviewOpenAnimationInProgress() || ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().isDrawerOpened() || ((motionEvent != null && !DialogsActivity.this.startedTracking && motionEvent.getY() <= ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY()) || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5)) {
                return false;
            }
            if (motionEvent != null) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.addMovement(motionEvent);
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && checkTabsAnimationInProgress()) {
                DialogsActivity.this.startedTracking = true;
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.startedTrackingX = (int) motionEvent.getX();
                ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(false);
                if (DialogsActivity.this.animatingForward) {
                    if (this.startedTrackingX >= DialogsActivity.this.viewPages[0].getMeasuredWidth() + DialogsActivity.this.viewPages[0].getTranslationX()) {
                        ViewPage viewPage = DialogsActivity.this.viewPages[0];
                        DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                        DialogsActivity.this.viewPages[1] = viewPage;
                        DialogsActivity.this.animatingForward = false;
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        dialogsActivity.additionalOffset = dialogsActivity.viewPages[0].getTranslationX();
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, DialogsActivity.this.additionalOffset / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        DialogsActivity.this.switchToCurrentSelectedMode(true);
                        DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                        DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                    } else {
                        DialogsActivity dialogsActivity2 = DialogsActivity.this;
                        dialogsActivity2.additionalOffset = dialogsActivity2.viewPages[0].getTranslationX();
                    }
                } else if (this.startedTrackingX < DialogsActivity.this.viewPages[1].getMeasuredWidth() + DialogsActivity.this.viewPages[1].getTranslationX()) {
                    ViewPage viewPage2 = DialogsActivity.this.viewPages[0];
                    DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                    DialogsActivity.this.viewPages[1] = viewPage2;
                    DialogsActivity.this.animatingForward = true;
                    DialogsActivity dialogsActivity3 = DialogsActivity.this;
                    dialogsActivity3.additionalOffset = dialogsActivity3.viewPages[0].getTranslationX();
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, (-DialogsActivity.this.additionalOffset) / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                    DialogsActivity.this.switchToCurrentSelectedMode(true);
                    DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                    DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                } else {
                    DialogsActivity dialogsActivity4 = DialogsActivity.this;
                    dialogsActivity4.additionalOffset = dialogsActivity4.viewPages[0].getTranslationX();
                }
                DialogsActivity.this.tabsAnimation.removeAllListeners();
                DialogsActivity.this.tabsAnimation.cancel();
                DialogsActivity.this.tabsAnimationInProgress = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                DialogsActivity.this.additionalOffset = 0.0f;
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && !DialogsActivity.this.startedTracking && !DialogsActivity.this.maybeStartTracking && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                DialogsActivity.this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                this.velocityTracker.clear();
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                int x = (int) ((motionEvent.getX() - this.startedTrackingX) + DialogsActivity.this.additionalOffset);
                int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                if (DialogsActivity.this.startedTracking && ((DialogsActivity.this.animatingForward && x > 0) || (!DialogsActivity.this.animatingForward && x < 0))) {
                    if (!prepareForMoving(motionEvent, x < 0)) {
                        DialogsActivity.this.maybeStartTracking = true;
                        DialogsActivity.this.startedTracking = false;
                        DialogsActivity.this.viewPages[0].setTranslationX(0.0f);
                        DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.animatingForward ? DialogsActivity.this.viewPages[0].getMeasuredWidth() : -DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, 0.0f);
                    }
                }
                if (!DialogsActivity.this.maybeStartTracking || DialogsActivity.this.startedTracking) {
                    if (DialogsActivity.this.startedTracking) {
                        DialogsActivity.this.viewPages[0].setTranslationX(x);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() + x);
                        } else {
                            DialogsActivity.this.viewPages[1].setTranslationX(x - DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / DialogsActivity.this.viewPages[0].getMeasuredWidth();
                        if (!DialogsActivity.this.viewPages[1].isLocked || abs2 <= 0.3f) {
                            DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, abs2);
                        } else {
                            dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            DialogsActivity.this.filterTabsView.shakeLock(DialogsActivity.this.viewPages[1].selectedType);
                            AndroidUtilities.runOnUIThread(new DialogsActivity$ContentView$$ExternalSyntheticLambda0(this), 200L);
                            return false;
                        }
                    }
                } else {
                    float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                    int x2 = (int) (motionEvent.getX() - this.startedTrackingX);
                    if (Math.abs(x2) >= pixelsInCM && Math.abs(x2) > abs) {
                        if (x < 0) {
                            z = true;
                        }
                        prepareForMoving(motionEvent, z);
                    }
                }
            } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                this.velocityTracker.computeCurrentVelocity(1000, DialogsActivity.this.maximumVelocity);
                if (motionEvent == null || motionEvent.getAction() == 3) {
                    f2 = 0.0f;
                    f = 0.0f;
                } else {
                    f2 = this.velocityTracker.getXVelocity();
                    f = this.velocityTracker.getYVelocity();
                    if (!DialogsActivity.this.startedTracking && Math.abs(f2) >= 3000.0f && Math.abs(f2) > Math.abs(f)) {
                        prepareForMoving(motionEvent, f2 < 0.0f);
                    }
                }
                if (DialogsActivity.this.startedTracking) {
                    float x3 = DialogsActivity.this.viewPages[0].getX();
                    DialogsActivity.this.tabsAnimation = new AnimatorSet();
                    if (DialogsActivity.this.viewPages[1].isLocked) {
                        DialogsActivity.this.backAnimation = true;
                    } else if (DialogsActivity.this.additionalOffset != 0.0f) {
                        if (Math.abs(f2) <= 1500.0f) {
                            if (DialogsActivity.this.animatingForward) {
                                DialogsActivity dialogsActivity5 = DialogsActivity.this;
                                dialogsActivity5.backAnimation = dialogsActivity5.viewPages[1].getX() > ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                            } else {
                                DialogsActivity dialogsActivity6 = DialogsActivity.this;
                                dialogsActivity6.backAnimation = dialogsActivity6.viewPages[0].getX() < ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                            }
                        } else {
                            DialogsActivity dialogsActivity7 = DialogsActivity.this;
                            dialogsActivity7.backAnimation = !dialogsActivity7.animatingForward ? f2 < 0.0f : f2 > 0.0f;
                        }
                    } else {
                        DialogsActivity.this.backAnimation = Math.abs(x3) < ((float) DialogsActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f2) < 3500.0f || Math.abs(f2) < Math.abs(f));
                    }
                    if (!DialogsActivity.this.backAnimation) {
                        f3 = DialogsActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, -DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                        } else {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                        }
                    } else {
                        f3 = Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        } else {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, -DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        }
                    }
                    DialogsActivity.this.tabsAnimation.setInterpolator(DialogsActivity.interpolator);
                    int measuredWidth = getMeasuredWidth();
                    float f4 = measuredWidth / 2;
                    float distanceInfluenceForSnapDuration = f4 + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (f3 * 1.0f) / measuredWidth)) * f4);
                    float abs3 = Math.abs(f2);
                    if (abs3 > 0.0f) {
                        i = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs3) * 1000.0f) * 4;
                    } else {
                        i = (int) (((f3 / getMeasuredWidth()) + 1.0f) * 100.0f);
                    }
                    DialogsActivity.this.tabsAnimation.setDuration(Math.max(150, Math.min(i, 600)));
                    DialogsActivity.this.tabsAnimation.addListener(new AnonymousClass1());
                    DialogsActivity.this.tabsAnimation.start();
                    DialogsActivity.this.tabsAnimationInProgress = true;
                    DialogsActivity.this.startedTracking = false;
                } else {
                    ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(DialogsActivity.this.viewPages[0].selectedType == DialogsActivity.this.filterTabsView.getFirstTabId() || DialogsActivity.this.searchIsShowed || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5);
                    DialogsActivity.this.maybeStartTracking = false;
                    ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(true);
                    DialogsActivity.this.filterTabsView.setEnabled(true);
                }
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.velocityTracker = null;
                }
            }
            return DialogsActivity.this.startedTracking;
        }

        public /* synthetic */ void lambda$onTouchEvent$0() {
            DialogsActivity.this.showDialog(new LimitReachedBottomSheet(DialogsActivity.this, getContext(), 3, ((BaseFragment) DialogsActivity.this).currentAccount));
        }

        /* renamed from: org.telegram.ui.DialogsActivity$ContentView$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
                ContentView.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DialogsActivity.this.tabsAnimation = null;
                if (!DialogsActivity.this.backAnimation) {
                    ViewPage viewPage = DialogsActivity.this.viewPages[0];
                    DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                    DialogsActivity.this.viewPages[1] = viewPage;
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                    DialogsActivity.this.updateCounters(false);
                    DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                    DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                }
                if (((BaseFragment) DialogsActivity.this).parentLayout != null) {
                    ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(DialogsActivity.this.viewPages[0].selectedType == DialogsActivity.this.filterTabsView.getFirstTabId() || DialogsActivity.this.searchIsShowed || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5);
                }
                DialogsActivity.this.viewPages[1].setVisibility(8);
                DialogsActivity.this.showScrollbars(true);
                DialogsActivity.this.tabsAnimationInProgress = false;
                DialogsActivity.this.maybeStartTracking = false;
                ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(true);
                DialogsActivity.this.filterTabsView.setEnabled(true);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.checkListLoad(dialogsActivity.viewPages[0]);
            }
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
        public void drawList(Canvas canvas, boolean z) {
            if (DialogsActivity.this.searchIsShowed) {
                if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0) {
                    return;
                }
                DialogsActivity.this.searchViewPager.drawForBlur(canvas);
                return;
            }
            for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                if (DialogsActivity.this.viewPages[i] != null && DialogsActivity.this.viewPages[i].getVisibility() == 0) {
                    for (int i2 = 0; i2 < DialogsActivity.this.viewPages[i].listView.getChildCount(); i2++) {
                        View childAt = DialogsActivity.this.viewPages[i].listView.getChildAt(i2);
                        if (childAt.getY() < DialogsActivity.this.viewPages[i].listView.blurTopPadding + AndroidUtilities.dp(100.0f)) {
                            int save = canvas.save();
                            canvas.translate(DialogsActivity.this.viewPages[i].getX(), DialogsActivity.this.viewPages[i].getY() + DialogsActivity.this.viewPages[i].listView.getY() + childAt.getY());
                            if (childAt instanceof DialogCell) {
                                DialogCell dialogCell = (DialogCell) childAt;
                                dialogCell.drawingForBlur = true;
                                dialogCell.draw(canvas);
                                dialogCell.drawingForBlur = false;
                            } else {
                                childAt.draw(canvas);
                            }
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DialogsRecyclerView extends BlurredRecyclerView {
        private int appliedPaddingTop;
        private boolean ignoreLayout;
        private int lastListPadding;
        private final ViewPage parentPage;
        private boolean firstLayout = true;
        Paint paint = new Paint();
        RectF rectF = new RectF();

        @Override // org.telegram.ui.Components.RecyclerListView
        protected boolean updateEmptyViewAnimated() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogsRecyclerView(Context context, ViewPage viewPage) {
            super(context);
            DialogsActivity.this = r1;
            this.parentPage = viewPage;
            this.additionalClipBottom = AndroidUtilities.dp(200.0f);
        }

        public void setViewsOffset(float f) {
            View findViewByPosition;
            DialogsActivity.viewOffset = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setTranslationY(f);
            }
            if (this.selectorPosition != -1 && (findViewByPosition = getLayoutManager().findViewByPosition(this.selectorPosition)) != null) {
                this.selectorRect.set(findViewByPosition.getLeft(), (int) (findViewByPosition.getTop() + f), findViewByPosition.getRight(), (int) (findViewByPosition.getBottom() + f));
                this.selectorDrawable.setBounds(this.selectorRect);
            }
            invalidate();
        }

        public float getViewOffset() {
            return DialogsActivity.viewOffset;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            view.setTranslationY(DialogsActivity.viewOffset);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override // android.view.ViewGroup, android.view.ViewManager
        public void removeView(View view) {
            super.removeView(view);
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public void onDraw(Canvas canvas) {
            if (this.parentPage.pullForegroundDrawable != null && DialogsActivity.viewOffset != 0.0f) {
                int paddingTop = getPaddingTop();
                if (paddingTop != 0) {
                    canvas.save();
                    canvas.translate(0.0f, paddingTop);
                }
                this.parentPage.pullForegroundDrawable.drawOverScroll(canvas);
                if (paddingTop != 0) {
                    canvas.restore();
                }
            }
            super.onDraw(canvas);
        }

        @Override // org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (drawMovingViewsOverlayed()) {
                this.paint.setColor(Theme.getColor("windowBackgroundWhite"));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (((childAt instanceof DialogCell) && ((DialogCell) childAt).isMoving()) || ((childAt instanceof DialogsAdapter.LastEmptyView) && ((DialogsAdapter.LastEmptyView) childAt).moving)) {
                        if (childAt.getAlpha() != 1.0f) {
                            this.rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas.saveLayerAlpha(this.rectF, (int) (childAt.getAlpha() * 255.0f), 31);
                        } else {
                            canvas.save();
                        }
                        canvas.translate(childAt.getX(), childAt.getY());
                        canvas.drawRect(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.paint);
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
                invalidate();
            }
            if (DialogsActivity.this.slidingView == null || DialogsActivity.this.pacmanAnimation == null) {
                return;
            }
            DialogsActivity.this.pacmanAnimation.draw(canvas, DialogsActivity.this.slidingView.getTop() + (DialogsActivity.this.slidingView.getMeasuredHeight() / 2));
        }

        private boolean drawMovingViewsOverlayed() {
            return (getItemAnimator() == null || !getItemAnimator().isRunning() || (DialogsActivity.this.dialogRemoveFinished == 0 && DialogsActivity.this.dialogInsertFinished == 0 && DialogsActivity.this.dialogChangeFinished == 0)) ? false : true;
        }

        @Override // org.telegram.ui.Components.BlurredRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (!drawMovingViewsOverlayed() || !(view instanceof DialogCell) || !((DialogCell) view).isMoving()) {
                return super.drawChild(canvas, view, j);
            }
            return true;
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView
        public void setAdapter(RecyclerView.Adapter adapter) {
            super.setAdapter(adapter);
            this.firstLayout = true;
        }

        private void checkIfAdapterValid() {
            RecyclerView.Adapter adapter = getAdapter();
            if (this.parentPage.lastItemsCount == adapter.getItemCount() || DialogsActivity.this.dialogsListFrozen) {
                return;
            }
            this.ignoreLayout = true;
            adapter.notifyDataSetChanged();
            this.ignoreLayout = false;
        }

        @Override // org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            if (DialogsActivity.this.onlySelect) {
                i3 = 0;
            } else if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                i3 = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
            } else {
                i3 = AndroidUtilities.dp(44.0f);
            }
            int findFirstVisibleItemPosition = this.parentPage.layoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition != -1 && !DialogsActivity.this.dialogsListFrozen && this.parentPage.itemTouchhelper.isIdle() && (findViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null) {
                int top = findViewHolderForAdapterPosition.itemView.getTop();
                this.ignoreLayout = true;
                this.parentPage.layoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, (int) ((top - this.lastListPadding) + DialogsActivity.this.scrollAdditionalOffset));
                this.ignoreLayout = false;
            }
            if (!DialogsActivity.this.onlySelect) {
                this.ignoreLayout = true;
                if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                    i3 = (!((BaseFragment) DialogsActivity.this).inPreviewMode || Build.VERSION.SDK_INT < 21) ? 0 : AndroidUtilities.statusBarHeight;
                } else {
                    i3 = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                }
                setTopGlowOffset(i3);
                setPadding(0, i3, 0, 0);
                this.parentPage.progressView.setPaddingTop(i3);
                this.ignoreLayout = false;
            }
            if (this.firstLayout && DialogsActivity.this.getMessagesController().dialogsLoaded) {
                if (this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive()) {
                    this.ignoreLayout = true;
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(1, (int) ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                    this.ignoreLayout = false;
                }
                this.firstLayout = false;
            }
            checkIfAdapterValid();
            super.onMeasure(i, i2);
            if (DialogsActivity.this.onlySelect || this.appliedPaddingTop == i3 || DialogsActivity.this.viewPages == null || DialogsActivity.this.viewPages.length <= 1) {
                return;
            }
            DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth());
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.lastListPadding = getPaddingTop();
            DialogsActivity.this.scrollAdditionalOffset = 0.0f;
            if (!(DialogsActivity.this.dialogRemoveFinished == 0 && DialogsActivity.this.dialogInsertFinished == 0 && DialogsActivity.this.dialogChangeFinished == 0) && !this.parentPage.dialogsItemAnimator.isRunning()) {
                DialogsActivity.this.onDialogAnimationFinished();
            }
        }

        @Override // org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public void toggleArchiveHidden(boolean z, DialogCell dialogCell) {
            SharedConfig.toggleArchiveHidden();
            if (SharedConfig.archiveHidden) {
                if (dialogCell != null) {
                    DialogsActivity.this.disableActionBarScrolling = true;
                    DialogsActivity.this.waitingForScrollFinished = true;
                    smoothScrollBy(0, dialogCell.getMeasuredHeight() + (dialogCell.getTop() - getPaddingTop()), CubicBezierInterpolator.EASE_OUT);
                    if (z) {
                        DialogsActivity.this.updatePullAfterScroll = true;
                    } else {
                        updatePullState();
                    }
                }
                DialogsActivity.this.getUndoView().showWithAction(0L, 6, null, null);
                return;
            }
            DialogsActivity.this.getUndoView().showWithAction(0L, 7, null, null);
            updatePullState();
            if (!z || dialogCell == null) {
                return;
            }
            dialogCell.resetPinnedArchiveState();
            dialogCell.invalidate();
        }

        public void updatePullState() {
            boolean z = false;
            this.parentPage.archivePullViewState = SharedConfig.archiveHidden ? 2 : 0;
            if (this.parentPage.pullForegroundDrawable != null) {
                PullForegroundDrawable pullForegroundDrawable = this.parentPage.pullForegroundDrawable;
                if (this.parentPage.archivePullViewState != 0) {
                    z = true;
                }
                pullForegroundDrawable.setWillDraw(z);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            LinearLayoutManager linearLayoutManager;
            int findFirstVisibleItemPosition;
            if (!this.fastScrollAnimationRunning && !DialogsActivity.this.waitingForScrollFinished && DialogsActivity.this.dialogRemoveFinished == 0 && DialogsActivity.this.dialogInsertFinished == 0 && DialogsActivity.this.dialogChangeFinished == 0) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if ((action == 1 || action == 3) && !this.parentPage.itemTouchhelper.isIdle() && this.parentPage.swipeController.swipingFolder) {
                    this.parentPage.swipeController.swipeFolderBack = true;
                    if (this.parentPage.itemTouchhelper.checkHorizontalSwipe(null, 4) != 0 && this.parentPage.swipeController.currentItemViewHolder != null) {
                        View view = this.parentPage.swipeController.currentItemViewHolder.itemView;
                        if (view instanceof DialogCell) {
                            DialogCell dialogCell = (DialogCell) view;
                            long dialogId = dialogCell.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                toggleArchiveHidden(false, dialogCell);
                            } else {
                                DialogsActivity dialogsActivity = DialogsActivity.this;
                                TLRPC$Dialog tLRPC$Dialog = dialogsActivity.getDialogsArray(((BaseFragment) dialogsActivity).currentAccount, this.parentPage.dialogsType, DialogsActivity.this.folderId, false).get(dialogCell.getDialogIndex());
                                if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 1) {
                                    if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 3) {
                                        if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 0) {
                                            if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 4) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                DialogsActivity.this.performSelectedDialogsAction(arrayList, 102, true);
                                            }
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            DialogsActivity.this.canPinCount = !DialogsActivity.this.isDialogPinned(tLRPC$Dialog) ? 1 : 0;
                                            DialogsActivity.this.performSelectedDialogsAction(arrayList2, 100, true);
                                        }
                                    } else if (!DialogsActivity.this.getMessagesController().isDialogMuted(dialogId)) {
                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 3);
                                        if (BulletinFactory.canShowBulletin(DialogsActivity.this)) {
                                            BulletinFactory.createMuteBulletin(DialogsActivity.this, 3).show();
                                        }
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(Long.valueOf(dialogId));
                                        DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                        dialogsActivity2.canMuteCount = !MessagesController.getInstance(((BaseFragment) dialogsActivity2).currentAccount).isDialogMuted(dialogId);
                                        DialogsActivity dialogsActivity3 = DialogsActivity.this;
                                        dialogsActivity3.canUnmuteCount = dialogsActivity3.canMuteCount > 0 ? 0 : 1;
                                        DialogsActivity.this.performSelectedDialogsAction(arrayList3, 104, true);
                                    }
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(Long.valueOf(dialogId));
                                    DialogsActivity.this.canReadCount = (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark) ? 1 : 0;
                                    DialogsActivity.this.performSelectedDialogsAction(arrayList4, 101, true);
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (this.parentPage.dialogsType == 0 && ((action == 1 || action == 3) && this.parentPage.archivePullViewState == 2 && DialogsActivity.this.hasHiddenArchive() && (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition()) == 0)) {
                    int paddingTop = getPaddingTop();
                    View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                    int top = (findViewByPosition.getTop() - paddingTop) + findViewByPosition.getMeasuredHeight();
                    long currentTimeMillis = System.currentTimeMillis() - DialogsActivity.this.startArchivePullingTime;
                    if (top < dp || currentTimeMillis < 200) {
                        DialogsActivity.this.disableActionBarScrolling = true;
                        smoothScrollBy(0, top, CubicBezierInterpolator.EASE_OUT_QUINT);
                        this.parentPage.archivePullViewState = 2;
                    } else if (this.parentPage.archivePullViewState != 1) {
                        if (getViewOffset() == 0.0f) {
                            DialogsActivity.this.disableActionBarScrolling = true;
                            smoothScrollBy(0, findViewByPosition.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                        if (!DialogsActivity.this.canShowHiddenArchive) {
                            DialogsActivity.this.canShowHiddenArchive = true;
                            performHapticFeedback(3, 2);
                            if (this.parentPage.pullForegroundDrawable != null) {
                                this.parentPage.pullForegroundDrawable.colorize(true);
                            }
                        }
                        ((DialogCell) findViewByPosition).startOutAnimation();
                        this.parentPage.archivePullViewState = 1;
                    }
                    if (getViewOffset() != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(getViewOffset(), 0.0f);
                        ofFloat.addUpdateListener(new DialogsActivity$DialogsRecyclerView$$ExternalSyntheticLambda0(this));
                        ofFloat.setDuration(Math.max(100L, 350.0f - ((getViewOffset() / PullForegroundDrawable.getMaxOverscroll()) * 120.0f)));
                        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        setScrollEnabled(false);
                        ofFloat.addListener(new AnonymousClass1());
                        ofFloat.start();
                    }
                }
                return onTouchEvent;
            }
            return false;
        }

        public /* synthetic */ void lambda$onTouchEvent$0(ValueAnimator valueAnimator) {
            setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        /* renamed from: org.telegram.ui.DialogsActivity$DialogsRecyclerView$1 */
        /* loaded from: classes3.dex */
        class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
                DialogsRecyclerView.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DialogsRecyclerView.this.setScrollEnabled(true);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.fastScrollAnimationRunning && !DialogsActivity.this.waitingForScrollFinished && DialogsActivity.this.dialogRemoveFinished == 0 && DialogsActivity.this.dialogInsertFinished == 0 && DialogsActivity.this.dialogChangeFinished == 0) {
                if (motionEvent.getAction() == 0) {
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivity.allowSwipeDuringCurrentTouch = !((BaseFragment) dialogsActivity).actionBar.isActionModeShowed();
                    checkIfAdapterValid();
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }

        @Override // org.telegram.ui.Components.RecyclerListView
        public boolean allowSelectChildAtPosition(View view) {
            return !(view instanceof HeaderCell) || view.isClickable();
        }
    }

    /* loaded from: classes3.dex */
    public class SwipeController extends ItemTouchHelper.Callback {
        private RecyclerView.ViewHolder currentItemViewHolder;
        private ViewPage parentPage;
        private boolean swipeFolderBack;
        private boolean swipingFolder;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public float getSwipeEscapeVelocity(float f) {
            return 3500.0f;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.45f;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public float getSwipeVelocityThreshold(float f) {
            return Float.MAX_VALUE;
        }

        public SwipeController(ViewPage viewPage) {
            DialogsActivity.this = r1;
            this.parentPage = viewPage;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            TLRPC$Dialog tLRPC$Dialog;
            if (!DialogsActivity.this.waitingForDialogsAnimationEnd(this.parentPage) && (((BaseFragment) DialogsActivity.this).parentLayout == null || !((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode())) {
                if (!this.swipingFolder || !this.swipeFolderBack) {
                    if (!DialogsActivity.this.onlySelect && this.parentPage.isDefaultDialogType() && DialogsActivity.this.slidingView == null) {
                        View view = viewHolder.itemView;
                        if (view instanceof DialogCell) {
                            DialogCell dialogCell = (DialogCell) view;
                            long dialogId = dialogCell.getDialogId();
                            MessagesController.DialogFilter dialogFilter = null;
                            if (!((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed(null)) {
                                if ((DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5) && DialogsActivity.this.allowSwipeDuringCurrentTouch && (((dialogId != DialogsActivity.this.getUserConfig().clientUserId && dialogId != 777000) || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 2) && (!DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) || DialogsActivity.this.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA))) {
                                    boolean z = DialogsActivity.this.folderId == 0 && (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 3 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 4);
                                    if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1) {
                                        if (DialogsActivity.this.viewPages[0].dialogsType == 7 || DialogsActivity.this.viewPages[0].dialogsType == 8) {
                                            dialogFilter = DialogsActivity.this.getMessagesController().selectedDialogFilter[DialogsActivity.this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                                        }
                                        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId)) != null && !dialogFilter.alwaysShow(((BaseFragment) DialogsActivity.this).currentAccount, tLRPC$Dialog) && (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark)) {
                                            z = false;
                                        }
                                    }
                                    this.swipeFolderBack = false;
                                    this.swipingFolder = (z && !DialogObject.isFolderDialogId(dialogCell.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(dialogCell.getDialogId()));
                                    dialogCell.setSliding(true);
                                    return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                                }
                            } else {
                                TLRPC$Dialog tLRPC$Dialog2 = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
                                if (!DialogsActivity.this.allowMoving || tLRPC$Dialog2 == null || !DialogsActivity.this.isDialogPinned(tLRPC$Dialog2) || DialogObject.isFolderDialogId(dialogId)) {
                                    return 0;
                                }
                                DialogsActivity.this.movingView = (DialogCell) viewHolder.itemView;
                                DialogsActivity.this.movingView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                                this.swipeFolderBack = false;
                                return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                            }
                        }
                    }
                } else {
                    View view2 = viewHolder.itemView;
                    if (view2 instanceof DialogCell) {
                        ((DialogCell) view2).swipeCanceled = true;
                    }
                    this.swipingFolder = false;
                    return 0;
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            long dialogId;
            TLRPC$Dialog tLRPC$Dialog;
            View view = viewHolder2.itemView;
            char c = 0;
            if ((view instanceof DialogCell) && (tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get((dialogId = ((DialogCell) view).getDialogId()))) != null && DialogsActivity.this.isDialogPinned(tLRPC$Dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                this.parentPage.dialogsAdapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                DialogsActivity.this.updateDialogIndices();
                if (DialogsActivity.this.viewPages[0].dialogsType != 7 && DialogsActivity.this.viewPages[0].dialogsType != 8) {
                    DialogsActivity.this.movingWas = true;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = DialogsActivity.this.getMessagesController().selectedDialogFilter;
                    if (DialogsActivity.this.viewPages[0].dialogsType == 8) {
                        c = 1;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c];
                    if (!DialogsActivity.this.movingDialogFilters.contains(dialogFilter)) {
                        DialogsActivity.this.movingDialogFilters.add(dialogFilter);
                    }
                }
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int convertToAbsoluteDirection(int i, int i2) {
            if (this.swipeFolderBack) {
                return 0;
            }
            return super.convertToAbsoluteDirection(i, i2);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder == null) {
                DialogsActivity.this.slidingView = null;
                return;
            }
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            long dialogId = dialogCell.getDialogId();
            int i2 = 0;
            if (DialogObject.isFolderDialogId(dialogId)) {
                this.parentPage.listView.toggleArchiveHidden(false, dialogCell);
                return;
            }
            TLRPC$Dialog tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
            if (tLRPC$Dialog == null) {
                return;
            }
            if (DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) || DialogsActivity.this.folderId != 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 1) {
                DialogsActivity.this.slidingView = dialogCell;
                DialogsActivity$SwipeController$$ExternalSyntheticLambda2 dialogsActivity$SwipeController$$ExternalSyntheticLambda2 = new DialogsActivity$SwipeController$$ExternalSyntheticLambda2(this, tLRPC$Dialog, this.parentPage.dialogsAdapter.getItemCount(), viewHolder.getAdapterPosition());
                DialogsActivity.this.setDialogsListFrozen(true);
                if (Utilities.random.nextInt(1000) == 1) {
                    if (DialogsActivity.this.pacmanAnimation == null) {
                        DialogsActivity.this.pacmanAnimation = new PacmanAnimation(this.parentPage.listView);
                    }
                    DialogsActivity.this.pacmanAnimation.setFinishRunnable(dialogsActivity$SwipeController$$ExternalSyntheticLambda2);
                    DialogsActivity.this.pacmanAnimation.start();
                    return;
                }
                dialogsActivity$SwipeController$$ExternalSyntheticLambda2.run();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(dialogId));
            DialogsActivity dialogsActivity = DialogsActivity.this;
            if (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark) {
                i2 = 1;
            }
            dialogsActivity.canReadCount = i2;
            DialogsActivity.this.performSelectedDialogsAction(arrayList, 101, true);
        }

        public /* synthetic */ void lambda$onSwiped$1(TLRPC$Dialog tLRPC$Dialog, int i, int i2) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            if (DialogsActivity.this.frozenDialogsList == null) {
                return;
            }
            DialogsActivity.this.frozenDialogsList.remove(tLRPC$Dialog);
            int i3 = tLRPC$Dialog.pinnedNum;
            DialogsActivity.this.slidingView = null;
            this.parentPage.listView.invalidate();
            int findLastVisibleItemPosition = this.parentPage.layoutManager.findLastVisibleItemPosition();
            if (findLastVisibleItemPosition == i - 1) {
                this.parentPage.layoutManager.findViewByPosition(findLastVisibleItemPosition).requestLayout();
            }
            boolean z = false;
            if (!DialogsActivity.this.getMessagesController().isPromoDialog(tLRPC$Dialog.id, false)) {
                int addDialogToFolder = DialogsActivity.this.getMessagesController().addDialogToFolder(tLRPC$Dialog.id, DialogsActivity.this.folderId == 0 ? 1 : 0, -1, 0L);
                if (addDialogToFolder != 2 || i2 != 0) {
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    ViewPage.access$11210(this.parentPage);
                    this.parentPage.dialogsAdapter.notifyItemRemoved(i2);
                    DialogsActivity.this.dialogRemoveFinished = 2;
                }
                if (DialogsActivity.this.folderId == 0) {
                    if (addDialogToFolder == 2) {
                        this.parentPage.dialogsItemAnimator.prepareForRemove();
                        if (i2 == 0) {
                            DialogsActivity.this.dialogChangeFinished = 2;
                            DialogsActivity.this.setDialogsListFrozen(true);
                            this.parentPage.dialogsAdapter.notifyItemChanged(0);
                        } else {
                            ViewPage.access$11208(this.parentPage);
                            this.parentPage.dialogsAdapter.notifyItemInserted(0);
                            if (!SharedConfig.archiveHidden && this.parentPage.layoutManager.findFirstVisibleItemPosition() == 0) {
                                DialogsActivity.this.disableActionBarScrolling = true;
                                this.parentPage.listView.smoothScrollBy(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f));
                            }
                        }
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        DialogsActivity.this.frozenDialogsList.add(0, dialogsActivity.getDialogsArray(((BaseFragment) dialogsActivity).currentAccount, this.parentPage.dialogsType, DialogsActivity.this.folderId, false).get(0));
                    } else if (addDialogToFolder == 1 && (findViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(0)) != null) {
                        View view = findViewHolderForAdapterPosition.itemView;
                        if (view instanceof DialogCell) {
                            DialogCell dialogCell = (DialogCell) view;
                            dialogCell.checkCurrentDialogIndex(true);
                            dialogCell.animateArchiveAvatar();
                        }
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) {
                        z = true;
                    }
                    if (!z) {
                        globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                    }
                    DialogsActivity.this.getUndoView().showWithAction(tLRPC$Dialog.id, z ? 2 : 3, null, new DialogsActivity$SwipeController$$ExternalSyntheticLambda1(this, tLRPC$Dialog, i3));
                }
                if (DialogsActivity.this.folderId == 0 || !DialogsActivity.this.frozenDialogsList.isEmpty()) {
                    return;
                }
                this.parentPage.listView.setEmptyView(null);
                this.parentPage.progressView.setVisibility(4);
                return;
            }
            DialogsActivity.this.getMessagesController().hidePromoDialog();
            this.parentPage.dialogsItemAnimator.prepareForRemove();
            ViewPage.access$11210(this.parentPage);
            this.parentPage.dialogsAdapter.notifyItemRemoved(i2);
            DialogsActivity.this.dialogRemoveFinished = 2;
        }

        public /* synthetic */ void lambda$onSwiped$0(TLRPC$Dialog tLRPC$Dialog, int i) {
            DialogsActivity.this.dialogsListFrozen = true;
            DialogsActivity.this.getMessagesController().addDialogToFolder(tLRPC$Dialog.id, 0, i, 0L);
            DialogsActivity.this.dialogsListFrozen = false;
            ArrayList<TLRPC$Dialog> dialogs = DialogsActivity.this.getMessagesController().getDialogs(0);
            int indexOf = dialogs.indexOf(tLRPC$Dialog);
            if (indexOf < 0) {
                this.parentPage.dialogsAdapter.notifyDataSetChanged();
                return;
            }
            ArrayList<TLRPC$Dialog> dialogs2 = DialogsActivity.this.getMessagesController().getDialogs(1);
            if (!dialogs2.isEmpty() || indexOf != 1) {
                DialogsActivity.this.dialogInsertFinished = 2;
                DialogsActivity.this.setDialogsListFrozen(true);
                this.parentPage.dialogsItemAnimator.prepareForRemove();
                ViewPage.access$11208(this.parentPage);
                this.parentPage.dialogsAdapter.notifyItemInserted(indexOf);
            }
            if (!dialogs2.isEmpty()) {
                return;
            }
            dialogs.remove(0);
            if (indexOf == 1) {
                DialogsActivity.this.dialogChangeFinished = 2;
                DialogsActivity.this.setDialogsListFrozen(true);
                this.parentPage.dialogsAdapter.notifyItemChanged(0);
                return;
            }
            DialogsActivity.this.frozenDialogsList.remove(0);
            this.parentPage.dialogsItemAnimator.prepareForRemove();
            ViewPage.access$11210(this.parentPage);
            this.parentPage.dialogsAdapter.notifyItemRemoved(0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                this.parentPage.listView.hideSelector(false);
            }
            this.currentItemViewHolder = viewHolder;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof DialogCell) {
                    ((DialogCell) view).swipeCanceled = false;
                }
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            if (i == 4) {
                return 200L;
            }
            if (i == 8 && DialogsActivity.this.movingView != null) {
                AndroidUtilities.runOnUIThread(new DialogsActivity$SwipeController$$ExternalSyntheticLambda0(DialogsActivity.this.movingView), this.parentPage.dialogsItemAnimator.getMoveDuration());
                DialogsActivity.this.movingView = null;
            }
            return super.getAnimationDuration(recyclerView, i, f, f2);
        }
    }

    public DialogsActivity(Bundle bundle) {
        super(bundle);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (getArguments() != null) {
            this.onlySelect = this.arguments.getBoolean("onlySelect", false);
            this.cantSendToChannels = this.arguments.getBoolean("cantSendToChannels", false);
            this.initialDialogsType = this.arguments.getInt("dialogsType", 0);
            this.selectAlertString = this.arguments.getString("selectAlertString");
            this.selectAlertStringGroup = this.arguments.getString("selectAlertStringGroup");
            this.addToGroupAlertString = this.arguments.getString("addToGroupAlertString");
            this.allowSwitchAccount = this.arguments.getBoolean("allowSwitchAccount");
            this.checkCanWrite = this.arguments.getBoolean("checkCanWrite", true);
            this.afterSignup = this.arguments.getBoolean("afterSignup", false);
            this.folderId = this.arguments.getInt("folderId", 0);
            this.resetDelegate = this.arguments.getBoolean("resetDelegate", true);
            this.messagesCount = this.arguments.getInt("messagesCount", 0);
            this.hasPoll = this.arguments.getInt("hasPoll", 0);
            this.hasInvoice = this.arguments.getBoolean("hasInvoice", false);
            this.showSetPasswordConfirm = this.arguments.getBoolean("showSetPasswordConfirm", this.showSetPasswordConfirm);
            this.arguments.getInt("otherwiseRelogin");
            this.allowGroups = this.arguments.getBoolean("allowGroups", true);
            this.allowChannels = this.arguments.getBoolean("allowChannels", true);
            this.allowUsers = this.arguments.getBoolean("allowUsers", true);
            this.allowBots = this.arguments.getBoolean("allowBots", true);
            this.closeFragment = this.arguments.getBoolean("closeFragment", true);
        }
        if (this.initialDialogsType == 0) {
            this.askAboutContacts = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        if (this.searchString == null) {
            this.currentConnectionState = getConnectionsManager().getConnectionState();
            getNotificationCenter().addObserver(this, NotificationCenter.dialogsNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (!this.onlySelect) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeSearchByActiveAction);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
                getNotificationCenter().addObserver(this, NotificationCenter.filterSettingsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogsUnreadCounterChanged);
            }
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.appDidLogout);
            getNotificationCenter().addObserver(this, NotificationCenter.openedChatChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.messageReceivedByAck);
            getNotificationCenter().addObserver(this, NotificationCenter.messageReceivedByServer);
            getNotificationCenter().addObserver(this, NotificationCenter.messageSendError);
            getNotificationCenter().addObserver(this, NotificationCenter.needReloadRecentDialogsSearch);
            getNotificationCenter().addObserver(this, NotificationCenter.replyMessagesDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
            getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
            getNotificationCenter().addObserver(this, NotificationCenter.onDownloadingFilesChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.needDeleteDialog);
            getNotificationCenter().addObserver(this, NotificationCenter.folderBecomeEmpty);
            getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogsUnreadReactionsCounterChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.forceImportContactsStart);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateAvailable);
        }
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.onDatabaseMigration);
        getNotificationCenter().addObserver(this, NotificationCenter.onDatabaseOpened);
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        loadDialogs(getAccountInstance());
        getMessagesController().loadPinnedDialogs(this.folderId, 0L, null);
        if (this.databaseMigrationHint != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            View view = this.databaseMigrationHint;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.databaseMigrationHint = null;
        }
        return true;
    }

    public static void loadDialogs(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        if (!dialogsLoaded[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().chekAllMedia(false);
            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda31(accountInstance), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            dialogsLoaded[currentAccount] = true;
        }
    }

    public static /* synthetic */ void lambda$loadDialogs$1(AccountInstance accountInstance) {
        accountInstance.getDownloadController().loadDownloadingFiles();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.searchString == null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.dialogsNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (!this.onlySelect) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeSearchByActiveAction);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
                getNotificationCenter().removeObserver(this, NotificationCenter.filterSettingsUpdated);
                getNotificationCenter().removeObserver(this, NotificationCenter.dialogFiltersUpdated);
                getNotificationCenter().removeObserver(this, NotificationCenter.dialogsUnreadCounterChanged);
            }
            getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.appDidLogout);
            getNotificationCenter().removeObserver(this, NotificationCenter.openedChatChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageReceivedByAck);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageReceivedByServer);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageSendError);
            getNotificationCenter().removeObserver(this, NotificationCenter.needReloadRecentDialogsSearch);
            getNotificationCenter().removeObserver(this, NotificationCenter.replyMessagesDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
            getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
            getNotificationCenter().removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteDialog);
            getNotificationCenter().removeObserver(this, NotificationCenter.folderBecomeEmpty);
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoaded);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadFailed);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadProgressChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.dialogsUnreadReactionsCounterChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.forceImportContactsStart);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateAvailable);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.onDatabaseMigration);
        getNotificationCenter().removeObserver(this, NotificationCenter.onDatabaseOpened);
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
        getNotificationCenter().onAnimationFinish(this.animationIndex);
        this.delegate = null;
        SuggestClearDatabaseBottomSheet.dismissDialog();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 extends ActionBar {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar, android.view.View
        public void setTranslationY(float f) {
            if (f != getTranslationY() && ((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            }
            super.setTranslationY(f);
        }

        @Override // org.telegram.ui.ActionBar.ActionBar
        public boolean shouldClipChild(View view) {
            return super.shouldClipChild(view) || view == DialogsActivity.this.doneItem;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar, android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (!((BaseFragment) DialogsActivity.this).inPreviewMode || DialogsActivity.this.avatarContainer == null || view == DialogsActivity.this.avatarContainer) {
                return super.drawChild(canvas, view, j);
            }
            return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ActionBar createActionBar(Context context) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        anonymousClass2.setItemsBackgroundColor(Theme.getColor("actionBarDefaultSelector"), false);
        anonymousClass2.setItemsBackgroundColor(Theme.getColor("actionBarActionModeDefaultSelector"), true);
        anonymousClass2.setItemsColor(Theme.getColor("actionBarDefaultIcon"), false);
        anonymousClass2.setItemsColor(Theme.getColor("actionBarActionModeDefaultIcon"), true);
        if (this.inPreviewMode || (AndroidUtilities.isTablet() && this.folderId != 0)) {
            anonymousClass2.setOccupyStatusBar(false);
        }
        return anonymousClass2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0ad9 A[LOOP:3: B:232:0x0ad6->B:234:0x0ad9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c6e  */
    /* JADX WARN: Type inference failed for: r0v186, types: [org.telegram.ui.DialogsActivity$DialogsRecyclerView, org.telegram.ui.Components.RecyclerListView] */
    /* JADX WARN: Type inference failed for: r0v230, types: [org.telegram.ui.ActionBar.ActionBar] */
    /* JADX WARN: Type inference failed for: r0v232, types: [org.telegram.ui.ActionBar.ActionBar] */
    /* JADX WARN: Type inference failed for: r0v64, types: [org.telegram.ui.ActionBar.ActionBar] */
    /* JADX WARN: Type inference failed for: r5v35, types: [android.graphics.drawable.BitmapDrawable] */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(Context context) {
        int i;
        boolean z;
        CombinedDrawable combinedDrawable;
        int i2;
        boolean z2;
        int i3;
        FilterTabsView filterTabsView;
        int i4;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        ?? r5;
        boolean z3 = false;
        this.searching = false;
        this.searchWas = false;
        this.pacmanAnimation = null;
        this.selectedDialogs.clear();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda30(context));
        ActionBarMenu createMenu = this.actionBar.createMenu();
        float f = 0.0f;
        int i5 = 8;
        boolean z4 = true;
        if (!this.onlySelect && this.searchString == null && this.folderId == 0) {
            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, Theme.getColor("actionBarDefaultSelector"), Theme.getColor("actionBarDefaultIcon"), true);
            this.doneItem = actionBarMenuItem;
            actionBarMenuItem.setText(LocaleController.getString("Done", 2131625541).toUpperCase());
            this.actionBar.addView(this.doneItem, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, 10.0f, 0.0f));
            this.doneItem.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda17(this));
            this.doneItem.setAlpha(0.0f);
            this.doneItem.setVisibility(8);
            ProxyDrawable proxyDrawable = new ProxyDrawable(context);
            this.proxyDrawable = proxyDrawable;
            ActionBarMenuItem addItem = createMenu.addItem(2, proxyDrawable);
            this.proxyItem = addItem;
            addItem.setContentDescription(LocaleController.getString("ProxySettings", 2131627814));
            RLottieDrawable rLottieDrawable = new RLottieDrawable(2131558499, "passcode_lock_close", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.passcodeDrawable = rLottieDrawable;
            ActionBarMenuItem addItem2 = createMenu.addItem(1, rLottieDrawable);
            this.passcodeItem = addItem2;
            addItem2.setContentDescription(LocaleController.getString("AccDescrPasscodeLock", 2131624034));
            ActionBarMenuItem addItem3 = createMenu.addItem(3, new ColorDrawable(0));
            this.downloadsItem = addItem3;
            addItem3.addView(new DownloadProgressIcon(this.currentAccount, context));
            this.downloadsItem.setContentDescription(LocaleController.getString("DownloadsTabs", 2131625551));
            this.downloadsItem.setVisibility(8);
            updatePasscodeButton();
            updateProxyButton(false, false);
        }
        ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, 2131165456).setIsSearchField(true, true).setActionBarMenuItemSearchListener(new AnonymousClass3());
        this.searchItem = actionBarMenuItemSearchListener;
        int i6 = this.initialDialogsType;
        if (i6 == 2 || i6 == 14) {
            actionBarMenuItemSearchListener.setVisibility(8);
        }
        this.searchItem.setSearchFieldHint(LocaleController.getString("Search", 2131628155));
        this.searchItem.setContentDescription(LocaleController.getString("Search", 2131628155));
        String str = "actionBarDefault";
        if (this.onlySelect) {
            this.actionBar.setBackButtonImage(2131165449);
            int i7 = this.initialDialogsType;
            if (i7 == 3 && this.selectAlertString == null) {
                this.actionBar.setTitle(LocaleController.getString("ForwardTo", 2131625992));
            } else if (i7 == 10) {
                this.actionBar.setTitle(LocaleController.getString("SelectChats", 2131628223));
            } else {
                this.actionBar.setTitle(LocaleController.getString("SelectChat", 2131628222));
            }
            this.actionBar.setBackgroundColor(Theme.getColor(str));
        } else {
            if (this.searchString != null || this.folderId != 0) {
                ?? r0 = this.actionBar;
                BackDrawable backDrawable = new BackDrawable(false);
                this.backDrawable = backDrawable;
                r0.setBackButtonDrawable(backDrawable);
            } else {
                ?? r02 = this.actionBar;
                MenuDrawable menuDrawable = new MenuDrawable();
                this.menuDrawable = menuDrawable;
                r02.setBackButtonDrawable(menuDrawable);
                this.menuDrawable.setRoundCap();
                this.actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrOpenMenu", 2131624030));
            }
            if (this.folderId != 0) {
                this.actionBar.setTitle(LocaleController.getString("ArchivedChats", 2131624417));
            } else if (BuildVars.DEBUG_VERSION) {
                this.actionBar.setTitle(LocaleController.getString("AppNameBeta", 2131624385));
            } else {
                this.actionBar.setTitle(LocaleController.getString("AppName", 2131624384));
            }
            if (this.folderId == 0) {
                this.actionBar.setSupportsHolidayImage(true);
            }
        }
        if (!this.onlySelect) {
            this.actionBar.setAddToContainer(false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setClipContent(true);
        }
        this.actionBar.setTitleActionRunnable(new DialogsActivity$$ExternalSyntheticLambda32(this));
        if (this.initialDialogsType == 0 && this.folderId == 0 && !this.onlySelect && TextUtils.isEmpty(this.searchString)) {
            this.scrimPaint = new AnonymousClass4();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
            this.filterTabsView = anonymousClass5;
            anonymousClass5.setVisibility(8);
            this.canShowFilterTabsView = false;
            this.filterTabsView.setDelegate(new AnonymousClass6(context));
        }
        int i8 = 17;
        if (this.allowSwitchAccount && UserConfig.getActivatedAccountsCount() > 1) {
            this.switchItem = createMenu.addItemWithWidth(1, 0, AndroidUtilities.dp(56.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
            this.switchItem.addView(backupImageView, LayoutHelper.createFrame(36, 36, 17));
            TLRPC$User currentUser = getUserConfig().getCurrentUser();
            avatarDrawable.setInfo(currentUser);
            backupImageView.getImageReceiver().setCurrentAccount(this.currentAccount);
            backupImageView.setImage(ImageLocation.getForUserOrChat(currentUser, 1), "50_50", ImageLocation.getForUserOrChat(currentUser, 2), "50_50", (currentUser == null || (tLRPC$UserProfilePhoto = currentUser.photo) == null || (r5 = tLRPC$UserProfilePhoto.strippedBitmap) == null) ? avatarDrawable : r5, currentUser);
            int i9 = 0;
            for (int i10 = 4; i9 < i10; i10 = 4) {
                if (AccountInstance.getInstance(i9).getUserConfig().getCurrentUser() != null) {
                    AccountSelectCell accountSelectCell = new AccountSelectCell(context, false);
                    accountSelectCell.setAccount(i9, true);
                    this.switchItem.addSubItem(i9 + 10, accountSelectCell, AndroidUtilities.dp(230.0f), AndroidUtilities.dp(48.0f));
                }
                i9++;
            }
        }
        this.actionBar.setAllowOverlayTitle(true);
        RecyclerView recyclerView = this.sideMenu;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(Theme.getColor("chats_menuBackground"));
            this.sideMenu.setGlowColor(Theme.getColor("chats_menuBackground"));
            this.sideMenu.getAdapter().notifyDataSetChanged();
        }
        createActionMode(null);
        ContentView contentView = new ContentView(context);
        this.fragmentView = contentView;
        int i11 = (this.folderId == 0 && this.initialDialogsType == 0 && !this.onlySelect) ? 2 : 1;
        this.viewPages = new ViewPage[i11];
        int i12 = 0;
        while (i12 < i11) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, contentView);
            contentView.addView(anonymousClass7, LayoutHelper.createFrame(-1, -1.0f));
            ((ViewPage) anonymousClass7).dialogsType = this.initialDialogsType;
            this.viewPages[i12] = anonymousClass7;
            ((ViewPage) anonymousClass7).progressView = new FlickerLoadingView(context);
            ((ViewPage) anonymousClass7).progressView.setViewType(7);
            ((ViewPage) anonymousClass7).progressView.setVisibility(i5);
            anonymousClass7.addView(((ViewPage) anonymousClass7).progressView, LayoutHelper.createFrame(-2, -2, i8));
            ((ViewPage) anonymousClass7).listView = new DialogsRecyclerView(context, anonymousClass7);
            ((ViewPage) anonymousClass7).listView.setAccessibilityEnabled(z3);
            DialogsRecyclerView dialogsRecyclerView = ((ViewPage) anonymousClass7).listView;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            dialogsRecyclerView.setAnimateEmptyView(z4, i13);
            ((ViewPage) anonymousClass7).listView.setClipToPadding(z3);
            ((ViewPage) anonymousClass7).listView.setPivotY(f);
            ((ViewPage) anonymousClass7).dialogsItemAnimator = new AnonymousClass8(((ViewPage) anonymousClass7).listView, anonymousClass7);
            ((ViewPage) anonymousClass7).listView.setItemAnimator(((ViewPage) anonymousClass7).dialogsItemAnimator);
            ((ViewPage) anonymousClass7).listView.setVerticalScrollBarEnabled(z4);
            ((ViewPage) anonymousClass7).listView.setInstantClick(z4);
            ((ViewPage) anonymousClass7).layoutManager = new AnonymousClass9(context, anonymousClass7);
            LinearLayoutManager linearLayoutManager = ((ViewPage) anonymousClass7).layoutManager;
            int i15 = z4 ? 1 : 0;
            int i16 = z4 ? 1 : 0;
            linearLayoutManager.setOrientation(i15);
            ((ViewPage) anonymousClass7).listView.setLayoutManager(((ViewPage) anonymousClass7).layoutManager);
            ((ViewPage) anonymousClass7).listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            anonymousClass7.addView(((ViewPage) anonymousClass7).listView, LayoutHelper.createFrame(-1, -1.0f));
            ((ViewPage) anonymousClass7).listView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda57(this, anonymousClass7));
            ((ViewPage) anonymousClass7).listView.setOnItemLongClickListener(new AnonymousClass11(anonymousClass7));
            ((ViewPage) anonymousClass7).swipeController = new SwipeController(anonymousClass7);
            ((ViewPage) anonymousClass7).recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(((ViewPage) anonymousClass7).listView, z3);
            ((ViewPage) anonymousClass7).itemTouchhelper = new ItemTouchHelper(((ViewPage) anonymousClass7).swipeController);
            ((ViewPage) anonymousClass7).itemTouchhelper.attachToRecyclerView(((ViewPage) anonymousClass7).listView);
            ((ViewPage) anonymousClass7).listView.setOnScrollListener(new AnonymousClass12(anonymousClass7));
            ((ViewPage) anonymousClass7).archivePullViewState = SharedConfig.archiveHidden ? 2 : 0;
            if (((ViewPage) anonymousClass7).pullForegroundDrawable == null && this.folderId == 0) {
                ((ViewPage) anonymousClass7).pullForegroundDrawable = new AnonymousClass13(this, LocaleController.getString("AccSwipeForArchive", 2131624118), LocaleController.getString("AccReleaseForArchive", 2131624117), anonymousClass7);
                if (hasHiddenArchive()) {
                    ((ViewPage) anonymousClass7).pullForegroundDrawable.showHidden();
                } else {
                    ((ViewPage) anonymousClass7).pullForegroundDrawable.doNotShow();
                }
                ((ViewPage) anonymousClass7).pullForegroundDrawable.setWillDraw(((ViewPage) anonymousClass7).archivePullViewState != 0);
            }
            int i17 = i12;
            int i18 = i11;
            ContentView contentView2 = contentView;
            String str2 = str;
            ((ViewPage) anonymousClass7).dialogsAdapter = new AnonymousClass14(this, this, context, ((ViewPage) anonymousClass7).dialogsType, this.folderId, this.onlySelect, this.selectedDialogs, this.currentAccount, anonymousClass7);
            ((ViewPage) anonymousClass7).dialogsAdapter.setForceShowEmptyCell(this.afterSignup);
            if (AndroidUtilities.isTablet() && this.openedDialogId != 0) {
                ((ViewPage) anonymousClass7).dialogsAdapter.setOpenedDialogId(this.openedDialogId);
            }
            ((ViewPage) anonymousClass7).dialogsAdapter.setArchivedPullDrawable(((ViewPage) anonymousClass7).pullForegroundDrawable);
            ((ViewPage) anonymousClass7).listView.setAdapter(((ViewPage) anonymousClass7).dialogsAdapter);
            ((ViewPage) anonymousClass7).listView.setEmptyView(this.folderId == 0 ? ((ViewPage) anonymousClass7).progressView : null);
            ((ViewPage) anonymousClass7).scrollHelper = new RecyclerAnimationScrollHelper(((ViewPage) anonymousClass7).listView, ((ViewPage) anonymousClass7).layoutManager);
            if (i17 != 0) {
                this.viewPages[i17].setVisibility(8);
            }
            i12 = i17 + 1;
            contentView = contentView2;
            str = str2;
            i11 = i18;
            i8 = 17;
            z4 = true;
            i5 = 8;
            z3 = false;
            f = 0.0f;
        }
        ContentView contentView3 = contentView;
        String str3 = str;
        if (this.searchString != null) {
            i = 2;
        } else {
            i = !this.onlySelect ? 1 : 0;
        }
        SearchViewPager searchViewPager = new SearchViewPager(context, this, i, this.initialDialogsType, this.folderId, new AnonymousClass15());
        this.searchViewPager = searchViewPager;
        contentView3.addView(searchViewPager);
        this.searchViewPager.dialogsSearchAdapter.setDelegate(new AnonymousClass16());
        this.searchViewPager.searchListView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda56(this));
        this.searchViewPager.searchListView.setOnItemLongClickListener(new AnonymousClass17());
        this.searchViewPager.setFilteredSearchViewDelegate(new DialogsActivity$$ExternalSyntheticLambda58(this));
        this.searchViewPager.setVisibility(8);
        FiltersView filtersView = new FiltersView(getParentActivity(), null);
        this.filtersView = filtersView;
        filtersView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda55(this));
        contentView3.addView(this.filtersView, LayoutHelper.createFrame(-1, -2, 48));
        this.filtersView.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        this.floatingButtonContainer = frameLayout;
        frameLayout.setVisibility(((!this.onlySelect || this.initialDialogsType == 10) && this.folderId == 0) ? 0 : 8);
        FrameLayout frameLayout2 = this.floatingButtonContainer;
        int i19 = Build.VERSION.SDK_INT;
        int i20 = i19 >= 21 ? 56 : 60;
        float f2 = i19 >= 21 ? 56 : 60;
        boolean z5 = LocaleController.isRTL;
        contentView3.addView(frameLayout2, LayoutHelper.createFrame(i20, f2, (z5 ? 3 : 5) | 80, z5 ? 14.0f : 0.0f, 0.0f, z5 ? 0.0f : 14.0f, 14.0f));
        this.floatingButtonContainer.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda22(this));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.floatingButton = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_actionIcon"), PorterDuff.Mode.MULTIPLY));
        if (this.initialDialogsType == 10) {
            this.floatingButton.setImageResource(2131165412);
            this.floatingButtonContainer.setContentDescription(LocaleController.getString("Done", 2131625541));
        } else {
            this.floatingButton.setAnimation(2131558626, 52, 52);
            this.floatingButtonContainer.setContentDescription(LocaleController.getString("NewMessageTitle", 2131626835));
        }
        if (i19 >= 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            z = true;
            FrameLayout frameLayout3 = this.floatingButtonContainer;
            Property property = View.TRANSLATION_Z;
            stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(frameLayout3, property, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonContainer, property, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
            this.floatingButtonContainer.setStateListAnimator(stateListAnimator);
            this.floatingButtonContainer.setOutlineProvider(new AnonymousClass18(this));
        } else {
            z = true;
        }
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor("chats_actionBackground"), Theme.getColor("chats_actionPressedBackground"));
        if (i19 < 21) {
            Drawable mutate = context.getResources().getDrawable(2131165414).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable2.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            combinedDrawable = combinedDrawable2;
        } else {
            combinedDrawable = createSimpleSelectorCircleDrawable;
        }
        updateFloatingButtonColor();
        this.floatingButtonContainer.addView(this.floatingButton, LayoutHelper.createFrame(-1, -1.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.floatingProgressView = radialProgressView;
        radialProgressView.setProgressColor(Theme.getColor("chats_actionIcon"));
        this.floatingProgressView.setScaleX(0.1f);
        this.floatingProgressView.setScaleY(0.1f);
        this.floatingProgressView.setAlpha(0.0f);
        this.floatingProgressView.setVisibility(8);
        this.floatingProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.floatingButtonContainer.addView(this.floatingProgressView, LayoutHelper.createFrame(-1, -1.0f));
        this.searchTabsView = null;
        if (!this.onlySelect && this.initialDialogsType == 0) {
            FragmentContextView fragmentContextView = new FragmentContextView(context, this, z);
            this.fragmentLocationContextView = fragmentContextView;
            fragmentContextView.setLayoutParams(LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, -36.0f, 0.0f, 0.0f));
            contentView3.addView(this.fragmentLocationContextView);
            AnonymousClass19 anonymousClass19 = new AnonymousClass19(context, this, false);
            this.fragmentContextView = anonymousClass19;
            anonymousClass19.setLayoutParams(LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, -36.0f, 0.0f, 0.0f));
            contentView3.addView(this.fragmentContextView);
            this.fragmentContextView.setAdditionalContextView(this.fragmentLocationContextView);
            this.fragmentLocationContextView.setAdditionalContextView(this.fragmentContextView);
        } else if (this.initialDialogsType == 3) {
            ChatActivityEnterView chatActivityEnterView = this.commentView;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.onDestroy();
            }
            z2 = true;
            i2 = 21;
            this.commentView = new AnonymousClass20(getParentActivity(), contentView3, null, false);
            contentView3.setClipChildren(false);
            contentView3.setClipToPadding(false);
            ChatActivityEnterView chatActivityEnterView2 = this.commentView;
            chatActivityEnterView2.allowBlur = false;
            chatActivityEnterView2.forceSmoothKeyboard(true);
            this.commentView.setAllowStickersAndGifs(true, false, false);
            this.commentView.setForceShowSendButton(true, false);
            this.commentView.setPadding(0, 0, AndroidUtilities.dp(20.0f), 0);
            this.commentView.setVisibility(8);
            this.commentView.getSendButton().setAlpha(0.0f);
            View view = new View(getParentActivity());
            this.commentViewBg = view;
            view.setBackgroundColor(getThemedColor("chat_messagePanelBackground"));
            contentView3.addView(this.commentViewBg, LayoutHelper.createFrame(-1, 1600.0f, 87, 0.0f, 0.0f, 0.0f, -1600.0f));
            contentView3.addView(this.commentView, LayoutHelper.createFrame(-1, -2, 83));
            this.commentView.setDelegate(new AnonymousClass21());
            AnonymousClass22 anonymousClass22 = new AnonymousClass22(context);
            this.writeButtonContainer = anonymousClass22;
            anonymousClass22.setFocusable(true);
            this.writeButtonContainer.setFocusableInTouchMode(true);
            i3 = 4;
            this.writeButtonContainer.setVisibility(4);
            this.writeButtonContainer.setScaleX(0.2f);
            this.writeButtonContainer.setScaleY(0.2f);
            this.writeButtonContainer.setAlpha(0.0f);
            contentView3.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 6.0f, 10.0f));
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            AnonymousClass23 anonymousClass23 = new AnonymousClass23(context);
            this.selectedCountView = anonymousClass23;
            anonymousClass23.setAlpha(0.0f);
            this.selectedCountView.setScaleX(0.2f);
            this.selectedCountView.setScaleY(0.2f);
            contentView3.addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -8.0f, 9.0f));
            FrameLayout frameLayout4 = new FrameLayout(context);
            Drawable createSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), getThemedColor("dialogFloatingButton"), getThemedColor(i19 >= 21 ? "dialogFloatingButtonPressed" : "dialogFloatingButton"));
            if (i19 < 21) {
                Drawable mutate2 = context.getResources().getDrawable(2131165415).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable3 = new CombinedDrawable(mutate2, combinedDrawable, 0, 0);
                combinedDrawable3.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                createSimpleSelectorCircleDrawable2 = combinedDrawable3;
            }
            frameLayout4.setBackgroundDrawable(createSimpleSelectorCircleDrawable2);
            frameLayout4.setImportantForAccessibility(2);
            if (i19 >= 21) {
                frameLayout4.setOutlineProvider(new AnonymousClass24(this));
            }
            frameLayout4.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda20(this));
            frameLayout4.setOnLongClickListener(new DialogsActivity$$ExternalSyntheticLambda27(this, frameLayout4));
            this.writeButton = new ImageView[2];
            int i21 = 0;
            for (int i22 = 2; i21 < i22; i22 = 2) {
                this.writeButton[i21] = new ImageView(context);
                this.writeButton[i21].setImageResource(i21 == 1 ? 2131165640 : 2131165264);
                this.writeButton[i21].setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingIcon"), PorterDuff.Mode.MULTIPLY));
                this.writeButton[i21].setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView = this.writeButton[i21];
                int i23 = Build.VERSION.SDK_INT;
                frameLayout4.addView(imageView, LayoutHelper.createFrame(i23 >= 21 ? 56 : 60, i23 >= 21 ? 56 : 60, 17));
                i21++;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[0], true, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[1], false, 0.5f, false);
            FrameLayout frameLayout5 = this.writeButtonContainer;
            int i24 = Build.VERSION.SDK_INT;
            frameLayout5.addView(frameLayout4, LayoutHelper.createFrame(i24 >= 21 ? 56 : 60, i24 >= 21 ? 56.0f : 60.0f, 51, i24 >= 21 ? 2.0f : 0.0f, 0.0f, 0.0f, 0.0f));
            filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                contentView3.addView(filterTabsView, LayoutHelper.createFrame(-1, 44.0f));
            }
            if (!this.onlySelect) {
                FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f);
                if (this.inPreviewMode && Build.VERSION.SDK_INT >= i2) {
                    createFrame.topMargin = AndroidUtilities.statusBarHeight;
                }
                contentView3.addView(this.actionBar, createFrame);
            }
            if (this.searchString == null && this.initialDialogsType == 0) {
                AnonymousClass25 anonymousClass25 = new AnonymousClass25(context);
                this.updateLayout = anonymousClass25;
                anonymousClass25.setWillNotDraw(false);
                this.updateLayout.setVisibility(i3);
                this.updateLayout.setTranslationY(AndroidUtilities.dp(48.0f));
                if (Build.VERSION.SDK_INT >= i2) {
                    this.updateLayout.setBackground(Theme.getSelectorDrawable(1090519039, false));
                }
                contentView3.addView(this.updateLayout, LayoutHelper.createFrame(-1, 48, 83));
                this.updateLayout.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda19(this));
                RadialProgress2 radialProgress2 = new RadialProgress2(this.updateLayout);
                this.updateLayoutIcon = radialProgress2;
                radialProgress2.setColors(-1, -1, -1, -1);
                this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
                this.updateLayoutIcon.setAsMini();
                this.updateLayoutIcon.setIcon(15, z2, false);
                TextView textView = new TextView(context);
                this.updateTextView = textView;
                int i25 = z2 ? 1 : 0;
                int i26 = z2 ? 1 : 0;
                textView.setTextSize(i25, 15.0f);
                this.updateTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                this.updateTextView.setText(LocaleController.getString("AppUpdateNow", 2131624390).toUpperCase());
                this.updateTextView.setTextColor(-1);
                this.updateTextView.setPadding(AndroidUtilities.dp(30.0f), 0, 0, 0);
                this.updateLayout.addView(this.updateTextView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
            }
            for (i4 = 0; i4 < 2; i4++) {
                this.undoView[i4] = new AnonymousClass26(context);
                contentView3.addView(this.undoView[i4], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            }
            if (this.folderId != 0) {
                this.viewPages[0].listView.setGlowColor(Theme.getColor("actionBarDefaultArchived"));
                this.actionBar.setTitleColor(Theme.getColor("actionBarDefaultArchivedTitle"));
                this.actionBar.setItemsColor(Theme.getColor("actionBarDefaultArchivedIcon"), false);
                this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarDefaultArchivedSelector"), false);
                this.actionBar.setSearchTextColor(Theme.getColor("actionBarDefaultArchivedSearch"), false);
                this.actionBar.setSearchTextColor(Theme.getColor("actionBarDefaultSearchArchivedPlaceholder"), z2);
            }
            if (!this.onlySelect && this.initialDialogsType == 0) {
                AnonymousClass27 anonymousClass27 = new AnonymousClass27(context);
                this.blurredView = anonymousClass27;
                if (Build.VERSION.SDK_INT >= 23) {
                    anonymousClass27.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor("windowBackgroundWhite"), 100)));
                }
                this.blurredView.setFocusable(false);
                this.blurredView.setImportantForAccessibility(2);
                this.blurredView.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda18(this));
                this.blurredView.setVisibility(8);
                this.blurredView.setFitsSystemWindows(z2);
                contentView3.addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
            }
            this.actionBarDefaultPaint.setColor(Theme.getColor(this.folderId != 0 ? str3 : "actionBarDefaultArchived"));
            if (this.inPreviewMode) {
                TLRPC$User currentUser2 = getUserConfig().getCurrentUser();
                ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(this.actionBar.getContext(), null, false);
                this.avatarContainer = chatAvatarContainer;
                chatAvatarContainer.setTitle(UserObject.getUserName(currentUser2));
                this.avatarContainer.setSubtitle(LocaleController.formatUserStatus(this.currentAccount, currentUser2));
                this.avatarContainer.setUserAvatar(currentUser2, z2);
                this.avatarContainer.setOccupyStatusBar(false);
                this.avatarContainer.setLeftPadding(AndroidUtilities.dp(10.0f));
                this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
                this.floatingButton.setVisibility(i3);
                this.actionBar.setOccupyStatusBar(false);
                this.actionBar.setBackgroundColor(Theme.getColor(str3));
                FragmentContextView fragmentContextView2 = this.fragmentContextView;
                if (fragmentContextView2 != null) {
                    contentView3.removeView(fragmentContextView2);
                }
                FragmentContextView fragmentContextView3 = this.fragmentLocationContextView;
                if (fragmentContextView3 != null) {
                    contentView3.removeView(fragmentContextView3);
                }
            }
            this.searchIsShowed = false;
            updateFilterTabs(false, false);
            if (this.searchString == null) {
                showSearch(z2, false, false);
                this.actionBar.openSearchField(this.searchString, false);
            } else if (this.initialSearchString != null) {
                showSearch(z2, false, false);
                this.actionBar.openSearchField(this.initialSearchString, false);
                this.initialSearchString = null;
                FilterTabsView filterTabsView2 = this.filterTabsView;
                if (filterTabsView2 != null) {
                    filterTabsView2.setTranslationY(-AndroidUtilities.dp(44.0f));
                }
            } else {
                showSearch(false, false, false);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                FilesMigrationService.checkBottomSheet(this);
            }
            updateMenuButton(false);
            this.actionBar.setDrawBlurBackground(contentView3);
            return this.fragmentView;
        }
        i3 = 4;
        z2 = true;
        i2 = 21;
        filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
        }
        if (!this.onlySelect) {
        }
        if (this.searchString == null) {
            AnonymousClass25 anonymousClass252 = new AnonymousClass25(context);
            this.updateLayout = anonymousClass252;
            anonymousClass252.setWillNotDraw(false);
            this.updateLayout.setVisibility(i3);
            this.updateLayout.setTranslationY(AndroidUtilities.dp(48.0f));
            if (Build.VERSION.SDK_INT >= i2) {
            }
            contentView3.addView(this.updateLayout, LayoutHelper.createFrame(-1, 48, 83));
            this.updateLayout.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda19(this));
            RadialProgress2 radialProgress22 = new RadialProgress2(this.updateLayout);
            this.updateLayoutIcon = radialProgress22;
            radialProgress22.setColors(-1, -1, -1, -1);
            this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
            this.updateLayoutIcon.setAsMini();
            this.updateLayoutIcon.setIcon(15, z2, false);
            TextView textView2 = new TextView(context);
            this.updateTextView = textView2;
            int i252 = z2 ? 1 : 0;
            int i262 = z2 ? 1 : 0;
            textView2.setTextSize(i252, 15.0f);
            this.updateTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.updateTextView.setText(LocaleController.getString("AppUpdateNow", 2131624390).toUpperCase());
            this.updateTextView.setTextColor(-1);
            this.updateTextView.setPadding(AndroidUtilities.dp(30.0f), 0, 0, 0);
            this.updateLayout.addView(this.updateTextView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        while (i4 < 2) {
        }
        if (this.folderId != 0) {
        }
        if (!this.onlySelect) {
            AnonymousClass27 anonymousClass272 = new AnonymousClass27(context);
            this.blurredView = anonymousClass272;
            if (Build.VERSION.SDK_INT >= 23) {
            }
            this.blurredView.setFocusable(false);
            this.blurredView.setImportantForAccessibility(2);
            this.blurredView.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda18(this));
            this.blurredView.setVisibility(8);
            this.blurredView.setFitsSystemWindows(z2);
            contentView3.addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
        }
        this.actionBarDefaultPaint.setColor(Theme.getColor(this.folderId != 0 ? str3 : "actionBarDefaultArchived"));
        if (this.inPreviewMode) {
        }
        this.searchIsShowed = false;
        updateFilterTabs(false, false);
        if (this.searchString == null) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
        }
        updateMenuButton(false);
        this.actionBar.setDrawBlurBackground(contentView3);
        return this.fragmentView;
    }

    public /* synthetic */ void lambda$createView$3(View view) {
        this.filterTabsView.setIsEditing(false);
        showDoneItem(false);
    }

    /* renamed from: org.telegram.ui.DialogsActivity$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        AnonymousClass3() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchExpand() {
            DialogsActivity.this.searching = true;
            if (DialogsActivity.this.switchItem != null) {
                DialogsActivity.this.switchItem.setVisibility(8);
            }
            if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                DialogsActivity.this.proxyItem.setVisibility(8);
            }
            if (DialogsActivity.this.downloadsItem != null && DialogsActivity.this.downloadsItemVisible) {
                DialogsActivity.this.downloadsItem.setVisibility(8);
            }
            if (DialogsActivity.this.viewPages[0] != null) {
                if (DialogsActivity.this.searchString != null) {
                    DialogsActivity.this.viewPages[0].listView.hide();
                    if (DialogsActivity.this.searchViewPager != null) {
                        DialogsActivity.this.searchViewPager.searchListView.show();
                    }
                }
                if (!DialogsActivity.this.onlySelect) {
                    DialogsActivity.this.floatingButtonContainer.setVisibility(8);
                }
            }
            DialogsActivity.this.setScrollY(0.0f);
            DialogsActivity.this.updatePasscodeButton();
            DialogsActivity.this.updateProxyButton(false, false);
            ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrGoBack", 2131623987));
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            ((SizeNotifierFrameLayout) ((BaseFragment) DialogsActivity.this).fragmentView).invalidateBlur();
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public boolean canCollapseSearch() {
            if (DialogsActivity.this.switchItem != null) {
                DialogsActivity.this.switchItem.setVisibility(0);
            }
            if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                DialogsActivity.this.proxyItem.setVisibility(0);
            }
            if (DialogsActivity.this.downloadsItem != null && DialogsActivity.this.downloadsItemVisible) {
                DialogsActivity.this.downloadsItem.setVisibility(0);
            }
            if (DialogsActivity.this.searchString != null) {
                DialogsActivity.this.finishFragment();
                return false;
            }
            return true;
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchCollapse() {
            DialogsActivity.this.searching = false;
            DialogsActivity.this.searchWas = false;
            if (DialogsActivity.this.viewPages[0] != null) {
                DialogsActivity.this.viewPages[0].listView.setEmptyView(DialogsActivity.this.folderId == 0 ? DialogsActivity.this.viewPages[0].progressView : null);
                if (!DialogsActivity.this.onlySelect) {
                    DialogsActivity.this.floatingButtonContainer.setVisibility(0);
                    DialogsActivity.this.floatingHidden = true;
                    DialogsActivity.this.floatingButtonTranslation = AndroidUtilities.dp(100.0f);
                    DialogsActivity.this.floatingButtonHideProgress = 1.0f;
                    DialogsActivity.this.updateFloatingButtonOffset();
                }
                DialogsActivity.this.showSearch(false, false, true);
            }
            DialogsActivity.this.updateProxyButton(false, false);
            DialogsActivity.this.updatePasscodeButton();
            if (DialogsActivity.this.menuDrawable != null) {
                if (((BaseFragment) DialogsActivity.this).actionBar.getBackButton().getDrawable() != DialogsActivity.this.menuDrawable) {
                    ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonDrawable(DialogsActivity.this.menuDrawable);
                    DialogsActivity.this.menuDrawable.setRotation(0.0f, true);
                }
                ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrOpenMenu", 2131624030));
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
            ((SizeNotifierFrameLayout) ((BaseFragment) DialogsActivity.this).fragmentView).invalidateBlur();
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onTextChanged(EditText editText) {
            String obj = editText.getText().toString();
            if (obj.length() != 0 || ((DialogsActivity.this.searchViewPager.dialogsSearchAdapter != null && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.hasRecentSearch()) || DialogsActivity.this.searchFiltersWasShowed)) {
                DialogsActivity.this.searchWas = true;
                if (!DialogsActivity.this.searchIsShowed) {
                    DialogsActivity.this.showSearch(true, false, true);
                }
            }
            DialogsActivity.this.searchViewPager.onTextChanged(obj);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
            if (!DialogsActivity.this.searchIsShowed) {
                return;
            }
            DialogsActivity.this.searchViewPager.removeSearchFilter(mediaFilterData);
            DialogsActivity.this.searchViewPager.onTextChanged(DialogsActivity.this.searchItem.getSearchField().getText().toString());
            DialogsActivity.this.updateFiltersView(true, null, null, false, true);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public boolean canToggleSearch() {
            return !((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed() && DialogsActivity.this.databaseMigrationHint == null;
        }
    }

    public /* synthetic */ void lambda$createView$4() {
        if (this.initialDialogsType != 10) {
            hideFloatingButton(false);
        }
        scrollToTop();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$4 */
    /* loaded from: classes3.dex */
    class AnonymousClass4 extends Paint {
        AnonymousClass4() {
            DialogsActivity.this = r1;
        }

        @Override // android.graphics.Paint
        public void setAlpha(int i) {
            super.setAlpha(i);
            if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$5 */
    /* loaded from: classes3.dex */
    class AnonymousClass5 extends FilterTabsView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
            DialogsActivity.this.maybeStartTracking = false;
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                DialogsActivity.this.updateContextViewPosition();
                if (((BaseFragment) DialogsActivity.this).fragmentView == null) {
                    return;
                }
                ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            }
        }

        @Override // org.telegram.ui.Components.FilterTabsView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (DialogsActivity.this.scrimView != null) {
                DialogsActivity.this.scrimView.getLocationInWindow(DialogsActivity.this.scrimViewLocation);
                ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 implements FilterTabsView.FilterTabsViewDelegate {
        final /* synthetic */ Context val$context;

        public static /* synthetic */ void lambda$showDeleteAlert$0() {
        }

        AnonymousClass6(Context context) {
            DialogsActivity.this = r1;
            this.val$context = context;
        }

        private void showDeleteAlert(MessagesController.DialogFilter dialogFilter) {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("FilterDelete", 2131625887));
            builder.setMessage(LocaleController.getString("FilterDeleteAlert", 2131625888));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            builder.setPositiveButton(LocaleController.getString("Delete", 2131625384), new DialogsActivity$6$$ExternalSyntheticLambda0(this, dialogFilter));
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        }

        public /* synthetic */ void lambda$showDeleteAlert$2(MessagesController.DialogFilter dialogFilter, DialogInterface dialogInterface, int i) {
            TLRPC$TL_messages_updateDialogFilter tLRPC$TL_messages_updateDialogFilter = new TLRPC$TL_messages_updateDialogFilter();
            tLRPC$TL_messages_updateDialogFilter.id = dialogFilter.id;
            DialogsActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_updateDialogFilter, DialogsActivity$6$$ExternalSyntheticLambda3.INSTANCE);
            DialogsActivity.this.getMessagesController().removeFilter(dialogFilter);
            DialogsActivity.this.getMessagesStorage().deleteDialogFilter(dialogFilter);
        }

        public static /* synthetic */ void lambda$showDeleteAlert$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(DialogsActivity$6$$ExternalSyntheticLambda2.INSTANCE);
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public void onSamePageSelected() {
            DialogsActivity.this.scrollToTop();
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public void onPageReorder(int i, int i2) {
            for (int i3 = 0; i3 < DialogsActivity.this.viewPages.length; i3++) {
                if (DialogsActivity.this.viewPages[i3].selectedType == i) {
                    DialogsActivity.this.viewPages[i3].selectedType = i2;
                } else if (DialogsActivity.this.viewPages[i3].selectedType == i2) {
                    DialogsActivity.this.viewPages[i3].selectedType = i;
                }
            }
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public void onPageSelected(FilterTabsView.Tab tab, boolean z) {
            int i;
            if (DialogsActivity.this.viewPages[0].selectedType == tab.id) {
                return;
            }
            if (tab.isLocked) {
                DialogsActivity.this.filterTabsView.shakeLock(tab.id);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity.showDialog(new LimitReachedBottomSheet(dialogsActivity2, this.val$context, 3, ((BaseFragment) dialogsActivity2).currentAccount));
                return;
            }
            ArrayList<MessagesController.DialogFilter> arrayList = DialogsActivity.this.getMessagesController().dialogFilters;
            if (!tab.isDefault && ((i = tab.id) < 0 || i >= arrayList.size())) {
                return;
            }
            if (((BaseFragment) DialogsActivity.this).parentLayout != null) {
                ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(tab.id == DialogsActivity.this.filterTabsView.getFirstTabId() || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5);
            }
            DialogsActivity.this.viewPages[1].selectedType = tab.id;
            DialogsActivity.this.viewPages[1].setVisibility(0);
            DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth());
            DialogsActivity.this.showScrollbars(false);
            DialogsActivity.this.switchToCurrentSelectedMode(true);
            DialogsActivity.this.animatingForward = z;
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public boolean canPerformActions() {
            return !DialogsActivity.this.searching;
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public void onPageScrolled(float f) {
            if (f != 1.0f || DialogsActivity.this.viewPages[1].getVisibility() == 0 || DialogsActivity.this.searching) {
                if (DialogsActivity.this.animatingForward) {
                    DialogsActivity.this.viewPages[0].setTranslationX((-f) * DialogsActivity.this.viewPages[0].getMeasuredWidth());
                    DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() - (DialogsActivity.this.viewPages[0].getMeasuredWidth() * f));
                } else {
                    DialogsActivity.this.viewPages[0].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() * f);
                    DialogsActivity.this.viewPages[1].setTranslationX((DialogsActivity.this.viewPages[0].getMeasuredWidth() * f) - DialogsActivity.this.viewPages[0].getMeasuredWidth());
                }
                if (f != 1.0f) {
                    return;
                }
                ViewPage viewPage = DialogsActivity.this.viewPages[0];
                DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                DialogsActivity.this.viewPages[1] = viewPage;
                DialogsActivity.this.viewPages[1].setVisibility(8);
                DialogsActivity.this.showScrollbars(true);
                DialogsActivity.this.updateCounters(false);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.checkListLoad(dialogsActivity.viewPages[0]);
                DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
            }
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public int getTabCounter(int i) {
            if (i == DialogsActivity.this.filterTabsView.getDefaultTabId()) {
                return DialogsActivity.this.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> arrayList = DialogsActivity.this.getMessagesController().dialogFilters;
            if (i >= 0 && i < arrayList.size()) {
                return DialogsActivity.this.getMessagesController().dialogFilters.get(i).unreadCount;
            }
            return 0;
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public boolean didSelectTab(FilterTabsView.TabView tabView, boolean z) {
            ScrollView scrollView;
            if (((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                return false;
            }
            MessagesController.DialogFilter dialogFilter = null;
            if (DialogsActivity.this.scrimPopupWindow != null) {
                DialogsActivity.this.scrimPopupWindow.dismiss();
                DialogsActivity.this.scrimPopupWindow = null;
                DialogsActivity.this.scrimPopupWindowItems = null;
                return false;
            }
            Rect rect = new Rect();
            if (tabView.getId() != DialogsActivity.this.filterTabsView.getDefaultTabId()) {
                dialogFilter = DialogsActivity.this.getMessagesController().dialogFilters.get(tabView.getId());
            }
            MessagesController.DialogFilter dialogFilter2 = dialogFilter;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(DialogsActivity.this.getParentActivity());
            actionBarPopupWindowLayout.setOnTouchListener(new AnonymousClass1(rect));
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new DialogsActivity$6$$ExternalSyntheticLambda4(this));
            Rect rect2 = new Rect();
            Drawable mutate = DialogsActivity.this.getParentActivity().getResources().getDrawable(2131166090).mutate();
            mutate.getPadding(rect2);
            actionBarPopupWindowLayout.setBackgroundDrawable(mutate);
            actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
            LinearLayout linearLayout = new LinearLayout(DialogsActivity.this.getParentActivity());
            if (Build.VERSION.SDK_INT >= 21) {
                scrollView = new AnonymousClass2(this, DialogsActivity.this.getParentActivity(), null, 0, 2131689520, linearLayout);
            } else {
                scrollView = new ScrollView(DialogsActivity.this.getParentActivity());
            }
            scrollView.setClipToPadding(false);
            actionBarPopupWindowLayout.addView(scrollView, LayoutHelper.createFrame(-2, -2.0f));
            linearLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
            linearLayout.setOrientation(1);
            int i = 3;
            DialogsActivity.this.scrimPopupWindowItems = new ActionBarMenuSubItem[3];
            if (tabView.getId() == DialogsActivity.this.filterTabsView.getDefaultTabId()) {
                i = 2;
            }
            int i2 = 0;
            while (i2 < i) {
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(DialogsActivity.this.getParentActivity(), i2 == 0, i2 == i + (-1));
                if (i2 == 0) {
                    if (DialogsActivity.this.getMessagesController().dialogFilters.size() <= 1) {
                        i2++;
                    } else {
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("FilterReorder", 2131625929), 2131166183);
                    }
                } else if (i2 != 1) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("FilterDeleteItem", 2131625889), 2131165702);
                } else if (i == 2) {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("FilterEditAll", 2131625896), 2131165714);
                } else {
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("FilterEdit", 2131625895), 2131165714);
                }
                DialogsActivity.this.scrimPopupWindowItems[i2] = actionBarMenuSubItem;
                linearLayout.addView(actionBarMenuSubItem);
                actionBarMenuSubItem.setOnClickListener(new DialogsActivity$6$$ExternalSyntheticLambda1(this, i2, i, dialogFilter2));
                i2++;
            }
            scrollView.addView(linearLayout, LayoutHelper.createScroll(-2, -2, 51));
            DialogsActivity.this.scrimPopupWindow = new AnonymousClass3(actionBarPopupWindowLayout, -2, -2);
            DialogsActivity.this.scrimViewBackground = Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, Theme.getColor("actionBarDefault"));
            DialogsActivity.this.scrimPopupWindow.setDismissAnimationDuration(220);
            DialogsActivity.this.scrimPopupWindow.setOutsideTouchable(true);
            DialogsActivity.this.scrimPopupWindow.setClippingEnabled(true);
            DialogsActivity.this.scrimPopupWindow.setAnimationStyle(2131689481);
            DialogsActivity.this.scrimPopupWindow.setFocusable(true);
            actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            DialogsActivity.this.scrimPopupWindow.setInputMethodMode(2);
            DialogsActivity.this.scrimPopupWindow.setSoftInputMode(0);
            DialogsActivity.this.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
            tabView.getLocationInWindow(DialogsActivity.this.scrimViewLocation);
            int dp = (DialogsActivity.this.scrimViewLocation[0] + rect2.left) - AndroidUtilities.dp(16.0f);
            if (dp >= AndroidUtilities.dp(6.0f)) {
                if (dp > (((BaseFragment) DialogsActivity.this).fragmentView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - actionBarPopupWindowLayout.getMeasuredWidth()) {
                    dp = (((BaseFragment) DialogsActivity.this).fragmentView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - actionBarPopupWindowLayout.getMeasuredWidth();
                }
            } else {
                dp = AndroidUtilities.dp(6.0f);
            }
            DialogsActivity.this.scrimPopupWindow.showAtLocation(((BaseFragment) DialogsActivity.this).fragmentView, 51, dp, (DialogsActivity.this.scrimViewLocation[1] + tabView.getMeasuredHeight()) - AndroidUtilities.dp(12.0f));
            DialogsActivity.this.scrimView = tabView;
            DialogsActivity.this.scrimViewSelected = z;
            ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            if (DialogsActivity.this.scrimAnimatorSet != null) {
                DialogsActivity.this.scrimAnimatorSet.cancel();
            }
            DialogsActivity.this.scrimAnimatorSet = new AnimatorSet();
            DialogsActivity.this.scrimViewAppearing = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofInt(DialogsActivity.this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0, 50));
            DialogsActivity.this.scrimAnimatorSet.playTogether(arrayList);
            DialogsActivity.this.scrimAnimatorSet.setDuration(150L);
            DialogsActivity.this.scrimAnimatorSet.start();
            return true;
        }

        /* renamed from: org.telegram.ui.DialogsActivity$6$1 */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements View.OnTouchListener {
            private int[] pos = new int[2];
            final /* synthetic */ Rect val$rect;

            AnonymousClass1(Rect rect) {
                AnonymousClass6.this = r1;
                this.val$rect = rect;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    if (DialogsActivity.this.scrimPopupWindow != null && DialogsActivity.this.scrimPopupWindow.isShowing()) {
                        View contentView = DialogsActivity.this.scrimPopupWindow.getContentView();
                        contentView.getLocationInWindow(this.pos);
                        Rect rect = this.val$rect;
                        int[] iArr = this.pos;
                        rect.set(iArr[0], iArr[1], iArr[0] + contentView.getMeasuredWidth(), this.pos[1] + contentView.getMeasuredHeight());
                        if (!this.val$rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            DialogsActivity.this.scrimPopupWindow.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && DialogsActivity.this.scrimPopupWindow != null && DialogsActivity.this.scrimPopupWindow.isShowing()) {
                    DialogsActivity.this.scrimPopupWindow.dismiss();
                }
                return false;
            }
        }

        public /* synthetic */ void lambda$didSelectTab$3(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0 || DialogsActivity.this.scrimPopupWindow == null || !DialogsActivity.this.scrimPopupWindow.isShowing()) {
                return;
            }
            DialogsActivity.this.scrimPopupWindow.dismiss();
        }

        /* renamed from: org.telegram.ui.DialogsActivity$6$2 */
        /* loaded from: classes3.dex */
        class AnonymousClass2 extends ScrollView {
            final /* synthetic */ LinearLayout val$linearLayout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AnonymousClass6 anonymousClass6, Context context, AttributeSet attributeSet, int i, int i2, LinearLayout linearLayout) {
                super(context, attributeSet, i, i2);
                this.val$linearLayout = linearLayout;
            }

            @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setMeasuredDimension(this.val$linearLayout.getMeasuredWidth(), getMeasuredHeight());
            }
        }

        public /* synthetic */ void lambda$didSelectTab$4(int i, int i2, MessagesController.DialogFilter dialogFilter, View view) {
            if (i == 0) {
                DialogsActivity.this.resetScroll();
                DialogsActivity.this.filterTabsView.setIsEditing(true);
                DialogsActivity.this.showDoneItem(true);
            } else if (i == 1) {
                if (i2 == 2) {
                    DialogsActivity.this.presentFragment(new FiltersSetupActivity());
                } else {
                    DialogsActivity.this.presentFragment(new FilterCreateActivity(dialogFilter));
                }
            } else if (i == 2) {
                showDeleteAlert(dialogFilter);
            }
            if (DialogsActivity.this.scrimPopupWindow != null) {
                DialogsActivity.this.scrimPopupWindow.dismiss();
            }
        }

        /* renamed from: org.telegram.ui.DialogsActivity$6$3 */
        /* loaded from: classes3.dex */
        public class AnonymousClass3 extends ActionBarPopupWindow {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(View view, int i, int i2) {
                super(view, i, i2);
                AnonymousClass6.this = r1;
            }

            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
            public void dismiss() {
                super.dismiss();
                if (DialogsActivity.this.scrimPopupWindow != this) {
                    return;
                }
                DialogsActivity.this.scrimPopupWindow = null;
                DialogsActivity.this.scrimPopupWindowItems = null;
                if (DialogsActivity.this.scrimAnimatorSet != null) {
                    DialogsActivity.this.scrimAnimatorSet.cancel();
                    DialogsActivity.this.scrimAnimatorSet = null;
                }
                DialogsActivity.this.scrimAnimatorSet = new AnimatorSet();
                DialogsActivity.this.scrimViewAppearing = false;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofInt(DialogsActivity.this.scrimPaint, AnimationProperties.PAINT_ALPHA, 0));
                DialogsActivity.this.scrimAnimatorSet.playTogether(arrayList);
                DialogsActivity.this.scrimAnimatorSet.setDuration(220L);
                DialogsActivity.this.scrimAnimatorSet.addListener(new AnonymousClass1());
                DialogsActivity.this.scrimAnimatorSet.start();
                if (Build.VERSION.SDK_INT < 19) {
                    return;
                }
                DialogsActivity.this.getParentActivity().getWindow().getDecorView().setImportantForAccessibility(0);
            }

            /* renamed from: org.telegram.ui.DialogsActivity$6$3$1 */
            /* loaded from: classes3.dex */
            class AnonymousClass1 extends AnimatorListenerAdapter {
                AnonymousClass1() {
                    AnonymousClass3.this = r1;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (DialogsActivity.this.scrimView != null) {
                        DialogsActivity.this.scrimView.setBackground(null);
                        DialogsActivity.this.scrimView = null;
                    }
                    if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                        ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
                    }
                }
            }
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public boolean isTabMenuVisible() {
            return DialogsActivity.this.scrimPopupWindow != null && DialogsActivity.this.scrimPopupWindow.isShowing();
        }

        @Override // org.telegram.ui.Components.FilterTabsView.FilterTabsViewDelegate
        public void onDeletePressed(int i) {
            showDeleteAlert(DialogsActivity.this.getMessagesController().dialogFilters.get(i));
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$7 */
    /* loaded from: classes3.dex */
    class AnonymousClass7 extends ViewPage {
        final /* synthetic */ ContentView val$contentView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(Context context, ContentView contentView) {
            super(context);
            DialogsActivity.this = r1;
            this.val$contentView = contentView;
        }

        @Override // android.view.View
        public void setTranslationX(float f) {
            if (getTranslationX() != f) {
                super.setTranslationX(f);
                if (DialogsActivity.this.tabsAnimationInProgress && DialogsActivity.this.viewPages[0] == this) {
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, Math.abs(DialogsActivity.this.viewPages[0].getTranslationX()) / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                }
                this.val$contentView.invalidateBlur();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$8 */
    /* loaded from: classes3.dex */
    class AnonymousClass8 extends DialogsItemAnimator {
        final /* synthetic */ ViewPage val$viewPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(RecyclerListView recyclerListView, ViewPage viewPage) {
            super(recyclerListView);
            DialogsActivity.this = r1;
            this.val$viewPage = viewPage;
        }

        @Override // androidx.recyclerview.widget.SimpleItemAnimator
        public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
            super.onRemoveStarting(viewHolder);
            if (this.val$viewPage.layoutManager.findFirstVisibleItemPosition() == 0) {
                View findViewByPosition = this.val$viewPage.layoutManager.findViewByPosition(0);
                if (findViewByPosition != null) {
                    findViewByPosition.invalidate();
                }
                if (this.val$viewPage.archivePullViewState == 2) {
                    this.val$viewPage.archivePullViewState = 1;
                }
                if (this.val$viewPage.pullForegroundDrawable == null) {
                    return;
                }
                this.val$viewPage.pullForegroundDrawable.doNotShow();
            }
        }

        @Override // androidx.recyclerview.widget.SimpleItemAnimator
        public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
            if (DialogsActivity.this.dialogRemoveFinished == 2) {
                DialogsActivity.this.dialogRemoveFinished = 1;
            }
        }

        @Override // androidx.recyclerview.widget.SimpleItemAnimator
        public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
            if (DialogsActivity.this.dialogInsertFinished == 2) {
                DialogsActivity.this.dialogInsertFinished = 1;
            }
        }

        @Override // androidx.recyclerview.widget.SimpleItemAnimator
        public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
            if (DialogsActivity.this.dialogChangeFinished == 2) {
                DialogsActivity.this.dialogChangeFinished = 1;
            }
        }

        @Override // org.telegram.ui.Components.DialogsItemAnimator
        protected void onAllAnimationsDone() {
            if (DialogsActivity.this.dialogRemoveFinished == 1 || DialogsActivity.this.dialogInsertFinished == 1 || DialogsActivity.this.dialogChangeFinished == 1) {
                DialogsActivity.this.onDialogAnimationFinished();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$9 */
    /* loaded from: classes3.dex */
    class AnonymousClass9 extends LinearLayoutManager {
        private boolean fixOffset;
        final /* synthetic */ ViewPage val$viewPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(Context context, ViewPage viewPage) {
            super(context);
            DialogsActivity.this = r1;
            this.val$viewPage = viewPage;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void scrollToPositionWithOffset(int i, int i2) {
            if (this.fixOffset) {
                i2 -= this.val$viewPage.listView.getPaddingTop();
            }
            super.scrollToPositionWithOffset(i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
        public void prepareForDrop(View view, View view2, int i, int i2) {
            this.fixOffset = true;
            super.prepareForDrop(view, view2, i, i2);
            this.fixOffset = false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            if (DialogsActivity.this.hasHiddenArchive() && i == 1) {
                super.smoothScrollToPosition(recyclerView, state, i);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
            linearSmoothScrollerCustom.setTargetPosition(i);
            startSmoothScroll(linearSmoothScrollerCustom);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            int i2;
            float viewOffset;
            int i3;
            View findViewByPosition;
            boolean z = false;
            if (this.val$viewPage.listView.fastScrollAnimationRunning) {
                return 0;
            }
            boolean z2 = this.val$viewPage.listView.getScrollState() == 1;
            int paddingTop = this.val$viewPage.listView.getPaddingTop();
            if (this.val$viewPage.dialogsType == 0 && !DialogsActivity.this.onlySelect && DialogsActivity.this.folderId == 0 && i < 0 && DialogsActivity.this.getMessagesController().hasHiddenArchive() && this.val$viewPage.archivePullViewState == 2) {
                this.val$viewPage.listView.setOverScrollMode(0);
                int findFirstVisibleItemPosition = this.val$viewPage.layoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition == 0 && (findViewByPosition = this.val$viewPage.layoutManager.findViewByPosition(findFirstVisibleItemPosition)) != null && findViewByPosition.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    findFirstVisibleItemPosition = 1;
                }
                if (!z2) {
                    View findViewByPosition2 = this.val$viewPage.layoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    if (findViewByPosition2 != null) {
                        int dp = (-(findViewByPosition2.getTop() - paddingTop)) + ((findFirstVisibleItemPosition - 1) * (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1));
                        if (dp < Math.abs(i)) {
                            i2 = -dp;
                            if (this.val$viewPage.dialogsType == 0 && this.val$viewPage.listView.getViewOffset() != 0.0f && i > 0 && z2) {
                                viewOffset = ((int) this.val$viewPage.listView.getViewOffset()) - i;
                                if (viewOffset >= 0.0f) {
                                    i3 = (int) viewOffset;
                                    viewOffset = 0.0f;
                                } else {
                                    i3 = 0;
                                }
                                this.val$viewPage.listView.setViewsOffset(viewOffset);
                                i2 = i3;
                            }
                            if (this.val$viewPage.dialogsType != 0 && this.val$viewPage.archivePullViewState != 0 && DialogsActivity.this.hasHiddenArchive()) {
                                int scrollVerticallyBy = super.scrollVerticallyBy(i2, recycler, state);
                                if (this.val$viewPage.pullForegroundDrawable != null) {
                                    this.val$viewPage.pullForegroundDrawable.scrollDy = scrollVerticallyBy;
                                }
                                int findFirstVisibleItemPosition2 = this.val$viewPage.layoutManager.findFirstVisibleItemPosition();
                                View view = null;
                                if (findFirstVisibleItemPosition2 == 0) {
                                    view = this.val$viewPage.layoutManager.findViewByPosition(findFirstVisibleItemPosition2);
                                }
                                if (findFirstVisibleItemPosition2 != 0 || view == null || view.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                                    DialogsActivity.this.startArchivePullingTime = 0L;
                                    DialogsActivity.this.canShowHiddenArchive = false;
                                    this.val$viewPage.archivePullViewState = 2;
                                    if (this.val$viewPage.pullForegroundDrawable != null) {
                                        this.val$viewPage.pullForegroundDrawable.resetText();
                                        this.val$viewPage.pullForegroundDrawable.pullProgress = 0.0f;
                                        this.val$viewPage.pullForegroundDrawable.setListView(this.val$viewPage.listView);
                                    }
                                } else {
                                    if (DialogsActivity.this.startArchivePullingTime == 0) {
                                        DialogsActivity.this.startArchivePullingTime = System.currentTimeMillis();
                                    }
                                    if (this.val$viewPage.archivePullViewState == 2 && this.val$viewPage.pullForegroundDrawable != null) {
                                        this.val$viewPage.pullForegroundDrawable.showHidden();
                                    }
                                    float top = ((view.getTop() - paddingTop) / view.getMeasuredHeight()) + 1.0f;
                                    if (top > 1.0f) {
                                        top = 1.0f;
                                    }
                                    long currentTimeMillis = System.currentTimeMillis() - DialogsActivity.this.startArchivePullingTime;
                                    if (top > 0.85f && currentTimeMillis > 220) {
                                        z = true;
                                    }
                                    if (DialogsActivity.this.canShowHiddenArchive != z) {
                                        DialogsActivity.this.canShowHiddenArchive = z;
                                        if (this.val$viewPage.archivePullViewState == 2) {
                                            this.val$viewPage.listView.performHapticFeedback(3, 2);
                                            if (this.val$viewPage.pullForegroundDrawable != null) {
                                                this.val$viewPage.pullForegroundDrawable.colorize(z);
                                            }
                                        }
                                    }
                                    if (this.val$viewPage.archivePullViewState == 2 && i2 - scrollVerticallyBy != 0 && i < 0 && z2) {
                                        this.val$viewPage.listView.setViewsOffset(this.val$viewPage.listView.getViewOffset() - ((i * 0.2f) * (1.0f - (this.val$viewPage.listView.getViewOffset() / PullForegroundDrawable.getMaxOverscroll()))));
                                    }
                                    if (this.val$viewPage.pullForegroundDrawable != null) {
                                        this.val$viewPage.pullForegroundDrawable.pullProgress = top;
                                        this.val$viewPage.pullForegroundDrawable.setListView(this.val$viewPage.listView);
                                    }
                                }
                                if (view != null) {
                                    view.invalidate();
                                }
                                return scrollVerticallyBy;
                            }
                            return super.scrollVerticallyBy(i2, recycler, state);
                        }
                    }
                } else if (findFirstVisibleItemPosition == 0) {
                    View findViewByPosition3 = this.val$viewPage.layoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    float top2 = ((findViewByPosition3.getTop() - paddingTop) / findViewByPosition3.getMeasuredHeight()) + 1.0f;
                    if (top2 > 1.0f) {
                        top2 = 1.0f;
                    }
                    this.val$viewPage.listView.setOverScrollMode(2);
                    i2 = (int) (i * (0.45f - (top2 * 0.25f)));
                    if (i2 > -1) {
                        i2 = -1;
                    }
                    if (DialogsActivity.this.undoView[0].getVisibility() == 0) {
                        DialogsActivity.this.undoView[0].hide(true, 1);
                    }
                    if (this.val$viewPage.dialogsType == 0) {
                        viewOffset = ((int) this.val$viewPage.listView.getViewOffset()) - i;
                        if (viewOffset >= 0.0f) {
                        }
                        this.val$viewPage.listView.setViewsOffset(viewOffset);
                        i2 = i3;
                    }
                    if (this.val$viewPage.dialogsType != 0) {
                    }
                    return super.scrollVerticallyBy(i2, recycler, state);
                }
            }
            i2 = i;
            if (this.val$viewPage.dialogsType == 0) {
            }
            if (this.val$viewPage.dialogsType != 0) {
            }
            return super.scrollVerticallyBy(i2, recycler, state);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    super.onLayoutChildren(recycler, state);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new RuntimeException("Inconsistency detected. dialogsListIsFrozen=" + DialogsActivity.this.dialogsListFrozen + " lastUpdateAction=" + DialogsActivity.this.debugLastUpdateAction);
                }
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new DialogsActivity$9$$ExternalSyntheticLambda0(this.val$viewPage));
            }
        }

        public static /* synthetic */ void lambda$onLayoutChildren$0(ViewPage viewPage) {
            viewPage.dialogsAdapter.notifyDataSetChanged();
        }
    }

    public /* synthetic */ void lambda$createView$5(ViewPage viewPage, View view, int i) {
        int i2 = this.initialDialogsType;
        if (i2 == 10) {
            onItemLongClick(viewPage.listView, view, i, 0.0f, 0.0f, viewPage.dialogsType, viewPage.dialogsAdapter);
        } else if ((i2 != 11 && i2 != 13) || i != 1) {
            onItemClick(view, i, viewPage.dialogsAdapter);
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean("forImport", true);
            bundle.putLongArray("result", new long[]{getUserConfig().getClientUserId()});
            bundle.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                bundle.putString("title", string);
            }
            GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle);
            groupCreateFinalActivity.setDelegate(new AnonymousClass10());
            presentFragment(groupCreateFinalActivity);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$10 */
    /* loaded from: classes3.dex */
    public class AnonymousClass10 implements GroupCreateFinalActivity.GroupCreateFinalActivityDelegate {
        @Override // org.telegram.ui.GroupCreateFinalActivity.GroupCreateFinalActivityDelegate
        public void didFailChatCreation() {
        }

        @Override // org.telegram.ui.GroupCreateFinalActivity.GroupCreateFinalActivityDelegate
        public void didStartChatCreation() {
        }

        AnonymousClass10() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.GroupCreateFinalActivity.GroupCreateFinalActivityDelegate
        public void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity, long j) {
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(Long.valueOf(-j));
            DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
            if (DialogsActivity.this.closeFragment) {
                DialogsActivity.this.removeSelfFromStack();
            }
            dialogsActivityDelegate.didSelectDialogs(DialogsActivity.this, arrayList, null, true);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$11 */
    /* loaded from: classes3.dex */
    class AnonymousClass11 implements RecyclerListView.OnItemLongClickListenerExtended {
        final /* synthetic */ ViewPage val$viewPage;

        AnonymousClass11(ViewPage viewPage) {
            DialogsActivity.this = r1;
            this.val$viewPage = viewPage;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public boolean onItemClick(View view, int i, float f, float f2) {
            if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0 || !DialogsActivity.this.filterTabsView.isEditing()) {
                return DialogsActivity.this.onItemLongClick(this.val$viewPage.listView, view, i, f, f2, this.val$viewPage.dialogsType, this.val$viewPage.dialogsAdapter);
            }
            return false;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onMove(float f, float f2) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.movePreviewFragment(f2);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onLongClickRelease() {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.finishPreviewFragment();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$12 */
    /* loaded from: classes3.dex */
    class AnonymousClass12 extends RecyclerView.OnScrollListener {
        final /* synthetic */ ViewPage val$viewPage;
        private boolean wasManualScroll;

        AnonymousClass12(ViewPage viewPage) {
            DialogsActivity.this = r1;
            this.val$viewPage = viewPage;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i != 1) {
                DialogsActivity.this.scrollingManually = false;
            } else {
                this.wasManualScroll = true;
                DialogsActivity.this.scrollingManually = true;
            }
            if (i == 0) {
                this.wasManualScroll = false;
                DialogsActivity.this.disableActionBarScrolling = false;
                if (DialogsActivity.this.waitingForScrollFinished) {
                    DialogsActivity.this.waitingForScrollFinished = false;
                    if (DialogsActivity.this.updatePullAfterScroll) {
                        this.val$viewPage.listView.updatePullState();
                        DialogsActivity.this.updatePullAfterScroll = false;
                    }
                    this.val$viewPage.dialogsAdapter.notifyDataSetChanged();
                }
                if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0 || DialogsActivity.this.viewPages[0].listView != recyclerView) {
                    return;
                }
                int i2 = (int) (-((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                if (i2 == 0 || i2 == currentActionBarHeight) {
                    return;
                }
                if (i2 >= currentActionBarHeight / 2) {
                    if (!DialogsActivity.this.viewPages[0].listView.canScrollVertically(1)) {
                        return;
                    }
                    recyclerView.smoothScrollBy(0, currentActionBarHeight - i2);
                    return;
                }
                recyclerView.smoothScrollBy(0, -i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View childAt;
            int findFirstVisibleItemPosition;
            boolean z;
            boolean z2;
            this.val$viewPage.dialogsItemAnimator.onListScroll(-i2);
            DialogsActivity.this.checkListLoad(this.val$viewPage);
            if (DialogsActivity.this.initialDialogsType != 10 && this.wasManualScroll && DialogsActivity.this.floatingButtonContainer.getVisibility() != 8 && recyclerView.getChildCount() > 0 && (findFirstVisibleItemPosition = this.val$viewPage.layoutManager.findFirstVisibleItemPosition()) != -1) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                if (!DialogsActivity.this.hasHiddenArchive() || (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.getAdapterPosition() != 0)) {
                    int top = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : 0;
                    if (DialogsActivity.this.prevPosition == findFirstVisibleItemPosition) {
                        int i3 = DialogsActivity.this.prevTop - top;
                        z = top < DialogsActivity.this.prevTop;
                        if (Math.abs(i3) <= 1) {
                            z2 = false;
                            if (z2 && DialogsActivity.this.scrollUpdated && (z || DialogsActivity.this.scrollingManually)) {
                                DialogsActivity.this.hideFloatingButton(z);
                            }
                            DialogsActivity.this.prevPosition = findFirstVisibleItemPosition;
                            DialogsActivity.this.prevTop = top;
                            DialogsActivity.this.scrollUpdated = true;
                        }
                    } else {
                        z = findFirstVisibleItemPosition > DialogsActivity.this.prevPosition;
                    }
                    z2 = true;
                    if (z2) {
                        DialogsActivity.this.hideFloatingButton(z);
                    }
                    DialogsActivity.this.prevPosition = findFirstVisibleItemPosition;
                    DialogsActivity.this.prevTop = top;
                    DialogsActivity.this.scrollUpdated = true;
                }
            }
            if (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0 && recyclerView == DialogsActivity.this.viewPages[0].listView && !DialogsActivity.this.searching && !((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed() && !DialogsActivity.this.disableActionBarScrolling && DialogsActivity.this.filterTabsViewIsVisible) {
                if (i2 > 0 && DialogsActivity.this.hasHiddenArchive() && DialogsActivity.this.viewPages[0].dialogsType == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.getChildViewHolder(childAt).getAdapterPosition() == 0) {
                    int measuredHeight = childAt.getMeasuredHeight() + (childAt.getTop() - recyclerView.getPaddingTop());
                    if (measuredHeight + i2 > 0) {
                        if (measuredHeight >= 0) {
                            return;
                        }
                        i2 = -measuredHeight;
                    }
                }
                float translationY = ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY();
                float f = translationY - i2;
                if (f < (-ActionBar.getCurrentActionBarHeight())) {
                    f = -ActionBar.getCurrentActionBarHeight();
                } else if (f > 0.0f) {
                    f = 0.0f;
                }
                if (f != translationY) {
                    DialogsActivity.this.setScrollY(f);
                }
            }
            if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((SizeNotifierFrameLayout) ((BaseFragment) DialogsActivity.this).fragmentView).invalidateBlur();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$13 */
    /* loaded from: classes3.dex */
    class AnonymousClass13 extends PullForegroundDrawable {
        final /* synthetic */ ViewPage val$viewPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass13(DialogsActivity dialogsActivity, String str, String str2, ViewPage viewPage) {
            super(str, str2);
            this.val$viewPage = viewPage;
        }

        @Override // org.telegram.ui.Components.PullForegroundDrawable
        protected float getViewOffset() {
            return this.val$viewPage.listView.getViewOffset();
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$14 */
    /* loaded from: classes3.dex */
    class AnonymousClass14 extends DialogsAdapter {
        final /* synthetic */ ViewPage val$viewPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass14(DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, ViewPage viewPage) {
            super(dialogsActivity2, context, i, i2, z, arrayList, i3);
            this.val$viewPage = viewPage;
        }

        @Override // org.telegram.ui.Adapters.DialogsAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            this.val$viewPage.lastItemsCount = getItemCount();
            try {
                super.notifyDataSetChanged();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$15 */
    /* loaded from: classes3.dex */
    class AnonymousClass15 implements SearchViewPager.ChatPreviewDelegate {
        AnonymousClass15() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
        public void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell) {
            DialogsActivity.this.showChatPreview(dialogCell);
        }

        @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
        public void move(float f) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.movePreviewFragment(f);
            }
        }

        @Override // org.telegram.ui.Components.SearchViewPager.ChatPreviewDelegate
        public void finish() {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.finishPreviewFragment();
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$16 */
    /* loaded from: classes3.dex */
    public class AnonymousClass16 implements DialogsSearchAdapter.DialogsSearchAdapterDelegate {
        AnonymousClass16() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public void searchStateChanged(boolean z, boolean z2) {
            if (DialogsActivity.this.searchViewPager.emptyView.getVisibility() == 0) {
                z2 = true;
            }
            if (DialogsActivity.this.searching && DialogsActivity.this.searchWas && DialogsActivity.this.searchViewPager.emptyView != null) {
                if (z || DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getItemCount() != 0) {
                    DialogsActivity.this.searchViewPager.emptyView.showProgress(true, z2);
                } else {
                    DialogsActivity.this.searchViewPager.emptyView.showProgress(false, z2);
                }
            }
            if (!z || DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getItemCount() != 0) {
                return;
            }
            DialogsActivity.this.searchViewPager.cancelEnterAnimation();
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public void didPressedOnSubDialog(long j) {
            if (DialogsActivity.this.onlySelect) {
                if (!DialogsActivity.this.validateSlowModeDialog(j)) {
                    return;
                }
                if (DialogsActivity.this.selectedDialogs.isEmpty()) {
                    DialogsActivity.this.didSelectResult(j, true, false);
                    return;
                }
                DialogsActivity.this.findAndUpdateCheckBox(j, DialogsActivity.this.addOrRemoveSelectedDialog(j, null));
                DialogsActivity.this.updateSelectedCount();
                ((BaseFragment) DialogsActivity.this).actionBar.closeSearchField();
                return;
            }
            Bundle bundle = new Bundle();
            if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            DialogsActivity.this.closeSearch();
            if (AndroidUtilities.isTablet() && DialogsActivity.this.viewPages != null) {
                for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                    DialogsActivity.this.viewPages[i].dialogsAdapter.setOpenedDialogId(DialogsActivity.this.openedDialogId = j);
                }
                DialogsActivity.this.updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
            }
            if (DialogsActivity.this.searchString != null) {
                if (!DialogsActivity.this.getMessagesController().checkCanOpenChat(bundle, DialogsActivity.this)) {
                    return;
                }
                DialogsActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
                DialogsActivity.this.presentFragment(new ChatActivity(bundle));
            } else if (DialogsActivity.this.getMessagesController().checkCanOpenChat(bundle, DialogsActivity.this)) {
                DialogsActivity.this.presentFragment(new ChatActivity(bundle));
            }
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public void needRemoveHint(long j) {
            TLRPC$User user;
            if (DialogsActivity.this.getParentActivity() == null || (user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(j))) == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("ChatHintsDeleteAlertTitle", 2131625024));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", 2131625023, ContactsController.formatName(user.first_name, user.last_name))));
            builder.setPositiveButton(LocaleController.getString("StickersRemove", 2131628515), new DialogsActivity$16$$ExternalSyntheticLambda2(this, j));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView == null) {
                return;
            }
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }

        public /* synthetic */ void lambda$needRemoveHint$0(long j, DialogInterface dialogInterface, int i) {
            DialogsActivity.this.getMediaDataController().removePeer(j);
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public void needClearList() {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            if (DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isSearchWas() && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isRecentSearchDisplayed()) {
                builder.setTitle(LocaleController.getString("ClearSearchAlertPartialTitle", 2131625171));
                builder.setMessage(LocaleController.formatPluralString("ClearSearchAlertPartial", DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getRecentResultsCount(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString("Clear", 2131625145).toUpperCase(), new DialogsActivity$16$$ExternalSyntheticLambda0(this));
            } else {
                builder.setTitle(LocaleController.getString("ClearSearchAlertTitle", 2131625177));
                builder.setMessage(LocaleController.getString("ClearSearchAlert", 2131625170));
                builder.setPositiveButton(LocaleController.getString("ClearButton", 2131625146).toUpperCase(), new DialogsActivity$16$$ExternalSyntheticLambda1(this));
            }
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        }

        public /* synthetic */ void lambda$needClearList$1(DialogInterface dialogInterface, int i) {
            DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentSearch();
        }

        public /* synthetic */ void lambda$needClearList$2(DialogInterface dialogInterface, int i) {
            if (DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isRecentSearchDisplayed()) {
                DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentSearch();
            } else {
                DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentHashtags();
            }
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public void runResultsEnterAnimation() {
            if (DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.runResultsEnterAnimation();
            }
        }

        @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.DialogsSearchAdapterDelegate
        public boolean isSelected(long j) {
            return DialogsActivity.this.selectedDialogs.contains(Long.valueOf(j));
        }
    }

    public /* synthetic */ void lambda$createView$6(View view, int i) {
        if (this.initialDialogsType == 10) {
            SearchViewPager searchViewPager = this.searchViewPager;
            onItemLongClick(searchViewPager.searchListView, view, i, 0.0f, 0.0f, -1, searchViewPager.dialogsSearchAdapter);
            return;
        }
        onItemClick(view, i, this.searchViewPager.dialogsSearchAdapter);
    }

    /* renamed from: org.telegram.ui.DialogsActivity$17 */
    /* loaded from: classes3.dex */
    class AnonymousClass17 implements RecyclerListView.OnItemLongClickListenerExtended {
        AnonymousClass17() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public boolean onItemClick(View view, int i, float f, float f2) {
            DialogsActivity dialogsActivity = DialogsActivity.this;
            return dialogsActivity.onItemLongClick(dialogsActivity.searchViewPager.searchListView, view, i, f, f2, -1, DialogsActivity.this.searchViewPager.dialogsSearchAdapter);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onMove(float f, float f2) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.movePreviewFragment(f2);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
        public void onLongClickRelease() {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                DialogsActivity.this.finishPreviewFragment();
            }
        }
    }

    public /* synthetic */ void lambda$createView$7(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        updateFiltersView(z, arrayList, arrayList2, z2, true);
    }

    public /* synthetic */ void lambda$createView$8(View view, int i) {
        this.filtersView.cancelClickRunnables(true);
        addSearchFilter(this.filtersView.getFilterAt(i));
    }

    public /* synthetic */ void lambda$createView$9(View view) {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null && actionBarLayout.isInPreviewMode()) {
            finishPreviewFragment();
        } else if (this.initialDialogsType == 10) {
            if (this.delegate == null || this.selectedDialogs.isEmpty()) {
                return;
            }
            this.delegate.didSelectDialogs(this, this.selectedDialogs, null, false);
        } else if (this.floatingButton.getVisibility() != 0) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putBoolean("destroyAfterSelect", true);
            presentFragment(new ContactsActivity(bundle));
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$18 */
    /* loaded from: classes3.dex */
    class AnonymousClass18 extends ViewOutlineProvider {
        AnonymousClass18(DialogsActivity dialogsActivity) {
        }

        @Override // android.view.ViewOutlineProvider
        @SuppressLint({"NewApi"})
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$19 */
    /* loaded from: classes3.dex */
    class AnonymousClass19 extends FragmentContextView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass19(Context context, BaseFragment baseFragment, boolean z) {
            super(context, baseFragment, z);
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.FragmentContextView
        protected void playbackSpeedChanged(float f) {
            float f2 = f - 1.0f;
            if (Math.abs(f2) > 0.001f || Math.abs(f - 1.8f) > 0.001f) {
                DialogsActivity.this.getUndoView().showWithAction(0L, Math.abs(f2) > 0.001f ? 50 : 51, Float.valueOf(f), null, null);
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$20 */
    /* loaded from: classes3.dex */
    class AnonymousClass20 extends ChatActivityEnterView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass20(Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, ChatActivity chatActivity, boolean z) {
            super(activity, sizeNotifierFrameLayout, chatActivity, z);
            DialogsActivity.this = r1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                AndroidUtilities.requestAdjustResize(DialogsActivity.this.getParentActivity(), ((BaseFragment) DialogsActivity.this).classGuid);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$21 */
    /* loaded from: classes3.dex */
    class AnonymousClass21 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void bottomPanelTranslationYChanged(float f) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void didPressAttachButton() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ int getContentViewHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getContentViewHeight(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ TLRPC$TL_channels_sendAsPeers getSendAsPeers() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getSendAsPeers(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ boolean hasForwardingMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasForwardingMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ boolean hasScheduledMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasScheduledMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needChangeVideoPreviewState(int i, float f) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needSendTyping() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needShowMediaBanHint() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needStartRecordAudio(int i) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void needStartRecordVideo(int i, boolean z, int i2) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAttachButtonHidden() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAttachButtonShow() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onAudioVideoInterfaceUpdated() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onMessageEditEnd(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onPreAudioVideoRecord() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onSendLongClick() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onStickersExpandedChange() {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onStickersTab(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onSwitchRecordMode(boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextChanged(CharSequence charSequence, boolean z) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextSelectionChanged(int i, int i2) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onTextSpansChanged(CharSequence charSequence) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void onTrendingStickersShowed(boolean z) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onTrendingStickersShowed(this, z);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onWindowSizeChanged(int i) {
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void openScheduledMessages() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$openScheduledMessages(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void prepareMessageSending() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$prepareMessageSending(this);
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public /* synthetic */ void scrollToSendingMessage() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$scrollToSendingMessage(this);
        }

        AnonymousClass21() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.ChatActivityEnterView.ChatActivityEnterViewDelegate
        public void onMessageSend(CharSequence charSequence, boolean z, int i) {
            if (DialogsActivity.this.delegate == null || DialogsActivity.this.selectedDialogs.isEmpty()) {
                return;
            }
            DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivityDelegate.didSelectDialogs(dialogsActivity, dialogsActivity.selectedDialogs, charSequence, false);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$22 */
    /* loaded from: classes3.dex */
    class AnonymousClass22 extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass22(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", DialogsActivity.this.selectedDialogs.size(), new Object[0]));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.setClickable(true);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$23 */
    /* loaded from: classes3.dex */
    class AnonymousClass23 extends View {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass23(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            String format = String.format("%d", Integer.valueOf(Math.max(1, DialogsActivity.this.selectedDialogs.size())));
            int ceil = (int) Math.ceil(DialogsActivity.this.textPaint.measureText(format));
            int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            DialogsActivity.this.textPaint.setColor(DialogsActivity.this.getThemedColor("dialogRoundCheckBoxCheck"));
            DialogsActivity.this.paint.setColor(DialogsActivity.this.getThemedColor(Theme.isCurrentThemeDark() ? "voipgroup_inviteMembersBackground" : "dialogBackground"));
            int i = max / 2;
            int i2 = measuredWidth - i;
            int i3 = i + measuredWidth;
            DialogsActivity.this.rect.set(i2, 0.0f, i3, getMeasuredHeight());
            canvas.drawRoundRect(DialogsActivity.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), DialogsActivity.this.paint);
            DialogsActivity.this.paint.setColor(DialogsActivity.this.getThemedColor("dialogRoundCheckBox"));
            DialogsActivity.this.rect.set(i2 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), i3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(DialogsActivity.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), DialogsActivity.this.paint);
            canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), DialogsActivity.this.textPaint);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$24 */
    /* loaded from: classes3.dex */
    class AnonymousClass24 extends ViewOutlineProvider {
        AnonymousClass24(DialogsActivity dialogsActivity) {
        }

        @Override // android.view.ViewOutlineProvider
        @SuppressLint({"NewApi"})
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        }
    }

    public /* synthetic */ void lambda$createView$10(View view) {
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        this.delegate.didSelectDialogs(this, this.selectedDialogs, this.commentView.getFieldText(), false);
    }

    public /* synthetic */ boolean lambda$createView$11(FrameLayout frameLayout, View view) {
        if (this.isNextButton) {
            return false;
        }
        onSendLongClick(frameLayout);
        return true;
    }

    /* renamed from: org.telegram.ui.DialogsActivity$25 */
    /* loaded from: classes3.dex */
    class AnonymousClass25 extends FrameLayout {
        private int lastGradientWidth;
        private LinearGradient updateGradient;
        private Paint paint = new Paint();
        private Matrix matrix = new Matrix();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass25(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            if (this.updateGradient != null) {
                this.paint.setColor(-1);
                this.paint.setShader(this.updateGradient);
                this.updateGradient.setLocalMatrix(this.matrix);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                DialogsActivity.this.updateLayoutIcon.setBackgroundGradientDrawable(this.updateGradient);
                DialogsActivity.this.updateLayoutIcon.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int size = View.MeasureSpec.getSize(i);
            if (this.lastGradientWidth != size) {
                this.updateGradient = new LinearGradient(0.0f, 0.0f, size, 0.0f, new int[]{-9846926, -11291731}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.lastGradientWidth = size;
            }
            int measuredWidth = (getMeasuredWidth() - DialogsActivity.this.updateTextView.getMeasuredWidth()) / 2;
            DialogsActivity.this.updateLayoutIcon.setProgressRect(measuredWidth, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(22.0f) + measuredWidth, AndroidUtilities.dp(35.0f));
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            DialogsActivity.this.additionalFloatingTranslation2 = AndroidUtilities.dp(48.0f) - f;
            if (DialogsActivity.this.additionalFloatingTranslation2 < 0.0f) {
                DialogsActivity.this.additionalFloatingTranslation2 = 0.0f;
            }
            if (!DialogsActivity.this.floatingHidden) {
                DialogsActivity.this.updateFloatingButtonOffset();
            }
        }
    }

    public /* synthetic */ void lambda$createView$12(View view) {
        if (!SharedConfig.isAppUpdateAvailable()) {
            return;
        }
        AndroidUtilities.openForView(SharedConfig.pendingAppUpdate.document, true, getParentActivity());
    }

    /* renamed from: org.telegram.ui.DialogsActivity$26 */
    /* loaded from: classes3.dex */
    public class AnonymousClass26 extends UndoView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass26(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (this != DialogsActivity.this.undoView[0] || DialogsActivity.this.undoView[1].getVisibility() == 0) {
                return;
            }
            DialogsActivity.this.additionalFloatingTranslation = (getMeasuredHeight() + AndroidUtilities.dp(8.0f)) - f;
            if (DialogsActivity.this.additionalFloatingTranslation < 0.0f) {
                DialogsActivity.this.additionalFloatingTranslation = 0.0f;
            }
            if (DialogsActivity.this.floatingHidden) {
                return;
            }
            DialogsActivity.this.updateFloatingButtonOffset();
        }

        @Override // org.telegram.ui.Components.UndoView
        protected boolean canUndo() {
            for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                if (DialogsActivity.this.viewPages[i].dialogsItemAnimator.isRunning()) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.telegram.ui.Components.UndoView
        protected void onRemoveDialogAction(long j, int i) {
            if (i == 1 || i == 27) {
                DialogsActivity.this.debugLastUpdateAction = 1;
                DialogsActivity.this.setDialogsListFrozen(true);
                if (DialogsActivity.this.frozenDialogsList == null) {
                    return;
                }
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= DialogsActivity.this.frozenDialogsList.size()) {
                        break;
                    } else if (((TLRPC$Dialog) DialogsActivity.this.frozenDialogsList.get(i3)).id == j) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 < 0) {
                    DialogsActivity.this.setDialogsListFrozen(false);
                    return;
                }
                DialogsActivity.this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                AndroidUtilities.runOnUIThread(new DialogsActivity$26$$ExternalSyntheticLambda0(this, i2, (TLRPC$Dialog) DialogsActivity.this.frozenDialogsList.remove(i2)));
            }
        }

        public /* synthetic */ void lambda$onRemoveDialogAction$0(int i, TLRPC$Dialog tLRPC$Dialog) {
            if (DialogsActivity.this.frozenDialogsList != null) {
                DialogsActivity.this.frozenDialogsList.add(i, tLRPC$Dialog);
                DialogsActivity.this.viewPages[0].dialogsAdapter.notifyItemInserted(i);
                DialogsActivity.this.dialogInsertFinished = 2;
            }
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$27 */
    /* loaded from: classes3.dex */
    class AnonymousClass27 extends View {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass27(Context context) {
            super(context);
            DialogsActivity.this = r1;
        }

        @Override // android.view.View
        public void setAlpha(float f) {
            super.setAlpha(f);
            if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
            }
        }
    }

    public /* synthetic */ void lambda$createView$13(View view) {
        finishPreviewFragment();
    }

    private void updateAppUpdateViews(boolean z) {
        boolean z2;
        if (this.updateLayout == null) {
            return;
        }
        if (SharedConfig.isAppUpdateAvailable()) {
            FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
            z2 = getFileLoader().getPathToAttach(SharedConfig.pendingAppUpdate.document, true).exists();
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.updateLayout.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.updateLayoutAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.updateLayout.setVisibility(0);
            this.updateLayout.setTag(1);
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.updateLayoutAnimator = animatorSet2;
                animatorSet2.setDuration(180L);
                this.updateLayoutAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.updateLayoutAnimator.playTogether(ObjectAnimator.ofFloat(this.updateLayout, View.TRANSLATION_Y, 0.0f));
                this.updateLayoutAnimator.addListener(new AnonymousClass28());
                this.updateLayoutAnimator.start();
                return;
            }
            this.updateLayout.setTranslationY(0.0f);
        } else if (this.updateLayout.getTag() == null) {
        } else {
            this.updateLayout.setTag(null);
            if (z) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.updateLayoutAnimator = animatorSet3;
                animatorSet3.setDuration(180L);
                this.updateLayoutAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.updateLayoutAnimator.playTogether(ObjectAnimator.ofFloat(this.updateLayout, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f)));
                this.updateLayoutAnimator.addListener(new AnonymousClass29());
                this.updateLayoutAnimator.start();
                return;
            }
            this.updateLayout.setTranslationY(AndroidUtilities.dp(48.0f));
            this.updateLayout.setVisibility(4);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$28 */
    /* loaded from: classes3.dex */
    public class AnonymousClass28 extends AnimatorListenerAdapter {
        AnonymousClass28() {
            DialogsActivity.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.updateLayoutAnimator = null;
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$29 */
    /* loaded from: classes3.dex */
    public class AnonymousClass29 extends AnimatorListenerAdapter {
        AnonymousClass29() {
            DialogsActivity.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (DialogsActivity.this.updateLayout.getTag() == null) {
                DialogsActivity.this.updateLayout.setVisibility(4);
            }
            DialogsActivity.this.updateLayoutAnimator = null;
        }
    }

    public void updateContextViewPosition() {
        FilterTabsView filterTabsView = this.filterTabsView;
        float f = 0.0f;
        float measuredHeight = (filterTabsView == null || filterTabsView.getVisibility() == 8) ? 0.0f : this.filterTabsView.getMeasuredHeight();
        ViewPagerFixed.TabsView tabsView = this.searchTabsView;
        float measuredHeight2 = (tabsView == null || tabsView.getVisibility() == 8) ? 0.0f : this.searchTabsView.getMeasuredHeight();
        if (this.fragmentContextView != null) {
            FragmentContextView fragmentContextView = this.fragmentLocationContextView;
            float dp = (fragmentContextView == null || fragmentContextView.getVisibility() != 0) ? 0.0f : AndroidUtilities.dp(36.0f) + 0.0f;
            FragmentContextView fragmentContextView2 = this.fragmentContextView;
            float topPadding = dp + fragmentContextView2.getTopPadding() + this.actionBar.getTranslationY();
            float f2 = this.searchAnimationProgress;
            fragmentContextView2.setTranslationY(topPadding + ((1.0f - f2) * measuredHeight) + (f2 * measuredHeight2) + this.tabsYOffset);
        }
        if (this.fragmentLocationContextView != null) {
            FragmentContextView fragmentContextView3 = this.fragmentContextView;
            if (fragmentContextView3 != null && fragmentContextView3.getVisibility() == 0) {
                f = 0.0f + AndroidUtilities.dp(this.fragmentContextView.getStyleHeight()) + this.fragmentContextView.getTopPadding();
            }
            FragmentContextView fragmentContextView4 = this.fragmentLocationContextView;
            float topPadding2 = f + fragmentContextView4.getTopPadding() + this.actionBar.getTranslationY();
            float f3 = this.searchAnimationProgress;
            fragmentContextView4.setTranslationY(topPadding2 + (measuredHeight * (1.0f - f3)) + (measuredHeight2 * f3) + this.tabsYOffset);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateFiltersView(boolean z, ArrayList<Object> arrayList, ArrayList<FiltersView.DateData> arrayList2, boolean z2, boolean z3) {
        boolean z4;
        ViewPagerFixed.TabsView tabsView;
        if (!this.searchIsShowed || this.onlySelect) {
            return;
        }
        ArrayList<FiltersView.MediaFilterData> currentSearchFilters = this.searchViewPager.getCurrentSearchFilters();
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i = 0; i < currentSearchFilters.size(); i++) {
            if (currentSearchFilters.get(i).isMedia()) {
                z6 = true;
            } else if (currentSearchFilters.get(i).filterType == 4) {
                z7 = true;
            } else if (currentSearchFilters.get(i).filterType == 6) {
                z8 = true;
            } else if (currentSearchFilters.get(i).filterType == 7) {
                z5 = true;
            }
        }
        if (z5) {
            z2 = false;
        }
        boolean z9 = (arrayList != null && !arrayList.isEmpty()) || (arrayList2 != null && !arrayList2.isEmpty()) || z2;
        if ((z6 || z9 || !z) && z9) {
            if (arrayList == null || arrayList.isEmpty() || z7) {
                arrayList = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty() || z8) {
                arrayList2 = null;
            }
            if (arrayList != null || arrayList2 != null || z2) {
                this.filtersView.setUsersAndDates(arrayList, arrayList2, z2);
                z4 = true;
                if (!z4) {
                    this.filtersView.setUsersAndDates(null, null, false);
                }
                if (!z3) {
                    this.filtersView.getAdapter().notifyDataSetChanged();
                }
                tabsView = this.searchTabsView;
                if (tabsView != null) {
                    tabsView.hide(z4, true);
                }
                this.filtersView.setEnabled(z4);
                this.filtersView.setVisibility(0);
            }
        }
        z4 = false;
        if (!z4) {
        }
        if (!z3) {
        }
        tabsView = this.searchTabsView;
        if (tabsView != null) {
        }
        this.filtersView.setEnabled(z4);
        this.filtersView.setVisibility(0);
    }

    private void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        if (!this.searchIsShowed) {
            return;
        }
        ArrayList<FiltersView.MediaFilterData> currentSearchFilters = this.searchViewPager.getCurrentSearchFilters();
        if (!currentSearchFilters.isEmpty()) {
            for (int i = 0; i < currentSearchFilters.size(); i++) {
                if (mediaFilterData.isSameType(currentSearchFilters.get(i))) {
                    return;
                }
            }
        }
        currentSearchFilters.add(mediaFilterData);
        this.actionBar.setSearchFilter(mediaFilterData);
        this.actionBar.setSearchFieldText("");
        updateFiltersView(true, null, null, false, true);
    }

    private void createActionMode(String str) {
        if (this.actionBar.actionModeIsExist(str)) {
            return;
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, str);
        createActionMode.setBackgroundColor(0);
        createActionMode.drawBlur = false;
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor("actionBarActionModeDefaultIcon"));
        createActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(DialogsActivity$$ExternalSyntheticLambda28.INSTANCE);
        this.pinItem = createActionMode.addItemWithWidth(100, 2131165863, AndroidUtilities.dp(54.0f));
        this.muteItem = createActionMode.addItemWithWidth(104, 2131165820, AndroidUtilities.dp(54.0f));
        this.archive2Item = createActionMode.addItemWithWidth(107, 2131165637, AndroidUtilities.dp(54.0f));
        this.deleteItem = createActionMode.addItemWithWidth(102, 2131165702, AndroidUtilities.dp(54.0f), LocaleController.getString("Delete", 2131625384));
        ActionBarMenuItem addItemWithWidth = createActionMode.addItemWithWidth(0, 2131165453, AndroidUtilities.dp(54.0f), LocaleController.getString("AccDescrMoreOptions", 2131624003));
        this.archiveItem = addItemWithWidth.addSubItem(105, 2131165637, LocaleController.getString("Archive", 2131624401));
        this.pin2Item = addItemWithWidth.addSubItem(108, 2131165863, LocaleController.getString("DialogPin", 2131625482));
        this.addToFolderItem = addItemWithWidth.addSubItem(109, 2131165632, LocaleController.getString("FilterAddTo", 2131625865));
        this.removeFromFolderItem = addItemWithWidth.addSubItem(110, 2131165898, LocaleController.getString("FilterRemoveFrom", 2131625924));
        this.readItem = addItemWithWidth.addSubItem(101, 2131165795, LocaleController.getString("MarkAsRead", 2131626589));
        this.clearItem = addItemWithWidth.addSubItem(103, 2131165682, LocaleController.getString("ClearHistory", 2131625154));
        this.blockItem = addItemWithWidth.addSubItem(106, 2131165651, LocaleController.getString("BlockUser", 2131624690));
        this.actionModeViews.add(this.pinItem);
        this.actionModeViews.add(this.archive2Item);
        this.actionModeViews.add(this.muteItem);
        this.actionModeViews.add(this.deleteItem);
        this.actionModeViews.add(addItemWithWidth);
        if (str != null) {
            return;
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass30());
    }

    /* renamed from: org.telegram.ui.DialogsActivity$30 */
    /* loaded from: classes3.dex */
    public class AnonymousClass30 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass30() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
        public void onItemClick(int i) {
            if ((i == 201 || i == 200 || i == 202) && DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.onActionBarItemClick(i);
            } else if (i == -1) {
                if (DialogsActivity.this.filterTabsView == null || !DialogsActivity.this.filterTabsView.isEditing()) {
                    if (((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                        if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0 || !DialogsActivity.this.searchViewPager.actionModeShowing()) {
                            DialogsActivity.this.hideActionMode(true);
                            return;
                        } else {
                            DialogsActivity.this.searchViewPager.hideActionMode();
                            return;
                        }
                    } else if (!DialogsActivity.this.onlySelect && DialogsActivity.this.folderId == 0) {
                        if (((BaseFragment) DialogsActivity.this).parentLayout == null) {
                            return;
                        }
                        ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().openDrawer(false);
                        return;
                    } else {
                        DialogsActivity.this.finishFragment();
                        return;
                    }
                }
                DialogsActivity.this.filterTabsView.setIsEditing(false);
                DialogsActivity.this.showDoneItem(false);
            } else if (i == 1) {
                if (DialogsActivity.this.getParentActivity() == null) {
                    return;
                }
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                DialogsActivity.this.passcodeItem.getLocationInWindow(iArr);
                ((LaunchActivity) DialogsActivity.this.getParentActivity()).showPasscodeActivity(false, true, iArr[0] + (DialogsActivity.this.passcodeItem.getMeasuredWidth() / 2), iArr[1] + (DialogsActivity.this.passcodeItem.getMeasuredHeight() / 2), new DialogsActivity$30$$ExternalSyntheticLambda1(this), new DialogsActivity$30$$ExternalSyntheticLambda0(this));
                DialogsActivity.this.updatePasscodeButton();
            } else if (i == 2) {
                DialogsActivity.this.presentFragment(new ProxyListActivity());
            } else if (i == 3) {
                DialogsActivity.this.showSearch(true, true, true);
                ((BaseFragment) DialogsActivity.this).actionBar.openSearchField(true);
            } else if (i >= 10 && i < 14) {
                if (DialogsActivity.this.getParentActivity() == null) {
                    return;
                }
                DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                LaunchActivity launchActivity = (LaunchActivity) DialogsActivity.this.getParentActivity();
                launchActivity.switchToAccount(i - 10, true);
                DialogsActivity dialogsActivity = new DialogsActivity(((BaseFragment) DialogsActivity.this).arguments);
                dialogsActivity.setDelegate(dialogsActivityDelegate);
                launchActivity.presentFragment(dialogsActivity, false, true);
            } else if (i == 109) {
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                FiltersListBottomSheet filtersListBottomSheet = new FiltersListBottomSheet(dialogsActivity2, dialogsActivity2.selectedDialogs);
                filtersListBottomSheet.setDelegate(new DialogsActivity$30$$ExternalSyntheticLambda2(this));
                DialogsActivity.this.showDialog(filtersListBottomSheet);
            } else if (i == 110) {
                MessagesController.DialogFilter dialogFilter = DialogsActivity.this.getMessagesController().dialogFilters.get(DialogsActivity.this.viewPages[0].selectedType);
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                ArrayList<Long> dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity3, dialogFilter, dialogsActivity3.selectedDialogs, false, false);
                if ((dialogFilter != null ? dialogFilter.neverShow.size() : 0) + dialogsCount.size() > 100) {
                    DialogsActivity dialogsActivity4 = DialogsActivity.this;
                    dialogsActivity4.showDialog(AlertsCreator.createSimpleAlert(dialogsActivity4.getParentActivity(), LocaleController.getString("FilterAddToAlertFullTitle", 2131625867), LocaleController.getString("FilterAddToAlertFullText", 2131625866)).create());
                    return;
                }
                if (!dialogsCount.isEmpty()) {
                    dialogFilter.neverShow.addAll(dialogsCount);
                    for (int i2 = 0; i2 < dialogsCount.size(); i2++) {
                        Long l = dialogsCount.get(i2);
                        dialogFilter.alwaysShow.remove(l);
                        dialogFilter.pinnedDialogs.delete(l.longValue());
                    }
                    FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, false, false, DialogsActivity.this, null);
                }
                DialogsActivity.this.getUndoView().showWithAction(dialogsCount.size() == 1 ? dialogsCount.get(0).longValue() : 0L, 21, Integer.valueOf(dialogsCount.size()), dialogFilter, (Runnable) null, (Runnable) null);
                DialogsActivity.this.hideActionMode(false);
            } else {
                if (i != 100 && i != 101 && i != 102 && i != 103 && i != 104 && i != 105 && i != 106 && i != 107 && i != 108) {
                    return;
                }
                DialogsActivity dialogsActivity5 = DialogsActivity.this;
                dialogsActivity5.performSelectedDialogsAction(dialogsActivity5.selectedDialogs, i, true);
            }
        }

        public /* synthetic */ void lambda$onItemClick$0() {
            DialogsActivity.this.passcodeItem.setAlpha(1.0f);
        }

        public /* synthetic */ void lambda$onItemClick$1() {
            DialogsActivity.this.passcodeItem.setAlpha(0.0f);
        }

        public /* synthetic */ void lambda$onItemClick$2(MessagesController.DialogFilter dialogFilter) {
            ArrayList<Long> arrayList;
            long j;
            ArrayList<Long> arrayList2;
            DialogsActivity dialogsActivity = DialogsActivity.this;
            ArrayList<Long> dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity, dialogFilter, dialogsActivity.selectedDialogs, true, false);
            int size = (dialogFilter != null ? dialogFilter.alwaysShow.size() : 0) + dialogsCount.size();
            if ((size <= DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitDefault || DialogsActivity.this.getUserConfig().isPremium()) && size <= DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitPremium) {
                if (dialogFilter != null) {
                    if (!dialogsCount.isEmpty()) {
                        for (int i = 0; i < dialogsCount.size(); i++) {
                            dialogFilter.neverShow.remove(dialogsCount.get(i));
                        }
                        dialogFilter.alwaysShow.addAll(dialogsCount);
                        arrayList = dialogsCount;
                        FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, DialogsActivity.this, null);
                    } else {
                        arrayList = dialogsCount;
                    }
                    if (arrayList.size() == 1) {
                        arrayList2 = arrayList;
                        j = arrayList2.get(0).longValue();
                    } else {
                        arrayList2 = arrayList;
                        j = 0;
                    }
                    DialogsActivity.this.getUndoView().showWithAction(j, 20, Integer.valueOf(arrayList2.size()), dialogFilter, (Runnable) null, (Runnable) null);
                } else {
                    DialogsActivity.this.presentFragment(new FilterCreateActivity(null, dialogsCount));
                }
                DialogsActivity.this.hideActionMode(true);
                return;
            }
            DialogsActivity dialogsActivity2 = DialogsActivity.this;
            DialogsActivity dialogsActivity3 = DialogsActivity.this;
            dialogsActivity2.showDialog(new LimitReachedBottomSheet(dialogsActivity3, ((BaseFragment) dialogsActivity3).fragmentView.getContext(), 4, ((BaseFragment) DialogsActivity.this).currentAccount));
        }
    }

    public void switchToCurrentSelectedMode(boolean z) {
        ViewPage[] viewPageArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            viewPageArr = this.viewPages;
            if (i2 >= viewPageArr.length) {
                break;
            }
            viewPageArr[i2].listView.stopScroll();
            i2++;
        }
        viewPageArr[z ? 1 : 0].listView.getAdapter();
        MessagesController.DialogFilter dialogFilter = getMessagesController().dialogFilters.get(this.viewPages[z].selectedType);
        if (dialogFilter.isDefault()) {
            this.viewPages[z].dialogsType = 0;
            this.viewPages[z].listView.updatePullState();
        } else {
            if (this.viewPages[!z ? 1 : 0].dialogsType == 7) {
                this.viewPages[z].dialogsType = 8;
            } else {
                this.viewPages[z].dialogsType = 7;
            }
            this.viewPages[z].listView.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.viewPages[z].dialogsType == 8 ? 1 : 0);
        }
        this.viewPages[1].isLocked = dialogFilter.locked;
        this.viewPages[z].dialogsAdapter.setDialogsType(this.viewPages[z].dialogsType);
        LinearLayoutManager linearLayoutManager = this.viewPages[z].layoutManager;
        if (this.viewPages[z].dialogsType == 0 && hasHiddenArchive()) {
            i = 1;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, (int) this.actionBar.getTranslationY());
        checkListLoad(this.viewPages[z]);
    }

    public void showScrollbars(boolean z) {
        if (this.viewPages == null || this.scrollBarVisible == z) {
            return;
        }
        this.scrollBarVisible = z;
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            if (z) {
                viewPageArr[i].listView.setScrollbarFadingEnabled(false);
            }
            this.viewPages[i].listView.setVerticalScrollBarEnabled(z);
            if (z) {
                this.viewPages[i].listView.setScrollbarFadingEnabled(true);
            }
            i++;
        }
    }

    private void updateFilterTabs(boolean z, boolean z2) {
        int findFirstVisibleItemPosition;
        boolean z3;
        int i;
        int i2;
        if (this.filterTabsView == null || this.inPreviewMode || this.searchIsShowed) {
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            this.scrimPopupWindow = null;
        }
        ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
        MessagesController.getMainSettings(this.currentAccount);
        if (arrayList.size() > 1) {
            if (z || this.filterTabsView.getVisibility() != 0) {
                boolean z4 = this.filterTabsView.getVisibility() != 0 ? false : z2;
                this.canShowFilterTabsView = true;
                boolean isEmpty = this.filterTabsView.isEmpty();
                updateFilterTabsVisibility(z2);
                int currentTabId = this.filterTabsView.getCurrentTabId();
                int currentTabStableId = this.filterTabsView.getCurrentTabStableId();
                if (currentTabId == this.filterTabsView.getDefaultTabId() || currentTabId < arrayList.size()) {
                    z3 = false;
                } else {
                    this.filterTabsView.resetTabId();
                    z3 = true;
                }
                this.filterTabsView.removeTabs();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    if (arrayList.get(i3).isDefault()) {
                        i2 = i3;
                        this.filterTabsView.addTab(i3, 0, LocaleController.getString("FilterAllChats", 2131625870), true, arrayList.get(i3).locked);
                    } else {
                        i2 = i3;
                        this.filterTabsView.addTab(i2, arrayList.get(i2).localId, arrayList.get(i2).name, false, arrayList.get(i2).locked);
                    }
                    i3 = i2 + 1;
                }
                if (currentTabStableId >= 0) {
                    if (this.filterTabsView.getStableId(this.viewPages[0].selectedType) != currentTabStableId) {
                        this.viewPages[0].selectedType = currentTabId;
                        isEmpty = true;
                    }
                    if (z3) {
                        this.filterTabsView.selectTabWithStableId(currentTabStableId);
                    }
                }
                int i4 = 0;
                while (true) {
                    ViewPage[] viewPageArr = this.viewPages;
                    if (i4 >= viewPageArr.length) {
                        break;
                    }
                    if (viewPageArr[i4].selectedType >= arrayList.size()) {
                        i = 1;
                        this.viewPages[i4].selectedType = arrayList.size() - 1;
                    } else {
                        i = 1;
                    }
                    this.viewPages[i4].listView.setScrollingTouchSlop(i);
                    i4++;
                }
                this.filterTabsView.finishAddingTabs(z4);
                if (isEmpty) {
                    switchToCurrentSelectedMode(false);
                }
                ActionBarLayout actionBarLayout = this.parentLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(currentTabId == this.filterTabsView.getFirstTabId() || SharedConfig.getChatSwipeAction(this.currentAccount) != 5);
                }
                FilterTabsView filterTabsView = this.filterTabsView;
                if (filterTabsView.isLocked(filterTabsView.getCurrentTabId())) {
                    this.filterTabsView.selectFirstTab();
                }
            }
        } else {
            if (this.filterTabsView.getVisibility() != 8) {
                this.filterTabsView.setIsEditing(false);
                showDoneItem(false);
                this.maybeStartTracking = false;
                if (this.startedTracking) {
                    this.startedTracking = false;
                    this.viewPages[0].setTranslationX(0.0f);
                    ViewPage[] viewPageArr2 = this.viewPages;
                    viewPageArr2[1].setTranslationX(viewPageArr2[0].getMeasuredWidth());
                }
                if (this.viewPages[0].selectedType != this.filterTabsView.getDefaultTabId()) {
                    this.viewPages[0].selectedType = this.filterTabsView.getDefaultTabId();
                    this.viewPages[0].dialogsAdapter.setDialogsType(0);
                    this.viewPages[0].dialogsType = 0;
                    this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                }
                this.viewPages[1].setVisibility(8);
                this.viewPages[1].selectedType = 0;
                this.viewPages[1].dialogsAdapter.setDialogsType(0);
                this.viewPages[1].dialogsType = 0;
                this.viewPages[1].dialogsAdapter.notifyDataSetChanged();
                this.canShowFilterTabsView = false;
                updateFilterTabsVisibility(z2);
                int i5 = 0;
                while (true) {
                    ViewPage[] viewPageArr3 = this.viewPages;
                    if (i5 >= viewPageArr3.length) {
                        break;
                    }
                    if (viewPageArr3[i5].dialogsType == 0 && this.viewPages[i5].archivePullViewState == 2 && hasHiddenArchive() && ((findFirstVisibleItemPosition = this.viewPages[i5].layoutManager.findFirstVisibleItemPosition()) == 0 || findFirstVisibleItemPosition == 1)) {
                        this.viewPages[i5].layoutManager.scrollToPositionWithOffset(1, 0);
                    }
                    this.viewPages[i5].listView.setScrollingTouchSlop(0);
                    this.viewPages[i5].listView.requestLayout();
                    this.viewPages[i5].requestLayout();
                    i5++;
                }
            }
            ActionBarLayout actionBarLayout2 = this.parentLayout;
            if (actionBarLayout2 != null) {
                actionBarLayout2.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(true);
            }
        }
        updateCounters(false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void finishFragment() {
        super.finishFragment();
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        int i;
        View view;
        super.onResume();
        if (!this.parentLayout.isInPreviewMode() && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
            this.parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(this.viewPages[0].selectedType == this.filterTabsView.getFirstTabId() || this.searchIsShowed || SharedConfig.getChatSwipeAction(this.currentAccount) != 5);
        }
        if (this.viewPages != null) {
            int i2 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i2 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i2].dialogsAdapter.notifyDataSetChanged();
                i2++;
            }
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onResume();
        }
        if (!this.onlySelect && this.folderId == 0) {
            getMediaDataController().checkStickers(4);
        }
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            searchViewPager.onResume();
        }
        if ((this.afterSignup || getUserConfig().unacceptedTermsOfService == null) && this.checkPermission && !this.onlySelect && (i = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.checkPermission = false;
                boolean z = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda46(this, z, (i <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0, parentActivity), (!this.afterSignup || !z) ? 0L : 4000L);
            }
        } else if (!this.onlySelect && XiaomiUtilities.isMIUI() && Build.VERSION.SDK_INT >= 19 && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
            if (getParentActivity() == null || MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                return;
            }
            showDialog(new AlertDialog.Builder(getParentActivity()).setTopAnimation(2131558505, 72, false, Theme.getColor("dialogTopBackground")).setMessage(LocaleController.getString("PermissionXiaomiLockscreen", 2131627538)).setPositiveButton(LocaleController.getString("PermissionOpenSettings", 2131627535), new DialogsActivity$$ExternalSyntheticLambda9(this)).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", 2131625261), DialogsActivity$$ExternalSyntheticLambda14.INSTANCE).create());
        }
        showFiltersHint();
        if (this.viewPages != null) {
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i3 >= viewPageArr2.length) {
                    break;
                }
                if (viewPageArr2[i3].dialogsType == 0 && this.viewPages[i3].archivePullViewState == 2 && this.viewPages[i3].layoutManager.findFirstVisibleItemPosition() == 0 && hasHiddenArchive()) {
                    this.viewPages[i3].layoutManager.scrollToPositionWithOffset(1, 0);
                }
                if (i3 == 0) {
                    this.viewPages[i3].dialogsAdapter.resume();
                } else {
                    this.viewPages[i3].dialogsAdapter.pause();
                }
                i3++;
            }
        }
        showNextSupportedSuggestion();
        Bulletin.addDelegate(this, new AnonymousClass31());
        if (this.searchIsShowed) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        updateVisibleRows(0, false);
        updateProxyButton(false, true);
        checkSuggestClearDatabase();
    }

    public /* synthetic */ void lambda$onResume$17(boolean z, boolean z2, Activity activity) {
        this.afterSignup = false;
        if (z || z2) {
            this.askingForPermissions = true;
            if (z && this.askAboutContacts && getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(activity, new DialogsActivity$$ExternalSyntheticLambda49(this)).create();
                this.permissionDialog = create;
                showDialog(create);
            } else if (z2 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (!(activity instanceof BasePermissionsActivity)) {
                    return;
                }
                AlertDialog createPermissionErrorAlert = ((BasePermissionsActivity) activity).createPermissionErrorAlert(2131558508, LocaleController.getString(2131627537));
                this.permissionDialog = createPermissionErrorAlert;
                showDialog(createPermissionErrorAlert);
            } else {
                askForPermissons(true);
            }
        }
    }

    public /* synthetic */ void lambda$onResume$16(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).apply();
        askForPermissons(false);
    }

    public /* synthetic */ void lambda$onResume$18(DialogInterface dialogInterface, int i) {
        Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
        if (permissionManagerIntent != null) {
            try {
                try {
                    getParentActivity().startActivity(permissionManagerIntent);
                } catch (Exception unused) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    getParentActivity().startActivity(intent);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static /* synthetic */ void lambda$onResume$19(DialogInterface dialogInterface, int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$31 */
    /* loaded from: classes3.dex */
    public class AnonymousClass31 implements Bulletin.Delegate {
        @Override // org.telegram.ui.Components.Bulletin.Delegate
        public /* synthetic */ int getBottomOffset(int i) {
            return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
        }

        @Override // org.telegram.ui.Components.Bulletin.Delegate
        public /* synthetic */ void onHide(Bulletin bulletin) {
            Bulletin.Delegate.CC.$default$onHide(this, bulletin);
        }

        AnonymousClass31() {
            DialogsActivity.this = r1;
        }

        @Override // org.telegram.ui.Components.Bulletin.Delegate
        public void onOffsetChange(float f) {
            if (DialogsActivity.this.undoView[0] == null || DialogsActivity.this.undoView[0].getVisibility() != 0) {
                DialogsActivity.this.additionalFloatingTranslation = f;
                if (DialogsActivity.this.additionalFloatingTranslation < 0.0f) {
                    DialogsActivity.this.additionalFloatingTranslation = 0.0f;
                }
                if (DialogsActivity.this.floatingHidden) {
                    return;
                }
                DialogsActivity.this.updateFloatingButtonOffset();
            }
        }

        @Override // org.telegram.ui.Components.Bulletin.Delegate
        public void onShow(Bulletin bulletin) {
            if (DialogsActivity.this.undoView[0] == null || DialogsActivity.this.undoView[0].getVisibility() != 0) {
                return;
            }
            DialogsActivity.this.undoView[0].hide(true, 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean presentFragment(BaseFragment baseFragment) {
        boolean presentFragment = super.presentFragment(baseFragment);
        if (presentFragment && this.viewPages != null) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].dialogsAdapter.pause();
                i++;
            }
        }
        return presentFragment;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onResume();
        }
        UndoView[] undoViewArr = this.undoView;
        int i = 0;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
        Bulletin.removeDelegate(this);
        if (this.viewPages != null) {
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    return;
                }
                viewPageArr[i].dialogsAdapter.pause();
                i++;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed() {
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            return false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.isEditing()) {
            this.filterTabsView.setIsEditing(false);
            showDoneItem(false);
            return false;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.isActionModeShowed()) {
            if (this.searchViewPager.getVisibility() == 0) {
                this.searchViewPager.hideActionMode();
                hideActionMode(true);
            } else {
                hideActionMode(true);
            }
            return false;
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0 && !this.tabsAnimationInProgress && !this.filterTabsView.isAnimatingIndicator() && !this.startedTracking && !this.filterTabsView.isFirstTabSelected()) {
            this.filterTabsView.selectFirstTab();
            return false;
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            this.commentView.hidePopup(true);
            return false;
        }
        return super.onBackPressed();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyHidden() {
        if (this.closeSearchFieldOnHide) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                this.searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                this.searchObject = null;
            }
            this.closeSearchFieldOnHide = false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.getVisibility() == 0 && this.filterTabsViewIsVisible) {
            int i = (int) (-this.actionBar.getTranslationY());
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight) {
                if (i >= currentActionBarHeight / 2) {
                    if (this.viewPages[0].listView.canScrollVertically(1)) {
                        setScrollY(-currentActionBarHeight);
                    }
                } else {
                    setScrollY(0.0f);
                }
            }
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        if (z || this.avatarContainer == null) {
            return;
        }
        this.actionBar.setBackground(null);
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).topMargin = 0;
        this.actionBar.removeView(this.avatarContainer);
        this.avatarContainer = null;
        updateFilterTabs(false, false);
        this.floatingButton.setVisibility(0);
        ContentView contentView = (ContentView) this.fragmentView;
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null) {
            contentView.addView(fragmentContextView);
        }
        FragmentContextView fragmentContextView2 = this.fragmentLocationContextView;
        if (fragmentContextView2 == null) {
            return;
        }
        contentView.addView(fragmentContextView2);
    }

    public boolean addOrRemoveSelectedDialog(long j, View view) {
        if (this.selectedDialogs.contains(Long.valueOf(j))) {
            this.selectedDialogs.remove(Long.valueOf(j));
            if (view instanceof DialogCell) {
                ((DialogCell) view).setChecked(false, true);
            } else if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(false, true);
            }
            return false;
        }
        this.selectedDialogs.add(Long.valueOf(j));
        if (view instanceof DialogCell) {
            ((DialogCell) view).setChecked(true, true);
        } else if (view instanceof ProfileSearchCell) {
            ((ProfileSearchCell) view).setChecked(true, true);
        }
        return true;
    }

    public void search(String str, boolean z) {
        showSearch(true, false, z);
        this.actionBar.openSearchField(str, false);
    }

    public void showSearch(boolean z, boolean z2, boolean z3) {
        FilterTabsView filterTabsView;
        ActionBarLayout actionBarLayout;
        int i;
        int i2 = this.initialDialogsType;
        int i3 = 0;
        boolean z4 = false;
        boolean z5 = (i2 == 0 || i2 == 3) ? z3 : false;
        AnimatorSet animatorSet = this.searchAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimator = null;
        }
        Animator animator = this.tabsAlphaAnimator;
        if (animator != null) {
            animator.cancel();
            this.tabsAlphaAnimator = null;
        }
        this.searchIsShowed = z;
        ((SizeNotifierFrameLayout) this.fragmentView).invalidateBlur();
        if (z) {
            boolean onlyDialogsAdapter = this.searchFiltersWasShowed ? false : onlyDialogsAdapter();
            this.searchViewPager.showOnlyDialogsAdapter(onlyDialogsAdapter);
            boolean z6 = !onlyDialogsAdapter;
            this.whiteActionBar = z6;
            if (z6) {
                this.searchFiltersWasShowed = true;
            }
            ContentView contentView = (ContentView) this.fragmentView;
            ViewPagerFixed.TabsView tabsView = this.searchTabsView;
            if (tabsView == null && !onlyDialogsAdapter) {
                this.searchTabsView = this.searchViewPager.createTabsView();
                if (this.filtersView != null) {
                    i = 0;
                    while (i < contentView.getChildCount()) {
                        if (contentView.getChildAt(i) == this.filtersView) {
                            break;
                        }
                        i++;
                    }
                }
                i = -1;
                if (i > 0) {
                    contentView.addView(this.searchTabsView, i, LayoutHelper.createFrame(-1, 44.0f));
                } else {
                    contentView.addView(this.searchTabsView, LayoutHelper.createFrame(-1, 44.0f));
                }
            } else if (tabsView != null && onlyDialogsAdapter) {
                ViewParent parent = tabsView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.searchTabsView);
                }
                this.searchTabsView = null;
            }
            EditTextBoldCursor searchField = this.searchItem.getSearchField();
            if (this.whiteActionBar) {
                searchField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                searchField.setHintTextColor(Theme.getColor("player_time"));
                searchField.setCursorColor(Theme.getColor("chat_messagePanelCursor"));
            } else {
                searchField.setCursorColor(Theme.getColor("actionBarDefaultSearch"));
                searchField.setHintTextColor(Theme.getColor("actionBarDefaultSearchPlaceholder"));
                searchField.setTextColor(Theme.getColor("actionBarDefaultSearch"));
            }
            this.searchViewPager.setKeyboardHeight(((ContentView) this.fragmentView).getKeyboardHeight());
            this.parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(true);
            this.searchViewPager.clear();
            if (this.folderId != 0) {
                addSearchFilter(new FiltersView.MediaFilterData(2131165331, LocaleController.getString("ArchiveSearchFilter", 2131624414), null, 7));
            }
        } else if (this.filterTabsView != null && (actionBarLayout = this.parentLayout) != null) {
            actionBarLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(this.viewPages[0].selectedType == this.filterTabsView.getFirstTabId() || SharedConfig.getChatSwipeAction(this.currentAccount) != 5);
        }
        if (z5 && this.searchViewPager.dialogsSearchAdapter.hasRecentSearch()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z && (filterTabsView = this.filterTabsView) != null && this.canShowFilterTabsView) {
            filterTabsView.setVisibility(0);
        }
        float f = 0.9f;
        float f2 = 0.0f;
        if (z5) {
            if (!z) {
                this.viewPages[0].listView.setVisibility(0);
                this.viewPages[0].setVisibility(0);
            } else {
                this.searchViewPager.setVisibility(0);
                this.searchViewPager.reset();
                updateFiltersView(true, null, null, false, false);
                ViewPagerFixed.TabsView tabsView2 = this.searchTabsView;
                if (tabsView2 != null) {
                    tabsView2.hide(false, false);
                    this.searchTabsView.setVisibility(0);
                }
            }
            setDialogsListFrozen(true);
            this.viewPages[0].listView.setVerticalScrollBarEnabled(false);
            this.searchViewPager.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.searchAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ViewPage viewPage = this.viewPages[0];
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(viewPage, property, fArr));
            ViewPage viewPage2 = this.viewPages[0];
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.9f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(viewPage2, property2, fArr2));
            ViewPage viewPage3 = this.viewPages[0];
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            if (!z) {
                f = 1.0f;
            }
            fArr3[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(viewPage3, property3, fArr3));
            SearchViewPager searchViewPager = this.searchViewPager;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(searchViewPager, property4, fArr4));
            SearchViewPager searchViewPager2 = this.searchViewPager;
            Property property5 = View.SCALE_X;
            float[] fArr5 = new float[1];
            float f3 = 1.05f;
            fArr5[0] = z ? 1.0f : 1.05f;
            arrayList.add(ObjectAnimator.ofFloat(searchViewPager2, property5, fArr5));
            SearchViewPager searchViewPager3 = this.searchViewPager;
            Property property6 = View.SCALE_Y;
            float[] fArr6 = new float[1];
            if (z) {
                f3 = 1.0f;
            }
            fArr6[0] = f3;
            arrayList.add(ObjectAnimator.ofFloat(searchViewPager3, property6, fArr6));
            ActionBarMenuItem actionBarMenuItem = this.passcodeItem;
            if (actionBarMenuItem != null) {
                RLottieImageView iconView = actionBarMenuItem.getIconView();
                Property property7 = View.ALPHA;
                float[] fArr7 = new float[1];
                fArr7[0] = z ? 0.0f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(iconView, property7, fArr7));
            }
            ActionBarMenuItem actionBarMenuItem2 = this.downloadsItem;
            if (actionBarMenuItem2 != null) {
                if (z) {
                    actionBarMenuItem2.setAlpha(0.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, View.ALPHA, 1.0f));
                }
                updateProxyButton(false, false);
            }
            FilterTabsView filterTabsView2 = this.filterTabsView;
            if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0) {
                RecyclerListView tabsContainer = this.filterTabsView.getTabsContainer();
                Property property8 = View.ALPHA;
                float[] fArr8 = new float[1];
                fArr8[0] = z ? 0.0f : 1.0f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(tabsContainer, property8, fArr8).setDuration(100L);
                this.tabsAlphaAnimator = duration;
                duration.addListener(new AnonymousClass32());
            }
            float[] fArr9 = new float[2];
            fArr9[0] = this.searchAnimationProgress;
            if (z) {
                f2 = 1.0f;
            }
            fArr9[1] = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr9);
            ofFloat.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda1(this));
            arrayList.add(ofFloat);
            this.searchAnimator.playTogether(arrayList);
            this.searchAnimator.setDuration(z ? 200L : 180L);
            this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            if (this.filterTabsViewIsVisible) {
                int color = Theme.getColor(this.folderId == 0 ? "actionBarDefault" : "actionBarDefaultArchived");
                int color2 = Theme.getColor("windowBackgroundWhite");
                if (((Math.abs(Color.red(color) - Color.red(color2)) + Math.abs(Color.green(color) - Color.green(color2))) + Math.abs(Color.blue(color) - Color.blue(color2))) / 255.0f > 0.3f) {
                    z4 = true;
                }
                this.searchAnimationTabsDelayedCrossfade = z4;
            } else {
                this.searchAnimationTabsDelayedCrossfade = true;
            }
            if (!z) {
                this.searchAnimator.setStartDelay(20L);
                Animator animator2 = this.tabsAlphaAnimator;
                if (animator2 != null) {
                    if (this.searchAnimationTabsDelayedCrossfade) {
                        animator2.setStartDelay(80L);
                        this.tabsAlphaAnimator.setDuration(100L);
                    } else {
                        animator2.setDuration(z ? 200L : 180L);
                    }
                }
            }
            this.searchAnimator.addListener(new AnonymousClass33(z));
            this.animationIndex = getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
            this.searchAnimator.start();
            Animator animator3 = this.tabsAlphaAnimator;
            if (animator3 != null) {
                animator3.start();
            }
        } else {
            setDialogsListFrozen(false);
            if (z) {
                this.viewPages[0].listView.hide();
            } else {
                this.viewPages[0].listView.show();
            }
            this.viewPages[0].setAlpha(z ? 0.0f : 1.0f);
            this.viewPages[0].setScaleX(z ? 0.9f : 1.0f);
            ViewPage viewPage4 = this.viewPages[0];
            if (!z) {
                f = 1.0f;
            }
            viewPage4.setScaleY(f);
            this.searchViewPager.setAlpha(z ? 1.0f : 0.0f);
            this.filtersView.setAlpha(z ? 1.0f : 0.0f);
            float f4 = 1.1f;
            this.searchViewPager.setScaleX(z ? 1.0f : 1.1f);
            SearchViewPager searchViewPager4 = this.searchViewPager;
            if (z) {
                f4 = 1.0f;
            }
            searchViewPager4.setScaleY(f4);
            FilterTabsView filterTabsView3 = this.filterTabsView;
            if (filterTabsView3 != null && filterTabsView3.getVisibility() == 0) {
                this.filterTabsView.setTranslationY(z ? -AndroidUtilities.dp(44.0f) : 0.0f);
                this.filterTabsView.getTabsContainer().setAlpha(z ? 0.0f : 1.0f);
            }
            FilterTabsView filterTabsView4 = this.filterTabsView;
            if (filterTabsView4 != null) {
                if (this.canShowFilterTabsView && !z) {
                    filterTabsView4.setVisibility(0);
                } else {
                    filterTabsView4.setVisibility(8);
                }
            }
            SearchViewPager searchViewPager5 = this.searchViewPager;
            if (!z) {
                i3 = 8;
            }
            searchViewPager5.setVisibility(i3);
            setSearchAnimationProgress(z ? 1.0f : 0.0f);
            this.fragmentView.invalidate();
            ActionBarMenuItem actionBarMenuItem3 = this.downloadsItem;
            if (actionBarMenuItem3 != null) {
                if (!z) {
                    f2 = 1.0f;
                }
                actionBarMenuItem3.setAlpha(f2);
            }
        }
        int i4 = this.initialSearchType;
        if (i4 >= 0) {
            SearchViewPager searchViewPager6 = this.searchViewPager;
            searchViewPager6.setPosition(searchViewPager6.getPositionForType(i4));
        }
        if (!z) {
            this.initialSearchType = -1;
        }
        if (!z || !z2) {
            return;
        }
        this.searchViewPager.showDownloads();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$32 */
    /* loaded from: classes3.dex */
    public class AnonymousClass32 extends AnimatorListenerAdapter {
        AnonymousClass32() {
            DialogsActivity.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.tabsAlphaAnimator = null;
        }
    }

    public /* synthetic */ void lambda$showSearch$20(ValueAnimator valueAnimator) {
        setSearchAnimationProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: org.telegram.ui.DialogsActivity$33 */
    /* loaded from: classes3.dex */
    public class AnonymousClass33 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$show;

        AnonymousClass33(boolean z) {
            DialogsActivity.this = r1;
            this.val$show = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.getNotificationCenter().onAnimationFinish(DialogsActivity.this.animationIndex);
            if (DialogsActivity.this.searchAnimator != animator) {
                return;
            }
            DialogsActivity.this.setDialogsListFrozen(false);
            if (!this.val$show) {
                DialogsActivity.this.searchItem.collapseSearchFilters();
                DialogsActivity.this.whiteActionBar = false;
                DialogsActivity.this.searchViewPager.setVisibility(8);
                if (DialogsActivity.this.searchTabsView != null) {
                    DialogsActivity.this.searchTabsView.setVisibility(8);
                }
                DialogsActivity.this.searchItem.clearSearchFilters();
                DialogsActivity.this.searchViewPager.clear();
                DialogsActivity.this.filtersView.setVisibility(8);
                DialogsActivity.this.viewPages[0].listView.show();
                if (!DialogsActivity.this.onlySelect) {
                    DialogsActivity.this.hideFloatingButton(false);
                }
                DialogsActivity.this.searchWasFullyShowed = false;
            } else {
                DialogsActivity.this.viewPages[0].listView.hide();
                if (DialogsActivity.this.filterTabsView != null) {
                    DialogsActivity.this.filterTabsView.setVisibility(8);
                }
                DialogsActivity.this.searchWasFullyShowed = true;
                AndroidUtilities.requestAdjustResize(DialogsActivity.this.getParentActivity(), ((BaseFragment) DialogsActivity.this).classGuid);
                DialogsActivity.this.searchItem.setVisibility(8);
            }
            if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((BaseFragment) DialogsActivity.this).fragmentView.requestLayout();
            }
            float f = 1.0f;
            DialogsActivity.this.setSearchAnimationProgress(this.val$show ? 1.0f : 0.0f);
            DialogsActivity.this.viewPages[0].listView.setVerticalScrollBarEnabled(true);
            DialogsActivity.this.searchViewPager.setBackground(null);
            DialogsActivity.this.searchAnimator = null;
            if (DialogsActivity.this.downloadsItem == null) {
                return;
            }
            ActionBarMenuItem actionBarMenuItem = DialogsActivity.this.downloadsItem;
            if (this.val$show) {
                f = 0.0f;
            }
            actionBarMenuItem.setAlpha(f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            DialogsActivity.this.getNotificationCenter().onAnimationFinish(DialogsActivity.this.animationIndex);
            if (DialogsActivity.this.searchAnimator == animator) {
                if (this.val$show) {
                    DialogsActivity.this.viewPages[0].listView.hide();
                } else {
                    DialogsActivity.this.viewPages[0].listView.show();
                }
                DialogsActivity.this.searchAnimator = null;
            }
        }
    }

    public boolean onlyDialogsAdapter() {
        return this.onlySelect || !this.searchViewPager.dialogsSearchAdapter.hasRecentSearch() || getMessagesController().getTotalDialogsCount() <= 10;
    }

    private void updateFilterTabsVisibility(boolean z) {
        int i = 0;
        if (this.isPaused || this.databaseMigrationHint != null) {
            z = false;
        }
        float f = 1.0f;
        if (this.searchIsShowed) {
            ValueAnimator valueAnimator = this.filtersTabAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z2 = this.canShowFilterTabsView;
            this.filterTabsViewIsVisible = z2;
            if (!z2) {
                f = 0.0f;
            }
            this.filterTabsProgress = f;
            return;
        }
        boolean z3 = this.canShowFilterTabsView;
        if (this.filterTabsViewIsVisible == z3) {
            return;
        }
        ValueAnimator valueAnimator2 = this.filtersTabAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.filterTabsViewIsVisible = z3;
        if (z) {
            if (z3) {
                if (this.filterTabsView.getVisibility() != 0) {
                    this.filterTabsView.setVisibility(0);
                }
                this.filtersTabAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.filterTabsMoveFrom = AndroidUtilities.dp(44.0f);
            } else {
                this.filtersTabAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.filterTabsMoveFrom = Math.max(0.0f, AndroidUtilities.dp(44.0f) + this.actionBar.getTranslationY());
            }
            float translationY = this.actionBar.getTranslationY();
            this.filtersTabAnimator.addListener(new AnonymousClass34(z3));
            this.filtersTabAnimator.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda6(this, z3, translationY));
            this.filtersTabAnimator.setDuration(220L);
            this.filtersTabAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.animationIndex = getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
            this.filtersTabAnimator.start();
            this.fragmentView.requestLayout();
            return;
        }
        if (!z3) {
            f = 0.0f;
        }
        this.filterTabsProgress = f;
        FilterTabsView filterTabsView = this.filterTabsView;
        if (!z3) {
            i = 8;
        }
        filterTabsView.setVisibility(i);
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$34 */
    /* loaded from: classes3.dex */
    public class AnonymousClass34 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$visible;

        AnonymousClass34(boolean z) {
            DialogsActivity.this = r1;
            this.val$visible = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.filtersTabAnimator = null;
            DialogsActivity.this.scrollAdditionalOffset = AndroidUtilities.dp(44.0f) - DialogsActivity.this.filterTabsMoveFrom;
            if (!this.val$visible) {
                DialogsActivity.this.filterTabsView.setVisibility(8);
            }
            if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                ((BaseFragment) DialogsActivity.this).fragmentView.requestLayout();
            }
            DialogsActivity.this.getNotificationCenter().onAnimationFinish(DialogsActivity.this.animationIndex);
        }
    }

    public /* synthetic */ void lambda$updateFilterTabsVisibility$21(boolean z, float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.filterTabsProgress = floatValue;
        if (!z) {
            setScrollY(f * floatValue);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setSearchAnimationProgress(float f) {
        this.searchAnimationProgress = f;
        if (this.whiteActionBar) {
            this.actionBar.setItemsColor(ColorUtils.blendARGB(Theme.getColor(this.folderId != 0 ? "actionBarDefaultArchivedIcon" : "actionBarDefaultIcon"), Theme.getColor("windowBackgroundWhiteGrayText2"), this.searchAnimationProgress), false);
            this.actionBar.setItemsColor(ColorUtils.blendARGB(Theme.getColor("actionBarActionModeDefaultIcon"), Theme.getColor("windowBackgroundWhiteGrayText2"), this.searchAnimationProgress), true);
            this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(Theme.getColor(this.folderId != 0 ? "actionBarDefaultArchivedSelector" : "actionBarDefaultSelector"), Theme.getColor("actionBarActionModeDefaultSelector"), this.searchAnimationProgress), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        updateContextViewPosition();
    }

    public void findAndUpdateCheckBox(long j, boolean z) {
        if (this.viewPages == null) {
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            int childCount = viewPageArr[i].listView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = this.viewPages[i].listView.getChildAt(i2);
                    if (childAt instanceof DialogCell) {
                        DialogCell dialogCell = (DialogCell) childAt;
                        if (dialogCell.getDialogId() == j) {
                            dialogCell.setChecked(z, true);
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }

    public void checkListLoad(ViewPage viewPage) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.tabsAnimationInProgress || this.startedTracking) {
            return;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.getVisibility() == 0 && this.filterTabsView.isAnimatingIndicator()) {
            return;
        }
        int findFirstVisibleItemPosition = viewPage.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = viewPage.layoutManager.findLastVisibleItemPosition();
        int abs = Math.abs(viewPage.layoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
        if (findLastVisibleItemPosition != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = viewPage.listView.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
            boolean z5 = findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.getItemViewType() == 11;
            this.floatingForceVisible = z5;
            if (z5) {
                hideFloatingButton(false);
            }
        } else {
            this.floatingForceVisible = false;
        }
        if (viewPage.dialogsType == 7 || viewPage.dialogsType == 8) {
            ArrayList<MessagesController.DialogFilter> arrayList = getMessagesController().dialogFilters;
            if (viewPage.selectedType >= 0 && viewPage.selectedType < arrayList.size() && (getMessagesController().dialogFilters.get(viewPage.selectedType).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && findLastVisibleItemPosition >= getDialogsArray(this.currentAccount, viewPage.dialogsType, 1, this.dialogsListFrozen).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean z6 = !getMessagesController().isDialogsEndReached(1);
                if (z6 || !getMessagesController().isServerDialogsEndReached(1)) {
                    z = z6;
                    z2 = true;
                } else {
                    z = z6;
                    z2 = false;
                }
                if ((abs > 0 || findLastVisibleItemPosition < getDialogsArray(this.currentAccount, viewPage.dialogsType, this.folderId, this.dialogsListFrozen).size() - 10) && (abs != 0 || (!(viewPage.dialogsType == 7 || viewPage.dialogsType == 8) || getMessagesController().isDialogsEndReached(this.folderId)))) {
                    z4 = false;
                    z3 = false;
                } else {
                    boolean z7 = !getMessagesController().isDialogsEndReached(this.folderId);
                    if (z7 || !getMessagesController().isServerDialogsEndReached(this.folderId)) {
                        z3 = z7;
                        z4 = true;
                    } else {
                        z3 = z7;
                        z4 = false;
                    }
                }
                if (z4 && !z2) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda47(this, z4, z3, z2, z));
            }
        }
        z2 = false;
        z = false;
        if (abs > 0) {
        }
        z4 = false;
        z3 = false;
        if (z4) {
        }
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda47(this, z4, z3, z2, z));
    }

    public /* synthetic */ void lambda$checkListLoad$22(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z) {
            getMessagesController().loadDialogs(this.folderId, -1, 100, z2);
        }
        if (z3) {
            getMessagesController().loadDialogs(1, -1, 100, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onItemClick(View view, int i, RecyclerView.Adapter adapter) {
        long j;
        int i2;
        int i3;
        int i4;
        boolean z;
        TLRPC$Document greetingsSticker;
        long j2;
        TLRPC$Chat chat;
        long j3;
        long makeEncryptedDialogId;
        int i5;
        long j4;
        int i6;
        long j5;
        if (getParentActivity() == null) {
            return;
        }
        boolean z2 = adapter instanceof DialogsAdapter;
        if (z2) {
            DialogsAdapter dialogsAdapter = (DialogsAdapter) adapter;
            int dialogsType = dialogsAdapter.getDialogsType();
            if (dialogsType == 7 || dialogsType == 8) {
                i5 = getMessagesController().selectedDialogFilter[dialogsType == 7 ? (char) 0 : (char) 1].id;
            } else {
                i5 = 0;
            }
            TLObject item = dialogsAdapter.getItem(i);
            if (item instanceof TLRPC$User) {
                j4 = ((TLRPC$User) item).id;
            } else if (item instanceof TLRPC$Dialog) {
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) item;
                i6 = tLRPC$Dialog.folder_id;
                if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
                    if (this.actionBar.isActionModeShowed(null)) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("folderId", ((TLRPC$TL_dialogFolder) tLRPC$Dialog).folder.id);
                    presentFragment(new DialogsActivity(bundle));
                    return;
                }
                j4 = tLRPC$Dialog.id;
                if (this.actionBar.isActionModeShowed(null)) {
                    showOrUpdateActionMode(j4, view);
                    return;
                }
                j = j4;
                z = false;
                i2 = i5;
                i3 = i6;
                i4 = 0;
            } else {
                if (item instanceof TLRPC$TL_recentMeUrlChat) {
                    j5 = ((TLRPC$TL_recentMeUrlChat) item).chat_id;
                } else if (item instanceof TLRPC$TL_recentMeUrlUser) {
                    j4 = ((TLRPC$TL_recentMeUrlUser) item).user_id;
                } else if (item instanceof TLRPC$TL_recentMeUrlChatInvite) {
                    TLRPC$TL_recentMeUrlChatInvite tLRPC$TL_recentMeUrlChatInvite = (TLRPC$TL_recentMeUrlChatInvite) item;
                    TLRPC$ChatInvite tLRPC$ChatInvite = tLRPC$TL_recentMeUrlChatInvite.chat_invite;
                    TLRPC$Chat tLRPC$Chat = tLRPC$ChatInvite.chat;
                    if ((tLRPC$Chat == null && (!tLRPC$ChatInvite.channel || tLRPC$ChatInvite.megagroup)) || (tLRPC$Chat != null && (!ChatObject.isChannel(tLRPC$Chat) || tLRPC$ChatInvite.chat.megagroup))) {
                        String str = tLRPC$TL_recentMeUrlChatInvite.url;
                        int indexOf = str.indexOf(47);
                        if (indexOf > 0) {
                            str = str.substring(indexOf + 1);
                        }
                        showDialog(new JoinGroupAlert(getParentActivity(), tLRPC$ChatInvite, str, this, null));
                        return;
                    }
                    TLRPC$Chat tLRPC$Chat2 = tLRPC$ChatInvite.chat;
                    if (tLRPC$Chat2 == null) {
                        return;
                    }
                    j5 = tLRPC$Chat2.id;
                } else if (item instanceof TLRPC$TL_recentMeUrlStickerSet) {
                    TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_recentMeUrlStickerSet) item).set.set;
                    TLRPC$TL_inputStickerSetID tLRPC$TL_inputStickerSetID = new TLRPC$TL_inputStickerSetID();
                    tLRPC$TL_inputStickerSetID.id = tLRPC$StickerSet.id;
                    tLRPC$TL_inputStickerSetID.access_hash = tLRPC$StickerSet.access_hash;
                    showDialog(new StickersAlert(getParentActivity(), this, tLRPC$TL_inputStickerSetID, (TLRPC$TL_messages_stickerSet) null, (StickersAlert.StickersAlertDelegate) null));
                    return;
                } else {
                    boolean z3 = item instanceof TLRPC$TL_recentMeUrlUnknown;
                    return;
                }
                j4 = -j5;
            }
            i6 = 0;
            j = j4;
            z = false;
            i2 = i5;
            i3 = i6;
            i4 = 0;
        } else {
            DialogsSearchAdapter dialogsSearchAdapter = this.searchViewPager.dialogsSearchAdapter;
            if (adapter == dialogsSearchAdapter) {
                Object item2 = dialogsSearchAdapter.getItem(i);
                z = this.searchViewPager.dialogsSearchAdapter.isGlobalSearch(i);
                if (item2 instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) item2;
                    makeEncryptedDialogId = tLRPC$User.id;
                    if (!this.onlySelect) {
                        this.searchDialogId = makeEncryptedDialogId;
                        this.searchObject = tLRPC$User;
                    }
                } else if (item2 instanceof TLRPC$Chat) {
                    TLRPC$Chat tLRPC$Chat3 = (TLRPC$Chat) item2;
                    makeEncryptedDialogId = -tLRPC$Chat3.id;
                    if (!this.onlySelect) {
                        this.searchDialogId = makeEncryptedDialogId;
                        this.searchObject = tLRPC$Chat3;
                    }
                } else if (item2 instanceof TLRPC$EncryptedChat) {
                    TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) item2;
                    makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
                    if (!this.onlySelect) {
                        this.searchDialogId = makeEncryptedDialogId;
                        this.searchObject = tLRPC$EncryptedChat;
                    }
                } else if (item2 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) item2;
                    long dialogId = messageObject.getDialogId();
                    i4 = messageObject.getId();
                    DialogsSearchAdapter dialogsSearchAdapter2 = this.searchViewPager.dialogsSearchAdapter;
                    dialogsSearchAdapter2.addHashtagsFromMessage(dialogsSearchAdapter2.getLastSearchString());
                    j3 = dialogId;
                    if (j3 == 0 && this.actionBar.isActionModeShowed()) {
                        if (!this.actionBar.isActionModeShowed("search_dialogs_action_mode") || i4 != 0 || z) {
                            return;
                        }
                        showOrUpdateActionMode(j3, view);
                        return;
                    }
                    j = j3;
                } else {
                    if (item2 instanceof String) {
                        String str2 = (String) item2;
                        if (this.searchViewPager.dialogsSearchAdapter.isHashtagSearch()) {
                            this.actionBar.openSearchField(str2, false);
                        } else if (!str2.equals("section")) {
                            NewContactActivity newContactActivity = new NewContactActivity();
                            newContactActivity.setInitialPhoneNumber(str2, true);
                            presentFragment(newContactActivity);
                        }
                    }
                    j3 = 0;
                    i4 = 0;
                    if (j3 == 0) {
                    }
                    j = j3;
                }
                j3 = makeEncryptedDialogId;
                i4 = 0;
                if (j3 == 0) {
                }
                j = j3;
            } else {
                j = 0;
                z = false;
                i4 = 0;
            }
            i3 = 0;
            i2 = 0;
        }
        if (j == 0) {
            return;
        }
        if (this.onlySelect) {
            if (!validateSlowModeDialog(j)) {
                return;
            }
            if (!this.selectedDialogs.isEmpty() || (this.initialDialogsType == 3 && this.selectAlertString != null)) {
                if (!this.selectedDialogs.contains(Long.valueOf(j)) && !checkCanWrite(j)) {
                    return;
                }
                boolean addOrRemoveSelectedDialog = addOrRemoveSelectedDialog(j, view);
                if (adapter == this.searchViewPager.dialogsSearchAdapter) {
                    this.actionBar.closeSearchField();
                    findAndUpdateCheckBox(j, addOrRemoveSelectedDialog);
                }
                updateSelectedCount();
                return;
            }
            didSelectResult(j, true, false);
            return;
        }
        Bundle bundle2 = new Bundle();
        if (DialogObject.isEncryptedDialog(j)) {
            bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle2.putLong("user_id", j);
        } else {
            if (i4 == 0 || (chat = getMessagesController().getChat(Long.valueOf(-j))) == null || chat.migrated_to == null) {
                j2 = j;
            } else {
                bundle2.putLong("migrated_to", j);
                j2 = -chat.migrated_to.channel_id;
            }
            bundle2.putLong("chat_id", -j2);
        }
        if (i4 != 0) {
            bundle2.putInt("message_id", i4);
        } else if (!z) {
            closeSearch();
        } else {
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                this.searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                this.searchObject = null;
            }
        }
        bundle2.putInt("dialog_folder_id", i3);
        bundle2.putInt("dialog_filter_id", i2);
        if (AndroidUtilities.isTablet()) {
            if (this.openedDialogId == j && adapter != this.searchViewPager.dialogsSearchAdapter) {
                return;
            }
            if (this.viewPages != null) {
                int i7 = 0;
                while (true) {
                    ViewPage[] viewPageArr = this.viewPages;
                    if (i7 >= viewPageArr.length) {
                        break;
                    }
                    DialogsAdapter dialogsAdapter2 = viewPageArr[i7].dialogsAdapter;
                    this.openedDialogId = j;
                    dialogsAdapter2.setOpenedDialogId(j);
                    i7++;
                }
            }
            updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
        }
        if (this.searchViewPager.actionModeShowing()) {
            this.searchViewPager.hideActionMode();
        }
        if (this.searchString != null) {
            if (!getMessagesController().checkCanOpenChat(bundle2, this)) {
                return;
            }
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle2));
            return;
        }
        this.slowedReloadAfterDialogClick = true;
        if (!getMessagesController().checkCanOpenChat(bundle2, this)) {
            return;
        }
        ChatActivity chatActivity = new ChatActivity(bundle2);
        if (z2 && DialogObject.isUserDialog(j) && getMessagesController().dialogs_dict.get(j) == null && (greetingsSticker = getMediaDataController().getGreetingsSticker()) != null) {
            chatActivity.setPreloadedSticker(greetingsSticker, true);
        }
        presentFragment(chatActivity);
    }

    public boolean onItemLongClick(RecyclerListView recyclerListView, View view, int i, float f, float f2, int i2, RecyclerView.Adapter adapter) {
        TLRPC$Dialog tLRPC$Dialog;
        long j;
        if (getParentActivity() == null) {
            return false;
        }
        if (!this.actionBar.isActionModeShowed() && !AndroidUtilities.isTablet() && !this.onlySelect && (view instanceof DialogCell)) {
            DialogCell dialogCell = (DialogCell) view;
            if (dialogCell.isPointInsideAvatar(f, f2)) {
                return showChatPreview(dialogCell);
            }
        }
        DialogsSearchAdapter dialogsSearchAdapter = this.searchViewPager.dialogsSearchAdapter;
        if (adapter == dialogsSearchAdapter) {
            Object item = dialogsSearchAdapter.getItem(i);
            if (!this.searchViewPager.dialogsSearchAdapter.isSearchWas()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("ClearSearchSingleAlertTitle", 2131625179));
                if (item instanceof TLRPC$Chat) {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) item;
                    builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", 2131625180, tLRPC$Chat.title));
                    j = -tLRPC$Chat.id;
                } else if (item instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) item;
                    if (tLRPC$User.id == getUserConfig().clientUserId) {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", 2131625180, LocaleController.getString("SavedMessages", 2131628140)));
                    } else {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", 2131625181, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name)));
                    }
                    j = tLRPC$User.id;
                } else if (!(item instanceof TLRPC$EncryptedChat)) {
                    return false;
                } else {
                    TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) item;
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$EncryptedChat.user_id));
                    builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", 2131625181, ContactsController.formatName(user.first_name, user.last_name)));
                    j = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
                }
                builder.setPositiveButton(LocaleController.getString("ClearSearchRemove", 2131625178).toUpperCase(), new DialogsActivity$$ExternalSyntheticLambda11(this, j));
                builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
                AlertDialog create = builder.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
                return true;
            }
        }
        DialogsSearchAdapter dialogsSearchAdapter2 = this.searchViewPager.dialogsSearchAdapter;
        if (adapter == dialogsSearchAdapter2) {
            if (this.onlySelect) {
                onItemClick(view, i, adapter);
                return false;
            }
            long dialogId = (!(view instanceof ProfileSearchCell) || dialogsSearchAdapter2.isGlobalSearch(i)) ? 0L : ((ProfileSearchCell) view).getDialogId();
            if (dialogId == 0) {
                return false;
            }
            showOrUpdateActionMode(dialogId, view);
            return true;
        }
        ArrayList<TLRPC$Dialog> dialogsArray = getDialogsArray(this.currentAccount, i2, this.folderId, this.dialogsListFrozen);
        int fixPosition = ((DialogsAdapter) adapter).fixPosition(i);
        if (fixPosition < 0 || fixPosition >= dialogsArray.size() || (tLRPC$Dialog = dialogsArray.get(fixPosition)) == null) {
            return false;
        }
        if (this.onlySelect) {
            int i3 = this.initialDialogsType;
            if ((i3 != 3 && i3 != 10) || !validateSlowModeDialog(tLRPC$Dialog.id)) {
                return false;
            }
            addOrRemoveSelectedDialog(tLRPC$Dialog.id, view);
            updateSelectedCount();
            return true;
        } else if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
            onArchiveLongPress(view);
            return false;
        } else if (this.actionBar.isActionModeShowed() && isDialogPinned(tLRPC$Dialog)) {
            return false;
        } else {
            showOrUpdateActionMode(tLRPC$Dialog.id, view);
            return true;
        }
    }

    public /* synthetic */ void lambda$onItemLongClick$23(long j, DialogInterface dialogInterface, int i) {
        this.searchViewPager.dialogsSearchAdapter.removeRecentSearch(j);
    }

    private void onArchiveLongPress(View view) {
        String str;
        int i;
        view.performHapticFeedback(0, 2);
        BottomSheet.Builder builder = new BottomSheet.Builder(getParentActivity());
        boolean z = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = new int[2];
        iArr[0] = z ? 2131165795 : 0;
        iArr[1] = SharedConfig.archiveHidden ? 2131165338 : 2131165343;
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = z ? LocaleController.getString("MarkAllAsRead", 2131626588) : null;
        if (SharedConfig.archiveHidden) {
            i = 2131627581;
            str = "PinInTheList";
        } else {
            i = 2131626180;
            str = "HideAboveTheList";
        }
        charSequenceArr[1] = LocaleController.getString(str, i);
        builder.setItems(charSequenceArr, iArr, new DialogsActivity$$ExternalSyntheticLambda8(this));
        showDialog(builder.create());
    }

    public /* synthetic */ void lambda$onArchiveLongPress$24(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            getMessagesStorage().readAllDialogs(1);
        } else if (i != 1 || this.viewPages == null) {
        } else {
            int i2 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i2 >= viewPageArr.length) {
                    return;
                }
                if (viewPageArr[i2].dialogsType == 0 && this.viewPages[i2].getVisibility() == 0) {
                    View childAt = this.viewPages[i2].listView.getChildAt(0);
                    DialogCell dialogCell = null;
                    if (childAt instanceof DialogCell) {
                        DialogCell dialogCell2 = (DialogCell) childAt;
                        if (dialogCell2.isFolderCell()) {
                            dialogCell = dialogCell2;
                        }
                    }
                    this.viewPages[i2].listView.toggleArchiveHidden(true, dialogCell);
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean showChatPreview(DialogCell dialogCell) {
        MessagesController.DialogFilter dialogFilter;
        ChatActivity[] chatActivityArr;
        boolean z;
        Bundle bundle;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        ArrayList<TLRPC$Dialog> arrayList;
        long j;
        TLRPC$Chat chat;
        if (dialogCell.isDialogFolder()) {
            if (dialogCell.getCurrentDialogFolderId() == 1) {
                onArchiveLongPress(dialogCell);
            }
            return false;
        }
        long dialogId = dialogCell.getDialogId();
        Bundle bundle2 = new Bundle();
        int messageId = dialogCell.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle2.putLong("user_id", dialogId);
        } else {
            if (messageId == 0 || (chat = getMessagesController().getChat(Long.valueOf(-dialogId))) == null || chat.migrated_to == null) {
                j = dialogId;
            } else {
                bundle2.putLong("migrated_to", dialogId);
                j = -chat.migrated_to.channel_id;
            }
            bundle2.putLong("chat_id", -j);
        }
        if (messageId != 0) {
            bundle2.putInt("message_id", messageId);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(dialogId));
        ChatActivity[] chatActivityArr2 = new ChatActivity[1];
        ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr = {new ActionBarPopupWindow.ActionBarPopupWindowLayout(getParentActivity(), 2131166090, getResourceProvider(), 2)};
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getParentActivity(), true, false);
        if (dialogCell.getHasUnread()) {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("MarkAsRead", 2131626589), 2131165795);
        } else {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("MarkAsUnread", 2131626590), 2131165796);
        }
        actionBarMenuSubItem.setMinimumWidth(160);
        actionBarMenuSubItem.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda26(this, dialogCell, dialogId));
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem);
        boolean[] zArr = new boolean[1];
        zArr[0] = true;
        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(dialogId);
        boolean z4 = (this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null));
        if (z4) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        if (!isDialogPinned(tLRPC$Dialog)) {
            ArrayList<TLRPC$Dialog> dialogs = getMessagesController().getDialogs(this.folderId);
            int size = dialogs.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 >= size) {
                    chatActivityArr = chatActivityArr2;
                    break;
                }
                TLRPC$Dialog tLRPC$Dialog2 = dialogs.get(i6);
                if (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder) {
                    arrayList = dialogs;
                    i5 = size;
                } else if (isDialogPinned(tLRPC$Dialog2)) {
                    arrayList = dialogs;
                    i5 = size;
                    if (DialogObject.isEncryptedDialog(tLRPC$Dialog2.id)) {
                        i8++;
                    } else {
                        i7++;
                    }
                } else {
                    arrayList = dialogs;
                    i5 = size;
                    chatActivityArr = chatActivityArr2;
                    if (!getMessagesController().isPromoDialog(tLRPC$Dialog2.id, false)) {
                        break;
                    }
                    i6++;
                    dialogs = arrayList;
                    size = i5;
                    chatActivityArr2 = chatActivityArr;
                }
                chatActivityArr = chatActivityArr2;
                i6++;
                dialogs = arrayList;
                size = i5;
                chatActivityArr2 = chatActivityArr;
            }
            if (tLRPC$Dialog == null || isDialogPinned(tLRPC$Dialog)) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
                int i9 = !isEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(dialogId))) {
                    i = i9;
                    i2 = isEncryptedDialog ? 1 : 0;
                    i3 = 0;
                } else {
                    i = i9;
                    i2 = isEncryptedDialog;
                    i3 = 1;
                }
            }
            if (z4 && dialogFilter != null) {
                i4 = 100 - dialogFilter.alwaysShow.size();
            } else if (this.folderId != 0 || dialogFilter != null) {
                i4 = getMessagesController().maxFolderPinnedDialogsCount;
            } else {
                i4 = getMessagesController().maxPinnedDialogsCount;
            }
            if (i2 + i8 > i4 || (i + i7) - i3 > i4) {
                z = false;
                z3 = false;
            } else {
                z = false;
                z3 = true;
            }
            char c = z ? 1 : 0;
            char c2 = z ? 1 : 0;
            char c3 = z ? 1 : 0;
            zArr[c] = z3;
        } else {
            chatActivityArr = chatActivityArr2;
            z = false;
        }
        if (zArr[z ? 1 : 0]) {
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getParentActivity(), z, z);
            if (isDialogPinned(tLRPC$Dialog)) {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("UnpinMessage", 2131628816), 2131165973);
            } else {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("PinMessage", 2131627582), 2131165863);
            }
            actionBarMenuSubItem2.setMinimumWidth(160);
            bundle = null;
            actionBarMenuSubItem2.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda25(this, dialogFilter, tLRPC$Dialog, dialogId));
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem2);
        } else {
            bundle = null;
        }
        if (!DialogObject.isUserDialog(dialogId) || !UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(dialogId)))) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getParentActivity(), false, false);
            if (!getMessagesController().isDialogMuted(dialogId)) {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("Mute", 2131626797), 2131165820);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("Unmute", 2131628811), 2131165972);
            }
            actionBarMenuSubItem3.setMinimumWidth(160);
            actionBarMenuSubItem3.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda23(this, dialogId));
            z2 = false;
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem3);
        } else {
            z2 = false;
        }
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getParentActivity(), z2, true);
        actionBarMenuSubItem4.setIconColor(getThemedColor("dialogRedIcon"));
        actionBarMenuSubItem4.setTextColor(getThemedColor("dialogTextRed"));
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString("Delete", 2131625384), 2131165702);
        actionBarMenuSubItem4.setMinimumWidth(160);
        actionBarMenuSubItem4.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda24(this, arrayList2));
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem4);
        if (!getMessagesController().checkCanOpenChat(bundle2, this)) {
            return false;
        }
        if (this.searchString != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
        }
        prepareBlurBitmap();
        this.parentLayout.highlightActionButtons = true;
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            BaseFragment chatActivity = new ChatActivity(bundle2);
            chatActivityArr[0] = chatActivity;
            presentFragmentAsPreview(chatActivity);
            return true;
        }
        BaseFragment chatActivity2 = new ChatActivity(bundle2);
        chatActivityArr[0] = chatActivity2;
        presentFragmentAsPreviewWithMenu(chatActivity2, actionBarPopupWindowLayoutArr[0]);
        if (chatActivityArr[0] == null) {
            return true;
        }
        chatActivityArr[0].allowExpandPreviewByClick = true;
        try {
            chatActivityArr[0].getAvatarContainer().getAvatarImageView().performAccessibilityAction(64, bundle);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public /* synthetic */ void lambda$showChatPreview$25(DialogCell dialogCell, long j, View view) {
        if (dialogCell.getHasUnread()) {
            markAsRead(j);
        } else {
            markAsUnread(j);
        }
        finishPreviewFragment();
    }

    public /* synthetic */ void lambda$showChatPreview$27(MessagesController.DialogFilter dialogFilter, TLRPC$Dialog tLRPC$Dialog, long j, View view) {
        finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda42(this, dialogFilter, tLRPC$Dialog, j), 100L);
    }

    public /* synthetic */ void lambda$showChatPreview$26(MessagesController.DialogFilter dialogFilter, TLRPC$Dialog tLRPC$Dialog, long j) {
        int i;
        boolean z;
        int i2 = Integer.MAX_VALUE;
        if (dialogFilter == null || !isDialogPinned(tLRPC$Dialog)) {
            i = Integer.MAX_VALUE;
        } else {
            int size = dialogFilter.pinnedDialogs.size();
            for (int i3 = 0; i3 < size; i3++) {
                i2 = Math.min(i2, dialogFilter.pinnedDialogs.valueAt(i3));
            }
            i = i2 - this.canPinCount;
        }
        TLRPC$EncryptedChat encryptedChat = DialogObject.isEncryptedDialog(j) ? getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) : null;
        if (!isDialogPinned(tLRPC$Dialog)) {
            pinDialog(j, true, dialogFilter, i, true);
            getUndoView().showWithAction(0L, 78, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
            if (dialogFilter != null) {
                if (encryptedChat != null) {
                    if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                        dialogFilter.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j))) {
                    dialogFilter.alwaysShow.add(Long.valueOf(j));
                }
            }
        } else {
            pinDialog(j, false, dialogFilter, i, true);
            getUndoView().showWithAction(0L, 79, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
        }
        if (dialogFilter != null) {
            z = true;
            FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
        } else {
            z = true;
        }
        getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
        updateCounters(z);
        if (this.viewPages != null) {
            int i4 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i4 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i4].dialogsAdapter.onReorderStateChanged(false);
                i4++;
            }
        }
        updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK);
    }

    public /* synthetic */ void lambda$showChatPreview$28(long j, View view) {
        boolean isDialogMuted = getMessagesController().isDialogMuted(j);
        if (!isDialogMuted) {
            getNotificationsController().setDialogNotificationsSettings(j, 3);
        } else {
            getNotificationsController().setDialogNotificationsSettings(j, 4);
        }
        BulletinFactory.createMuteBulletin(this, !isDialogMuted, null).show();
        finishPreviewFragment();
    }

    public /* synthetic */ void lambda$showChatPreview$29(ArrayList arrayList, View view) {
        performSelectedDialogsAction(arrayList, 102, false);
        finishPreviewFragment();
    }

    public void updateFloatingButtonOffset() {
        this.floatingButtonContainer.setTranslationY(this.floatingButtonTranslation - (Math.max(this.additionalFloatingTranslation, this.additionalFloatingTranslation2) * (1.0f - this.floatingButtonHideProgress)));
    }

    public boolean hasHiddenArchive() {
        return !this.onlySelect && this.initialDialogsType == 0 && this.folderId == 0 && getMessagesController().hasHiddenArchive();
    }

    public boolean waitingForDialogsAnimationEnd(ViewPage viewPage) {
        return (!viewPage.dialogsItemAnimator.isRunning() && this.dialogRemoveFinished == 0 && this.dialogInsertFinished == 0 && this.dialogChangeFinished == 0) ? false : true;
    }

    public void onDialogAnimationFinished() {
        this.dialogRemoveFinished = 0;
        this.dialogInsertFinished = 0;
        this.dialogChangeFinished = 0;
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda34(this));
    }

    public /* synthetic */ void lambda$onDialogAnimationFinished$30() {
        ArrayList<TLRPC$Dialog> arrayList;
        if (this.viewPages != null && this.folderId != 0 && ((arrayList = this.frozenDialogsList) == null || arrayList.isEmpty())) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].listView.setEmptyView(null);
                this.viewPages[i].progressView.setVisibility(4);
                i++;
            }
            finishFragment();
        }
        setDialogsListFrozen(false);
        updateDialogIndices();
    }

    public void setScrollY(float f) {
        View view = this.scrimView;
        if (view != null) {
            view.getLocationInWindow(this.scrimViewLocation);
        }
        this.actionBar.setTranslationY(f);
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.setTranslationY(f);
        }
        updateContextViewPosition();
        if (this.viewPages != null) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].listView.setTopGlowOffset(this.viewPages[i].listView.getPaddingTop() + ((int) f));
                i++;
            }
        }
        this.fragmentView.invalidate();
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationProgress(boolean z, float f) {
        View view = this.blurredView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        View view;
        if (z && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        if (!z || !this.afterSignup) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (!(getParentActivity() instanceof LaunchActivity)) {
            return;
        }
        ((LaunchActivity) getParentActivity()).getFireworksOverlay().start();
    }

    public void resetScroll() {
        if (this.actionBar.getTranslationY() == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.SCROLL_Y, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public void hideActionMode(boolean z) {
        this.actionBar.hideActionMode();
        if (this.menuDrawable != null) {
            this.actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrOpenMenu", 2131624030));
        }
        this.selectedDialogs.clear();
        MenuDrawable menuDrawable = this.menuDrawable;
        if (menuDrawable != null) {
            menuDrawable.setRotation(0.0f, true);
        } else {
            BackDrawable backDrawable = this.backDrawable;
            if (backDrawable != null) {
                backDrawable.setRotation(0.0f, true);
            }
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.animateColorsTo("actionBarTabLine", "actionBarTabActiveText", "actionBarTabUnactiveText", "actionBarTabSelector", "actionBarDefault");
        }
        ValueAnimator valueAnimator = this.actionBarColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progressToActionMode, 0.0f);
        this.actionBarColorAnimator = ofFloat;
        ofFloat.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda4(this));
        this.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.actionBarColorAnimator.setDuration(200L);
        this.actionBarColorAnimator.start();
        this.allowMoving = false;
        if (!this.movingDialogFilters.isEmpty()) {
            int i2 = 0;
            for (int size = this.movingDialogFilters.size(); i2 < size; size = size) {
                MessagesController.DialogFilter dialogFilter = this.movingDialogFilters.get(i2);
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i2++;
            }
            this.movingDialogFilters.clear();
        }
        if (this.movingWas) {
            getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
            this.movingWas = false;
        }
        updateCounters(true);
        if (this.viewPages != null) {
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i3 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i3].dialogsAdapter.onReorderStateChanged(false);
                i3++;
            }
        }
        int i4 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        if (z) {
            i = MessagesController.UPDATE_MASK_CHAT;
        }
        updateVisibleRows(i4 | i);
    }

    public /* synthetic */ void lambda$hideActionMode$31(ValueAnimator valueAnimator) {
        this.progressToActionMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    private int getPinnedCount() {
        ArrayList<TLRPC$Dialog> arrayList;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            arrayList = getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, this.dialogsListFrozen);
        } else {
            arrayList = getMessagesController().getDialogs(this.folderId);
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i2);
            if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                if (isDialogPinned(tLRPC$Dialog)) {
                    i++;
                } else if (!getMessagesController().isPromoDialog(tLRPC$Dialog.id, false)) {
                    break;
                }
            }
        }
        return i;
    }

    public boolean isDialogPinned(TLRPC$Dialog tLRPC$Dialog) {
        MessagesController.DialogFilter dialogFilter = null;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        }
        if (dialogFilter != null) {
            return dialogFilter.pinnedDialogs.indexOfKey(tLRPC$Dialog.id) >= 0;
        }
        return tLRPC$Dialog.pinned;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void performSelectedDialogsAction(ArrayList<Long> arrayList, int i, boolean z) {
        MessagesController.DialogFilter dialogFilter;
        boolean z2;
        int i2;
        int i3;
        long j;
        boolean z3;
        Theme.ResourcesProvider resourcesProvider;
        String str;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        boolean z4;
        int i4;
        int i5;
        TLRPC$User tLRPC$User2;
        String str2;
        int i6;
        ArrayList<Long> arrayList2 = arrayList;
        if (getParentActivity() == null) {
            return;
        }
        boolean z5 = false;
        boolean z6 = (this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null));
        if (z6) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        int size = arrayList.size();
        if (i == 105 || i == 107) {
            ArrayList<Long> arrayList3 = new ArrayList<>(arrayList);
            getMessagesController().addDialogToFolder(arrayList3, this.canUnarchiveCount == 0 ? 1 : 0, -1, null, 0L);
            if (this.canUnarchiveCount == 0) {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                boolean z7 = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                if (!z7) {
                    i2 = 1;
                    globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                } else {
                    i2 = 1;
                }
                if (z7) {
                    i3 = arrayList3.size() > i2 ? 4 : 2;
                } else {
                    i3 = arrayList3.size() > i2 ? 5 : 3;
                }
                getUndoView().showWithAction(0L, i3, null, new DialogsActivity$$ExternalSyntheticLambda41(this, arrayList3));
            } else {
                ArrayList<TLRPC$Dialog> dialogs = getMessagesController().getDialogs(this.folderId);
                if (this.viewPages != null && dialogs.isEmpty()) {
                    z2 = false;
                    this.viewPages[0].listView.setEmptyView(null);
                    this.viewPages[0].progressView.setVisibility(4);
                    finishFragment();
                    hideActionMode(z2);
                    return;
                }
            }
            z2 = false;
            hideActionMode(z2);
            return;
        }
        String str3 = "Cancel";
        if ((i == 100 || i == 108) && this.canPinCount != 0) {
            ArrayList<TLRPC$Dialog> dialogs2 = getMessagesController().getDialogs(this.folderId);
            int size2 = dialogs2.size();
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                TLRPC$Dialog tLRPC$Dialog = dialogs2.get(i9);
                if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                    if (isDialogPinned(tLRPC$Dialog)) {
                        if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                            i8++;
                        } else {
                            i7++;
                        }
                    } else if (!getMessagesController().isPromoDialog(tLRPC$Dialog.id, false)) {
                        break;
                    }
                }
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                long longValue = arrayList2.get(i13).longValue();
                TLRPC$Dialog tLRPC$Dialog2 = getMessagesController().dialogs_dict.get(longValue);
                if (tLRPC$Dialog2 != null && !isDialogPinned(tLRPC$Dialog2)) {
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        i11++;
                    } else {
                        i10++;
                    }
                    if (dialogFilter != null && dialogFilter.alwaysShow.contains(Long.valueOf(longValue))) {
                        i12++;
                    }
                }
            }
            if (z6) {
                i6 = 100 - dialogFilter.alwaysShow.size();
            } else if (this.folderId != 0 || dialogFilter != null) {
                i6 = getMessagesController().maxFolderPinnedDialogsCount;
            } else {
                i6 = getUserConfig().isPremium() ? getMessagesController().dialogFiltersPinnedLimitPremium : getMessagesController().dialogFiltersPinnedLimitDefault;
            }
            if (i11 + i8 > i6 || (i10 + i7) - i12 > i6) {
                if (this.folderId == 0 && dialogFilter == null) {
                    showDialog(new LimitReachedBottomSheet(this, getParentActivity(), 0, this.currentAccount));
                    return;
                } else {
                    AlertsCreator.showSimpleAlert(this, LocaleController.formatString("PinFolderLimitReached", 2131627580, LocaleController.formatPluralString("Chats", i6, new Object[0])));
                    return;
                }
            }
        } else if ((i == 102 || i == 103) && size > 1 && z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            if (i == 102) {
                builder.setTitle(LocaleController.formatString("DeleteFewChatsTitle", 2131625421, LocaleController.formatPluralString("ChatsSelected", size, new Object[0])));
                builder.setMessage(LocaleController.getString("AreYouSureDeleteFewChats", 2131624450));
            } else if (this.canClearCacheCount != 0) {
                builder.setTitle(LocaleController.formatString("ClearCacheFewChatsTitle", 2131625148, LocaleController.formatPluralString("ChatsSelectedClearCache", size, new Object[0])));
                builder.setMessage(LocaleController.getString("AreYouSureClearHistoryCacheFewChats", 2131624437));
            } else {
                builder.setTitle(LocaleController.formatString("ClearFewChatsTitle", 2131625151, LocaleController.formatPluralString("ChatsSelectedClear", size, new Object[0])));
                builder.setMessage(LocaleController.getString("AreYouSureClearHistoryFewChats", 2131624439));
            }
            if (i == 102) {
                str2 = LocaleController.getString("Delete", 2131625384);
            } else {
                str2 = this.canClearCacheCount != 0 ? LocaleController.getString("ClearHistoryCache", 2131625155) : LocaleController.getString("ClearHistory", 2131625154);
            }
            builder.setPositiveButton(str2, new DialogsActivity$$ExternalSyntheticLambda13(this, arrayList2, i));
            builder.setNegativeButton(LocaleController.getString(str3, 2131624832), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView == null) {
                return;
            }
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
            return;
        } else if (i == 106 && z) {
            TLRPC$User user = size == 1 ? getMessagesController().getUser(Long.valueOf(arrayList2.get(0).longValue())) : null;
            if (this.canReportSpamCount != 0) {
                z5 = true;
            }
            AlertsCreator.createBlockDialogAlert(this, size, z5, user, new DialogsActivity$$ExternalSyntheticLambda54(this, arrayList2));
            return;
        }
        int i14 = Integer.MAX_VALUE;
        if (dialogFilter != null && ((i == 100 || i == 108) && this.canPinCount != 0)) {
            int size3 = dialogFilter.pinnedDialogs.size();
            for (int i15 = 0; i15 < size3; i15++) {
                i14 = Math.min(i14, dialogFilter.pinnedDialogs.valueAt(i15));
            }
            i14 -= this.canPinCount;
        }
        int i16 = i14;
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            long longValue2 = arrayList2.get(i17).longValue();
            TLRPC$Dialog tLRPC$Dialog3 = getMessagesController().dialogs_dict.get(longValue2);
            if (tLRPC$Dialog3 != null) {
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(longValue2)));
                    if (encryptedChat != null) {
                        tLRPC$User2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                    } else {
                        tLRPC$User2 = new TLRPC$TL_userEmpty();
                    }
                    tLRPC$EncryptedChat = encryptedChat;
                    tLRPC$User = tLRPC$User2;
                } else if (DialogObject.isUserDialog(longValue2)) {
                    tLRPC$User = getMessagesController().getUser(Long.valueOf(longValue2));
                    tLRPC$EncryptedChat = null;
                } else {
                    tLRPC$Chat = getMessagesController().getChat(Long.valueOf(-longValue2));
                    tLRPC$EncryptedChat = null;
                    tLRPC$User = null;
                    if (tLRPC$Chat == null || tLRPC$User != null) {
                        if (tLRPC$User != null || !tLRPC$User.bot || MessagesController.isSupportUser(tLRPC$User)) {
                            i4 = 100;
                            z4 = false;
                        } else {
                            i4 = 100;
                            z4 = true;
                        }
                        if (i != i4 || i == 108) {
                            str = str3;
                            if (this.canPinCount == 0) {
                                if (!isDialogPinned(tLRPC$Dialog3)) {
                                    i18++;
                                    TLRPC$EncryptedChat tLRPC$EncryptedChat2 = tLRPC$EncryptedChat;
                                    pinDialog(longValue2, true, dialogFilter, i16, size == 1);
                                    if (dialogFilter != null) {
                                        i16++;
                                        if (tLRPC$EncryptedChat2 != null) {
                                            if (!dialogFilter.alwaysShow.contains(Long.valueOf(tLRPC$EncryptedChat2.user_id))) {
                                                dialogFilter.alwaysShow.add(Long.valueOf(tLRPC$EncryptedChat2.user_id));
                                            }
                                        } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(tLRPC$Dialog3.id))) {
                                            dialogFilter.alwaysShow.add(Long.valueOf(tLRPC$Dialog3.id));
                                        }
                                    }
                                }
                            } else if (isDialogPinned(tLRPC$Dialog3)) {
                                i18++;
                                pinDialog(longValue2, false, dialogFilter, i16, size == 1);
                            }
                        } else if (i != 101) {
                            if (i == 102) {
                                i5 = 1;
                            } else if (i == 103) {
                                i5 = 1;
                            } else if (i == 104) {
                                if (size == 1 && this.canMuteCount == 1) {
                                    showDialog(AlertsCreator.createMuteAlert(this, longValue2, null), new DialogsActivity$$ExternalSyntheticLambda15(this));
                                    return;
                                } else if (this.canUnmuteCount != 0) {
                                    if (getMessagesController().isDialogMuted(longValue2)) {
                                        getNotificationsController().setDialogNotificationsSettings(longValue2, 4);
                                    }
                                } else if (!getMessagesController().isDialogMuted(longValue2)) {
                                    getNotificationsController().setDialogNotificationsSettings(longValue2, 3);
                                }
                            }
                            if (size == i5) {
                                if (i == 102 && this.canDeletePsaSelected) {
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                                    builder2.setTitle(LocaleController.getString("PsaHideChatAlertTitle", 2131627817));
                                    builder2.setMessage(LocaleController.getString("PsaHideChatAlertText", 2131627816));
                                    builder2.setPositiveButton(LocaleController.getString("PsaHide", 2131627815), new DialogsActivity$$ExternalSyntheticLambda7(this));
                                    builder2.setNegativeButton(LocaleController.getString(str3, 2131624832), null);
                                    showDialog(builder2.create());
                                    return;
                                }
                                boolean z8 = i == 103;
                                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(tLRPC$Dialog3.id);
                                if (i == 102) {
                                    z5 = true;
                                }
                                AlertsCreator.createClearOrDeleteDialogAlert(this, z8, tLRPC$Chat, tLRPC$User, isEncryptedDialog, z5, new DialogsActivity$$ExternalSyntheticLambda48(this, i, tLRPC$Chat, longValue2, z4));
                                return;
                            } else if (getMessagesController().isPromoDialog(longValue2, true)) {
                                getMessagesController().hidePromoDialog();
                            } else if (i == 103 && this.canClearCacheCount != 0) {
                                getMessagesController().deleteDialog(longValue2, 2, z5);
                            } else {
                                str = str3;
                                lambda$performSelectedDialogsAction$37(i, longValue2, tLRPC$Chat, z4, false);
                            }
                        } else if (this.canReadCount != 0) {
                            markAsRead(longValue2);
                        } else {
                            markAsUnread(longValue2);
                        }
                        i17++;
                        arrayList2 = arrayList;
                        str3 = str;
                        z5 = false;
                    }
                }
                tLRPC$Chat = null;
                if (tLRPC$Chat == null) {
                }
                if (tLRPC$User != null) {
                }
                i4 = 100;
                z4 = false;
                if (i != i4) {
                }
                str = str3;
                if (this.canPinCount == 0) {
                }
                i17++;
                arrayList2 = arrayList;
                str3 = str;
                z5 = false;
            }
            str = str3;
            i17++;
            arrayList2 = arrayList;
            str3 = str;
            z5 = false;
        }
        if (i == 104 && (size != 1 || this.canMuteCount != 1)) {
            if (this.canUnmuteCount == 0) {
                resourcesProvider = null;
                z3 = true;
            } else {
                resourcesProvider = null;
                z3 = false;
            }
            BulletinFactory.createMuteBulletin(this, z3, resourcesProvider).show();
        }
        if (i == 100 || i == 108) {
            if (dialogFilter != null) {
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                j = 0;
            } else {
                j = 0;
                getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
            }
            if (this.searchIsShowed) {
                getUndoView().showWithAction(j, this.canPinCount != 0 ? 78 : 79, Integer.valueOf(i18));
            }
        }
        hideActionMode((i == 108 || i == 100 || i == 102) ? false : true);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$32(ArrayList arrayList) {
        getMessagesController().addDialogToFolder(arrayList, this.folderId == 0 ? 0 : 1, -1, null, 0L);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$34(ArrayList arrayList, int i, DialogInterface dialogInterface, int i2) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<Long> arrayList2 = new ArrayList<>(arrayList);
        getUndoView().showWithAction(arrayList2, i == 102 ? 27 : 26, (Object) null, (Object) null, new DialogsActivity$$ExternalSyntheticLambda39(this, i, arrayList2), (Runnable) null);
        hideActionMode(i == 103);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$33(int i, ArrayList arrayList) {
        if (i == 102) {
            getMessagesController().setDialogsInTransaction(true);
            performSelectedDialogsAction(arrayList, i, false);
            getMessagesController().setDialogsInTransaction(false);
            getMessagesController().checkIfFolderEmpty(this.folderId);
            if (this.folderId == 0 || getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false).size() != 0) {
                return;
            }
            this.viewPages[0].listView.setEmptyView(null);
            this.viewPages[0].progressView.setVisibility(4);
            finishFragment();
            return;
        }
        performSelectedDialogsAction(arrayList, i, false);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$35(ArrayList arrayList, boolean z, boolean z2) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (z) {
                getMessagesController().reportSpam(longValue, getMessagesController().getUser(Long.valueOf(longValue)), null, null, false);
            }
            if (z2) {
                getMessagesController().deleteDialog(longValue, 0, true);
            }
            getMessagesController().blockPeer(longValue);
        }
        hideActionMode(false);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$36(DialogInterface dialogInterface, int i) {
        getMessagesController().hidePromoDialog();
        hideActionMode(false);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$38(int i, TLRPC$Chat tLRPC$Chat, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        ArrayList<TLRPC$Dialog> arrayList;
        hideActionMode(false);
        if (i == 103 && ChatObject.isChannel(tLRPC$Chat) && (!tLRPC$Chat.megagroup || !TextUtils.isEmpty(tLRPC$Chat.username))) {
            getMessagesController().deleteDialog(j, 2, z2);
            return;
        }
        if (i == 102 && this.folderId != 0 && getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false).size() == 1) {
            this.viewPages[0].progressView.setVisibility(4);
        }
        this.debugLastUpdateAction = 3;
        if (i == 102) {
            setDialogsListFrozen(true);
            if (this.frozenDialogsList != null) {
                for (int i5 = 0; i5 < this.frozenDialogsList.size(); i5++) {
                    if (this.frozenDialogsList.get(i5).id == j) {
                        i2 = i5;
                        break;
                    }
                }
            }
        }
        i2 = -1;
        int i6 = i2;
        getUndoView().showWithAction(j, i == 103 ? 0 : 1, (Runnable) new DialogsActivity$$ExternalSyntheticLambda38(this, i, j, tLRPC$Chat, z, z2));
        ArrayList arrayList2 = new ArrayList(getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false));
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList2.size()) {
                i3 = 102;
                i4 = -1;
                break;
            } else if (((TLRPC$Dialog) arrayList2.get(i7)).id == j) {
                i4 = i7;
                i3 = 102;
                break;
            } else {
                i7++;
            }
        }
        if (i != i3) {
            return;
        }
        if (i6 >= 0 && i4 < 0 && (arrayList = this.frozenDialogsList) != null) {
            arrayList.remove(i6);
            this.viewPages[0].dialogsItemAnimator.prepareForRemove();
            this.viewPages[0].dialogsAdapter.notifyItemRemoved(i6);
            this.dialogRemoveFinished = 2;
            return;
        }
        setDialogsListFrozen(false);
    }

    public /* synthetic */ void lambda$performSelectedDialogsAction$39(DialogInterface dialogInterface) {
        hideActionMode(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void markAsRead(long j) {
        int i;
        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(j);
        MessagesController.DialogFilter dialogFilter = null;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        }
        this.debugLastUpdateAction = 2;
        int i2 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, tLRPC$Dialog)) {
            setDialogsListFrozen(true);
            if (this.frozenDialogsList != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.frozenDialogsList.size()) {
                        break;
                    } else if (this.frozenDialogsList.get(i3).id == j) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 < 0) {
                    setDialogsListFrozen(false, false);
                }
                i = i2;
                getMessagesController().markMentionsAsRead(j);
                MessagesController messagesController = getMessagesController();
                int i4 = tLRPC$Dialog.top_message;
                messagesController.markDialogAsRead(j, i4, i4, tLRPC$Dialog.last_message_date, false, 0, 0, true, 0);
                if (i >= 0) {
                    return;
                }
                this.frozenDialogsList.remove(i);
                this.viewPages[0].dialogsItemAnimator.prepareForRemove();
                this.viewPages[0].dialogsAdapter.notifyItemRemoved(i);
                this.dialogRemoveFinished = 2;
                return;
            }
        }
        i = -1;
        getMessagesController().markMentionsAsRead(j);
        MessagesController messagesController2 = getMessagesController();
        int i42 = tLRPC$Dialog.top_message;
        messagesController2.markDialogAsRead(j, i42, i42, tLRPC$Dialog.last_message_date, false, 0, 0, true, 0);
        if (i >= 0) {
        }
    }

    private void markAsUnread(long j) {
        getMessagesController().markDialogAsUnread(j, null, 0L);
    }

    /* renamed from: performDeleteOrClearDialogAction */
    public void lambda$performSelectedDialogsAction$37(int i, long j, TLRPC$Chat tLRPC$Chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().deleteDialog(j, 1, z2);
            return;
        }
        if (tLRPC$Chat != null) {
            if (ChatObject.isNotInChat(tLRPC$Chat)) {
                getMessagesController().deleteDialog(j, 0, z2);
            } else {
                getMessagesController().deleteParticipantFromChat((int) (-j), getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), null, null, z2, false);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z2);
            if (z) {
                getMessagesController().blockPeer((int) j);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, Long.valueOf(j));
        }
        getMessagesController().checkIfFolderEmpty(this.folderId);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pinDialog(long j, boolean z, MessagesController.DialogFilter dialogFilter, int i, boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5 = true;
        int i3 = (this.viewPages[0].dialogsType != 0 || !hasHiddenArchive()) ? 0 : 1;
        int findFirstVisibleItemPosition = this.viewPages[0].layoutManager.findFirstVisibleItemPosition();
        if (dialogFilter != null) {
            int i4 = dialogFilter.pinnedDialogs.get(j, Integer.MIN_VALUE);
            if (!z && i4 == Integer.MIN_VALUE) {
                return;
            }
        }
        this.debugLastUpdateAction = z ? 4 : 5;
        int i5 = -1;
        if (findFirstVisibleItemPosition > i3 || !z2) {
            i2 = -1;
            z3 = true;
        } else {
            setDialogsListFrozen(true);
            if (this.frozenDialogsList != null) {
                for (int i6 = 0; i6 < this.frozenDialogsList.size(); i6++) {
                    if (this.frozenDialogsList.get(i6).id == j) {
                        i2 = i6;
                        break;
                    }
                }
            }
            i2 = -1;
            z3 = false;
        }
        if (dialogFilter != null) {
            if (z) {
                dialogFilter.pinnedDialogs.put(j, i);
            } else {
                dialogFilter.pinnedDialogs.delete(j);
            }
            if (z2) {
                getMessagesController().onFilterUpdate(dialogFilter);
            }
            z4 = true;
        } else {
            z4 = getMessagesController().pinDialog(j, z, null, -1L);
        }
        if (z4) {
            if (!z3) {
                ArrayList<TLRPC$Dialog> dialogsArray = getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false);
                int i7 = 0;
                while (true) {
                    if (i7 >= dialogsArray.size()) {
                        break;
                    } else if (dialogsArray.get(i7).id == j) {
                        i5 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                if (this.initialDialogsType != 10) {
                    hideFloatingButton(false);
                }
                scrollToTop();
            }
        }
        if (!z3) {
            if (i2 >= 0) {
                ArrayList<TLRPC$Dialog> arrayList = this.frozenDialogsList;
                if (arrayList != null && i5 >= 0 && i2 != i5) {
                    arrayList.add(i5, arrayList.remove(i2));
                    this.viewPages[0].dialogsItemAnimator.prepareForRemove();
                    this.viewPages[0].dialogsAdapter.notifyItemRemoved(i2);
                    this.viewPages[0].dialogsAdapter.notifyItemInserted(i5);
                    this.dialogRemoveFinished = 2;
                    this.dialogInsertFinished = 2;
                    this.viewPages[0].layoutManager.scrollToPositionWithOffset((this.viewPages[0].dialogsType != 0 || !hasHiddenArchive()) ? 0 : 1, (int) this.actionBar.getTranslationY());
                } else if (i5 >= 0 && i2 == i5) {
                    AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda33(this), 200L);
                }
                if (!z5) {
                    return;
                }
                setDialogsListFrozen(false);
                return;
            }
            z5 = false;
            if (!z5) {
            }
        }
    }

    public /* synthetic */ void lambda$pinDialog$40() {
        setDialogsListFrozen(false);
    }

    public void scrollToTop() {
        int findFirstVisibleItemPosition = this.viewPages[0].layoutManager.findFirstVisibleItemPosition() * AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
        int i = (this.viewPages[0].dialogsType != 0 || !hasHiddenArchive()) ? 0 : 1;
        this.viewPages[0].listView.getItemAnimator();
        if (findFirstVisibleItemPosition >= this.viewPages[0].listView.getMeasuredHeight() * 1.2f) {
            this.viewPages[0].scrollHelper.setScrollDirection(1);
            this.viewPages[0].scrollHelper.scrollToPosition(i, 0, false, true);
            resetScroll();
            return;
        }
        this.viewPages[0].listView.smoothScrollToPosition(i);
    }

    public void updateCounters(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC$User tLRPC$User;
        this.canDeletePsaSelected = false;
        this.canUnarchiveCount = 0;
        this.canUnmuteCount = 0;
        this.canMuteCount = 0;
        this.canPinCount = 0;
        this.canReadCount = 0;
        this.canClearCacheCount = 0;
        this.canReportSpamCount = 0;
        if (z) {
            return;
        }
        int size = this.selectedDialogs.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i5 < size) {
            TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(this.selectedDialogs.get(i5).longValue());
            if (tLRPC$Dialog == null) {
                i2 = size;
                i3 = i5;
            } else {
                long j = tLRPC$Dialog.id;
                boolean isDialogPinned = isDialogPinned(tLRPC$Dialog);
                i2 = size;
                boolean z2 = tLRPC$Dialog.unread_count != 0 || tLRPC$Dialog.unread_mark;
                if (getMessagesController().isDialogMuted(j)) {
                    i3 = i5;
                    i4 = 1;
                    this.canUnmuteCount++;
                } else {
                    i3 = i5;
                    i4 = 1;
                    this.canMuteCount++;
                }
                if (z2) {
                    this.canReadCount += i4;
                }
                if (this.folderId == i4 || tLRPC$Dialog.folder_id == i4) {
                    this.canUnarchiveCount++;
                } else if (j != clientUserId && j != 777000 && !getMessagesController().isPromoDialog(j, false)) {
                    i8++;
                }
                if (!DialogObject.isUserDialog(j) || j == clientUserId || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j)))) {
                    i10++;
                } else {
                    if (notificationsSettings.getBoolean("dialog_bar_report" + j, true)) {
                        this.canReportSpamCount++;
                    }
                }
                if (DialogObject.isChannel(tLRPC$Dialog)) {
                    TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                    if (getMessagesController().isPromoDialog(tLRPC$Dialog.id, true)) {
                        this.canClearCacheCount++;
                        if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                            i6++;
                            this.canDeletePsaSelected = true;
                        }
                    } else {
                        if (isDialogPinned) {
                            i9++;
                        } else {
                            this.canPinCount++;
                        }
                        if (chat != null && chat.megagroup) {
                            if (!TextUtils.isEmpty(chat.username)) {
                                this.canClearCacheCount++;
                            }
                        } else {
                            this.canClearCacheCount++;
                        }
                        i6++;
                    }
                } else {
                    boolean isChatDialog = DialogObject.isChatDialog(tLRPC$Dialog.id);
                    if (isChatDialog) {
                        getMessagesController().getChat(Long.valueOf(-tLRPC$Dialog.id));
                    }
                    if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                        TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(tLRPC$Dialog.id)));
                        if (encryptedChat != null) {
                            tLRPC$User = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            tLRPC$User = new TLRPC$TL_userEmpty();
                        }
                    } else {
                        tLRPC$User = (isChatDialog || !DialogObject.isUserDialog(tLRPC$Dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(tLRPC$Dialog.id));
                    }
                    if (tLRPC$User != null && tLRPC$User.bot) {
                        MessagesController.isSupportUser(tLRPC$User);
                    }
                    if (isDialogPinned) {
                        i9++;
                    } else {
                        this.canPinCount++;
                    }
                }
                i7++;
                i6++;
            }
            i5 = i3 + 1;
            size = i2;
        }
        if (i6 != size) {
            this.deleteItem.setVisibility(8);
        } else {
            this.deleteItem.setVisibility(0);
        }
        int i11 = this.canClearCacheCount;
        if ((i11 != 0 && i11 != size) || (i7 != 0 && i7 != size)) {
            this.clearItem.setVisibility(8);
        } else {
            this.clearItem.setVisibility(0);
            if (this.canClearCacheCount != 0) {
                this.clearItem.setText(LocaleController.getString("ClearHistoryCache", 2131625155));
            } else {
                this.clearItem.setText(LocaleController.getString("ClearHistory", 2131625154));
            }
        }
        if (this.canUnarchiveCount != 0) {
            String string = LocaleController.getString("Unarchive", 2131628790);
            this.archiveItem.setTextAndIcon(string, 2131165970);
            this.archive2Item.setIcon(2131165970);
            this.archive2Item.setContentDescription(string);
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
                this.archive2Item.setVisibility(0);
                this.archiveItem.setVisibility(8);
            } else {
                this.archiveItem.setVisibility(0);
                this.archive2Item.setVisibility(8);
            }
        } else if (i8 != 0) {
            String string2 = LocaleController.getString("Archive", 2131624401);
            this.archiveItem.setTextAndIcon(string2, 2131165637);
            this.archive2Item.setIcon(2131165637);
            this.archive2Item.setContentDescription(string2);
            FilterTabsView filterTabsView2 = this.filterTabsView;
            if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0) {
                this.archive2Item.setVisibility(0);
                this.archiveItem.setVisibility(8);
            } else {
                this.archiveItem.setVisibility(0);
                this.archive2Item.setVisibility(8);
            }
        } else {
            this.archiveItem.setVisibility(8);
            this.archive2Item.setVisibility(8);
        }
        if (this.canPinCount + i9 != size) {
            this.pinItem.setVisibility(8);
            this.pin2Item.setVisibility(8);
            i = 0;
        } else {
            FilterTabsView filterTabsView3 = this.filterTabsView;
            if (filterTabsView3 != null && filterTabsView3.getVisibility() == 0) {
                i = 0;
                this.pin2Item.setVisibility(0);
                this.pinItem.setVisibility(8);
            } else {
                i = 0;
                this.pinItem.setVisibility(0);
                this.pin2Item.setVisibility(8);
            }
        }
        if (i10 != 0) {
            this.blockItem.setVisibility(8);
        } else {
            this.blockItem.setVisibility(i);
        }
        FilterTabsView filterTabsView4 = this.filterTabsView;
        if (filterTabsView4 == null || filterTabsView4.getVisibility() != 0 || this.filterTabsView.currentTabIsDefault()) {
            this.removeFromFolderItem.setVisibility(8);
        } else {
            this.removeFromFolderItem.setVisibility(i);
        }
        FilterTabsView filterTabsView5 = this.filterTabsView;
        if (filterTabsView5 != null && filterTabsView5.getVisibility() == 0 && this.filterTabsView.currentTabIsDefault() && !FiltersListBottomSheet.getCanAddDialogFilters(this, this.selectedDialogs).isEmpty()) {
            this.addToFolderItem.setVisibility(0);
        } else {
            this.addToFolderItem.setVisibility(8);
        }
        if (this.canUnmuteCount != 0) {
            this.muteItem.setIcon(2131165972);
            this.muteItem.setContentDescription(LocaleController.getString("ChatsUnmute", 2131625098));
        } else {
            this.muteItem.setIcon(2131165820);
            this.muteItem.setContentDescription(LocaleController.getString("ChatsMute", 2131625078));
        }
        if (this.canReadCount != 0) {
            this.readItem.setTextAndIcon(LocaleController.getString("MarkAsRead", 2131626589), 2131165795);
        } else {
            this.readItem.setTextAndIcon(LocaleController.getString("MarkAsUnread", 2131626590), 2131165796);
        }
        if (this.canPinCount != 0) {
            this.pinItem.setIcon(2131165863);
            this.pinItem.setContentDescription(LocaleController.getString("PinToTop", 2131627589));
            this.pin2Item.setText(LocaleController.getString("DialogPin", 2131625482));
            return;
        }
        this.pinItem.setIcon(2131165973);
        this.pinItem.setContentDescription(LocaleController.getString("UnpinFromTop", 2131628815));
        this.pin2Item.setText(LocaleController.getString("DialogUnpin", 2131625483));
    }

    public boolean validateSlowModeDialog(long j) {
        TLRPC$Chat chat;
        ChatActivityEnterView chatActivityEnterView;
        if ((this.messagesCount > 1 || ((chatActivityEnterView = this.commentView) != null && chatActivityEnterView.getVisibility() == 0 && !TextUtils.isEmpty(this.commentView.getFieldText()))) && DialogObject.isChatDialog(j) && (chat = getMessagesController().getChat(Long.valueOf(-j))) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
            AlertsCreator.showSimpleAlert(this, LocaleController.getString("Slowmode", 2131628424), LocaleController.getString("SlowmodeSendError", 2131628432));
            return false;
        }
        return true;
    }

    private void showOrUpdateActionMode(long j, View view) {
        addOrRemoveSelectedDialog(j, view);
        boolean z = true;
        if (this.actionBar.isActionModeShowed()) {
            if (this.selectedDialogs.isEmpty()) {
                hideActionMode(true);
                return;
            }
        } else {
            if (this.searchIsShowed) {
                createActionMode("search_dialogs_action_mode");
                if (this.actionBar.getBackButton().getDrawable() instanceof MenuDrawable) {
                    this.actionBar.setBackButtonDrawable(new BackDrawable(false));
                }
            } else {
                createActionMode(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(Theme.getColor("windowBackgroundWhite"));
            this.actionBar.showActionMode();
            resetScroll();
            if (this.menuDrawable != null) {
                this.actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrGoBack", 2131623987));
            }
            if (getPinnedCount() > 1) {
                if (this.viewPages != null) {
                    int i = 0;
                    while (true) {
                        ViewPage[] viewPageArr = this.viewPages;
                        if (i >= viewPageArr.length) {
                            break;
                        }
                        viewPageArr[i].dialogsAdapter.onReorderStateChanged(true);
                        i++;
                    }
                }
                updateVisibleRows(MessagesController.UPDATE_MASK_REORDER);
            }
            if (!this.searchIsShowed) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.actionModeViews.size(); i2++) {
                    View view2 = this.actionModeViews.get(i2);
                    view2.setPivotY(ActionBar.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.actionBarColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progressToActionMode, 1.0f);
            this.actionBarColorAnimator = ofFloat;
            ofFloat.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda3(this));
            this.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.actionBarColorAnimator.setDuration(200L);
            this.actionBarColorAnimator.start();
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.animateColorsTo("profile_tabSelectedLine", "profile_tabSelectedText", "profile_tabText", "profile_tabSelector", "actionBarActionModeDefault");
            }
            MenuDrawable menuDrawable = this.menuDrawable;
            if (menuDrawable != null) {
                menuDrawable.setRotateToBack(false);
                this.menuDrawable.setRotation(1.0f, true);
            } else {
                BackDrawable backDrawable = this.backDrawable;
                if (backDrawable != null) {
                    backDrawable.setRotation(1.0f, true);
                }
            }
            z = false;
        }
        updateCounters(false);
        this.selectedDialogsCountTextView.setNumber(this.selectedDialogs.size(), z);
    }

    public /* synthetic */ void lambda$showOrUpdateActionMode$41(ValueAnimator valueAnimator) {
        this.progressToActionMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void closeSearch() {
        if (AndroidUtilities.isTablet()) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject == null) {
                return;
            }
            this.searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
            this.searchObject = null;
            return;
        }
        this.closeSearchFieldOnHide = true;
    }

    public RecyclerListView getListView() {
        return this.viewPages[0].listView;
    }

    public RecyclerListView getSearchListView() {
        return this.searchViewPager.searchListView;
    }

    public UndoView getUndoView() {
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            ContentView contentView = (ContentView) this.fragmentView;
            contentView.removeView(this.undoView[0]);
            contentView.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public void updateProxyButton(boolean z, boolean z2) {
        boolean z3;
        ActionBarMenuItem actionBarMenuItem;
        if (this.proxyDrawable != null) {
            ActionBarMenuItem actionBarMenuItem2 = this.doneItem;
            if (actionBarMenuItem2 != null && actionBarMenuItem2.getVisibility() == 0) {
                return;
            }
            boolean z4 = false;
            int i = 0;
            while (true) {
                if (i >= getDownloadController().downloadingFiles.size()) {
                    z3 = false;
                    break;
                } else if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i).getFileName())) {
                    z3 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!this.searching && (getDownloadController().hasUnviewedDownloads() || z3 || (this.downloadsItem.getVisibility() == 0 && this.downloadsItem.getAlpha() == 1.0f && !z2))) {
                this.downloadsItemVisible = true;
                this.downloadsItem.setVisibility(0);
            } else {
                this.downloadsItem.setVisibility(8);
                this.downloadsItemVisible = false;
            }
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            boolean z5 = sharedPreferences.getBoolean("proxy_enabled", false);
            if ((!this.downloadsItemVisible && !this.searching && z5 && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                if (!this.actionBar.isSearchFieldVisible() && ((actionBarMenuItem = this.doneItem) == null || actionBarMenuItem.getVisibility() != 0)) {
                    this.proxyItem.setVisibility(0);
                }
                this.proxyItemVisible = true;
                ProxyDrawable proxyDrawable = this.proxyDrawable;
                int i2 = this.currentConnectionState;
                if (i2 == 3 || i2 == 5) {
                    z4 = true;
                }
                proxyDrawable.setConnected(z5, z4, z);
                return;
            }
            this.proxyItemVisible = false;
            this.proxyItem.setVisibility(8);
        }
    }

    public void showDoneItem(boolean z) {
        if (this.doneItem == null) {
            return;
        }
        AnimatorSet animatorSet = this.doneItemAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.doneItemAnimator = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.doneItemAnimator = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z) {
            this.doneItem.setVisibility(0);
        } else {
            this.doneItem.setSelected(false);
            Drawable background = this.doneItem.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.proxyItem;
            if (actionBarMenuItem2 != null && this.proxyItemVisible) {
                actionBarMenuItem2.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem3 = this.passcodeItem;
            if (actionBarMenuItem3 != null && this.passcodeItemVisible) {
                actionBarMenuItem3.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem4 = this.downloadsItem;
            if (actionBarMenuItem4 != null && this.downloadsItemVisible) {
                actionBarMenuItem4.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        ActionBarMenuItem actionBarMenuItem5 = this.doneItem;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        float f = 1.0f;
        fArr[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem5, property, fArr));
        if (this.proxyItemVisible) {
            ActionBarMenuItem actionBarMenuItem6 = this.proxyItem;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem6, property2, fArr2));
        }
        if (this.passcodeItemVisible) {
            ActionBarMenuItem actionBarMenuItem7 = this.passcodeItem;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem7, property3, fArr3));
        }
        ActionBarMenuItem actionBarMenuItem8 = this.searchItem;
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[1];
        if (z) {
            f = 0.0f;
        }
        fArr4[0] = f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem8, property4, fArr4));
        this.doneItemAnimator.playTogether(arrayList);
        this.doneItemAnimator.addListener(new AnonymousClass35(z));
        this.doneItemAnimator.start();
    }

    /* renamed from: org.telegram.ui.DialogsActivity$35 */
    /* loaded from: classes3.dex */
    public class AnonymousClass35 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$show;

        AnonymousClass35(boolean z) {
            DialogsActivity.this = r1;
            this.val$show = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.doneItemAnimator = null;
            if (this.val$show) {
                if (DialogsActivity.this.searchItem != null) {
                    DialogsActivity.this.searchItem.setVisibility(4);
                }
                if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                    DialogsActivity.this.proxyItem.setVisibility(4);
                }
                if (DialogsActivity.this.passcodeItem != null && DialogsActivity.this.passcodeItemVisible) {
                    DialogsActivity.this.passcodeItem.setVisibility(4);
                }
                if (DialogsActivity.this.downloadsItem == null || !DialogsActivity.this.downloadsItemVisible) {
                    return;
                }
                DialogsActivity.this.downloadsItem.setVisibility(4);
            } else if (DialogsActivity.this.doneItem == null) {
            } else {
                DialogsActivity.this.doneItem.setVisibility(8);
            }
        }
    }

    public void updateSelectedCount() {
        CharSequence charSequence = "";
        if (this.commentView != null) {
            if (this.selectedDialogs.isEmpty()) {
                if (this.initialDialogsType == 3 && this.selectAlertString == null) {
                    this.actionBar.setTitle(LocaleController.getString("ForwardTo", 2131625992));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("SelectChat", 2131628222));
                }
                if (this.commentView.getTag() != null) {
                    this.commentView.hidePopup(false);
                    this.commentView.closeKeyboard();
                    AnimatorSet animatorSet = this.commentViewAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    this.commentViewAnimator = new AnimatorSet();
                    this.commentView.setTranslationY(0.0f);
                    AnimatorSet animatorSet2 = this.commentViewAnimator;
                    ChatActivityEnterView chatActivityEnterView = this.commentView;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(chatActivityEnterView, View.TRANSLATION_Y, chatActivityEnterView.getMeasuredHeight()), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.selectedCountView, View.ALPHA, 0.0f));
                    this.commentViewAnimator.setDuration(180L);
                    this.commentViewAnimator.setInterpolator(new DecelerateInterpolator());
                    this.commentViewAnimator.addListener(new AnonymousClass36());
                    this.commentViewAnimator.start();
                    this.commentView.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                this.selectedCountView.invalidate();
                if (this.commentView.getTag() == null) {
                    this.commentView.setFieldText(charSequence);
                    AnimatorSet animatorSet3 = this.commentViewAnimator;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    this.commentView.setVisibility(0);
                    this.writeButtonContainer.setVisibility(0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.commentViewAnimator = animatorSet4;
                    ChatActivityEnterView chatActivityEnterView2 = this.commentView;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(chatActivityEnterView2, View.TRANSLATION_Y, chatActivityEnterView2.getMeasuredHeight(), 0.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.ALPHA, 1.0f));
                    this.commentViewAnimator.setDuration(180L);
                    this.commentViewAnimator.setInterpolator(new DecelerateInterpolator());
                    this.commentViewAnimator.addListener(new AnonymousClass37());
                    this.commentViewAnimator.start();
                    this.commentView.setTag(1);
                }
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", this.selectedDialogs.size(), new Object[0]));
            }
        } else if (this.initialDialogsType == 10) {
            hideFloatingButton(this.selectedDialogs.isEmpty());
        }
        ArrayList<Long> arrayList = this.selectedDialogs;
        ChatActivityEnterView chatActivityEnterView3 = this.commentView;
        if (chatActivityEnterView3 != null) {
            charSequence = chatActivityEnterView3.getFieldText();
        }
        boolean shouldShowNextButton = shouldShowNextButton(this, arrayList, charSequence, false);
        this.isNextButton = shouldShowNextButton;
        AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[0], !shouldShowNextButton, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[1], this.isNextButton, 0.5f, true);
    }

    /* renamed from: org.telegram.ui.DialogsActivity$36 */
    /* loaded from: classes3.dex */
    public class AnonymousClass36 extends AnimatorListenerAdapter {
        AnonymousClass36() {
            DialogsActivity.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.commentView.setVisibility(8);
            DialogsActivity.this.writeButtonContainer.setVisibility(8);
        }
    }

    /* renamed from: org.telegram.ui.DialogsActivity$37 */
    /* loaded from: classes3.dex */
    public class AnonymousClass37 extends AnimatorListenerAdapter {
        AnonymousClass37() {
            DialogsActivity.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DialogsActivity.this.commentView.setTag(2);
            DialogsActivity.this.commentView.requestLayout();
        }
    }

    @TargetApi(23)
    private void askForPermissons(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (getUserConfig().syncContacts && this.askAboutContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(parentActivity, new DialogsActivity$$ExternalSyntheticLambda50(this)).create();
                this.permissionDialog = create;
                showDialog(create);
                return;
            }
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
        }
        if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (arrayList.isEmpty()) {
            if (!this.askingForPermissions) {
                return;
            }
            this.askingForPermissions = false;
            showFiltersHint();
            return;
        }
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void lambda$askForPermissons$42(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).commit();
        askForPermissons(false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null) {
            return;
        }
        askForPermissons(false);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onConfigurationChanged(Configuration configuration) {
        FrameLayout frameLayout;
        super.onConfigurationChanged(configuration);
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
        if (this.onlySelect || (frameLayout = this.floatingButtonContainer) == null) {
            return;
        }
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass38());
    }

    /* renamed from: org.telegram.ui.DialogsActivity$38 */
    /* loaded from: classes3.dex */
    class AnonymousClass38 implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass38() {
            DialogsActivity.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.floatingButtonTranslation = dialogsActivity.floatingHidden ? AndroidUtilities.dp(100.0f) : 0.0f;
            DialogsActivity.this.updateFloatingButtonOffset();
            DialogsActivity.this.floatingButtonContainer.setClickable(!DialogsActivity.this.floatingHidden);
            if (DialogsActivity.this.floatingButtonContainer != null) {
                DialogsActivity.this.floatingButtonContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        boolean z = true;
        if (i != 1) {
            if (i != 4) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    break;
                } else if (iArr[i2] != 0) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z || Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
            return;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (iArr.length > i3) {
                String str = strArr[i3];
                str.hashCode();
                if (!str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (str.equals("android.permission.READ_CONTACTS")) {
                        if (iArr[i3] == 0) {
                            AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda36(this));
                            getContactsController().forceImportContacts();
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.askAboutContacts = false;
                            edit.putBoolean("askAboutContacts", false).commit();
                        }
                    }
                } else if (iArr[i3] == 0) {
                    ImageLoader.getInstance().checkMediaPaths();
                }
            }
        }
        if (!this.askingForPermissions) {
            return;
        }
        this.askingForPermissions = false;
        showFiltersHint();
    }

    public /* synthetic */ void lambda$onRequestPermissionsResultFragment$43() {
        getNotificationCenter().postNotificationName(NotificationCenter.forceImportContactsStart, new Object[0]);
    }

    private void reloadViewPageDialogs(ViewPage viewPage, boolean z) {
        int i;
        int i2;
        if (viewPage.getVisibility() != 0) {
            return;
        }
        int currentCount = viewPage.dialogsAdapter.getCurrentCount();
        if (viewPage.dialogsType == 0 && hasHiddenArchive() && viewPage.listView.getChildCount() == 0) {
            ((LinearLayoutManager) viewPage.listView.getLayoutManager()).scrollToPositionWithOffset(1, 0);
        }
        if (viewPage.dialogsAdapter.isDataSetChanged() || z) {
            viewPage.dialogsAdapter.updateHasHints();
            int itemCount = viewPage.dialogsAdapter.getItemCount();
            if (itemCount != 1 || currentCount != 1 || viewPage.dialogsAdapter.getItemViewType(0) != 5) {
                viewPage.dialogsAdapter.notifyDataSetChanged();
                if (itemCount > currentCount && (i = this.initialDialogsType) != 11 && i != 12 && i != 13) {
                    viewPage.recyclerItemsEnterAnimator.showItemsAnimated(currentCount);
                }
            } else if (viewPage.dialogsAdapter.lastDialogsEmptyType != viewPage.dialogsAdapter.dialogsEmptyType()) {
                viewPage.dialogsAdapter.notifyItemChanged(0);
            }
        } else {
            updateVisibleRows(MessagesController.UPDATE_MASK_NEW_MESSAGE);
            if (viewPage.dialogsAdapter.getItemCount() > currentCount && (i2 = this.initialDialogsType) != 11 && i2 != 12 && i2 != 13) {
                viewPage.recyclerItemsEnterAnimator.showItemsAnimated(currentCount);
            }
        }
        try {
            viewPage.listView.setEmptyView(this.folderId == 0 ? viewPage.progressView : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        checkListLoad(viewPage);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ViewPage[] viewPageArr;
        DialogsSearchAdapter dialogsSearchAdapter;
        DialogsSearchAdapter dialogsSearchAdapter2;
        MessagesController.DialogFilter dialogFilter;
        int i3 = 0;
        if (i == NotificationCenter.dialogsNeedReload) {
            if (this.viewPages == null || this.dialogsListFrozen) {
                return;
            }
            int i4 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i4 >= viewPageArr2.length) {
                    break;
                }
                ViewPage viewPage = viewPageArr2[i4];
                if (viewPageArr2[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) {
                    dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                } else {
                    dialogFilter = null;
                }
                boolean z = (dialogFilter == null || (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.slowedReloadAfterDialogClick && z) {
                    AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda45(this, viewPage, objArr), 160L);
                } else {
                    reloadViewPageDialogs(viewPage, objArr.length > 0);
                }
                i4++;
            }
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
                this.filterTabsView.checkTabsCounter();
            }
            this.slowedReloadAfterDialogClick = false;
        } else if (i == NotificationCenter.dialogsUnreadCounterChanged) {
            FilterTabsView filterTabsView2 = this.filterTabsView;
            if (filterTabsView2 == null || filterTabsView2.getVisibility() != 0) {
                return;
            }
            FilterTabsView filterTabsView3 = this.filterTabsView;
            filterTabsView3.notifyTabCounterChanged(filterTabsView3.getDefaultTabId());
        } else if (i == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.emojiLoaded) {
            updateVisibleRows(0);
            FilterTabsView filterTabsView4 = this.filterTabsView;
            if (filterTabsView4 == null) {
                return;
            }
            filterTabsView4.getTabsContainer().invalidateViews();
        } else if (i == NotificationCenter.closeSearchByActiveAction) {
            ActionBar actionBar = this.actionBar;
            if (actionBar == null) {
                return;
            }
            actionBar.closeSearchField();
        } else if (i == NotificationCenter.proxySettingsChanged) {
            updateProxyButton(false, false);
        } else if (i == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            updateVisibleRows(num.intValue());
            FilterTabsView filterTabsView5 = this.filterTabsView;
            if (filterTabsView5 != null && filterTabsView5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                this.filterTabsView.checkTabsCounter();
            }
            if (this.viewPages == null) {
                return;
            }
            while (i3 < this.viewPages.length) {
                if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                    this.viewPages[i3].dialogsAdapter.sortOnlineContacts(true);
                }
                i3++;
            }
        } else if (i == NotificationCenter.appDidLogout) {
            dialogsLoaded[this.currentAccount] = false;
        } else if (i == NotificationCenter.encryptedChatUpdated) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.contactsDidLoad) {
            if (this.viewPages == null || this.dialogsListFrozen) {
                return;
            }
            boolean z2 = this.floatingProgressVisible;
            setFloatingProgressVisible(false, true);
            for (ViewPage viewPage2 : this.viewPages) {
                viewPage2.dialogsAdapter.setForceUpdatingContacts(false);
            }
            if (z2) {
                setContactsAlpha(0.0f);
                animateContactsAlpha(1.0f);
            }
            int i5 = 0;
            boolean z3 = false;
            while (true) {
                ViewPage[] viewPageArr3 = this.viewPages;
                if (i5 >= viewPageArr3.length) {
                    break;
                }
                if (!viewPageArr3[i5].isDefaultDialogType() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                    z3 = true;
                } else {
                    this.viewPages[i5].dialogsAdapter.notifyDataSetChanged();
                }
                i5++;
            }
            if (!z3) {
                return;
            }
            updateVisibleRows(0);
        } else if (i == NotificationCenter.openedChatChanged) {
            if (this.viewPages == null) {
                return;
            }
            int i6 = 0;
            while (true) {
                ViewPage[] viewPageArr4 = this.viewPages;
                if (i6 < viewPageArr4.length) {
                    if (viewPageArr4[i6].isDefaultDialogType() && AndroidUtilities.isTablet()) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        if (booleanValue) {
                            if (longValue == this.openedDialogId) {
                                this.openedDialogId = 0L;
                            }
                        } else {
                            this.openedDialogId = longValue;
                        }
                        this.viewPages[i6].dialogsAdapter.setOpenedDialogId(this.openedDialogId);
                    }
                    i6++;
                } else {
                    updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
                    return;
                }
            }
        } else if (i == NotificationCenter.notificationsSettingsUpdated) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.messageReceivedByAck || i == NotificationCenter.messageReceivedByServer || i == NotificationCenter.messageSendError) {
            updateVisibleRows(MessagesController.UPDATE_MASK_SEND_STATE);
        } else if (i == NotificationCenter.didSetPasscode) {
            updatePasscodeButton();
        } else if (i == NotificationCenter.needReloadRecentDialogsSearch) {
            SearchViewPager searchViewPager = this.searchViewPager;
            if (searchViewPager == null || (dialogsSearchAdapter2 = searchViewPager.dialogsSearchAdapter) == null) {
                return;
            }
            dialogsSearchAdapter2.loadRecentSearch();
        } else if (i == NotificationCenter.replyMessagesDidLoad) {
            updateVisibleRows(MessagesController.UPDATE_MASK_MESSAGE_TEXT);
        } else if (i == NotificationCenter.reloadHints) {
            SearchViewPager searchViewPager2 = this.searchViewPager;
            if (searchViewPager2 == null || (dialogsSearchAdapter = searchViewPager2.dialogsSearchAdapter) == null) {
                return;
            }
            dialogsSearchAdapter.notifyDataSetChanged();
        } else if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = AccountInstance.getInstance(i2).getConnectionsManager().getConnectionState();
            if (this.currentConnectionState == connectionState) {
                return;
            }
            this.currentConnectionState = connectionState;
            updateProxyButton(true, false);
        } else if (i == NotificationCenter.onDownloadingFilesChanged) {
            updateProxyButton(true, false);
        } else if (i == NotificationCenter.needDeleteDialog) {
            if (this.fragmentView == null || this.isPaused) {
                return;
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            DialogsActivity$$ExternalSyntheticLambda43 dialogsActivity$$ExternalSyntheticLambda43 = new DialogsActivity$$ExternalSyntheticLambda43(this, (TLRPC$Chat) objArr[2], longValue2, ((Boolean) objArr[3]).booleanValue(), (TLRPC$User) objArr[1]);
            if (this.undoView[0] != null) {
                getUndoView().showWithAction(longValue2, 1, (Runnable) dialogsActivity$$ExternalSyntheticLambda43);
            } else {
                dialogsActivity$$ExternalSyntheticLambda43.run();
            }
        } else if (i == NotificationCenter.folderBecomeEmpty) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i7 = this.folderId;
            if (i7 != intValue || i7 == 0) {
                return;
            }
            finishFragment();
        } else if (i == NotificationCenter.dialogFiltersUpdated) {
            updateFilterTabs(true, true);
        } else if (i == NotificationCenter.filterSettingsUpdated) {
            showFiltersHint();
        } else if (i == NotificationCenter.newSuggestionsAvailable) {
            showNextSupportedSuggestion();
        } else if (i == NotificationCenter.forceImportContactsStart) {
            setFloatingProgressVisible(true, true);
            for (ViewPage viewPage3 : this.viewPages) {
                viewPage3.dialogsAdapter.setForceShowEmptyCell(false);
                viewPage3.dialogsAdapter.setForceUpdatingContacts(true);
                viewPage3.dialogsAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.messagesDeleted) {
            if (!this.searchIsShowed || this.searchViewPager == null) {
                return;
            }
            this.searchViewPager.messagesDeleted(((Long) objArr[1]).longValue(), (ArrayList) objArr[0]);
        } else if (i == NotificationCenter.didClearDatabase) {
            if (this.viewPages != null) {
                while (true) {
                    ViewPage[] viewPageArr5 = this.viewPages;
                    if (i3 >= viewPageArr5.length) {
                        break;
                    }
                    viewPageArr5[i3].dialogsAdapter.didDatabaseCleared();
                    i3++;
                }
            }
            SuggestClearDatabaseBottomSheet.dismissDialog();
        } else if (i == NotificationCenter.appUpdateAvailable) {
            updateMenuButton(true);
        } else if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed || i == NotificationCenter.fileLoadProgressChanged) {
            String str = (String) objArr[0];
            if (!SharedConfig.isAppUpdateAvailable() || !FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str)) {
                return;
            }
            updateMenuButton(true);
        } else if (i == NotificationCenter.onDatabaseMigration) {
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            if (this.fragmentView == null) {
                return;
            }
            if (booleanValue2) {
                if (this.databaseMigrationHint == null) {
                    DatabaseMigrationHint databaseMigrationHint = new DatabaseMigrationHint(this.fragmentView.getContext(), this.currentAccount);
                    this.databaseMigrationHint = databaseMigrationHint;
                    databaseMigrationHint.setAlpha(0.0f);
                    ((ContentView) this.fragmentView).addView(this.databaseMigrationHint);
                    this.databaseMigrationHint.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                }
                this.databaseMigrationHint.setTag(1);
                return;
            }
            View view = this.databaseMigrationHint;
            if (view == null || view.getTag() == null) {
                return;
            }
            View view2 = this.databaseMigrationHint;
            view2.animate().setListener(null).cancel();
            view2.animate().setListener(new AnonymousClass39(view2)).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
            this.databaseMigrationHint.setTag(null);
        } else if (i == NotificationCenter.onDatabaseOpened) {
            checkSuggestClearDatabase();
        }
    }

    public /* synthetic */ void lambda$didReceivedNotification$44(ViewPage viewPage, Object[] objArr) {
        reloadViewPageDialogs(viewPage, objArr.length > 0);
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView == null || filterTabsView.getVisibility() != 0) {
            return;
        }
        this.filterTabsView.checkTabsCounter();
    }

    public /* synthetic */ void lambda$didReceivedNotification$45(TLRPC$Chat tLRPC$Chat, long j, boolean z, TLRPC$User tLRPC$User) {
        if (tLRPC$Chat != null) {
            if (ChatObject.isNotInChat(tLRPC$Chat)) {
                getMessagesController().deleteDialog(j, 0, z);
            } else {
                getMessagesController().deleteParticipantFromChat(-j, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), null, null, z, z);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z);
            if (tLRPC$User != null && tLRPC$User.bot) {
                getMessagesController().blockPeer(tLRPC$User.id);
            }
        }
        getMessagesController().checkIfFolderEmpty(this.folderId);
    }

    /* renamed from: org.telegram.ui.DialogsActivity$39 */
    /* loaded from: classes3.dex */
    class AnonymousClass39 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$localView;

        AnonymousClass39(View view) {
            DialogsActivity.this = r1;
            this.val$localView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.val$localView.getParent() != null) {
                ((ViewGroup) this.val$localView.getParent()).removeView(this.val$localView);
            }
            DialogsActivity.this.databaseMigrationHint = null;
        }
    }

    private void checkSuggestClearDatabase() {
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            SuggestClearDatabaseBottomSheet.show(this);
        }
    }

    private void updateMenuButton(boolean z) {
        int i;
        if (this.menuDrawable == null || this.updateLayout == null) {
            return;
        }
        float f = 0.0f;
        if (SharedConfig.isAppUpdateAvailable()) {
            String attachFileName = FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
            if (getFileLoader().isLoadingFile(attachFileName)) {
                i = MenuDrawable.TYPE_UDPATE_DOWNLOADING;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f = fileProgress.floatValue();
                }
            } else {
                i = MenuDrawable.TYPE_UDPATE_AVAILABLE;
            }
        } else {
            i = MenuDrawable.TYPE_DEFAULT;
        }
        updateAppUpdateViews(z);
        this.menuDrawable.setType(i, z);
        this.menuDrawable.setUpdateDownloadProgress(f, z);
    }

    private void showNextSupportedSuggestion() {
        if (this.showingSuggestion != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if (showSuggestion(str)) {
                this.showingSuggestion = str;
                return;
            }
        }
    }

    private void onSuggestionDismiss() {
        if (this.showingSuggestion == null) {
            return;
        }
        getMessagesController().removeSuggestion(0L, this.showingSuggestion);
        this.showingSuggestion = null;
        showNextSupportedSuggestion();
    }

    private boolean showSuggestion(String str) {
        if ("AUTOARCHIVE_POPULAR".equals(str)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("HideNewChatsAlertTitle", 2131626184));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("HideNewChatsAlertText", 2131626183)));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            builder.setPositiveButton(LocaleController.getString("GoToSettings", 2131626128), new DialogsActivity$$ExternalSyntheticLambda10(this));
            showDialog(builder.create(), new DialogsActivity$$ExternalSyntheticLambda16(this));
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$showSuggestion$46(DialogInterface dialogInterface, int i) {
        presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(this.parentLayout, "newChatsRow");
    }

    public /* synthetic */ void lambda$showSuggestion$47(DialogInterface dialogInterface) {
        onSuggestionDismiss();
    }

    private void showFiltersHint() {
        if (this.askingForPermissions || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.filterTabsView == null || !getMessagesController().dialogFilters.isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).commit();
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda35(this), 1000L);
    }

    public /* synthetic */ void lambda$showFiltersHint$48() {
        presentFragment(new FiltersSetupActivity());
    }

    public /* synthetic */ void lambda$showFiltersHint$49() {
        getUndoView().showWithAction(0L, 15, null, new DialogsActivity$$ExternalSyntheticLambda37(this));
    }

    private void setDialogsListFrozen(boolean z, boolean z2) {
        if (this.viewPages == null || this.dialogsListFrozen == z) {
            return;
        }
        if (z) {
            this.frozenDialogsList = new ArrayList<>(getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false));
        } else {
            this.frozenDialogsList = null;
        }
        this.dialogsListFrozen = z;
        this.viewPages[0].dialogsAdapter.setDialogsListFrozen(z);
        if (z || !z2) {
            return;
        }
        this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
    }

    public void setDialogsListFrozen(boolean z) {
        setDialogsListFrozen(z, true);
    }

    /* loaded from: classes3.dex */
    public class DialogsHeader extends TLRPC$Dialog {
        public int headerType;

        public DialogsHeader(DialogsActivity dialogsActivity, int i) {
            this.headerType = i;
        }
    }

    public ArrayList<TLRPC$Dialog> getDialogsArray(int i, int i2, int i3, boolean z) {
        ArrayList<TLRPC$Dialog> arrayList;
        if (!z || (arrayList = this.frozenDialogsList) == null) {
            MessagesController messagesController = AccountInstance.getInstance(i).getMessagesController();
            if (i2 == 0) {
                return messagesController.getDialogs(i3);
            }
            char c = 1;
            if (i2 == 1 || i2 == 10 || i2 == 13) {
                return messagesController.dialogsServerOnly;
            }
            if (i2 == 2) {
                ArrayList<TLRPC$Dialog> arrayList2 = new ArrayList<>(messagesController.dialogsCanAddUsers.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsMyGroups.size() + 2);
                if (messagesController.dialogsMyChannels.size() > 0 && this.allowChannels) {
                    arrayList2.add(new DialogsHeader(this, 0));
                    arrayList2.addAll(messagesController.dialogsMyChannels);
                }
                if (messagesController.dialogsMyGroups.size() > 0 && this.allowGroups) {
                    arrayList2.add(new DialogsHeader(this, 1));
                    arrayList2.addAll(messagesController.dialogsMyGroups);
                }
                if (messagesController.dialogsCanAddUsers.size() > 0) {
                    int size = messagesController.dialogsCanAddUsers.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC$Dialog tLRPC$Dialog = messagesController.dialogsCanAddUsers.get(i4);
                        if ((this.allowChannels && ChatObject.isChannelAndNotMegaGroup(-tLRPC$Dialog.id, i)) || (this.allowGroups && (ChatObject.isMegagroup(i, -tLRPC$Dialog.id) || !ChatObject.isChannel(-tLRPC$Dialog.id, i)))) {
                            if (c != 0) {
                                arrayList2.add(new DialogsHeader(this, 2));
                                c = 0;
                            }
                            arrayList2.add(tLRPC$Dialog);
                        }
                    }
                }
                return arrayList2;
            } else if (i2 == 3) {
                return messagesController.dialogsForward;
            } else {
                if (i2 == 4 || i2 == 12) {
                    return messagesController.dialogsUsersOnly;
                }
                if (i2 == 5) {
                    return messagesController.dialogsChannelsOnly;
                }
                if (i2 == 6 || i2 == 11) {
                    return messagesController.dialogsGroupsOnly;
                }
                if (i2 == 7 || i2 == 8) {
                    MessagesController.DialogFilter[] dialogFilterArr = messagesController.selectedDialogFilter;
                    if (i2 == 7) {
                        c = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c];
                    if (dialogFilter == null) {
                        return messagesController.getDialogs(i3);
                    }
                    return dialogFilter.dialogs;
                } else if (i2 == 9) {
                    return messagesController.dialogsForBlock;
                } else {
                    if (i2 == 14) {
                        ArrayList<TLRPC$Dialog> arrayList3 = new ArrayList<>();
                        if (this.allowUsers || this.allowBots) {
                            Iterator<TLRPC$Dialog> it = messagesController.dialogsUsersOnly.iterator();
                            while (it.hasNext()) {
                                TLRPC$Dialog next = it.next();
                                if (messagesController.getUser(Long.valueOf(next.id)).bot) {
                                    if (this.allowBots) {
                                        arrayList3.add(next);
                                    }
                                } else if (this.allowUsers) {
                                    arrayList3.add(next);
                                }
                            }
                        }
                        if (this.allowGroups) {
                            arrayList3.addAll(messagesController.dialogsGroupsOnly);
                        }
                        if (this.allowChannels) {
                            arrayList3.addAll(messagesController.dialogsChannelsOnly);
                        }
                        return arrayList3;
                    }
                    return new ArrayList<>();
                }
            }
        }
        return arrayList;
    }

    public void setSideMenu(RecyclerView recyclerView) {
        this.sideMenu = recyclerView;
        recyclerView.setBackgroundColor(Theme.getColor("chats_menuBackground"));
        this.sideMenu.setGlowColor(Theme.getColor("chats_menuBackground"));
    }

    public void updatePasscodeButton() {
        if (this.passcodeItem == null) {
            return;
        }
        if (SharedConfig.passcodeHash.length() != 0 && !this.searching) {
            ActionBarMenuItem actionBarMenuItem = this.doneItem;
            if (actionBarMenuItem == null || actionBarMenuItem.getVisibility() != 0) {
                this.passcodeItem.setVisibility(0);
            }
            this.passcodeItem.setIcon(this.passcodeDrawable);
            this.passcodeItemVisible = true;
            return;
        }
        this.passcodeItem.setVisibility(8);
        this.passcodeItemVisible = false;
    }

    private void setFloatingProgressVisible(boolean z, boolean z2) {
        if (this.floatingButton == null || this.floatingProgressView == null) {
            return;
        }
        float f = 0.0f;
        float f2 = 0.1f;
        if (z2) {
            if (z == this.floatingProgressVisible) {
                return;
            }
            AnimatorSet animatorSet = this.floatingProgressAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.floatingProgressVisible = z;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingProgressAnimator = animatorSet2;
            Animator[] animatorArr = new Animator[6];
            RLottieImageView rLottieImageView = this.floatingButton;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(rLottieImageView, property, fArr);
            RLottieImageView rLottieImageView2 = this.floatingButton;
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.1f : 1.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(rLottieImageView2, property2, fArr2);
            RLottieImageView rLottieImageView3 = this.floatingButton;
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 0.1f : 1.0f;
            animatorArr[2] = ObjectAnimator.ofFloat(rLottieImageView3, property3, fArr3);
            RadialProgressView radialProgressView = this.floatingProgressView;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            if (z) {
                f = 1.0f;
            }
            fArr4[0] = f;
            animatorArr[3] = ObjectAnimator.ofFloat(radialProgressView, property4, fArr4);
            RadialProgressView radialProgressView2 = this.floatingProgressView;
            Property property5 = View.SCALE_X;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.1f;
            animatorArr[4] = ObjectAnimator.ofFloat(radialProgressView2, property5, fArr5);
            RadialProgressView radialProgressView3 = this.floatingProgressView;
            Property property6 = View.SCALE_Y;
            float[] fArr6 = new float[1];
            if (z) {
                f2 = 1.0f;
            }
            fArr6[0] = f2;
            animatorArr[5] = ObjectAnimator.ofFloat(radialProgressView3, property6, fArr6);
            animatorSet2.playTogether(animatorArr);
            this.floatingProgressAnimator.addListener(new AnonymousClass40(z));
            this.floatingProgressAnimator.setDuration(150L);
            this.floatingProgressAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.floatingProgressAnimator.start();
            return;
        }
        AnimatorSet animatorSet3 = this.floatingProgressAnimator;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.floatingProgressVisible = z;
        if (z) {
            this.floatingButton.setAlpha(0.0f);
            this.floatingButton.setScaleX(0.1f);
            this.floatingButton.setScaleY(0.1f);
            this.floatingButton.setVisibility(8);
            this.floatingProgressView.setAlpha(1.0f);
            this.floatingProgressView.setScaleX(1.0f);
            this.floatingProgressView.setScaleY(1.0f);
            this.floatingProgressView.setVisibility(0);
            return;
        }
        this.floatingButton.setAlpha(1.0f);
        this.floatingButton.setScaleX(1.0f);
        this.floatingButton.setScaleY(1.0f);
        this.floatingButton.setVisibility(0);
        this.floatingProgressView.setAlpha(0.0f);
        this.floatingProgressView.setScaleX(0.1f);
        this.floatingProgressView.setScaleY(0.1f);
        this.floatingProgressView.setVisibility(8);
    }

    /* renamed from: org.telegram.ui.DialogsActivity$40 */
    /* loaded from: classes3.dex */
    public class AnonymousClass40 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$visible;

        AnonymousClass40(boolean z) {
            DialogsActivity.this = r1;
            this.val$visible = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DialogsActivity.this.floatingProgressView.setVisibility(0);
            DialogsActivity.this.floatingButton.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (animator == DialogsActivity.this.floatingProgressAnimator) {
                if (this.val$visible) {
                    if (DialogsActivity.this.floatingButton != null) {
                        DialogsActivity.this.floatingButton.setVisibility(8);
                    }
                } else if (DialogsActivity.this.floatingButton != null) {
                    DialogsActivity.this.floatingProgressView.setVisibility(8);
                }
                DialogsActivity.this.floatingProgressAnimator = null;
            }
        }
    }

    public void hideFloatingButton(boolean z) {
        if (this.floatingHidden != z) {
            if (z && this.floatingForceVisible) {
                return;
            }
            this.floatingHidden = z;
            AnimatorSet animatorSet = new AnimatorSet();
            float[] fArr = new float[2];
            fArr[0] = this.floatingButtonHideProgress;
            fArr[1] = this.floatingHidden ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda5(this));
            animatorSet.playTogether(ofFloat);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(this.floatingInterpolator);
            this.floatingButtonContainer.setClickable(!z);
            animatorSet.start();
        }
    }

    public /* synthetic */ void lambda$hideFloatingButton$50(ValueAnimator valueAnimator) {
        this.floatingButtonHideProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.floatingButtonTranslation = AndroidUtilities.dp(100.0f) * this.floatingButtonHideProgress;
        updateFloatingButtonOffset();
    }

    public float getContactsAlpha() {
        return this.contactsAlpha;
    }

    public void animateContactsAlpha(float f) {
        ValueAnimator valueAnimator = this.contactsAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.contactsAlpha, f).setDuration(250L);
        this.contactsAlphaAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.contactsAlphaAnimator.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda2(this));
        this.contactsAlphaAnimator.start();
    }

    public /* synthetic */ void lambda$animateContactsAlpha$51(ValueAnimator valueAnimator) {
        setContactsAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setContactsAlpha(float f) {
        ViewPage[] viewPageArr;
        this.contactsAlpha = f;
        for (ViewPage viewPage : this.viewPages) {
            DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
            for (int i = 0; i < dialogsRecyclerView.getChildCount(); i++) {
                View childAt = dialogsRecyclerView.getChildAt(i);
                if (dialogsRecyclerView.getChildAdapterPosition(childAt) >= viewPage.dialogsAdapter.getDialogsCount() + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public void setScrollDisabled(boolean z) {
        for (ViewPage viewPage : this.viewPages) {
            ((LinearLayoutManager) viewPage.listView.getLayoutManager()).setScrollDisabled(z);
        }
    }

    public void updateDialogIndices() {
        int indexOf;
        if (this.viewPages == null) {
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            if (viewPageArr[i].getVisibility() == 0) {
                ArrayList<TLRPC$Dialog> dialogsArray = getDialogsArray(this.currentAccount, this.viewPages[i].dialogsType, this.folderId, false);
                int childCount = this.viewPages[i].listView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.viewPages[i].listView.getChildAt(i2);
                    if (childAt instanceof DialogCell) {
                        DialogCell dialogCell = (DialogCell) childAt;
                        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(dialogCell.getDialogId());
                        if (tLRPC$Dialog != null && (indexOf = dialogsArray.indexOf(tLRPC$Dialog)) >= 0) {
                            dialogCell.setDialogIndex(indexOf);
                        }
                    }
                }
            }
            i++;
        }
    }

    public void updateVisibleRows(int i) {
        updateVisibleRows(i, true);
    }

    private void updateVisibleRows(int i, boolean z) {
        if ((!this.dialogsListFrozen || (MessagesController.UPDATE_MASK_REORDER & i) != 0) && !this.isPaused) {
            for (int i2 = 0; i2 < 3; i2++) {
                RecyclerView recyclerView = null;
                if (i2 == 2) {
                    SearchViewPager searchViewPager = this.searchViewPager;
                    if (searchViewPager != null) {
                        recyclerView = searchViewPager.searchListView;
                    }
                } else {
                    ViewPage[] viewPageArr = this.viewPages;
                    if (viewPageArr != null) {
                        if (i2 < viewPageArr.length) {
                            recyclerView = viewPageArr[i2].listView;
                        }
                        if (recyclerView != null && this.viewPages[i2].getVisibility() != 0) {
                        }
                    }
                }
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = recyclerView.getChildAt(i3);
                        if ((childAt instanceof DialogCell) && recyclerView.getAdapter() != this.searchViewPager.dialogsSearchAdapter) {
                            DialogCell dialogCell = (DialogCell) childAt;
                            boolean z2 = true;
                            if ((MessagesController.UPDATE_MASK_REORDER & i) != 0) {
                                dialogCell.onReorderStateChanged(this.actionBar.isActionModeShowed(), true);
                                if (this.dialogsListFrozen) {
                                }
                            }
                            if ((MessagesController.UPDATE_MASK_CHECK & i) != 0) {
                                if ((MessagesController.UPDATE_MASK_CHAT & i) == 0) {
                                    z2 = false;
                                }
                                dialogCell.setChecked(false, z2);
                            } else {
                                if ((MessagesController.UPDATE_MASK_NEW_MESSAGE & i) != 0) {
                                    dialogCell.checkCurrentDialogIndex(this.dialogsListFrozen);
                                    if (this.viewPages[i2].isDefaultDialogType() && AndroidUtilities.isTablet()) {
                                        if (dialogCell.getDialogId() != this.openedDialogId) {
                                            z2 = false;
                                        }
                                        dialogCell.setDialogSelected(z2);
                                    }
                                } else if ((MessagesController.UPDATE_MASK_SELECT_DIALOG & i) != 0) {
                                    if (this.viewPages[i2].isDefaultDialogType() && AndroidUtilities.isTablet()) {
                                        if (dialogCell.getDialogId() != this.openedDialogId) {
                                            z2 = false;
                                        }
                                        dialogCell.setDialogSelected(z2);
                                    }
                                } else {
                                    dialogCell.update(i, z);
                                }
                                ArrayList<Long> arrayList = this.selectedDialogs;
                                if (arrayList != null) {
                                    dialogCell.setChecked(arrayList.contains(Long.valueOf(dialogCell.getDialogId())), false);
                                }
                            }
                        }
                        if (childAt instanceof UserCell) {
                            ((UserCell) childAt).update(i);
                        } else if (childAt instanceof ProfileSearchCell) {
                            ProfileSearchCell profileSearchCell = (ProfileSearchCell) childAt;
                            profileSearchCell.update(i);
                            ArrayList<Long> arrayList2 = this.selectedDialogs;
                            if (arrayList2 != null) {
                                profileSearchCell.setChecked(arrayList2.contains(Long.valueOf(profileSearchCell.getDialogId())), false);
                            }
                        }
                        if (!this.dialogsListFrozen && (childAt instanceof RecyclerListView)) {
                            RecyclerListView recyclerListView = (RecyclerListView) childAt;
                            int childCount2 = recyclerListView.getChildCount();
                            for (int i4 = 0; i4 < childCount2; i4++) {
                                View childAt2 = recyclerListView.getChildAt(i4);
                                if (childAt2 instanceof HintDialogCell) {
                                    ((HintDialogCell) childAt2).update(i);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void setDelegate(DialogsActivityDelegate dialogsActivityDelegate) {
        this.delegate = dialogsActivityDelegate;
    }

    public void setSearchString(String str) {
        this.searchString = str;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    public boolean isMainDialogList() {
        return this.delegate == null && this.searchString == null;
    }

    public void setInitialSearchType(int i) {
        this.initialSearchType = i;
    }

    private boolean checkCanWrite(long j) {
        if (this.addToGroupAlertString != null || !this.checkCanWrite) {
            return true;
        }
        if (DialogObject.isChatDialog(j)) {
            long j2 = -j;
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(j2));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                return true;
            }
            if (!this.cantSendToChannels && ChatObject.isCanWriteToChannel(j2, this.currentAccount) && this.hasPoll != 2) {
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("SendMessageTitle", 2131628265));
            if (this.hasPoll == 2) {
                builder.setMessage(LocaleController.getString("PublicPollCantForward", 2131627831));
            } else {
                builder.setMessage(LocaleController.getString("ChannelCantSendMessage", 2131624905));
            }
            builder.setNegativeButton(LocaleController.getString("OK", 2131627127), null);
            showDialog(builder.create());
            return false;
        } else if (!DialogObject.isEncryptedDialog(j)) {
            return true;
        } else {
            if (this.hasPoll == 0 && !this.hasInvoice) {
                return true;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString("SendMessageTitle", 2131628265));
            if (this.hasPoll != 0) {
                builder2.setMessage(LocaleController.getString("PollCantForwardSecretChat", 2131627631));
            } else {
                builder2.setMessage(LocaleController.getString("InvoiceCantForwardSecretChat", 2131626340));
            }
            builder2.setNegativeButton(LocaleController.getString("OK", 2131627127), null);
            showDialog(builder2.create());
            return false;
        }
    }

    public void didSelectResult(long j, boolean z, boolean z2) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        String str;
        String str2;
        String str3;
        if (!checkCanWrite(j)) {
            return;
        }
        int i = this.initialDialogsType;
        if (i == 11 || i == 12 || i == 13) {
            if (this.checkingImportDialog) {
                return;
            }
            if (DialogObject.isUserDialog(j)) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(j));
                if (!user.mutual_contact) {
                    getUndoView().showWithAction(j, 45, (Runnable) null);
                    return;
                } else {
                    tLRPC$User = user;
                    tLRPC$Chat = null;
                }
            } else {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                if (!ChatObject.hasAdminRights(chat) || !ChatObject.canChangeChatInfo(chat)) {
                    getUndoView().showWithAction(j, 46, (Runnable) null);
                    return;
                } else {
                    tLRPC$Chat = chat;
                    tLRPC$User = null;
                }
            }
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer = new TLRPC$TL_messages_checkHistoryImportPeer();
            tLRPC$TL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_checkHistoryImportPeer, new DialogsActivity$$ExternalSyntheticLambda51(this, alertDialog, tLRPC$User, tLRPC$Chat, j, z2, tLRPC$TL_messages_checkHistoryImportPeer));
            try {
                alertDialog.showDelayed(300L);
            } catch (Exception unused) {
            }
        } else if (z && ((this.selectAlertString != null && this.selectAlertStringGroup != null) || this.addToGroupAlertString != null)) {
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            if (DialogObject.isEncryptedDialog(j)) {
                TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))).user_id));
                if (user2 == null) {
                    return;
                }
                str = LocaleController.getString("SendMessageTitle", 2131628265);
                str3 = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user2));
                str2 = LocaleController.getString("Send", 2131628238);
            } else if (DialogObject.isUserDialog(j)) {
                if (j == getUserConfig().getClientUserId()) {
                    str = LocaleController.getString("SendMessageTitle", 2131628265);
                    str3 = LocaleController.formatStringSimple(this.selectAlertStringGroup, LocaleController.getString("SavedMessages", 2131628140));
                    str2 = LocaleController.getString("Send", 2131628238);
                } else {
                    TLRPC$User user3 = getMessagesController().getUser(Long.valueOf(j));
                    if (user3 == null || this.selectAlertString == null) {
                        return;
                    }
                    str = LocaleController.getString("SendMessageTitle", 2131628265);
                    str3 = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user3));
                    str2 = LocaleController.getString("Send", 2131628238);
                }
            } else {
                TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(-j));
                if (chat2 == null) {
                    return;
                }
                if (this.addToGroupAlertString != null) {
                    str = LocaleController.getString("AddToTheGroupAlertTitle", 2131624307);
                    str3 = LocaleController.formatStringSimple(this.addToGroupAlertString, chat2.title);
                    str2 = LocaleController.getString("Add", 2131624242);
                } else {
                    str = LocaleController.getString("SendMessageTitle", 2131628265);
                    str3 = LocaleController.formatStringSimple(this.selectAlertStringGroup, chat2.title);
                    str2 = LocaleController.getString("Send", 2131628238);
                }
            }
            builder.setTitle(str);
            builder.setMessage(AndroidUtilities.replaceTags(str3));
            builder.setPositiveButton(str2, new DialogsActivity$$ExternalSyntheticLambda12(this, j));
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131624832), null);
            showDialog(builder.create());
        } else if (this.delegate != null) {
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(Long.valueOf(j));
            this.delegate.didSelectDialogs(this, arrayList, null, z2);
            if (!this.resetDelegate) {
                return;
            }
            this.delegate = null;
        } else {
            finishFragment();
        }
    }

    public /* synthetic */ void lambda$didSelectResult$54(AlertDialog alertDialog, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, long j, boolean z, TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda44(this, alertDialog, tLObject, tLRPC$User, tLRPC$Chat, j, z, tLRPC$TL_error, tLRPC$TL_messages_checkHistoryImportPeer));
    }

    public /* synthetic */ void lambda$didSelectResult$53(AlertDialog alertDialog, TLObject tLObject, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, long j, boolean z, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.checkingImportDialog = false;
        if (tLObject != null) {
            AlertsCreator.createImportDialogAlert(this, this.arguments.getString("importTitle"), ((TLRPC$TL_messages_checkedHistoryImportPeer) tLObject).confirm_text, tLRPC$User, tLRPC$Chat, new DialogsActivity$$ExternalSyntheticLambda40(this, j, z));
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this, tLRPC$TL_messages_checkHistoryImportPeer, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.historyImportProgressChanged, Long.valueOf(j), tLRPC$TL_messages_checkHistoryImportPeer, tLRPC$TL_error);
    }

    public /* synthetic */ void lambda$didSelectResult$52(long j, boolean z) {
        setDialogsListFrozen(true);
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(j));
        this.delegate.didSelectDialogs(this, arrayList, null, z);
    }

    public /* synthetic */ void lambda$didSelectResult$55(long j, DialogInterface dialogInterface, int i) {
        didSelectResult(j, false, false);
    }

    public RLottieImageView getFloatingButton() {
        return this.floatingButton;
    }

    private boolean onSendLongClick(View view) {
        Activity parentActivity = getParentActivity();
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, resourceProvider);
        actionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindowLayout.setOnTouchListener(new AnonymousClass41());
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new DialogsActivity$$ExternalSyntheticLambda52(this));
        actionBarPopupWindowLayout.setShownFromBottom(false);
        actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor("dialogButtonSelector"));
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) parentActivity, true, true, resourceProvider);
        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("SendWithoutSound", 2131628275), 2131165539);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem.setOnClickListener(new DialogsActivity$$ExternalSyntheticLambda21(this));
        linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(2131689482);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        this.sendPopupWindow.dimBehind();
        view.performHapticFeedback(3, 2);
        return false;
    }

    /* renamed from: org.telegram.ui.DialogsActivity$41 */
    /* loaded from: classes3.dex */
    public class AnonymousClass41 implements View.OnTouchListener {
        private Rect popupRect = new Rect();

        AnonymousClass41() {
            DialogsActivity.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() != 0 || DialogsActivity.this.sendPopupWindow == null || !DialogsActivity.this.sendPopupWindow.isShowing()) {
                return false;
            }
            view.getHitRect(this.popupRect);
            if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            DialogsActivity.this.sendPopupWindow.dismiss();
            return false;
        }
    }

    public /* synthetic */ void lambda$onSendLongClick$56(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0 || (actionBarPopupWindow = this.sendPopupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.sendPopupWindow.dismiss();
    }

    public /* synthetic */ void lambda$onSendLongClick$57(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        this.notify = false;
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        this.delegate.didSelectDialogs(this, this.selectedDialogs, this.commentView.getFieldText(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03da  */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        RecyclerListView recyclerListView;
        DialogsActivity$$ExternalSyntheticLambda53 dialogsActivity$$ExternalSyntheticLambda53 = new DialogsActivity$$ExternalSyntheticLambda53(this);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        if (this.movingView != null) {
            arrayList.add(new ThemeDescription(this.movingView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        }
        if (this.doneItem != null) {
            arrayList.add(new ThemeDescription(this.doneItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "actionBarDefaultSelector"));
        }
        if (this.folderId == 0) {
            if (this.onlySelect) {
                arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
            }
            arrayList.add(new ThemeDescription(this.fragmentView, 0, null, this.actionBarDefaultPaint, null, null, "actionBarDefault"));
            if (this.searchViewPager != null) {
                arrayList.add(new ThemeDescription(this.searchViewPager.searchListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
            }
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "actionBarDefaultIcon"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, new Drawable[]{Theme.dialogs_holidayDrawable}, null, "actionBarDefaultTitle"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        } else {
            arrayList.add(new ThemeDescription(this.fragmentView, 0, null, this.actionBarDefaultPaint, null, null, "actionBarDefaultArchived"));
            if (this.searchViewPager != null) {
                arrayList.add(new ThemeDescription(this.searchViewPager.searchListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefaultArchived"));
            }
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultArchivedIcon"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, new Drawable[]{Theme.dialogs_holidayDrawable}, null, "actionBarDefaultArchivedTitle"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultArchivedSelector"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultArchivedSearch"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchArchivedPlaceholder"));
        }
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_ITEMSCOLOR, null, null, null, null, "actionBarActionModeDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_TOPBACKGROUND, null, null, null, null, "actionBarActionModeDefaultTop"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_AM_SELECTORCOLOR, null, null, null, null, "actionBarActionModeDefaultSelector"));
        arrayList.add(new ThemeDescription(this.selectedDialogsCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "actionBarActionModeDefaultIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "actionBarDefaultSubmenuBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "actionBarDefaultSubmenuItem"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "actionBarDefaultSubmenuItemIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "dialogButtonSelector"));
        if (this.filterTabsView != null) {
            if (this.actionBar.isActionModeShowed()) {
                arrayList.add(new ThemeDescription(this.filterTabsView, 0, new Class[]{FilterTabsView.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "profile_tabSelectedLine"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, "profile_tabSelectedText"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, "profile_tabText"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{FilterTabsView.TabView.class}, null, null, null, "profile_tabSelector"));
            } else {
                arrayList.add(new ThemeDescription(this.filterTabsView, 0, new Class[]{FilterTabsView.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "actionBarTabLine"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, "actionBarTabActiveText"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, "actionBarTabUnactiveText"));
                arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_SELECTOR, null, null, null, null, "actionBarTabSelector"));
            }
            arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), 0, new Class[]{FilterTabsView.TabView.class}, null, null, null, "chats_tabUnreadActiveBackground"));
            arrayList.add(new ThemeDescription(this.filterTabsView.getTabsContainer(), 0, new Class[]{FilterTabsView.TabView.class}, null, null, null, "chats_tabUnreadUnactiveBackground"));
        }
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "chats_actionIcon"));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "chats_actionBackground"));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "chats_actionPressedBackground"));
        int i = 0;
        while (i < 3) {
            if (i == 2) {
                SearchViewPager searchViewPager = this.searchViewPager;
                if (searchViewPager == null) {
                    i++;
                } else {
                    recyclerListView = searchViewPager.searchListView;
                    if (recyclerListView == null) {
                        RecyclerListView recyclerListView2 = recyclerListView;
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_countPaint, null, null, "chats_unreadCounter"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_countGrayPaint, null, null, "chats_unreadCounterMuted"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_countTextPaint, null, null, "chats_unreadCounterText"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_lockDrawable}, null, "chats_secretIcon"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_scamDrawable, Theme.dialogs_fakeDrawable}, null, "chats_draft"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_pinnedDrawable, Theme.dialogs_reorderDrawable}, null, "chats_pinnedIcon"));
                        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_name"));
                        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_secretName"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[1], null, null, "chats_message_threeLines"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[0], null, null, "chats_message"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messageNamePaint, null, null, "chats_nameMessage_threeLines"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, "chats_draft"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, (String[]) null, Theme.dialogs_messagePrintingPaint, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_actionMessage"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaint, null, null, "chats_date"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_pinnedPaint, null, null, "chats_pinnedOverlay"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_tabletSeletedPaint, null, null, "chats_tabletSelectedOverlay"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkDrawable}, null, "chats_sentCheck"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkReadDrawable, Theme.dialogs_halfCheckDrawable}, null, "chats_sentReadCheck"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_clockDrawable}, null, "chats_sentClock"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_errorPaint, null, null, "chats_sentError"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_errorDrawable}, null, "chats_sentErrorIcon"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, "chats_verifiedCheck"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, "chats_verifiedBackground"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_muteDrawable}, null, "chats_muteIcon"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_mentionDrawable}, null, "chats_mentionIcon"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, "chats_archivePinBackground"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, "chats_archiveBackground"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, "chats_onlineCircle"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, "windowBackgroundWhite"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_CHECKBOX, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhite"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_offlinePaint, null, null, "windowBackgroundWhiteGrayText3"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_onlinePaint, null, null, "windowBackgroundWhiteBlueText3"));
                        GraySectionCell.createThemeDescriptions(arrayList, recyclerListView);
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{HashtagSearchCell.class}, null, null, null, "windowBackgroundWhiteBlackText"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGray"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGray"));
                        arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
                        arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueText2"));
                    }
                    i++;
                }
            } else {
                ViewPage[] viewPageArr = this.viewPages;
                if (viewPageArr == null) {
                    i++;
                } else {
                    recyclerListView = i < viewPageArr.length ? viewPageArr[i].listView : null;
                    if (recyclerListView == null) {
                    }
                    i++;
                }
            }
        }
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundSaved"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundArchived"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_backgroundArchivedHidden"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_nameMessage"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_draft"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_attachMessage"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_nameArchived"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_nameMessageArchived"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_nameMessageArchived_threeLines"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_messageArchived"));
        if (this.viewPages != null) {
            int i2 = 0;
            while (i2 < this.viewPages.length) {
                if (this.folderId == 0) {
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
                } else {
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefaultArchived"));
                }
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{DialogsEmptyCell.class}, new String[]{"emptyTextView1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_nameMessage_threeLines"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{DialogsEmptyCell.class}, new String[]{"emptyTextView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_message"));
                if (SharedConfig.archiveHidden) {
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Arrow1", "avatar_backgroundArchivedHidden"));
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Arrow2", "avatar_backgroundArchivedHidden"));
                } else {
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Arrow1", "avatar_backgroundArchived"));
                    arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Arrow2", "avatar_backgroundArchived"));
                }
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Box2", "avatar_text"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveAvatarDrawable}, "Box1", "avatar_text"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_pinArchiveDrawable}, "Arrow", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_pinArchiveDrawable}, "Line", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unpinArchiveDrawable}, "Arrow", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unpinArchiveDrawable}, "Line", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveDrawable}, "Arrow", "chats_archiveBackground"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveDrawable}, "Box2", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_archiveDrawable}, "Box1", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_hidePsaDrawable}, "Line 1", "chats_archiveBackground"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_hidePsaDrawable}, "Line 2", "chats_archiveBackground"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_hidePsaDrawable}, "Line 3", "chats_archiveBackground"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_hidePsaDrawable}, "Cup Red", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_hidePsaDrawable}, "Box", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unarchiveDrawable}, "Arrow1", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unarchiveDrawable}, "Arrow2", "chats_archivePinBackground"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unarchiveDrawable}, "Box2", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{DialogCell.class}, new RLottieDrawable[]{Theme.dialogs_unarchiveDrawable}, "Box1", "chats_archiveIcon"));
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
                int i3 = i2;
                arrayList.add(new ThemeDescription(this.viewPages[i2].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, dialogsActivity$$ExternalSyntheticLambda53, "windowBackgroundWhiteGrayText"));
                arrayList.add(new ThemeDescription(this.viewPages[i3].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, dialogsActivity$$ExternalSyntheticLambda53, "windowBackgroundWhiteBlueText"));
                arrayList.add(new ThemeDescription(this.viewPages[i3].listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueText4"));
                arrayList.add(new ThemeDescription(this.viewPages[i3].listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueText4"));
                arrayList.add(new ThemeDescription(this.viewPages[i3].progressView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "progressCircle"));
                ViewPager archiveHintCellPager = this.viewPages[i3].dialogsAdapter.getArchiveHintCellPager();
                arrayList.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_nameMessage_threeLines"));
                arrayList.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"imageView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_unreadCounter"));
                arrayList.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"headerTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_nameMessage_threeLines"));
                arrayList.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"messageTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_message"));
                arrayList.add(new ThemeDescription(archiveHintCellPager, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefaultArchived"));
                i2 = i3 + 1;
            }
        }
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_archivePullDownBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_archivePullDownBackgroundActive"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "chats_menuBackground"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuName"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuPhone"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuPhoneCats"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuCloudBackgroundCats"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chat_serviceBackground"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuTopShadow"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerProfileCell.class}, null, null, null, "chats_menuTopShadowCats"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{DrawerProfileCell.class}, new String[]{"darkThemeView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuName"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{DrawerProfileCell.class}, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_menuTopBackgroundCats"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{DrawerProfileCell.class}, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chats_menuTopBackground"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{DrawerActionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuItemIcon"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerActionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuItemText"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerUserCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuItemText"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{DrawerUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_unreadCounterText"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{DrawerUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_unreadCounter"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{DrawerUserCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuBackground"));
        arrayList.add(new ThemeDescription(this.sideMenu, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{DrawerAddCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuItemIcon"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DrawerAddCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_menuItemText"));
        arrayList.add(new ThemeDescription(this.sideMenu, 0, new Class[]{DividerCell.class}, Theme.dividerPaint, null, null, "divider"));
        if (this.searchViewPager != null) {
            DialogsSearchAdapter dialogsSearchAdapter = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter != null ? dialogsSearchAdapter.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countPaint, null, null, "chats_unreadCounter"));
            DialogsSearchAdapter dialogsSearchAdapter2 = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter2 != null ? dialogsSearchAdapter2.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countGrayPaint, null, null, "chats_unreadCounterMuted"));
            DialogsSearchAdapter dialogsSearchAdapter3 = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter3 != null ? dialogsSearchAdapter3.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countTextPaint, null, null, "chats_unreadCounterText"));
            DialogsSearchAdapter dialogsSearchAdapter4 = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter4 != null ? dialogsSearchAdapter4.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_archiveTextPaint, null, null, "chats_archiveText"));
            DialogsSearchAdapter dialogsSearchAdapter5 = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter5 != null ? dialogsSearchAdapter5.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            DialogsSearchAdapter dialogsSearchAdapter6 = this.searchViewPager.dialogsSearchAdapter;
            arrayList.add(new ThemeDescription(dialogsSearchAdapter6 != null ? dialogsSearchAdapter6.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, null, null, null, "chats_onlineCircle"));
        }
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerBackground"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerPlayPause"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerTitle"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_FASTSCROLL, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerPerformer"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerClose"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "returnToCallBackground"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "returnToCallText"));
        for (int i4 = 0; i4 < this.undoView.length; i4++) {
            arrayList.add(new ThemeDescription(this.undoView[i4], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_cancelColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_cancelColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i4], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", "undo_infoColor"));
        }
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogBackgroundGray"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextLink"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogLinkSelection"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextBlue2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextBlue3"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextBlue4"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextRed2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextGray"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextGray2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextGray3"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextGray4"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogRedIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogTextHint"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogInputField"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogInputFieldActivated"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogCheckboxSquareBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogCheckboxSquareCheck"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogCheckboxSquareUnchecked"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogCheckboxSquareDisabled"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogRadioBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogRadioBackgroundChecked"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogProgressCircle"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogButton"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogScrollGlow"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogRoundCheckBox"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogRoundCheckBoxCheck"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogBadgeBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogBadgeText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogLineProgress"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogLineProgressBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogGrayLine"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialog_inlineProgressBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialog_inlineProgress"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogSearchBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogSearchHint"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogSearchIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogSearchText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogFloatingButton"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogFloatingIcon"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialogShadowLine"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "key_sheet_scrollUp"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "key_sheet_other"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBar"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBarSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBarTitle"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBarTop"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBarSubtitle"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_actionBarItems"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_background"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_time"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_progressBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "key_player_progressCachedBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_progress"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_button"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "player_buttonActive"));
        if (this.commentView != null) {
            arrayList.add(new ThemeDescription(this.commentView, 0, null, Theme.chat_composeBackgroundPaint, null, null, "chat_messagePanelBackground"));
            arrayList.add(new ThemeDescription(this.commentView, 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, "chat_messagePanelShadow"));
            arrayList.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chat_messagePanelText"));
            arrayList.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_CURSORCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chat_messagePanelCursor"));
            arrayList.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chat_messagePanelHint"));
        }
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "actionBarTipBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "player_time"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "chat_messagePanelCursor"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "avatar_actionBarIconBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, dialogsActivity$$ExternalSyntheticLambda53, "groupcreate_spanBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayGreen1"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayGreen2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayBlue1"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayBlue2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_topPanelGreen1"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_topPanelGreen2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_topPanelBlue1"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_topPanelBlue2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_topPanelGray"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayAlertGradientMuted"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayAlertGradientMuted2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayAlertGradientUnmuted"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayAlertGradientUnmuted2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_mutedByAdminGradient"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_mutedByAdminGradient2"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_mutedByAdminGradient3"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "voipgroup_overlayAlertMutedByAdmin"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "kvoipgroup_overlayAlertMutedByAdmin2"));
        FiltersView filtersView = this.filtersView;
        if (filtersView != null) {
            arrayList.addAll(filtersView.getThemeDescriptions());
            this.filtersView.updateColors();
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 != null) {
            searchViewPager2.getThemeDescriptions(arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getThemeDescriptions$58() {
        DialogsSearchAdapter dialogsSearchAdapter;
        RecyclerListView innerListView;
        ViewGroup viewGroup;
        int i = 0;
        int i2 = 0;
        while (i2 < 3) {
            if (i2 == 2) {
                SearchViewPager searchViewPager = this.searchViewPager;
                if (searchViewPager == null) {
                    i2++;
                } else {
                    viewGroup = searchViewPager.searchListView;
                    if (viewGroup == null) {
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (childAt instanceof ProfileSearchCell) {
                                ((ProfileSearchCell) childAt).update(0);
                            } else if (childAt instanceof DialogCell) {
                                ((DialogCell) childAt).update(0);
                            } else if (childAt instanceof UserCell) {
                                ((UserCell) childAt).update(0);
                            }
                        }
                    }
                    i2++;
                }
            } else {
                ViewPage[] viewPageArr = this.viewPages;
                if (viewPageArr == null) {
                    i2++;
                } else {
                    viewGroup = i2 < viewPageArr.length ? viewPageArr[i2].listView : null;
                    if (viewGroup == null) {
                    }
                    i2++;
                }
            }
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 != null && (dialogsSearchAdapter = searchViewPager2.dialogsSearchAdapter) != null && (innerListView = dialogsSearchAdapter.getInnerListView()) != null) {
            int childCount2 = innerListView.getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = innerListView.getChildAt(i4);
                if (childAt2 instanceof HintDialogCell) {
                    ((HintDialogCell) childAt2).update();
                }
            }
        }
        RecyclerView recyclerView = this.sideMenu;
        if (recyclerView != null) {
            View childAt3 = recyclerView.getChildAt(0);
            if (childAt3 instanceof DrawerProfileCell) {
                DrawerProfileCell drawerProfileCell = (DrawerProfileCell) childAt3;
                drawerProfileCell.applyBackground(true);
                drawerProfileCell.updateColors();
            }
        }
        if (this.viewPages != null) {
            int i5 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i5 >= viewPageArr2.length) {
                    break;
                }
                if (viewPageArr2[i5].pullForegroundDrawable != null) {
                    this.viewPages[i5].pullForegroundDrawable.updateColors();
                }
                i5++;
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setPopupBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"), true);
            this.actionBar.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItem"), false, true);
            this.actionBar.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItemIcon"), true, true);
            this.actionBar.setPopupItemsSelectorColor(Theme.getColor("dialogButtonSelector"), true);
        }
        if (this.scrimPopupWindowItems != null) {
            while (true) {
                ActionBarMenuSubItem[] actionBarMenuSubItemArr = this.scrimPopupWindowItems;
                if (i >= actionBarMenuSubItemArr.length) {
                    break;
                }
                if (actionBarMenuSubItemArr[i] != null) {
                    actionBarMenuSubItemArr[i].setColors(Theme.getColor("actionBarDefaultSubmenuItem"), Theme.getColor("actionBarDefaultSubmenuItemIcon"));
                    this.scrimPopupWindowItems[i].setSelectorColor(Theme.getColor("dialogButtonSelector"));
                }
                i++;
            }
        }
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            View contentView = actionBarPopupWindow.getContentView();
            contentView.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
            contentView.invalidate();
        }
        ActionBarMenuItem actionBarMenuItem = this.doneItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setIconColor(Theme.getColor("actionBarDefaultIcon"));
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.updateColors();
        }
        FiltersView filtersView = this.filtersView;
        if (filtersView != null) {
            filtersView.updateColors();
        }
        SearchViewPager searchViewPager3 = this.searchViewPager;
        if (searchViewPager3 != null) {
            searchViewPager3.updateColors();
        }
        ViewPagerFixed.TabsView tabsView = this.searchTabsView;
        if (tabsView != null) {
            tabsView.updateColors();
        }
        View view = this.blurredView;
        if (view != null && Build.VERSION.SDK_INT >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor("windowBackgroundWhite"), 100)));
        }
        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
        if (actionBarMenuItem2 != null) {
            EditTextBoldCursor searchField = actionBarMenuItem2.getSearchField();
            if (this.whiteActionBar) {
                searchField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                searchField.setHintTextColor(Theme.getColor("player_time"));
                searchField.setCursorColor(Theme.getColor("chat_messagePanelCursor"));
            } else {
                searchField.setCursorColor(Theme.getColor("actionBarDefaultSearch"));
                searchField.setHintTextColor(Theme.getColor("actionBarDefaultSearchPlaceholder"));
                searchField.setTextColor(Theme.getColor("actionBarDefaultSearch"));
            }
            this.searchItem.updateColor();
        }
        updateFloatingButtonColor();
        setSearchAnimationProgress(this.searchAnimationProgress);
    }

    private void updateFloatingButtonColor() {
        if (getParentActivity() == null || this.floatingButtonContainer == null) {
            return;
        }
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor("chats_actionBackground"), Theme.getColor("chats_actionPressedBackground"));
        if (Build.VERSION.SDK_INT < 21) {
            Drawable mutate = ContextCompat.getDrawable(getParentActivity(), 2131165414).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButtonContainer.setBackground(createSimpleSelectorCircleDrawable);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
            this.slideBackTransitionAnimator = ofFloat;
            return ofFloat;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
        this.slideBackTransitionAnimator = ofFloat2;
        ofFloat2.addUpdateListener(new DialogsActivity$$ExternalSyntheticLambda0(this));
        this.slideBackTransitionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.slideBackTransitionAnimator.setDuration((int) (Math.max((int) ((200.0f / getLayoutContainer().getMeasuredWidth()) * f), 80) * 1.2f));
        this.slideBackTransitionAnimator.start();
        return this.slideBackTransitionAnimator;
    }

    public /* synthetic */ void lambda$getCustomSlideTransition$59(ValueAnimator valueAnimator) {
        setSlideTransitionProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.isSlideBackTransition = true;
            setFragmentIsSliding(true);
            return;
        }
        this.slideBackTransitionAnimator = null;
        this.isSlideBackTransition = false;
        setFragmentIsSliding(false);
        setSlideTransitionProgress(1.0f);
    }

    private void setFragmentIsSliding(boolean z) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        if (z) {
            ViewPage[] viewPageArr = this.viewPages;
            if (viewPageArr != null && viewPageArr[0] != null) {
                viewPageArr[0].setLayerType(2, null);
                this.viewPages[0].setClipChildren(false);
                this.viewPages[0].setClipToPadding(false);
                this.viewPages[0].listView.setClipChildren(false);
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setLayerType(2, null);
            }
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.getListView().setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view == null) {
                return;
            }
            ((ViewGroup) view).setClipChildren(false);
            this.fragmentView.requestLayout();
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr2 = this.viewPages;
            if (i >= viewPageArr2.length) {
                break;
            }
            ViewPage viewPage = viewPageArr2[i];
            if (viewPage != null) {
                viewPage.setLayerType(0, null);
                viewPage.setClipChildren(true);
                viewPage.setClipToPadding(true);
                viewPage.listView.setClipChildren(true);
            }
            i++;
        }
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            actionBar2.setLayerType(0, null);
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null) {
            filterTabsView2.getListView().setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 == null) {
            return;
        }
        ((ViewGroup) view2).setClipChildren(true);
        this.fragmentView.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onSlideProgress(boolean z, float f) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.isSlideBackTransition && this.slideBackTransitionAnimator == null) {
            setSlideTransitionProgress(f);
        }
    }

    private void setSlideTransitionProgress(float f) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.slideFragmentProgress = f;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView == null) {
            return;
        }
        float f2 = 1.0f - ((1.0f - this.slideFragmentProgress) * 0.05f);
        filterTabsView.getListView().setScaleX(f2);
        this.filterTabsView.getListView().setScaleY(f2);
        this.filterTabsView.getListView().setTranslationX((this.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - this.slideFragmentProgress));
        this.filterTabsView.getListView().setPivotX(this.isDrawerTransition ? this.filterTabsView.getMeasuredWidth() : 0.0f);
        this.filterTabsView.getListView().setPivotY(0.0f);
        this.filterTabsView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void setProgressToDrawerOpened(float f) {
        if (SharedConfig.getDevicePerformanceClass() == 0 || this.isSlideBackTransition) {
            return;
        }
        boolean z = f > 0.0f;
        if (this.searchIsShowed) {
            f = 0.0f;
            z = false;
        }
        if (z != this.isDrawerTransition) {
            this.isDrawerTransition = z;
            if (z) {
                setFragmentIsSliding(true);
            } else {
                setFragmentIsSliding(false);
            }
            View view = this.fragmentView;
            if (view != null) {
                view.requestLayout();
            }
        }
        setSlideTransitionProgress(1.0f - f);
    }

    public void setShowSearch(String str, int i) {
        if (!this.searching) {
            this.initialSearchType = i;
            this.actionBar.openSearchField(str, false);
            return;
        }
        if (!this.searchItem.getSearchField().getText().toString().equals(str)) {
            this.searchItem.getSearchField().setText(str);
        }
        int positionForType = this.searchViewPager.getPositionForType(i);
        if (positionForType < 0 || this.searchViewPager.getTabsView().getCurrentTabId() == positionForType) {
            return;
        }
        this.searchViewPager.getTabsView().scrollToTab(positionForType, positionForType);
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        int color = Theme.getColor((!this.searching || !this.whiteActionBar) ? this.folderId == 0 ? "actionBarDefault" : "actionBarDefaultArchived" : "windowBackgroundWhite");
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor("actionBarActionModeDefault");
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }
}
