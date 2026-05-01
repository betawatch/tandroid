package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedMediaSectionCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda379;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileStoriesCollectionTabs;
import org.telegram.ui.SelectStoriesBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TopicsFragment;

/* loaded from: classes5.dex */
public abstract class SharedMediaLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, DialogCell.DialogCellDelegate {
    private ActionBar actionBar;
    private AnimatorSet actionModeAnimation;
    private LinearLayout actionModeLayout;
    private ArrayList actionModeViews;
    private SpannableStringBuilder addPostButton;
    private float additionalFloatingTranslation;
    private boolean allowStoriesSingleColumn;
    private int animateToColumnsCount;
    private boolean animatingForward;
    private boolean animatingToOptions;
    private StoriesAdapter animationSupportingArchivedStoriesAdapter;
    private SharedPhotoVideoAdapter animationSupportingPhotoVideoAdapter;
    private StoriesAdapter animationSupportingStoriesAdapter;
    private StoriesAdapter archivedStoriesAdapter;
    private SharedDocumentsAdapter audioAdapter;
    private ArrayList audioCache;
    private ArrayList audioCellCache;
    private MediaSearchAdapter audioSearchAdapter;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private Paint backgroundPaint;
    private BotPreviewsEditContainer botPreviewsContainer;
    private ArrayList cache;
    private int cantDeleteMessagesCount;
    private ArrayList cellCache;
    private int changeColumnsTab;
    private boolean changeTypeAnimation;
    private ChannelRecommendationsAdapter channelRecommendationsAdapter;
    private ChatUsersAdapter chatUsersAdapter;
    private ImageView closeButton;
    private CommonGroupsAdapter commonGroupsAdapter;
    final Delegate delegate;
    private ActionBarMenuItem deleteItem;
    private long dialog_id;
    private boolean disableScrolling;
    private SharedDocumentsAdapter documentsAdapter;
    private MediaSearchAdapter documentsSearchAdapter;
    private int firstTab;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    private ActionBarMenuItem forwardItem;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private HintView fwdRestrictedHint;
    private GifAdapter gifAdapter;
    public ProfileGiftsContainer giftsContainer;
    private long giftsLastHash;
    FlickerLoadingView globalGradientView;
    private ActionBarMenuItem gotoItem;
    private GroupUsersSearchAdapter groupUsersSearchAdapter;
    private int[] hasMedia;
    private Runnable hideFloatingDateRunnable;
    public final IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private boolean ignoreSearchCollapse;
    private TLRPC.ChatFull info;
    private int initialTab;
    protected boolean isActionModeShowed;
    boolean isInPinchToZoomTouchMode;
    boolean isPinnedToTop;
    Runnable jumpToRunnable;
    int lastMeasuredTopPadding;
    private int lastVisibleHeight;
    private SharedLinksAdapter linksAdapter;
    private MediaSearchAdapter linksSearchAdapter;
    private int maximumVelocity;
    boolean maybePinchToZoomTouchMode;
    boolean maybePinchToZoomTouchMode2;
    private boolean maybeStartTracking;
    private int[] mediaColumnsCount;
    private MediaPage[] mediaPages;
    private long mergeDialogId;
    SparseArray messageAlphaEnter;
    AnimationNotificationsLocker notificationsLocker;
    private final NotificationCenter.ObserversGroup observersGroup;
    private float optionsAlpha;
    private RLottieImageView optionsSearchImageView;
    private int pagesPaddingBottom;
    private SharedPhotoVideoAdapter photoVideoAdapter;
    private boolean photoVideoChangeColumnsAnimation;
    private float photoVideoChangeColumnsProgress;
    public ImageView photoVideoOptionsItem;
    private ActionBarMenuItem pinItem;
    int pinchCenterOffset;
    int pinchCenterPosition;
    int pinchCenterX;
    int pinchCenterY;
    float pinchScale;
    boolean pinchScaleUp;
    float pinchStartDistance;
    private Drawable pinnedHeaderShadowDrawable;
    private int pointerId1;
    private int pointerId2;
    private PollAdapter pollAdapter;
    private BaseFragment profileActivity;
    private PhotoViewer.PhotoViewerProvider provider;
    Rect rect;
    private Theme.ResourcesProvider resourcesProvider;
    public TextView saveItem;
    private SavedDialogsAdapter savedDialogsAdapter;
    private ChatActivityContainer savedMessagesContainer;
    private SavedMessagesSearchAdapter savedMessagesSearchAdapter;
    public ScrollSlidingTextTabStripInner scrollSlidingTextTabStrip;
    private boolean scrolling;
    public boolean scrollingByUser;
    private float searchAlpha;
    private ActionBarMenuItem searchItem;
    public ActionBarMenuItem searchItemIcon;
    private int searchItemState;
    public StoriesController.StoriesList searchStoriesList;
    public SearchTagsList searchTagsList;
    private boolean searchWas;
    private boolean searching;
    private ReactionsLayoutInBubble.VisibleReaction searchingReaction;
    private SparseArray[] selectedFiles;
    private NumberTextView selectedMessagesCountTextView;
    SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate;
    private SharedMediaData[] sharedMediaData;
    private SharedMediaPreloader sharedMediaPreloader;
    private float shiftDp;
    private boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private StoriesAdapter storiesAdapter;
    private boolean storiesColumnsCountSet;
    public ProfileStoriesCollectionTabs storiesContainer;
    private ItemTouchHelper storiesReorder;
    private final HashMap storyAlbumsById;
    private final HashMap storyAlbumsByTabType;
    private float subTabsVisibilityFactor;
    private int tabIndexCounter;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private int topLayoutPadding;
    int topPadding;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private long topicId;
    private ActionBarMenuItem unpinItem;
    private TLRPC.UserFull userInfo;
    private VelocityTracker velocityTracker;
    private final int viewType;
    private SharedDocumentsAdapter voiceAdapter;
    private boolean wasReordering;
    private static final int[] supportedFastScrollTypes = {0, 1, 2, 4};
    private static final Interpolator interpolator = new Interpolator() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda9
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float lambda$static$2;
            lambda$static$2 = SharedMediaLayout.lambda$static$2(f);
            return lambda$static$2;
        }
    };

    public interface Delegate {
        boolean canSearchMembers();

        TLRPC.Chat getCurrentChat();

        RecyclerListView getListView();

        boolean isFragmentOpened();

        boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view);

        void scrollToSharedMedia();

        void updateSelectedMediaTabText();
    }

    public interface SharedMediaPreloaderDelegate {
        void mediaCountUpdated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getStoryAlbumType(int i) {
        return (i & 65535) | 65536;
    }

    public static boolean isStoryAlbumPageType(int i) {
        return (i & (-65536)) == 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$29(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float lambda$static$2(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingDateView() {
    }

    public boolean addActionButtons() {
        return true;
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public boolean canClickButtonInside() {
        return false;
    }

    protected boolean canShowSearchItem() {
        return true;
    }

    protected boolean customTabs() {
        return false;
    }

    protected int getInitialTab() {
        return 0;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    protected boolean includeSavedDialogs() {
        return false;
    }

    protected boolean includeStories() {
        return true;
    }

    protected void invalidateBlur() {
    }

    protected boolean isArchivedOnlyStoriesView() {
        return false;
    }

    protected boolean isSelf() {
        return false;
    }

    protected boolean isStoriesView() {
        return false;
    }

    public int mediaPageTopMargin() {
        return 0;
    }

    protected void onActionModeSelectedUpdate(SparseArray sparseArray) {
    }

    protected void onBottomButtonVisibilityChange() {
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    protected boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    protected void onSearchStateChanged(boolean z) {
    }

    protected void onTabScroll(boolean z) {
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public void openHiddenStories() {
    }

    public int overrideColumnsCount() {
        return -1;
    }

    protected int processColor(int i) {
        return i;
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public void showChatPreview(DialogCell dialogCell) {
    }

    static /* synthetic */ int access$14608(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.tabIndexCounter;
        sharedMediaLayout.tabIndexCounter = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void access$3800(SharedMediaLayout sharedMediaLayout, StoriesController.StoryAlbum storyAlbum) {
        sharedMediaLayout.onStoryAlbumCreate(storyAlbum);
    }

    static /* synthetic */ int access$4908(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i + 1;
        return i;
    }

    static /* synthetic */ int access$4910(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i - 1;
        return i;
    }

    public static boolean isAnyStoryPageType(int i) {
        return i == 8 || i == 9 || isStoryAlbumPageType(i);
    }

    public boolean isInFastScroll() {
        MediaPage mediaPage = this.mediaPages[0];
        return (mediaPage == null || mediaPage.listView.getFastScroll() == null || !this.mediaPages[0].listView.getFastScroll().isPressed()) ? false : true;
    }

    public boolean dispatchFastScrollEvent(MotionEvent motionEvent) {
        View view = (View) getParent();
        motionEvent.offsetLocation(((-view.getX()) - getX()) - this.mediaPages[0].listView.getFastScroll().getX(), (((-view.getY()) - getY()) - this.mediaPages[0].getY()) - this.mediaPages[0].listView.getFastScroll().getY());
        return this.mediaPages[0].listView.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        RecyclerView.Adapter adapter;
        BotPreviewsEditContainer botPreviewsEditContainer;
        int i = this.mediaPages[0].selectedType;
        if (i == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.checkPinchToZoom(motionEvent);
        }
        if ((i != 0 && !isAnyStoryPageType(i)) || getParent() == null) {
            return false;
        }
        if (this.photoVideoChangeColumnsAnimation && !this.isInPinchToZoomTouchMode) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.mediaPages[0].listView.cancelClickRunnables(false);
                this.mediaPages[0].listView.cancelLongPress();
                this.mediaPages[0].listView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                View view = (View) getParent();
                this.pinchCenterX = (int) (((((int) ((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f)) - view.getX()) - getX()) - this.mediaPages[0].getX());
                int y = (int) (((((int) ((motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f)) - view.getY()) - getY()) - this.mediaPages[0].getY());
                this.pinchCenterY = y;
                selectPinchPosition(this.pinchCenterX, y);
                this.maybePinchToZoomTouchMode2 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - this.mediaPages[0].getY() > 0.0f) {
                    this.maybePinchToZoomTouchMode = true;
                }
            }
        } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                if (this.pointerId1 == motionEvent.getPointerId(i4)) {
                    i2 = i4;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i4)) {
                    i3 = i4;
                }
            }
            if (i2 == -1 || i3 == -1) {
                this.maybePinchToZoomTouchMode = false;
                this.maybePinchToZoomTouchMode2 = false;
                this.isInPinchToZoomTouchMode = false;
                finishPinchToMediaColumnsCount();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.pinchStartDistance;
            this.pinchScale = hypot;
            if (!this.isInPinchToZoomTouchMode && (hypot > 1.01f || hypot < 0.99f)) {
                this.isInPinchToZoomTouchMode = true;
                boolean z = hypot > 1.0f;
                this.pinchScaleUp = z;
                startPinchToMediaColumnsCount(z);
            }
            if (this.isInPinchToZoomTouchMode) {
                boolean z2 = this.pinchScaleUp;
                if ((!z2 || this.pinchScale >= 1.0f) && (z2 || this.pinchScale <= 1.0f)) {
                    this.photoVideoChangeColumnsProgress = Math.max(0.0f, Math.min(1.0f, z2 ? 1.0f - ((2.0f - this.pinchScale) / 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                } else {
                    this.photoVideoChangeColumnsProgress = 0.0f;
                }
                float f = this.photoVideoChangeColumnsProgress;
                if (f == 1.0f || f == 0.0f) {
                    if (isAnyStoryPageType(this.changeColumnsTab)) {
                        adapter = storyAlbums_getStoriesAdapterByTabType(this.changeColumnsTab);
                    } else {
                        adapter = this.photoVideoAdapter;
                    }
                    if (this.photoVideoChangeColumnsProgress == 1.0f) {
                        int i5 = this.animateToColumnsCount;
                        int ceil = (((int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount)) * i5) + ((int) ((this.startedTrackingX / (this.mediaPages[0].listView.getMeasuredWidth() - ((int) (this.mediaPages[0].listView.getMeasuredWidth() / this.animateToColumnsCount)))) * (i5 - 1)));
                        if (ceil >= adapter.getItemCount()) {
                            ceil = adapter.getItemCount() - 1;
                        }
                        this.pinchCenterPosition = ceil;
                    }
                    finishPinchToMediaColumnsCount();
                    if (this.photoVideoChangeColumnsProgress == 0.0f) {
                        this.pinchScaleUp = !this.pinchScaleUp;
                    }
                    startPinchToMediaColumnsCount(this.pinchScaleUp);
                    this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                }
                this.mediaPages[0].listView.invalidate();
                MediaPage mediaPage = this.mediaPages[0];
                if (mediaPage.fastScrollHintView != null) {
                    mediaPage.invalidate();
                }
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.maybePinchToZoomTouchMode2 = false;
            this.maybePinchToZoomTouchMode = false;
            this.isInPinchToZoomTouchMode = false;
            finishPinchToMediaColumnsCount();
        }
        return this.isInPinchToZoomTouchMode;
    }

    private void selectPinchPosition(int i, int i2) {
        this.pinchCenterPosition = -1;
        int i3 = i2 + this.mediaPages[0].listView.blurTopPadding;
        if (getY() != 0.0f && this.viewType == 1) {
            i3 = 0;
        }
        for (int i4 = 0; i4 < this.mediaPages[0].listView.getChildCount(); i4++) {
            View childAt = this.mediaPages[0].listView.getChildAt(i4);
            childAt.getHitRect(this.rect);
            if (this.rect.contains(i, i3)) {
                this.pinchCenterPosition = this.mediaPages[0].listView.getChildLayoutPosition(childAt);
                this.pinchCenterOffset = childAt.getTop();
            }
        }
        if (this.delegate.canSearchMembers() && this.pinchCenterPosition == -1) {
            this.pinchCenterPosition = (int) (this.mediaPages[0].layoutManager.findFirstVisibleItemPosition() + ((this.mediaColumnsCount[isAnyStoryPageType(this.mediaPages[0].selectedType) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i / this.mediaPages[0].listView.getMeasuredWidth(), 0.0f))));
            this.pinchCenterOffset = 0;
        }
    }

    private boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public boolean isSwipeBackEnabled() {
        if (canEditStories() && ((getClosestTab() == 8 || getClosestTab() == 13 || isStoryAlbumPageType(getClosestTab())) && isActionModeShown())) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        return ((profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) || this.photoVideoChangeColumnsAnimation || this.tabsAnimationInProgress) ? false : true;
    }

    public int getPhotosVideosTypeFilter() {
        return this.sharedMediaData[0].filterType;
    }

    public boolean isPinnedToTop() {
        return this.isPinnedToTop;
    }

    public void setPinnedToTop(boolean z) {
        if (this.isPinnedToTop == z) {
            return;
        }
        this.isPinnedToTop = z;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            updateFastScrollVisibility(mediaPageArr[i], true);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawListForBlur(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null && mediaPage.getVisibility() == 0) {
                for (int i2 = 0; i2 < this.mediaPages[i].listView.getChildCount(); i2++) {
                    View childAt = this.mediaPages[i].listView.getChildAt(i2);
                    if (childAt.getY() < this.mediaPages[i].listView.blurTopPadding + AndroidUtilities.dp(100.0f)) {
                        int save = canvas.save();
                        canvas.translate(this.mediaPages[i].getX() + childAt.getX(), getY() + this.mediaPages[i].getY() + this.mediaPages[i].listView.getY() + childAt.getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
                            arrayList.add((SizeNotifierFrameLayout.IViewWithInvalidateCallback) childAt);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            }
            i++;
        }
    }

    @Override // org.telegram.ui.Cells.DialogCell.DialogCellDelegate
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        BaseFragment baseFragment = this.profileActivity;
        if (baseFragment != null && baseFragment.getMessagesController().getStoriesController().hasStories(dialogCell.getDialogId())) {
            this.profileActivity.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
            Context context = this.profileActivity.getContext();
            long dialogId = dialogCell.getDialogId();
            StoriesListPlaceProvider of = StoriesListPlaceProvider.of((RecyclerListView) dialogCell.getParent());
            BaseFragment baseFragment2 = this.profileActivity;
            orCreateStoryViewer.open(context, dialogId, of.addBottomClip(((baseFragment2 instanceof ProfileActivity) && ((ProfileActivity) baseFragment2).myProfile) ? AndroidUtilities.dp(68.0f) : 0));
        }
    }

    public static class MediaPage extends FrameLayout {
        private ClippingImageView animatingImageView;
        private GridLayoutManager animationSupportingLayoutManager;
        private InternalListView animationSupportingListView;
        private StickerEmptyView emptyView;
        public ObjectAnimator fastScrollAnimator;
        public boolean fastScrollEnabled;
        public Runnable fastScrollHideHintRunnable;
        public boolean fastScrollHinWasShown;
        public SharedMediaFastScrollTooltip fastScrollHintView;
        public boolean highlightAnimation;
        public int highlightMessageId;
        public float highlightProgress;
        private IBlur3Capture iBlur3Capture;
        private DefaultItemAnimator itemAnimator;
        public long lastCheckScrollTime;
        private ExtendedGridLayoutManager layoutManager;
        private InternalListView listView;
        private FlickerLoadingView progressView;
        private RecyclerAnimationScrollHelper scrollHelper;
        private RecyclerView.RecycledViewPool searchViewPool;
        public int selectedType;
        private RecyclerView.RecycledViewPool viewPool;

        public MediaPage(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.animationSupportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = this.fastScrollHintView;
            if (sharedMediaFastScrollTooltip == null || sharedMediaFastScrollTooltip.getVisibility() != 0) {
                return;
            }
            RecyclerListView.FastScroll fastScroll = this.listView.getFastScroll();
            if (fastScroll != null) {
                float scrollBarY = fastScroll.getScrollBarY() + AndroidUtilities.dp(36.0f);
                if (this.selectedType == 9) {
                    scrollBarY += AndroidUtilities.dp(64.0f);
                }
                int i = this.selectedType;
                if (i == 8 || SharedMediaLayout.isStoryAlbumPageType(i)) {
                    scrollBarY += AndroidUtilities.dp(42.0f);
                }
                float measuredWidth = (getMeasuredWidth() - this.fastScrollHintView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
                this.fastScrollHintView.setPivotX(r2.getMeasuredWidth());
                this.fastScrollHintView.setPivotY(0.0f);
                this.fastScrollHintView.setTranslationX(measuredWidth);
                this.fastScrollHintView.setTranslationY(scrollBarY);
            }
            if (fastScroll.getProgress() > 0.85f) {
                SharedMediaLayout.showFastScrollHint(this, null, false);
            }
        }
    }

    public float getPhotoVideoOptionsAlpha(float f) {
        int i;
        ProfileGiftsContainer profileGiftsContainer;
        int i2;
        int i3;
        ProfileGiftsContainer profileGiftsContainer2;
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && ((i2 = mediaPage.selectedType) == 0 || (((i2 == 8 || isStoryAlbumPageType(i2)) && TextUtils.isEmpty(getStoriesHashtag())) || (i3 = this.mediaPages[1].selectedType) == 9 || i3 == 11 || i3 == 13 || (i3 == 14 && (profileGiftsContainer2 = this.giftsContainer) != null && profileGiftsContainer2.canFilter())))) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        if (mediaPage2 == null) {
            return f2;
        }
        int i4 = mediaPage2.selectedType;
        return (i4 == 0 || ((i4 == 8 || isStoryAlbumPageType(i4)) && TextUtils.isEmpty(getStoriesHashtag())) || (i = this.mediaPages[0].selectedType) == 9 || i == 11 || i == 13 || (i == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter())) ? f2 + (1.0f - f) : f2;
    }

    public float getSearchAlpha(float f) {
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && isSearchItemVisible(mediaPage.selectedType) && this.mediaPages[1].selectedType != 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        return (mediaPage2 == null || !isSearchItemVisible(mediaPage2.selectedType) || this.mediaPages[0].selectedType == 11) ? f2 : f2 + (1.0f - f);
    }

    public void updateSearchItemIcon(float f) {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        float f2 = 0.0f;
        if (mediaPage != null && mediaPage.selectedType == 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = mediaPageArr[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 11) {
            f2 += 1.0f - f;
        }
        actionBarMenuItem.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        this.searchItemIcon.setScaleX(f3);
        this.searchItemIcon.setScaleY(f3);
        this.searchItemIcon.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public void updateSearchItemIconAnimated() {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage mediaPage = this.mediaPages[1];
        final boolean z = mediaPage != null && mediaPage.selectedType == 11;
        if (z) {
            actionBarMenuItem.setVisibility(0);
        }
        this.searchItemIcon.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$updateSearchItemIconAnimated$0(z);
            }
        }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSearchItemIconAnimated$0(boolean z) {
        if (z) {
            return;
        }
        this.searchItemIcon.setVisibility(8);
    }

    public void updateFastScrollVisibility(MediaPage mediaPage, boolean z) {
        boolean z2 = mediaPage.fastScrollEnabled && this.isPinnedToTop;
        RecyclerListView.FastScroll fastScroll = mediaPage.listView.getFastScroll();
        ObjectAnimator objectAnimator = mediaPage.fastScrollAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            mediaPage.fastScrollAnimator.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z2 ? 0 : 8);
            fastScroll.setTag(z2 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        if (z2 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) View.ALPHA, fastScroll.getAlpha(), 1.0f);
            mediaPage.fastScrollAnimator = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(r4);
            return;
        }
        if (z2 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) View.ALPHA, fastScroll.getAlpha(), 0.0f);
        ofFloat2.addListener(new HideViewAfterAnimation(fastScroll));
        mediaPage.fastScrollAnimator = ofFloat2;
        ofFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        hideFloatingDateView(true);
    }

    public static class SharedMediaPreloader implements NotificationCenter.NotificationCenterDelegate {
        private boolean checkedHasSavedMessages;
        private long dialogId;
        public boolean hasPreviews;
        public boolean hasSavedMessages;
        private boolean mediaWasLoaded;
        private long mergeDialogId;
        private final NotificationCenter.ObserversGroup observersGroup;
        private BaseFragment parentFragment;
        private SharedMediaData[] sharedMediaData;
        private long topicId;
        private int[] mediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] mediaMergeCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMergeMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private ArrayList delegates = new ArrayList();

        public long getTopicId() {
            return this.topicId;
        }

        public boolean hasSharedMedia() {
            int[] lastMediaCount = getLastMediaCount();
            if (lastMediaCount == null) {
                return false;
            }
            for (int i : lastMediaCount) {
                if (i > 0) {
                    return true;
                }
            }
            if (this.hasSavedMessages) {
                return true;
            }
            BaseFragment baseFragment = this.parentFragment;
            return baseFragment != null && this.dialogId == baseFragment.getUserConfig().getClientUserId() && this.topicId == 0 && this.parentFragment.getMessagesController().getSavedMessagesController().hasDialogs();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SharedMediaPreloader(BaseFragment baseFragment) {
            TLRPC.ChatFull chatFull;
            this.parentFragment = baseFragment;
            if (baseFragment instanceof ChatActivityInterface) {
                ChatActivityInterface chatActivityInterface = (ChatActivityInterface) baseFragment;
                this.dialogId = chatActivityInterface.getDialogId();
                this.mergeDialogId = chatActivityInterface.getMergeDialogId();
                this.topicId = chatActivityInterface.getTopicId();
                if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                    baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$SharedMediaPreloader$$ExternalSyntheticLambda0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            SharedMediaLayout.SharedMediaPreloader.this.lambda$new$0((Boolean) obj);
                        }
                    });
                }
            } else if (baseFragment instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) baseFragment;
                if (profileActivity.saved) {
                    this.dialogId = profileActivity.getUserConfig().getClientUserId();
                    this.topicId = profileActivity.getDialogId();
                } else {
                    this.dialogId = profileActivity.getDialogId();
                    this.topicId = profileActivity.getTopicId();
                    TLRPC.ChatFull chatInfo = profileActivity.getChatInfo();
                    if (chatInfo != null) {
                        setChatInfo(chatInfo);
                    }
                    if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                        baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$SharedMediaPreloader$$ExternalSyntheticLambda1
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                SharedMediaLayout.SharedMediaPreloader.this.lambda$new$1((Boolean) obj);
                            }
                        });
                    }
                }
            } else if (baseFragment instanceof MediaActivity) {
                this.dialogId = ((MediaActivity) baseFragment).getDialogId();
            } else if (baseFragment instanceof DialogsActivity) {
                this.dialogId = baseFragment.getUserConfig().getClientUserId();
            }
            if (this.mergeDialogId == 0 && DialogObject.isChatDialog(this.dialogId) && (chatFull = baseFragment.getMessagesController().getChatFull(-this.dialogId)) != null) {
                long j = chatFull.migrated_from_chat_id;
                if (j != 0) {
                    this.mergeDialogId = -j;
                }
            }
            this.sharedMediaData = new SharedMediaData[9];
            int i = 0;
            while (true) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i >= sharedMediaDataArr.length) {
                    break;
                }
                sharedMediaDataArr[i] = new SharedMediaData();
                this.sharedMediaData[i].setMaxId(0, DialogObject.isEncryptedDialog(this.dialogId) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID);
                this.sharedMediaData[i].setMaxId(1, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i++;
            }
            loadMediaCounts();
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                this.observersGroup = null;
            } else {
                this.observersGroup = baseFragment2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.hasSavedMessages = booleanValue;
            this.checkedHasSavedMessages = true;
            if (booleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    ((SharedMediaPreloaderDelegate) this.delegates.get(i)).mediaCountUpdated();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.hasSavedMessages = booleanValue;
            this.checkedHasSavedMessages = true;
            if (booleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    ((SharedMediaPreloaderDelegate) this.delegates.get(i)).mediaCountUpdated();
                }
            }
        }

        public void addDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.add(sharedMediaPreloaderDelegate);
        }

        public void removeDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.remove(sharedMediaPreloaderDelegate);
        }

        public void onDestroy(BaseFragment baseFragment) {
            if (baseFragment != this.parentFragment) {
                return;
            }
            this.delegates.clear();
            NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }

        public int[] getLastMediaCount() {
            return this.lastMediaCount;
        }

        public SharedMediaData[] getSharedMediaData() {
            return this.sharedMediaData;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void didReceivedNotification(int i, final int i2, Object... objArr) {
            int i3;
            int mediaType;
            int i4;
            int i5;
            int[] iArr;
            int i6;
            int i7;
            int i8;
            int i9 = 0;
            boolean z = true;
            if (i == NotificationCenter.mediaCountsDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                long longValue2 = ((Long) objArr[1]).longValue();
                if (this.topicId == longValue2) {
                    long j = this.dialogId;
                    if (longValue == j || longValue == this.mergeDialogId) {
                        int[] iArr2 = (int[]) objArr[2];
                        if (longValue == j) {
                            this.mediaCount = iArr2;
                        } else {
                            this.mediaMergeCount = iArr2;
                        }
                        int i10 = 0;
                        while (i10 < iArr2.length) {
                            int i11 = this.mediaCount[i10];
                            if (i11 >= 0 && (i8 = this.mediaMergeCount[i10]) >= 0) {
                                this.lastMediaCount[i10] = i11 + i8;
                            } else if (i11 >= 0) {
                                this.lastMediaCount[i10] = i11;
                            } else {
                                this.lastMediaCount[i10] = Math.max(this.mediaMergeCount[i10], 0);
                            }
                            if (longValue != this.dialogId || this.lastMediaCount[i10] == 0 || this.lastLoadMediaCount[i10] == this.mediaCount[i10]) {
                                i5 = i10;
                                iArr = iArr2;
                                if (longValue == this.mergeDialogId && this.lastMediaCount[i5] != 0 && this.lastLoadMergeMediaCount[i5] != this.mediaMergeCount[i5]) {
                                    if (i5 == 0) {
                                        int i12 = this.sharedMediaData[0].filterType;
                                        if (i12 == 1) {
                                            i6 = 6;
                                        } else if (i12 == 2) {
                                            i6 = 7;
                                        }
                                        this.parentFragment.getMediaDataController().loadMedia(longValue, this.lastLoadMergeMediaCount[i5] != -1 ? 20 : 30, 0, 0, i6, longValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i5].requestIndex, null, null);
                                        this.lastLoadMergeMediaCount[i5] = this.mediaMergeCount[i5];
                                    }
                                    i6 = i5;
                                    this.parentFragment.getMediaDataController().loadMedia(longValue, this.lastLoadMergeMediaCount[i5] != -1 ? 20 : 30, 0, 0, i6, longValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i5].requestIndex, null, null);
                                    this.lastLoadMergeMediaCount[i5] = this.mediaMergeCount[i5];
                                }
                            } else {
                                if (i10 == 0) {
                                    int i13 = this.sharedMediaData[0].filterType;
                                    if (i13 == 1) {
                                        i7 = 6;
                                    } else if (i13 == 2) {
                                        i7 = 7;
                                    }
                                    i5 = i10;
                                    iArr = iArr2;
                                    this.parentFragment.getMediaDataController().loadMedia(longValue, this.lastLoadMediaCount[i10] != -1 ? 20 : 30, 0, 0, i7, longValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i10].requestIndex, null, null);
                                    this.lastLoadMediaCount[i5] = this.mediaCount[i5];
                                }
                                i7 = i10;
                                i5 = i10;
                                iArr = iArr2;
                                this.parentFragment.getMediaDataController().loadMedia(longValue, this.lastLoadMediaCount[i10] != -1 ? 20 : 30, 0, 0, i7, longValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i10].requestIndex, null, null);
                                this.lastLoadMediaCount[i5] = this.mediaCount[i5];
                            }
                            i10 = i5 + 1;
                            iArr2 = iArr;
                        }
                        this.mediaWasLoaded = true;
                        int size = this.delegates.size();
                        while (i9 < size) {
                            ((SharedMediaPreloaderDelegate) this.delegates.get(i9)).mediaCountUpdated();
                            i9++;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.mediaCountDidLoad) {
                long longValue3 = ((Long) objArr[0]).longValue();
                long longValue4 = ((Long) objArr[1]).longValue();
                if ((longValue3 == this.dialogId || longValue3 == this.mergeDialogId) && this.topicId == longValue4) {
                    int intValue = ((Integer) objArr[4]).intValue();
                    int intValue2 = ((Integer) objArr[2]).intValue();
                    if (longValue3 == this.dialogId) {
                        this.mediaCount[intValue] = intValue2;
                    } else {
                        this.mediaMergeCount[intValue] = intValue2;
                    }
                    int i14 = this.mediaCount[intValue];
                    if (i14 >= 0 && (i4 = this.mediaMergeCount[intValue]) >= 0) {
                        this.lastMediaCount[intValue] = i14 + i4;
                    } else if (i14 >= 0) {
                        this.lastMediaCount[intValue] = i14;
                    } else {
                        this.lastMediaCount[intValue] = Math.max(this.mediaMergeCount[intValue], 0);
                    }
                    int size2 = this.delegates.size();
                    while (i9 < size2) {
                        ((SharedMediaPreloaderDelegate) this.delegates.get(i9)).mediaCountUpdated();
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.didReceiveNewMessages) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue5 = ((Long) objArr[0]).longValue();
                long j2 = this.dialogId;
                if (longValue5 == j2 || longValue5 == this.mergeDialogId) {
                    int i15 = longValue5 == j2 ? 0 : 1;
                    boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue5);
                    ArrayList arrayList = (ArrayList) objArr[1];
                    BaseFragment baseFragment = this.parentFragment;
                    int currentAccount = baseFragment != null ? baseFragment.getCurrentAccount() : -1;
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i16);
                        long j3 = this.topicId;
                        if ((j3 == 0 || j3 == MessageObject.getTopicId(currentAccount, messageObject.messageOwner, true)) && MessageObject.getMedia(messageObject.messageOwner) != null && !messageObject.needDrawBluredPreview() && (mediaType = MediaDataController.getMediaType(messageObject.messageOwner)) != -1 && ((mediaType != 0 || this.sharedMediaData[0].filterType != 2 || messageObject.isVideo()) && (mediaType != 0 || this.sharedMediaData[0].filterType != 1 || !messageObject.isVideo()))) {
                            SharedMediaData sharedMediaData = this.sharedMediaData[mediaType];
                            if (sharedMediaData.startReached) {
                                sharedMediaData.addMessage(messageObject, i15, true, isEncryptedDialog);
                            }
                            if (this.topicId == 0) {
                                int[] iArr3 = this.sharedMediaData[mediaType].totalCount;
                                iArr3[i15] = iArr3[i15] + 1;
                            }
                            if (i15 == 0) {
                                for (int i17 = 0; i17 < this.sharedMediaData[mediaType].fastScrollPeriods.size(); i17++) {
                                    ((Period) this.sharedMediaData[mediaType].fastScrollPeriods.get(i17)).startOffset++;
                                }
                            }
                        }
                    }
                    loadMediaCounts();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.messageReceivedByServer) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l = (Long) objArr[3];
                if (l.longValue() != this.dialogId && l.longValue() != this.mergeDialogId) {
                    return;
                }
                int i18 = l.longValue() == this.dialogId ? 0 : 1;
                while (true) {
                    SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                    if (i9 >= sharedMediaDataArr.length) {
                        return;
                    }
                    sharedMediaDataArr[i9].replaceMid(i18, num.intValue(), num2.intValue());
                    i9++;
                }
            } else {
                if (i == NotificationCenter.mediaDidLoad) {
                    long longValue6 = ((Long) objArr[0]).longValue();
                    if (((Integer) objArr[3]).intValue() == this.parentFragment.getClassGuid()) {
                        int intValue3 = ((Integer) objArr[4]).intValue();
                        ArrayList arrayList2 = (ArrayList) objArr[2];
                        boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(longValue6);
                        int i19 = longValue6 == this.dialogId ? 0 : 1;
                        if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                            if (intValue3 != this.sharedMediaData[0].filterType) {
                                return;
                            } else {
                                intValue3 = 0;
                            }
                        }
                        if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                            this.sharedMediaData[intValue3].setTotalCount(i19, ((Integer) objArr[1]).intValue());
                        }
                        this.sharedMediaData[intValue3].setEndReached(i19, ((Boolean) objArr[5]).booleanValue());
                        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                            this.sharedMediaData[intValue3].addMessage((MessageObject) arrayList2.get(i20), i19, false, isEncryptedDialog2);
                        }
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.messagesDeleted) {
                    if (((Boolean) objArr[2]).booleanValue()) {
                        return;
                    }
                    long longValue7 = ((Long) objArr[1]).longValue();
                    TLRPC.Chat chat = DialogObject.isChatDialog(this.dialogId) ? this.parentFragment.getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
                    if (ChatObject.isChannel(chat)) {
                        if ((longValue7 != 0 || this.mergeDialogId == 0) && longValue7 != chat.id) {
                            return;
                        }
                    } else if (longValue7 != 0) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    BaseFragment baseFragment2 = this.parentFragment;
                    int currentAccount2 = baseFragment2 != null ? baseFragment2.getCurrentAccount() : -1;
                    int size3 = arrayList3.size();
                    boolean z2 = false;
                    for (int i21 = 0; i21 < size3; i21++) {
                        int i22 = 0;
                        while (true) {
                            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                            if (i22 < sharedMediaDataArr2.length) {
                                MessageObject deleteMessage = sharedMediaDataArr2[i22].deleteMessage(((Integer) arrayList3.get(i21)).intValue(), 0);
                                if (deleteMessage != null) {
                                    if (deleteMessage.getDialogId() == this.dialogId && (this.topicId == 0 || MessageObject.getTopicId(currentAccount2, deleteMessage.messageOwner, true) == this.topicId)) {
                                        int[] iArr4 = this.mediaCount;
                                        int i23 = iArr4[i22];
                                        if (i23 > 0) {
                                            iArr4[i22] = i23 - 1;
                                        }
                                    } else {
                                        int[] iArr5 = this.mediaMergeCount;
                                        int i24 = iArr5[i22];
                                        if (i24 > 0) {
                                            iArr5[i22] = i24 - 1;
                                        }
                                    }
                                    z2 = true;
                                }
                                i22++;
                            }
                        }
                    }
                    if (z2) {
                        int i25 = 0;
                        while (true) {
                            int[] iArr6 = this.mediaCount;
                            if (i25 >= iArr6.length) {
                                break;
                            }
                            int i26 = iArr6[i25];
                            if (i26 >= 0 && (i3 = this.mediaMergeCount[i25]) >= 0) {
                                this.lastMediaCount[i25] = i26 + i3;
                            } else if (i26 >= 0) {
                                this.lastMediaCount[i25] = i26;
                            } else {
                                this.lastMediaCount[i25] = Math.max(this.mediaMergeCount[i25], 0);
                            }
                            i25++;
                        }
                        int size4 = this.delegates.size();
                        while (i9 < size4) {
                            ((SharedMediaPreloaderDelegate) this.delegates.get(i9)).mediaCountUpdated();
                            i9++;
                        }
                    }
                    loadMediaCounts();
                    return;
                }
                if (i == NotificationCenter.replaceMessagesObjects) {
                    long longValue8 = ((Long) objArr[0]).longValue();
                    long j4 = this.dialogId;
                    if (longValue8 == j4 || longValue8 == this.mergeDialogId) {
                        int i27 = longValue8 == j4 ? 0 : 1;
                        ArrayList arrayList4 = (ArrayList) objArr[1];
                        BaseFragment baseFragment3 = this.parentFragment;
                        int currentAccount3 = baseFragment3 != null ? baseFragment3.getCurrentAccount() : -1;
                        int size5 = arrayList4.size();
                        int i28 = 0;
                        while (i28 < size5) {
                            MessageObject messageObject2 = (MessageObject) arrayList4.get(i28);
                            int id = messageObject2.getId();
                            long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z);
                            int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                            long j5 = this.topicId;
                            if (j5 == 0 || topicId == j5) {
                                int i29 = 0;
                                while (true) {
                                    SharedMediaData[] sharedMediaDataArr3 = this.sharedMediaData;
                                    if (i29 >= sharedMediaDataArr3.length) {
                                        break;
                                    }
                                    MessageObject messageObject3 = (MessageObject) sharedMediaDataArr3[i29].messagesDict[i27].get(id);
                                    if (messageObject3 != null) {
                                        int mediaType3 = MediaDataController.getMediaType(messageObject2.messageOwner);
                                        if (mediaType2 == -1 || mediaType3 != mediaType2) {
                                            this.sharedMediaData[i29].deleteMessage(id, i27);
                                            if (i27 == 0) {
                                                int[] iArr7 = this.mediaCount;
                                                int i30 = iArr7[i29];
                                                if (i30 > 0) {
                                                    iArr7[i29] = i30 - 1;
                                                }
                                            } else {
                                                int[] iArr8 = this.mediaMergeCount;
                                                int i31 = iArr8[i29];
                                                if (i31 > 0) {
                                                    iArr8[i29] = i31 - 1;
                                                }
                                            }
                                        } else {
                                            int indexOf = this.sharedMediaData[i29].messages.indexOf(messageObject3);
                                            if (indexOf >= 0) {
                                                this.sharedMediaData[i29].messagesDict[i27].put(id, messageObject2);
                                                this.sharedMediaData[i29].messages.set(indexOf, messageObject2);
                                            }
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                            }
                            i28++;
                            z = true;
                        }
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.chatInfoDidLoad) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j6 = this.dialogId;
                    if (j6 >= 0 || chatFull.id != (-j6)) {
                        return;
                    }
                    setChatInfo(chatFull);
                    return;
                }
                if (i == NotificationCenter.fileLoaded) {
                    final ArrayList arrayList5 = new ArrayList();
                    int i32 = 0;
                    while (true) {
                        SharedMediaData[] sharedMediaDataArr4 = this.sharedMediaData;
                        if (i32 >= sharedMediaDataArr4.length) {
                            break;
                        }
                        arrayList5.addAll(sharedMediaDataArr4[i32].messages);
                        i32++;
                    }
                    final String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout.SharedMediaPreloader.1
                            @Override // java.lang.Runnable
                            public void run() {
                                int i33 = 0;
                                while (i33 < arrayList5.size()) {
                                    if (!str.equals(((MessageObject) arrayList5.get(i33)).getFileName())) {
                                        arrayList5.remove(i33);
                                        i33--;
                                    }
                                    i33++;
                                }
                                if (arrayList5.size() > 0) {
                                    FileLoader.getInstance(i2).checkMediaExistance(arrayList5);
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                    BaseFragment baseFragment4 = this.parentFragment;
                    boolean z3 = baseFragment4 != null && baseFragment4.getMessagesController().getSavedMessagesController().containsDialog(this.dialogId);
                    if (!this.checkedHasSavedMessages || this.hasSavedMessages == z3) {
                        return;
                    }
                    this.hasSavedMessages = z3;
                    int size6 = this.delegates.size();
                    for (int i33 = 0; i33 < size6; i33++) {
                        ((SharedMediaPreloaderDelegate) this.delegates.get(i33)).mediaCountUpdated();
                    }
                }
            }
        }

        private void loadMediaCounts() {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            baseFragment.getMediaDataController().getMediaCounts(this.dialogId, this.topicId, this.parentFragment.getClassGuid());
            if (this.mergeDialogId != 0) {
                this.parentFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
            }
        }

        private void setChatInfo(TLRPC.ChatFull chatFull) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null || chatFull == null) {
                return;
            }
            long j = chatFull.migrated_from_chat_id;
            if (j == 0 || this.mergeDialogId != 0) {
                return;
            }
            this.mergeDialogId = -j;
            baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
        }

        public boolean isMediaWasLoaded() {
            return this.mediaWasLoaded;
        }
    }

    public static class SharedMediaData {
        private int endLoadingStubs;
        public boolean fastScrollDataLoaded;
        public int frozenEndLoadingStubs;
        public int frozenStartOffset;
        private boolean hasPhotos;
        private boolean hasVideos;
        public boolean isFrozen;
        public boolean loading;
        public boolean loadingAfterFastScroll;
        public int min_id;
        public int requestIndex;
        private int startOffset;
        public ArrayList messages = new ArrayList();
        public SparseArray[] messagesDict = {new SparseArray(), new SparseArray()};
        public ArrayList sections = new ArrayList();
        public HashMap sectionArrays = new HashMap();
        public ArrayList fastScrollPeriods = new ArrayList();
        public int[] totalCount = {0, 0};
        public boolean[] endReached = {false, true};
        public int[] max_id = {0, 0};
        public boolean startReached = true;
        public int filterType = 0;
        public ArrayList frozenMessages = new ArrayList();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        static /* synthetic */ int access$12010(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.endLoadingStubs;
            sharedMediaData.endLoadingStubs = i - 1;
            return i;
        }

        static /* synthetic */ int access$610(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.startOffset;
            sharedMediaData.startOffset = i - 1;
            return i;
        }

        public void setTotalCount(int i, int i2) {
            this.totalCount[i] = i2;
        }

        public int getTotalCount() {
            int[] iArr = this.totalCount;
            return iArr[0] + iArr[1];
        }

        public void setMaxId(int i, int i2) {
            this.max_id[i] = i2;
        }

        public void setEndReached(int i, boolean z) {
            this.endReached[i] = z;
        }

        public boolean addMessage(MessageObject messageObject, int i, boolean z, boolean z2) {
            if (this.messagesDict[i].indexOfKey(messageObject.getId()) >= 0) {
                return false;
            }
            ArrayList arrayList = (ArrayList) this.sectionArrays.get(messageObject.monthKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.sectionArrays.put(messageObject.monthKey, arrayList);
                if (z) {
                    this.sections.add(0, messageObject.monthKey);
                } else {
                    this.sections.add(messageObject.monthKey);
                }
            }
            if (z) {
                arrayList.add(0, messageObject);
                this.messages.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
                this.messages.add(messageObject);
            }
            this.messagesDict[i].put(messageObject.getId(), messageObject);
            if (!z2) {
                if (messageObject.getId() > 0) {
                    this.max_id[i] = Math.min(messageObject.getId(), this.max_id[i]);
                    this.min_id = Math.max(messageObject.getId(), this.min_id);
                }
            } else {
                this.max_id[i] = Math.max(messageObject.getId(), this.max_id[i]);
                this.min_id = Math.min(messageObject.getId(), this.min_id);
            }
            if (!this.hasVideos && messageObject.isVideo()) {
                this.hasVideos = true;
            }
            if (!this.hasPhotos && messageObject.isPhoto()) {
                this.hasPhotos = true;
            }
            return true;
        }

        public MessageObject deleteMessage(int i, int i2) {
            ArrayList arrayList;
            MessageObject messageObject = (MessageObject) this.messagesDict[i2].get(i);
            if (messageObject == null || (arrayList = (ArrayList) this.sectionArrays.get(messageObject.monthKey)) == null) {
                return null;
            }
            arrayList.remove(messageObject);
            this.messages.remove(messageObject);
            this.messagesDict[i2].remove(messageObject.getId());
            if (arrayList.isEmpty()) {
                this.sectionArrays.remove(messageObject.monthKey);
                this.sections.remove(messageObject.monthKey);
            }
            int[] iArr = this.totalCount;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            return messageObject;
        }

        public void replaceMid(int i, int i2, int i3) {
            MessageObject messageObject = (MessageObject) this.messagesDict[i].get(i2);
            if (messageObject != null) {
                this.messagesDict[i].remove(i2);
                this.messagesDict[i].put(i3, messageObject);
                messageObject.messageOwner.id = i3;
                int[] iArr = this.max_id;
                iArr[i] = Math.min(i3, iArr[i]);
            }
        }

        public ArrayList getMessages() {
            return this.isFrozen ? this.frozenMessages : this.messages;
        }

        public int getStartOffset() {
            return this.isFrozen ? this.frozenStartOffset : this.startOffset;
        }

        public void setListFrozen(boolean z) {
            if (this.isFrozen == z) {
                return;
            }
            this.isFrozen = z;
            if (z) {
                this.frozenStartOffset = this.startOffset;
                this.frozenEndLoadingStubs = this.endLoadingStubs;
                this.frozenMessages.clear();
                this.frozenMessages.addAll(this.messages);
            }
        }

        public int getEndLoadingStubs() {
            return this.isFrozen ? this.frozenEndLoadingStubs : this.endLoadingStubs;
        }
    }

    public static class Period {
        int date;
        public String formatedDate;
        int maxId;
        public int startOffset;

        public Period(TLRPC.TL_searchResultPosition tL_searchResultPosition) {
            int i = tL_searchResultPosition.date;
            this.date = i;
            this.maxId = tL_searchResultPosition.msg_id;
            this.startOffset = tL_searchResultPosition.offset;
            this.formatedDate = LocaleController.formatYearMont(i, true);
        }
    }

    public boolean hasInternet() {
        return this.profileActivity.getConnectionsManager().getConnectionState() == 3;
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider) {
        this(context, j, sharedMediaPreloader, i, arrayList, chatFull, userFull, i2, i3, baseFragment, delegate, i4, resourcesProvider, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x01e6, code lost:
    
        if (r43.stories_pinned_available != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0d3a A[EDGE_INSN: B:168:0x0d3a->B:169:0x0d3a BREAK  A[LOOP:3: B:140:0x09c9->B:164:0x0c32], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0f29  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SharedMediaLayout(final Context context, final long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, final Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        int i5;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2;
        TLRPC.ProfileTab profileTab;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        ?? r11;
        MediaPage[] mediaPageArr;
        View view;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        int i10;
        int i11;
        MediaPage mediaPage;
        RecyclerListView.Holder holder;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        this.rect = new Rect();
        this.mediaPages = new MediaPage[2];
        this.cellCache = new ArrayList(10);
        this.cache = new ArrayList(10);
        this.audioCellCache = new ArrayList(10);
        this.audioCache = new ArrayList(10);
        this.hideFloatingDateRunnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$new$1();
            }
        };
        this.actionModeViews = new ArrayList();
        this.backgroundPaint = new Paint();
        this.selectedFiles = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.allowStoriesSingleColumn = false;
        this.storiesColumnsCountSet = false;
        this.mediaColumnsCount = new int[]{3, 3};
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() { // from class: org.telegram.ui.Components.SharedMediaLayout.1
            /* JADX WARN: Removed duplicated region for block: B:33:0x014c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x022d A[SYNTHETIC] */
            @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i18, boolean z2, boolean z3) {
                SharedLinkCell sharedLinkCell;
                MessageObject message;
                ImageReceiver linkImageView;
                View pinnedHeader;
                if (messageObject != null && (SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 1 || SharedMediaLayout.this.mediaPages[0].selectedType == 3 || SharedMediaLayout.this.mediaPages[0].selectedType == 5)) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[0].listView;
                    int childCount = internalListView.getChildCount();
                    int i19 = -1;
                    int i20 = -1;
                    for (int i21 = 0; i21 < childCount; i21++) {
                        View childAt = internalListView.getChildAt(i21);
                        int measuredHeight = SharedMediaLayout.this.mediaPages[0].listView.getMeasuredHeight();
                        View view2 = (View) SharedMediaLayout.this.getParent();
                        if (view2 != null && SharedMediaLayout.this.getY() + SharedMediaLayout.this.getMeasuredHeight() > view2.getMeasuredHeight()) {
                            measuredHeight -= SharedMediaLayout.this.getBottom() - view2.getMeasuredHeight();
                        }
                        if (childAt.getTop() < measuredHeight) {
                            int childAdapterPosition = internalListView.getChildAdapterPosition(childAt);
                            if (childAdapterPosition < i19 || i19 == -1) {
                                i19 = childAdapterPosition;
                            }
                            if (childAdapterPosition > i20 || i20 == -1) {
                                i20 = childAdapterPosition;
                            }
                            int[] iArr = new int[2];
                            if (childAt instanceof SharedPhotoVideoCell2) {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                                MessageObject messageObject2 = sharedPhotoVideoCell2.getMessageObject();
                                if (messageObject2 != null) {
                                    if (messageObject2.getId() == messageObject.getId()) {
                                        linkImageView = sharedPhotoVideoCell2.imageReceiver;
                                        sharedPhotoVideoCell2.getLocationInWindow(iArr);
                                        iArr[0] = iArr[0] + Math.round(sharedPhotoVideoCell2.imageReceiver.getImageX());
                                        iArr[1] = iArr[1] + Math.round(sharedPhotoVideoCell2.imageReceiver.getImageY());
                                        if (linkImageView == null) {
                                            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                            placeProviderObject.viewX = iArr[0];
                                            placeProviderObject.viewY = iArr[1];
                                            placeProviderObject.parentView = internalListView;
                                            placeProviderObject.animatingImageView = SharedMediaLayout.this.mediaPages[0].animatingImageView;
                                            SharedMediaLayout.this.mediaPages[0].listView.getLocationInWindow(iArr);
                                            placeProviderObject.animatingImageViewYOffset = -iArr[1];
                                            placeProviderObject.imageReceiver = linkImageView;
                                            placeProviderObject.allowTakeAnimation = true;
                                            placeProviderObject.radius = linkImageView.getRoundRadius(true);
                                            placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                                            placeProviderObject.parentView.getLocationInWindow(iArr);
                                            placeProviderObject.clipTopAddition = 0;
                                            placeProviderObject.starOffset = SharedMediaLayout.this.sharedMediaData[0].startOffset;
                                            if (SharedMediaLayout.this.fragmentContextView != null && SharedMediaLayout.this.fragmentContextView.getVisibility() == 0) {
                                                placeProviderObject.clipTopAddition += AndroidUtilities.dp(36.0f);
                                            }
                                            if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = internalListView.getPinnedHeader()) != null) {
                                                int height = (SharedMediaLayout.this.fragmentContextView == null || SharedMediaLayout.this.fragmentContextView.getVisibility() != 0) ? 0 : SharedMediaLayout.this.fragmentContextView.getHeight() - AndroidUtilities.dp(2.5f);
                                                boolean z4 = childAt instanceof SharedDocumentCell;
                                                if (z4) {
                                                    height += AndroidUtilities.dp(8.0f);
                                                }
                                                int i22 = height - placeProviderObject.viewY;
                                                if (i22 > childAt.getHeight()) {
                                                    internalListView.scrollBy(0, -(i22 + pinnedHeader.getHeight()));
                                                } else {
                                                    int height2 = placeProviderObject.viewY - internalListView.getHeight();
                                                    if (z4) {
                                                        height2 -= AndroidUtilities.dp(8.0f);
                                                    }
                                                    if (height2 >= 0) {
                                                        internalListView.scrollBy(0, height2 + childAt.getHeight());
                                                    }
                                                }
                                            }
                                            return placeProviderObject;
                                        }
                                    }
                                    linkImageView = null;
                                    if (linkImageView == null) {
                                    }
                                } else {
                                    continue;
                                }
                            } else if (childAt instanceof SharedDocumentCell) {
                                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                                if (sharedDocumentCell.getMessage().getId() == messageObject.getId()) {
                                    BackupImageView imageView = sharedDocumentCell.getImageView();
                                    linkImageView = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    if (linkImageView == null) {
                                    }
                                }
                                linkImageView = null;
                                if (linkImageView == null) {
                                }
                            } else if (childAt instanceof ContextLinkCell) {
                                ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                                MessageObject messageObject3 = (MessageObject) contextLinkCell.getParentObject();
                                if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                    linkImageView = contextLinkCell.getPhotoImage();
                                    contextLinkCell.getLocationInWindow(iArr);
                                    if (linkImageView == null) {
                                    }
                                }
                                linkImageView = null;
                                if (linkImageView == null) {
                                }
                            } else {
                                if ((childAt instanceof SharedLinkCell) && (message = (sharedLinkCell = (SharedLinkCell) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = sharedLinkCell.getLinkImageView();
                                    sharedLinkCell.getLocationInWindow(iArr);
                                    if (linkImageView == null) {
                                    }
                                }
                                linkImageView = null;
                                if (linkImageView == null) {
                                }
                            }
                        }
                    }
                    if (SharedMediaLayout.this.mediaPages[0].selectedType == 0 && i19 >= 0 && i20 >= 0) {
                        int positionForIndex = SharedMediaLayout.this.photoVideoAdapter.getPositionForIndex(i18);
                        if (positionForIndex <= i19) {
                            SharedMediaLayout.this.mediaPages[0].layoutManager.scrollToPositionWithOffset(positionForIndex, 0);
                            SharedMediaLayout.this.delegate.scrollToSharedMedia();
                        } else if (positionForIndex >= i20 && i20 >= 0) {
                            SharedMediaLayout.this.mediaPages[0].layoutManager.scrollToPositionWithOffset(positionForIndex, 0, true);
                            SharedMediaLayout.this.delegate.scrollToSharedMedia();
                        }
                    }
                }
                return null;
            }
        };
        this.shiftDp = -5.0f;
        this.sharedMediaData = new SharedMediaData[9];
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.messageAlphaEnter = new SparseArray();
        this.firstTab = -1;
        this.sharedLinkCellDelegate = new 49();
        this.subTabsVisibilityFactor = 0.0f;
        this.storyAlbumsById = new HashMap();
        this.storyAlbumsByTabType = new HashMap();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (blurredBackgroundDrawableViewFactory == null) {
            blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            i5 = i4;
        } else {
            i5 = i4;
            blurredBackgroundDrawableViewFactory2 = blurredBackgroundDrawableViewFactory;
        }
        this.viewType = i5;
        this.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
        TLRPC.User user = baseFragment.getMessagesController().getUser(Long.valueOf(j));
        this.sharedMediaPreloader = sharedMediaPreloader;
        this.delegate = delegate;
        int[] lastMediaCount = sharedMediaPreloader.getLastMediaCount();
        long j2 = this.sharedMediaPreloader.topicId;
        this.topicId = j2;
        this.hasMedia = new int[]{lastMediaCount[0], lastMediaCount[1], lastMediaCount[2], lastMediaCount[3], lastMediaCount[4], lastMediaCount[5], j2 == 0 ? i : 0, lastMediaCount[7], lastMediaCount[8]};
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            profileTab = chatFull != null ? chatFull.main_tab : null;
        }
        if (i2 == 14 || i2 == 10 || i2 == 11 || i2 == 6) {
            this.initialTab = i2;
        } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
            this.initialTab = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            this.initialTab = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull != null && chatFull.stories_pinned_available) || isStoriesView()))) {
            this.initialTab = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabGifts) && ((userFull != null && userFull.stargifts_count > 0) || (chatFull != null && chatFull.stargifts_count > 0))) {
            this.initialTab = 14;
        } else if ((profileTab instanceof TLRPC.TL_profileTabFiles) && ((i17 = this.hasMedia[1]) == -1 || i17 > 0)) {
            this.initialTab = 1;
        } else if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i16 = this.hasMedia[5]) == -1 || i16 > 0)) {
            this.initialTab = 5;
        } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i15 = this.hasMedia[3]) == -1 || i15 > 0)) {
            this.initialTab = 3;
        } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i14 = this.hasMedia[4]) == -1 || i14 > 0)) {
            this.initialTab = 4;
        } else {
            if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i13 = this.hasMedia[2]) == -1 || i13 > 0)) {
                this.initialTab = 2;
            }
            if ((chatFull == null || !chatFull.stories_pinned_available) && !isStoriesView()) {
                if ((userFull != null && userFull.stargifts_count > 0) || (chatFull != null && chatFull.stargifts_count > 0)) {
                    this.initialTab = 14;
                } else if (i2 != -1 && this.topicId == 0) {
                    this.initialTab = i2;
                } else {
                    int i18 = 0;
                    while (true) {
                        int[] iArr = this.hasMedia;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        int i19 = iArr[i18];
                        if (i19 == -1 || i19 > 0) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    this.initialTab = i18;
                }
            }
            this.initialTab = getInitialTab();
        }
        onTabProgress(i2);
        this.info = chatFull;
        this.userInfo = userFull;
        if (chatFull != null) {
            this.mergeDialogId = -chatFull.migrated_from_chat_id;
        }
        this.dialog_id = j;
        int i20 = 0;
        while (true) {
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (i20 >= sharedMediaDataArr.length) {
                break;
            }
            sharedMediaDataArr[i20] = new SharedMediaData();
            this.sharedMediaData[i20].max_id[0] = DialogObject.isEncryptedDialog(this.dialog_id) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.sharedMediaData[i20].max_id[1] = Integer.MAX_VALUE;
            fillMediaData(i20);
            if (this.mergeDialogId == 0 || this.info == null) {
                i12 = 1;
            } else {
                i12 = 1;
                if (this.sharedMediaData[i20].messagesDict[1].size() == 0) {
                    SharedMediaData sharedMediaData = this.sharedMediaData[i20];
                    sharedMediaData.max_id[1] = this.info.migrated_from_max_id;
                    sharedMediaData.endReached[1] = false;
                }
            }
            i20 += i12;
        }
        this.profileActivity = baseFragment;
        this.actionBar = baseFragment.getActionBar();
        this.mediaColumnsCount[0] = overrideColumnsCount() <= 0 ? SharedConfig.mediaColumnsCount : overrideColumnsCount();
        this.mediaColumnsCount[1] = overrideColumnsCount() <= 0 ? SharedConfig.storiesColumnsCount : overrideColumnsCount();
        this.observersGroup = this.profileActivity.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        for (int i21 = 0; i21 < 10; i21++) {
            if (i2 == 4) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.2
                    @Override // org.telegram.ui.Cells.SharedAudioCell
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? SharedMediaLayout.this.sharedMediaData[4].messages : null, false);
                            return playMessage;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[4].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                        }
                        return false;
                    }
                };
                sharedAudioCell.initStreamingIcons();
                this.audioCellCache.add(sharedAudioCell);
            }
        }
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.searching = false;
        this.searchingReaction = null;
        SearchTagsList searchTagsList = this.searchTagsList;
        if (searchTagsList != null) {
            searchTagsList.show(false);
        }
        this.searchWas = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        this.pinnedHeaderShadowDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundGrayShadow), PorterDuff.Mode.MULTIPLY));
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip;
        int currentTabId = scrollSlidingTextTabStripInner != null ? scrollSlidingTextTabStripInner.getCurrentTabId() : i2;
        this.scrollSlidingTextTabStrip = createScrollingTextTabStrip(context);
        for (int i22 = 1; i22 >= 0; i22--) {
            this.selectedFiles[i22].clear();
        }
        this.cantDeleteMessagesCount = 0;
        this.actionModeViews.clear();
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        if (addActionButtons()) {
            ActionBarMenu createMenu = this.actionBar.createMenu();
            createMenu.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30) {
                    if (SharedMediaLayout.this.searchItem == null) {
                        return;
                    }
                    SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
                }
            });
            if (this.dialog_id == this.profileActivity.getUserConfig().getClientUserId() && (this.profileActivity instanceof MediaActivity) && canShowSearchItem()) {
                this.searchItemIcon = createMenu.addItem(11, R.drawable.outline_header_search);
            }
            ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, 0).setIsSearchField(true).setActionBarMenuItemSearchListener(new 4());
            this.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setTranslationY(AndroidUtilities.dp(10.0f));
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            SearchTagsList searchTagsList2 = this.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((searchTagsList2 != null && searchTagsList2.hasFilters() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
            this.searchItem.setContentDescription(LocaleController.getString("Search", R.string.Search));
            this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
        }
        ImageView imageView = new ImageView(context);
        this.photoVideoOptionsItem = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.photoVideoOptionsItem.setTranslationY(AndroidUtilities.dp(10.0f));
        this.photoVideoOptionsItem.setVisibility(4);
        if (!isArchivedOnlyStoriesView() && !isSearchingStories()) {
            this.actionBar.addView(this.photoVideoOptionsItem, LayoutHelper.createFrame(48, 56, 85));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.optionsSearchImageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.optionsSearchImageView.setAnimation(R.raw.options_to_search, 24, 24);
            this.optionsSearchImageView.getAnimatedDrawable().multiplySpeed(2.0f);
            this.optionsSearchImageView.getAnimatedDrawable().setPlayInDirectionOfCustomEndFrame(true);
            this.optionsSearchImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.optionsSearchImageView.setVisibility(8);
            this.actionBar.addView(this.optionsSearchImageView, LayoutHelper.createFrame(48, 56, 85));
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = blurredBackgroundDrawableViewFactory2;
        this.photoVideoOptionsItem.setOnClickListener(new 5(j, resourcesProvider, context));
        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
        if (actionBarMenuItem2 != null) {
            EditTextBoldCursor searchField = actionBarMenuItem2.getSearchField();
            int i23 = Theme.key_windowBackgroundWhiteBlackText;
            searchField.setTextColor(getThemedColor(i23));
            searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
            searchField.setCursorColor(getThemedColor(i23));
        }
        this.searchItemState = 0;
        BaseFragment baseFragment2 = this.profileActivity;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = (baseFragment2 == null || !(baseFragment2.getFragmentView() instanceof SizeNotifierFrameLayout)) ? null : (SizeNotifierFrameLayout) this.profileActivity.getFragmentView();
        BlurredLinearLayout blurredLinearLayout = new BlurredLinearLayout(context, sizeNotifierFrameLayout);
        this.actionModeLayout = blurredLinearLayout;
        blurredLinearLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.actionModeLayout.setAlpha(0.0f);
        this.actionModeLayout.setClickable(true);
        this.actionModeLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context);
        this.closeButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView3 = this.closeButton;
        BackDrawable backDrawable = new BackDrawable(true);
        this.backDrawable = backDrawable;
        imageView3.setImageDrawable(backDrawable);
        BackDrawable backDrawable2 = this.backDrawable;
        int i24 = Theme.key_actionBarActionModeDefaultIcon;
        backDrawable2.setColor(getThemedColor(i24));
        ImageView imageView4 = this.closeButton;
        int i25 = Theme.key_actionBarActionModeDefaultSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i25), 1));
        this.closeButton.setContentDescription(LocaleController.getString("Close", R.string.Close));
        this.actionModeLayout.addView(this.closeButton, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.actionModeViews.add(this.closeButton);
        this.closeButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SharedMediaLayout.this.lambda$new$3(view2);
            }
        });
        NumberTextView numberTextView = new NumberTextView(context);
        this.selectedMessagesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedMessagesCountTextView.setTextColor(getThemedColor(i24));
        this.actionModeLayout.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 18, 0, 0, 0));
        this.actionModeViews.add(this.selectedMessagesCountTextView);
        if (DialogObject.isEncryptedDialog(this.dialog_id)) {
            i6 = i25;
        } else {
            if (isStoriesView()) {
                i6 = i25;
            } else {
                i6 = i25;
                ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, (ActionBarMenu) null, getThemedColor(i25), getThemedColor(i24), false);
                this.gotoItem = actionBarMenuItem3;
                actionBarMenuItem3.setIcon(R.drawable.msg_message);
                this.gotoItem.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                this.gotoItem.setDuplicateParentStateEnabled(false);
                this.actionModeLayout.addView(this.gotoItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.actionModeViews.add(this.gotoItem);
                this.gotoItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SharedMediaLayout.this.lambda$new$4(view2);
                    }
                });
                ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, (ActionBarMenu) null, getThemedColor(i6), getThemedColor(i24), false);
                this.forwardItem = actionBarMenuItem4;
                actionBarMenuItem4.setIcon(R.drawable.msg_forward);
                this.forwardItem.setContentDescription(LocaleController.getString(R.string.Forward));
                this.forwardItem.setDuplicateParentStateEnabled(false);
                this.actionModeLayout.addView(this.forwardItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.actionModeViews.add(this.forwardItem);
                this.forwardItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SharedMediaLayout.this.lambda$new$5(view2);
                    }
                });
            }
            ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, (ActionBarMenu) null, getThemedColor(i6), getThemedColor(i24), false);
            this.pinItem = actionBarMenuItem5;
            actionBarMenuItem5.setIcon(R.drawable.msg_pin);
            this.pinItem.setContentDescription(LocaleController.getString(R.string.PinMessage));
            this.pinItem.setDuplicateParentStateEnabled(false);
            this.pinItem.setVisibility(8);
            this.actionModeLayout.addView(this.pinItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.actionModeViews.add(this.pinItem);
            this.pinItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SharedMediaLayout.this.lambda$new$6(view2);
                }
            });
            ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, (ActionBarMenu) null, getThemedColor(i6), getThemedColor(i24), false);
            this.unpinItem = actionBarMenuItem6;
            actionBarMenuItem6.setIcon(R.drawable.msg_unpin);
            this.unpinItem.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
            this.unpinItem.setDuplicateParentStateEnabled(false);
            this.unpinItem.setVisibility(8);
            this.actionModeLayout.addView(this.unpinItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.actionModeViews.add(this.unpinItem);
            this.unpinItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SharedMediaLayout.this.lambda$new$7(view2);
                }
            });
            updateForwardItem();
        }
        ActionBarMenuItem actionBarMenuItem7 = new ActionBarMenuItem(context, (ActionBarMenu) null, getThemedColor(i6), getThemedColor(i24), false);
        this.deleteItem = actionBarMenuItem7;
        actionBarMenuItem7.setIcon(R.drawable.msg_delete);
        this.deleteItem.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.deleteItem.setDuplicateParentStateEnabled(false);
        this.actionModeLayout.addView(this.deleteItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.actionModeViews.add(this.deleteItem);
        this.deleteItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SharedMediaLayout.this.lambda$new$8(view2);
            }
        });
        this.photoVideoAdapter = new SharedPhotoVideoAdapter(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.6
            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                if (mediaPage2 == null || mediaPage2.animationSupportingListView.getVisibility() != 0) {
                    return;
                }
                SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.notifyDataSetChanged();
            }
        };
        this.animationSupportingPhotoVideoAdapter = new SharedPhotoVideoAdapter(context);
        this.documentsAdapter = new SharedDocumentsAdapter(context, 1);
        this.voiceAdapter = new SharedDocumentsAdapter(context, 2);
        this.audioAdapter = new SharedDocumentsAdapter(context, 4);
        this.pollAdapter = new PollAdapter(context, this.profileActivity.getCurrentAccount(), this.profileActivity.getResourceProvider());
        this.gifAdapter = new GifAdapter(context);
        this.documentsSearchAdapter = new MediaSearchAdapter(context, 1);
        this.audioSearchAdapter = new MediaSearchAdapter(context, 4);
        this.linksSearchAdapter = new MediaSearchAdapter(context, 3);
        this.groupUsersSearchAdapter = new GroupUsersSearchAdapter(context);
        this.commonGroupsAdapter = new CommonGroupsAdapter(context);
        this.channelRecommendationsAdapter = new ChannelRecommendationsAdapter(context);
        this.savedDialogsAdapter = new SavedDialogsAdapter(context);
        this.savedMessagesSearchAdapter = new SavedMessagesSearchAdapter(context);
        if (!isStoriesView() && !includeSavedDialogs() && this.topicId == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 3);
            ChatActivityContainer chatActivityContainer = new ChatActivityContainer(context, this.profileActivity.getParentLayout(), bundle) { // from class: org.telegram.ui.Components.SharedMediaLayout.7
                @Override // org.telegram.ui.ChatActivityContainer
                protected void onSearchLoadingUpdate(boolean z2) {
                    if (SharedMediaLayout.this.searchItem != null) {
                        SharedMediaLayout.this.searchItem.setShowSearchProgress(z2);
                    }
                }
            };
            this.savedMessagesContainer = chatActivityContainer;
            chatActivityContainer.chatActivity.setSavedDialog(this.dialog_id);
            ChatActivityContainer chatActivityContainer2 = this.savedMessagesContainer;
            chatActivityContainer2.chatActivity.reversed = true;
            chatActivityContainer2.setClipToOutline(true);
            this.savedMessagesContainer.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.Components.SharedMediaLayout.8
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight() + AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                }
            });
        }
        ChatUsersAdapter chatUsersAdapter = new ChatUsersAdapter(context);
        this.chatUsersAdapter = chatUsersAdapter;
        if (this.topicId == 0) {
            chatUsersAdapter.sortedUsers = arrayList;
            this.chatUsersAdapter.chatInfo = currentTabId == 7 ? chatFull : null;
        }
        this.storiesAdapter = new StoriesAdapter(context, false) { // from class: org.telegram.ui.Components.SharedMediaLayout.9
            @Override // org.telegram.ui.Components.SharedMediaLayout.StoriesAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(8);
                if (mediaPage2 != null && mediaPage2.animationSupportingListView.getVisibility() == 0) {
                    SharedMediaLayout.this.animationSupportingStoriesAdapter.notifyDataSetChanged();
                }
                if (mediaPage2 != null) {
                    StickerEmptyView stickerEmptyView = mediaPage2.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                }
            }
        };
        this.storiesReorder = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout.10
            private RecyclerListView listView;

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i26) {
            }

            private StoriesAdapter getAdapter(RecyclerView recyclerView) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter instanceof StoriesAdapter) {
                    return (StoriesAdapter) adapter;
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean isLongPressDragEnabled() {
                ProfileStoriesCollectionTabs profileStoriesCollectionTabs2;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                return sharedMediaLayout.isActionModeShowed || ((profileStoriesCollectionTabs2 = sharedMediaLayout.storiesContainer) != null && profileStoriesCollectionTabs2.isReordering());
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                StoriesAdapter adapter = getAdapter(recyclerView);
                if (isLongPressDragEnabled() && adapter != null && adapter.canReorder(viewHolder.getAdapterPosition())) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[0] == null ? null : SharedMediaLayout.this.mediaPages[0].listView;
                    this.listView = internalListView;
                    if (internalListView != null) {
                        internalListView.setItemAnimator(SharedMediaLayout.this.mediaPages[0].itemAnimator);
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                StoriesAdapter adapter = getAdapter(recyclerView);
                if (adapter == null || !adapter.canReorder(viewHolder.getAdapterPosition()) || !adapter.canReorder(viewHolder2.getAdapterPosition())) {
                    return false;
                }
                adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i26) {
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView != null && viewHolder != null) {
                    recyclerListView.hideSelector(false);
                }
                if (i26 == 0) {
                    RecyclerListView recyclerListView2 = this.listView;
                    if (recyclerListView2 != null && (recyclerListView2.getAdapter() instanceof StoriesAdapter)) {
                        ((StoriesAdapter) this.listView.getAdapter()).reorderDone();
                    }
                    RecyclerListView recyclerListView3 = this.listView;
                    if (recyclerListView3 != null) {
                        recyclerListView3.setItemAnimator(null);
                    }
                } else {
                    RecyclerListView recyclerListView4 = this.listView;
                    if (recyclerListView4 != null) {
                        recyclerListView4.cancelClickRunnables(false);
                    }
                    if (viewHolder != null) {
                        viewHolder.itemView.setPressed(true);
                    }
                }
                super.onSelectedChanged(viewHolder, i26);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }
        });
        this.animationSupportingStoriesAdapter = new StoriesAdapter(this, context, false);
        this.archivedStoriesAdapter = new StoriesAdapter(context, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.11
            @Override // org.telegram.ui.Components.SharedMediaLayout.StoriesAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(9);
                if (mediaPage2 != null && mediaPage2.animationSupportingListView.getVisibility() == 0) {
                    SharedMediaLayout.this.animationSupportingArchivedStoriesAdapter.notifyDataSetChanged();
                }
                if (mediaPage2 != null) {
                    StickerEmptyView stickerEmptyView = mediaPage2.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                }
            }
        };
        this.animationSupportingArchivedStoriesAdapter = new StoriesAdapter(this, context, true);
        this.linksAdapter = new SharedLinksAdapter(context);
        if (isBot()) {
            this.botPreviewsContainer = new 12(context, this.profileActivity, this.dialog_id);
        } else if (this.profileActivity instanceof ProfileActivity) {
            TextView textView = new TextView(context);
            this.saveItem = textView;
            textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
            this.saveItem.setTypeface(AndroidUtilities.bold());
            TextView textView2 = this.saveItem;
            int i26 = Theme.key_featuredStickers_addButton;
            textView2.setTextColor(getThemedColor(i26));
            this.saveItem.setTextSize(1, 15.0f);
            this.saveItem.setGravity(17);
            this.saveItem.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(getThemedColor(i26), 0.15f), 3));
            this.saveItem.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
            this.actionBar.addView(this.saveItem, LayoutHelper.createFrame(-2, 56, 85));
            this.saveItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SharedMediaLayout.this.lambda$new$9(view2);
                }
            });
            this.saveItem.setVisibility(8);
            this.saveItem.setAlpha(0.0f);
            this.saveItem.setScaleX(0.4f);
            this.saveItem.setScaleY(0.4f);
            BaseFragment baseFragment3 = this.profileActivity;
            z = false;
            13 r13 = new 13(baseFragment3, context, baseFragment3.getCurrentAccount(), ((ProfileActivity) this.profileActivity).getDialogId(), resourcesProvider);
            this.giftsContainer = r13;
            int dp = AndroidUtilities.dp(48.0f);
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
            r13.setPaddingTop(dp + (dialogsActivityTopPanelLayout != null ? (int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(0.0f) : 0));
            this.storiesContainer = new 15(context, sizeNotifierFrameLayout, getStoriesController().getStoryAlbumsList(this.dialog_id), new 14(context, baseFragment, resourcesProvider));
            setWillNotDraw(z);
            i7 = 0;
            i8 = -1;
            i9 = 0;
            r11 = z;
            while (true) {
                mediaPageArr = this.mediaPages;
                if (i9 < mediaPageArr.length) {
                    break;
                }
                if (i9 != 0 || (mediaPage = mediaPageArr[i9]) == null || mediaPage.layoutManager == null) {
                    i10 = i7;
                    i11 = i8;
                } else {
                    int findFirstVisibleItemPosition = this.mediaPages[i9].layoutManager.findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition == this.mediaPages[i9].layoutManager.getItemCount() - 1 || (holder = (RecyclerListView.Holder) this.mediaPages[i9].listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) == null) {
                        i10 = i7;
                        i11 = -1;
                    } else {
                        i10 = holder.itemView.getTop();
                        i11 = findFirstVisibleItemPosition;
                    }
                }
                final MediaPage mediaPage2 = new MediaPage(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.16
                    @Override // android.view.View
                    public void setTranslationX(float f) {
                        super.setTranslationX(f);
                        if (SharedMediaLayout.this.tabsAnimationInProgress) {
                            if (SharedMediaLayout.this.mediaPages[0] == this) {
                                float abs = Math.abs(SharedMediaLayout.this.mediaPages[0].getTranslationX()) / SharedMediaLayout.this.mediaPages[0].getMeasuredWidth();
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.selectTabWithId(sharedMediaLayout.mediaPages[1].selectedType, abs);
                                if (SharedMediaLayout.this.canShowSearchItem()) {
                                    if (SharedMediaLayout.this.searchItemState == 2) {
                                        SharedMediaLayout.this.searchAlpha = 1.0f - abs;
                                    } else if (SharedMediaLayout.this.searchItemState == 1) {
                                        SharedMediaLayout.this.searchAlpha = abs;
                                    }
                                    SharedMediaLayout.this.updateSearchItemIcon(abs);
                                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                    sharedMediaLayout2.optionsAlpha = sharedMediaLayout2.getPhotoVideoOptionsAlpha(abs);
                                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                    sharedMediaLayout3.photoVideoOptionsItem.setVisibility((sharedMediaLayout3.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                                } else {
                                    SharedMediaLayout.this.searchAlpha = 0.0f;
                                }
                                SharedMediaLayout.this.updateOptionsSearch();
                            }
                        }
                        SharedMediaLayout.this.checkStoriesTabsPosition();
                        SharedMediaLayout.this.checkUi_topPanelLayoutY();
                        SharedMediaLayout.this.invalidateBlur();
                    }
                };
                addView(mediaPage2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, mediaPageTopMargin(), 0.0f, 0.0f));
                if (i9 == 1) {
                    mediaPage2.setTranslationX(AndroidUtilities.displaySize.x);
                }
                this.mediaPages[i9] = mediaPage2;
                final ExtendedGridLayoutManager extendedGridLayoutManager = mediaPage2.layoutManager = new ExtendedGridLayoutManager(context, 100) { // from class: org.telegram.ui.Components.SharedMediaLayout.17
                    private Size size = new Size();

                    @Override // org.telegram.ui.Components.ExtendedGridLayoutManager, androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }

                    @Override // androidx.recyclerview.widget.LinearLayoutManager
                    protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr2) {
                        super.calculateExtraLayoutSpace(state, iArr2);
                        int i27 = mediaPage2.selectedType;
                        if (i27 == 0 || SharedMediaLayout.isAnyStoryPageType(i27)) {
                            iArr2[1] = Math.max(iArr2[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                        } else if (mediaPage2.selectedType == 1) {
                            iArr2[1] = Math.max(iArr2[1], AndroidUtilities.dp(56.0f) * 2);
                        }
                    }

                    @Override // org.telegram.ui.Components.ExtendedGridLayoutManager
                    protected Size getSizeForItem(int i27) {
                        int i28;
                        int i29;
                        TLRPC.Document document = (mediaPage2.listView.getAdapter() != SharedMediaLayout.this.gifAdapter || SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? null : ((MessageObject) SharedMediaLayout.this.sharedMediaData[5].messages.get(i27)).getDocument();
                        Size size = this.size;
                        size.height = 100.0f;
                        size.width = 100.0f;
                        if (document != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            if (closestPhotoSizeWithSize != null && (i28 = closestPhotoSizeWithSize.w) != 0 && (i29 = closestPhotoSizeWithSize.h) != 0) {
                                Size size2 = this.size;
                                size2.width = i28;
                                size2.height = i29;
                            }
                            ArrayList<TLRPC.DocumentAttribute> arrayList2 = document.attributes;
                            for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                                TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i30);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                    Size size3 = this.size;
                                    size3.width = documentAttribute.w;
                                    size3.height = documentAttribute.h;
                                    break;
                                }
                            }
                        }
                        return this.size;
                    }

                    @Override // org.telegram.ui.Components.ExtendedGridLayoutManager
                    protected int getFlowItemCount() {
                        if (mediaPage2.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                            return 0;
                        }
                        return getItemCount();
                    }

                    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view2, accessibilityNodeInfoCompat);
                        AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfo = accessibilityNodeInfoCompat.getCollectionItemInfo();
                        if (collectionItemInfo == null || !collectionItemInfo.isHeading()) {
                            return;
                        }
                        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false));
                    }
                };
                extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.Components.SharedMediaLayout.18
                    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                    public int getSpanSize(int i27) {
                        int i28 = SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage2.selectedType) ? 1 : 0];
                        if (mediaPage2.listView.getAdapter() == SharedMediaLayout.this.photoVideoAdapter) {
                            if (SharedMediaLayout.this.photoVideoAdapter.getItemViewType(i27) == 2) {
                                return i28;
                            }
                            return 1;
                        }
                        if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(mediaPage2.listView.getAdapter()) == -1) {
                            if (mediaPage2.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                                return mediaPage2.layoutManager.getSpanCount();
                            }
                            return (mediaPage2.listView.getAdapter() == SharedMediaLayout.this.gifAdapter && SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? mediaPage2.layoutManager.getSpanCount() : mediaPage2.layoutManager.getSpanSizeForItem(i27);
                        }
                        if (mediaPage2.listView.getAdapter().getItemViewType(i27) == 2) {
                            return i28;
                        }
                        return 1;
                    }
                });
                this.mediaPages[i9].itemAnimator = new DefaultItemAnimator();
                this.mediaPages[i9].itemAnimator.setDurations(280L);
                this.mediaPages[i9].itemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.mediaPages[i9].itemAnimator.setSupportsChangeAnimations(r11);
                this.mediaPages[i9].listView = new SharedMediaListView(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.19
                    float lastY;
                    float startY;

                    @Override // org.telegram.ui.Components.RecyclerListView
                    protected void emptyViewUpdated(boolean z2, boolean z3) {
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public RecyclerListView.FastScrollAdapter getMovingAdapter() {
                        if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                            return SharedMediaLayout.this.photoVideoAdapter;
                        }
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        return sharedMediaLayout.storyAlbums_getStoriesAdapterByTabType(sharedMediaLayout.changeColumnsTab);
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
                        if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                            return SharedMediaLayout.this.animationSupportingPhotoVideoAdapter;
                        }
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        return sharedMediaLayout.storyAlbums_getStoriesSupportingAdapterByTabType(sharedMediaLayout.changeColumnsTab);
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public int getColumnsCount() {
                        return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab) ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public int getAnimateToColumnsCount() {
                        return SharedMediaLayout.this.animateToColumnsCount;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public boolean isChangeColumnsAnimation() {
                        return SharedMediaLayout.this.photoVideoChangeColumnsAnimation;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public float getChangeColumnsProgress() {
                        return SharedMediaLayout.this.photoVideoChangeColumnsProgress;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public boolean isThisListView() {
                        return this == mediaPage2.listView;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public SparseArray getMessageAlphaEnter() {
                        return SharedMediaLayout.this.messageAlphaEnter;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public boolean isStories() {
                        return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab);
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public InternalListView getSupportingListView() {
                        return mediaPage2.animationSupportingListView;
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView
                    public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
                        if (sharedPhotoVideoCell2.getMessageId() == mediaPage2.highlightMessageId && sharedPhotoVideoCell2.imageReceiver.hasBitmapImage()) {
                            MediaPage mediaPage3 = mediaPage2;
                            if (!mediaPage3.highlightAnimation) {
                                mediaPage3.highlightProgress = 0.0f;
                                mediaPage3.highlightAnimation = true;
                            }
                            float f = mediaPage3.highlightProgress;
                            sharedPhotoVideoCell2.setHighlightProgress(f < 0.3f ? f / 0.3f : f > 0.7f ? (1.0f - f) / 0.3f : 1.0f);
                            return;
                        }
                        sharedPhotoVideoCell2.setHighlightProgress(0.0f);
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
                    protected void onLayout(boolean z2, int i27, int i28, int i29, int i30) {
                        super.onLayout(z2, i27, i28, i29, i30);
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        MediaPage mediaPage3 = mediaPage2;
                        sharedMediaLayout.checkLoadMoreScroll(mediaPage3, mediaPage3.listView, extendedGridLayoutManager);
                        if (mediaPage2.selectedType == 0) {
                            PhotoViewer.getInstance().checkCurrentImageVisibility();
                        }
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        if (SharedMediaLayout.this.profileActivity != null && SharedMediaLayout.this.profileActivity.isInPreviewMode()) {
                            this.lastY = motionEvent.getY();
                            if (motionEvent.getAction() == 1) {
                                SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                            } else if (motionEvent.getAction() == 2) {
                                float f = this.startY - this.lastY;
                                SharedMediaLayout.this.profileActivity.movePreviewFragment(f);
                                if (f < 0.0f) {
                                    this.startY = this.lastY;
                                }
                            }
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }

                    @Override // org.telegram.ui.Components.SharedMediaLayout.SharedMediaListView, org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                    protected void dispatchDraw(Canvas canvas) {
                        View childAt;
                        View childAt2;
                        if ((getAdapter() == SharedMediaLayout.this.archivedStoriesAdapter || getAdapter() == SharedMediaLayout.this.storiesAdapter) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && getChildAdapterPosition(childAt) == 0) {
                            int top = childAt.getTop();
                            if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                                if (SharedMediaLayout.this.changeColumnsTab == (getAdapter() == SharedMediaLayout.this.storiesAdapter ? 8 : 9) && mediaPage2.animationSupportingListView.getChildCount() > 0 && (childAt2 = mediaPage2.animationSupportingListView.getChildAt(0)) != null && mediaPage2.animationSupportingListView.getChildAdapterPosition(childAt2) == 0) {
                                    top = AndroidUtilities.lerp(top, childAt2.getTop(), SharedMediaLayout.this.photoVideoChangeColumnsProgress);
                                }
                            }
                            if (getAdapter() != SharedMediaLayout.this.storiesAdapter) {
                                if (this.archivedHintPaint == null) {
                                    TextPaint textPaint = new TextPaint(1);
                                    this.archivedHintPaint = textPaint;
                                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                                    this.archivedHintPaint.setColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
                                }
                                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                                StaticLayout staticLayout = this.archivedHintLayout;
                                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                                    this.archivedHintLayout = new StaticLayout(LocaleController.getString(SharedMediaLayout.this.isArchivedOnlyStoriesView() ? SharedMediaLayout.this.profileActivity != null && ChatObject.isChannelAndNotMegaGroup(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.archivedHintPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    this.archivedHintLayoutWidth = 0.0f;
                                    this.archivedHintLayoutLeft = measuredWidth;
                                    for (int i27 = 0; i27 < this.archivedHintLayout.getLineCount(); i27++) {
                                        this.archivedHintLayoutWidth = Math.max(this.archivedHintLayoutWidth, this.archivedHintLayout.getLineWidth(i27));
                                        this.archivedHintLayoutLeft = Math.min(this.archivedHintLayoutLeft, this.archivedHintLayout.getLineLeft(i27));
                                    }
                                }
                                canvas.save();
                                canvas.translate(((getWidth() - this.archivedHintLayoutWidth) / 2.0f) - this.archivedHintLayoutLeft, top - ((AndroidUtilities.dp(64.0f) + this.archivedHintLayout.getHeight()) / 2.0f));
                                this.archivedHintLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        super.dispatchDraw(canvas);
                        MediaPage mediaPage3 = mediaPage2;
                        if (mediaPage3.highlightAnimation) {
                            float f = mediaPage3.highlightProgress + 0.010666667f;
                            mediaPage3.highlightProgress = f;
                            if (f >= 1.0f) {
                                mediaPage3.highlightProgress = 0.0f;
                                mediaPage3.highlightAnimation = false;
                                mediaPage3.highlightMessageId = 0;
                            }
                            invalidate();
                        }
                        if (this.poller == null) {
                            this.poller = UserListPoller.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount());
                        }
                        this.poller.checkList(this);
                        if (isChangeColumnsAnimation()) {
                            return;
                        }
                        SharedMediaLayout.this.changeColumnsTab = -1;
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView
                    public Integer getSelectorColor(int i27) {
                        if (getAdapter() == SharedMediaLayout.this.channelRecommendationsAdapter && SharedMediaLayout.this.channelRecommendationsAdapter.more > 0 && i27 == SharedMediaLayout.this.channelRecommendationsAdapter.getItemCount() - 1) {
                            return 0;
                        }
                        return super.getSelectorColor(i27);
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView
                    public void onScrolled(int i27, int i28) {
                        super.onScrolled(i27, i28);
                        if (this.scrollingByUser && SharedMediaLayout.this.getSelectedTab() == 11 && SharedMediaLayout.this.profileActivity != null) {
                            AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                        }
                        SharedMediaLayout.this.checkStoriesTabsPosition();
                        if (getAdapter() == SharedMediaLayout.this.pollAdapter) {
                            SharedMediaLayout.this.pollAdapter.onScrolled(this);
                        }
                    }

                    @Override // android.view.View
                    public boolean performAccessibilityAction(int i27, Bundle bundle2) {
                        View findOuterScrollingAncestor;
                        try {
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        if (i27 == 4096) {
                            View findOuterScrollingAncestor2 = findOuterScrollingAncestor();
                            if (findOuterScrollingAncestor2 != null && findOuterScrollingAncestor2.canScrollVertically(1) && findOuterScrollingAncestor2.performAccessibilityAction(i27, bundle2)) {
                                return true;
                            }
                        } else {
                            if (i27 == 8192) {
                                if (!canScrollVertically(-1) && (findOuterScrollingAncestor = findOuterScrollingAncestor()) != null && findOuterScrollingAncestor.canScrollVertically(-1) && findOuterScrollingAncestor.performAccessibilityAction(i27, bundle2)) {
                                    return true;
                                }
                            }
                            return super.performAccessibilityAction(i27, bundle2);
                        }
                        return super.performAccessibilityAction(i27, bundle2);
                    }

                    private View findOuterScrollingAncestor() {
                        try {
                            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                                if (parent != this && (parent instanceof RecyclerView)) {
                                    return (View) parent;
                                }
                            }
                            return null;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return null;
                        }
                    }
                };
                this.mediaPages[i9].listView.setFastScrollEnabled(1);
                this.mediaPages[i9].listView.setScrollingTouchSlop(1);
                this.mediaPages[i9].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                this.mediaPages[i9].listView.setPadding(r11, AndroidUtilities.dp(54.0f), r11, r11);
                this.mediaPages[i9].listView.setItemAnimator(null);
                this.mediaPages[i9].listView.setClipToPadding(r11);
                this.mediaPages[i9].listView.setSectionsType(2);
                this.mediaPages[i9].listView.setLayoutManager(extendedGridLayoutManager);
                MediaPage mediaPage3 = this.mediaPages[i9];
                mediaPage3.addView(mediaPage3.listView, LayoutHelper.createFrame(-1, -1.0f));
                this.mediaPages[i9].animationSupportingListView = new InternalListView(context);
                this.mediaPages[i9].animationSupportingListView.setLayoutManager(this.mediaPages[i9].animationSupportingLayoutManager = new GridLayoutManager(context, 3) { // from class: org.telegram.ui.Components.SharedMediaLayout.20
                    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }

                    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public int scrollVerticallyBy(int i27, RecyclerView.Recycler recycler, RecyclerView.State state) {
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                            i27 = 0;
                        }
                        return super.scrollVerticallyBy(i27, recycler, state);
                    }
                });
                MediaPage mediaPage4 = this.mediaPages[i9];
                mediaPage4.addView(mediaPage4.animationSupportingListView, LayoutHelper.createFrame(-1, -1.0f));
                this.mediaPages[i9].animationSupportingListView.setVisibility(8);
                this.mediaPages[i9].animationSupportingListView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.SharedMediaLayout.21
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                        if (view2 instanceof SharedPhotoVideoCell2) {
                            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view2;
                            int childAdapterPosition = mediaPage2.animationSupportingListView.getChildAdapterPosition(sharedPhotoVideoCell2);
                            int spanCount = mediaPage2.animationSupportingLayoutManager.getSpanCount();
                            sharedPhotoVideoCell2.isTop = childAdapterPosition < spanCount;
                            int i27 = childAdapterPosition % spanCount;
                            sharedPhotoVideoCell2.isFirst = i27 == 0;
                            sharedPhotoVideoCell2.isLast = i27 == spanCount - 1;
                            rect.left = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            rect.right = 0;
                            return;
                        }
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                this.mediaPages[i9].listView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.SharedMediaLayout.22
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                        if (mediaPage2.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                            rect.left = 0;
                            rect.bottom = 0;
                            if (!mediaPage2.layoutManager.isFirstRow(childAdapterPosition)) {
                                rect.top = AndroidUtilities.dp(2.0f);
                            } else {
                                rect.top = 0;
                            }
                            rect.right = mediaPage2.layoutManager.isLastInRow(childAdapterPosition) ? 0 : AndroidUtilities.dp(2.0f);
                            return;
                        }
                        if (view2 instanceof SharedPhotoVideoCell2) {
                            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view2;
                            int childAdapterPosition2 = mediaPage2.listView.getChildAdapterPosition(sharedPhotoVideoCell2);
                            int spanCount = mediaPage2.layoutManager.getSpanCount();
                            sharedPhotoVideoCell2.isTop = childAdapterPosition2 < spanCount;
                            int i27 = childAdapterPosition2 % spanCount;
                            sharedPhotoVideoCell2.isFirst = i27 == 0;
                            sharedPhotoVideoCell2.isLast = i27 == spanCount - 1;
                            rect.left = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            rect.right = 0;
                            return;
                        }
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory4 = blurredBackgroundDrawableViewFactory3;
                this.mediaPages[i9].listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda21
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                    public /* synthetic */ boolean hasDoubleTap(View view2, int i27) {
                        return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view2, i27);
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                    public /* synthetic */ void onDoubleTap(View view2, int i27, float f, float f2) {
                        RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view2, i27, f, f2);
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                    public final void onItemClick(View view2, int i27, float f, float f2) {
                        SharedMediaLayout.this.lambda$new$28(mediaPage2, context, j, resourcesProvider, view2, i27, f, f2);
                    }
                });
                this.mediaPages[i9].listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.24
                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i27) {
                        SharedMediaLayout.this.scrolling = i27 != 0;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i27, int i28) {
                        int i29;
                        SharedMediaLayout.this.checkLoadMoreScroll(mediaPage2, (RecyclerListView) recyclerView, extendedGridLayoutManager);
                        if (i28 != 0 && ((SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 5) && !SharedMediaLayout.this.sharedMediaData[0].messages.isEmpty())) {
                            SharedMediaLayout.this.showFloatingDateView();
                        }
                        if (i28 != 0 && ((i29 = mediaPage2.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i29))) {
                            SharedMediaLayout.showFastScrollHint(mediaPage2, SharedMediaLayout.this.sharedMediaData, true);
                        }
                        mediaPage2.listView.checkSection(true);
                        MediaPage mediaPage5 = mediaPage2;
                        if (mediaPage5.fastScrollHintView != null) {
                            mediaPage5.invalidate();
                        }
                        SharedMediaLayout.this.invalidateBlur();
                    }
                });
                this.mediaPages[i9].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() { // from class: org.telegram.ui.Components.SharedMediaLayout.25
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
                    public boolean onItemClick(View view2, int i27, float f, float f2) {
                        int i28;
                        int i29 = 0;
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation || mediaPage2.listView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                            return false;
                        }
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            MediaPage mediaPage5 = mediaPage2;
                            if (mediaPage5.selectedType != 11) {
                                mediaPage5.listView.clickItem(view2, i27);
                                return true;
                            }
                        }
                        int i30 = mediaPage2.selectedType;
                        if (i30 != 7 || !(view2 instanceof UserCell)) {
                            if (i30 == 1 && (view2 instanceof SharedDocumentCell)) {
                                return sharedMediaLayout.onItemLongClick(((SharedDocumentCell) view2).getMessage(), view2, 0);
                            }
                            if (i30 == 3 && (view2 instanceof SharedLinkCell)) {
                                return sharedMediaLayout.onItemLongClick(((SharedLinkCell) view2).getMessage(), view2, 0);
                            }
                            if ((i30 == 2 || i30 == 4) && (view2 instanceof SharedAudioCell)) {
                                return sharedMediaLayout.onItemLongClick(((SharedAudioCell) view2).getMessage(), view2, 0);
                            }
                            if (i30 == 5 && (view2 instanceof ContextLinkCell)) {
                                return sharedMediaLayout.onItemLongClick((MessageObject) ((ContextLinkCell) view2).getParentObject(), view2, 0);
                            }
                            if ((i30 == 0 || (SharedMediaLayout.isAnyStoryPageType(i30) && SharedMediaLayout.this.canEditStories())) && (view2 instanceof SharedPhotoVideoCell2)) {
                                MessageObject messageObject = ((SharedPhotoVideoCell2) view2).getMessageObject();
                                if (messageObject != null) {
                                    return SharedMediaLayout.this.onItemLongClick(messageObject, view2, mediaPage2.selectedType);
                                }
                            } else {
                                int i31 = mediaPage2.selectedType;
                                if (i31 == 10) {
                                    SharedMediaLayout.this.channelRecommendationsAdapter.openPreview(i27);
                                    return true;
                                }
                                if (i31 == 11) {
                                    SharedMediaLayout.this.savedDialogsAdapter.select(view2);
                                    return true;
                                }
                            }
                            return false;
                        }
                        if (sharedMediaLayout.chatUsersAdapter.sortedUsers.isEmpty()) {
                            i28 = i27;
                        } else {
                            if (i27 >= SharedMediaLayout.this.chatUsersAdapter.sortedUsers.size()) {
                                return false;
                            }
                            i28 = ((Integer) SharedMediaLayout.this.chatUsersAdapter.sortedUsers.get(i27)).intValue();
                        }
                        if (i28 < 0 || i28 >= SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                            return false;
                        }
                        TLRPC.ChatParticipant chatParticipant = SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.get(i28);
                        RecyclerListView recyclerListView = (RecyclerListView) view2.getParent();
                        while (true) {
                            if (i29 >= recyclerListView.getChildCount()) {
                                break;
                            }
                            View childAt = recyclerListView.getChildAt(i29);
                            if (recyclerListView.getChildAdapterPosition(childAt) == i27) {
                                view2 = childAt;
                                break;
                            }
                            i29++;
                        }
                        return SharedMediaLayout.this.onMemberClick(chatParticipant, true, view2);
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
                    public void onMove(float f, float f2) {
                        if (SharedMediaLayout.this.profileActivity != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                SharedMediaLayout.this.profileActivity.movePreviewFragment(f2);
                            }
                        }
                    }

                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListenerExtended
                    public void onLongClickRelease() {
                        if (SharedMediaLayout.this.profileActivity != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                            }
                        }
                    }
                });
                if (i9 == 0 && i11 != -1) {
                    extendedGridLayoutManager.scrollToPositionWithOffset(i11, i10);
                }
                final InternalListView internalListView = this.mediaPages[i9].listView;
                this.mediaPages[i9].animatingImageView = new ClippingImageView(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.26
                    @Override // android.view.View
                    public void invalidate() {
                        super.invalidate();
                        internalListView.invalidate();
                    }
                };
                this.mediaPages[i9].animatingImageView.setVisibility(8);
                this.mediaPages[i9].listView.addOverlayView(this.mediaPages[i9].animatingImageView, LayoutHelper.createFrame(-1, -1.0f));
                this.mediaPages[i9].progressView = new FlickerLoadingView(context) { // from class: org.telegram.ui.Components.SharedMediaLayout.27
                    @Override // org.telegram.ui.Components.FlickerLoadingView
                    public int getColumnsCount() {
                        return SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage2.selectedType) ? 1 : 0];
                    }

                    @Override // org.telegram.ui.Components.FlickerLoadingView
                    public int getViewType() {
                        setIsSingleCell(false);
                        int i27 = mediaPage2.selectedType;
                        if (i27 == 0 || i27 == 5) {
                            return 2;
                        }
                        if (i27 == 1) {
                            return 3;
                        }
                        if (i27 == 2 || i27 == 4) {
                            return 6;
                        }
                        if (i27 == 3) {
                            return 5;
                        }
                        if (i27 == 7) {
                            return 6;
                        }
                        if (i27 != 6) {
                            return SharedMediaLayout.isAnyStoryPageType(i27) ? 27 : 1;
                        }
                        if (SharedMediaLayout.this.scrollSlidingTextTabStrip.getTabsCount() == 1) {
                            setIsSingleCell(true);
                        }
                        return 1;
                    }

                    @Override // org.telegram.ui.Components.FlickerLoadingView, android.view.View
                    protected void onDraw(Canvas canvas) {
                        SharedMediaLayout.this.backgroundPaint.setColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedMediaLayout.this.backgroundPaint);
                        super.onDraw(canvas);
                    }
                };
                this.mediaPages[i9].progressView.showDate(false);
                this.mediaPages[i9].progressView.setClipToOutline(true);
                this.mediaPages[i9].progressView.setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.Components.SharedMediaLayout.28
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view2, Outline outline) {
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), AndroidUtilities.dp(16.0f));
                    }
                });
                if (i9 != 0) {
                    this.mediaPages[i9].setVisibility(8);
                }
                MediaPage mediaPage5 = this.mediaPages[i9];
                mediaPage5.emptyView = new StickerEmptyView(context, mediaPage5.progressView, 1) { // from class: org.telegram.ui.Components.SharedMediaLayout.29
                    @Override // org.telegram.ui.Components.StickerEmptyView
                    protected void onVisibilityChange(float f) {
                        super.onVisibilityChange(f);
                        SharedMediaLayout.this.onBottomButtonVisibilityChange();
                    }
                };
                this.mediaPages[i9].emptyView.setVisibility(8, false);
                this.mediaPages[i9].emptyView.setAnimateLayoutChange(true);
                MediaPage mediaPage6 = this.mediaPages[i9];
                mediaPage6.addView(mediaPage6.emptyView, LayoutHelper.createFrame(-1, -1.0f));
                this.mediaPages[i9].emptyView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda22
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean lambda$new$29;
                        lambda$new$29 = SharedMediaLayout.lambda$new$29(view2, motionEvent);
                        return lambda$new$29;
                    }
                });
                this.mediaPages[i9].emptyView.showProgress(true, false);
                this.mediaPages[i9].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                this.mediaPages[i9].emptyView.button.setVisibility(8);
                this.mediaPages[i9].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                this.mediaPages[i9].emptyView.button.setVisibility(8);
                this.mediaPages[i9].emptyView.addView(this.mediaPages[i9].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                this.mediaPages[i9].listView.setEmptyView(this.mediaPages[i9].emptyView);
                this.mediaPages[i9].listView.setAnimateEmptyView(true, 0);
                MediaPage mediaPage7 = this.mediaPages[i9];
                mediaPage7.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage7.listView, this.mediaPages[i9].layoutManager);
                i9++;
                i7 = i10;
                i8 = i11;
                blurredBackgroundDrawableViewFactory3 = blurredBackgroundDrawableViewFactory4;
                r11 = 0;
            }
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory5 = blurredBackgroundDrawableViewFactory3;
            view = this.storiesContainer;
            if (view != null) {
                addView(view, LayoutHelper.createFrame(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
            }
            ChatActionCell chatActionCell = new ChatActionCell(context);
            this.floatingDateView = chatActionCell;
            chatActionCell.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
            this.floatingDateView.setAlpha(0.0f);
            this.floatingDateView.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
            this.floatingDateView.setTranslationY(-AndroidUtilities.dp(48.0f));
            addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
            if (!customTabs()) {
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout2 = new DialogsActivityTopPanelLayout(context);
                this.topPanelLayout = dialogsActivityTopPanelLayout2;
                dialogsActivityTopPanelLayout2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                BlurredBackgroundDrawable create = blurredBackgroundDrawableViewFactory5.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                create.setRadius(AndroidUtilities.dp(24.0f));
                create.setPadding(AndroidUtilities.dp(7.0f));
                this.topPanelLayout.setBlurredBackground(create);
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentContextViewWrapper = frameLayout;
                this.topPanelLayout.addView(frameLayout);
                this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
                this.topPanelLayout.setOnAnimatedHeightChangedListener(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.this.lambda$new$31();
                    }
                });
                FragmentContextView fragmentContextView = new FragmentContextView(context, baseFragment, this, false, resourcesProvider) { // from class: org.telegram.ui.Components.SharedMediaLayout.30
                    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
                    public void setVisibility(int i27) {
                        SharedMediaLayout.this.topPanelLayout.setViewVisible(SharedMediaLayout.this.fragmentContextViewWrapper, i27 == 0);
                    }
                };
                this.fragmentContextView = fragmentContextView;
                fragmentContextView.isInsideBubble = true;
                this.fragmentContextViewWrapper.addView(fragmentContextView);
                addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                this.fragmentContextView.setDelegate(new FragmentContextView.FragmentContextViewDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda12
                    @Override // org.telegram.ui.Components.FragmentContextView.FragmentContextViewDelegate
                    public final void onAnimation(boolean z2, boolean z3) {
                        SharedMediaLayout.this.lambda$new$32(z2, z3);
                    }
                });
                BlurredBackgroundDrawable create2 = blurredBackgroundDrawableViewFactory5.create(this.scrollSlidingTextTabStrip, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                create2.setRadius(AndroidUtilities.dp(18.0f));
                create2.setPadding(AndroidUtilities.dp(6.666f));
                this.scrollSlidingTextTabStrip.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                this.scrollSlidingTextTabStrip.setClipToPadding(false);
                this.scrollSlidingTextTabStrip.setBackground(null);
                this.scrollSlidingTextTabStrip.setBlurredBackground(create2);
                this.scrollSlidingTextTabStrip.setOpen(false);
                addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                Context context2 = getContext();
                BaseFragment baseFragment4 = this.profileActivity;
                SearchTagsList searchTagsList3 = new SearchTagsList(context2, baseFragment4, null, baseFragment4.getCurrentAccount(), includeSavedDialogs() ? 0L : this.dialog_id, resourcesProvider, false) { // from class: org.telegram.ui.Components.SharedMediaLayout.31
                    @Override // org.telegram.ui.Components.SearchTagsList
                    protected boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                        if (SharedMediaLayout.this.searchItem == null) {
                            return false;
                        }
                        SharedMediaLayout.this.searchingReaction = visibleReaction;
                        String obj = SharedMediaLayout.this.searchItem.getSearchField().getText().toString();
                        SharedMediaLayout.this.searchWas = (obj.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                        if (SharedMediaLayout.this.mediaPages[0].selectedType == 11) {
                            if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                                SharedMediaLayout.this.savedMessagesSearchAdapter.search(obj, SharedMediaLayout.this.searchingReaction);
                            }
                            AndroidUtilities.hideKeyboard(SharedMediaLayout.this.searchItem.getSearchField());
                        } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 12 && SharedMediaLayout.this.savedMessagesContainer != null) {
                            SharedMediaLayout.this.savedMessagesContainer.chatActivity.setTagFilter(visibleReaction);
                        }
                        return true;
                    }

                    @Override // org.telegram.ui.Components.SearchTagsList
                    protected void onShownUpdate(boolean z2) {
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setAlpha(1.0f - this.shownT);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setPivotX(r5.getWidth() / 2.0f);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleX(((1.0f - this.shownT) * 0.2f) + 0.8f);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setPivotY(AndroidUtilities.dp(48.0f));
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleY(((1.0f - this.shownT) * 0.2f) + 0.8f);
                    }

                    @Override // org.telegram.ui.Components.SearchTagsList
                    public void updateTags(boolean z2) {
                        super.updateTags(z2);
                        show(SharedMediaLayout.this.searching && (SharedMediaLayout.this.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
                        ActionBarMenuItem actionBarMenuItem8 = SharedMediaLayout.this.searchItemIcon;
                        if (actionBarMenuItem8 != null) {
                            actionBarMenuItem8.setIcon((hasFilters() && SharedMediaLayout.this.profileActivity.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search, z2);
                        }
                        if (SharedMediaLayout.this.searchItem != null) {
                            ActionBarMenuItem actionBarMenuItem9 = SharedMediaLayout.this.searchItem;
                            SearchTagsList searchTagsList4 = SharedMediaLayout.this.searchTagsList;
                            actionBarMenuItem9.setSearchFieldHint(LocaleController.getString((searchTagsList4 != null && searchTagsList4.hasFilters() && SharedMediaLayout.this.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                        }
                    }
                };
                this.searchTagsList = searchTagsList3;
                searchTagsList3.setShown(0.0f);
                this.searchTagsList.attach();
                addView(this.searchTagsList, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                addView(this.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
            }
            updateTabs(false);
            switchToCurrentSelectedMode(false);
            if (this.hasMedia[0] >= 0) {
                loadFastScrollData(false);
            }
            profileStoriesCollectionTabs = this.storiesContainer;
            if (profileStoriesCollectionTabs != null && i3 > 0) {
                profileStoriesCollectionTabs.setInitialTabId(i3);
            }
            this.iBlur3Capture = new IBlur3Capture() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda13
                @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
                public final void capture(Canvas canvas, RectF rectF) {
                    SharedMediaLayout.this.lambda$new$33(canvas, rectF);
                }

                @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
                public /* synthetic */ void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                    iBlur3Hash.unsupported();
                }
            };
        }
        z = false;
        setWillNotDraw(z);
        i7 = 0;
        i8 = -1;
        i9 = 0;
        r11 = z;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i9 < mediaPageArr.length) {
            }
            MediaPage mediaPage52 = this.mediaPages[i9];
            mediaPage52.emptyView = new StickerEmptyView(context, mediaPage52.progressView, 1) { // from class: org.telegram.ui.Components.SharedMediaLayout.29
                @Override // org.telegram.ui.Components.StickerEmptyView
                protected void onVisibilityChange(float f) {
                    super.onVisibilityChange(f);
                    SharedMediaLayout.this.onBottomButtonVisibilityChange();
                }
            };
            this.mediaPages[i9].emptyView.setVisibility(8, false);
            this.mediaPages[i9].emptyView.setAnimateLayoutChange(true);
            MediaPage mediaPage62 = this.mediaPages[i9];
            mediaPage62.addView(mediaPage62.emptyView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i9].emptyView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda22
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$new$29;
                    lambda$new$29 = SharedMediaLayout.lambda$new$29(view2, motionEvent);
                    return lambda$new$29;
                }
            });
            this.mediaPages[i9].emptyView.showProgress(true, false);
            this.mediaPages[i9].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
            this.mediaPages[i9].emptyView.button.setVisibility(8);
            this.mediaPages[i9].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.mediaPages[i9].emptyView.button.setVisibility(8);
            this.mediaPages[i9].emptyView.addView(this.mediaPages[i9].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            this.mediaPages[i9].listView.setEmptyView(this.mediaPages[i9].emptyView);
            this.mediaPages[i9].listView.setAnimateEmptyView(true, 0);
            MediaPage mediaPage72 = this.mediaPages[i9];
            mediaPage72.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage72.listView, this.mediaPages[i9].layoutManager);
            i9++;
            i7 = i10;
            i8 = i11;
            blurredBackgroundDrawableViewFactory3 = blurredBackgroundDrawableViewFactory4;
            r11 = 0;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory52 = blurredBackgroundDrawableViewFactory3;
        view = this.storiesContainer;
        if (view != null) {
        }
        ChatActionCell chatActionCell2 = new ChatActionCell(context);
        this.floatingDateView = chatActionCell2;
        chatActionCell2.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
        this.floatingDateView.setAlpha(0.0f);
        this.floatingDateView.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
        this.floatingDateView.setTranslationY(-AndroidUtilities.dp(48.0f));
        addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        if (!customTabs()) {
        }
        updateTabs(false);
        switchToCurrentSelectedMode(false);
        if (this.hasMedia[0] >= 0) {
        }
        profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null) {
            profileStoriesCollectionTabs.setInitialTabId(i3);
        }
        this.iBlur3Capture = new IBlur3Capture() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public final void capture(Canvas canvas, RectF rectF) {
                SharedMediaLayout.this.lambda$new$33(canvas, rectF);
            }

            @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
            public /* synthetic */ void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
                iBlur3Hash.unsupported();
            }
        };
    }

    class 4 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        4() {
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchExpand() {
            SharedMediaLayout.this.searching = true;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SearchTagsList searchTagsList = sharedMediaLayout.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.show((sharedMediaLayout.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
            }
            ImageView imageView = SharedMediaLayout.this.photoVideoOptionsItem;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.onSearchStateChanged(true);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchCollapse() {
            SharedMediaLayout.this.searching = false;
            SharedMediaLayout.this.searchingReaction = null;
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.photoVideoOptionsItem != null && sharedMediaLayout.getPhotoVideoOptionsAlpha(0.0f) > 0.5f) {
                SharedMediaLayout.this.photoVideoOptionsItem.setVisibility(0);
            }
            SearchTagsList searchTagsList = SharedMediaLayout.this.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.clear();
                SharedMediaLayout.this.searchTagsList.show(false);
            }
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
            }
            SharedMediaLayout.this.searchWas = false;
            SharedMediaLayout.this.searchItem.setVisibility(0);
            SharedMediaLayout.this.documentsSearchAdapter.search(null, true);
            SharedMediaLayout.this.linksSearchAdapter.search(null, true);
            SharedMediaLayout.this.audioSearchAdapter.search(null, true);
            SharedMediaLayout.this.groupUsersSearchAdapter.search(null, true);
            if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(null, null);
            }
            SharedMediaLayout.this.onSearchStateChanged(false);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            if (SharedMediaLayout.this.ignoreSearchCollapse) {
                SharedMediaLayout.this.ignoreSearchCollapse = false;
            } else {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onTextChanged(EditText editText) {
            String obj = editText.getText().toString();
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.setSearchQuery(obj);
                if (TextUtils.isEmpty(obj) && SharedMediaLayout.this.searchingReaction == null) {
                    SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
                }
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.searchWas = (obj.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
            SharedMediaLayout.this.post(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.4.this.lambda$onTextChanged$0();
                }
            });
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 1) {
                if (SharedMediaLayout.this.documentsSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.documentsSearchAdapter.search(obj, true);
                return;
            }
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 3) {
                if (SharedMediaLayout.this.linksSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.linksSearchAdapter.search(obj, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 4) {
                if (SharedMediaLayout.this.audioSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.audioSearchAdapter.search(obj, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 7) {
                if (SharedMediaLayout.this.groupUsersSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.groupUsersSearchAdapter.search(obj, true);
            } else {
                if (SharedMediaLayout.this.mediaPages[0].selectedType != 11 || SharedMediaLayout.this.savedMessagesSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(obj, SharedMediaLayout.this.searchingReaction);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTextChanged$0() {
            SharedMediaLayout.this.switchToCurrentSelectedMode(false);
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onSearchPressed(EditText editText) {
            super.onSearchPressed(editText);
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.hitSearch();
            }
        }

        @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
        public void onLayout(int i, int i2, int i3, int i4) {
            SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
        }
    }

    class 5 implements View.OnClickListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ long val$did;
        final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;

        5(long j, Theme.ResourcesProvider resourcesProvider, Context context) {
            this.val$did = j;
            this.val$resourcesProvider = resourcesProvider;
            this.val$context = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StoriesController.StoriesList storiesList;
            TLRPC.Chat chat;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            ActionBarMenuSubItem actionBarMenuSubItem;
            boolean z;
            ActionBarMenuSubItem actionBarMenuSubItem2;
            ActionBarMenuSubItem actionBarMenuSubItem3;
            final Runnable runnable;
            StoryAlbumData storyAlbums_getByTabType;
            boolean z2 = true;
            final int closestTab = SharedMediaLayout.this.getClosestTab();
            boolean isAnyStoryPageType = SharedMediaLayout.isAnyStoryPageType(closestTab);
            TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
            boolean canEditStoryAlbums = SharedMediaLayout.this.getStoriesController().canEditStoryAlbums(SharedMediaLayout.this.dialog_id);
            if (SharedMediaLayout.isStoryAlbumPageType(closestTab) && canEditStoryAlbums && (storyAlbums_getByTabType = SharedMediaLayout.this.storyAlbums_getByTabType(closestTab)) != null) {
                int i = storyAlbums_getByTabType.albumId;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.buildItemOptionsForStoryAlbumActionBar(sharedMediaLayout.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem, this.val$did, i).setOnTopOfScrim().setDimAlpha(0).show();
                return;
            }
            if (closestTab == 14) {
                ProfileGiftsContainer.Page currentPage = SharedMediaLayout.this.giftsContainer.getCurrentPage();
                final StarsController.GiftsList giftsList = currentPage.list;
                if (giftsList == null) {
                    return;
                }
                final boolean canFilterHidden = SharedMediaLayout.this.giftsContainer.canFilterHidden();
                final ItemOptions makeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                if (giftsList.isCollection) {
                    actionBarMenuSubItem = null;
                    z = false;
                } else {
                    actionBarMenuSubItem = makeOptions.add();
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.canAdd()) {
                    makeOptions.add(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.5.this.lambda$onClick$0(makeOptions);
                        }
                    });
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.collections.isMine()) {
                    if (!giftsList.getPinned().isEmpty() || currentPage.isCollection) {
                        makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda7
                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedMediaLayout.5.this.lambda$onClick$1(makeOptions);
                            }
                        });
                    }
                    z = true;
                }
                if (z) {
                    makeOptions.addGap();
                }
                final ActionBarMenuSubItem addChecked = makeOptions.addChecked();
                addChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                final ActionBarMenuSubItem addChecked2 = makeOptions.addChecked();
                addChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                final ActionBarMenuSubItem addChecked3 = makeOptions.addChecked();
                addChecked3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                final ActionBarMenuSubItem addChecked4 = makeOptions.addChecked();
                addChecked4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (canFilterHidden) {
                    makeOptions.addGap();
                    ActionBarMenuSubItem addChecked5 = makeOptions.addChecked();
                    addChecked5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    actionBarMenuSubItem2 = makeOptions.addChecked();
                    actionBarMenuSubItem2.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem3 = addChecked5;
                } else {
                    actionBarMenuSubItem2 = null;
                    actionBarMenuSubItem3 = null;
                }
                final ActionBarMenuSubItem actionBarMenuSubItem4 = actionBarMenuSubItem2;
                final ActionBarMenuSubItem actionBarMenuSubItem5 = actionBarMenuSubItem;
                final ActionBarMenuSubItem actionBarMenuSubItem6 = actionBarMenuSubItem3;
                Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.5.lambda$onClick$2(ActionBarMenuSubItem.this, giftsList, addChecked, addChecked2, addChecked3, addChecked4, canFilterHidden, actionBarMenuSubItem6, actionBarMenuSubItem4);
                    }
                };
                runnable2.run();
                if (actionBarMenuSubItem != null) {
                    runnable = runnable2;
                    actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SharedMediaLayout.5.lambda$onClick$3(StarsController.GiftsList.this, runnable, view2);
                        }
                    });
                } else {
                    runnable = runnable2;
                }
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(addChecked, giftsList, runnable, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(addChecked2, giftsList, runnable, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(addChecked3, giftsList, runnable, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(addChecked4, giftsList, runnable, 8);
                if (canFilterHidden) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem6, giftsList, runnable, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem4, giftsList, runnable, 512);
                }
                makeOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
                return;
            }
            if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && SharedMediaLayout.this.botPreviewsContainer != null) {
                ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() < SharedMediaLayout.this.profileActivity.getMessagesController().botPreviewMediasMax, R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.5.this.lambda$onClick$4();
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 1 && !SharedMediaLayout.this.botPreviewsContainer.isSelectedAll(), R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.5.this.lambda$onClick$5();
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 0, R.drawable.msg_select, LocaleController.getString(SharedMediaLayout.this.botPreviewsContainer.isSelectedAll() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.5.this.lambda$onClick$6();
                    }
                }).addIf(!TextUtils.isEmpty(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang()), R.drawable.msg_delete, (CharSequence) LocaleController.formatString(R.string.ProfileBotRemoveLang, TranslateAlert2.languageName(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang())), true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.5.this.lambda$onClick$7();
                    }
                }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
                return;
            }
            if (SharedMediaLayout.this.getSelectedTab() != 11) {
                final ItemOptions makeOptions2 = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                if ((closestTab == 8 || SharedMediaLayout.isStoryAlbumPageType(closestTab)) && canEditStoryAlbums) {
                    int i2 = R.drawable.menu_album_add;
                    String string = LocaleController.getString(R.string.StoriesAlbumAddAlbum);
                    final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                    makeOptions2.add(i2, string, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.5.this.lambda$onClick$14(resourcesProvider, makeOptions2);
                        }
                    });
                    makeOptions2.addGap();
                }
                SharedMediaLayout.this.addZoomInZoomOutItemOptions(makeOptions2);
                boolean z3 = isAnyStoryPageType || !((!SharedMediaLayout.this.sharedMediaData[0].hasPhotos || !SharedMediaLayout.this.sharedMediaData[0].hasVideos) && SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1] && SharedMediaLayout.this.sharedMediaData[0].startReached);
                if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id) && (user == null || !user.bot)) {
                    makeOptions2.add(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.5.this.lambda$onClick$15(closestTab, makeOptions2);
                        }
                    });
                    if (SharedMediaLayout.this.info != null && !SharedMediaLayout.this.isStoriesView() && (chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(SharedMediaLayout.this.info.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                        makeOptions2.add(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedMediaLayout.5.this.lambda$onClick$16(makeOptions2);
                            }
                        });
                    }
                    if (z3) {
                        makeOptions2.addGap();
                        final ActionBarMenuSubItem actionBarMenuSubItem7 = new ActionBarMenuSubItem(this.val$context, true, false, false, this.val$resourcesProvider);
                        final ActionBarMenuSubItem actionBarMenuSubItem8 = new ActionBarMenuSubItem(this.val$context, true, false, true, this.val$resourcesProvider);
                        actionBarMenuSubItem7.setTextAndIcon(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0);
                        makeOptions2.getLayout().addView(actionBarMenuSubItem7);
                        actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0);
                        makeOptions2.getLayout().addView(actionBarMenuSubItem8);
                        if (isAnyStoryPageType) {
                            final StoriesAdapter storyAlbums_getStoriesAdapterByTabType = SharedMediaLayout.this.storyAlbums_getStoriesAdapterByTabType(closestTab);
                            if (storyAlbums_getStoriesAdapterByTabType != null && (storiesList = storyAlbums_getStoriesAdapterByTabType.storiesList) != null) {
                                actionBarMenuSubItem7.setChecked(storiesList.showPhotos());
                                actionBarMenuSubItem8.setChecked(storyAlbums_getStoriesAdapterByTabType.storiesList.showVideos());
                            }
                            actionBarMenuSubItem7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda5
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    SharedMediaLayout.5.this.lambda$onClick$17(actionBarMenuSubItem8, actionBarMenuSubItem7, storyAlbums_getStoriesAdapterByTabType, view2);
                                }
                            });
                            actionBarMenuSubItem8.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda6
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    SharedMediaLayout.5.this.lambda$onClick$18(actionBarMenuSubItem7, actionBarMenuSubItem8, storyAlbums_getStoriesAdapterByTabType, view2);
                                }
                            });
                        } else {
                            actionBarMenuSubItem7.setChecked(SharedMediaLayout.this.sharedMediaData[0].filterType == 0 || SharedMediaLayout.this.sharedMediaData[0].filterType == 1);
                            actionBarMenuSubItem7.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.5.1
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view2) {
                                    if (SharedMediaLayout.this.changeTypeAnimation) {
                                        return;
                                    }
                                    if (!actionBarMenuSubItem8.getCheckView().isChecked() && actionBarMenuSubItem7.getCheckView().isChecked()) {
                                        ActionBarMenuSubItem actionBarMenuSubItem9 = actionBarMenuSubItem7;
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem9, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                        return;
                                    }
                                    actionBarMenuSubItem7.setChecked(!r3.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem7.getCheckView().isChecked() || !actionBarMenuSubItem8.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 2;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            });
                            if (SharedMediaLayout.this.sharedMediaData[0].filterType != 0 && SharedMediaLayout.this.sharedMediaData[0].filterType != 2) {
                                z2 = false;
                            }
                            actionBarMenuSubItem8.setChecked(z2);
                            actionBarMenuSubItem8.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.5.2
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view2) {
                                    if (SharedMediaLayout.this.changeTypeAnimation) {
                                        return;
                                    }
                                    if (!actionBarMenuSubItem7.getCheckView().isChecked() && actionBarMenuSubItem8.getCheckView().isChecked()) {
                                        ActionBarMenuSubItem actionBarMenuSubItem9 = actionBarMenuSubItem8;
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        AndroidUtilities.shakeViewSpring(actionBarMenuSubItem9, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                        return;
                                    }
                                    actionBarMenuSubItem8.setChecked(!r3.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem7.getCheckView().isChecked() || !actionBarMenuSubItem8.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 1;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            });
                        }
                    }
                }
                makeOptions2.setDismissWithButtons(false).setOnTopOfScrim().setDimAlpha(0).show();
                return;
            }
            ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem).add(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.5.this.lambda$onClick$8();
                }
            }).addGap().add(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.5.this.lambda$onClick$9();
                }
            }).add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.5.this.lambda$onClick$11();
                }
            }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$0(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.createCollection();
            itemOptions.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$1(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.setReordering(true);
            itemOptions.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onClick$2(ActionBarMenuSubItem actionBarMenuSubItem, StarsController.GiftsList giftsList, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, ActionBarMenuSubItem actionBarMenuSubItem5, boolean z, ActionBarMenuSubItem actionBarMenuSubItem6, ActionBarMenuSubItem actionBarMenuSubItem7) {
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(giftsList.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), giftsList.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
            }
            actionBarMenuSubItem2.setChecked(giftsList.isInclude_unlimited());
            actionBarMenuSubItem3.setChecked(giftsList.isInclude_limited());
            actionBarMenuSubItem4.setChecked(giftsList.isInclude_upgradable());
            actionBarMenuSubItem5.setChecked(giftsList.isInclude_unique());
            if (z) {
                actionBarMenuSubItem6.setChecked(giftsList.isInclude_displayed());
                actionBarMenuSubItem7.setChecked(giftsList.isInclude_hidden());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onClick$3(StarsController.GiftsList giftsList, Runnable runnable, View view) {
            giftsList.sort_by_date = !giftsList.sort_by_date;
            runnable.run();
            giftsList.invalidate(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$4() {
            StoryRecorder.getInstance(SharedMediaLayout.this.profileActivity.getParentActivity(), SharedMediaLayout.this.profileActivity.getCurrentAccount()).openBot(SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.botPreviewsContainer.getCurrentLang(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$5() {
            SharedMediaLayout.this.botPreviewsContainer.selectAll();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$6() {
            if (SharedMediaLayout.this.botPreviewsContainer.isSelectedAll()) {
                SharedMediaLayout.this.botPreviewsContainer.unselectAll();
            } else {
                SharedMediaLayout.this.botPreviewsContainer.selectAll();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$7() {
            SharedMediaLayout.this.botPreviewsContainer.deleteLang(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$8() {
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId());
            SharedMediaLayout.this.profileActivity.presentFragment(new ChatActivity(bundle), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$9() {
            try {
                SharedMediaLayout.this.profileActivity.getMediaDataController().installShortcut(SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$11() {
            final TLRPC.User currentUser = SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser();
            AlertsCreator.createClearOrDeleteDialogAlert(SharedMediaLayout.this.profileActivity, false, null, currentUser, false, true, false, true, new MessagesStorage.BooleanCallback() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda17
                @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
                public final void run(boolean z) {
                    SharedMediaLayout.5.this.lambda$onClick$10(currentUser, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$10(TLRPC.User user, boolean z) {
            SharedMediaLayout.this.profileActivity.finishFragment();
            if (SharedMediaLayout.this.profileActivity instanceof NotificationCenter.NotificationCenterDelegate) {
                SharedMediaLayout.this.profileActivity.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) SharedMediaLayout.this.profileActivity, NotificationCenter.closeChats);
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(SharedMediaLayout.this.dialog_id), user, null, Boolean.valueOf(z));
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$13(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            storiesController.createAlbum(j, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda18
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    SharedMediaLayout.access$3800(SharedMediaLayout.this, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$14(Theme.ResourcesProvider resourcesProvider, ItemOptions itemOptions) {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, resourcesProvider, new MessagesStorage.StringCallback() { // from class: org.telegram.ui.Components.SharedMediaLayout$5$$ExternalSyntheticLambda16
                @Override // org.telegram.messenger.MessagesStorage.StringCallback
                public final void run(String str) {
                    SharedMediaLayout.5.this.lambda$onClick$13(str);
                }
            });
            itemOptions.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$15(int i, ItemOptions itemOptions) {
            SharedMediaLayout.this.showMediaCalendar(i, false);
            itemOptions.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$16(ItemOptions itemOptions) {
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putLong("dialog_id", -SharedMediaLayout.this.info.id);
            MediaActivity mediaActivity = new MediaActivity(bundle, null);
            mediaActivity.setChatInfo(SharedMediaLayout.this.info);
            SharedMediaLayout.this.profileActivity.presentFragment(mediaActivity);
            itemOptions.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$17(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            storiesList.updateFilters(actionBarMenuSubItem2.getCheckView().isChecked(), actionBarMenuSubItem.getCheckView().isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClick$18(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            storiesList.updateFilters(actionBarMenuSubItem.getCheckView().isChecked(), actionBarMenuSubItem2.getCheckView().isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(View view) {
        closeActionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        onActionBarItemClick(view, 102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(View view) {
        onActionBarItemClick(view, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(View view) {
        onActionBarItemClick(view, 103);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(View view) {
        onActionBarItemClick(view, 104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$8(View view) {
        onActionBarItemClick(view, 101);
    }

    class 12 extends BotPreviewsEditContainer {
        12(Context context, BaseFragment baseFragment, long j) {
            super(context, baseFragment, j);
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        public void onSelectedTabChanged() {
            SharedMediaLayout.this.onSelectedTabChanged();
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        protected boolean isSelected(MessageObject messageObject) {
            return SharedMediaLayout.this.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        protected boolean select(MessageObject messageObject) {
            if (messageObject == null) {
                return false;
            }
            char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
            if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0 || SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size() >= 100) {
                return false;
            }
            SharedMediaLayout.this.selectedFiles[c].put(messageObject.getId(), messageObject);
            if (!messageObject.canDeleteMessage(false, null)) {
                SharedMediaLayout.access$4908(SharedMediaLayout.this);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (!sharedMediaLayout.isActionModeShowed) {
                AndroidUtilities.hideKeyboard(sharedMediaLayout.profileActivity.getParentActivity().getCurrentFocus());
                int i = 8;
                SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                if (SharedMediaLayout.this.gotoItem != null) {
                    SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.forwardItem != null) {
                    ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                    if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                        i = 0;
                    }
                    actionBarMenuItem.setVisibility(i);
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < SharedMediaLayout.this.actionModeViews.size(); i2++) {
                    View view = (View) SharedMediaLayout.this.actionModeViews.get(i2);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                SharedMediaLayout.this.scrolling = false;
                SharedMediaLayout.this.showActionMode(true);
            } else {
                sharedMediaLayout.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), true);
            }
            updateSelection(true);
            return true;
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        protected boolean unselect(MessageObject messageObject) {
            if (messageObject == null) {
                return false;
            }
            char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
            if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) < 0) {
                return false;
            }
            SharedMediaLayout.this.selectedFiles[c].remove(messageObject.getId());
            if (!messageObject.canDeleteMessage(false, null)) {
                SharedMediaLayout.access$4910(SharedMediaLayout.this);
            }
            if (SharedMediaLayout.this.selectedFiles[0].size() != 0 || SharedMediaLayout.this.selectedFiles[1].size() != 0) {
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[0].size() + SharedMediaLayout.this.selectedFiles[1].size(), true);
            } else {
                AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                SharedMediaLayout.this.selectedFiles[0].clear();
                SharedMediaLayout.this.selectedFiles[1].clear();
                int i = 8;
                SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                if (SharedMediaLayout.this.gotoItem != null) {
                    SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.forwardItem != null) {
                    ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                    if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                        i = 0;
                    }
                    actionBarMenuItem.setVisibility(i);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < SharedMediaLayout.this.actionModeViews.size(); i2++) {
                    View view = (View) SharedMediaLayout.this.actionModeViews.get(i2);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                SharedMediaLayout.this.scrolling = false;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$12$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.12.this.lambda$unselect$0();
                    }
                }, 20L);
            }
            updateSelection(true);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$unselect$0() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedMediaLayout.showActionMode(false);
            }
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        protected boolean isActionModeShowed() {
            return SharedMediaLayout.this.isActionModeShowed;
        }

        @Override // org.telegram.ui.Stories.bots.BotPreviewsEditContainer
        public int getStartedTrackingX() {
            return SharedMediaLayout.this.startedTrackingX;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$9(View view) {
        if (this.saveItem.getAlpha() < 0.1f) {
            return;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            this.giftsContainer.resetReordering();
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            return;
        }
        saveAndStopAlbumsReorder();
    }

    class 13 extends ProfileGiftsContainer {
        13(BaseFragment baseFragment, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
            super(baseFragment, context, i, j, resourcesProvider);
        }

        @Override // org.telegram.ui.Gifts.ProfileGiftsContainer
        protected int processColor(int i) {
            return SharedMediaLayout.this.processColor(i);
        }

        @Override // org.telegram.ui.Gifts.ProfileGiftsContainer
        protected void updatedReordering(final boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$13$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.13.this.lambda$updatedReordering$0(z);
                }
            }).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }
    }

    class 14 implements ProfileStoriesCollectionTabs.Delegate {
        final /* synthetic */ Context val$context;
        final /* synthetic */ BaseFragment val$parent;
        final /* synthetic */ Theme.ResourcesProvider val$resourcesProvider;

        14(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$parent = baseFragment;
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs.Delegate
        public void onTabAlbumSelected(int i, boolean z) {
            if (i <= 0) {
                SharedMediaLayout.this.openStoryTabIdPage(8, z);
            } else {
                SharedMediaLayout.this.openStoryTabIdPage(SharedMediaLayout.this.storyAlbums_getByAlbumId(i).tabType, z);
            }
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs.Delegate
        public void onTabAlbumScrollEnd(int i) {
            SharedMediaLayout.this.onPageMediaProgress(1.0f);
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs.Delegate
        public void onTabAlbumAnimationUpdate(float f) {
            SharedMediaLayout.this.onPageMediaProgress(f);
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs.Delegate
        public void onTabAlbumCreateCollection() {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(this.val$context, this.val$parent, this.val$resourcesProvider, new MessagesStorage.StringCallback() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda4
                @Override // org.telegram.messenger.MessagesStorage.StringCallback
                public final void run(String str) {
                    SharedMediaLayout.14.this.lambda$onTabAlbumCreateCollection$1(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTabAlbumCreateCollection$1(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            storiesController.createAlbum(j, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    SharedMediaLayout.access$3800(SharedMediaLayout.this, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs.Delegate
        public void onTabAlbumLongClick(View view, final int i) {
            if (SharedMediaLayout.this.getStoriesController().canEditStoryAlbums(SharedMediaLayout.this.dialog_id)) {
                ItemOptions scrimViewBackground = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view).setScrimViewBackground(new Drawable() { // from class: org.telegram.ui.Components.SharedMediaLayout.14.1
                    private final Drawable bg;
                    private final Rect bgBounds = new Rect();

                    @Override // android.graphics.drawable.Drawable
                    public int getOpacity() {
                        return -2;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    {
                        this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, 14.this.val$resourcesProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, 14.this.val$resourcesProvider), 0.04f)));
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                        this.bgBounds.set(getBounds());
                        this.bgBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                        this.bg.setBounds(this.bgBounds);
                        this.bg.draw(canvas);
                    }

                    @Override // android.graphics.drawable.Drawable
                    public void setAlpha(int i2) {
                        this.bg.setAlpha(i2);
                    }
                });
                scrimViewBackground.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.14.this.lambda$onTabAlbumLongClick$2(i);
                    }
                });
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.addStoryAlbumShareItemOptions(scrimViewBackground, sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
                scrimViewBackground.add(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.14.this.lambda$onTabAlbumLongClick$3(i);
                    }
                });
                scrimViewBackground.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.14.this.lambda$onTabAlbumLongClick$4(i);
                    }
                });
                scrimViewBackground.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$14$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.14.this.lambda$onTabAlbumLongClick$5(i);
                    }
                });
                scrimViewBackground.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTabAlbumLongClick$2(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openAddStoriesToAlbumSheet(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTabAlbumLongClick$3(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openRenameStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTabAlbumLongClick$4(int i) {
            SharedMediaLayout.this.lambda$onItemLongClick$58(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTabAlbumLongClick$5(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openDeleteStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }
    }

    class 15 extends ProfileStoriesCollectionTabs {
        15(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, StoriesController.StoriesCollections storiesCollections, ProfileStoriesCollectionTabs.Delegate delegate) {
            super(context, sizeNotifierFrameLayout, storiesCollections, delegate);
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs
        protected void updatedReordering(final boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$15$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.15.this.lambda$updatedReordering$0(z);
                }
            }).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }

        @Override // org.telegram.ui.ProfileStoriesCollectionTabs
        protected void onVisibilityChange(float f) {
            super.onVisibilityChange(f);
            if (SharedMediaLayout.this.mediaPages != null) {
                for (MediaPage mediaPage : SharedMediaLayout.this.mediaPages) {
                    if (mediaPage != null && mediaPage.listView != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int pagePaddingTop = SharedMediaLayout.this.getPagePaddingTop(mediaPage.selectedType);
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        int pagePaddingBottom = sharedMediaLayout.getPagePaddingBottom(sharedMediaLayout.isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    }
                }
            }
            SharedMediaLayout.this.checkUi_topPanelLayoutY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$28(MediaPage mediaPage, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, View view, int i, final float f, final float f2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long j2;
        int i2 = mediaPage.selectedType;
        if (i2 == 7) {
            if (!(view instanceof UserCell)) {
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
                if (adapter == groupUsersSearchAdapter) {
                    TLObject item = groupUsersSearchAdapter.getItem(i);
                    if (item instanceof TLRPC.ChannelParticipant) {
                        j2 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                    } else if (!(item instanceof TLRPC.ChatParticipant)) {
                        return;
                    } else {
                        j2 = ((TLRPC.ChatParticipant) item).user_id;
                    }
                    if (j2 == 0 || j2 == this.profileActivity.getUserConfig().getClientUserId()) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j2);
                    this.profileActivity.presentFragment(new ProfileActivity(bundle));
                    return;
                }
                return;
            }
            int intValue = !this.chatUsersAdapter.sortedUsers.isEmpty() ? ((Integer) this.chatUsersAdapter.sortedUsers.get(i)).intValue() : i;
            TLRPC.ChatParticipant chatParticipant = this.chatUsersAdapter.chatInfo.participants.participants.get(intValue);
            if (intValue < 0 || intValue >= this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                return;
            }
            onMemberClick(chatParticipant, false, view);
            return;
        }
        if (i2 == 6 && (view instanceof ProfileSearchCell)) {
            TLRPC.Chat chat = ((ProfileSearchCell) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (this.profileActivity.getMessagesController().checkCanOpenChat(bundle2, this.profileActivity)) {
                if (chat.forum) {
                    BaseFragment baseFragment = this.profileActivity;
                    baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle2));
                    return;
                } else {
                    this.profileActivity.presentFragment(new ChatActivity(bundle2));
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && (view instanceof SharedDocumentCell)) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 3 && (view instanceof SharedLinkCell)) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof SharedAudioCell)) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 5 && (view instanceof ContextLinkCell)) {
            onItemClick(i, view, (MessageObject) ((ContextLinkCell) view).getParentObject(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 0 && (view instanceof SharedPhotoVideoCell2)) {
            final SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
            MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
            if (messageObject != null && messageObject.isSensitive()) {
                BaseFragment baseFragment2 = this.profileActivity;
                if (baseFragment2 == null) {
                    return;
                }
                final int currentAccount = baseFragment2.getCurrentAccount();
                final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                final AlertDialog alertDialog = new AlertDialog(context, 3);
                alertDialog.showDelayed(200L);
                messagesController.getContentSettings(new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda34
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        SharedMediaLayout.this.lambda$new$15(alertDialog, messagesController, context, sharedPhotoVideoCell2, f, f2, currentAccount, (TL_account.contentSettings) obj);
                    }
                });
                return;
            }
            if (sharedPhotoVideoCell2.canRevealSpoiler()) {
                sharedPhotoVideoCell2.startRevealMedia(f, f2);
                return;
            } else {
                if (messageObject != null) {
                    onItemClick(i, view, messageObject, 0, mediaPage.selectedType);
                    return;
                }
                return;
            }
        }
        if (isAnyStoryPageType(i2) && (view instanceof SharedPhotoVideoCell2)) {
            MessageObject messageObject2 = ((SharedPhotoVideoCell2) view).getMessageObject();
            if (messageObject2 != null) {
                onItemClick(i, view, messageObject2, 0, mediaPage.selectedType);
                return;
            }
            return;
        }
        int i3 = mediaPage.selectedType;
        if (i3 == 10) {
            if (((view instanceof ProfileSearchCell) || f2 < AndroidUtilities.dp(60.0f)) && i >= 0 && i < this.channelRecommendationsAdapter.chats.size()) {
                Bundle bundle3 = new Bundle();
                TLObject tLObject = (TLObject) this.channelRecommendationsAdapter.chats.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle3.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle3.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                this.profileActivity.presentFragment(new ChatActivity(bundle3));
                return;
            }
            return;
        }
        if (i3 == 11) {
            RecyclerView.Adapter adapter2 = mediaPage.listView.getAdapter();
            SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
            if (adapter2 != savedMessagesSearchAdapter) {
                if (this.isActionModeShowed) {
                    if (this.savedDialogsAdapter.itemTouchHelper.isIdle()) {
                        this.savedDialogsAdapter.select(view);
                        return;
                    }
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (i < 0 || i >= this.savedDialogsAdapter.dialogs.size()) {
                    return;
                }
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.savedDialogsAdapter.dialogs.get(i);
                bundle4.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle4.putInt("chatMode", 3);
                ChatActivity chatActivity = new ChatActivity(bundle4);
                chatActivity.setSavedDialog(savedDialog.dialogId);
                this.profileActivity.presentFragment(chatActivity);
                return;
            }
            if (i < 0) {
                return;
            }
            if (i < savedMessagesSearchAdapter.dialogs.size()) {
                SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) this.savedMessagesSearchAdapter.dialogs.get(i);
                Bundle bundle5 = new Bundle();
                bundle5.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle5.putInt("chatMode", 3);
                ChatActivity chatActivity2 = new ChatActivity(bundle5);
                chatActivity2.setSavedDialog(savedDialog2.dialogId);
                this.profileActivity.presentFragment(chatActivity2);
                return;
            }
            final int size = i - this.savedMessagesSearchAdapter.dialogs.size();
            if (size < this.savedMessagesSearchAdapter.messages.size()) {
                MessageObject messageObject3 = (MessageObject) this.savedMessagesSearchAdapter.messages.get(size);
                Bundle bundle6 = new Bundle();
                bundle6.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
                bundle6.putInt("message_id", messageObject3.getId());
                ChatActivity chatActivity3 = new ChatActivity(bundle6) { // from class: org.telegram.ui.Components.SharedMediaLayout.23
                    boolean firstCreateView = true;

                    @Override // org.telegram.ui.ChatActivity, org.telegram.ui.ActionBar.BaseFragment
                    public void onTransitionAnimationStart(boolean z, boolean z2) {
                        if (this.firstCreateView) {
                            if (this.searchItem != null) {
                                lambda$openSearchWithText$359("");
                                this.searchItem.setSearchFieldText(SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, false);
                            }
                            SearchTagsList searchTagsList = this.actionBarSearchTags;
                            if (searchTagsList != null) {
                                searchTagsList.setChosen(SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, false);
                            }
                            SharedMediaLayout.this.profileActivity.getMediaDataController().portSavedSearchResults(getClassGuid(), SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, SharedMediaLayout.this.savedMessagesSearchAdapter.cachedMessages, SharedMediaLayout.this.savedMessagesSearchAdapter.loadedMessages, size, SharedMediaLayout.this.savedMessagesSearchAdapter.count, SharedMediaLayout.this.savedMessagesSearchAdapter.endReached);
                            this.firstCreateView = false;
                        }
                        super.onTransitionAnimationStart(z, z2);
                    }
                };
                chatActivity3.setHighlightMessageId(messageObject3.getId());
                this.profileActivity.presentFragment(chatActivity3);
                return;
            }
            return;
        }
        if (i3 == 15 && (view instanceof ChatMessageCell)) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            final MessageObject messageObject4 = chatMessageCell.getMessageObject();
            mediaPage.listView.stopScroll();
            final int currentAccount2 = this.profileActivity.getCurrentAccount();
            TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(j));
            ItemOptions makeOptions = ItemOptions.makeOptions(mediaPage, resourcesProvider, chatMessageCell);
            makeOptions.offsetByContainer();
            makeOptions.setGravity(messageObject4.isOutOwner() ? 5 : 3);
            makeOptions.add(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda35
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$new$16(j, messageObject4);
                }
            });
            if (!messageObject4.isPollClosed()) {
                if (messageObject4.canUnvote()) {
                    makeOptions.add(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda36
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.this.lambda$new$20(resourcesProvider, currentAccount2, messageObject4);
                        }
                    });
                }
                if (!messageObject4.isForwarded() && ((messageObject4.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                    makeOptions.add(R.drawable.msg_pollstop, LocaleController.getString(messageObject4.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda37
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.this.lambda$new$27(resourcesProvider, messageObject4, currentAccount2);
                        }
                    });
                }
            }
            makeOptions.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$15(AlertDialog alertDialog, final MessagesController messagesController, final Context context, final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, final int i, final TL_account.contentSettings contentsettings) {
        alertDialog.dismissUnless(200L);
        final boolean z = messagesController.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController.verifyAgeBotUsername);
        boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
        final boolean[] zArr = new boolean[1];
        FrameLayout frameLayout = new FrameLayout(context);
        if (z) {
            zArr[0] = true;
        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
            BaseFragment baseFragment = this.profileActivity;
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, baseFragment == null ? null : baseFragment.getResourceProvider());
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedMediaLayout.lambda$new$10(zArr, view);
                }
            });
        }
        BaseFragment baseFragment2 = this.profileActivity;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(context, baseFragment2 == null ? null : baseFragment2.getResourceProvider()).setTitle(LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle)).setMessage(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText)).setView(frameLayout).setCustomViewOffset(9).setNegativeButton(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
        if (!z2) {
            negativeButton.setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda60
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    SharedMediaLayout.lambda$new$14(SharedPhotoVideoCell2.this, f, f2, zArr, z, contentsettings, context, i, messagesController, alertDialog2, i2);
                }
            });
        }
        BaseFragment baseFragment3 = this.profileActivity;
        if (baseFragment3 != null && baseFragment3.getContext() != null) {
            this.profileActivity.showDialog(negativeButton.create());
        } else {
            negativeButton.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$10(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$14(final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings, Context context, int i, final MessagesController messagesController, AlertDialog alertDialog, int i2) {
        final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda66
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                SharedPhotoVideoCell2.this.startRevealMedia(f, f2);
            }
        };
        if (zArr[0]) {
            if (z || (contentsettings != null && contentsettings.sensitive_can_change)) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                ThemeActivity.verifyAge(context, i, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda67
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        SharedMediaLayout.lambda$new$13(MessagesController.this, callback, (Boolean) obj);
                    }
                }, safeLastFragment == null ? null : safeLastFragment.getResourceProvider());
                return;
            } else {
                callback.run(Boolean.TRUE);
                return;
            }
        }
        callback.run(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$13(MessagesController messagesController, Utilities.Callback callback, Boolean bool) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!bool.booleanValue()) {
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText)).show();
            }
        } else {
            messagesController.setContentSettings(true);
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda78
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.lambda$new$12(BaseFragment.this);
                    }
                }), true)).show(true);
            }
            callback.run(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$12(BaseFragment baseFragment) {
        baseFragment.presentFragment(new ThemeActivity(0).highlightSensitiveRow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$16(long j, MessageObject messageObject) {
        this.profileActivity.presentFragment(ChatActivity.of(j, messageObject.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$20(Theme.ResourcesProvider resourcesProvider, final int i, MessageObject messageObject) {
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        final int sendVote = SendMessagesHelper.getInstance(i).sendVote(messageObject, null, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.lambda$new$17(alertDialogArr);
            }
        });
        if (sendVote != 0) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.lambda$new$19(alertDialogArr, i, sendVote);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$17(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$19(AlertDialog[] alertDialogArr, final int i, final int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda71
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SharedMediaLayout.lambda$new$18(i, i2, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$18(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$27(final Theme.ResourcesProvider resourcesProvider, final MessageObject messageObject, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), resourcesProvider);
        builder.setDimEnabled(false);
        if (messageObject.isQuiz()) {
            builder.setTitle(LocaleController.getString(R.string.StopQuizAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopQuizAlertText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.StopPollAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopPollAlertText));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Stop), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda52
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                SharedMediaLayout.this.lambda$new$26(resourcesProvider, messageObject, i, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$26(Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, final int i, AlertDialog alertDialog, int i2) {
        final AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        final TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = MessagesController.getInstance(i).getInputPeer(this.dialog_id);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        final int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda69
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SharedMediaLayout.this.lambda$new$23(alertDialogArr, i, tL_messages_editMessage, tLObject, tL_error);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.lambda$new$25(alertDialogArr, i, sendRequest);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$23(final AlertDialog[] alertDialogArr, final int i, final TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.lambda$new$21(alertDialogArr);
            }
        });
        if (tL_error == null) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda76
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$new$22(i, tL_error, tL_messages_editMessage);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$21(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$22(int i, TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        AlertsCreator.processError(i, tL_error, this.profileActivity, tL_messages_editMessage, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$25(AlertDialog[] alertDialogArr, final int i, final int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda79
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SharedMediaLayout.lambda$new$24(i, i2, dialogInterface);
            }
        });
        alertDialogArr[0].show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$24(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$31() {
        this.topLayoutPadding = (int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f));
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f))));
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr != null) {
            for (final MediaPage mediaPage : mediaPageArr) {
                if (mediaPage != null) {
                    int paddingTop = mediaPage.listView.getPaddingTop();
                    InternalListView internalListView = mediaPage.listView;
                    int paddingLeft = mediaPage.listView.getPaddingLeft();
                    int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
                    int paddingRight = mediaPage.listView.getPaddingRight();
                    InternalListView internalListView2 = mediaPage.listView;
                    int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                    internalListView2.hintPaddingBottom = pagePaddingBottom;
                    internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    final int paddingTop2 = paddingTop - mediaPage.listView.getPaddingTop();
                    AndroidUtilities.doOnLayout(mediaPage.listView, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda39
                        @Override // java.lang.Runnable
                        public final void run() {
                            SharedMediaLayout.lambda$new$30(SharedMediaLayout.MediaPage.this, paddingTop2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$30(MediaPage mediaPage, int i) {
        mediaPage.listView.scrollBy(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$32(boolean z, boolean z2) {
        if (!z) {
            requestLayout();
        }
        setVisibleHeight(this.lastVisibleHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$33(Canvas canvas, RectF rectF) {
        IBlur3Capture iBlur3Capture;
        for (MediaPage mediaPage : this.mediaPages) {
            if (mediaPage.iBlur3Capture != null) {
                mediaPage.iBlur3Capture.capture(canvas, rectF);
            }
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer == null || (iBlur3Capture = profileGiftsContainer.iBlur3Capture) == null) {
            return;
        }
        iBlur3Capture.capture(canvas, rectF);
    }

    protected boolean isBot() {
        TLRPC.User user;
        return this.dialog_id > 0 && (user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id))) != null && user.bot;
    }

    public void setStoriesFilter(boolean z, boolean z2) {
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && (storiesList2 = storiesAdapter.storiesList) != null) {
            storiesList2.updateFilters(z, z2);
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 == null || (storiesList = storiesAdapter2.storiesList) == null) {
            return;
        }
        storiesList.updateFilters(z, z2);
    }

    public void setForwardRestrictedHint(HintView hintView) {
        this.fwdRestrictedHint = hintView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMessageId(View view) {
        if (view instanceof SharedPhotoVideoCell2) {
            return ((SharedPhotoVideoCell2) view).getMessageId();
        }
        if (view instanceof SharedDocumentCell) {
            return ((SharedDocumentCell) view).getMessage().getId();
        }
        if (view instanceof SharedAudioCell) {
            return ((SharedAudioCell) view).getMessage().getId();
        }
        return 0;
    }

    private void updateForwardItem() {
        if (this.forwardItem == null) {
            return;
        }
        boolean z = this.profileActivity.getMessagesController().isPeerNoForwards(this.dialog_id) || hasNoforwardsMessage();
        this.forwardItem.setAlpha(z ? 0.5f : 1.0f);
        if (z && this.forwardItem.getBackground() != null) {
            this.forwardItem.setBackground(null);
        } else {
            if (z || this.forwardItem.getBackground() != null) {
                return;
            }
            this.forwardItem.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 5));
        }
    }

    private boolean hasNoforwardsMessage() {
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.selectedFiles[i].size(); i2++) {
                arrayList.add(Integer.valueOf(this.selectedFiles[i].keyAt(i2)));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (num.intValue() > 0 && (messageObject = (MessageObject) this.selectedFiles[i].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeMediaFilterType() {
        final Bitmap bitmap;
        final MediaPage mediaPage = getMediaPage(0);
        if (mediaPage != null && mediaPage.getMeasuredHeight() > 0 && mediaPage.getMeasuredWidth() > 0) {
            try {
                bitmap = Bitmap.createBitmap(mediaPage.getMeasuredWidth(), mediaPage.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmap = null;
            }
            if (bitmap != null) {
                this.changeTypeAnimation = true;
                mediaPage.listView.draw(new Canvas(bitmap));
                final View view = new View(mediaPage.getContext());
                view.setBackground(new BitmapDrawable(bitmap));
                mediaPage.addView(view);
                view.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.32
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.changeTypeAnimation = false;
                        if (view.getParent() != null) {
                            mediaPage.removeView(view);
                            bitmap.recycle();
                        }
                    }
                }).start();
                mediaPage.listView.setAlpha(0.0f);
                mediaPage.listView.animate().alpha(1.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda61
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SharedMediaLayout.lambda$changeMediaFilterType$34(SharedMediaLayout.MediaPage.this, valueAnimator);
                    }
                }).setDuration(200L).start();
            }
        }
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        ArrayList arrayList = this.sharedMediaPreloader.getSharedMediaData()[0].messages;
        this.sharedMediaData[0].setTotalCount(1, 0);
        SharedMediaData sharedMediaData = this.sharedMediaData[0];
        int i = sharedMediaData.filterType;
        if (i == 0) {
            sharedMediaData.setTotalCount(0, lastMediaCount[0]);
        } else if (i == 1) {
            sharedMediaData.setTotalCount(0, lastMediaCount[6]);
        } else {
            sharedMediaData.setTotalCount(0, lastMediaCount[7]);
        }
        this.sharedMediaData[0].fastScrollDataLoaded = false;
        jumpToDate(0, DialogObject.isEncryptedDialog(this.dialog_id) ? TLObject.FLAG_31 : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        loadFastScrollData(false);
        this.delegate.updateSelectedMediaTabText();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            SharedMediaData sharedMediaData2 = this.sharedMediaData[0];
            int i3 = sharedMediaData2.filterType;
            if (i3 == 0) {
                sharedMediaData2.addMessage(messageObject, 0, false, isEncryptedDialog);
            } else if (i3 == 1) {
                if (messageObject.isPhoto()) {
                    this.sharedMediaData[0].addMessage(messageObject, 0, false, isEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                this.sharedMediaData[0].addMessage(messageObject, 0, false, isEncryptedDialog);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$changeMediaFilterType$34(MediaPage mediaPage, ValueAnimator valueAnimator) {
        mediaPage.listView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPage getMediaPage(int i) {
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return null;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && mediaPage.selectedType == i) {
                return mediaPage;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showMediaCalendar(int i, boolean z) {
        int i2;
        MediaPage mediaPage;
        if (z && getY() != 0.0f && this.viewType == 1) {
            return;
        }
        if (z && isAnyStoryPageType(i) && getStoriesCount(i) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.dialog_id);
        bundle.putLong("topic_id", this.topicId);
        if (z && (mediaPage = getMediaPage(0)) != null) {
            ArrayList arrayList = this.sharedMediaData[0].fastScrollPeriods;
            int findFirstVisibleItemPosition = mediaPage.layoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition >= 0) {
                Period period = null;
                if (arrayList != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        if (findFirstVisibleItemPosition <= ((Period) arrayList.get(i3)).startOffset) {
                            period = (Period) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (period == null) {
                        period = (Period) arrayList.get(arrayList.size() - 1);
                    }
                }
                if (period != null) {
                    i2 = period.date;
                    if (i != 9) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                    } else if (i == 8) {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                    } else {
                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    }
                    CalendarActivity calendarActivity = new CalendarActivity(bundle, this.sharedMediaData[0].filterType, i2);
                    calendarActivity.setCallback(new CalendarActivity.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout.33
                        @Override // org.telegram.ui.CalendarActivity.Callback
                        public void onDateSelected(int i4, int i5) {
                            int i6 = -1;
                            for (int i7 = 0; i7 < SharedMediaLayout.this.sharedMediaData[0].messages.size(); i7++) {
                                if (((MessageObject) SharedMediaLayout.this.sharedMediaData[0].messages.get(i7)).getId() == i4) {
                                    i6 = i7;
                                }
                            }
                            MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                            if (i6 < 0 || mediaPage2 == null) {
                                SharedMediaLayout.this.jumpToDate(0, i4, i5, true);
                            } else {
                                mediaPage2.layoutManager.scrollToPositionWithOffset(i6, 0);
                            }
                            if (mediaPage2 != null) {
                                mediaPage2.highlightMessageId = i4;
                                mediaPage2.highlightAnimation = false;
                            }
                        }
                    });
                    this.profileActivity.presentFragment(calendarActivity);
                }
            }
        }
        i2 = 0;
        if (i != 9) {
        }
        CalendarActivity calendarActivity2 = new CalendarActivity(bundle, this.sharedMediaData[0].filterType, i2);
        calendarActivity2.setCallback(new CalendarActivity.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout.33
            @Override // org.telegram.ui.CalendarActivity.Callback
            public void onDateSelected(int i4, int i5) {
                int i6 = -1;
                for (int i7 = 0; i7 < SharedMediaLayout.this.sharedMediaData[0].messages.size(); i7++) {
                    if (((MessageObject) SharedMediaLayout.this.sharedMediaData[0].messages.get(i7)).getId() == i4) {
                        i6 = i7;
                    }
                }
                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                if (i6 < 0 || mediaPage2 == null) {
                    SharedMediaLayout.this.jumpToDate(0, i4, i5, true);
                } else {
                    mediaPage2.layoutManager.scrollToPositionWithOffset(i6, 0);
                }
                if (mediaPage2 != null) {
                    mediaPage2.highlightMessageId = i4;
                    mediaPage2.highlightAnimation = false;
                }
            }
        });
        this.profileActivity.presentFragment(calendarActivity2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r1 = r7.mediaPages[r1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void startPinchToMediaColumnsCount(boolean z) {
        final MediaPage mediaPage;
        if (this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            int i3 = mediaPageArr[i2].selectedType;
            if (i3 == 0 || isAnyStoryPageType(i3)) {
                break;
            } else {
                i2++;
            }
        }
        if (mediaPage == null) {
            return;
        }
        int i4 = mediaPage.selectedType;
        this.changeColumnsTab = i4;
        boolean isAnyStoryPageType = isAnyStoryPageType(i4);
        int nextMediaColumnsCount = getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0], z);
        this.animateToColumnsCount = nextMediaColumnsCount;
        if (nextMediaColumnsCount == this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0]) {
            return;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(this.changeColumnsTab)) {
            return;
        }
        mediaPage.animationSupportingListView.setVisibility(0);
        if (isAnyStoryPageType(this.changeColumnsTab)) {
            mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
        } else {
            mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
        }
        mediaPage.animationSupportingListView.setPadding(mediaPage.animationSupportingListView.getPaddingLeft(), getPagePaddingTop(this.changeColumnsTab), mediaPage.animationSupportingListView.getPaddingRight(), getPagePaddingBottom(isStoriesView()));
        mediaPage.animationSupportingLayoutManager.setSpanCount(nextMediaColumnsCount);
        mediaPage.animationSupportingListView.invalidateItemDecorations();
        mediaPage.animationSupportingLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.Components.SharedMediaLayout.34
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i5) {
                RecyclerView.Adapter adapter = mediaPage.animationSupportingListView.getAdapter();
                if (adapter == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) {
                    if (SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.getItemViewType(i5) == 2) {
                        return mediaPage.animationSupportingLayoutManager.getSpanCount();
                    }
                    return 1;
                }
                if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(adapter) == -1 || ((StoriesAdapter) adapter).getItemViewType(i5) != 2) {
                    return 1;
                }
                return mediaPage.animationSupportingLayoutManager.getSpanCount();
            }
        });
        AndroidUtilities.updateVisibleRows(mediaPage.listView);
        this.photoVideoChangeColumnsAnimation = true;
        if (this.changeColumnsTab == 0) {
            this.sharedMediaData[0].setListFrozen(true);
        }
        this.photoVideoChangeColumnsProgress = 0.0f;
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i >= mediaPageArr2.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr2[i];
            if (mediaPage2.selectedType == this.changeColumnsTab) {
                mediaPage2.animationSupportingLayoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, this.pinchCenterOffset - this.mediaPages[i].animationSupportingListView.getPaddingTop());
            }
            i++;
        }
    }

    private void finishPinchToMediaColumnsCount() {
        final MediaPage mediaPage;
        RecyclerView.Adapter adapter;
        int i = 0;
        if (!this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            mediaPage = mediaPageArr[i2];
            if (mediaPage.selectedType == this.changeColumnsTab) {
                break;
            } else {
                i2++;
            }
        }
        if (mediaPage == null) {
            return;
        }
        boolean isAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
        float f = this.photoVideoChangeColumnsProgress;
        if (f != 1.0f) {
            if (f == 0.0f) {
                this.photoVideoChangeColumnsAnimation = false;
                if (this.changeColumnsTab == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                mediaPage.animationSupportingListView.setVisibility(8);
                mediaPage.listView.invalidate();
                return;
            }
            final boolean z = f > 0.2f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.35
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = isAnyStoryPageType ? 1 : 0;
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.36
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    View findViewByPosition;
                    RecyclerView.Adapter adapter2;
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    if (z) {
                        SharedMediaLayout.this.mediaColumnsCount[i3] = SharedMediaLayout.this.animateToColumnsCount;
                        if (i3 == 0) {
                            SharedConfig.setMediaColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        } else if (SharedMediaLayout.this.getStoriesCount(mediaPage.selectedType) >= 5) {
                            SharedConfig.setStoriesColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        }
                    }
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter2 = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter2.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                if (z) {
                                    SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                    SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                    if (adapter2.getItemCount() == itemCount) {
                                        AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                    } else {
                                        adapter2.notifyDataSetChanged();
                                    }
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    if (sharedMediaLayout2.pinchCenterPosition >= 0) {
                        for (int i5 = 0; i5 < SharedMediaLayout.this.mediaPages.length; i5++) {
                            if (SharedMediaLayout.this.mediaPages[i5].selectedType == SharedMediaLayout.this.changeColumnsTab) {
                                if (z && (findViewByPosition = SharedMediaLayout.this.mediaPages[i5].animationSupportingLayoutManager.findViewByPosition(SharedMediaLayout.this.pinchCenterPosition)) != null) {
                                    SharedMediaLayout.this.pinchCenterOffset = findViewByPosition.getTop();
                                }
                                ExtendedGridLayoutManager extendedGridLayoutManager = SharedMediaLayout.this.mediaPages[i5].layoutManager;
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                extendedGridLayoutManager.scrollToPositionWithOffset(sharedMediaLayout3.pinchCenterPosition, (-sharedMediaLayout3.mediaPages[i5].listView.getPaddingTop()) + SharedMediaLayout.this.pinchCenterOffset);
                            }
                        }
                    } else {
                        sharedMediaLayout2.saveScrollPosition();
                    }
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.setDuration(200L);
            ofFloat.start();
            return;
        }
        this.photoVideoChangeColumnsAnimation = false;
        int[] iArr = this.mediaColumnsCount;
        int i4 = this.animateToColumnsCount;
        iArr[isAnyStoryPageType ? 1 : 0] = i4;
        if (!isAnyStoryPageType) {
            SharedConfig.setMediaColumnsCount(i4);
        } else if (getStoriesCount(mediaPage.selectedType) >= 5) {
            SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
        }
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i5 >= mediaPageArr2.length) {
                break;
            }
            MediaPage mediaPage2 = mediaPageArr2[i5];
            if (mediaPage2 != null && mediaPage2.listView != null && isTabZoomable(this.mediaPages[i5].selectedType) && (adapter = this.mediaPages[i5].listView.getAdapter()) != null) {
                int itemCount = adapter.getItemCount();
                if (i5 == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                this.mediaPages[i5].animationSupportingListView.setVisibility(8);
                this.mediaPages[i5].layoutManager.setSpanCount(this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0]);
                this.mediaPages[i5].listView.invalidateItemDecorations();
                this.mediaPages[i5].listView.invalidate();
                if (adapter.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i5].listView);
                } else {
                    adapter.notifyDataSetChanged();
                }
            }
            i5++;
        }
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr3 = this.mediaPages;
            if (i >= mediaPageArr3.length) {
                return;
            }
            MediaPage mediaPage3 = mediaPageArr3[i];
            if (mediaPage3.selectedType == this.changeColumnsTab) {
                View findViewByPosition = mediaPage3.animationSupportingLayoutManager.findViewByPosition(this.pinchCenterPosition);
                if (findViewByPosition != null) {
                    this.pinchCenterOffset = findViewByPosition.getTop();
                }
                this.mediaPages[i].layoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, (-this.mediaPages[i].listView.getPaddingTop()) + this.pinchCenterOffset);
            }
            i++;
        }
    }

    private void animateToMediaColumnsCount(final int i) {
        final MediaPage mediaPage = getMediaPage(this.changeColumnsTab);
        this.pinchCenterPosition = -1;
        if (mediaPage != null) {
            mediaPage.listView.stopScroll();
            this.animateToColumnsCount = i;
            mediaPage.animationSupportingListView.setVisibility(0);
            if (isAnyStoryPageType(this.changeColumnsTab)) {
                mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
            } else {
                mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
            }
            InternalListView internalListView = mediaPage.animationSupportingListView;
            int paddingLeft = mediaPage.animationSupportingListView.getPaddingLeft();
            InternalListView internalListView2 = mediaPage.animationSupportingListView;
            int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
            internalListView2.hintPaddingTop = pagePaddingTop;
            int paddingRight = mediaPage.animationSupportingListView.getPaddingRight();
            InternalListView internalListView3 = mediaPage.animationSupportingListView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            internalListView3.hintPaddingBottom = pagePaddingBottom;
            internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            mediaPage.animationSupportingLayoutManager.setSpanCount(i);
            mediaPage.animationSupportingListView.invalidateItemDecorations();
            int i2 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i2 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage2 = mediaPageArr[i2];
                if (mediaPage2 != null && isTabZoomable(mediaPage2.selectedType)) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i2].listView);
                }
                i2++;
            }
            this.photoVideoChangeColumnsAnimation = true;
            if (this.changeColumnsTab == 0) {
                this.sharedMediaData[0].setListFrozen(true);
            }
            this.photoVideoChangeColumnsProgress = 0.0f;
            saveScrollPosition();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.notificationsLocker.lock();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.37
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0;
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.38
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RecyclerView.Adapter adapter;
                    SharedMediaLayout.this.notificationsLocker.unlock();
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    SharedMediaLayout.this.mediaColumnsCount[i3] = i;
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                if (adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout.this.saveScrollPosition();
                }
            });
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.scrollSlidingTextTabStrip != null) {
            canvas.save();
            canvas.translate(this.scrollSlidingTextTabStrip.getX(), this.scrollSlidingTextTabStrip.getY());
            this.scrollSlidingTextTabStrip.drawBackground(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null && fragmentContextView.isCallStyle() && this.topPanelLayout == null) {
            canvas.save();
            canvas.translate(this.fragmentContextView.getX(), this.fragmentContextView.getY());
            this.fragmentContextView.setDrawOverlay(true);
            this.fragmentContextView.draw(canvas);
            this.fragmentContextView.setDrawOverlay(false);
            canvas.restore();
        }
    }

    private ScrollSlidingTextTabStripInner createScrollingTextTabStrip(Context context) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = new ScrollSlidingTextTabStripInner(context, this.resourcesProvider) { // from class: org.telegram.ui.Components.SharedMediaLayout.39
            @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
            protected int processColor(int i) {
                return SharedMediaLayout.this.processColor(i);
            }
        };
        int i = this.initialTab;
        if (i != -1) {
            scrollSlidingTextTabStripInner.setInitialTabId(i);
            this.initialTab = -1;
        }
        scrollSlidingTextTabStripInner.animationDuration = 320L;
        scrollSlidingTextTabStripInner.setColors(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector);
        scrollSlidingTextTabStripInner.setUseMinimalWidth(true);
        scrollSlidingTextTabStripInner.setDelegate(new 40());
        return scrollSlidingTextTabStripInner;
    }

    class 40 implements ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate {
        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate
        public boolean canReorder(int i) {
            return false;
        }

        40() {
        }

        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate
        public void onPageSelected(int i, boolean z) {
            if (SharedMediaLayout.this.mediaPages[0].selectedType == i) {
                return;
            }
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = SharedMediaLayout.this.storiesContainer;
            if (profileStoriesCollectionTabs != null && i == 8) {
                profileStoriesCollectionTabs.selectTabWithId(0, 1.0f);
            }
            SharedMediaLayout.this.mediaPages[1].selectedType = i;
            SharedMediaLayout.this.mediaPages[1].setVisibility(0);
            SharedMediaLayout.this.hideFloatingDateView(true);
            SharedMediaLayout.this.switchToCurrentSelectedMode(true);
            SharedMediaLayout.this.animatingForward = z;
            SharedMediaLayout.this.onSelectedTabChanged();
            SharedMediaLayout.this.animateSearchToOptions(!r5.isSearchItemVisible(i), true);
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate
        public void onSamePageSelected() {
            SharedMediaLayout.this.scrollToTop();
        }

        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate
        public void onPageScrolled(float f) {
            if (f != 1.0f || SharedMediaLayout.this.mediaPages[1].getVisibility() == 0) {
                if (SharedMediaLayout.this.animatingForward) {
                    SharedMediaLayout.this.mediaPages[0].setTranslationX((-f) * SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                    SharedMediaLayout.this.mediaPages[1].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() - (SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f));
                } else {
                    SharedMediaLayout.this.mediaPages[0].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f);
                    SharedMediaLayout.this.mediaPages[1].setTranslationX((SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f) - SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                }
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.onTabProgress(sharedMediaLayout.getTabProgress());
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                sharedMediaLayout2.optionsAlpha = sharedMediaLayout2.getPhotoVideoOptionsAlpha(f);
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                sharedMediaLayout3.photoVideoOptionsItem.setVisibility((sharedMediaLayout3.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                if (SharedMediaLayout.this.searchItem != null && !SharedMediaLayout.this.canShowSearchItem()) {
                    SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    SharedMediaLayout.this.searchAlpha = 0.0f;
                } else {
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    sharedMediaLayout4.searchAlpha = sharedMediaLayout4.getSearchAlpha(f);
                    SharedMediaLayout.this.updateSearchItemIconAnimated();
                }
                SharedMediaLayout.this.updateOptionsSearch();
                if (f == 1.0f) {
                    MediaPage mediaPage = SharedMediaLayout.this.mediaPages[0];
                    SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                    SharedMediaLayout.this.mediaPages[1] = mediaPage;
                    SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                    if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                        SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    }
                    SharedMediaLayout.this.searchItemState = 0;
                    SharedMediaLayout.this.startStopVisibleGifs();
                }
            }
        }

        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate
        public boolean showOptions(final int i, View view) {
            TLRPC.ProfileTab profileTab;
            if (SharedMediaLayout.this.profileActivity == null || SharedMediaLayout.getTab(i, SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) == null) {
                return false;
            }
            if (!(SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull)) {
                if (SharedMediaLayout.this.dialog_id != SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() || SharedMediaLayout.this.userInfo == null) {
                    return false;
                }
                profileTab = SharedMediaLayout.this.userInfo.main_tab;
            } else {
                if (!ChatObject.canUserDoAction(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(SharedMediaLayout.this.info.id)), 5)) {
                    return false;
                }
                profileTab = SharedMediaLayout.this.info.main_tab;
            }
            if (profileTab != null && (i == SharedMediaLayout.getTabId(profileTab) || SharedMediaLayout.this.firstTab == i)) {
                return false;
            }
            ItemOptions makeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view);
            makeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(Theme.key_windowBackgroundWhite)));
            makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$40$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.40.this.lambda$showOptions$0(i);
                }
            });
            makeOptions.show();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void lambda$showOptions$0(int i) {
            TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) {
                TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                tL_channels_setMainProfileTab.tab = SharedMediaLayout.getTab(i, true);
                tL_channels_setMainProfileTab.channel = SharedMediaLayout.this.profileActivity.getMessagesController().getInputChannel(SharedMediaLayout.this.info.id);
                SharedMediaLayout.this.info.flags2 |= TLObject.FLAG_22;
                SharedMediaLayout.this.info.main_tab = tL_channels_setMainProfileTab.tab;
                tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
            } else {
                TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                tL_account_setMainProfileTab2.tab = SharedMediaLayout.getTab(i, true);
                tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                if (SharedMediaLayout.this.userInfo != null) {
                    SharedMediaLayout.this.userInfo.flags2 |= 1048576;
                    SharedMediaLayout.this.userInfo.main_tab = tL_account_setMainProfileTab2.tab;
                    SharedMediaLayout.this.profileActivity.getMessagesStorage().updateUserInfo(SharedMediaLayout.this.userInfo, true);
                    tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                }
            }
            SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
            SharedMediaLayout.this.updateTabs(true);
        }
    }

    protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    /* renamed from: startAlbumsReorder, reason: merged with bridge method [inline-methods] */
    public void lambda$onItemLongClick$58(int i) {
        MediaPage mediaPage;
        if (storyAlbums_getAlbumIdByTabType(getClosestTab()) != i) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            if (profileStoriesCollectionTabs != null) {
                profileStoriesCollectionTabs.lambda$setInitialTabId$2(i);
                return;
            }
            return;
        }
        this.storiesContainer.setReorderingAlbums(true);
        StoryAlbumData storyAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        if (storyAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        InternalListView internalListView = mediaPage.listView;
        for (int i2 = 0; i2 < internalListView.getChildCount(); i2++) {
            View childAt = internalListView.getChildAt(i2);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(true, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(true);
        }
        updateOptionsSearch(true);
    }

    public void saveAndStopAlbumsReorder() {
        MediaPage mediaPage;
        StoryAlbumData storyAlbums_getByAlbumId = storyAlbums_getByAlbumId(storyAlbums_getAlbumIdByTabType(getClosestTab()));
        if (storyAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        this.storiesContainer.resetReordering();
        InternalListView internalListView = mediaPage.listView;
        for (int i = 0; i < internalListView.getChildCount(); i++) {
            View childAt = internalListView.getChildAt(i);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(false, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openStoryTabIdPage(int i, boolean z) {
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr[0].selectedType == i) {
            return;
        }
        MediaPage mediaPage = mediaPageArr[1];
        mediaPage.selectedType = i;
        mediaPage.setVisibility(0);
        hideFloatingDateView(true);
        switchToCurrentSelectedMode(true);
        this.animatingForward = z;
        onSelectedTabChanged();
        animateSearchToOptions(!isSearchItemVisible(i), true);
        updateOptionsSearch(true);
    }

    public void onPageMediaProgress(float f) {
        if (f != 1.0f || this.mediaPages[1].getVisibility() == 0) {
            if (this.animatingForward) {
                this.mediaPages[0].setTranslationX((-f) * r2.getMeasuredWidth());
                this.mediaPages[1].setTranslationX(r2[0].getMeasuredWidth() - (this.mediaPages[0].getMeasuredWidth() * f));
            } else {
                this.mediaPages[0].setTranslationX(r2.getMeasuredWidth() * f);
                this.mediaPages[1].setTranslationX((r2[0].getMeasuredWidth() * f) - this.mediaPages[0].getMeasuredWidth());
            }
            onTabProgress(getTabProgress());
            float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(f);
            this.optionsAlpha = photoVideoOptionsAlpha;
            this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
            if (this.searchItem != null && !canShowSearchItem()) {
                this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                this.searchAlpha = 0.0f;
            } else {
                this.searchAlpha = getSearchAlpha(f);
                updateSearchItemIconAnimated();
            }
            updateOptionsSearch();
            if (f == 1.0f) {
                MediaPage[] mediaPageArr = this.mediaPages;
                MediaPage mediaPage = mediaPageArr[0];
                mediaPageArr[0] = mediaPageArr[1];
                mediaPageArr[1] = mediaPage;
                mediaPage.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem = this.searchItem;
                if (actionBarMenuItem != null && this.searchItemState == 2) {
                    actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                }
                this.searchItemState = 0;
                startStopVisibleGifs();
            }
        }
    }

    private boolean fillMediaData(int i) {
        SharedMediaData[] sharedMediaData = this.sharedMediaPreloader.getSharedMediaData();
        if (sharedMediaData == null) {
            return false;
        }
        if (i == 0) {
            SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
            if (!sharedMediaData2.fastScrollDataLoaded) {
                int[] iArr = sharedMediaData2.totalCount;
                int[] iArr2 = sharedMediaData[i].totalCount;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = this.sharedMediaData[i].totalCount;
            int[] iArr4 = sharedMediaData[i].totalCount;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        this.sharedMediaData[i].messages.addAll(sharedMediaData[i].messages);
        this.sharedMediaData[i].sections.addAll(sharedMediaData[i].sections);
        for (Map.Entry entry : sharedMediaData[i].sectionArrays.entrySet()) {
            this.sharedMediaData[i].sectionArrays.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.sharedMediaData[i].messagesDict[i2] = sharedMediaData[i].messagesDict[i2].clone();
            SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
            int[] iArr5 = sharedMediaData3.max_id;
            SharedMediaData sharedMediaData4 = sharedMediaData[i];
            iArr5[i2] = sharedMediaData4.max_id[i2];
            sharedMediaData3.endReached[i2] = sharedMediaData4.endReached[i2];
        }
        this.sharedMediaData[i].fastScrollPeriods.addAll(sharedMediaData[i].fastScrollPeriods);
        return !sharedMediaData[i].messages.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingDateView(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        if (this.floatingDateView.getTag() == null) {
            return;
        }
        this.floatingDateView.setTag(null);
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.floatingDateAnimation = null;
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingDateAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.additionalFloatingTranslation));
            this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.41
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SharedMediaLayout.this.floatingDateAnimation = null;
                }
            });
            this.floatingDateAnimation.start();
            return;
        }
        this.floatingDateView.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToTop() {
        int itemSize;
        int i = this.mediaPages[0].selectedType;
        if (i == 0) {
            itemSize = SharedPhotoVideoCell.getItemSize(1);
        } else {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    itemSize = AndroidUtilities.dp(100.0f);
                } else if (i != 4) {
                    if (i == 5) {
                        itemSize = AndroidUtilities.dp(60.0f);
                    } else {
                        itemSize = AndroidUtilities.dp(58.0f);
                    }
                }
            }
            itemSize = AndroidUtilities.dp(56.0f);
        }
        if ((this.mediaPages[0].selectedType == 0 ? r3.layoutManager.findFirstVisibleItemPosition() / this.mediaColumnsCount[0] : r3.layoutManager.findFirstVisibleItemPosition()) * itemSize >= this.mediaPages[0].listView.getMeasuredHeight() * 1.2f) {
            this.mediaPages[0].scrollHelper.setScrollDirection(1);
            this.mediaPages[0].scrollHelper.scrollToPosition(0, 0, false, true);
        } else {
            this.mediaPages[0].listView.smoothScrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLoadMoreScroll(MediaPage mediaPage, final RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        int i;
        int i2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        StoriesController.StoriesList storiesList;
        if (this.photoVideoChangeColumnsAnimation || this.jumpToRunnable != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (recyclerListView.getFastScroll() == null || !recyclerListView.getFastScroll().isPressed() || currentTimeMillis - mediaPage.lastCheckScrollTime >= 300) {
            mediaPage.lastCheckScrollTime = currentTimeMillis;
            if ((this.searching && this.searchWas && mediaPage.selectedType != 11) || mediaPage.selectedType == 7) {
                return;
            }
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int abs = findFirstVisibleItemPosition == -1 ? 0 : Math.abs(linearLayoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
            int itemCount = recyclerListView.getAdapter() == null ? 0 : recyclerListView.getAdapter().getItemCount();
            final int i3 = mediaPage.selectedType;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                itemCount = this.sharedMediaData[i3].getStartOffset() + this.sharedMediaData[i3].messages.size();
                SharedMediaData sharedMediaData = this.sharedMediaData[i3];
                if (sharedMediaData.fastScrollDataLoaded && sharedMediaData.fastScrollPeriods.size() > 2 && mediaPage.selectedType == 0 && this.sharedMediaData[i3].messages.size() != 0) {
                    float f = i3 == 0 ? this.mediaColumnsCount[0] : 1;
                    int measuredHeight = (int) ((recyclerListView.getMeasuredHeight() / (recyclerListView.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((Period) this.sharedMediaData[i3].fastScrollPeriods.get(1)).startOffset) {
                        measuredHeight = ((Period) this.sharedMediaData[i3].fastScrollPeriods.get(1)).startOffset;
                    }
                    if ((findFirstVisibleItemPosition > itemCount && findFirstVisibleItemPosition - itemCount > measuredHeight) || ((i = findFirstVisibleItemPosition + abs) < this.sharedMediaData[i3].startOffset && this.sharedMediaData[0].startOffset - i > measuredHeight)) {
                        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedMediaLayout.this.lambda$checkLoadMoreScroll$35(i3, recyclerListView);
                            }
                        };
                        this.jumpToRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable);
                        return;
                    }
                }
            }
            int i4 = mediaPage.selectedType;
            if (i4 == 7) {
                return;
            }
            if (isAnyStoryPageType(i4)) {
                StoriesAdapter storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPage.selectedType);
                if (storyAlbums_getStoriesAdapterByTabType == null || (storiesList = storyAlbums_getStoriesAdapterByTabType.storiesList) == null || findFirstVisibleItemPosition + abs <= storiesList.getLoadedCount() - this.mediaColumnsCount[1]) {
                    return;
                }
                storyAlbums_getStoriesAdapterByTabType.load(false);
                return;
            }
            int i5 = mediaPage.selectedType;
            if (i5 == 6) {
                if (abs <= 0 || this.commonGroupsAdapter.endReached || this.commonGroupsAdapter.loading || this.commonGroupsAdapter.chats.isEmpty() || findFirstVisibleItemPosition + abs < itemCount - 5) {
                    return;
                }
                CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
                commonGroupsAdapter.getChats(((TLRPC.Chat) commonGroupsAdapter.chats.get(this.commonGroupsAdapter.chats.size() - 1)).id, 100);
                return;
            }
            if (i5 == 11) {
                int i6 = -1;
                for (int i7 = 0; i7 < mediaPage.listView.getChildCount(); i7++) {
                    i6 = Math.max(mediaPage.listView.getChildAdapterPosition(mediaPage.listView.getChildAt(i7)), i6);
                }
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                if (adapter == savedMessagesSearchAdapter) {
                    if (i6 + 1 >= savedMessagesSearchAdapter.dialogs.size() + this.savedMessagesSearchAdapter.loadedMessages.size()) {
                        this.savedMessagesSearchAdapter.loadMore();
                        return;
                    }
                    return;
                } else {
                    if (i6 + 1 >= this.profileActivity.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        this.profileActivity.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                }
            }
            int i8 = 10;
            if (i5 == 10 || i5 == 12 || i5 == 13 || i5 == 14) {
                return;
            }
            if (i5 == 0) {
                i8 = 3;
            } else if (i5 != 5) {
                i8 = 6;
            }
            int i9 = i5 == 15 ? 8 : i5;
            if (abs + findFirstVisibleItemPosition > itemCount - i8 || this.sharedMediaData[i9].loadingAfterFastScroll) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[i9];
                if (!sharedMediaData2.loading) {
                    if (i5 == 0) {
                        int i10 = sharedMediaDataArr[0].filterType;
                        i2 = i10 == 1 ? 6 : i10 == 2 ? 7 : 0;
                    } else {
                        i2 = i5 == 1 ? 1 : i5 == 2 ? 2 : i5 == 4 ? 4 : i5 == 5 ? 5 : i5 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = sharedMediaData2.endReached;
                    if (!zArr[0]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, this.sharedMediaData[i9].max_id[0], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i9].requestIndex, null, null);
                    } else if (this.mergeDialogId != 0 && !zArr[1]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[i9].max_id[1], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i9].requestIndex, null, null);
                    }
                }
            }
            int i11 = this.sharedMediaData[i9].startOffset;
            if (i9 == 0) {
                i11 = this.photoVideoAdapter.getPositionForIndex(0);
            }
            if (findFirstVisibleItemPosition - i11 < i8 + 1) {
                SharedMediaData sharedMediaData3 = this.sharedMediaData[i9];
                if (!sharedMediaData3.loading && !sharedMediaData3.startReached && !sharedMediaData3.loadingAfterFastScroll) {
                    loadFromStart(mediaPage.selectedType);
                }
            }
            if (this.mediaPages[0].listView == recyclerListView) {
                int i12 = this.mediaPages[0].selectedType;
                if ((i12 != 0 && i12 != 5) || findFirstVisibleItemPosition == -1 || (findViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) == null) {
                    return;
                }
                if (findViewHolderForAdapterPosition.getItemViewType() == 0 || findViewHolderForAdapterPosition.getItemViewType() == 12) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    if (view instanceof SharedPhotoVideoCell) {
                        MessageObject messageObject = ((SharedPhotoVideoCell) view).getMessageObject(0);
                        if (messageObject != null) {
                            this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
                            return;
                        }
                        return;
                    }
                    if (view instanceof ContextLinkCell) {
                        this.floatingDateView.setCustomDate(((ContextLinkCell) view).getDate(), false, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkLoadMoreScroll$35(int i, RecyclerListView recyclerListView) {
        findPeriodAndJumpToDate(i, recyclerListView, false);
        this.jumpToRunnable = null;
    }

    private void loadFromStart(int i) {
        int i2;
        if (i == 0) {
            int i3 = this.sharedMediaData[0].filterType;
            i2 = i3 == 1 ? 6 : i3 == 2 ? 7 : 0;
        } else {
            i2 = i == 1 ? 1 : i == 2 ? 2 : i == 4 ? 4 : i == 5 ? 5 : 3;
        }
        this.sharedMediaData[i].loading = true;
        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, this.sharedMediaData[i].min_id, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i].requestIndex, null, null);
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    public RLottieImageView getSearchOptionsItem() {
        return this.optionsSearchImageView;
    }

    public TextView getSaveItem() {
        return this.saveItem;
    }

    public boolean isSearchItemVisible() {
        return isSearchItemVisible(this.mediaPages[0].selectedType);
    }

    public boolean isSearchItemVisible(int i) {
        if (i == 7) {
            return this.delegate.canSearchMembers();
        }
        return (isSearchingStories() || i == 0 || isAnyStoryPageType(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14) ? false : true;
    }

    public boolean isTabZoomable(int i) {
        return i == 0 || isAnyStoryPageType(i);
    }

    public boolean isCalendarItemVisible() {
        int i = this.mediaPages[0].selectedType;
        return i == 0 || isAnyStoryPageType(i) || this.mediaPages[0].selectedType == 11;
    }

    public boolean isOptionsItemVisible() {
        ProfileGiftsContainer profileGiftsContainer;
        int i = this.mediaPages[0].selectedType;
        return i == 0 || isAnyStoryPageType(i) || i == 11 || i == 13 || (i == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter());
    }

    public int getSelectedTab() {
        int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = profileStoriesCollectionTabs.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? storyAlbums_getByAlbumId(currentAlbumId).tabType : currentTabId;
    }

    public int getClosestTab() {
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && mediaPage.getVisibility() == 0) {
            if (this.tabsAnimationInProgress && !this.backAnimation) {
                return this.mediaPages[1].selectedType;
            }
            if (Math.abs(this.mediaPages[1].getTranslationX()) < this.mediaPages[1].getMeasuredWidth() / 2.0f) {
                return this.mediaPages[1].selectedType;
            }
        }
        return getSelectedTab();
    }

    protected void onSelectedTabChanged() {
        boolean z = isStoriesView() || isArchivedOnlyStoriesView();
        if (this.archivedStoriesAdapter.poller != null) {
            this.archivedStoriesAdapter.poller.start(z && getClosestTab() == 9);
        }
        if (this.storiesAdapter.poller != null) {
            this.storiesAdapter.poller.start(z && getClosestTab() == 8);
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            StoriesAdapter storiesAdapter = storyAlbumData.adapter;
            if (storiesAdapter.storiesList != null) {
                storiesAdapter.poller.start(z && getClosestTab() == storyAlbumData.tabType);
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            SearchTagsList searchTagsList = this.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((searchTagsList != null && searchTagsList.hasFilters() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        checkStoriesTabsPosition();
    }

    public void onDestroy() {
        this.observersGroup.removeAllObservers();
        SearchTagsList searchTagsList = this.searchTagsList;
        if (searchTagsList != null) {
            searchTagsList.detach();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesAdapter.storiesList != null) {
            storiesAdapter.destroy();
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesAdapter2.storiesList != null) {
            storiesAdapter2.destroy();
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            StoriesAdapter storiesAdapter3 = ((StoryAlbumData) it.next()).adapter;
            if (storiesAdapter3.storiesList != null) {
                storiesAdapter3.destroy();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCurrentTabValid() {
        if (this.scrollSlidingTextTabStrip.hasTab(this.scrollSlidingTextTabStrip.getCurrentTabId())) {
            return;
        }
        int firstTabId = this.scrollSlidingTextTabStrip.getFirstTabId();
        this.scrollSlidingTextTabStrip.setInitialTabId(firstTabId);
        this.mediaPages[0].selectedType = firstTabId;
        switchToCurrentSelectedMode(false);
    }

    public void setNewMediaCounts(int[] iArr) {
        for (int i = 0; i <= 6 && this.hasMedia[i] < 0; i++) {
        }
        System.arraycopy(iArr, 0, this.hasMedia, 0, 6);
        updateTabs(true);
        checkCurrentTabValid();
        if (this.hasMedia[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    private void loadFastScrollData(boolean z) {
        if (this.topicId != 0 || isSearchingStories()) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = supportedFastScrollTypes;
            if (i >= iArr.length) {
                return;
            }
            final int i2 = iArr[i];
            if ((this.sharedMediaData[i2].fastScrollDataLoaded && !z) || DialogObject.isEncryptedDialog(this.dialog_id)) {
                return;
            }
            this.sharedMediaData[i2].fastScrollDataLoaded = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i2 == 0) {
                int i3 = this.sharedMediaData[i2].filterType;
                if (i3 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i3 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i2 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            tL_messages_getSearchResultsPositions.peer = this.profileActivity.getMessagesController().getInputPeer(this.dialog_id);
            if (this.topicId != 0 && this.profileActivity.getUserConfig().getClientUserId() == this.dialog_id) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = this.profileActivity.getMessagesController().getInputPeer(this.topicId);
            }
            final int i4 = this.sharedMediaData[i2].requestIndex;
            ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout.this.lambda$loadFastScrollData$39(i4, i2, tLObject, tL_error);
                }
            }), this.profileActivity.getClassGuid());
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFastScrollData$39(final int i, final int i2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$loadFastScrollData$38(tL_error, i, i2, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFastScrollData$38(final TLRPC.TL_error tL_error, final int i, final int i2, final TLObject tLObject) {
        NotificationCenter.getInstance(this.profileActivity.getCurrentAccount()).doOnIdle(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$loadFastScrollData$37(tL_error, i, i2, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadFastScrollData$37(TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject) {
        if (tL_error != null) {
            return;
        }
        SharedMediaData sharedMediaData = this.sharedMediaData[i2];
        if (i != sharedMediaData.requestIndex) {
            return;
        }
        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) tLObject;
        sharedMediaData.fastScrollPeriods.clear();
        int size = tL_messages_searchResultsPositions.positions.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i4);
            if (tL_searchResultPosition.date != 0) {
                this.sharedMediaData[i2].fastScrollPeriods.add(new Period(tL_searchResultPosition));
            }
        }
        Collections.sort(this.sharedMediaData[i2].fastScrollPeriods, new Comparator() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda68
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$loadFastScrollData$36;
                lambda$loadFastScrollData$36 = SharedMediaLayout.lambda$loadFastScrollData$36((SharedMediaLayout.Period) obj, (SharedMediaLayout.Period) obj2);
                return lambda$loadFastScrollData$36;
            }
        });
        this.sharedMediaData[i2].setTotalCount(0, tL_messages_searchResultsPositions.count);
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i2];
        sharedMediaData2.fastScrollDataLoaded = true;
        if (!sharedMediaData2.fastScrollPeriods.isEmpty()) {
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i3 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage = mediaPageArr[i3];
                if (mediaPage.selectedType == i2) {
                    mediaPage.fastScrollEnabled = true;
                    updateFastScrollVisibility(mediaPage, true);
                }
                i3++;
            }
        }
        this.photoVideoAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadFastScrollData$36(Period period, Period period2) {
        return period2.date - period.date;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showFastScrollHint(final MediaPage mediaPage, SharedMediaData[] sharedMediaDataArr, boolean z) {
        Runnable runnable;
        if (z) {
            if (SharedConfig.fastScrollHintCount <= 0 || mediaPage.fastScrollHintView != null || mediaPage.fastScrollHinWasShown || mediaPage.listView.getFastScroll() == null || !mediaPage.listView.getFastScroll().isVisible || mediaPage.listView.getFastScroll().getVisibility() != 0 || sharedMediaDataArr[0].getTotalCount() < 50) {
                return;
            }
            SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
            mediaPage.fastScrollHinWasShown = true;
            final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = new SharedMediaFastScrollTooltip(mediaPage.getContext());
            mediaPage.fastScrollHintView = sharedMediaFastScrollTooltip;
            mediaPage.addView(sharedMediaFastScrollTooltip, LayoutHelper.createFrame(-2, -2.0f));
            mediaPage.fastScrollHintView.setAlpha(0.0f);
            mediaPage.fastScrollHintView.setScaleX(0.8f);
            mediaPage.fastScrollHintView.setScaleY(0.8f);
            mediaPage.fastScrollHintView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            mediaPage.invalidate();
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.lambda$showFastScrollHint$40(SharedMediaLayout.MediaPage.this, sharedMediaFastScrollTooltip);
                }
            };
            mediaPage.fastScrollHideHintRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 4000L);
            return;
        }
        if (mediaPage.fastScrollHintView == null || (runnable = mediaPage.fastScrollHideHintRunnable) == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
        mediaPage.fastScrollHideHintRunnable.run();
        mediaPage.fastScrollHideHintRunnable = null;
        mediaPage.fastScrollHintView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showFastScrollHint$40(MediaPage mediaPage, final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip) {
        mediaPage.fastScrollHintView = null;
        mediaPage.fastScrollHideHintRunnable = null;
        sharedMediaFastScrollTooltip.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.42
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (SharedMediaFastScrollTooltip.this.getParent() != null) {
                    ((ViewGroup) SharedMediaFastScrollTooltip.this.getParent()).removeView(SharedMediaFastScrollTooltip.this);
                }
            }
        }).start();
    }

    public void setCommonGroupsCount(int i) {
        if (this.topicId == 0) {
            this.hasMedia[6] = i;
        }
        updateTabs(true);
        checkCurrentTabValid();
    }

    public void onActionBarItemClick(View view, int i) {
        BotPreviewsEditContainer botPreviewsEditContainer;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChat;
        boolean z;
        TLRPC.User user2;
        if (i == 101) {
            if (isAnyStoryPageType(getSelectedTab()) || getSelectedTab() == 13) {
                if (this.selectedFiles[0] != null) {
                    if (isBot() && (botPreviewsEditContainer = this.botPreviewsContainer) != null && botPreviewsEditContainer.getCurrentList() != null) {
                        final StoriesController.BotPreviewsList currentList = this.botPreviewsContainer.getCurrentList();
                        final ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < this.selectedFiles[0].size(); i2++) {
                            TL_stories.StoryItem storyItem = ((MessageObject) this.selectedFiles[0].valueAt(i2)).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem.media);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                        builder.setTitle(LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle));
                        builder.setMessage(LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList.size(), new Object[0]));
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda43
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                SharedMediaLayout.this.lambda$onActionBarItemClick$41(currentList, arrayList, alertDialog, i3);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda44
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i3) {
                                alertDialog.dismiss();
                            }
                        });
                        AlertDialog create = builder.create();
                        create.show();
                        create.redPositive();
                        return;
                    }
                    final ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < this.selectedFiles[0].size(); i3++) {
                        TL_stories.StoryItem storyItem2 = ((MessageObject) this.selectedFiles[0].valueAt(i3)).storyItem;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                    builder2.setTitle(LocaleController.getString(arrayList2.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle));
                    builder2.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList2.size(), new Object[0]));
                    builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda45
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            SharedMediaLayout.this.lambda$onActionBarItemClick$43(arrayList2, alertDialog, i4);
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda46
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            alertDialog.dismiss();
                        }
                    });
                    AlertDialog create2 = builder2.create();
                    create2.show();
                    create2.redPositive();
                    return;
                }
                return;
            }
            if (getSelectedTab() == 11) {
                SavedMessagesController savedMessagesController = this.profileActivity.getMessagesController().getSavedMessagesController();
                final ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < savedMessagesController.allDialogs.size(); i4++) {
                    long j = savedMessagesController.allDialogs.get(i4).dialogId;
                    if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j))) {
                        arrayList3.add(Long.valueOf(j));
                    }
                }
                String str = "";
                if (arrayList3.isEmpty()) {
                    z = false;
                } else {
                    Long l = (Long) arrayList3.get(0);
                    long longValue = l.longValue();
                    z = longValue == this.profileActivity.getUserConfig().getClientUserId();
                    if (longValue < 0) {
                        TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-longValue));
                        if (chat2 != null) {
                            str = chat2.title;
                        }
                    } else if (longValue >= 0 && (user2 = this.profileActivity.getMessagesController().getUser(l)) != null) {
                        if (UserObject.isAnonymous(user2)) {
                            str = LocaleController.getString(R.string.AnonymousForward);
                        } else {
                            str = UserObject.getUserName(user2);
                        }
                    }
                }
                AlertDialog create3 = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, str) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList3.size(), new Object[0])).setMessage(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, str) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList3.size(), new Object[0])).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda41
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i5) {
                        SharedMediaLayout.this.lambda$onActionBarItemClick$45(arrayList3, alertDialog, i5);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                this.profileActivity.showDialog(create3);
                TextView textView = (TextView) create3.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                encryptedChat = this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.dialog_id)));
                user = null;
                chat = null;
            } else if (DialogObject.isUserDialog(this.dialog_id)) {
                user = this.profileActivity.getMessagesController().getUser(Long.valueOf(this.dialog_id));
                chat = null;
                encryptedChat = null;
            } else {
                chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                user = null;
                encryptedChat = null;
            }
            AlertsCreator.createDeleteMessagesAlert(this.profileActivity, user, chat, encryptedChat, null, this.mergeDialogId, null, this.selectedFiles, null, 0, 0, null, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda42
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$onActionBarItemClick$46();
                }
            }, null, this.resourcesProvider);
            return;
        }
        if (i == 100) {
            if (this.userInfo != null && this.profileActivity.getMessagesController().isUserNoForwards(this.userInfo)) {
                HintView hintView = this.fwdRestrictedHint;
                if (hintView != null) {
                    hintView.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            if (this.info != null) {
                TLRPC.Chat chat3 = this.profileActivity.getMessagesController().getChat(Long.valueOf(this.info.id));
                if (this.profileActivity.getMessagesController().isChatNoForwards(chat3)) {
                    HintView hintView2 = this.fwdRestrictedHint;
                    if (hintView2 != null) {
                        hintView2.setText((!ChatObject.isChannel(chat3) || chat3.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                        this.fwdRestrictedHint.showForView(view, true);
                        return;
                    }
                    return;
                }
            }
            if (hasNoforwardsMessage()) {
                HintView hintView3 = this.fwdRestrictedHint;
                if (hintView3 != null) {
                    hintView3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda47
                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public /* synthetic */ boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.-CC.$default$canSelectStories(this);
                }

                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList4, CharSequence charSequence, boolean z2, boolean z3, int i5, int i6, TopicsFragment topicsFragment) {
                    boolean lambda$onActionBarItemClick$47;
                    lambda$onActionBarItemClick$47 = SharedMediaLayout.this.lambda$onActionBarItemClick$47(dialogsActivity2, arrayList4, charSequence, z2, z3, i5, i6, topicsFragment);
                    return lambda$onActionBarItemClick$47;
                }

                @Override // org.telegram.ui.DialogsActivity.DialogsActivityDelegate
                public /* synthetic */ boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.-CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            this.profileActivity.presentFragment(dialogsActivity);
            return;
        }
        if (i == 102) {
            if (this.selectedFiles[0].size() + this.selectedFiles[1].size() != 1) {
                return;
            }
            SparseArray[] sparseArrayArr = this.selectedFiles;
            MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
            Bundle bundle2 = new Bundle();
            long dialogId = messageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle2.putLong("user_id", dialogId);
            } else {
                TLRPC.Chat chat4 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle2.putLong("migrated_to", dialogId);
                    dialogId = -chat4.migrated_to.channel_id;
                }
                bundle2.putLong("chat_id", -dialogId);
            }
            bundle2.putInt("message_id", messageObject.getId());
            bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
            ChatActivity chatActivity = new ChatActivity(bundle2);
            chatActivity.highlightMessageId = messageObject.getId();
            long j2 = this.topicId;
            if (j2 != 0) {
                ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(dialogId, j2));
                bundle2.putInt("message_id", messageObject.getId());
            }
            this.profileActivity.presentFragment(chatActivity, false);
            return;
        }
        if (i == 103 || i == 104) {
            if (getClosestTab() == 8) {
                StoriesAdapter storiesAdapter = this.storiesAdapter;
                if (storiesAdapter == null || storiesAdapter.storiesList == null) {
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                for (int i5 = 0; i5 < this.selectedFiles[0].size(); i5++) {
                    arrayList4.add(Integer.valueOf(((MessageObject) this.selectedFiles[0].valueAt(i5)).getId()));
                }
                pinOnUnpinStories(arrayList4, i == 103);
                closeActionMode(false);
                return;
            }
            SavedMessagesController savedMessagesController2 = this.profileActivity.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i6 = 0; i6 < savedMessagesController2.allDialogs.size(); i6++) {
                long j3 = savedMessagesController2.allDialogs.get(i6).dialogId;
                if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j3))) {
                    arrayList5.add(Long.valueOf(j3));
                }
            }
            if (savedMessagesController2.updatePinned(arrayList5, i == 103, true)) {
                int i7 = 0;
                while (true) {
                    MediaPage[] mediaPageArr = this.mediaPages;
                    if (i7 >= mediaPageArr.length) {
                        break;
                    }
                    MediaPage mediaPage = mediaPageArr[i7];
                    if (mediaPage.selectedType == 11) {
                        mediaPage.layoutManager.scrollToPositionWithOffset(0, 0);
                        break;
                    }
                    i7++;
                }
            } else {
                this.profileActivity.showDialog(new LimitReachedBottomSheet(this.profileActivity, getContext(), 33, this.profileActivity.getCurrentAccount(), null));
            }
            closeActionMode(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActionBarItemClick$41(StoriesController.BotPreviewsList botPreviewsList, ArrayList arrayList, AlertDialog alertDialog, int i) {
        botPreviewsList.delete(arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActionBarItemClick$43(ArrayList arrayList, AlertDialog alertDialog, int i) {
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActionBarItemClick$45(ArrayList arrayList, AlertDialog alertDialog, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.profileActivity.getMessagesController().deleteSavedDialog(((Long) arrayList.get(i2)).longValue());
        }
        closeActionMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActionBarItemClick$46() {
        showActionMode(false);
        this.actionBar.closeSearchField();
        this.cantDeleteMessagesCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onActionBarItemClick$47(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i3 = 1;
        while (true) {
            if (i3 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < this.selectedFiles[i3].size(); i4++) {
                arrayList3.add(Integer.valueOf(this.selectedFiles[i3].keyAt(i4)));
            }
            Collections.sort(arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num.intValue() > 0) {
                    arrayList2.add((MessageObject) this.selectedFiles[i3].get(num.intValue()));
                }
            }
            this.selectedFiles[i3].clear();
            i3--;
        }
        this.cantDeleteMessagesCount = 0;
        showActionMode(false);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == this.profileActivity.getUserConfig().getClientUserId() || charSequence != null) {
            updateRowsSelection(true);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                long j = ((MessagesStorage.TopicKey) arrayList.get(i5)).dialogId;
                if (charSequence != null) {
                    this.profileActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                this.profileActivity.getSendMessagesHelper().sendMessage(arrayList2, j, false, false, true, 0, 0L);
            }
            dialogsActivity.finishFragment();
            BaseFragment baseFragment = this.profileActivity;
            UndoView undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            if (undoView != null) {
                if (arrayList.size() == 1) {
                    undoView.showWithAction(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, 53, Integer.valueOf(arrayList2.size()));
                } else {
                    undoView.showWithAction(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), (Runnable) null, (Runnable) null);
                }
            }
        } else {
            long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j2)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
            } else {
                if (DialogObject.isUserDialog(j2)) {
                    bundle.putLong("user_id", j2);
                } else {
                    bundle.putLong("chat_id", -j2);
                }
                if (!this.profileActivity.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
                    return true;
                }
            }
            this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            ChatActivity chatActivity = new ChatActivity(bundle);
            ForumUtilities.applyTopic(chatActivity, (MessagesStorage.TopicKey) arrayList.get(0));
            dialogsActivity.presentFragment(chatActivity, true);
            chatActivity.showFieldPanelForForward(true, arrayList2);
        }
        return true;
    }

    private void pinOnUnpinStories(ArrayList arrayList, boolean z) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            return;
        }
        if (z && arrayList.size() > this.profileActivity.getMessagesController().storiesPinnedToTopCountMax) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
            return;
        }
        if (this.storiesAdapter.storiesList.updatePinned(arrayList, z)) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
        } else if (z) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_pin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0])).show();
        } else {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_unpin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectTabWithId(int i, float f) {
        if (this.scrollSlidingTextTabStrip != null) {
            this.scrollSlidingTextTabStrip.selectTabWithId(isStoryAlbumPageType(i) ? 8 : i, f);
        }
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(i)) {
                this.storiesContainer.selectTabWithId(storyAlbums_getAlbumIdByTabType(i), f);
            } else if (i == 8) {
                this.storiesContainer.selectTabWithId(0, f);
            }
        }
    }

    private int getNextPageId(boolean z) {
        int nextAlbumId;
        int closestTab = getClosestTab();
        int nextPageId = this.scrollSlidingTextTabStrip.getNextPageId(z);
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(closestTab) || closestTab == 8) {
                nextAlbumId = this.storiesContainer.getNextAlbumId(z);
            } else {
                nextAlbumId = (isStoryAlbumPageType(nextPageId) || nextPageId == 8) ? this.storiesContainer.getCurrentAlbumId() : -1;
            }
            if (nextAlbumId == 0) {
                return 8;
            }
            if (nextAlbumId > 0) {
                return storyAlbums_getByAlbumId(nextAlbumId).tabType;
            }
        }
        return nextPageId;
    }

    private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        MediaPage mediaPage;
        ProfileGiftsContainer profileGiftsContainer;
        BotPreviewsEditContainer botPreviewsEditContainer;
        int nextPageId = getNextPageId(z);
        if (nextPageId < 0) {
            return false;
        }
        if (this.searchItem != null && !canShowSearchItem()) {
            this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
            this.searchAlpha = 0.0f;
        } else {
            this.searchAlpha = getSearchAlpha(0.0f);
            updateSearchItemIcon(0.0f);
        }
        if (this.searching && getSelectedTab() == 11) {
            return false;
        }
        if (canEditStories() && this.isActionModeShowed && (getClosestTab() == 8 || isStoryAlbumPageType(getClosestTab()))) {
            return false;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null && !botPreviewsEditContainer.canScroll(z)) {
            return false;
        }
        MediaPage mediaPage3 = this.mediaPages[0];
        if (mediaPage3 != null && mediaPage3.selectedType == 14 && (profileGiftsContainer = this.giftsContainer) != null && !profileGiftsContainer.canScroll(z)) {
            return false;
        }
        if (this.isActionModeShowed && (mediaPage = this.mediaPages[0]) != null && mediaPage.selectedType == 13) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer2 = this.giftsContainer;
        if (profileGiftsContainer2 != null && profileGiftsContainer2.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
            return false;
        }
        updateOptionsSearch();
        getParent().requestDisallowInterceptTouchEvent(true);
        hideFloatingDateView(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        onTabScroll(true);
        this.startedTrackingX = (int) motionEvent.getX();
        this.actionBar.setEnabled(false);
        this.scrollSlidingTextTabStrip.setEnabled(false);
        MediaPage mediaPage4 = this.mediaPages[1];
        mediaPage4.selectedType = nextPageId;
        mediaPage4.setVisibility(0);
        this.animatingForward = z;
        switchToCurrentSelectedMode(true);
        if (z) {
            this.mediaPages[1].setTranslationX(r7[0].getMeasuredWidth());
        } else {
            this.mediaPages[1].setTranslationX(-r7[0].getMeasuredWidth());
        }
        onTabProgress(getTabProgress());
        return true;
    }

    @Override // android.view.View
    public void forceHasOverlappingRendering(boolean z) {
        super.forceHasOverlappingRendering(z);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i5 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i5].setTranslationY(this.topPadding - this.lastMeasuredTopPadding);
            i5++;
        }
        if (this.topPanelLayout != null) {
            checkUi_topPanelLayoutY();
        } else {
            FragmentContextView fragmentContextView = this.fragmentContextView;
            if (fragmentContextView != null) {
                fragmentContextView.setTranslationY(AndroidUtilities.dp(48.0f) + i2);
            }
        }
        this.additionalFloatingTranslation = i2;
        ChatActionCell chatActionCell = this.floatingDateView;
        chatActionCell.setTranslationY((chatActionCell.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.additionalFloatingTranslation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUi_topPanelLayoutY() {
        if (this.topPanelLayout != null) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            float f = 0.0f;
            if (profileStoriesCollectionTabs != null) {
                f = 0.0f + (AndroidUtilities.dp(38.0f) * this.storiesContainer.getVisibilityFactor() * (1.0f - Math.abs(profileStoriesCollectionTabs.getTranslationX() / this.storiesContainer.getMeasuredWidth())));
            }
            this.topPanelLayout.setTranslationY(this.topPadding + f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int height = this.delegate.getListView() != null ? this.delegate.getListView().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt instanceof MediaPage) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(height, TLObject.FLAG_30), 0);
                    MediaPage mediaPage = (MediaPage) childAt;
                    mediaPage.listView.setPadding(0, mediaPage.listView.topPadding, 0, mediaPage.listView.bottomPadding);
                } else {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean checkTabsAnimationInProgress() {
        AnimatorSet animatorSet;
        if (!this.tabsAnimationInProgress) {
            return false;
        }
        if (this.backAnimation) {
            if (Math.abs(this.mediaPages[0].getTranslationX()) < 1.0f) {
                this.mediaPages[0].setTranslationX(0.0f);
                this.mediaPages[1].setTranslationX(r0[0].getMeasuredWidth() * (this.animatingForward ? 1 : -1));
                animatorSet = this.tabsAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.tabsAnimation = null;
                }
                this.tabsAnimationInProgress = false;
            }
            onTabProgress(getTabProgress());
            return this.tabsAnimationInProgress;
        }
        if (Math.abs(this.mediaPages[1].getTranslationX()) < 1.0f) {
            this.mediaPages[0].setTranslationX(r0.getMeasuredWidth() * (this.animatingForward ? -1 : 1));
            this.mediaPages[1].setTranslationX(0.0f);
            animatorSet = this.tabsAnimation;
            if (animatorSet != null) {
            }
            this.tabsAnimationInProgress = false;
        }
        onTabProgress(getTabProgress());
        return this.tabsAnimationInProgress;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkTabsAnimationInProgress() || this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
    }

    public boolean isCurrentTabFirst() {
        return getSelectedTab() == this.scrollSlidingTextTabStrip.getFirstTabId();
    }

    public RecyclerListView getCurrentListView() {
        ChatActivityContainer chatActivityContainer;
        MediaPage mediaPage = this.mediaPages[0];
        int i = mediaPage.selectedType;
        if (i == 13) {
            return this.botPreviewsContainer.getCurrentListView();
        }
        if (i == 14) {
            return this.giftsContainer.getCurrentListView();
        }
        if (i != 12 || (chatActivityContainer = this.savedMessagesContainer) == null) {
            return mediaPage.listView;
        }
        return chatActivityContainer.chatActivity.getChatListView();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.disableScrolling || this.profileActivity.getParentLayout() == null || this.profileActivity.getParentLayout().checkTransitionAnimation() || checkTabsAnimationInProgress() || this.isInPinchToZoomTouchMode) {
            return false;
        }
        if (motionEvent != null) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            HintView hintView = this.fwdRestrictedHint;
            if (hintView != null) {
                hintView.hide();
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
            this.velocityTracker.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            int x = (int) (motionEvent.getX() - this.startedTrackingX);
            int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            if (this.startedTracking && (((z = this.animatingForward) && x > 0) || (!z && x < 0))) {
                if (!prepareForMoving(motionEvent, x < 0)) {
                    this.maybeStartTracking = true;
                    this.startedTracking = false;
                    onTabScroll(false);
                    this.mediaPages[0].setTranslationX(0.0f);
                    this.mediaPages[1].setTranslationX(this.animatingForward ? r4[0].getMeasuredWidth() : -r4[0].getMeasuredWidth());
                    selectTabWithId(this.mediaPages[1].selectedType, 0.0f);
                    onTabProgress(getTabProgress());
                }
            }
            if (!this.maybeStartTracking || this.startedTracking) {
                if (this.startedTracking) {
                    this.mediaPages[0].setTranslationX(x);
                    if (this.animatingForward) {
                        this.mediaPages[1].setTranslationX(r9[0].getMeasuredWidth() + x);
                    } else {
                        this.mediaPages[1].setTranslationX(x - r9[0].getMeasuredWidth());
                    }
                    float abs2 = Math.abs(x) / this.mediaPages[0].getMeasuredWidth();
                    if (!canShowSearchItem()) {
                        this.searchAlpha = 0.0f;
                    } else {
                        this.searchAlpha = getSearchAlpha(abs2);
                        updateSearchItemIcon(abs2);
                        float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(abs2);
                        this.optionsAlpha = photoVideoOptionsAlpha;
                        this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
                    }
                    updateOptionsSearch();
                    selectTabWithId(this.mediaPages[1].selectedType, abs2);
                    onTabProgress(getTabProgress());
                    onSelectedTabChanged();
                }
            } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > abs) {
                prepareForMoving(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            stopScroll(motionEvent);
        }
        return this.startedTracking;
    }

    public void scrollToPage(int i) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
        if (this.disableScrolling || (scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip) == null) {
            return;
        }
        scrollSlidingTextTabStripInner.scrollTo(i);
    }

    private void stopScroll(MotionEvent motionEvent) {
        float f;
        float f2;
        float measuredWidth;
        int measuredWidth2;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.maximumVelocity);
        if (motionEvent == null || motionEvent.getAction() == 3) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = this.velocityTracker.getXVelocity();
            f2 = this.velocityTracker.getYVelocity();
            if (!this.startedTracking && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                prepareForMoving(motionEvent, f < 0.0f);
            }
        }
        if (this.startedTracking) {
            float x = this.mediaPages[0].getX();
            this.tabsAnimation = new AnimatorSet();
            this.backAnimation = Math.abs(x) < ((float) this.mediaPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.lambda$stopScroll$48(valueAnimator);
                }
            });
            if (this.backAnimation) {
                measuredWidth = Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet = this.tabsAnimation;
                    MediaPage mediaPage = this.mediaPages[0];
                    Property property = View.TRANSLATION_X;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(mediaPage, (Property<MediaPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property, r11.getMeasuredWidth()), ofFloat);
                } else {
                    AnimatorSet animatorSet2 = this.tabsAnimation;
                    MediaPage mediaPage2 = this.mediaPages[0];
                    Property property2 = View.TRANSLATION_X;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mediaPage2, (Property<MediaPage, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property2, -r11.getMeasuredWidth()), ofFloat);
                }
            } else {
                measuredWidth = this.mediaPages[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet3 = this.tabsAnimation;
                    MediaPage mediaPage3 = this.mediaPages[0];
                    Property property3 = View.TRANSLATION_X;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(mediaPage3, (Property<MediaPage, Float>) property3, -mediaPage3.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property3, 0.0f), ofFloat);
                } else {
                    AnimatorSet animatorSet4 = this.tabsAnimation;
                    MediaPage mediaPage4 = this.mediaPages[0];
                    Property property4 = View.TRANSLATION_X;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(mediaPage4, (Property<MediaPage, Float>) property4, mediaPage4.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property4, 0.0f), ofFloat);
                }
            }
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth3 = getMeasuredWidth();
            float f3 = measuredWidth3 / 2;
            float distanceInfluenceForSnapDuration = f3 + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3);
            float abs = Math.abs(f);
            if (abs > 0.0f) {
                measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4;
            } else {
                measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
            }
            this.tabsAnimation.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
            this.tabsAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.43
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SharedMediaLayout.this.tabsAnimation = null;
                    if (SharedMediaLayout.this.backAnimation) {
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem != null && !SharedMediaLayout.this.canShowSearchItem()) {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                            SharedMediaLayout.this.searchAlpha = 0.0f;
                        } else {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.searchAlpha = sharedMediaLayout.getSearchAlpha(0.0f);
                            SharedMediaLayout.this.updateSearchItemIcon(0.0f);
                        }
                        SharedMediaLayout.this.updateOptionsSearch();
                        SharedMediaLayout.this.searchItemState = 0;
                    } else {
                        MediaPage mediaPage5 = SharedMediaLayout.this.mediaPages[0];
                        SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                        SharedMediaLayout.this.mediaPages[1] = mediaPage5;
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                        }
                        SharedMediaLayout.this.searchItemState = 0;
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        sharedMediaLayout2.selectTabWithId(sharedMediaLayout2.mediaPages[0].selectedType, 1.0f);
                        SharedMediaLayout.this.onSelectedTabChanged();
                        SharedMediaLayout.this.startStopVisibleGifs();
                    }
                    SharedMediaLayout.this.tabsAnimationInProgress = false;
                    SharedMediaLayout.this.maybeStartTracking = false;
                    SharedMediaLayout.this.startedTracking = false;
                    SharedMediaLayout.this.onTabScroll(false);
                    SharedMediaLayout.this.actionBar.setEnabled(true);
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setEnabled(true);
                }
            });
            this.tabsAnimation.start();
            this.tabsAnimationInProgress = true;
            this.startedTracking = false;
            onSelectedTabChanged();
        } else {
            this.maybeStartTracking = false;
            this.actionBar.setEnabled(true);
            this.scrollSlidingTextTabStrip.setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopScroll$48(ValueAnimator valueAnimator) {
        onTabProgress(getTabProgress());
    }

    public void disableScroll(boolean z) {
        if (z) {
            stopScroll(null);
        }
        this.disableScrolling = z;
    }

    public boolean closeActionMode() {
        return closeActionMode(true);
    }

    public boolean closeActionMode(boolean z) {
        if (!this.isActionModeShowed) {
            return false;
        }
        for (int i = 1; i >= 0; i--) {
            this.selectedFiles[i].clear();
        }
        this.cantDeleteMessagesCount = 0;
        onActionModeSelectedUpdate(this.selectedFiles[0]);
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.unselectAll();
            this.botPreviewsContainer.updateSelection(true);
        }
        showActionMode(false);
        updateRowsSelection(z);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        return true;
    }

    public void setVisibleHeight(int i) {
        this.lastVisibleHeight = i;
        for (int i2 = 0; i2 < this.mediaPages.length; i2++) {
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(this.mediaPages[i2].selectedType == 8 ? 280.0f : 120.0f)))) / 2.0f;
            this.mediaPages[i2].emptyView.setTranslationY(f);
            this.mediaPages[i2].progressView.setTranslationY(-f);
        }
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.setVisibleHeight(i);
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setVisibleHeight(i);
        }
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.selectedFiles[0];
    }

    public boolean isActionModeShown() {
        return this.isActionModeShowed;
    }

    protected void showActionMode(final boolean z) {
        if (this.isActionModeShowed == z) {
            return;
        }
        this.isActionModeShowed = z;
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.actionModeLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.actionModeLayout, (Property<LinearLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.actionModeAnimation.setDuration(180L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.44
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                SharedMediaLayout.this.actionModeAnimation = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (SharedMediaLayout.this.actionModeAnimation == null) {
                    return;
                }
                SharedMediaLayout.this.actionModeAnimation = null;
                if (z) {
                    return;
                }
                SharedMediaLayout.this.actionModeLayout.setVisibility(4);
            }
        });
        this.actionModeAnimation.start();
        if (z) {
            updateStoriesPinButton();
        }
    }

    private void updateStoriesPinButton() {
        boolean z;
        StoriesController.StoriesList storiesList;
        if (isBot()) {
            ActionBarMenuItem actionBarMenuItem = this.pinItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.unpinItem;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            ActionBarMenuItem actionBarMenuItem3 = this.pinItem;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem4 = this.unpinItem;
            if (actionBarMenuItem4 != null) {
                actionBarMenuItem4.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 8) {
            int i = 0;
            while (true) {
                if (i >= this.selectedFiles[0].size()) {
                    z = false;
                    break;
                }
                MessageObject messageObject = (MessageObject) this.selectedFiles[0].valueAt(i);
                StoriesAdapter storiesAdapter = this.storiesAdapter;
                if (storiesAdapter != null && (storiesList = storiesAdapter.storiesList) != null && !storiesList.isPinned(messageObject.getId())) {
                    z = true;
                    break;
                }
                i++;
            }
            ActionBarMenuItem actionBarMenuItem5 = this.pinItem;
            if (actionBarMenuItem5 != null) {
                actionBarMenuItem5.setVisibility(z ? 0 : 8);
            }
            ActionBarMenuItem actionBarMenuItem6 = this.unpinItem;
            if (actionBarMenuItem6 != null) {
                actionBarMenuItem6.setVisibility(z ? 8 : 0);
                return;
            }
            return;
        }
        if (isStoryAlbumPageType(getClosestTab())) {
            ActionBarMenuItem actionBarMenuItem7 = this.pinItem;
            if (actionBarMenuItem7 != null) {
                actionBarMenuItem7.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem8 = this.unpinItem;
            if (actionBarMenuItem8 != null) {
                actionBarMenuItem8.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04e3 A[SYNTHETIC] */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerView.Adapter adapter;
        char c;
        TLRPC.Chat chat;
        int i3;
        int size;
        int i4;
        boolean z;
        RecyclerView.Adapter adapter2;
        RecyclerView.Adapter adapter3;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        if (i == NotificationCenter.mediaDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            int intValue = ((Integer) objArr[3]).intValue();
            int intValue2 = ((Integer) objArr[7]).intValue();
            int intValue3 = ((Integer) objArr[4]).intValue();
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            if (intValue3 == 6 || intValue3 == 7) {
                intValue3 = 0;
            }
            if (intValue == this.profileActivity.getClassGuid() && intValue2 == this.sharedMediaData[intValue3].requestIndex) {
                ArrayList arrayList = (ArrayList) objArr[2];
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
                int i11 = longValue == this.dialog_id ? 0 : 1;
                if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                    this.sharedMediaData[intValue3].setTotalCount(i11, ((Integer) objArr[1]).intValue());
                }
                if (intValue3 == 0) {
                    adapter3 = this.photoVideoAdapter;
                } else if (intValue3 == 1) {
                    adapter3 = this.documentsAdapter;
                } else if (intValue3 == 2) {
                    adapter3 = this.voiceAdapter;
                } else if (intValue3 == 3) {
                    adapter3 = this.linksAdapter;
                } else if (intValue3 == 4) {
                    adapter3 = this.audioAdapter;
                } else if (intValue3 == 5) {
                    adapter3 = this.gifAdapter;
                } else if (intValue3 == 15) {
                    adapter3 = this.pollAdapter;
                    intValue3 = 8;
                } else {
                    adapter3 = null;
                }
                int size2 = this.sharedMediaData[intValue3].messages.size();
                if (adapter3 != null) {
                    i5 = adapter3.getItemCount();
                    if (adapter3 instanceof RecyclerListView.SectionsAdapter) {
                        ((RecyclerListView.SectionsAdapter) adapter3).notifySectionsChanged();
                    }
                } else {
                    i5 = 0;
                }
                this.sharedMediaData[intValue3].loading = false;
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                if (booleanValue) {
                    int size3 = arrayList.size() - 1;
                    while (size3 >= 0) {
                        ArrayList arrayList2 = arrayList;
                        MessageObject messageObject = (MessageObject) arrayList2.get(size3);
                        if (this.sharedMediaData[intValue3].addMessage(messageObject, i11, true, isEncryptedDialog)) {
                            sparseBooleanArray.put(messageObject.getId(), true);
                            SharedMediaData.access$610(this.sharedMediaData[intValue3]);
                            if (this.sharedMediaData[intValue3].startOffset < 0) {
                                this.sharedMediaData[intValue3].startOffset = 0;
                            }
                        }
                        size3--;
                        arrayList = arrayList2;
                    }
                    this.sharedMediaData[intValue3].startReached = ((Boolean) objArr[5]).booleanValue();
                    SharedMediaData sharedMediaData = this.sharedMediaData[intValue3];
                    if (sharedMediaData.startReached) {
                        sharedMediaData.startOffset = 0;
                    }
                } else {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        MessageObject messageObject2 = (MessageObject) arrayList.get(i12);
                        if (this.sharedMediaData[intValue3].addMessage(messageObject2, i11, false, isEncryptedDialog)) {
                            sparseBooleanArray.put(messageObject2.getId(), true);
                            SharedMediaData.access$12010(this.sharedMediaData[intValue3]);
                            if (this.sharedMediaData[intValue3].endLoadingStubs < 0) {
                                this.sharedMediaData[intValue3].endLoadingStubs = 0;
                            }
                        }
                    }
                    SharedMediaData sharedMediaData2 = this.sharedMediaData[intValue3];
                    if (sharedMediaData2.loadingAfterFastScroll && sharedMediaData2.messages.size() > 0) {
                        SharedMediaData sharedMediaData3 = this.sharedMediaData[intValue3];
                        sharedMediaData3.min_id = ((MessageObject) sharedMediaData3.messages.get(0)).getId();
                    }
                    this.sharedMediaData[intValue3].endReached[i11] = ((Boolean) objArr[5]).booleanValue();
                    SharedMediaData sharedMediaData4 = this.sharedMediaData[intValue3];
                    if (sharedMediaData4.endReached[i11]) {
                        int size4 = sharedMediaData4.messagesDict[i11].size();
                        if (i11 == 0) {
                            size4 += this.sharedMediaData[intValue3].startOffset;
                        }
                        this.sharedMediaData[intValue3].setTotalCount(i11, size4);
                    }
                }
                if (!booleanValue && i11 == 0) {
                    SharedMediaData sharedMediaData5 = this.sharedMediaData[intValue3];
                    if (sharedMediaData5.endReached[i11] && this.mergeDialogId != 0) {
                        sharedMediaData5.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[intValue3].max_id[1], 0, intValue3, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[intValue3].requestIndex, null, null);
                    }
                }
                if (adapter3 != null) {
                    InternalListView internalListView = null;
                    int i13 = 0;
                    while (true) {
                        MediaPage[] mediaPageArr = this.mediaPages;
                        if (i13 >= mediaPageArr.length) {
                            break;
                        }
                        MediaPage mediaPage = mediaPageArr[i13];
                        if (mediaPage != null && mediaPage.listView != null && this.mediaPages[i13].listView.getAdapter() == adapter3) {
                            internalListView = this.mediaPages[i13].listView;
                            this.mediaPages[i13].listView.stopScroll();
                        }
                        i13++;
                    }
                    int itemCount = adapter3.getItemCount();
                    SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
                    if (adapter3 == sharedPhotoVideoAdapter) {
                        if (sharedPhotoVideoAdapter.getItemCount() == i5) {
                            AndroidUtilities.updateVisibleRows(internalListView);
                        } else {
                            this.photoVideoAdapter.notifyDataSetChanged();
                        }
                    } else {
                        try {
                            adapter3.notifyDataSetChanged();
                        } catch (Throwable unused) {
                        }
                    }
                    if (!this.sharedMediaData[intValue3].messages.isEmpty() || this.sharedMediaData[intValue3].loading) {
                        if (internalListView != null && (adapter3 == this.photoVideoAdapter || itemCount >= i5)) {
                            animateItemsEnter(internalListView, i5, sparseBooleanArray);
                        }
                    } else if (internalListView != null) {
                        animateItemsEnter(internalListView, i5, sparseBooleanArray);
                    }
                    if (internalListView != null && !this.sharedMediaData[intValue3].loadingAfterFastScroll) {
                        if (size2 == 0) {
                            int i14 = 0;
                            for (int i15 = 2; i14 < i15; i15 = 2) {
                                if (this.mediaPages[i14].selectedType == 0) {
                                    ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(this.photoVideoAdapter.getPositionForIndex(0), 0);
                                }
                                i14++;
                            }
                        } else {
                            saveScrollPosition();
                        }
                    }
                }
                SharedMediaData sharedMediaData6 = this.sharedMediaData[intValue3];
                if (sharedMediaData6.loadingAfterFastScroll) {
                    if (sharedMediaData6.messages.size() == 0) {
                        loadFromStart(intValue3);
                    } else {
                        this.sharedMediaData[intValue3].loadingAfterFastScroll = false;
                    }
                }
                this.scrolling = true;
                return;
            }
            if (this.sharedMediaPreloader == null || !this.sharedMediaData[intValue3].messages.isEmpty() || this.sharedMediaData[intValue3].loadingAfterFastScroll || !fillMediaData(intValue3)) {
                return;
            }
            if (intValue3 == 0) {
                adapter2 = this.photoVideoAdapter;
            } else if (intValue3 == 1) {
                adapter2 = this.documentsAdapter;
            } else if (intValue3 == 2) {
                adapter2 = this.voiceAdapter;
            } else if (intValue3 == 3) {
                adapter2 = this.linksAdapter;
            } else if (intValue3 == 4) {
                adapter2 = this.audioAdapter;
            } else if (intValue3 == 5) {
                adapter2 = this.gifAdapter;
            } else {
                adapter2 = intValue3 == 15 ? this.pollAdapter : null;
            }
            if (adapter2 != null) {
                while (true) {
                    MediaPage[] mediaPageArr2 = this.mediaPages;
                    if (i7 >= mediaPageArr2.length) {
                        break;
                    }
                    MediaPage mediaPage2 = mediaPageArr2[i7];
                    if (mediaPage2 != null && mediaPage2.listView != null && this.mediaPages[i7].listView.getAdapter() == adapter2) {
                        this.mediaPages[i7].listView.stopScroll();
                    }
                    i7++;
                }
                adapter2.notifyDataSetChanged();
            }
            this.scrolling = true;
            return;
        }
        int i16 = -1;
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            if (DialogObject.isChatDialog(this.dialog_id)) {
                chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                c = 1;
            } else {
                c = 1;
                chat = null;
            }
            long longValue2 = ((Long) objArr[c]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (longValue2 == 0 && this.mergeDialogId != 0) {
                    i3 = 1;
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    size = arrayList3.size();
                    z = false;
                    for (i4 = 0; i4 < size; i4++) {
                        int i17 = 0;
                        while (true) {
                            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                            if (i17 < sharedMediaDataArr.length) {
                                if (sharedMediaDataArr[i17].deleteMessage(((Integer) arrayList3.get(i4)).intValue(), i3) != null) {
                                    i16 = i17;
                                    z = true;
                                }
                                i17++;
                            }
                        }
                    }
                    if (z) {
                        this.scrolling = true;
                        SharedPhotoVideoAdapter sharedPhotoVideoAdapter2 = this.photoVideoAdapter;
                        if (sharedPhotoVideoAdapter2 != null) {
                            sharedPhotoVideoAdapter2.notifyDataSetChanged();
                        }
                        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
                        if (sharedDocumentsAdapter != null) {
                            sharedDocumentsAdapter.notifyDataSetChanged();
                        }
                        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
                        if (sharedDocumentsAdapter2 != null) {
                            sharedDocumentsAdapter2.notifyDataSetChanged();
                        }
                        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
                        if (sharedLinksAdapter != null) {
                            sharedLinksAdapter.notifyDataSetChanged();
                        }
                        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.audioAdapter;
                        if (sharedDocumentsAdapter3 != null) {
                            sharedDocumentsAdapter3.notifyDataSetChanged();
                        }
                        PollAdapter pollAdapter = this.pollAdapter;
                        if (pollAdapter != null) {
                            pollAdapter.notifyDataSetChanged();
                        }
                        GifAdapter gifAdapter = this.gifAdapter;
                        if (gifAdapter != null) {
                            gifAdapter.notifyDataSetChanged();
                        }
                        if (i16 == 0 || i16 == 1 || i16 == 2 || i16 == 4) {
                            loadFastScrollData(true);
                        }
                    }
                    getMediaPage(i16);
                    return;
                }
                if (longValue2 != chat.id) {
                    return;
                }
            } else if (longValue2 != 0) {
                return;
            }
            i3 = 0;
            ArrayList arrayList32 = (ArrayList) objArr[0];
            size = arrayList32.size();
            z = false;
            while (i4 < size) {
            }
            if (z) {
            }
            getMediaPage(i16);
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue3 = ((Long) objArr[0]).longValue();
            long j = this.dialog_id;
            if (longValue3 != j) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[1];
            boolean isEncryptedDialog2 = DialogObject.isEncryptedDialog(j);
            boolean z2 = false;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                MessageObject messageObject3 = (MessageObject) arrayList4.get(i18);
                if (MessageObject.getMedia(messageObject3.messageOwner) != null && !messageObject3.needDrawBluredPreview()) {
                    int mediaType = MediaDataController.getMediaType(messageObject3.messageOwner);
                    if (mediaType == -1) {
                        return;
                    }
                    SharedMediaData sharedMediaData7 = this.sharedMediaData[mediaType];
                    if (sharedMediaData7.startReached) {
                        if (sharedMediaData7.addMessage(messageObject3, messageObject3.getDialogId() == this.dialog_id ? 0 : 1, true, isEncryptedDialog2)) {
                            this.hasMedia[mediaType] = 1;
                            z2 = true;
                        }
                    }
                }
            }
            int i19 = 1;
            if (!z2) {
                return;
            }
            this.scrolling = true;
            while (true) {
                MediaPage[] mediaPageArr3 = this.mediaPages;
                if (i8 < mediaPageArr3.length) {
                    int i20 = mediaPageArr3[i8].selectedType;
                    if (i20 == 0) {
                        adapter = this.photoVideoAdapter;
                    } else if (i20 == i19) {
                        adapter = this.documentsAdapter;
                    } else if (i20 == 2) {
                        adapter = this.voiceAdapter;
                    } else if (i20 == 3) {
                        adapter = this.linksAdapter;
                    } else if (i20 == 4) {
                        adapter = this.audioAdapter;
                    } else if (i20 == 5) {
                        adapter = this.gifAdapter;
                        if (adapter != null) {
                            adapter.getItemCount();
                            this.photoVideoAdapter.notifyDataSetChanged();
                            this.documentsAdapter.notifyDataSetChanged();
                            this.voiceAdapter.notifyDataSetChanged();
                            this.linksAdapter.notifyDataSetChanged();
                            this.audioAdapter.notifyDataSetChanged();
                            this.pollAdapter.notifyDataSetChanged();
                            this.gifAdapter.notifyDataSetChanged();
                        }
                        i8++;
                        i19 = 1;
                    } else {
                        adapter = i20 == 15 ? this.pollAdapter : null;
                        if (adapter != null) {
                        }
                        i8++;
                        i19 = 1;
                    }
                    if (adapter != null) {
                    }
                    i8++;
                    i19 = 1;
                } else {
                    updateTabs(true);
                    return;
                }
            }
        } else if (i == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() != this.dialog_id && l.longValue() != this.mergeDialogId) {
                return;
            }
            int i21 = l.longValue() == this.dialog_id ? 0 : 1;
            while (true) {
                SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                if (i9 >= sharedMediaDataArr2.length) {
                    return;
                }
                sharedMediaDataArr2[i9].replaceMid(i21, num.intValue(), num2.intValue());
                i9++;
            }
        } else if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset) {
            if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
                int i22 = 0;
                while (true) {
                    MediaPage[] mediaPageArr4 = this.mediaPages;
                    if (i22 >= mediaPageArr4.length) {
                        return;
                    }
                    MediaPage mediaPage3 = mediaPageArr4[i22];
                    if (mediaPage3 != null && mediaPage3.listView != null) {
                        int childCount = this.mediaPages[i22].listView.getChildCount();
                        for (int i23 = 0; i23 < childCount; i23++) {
                            View childAt = this.mediaPages[i22].listView.getChildAt(i23);
                            if (childAt instanceof SharedAudioCell) {
                                SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                                if (sharedAudioCell.getMessage() != null) {
                                    sharedAudioCell.updateButtonState(false, true);
                                }
                            }
                        }
                    }
                    i22++;
                }
            } else {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                int i24 = 0;
                while (true) {
                    MediaPage[] mediaPageArr5 = this.mediaPages;
                    if (i24 >= mediaPageArr5.length) {
                        return;
                    }
                    int childCount2 = mediaPageArr5[i24].listView.getChildCount();
                    for (int i25 = 0; i25 < childCount2; i25++) {
                        View childAt2 = this.mediaPages[i24].listView.getChildAt(i25);
                        if (childAt2 instanceof SharedAudioCell) {
                            SharedAudioCell sharedAudioCell2 = (SharedAudioCell) childAt2;
                            if (sharedAudioCell2.getMessage() != null) {
                                sharedAudioCell2.updateButtonState(false, true);
                            }
                        }
                    }
                    i24++;
                }
            }
        } else {
            if (i == NotificationCenter.storiesListUpdated) {
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) objArr[0];
                MediaPage mediaPage4 = getMediaPage(storyAlbums_getTabTypeByStoriesList(storiesList));
                if (mediaPage4 != null) {
                    if (mediaPage4.fastScrollEnabled != (storiesList.getCount() > 0)) {
                        mediaPage4.fastScrollEnabled = storiesList.getCount() > 0;
                        updateFastScrollVisibility(mediaPage4, true);
                    }
                }
                if (mediaPage4 != null) {
                    AndroidUtilities.notifyDataSetChanged(mediaPage4.listView);
                    if (mediaPage4.listView.getLayoutManager() instanceof LinearLayoutManager) {
                        checkLoadMoreScroll(mediaPage4, mediaPage4.listView, (LinearLayoutManager) mediaPage4.listView.getLayoutManager());
                    }
                }
                Delegate delegate = this.delegate;
                if (delegate != null) {
                    delegate.updateSelectedMediaTabText();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.storiesUpdated) {
                for (MediaPage mediaPage5 : this.mediaPages) {
                    if (mediaPage5 != null && mediaPage5.listView != null && isAnyStoryPageType(mediaPage5.selectedType)) {
                        if (!isBot() || mediaPage5.listView.getAdapter() == null) {
                            for (int i26 = 0; i26 < mediaPage5.listView.getChildCount(); i26++) {
                                View childAt3 = mediaPage5.listView.getChildAt(i26);
                                if (childAt3 instanceof SharedPhotoVideoCell2) {
                                    ((SharedPhotoVideoCell2) childAt3).updateViews();
                                }
                            }
                        } else {
                            AndroidUtilities.notifyDataSetChanged(mediaPage5.listView);
                        }
                    }
                }
                return;
            }
            if (i == NotificationCenter.channelRecommendationsLoaded) {
                if (((Long) objArr[0]).longValue() == this.dialog_id) {
                    this.channelRecommendationsAdapter.update(true);
                    updateTabs(true);
                    checkCurrentTabValid();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                long j2 = this.dialog_id;
                if (j2 == 0 || j2 == this.profileActivity.getUserConfig().getClientUserId()) {
                    this.savedDialogsAdapter.update(true);
                    updateTabs(true);
                    checkCurrentTabValid();
                    onSelectedTabChanged();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.dialogsNeedReload) {
                this.savedDialogsAdapter.update(true);
                return;
            }
            if (i == NotificationCenter.starUserGiftsLoaded) {
                if (((Long) objArr[0]).longValue() == this.dialog_id) {
                    updateTabs(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.updatedChatRanks) {
                long longValue4 = ((Long) objArr[0]).longValue();
                long longValue5 = ((Long) objArr[1]).longValue();
                if (this.dialog_id != (-longValue4)) {
                    return;
                }
                String str = (String) objArr[2];
                ChatUsersAdapter chatUsersAdapter = this.chatUsersAdapter;
                if (chatUsersAdapter == null) {
                    return;
                }
                chatUsersAdapter.updateRank(longValue5, str);
                while (true) {
                    MediaPage[] mediaPageArr6 = this.mediaPages;
                    if (i10 >= mediaPageArr6.length) {
                        return;
                    }
                    MediaPage mediaPage6 = mediaPageArr6[i10];
                    if (mediaPage6.selectedType == 7) {
                        AndroidUtilities.updateVisibleRows(mediaPage6.listView);
                    }
                    i10++;
                }
            } else {
                if (i != NotificationCenter.didUpdatePollResults) {
                    return;
                }
                long longValue6 = ((Long) objArr[0]).longValue();
                TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
                TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
                while (true) {
                    MediaPage[] mediaPageArr7 = this.mediaPages;
                    if (i6 >= mediaPageArr7.length) {
                        return;
                    }
                    RecyclerView.Adapter adapter4 = mediaPageArr7[i6].listView.getAdapter();
                    PollAdapter pollAdapter2 = this.pollAdapter;
                    if (adapter4 == pollAdapter2) {
                        pollAdapter2.update(this.mediaPages[i6].listView, longValue6, tL_poll, pollResults);
                    }
                    i6++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveScrollPosition() {
        int i;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return;
            }
            InternalListView internalListView = mediaPageArr[i2].listView;
            if (internalListView != null) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < internalListView.getChildCount(); i5++) {
                    View childAt = internalListView.getChildAt(i5);
                    if (childAt instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                        int messageId = sharedPhotoVideoCell2.getMessageId();
                        i4 = sharedPhotoVideoCell2.getTop();
                        i3 = messageId;
                    }
                    if (childAt instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                        int id = sharedDocumentCell.getMessage().getId();
                        i4 = sharedDocumentCell.getTop();
                        i3 = id;
                    }
                    if (childAt instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                        i3 = sharedAudioCell.getMessage().getId();
                        i4 = sharedAudioCell.getTop();
                    }
                    if (i3 != 0) {
                        break;
                    }
                }
                if (i3 != 0) {
                    int i6 = this.mediaPages[i2].selectedType;
                    int i7 = -1;
                    if (isAnyStoryPageType(i6)) {
                        StoriesAdapter storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i6);
                        if (storyAlbums_getStoriesAdapterByTabType != null && storyAlbums_getStoriesAdapterByTabType.storiesList != null) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= storyAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.size()) {
                                    break;
                                }
                                if (i3 == ((MessageObject) storyAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.get(i8)).getId()) {
                                    i7 = i8;
                                    break;
                                }
                                i8++;
                            }
                        }
                        i = i7;
                    } else if (i6 >= 0 && i6 < this.sharedMediaData.length) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= this.sharedMediaData[i6].messages.size()) {
                                break;
                            }
                            if (i3 == ((MessageObject) this.sharedMediaData[i6].messages.get(i9)).getId()) {
                                i7 = i9;
                                break;
                            }
                            i9++;
                        }
                        i = this.sharedMediaData[i6].startOffset + i7;
                    }
                    if (i7 >= 0) {
                        ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + i4);
                        if (this.photoVideoChangeColumnsAnimation) {
                            this.mediaPages[i2].animationSupportingLayoutManager.scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + i4);
                        }
                    }
                }
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateItemsEnter(RecyclerListView recyclerListView, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = recyclerListView.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerListView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            recyclerListView.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new 45(recyclerListView, sparseBooleanArray, view, i));
    }

    class 45 implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ SparseBooleanArray val$addedMesages;
        final /* synthetic */ RecyclerListView val$finalListView;
        final /* synthetic */ View val$finalProgressView;
        final /* synthetic */ int val$oldItemCount;

        45(RecyclerListView recyclerListView, SparseBooleanArray sparseBooleanArray, View view, int i) {
            this.val$finalListView = recyclerListView;
            this.val$addedMesages = sparseBooleanArray;
            this.val$finalProgressView = view;
            this.val$oldItemCount = i;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            SharedMediaLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.Adapter adapter = this.val$finalListView.getAdapter();
            if (adapter == SharedMediaLayout.this.photoVideoAdapter || adapter == SharedMediaLayout.this.documentsAdapter || adapter == SharedMediaLayout.this.audioAdapter || adapter == SharedMediaLayout.this.voiceAdapter) {
                if (this.val$addedMesages != null) {
                    int childCount = this.val$finalListView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        final int messageId = SharedMediaLayout.getMessageId(this.val$finalListView.getChildAt(i));
                        if (messageId != 0 && this.val$addedMesages.get(messageId, false)) {
                            SharedMediaLayout.this.messageAlphaEnter.put(messageId, Float.valueOf(0.0f));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final RecyclerListView recyclerListView = this.val$finalListView;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$45$$ExternalSyntheticLambda2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    SharedMediaLayout.45.this.lambda$onPreDraw$0(messageId, recyclerListView, valueAnimator);
                                }
                            });
                            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.45.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    SharedMediaLayout.this.messageAlphaEnter.remove(messageId);
                                    45.this.val$finalListView.invalidate();
                                }
                            });
                            ofFloat.setStartDelay((int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, r7.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(250L);
                            final RecyclerListView recyclerListView2 = this.val$finalListView;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$45$$ExternalSyntheticLambda3
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    SharedMediaLayout.45.lambda$onPreDraw$1(RecyclerListView.this, valueAnimator);
                                }
                            });
                            ofFloat.start();
                        }
                        this.val$finalListView.invalidate();
                    }
                }
            } else {
                int childCount2 = this.val$finalListView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt = this.val$finalListView.getChildAt(i2);
                    if (childAt != this.val$finalProgressView && this.val$finalListView.getChildAdapterPosition(childAt) >= this.val$oldItemCount - 1) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat2.setStartDelay(min);
                        ofFloat2.setDuration(200L);
                        final RecyclerListView recyclerListView3 = this.val$finalListView;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$45$$ExternalSyntheticLambda0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                SharedMediaLayout.45.lambda$onPreDraw$2(RecyclerListView.this, valueAnimator);
                            }
                        });
                        animatorSet.playTogether(ofFloat2);
                    }
                    View view = this.val$finalProgressView;
                    if (view != null && view.getParent() == null) {
                        this.val$finalListView.addView(this.val$finalProgressView);
                        final RecyclerView.LayoutManager layoutManager = this.val$finalListView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(this.val$finalProgressView);
                            View view2 = this.val$finalProgressView;
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                            ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.SharedMediaLayout.45.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    45.this.val$finalProgressView.setAlpha(1.0f);
                                    layoutManager.stopIgnoringView(45.this.val$finalProgressView);
                                    45 r2 = 45.this;
                                    r2.val$finalListView.removeView(r2.val$finalProgressView);
                                }
                            });
                            final RecyclerListView recyclerListView4 = this.val$finalListView;
                            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$45$$ExternalSyntheticLambda1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    SharedMediaLayout.45.lambda$onPreDraw$3(RecyclerListView.this, valueAnimator);
                                }
                            });
                            ofFloat3.start();
                        }
                    }
                }
                animatorSet.start();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreDraw$0(int i, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            SharedMediaLayout.this.messageAlphaEnter.put(i, (Float) valueAnimator.getAnimatedValue());
            recyclerListView.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPreDraw$1(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPreDraw$2(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPreDraw$3(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }
    }

    public void onResume() {
        this.scrolling = true;
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        for (int i = 0; i < this.mediaPages.length; i++) {
            fixLayoutInternal(i);
        }
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onResume();
        }
    }

    public void onPause() {
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onPause();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            if (mediaPageArr[i].listView != null) {
                this.mediaPages[i].listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.Components.SharedMediaLayout.46
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        SharedMediaLayout.this.mediaPages[i].getViewTreeObserver().removeOnPreDrawListener(this);
                        SharedMediaLayout.this.fixLayoutInternal(i);
                        return true;
                    }
                });
            }
            i++;
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.info;
        boolean z = chatFull2 != null && chatFull2.stories_pinned_available;
        this.info = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.mergeDialogId == 0) {
                this.mergeDialogId = -j;
                int i = 0;
                while (true) {
                    SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                    if (i >= sharedMediaDataArr.length) {
                        break;
                    }
                    if (sharedMediaDataArr[i].messagesDict[1].size() == 0) {
                        SharedMediaData sharedMediaData = this.sharedMediaData[i];
                        sharedMediaData.max_id[1] = this.info.migrated_from_max_id;
                        sharedMediaData.endReached[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.info;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStripInner != null) {
            scrollSlidingTextTabStripInner.setInitialTabId(isArchivedOnlyStoriesView() ? 9 : 8);
        }
        updateTabs(true);
        switchToCurrentSelectedMode(false);
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.userInfo;
        boolean z = userFull2 != null && userFull2.stories_pinned_available;
        this.userInfo = userFull;
        updateTabs(true);
        if (userFull == null || z == userFull.stories_pinned_available) {
            return;
        }
        scrollToPage(8);
    }

    public void setChatUsers(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 < mediaPageArr.length) {
                MediaPage mediaPage = mediaPageArr[i2];
                if (mediaPage.selectedType == 7 && mediaPage.listView.getAdapter() != null && this.mediaPages[i2].listView.getAdapter().getItemCount() != 0 && this.profileActivity.getMessagesController().getStoriesController().hasLoadingStories()) {
                    return;
                } else {
                    i2++;
                }
            } else {
                if (this.topicId == 0) {
                    this.chatUsersAdapter.chatInfo = chatFull;
                    this.chatUsersAdapter.sortedUsers = arrayList;
                }
                updateTabs(true);
                while (true) {
                    MediaPage[] mediaPageArr2 = this.mediaPages;
                    if (i >= mediaPageArr2.length) {
                        return;
                    }
                    MediaPage mediaPage2 = mediaPageArr2[i];
                    if (mediaPage2.selectedType == 7 && mediaPage2.listView.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(this.mediaPages[i].listView);
                    }
                    i++;
                }
            }
        }
    }

    public void updateAdapters() {
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
        if (sharedDocumentsAdapter2 != null) {
            sharedDocumentsAdapter2.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.audioAdapter;
        if (sharedDocumentsAdapter3 != null) {
            sharedDocumentsAdapter3.notifyDataSetChanged();
        }
        PollAdapter pollAdapter = this.pollAdapter;
        if (pollAdapter != null) {
            pollAdapter.notifyDataSetChanged();
        }
        GifAdapter gifAdapter = this.gifAdapter;
        if (gifAdapter != null) {
            gifAdapter.notifyDataSetChanged();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null) {
            storiesAdapter.notifyDataSetChanged();
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            ((StoryAlbumData) it.next()).adapter.notifyDataSetChanged();
        }
    }

    private void updateRowsSelection(boolean z) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedLinkCell) {
                    ((SharedLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedAudioCell) {
                    ((SharedAudioCell) childAt).setChecked(false, z);
                } else if (childAt instanceof ContextLinkCell) {
                    ((ContextLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof DialogCell) {
                    ((DialogCell) childAt).setChecked(false, z);
                }
            }
            i++;
        }
    }

    public void setMergeDialogId(long j) {
        this.mergeDialogId = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x019c, code lost:
    
        if ((r19.hasMedia[8] <= 0) == r19.scrollSlidingTextTabStrip.hasTab(15)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b6, code lost:
    
        if (r19.hasMedia[2] > 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b8, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c1, code lost:
    
        if (r9 != r19.scrollSlidingTextTabStrip.hasTab(2)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c3, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c9, code lost:
    
        if (r19.hasMedia[5] > 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cb, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d4, code lost:
    
        if (r9 != r19.scrollSlidingTextTabStrip.hasTab(5)) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d6, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01dc, code lost:
    
        if (r19.hasMedia[6] > 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01de, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e7, code lost:
    
        if (r9 != r19.scrollSlidingTextTabStrip.hasTab(6)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e9, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ea, code lost:
    
        r9 = !r19.channelRecommendationsAdapter.chats.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
    
        if (r9 == r19.scrollSlidingTextTabStrip.hasTab(10)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ff, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0204, code lost:
    
        if (includeSavedDialogs() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0212, code lost:
    
        if (r19.profileActivity.getMessagesController().getSavedMessagesController().unsupported != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0222, code lost:
    
        if (r19.profileActivity.getMessagesController().getSavedMessagesController().hasDialogs() == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0224, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x022f, code lost:
    
        if (r10 == r19.scrollSlidingTextTabStrip.hasTab(11)) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0231, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x023a, code lost:
    
        if (r5 == r19.scrollSlidingTextTabStrip.hasTab(12)) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x023c, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0226, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01e0, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01cd, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01ba, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01b0, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01ae, code lost:
    
        if ((r19.hasMedia[4] <= 0) == r19.scrollSlidingTextTabStrip.hasTab(4)) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateTabs(boolean z) {
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        int i;
        Iterator it;
        ProfileGiftsContainer profileGiftsContainer;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        BaseFragment baseFragment;
        SharedMediaPreloader sharedMediaPreloader;
        if (this.scrollSlidingTextTabStrip == null) {
            return;
        }
        boolean z5 = !this.delegate.isFragmentOpened() ? false : z;
        boolean z6 = (this.savedMessagesContainer == null || (sharedMediaPreloader = this.sharedMediaPreloader) == null || !sharedMediaPreloader.hasSavedMessages) ? false : true;
        TLRPC.User user = (this.dialog_id <= 0 || (baseFragment = this.profileActivity) == null) ? null : baseFragment.getMessagesController().getUser(Long.valueOf(this.dialog_id));
        boolean z7 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z8 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.userInfo) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z7) ? false : true;
        boolean z9 = (DialogObject.isUserDialog(this.dialog_id) || DialogObject.isChatDialog(this.dialog_id)) && !DialogObject.isEncryptedDialog(this.dialog_id) && (((userFull = this.userInfo) != null && userFull.stories_pinned_available) || (((chatFull = this.info) != null && chatFull.stories_pinned_available) || isStoriesView())) && includeStories();
        boolean z10 = this.giftsContainer != null && (((userFull3 = this.userInfo) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.info) != null && chatFull3.stargifts_count > 0));
        TLRPC.ChatFull chatFull4 = this.info;
        if (chatFull4 != null) {
            profileTab = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.userInfo;
            profileTab = userFull5 != null ? userFull5.main_tab : null;
        }
        int i2 = this.wasReordering != this.scrollSlidingTextTabStrip.isReordering() ? 1 : 0;
        if ((z9 || z8) != this.scrollSlidingTextTabStrip.hasTab(8)) {
            i2++;
        }
        if (z7 != this.scrollSlidingTextTabStrip.hasTab(13)) {
            i2++;
        }
        if (isSearchingStories() != this.scrollSlidingTextTabStrip.hasTab(8)) {
            i2++;
        }
        if (z10 != this.scrollSlidingTextTabStrip.hasTab(14) || ((profileGiftsContainer = this.giftsContainer) != null && z10 && this.giftsLastHash != profileGiftsContainer.getLastEmojisHash())) {
            i2++;
        }
        if (isStoriesView()) {
            z2 = false;
            z3 = false;
        } else {
            if ((this.chatUsersAdapter.chatInfo == null) == this.scrollSlidingTextTabStrip.hasTab(7)) {
                i2++;
            }
            if ((this.hasMedia[0] <= 0) == this.scrollSlidingTextTabStrip.hasTab(0)) {
                i2++;
            }
            if ((this.hasMedia[1] <= 0) == this.scrollSlidingTextTabStrip.hasTab(1)) {
                i2++;
            }
            if (!DialogObject.isEncryptedDialog(this.dialog_id)) {
                if ((this.hasMedia[3] <= 0) == this.scrollSlidingTextTabStrip.hasTab(3)) {
                    i2++;
                }
                if ((this.hasMedia[4] <= 0) == this.scrollSlidingTextTabStrip.hasTab(4)) {
                    i2++;
                }
            }
        }
        if (i2 > 0) {
            if (z5) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.setOrdering(0);
                transitionSet.addTransition(new Visibility() { // from class: org.telegram.ui.Components.SharedMediaLayout.47
                    @Override // android.transition.Visibility
                    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        return animatorSet;
                    }

                    @Override // android.transition.Visibility
                    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        return animatorSet;
                    }
                });
                transitionSet.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.scrollSlidingTextTabStrip.getTabsContainer(), transitionSet);
                this.scrollSlidingTextTabStrip.recordIndicatorParams();
            }
            SparseArray removeTabs = this.scrollSlidingTextTabStrip.removeTabs();
            if (i2 > 3) {
                removeTabs = null;
            }
            final ArrayList arrayList = new ArrayList();
            boolean z11 = z10;
            if (isSearchingStories()) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                this.scrollSlidingTextTabStrip.animationDuration = 420L;
            }
            if (z8) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                z4 = z2;
            } else {
                z4 = z2;
                if ((DialogObject.isUserDialog(this.dialog_id) || DialogObject.isChatDialog(this.dialog_id)) && !DialogObject.isEncryptedDialog(this.dialog_id) && ((((userFull2 = this.userInfo) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.info) != null && chatFull2.stories_pinned_available) || isStoriesView())) && includeStories())) {
                    if (isArchivedOnlyStoriesView()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        this.scrollSlidingTextTabStrip.animationDuration = 420L;
                    } else {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        if (isStoriesView()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        }
                    }
                }
            }
            if (z11) {
                arrayList.add(new Pair(14, TextUtils.concat(LocaleController.getString(R.string.ProfileGifts), this.giftsContainer.getLastEmojis(null))));
                this.giftsLastHash = this.giftsContainer.getLastEmojisHash();
            }
            if (z7) {
                arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            }
            if (!isStoriesView()) {
                if (z3) {
                    arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                }
                if (this.chatUsersAdapter.chatInfo != null) {
                    arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                }
                int[] iArr = this.hasMedia;
                if (iArr[0] > 0) {
                    if (iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[4] == 0 && iArr[5] == 0 && iArr[6] == 0 && this.chatUsersAdapter.chatInfo == null) {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTabFull2)));
                    } else {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                    }
                }
                if (z6) {
                    arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                }
                if (this.hasMedia[1] > 0) {
                    arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                }
                if (!DialogObject.isEncryptedDialog(this.dialog_id)) {
                    if (this.hasMedia[3] > 0) {
                        arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                    }
                    if (this.hasMedia[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (this.hasMedia[8] > 0) {
                        arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                    }
                } else if (this.hasMedia[4] > 0) {
                    arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                }
                if (this.hasMedia[2] > 0) {
                    arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                }
                if (this.hasMedia[5] > 0) {
                    arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                }
                if (this.hasMedia[6] > 0) {
                    arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                }
                if (z4) {
                    arrayList.add(new Pair(10, LocaleController.getString(this.dialog_id > 0 ? R.string.SimilarBotsTab : R.string.SimilarChannelsTab)));
                }
            }
            if (this.scrollSlidingTextTabStrip.isReordering()) {
                Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda5
                    @Override // org.telegram.messenger.Utilities.CallbackReturn
                    public final Object run(Object obj) {
                        Boolean lambda$updateTabs$49;
                        lambda$updateTabs$49 = SharedMediaLayout.lambda$updateTabs$49(arrayList, (Integer) obj);
                        return lambda$updateTabs$49;
                    }
                };
                boolean z12 = this.info instanceof TLRPC.TL_channelFull;
                for (int i3 = 0; i3 < 15; i3++) {
                    if (getTab(i3, z12) != null && !((Boolean) callbackReturn.run(Integer.valueOf(i3))).booleanValue()) {
                        arrayList.add(new Pair(Integer.valueOf(i3), getTabName(i3)));
                    }
                }
            }
            if (profileTab != null) {
                int tabId = getTabId(profileTab);
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    } else if (((Integer) ((Pair) arrayList.get(i4)).first).intValue() == tabId) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    Pair pair = (Pair) arrayList.remove(i4);
                    i = 0;
                    arrayList.add(0, pair);
                    if (!arrayList.isEmpty()) {
                        this.firstTab = ((Integer) ((Pair) arrayList.get(i)).first).intValue();
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair2 = (Pair) it.next();
                        if (!this.scrollSlidingTextTabStrip.hasTab(((Integer) pair2.first).intValue())) {
                            this.scrollSlidingTextTabStrip.addTextTab(((Integer) pair2.first).intValue(), (CharSequence) pair2.second, removeTabs);
                        }
                    }
                }
            }
            i = 0;
            if (!arrayList.isEmpty()) {
            }
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
        }
        int selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
            this.mediaPages[0].selectedType = selectedTab;
        }
        this.wasReordering = this.scrollSlidingTextTabStrip.isReordering();
        this.scrollSlidingTextTabStrip.finishAddingTabs();
        onSelectedTabChanged();
        checkStoriesTabsPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$updateTabs$49(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Pair) arrayList.get(i)).first == num) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startStopVisibleGifs() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof ContextLinkCell) {
                    ImageReceiver photoImage = ((ContextLinkCell) childAt).getPhotoImage();
                    if (i == 0) {
                        photoImage.setAllowStartAnimation(true);
                        photoImage.startAnimation();
                    } else {
                        photoImage.setAllowStartAnimation(false);
                        photoImage.stopAnimation();
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0599  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void switchToCurrentSelectedMode(boolean z) {
        MediaPage[] mediaPageArr;
        RecyclerView.RecycledViewPool recycledViewPool;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        MediaPage mediaPage;
        MediaPage mediaPage2;
        ChatActivityContainer chatActivityContainer;
        BotPreviewsEditContainer botPreviewsEditContainer;
        ProfileGiftsContainer profileGiftsContainer;
        int i2;
        int i3;
        int i4;
        int i5;
        final boolean isStoryAlbumPageType;
        int i6;
        int i7;
        ViewParent parent;
        MediaPage mediaPage3;
        ViewParent parent2;
        MediaPage mediaPage4;
        PollAdapter pollAdapter;
        ProfileGiftsContainer profileGiftsContainer2 = this.giftsContainer;
        if (profileGiftsContainer2 != null) {
            profileGiftsContainer2.resetReordering();
        }
        int i8 = 0;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i8 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i8].listView.stopScroll();
            i8++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mediaPageArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
        RecyclerView.Adapter adapter = this.mediaPages[z ? 1 : 0].listView.getAdapter();
        if (adapter == this.storiesAdapter) {
            this.storiesReorder.attachToRecyclerView(null);
        }
        if (!this.searching || !this.searchWas) {
            if (this.mediaPages[z ? 1 : 0].viewPool == null) {
                this.mediaPages[z ? 1 : 0].viewPool = new RecyclerView.RecycledViewPool();
            }
            RecyclerView.RecycledViewPool recycledViewPool2 = this.mediaPages[z ? 1 : 0].viewPool;
            this.mediaPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(null);
            int i9 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i9 == 8 || isStoryAlbumPageType(i9)) {
                layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
            }
            InternalListView internalListView = this.mediaPages[z ? 1 : 0].listView;
            int paddingLeft = this.mediaPages[z ? 1 : 0].listView.getPaddingLeft();
            InternalListView internalListView2 = this.mediaPages[z ? 1 : 0].listView;
            int pagePaddingTop = getPagePaddingTop(this.mediaPages[z ? 1 : 0].selectedType);
            internalListView2.hintPaddingTop = pagePaddingTop;
            int paddingRight = this.mediaPages[z ? 1 : 0].listView.getPaddingRight();
            InternalListView internalListView3 = this.mediaPages[z ? 1 : 0].listView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            internalListView3.hintPaddingBottom = pagePaddingBottom;
            internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            int i10 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i10 == 0) {
                if (adapter != this.photoVideoAdapter) {
                    recycleAdapter(adapter);
                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.photoVideoAdapter);
                }
                int i11 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i11;
                layoutParams.leftMargin = i11;
                SharedMediaData sharedMediaData = this.sharedMediaData[0];
                boolean z6 = sharedMediaData.fastScrollDataLoaded && !sharedMediaData.fastScrollPeriods.isEmpty();
                int i12 = this.mediaColumnsCount[0];
                this.mediaPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(this.pinnedHeaderShadowDrawable);
                SharedMediaData sharedMediaData2 = this.sharedMediaData[0];
                if (sharedMediaData2.recycledViewPool == null) {
                    sharedMediaData2.recycledViewPool = new RecyclerView.RecycledViewPool();
                }
                i = i12;
                z2 = z6;
                recycledViewPool = this.sharedMediaData[0].recycledViewPool;
            } else {
                if (i10 == 1) {
                    SharedMediaData sharedMediaData3 = this.sharedMediaData[1];
                    z4 = sharedMediaData3.fastScrollDataLoaded && !sharedMediaData3.fastScrollPeriods.isEmpty();
                    if (adapter != this.documentsAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsAdapter);
                    }
                } else if (i10 == 2) {
                    SharedMediaData sharedMediaData4 = this.sharedMediaData[2];
                    z4 = sharedMediaData4.fastScrollDataLoaded && !sharedMediaData4.fastScrollPeriods.isEmpty();
                    if (adapter != this.voiceAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.voiceAdapter);
                    }
                } else {
                    if (i10 == 3) {
                        if (adapter != this.linksAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksAdapter);
                        }
                    } else if (i10 == 4) {
                        SharedMediaData sharedMediaData5 = this.sharedMediaData[4];
                        z4 = sharedMediaData5.fastScrollDataLoaded && !sharedMediaData5.fastScrollPeriods.isEmpty();
                        if (adapter != this.audioAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioAdapter);
                        }
                    } else {
                        if (i10 == 5) {
                            if (adapter != this.gifAdapter) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.gifAdapter);
                            }
                        } else if (i10 == 15) {
                            if (adapter != this.pollAdapter) {
                                recycleAdapter(adapter);
                                this.pollAdapter.listView = this.mediaPages[z ? 1 : 0].listView;
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.pollAdapter);
                            }
                        } else if (i10 == 6) {
                            if (adapter != this.commonGroupsAdapter) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.commonGroupsAdapter);
                            }
                        } else if (i10 == 7) {
                            if (adapter != this.chatUsersAdapter) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.chatUsersAdapter);
                            }
                        } else if (isAnyStoryPageType(i10)) {
                            StoriesAdapter storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                            if (adapter != storyAlbums_getStoriesAdapterByTabType) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(storyAlbums_getStoriesAdapterByTabType);
                                this.mediaPages[z ? 1 : 0].listView.updateEmptyViewAnimated();
                            }
                            MediaPage mediaPage5 = this.mediaPages[z ? 1 : 0];
                            if (mediaPage5.selectedType != 9) {
                                this.storiesReorder.attachToRecyclerView(mediaPage5.listView);
                            }
                            i = this.mediaColumnsCount[1];
                            recycledViewPool = recycledViewPool2;
                            z2 = false;
                        } else {
                            int i13 = this.mediaPages[z ? 1 : 0].selectedType;
                            if (i13 == 10) {
                                if (adapter != this.channelRecommendationsAdapter) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.channelRecommendationsAdapter);
                                }
                            } else if (i13 == 11) {
                                if (adapter != this.savedDialogsAdapter) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedDialogsAdapter);
                                    SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
                                    ItemTouchHelper itemTouchHelper = savedDialogsAdapter.itemTouchHelper;
                                    InternalListView internalListView4 = this.mediaPages[z ? 1 : 0].listView;
                                    savedDialogsAdapter.attachedToRecyclerView = internalListView4;
                                    itemTouchHelper.attachToRecyclerView(internalListView4);
                                }
                                recycledViewPool = this.savedDialogsAdapter.viewPool;
                                z2 = false;
                                z3 = true;
                                i = 100;
                                int i14 = this.mediaPages[z ? 1 : 0].selectedType;
                                boolean z7 = i14 != 0 || isAnyStoryPageType(i14);
                                this.mediaPages[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, !z7 ? 0.0f : 12.0f, (!z7 ? 8 : 12) + 48, !z7 ? 0.0f : 12.0f, !z7 ? 0.0f : 12.0f));
                                if (!z3) {
                                    this.mediaPages[z ? 1 : 0].listView.setSections(false);
                                } else {
                                    this.mediaPages[z ? 1 : 0].listView.disableSections();
                                }
                                mediaPage = this.mediaPages[z ? 1 : 0];
                                if (mediaPage.selectedType != 15) {
                                    mediaPage.setBackground(PreviewView.getBackgroundDrawable(mediaPage.getBackground(), this.profileActivity.getCurrentAccount(), this.dialog_id, Theme.isCurrentThemeDark()));
                                    this.mediaPages[z ? 1 : 0].setOutlineProvider(new ViewOutlineProvider() { // from class: org.telegram.ui.Components.SharedMediaLayout.48
                                        @Override // android.view.ViewOutlineProvider
                                        public void getOutline(View view, Outline outline) {
                                            outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), view.getHeight() + AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                                        }
                                    });
                                    this.mediaPages[z ? 1 : 0].setClipToOutline(true);
                                } else {
                                    mediaPage.setClipToOutline(false);
                                    this.mediaPages[z ? 1 : 0].setBackground(null);
                                }
                                mediaPage2 = this.mediaPages[z ? 1 : 0];
                                if (mediaPage2.selectedType != 11) {
                                    mediaPage2.listView.setItemAnimator(this.mediaPages[z ? 1 : 0].itemAnimator);
                                } else {
                                    mediaPage2.listView.setItemAnimator(null);
                                    if (this.savedDialogsAdapter != null) {
                                        InternalListView internalListView5 = this.mediaPages[z ? 1 : 0].listView;
                                        SavedDialogsAdapter savedDialogsAdapter2 = this.savedDialogsAdapter;
                                        if (internalListView5 == savedDialogsAdapter2.attachedToRecyclerView) {
                                            ItemTouchHelper itemTouchHelper2 = savedDialogsAdapter2.itemTouchHelper;
                                            savedDialogsAdapter2.attachedToRecyclerView = null;
                                            itemTouchHelper2.attachToRecyclerView(null);
                                        }
                                    }
                                }
                                chatActivityContainer = this.savedMessagesContainer;
                                if (chatActivityContainer != null && this.mediaPages[z ? 1 : 0].selectedType != 12 && chatActivityContainer.getParent() == this.mediaPages[z ? 1 : 0]) {
                                    this.savedMessagesContainer.chatActivity.onRemoveFromParent();
                                    this.mediaPages[z ? 1 : 0].removeView(this.savedMessagesContainer);
                                }
                                botPreviewsEditContainer = this.botPreviewsContainer;
                                if (botPreviewsEditContainer != null && this.mediaPages[z ? 1 : 0].selectedType != 13) {
                                    parent2 = botPreviewsEditContainer.getParent();
                                    mediaPage4 = this.mediaPages[z ? 1 : 0];
                                    if (parent2 == mediaPage4) {
                                        mediaPage4.removeView(this.botPreviewsContainer);
                                    }
                                }
                                profileGiftsContainer = this.giftsContainer;
                                if (profileGiftsContainer != null && this.mediaPages[z ? 1 : 0].selectedType != 14) {
                                    parent = profileGiftsContainer.getParent();
                                    mediaPage3 = this.mediaPages[z ? 1 : 0];
                                    if (parent == mediaPage3) {
                                        mediaPage3.removeView(this.giftsContainer);
                                    }
                                }
                                i2 = this.mediaPages[z ? 1 : 0].selectedType;
                                if (i2 == 0 && i2 != 11 && !isAnyStoryPageType(i2) && (i6 = this.mediaPages[z ? 1 : 0].selectedType) != 2 && i6 != 5 && i6 != 6 && ((i6 != 7 || this.delegate.canSearchMembers()) && (i7 = this.mediaPages[z ? 1 : 0].selectedType) != 10 && i7 != 13 && i7 != 14)) {
                                    if (z) {
                                        ActionBarMenuItem actionBarMenuItem = this.searchItem;
                                        if (actionBarMenuItem != null && actionBarMenuItem.getVisibility() == 4 && !this.actionBar.isSearchFieldVisible()) {
                                            if (canShowSearchItem()) {
                                                this.searchItemState = 1;
                                                this.searchItem.setVisibility(0);
                                            } else {
                                                this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                                            }
                                            float f = z ? 1.0f : 0.0f;
                                            this.searchAlpha = getSearchAlpha(f);
                                            updateSearchItemIcon(1.0f - f);
                                        } else {
                                            this.searchItemState = 0;
                                            this.searchAlpha = 1.0f;
                                        }
                                    } else {
                                        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
                                        if (actionBarMenuItem2 != null) {
                                            if (actionBarMenuItem2.getVisibility() == 4) {
                                                if (canShowSearchItem()) {
                                                    this.searchItemState = 0;
                                                    this.searchAlpha = 1.0f;
                                                    this.searchItem.setVisibility(0);
                                                } else {
                                                    this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                                                    this.searchAlpha = 0.0f;
                                                }
                                            }
                                            updateOptionsSearch();
                                        }
                                    }
                                    updateOptionsSearch();
                                } else if (!z) {
                                    this.searchItemState = 2;
                                } else {
                                    this.searchItemState = 0;
                                    ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
                                    if (actionBarMenuItem3 != null) {
                                        actionBarMenuItem3.setVisibility((isStoriesView() || this.searching) ? 8 : 4);
                                    }
                                }
                                i3 = this.mediaPages[z ? 1 : 0].selectedType;
                                if (i3 != 6) {
                                    if (!this.commonGroupsAdapter.loading && !this.commonGroupsAdapter.endReached && this.commonGroupsAdapter.chats.isEmpty()) {
                                        this.commonGroupsAdapter.getChats(0L, 100);
                                    }
                                } else if (i3 != 7) {
                                    if (isAnyStoryPageType(i3)) {
                                        StoriesAdapter storyAlbums_getStoriesAdapterByTabType2 = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                                        if (storyAlbums_getStoriesAdapterByTabType2 != null) {
                                            StoriesController.StoriesList storiesList = storyAlbums_getStoriesAdapterByTabType2.storiesList;
                                            storyAlbums_getStoriesAdapterByTabType2.load(false);
                                            this.mediaPages[z ? 1 : 0].emptyView.showProgress(storiesList != null && (storiesList.isLoading() || (hasInternet() && storiesList.getCount() > 0)), z);
                                            z2 = (storiesList == null || storiesList.getCount() <= 0 || isSearchingStories()) ? false : true;
                                        }
                                    } else {
                                        int i15 = this.mediaPages[z ? 1 : 0].selectedType;
                                        if (i15 != 10 && i15 != 11 && i15 != 12 && i15 != 13 && i15 != 14) {
                                            if (i15 == 15) {
                                                i15 = 8;
                                            }
                                            SharedMediaData sharedMediaData6 = this.sharedMediaData[i15];
                                            if (!sharedMediaData6.loading && !sharedMediaData6.endReached[0] && sharedMediaData6.messages.isEmpty()) {
                                                this.sharedMediaData[i15].loading = true;
                                                this.documentsAdapter.notifyDataSetChanged();
                                                if (i15 == 0) {
                                                    int i16 = this.sharedMediaData[0].filterType;
                                                    if (i16 == 1) {
                                                        i4 = 6;
                                                    } else if (i16 == 2) {
                                                        i4 = 7;
                                                    }
                                                    this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i4, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i4].requestIndex, null, null);
                                                }
                                                i4 = i15;
                                                this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i4, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i4].requestIndex, null, null);
                                            }
                                        }
                                    }
                                }
                                i5 = this.mediaPages[z ? 1 : 0].selectedType;
                                if (i5 != 8 || isStoryAlbumPageType(i5)) {
                                    StickerEmptyView stickerEmptyView = this.mediaPages[z ? 1 : 0].emptyView;
                                    isStoryAlbumPageType = isStoryAlbumPageType(this.mediaPages[z ? 1 : 0].selectedType);
                                    final int storyAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                                    stickerEmptyView.stickerView.setVisibility((!isStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
                                    if (!isStoryAlbumPageType) {
                                        stickerEmptyView.button.setVisibility(0);
                                        stickerEmptyView.button.setText(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), false);
                                    } else if (isSelf()) {
                                        stickerEmptyView.button.setVisibility(8);
                                    } else {
                                        stickerEmptyView.setStickerType(11);
                                        stickerEmptyView.button.setVisibility(!isSearchingStories() ? 0 : 8);
                                        stickerEmptyView.button.setText(addPostText(), false);
                                    }
                                    if (!isStoryAlbumPageType) {
                                        stickerEmptyView.title.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                                        stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                                    } else {
                                        stickerEmptyView.title.setText(LocaleController.getString(!isSearchingStories() ? isStoriesView() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle : R.string.NoHashtagStoriesTitle));
                                        stickerEmptyView.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : "");
                                    }
                                    stickerEmptyView.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            SharedMediaLayout.this.lambda$switchToCurrentSelectedMode$50(isStoryAlbumPageType, storyAlbums_getAlbumIdByTabType, view);
                                        }
                                    });
                                } else {
                                    MediaPage mediaPage6 = this.mediaPages[z ? 1 : 0];
                                    if (mediaPage6.selectedType != 9) {
                                        mediaPage6.emptyView.stickerView.setVisibility(0);
                                        this.mediaPages[z ? 1 : 0].emptyView.setStickerType(1);
                                        this.mediaPages[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                                        this.mediaPages[z ? 1 : 0].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                                        this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(8);
                                    } else {
                                        if (isSelf()) {
                                            this.mediaPages[z ? 1 : 0].emptyView.stickerView.setVisibility(8);
                                            this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(8);
                                        } else {
                                            this.mediaPages[z ? 1 : 0].emptyView.stickerView.setVisibility(0);
                                            this.mediaPages[z ? 1 : 0].emptyView.setStickerType(11);
                                            this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(0);
                                            this.mediaPages[z ? 1 : 0].emptyView.button.setText(addPostText(), false);
                                        }
                                        this.mediaPages[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                                        this.mediaPages[z ? 1 : 0].emptyView.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : "");
                                        this.mediaPages[z ? 1 : 0].emptyView.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda2
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                SharedMediaLayout.this.lambda$switchToCurrentSelectedMode$51(view);
                                            }
                                        });
                                    }
                                }
                                this.mediaPages[z ? 1 : 0].listView.setVisibility(0);
                            } else if (i13 == 12) {
                                if (adapter != null) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                }
                                if (this.savedMessagesContainer.getParent() != this.mediaPages[z ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(this.savedMessagesContainer);
                                    this.mediaPages[z ? 1 : 0].addView(this.savedMessagesContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                }
                            } else if (i13 == 13) {
                                if (adapter != null) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                }
                                BotPreviewsEditContainer botPreviewsEditContainer2 = this.botPreviewsContainer;
                                if (botPreviewsEditContainer2 != null && botPreviewsEditContainer2.getParent() != this.mediaPages[z ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(this.botPreviewsContainer);
                                    this.mediaPages[z ? 1 : 0].addView(this.botPreviewsContainer);
                                }
                            } else if (i13 == 14) {
                                if (adapter != null) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                }
                                ProfileGiftsContainer profileGiftsContainer3 = this.giftsContainer;
                                if (profileGiftsContainer3 != null && profileGiftsContainer3.getParent() != this.mediaPages[z ? 1 : 0]) {
                                    AndroidUtilities.removeFromParent(this.giftsContainer);
                                    this.mediaPages[z ? 1 : 0].addView(this.giftsContainer);
                                    this.mediaPages[z ? 1 : 0].emptyView.setVisibility(4);
                                }
                            }
                        }
                        z4 = false;
                        z5 = false;
                        i = 100;
                        boolean z8 = z5;
                        z2 = z4;
                        recycledViewPool = recycledViewPool2;
                        z3 = z8;
                        int i142 = this.mediaPages[z ? 1 : 0].selectedType;
                        if (i142 != 0) {
                        }
                        this.mediaPages[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, !z7 ? 0.0f : 12.0f, (!z7 ? 8 : 12) + 48, !z7 ? 0.0f : 12.0f, !z7 ? 0.0f : 12.0f));
                        if (!z3) {
                        }
                        mediaPage = this.mediaPages[z ? 1 : 0];
                        if (mediaPage.selectedType != 15) {
                        }
                        mediaPage2 = this.mediaPages[z ? 1 : 0];
                        if (mediaPage2.selectedType != 11) {
                        }
                        chatActivityContainer = this.savedMessagesContainer;
                        if (chatActivityContainer != null) {
                            this.savedMessagesContainer.chatActivity.onRemoveFromParent();
                            this.mediaPages[z ? 1 : 0].removeView(this.savedMessagesContainer);
                        }
                        botPreviewsEditContainer = this.botPreviewsContainer;
                        if (botPreviewsEditContainer != null) {
                            parent2 = botPreviewsEditContainer.getParent();
                            mediaPage4 = this.mediaPages[z ? 1 : 0];
                            if (parent2 == mediaPage4) {
                            }
                        }
                        profileGiftsContainer = this.giftsContainer;
                        if (profileGiftsContainer != null) {
                            parent = profileGiftsContainer.getParent();
                            mediaPage3 = this.mediaPages[z ? 1 : 0];
                            if (parent == mediaPage3) {
                            }
                        }
                        i2 = this.mediaPages[z ? 1 : 0].selectedType;
                        if (i2 == 0) {
                        }
                        if (!z) {
                        }
                        i3 = this.mediaPages[z ? 1 : 0].selectedType;
                        if (i3 != 6) {
                        }
                        i5 = this.mediaPages[z ? 1 : 0].selectedType;
                        if (i5 != 8) {
                        }
                        StickerEmptyView stickerEmptyView2 = this.mediaPages[z ? 1 : 0].emptyView;
                        isStoryAlbumPageType = isStoryAlbumPageType(this.mediaPages[z ? 1 : 0].selectedType);
                        final int storyAlbums_getAlbumIdByTabType2 = storyAlbums_getAlbumIdByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                        stickerEmptyView2.stickerView.setVisibility((!isStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
                        if (!isStoryAlbumPageType) {
                        }
                        if (!isStoryAlbumPageType) {
                        }
                        stickerEmptyView2.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SharedMediaLayout.this.lambda$switchToCurrentSelectedMode$50(isStoryAlbumPageType, storyAlbums_getAlbumIdByTabType2, view);
                            }
                        });
                        this.mediaPages[z ? 1 : 0].listView.setVisibility(0);
                    }
                    z4 = false;
                }
                z5 = true;
                i = 100;
                boolean z82 = z5;
                z2 = z4;
                recycledViewPool = recycledViewPool2;
                z3 = z82;
                int i1422 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i1422 != 0) {
                }
                this.mediaPages[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, !z7 ? 0.0f : 12.0f, (!z7 ? 8 : 12) + 48, !z7 ? 0.0f : 12.0f, !z7 ? 0.0f : 12.0f));
                if (!z3) {
                }
                mediaPage = this.mediaPages[z ? 1 : 0];
                if (mediaPage.selectedType != 15) {
                }
                mediaPage2 = this.mediaPages[z ? 1 : 0];
                if (mediaPage2.selectedType != 11) {
                }
                chatActivityContainer = this.savedMessagesContainer;
                if (chatActivityContainer != null) {
                }
                botPreviewsEditContainer = this.botPreviewsContainer;
                if (botPreviewsEditContainer != null) {
                }
                profileGiftsContainer = this.giftsContainer;
                if (profileGiftsContainer != null) {
                }
                i2 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i2 == 0) {
                }
                if (!z) {
                }
                i3 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i3 != 6) {
                }
                i5 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i5 != 8) {
                }
                StickerEmptyView stickerEmptyView22 = this.mediaPages[z ? 1 : 0].emptyView;
                isStoryAlbumPageType = isStoryAlbumPageType(this.mediaPages[z ? 1 : 0].selectedType);
                final int storyAlbums_getAlbumIdByTabType22 = storyAlbums_getAlbumIdByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                stickerEmptyView22.stickerView.setVisibility((!isStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
                if (!isStoryAlbumPageType) {
                }
                if (!isStoryAlbumPageType) {
                }
                stickerEmptyView22.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedMediaLayout.this.lambda$switchToCurrentSelectedMode$50(isStoryAlbumPageType, storyAlbums_getAlbumIdByTabType22, view);
                    }
                });
                this.mediaPages[z ? 1 : 0].listView.setVisibility(0);
            }
            z3 = false;
            int i14222 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i14222 != 0) {
            }
            this.mediaPages[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, !z7 ? 0.0f : 12.0f, (!z7 ? 8 : 12) + 48, !z7 ? 0.0f : 12.0f, !z7 ? 0.0f : 12.0f));
            if (!z3) {
            }
            mediaPage = this.mediaPages[z ? 1 : 0];
            if (mediaPage.selectedType != 15) {
            }
            mediaPage2 = this.mediaPages[z ? 1 : 0];
            if (mediaPage2.selectedType != 11) {
            }
            chatActivityContainer = this.savedMessagesContainer;
            if (chatActivityContainer != null) {
            }
            botPreviewsEditContainer = this.botPreviewsContainer;
            if (botPreviewsEditContainer != null) {
            }
            profileGiftsContainer = this.giftsContainer;
            if (profileGiftsContainer != null) {
            }
            i2 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i2 == 0) {
            }
            if (!z) {
            }
            i3 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i3 != 6) {
            }
            i5 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i5 != 8) {
            }
            StickerEmptyView stickerEmptyView222 = this.mediaPages[z ? 1 : 0].emptyView;
            isStoryAlbumPageType = isStoryAlbumPageType(this.mediaPages[z ? 1 : 0].selectedType);
            final int storyAlbums_getAlbumIdByTabType222 = storyAlbums_getAlbumIdByTabType(this.mediaPages[z ? 1 : 0].selectedType);
            stickerEmptyView222.stickerView.setVisibility((!isStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
            if (!isStoryAlbumPageType) {
            }
            if (!isStoryAlbumPageType) {
            }
            stickerEmptyView222.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SharedMediaLayout.this.lambda$switchToCurrentSelectedMode$50(isStoryAlbumPageType, storyAlbums_getAlbumIdByTabType222, view);
                }
            });
            this.mediaPages[z ? 1 : 0].listView.setVisibility(0);
        } else {
            if (this.mediaPages[z ? 1 : 0].searchViewPool == null) {
                this.mediaPages[z ? 1 : 0].searchViewPool = new RecyclerView.RecycledViewPool();
            }
            recycledViewPool = this.mediaPages[z ? 1 : 0].searchViewPool;
            if (!z) {
                if (this.mediaPages[z ? 1 : 0].listView != null) {
                    int i17 = this.mediaPages[z ? 1 : 0].selectedType;
                    if (i17 == 1) {
                        if (adapter != this.documentsSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsSearchAdapter);
                        }
                        this.documentsSearchAdapter.notifyDataSetChanged();
                    } else if (i17 == 3) {
                        if (adapter != this.linksSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksSearchAdapter);
                        }
                        this.linksSearchAdapter.notifyDataSetChanged();
                    } else if (i17 == 4) {
                        if (adapter != this.audioSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioSearchAdapter);
                        }
                        this.audioSearchAdapter.notifyDataSetChanged();
                    } else if (i17 == 7) {
                        if (adapter != this.groupUsersSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.groupUsersSearchAdapter);
                        }
                        this.groupUsersSearchAdapter.notifyDataSetChanged();
                    } else if (i17 == 11) {
                        if (adapter != this.savedMessagesSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedMessagesSearchAdapter);
                        }
                        this.savedMessagesSearchAdapter.notifyDataSetChanged();
                    }
                }
            } else {
                int i18 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i18 == 0 || i18 == 2 || i18 == 5 || i18 == 6 || (i18 == 7 && !this.delegate.canSearchMembers())) {
                    this.searching = false;
                    SearchTagsList searchTagsList = this.searchTagsList;
                    if (searchTagsList != null) {
                        searchTagsList.show(false);
                    }
                    this.searchWas = false;
                    switchToCurrentSelectedMode(true);
                    return;
                }
                ActionBarMenuItem actionBarMenuItem4 = this.searchItem;
                String obj = actionBarMenuItem4 != null ? actionBarMenuItem4.getSearchField().getText().toString() : "";
                int i19 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i19 == 1) {
                    MediaSearchAdapter mediaSearchAdapter = this.documentsSearchAdapter;
                    if (mediaSearchAdapter != null) {
                        mediaSearchAdapter.search(obj, false);
                        if (adapter != this.documentsSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsSearchAdapter);
                        }
                    }
                } else if (i19 == 3) {
                    MediaSearchAdapter mediaSearchAdapter2 = this.linksSearchAdapter;
                    if (mediaSearchAdapter2 != null) {
                        mediaSearchAdapter2.search(obj, false);
                        if (adapter != this.linksSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksSearchAdapter);
                        }
                    }
                } else if (i19 == 4) {
                    MediaSearchAdapter mediaSearchAdapter3 = this.audioSearchAdapter;
                    if (mediaSearchAdapter3 != null) {
                        mediaSearchAdapter3.search(obj, false);
                        if (adapter != this.audioSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioSearchAdapter);
                        }
                    }
                } else if (i19 == 7) {
                    GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
                    if (groupUsersSearchAdapter != null) {
                        groupUsersSearchAdapter.search(obj, false);
                        if (adapter != this.groupUsersSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.groupUsersSearchAdapter);
                        }
                    }
                } else if (i19 == 11) {
                    SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                    if (savedMessagesSearchAdapter != null) {
                        savedMessagesSearchAdapter.search(obj, this.searchingReaction);
                        if (adapter != this.savedMessagesSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedMessagesSearchAdapter);
                        }
                    }
                } else if (i19 == 15 && (pollAdapter = this.pollAdapter) != null && adapter != pollAdapter) {
                    recycleAdapter(adapter);
                    this.pollAdapter.listView = this.mediaPages[z ? 1 : 0].listView;
                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.pollAdapter);
                }
            }
            z2 = false;
            i = 100;
        }
        MediaPage mediaPage7 = this.mediaPages[z ? 1 : 0];
        mediaPage7.fastScrollEnabled = z2;
        updateFastScrollVisibility(mediaPage7, false);
        this.mediaPages[z ? 1 : 0].layoutManager.setSpanCount(i);
        this.mediaPages[z ? 1 : 0].listView.invalidateItemDecorations();
        if (recycledViewPool != null) {
            this.mediaPages[z ? 1 : 0].listView.setRecycledViewPool(recycledViewPool);
            this.mediaPages[z ? 1 : 0].animationSupportingListView.setRecycledViewPool(recycledViewPool);
        }
        if (this.searchItemState == 2 && this.actionBar.isSearchFieldVisible()) {
            this.ignoreSearchCollapse = true;
            this.actionBar.closeSearchField();
            this.searchItemState = 0;
            this.searchAlpha = 0.0f;
            ActionBarMenuItem actionBarMenuItem5 = this.searchItem;
            if (actionBarMenuItem5 != null) {
                actionBarMenuItem5.setVisibility(isStoriesView() ? 8 : 4);
            }
            updateOptionsSearch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToCurrentSelectedMode$50(boolean z, int i, View view) {
        if (z) {
            openAddStoriesToAlbumSheet(this.profileActivity, this.dialog_id, i);
        } else {
            this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
            StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToCurrentSelectedMode$51(View view) {
        this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
        StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        return onItemLongClick(messageObject, view, i, true);
    }

    private boolean onItemLongClick(final MessageObject messageObject, final View view, final int i, boolean z) {
        StoriesAdapter storiesAdapter;
        StoriesController.StoriesList storiesList;
        if (this.isActionModeShowed || this.profileActivity.getParentActivity() == null || messageObject == null) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.profileActivity.getParentActivity().getCurrentFocus());
        int i2 = 8;
        if (z && ((isStoryAlbumPageType(getClosestTab()) || getClosestTab() == 8) && !isActionModeShown())) {
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).initFullSizeReceiver();
            }
            final TL_stories.StoryItem storyItem = messageObject.storyItem;
            if (storyItem == null) {
                return false;
            }
            final HashSet hashSet = new HashSet();
            ArrayList<Integer> arrayList = storyItem.albums;
            if (arrayList != null) {
                hashSet.addAll(arrayList);
            }
            boolean isStoryAlbumPageType = isStoryAlbumPageType(getClosestTab());
            final ItemOptions makeOptions = ItemOptions.makeOptions(this.profileActivity, view, true);
            final ItemOptions makeSwipeback = makeOptions.makeSwipeback();
            makeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda379(makeOptions));
            makeSwipeback.addGap();
            ItemOptions.addAlbumsItemOptions(makeSwipeback, getStoriesController().getStoryAlbumsList(this.dialog_id), hashSet, true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$onItemLongClick$54(storyItem, makeOptions);
                }
            }, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda25
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    SharedMediaLayout.this.lambda$onItemLongClick$55(hashSet, storyItem, makeOptions, (StoriesController.StoryAlbum) obj);
                }
            });
            makeOptions.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    ItemOptions.this.openSwipeback(makeSwipeback);
                }
            });
            makeOptions.addGap();
            makeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$onItemLongClick$57(messageObject, view, i);
                }
            });
            if (isStoryAlbumPageType) {
                final int storyAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(getClosestTab());
                final String albumName = getStoriesController().getAlbumName(this.dialog_id, storyAlbums_getAlbumIdByTabType);
                makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.this.lambda$onItemLongClick$58(storyAlbums_getAlbumIdByTabType);
                    }
                });
                makeOptions.add(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.this.lambda$onItemLongClick$60(storyAlbums_getAlbumIdByTabType, storyItem, albumName);
                    }
                });
            } else {
                if (getClosestTab() == 8 && (storiesAdapter = this.storiesAdapter) != null && (storiesList = storiesAdapter.storiesList) != null) {
                    if (storiesList.isPinned(storyItem.id)) {
                        makeOptions.add(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda30
                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedMediaLayout.this.lambda$onItemLongClick$61(storyItem);
                            }
                        });
                    } else {
                        makeOptions.add(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda31
                            @Override // java.lang.Runnable
                            public final void run() {
                                SharedMediaLayout.this.lambda$onItemLongClick$62(storyItem);
                            }
                        });
                    }
                }
                makeOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda32
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.this.lambda$onItemLongClick$63(storyItem);
                    }
                });
            }
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda23
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.this.lambda$onItemLongClick$66(storyItem);
                }
            });
            makeOptions.setGravity(3);
            makeOptions.setBlur(true);
            makeOptions.allowMoveScrim();
            makeOptions.allowMoveScrimGravity(3);
            Point point = AndroidUtilities.displaySize;
            Point point2 = AndroidUtilities.displaySize;
            int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
            makeOptions.animateToSize(min, (min * 4) / 3);
            makeOptions.setDrawScrim(true);
            makeOptions.hideScrimUnder();
            makeOptions.forceBottom(true);
            makeOptions.show();
            return true;
        }
        this.selectedFiles[messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
        if (!messageObject.canDeleteMessage(false, null)) {
            this.cantDeleteMessagesCount++;
        }
        this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
        ActionBarMenuItem actionBarMenuItem = this.gotoItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
        if (actionBarMenuItem2 != null) {
            if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                i2 = 0;
            }
            actionBarMenuItem2.setVisibility(i2);
        }
        this.selectedMessagesCountTextView.setNumber(1, false);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < this.actionModeViews.size(); i3++) {
            View view2 = (View) this.actionModeViews.get(i3);
            AndroidUtilities.clearDrawableAnimation(view2);
            arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(250L);
        animatorSet.start();
        this.scrolling = false;
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell) {
            ((SharedPhotoVideoCell) view).setChecked(i, true, true);
        } else if (view instanceof SharedLinkCell) {
            ((SharedLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).setChecked(true, true);
        } else if (view instanceof ContextLinkCell) {
            ((ContextLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell2) {
            ((SharedPhotoVideoCell2) view).setChecked(true, true);
        }
        if (!this.isActionModeShowed) {
            showActionMode(true);
        }
        onActionModeSelectedUpdate(this.selectedFiles[0]);
        updateForwardItem();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$54(final TL_stories.StoryItem storyItem, ItemOptions itemOptions) {
        AlertsCreator.createStoriesAlbumEnterNameForCreate(getContext(), null, this.resourcesProvider, new MessagesStorage.StringCallback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda55
            @Override // org.telegram.messenger.MessagesStorage.StringCallback
            public final void run(String str) {
                SharedMediaLayout.this.lambda$onItemLongClick$53(storyItem, str);
            }
        });
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$53(final TL_stories.StoryItem storyItem, String str) {
        getStoriesController().createAlbum(this.dialog_id, str, new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda73
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                SharedMediaLayout.this.lambda$onItemLongClick$52(storyItem, (StoriesController.StoryAlbum) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$52(TL_stories.StoryItem storyItem, StoriesController.StoryAlbum storyAlbum) {
        getStoriesController().addStoryToAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
        onStoryAlbumCreate(storyAlbum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$55(HashSet hashSet, TL_stories.StoryItem storyItem, ItemOptions itemOptions, StoriesController.StoryAlbum storyAlbum) {
        String formatString;
        if (hashSet.contains(Integer.valueOf(storyAlbum.album_id))) {
            getStoriesController().addStoryToAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
            formatString = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
        } else {
            getStoriesController().removeStoryFromAlbum(this.dialog_id, storyAlbum.album_id, storyItem);
            formatString = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
        }
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(formatString)).show();
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$57(MessageObject messageObject, View view, int i) {
        onItemLongClick(messageObject, view, i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$59(int i, TL_stories.StoryItem storyItem) {
        getStoriesController().addStoryToAlbum(this.dialog_id, i, storyItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$60(final int i, final TL_stories.StoryItem storyItem, String str) {
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$onItemLongClick$59(i, storyItem);
            }
        };
        getStoriesController().removeStoryFromAlbum(this.dialog_id, i, storyItem);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), runnable).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$61(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$62(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$63(TL_stories.StoryItem storyItem) {
        getStoriesController().updateStoriesPinned(this.dialog_id, new ArrayList(Collections.singletonList(storyItem)), false, null);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", 1, new Object[0]), 5000).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onItemLongClick$66(final TL_stories.StoryItem storyItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda48
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                SharedMediaLayout.this.lambda$onItemLongClick$64(storyItem, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda49
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
    public /* synthetic */ void lambda$onItemLongClick$64(TL_stories.StoryItem storyItem, AlertDialog alertDialog, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).show();
        closeActionMode(false);
    }

    private void onItemClick(int i, View view, MessageObject messageObject, int i2, int i3) {
        if (messageObject == null || this.photoVideoChangeColumnsAnimation) {
            return;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            String str = null;
            str = null;
            int i4 = 0;
            i4 = 0;
            if (this.isActionModeShowed) {
                int i5 = 8;
                if (i3 == 8 && !canEditStories()) {
                    return;
                }
                char c = messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1;
                if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                    this.selectedFiles[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount--;
                    }
                } else {
                    if (this.selectedFiles[0].size() + this.selectedFiles[1].size() >= 100) {
                        return;
                    }
                    this.selectedFiles[c].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount++;
                    }
                }
                onActionModeSelectedUpdate(this.selectedFiles[0]);
                if (this.selectedFiles[0].size() == 0 && this.selectedFiles[1].size() == 0) {
                    showActionMode(false);
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedFiles[0].size() + this.selectedFiles[1].size(), true);
                    this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                    ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || this.selectedFiles[0].size() != 1) ? 8 : 0);
                    }
                    ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
                    if (actionBarMenuItem2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i5 = 0;
                        }
                        actionBarMenuItem2.setVisibility(i5);
                    }
                    updateStoriesPinButton();
                }
                this.scrolling = false;
                if (view instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) view).setChecked(i2, this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedLinkCell) {
                    ((SharedLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof ContextLinkCell) {
                    ((ContextLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else if (i3 == 0) {
                int i6 = i - this.sharedMediaData[i3].startOffset;
                if (i6 >= 0 && i6 < this.sharedMediaData[i3].messages.size()) {
                    PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, i6, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 2 || i3 == 4) {
                if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).didPressedButton();
                }
            } else if (i3 == 5) {
                PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                int indexOf = this.sharedMediaData[i3].messages.indexOf(messageObject);
                if (indexOf < 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(messageObject);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, 0L, 0L, 0L, this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, indexOf, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 1) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    TLRPC.Document document = messageObject.getDocument();
                    if (sharedDocumentCell.isLoaded()) {
                        if (messageObject.canPreviewDocument()) {
                            PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                            int indexOf2 = this.sharedMediaData[i3].messages.indexOf(messageObject);
                            if (indexOf2 < 0) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(messageObject);
                                PhotoViewer.getInstance().openPhoto(arrayList2, 0, 0L, 0L, 0L, this.provider);
                                return;
                            }
                            PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, indexOf2, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                            return;
                        }
                        AndroidUtilities.openDocument(messageObject, this.profileActivity.getParentActivity(), this.profileActivity);
                    } else if (!sharedDocumentCell.isLoading()) {
                        MessageObject message = sharedDocumentCell.getMessage();
                        message.putInDownloadsStore = true;
                        this.profileActivity.getFileLoader().loadFile(document, message, 0, 0);
                        sharedDocumentCell.updateFileExistIcon(true);
                    } else {
                        this.profileActivity.getFileLoader().cancelLoadFile(document);
                        sharedDocumentCell.updateFileExistIcon(true);
                    }
                }
            } else if (i3 == 3) {
                try {
                    TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                    if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.instance;
                            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                                this.profileActivity.createArticleViewer(false).open(messageObject);
                                return;
                            }
                            return;
                        }
                        String str2 = webPage.embed_url;
                        if (str2 != null && str2.length() != 0) {
                            openWebView(webPage, messageObject);
                            return;
                        }
                        str = webPage.url;
                    }
                    if (str == null) {
                        str = ((SharedLinkCell) view).getLink(0);
                    }
                    if (str != null) {
                        openUrl(str);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (isAnyStoryPageType(i3)) {
                StoriesAdapter storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i3);
                final StoriesController.StoriesList storiesList = storyAlbums_getStoriesAdapterByTabType != null ? storyAlbums_getStoriesAdapterByTabType.storiesList : null;
                if (storiesList == null) {
                    return;
                }
                StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
                Context context = getContext();
                int id = messageObject.getId();
                StoriesListPlaceProvider with = StoriesListPlaceProvider.of(this.mediaPages[i2].listView).with(new StoriesListPlaceProvider.LoadNextInterface() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda57
                    @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.LoadNextInterface
                    public final void loadNext(boolean z) {
                        SharedMediaLayout.lambda$onItemClick$67(StoriesController.StoriesList.this, z);
                    }
                });
                BaseFragment baseFragment = this.profileActivity;
                if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                    i4 = AndroidUtilities.dp(68.0f);
                }
                orCreateStoryViewer.open(context, id, storiesList, with.addBottomClip(i4));
            }
            updateForwardItem();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onItemClick$67(StoriesController.StoriesList storiesList, boolean z) {
        if (z) {
            storiesList.load(false, 30);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.profileActivity, str, true, true);
        } else {
            Browser.openUrl(this.profileActivity.getParentActivity(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.profileActivity, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, false);
    }

    private void recycleAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SharedPhotoVideoAdapter) {
            this.cellCache.addAll(this.cache);
            this.cache.clear();
        } else if (adapter == this.audioAdapter) {
            this.audioCellCache.addAll(this.audioCache);
            this.audioCache.clear();
        } else {
            PollAdapter pollAdapter = this.pollAdapter;
            if (adapter == pollAdapter) {
                pollAdapter.listView = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixLayoutInternal(int i) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (!AndroidUtilities.isTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 2) {
                this.selectedMessagesCountTextView.setTextSize(18);
            } else {
                this.selectedMessagesCountTextView.setTextSize(20);
            }
        }
        if (i == 0) {
            this.photoVideoAdapter.notifyDataSetChanged();
        }
    }

    class 49 implements SharedLinkCell.SharedLinkCellDelegate {
        49() {
        }

        @Override // org.telegram.ui.Cells.SharedLinkCell.SharedLinkCellDelegate
        public void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
            SharedMediaLayout.this.openWebView(webPage, messageObject);
        }

        @Override // org.telegram.ui.Cells.SharedLinkCell.SharedLinkCellDelegate
        public boolean canPerformActions() {
            return !SharedMediaLayout.this.isActionModeShowed;
        }

        @Override // org.telegram.ui.Cells.SharedLinkCell.SharedLinkCellDelegate
        public void onLinkPress(final String str, boolean z) {
            if (!z) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(SharedMediaLayout.this.profileActivity.getParentActivity());
            builder.setTitle(str);
            builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$49$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SharedMediaLayout.49.this.lambda$onLinkPress$0(str, dialogInterface, i);
                }
            });
            SharedMediaLayout.this.profileActivity.showDialog(builder.create());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
            }
        }
    }

    private class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            return null;
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) {
                return i == 0 || i2 != 0;
            }
            return false;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getSectionCount() {
            int i = 1;
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 1;
            }
            int size = SharedMediaLayout.this.sharedMediaData[3].sections.size();
            if (SharedMediaLayout.this.sharedMediaData[3].sections.isEmpty() || (SharedMediaLayout.this.sharedMediaData[3].endReached[0] && SharedMediaLayout.this.sharedMediaData[3].endReached[1])) {
                i = 0;
            }
            return size + i;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getCountForSection(int i) {
            if ((SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) && i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return ((ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i))).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            }
            if (i != 0) {
                if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                    view.setAlpha(1.0f);
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get((String) SharedMediaLayout.this.sharedMediaData[3].sections.get(i))).get(0)).messageOwner.date));
                }
            } else {
                view.setAlpha(0.0f);
            }
            return view;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 3) {
                graySectionCell = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            } else if (i == 4) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else {
                if (i == 5) {
                    View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 3, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(createEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(5);
                graySectionCell = flickerLoadingView;
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 5) {
                return;
            }
            ArrayList arrayList = (ArrayList) SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get((String) SharedMediaLayout.this.sharedMediaData[3].sections.get(i));
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 3) {
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                View view = viewHolder.itemView;
                if (view instanceof GraySectionCell) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
                    return;
                }
                return;
            }
            if (itemViewType != 4) {
                return;
            }
            if (i != 0) {
                i2--;
            }
            if (!(viewHolder.itemView instanceof SharedLinkCell) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i2);
            sharedLinkCell.setLink(messageObject2, i2 != arrayList.size() - 1 || (i == SharedMediaLayout.this.sharedMediaData[3].sections.size() - 1 && SharedMediaLayout.this.sharedMediaData[3].loading));
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
            } else {
                sharedLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SectionsAdapter
        public int getItemViewType(int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 5;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return (i == 0 || i2 != 0) ? 4 : 3;
            }
            return 6;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    private class SharedDocumentsAdapter extends RecyclerListView.FastScrollAdapter {
        private int currentType;
        private boolean inFastScrollMode;
        private Context mContext;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] || !SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) && SharedMediaLayout.this.sharedMediaData[this.currentType].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount() == 0) {
                int startOffset = SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset() + SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size();
                return startOffset != 0 ? (SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] && SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) ? startOffset : SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() != 0 ? startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() : startOffset + 1 : startOffset;
            }
            return Math.max(SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount(), SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset() + SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            int i2 = 0;
            if (i == 7) {
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedDocumentCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = sharedDocumentCell;
            } else if (i == 8) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                if (this.currentType == 2) {
                    flickerLoadingView.setViewType(4);
                } else {
                    flickerLoadingView.setViewType(3);
                }
                flickerLoadingView.showDate(false);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = flickerLoadingView;
            } else {
                if (i == 9) {
                    View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, this.currentType, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(createEmptyStubView);
                }
                if (this.currentType == 4 && !SharedMediaLayout.this.audioCellCache.isEmpty()) {
                    View view3 = (View) SharedMediaLayout.this.audioCellCache.get(0);
                    SharedMediaLayout.this.audioCellCache.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                    view2 = view3;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                        view2 = view3;
                    }
                } else {
                    view2 = new SharedAudioCell(this.mContext, i2, SharedMediaLayout.this.resourcesProvider) { // from class: org.telegram.ui.Components.SharedMediaLayout.SharedDocumentsAdapter.1
                        @Override // org.telegram.ui.Cells.SharedAudioCell
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages : null, false);
                                return playMessage;
                            }
                            if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                            }
                            return false;
                        }
                    };
                }
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                sharedAudioCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = view2;
                if (this.currentType == 4) {
                    SharedMediaLayout.this.audioCache.add(sharedAudioCell);
                    view = view2;
                }
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].messages;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 7) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = (MessageObject) arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                    sharedDocumentCell.setDocument(messageObject, i != arrayList.size() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (itemViewType != 10) {
                return;
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof SharedAudioCell) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                MessageObject messageObject2 = (MessageObject) arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                sharedAudioCell.setMessageObject(messageObject2, i != arrayList.size() - 1);
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                if (sharedMediaLayout2.isActionModeShowed) {
                    sharedAudioCell.setChecked(sharedMediaLayout2.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    sharedAudioCell.setChecked(false, !sharedMediaLayout2.scrolling);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 9;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset || i >= SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size()) {
                return 8;
            }
            int i2 = this.currentType;
            return (i2 == 2 || i2 == 4) ? 10 : 7;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods == null) {
                return "";
            }
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) arrayList.get(arrayList.size() - 1)).formatedDate;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float totalItemsCount = f * ((getTotalItemsCount() * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = (int) (totalItemsCount / measuredHeight);
            iArr[1] = ((int) totalItemsCount) % measuredHeight;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(this.currentType);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < recyclerListView.getChildCount() && (i = SharedMediaLayout.getMessageId(recyclerListView.getChildAt(i2))) == 0; i2++) {
                    }
                    if (i == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(this.currentType, recyclerListView, true);
                    }
                }
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
        }
    }

    public static View createEmptyStubView(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        EmptyStubView emptyStubView = new EmptyStubView(context, resourcesProvider);
        if (i == 0) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMediaSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMedia));
            }
        } else if (i == 1) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFiles));
            }
        } else if (i == 2) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoice));
            }
        } else if (i == 3) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinks));
            }
        } else if (i == 4) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudio));
            }
        } else if (i == 5) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGIFs));
            }
        } else if (i == 6) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
        } else if (i == 7) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText("");
        }
        return emptyStubView;
    }

    private static class EmptyStubView extends LinearLayout {
        final ImageView emptyImageView;
        final TextView emptyTextView;
        boolean ignoreRequestLayout;

        public EmptyStubView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.emptyTextView = textView;
            ImageView imageView = new ImageView(context);
            this.emptyImageView = imageView;
            setOrientation(1);
            setGravity(17);
            addView(imageView, LayoutHelper.createLinear(-2, -2));
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 17.0f);
            textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            addView(textView, LayoutHelper.createLinear(-2, -2, 17, 0, 24, 0, 0));
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            this.ignoreRequestLayout = true;
            if (AndroidUtilities.isTablet()) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            } else if (rotation == 3 || rotation == 1) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
            } else {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            }
            this.ignoreRequestLayout = false;
            super.onMeasure(i, i2);
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.ignoreRequestLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    private class SharedPhotoVideoAdapter extends RecyclerListView.FastScrollAdapter {
        protected boolean inFastScrollMode;
        protected Context mContext;
        SharedPhotoVideoCell2.SharedResources sharedResources;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        public int getPositionForIndex(int i) {
            return SharedMediaLayout.this.sharedMediaData[0].startOffset + i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                    return 1;
                }
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && (!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1])) {
                    return 0;
                }
                int startOffset = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset != 0 ? (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? startOffset : startOffset + 1 : startOffset;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) && SharedMediaLayout.this.sharedMediaData[0].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].getTotalCount() == 0) {
                int startOffset2 = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset2 != 0 ? (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? startOffset2 : SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() != 0 ? startOffset2 + SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() : startOffset2 + 1 : startOffset2;
            }
            return Math.max(SharedMediaLayout.this.sharedMediaData[0].getTotalCount(), SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0 && i != 19) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), SharedMediaLayout.this.resourcesProvider);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.mContext, this.sharedResources, SharedMediaLayout.this.profileActivity.getCurrentAccount());
            if (i == 19) {
                sharedPhotoVideoCell2.setCheck2();
            }
            sharedPhotoVideoCell2.setGradientView(SharedMediaLayout.this.globalGradientView);
            if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) {
                sharedPhotoVideoCell2.isStory = true;
            }
            sharedPhotoVideoCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ArrayList messages = SharedMediaLayout.this.sharedMediaData[0].getMessages();
                int startOffset = i - SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int messageId = sharedPhotoVideoCell2.getMessageId();
                    int i2 = this == SharedMediaLayout.this.photoVideoAdapter ? SharedMediaLayout.this.mediaColumnsCount[0] : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
                    if (startOffset >= 0 && startOffset < messages.size()) {
                        MessageObject messageObject = (MessageObject) messages.get(startOffset);
                        boolean z = messageObject.getId() == messageId;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z);
                        } else {
                            sharedPhotoVideoCell2.setChecked(false, z);
                        }
                        sharedPhotoVideoCell2.setMessageObject(messageObject, i2);
                        return;
                    }
                    sharedPhotoVideoCell2.setMessageObject(null, i2);
                    sharedPhotoVideoCell2.setChecked(false, false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (!this.inFastScrollMode && SharedMediaLayout.this.sharedMediaData[0].getMessages().size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading && SharedMediaLayout.this.sharedMediaData[0].startReached) {
                return 2;
            }
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            return 0;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods == null) {
                return "";
            }
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) arrayList.get(arrayList.size() - 1)).formatedDate;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            int i = (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1 || this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) ? SharedMediaLayout.this.animateToColumnsCount : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            int ceil = (int) (Math.ceil(getTotalItemsCount() / i) * measuredHeight);
            int measuredHeight2 = recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop();
            if (measuredHeight == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            } else {
                float f2 = f * (ceil - measuredHeight2);
                iArr[0] = ((int) (f2 / measuredHeight)) * i;
                iArr[1] = ((int) f2) % measuredHeight;
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
                        View childAt = recyclerListView.getChildAt(i2);
                        if (childAt instanceof SharedPhotoVideoCell2) {
                            i = ((SharedPhotoVideoCell2) childAt).getMessageId();
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    if (i == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(0, recyclerListView, true);
                    }
                }
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int i = (this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1) ? SharedMediaLayout.this.animateToColumnsCount : SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            int ceil = (int) Math.ceil(getTotalItemsCount() / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(0)) < 0) {
                return 0.0f;
            }
            return (((r5 / i) * measuredHeight) - (r1.getTop() - recyclerListView.getPaddingTop())) / ((ceil * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            if (SharedMediaLayout.this.isSearchingStories()) {
                return false;
            }
            return recyclerListView.getChildCount() != 0 && ((int) Math.ceil((double) (((float) getTotalItemsCount()) / ((float) ((this == SharedMediaLayout.this.photoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) ? SharedMediaLayout.this.mediaColumnsCount[0] : SharedMediaLayout.this.animateToColumnsCount))))) * recyclerListView.getChildAt(0).getMeasuredHeight() > recyclerListView.getMeasuredHeight();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(0, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void findPeriodAndJumpToDate(int i, RecyclerListView recyclerListView, boolean z) {
        ArrayList arrayList = this.sharedMediaData[i].fastScrollPeriods;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerListView.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0) {
            Period period = null;
            if (arrayList != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (findFirstVisibleItemPosition <= ((Period) arrayList.get(i2)).startOffset) {
                        period = (Period) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (period == null) {
                    period = (Period) arrayList.get(arrayList.size() - 1);
                }
            }
            if (period != null) {
                jumpToDate(i, period.maxId, period.startOffset + 1, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToDate(int i, int i2, int i3, boolean z) {
        this.sharedMediaData[i].messages.clear();
        this.sharedMediaData[i].messagesDict[0].clear();
        this.sharedMediaData[i].messagesDict[1].clear();
        this.sharedMediaData[i].setMaxId(0, i2);
        this.sharedMediaData[i].setEndReached(0, false);
        SharedMediaData sharedMediaData = this.sharedMediaData[i];
        sharedMediaData.startReached = false;
        sharedMediaData.startOffset = i3;
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
        sharedMediaData2.endLoadingStubs = (sharedMediaData2.getTotalCount() - i3) - 1;
        if (this.sharedMediaData[i].endLoadingStubs < 0) {
            this.sharedMediaData[i].endLoadingStubs = 0;
        }
        SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
        sharedMediaData3.min_id = i2;
        sharedMediaData3.loadingAfterFastScroll = true;
        sharedMediaData3.loading = false;
        sharedMediaData3.requestIndex++;
        MediaPage mediaPage = getMediaPage(i);
        if (mediaPage != null && mediaPage.listView.getAdapter() != null) {
            mediaPage.listView.getAdapter().notifyDataSetChanged();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i4 >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr[i4];
            if (mediaPage2.selectedType == i) {
                mediaPage2.layoutManager.scrollToPositionWithOffset(Math.min(this.sharedMediaData[i].getTotalCount() - 1, this.sharedMediaData[i].startOffset), 0);
            }
            i4++;
        }
    }

    public class PollAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        public RecyclerListView listView;
        private final Context mContext;
        private final ChatMessageCell.ChatMessageCellDelegate messageDelegate;
        private final Theme.ResourcesProvider resourcesProvider;
        private final ArrayList pollsToCheck = new ArrayList(10);
        private final ArrayList groupedByDay = new ArrayList();

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public PollAdapter(Context context, final int i, final Theme.ResourcesProvider resourcesProvider) {
            this.mContext = context;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            this.messageDelegate = new ChatMessageCell.ChatMessageCellDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1
                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$allowAddPollOptions(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$canDrawOutboundsContent(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public boolean canPerformActions() {
                    return true;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean canPerformReply() {
                    boolean canPerformActions;
                    canPerformActions = canPerformActions();
                    return canPerformActions;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPress(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressBotButton(this, chatMessageCell, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressChannelAvatar(this, chatMessageCell, chat, i2, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressCustomBotButton(this, chatMessageCell, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressPollOption(this, chatMessageCell, pollAnswer);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressToDoButton(this, chatMessageCell, todoItem);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didLongPressUserAvatar(this, chatMessageCell, user, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAddPollOptionButton(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressAdmin(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAdmin(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBoostCounter(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressBotButton(this, chatMessageCell, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCancelSendButton(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelAvatar(this, chatMessageCell, chat, i2, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLObject, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCodeCopy(this, chatMessageCell, textLayoutBlock);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCommentButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCommentButton(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressCustomBotButton(this, chatMessageCell, buttonCustom);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressEffect(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressEffect(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, keyboardButton);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheck(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheck(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressFactCheckWhat(this, chatMessageCell, i2, i3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGiveawayChatButton(this, chatMessageCell, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHiddenForward(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressHint(ChatMessageCell chatMessageCell, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressHint(this, chatMessageCell, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressImage(this, chatMessageCell, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressOther(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReaction(this, chatMessageCell, reactionCount, z, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressReplyMessage(ChatMessageCell chatMessageCell, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressReplyMessage(this, chatMessageCell, i2, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSideButton(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSideButton(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredClose(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSponsoredInfo(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressSummarize(this, chatMessageCell, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressTime(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressTime(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressToDoButton(this, chatMessageCell, todoItem, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserAvatar(this, chatMessageCell, user, f, f2, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressUserStatus(this, chatMessageCell, user, document, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBot(this, chatMessageCell, str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didPressViaBotNotInline(this, chatMessageCell, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell.getContext(), str);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareEnd(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareMove(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didQuickShareStart(this, chatMessageCell, f, f2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didStartVideoStream(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didStartVideoStream(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$didTogglePollPreview(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$doNotShowLoadingReply(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$drawPollMode(this, canvas, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdate(this, chatMessageCell, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$forceUpdateNoAnimation(this, chatMessageCell, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getAdminRank(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getDraftMessageMeasureController(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getPinchToZoomHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getProgressLoadingLink(this, chatMessageCell);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$getTextSelectionHelper(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$hasSelectedMessages(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$invalidateBlur(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isAdmin(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isLandscape(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isOwner(this, j);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isProgressLoading(ChatMessageCell chatMessageCell, int i2) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isProgressLoading(this, chatMessageCell, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$isReplyOrSelf(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$keyboardIsOpened(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i2, i3);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needPlayMessage(this, chatMessageCell, messageObject, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needReloadPolls(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void needShowPremiumBulletin(int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$needShowPremiumBulletin(this, i2);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean onAccessibilityAction(int i2, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onAccessibilityAction(this, i2, bundle);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$onDiceFinished(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void setShouldNotRepeatSticker(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$setShouldNotRepeatSticker(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldDrawThreadProgress(this, chatMessageCell, z);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ boolean shouldRepeatSticker(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.-CC.$default$shouldRepeatSticker(this, messageObject);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public /* synthetic */ void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.-CC.$default$videoTimerReached(this);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i2, int i3, int i4) {
                    SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public void didPressPollMedia(final ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, final TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                    int i3;
                    TLRPC.Document document;
                    TLRPC.PollResults pollResults;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Document document2;
                    TLRPC.Document document3;
                    TLRPC.TL_textWithEntities tL_textWithEntities;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                    if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
                        return;
                    }
                    final TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                    if (messageMedia.geo != null) {
                        if (AndroidUtilities.isMapsInstalled(SharedMediaLayout.this.profileActivity)) {
                            LocationActivity locationActivity = new LocationActivity(3) { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.1
                                @Override // org.telegram.ui.LocationActivity
                                protected boolean disablePermissionCheck() {
                                    return true;
                                }
                            };
                            locationActivity.setResourceProvider(resourcesProvider);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.local_id = -1;
                            tL_message.peer_id = MessagesController.getInstance(i).getPeer(SharedMediaLayout.this.dialog_id);
                            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                            tL_messageMediaGeo.geo = messageMedia.geo;
                            String str = messageMedia.address;
                            if (str == null) {
                                str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                            }
                            tL_messageMediaGeo.address = str;
                            tL_message.media = tL_messageMediaGeo;
                            locationActivity.setSharingAllowed(false);
                            locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                            SharedMediaLayout.this.profileActivity.presentFragment(locationActivity);
                            return;
                        }
                        return;
                    }
                    if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                        ContentPreviewViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity.getParentActivity());
                        ContentPreviewViewer.getInstance().setDelegate(new ContentPreviewViewer.ContentPreviewViewerDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.2
                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void addCaptionToGif(Object obj, Object obj2, boolean z, int i4, int i5) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$addCaptionToGif(this, obj, obj2, z, i4, i5);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void addToFavoriteSelected(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$addToFavoriteSelected(this, str2);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean can() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$can(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean canAddCaption(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$canAddCaption(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean canDeleteSticker(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$canDeleteSticker(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean canEditSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$canEditSticker(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public boolean canSchedule() {
                                return false;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean canSendSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$canSendSticker(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ Boolean canSetAsStatus(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$canSetAsStatus(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void copyEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$copyEmoji(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void deleteSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$deleteSticker(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void editSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$editSticker(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$getCustomItemOptions(this, viewGroup, view);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ String getQuery(boolean z) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$getQuery(this, z);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void gifAddedOrDeleted() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$gifAddedOrDeleted(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public boolean isInScheduleMode() {
                                return false;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean isPhotoEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$isPhotoEditor(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean isReplacedSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$isReplacedSticker(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean isSettingIntroSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$isSettingIntroSticker(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean isStickerEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$isStickerEditor(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean needCopy(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$needCopy(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean needMenu() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$needMenu(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean needOpen() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$needOpen(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean needRemove() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$needRemove(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ boolean needRemoveFromRecent(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$needRemoveFromRecent(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public boolean needSend(int i4) {
                                return false;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void newStickerPackSelected(CharSequence charSequence, String str2, Utilities.Callback callback) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$newStickerPackSelected(this, charSequence, str2, callback);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$remove(this, importingSticker);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void removeFromRecent(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$removeFromRecent(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void resetTouch() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$resetTouch(this);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void sendEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$sendEmoji(this, document4);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void sendGif(Object obj, Object obj2, boolean z, int i4, int i5) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$sendGif(this, obj, obj2, z, i4, i5);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void sendSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$sendSticker(this, str2);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public void sendSticker(TLRPC.Document document4, String str2, Object obj, boolean z, int i4, int i5) {
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void setAsEmojiStatus(TLRPC.Document document4, Integer num) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$setAsEmojiStatus(this, document4, num);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void setIntroSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$setIntroSticker(this, str2);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public /* synthetic */ void stickerSetSelected(TLRPC.StickerSet stickerSet, String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.-CC.$default$stickerSetSelected(this, stickerSet, str2);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
                                if (inputStickerSet == null || SharedMediaLayout.this.getContext() == null) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                                tL_inputStickerSetID.id = inputStickerSet.id;
                                StickersAlert stickersAlert = new StickersAlert(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, tL_inputStickerSetID, null, null, resourcesProvider, false);
                                stickersAlert.setCalcMandatoryInsets(true);
                                stickersAlert.setClearsInputField(z);
                                stickersAlert.show();
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public long getDialogId() {
                                return SharedMediaLayout.this.dialog_id;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public TLRPC.TL_messageMediaPoll getPoll() {
                                return tL_messageMediaPoll;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public TLRPC.PollAnswer getPollAnswer() {
                                return pollAnswer;
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public MessageObject getPollMessageObject() {
                                return chatMessageCell.getMessageObject();
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public void retractVote() {
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), null, null);
                            }

                            @Override // org.telegram.ui.ContentPreviewViewer.ContentPreviewViewerDelegate
                            public void sendVote() {
                                ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
                                arrayList.add(pollAnswer);
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                            }
                        });
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        TLRPC.Document document4 = messageMedia.document;
                        contentPreviewViewer.open(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, chatMessageCell.getMessageObject(), resourcesProvider, NotificationCenter.dialogPhotosUpdate);
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                    if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                        i3 = messageMedia3 == messageMedia ? arrayList2.size() : -1;
                        TLRPC.TL_message copy = copy(message);
                        copy.media = messageMedia3;
                        arrayList2.add(new MessageObject(i, copy, false, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.3
                            @Override // org.telegram.messenger.MessageObject
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-2);
                    } else {
                        i3 = -1;
                    }
                    if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                        if (messageMedia2 == messageMedia) {
                            i3 = arrayList2.size();
                        }
                        TLRPC.TL_message copy2 = copy(message);
                        copy2.media = messageMedia2;
                        TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                        copy2.message = pollResults2.solution;
                        copy2.entities = pollResults2.solution_entities;
                        arrayList2.add(new MessageObject(i, copy2, false, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.4
                            @Override // org.telegram.messenger.MessageObject
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-3);
                    }
                    TlUtils.calculateAnswerShuffleHash(tL_messageMediaPoll.poll, UserConfig.getInstance(i).getClientUserId());
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                    if (arrayList3 == null) {
                        arrayList3 = poll.answers;
                    }
                    int i4 = i3;
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i5);
                        TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                        if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                            if (pollAnswer2.unshuffled_index == i2) {
                                i4 = arrayList2.size();
                            }
                            TLRPC.TL_message copy3 = copy(message);
                            copy3.media = messageMedia4;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                            copy3.message = tL_textWithEntities2.text;
                            copy3.entities = tL_textWithEntities2.entities;
                            arrayList2.add(new MessageObject(i, copy3, false, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.5
                                @Override // org.telegram.messenger.MessageObject
                                public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                    return false;
                                }
                            });
                            arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                        }
                    }
                    if (i4 <= -1 || arrayList2.isEmpty()) {
                        return;
                    }
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity, resourcesProvider);
                    PhotoViewer.getInstance().openPhoto(arrayList2, i4, SharedMediaLayout.this.dialog_id, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.1.6
                        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
                        public boolean forceAllInGroup() {
                            return true;
                        }

                        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
                        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC.FileLocation fileLocation, int i6, boolean z, boolean z2) {
                            ImageReceiver imageReceiver2;
                            ChatMessageCell chatMessageCell2;
                            MessageObject messageObject3;
                            RecyclerListView recyclerListView = PollAdapter.this.listView;
                            if (recyclerListView == null) {
                                return null;
                            }
                            int childCount = recyclerListView.getChildCount();
                            for (int i7 = 0; i7 < childCount; i7++) {
                                View childAt = PollAdapter.this.listView.getChildAt(i7);
                                if (!(childAt instanceof ChatMessageCell) || messageObject2 == null || (messageObject3 = (chatMessageCell2 = (ChatMessageCell) childAt).getMessageObject()) == null || messageObject3.getId() != messageObject2.getId()) {
                                    imageReceiver2 = null;
                                } else {
                                    ArrayList<Integer> arrayList4 = messageObject3.pollMediaMapping;
                                    if (arrayList4 != null && i6 >= 0 && i6 < arrayList4.size()) {
                                        imageReceiver2 = chatMessageCell2.getPhotoImage(messageObject3.pollMediaMapping.get(i6).intValue());
                                    } else {
                                        imageReceiver2 = chatMessageCell2.getPhotoImage(i6);
                                    }
                                }
                                if (imageReceiver2 != null) {
                                    int[] iArr = new int[2];
                                    childAt.getLocationInWindow(iArr);
                                    PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                    placeProviderObject.viewX = iArr[0];
                                    placeProviderObject.viewY = iArr[1] + childAt.getPaddingTop();
                                    placeProviderObject.parentView = PollAdapter.this.listView;
                                    placeProviderObject.animatingImageView = null;
                                    placeProviderObject.imageReceiver = imageReceiver2;
                                    if (z) {
                                        placeProviderObject.thumb = imageReceiver2.getBitmapSafe();
                                    }
                                    placeProviderObject.radius = imageReceiver2.getRoundRadius(true);
                                    placeProviderObject.clipTopAddition = 0;
                                    placeProviderObject.clipBottomAddition = 0;
                                    return placeProviderObject;
                                }
                            }
                            return null;
                        }
                    });
                }

                private TLRPC.TL_message copy(TLRPC.Message message) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = message.id;
                    tL_message.from_id = message.from_id;
                    tL_message.from_boosts_applied = message.from_boosts_applied;
                    tL_message.peer_id = message.peer_id;
                    tL_message.saved_peer_id = message.saved_peer_id;
                    tL_message.date = message.date;
                    tL_message.expire_date = message.expire_date;
                    tL_message.action = message.action;
                    tL_message.message = message.message;
                    tL_message.flags = message.flags;
                    tL_message.flags2 = message.flags2;
                    tL_message.mentioned = message.mentioned;
                    tL_message.media_unread = message.media_unread;
                    tL_message.out = message.out;
                    tL_message.unread = message.unread;
                    tL_message.entities = message.entities;
                    tL_message.via_bot_name = message.via_bot_name;
                    tL_message.reply_markup = message.reply_markup;
                    tL_message.views = message.views;
                    tL_message.forwards = message.forwards;
                    tL_message.replies = message.replies;
                    tL_message.edit_date = message.edit_date;
                    tL_message.silent = message.silent;
                    tL_message.post = message.post;
                    tL_message.from_scheduled = message.from_scheduled;
                    tL_message.legacy = message.legacy;
                    tL_message.edit_hide = message.edit_hide;
                    tL_message.pinned = message.pinned;
                    tL_message.fwd_from = message.fwd_from;
                    tL_message.via_bot_id = message.via_bot_id;
                    tL_message.via_business_bot_id = message.via_business_bot_id;
                    tL_message.reply_to = message.reply_to;
                    tL_message.post_author = message.post_author;
                    tL_message.grouped_id = message.grouped_id;
                    tL_message.reactions = message.reactions;
                    tL_message.restriction_reason = message.restriction_reason;
                    tL_message.ttl_period = message.ttl_period;
                    tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                    tL_message.effect = message.effect;
                    tL_message.noforwards = message.noforwards;
                    tL_message.invert_media = message.invert_media;
                    tL_message.offline = message.offline;
                    tL_message.factcheck = message.factcheck;
                    tL_message.send_state = message.send_state;
                    tL_message.fwd_msg_id = message.fwd_msg_id;
                    tL_message.params = message.params;
                    tL_message.random_id = message.random_id;
                    tL_message.local_id = message.local_id;
                    tL_message.dialog_id = message.dialog_id;
                    tL_message.ttl = message.ttl;
                    tL_message.destroyTime = message.destroyTime;
                    tL_message.destroyTimeMillis = message.destroyTimeMillis;
                    tL_message.layer = message.layer;
                    tL_message.seq_in = message.seq_in;
                    tL_message.seq_out = message.seq_out;
                    tL_message.with_my_score = message.with_my_score;
                    tL_message.replyMessage = message.replyMessage;
                    tL_message.reqId = message.reqId;
                    tL_message.realId = message.realId;
                    tL_message.stickerVerified = message.stickerVerified;
                    tL_message.isThreadMessage = message.isThreadMessage;
                    tL_message.voiceTranscription = message.voiceTranscription;
                    tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                    tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
                    tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                    tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
                    tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
                    tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
                    tL_message.originalLanguage = message.originalLanguage;
                    tL_message.translatedToLanguage = message.translatedToLanguage;
                    tL_message.translatedText = message.translatedText;
                    tL_message.replyStory = message.replyStory;
                    tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
                    return tL_message;
                }

                @Override // org.telegram.ui.Cells.ChatMessageCell.ChatMessageCellDelegate
                public void didPressInstantButton(ChatMessageCell chatMessageCell, int i2) {
                    if (i2 == 80) {
                        PollVotesAlert.showForPoll(SharedMediaLayout.this.profileActivity, chatMessageCell.getMessageObject());
                    }
                }
            };
            regroup();
        }

        private void regroup() {
            this.groupedByDay.clear();
            ArrayList messages = SharedMediaLayout.this.sharedMediaData[8].getMessages();
            int i = 0;
            for (int i2 = 0; i2 < messages.size(); i2++) {
                MessageObject messageObject = (MessageObject) messages.get(i2);
                if (messageObject.dateKeyInt != i) {
                    this.groupedByDay.add(action(messageObject.messageOwner.date));
                    i = messageObject.dateKeyInt;
                }
                this.groupedByDay.add(messageObject);
            }
        }

        public void onScrolled(RecyclerListView recyclerListView) {
            this.pollsToCheck.clear();
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    this.pollsToCheck.add(((ChatMessageCell) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(this.currentAccount).addToPollsQueue(SharedMediaLayout.this.dialog_id, this.pollsToCheck);
        }

        public void update(RecyclerListView recyclerListView, long j, TLRPC.TL_poll tL_poll, TLRPC.PollResults pollResults) {
            for (int i = 0; i < this.groupedByDay.size(); i++) {
                MessageObject messageObject = (MessageObject) this.groupedByDay.get(i);
                if (messageObject != null && messageObject.getPollId() == j) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                        if (tL_poll != null) {
                            tL_messageMediaPoll.poll = tL_poll;
                        }
                        MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                        notifyItemChanged(i);
                    }
                }
            }
        }

        private MessageObject action(int i) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            long j = i;
            tL_message.message = LocaleController.formatDateChat(j);
            tL_message.id = 0;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            return messageObject;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            regroup();
            super.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                ChatMessageCell chatMessageCell = new ChatMessageCell(this.mContext, this.currentAccount, false, null, this.resourcesProvider) { // from class: org.telegram.ui.Components.SharedMediaLayout.PollAdapter.2
                    @Override // android.view.View
                    public boolean isPressed() {
                        return false;
                    }
                };
                chatMessageCell.setDelegate(this.messageDelegate);
                return new RecyclerListView.Holder(chatMessageCell);
            }
            return new RecyclerListView.Holder(new ChatActionCell(this.mContext, false, this.resourcesProvider));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) this.groupedByDay.get(i);
            if (viewHolder.getItemViewType() == 0) {
                ((ChatMessageCell) viewHolder.itemView).setMessageObject(messageObject, null, false, false, false);
            } else {
                ((ChatActionCell) viewHolder.itemView).setMessageObject(messageObject);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return 0;
            }
            return ((MessageObject) this.groupedByDay.get(i)).contentType;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.groupedByDay.size();
        }
    }

    public class MediaSearchAdapter extends RecyclerListView.SelectionAdapter {
        private int currentType;
        private int lastReqId;
        private Context mContext;
        private Runnable searchRunnable;
        private int searchesInProgress;
        private ArrayList searchResult = new ArrayList();
        protected ArrayList globalSearch = new ArrayList();
        private int reqId = 0;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 24;
        }

        public MediaSearchAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        public void queryServerSearch(final String str, final int i, long j, long j2) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            if (this.reqId != 0) {
                SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
            if (str == null || str.length() == 0) {
                this.globalSearch.clear();
                this.lastReqId = 0;
                notifyDataSetChanged();
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 50;
            tL_messages_search.offset_id = i;
            int i2 = this.currentType;
            if (i2 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i2 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_search.q = str;
            tL_messages_search.peer = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                    tL_messages_search.flags |= 4;
                    tL_messages_search.saved_peer_id = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j2);
                } else {
                    tL_messages_search.flags |= 2;
                    tL_messages_search.top_msg_id = (int) j2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            final int i3 = this.lastReqId + 1;
            this.lastReqId = i3;
            this.searchesInProgress++;
            this.reqId = SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda3
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout.MediaSearchAdapter.this.lambda$queryServerSearch$1(i, i3, str, tLObject, tL_error);
                }
            }, 2);
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(this.reqId, SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$queryServerSearch$1(int i, final int i2, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            final ArrayList arrayList = new ArrayList();
            if (tL_error == null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    if (i == 0 || message.id <= i) {
                        arrayList.add(new MessageObject(SharedMediaLayout.this.profileActivity.getCurrentAccount(), message, false, true));
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.MediaSearchAdapter.this.lambda$queryServerSearch$0(i2, arrayList, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$queryServerSearch$0(int i, ArrayList arrayList, String str) {
            if (this.reqId != 0) {
                if (i == this.lastReqId) {
                    int itemCount = getItemCount();
                    this.globalSearch = arrayList;
                    this.searchesInProgress--;
                    int itemCount2 = getItemCount();
                    if (this.searchesInProgress == 0 || itemCount2 != 0) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                        if (SharedMediaLayout.this.mediaPages[i2].selectedType == this.currentType) {
                            if (this.searchesInProgress == 0 && itemCount2 == 0) {
                                SharedMediaLayout.this.mediaPages[i2].emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str));
                                SharedMediaLayout.this.mediaPages[i2].emptyView.button.setVisibility(8);
                                SharedMediaLayout.this.mediaPages[i2].emptyView.showProgress(false, true);
                            } else if (itemCount == 0) {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i2].listView, 0, null);
                            }
                        }
                    }
                    notifyDataSetChanged();
                }
                this.reqId = 0;
            }
        }

        public void search(final String str, boolean z) {
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (!this.searchResult.isEmpty() || !this.globalSearch.isEmpty()) {
                this.searchResult.clear();
                this.globalSearch.clear();
                notifyDataSetChanged();
            }
            if (!TextUtils.isEmpty(str)) {
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                    }
                }
                Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.MediaSearchAdapter.this.lambda$search$3(str);
                    }
                };
                this.searchRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 300L);
                return;
            }
            if (this.searchResult.isEmpty() && this.globalSearch.isEmpty() && this.searchesInProgress == 0) {
                return;
            }
            this.searchResult.clear();
            this.globalSearch.clear();
            if (this.reqId != 0) {
                SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$search$3(final String str) {
            int i;
            if (!SharedMediaLayout.this.sharedMediaData[this.currentType].messages.isEmpty() && ((i = this.currentType) == 1 || i == 4)) {
                MessageObject messageObject = (MessageObject) SharedMediaLayout.this.sharedMediaData[this.currentType].messages.get(SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() - 1);
                queryServerSearch(str, messageObject.getId(), messageObject.getDialogId(), SharedMediaLayout.this.dialog_id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
            } else if (this.currentType == 3) {
                queryServerSearch(str, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.topicId);
            }
            int i2 = this.currentType;
            if (i2 == 1 || i2 == 4) {
                final ArrayList arrayList = new ArrayList(SharedMediaLayout.this.sharedMediaData[this.currentType].messages);
                this.searchesInProgress++;
                Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.MediaSearchAdapter.this.lambda$search$2(str, arrayList);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$search$2(String str, ArrayList arrayList) {
            TLRPC.Document document;
            boolean z;
            String str2;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList());
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
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                int i3 = 0;
                while (true) {
                    if (i3 < i) {
                        String str3 = strArr[i3];
                        String documentName = messageObject.getDocumentName();
                        if (documentName != null && documentName.length() != 0) {
                            if (documentName.toLowerCase().contains(str3)) {
                                arrayList2.add(messageObject);
                                break;
                            }
                            if (this.currentType == 4) {
                                if (messageObject.type == 0) {
                                    document = MessageObject.getMedia(messageObject.messageOwner).webpage.document;
                                } else {
                                    document = MessageObject.getMedia(messageObject.messageOwner).document;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= document.attributes.size()) {
                                        z = false;
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        String str4 = documentAttribute.performer;
                                        z = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                        if (!z && (str2 = documentAttribute.title) != null) {
                                            z = str2.toLowerCase().contains(str3);
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                                if (z) {
                                    arrayList2.add(messageObject);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i3++;
                    }
                }
            }
            updateSearchResults(arrayList2);
        }

        private void updateSearchResults(final ArrayList arrayList) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.MediaSearchAdapter.this.lambda$updateSearchResults$4(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateSearchResults$4(ArrayList arrayList) {
            if (SharedMediaLayout.this.searching) {
                this.searchesInProgress--;
                int itemCount = getItemCount();
                this.searchResult = arrayList;
                int itemCount2 = getItemCount();
                if (this.searchesInProgress == 0 || itemCount2 != 0) {
                    SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                }
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        if (this.searchesInProgress == 0 && itemCount2 == 0) {
                            SharedMediaLayout.this.mediaPages[i].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            SharedMediaLayout.this.mediaPages[i].emptyView.button.setVisibility(8);
                            SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                        } else if (itemCount == 0) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return this.searchResult.size() + this.globalSearch.size() != 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.globalSearch.size();
            return size2 != 0 ? size + size2 : size;
        }

        public MessageObject getItem(int i) {
            if (i < this.searchResult.size()) {
                return (MessageObject) this.searchResult.get(i);
            }
            return (MessageObject) this.globalSearch.get(i - this.searchResult.size());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            int i2 = this.currentType;
            int i3 = 0;
            if (i2 == 1) {
                frameLayout = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
            } else if (i2 == 4) {
                frameLayout = new SharedAudioCell(this.mContext, i3, SharedMediaLayout.this.resourcesProvider) { // from class: org.telegram.ui.Components.SharedMediaLayout.MediaSearchAdapter.1
                    @Override // org.telegram.ui.Cells.SharedAudioCell
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? MediaSearchAdapter.this.searchResult : null, false);
                            if (messageObject.isRoundVideo()) {
                                MediaController.getInstance().setCurrentVideoVisible(false);
                            }
                            return playMessage;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(MediaSearchAdapter.this.searchResult, messageObject, SharedMediaLayout.this.mergeDialogId);
                        }
                        return false;
                    }
                };
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                frameLayout = sharedLinkCell;
            }
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = this.currentType;
            if (i2 == 1) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject item = getItem(i);
                    sharedDocumentCell.setDocument(item, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(item.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 == 3) {
                View view2 = viewHolder.itemView;
                if (view2 instanceof SharedLinkCell) {
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) view2;
                    MessageObject item2 = getItem(i);
                    sharedLinkCell.setLink(item2, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    if (sharedMediaLayout2.isActionModeShowed) {
                        sharedLinkCell.setChecked(sharedMediaLayout2.selectedFiles[(item2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedLinkCell.setChecked(false, !sharedMediaLayout2.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 == 4) {
                View view3 = viewHolder.itemView;
                if (view3 instanceof SharedAudioCell) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) view3;
                    MessageObject item3 = getItem(i);
                    sharedAudioCell.setMessageObject(item3, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    if (sharedMediaLayout3.isActionModeShowed) {
                        sharedAudioCell.setChecked(sharedMediaLayout3.selectedFiles[(item3.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item3.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item3.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                    } else {
                        sharedAudioCell.setChecked(false, !sharedMediaLayout3.scrolling);
                    }
                }
            }
        }
    }

    private class GifAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public GifAdapter(Context context) {
            this.mContext = context;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) {
                return SharedMediaLayout.this.sharedMediaData[5].messages.size();
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) ? 12 : 11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 11) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 5, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext, true, SharedMediaLayout.this.resourcesProvider);
            contextLinkCell.setCanPreviewGif(true);
            return new RecyclerListView.Holder(contextLinkCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            TLRPC.Document document;
            if (viewHolder.getItemViewType() != 12 || (document = (messageObject = (MessageObject) SharedMediaLayout.this.sharedMediaData[5].messages.get(i)).getDocument()) == null) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                contextLinkCell.setGif(document, messageObject, messageObject.messageOwner.date, false);
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.isActionModeShowed) {
                    contextLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    contextLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) view).getPhotoImage();
                if (SharedMediaLayout.this.mediaPages[0].selectedType == 5) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SavedDialogsAdapter extends RecyclerListView.SelectionAdapter {
        public RecyclerListView attachedToRecyclerView;
        private final SavedMessagesController controller;
        private final Context mContext;
        private boolean orderChanged;
        private final ArrayList oldDialogs = new ArrayList();
        private final ArrayList dialogs = new ArrayList();
        private Runnable notifyOrderUpdate = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedDialogsAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.SavedDialogsAdapter.this.lambda$new$0();
            }
        };
        public final RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        public final ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout.SavedDialogsAdapter.1
            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (!SharedMediaLayout.this.isActionModeShowed || recyclerView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                if (dialog != null && dialog.pinned) {
                    return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }

            private SavedMessagesController.SavedDialog getDialog(RecyclerView.ViewHolder viewHolder) {
                int adapterPosition;
                if (viewHolder != null && (adapterPosition = viewHolder.getAdapterPosition()) >= 0 && adapterPosition < SavedDialogsAdapter.this.dialogs.size()) {
                    return (SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(adapterPosition);
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                RecyclerListView recyclerListView;
                if (viewHolder != null && (recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView) != null) {
                    recyclerListView.hideSelector(false);
                }
                if (i == 0) {
                    AndroidUtilities.cancelRunOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate);
                    AndroidUtilities.runOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate, 300L);
                }
                super.onSelectedChanged(viewHolder, i);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (SharedMediaLayout.this.isActionModeShowed && recyclerView.getAdapter() != SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                    SavedMessagesController.SavedDialog dialog2 = getDialog(viewHolder2);
                    if (dialog != null && dialog2 != null && dialog.pinned && dialog2.pinned) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        SavedDialogsAdapter.this.dialogs.remove(adapterPosition);
                        SavedDialogsAdapter.this.dialogs.add(adapterPosition2, dialog);
                        SavedDialogsAdapter.this.notifyItemMoved(adapterPosition, adapterPosition2);
                        SavedDialogsAdapter.this.orderChanged = true;
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }
        });
        public final HashSet selectedDialogs = new HashSet();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 13;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            if (this.orderChanged) {
                this.orderChanged = false;
                ArrayList<Long> arrayList = new ArrayList<>();
                for (int i = 0; i < this.dialogs.size(); i++) {
                    if (((SavedMessagesController.SavedDialog) this.dialogs.get(i)).pinned) {
                        arrayList.add(Long.valueOf(((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId));
                    }
                }
                SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList);
            }
        }

        public SavedDialogsAdapter(Context context) {
            this.mContext = context;
            SavedMessagesController savedMessagesController = SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController();
            this.controller = savedMessagesController;
            if (SharedMediaLayout.this.includeSavedDialogs()) {
                savedMessagesController.loadDialogs(false);
            }
            setHasStableIds(true);
            update(false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return (i < 0 || i >= this.dialogs.size()) ? i : ((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId;
        }

        public void update(boolean z) {
            this.oldDialogs.clear();
            this.oldDialogs.addAll(this.dialogs);
            this.dialogs.clear();
            this.dialogs.addAll(this.controller.allDialogs);
            if (z) {
                notifyDataSetChanged();
            }
        }

        public void select(View view) {
            SavedMessagesController.SavedDialog savedDialog;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                long dialogId = dialogCell.getDialogId();
                int i = 0;
                while (true) {
                    if (i >= this.dialogs.size()) {
                        savedDialog = null;
                        break;
                    } else {
                        if (((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId == dialogId) {
                            savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                            break;
                        }
                        i++;
                    }
                }
                if (savedDialog == null) {
                    return;
                }
                if (this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId))) {
                    this.selectedDialogs.remove(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() <= 0) {
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            sharedMediaLayout.showActionMode(false);
                        }
                    }
                } else {
                    this.selectedDialogs.add(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() > 0) {
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        if (!sharedMediaLayout2.isActionModeShowed) {
                            sharedMediaLayout2.showActionMode(true);
                            if (SharedMediaLayout.this.gotoItem != null) {
                                SharedMediaLayout.this.gotoItem.setVisibility(8);
                            }
                            if (SharedMediaLayout.this.forwardItem != null) {
                                SharedMediaLayout.this.forwardItem.setVisibility(8);
                            }
                        }
                    }
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(this.selectedDialogs.size(), true);
                boolean z = this.selectedDialogs.size() > 0;
                Iterator it = this.selectedDialogs.iterator();
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.dialogs.size()) {
                            break;
                        }
                        SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) this.dialogs.get(i2);
                        if (savedDialog2.dialogId != longValue) {
                            i2++;
                        } else if (!savedDialog2.pinned) {
                            z = false;
                        }
                    }
                    if (!z) {
                        break;
                    }
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(z ? 8 : 0);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(z ? 0 : 8);
                }
                if (view instanceof DialogCell) {
                    dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), true);
                }
            }
        }

        public void unselectAll() {
            this.selectedDialogs.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.SavedDialogsAdapter.2
                @Override // org.telegram.ui.Cells.DialogCell
                public boolean isForumCell() {
                    return false;
                }

                @Override // org.telegram.ui.Cells.DialogCell
                public boolean getIsPinned() {
                    int childAdapterPosition;
                    RecyclerListView recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView;
                    if (recyclerListView == null) {
                        return false;
                    }
                    RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    if (adapter != savedDialogsAdapter || (childAdapterPosition = savedDialogsAdapter.attachedToRecyclerView.getChildAdapterPosition(this)) < 0 || childAdapterPosition >= SavedDialogsAdapter.this.dialogs.size()) {
                        return false;
                    }
                    return ((SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(childAdapterPosition)).pinned;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                dialogCell.isSavedDialogCell = true;
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), false);
                dialogCell.useSeparator = i + 1 < getItemCount();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.dialogs.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SavedMessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private String lastQuery;
        private ReactionsLayoutInBubble.VisibleReaction lastReaction;
        int lastSearchId;
        private boolean loading;
        private final Context mContext;
        public final ArrayList dialogs = new ArrayList();
        public final ArrayList messages = new ArrayList();
        public final ArrayList loadedMessages = new ArrayList();
        public final ArrayList cachedMessages = new ArrayList();
        private boolean endReached = false;
        private int oldItemCounts = 0;
        private int count = 0;
        private int reqId = -1;
        private Runnable searchRunnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.SavedMessagesSearchAdapter.this.sendRequest();
            }
        };

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 23;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SavedMessagesSearchAdapter(Context context) {
            this.mContext = context;
            this.currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            setHasStableIds(true);
        }

        public void search(String str, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            if (TextUtils.equals(str, this.lastQuery)) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.lastReaction;
                if (visibleReaction2 == null && visibleReaction == null) {
                    return;
                }
                if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                    return;
                }
            }
            this.lastQuery = str;
            this.lastReaction = visibleReaction;
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.cachedMessages.clear();
            this.loadedMessages.clear();
            this.messages.clear();
            this.count = 0;
            this.endReached = false;
            this.loading = true;
            this.dialogs.clear();
            if (this.lastReaction == null) {
                this.dialogs.addAll(MessagesController.getInstance(this.currentAccount).getSavedMessagesController().searchDialogs(str));
            }
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 11) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, true);
                }
            }
            if (this.lastReaction == null) {
                notifyDataSetChanged();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, this.lastReaction != null ? 60L : 600L);
        }

        public void loadMore() {
            if (this.endReached || this.loading) {
                return;
            }
            this.loading = true;
            sendRequest();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendRequest() {
            if (TextUtils.isEmpty(this.lastQuery) && this.lastReaction == null) {
                this.loading = false;
                return;
            }
            final TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.q = this.lastQuery;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            if (this.loadedMessages.size() > 0) {
                tL_messages_search.offset_id = ((MessageObject) this.loadedMessages.get(r2.size() - 1)).getId();
            }
            tL_messages_search.limit = 10;
            this.endReached = false;
            final int i = this.lastSearchId + 1;
            this.lastSearchId = i;
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.SavedMessagesSearchAdapter.this.lambda$sendRequest$2(i, tL_messages_search);
                }
            };
            if (this.lastReaction != null) {
                MessagesStorage.getInstance(this.currentAccount).searchSavedByTag(this.lastReaction.toTLReaction(), 0L, this.lastQuery, 100, this.cachedMessages.size(), new Utilities.Callback4() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter$$ExternalSyntheticLambda2
                    @Override // org.telegram.messenger.Utilities.Callback4
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                        SharedMediaLayout.SavedMessagesSearchAdapter.this.lambda$sendRequest$3(runnable, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                    }
                }, false);
            } else {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendRequest$2(final int i, TLRPC.TL_messages_search tL_messages_search) {
            if (i != this.lastSearchId) {
                return;
            }
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter$$ExternalSyntheticLambda3
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout.SavedMessagesSearchAdapter.this.lambda$sendRequest$1(i, tLObject, tL_error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendRequest$1(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$SavedMessagesSearchAdapter$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.SavedMessagesSearchAdapter.this.lambda$sendRequest$0(tLObject, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendRequest$0(TLObject tLObject, int i) {
            if ((tLObject instanceof TLRPC.messages_Messages) && i == this.lastSearchId) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true);
                    if (messageObject.hasValidGroupId()) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(this.lastQuery);
                    this.loadedMessages.add(messageObject);
                }
                this.count = messages_messages.count;
                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    this.endReached = this.loadedMessages.size() >= messages_messages.count;
                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    this.endReached = true;
                }
                updateMessages(false);
                this.loading = false;
                this.reqId = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$sendRequest$3(Runnable runnable, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
            MessagesController.getInstance(this.currentAccount).putChats(arrayList3, true);
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList4);
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(this.lastQuery);
                this.cachedMessages.add(messageObject);
            }
            updateMessages(true);
            AndroidUtilities.runOnUIThread(runnable, 540L);
        }

        private void updateMessages(boolean z) {
            this.messages.clear();
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.loadedMessages.size(); i++) {
                MessageObject messageObject = (MessageObject) this.loadedMessages.get(i);
                if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject.getId()));
                    this.messages.add(messageObject);
                }
            }
            for (int i2 = 0; i2 < this.cachedMessages.size(); i2++) {
                MessageObject messageObject2 = (MessageObject) this.cachedMessages.get(i2);
                if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject2.getId()));
                    this.messages.add(messageObject2);
                }
            }
            if (!z || !this.cachedMessages.isEmpty()) {
                for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                    if (SharedMediaLayout.this.mediaPages[i3].selectedType == 11 && this.messages.isEmpty() && this.dialogs.isEmpty()) {
                        SharedMediaLayout.this.mediaPages[i3].emptyView.title.setText((this.lastReaction == null || !TextUtils.isEmpty(this.lastQuery)) ? LocaleController.formatString(R.string.NoResultFoundFor, this.lastQuery) : AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.NoResultFoundForTag), this.lastReaction.toCharSequence(SharedMediaLayout.this.mediaPages[i3].emptyView.title.getPaint().getFontMetricsInt())));
                        SharedMediaLayout.this.mediaPages[i3].emptyView.button.setVisibility(8);
                        SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                    }
                }
            }
            this.oldItemCounts = this.count;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            int hash;
            if (i < 0) {
                return i;
            }
            if (i < this.dialogs.size()) {
                hash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) this.dialogs.get(i)).dialogId));
            } else {
                int size = i - this.dialogs.size();
                if (size >= this.messages.size()) {
                    return size;
                }
                hash = Objects.hash(2, Long.valueOf(((MessageObject) this.messages.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) this.messages.get(size)).getId()));
            }
            return hash;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) { // from class: org.telegram.ui.Components.SharedMediaLayout.SavedMessagesSearchAdapter.1
                @Override // org.telegram.ui.Cells.DialogCell
                public boolean isForumCell() {
                    return false;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.useSeparator = i + 1 < getItemCount();
                if (i < this.dialogs.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.dialogs.get(i);
                    dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i - this.dialogs.size();
                if (size < this.messages.size()) {
                    MessageObject messageObject = (MessageObject) this.messages.get(size);
                    dialogCell.setDialog(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.dialogs.size() + this.messages.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ChannelRecommendationsAdapter extends RecyclerListView.SelectionAdapter {
        private final ArrayList chats = new ArrayList();
        private final Context mContext;
        private int more;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ChannelRecommendationsAdapter(Context context) {
            this.mContext = context;
            update(false);
        }

        public void update(boolean z) {
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (DialogObject.isChatDialog(SharedMediaLayout.this.dialog_id)) {
                TLRPC.Chat chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChannelRecommendations(SharedMediaLayout.this.dialog_id);
            this.chats.clear();
            int i = 0;
            if (channelRecommendations != null) {
                for (int i2 = 0; i2 < channelRecommendations.chats.size(); i2++) {
                    TLObject tLObject = channelRecommendations.chats.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        this.chats.add(tLObject);
                    } else {
                        this.chats.add(tLObject);
                    }
                }
            }
            if (!this.chats.isEmpty() && !UserConfig.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).isPremium()) {
                i = channelRecommendations.more;
            }
            this.more = i;
            if (z) {
                notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.chats.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            if (i == 18) {
                profileSearchCell = new MoreRecommendationsCell(SharedMediaLayout.this.profileActivity == null ? UserConfig.selectedAccount : SharedMediaLayout.this.profileActivity.getCurrentAccount(), this.mContext, SharedMediaLayout.this.dialog_id > 0, SharedMediaLayout.this.resourcesProvider, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$ChannelRecommendationsAdapter$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.ChannelRecommendationsAdapter.this.lambda$onCreateViewHolder$0();
                    }
                });
            } else {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCreateViewHolder$0() {
            if (SharedMediaLayout.this.profileActivity != null) {
                SharedMediaLayout.this.profileActivity.presentFragment(new PremiumPreviewFragment("similar_channels"));
            }
        }

        public void openPreview(final int i) {
            if (i < 0 || i >= this.chats.size()) {
                return;
            }
            TLObject tLObject = (TLObject) this.chats.get(i);
            Bundle bundle = new Bundle();
            boolean z = tLObject instanceof TLRPC.Chat;
            if (z) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            } else if (!(tLObject instanceof TLRPC.User)) {
                return;
            } else {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            if (SharedMediaLayout.this.profileActivity instanceof ProfileActivity) {
                ((ProfileActivity) SharedMediaLayout.this.profileActivity).prepareBlurBitmap();
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(SharedMediaLayout.this.getContext(), R.drawable.popup_fixed_alert, SharedMediaLayout.this.resourcesProvider, 2);
            actionBarPopupWindowLayout.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            if (z) {
                final TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(SharedMediaLayout.this.getContext(), false, false);
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel);
                actionBarMenuSubItem.setMinimumWidth(NotificationCenter.screenshotTook);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$ChannelRecommendationsAdapter$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedMediaLayout.ChannelRecommendationsAdapter.this.lambda$openPreview$1(view);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(SharedMediaLayout.this.getContext(), false, false);
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot);
                actionBarMenuSubItem2.setMinimumWidth(NotificationCenter.screenshotTook);
                actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$ChannelRecommendationsAdapter$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SharedMediaLayout.ChannelRecommendationsAdapter.this.lambda$openPreview$3(chat, i, view);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
                SharedMediaLayout.this.profileActivity.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
                return;
            }
            if (tLObject instanceof TLRPC.User) {
                SharedMediaLayout.this.profileActivity.presentFragmentAsPreview(chatActivity);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openPreview$1(View view) {
            if (SharedMediaLayout.this.profileActivity == null || SharedMediaLayout.this.profileActivity.getParentLayout() == null) {
                return;
            }
            SharedMediaLayout.this.profileActivity.getParentLayout().expandPreviewFragment();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openPreview$3(final TLRPC.Chat chat, int i, View view) {
            SharedMediaLayout.this.profileActivity.finishPreviewFragment();
            chat.left = false;
            update(false);
            notifyItemRemoved(i);
            if (this.chats.isEmpty()) {
                SharedMediaLayout.this.updateTabs(true);
                SharedMediaLayout.this.checkCurrentTabValid();
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-SharedMediaLayout.this.dialog_id));
            SharedMediaLayout.this.profileActivity.getMessagesController().addUserToChat(chat.id, SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser(), 0, null, SharedMediaLayout.this.profileActivity, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$ChannelRecommendationsAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.ChannelRecommendationsAdapter.this.lambda$openPreview$2(chat);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openPreview$2(TLRPC.Chat chat) {
            BulletinFactory.of(SharedMediaLayout.this.profileActivity).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).show(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ProfileSearchCell profileSearchCell;
            if (viewHolder.getItemViewType() == 17) {
                View view = viewHolder.itemView;
                if (!(view instanceof ProfileSearchCell)) {
                    return;
                } else {
                    profileSearchCell = (ProfileSearchCell) view;
                }
            } else if (viewHolder.getItemViewType() == 18) {
                View view2 = viewHolder.itemView;
                if (!(view2 instanceof MoreRecommendationsCell)) {
                    return;
                } else {
                    profileSearchCell = ((MoreRecommendationsCell) view2).channelCell;
                }
            } else {
                profileSearchCell = null;
            }
            if (profileSearchCell != null) {
                profileSearchCell.setData(this.chats.get(i), null, null, null, false, false);
                profileSearchCell.useSeparator = i != this.chats.size() - 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return (this.more <= 0 || i != getItemCount() + (-1)) ? 17 : 18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MoreRecommendationsCell extends FrameLayout {
        private final ButtonWithCounterView button;
        public final ProfileSearchCell channelCell;
        private final int currentAccount;
        private final View gradientView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinkSpanDrawable.LinksTextView textView;

        public MoreRecommendationsCell(int i, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, final Runnable runnable) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, resourcesProvider);
            this.channelCell = profileSearchCell;
            profileSearchCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -2.0f));
            View view = new View(context);
            this.gradientView = view;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i2 = Theme.key_windowBackgroundWhite;
            view.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(Theme.getColor(i2, resourcesProvider), 0.4f), Theme.getColor(i2, resourcesProvider)}));
            addView(view, LayoutHelper.createFrame(-1, 60.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            this.button = buttonWithCounterView;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(z ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            buttonWithCounterView.setText(spannableStringBuilder, false);
            addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$MoreRecommendationsCell$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SharedMediaLayout.MoreRecommendationsCell.lambda$new$0(runnable, view2);
                }
            });
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextAlignment(4);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
            SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$MoreRecommendationsCell$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.MoreRecommendationsCell.lambda$new$1(runnable);
                }
            });
            SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i).recommendedChannelsLimitPremium);
            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
            linksTextView.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(Runnable runnable, View view) {
            if (runnable != null) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$1(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), TLObject.FLAG_30));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class CommonGroupsAdapter extends RecyclerListView.SelectionAdapter {
        private ArrayList chats = new ArrayList();
        private boolean endReached;
        private boolean firstLoaded;
        private boolean loading;
        private Context mContext;

        public CommonGroupsAdapter(Context context) {
            this.mContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getChats(long j, final int i) {
            long j2;
            if (this.loading) {
                return;
            }
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                j2 = SharedMediaLayout.this.dialog_id;
            } else {
                j2 = SharedMediaLayout.this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(SharedMediaLayout.this.dialog_id))).user_id;
            }
            TLRPC.InputUser inputUser = SharedMediaLayout.this.profileActivity.getMessagesController().getInputUser(j2);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = i;
            tL_messages_getCommonChats.max_id = j;
            this.loading = true;
            notifyDataSetChanged();
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new RequestDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda0
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout.CommonGroupsAdapter.this.lambda$getChats$1(i, tLObject, tL_error);
                }
            }), SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getChats$1(final int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.CommonGroupsAdapter.this.lambda$getChats$0(tL_error, tLObject, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getChats$0(TLRPC.TL_error tL_error, TLObject tLObject, int i) {
            int itemCount = getItemCount();
            if (tL_error == null) {
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                SharedMediaLayout.this.profileActivity.getMessagesController().putChats(messages_chats.chats, false);
                this.endReached = messages_chats.chats.isEmpty() || messages_chats.chats.size() != i;
                this.chats.addAll(messages_chats.chats);
            } else {
                this.endReached = true;
            }
            for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                if (SharedMediaLayout.this.mediaPages[i2].selectedType == 6 && SharedMediaLayout.this.mediaPages[i2].listView != null) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[i2].listView;
                    if (this.firstLoaded || itemCount == 0) {
                        SharedMediaLayout.this.animateItemsEnter(internalListView, 0, null);
                    }
                }
            }
            this.loading = false;
            this.firstLoaded = true;
            notifyDataSetChanged();
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() != this.chats.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.chats.isEmpty() && !this.loading) {
                return 1;
            }
            int size = this.chats.size();
            return (this.chats.isEmpty() || this.endReached) ? size : size + 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ProfileSearchCell profileSearchCell;
            if (i == 14) {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            } else {
                if (i == 15) {
                    View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 6, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(createEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(1);
                profileSearchCell = flickerLoadingView;
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 14) {
                View view = viewHolder.itemView;
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    profileSearchCell.setData((TLRPC.Chat) this.chats.get(i), null, null, null, false, false);
                    boolean z = true;
                    if (i == this.chats.size() - 1 && this.endReached) {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (!this.chats.isEmpty() || this.loading) {
                return i < this.chats.size() ? 14 : 16;
            }
            return 15;
        }
    }

    public int getStoriesCount(int i) {
        StoriesAdapter storyAlbums_getStoriesAdapterByTabType;
        StoriesController.StoriesList storiesList;
        if (!isAnyStoryPageType(i) || (storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i)) == null || (storiesList = storyAlbums_getStoriesAdapterByTabType.storiesList) == null) {
            return 0;
        }
        return storiesList.getCount();
    }

    public String getBotPreviewsSubtitle(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        BotPreviewsEditContainer botPreviewsEditContainer;
        if (!isBot()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.getBotPreviewsSubtitle();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < this.storiesAdapter.storiesList.messageObjects.size(); i3++) {
                MessageObject messageObject = (MessageObject) this.storiesAdapter.storiesList.messageObjects.get(i3);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i2++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(LocaleController.formatPluralString("Images", i, new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.formatPluralString("Videos", i2, new Object[0]));
        }
        return sb.toString();
    }

    public void updateStoriesList(StoriesController.StoriesList storiesList) {
        this.searchStoriesList = storiesList;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        storiesAdapter.storiesList = storiesList;
        storiesAdapter.notifyDataSetChanged();
        StoriesAdapter storiesAdapter2 = this.animationSupportingStoriesAdapter;
        storiesAdapter2.storiesList = storiesList;
        storiesAdapter2.notifyDataSetChanged();
    }

    public class StoriesAdapter extends SharedPhotoVideoAdapter {
        private final int albumId;
        public boolean applyingReorder;
        private int id;
        private boolean inAlbumStoriesReorder;
        private final boolean isArchive;
        public ArrayList lastPinnedIds;
        private ViewsForPeerStoriesRequester poller;
        public StoriesController.StoriesList storiesList;
        private StoriesAdapter supportingAdapter;
        private final ArrayList uploadingStories;

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 19;
        }

        public int getTopOffset() {
            return 0;
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public /* bridge */ /* synthetic */ boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return super.fastScrollIsVisible(recyclerListView);
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public /* bridge */ /* synthetic */ void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            super.getPositionForScrollProgress(recyclerListView, f, iArr);
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public /* bridge */ /* synthetic */ float getScrollProgress(RecyclerListView recyclerListView) {
            return super.getScrollProgress(recyclerListView);
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public /* bridge */ /* synthetic */ void onFinishFastScroll(RecyclerListView recyclerListView) {
            super.onFinishFastScroll(recyclerListView);
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public /* bridge */ /* synthetic */ void onStartFastScroll() {
            super.onStartFastScroll();
        }

        public StoriesAdapter(SharedMediaLayout sharedMediaLayout, Context context, boolean z) {
            this(context, 0, z);
        }

        public StoriesAdapter(Context context, int i, boolean z) {
            super(context);
            TLRPC.User user;
            this.uploadingStories = new ArrayList();
            this.lastPinnedIds = new ArrayList();
            this.isArchive = z;
            this.albumId = i;
            int currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            if (!TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtag())) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtagUsername()) ? null : SharedMediaLayout.this.getStoriesHashtagUsername(), SharedMediaLayout.this.getStoriesHashtag());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if (SharedMediaLayout.this.getStoriesArea() != null) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, SharedMediaLayout.this.getStoriesArea());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if ((z && !SharedMediaLayout.this.isStoriesView()) || (!z && SharedMediaLayout.this.isArchivedOnlyStoriesView())) {
                this.storiesList = null;
            } else {
                int i2 = 1;
                boolean z2 = SharedMediaLayout.this.dialog_id > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id))) != null && user.bot;
                if (i > 0) {
                    this.storiesList = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, 0, i);
                } else {
                    StoriesController storiesController = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController();
                    long j = SharedMediaLayout.this.dialog_id;
                    if (z2) {
                        i2 = 4;
                    } else if (!z) {
                        i2 = 0;
                    }
                    this.storiesList = storiesController.getStoriesList(j, i2);
                }
            }
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                this.id = storiesList.link();
                this.poller = new ViewsForPeerStoriesRequester(SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController(), SharedMediaLayout.this.dialog_id, this.storiesList.currentAccount) { // from class: org.telegram.ui.Components.SharedMediaLayout.StoriesAdapter.1
                    @Override // org.telegram.ui.Stories.ViewsForPeerStoriesRequester
                    protected void getStoryIds(ArrayList arrayList) {
                        InternalListView internalListView;
                        MessageObject messageObject;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= SharedMediaLayout.this.mediaPages.length) {
                                internalListView = null;
                                break;
                            }
                            if (SharedMediaLayout.this.mediaPages[i3].listView != null) {
                                RecyclerView.Adapter adapter = SharedMediaLayout.this.mediaPages[i3].listView.getAdapter();
                                StoriesAdapter storiesAdapter = StoriesAdapter.this;
                                if (adapter == storiesAdapter) {
                                    internalListView = SharedMediaLayout.this.mediaPages[i3].listView;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (internalListView != null) {
                            for (int i4 = 0; i4 < internalListView.getChildCount(); i4++) {
                                View childAt = internalListView.getChildAt(i4);
                                if ((childAt instanceof SharedPhotoVideoCell2) && (messageObject = ((SharedPhotoVideoCell2) childAt).getMessageObject()) != null && messageObject.isStory()) {
                                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                                }
                            }
                        }
                    }

                    @Override // org.telegram.ui.Stories.ViewsForPeerStoriesRequester
                    protected boolean updateStories(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
                        StoriesAdapter.this.storiesList.updateStoryViews(arrayList, tL_stories_storyViews.views);
                        return true;
                    }
                };
            }
            checkColumns();
        }

        public void destroy() {
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                storiesList.unlink(this.id);
            }
        }

        private void checkColumns() {
            if (this.storiesList == null || this.isArchive) {
                return;
            }
            if ((!SharedMediaLayout.this.storiesColumnsCountSet || (SharedMediaLayout.this.allowStoriesSingleColumn && this.storiesList.getCount() > 1)) && this.storiesList.getCount() > 0 && !SharedMediaLayout.this.isStoriesView()) {
                if (this.storiesList.getCount() < 5) {
                    SharedMediaLayout.this.mediaColumnsCount[1] = this.storiesList.getCount();
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedMediaLayout.allowStoriesSingleColumn = sharedMediaLayout.mediaColumnsCount[1] == 1;
                } else if (SharedMediaLayout.this.allowStoriesSingleColumn) {
                    SharedMediaLayout.this.allowStoriesSingleColumn = false;
                    SharedMediaLayout.this.mediaColumnsCount[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                }
                SharedMediaLayout.this.storiesColumnsCountSet = true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            if (this.storiesList != null && SharedMediaLayout.this.isBot()) {
                this.uploadingStories.clear();
                ArrayList uploadingStories = MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController().getUploadingStories(SharedMediaLayout.this.dialog_id);
                if (uploadingStories != null) {
                    this.uploadingStories.addAll(uploadingStories);
                }
            }
            super.notifyDataSetChanged();
            StoriesAdapter storiesAdapter = this.supportingAdapter;
            if (storiesAdapter != null) {
                storiesAdapter.notifyDataSetChanged();
            }
            checkColumns();
        }

        public int columnsCount() {
            if (this == SharedMediaLayout.this.photoVideoAdapter) {
                return SharedMediaLayout.this.mediaColumnsCount[0];
            }
            return SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.storiesList == null) {
                return 0;
            }
            return this.uploadingStories.size() + ((this.storiesList.isOnlyCache() && SharedMediaLayout.this.hasInternet()) ? 0 : this.storiesList.getCount());
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public int getTotalItemsCount() {
            return getItemCount();
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter
        public int getPositionForIndex(int i) {
            return this.isArchive ? getTopOffset() + i : i;
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            View view = onCreateViewHolder.itemView;
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).isStory = true;
            }
            return onCreateViewHolder;
        }

        public void setInAlbumStoriesReorder(boolean z) {
            if (this.inAlbumStoriesReorder != z) {
                this.inAlbumStoriesReorder = z;
            }
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.storiesList != null && viewHolder.getItemViewType() == 19) {
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    if (i >= 0 && i < this.uploadingStories.size()) {
                        StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) this.uploadingStories.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                            int m = SessionDetails$$ExternalSyntheticBackport0.m(uploadingStory.random_id);
                            tL_storyItem.messageId = m;
                            tL_storyItem.id = m;
                            tL_storyItem.attachPath = uploadingStory.firstFramePath;
                            MessageObject messageObject = new MessageObject(this.storiesList.currentAccount, tL_storyItem) { // from class: org.telegram.ui.Components.SharedMediaLayout.StoriesAdapter.2
                                @Override // org.telegram.messenger.MessageObject
                                public float getProgress() {
                                    return this.uploadingStory.progress;
                                }
                            };
                            uploadingStory.sharedMessageObject = messageObject;
                            messageObject.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - this.uploadingStories.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject2 = (MessageObject) this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject2 != null && this.storiesList.isPinned(messageObject2.getId());
                    sharedPhotoVideoCell2.setReorder(SharedMediaLayout.this.isBot() || sharedPhotoVideoCell2.isStoryPinned);
                    sharedPhotoVideoCell2.isSearchingHashtag = SharedMediaLayout.this.isSearchingStories();
                    sharedPhotoVideoCell2.setMessageObject(messageObject2, columnsCount());
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (!sharedMediaLayout.isActionModeShowed || messageObject2 == null) {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    } else {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, true);
                    }
                    sharedPhotoVideoCell2.setReordering(this.inAlbumStoriesReorder, false);
                }
            }
        }

        public void load(boolean z) {
            if (this.storiesList == null) {
                return;
            }
            int columnsCount = columnsCount();
            this.storiesList.load(z, Math.min(100, Math.max(1, columnsCount / 2) * columnsCount * columnsCount));
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public String getLetter(int i) {
            int topOffset;
            MessageObject messageObject;
            TL_stories.StoryItem storyItem;
            if (this.storiesList == null || (topOffset = i - getTopOffset()) < 0 || topOffset >= this.storiesList.messageObjects.size() || (messageObject = (MessageObject) this.storiesList.messageObjects.get(topOffset)) == null || (storyItem = messageObject.storyItem) == null) {
                return null;
            }
            return LocaleController.formatYearMont(storyItem.date, true);
        }

        @Override // org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter, org.telegram.ui.Components.RecyclerListView.FastScrollAdapter
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(this.isArchive ? 9 : 8, true);
        }

        public boolean canReorder(int i) {
            StoriesController.StoriesList storiesList;
            if (this.isArchive || (storiesList = this.storiesList) == null) {
                return false;
            }
            if (storiesList instanceof StoriesController.BotPreviewsList) {
                TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
                return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
            }
            if (i < 0 || i >= storiesList.messageObjects.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            StoriesController.StoriesList storiesList2 = this.storiesList;
            if (storiesList2.albumId > 0) {
                return true;
            }
            return storiesList2.isPinned(messageObject.getId());
        }

        public boolean swapElements(int i, int i2) {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || i < 0 || i >= storiesList.messageObjects.size() || i2 < 0 || i2 >= this.storiesList.messageObjects.size()) {
                return false;
            }
            if ((this.storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.storiesList.messageObjects.size(); i3++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i3)).getId()));
                }
            } else {
                arrayList = new ArrayList(this.storiesList.pinnedIds);
            }
            if (!this.applyingReorder) {
                this.lastPinnedIds.clear();
                this.lastPinnedIds.addAll(arrayList);
                this.applyingReorder = true;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(i2, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            this.storiesList.updatePinnedOrder(arrayList, false);
            notifyItemMoved(i, i2);
            return true;
        }

        public void reorderDone() {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || !this.applyingReorder) {
                return;
            }
            if ((storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i)).getId()));
                }
            } else {
                arrayList = storiesList.pinnedIds;
            }
            boolean z = this.lastPinnedIds.size() != arrayList.size();
            if (!z) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.lastPinnedIds.size()) {
                        break;
                    }
                    if (this.lastPinnedIds.get(i2) != arrayList.get(i2)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z) {
                this.storiesList.updatePinnedOrder(arrayList, true);
            }
            this.applyingReorder = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ChatUsersAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.ChatFull chatInfo;
        private Context mContext;
        private ArrayList sortedUsers;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ChatUsersAdapter(Context context) {
            this.mContext = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull != null && chatFull.participants.participants.isEmpty()) {
                return 1;
            }
            TLRPC.ChatFull chatFull2 = this.chatInfo;
            if (chatFull2 != null) {
                return chatFull2.participants.participants.size();
            }
            return 0;
        }

        public void updateRank(long j, String str) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull == null || chatFull.participants == null) {
                return;
            }
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                this.chatInfo.participants.participants.get(i).setRank(j, str);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 20) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 7, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            UserCell userCell = new UserCell(this.mContext, 9, 0, true, false, SharedMediaLayout.this.resourcesProvider);
            userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(userCell);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        
            if (r1.promoted_by == r19.this$0.profileActivity.getUserConfig().getClientUserId()) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
        
            r10 = r4;
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        
            r10 = r4;
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
        
            if (r0.inviter_id == r19.this$0.profileActivity.getUserConfig().getClientUserId()) goto L38;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.ChatParticipant chatParticipant;
            String str;
            String str2;
            final boolean z;
            boolean z2;
            boolean z3;
            View view = viewHolder.itemView;
            if (view instanceof UserCell) {
                UserCell userCell = (UserCell) view;
                if (!this.sortedUsers.isEmpty()) {
                    chatParticipant = this.chatInfo.participants.participants.get(((Integer) this.sortedUsers.get(i)).intValue());
                } else {
                    chatParticipant = this.chatInfo.participants.participants.get(i);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        str = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str)) {
                                str = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str2 = str;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                            }
                            str2 = str;
                            z = false;
                            z2 = false;
                            z3 = false;
                        }
                    } else {
                        str = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str)) {
                                str = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str2 = str;
                            z = false;
                            z2 = true;
                            z3 = true;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(str)) {
                                    str = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                            }
                            str2 = str;
                            z = false;
                            z2 = false;
                            z3 = false;
                        }
                    }
                    final TLRPC.User user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    final String str3 = str2;
                    final boolean z4 = z2;
                    final boolean z5 = z3;
                    userCell.setAdminRole(str2, z2, z3, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id))), new View.OnClickListener() { // from class: org.telegram.ui.Components.SharedMediaLayout$ChatUsersAdapter$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            SharedMediaLayout.ChatUsersAdapter.this.lambda$onBindViewHolder$0(user, str3, z4, z5, z, view2);
                        }
                    });
                    userCell.setData(user, null, null, 0, i != this.chatInfo.participants.participants.size() + (-1));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(TLRPC.User user, String str, boolean z, boolean z2, boolean z3, View view) {
            TagEditCell.showInfoSheet(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity.getCurrentAccount(), SharedMediaLayout.this.dialog_id, user, str, z, z2, z3, SharedMediaLayout.this.resourcesProvider);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class GroupUsersSearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.Chat currentChat;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private ArrayList searchResultNames = new ArrayList();
        private int totalCount = 0;
        int searchCount = 0;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 22;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public GroupUsersSearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0
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
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$new$0(i);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
            this.currentChat = SharedMediaLayout.this.delegate.getCurrentChat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i) {
            notifyDataSetChanged();
            if (i == 1) {
                int i2 = this.searchCount - 1;
                this.searchCount = i2;
                if (i2 == 0) {
                    for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                        if (SharedMediaLayout.this.mediaPages[i3].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i3].listView, 0, null);
                            }
                        }
                    }
                }
            }
        }

        private boolean createMenuForParticipant(TLObject tLObject, boolean z, View view) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                tL_chatChannelParticipant.channelParticipant = channelParticipant;
                tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
                tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                tL_chatChannelParticipant.date = channelParticipant.date;
                tLObject = tL_chatChannelParticipant;
            }
            return SharedMediaLayout.this.delegate.onMemberClick((TLRPC.ChatParticipant) tLObject, true, z, view);
        }

        public void search(final String str, boolean z) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 0);
            notifyDataSetChanged();
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 7 && !TextUtils.isEmpty(str)) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$search$1(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: processSearch, reason: merged with bridge method [inline-methods] */
        public void lambda$search$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$processSearch$3(str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processSearch$3(final String str) {
            final ArrayList arrayList = null;
            this.searchRunnable = null;
            if (!ChatObject.isChannel(this.currentChat) && SharedMediaLayout.this.info != null) {
                arrayList = new ArrayList(SharedMediaLayout.this.info.participants.participants);
            }
            this.searchCount = 2;
            if (arrayList != null) {
                Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$processSearch$2(str, arrayList);
                    }
                });
            } else {
                this.searchCount = 1;
            }
            this.searchAdapterHelper.queryServerSearch(str, false, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
        
            if (r14.contains(" " + r3) != false) goto L50;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[LOOP:1: B:30:0x00b6->B:46:0x014c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010b A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$processSearch$2(String str, ArrayList arrayList) {
            long peerId;
            ?? r4;
            Object obj;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList(), new ArrayList());
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
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLObject tLObject = (TLObject) arrayList.get(i2);
                if (tLObject instanceof TLRPC.ChatParticipant) {
                    peerId = ((TLRPC.ChatParticipant) tLObject).user_id;
                } else {
                    if (tLObject instanceof TLRPC.ChannelParticipant) {
                        peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                    }
                }
                TLRPC.User user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(peerId));
                if (user.id != SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                    String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i3 = 0;
                    boolean z = false;
                    while (i3 < i) {
                        String str2 = strArr[i3];
                        if (!lowerCase2.startsWith(str2)) {
                            if (!lowerCase2.contains(" " + str2)) {
                                if (translitString2 != null) {
                                    if (!translitString2.startsWith(str2)) {
                                    }
                                }
                                String publicUsername = UserObject.getPublicUsername(user);
                                r4 = (publicUsername == null || !publicUsername.startsWith(str2)) ? z : 2;
                                if (r4 == 0) {
                                    if (r4 == 1) {
                                        arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str2));
                                    }
                                    arrayList3.add(tLObject);
                                } else {
                                    i3++;
                                    z = r4;
                                }
                            }
                        }
                        r4 = 1;
                        if (r4 == 0) {
                        }
                    }
                }
            }
            updateSearchResults(arrayList2, arrayList3);
        }

        private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$updateSearchResults$4(arrayList, arrayList2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2) {
            if (SharedMediaLayout.this.searching) {
                this.searchResultNames = arrayList;
                this.searchCount--;
                if (!ChatObject.isChannel(this.currentChat)) {
                    ArrayList groupSearch = this.searchAdapterHelper.getGroupSearch();
                    groupSearch.clear();
                    groupSearch.addAll(arrayList2);
                }
                if (this.searchCount == 0) {
                    for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                        if (SharedMediaLayout.this.mediaPages[i].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                            }
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.totalCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            this.totalCount = size;
            if (size > 0 && SharedMediaLayout.this.searching && SharedMediaLayout.this.mediaPages[0].selectedType == 7 && SharedMediaLayout.this.mediaPages[0].listView.getAdapter() != this) {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
            super.notifyDataSetChanged();
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (i < 0 || i >= size) {
                return null;
            }
            return (TLObject) this.searchAdapterHelper.getGroupSearch().get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 9, 5, true, SharedMediaLayout.this.resourcesProvider);
            manageChatUserCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.Cells.ManageChatUserCell.ManageChatUserCellDelegate
                public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                    boolean lambda$onCreateViewHolder$5;
                    lambda$onCreateViewHolder$5 = SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$onCreateViewHolder$5(manageChatUserCell2, z);
                    return lambda$onCreateViewHolder$5;
                }
            });
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onCreateViewHolder$5(ManageChatUserCell manageChatUserCell, boolean z) {
            TLObject item = getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (item instanceof TLRPC.ChannelParticipant) {
                return createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.User user;
            SpannableStringBuilder spannableStringBuilder;
            TLObject item = getItem(i);
            if (item instanceof TLRPC.ChannelParticipant) {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer)));
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
            }
            UserObject.getPublicUsername(user);
            this.searchAdapterHelper.getGroupSearch().size();
            String lastFoundChannel = this.searchAdapterHelper.getLastFoundChannel();
            if (lastFoundChannel != null) {
                String userName = UserObject.getUserName(user);
                spannableStringBuilder = new SpannableStringBuilder(userName);
                int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, lastFoundChannel);
                if (indexOfIgnoreCase != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOfIgnoreCase, lastFoundChannel.length() + indexOfIgnoreCase, 33);
                }
            } else {
                spannableStringBuilder = null;
            }
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                manageChatUserCell.setTag(Integer.valueOf(i));
                manageChatUserCell.setData(user, spannableStringBuilder, null, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.selectedMessagesCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        RLottieImageView iconView = this.deleteItem.getIconView();
        int i = ThemeDescription.FLAG_IMAGECOLOR;
        int i2 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(iconView, i, null, null, null, null, i2));
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        int i3 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i4 = Theme.key_actionBarActionModeDefaultSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem, i3, null, null, null, null, i4));
        if (this.gotoItem != null) {
            arrayList.add(new ThemeDescription(this.gotoItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.gotoItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        }
        if (this.forwardItem != null) {
            arrayList.add(new ThemeDescription(this.forwardItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.forwardItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        }
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, new Drawable[]{this.backDrawable}, null, i2));
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i4));
        LinearLayout linearLayout = this.actionModeLayout;
        int i5 = ThemeDescription.FLAG_BACKGROUND;
        int i6 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, i5, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeBackground));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_tabSelectedLine));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelectedText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelector));
        if (this.fragmentContextView != null) {
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_BACKGROUND, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerPlayPause));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerTitle));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_FASTSCROLL, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerPerformer));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_inappPlayerClose));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_returnToCallBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_returnToCallText));
        }
        for (final int i7 = 0; i7 < this.mediaPages.length; i7++) {
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda7
                @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
                public final void didSetColor() {
                    SharedMediaLayout.this.lambda$getThemeDescriptions$68(i7);
                }

                @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
                public /* synthetic */ void onAnimationProgress(float f) {
                    ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
                }
            };
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
            FlickerLoadingView flickerLoadingView = this.mediaPages[i7].progressView;
            int i8 = Theme.key_windowBackgroundWhite;
            arrayList.add(new ThemeDescription(flickerLoadingView, 0, null, null, null, null, i8));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
            int i9 = Theme.key_progressCircle;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{UserCell.class}, new String[]{"adminTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_creatorIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
            int i10 = Theme.key_windowBackgroundWhiteBlackText;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            int i11 = Theme.key_windowBackgroundWhiteGrayText;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i11));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
            Drawable[] drawableArr = Theme.avatarDrawables;
            int i12 = Theme.key_avatar_text;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{UserCell.class}, null, drawableArr, null, i12));
            TextPaint[] textPaintArr = Theme.dialogs_namePaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
            TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ProfileSearchCell.class}, null, Theme.avatarDrawables, null, i12));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
            int i13 = Theme.key_windowBackgroundWhiteGrayText2;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyStubView.class}, new String[]{"emptyTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText3));
            int i14 = Theme.key_sharedMedia_startStopLoadIcon;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
            int i15 = Theme.key_checkbox;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            int i16 = Theme.key_checkboxCheck;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_files_folderIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_files_iconText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_sharedMedia_linkPlaceholderText));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_sharedMedia_linkPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{SharedMediaSectionCell.class}, null, null, null, i8));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
            int i17 = Theme.key_sharedMedia_photoPlaceholder;
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{SharedPhotoVideoCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, new Class[]{ContextLinkCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i15));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i16));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].listView, 0, null, null, new Drawable[]{this.pinnedHeaderShadowDrawable}, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i7].emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i11));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getThemeDescriptions$68(int i) {
        if (this.mediaPages[i].listView != null) {
            int childCount = this.mediaPages[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) childAt).updateCheckboxColor();
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                } else if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }

    public int getNextMediaColumnsCount(int i, int i2, boolean z) {
        int i3 = i2 + (!z ? 1 : -1);
        if (i3 > 6) {
            i3 = !z ? 9 : 6;
        }
        return Utilities.clamp(i3, 9, (this.allowStoriesSingleColumn && i == 1) ? 1 : 2);
    }

    public Boolean zoomIn() {
        return zoomIn(null, null);
    }

    public Boolean zoomIn(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        int i = mediaPage.selectedType;
        this.changeColumnsTab = i;
        boolean isAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0], true);
        if (view != null && nextMediaColumnsCount == getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!isAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true));
    }

    public Boolean zoomOut() {
        return zoomOut(null, null);
    }

    public Boolean zoomOut(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return null;
        }
        int i = this.mediaPages[0].selectedType;
        this.changeColumnsTab = i;
        boolean isAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0], false);
        if (view2 != null && nextMediaColumnsCount == getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!isAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false));
    }

    public boolean canZoomIn() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            return false;
        }
        boolean isAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
        int i = this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0];
        return i != getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, i, true);
    }

    public boolean canZoomOut() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            return false;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return false;
        }
        boolean isAnyStoryPageType = isAnyStoryPageType(this.mediaPages[0].selectedType);
        int i = this.mediaColumnsCount[isAnyStoryPageType ? 1 : 0];
        return i != getNextMediaColumnsCount(isAnyStoryPageType ? 1 : 0, i, false);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (view == this.fragmentContextView && this.topPanelLayout == null) {
            canvas.save();
            float top = this.mediaPages[0].getTop();
            if (this.storiesContainer != null && ((i = this.mediaPages[0].selectedType) == 8 || isStoryAlbumPageType(i))) {
                top -= this.storiesContainer.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public class ScrollSlidingTextTabStripInner extends ScrollSlidingTextTabStrip {
        public int backgroundColor;
        protected Paint backgroundPaint;
        private Rect blurBounds;

        protected void drawBackground(Canvas canvas) {
        }

        public ScrollSlidingTextTabStripInner(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.backgroundColor = 0;
            this.blurBounds = new Rect();
        }

        @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (this.backgroundColor != 0) {
                if (this.backgroundPaint == null) {
                    this.backgroundPaint = new Paint();
                }
                this.backgroundPaint.setColor(this.backgroundColor);
                this.blurBounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                canvas.translate(getScrollX(), 0.0f);
                canvas.clipPath(this.clipPath);
                if (SharedConfig.chatBlurEnabled()) {
                    SharedMediaLayout.this.drawBackgroundWithBlur(canvas, getY(), this.blurBounds, this.backgroundPaint);
                } else {
                    canvas.drawPaint(this.backgroundPaint);
                }
                canvas.translate(-getScrollX(), 0.0f);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }

        @Override // android.view.View
        public void setBackgroundColor(int i) {
            this.backgroundColor = i;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    private boolean isTab(int i, int i2, boolean z) {
        return (z && i2 == 8 && isStoryAlbumPageType(i)) || i == i2;
    }

    public float getBottomButtonStoriesVisibility() {
        MediaPage mediaPage;
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        MediaPage[] mediaPageArr = this.mediaPages;
        float f = 1.0f;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null || mediaPageArr[1] == null || mediaPage.emptyView == null || this.mediaPages[1].emptyView == null) {
            return 1.0f;
        }
        MediaPage[] mediaPageArr2 = this.mediaPages;
        int i = mediaPageArr2[0].selectedType;
        int i2 = mediaPageArr2[1].selectedType;
        boolean z = isStoryAlbumPageType(i) || i == 8;
        boolean z2 = isStoryAlbumPageType(i2) || i2 == 8;
        if (!z && !z2) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - this.mediaPages[0].emptyView.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - this.mediaPages[1].emptyView.getVisibilityFactor();
        StoriesAdapter storyAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[0].selectedType);
        if (i == 8 || (storyAlbums_getStoriesAdapterByTabType != null && (storiesList2 = storyAlbums_getStoriesAdapterByTabType.storiesList) != null && storiesList2.getCount() > 0)) {
            visibilityFactor = 1.0f;
        }
        StoriesAdapter storyAlbums_getStoriesAdapterByTabType2 = storyAlbums_getStoriesAdapterByTabType(i2);
        if (i2 != 8 && (storyAlbums_getStoriesAdapterByTabType2 == null || (storiesList = storyAlbums_getStoriesAdapterByTabType2.storiesList) == null || storiesList.getCount() <= 0)) {
            f = visibilityFactor2;
        }
        if (!z) {
            visibilityFactor = f;
        }
        if (!z2) {
            f = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f, Math.abs(this.mediaPages[0].getTranslationX() / this.mediaPages[0].getMeasuredWidth()));
    }

    public float getTabTranslationX(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                break;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                i3++;
                width = this.mediaPages[i2].getTranslationX();
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public float getTabVisibility(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return f;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                f += 1.0f - Math.abs(this.mediaPages[i2].getTranslationX() / getWidth());
            }
            i2++;
        }
    }

    @Deprecated
    public float getTabProgress() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return f;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null) {
                f += mediaPage.selectedType * (1.0f - Math.abs(mediaPage.getTranslationX() / getWidth()));
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStoriesTabsPosition() {
        char c;
        float abs;
        float f;
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null || mediaPageArr[1] == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.storiesContainer != null) {
            char c2 = (!isAnyStoryPageType(mediaPage.selectedType) || this.mediaPages[0].selectedType == 9) ? (char) 0 : (char) 1;
            if (this.mediaPages[1].getVisibility() == 0) {
                c = (!isAnyStoryPageType(this.mediaPages[1].selectedType) || this.mediaPages[1].selectedType == 9) ? (char) 0 : (char) 1;
            } else {
                c = c2;
            }
            if (c2 == c) {
                abs = c2 != 0 ? 1.0f : 0.0f;
                this.storiesContainer.setTranslationX(c2 != 0 ? 0.0f : this.mediaPages[0].getMeasuredWidth());
            } else {
                this.storiesContainer.setTranslationX(this.mediaPages[c2 ^ 1].getTranslationX());
                abs = 1.0f - (Math.abs(this.storiesContainer.getTranslationX()) / this.storiesContainer.getMeasuredWidth());
            }
            int i = 0;
            float f3 = 0.0f;
            while (true) {
                MediaPage[] mediaPageArr2 = this.mediaPages;
                if (i >= mediaPageArr2.length) {
                    break;
                }
                if (mediaPageArr2[i].getVisibility() == 0) {
                    InternalListView internalListView = this.mediaPages[i].listView;
                    View childAt = internalListView.getChildCount() == 0 ? null : internalListView.getChildAt(0);
                    if ((childAt == null ? -1 : internalListView.getChildAdapterPosition(childAt)) == 0) {
                        f = childAt.getY() - internalListView.getPaddingTop();
                    } else {
                        f = internalListView.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f);
                    }
                    f3 += f * Utilities.clamp01(1.0f - (this.mediaPages[i].getTranslationX() / this.mediaPages[i].getMeasuredWidth()));
                }
                i++;
            }
            float clamp01 = Utilities.clamp01(1.0f - ((-f3) / AndroidUtilities.dpf2(48.0f)));
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
            this.storiesContainer.setAlpha(clamp01);
            this.storiesContainer.setScaleX(lerp);
            this.storiesContainer.setScaleY(lerp);
            this.storiesContainer.setTranslationY(this.topPadding + f3);
            f2 = abs;
        }
        checkUi_topPanelLayoutY();
        if (this.subTabsVisibilityFactor != f2) {
            this.subTabsVisibilityFactor = f2;
            invalidateBlur();
            invalidate();
        }
    }

    protected void onTabProgress(float f) {
        onBottomButtonVisibilityChange();
    }

    public static class InternalListView extends BlurredRecyclerView implements StoriesListPlaceProvider.ClippedView {
        public int hintPaddingBottom;
        public int hintPaddingTop;

        public InternalListView(Context context) {
            super(context);
        }

        @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.ClippedView
        public void updateClip(int[] iArr) {
            iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.hintPaddingTop;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.hintPaddingBottom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateOptionsSearch() {
        updateOptionsSearch(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateOptionsSearch(boolean z) {
        ProfileGiftsContainer profileGiftsContainer;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null) {
            return;
        }
        float f = 0.0f;
        if (!this.searching && (((profileGiftsContainer = this.giftsContainer) == null || !profileGiftsContainer.isReordering()) && ((profileStoriesCollectionTabs = this.storiesContainer) == null || !profileStoriesCollectionTabs.isReordering()))) {
            f = Utilities.clamp(this.searchAlpha + this.optionsAlpha, 1.0f, 0.0f);
        }
        rLottieImageView.setAlpha(f);
        if (z) {
            animateSearchToOptions(getPhotoVideoOptionsAlpha(1.0f) > 0.5f, true);
        } else if (this.searchItemState == 2) {
            animateSearchToOptions(this.optionsAlpha > 0.1f, true);
        } else {
            animateSearchToOptions(this.searchAlpha < 0.1f, true);
        }
    }

    public void animateSearchToOptions(boolean z, boolean z2) {
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null || this.animatingToOptions == z) {
            return;
        }
        this.animatingToOptions = z;
        if (!z && rLottieImageView.getAnimatedDrawable().getCurrentFrame() < 20) {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(0);
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(this.animatingToOptions ? 50 : 100);
        }
        if (z2) {
            this.optionsSearchImageView.getAnimatedDrawable().start();
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCurrentFrame(this.optionsSearchImageView.getAnimatedDrawable().getCustomEndFrame());
        }
    }

    private CharSequence addPostText() {
        if (this.addPostButton == null) {
            this.addPostButton = new SpannableStringBuilder();
            if (isBot()) {
                this.addPostButton.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.addPostButton.append((CharSequence) "c");
                this.addPostButton.setSpan(new ColoredImageSpan(R.drawable.filled_premium_camera), 0, 1, 33);
                this.addPostButton.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.addPostButton;
    }

    public boolean canEditStories() {
        BaseFragment baseFragment;
        if (!isBot()) {
            return isStoriesView() || ((baseFragment = this.profileActivity) != null && baseFragment.getMessagesController().getStoriesController().canEditStories(this.dialog_id));
        }
        TLRPC.User user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id));
        return user != null && user.bot && user.bot_can_edit;
    }

    public boolean isSearchingStories() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public void setPagesPaddingBottom(int i) {
        if (this.pagesPaddingBottom != i) {
            this.pagesPaddingBottom = i;
            MediaPage[] mediaPageArr = this.mediaPages;
            if (mediaPageArr != null) {
                for (MediaPage mediaPage : mediaPageArr) {
                    if (mediaPage != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int i2 = mediaPage.listView.topPadding;
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, i2, paddingRight, pagePaddingBottom);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getPagePaddingBottom(boolean z) {
        return this.pagesPaddingBottom + (z ? AndroidUtilities.dp(52.0f) : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getPagePaddingTop(int i) {
        return AndroidUtilities.dp(54.0f) + this.topLayoutPadding + ((int) ((this.storiesContainer == null || !(isStoryAlbumPageType(i) || i == 8)) ? 0.0f : this.storiesContainer.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public static class SharedMediaListView extends InternalListView {
        private final ArrayList animationSupportingSortedCells;
        private int animationSupportingSortedCellsOffset;
        protected StaticLayout archivedHintLayout;
        protected float archivedHintLayoutLeft;
        protected float archivedHintLayoutWidth;
        protected TextPaint archivedHintPaint;
        final ArrayList drawingViews;
        final ArrayList drawingViews2;
        final ArrayList drawingViews3;
        final HashSet excludeDrawViews;
        UserListPoller poller;

        public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
        }

        public int getAnimateToColumnsCount() {
            return 3;
        }

        public float getChangeColumnsProgress() {
            return 0.0f;
        }

        public int getColumnsCount() {
            return 3;
        }

        public SparseArray<Float> getMessageAlphaEnter() {
            return null;
        }

        public RecyclerListView.FastScrollAdapter getMovingAdapter() {
            return null;
        }

        public int getPinchCenterPosition() {
            return 0;
        }

        public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
            return null;
        }

        public InternalListView getSupportingListView() {
            return null;
        }

        public abstract boolean isChangeColumnsAnimation();

        public abstract boolean isStories();

        public boolean isThisListView() {
            return true;
        }

        public SharedMediaListView(Context context) {
            super(context);
            this.excludeDrawViews = new HashSet();
            this.drawingViews = new ArrayList();
            this.drawingViews2 = new ArrayList();
            this.drawingViews3 = new ArrayList();
            this.animationSupportingSortedCells = new ArrayList();
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x03a5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:210:0x06e4  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x06ea  */
        @Override // org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            Float f;
            float f2;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            float f3;
            Float f4;
            boolean z;
            int i7;
            int i8;
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            RecyclerListView.FastScrollAdapter supportingAdapter = getSupportingAdapter();
            boolean isThisListView = isThisListView();
            Float valueOf = Float.valueOf(1.0f);
            if (isThisListView && getAdapter() == movingAdapter) {
                float measuredHeight = getMeasuredHeight();
                boolean z2 = true;
                if (isChangeColumnsAnimation()) {
                    int i9 = -1;
                    i3 = -1;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        int childAdapterPosition = getChildAdapterPosition(getChildAt(i10));
                        if (childAdapterPosition >= 0 && (childAdapterPosition > i9 || i9 == -1)) {
                            i9 = childAdapterPosition;
                        }
                        if (childAdapterPosition >= 0 && (childAdapterPosition < i3 || i3 == -1)) {
                            i3 = childAdapterPosition;
                        }
                    }
                    int i11 = -1;
                    i4 = -1;
                    for (int i12 = 0; i12 < getSupportingListView().getChildCount(); i12++) {
                        int childAdapterPosition2 = getSupportingListView().getChildAdapterPosition(getSupportingListView().getChildAt(i12));
                        if (childAdapterPosition2 >= 0 && (childAdapterPosition2 > i11 || i11 == -1)) {
                            i11 = childAdapterPosition2;
                        }
                        if (childAdapterPosition2 >= 0 && (childAdapterPosition2 < i4 || i4 == -1)) {
                            i4 = childAdapterPosition2;
                        }
                    }
                    if (i3 < 0 || i4 < 0 || getPinchCenterPosition() < 0) {
                        i7 = 0;
                        i8 = 0;
                    } else {
                        int ceil = (int) Math.ceil(movingAdapter.getItemCount() / getColumnsCount());
                        int ceil2 = (int) Math.ceil(movingAdapter.getItemCount() / getAnimateToColumnsCount());
                        i8 = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i4 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i3 / getColumnsCount()));
                        if (((i3 / getColumnsCount()) - i8 < 0 && getAnimateToColumnsCount() < getColumnsCount()) || ((i4 / getAnimateToColumnsCount()) + i8 < 0 && getAnimateToColumnsCount() > getColumnsCount())) {
                            i8 = 0;
                        }
                        if (((i11 / getColumnsCount()) + i8 >= ceil && getAnimateToColumnsCount() > getColumnsCount()) || ((i9 / getAnimateToColumnsCount()) - i8 >= ceil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                            i8 = 0;
                        }
                        i7 = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
                    }
                    this.animationSupportingSortedCells.clear();
                    this.excludeDrawViews.clear();
                    this.drawingViews.clear();
                    this.drawingViews2.clear();
                    this.drawingViews3.clear();
                    this.animationSupportingSortedCellsOffset = 0;
                    for (int i13 = 0; i13 < getSupportingListView().getChildCount(); i13++) {
                        View childAt = getSupportingListView().getChildAt(i13);
                        if (childAt.getTop() <= getMeasuredHeight() && childAt.getBottom() >= 0) {
                            if (childAt instanceof SharedPhotoVideoCell2) {
                                this.animationSupportingSortedCells.add((SharedPhotoVideoCell2) childAt);
                            } else if (childAt instanceof TextView) {
                                this.animationSupportingSortedCellsOffset++;
                            }
                        }
                    }
                    this.drawingViews.addAll(this.animationSupportingSortedCells);
                    RecyclerListView.FastScroll fastScroll = getFastScroll();
                    if (fastScroll != null && fastScroll.getTag() != null) {
                        float scrollProgress = movingAdapter.getScrollProgress(this);
                        float scrollProgress2 = supportingAdapter.getScrollProgress(getSupportingListView());
                        float f5 = movingAdapter.fastScrollIsVisible(this) ? 1.0f : 0.0f;
                        float f6 = supportingAdapter.fastScrollIsVisible(getSupportingListView()) ? 1.0f : 0.0f;
                        fastScroll.setProgress((scrollProgress * (1.0f - getChangeColumnsProgress())) + (scrollProgress2 * getChangeColumnsProgress()));
                        fastScroll.setVisibilityAlpha((f5 * (1.0f - getChangeColumnsProgress())) + (f6 * getChangeColumnsProgress()));
                    }
                    i2 = i8;
                    i = i7;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                }
                float f7 = measuredHeight;
                int i14 = 0;
                while (i14 < getChildCount()) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getTop() > getMeasuredHeight() || childAt2.getBottom() < 0) {
                        f4 = valueOf;
                        if (childAt2 instanceof SharedPhotoVideoCell2) {
                            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) getChildAt(i14);
                            sharedPhotoVideoCell2.setCrossfadeView(null, 0.0f, 0);
                            sharedPhotoVideoCell2.setTranslationX(0.0f);
                            sharedPhotoVideoCell2.setTranslationY(0.0f);
                            sharedPhotoVideoCell2.setImageScale(1.0f, !isChangeColumnsAnimation());
                        }
                    } else if (childAt2 instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell22 = (SharedPhotoVideoCell2) getChildAt(i14);
                        checkHighlightCell(sharedPhotoVideoCell22);
                        MessageObject messageObject = sharedPhotoVideoCell22.getMessageObject();
                        sharedPhotoVideoCell22.setImageAlpha((messageObject == null || getMessageAlphaEnter() == null || getMessageAlphaEnter().get(messageObject.getId(), null) == null) ? 1.0f : getMessageAlphaEnter().get(messageObject.getId(), valueOf).floatValue(), isChangeColumnsAnimation() ^ z2);
                        if (isChangeColumnsAnimation()) {
                            int viewAdapterPosition = (((GridLayoutManager.LayoutParams) sharedPhotoVideoCell22.getLayoutParams()).getViewAdapterPosition() % getColumnsCount()) + i;
                            int viewAdapterPosition2 = ((((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell22.getLayoutParams()).getViewAdapterPosition() - i3) / getColumnsCount()) + i2) * getAnimateToColumnsCount()) + viewAdapterPosition + this.animationSupportingSortedCellsOffset;
                            if (viewAdapterPosition >= 0 && viewAdapterPosition < getAnimateToColumnsCount() && viewAdapterPosition2 >= 0 && viewAdapterPosition2 < this.animationSupportingSortedCells.size()) {
                                float lerp = AndroidUtilities.lerp(1.0f, (((SharedPhotoVideoCell2) this.animationSupportingSortedCells.get(viewAdapterPosition2)).getMeasuredWidth() - AndroidUtilities.dpf2(2.0f)) / (sharedPhotoVideoCell22.getMeasuredWidth() - AndroidUtilities.dpf2(2.0f)), getChangeColumnsProgress());
                                float left = sharedPhotoVideoCell22.getLeft();
                                float top = sharedPhotoVideoCell22.getTop();
                                float left2 = ((SharedPhotoVideoCell2) this.animationSupportingSortedCells.get(viewAdapterPosition2)).getLeft();
                                float top2 = ((SharedPhotoVideoCell2) this.animationSupportingSortedCells.get(viewAdapterPosition2)).getTop();
                                f4 = valueOf;
                                sharedPhotoVideoCell22.setPivotX(0.0f);
                                sharedPhotoVideoCell22.setPivotY(0.0f);
                                sharedPhotoVideoCell22.setImageScale(lerp, !isChangeColumnsAnimation());
                                sharedPhotoVideoCell22.setTranslationX((left2 - left) * getChangeColumnsProgress());
                                sharedPhotoVideoCell22.setTranslationY((top2 - top) * getChangeColumnsProgress());
                                sharedPhotoVideoCell22.setCrossfadeView((SharedPhotoVideoCell2) this.animationSupportingSortedCells.get(viewAdapterPosition2), getChangeColumnsProgress(), getAnimateToColumnsCount());
                                this.excludeDrawViews.add((SharedPhotoVideoCell2) this.animationSupportingSortedCells.get(viewAdapterPosition2));
                                this.drawingViews3.add(sharedPhotoVideoCell22);
                                canvas.save();
                                canvas.translate(sharedPhotoVideoCell22.getX(), sharedPhotoVideoCell22.getY());
                                sharedPhotoVideoCell22.draw(canvas);
                                canvas.restore();
                                if (sharedPhotoVideoCell22.getY() < f7) {
                                    f7 = sharedPhotoVideoCell22.getY();
                                }
                                z = true;
                                if (!z) {
                                    if (isChangeColumnsAnimation()) {
                                        this.drawingViews2.add(sharedPhotoVideoCell22);
                                    }
                                    sharedPhotoVideoCell22.setCrossfadeView(null, 0.0f, 0);
                                    sharedPhotoVideoCell22.setTranslationX(0.0f);
                                    sharedPhotoVideoCell22.setTranslationY(0.0f);
                                    sharedPhotoVideoCell22.setImageScale(1.0f, !isChangeColumnsAnimation());
                                }
                            }
                        }
                        f4 = valueOf;
                        z = false;
                        if (!z) {
                        }
                    } else {
                        f4 = valueOf;
                    }
                    i14++;
                    valueOf = f4;
                    z2 = true;
                }
                if (isChangeColumnsAnimation() && !this.drawingViews.isEmpty()) {
                    float animateToColumnsCount = ((getAnimateToColumnsCount() / getColumnsCount()) * (1.0f - getChangeColumnsProgress())) + getChangeColumnsProgress();
                    float measuredWidth = ((((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))) * (1.0f - getChangeColumnsProgress())) + getChangeColumnsProgress();
                    float measuredWidth2 = getMeasuredWidth() / getColumnsCount();
                    float measuredWidth3 = getMeasuredWidth() / getAnimateToColumnsCount();
                    float ceil3 = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * measuredWidth) + AndroidUtilities.dpf2(2.0f));
                    if (isStories()) {
                        ceil3 *= 1.25f;
                    }
                    float f8 = ceil3;
                    int i15 = 0;
                    while (i15 < this.drawingViews.size()) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell23 = (SharedPhotoVideoCell2) this.drawingViews.get(i15);
                        if (this.excludeDrawViews.contains(sharedPhotoVideoCell23)) {
                            i6 = i15;
                            f3 = measuredWidth;
                        } else {
                            sharedPhotoVideoCell23.setCrossfadeView(null, 0.0f, 0);
                            int viewAdapterPosition3 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell23.getLayoutParams()).getViewAdapterPosition() % getAnimateToColumnsCount();
                            int i16 = viewAdapterPosition3 - i;
                            int viewAdapterPosition4 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell23.getLayoutParams()).getViewAdapterPosition() - i4) / getAnimateToColumnsCount()) - i2;
                            canvas.save();
                            canvas.translate((i16 * measuredWidth2 * (1.0f - getChangeColumnsProgress())) + (viewAdapterPosition3 * measuredWidth3 * getChangeColumnsProgress()), (viewAdapterPosition4 * f8) + f7);
                            sharedPhotoVideoCell23.setImageScale(measuredWidth, !isChangeColumnsAnimation());
                            if (i16 < getColumnsCount()) {
                                i6 = i15;
                                f3 = measuredWidth;
                                canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell23.getMeasuredWidth() * animateToColumnsCount, sharedPhotoVideoCell23.getMeasuredHeight() * animateToColumnsCount, (int) (getChangeColumnsProgress() * 255.0f), 31);
                                sharedPhotoVideoCell23.draw(canvas);
                                canvas.restore();
                            } else {
                                i6 = i15;
                                f3 = measuredWidth;
                                sharedPhotoVideoCell23.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i15 = i6 + 1;
                        measuredWidth = f3;
                    }
                }
                super.dispatchDraw(canvas);
                if (isChangeColumnsAnimation()) {
                    float columnsCount = ((getColumnsCount() / getAnimateToColumnsCount()) * getChangeColumnsProgress()) + (1.0f - getChangeColumnsProgress());
                    float measuredWidth4 = ((((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))) * getChangeColumnsProgress()) + (1.0f - getChangeColumnsProgress());
                    float ceil4 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) * measuredWidth4) + AndroidUtilities.dpf2(2.0f));
                    if (isStories()) {
                        ceil4 *= 1.25f;
                    }
                    float f9 = ceil4;
                    float measuredWidth5 = getMeasuredWidth() / getColumnsCount();
                    float measuredWidth6 = getMeasuredWidth() / getAnimateToColumnsCount();
                    int i17 = 0;
                    while (i17 < this.drawingViews2.size()) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell24 = (SharedPhotoVideoCell2) this.drawingViews2.get(i17);
                        int viewAdapterPosition5 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell24.getLayoutParams()).getViewAdapterPosition() % getColumnsCount();
                        int viewAdapterPosition6 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell24.getLayoutParams()).getViewAdapterPosition() - i3) / getColumnsCount()) + i2;
                        int i18 = viewAdapterPosition5 + i;
                        canvas.save();
                        sharedPhotoVideoCell24.setImageScale(measuredWidth4, !isChangeColumnsAnimation());
                        canvas.translate((viewAdapterPosition5 * measuredWidth5 * (1.0f - getChangeColumnsProgress())) + (i18 * measuredWidth6 * getChangeColumnsProgress()), (viewAdapterPosition6 * f9) + f7);
                        if (i18 < getAnimateToColumnsCount()) {
                            i5 = i17;
                            canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell24.getMeasuredWidth() * columnsCount, sharedPhotoVideoCell24.getMeasuredHeight() * columnsCount, (int) ((1.0f - getChangeColumnsProgress()) * 255.0f), 31);
                            sharedPhotoVideoCell24.draw(canvas);
                            canvas.restore();
                        } else {
                            i5 = i17;
                            sharedPhotoVideoCell24.draw(canvas);
                        }
                        canvas.restore();
                        i17 = i5 + 1;
                    }
                    if (this.drawingViews3.isEmpty()) {
                        return;
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
                    for (int i19 = 0; i19 < this.drawingViews3.size(); i19++) {
                        ((SharedPhotoVideoCell2) this.drawingViews3.get(i19)).drawCrossafadeImage(canvas);
                    }
                    canvas.restore();
                    return;
                }
                return;
            }
            Float f10 = valueOf;
            int i20 = 0;
            while (i20 < getChildCount()) {
                View childAt3 = getChildAt(i20);
                int messageId = SharedMediaLayout.getMessageId(childAt3);
                if (messageId == 0 || getMessageAlphaEnter() == null) {
                    f = f10;
                } else if (getMessageAlphaEnter().get(messageId, null) != null) {
                    f = f10;
                    f2 = getMessageAlphaEnter().get(messageId, f).floatValue();
                    if (!(childAt3 instanceof SharedDocumentCell)) {
                        ((SharedDocumentCell) childAt3).setEnterAnimationAlpha(f2);
                    } else if (childAt3 instanceof SharedAudioCell) {
                        ((SharedAudioCell) childAt3).setEnterAnimationAlpha(f2);
                    }
                    i20++;
                    f10 = f;
                } else {
                    f = f10;
                }
                f2 = 1.0f;
                if (!(childAt3 instanceof SharedDocumentCell)) {
                }
                i20++;
                f10 = f;
            }
            super.dispatchDraw(canvas);
        }

        @Override // org.telegram.ui.Components.BlurredRecyclerView, org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean drawChild(Canvas canvas, View view, long j) {
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            if (isThisListView() && getAdapter() == movingAdapter && isChangeColumnsAnimation() && (view instanceof SharedPhotoVideoCell2)) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public void openRenameStoriesAlbumAlert(BaseFragment baseFragment, final long j, final int i) {
        AlertsCreator.createStoriesAlbumEnterNameForRename(baseFragment.getContext(), baseFragment, getStoriesController().getAlbumName(j, i), baseFragment.getResourceProvider(), new MessagesStorage.StringCallback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda72
            @Override // org.telegram.messenger.MessagesStorage.StringCallback
            public final void run(String str) {
                SharedMediaLayout.this.lambda$openRenameStoriesAlbumAlert$70(j, i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openRenameStoriesAlbumAlert$70(long j, int i, String str) {
        getStoriesController().renameAlbum(j, i, str);
    }

    public void openDeleteStoriesAlbumAlert(BaseFragment baseFragment, final long j, final int i) {
        String albumName = getStoriesController().getAlbumName(j, i);
        int i2 = R.string.Delete;
        AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(i2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, albumName)), LocaleController.getString(i2), true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$openDeleteStoriesAlbumAlert$71(j, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openDeleteStoriesAlbumAlert$71(long j, int i) {
        getStoriesController().removeAlbum(j, i);
    }

    public void openAddStoriesToAlbumSheet(BaseFragment baseFragment, final long j, final int i) {
        new SelectStoriesBottomSheet(baseFragment, j, this.mediaColumnsCount[1], new Utilities.Callback() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda33
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                SharedMediaLayout.this.lambda$openAddStoriesToAlbumSheet$72(j, i, (ArrayList) obj);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAddStoriesToAlbumSheet$72(long j, int i, ArrayList arrayList) {
        getStoriesController().addStoriesToAlbum(j, i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ItemOptions buildItemOptionsForStoryAlbumActionBar(final BaseFragment baseFragment, View view, final long j, final int i) {
        final ItemOptions makeOptions = ItemOptions.makeOptions(baseFragment, view);
        makeOptions.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$buildItemOptionsForStoryAlbumActionBar$73(baseFragment, j, i, makeOptions);
            }
        });
        addStoryAlbumShareItemOptions(makeOptions, baseFragment, j, i);
        makeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$buildItemOptionsForStoryAlbumActionBar$74(i, makeOptions);
            }
        });
        makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda64
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$buildItemOptionsForStoryAlbumActionBar$75(baseFragment, j, i, makeOptions);
            }
        });
        makeOptions.addGap();
        addZoomInZoomOutItemOptions(makeOptions);
        makeOptions.setDismissWithButtons(false);
        return makeOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildItemOptionsForStoryAlbumActionBar$73(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openAddStoriesToAlbumSheet(baseFragment, j, i);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildItemOptionsForStoryAlbumActionBar$74(int i, ItemOptions itemOptions) {
        lambda$onItemLongClick$58(i);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildItemOptionsForStoryAlbumActionBar$75(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openDeleteStoriesAlbumAlert(baseFragment, j, i);
        itemOptions.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStoryAlbumShareItemOptions(ItemOptions itemOptions, final BaseFragment baseFragment, long j, int i) {
        String publicUsername;
        if (j > 0) {
            publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j)));
        } else {
            publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j)));
        }
        if (publicUsername == null) {
            return;
        }
        final String str = "https://" + MessagesController.getInstance(baseFragment.getCurrentAccount()).linkPrefix + "/" + publicUsername + "/a/" + i;
        itemOptions.add(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda65
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$addStoryAlbumShareItemOptions$76(str, baseFragment);
            }
        });
    }

    class 50 extends ShareAlert {
        final /* synthetic */ BaseFragment val$fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        50(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
            this.val$fragment = baseFragment;
        }

        @Override // org.telegram.ui.Components.ShareAlert
        protected void onSend(final LongSparseArray longSparseArray, final int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            final BaseFragment baseFragment = this.val$fragment;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$50$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SharedMediaLayout.50.lambda$onSend$0(BaseFragment.this, longSparseArray, i);
                }
            }, 100L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSend$0(BaseFragment baseFragment, LongSparseArray longSparseArray, int i) {
            UndoView undoView;
            if (baseFragment instanceof ChatActivity) {
                undoView = ((ChatActivity) baseFragment).getUndoView();
            } else {
                undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            }
            UndoView undoView2 = undoView;
            if (undoView2 != null) {
                if (longSparseArray.size() == 1) {
                    undoView2.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i));
                } else {
                    undoView2.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addStoryAlbumShareItemOptions$76(String str, BaseFragment baseFragment) {
        50 r10 = new 50(getContext(), null, str, false, str, false, this.resourcesProvider, baseFragment);
        if (baseFragment != null) {
            baseFragment.showDialog(r10);
        } else {
            r10.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addZoomInZoomOutItemOptions(ItemOptions itemOptions) {
        int itemsCount = itemOptions.getItemsCount();
        itemOptions.add(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$addZoomInZoomOutItemOptions$77(r2);
            }
        });
        itemOptions.add(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$addZoomInZoomOutItemOptions$78(r2);
            }
        });
        final View[] viewArr = {itemOptions.getItemAt(itemsCount), itemOptions.getItemAt(itemsCount + 1)};
        if (!canZoomIn()) {
            viewArr[0].setEnabled(false);
            viewArr[0].setAlpha(0.5f);
        }
        if (canZoomOut()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addZoomInZoomOutItemOptions$77(View[] viewArr) {
        zoomIn(viewArr[0], viewArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addZoomInZoomOutItemOptions$78(View[] viewArr) {
        zoomOut(viewArr[0], viewArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStoryAlbumCreate(final StoriesController.StoryAlbum storyAlbum) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda77
            @Override // java.lang.Runnable
            public final void run() {
                SharedMediaLayout.this.lambda$onStoryAlbumCreate$79(storyAlbum);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStoryAlbumCreate$79(StoriesController.StoryAlbum storyAlbum) {
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null) {
            profileStoriesCollectionTabs.lambda$setInitialTabId$2(storyAlbum.album_id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoryAlbumData storyAlbums_getByAlbumId(int i) {
        StoryAlbumData storyAlbumData = (StoryAlbumData) this.storyAlbumsById.get(Integer.valueOf(i));
        if (storyAlbumData != null) {
            return storyAlbumData;
        }
        StoryAlbumData storyAlbumData2 = new StoryAlbumData(getContext(), i);
        this.storyAlbumsById.put(Integer.valueOf(i), storyAlbumData2);
        this.storyAlbumsByTabType.put(Integer.valueOf(storyAlbumData2.tabType), Integer.valueOf(storyAlbumData2.albumId));
        return storyAlbumData2;
    }

    public int storyAlbums_getAlbumIdByTabType(int i) {
        StoryAlbumData storyAlbums_getByTabType = storyAlbums_getByTabType(i);
        if (storyAlbums_getByTabType == null) {
            return -1;
        }
        return storyAlbums_getByTabType.albumId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoryAlbumData storyAlbums_getByTabType(int i) {
        Integer num = (Integer) this.storyAlbumsByTabType.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (StoryAlbumData) this.storyAlbumsById.get(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoriesAdapter storyAlbums_getStoriesAdapterByTabType(int i) {
        StoryAlbumData storyAlbums_getByTabType;
        if (i == 8) {
            return this.storiesAdapter;
        }
        if (i == 9) {
            return this.archivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbums_getByTabType.adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoriesAdapter storyAlbums_getStoriesSupportingAdapterByTabType(int i) {
        StoryAlbumData storyAlbums_getByTabType;
        if (i == 8) {
            return this.animationSupportingStoriesAdapter;
        }
        if (i == 9) {
            return this.animationSupportingArchivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbums_getByTabType.adapterSupport;
    }

    private int storyAlbums_getTabTypeByStoriesList(StoriesController.StoriesList storiesList) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesList == storiesAdapter.storiesList) {
            return 8;
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesList == storiesAdapter2.storiesList) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter.storiesList == storiesList) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int storyAlbums_getTabTypeByStoriesAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.storiesAdapter) {
            return 8;
        }
        if (adapter == this.archivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int storyAlbums_getTabTypeByStoriesSupportingAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.animationSupportingStoriesAdapter) {
            return 8;
        }
        if (adapter == this.animationSupportingArchivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapterSupport == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    private class StoryAlbumData {
        public final StoriesAdapter adapter;
        public final StoriesAdapter adapterSupport;
        public final int albumId;
        public final int tabType;

        private StoryAlbumData(Context context, int i) {
            this.albumId = i;
            this.tabType = SharedMediaLayout.getStoryAlbumType(SharedMediaLayout.access$14608(SharedMediaLayout.this));
            this.adapter = new StoriesAdapter(context, i, false) { // from class: org.telegram.ui.Components.SharedMediaLayout.StoryAlbumData.1
                {
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                }

                @Override // org.telegram.ui.Components.SharedMediaLayout.StoriesAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
                public void notifyDataSetChanged() {
                    super.notifyDataSetChanged();
                    StoryAlbumData storyAlbumData = StoryAlbumData.this;
                    MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(storyAlbumData.tabType);
                    if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                        StoryAlbumData.this.adapterSupport.notifyDataSetChanged();
                    }
                    if (mediaPage != null) {
                        StickerEmptyView stickerEmptyView = mediaPage.emptyView;
                        StoriesController.StoriesList storiesList = this.storiesList;
                        stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                    }
                }
            };
            this.adapterSupport = SharedMediaLayout.this.new StoriesAdapter(context, i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getStoriesController();
    }

    public static TLRPC.ProfileTab getTab(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i == 14) {
            return new TLRPC.TL_profileTabGifts();
        }
        if (i == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i != 5) {
            return null;
        }
        return new TLRPC.TL_profileTabGifs();
    }

    public static String getTabName(int i) {
        if (i == 8) {
            return LocaleController.getString(R.string.ProfileStories);
        }
        if (i == 14) {
            return LocaleController.getString(R.string.ProfileGifts);
        }
        if (i == 0) {
            return LocaleController.getString(R.string.SharedMediaTabFull2);
        }
        if (i == 1) {
            return LocaleController.getString(R.string.SharedFilesTab2);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.SharedVoiceTab2);
        }
        if (i == 3) {
            return LocaleController.getString(R.string.SharedLinksTab2);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.SharedMusicTab2);
        }
        if (i != 5) {
            return null;
        }
        return LocaleController.getString(R.string.SharedGIFsTab2);
    }

    public static int getTabId(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    public void sendTabsOrder() {
        if (this.profileActivity == null || this.scrollSlidingTextTabStrip == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.scrollSlidingTextTabStrip.getTabIds().iterator();
        while (it.hasNext()) {
            TLRPC.ProfileTab tab = getTab(it.next().intValue(), this.info instanceof TLRPC.TL_channelFull);
            if (tab != null) {
                arrayList.add(tab);
            }
        }
    }

    public void initBlurCapture(ViewGroup viewGroup) {
        for (MediaPage mediaPage : this.mediaPages) {
            InternalListView internalListView = mediaPage.listView;
            final InternalListView internalListView2 = mediaPage.listView;
            Objects.requireNonNull(internalListView2);
            mediaPage.iBlur3Capture = new ViewGroupPartRenderer(internalListView, viewGroup, new ViewGroupPartRenderer.DrawChildMethod() { // from class: org.telegram.ui.Components.SharedMediaLayout$$ExternalSyntheticLambda6
                @Override // org.telegram.ui.Components.blur3.ViewGroupPartRenderer.DrawChildMethod
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    return SharedMediaLayout.InternalListView.this.drawChild(canvas, view, j);
                }
            });
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.initBlurCapture(viewGroup);
        }
    }
}
