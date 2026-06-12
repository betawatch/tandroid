package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import j$.util.Objects;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnchorSpan;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SmoothScroller;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.TableLayout;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.TextPaintMarkSpan;
import org.telegram.ui.Components.TextPaintSpan;
import org.telegram.ui.Components.TextPaintUrlSpan;
import org.telegram.ui.Components.TextPaintWebpageUrlSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.MultiLayoutTypingAnimator;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebActionBar;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* loaded from: classes4.dex */
public class ArticleViewer extends IArticleViewer implements NotificationCenter.NotificationCenterDelegate {
    private static TextPaint channelNamePaint;
    private static TextPaint channelNamePhotoPaint;
    public static TLRPC.WebPage debugCopiedRichMessageWebPage;
    private static Paint dividerPaint;
    private static Paint dotsPaint;
    private static TextPaint embedPostAuthorPaint;
    private static TextPaint embedPostDatePaint;
    private static TextPaint listTextNumPaint;
    private static TextPaint listTextPointerPaint;
    private static Paint photoBackgroundPaint;
    private static Paint preformattedBackgroundPaint;
    private static Paint quoteLinePaint;
    private static TextPaint relatedArticleHeaderPaint;
    private static TextPaint relatedArticleTextPaint;
    public static Paint tableHalfLinePaint;
    public static Paint tableHeaderPaint;
    public static Paint tableLinePaint;
    public static Paint tableStripPaint;
    private static Paint urlPaint;
    private static Paint webpageMarkPaint;
    private static Paint webpageSearchPaint;
    private static Paint webpageUrlPaint;
    private final String BOTTOM_SHEET_VIEW_TAG;
    private WebActionBar actionBar;
    private WindowVisibilityManager.Controller activityVisibilityController;
    private AddressBarList addressBarList;
    private int anchorsOffsetMeasuredWidth;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private boolean attachedToWindow;
    private Paint backgroundPaint;
    private FrameLayout bulletinContainer;
    private boolean checkingForLongPress;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private ArrayList createdWebViews;
    private int currentAccount;
    private int currentHeaderHeight;
    private WebPlayerView currentPlayingVideo;
    private View customView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private TextView deleteView;
    private FontCell[] fontCells;
    private AspectRatioFrameLayout fullscreenAspectRatioView;
    private TextureView fullscreenTextureView;
    private FrameLayout fullscreenVideoContainer;
    private WebPlayerView fullscreenedVideo;
    private boolean hasCutout;
    private Paint headerPaint;
    private Paint headerProgressPaint;
    private DecelerateInterpolator interpolator;
    public final boolean isSheet;
    private boolean isVisible;
    private boolean keyboardVisible;
    private int lastBlockNum;
    private Object lastInsets;
    private int lastReqId;
    private int lastSearchIndex;
    private Drawable layerShadowDrawable;
    private Runnable lineProgressTickRunnable;
    private Browser.Progress loadingProgress;
    private Paint navigationBarPaint;
    private final AnimationNotificationsLocker notificationsLocker;
    private int openUrlReqId;
    private final AnimatedColor page0Background;
    private final AnimatedColor page1Background;
    private AnimatorSet pageSwitchAnimation;
    public PageLayout[] pages;
    public final ArrayList pagesStack;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private int pressCount;
    private int previewsReqId;
    private ContextProgressView progressView;
    private AnimatorSet progressViewAnimation;
    private AnimatorSet runAfterKeyboardClose;
    private Paint scrimPaint;
    private AnimatedTextView searchCountText;
    private ImageView searchDownButton;
    private FrameLayout searchPanel;
    private float searchPanelAlpha;
    private ValueAnimator searchPanelAnimator;
    private float searchPanelTranslation;
    private Runnable searchRunnable;
    private ImageView searchUpButton;
    public final Sheet sheet;
    private boolean showRestrictedToastOnResume;
    private Drawable slideDotBigDrawable;
    private Drawable slideDotDrawable;
    private Paint statusBarPaint;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private long transitionAnimationStartTime;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static HashSet activeSheets = new HashSet();
    private static volatile ArticleViewer Instance = null;
    public static final Property ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty("innerTranslationX") { // from class: org.telegram.ui.ArticleViewer.2
        @Override // org.telegram.ui.Components.AnimationProperties.FloatProperty
        public void setValue(WindowView windowView, float f) {
            windowView.setInnerTranslationX(f);
        }

        @Override // android.util.Property
        public Float get(WindowView windowView) {
            return Float.valueOf(windowView.getInnerTranslationX());
        }
    };
    private static final TextPaint audioTimePaint = new TextPaint(1);
    private static final Resources resources = new Resources(false);
    private static final WeakHashMap liveDrawingTexts = new WeakHashMap();

    public static class TL_pageBlockListItem extends TL_iv.PageBlock {
        public TL_iv.PageBlock blockItem;
        public boolean checked;
        public int index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        public boolean isCheckbox;
        public String num;
        public DrawingText numLayout;
        public TL_pageBlockListParent parent;
        public TL_iv.RichText textItem;
    }

    public static class TL_pageBlockListParent extends TL_iv.PageBlock {
        public ArrayList items = new ArrayList();
        public int lastFontSize;
        public int lastMaxNumCalcWidth;
        public int level;
        public int maxNumWidth;
        public TL_iv.pageBlockList pageBlockList;
    }

    public static class TL_pageBlockOrderedListItem extends TL_iv.PageBlock {
        public TL_iv.PageBlock blockItem;
        public boolean checked;
        public int index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        public boolean isCheckbox;
        public String num;
        public DrawingText numLayout;
        public TL_pageBlockOrderedListParent parent;
        public TL_iv.RichText textItem;
    }

    public static class TL_pageBlockOrderedListParent extends TL_iv.PageBlock {
        public ArrayList items = new ArrayList();
        public int lastFontSize;
        public int lastMaxNumCalcWidth;
        public int level;
        public int maxNumWidth;
        public TL_iv.pageBlockOrderedList pageBlockOrderedList;
    }

    public static class TL_pageBlockRelatedArticlesChild extends TL_iv.PageBlock {
        public int num;
        public TL_iv.pageBlockRelatedArticles parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setParentActivity$41(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.IArticleViewer
    public Theme.ResourcesProvider getResourcesProvider() {
        return null;
    }

    static /* synthetic */ int access$1504(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    static /* synthetic */ int access$9208(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    public ArticleViewer() {
        this.createdWebViews = new ArrayList();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$new$67();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$new$68();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = false;
        this.sheet = null;
    }

    public ArticleViewer(BaseFragment baseFragment) {
        this.createdWebViews = new ArrayList();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$new$67();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$new$68();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = true;
        this.sheet = new Sheet(baseFragment);
        setParentActivity(baseFragment.getParentActivity(), baseFragment);
    }

    @Override // org.telegram.ui.IArticleViewer
    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public boolean isLastArticle() {
        if (this.pagesStack.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.pagesStack;
        Object obj = arrayList.get(arrayList.size() - 1);
        if (!(obj instanceof TLRPC.WebPage)) {
            return false;
        }
        TL_iv.Page page = ((TLRPC.WebPage) obj).cached_page;
        return page == null || page.local == null;
    }

    public static ArticleViewer getInstance() {
        ArticleViewer articleViewer = Instance;
        if (articleViewer == null) {
            synchronized (ArticleViewer.class) {
                try {
                    articleViewer = Instance;
                    if (articleViewer == null) {
                        articleViewer = new ArticleViewer();
                        Instance = articleViewer;
                    }
                } finally {
                }
            }
        }
        return articleViewer;
    }

    public static ArticleViewer makeSheet(BaseFragment baseFragment) {
        return new ArticleViewer(baseFragment);
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    private static class TL_pageBlockRelatedArticlesShadow extends TL_iv.PageBlock {
        private TL_iv.pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesShadow() {
        }
    }

    private static class TL_pageBlockDetailsChild extends TL_iv.PageBlock {
        private TL_iv.PageBlock block;
        private TL_iv.PageBlock parent;

        private TL_pageBlockDetailsChild() {
        }
    }

    private static class TL_pageBlockEmbedPostCaption extends TL_iv.pageBlockEmbedPost {
        private TL_iv.pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

    public static class DrawingText implements TextSelectionHelper.TextLayoutBlock, MultiLayoutTypingAnimator.Block, TableLayout.CellText {
        private CharSequence accessibilityText;
        public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
        private boolean attached;
        private View attachedToView;
        private boolean isDrawing;
        private View latestParentView;
        public LinkPath markPath;
        private final IArticleViewer parent;
        public TL_iv.PageBlock parentBlock;
        public Object parentText;
        public CharSequence prefix;
        public int row;
        public LinkPath searchPath;
        public List spoilers;
        public AtomicReference spoilersPatchedLayout;
        public Stack spoilersPool;
        public StaticLayout textLayout;
        public LinkPath textPath;
        public MultiLayoutTypingAnimator typingAnimator;
        public int x;
        public int y;
        public int searchIndex = -1;
        private int boundLeft = -1;
        private int boundRight = -1;
        private int lastLineBoundRight = -1;
        public int emojiCacheType = 0;

        public DrawingText(IArticleViewer iArticleViewer) {
            this.parent = iArticleViewer;
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void attach(View view) {
            this.attachedToView = view;
            this.attached = true;
            StaticLayout staticLayout = this.textLayout;
            if (staticLayout != null) {
                this.animatedEmojiStack = AnimatedEmojiSpan.update(this.emojiCacheType, view, false, this.animatedEmojiStack, staticLayout);
            }
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void detach(View view) {
            this.attached = false;
            if (view == null) {
                view = this.attachedToView;
            }
            AnimatedEmojiSpan.release(view, this.animatedEmojiStack);
            this.attachedToView = null;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public Layout getLayout() {
            return this.textLayout;
        }

        @Override // org.telegram.ui.MultiLayoutTypingAnimator.Block
        public View getParentView() {
            View view = this.attachedToView;
            return view != null ? view : this.latestParentView;
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void draw(Canvas canvas, View view) {
            float width;
            this.isDrawing = true;
            this.latestParentView = view;
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.typingAnimator;
            boolean z = multiLayoutTypingAnimator != null && multiLayoutTypingAnimator.isRunning() && this.typingAnimator.indexOf(this) >= 0;
            if (z && !this.typingAnimator.needDraw(this)) {
                this.isDrawing = false;
                return;
            }
            float f = 0.0f;
            if (!this.parent.searchResults.isEmpty()) {
                IArticleViewer iArticleViewer = this.parent;
                SearchResult searchResult = (SearchResult) iArticleViewer.searchResults.get(iArticleViewer.currentSearchIndex);
                if (searchResult.block != this.parentBlock || (searchResult.text != this.parentText && (!(searchResult.text instanceof String) || this.parentText != null))) {
                    this.searchIndex = -1;
                    this.searchPath = null;
                } else if (this.searchIndex != searchResult.index) {
                    LinkPath linkPath = new LinkPath(true);
                    this.searchPath = linkPath;
                    linkPath.setAllowReset(false);
                    this.searchPath.setCurrentLayout(this.textLayout, searchResult.index, 0.0f);
                    this.searchPath.setBaselineShift(0);
                    this.textLayout.getSelectionPath(searchResult.index, searchResult.index + this.parent.searchText.length(), this.searchPath);
                    this.searchPath.setAllowReset(true);
                }
            } else {
                this.searchIndex = -1;
                this.searchPath = null;
            }
            LinkPath linkPath2 = this.searchPath;
            if (linkPath2 != null) {
                canvas.drawPath(linkPath2, ArticleViewer.webpageSearchPaint);
            }
            LinkPath linkPath3 = this.textPath;
            if (linkPath3 != null) {
                canvas.drawPath(linkPath3, ArticleViewer.webpageUrlPaint);
            }
            LinkPath linkPath4 = this.markPath;
            if (linkPath4 != null) {
                canvas.drawPath(linkPath4, ArticleViewer.webpageMarkPaint);
            }
            if (this.parent.links.draw(canvas, this)) {
                view.invalidate();
            }
            IArticleViewer iArticleViewer2 = this.parent;
            if (iArticleViewer2.pressedLinkOwnerLayout == this && iArticleViewer2.pressedLink == null && iArticleViewer2.drawBlockSelection) {
                if (getLineCount() == 1) {
                    width = getLineWidth(0);
                    f = getLineLeft(0);
                } else {
                    width = getWidth();
                }
                canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f, 0.0f, f + width + AndroidUtilities.dp(2.0f), getHeight(), ArticleViewer.urlPaint);
            }
            if (z && this.typingAnimator.isFadeBlock(this)) {
                MultiLayoutTypingAnimator.drawLayoutWithLastLineFade(canvas, this.textLayout, this.typingAnimator.getFadeLineIndex(this), this.typingAnimator.getFadeXPosition(this));
            } else {
                List list = this.spoilers;
                if (list != null && !list.isEmpty()) {
                    SpoilerEffect.renderWithRipple(view, false, this.textLayout.getPaint().getColor(), 0, this.spoilersPatchedLayout, 0, this.textLayout, this.spoilers, canvas, false);
                } else {
                    this.textLayout.draw(canvas);
                }
            }
            this.isDrawing = false;
        }

        public void invalidateParent() {
            View view;
            if (this.isDrawing || (view = this.latestParentView) == null) {
                return;
            }
            view.invalidate();
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public CharSequence getText() {
            return this.textLayout.getText();
        }

        public int getLineCount() {
            return this.textLayout.getLineCount();
        }

        public int getLineAscent(int i) {
            return this.textLayout.getLineAscent(i);
        }

        public float getLineLeft(int i) {
            return this.textLayout.getLineLeft(i);
        }

        public float getLineWidth(int i) {
            return this.textLayout.getLineWidth(i);
        }

        public int getBoundLeft() {
            int i = this.boundLeft;
            if (i != -1) {
                return i;
            }
            this.boundLeft = this.textLayout.getWidth();
            for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
                this.boundLeft = Math.min(this.boundLeft, (int) this.textLayout.getLineLeft(i2));
            }
            return this.boundLeft;
        }

        public int getBoundRight() {
            int i = this.boundRight;
            if (i != -1) {
                return i;
            }
            this.boundRight = 0;
            for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
                this.boundRight = Math.max(this.boundRight, (int) this.textLayout.getLineRight(i2));
            }
            return this.boundRight;
        }

        public int getLastLineBoundRight() {
            int i = this.lastLineBoundRight;
            if (i != -1) {
                return i;
            }
            this.lastLineBoundRight = 0;
            if (this.textLayout.getLineCount() > 0) {
                this.lastLineBoundRight = Math.max(this.lastLineBoundRight, (int) this.textLayout.getLineRight(r1.getLineCount() - 1));
            }
            return this.lastLineBoundRight;
        }

        public int getHeight() {
            return this.textLayout.getHeight();
        }

        public int getWidth() {
            return this.textLayout.getWidth();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public int getX() {
            return this.x;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public int getY() {
            return this.y;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public int getRow() {
            return this.row;
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void setX(int i) {
            this.x = i;
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void setY(int i) {
            this.y = i;
        }

        @Override // org.telegram.ui.Components.TableLayout.CellText
        public void setRow(int i) {
            this.row = i;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public CharSequence getPrefix() {
            return this.prefix;
        }
    }

    public static CharSequence buildAccessibilityText(final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter, DrawingText drawingText) {
        if (drawingText == null || drawingText.textLayout == null) {
            return null;
        }
        if (drawingText.accessibilityText != null) {
            return drawingText.accessibilityText;
        }
        CharSequence text = drawingText.textLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(0, spannable.length(), TextPaintUrlSpan.class);
        CharSequence charSequence = text;
        if (textPaintUrlSpanArr != null) {
            charSequence = text;
            if (textPaintUrlSpanArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                for (final TextPaintUrlSpan textPaintUrlSpan : textPaintUrlSpanArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(textPaintUrlSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(textPaintUrlSpan);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.ArticleViewer.1
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View view) {
                                IArticleViewer.this.handleLinkClick(webpageAdapter, textPaintUrlSpan);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                }
                drawingText.accessibilityText = spannableStringBuilder;
                charSequence = spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override // org.telegram.ui.IArticleViewer
    public void handleLinkClick(WebpageAdapter webpageAdapter, TextPaintUrlSpan textPaintUrlSpan) {
        String url;
        String str;
        if (textPaintUrlSpan == null || (url = textPaintUrlSpan.getUrl()) == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.dismiss();
            this.linkSheet = null;
        }
        int lastIndexOf = url.lastIndexOf(35);
        boolean z = false;
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(webpageAdapter.currentPage.cached_page.url) ? webpageAdapter.currentPage.cached_page.url.toLowerCase() : webpageAdapter.currentPage.url.toLowerCase();
            try {
                str = URLDecoder.decode(url.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str = "";
            }
            if (lastIndexOf == 0 || url.toLowerCase().contains(lowerCase)) {
                z = true;
                scrollToAnchor(str, true);
            }
        } else {
            str = null;
        }
        if (z) {
            return;
        }
        DrawingText drawingText = this.pressedLinkOwnerLayout;
        openWebpageUrl(url, str, drawingText != null ? makeProgress(this.pressedLink, drawingText) : null);
    }

    public static CharSequence appendA11yLabel(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i));
        return spannableStringBuilder;
    }

    private class TextSizeCell extends FrameLayout {
        private int endFontSize;
        private int lastWidth;
        private SeekBarView sizeBar;
        private int startFontSize;
        private TextPaint textPaint;

        public TextSizeCell(Context context) {
            super(context);
            this.startFontSize = 12;
            this.endFontSize = 30;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context, ArticleViewer.this.getResourcesProvider());
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setSeparatorsCount((this.endFontSize - this.startFontSize) + 1);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate() { // from class: org.telegram.ui.ArticleViewer.TextSizeCell.1
                @Override // org.telegram.ui.Components.SeekBarView.SeekBarViewDelegate
                public /* synthetic */ boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.-CC.$default$needVisuallyDivideSteps(this);
                }

                @Override // org.telegram.ui.Components.SeekBarView.SeekBarViewDelegate
                public void onSeekBarPressed(boolean z) {
                }

                @Override // org.telegram.ui.Components.SeekBarView.SeekBarViewDelegate
                public void onSeekBarDrag(boolean z, float f) {
                    int round = Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * f));
                    if (round != SharedConfig.ivFontSize) {
                        SharedConfig.ivFontSize = round;
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                        edit.commit();
                        ArticleViewer.this.pages[0].getAdapter().searchTextOffset.clear();
                        ArticleViewer.this.updatePaintSize();
                        TextSizeCell.this.invalidate();
                    }
                }

                @Override // org.telegram.ui.Components.SeekBarView.SeekBarViewDelegate
                public CharSequence getContentDescription() {
                    return String.valueOf(Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * TextSizeCell.this.sizeBar.getProgress())));
                }

                @Override // org.telegram.ui.Components.SeekBarView.SeekBarViewDelegate
                public int getStepsCount() {
                    return TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize;
                }
            });
            addView(this.sizeBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            this.textPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhiteValueText));
            canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), this.textPaint);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int size = View.MeasureSpec.getSize(i);
            if (this.lastWidth != size) {
                SeekBarView seekBarView = this.sizeBar;
                int i3 = SharedConfig.ivFontSize;
                int i4 = this.startFontSize;
                seekBarView.setProgress((i3 - i4) / (this.endFontSize - i4));
                this.lastWidth = size;
            }
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            this.sizeBar.invalidate();
        }
    }

    public class FontCell extends FrameLayout {
        private RadioButton radioButton;
        private TextView textView;

        public FontCell(Context context) {
            super(context);
            setBackgroundDrawable(Theme.createSelectorDrawable(ArticleViewer.this.getThemedColor(Theme.key_listSelector), 2));
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            this.radioButton.setColor(ArticleViewer.this.getThemedColor(Theme.key_dialogRadioBackground), ArticleViewer.this.getThemedColor(Theme.key_dialogRadioBackgroundChecked));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 22, 13.0f, z ? 22 : 0, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 17 : 62, 0.0f, z2 ? 62 : 17, 0.0f));
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
        }

        public void select(boolean z, boolean z2) {
            this.radioButton.setChecked(z, z2);
        }

        public void setTextAndTypeface(String str, Typeface typeface) {
            this.textView.setText(str);
            this.textView.setTypeface(typeface);
            setContentDescription(str);
            invalidate();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setChecked(this.radioButton.isChecked());
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    private final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ArticleViewer.this.pendingCheckForLongPress == null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pendingCheckForLongPress = articleViewer.new CheckForLongPress();
            }
            ArticleViewer.this.pendingCheckForLongPress.currentPressCount = ArticleViewer.access$1504(ArticleViewer.this);
            if (ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.postDelayed(ArticleViewer.this.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
            }
        }
    }

    private class WindowView extends FrameLayout {
        private float alpha;
        private int bHeight;
        private int bWidth;
        private int bX;
        private int bY;
        private final Paint blackPaint;
        private float innerTranslationX;
        private boolean lastWebviewAllowedScroll;
        private boolean maybeStartTracking;
        private boolean movingPage;
        private boolean openingPage;
        private int startMovingHeaderHeight;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker tracker;

        public WindowView(Context context) {
            super(context);
            this.blackPaint = new Paint();
            this.alpha = 1.0f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            r0 = r0.getBoundingRects();
         */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            List boundingRects;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.sheet != null) {
                return super.dispatchApplyWindowInsets(windowInsets);
            }
            WindowInsets windowInsets2 = (WindowInsets) articleViewer.lastInsets;
            ArticleViewer.this.lastInsets = windowInsets;
            if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 28 && ArticleViewer.this.parentActivity != null) {
                rootWindowInsets = ArticleViewer.this.parentActivity.getWindow().getDecorView().getRootWindowInsets();
                displayCutout = rootWindowInsets.getDisplayCutout();
                if (displayCutout != null && boundingRects != null && !boundingRects.isEmpty()) {
                    ArticleViewer.this.hasCutout = ((Rect) boundingRects.get(0)).height() != 0;
                }
            }
            return super.dispatchApplyWindowInsets(windowInsets);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (ArticleViewer.this.lastInsets != null) {
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                if (AndroidUtilities.incorrectDisplaySizeFix) {
                    int i3 = AndroidUtilities.displaySize.y;
                    if (size2 > i3) {
                        size2 = i3;
                    }
                    size2 += AndroidUtilities.statusBarHeight;
                }
                int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
                size -= windowInsets.getSystemWindowInsetRight() + windowInsets.getSystemWindowInsetLeft();
                if (windowInsets.getSystemWindowInsetRight() != 0) {
                    this.bWidth = windowInsets.getSystemWindowInsetRight();
                    this.bHeight = systemWindowInsetBottom;
                } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                    this.bWidth = windowInsets.getSystemWindowInsetLeft();
                    this.bHeight = systemWindowInsetBottom;
                } else {
                    this.bWidth = size;
                    this.bHeight = windowInsets.getStableInsetBottom();
                }
                size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
            } else {
                setMeasuredDimension(size, size2);
            }
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.sheet == null) {
                articleViewer.keyboardVisible = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
            }
            ArticleViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            ArticleViewer.this.fullscreenVideoContainer.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            PageLayout pageLayout;
            ArrayList arrayList;
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayMode()) {
                motionEvent.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
                return ArticleViewer.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            TextSelectionHelper.TextSelectionOverlay overlayView = ArticleViewer.this.textSelectionHelper.getOverlayView(getContext());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
            if (ArticleViewer.this.textSelectionHelper.isInSelectionMode() && ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                return true;
            }
            if (overlayView.checkOnTap(motionEvent)) {
                PageLayout[] pageLayoutArr = ArticleViewer.this.pages;
                if (pageLayoutArr != null && (pageLayout = pageLayoutArr[0]) != null && pageLayout.isWeb() && (arrayList = ArticleViewer.this.pagesStack) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && ArticleViewer.this.textSelectionHelper.isInSelectionMode() && (motionEvent.getY() < ArticleViewer.this.containerView.getTop() || motionEvent.getY() > ArticleViewer.this.containerView.getBottom())) {
                if (ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            ArticleViewer articleViewer;
            int i6 = i3 - i;
            int i7 = 0;
            if (ArticleViewer.this.anchorsOffsetMeasuredWidth != i6) {
                int i8 = 0;
                while (true) {
                    articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    if (i8 >= pageLayoutArr.length) {
                        break;
                    }
                    Iterator it = pageLayoutArr[i8].adapter.anchorsOffset.entrySet().iterator();
                    while (it.hasNext()) {
                        ((Map.Entry) it.next()).setValue(-1);
                    }
                    i8++;
                }
                articleViewer.anchorsOffsetMeasuredWidth = i6;
            }
            if (ArticleViewer.this.lastInsets != null) {
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                if (windowInsets.getSystemWindowInsetRight() != 0) {
                    this.bX = i6 - this.bWidth;
                    this.bY = 0;
                } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                    this.bX = 0;
                    this.bY = 0;
                } else {
                    this.bX = 0;
                    this.bY = (i4 - i2) - this.bHeight;
                }
                i5 = windowInsets.getSystemWindowInsetTop();
                i7 = systemWindowInsetLeft;
            } else {
                i5 = 0;
            }
            ArticleViewer.this.containerView.layout(i7, i5, ArticleViewer.this.containerView.getMeasuredWidth() + i7, ArticleViewer.this.containerView.getMeasuredHeight() + i5);
            ArticleViewer.this.fullscreenVideoContainer.layout(i7, i5, ArticleViewer.this.fullscreenVideoContainer.getMeasuredWidth() + i7, ArticleViewer.this.fullscreenVideoContainer.getMeasuredHeight() + i5);
            if (ArticleViewer.this.runAfterKeyboardClose != null) {
                ArticleViewer.this.runAfterKeyboardClose.start();
                ArticleViewer.this.runAfterKeyboardClose = null;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ArticleViewer.this.attachedToWindow = true;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ArticleViewer.this.attachedToWindow = false;
            VideoPlayerHolderBase videoPlayerHolderBase = ArticleViewer.this.videoPlayer;
            if (videoPlayerHolderBase != null) {
                videoPlayerHolderBase.release(null);
                ArticleViewer.this.videoPlayer = null;
            }
            ArticleViewer.this.currentPlayer = null;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
            handleTouchEvent(null);
            super.requestDisallowInterceptTouchEvent(z);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return !ArticleViewer.this.collapsed && (handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent));
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !ArticleViewer.this.collapsed && (handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent));
        }

        public void setInnerTranslationX(float f) {
            this.innerTranslationX = f;
            if (ArticleViewer.this.activityVisibilityController != null) {
                ArticleViewer.this.activityVisibilityController.setHidden(ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f);
            }
            invalidate();
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int measuredWidth = getMeasuredWidth();
            int i = (int) this.innerTranslationX;
            int save = canvas.save();
            canvas.clipRect(i, 0, measuredWidth, getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            if (i != 0 && view == ArticleViewer.this.containerView) {
                float f = measuredWidth - i;
                float min = Math.min(0.8f, f / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                ArticleViewer.this.scrimPaint.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                float max = Math.max(0.0f, Math.min(f / AndroidUtilities.dp(20.0f), 1.0f));
                ArticleViewer.this.layerShadowDrawable.setBounds(i - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), i, view.getBottom());
                ArticleViewer.this.layerShadowDrawable.setAlpha((int) (max * 255.0f));
                ArticleViewer.this.layerShadowDrawable.draw(canvas);
            }
            return drawChild;
        }

        public float getInnerTranslationX() {
            return this.innerTranslationX;
        }

        private void prepareForMoving(MotionEvent motionEvent) {
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            if (ArticleViewer.this.pagesStack.size() > 1 && (ArticleViewer.this.actionBar == null || (!ArticleViewer.this.actionBar.isSearching() && !ArticleViewer.this.actionBar.isAddressing()))) {
                this.movingPage = true;
                this.startMovingHeaderHeight = ArticleViewer.this.currentHeaderHeight;
                ArticleViewer.this.pages[1].setVisibility(0);
                ArticleViewer.this.pages[1].setAlpha(1.0f);
                ArticleViewer.this.pages[1].setTranslationX(0.0f);
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pages[0].setBackgroundColor(articleViewer.sheet == null ? 0 : articleViewer.backgroundPaint.getColor());
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.updateInterfaceForCurrentPage(articleViewer2.pagesStack.get(r2.size() - 2), true, -1);
                if (ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]) < ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[1])) {
                    int indexOfChild = ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]);
                    ArticleViewer.this.containerView.removeView(ArticleViewer.this.pages[1]);
                    ArticleViewer.this.containerView.addView(ArticleViewer.this.pages[1], indexOfChild);
                }
            } else {
                this.movingPage = false;
            }
            ArticleViewer.this.cancelCheckLongPress();
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) {
            Sheet sheet;
            PageLayout pageLayout;
            if (ArticleViewer.this.pageSwitchAnimation != null || ArticleViewer.this.closeAnimationInProgress || ArticleViewer.this.fullscreenVideoContainer.getVisibility() == 0 || ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                return false;
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking) {
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.tracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                this.tracker.addMovement(motionEvent);
                PageLayout pageLayout2 = ArticleViewer.this.pages[0];
                this.lastWebviewAllowedScroll = pageLayout2 == null || !pageLayout2.isWeb() || (ArticleViewer.this.pages[0].swipeContainer.allowingScroll(true) && !ArticleViewer.this.pages[0].swipeContainer.isScrolling);
                Sheet sheet2 = ArticleViewer.this.sheet;
                if ((sheet2 == null || !sheet2.nestedVerticalScroll) && this.maybeStartTracking && !this.startedTracking && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.lastWebviewAllowedScroll) {
                    prepareForMoving(motionEvent);
                } else if (this.startedTracking) {
                    ArticleViewer articleViewer = ArticleViewer.this;
                    articleViewer.pressedLinkOwnerLayout = null;
                    articleViewer.pressedLinkOwnerView = null;
                    if (this.movingPage && (pageLayout = articleViewer.pages[0]) != null) {
                        pageLayout.setTranslationX(max);
                    } else {
                        Sheet sheet3 = articleViewer.sheet;
                        if (sheet3 == null) {
                            float f = max;
                            articleViewer.containerView.setTranslationX(f);
                            setInnerTranslationX(f);
                        } else {
                            sheet3.setBackProgress(max / getWidth());
                        }
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                this.tracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                float xVelocity = this.tracker.getXVelocity();
                float yVelocity = this.tracker.getYVelocity();
                Sheet sheet4 = ArticleViewer.this.sheet;
                if ((sheet4 == null || !sheet4.nestedVerticalScroll) && !this.startedTracking && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    prepareForMoving(motionEvent);
                }
                if (this.startedTracking) {
                    FrameLayout frameLayout = this.movingPage ? ArticleViewer.this.pages[0] : ArticleViewer.this.containerView;
                    float x = (this.movingPage || (sheet = ArticleViewer.this.sheet) == null) ? frameLayout.getX() : sheet.getBackProgress() * ArticleViewer.this.sheet.windowView.getWidth();
                    final boolean z = (x < ((float) frameLayout.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.lastWebviewAllowedScroll;
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z) {
                        x = frameLayout.getMeasuredWidth() - x;
                        if (this.movingPage) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()));
                        } else {
                            ArticleViewer articleViewer2 = ArticleViewer.this;
                            Sheet sheet5 = articleViewer2.sheet;
                            if (sheet5 != null) {
                                animatorSet.playTogether(sheet5.animateBackProgressTo(1.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer2.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this, (Property<WindowView, Float>) ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
                            }
                        }
                    } else if (this.movingPage) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, 0.0f));
                    } else {
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        Sheet sheet6 = articleViewer3.sheet;
                        if (sheet6 != null) {
                            animatorSet.playTogether(sheet6.animateBackProgressTo(0.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer3.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<WindowView, Float>) ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                        }
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * x), 250));
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.WindowView.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (WindowView.this.movingPage) {
                                Object obj = null;
                                ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                                if (!z) {
                                    ArticleViewer articleViewer4 = ArticleViewer.this;
                                    PageLayout[] pageLayoutArr = articleViewer4.pages;
                                    PageLayout pageLayout3 = pageLayoutArr[1];
                                    pageLayoutArr[1] = pageLayoutArr[0];
                                    pageLayoutArr[0] = pageLayout3;
                                    articleViewer4.actionBar.swap();
                                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                                    Sheet sheet7 = ArticleViewer.this.sheet;
                                    if (sheet7 != null) {
                                        sheet7.updateLastVisible();
                                    }
                                    ArrayList arrayList = ArticleViewer.this.pagesStack;
                                    obj = arrayList.remove(arrayList.size() - 1);
                                    ArticleViewer articleViewer5 = ArticleViewer.this;
                                    articleViewer5.textSelectionHelper.setParentView(articleViewer5.pages[0].listView);
                                    ArticleViewer articleViewer6 = ArticleViewer.this;
                                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer6.textSelectionHelper;
                                    articleTextSelectionHelper.layoutManager = articleViewer6.pages[0].layoutManager;
                                    articleTextSelectionHelper.clear(true);
                                    ArticleViewer.this.updateTitle(false);
                                    ArticleViewer.this.updatePages();
                                }
                                ArticleViewer.this.pages[1].cleanup();
                                ArticleViewer.this.pages[1].setVisibility(8);
                                if (obj instanceof CachedWeb) {
                                    ((CachedWeb) obj).destroy();
                                }
                                if (obj instanceof TLRPC.WebPage) {
                                    WebInstantView.recycle((TLRPC.WebPage) obj);
                                }
                            } else if (!z) {
                                ArticleViewer articleViewer7 = ArticleViewer.this;
                                Sheet sheet8 = articleViewer7.sheet;
                                if (sheet8 == null) {
                                    articleViewer7.saveCurrentPagePosition();
                                    ArticleViewer.this.onClosed();
                                } else {
                                    sheet8.release();
                                    ArticleViewer.this.destroy();
                                }
                            }
                            WindowView.this.movingPage = false;
                            WindowView.this.startedTracking = false;
                            ArticleViewer.this.closeAnimationInProgress = false;
                        }
                    });
                    animatorSet.start();
                    ArticleViewer.this.closeAnimationInProgress = true;
                } else {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    this.movingPage = false;
                }
                VelocityTracker velocityTracker2 = this.tracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.tracker = null;
                }
            } else if (motionEvent == null) {
                this.maybeStartTracking = false;
                this.startedTracking = false;
                this.movingPage = false;
                VelocityTracker velocityTracker3 = this.tracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.tracker = null;
                }
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
                if (articleTextSelectionHelper != null && !articleTextSelectionHelper.isInSelectionMode()) {
                    ArticleViewer.this.textSelectionHelper.clear();
                }
            }
            return this.startedTracking && this.lastWebviewAllowedScroll;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int i;
            super.dispatchDraw(canvas);
            if (ArticleViewer.this.lastInsets != null || this.bWidth == 0 || this.bHeight == 0) {
                return;
            }
            this.blackPaint.setAlpha((int) (ArticleViewer.this.windowView.getAlpha() * 255.0f));
            int i2 = this.bX;
            if (i2 == 0 && (i = this.bY) == 0) {
                canvas.drawRect(i2, i, i2 + this.bWidth, i + this.bHeight, this.blackPaint);
            } else {
                canvas.drawRect(i2 - getTranslationX(), this.bY, (this.bX + this.bWidth) - getTranslationX(), this.bY + this.bHeight, this.blackPaint);
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (ArticleViewer.this.sheet == null) {
                int measuredWidth = getMeasuredWidth();
                float f = measuredWidth;
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(this.innerTranslationX, 0.0f, f, measuredHeight, ArticleViewer.this.backgroundPaint);
                if (ArticleViewer.this.lastInsets != null) {
                    WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                    canvas.drawRect(this.innerTranslationX, 0.0f, f, windowInsets.getSystemWindowInsetTop(), ArticleViewer.this.statusBarPaint);
                    if (ArticleViewer.this.hasCutout) {
                        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                        if (systemWindowInsetLeft != 0) {
                            canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, ArticleViewer.this.statusBarPaint);
                        }
                        if (windowInsets.getSystemWindowInsetRight() != 0) {
                            canvas.drawRect(measuredWidth - r3, 0.0f, f, measuredHeight, ArticleViewer.this.statusBarPaint);
                        }
                    }
                    canvas.drawRect(0.0f, r1 - windowInsets.getStableInsetBottom(), f, measuredHeight, ArticleViewer.this.navigationBarPaint);
                }
            }
        }

        @Override // android.view.View
        public void setAlpha(float f) {
            int i = (int) (255.0f * f);
            ArticleViewer.this.backgroundPaint.setAlpha(i);
            ArticleViewer.this.statusBarPaint.setAlpha(i);
            this.alpha = f;
            if (ArticleViewer.this.activityVisibilityController != null) {
                ArticleViewer.this.activityVisibilityController.setHidden(ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f);
            }
            invalidate();
        }

        @Override // android.view.View
        public float getAlpha() {
            return this.alpha;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                if (ArticleViewer.this.actionBar.searchEditText.isFocused()) {
                    ArticleViewer.this.actionBar.searchEditText.clearFocus();
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.searchEditText);
                } else if (ArticleViewer.this.actionBar.addressEditText.isFocused()) {
                    ArticleViewer.this.actionBar.addressEditText.clearFocus();
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.addressEditText);
                } else if (ArticleViewer.this.keyboardVisible) {
                    AndroidUtilities.hideKeyboard(this);
                } else {
                    PageLayout pageLayout = ArticleViewer.this.pages[0];
                    if (pageLayout != null && pageLayout.isWeb() && ArticleViewer.this.pages[0].getWebView() != null && ArticleViewer.this.pages[0].getWebView().canGoBack()) {
                        ArticleViewer.this.pages[0].getWebView().goBack();
                    } else {
                        ArticleViewer.this.close(true, false);
                    }
                }
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArticleViewer articleViewer;
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
            if (!ArticleViewer.this.checkingForLongPress || ArticleViewer.this.windowView == null) {
                return;
            }
            ArticleViewer.this.checkingForLongPress = false;
            ArticleViewer articleViewer2 = ArticleViewer.this;
            if (articleViewer2.pressedLink != null) {
                try {
                    articleViewer2.windowView.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                ArticleViewer articleViewer3 = ArticleViewer.this;
                articleViewer3.showCopyPopup(((TextPaintUrlSpan) articleViewer3.pressedLink.getSpan()).getUrl());
                ArticleViewer articleViewer4 = ArticleViewer.this;
                articleViewer4.pressedLink = null;
                articleViewer4.pressedLinkOwnerLayout = null;
                View view = articleViewer4.pressedLinkOwnerView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            View view2 = articleViewer2.pressedLinkOwnerView;
            if (view2 != null && articleViewer2.textSelectionHelper.isSelectable(view2)) {
                if (ArticleViewer.this.pressedLinkOwnerView.getTag() != null && ArticleViewer.this.pressedLinkOwnerView.getTag() == "bottomSheet" && (articleTextSelectionHelper = (articleViewer = ArticleViewer.this).textSelectionHelperBottomSheet) != null) {
                    articleTextSelectionHelper.trySelect(articleViewer.pressedLinkOwnerView);
                } else {
                    ArticleViewer articleViewer5 = ArticleViewer.this;
                    articleViewer5.textSelectionHelper.trySelect(articleViewer5.pressedLinkOwnerView);
                }
                if (ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    try {
                        ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            }
            ArticleViewer articleViewer6 = ArticleViewer.this;
            if (articleViewer6.pressedLinkOwnerLayout == null || articleViewer6.pressedLinkOwnerView == null) {
                return;
            }
            try {
                articleViewer6.windowView.performHapticFeedback(0, 2);
            } catch (Exception unused3) {
            }
            int[] iArr = new int[2];
            ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
            int dp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.dp(54.0f);
            if (dp < 0) {
                dp = 0;
            }
            ArticleViewer.this.pressedLinkOwnerView.invalidate();
            ArticleViewer articleViewer7 = ArticleViewer.this;
            articleViewer7.drawBlockSelection = true;
            articleViewer7.showPopup(articleViewer7.pressedLinkOwnerView, 48, 0, dp);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(true);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(false);
        }
    }

    public static void createPaint(IArticleViewer iArticleViewer, boolean z) {
        if (quoteLinePaint == null) {
            quoteLinePaint = new Paint();
            preformattedBackgroundPaint = new Paint();
            Paint paint = new Paint(1);
            tableLinePaint = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            tableLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            tableHalfLinePaint = paint2;
            paint2.setStyle(style);
            tableHalfLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            tableHeaderPaint = new Paint();
            tableStripPaint = new Paint();
            urlPaint = new Paint();
            webpageUrlPaint = new Paint(1);
            webpageSearchPaint = new Paint(1);
            photoBackgroundPaint = new Paint();
            dividerPaint = new Paint();
            webpageMarkPaint = new Paint(1);
        } else if (!z) {
            return;
        }
        int themedColor = iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhite);
        webpageSearchPaint.setColor((((((float) Color.red(themedColor)) * 0.2126f) + (((float) Color.green(themedColor)) * 0.7152f)) + (((float) Color.blue(themedColor)) * 0.0722f)) / 255.0f <= 0.705f ? -3041234 : -6551);
        Paint paint3 = webpageUrlPaint;
        int i = Theme.key_windowBackgroundWhiteLinkSelection;
        paint3.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        webpageUrlPaint.setPathEffect(LinkPath.getRoundedEffect());
        urlPaint.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        urlPaint.setPathEffect(LinkPath.getRoundedEffect());
        Paint paint4 = tableHalfLinePaint;
        int i2 = Theme.key_windowBackgroundWhiteInputField;
        paint4.setColor(iArticleViewer.getThemedColor(i2));
        tableLinePaint.setColor(iArticleViewer.getThemedColor(i2));
        photoBackgroundPaint.setColor(251658240);
        dividerPaint.setColor(iArticleViewer.getThemedColor(Theme.key_divider));
        webpageMarkPaint.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        webpageMarkPaint.setPathEffect(LinkPath.getRoundedEffect());
        int themedColor2 = iArticleViewer.getThemedColor(Theme.key_switchTrack);
        int red = Color.red(themedColor2);
        int green = Color.green(themedColor2);
        int blue = Color.blue(themedColor2);
        tableStripPaint.setColor(Color.argb(20, red, green, blue));
        tableHeaderPaint.setColor(Color.argb(34, red, green, blue));
        int themedColor3 = iArticleViewer.getThemedColor(i);
        preformattedBackgroundPaint.setColor(Color.argb(20, Color.red(themedColor3), Color.green(themedColor3), Color.blue(themedColor3)));
        quoteLinePaint.setColor(iArticleViewer.getThemedColor(Theme.key_chat_inReplyLine));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCopyPopup(final String str) {
        String str2;
        if (this.parentActivity == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.dismiss();
            this.linkSheet = null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        builder.setTitle(str2);
        builder.setTitleMultipleLines(true);
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda24
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArticleViewer.this.lambda$showCopyPopup$0(str, dialogInterface, i);
            }
        });
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda25
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ArticleViewer.this.lambda$showCopyPopup$1(dialogInterface);
            }
        });
        showDialog(builder.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCopyPopup$0(String str, DialogInterface dialogInterface, int i) {
        String str2;
        if (this.parentActivity != null) {
            if (this.pages[0].adapter.currentPage == null) {
                return;
            }
            if (i != 0) {
                if (i != 1 || str == null) {
                    return;
                }
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
                return;
            }
            int lastIndexOf = str.lastIndexOf(35);
            if (lastIndexOf != -1) {
                String lowerCase = !TextUtils.isEmpty(this.pages[0].adapter.currentPage.cached_page.url) ? this.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : this.pages[0].adapter.currentPage.url.toLowerCase();
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (str.toLowerCase().contains(lowerCase)) {
                    if (TextUtils.isEmpty(str2)) {
                        LinearLayoutManager linearLayoutManager = this.pages[0].layoutManager;
                        Sheet sheet = this.sheet;
                        linearLayoutManager.scrollToPositionWithOffset((sheet == null || !sheet.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                        checkScrollAnimated();
                        return;
                    }
                    scrollToAnchor(str2, true);
                    return;
                }
            }
            Browser.openUrl(this.parentActivity, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCopyPopup$1(DialogInterface dialogInterface) {
        this.links.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPopup(View view, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.popupLayout.setBackgroundDrawable(this.parentActivity.getResources().getDrawable(R.drawable.menu_copy));
            this.popupLayout.setAnimationEnabled(false);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda57
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$showPopup$2;
                    lambda$showPopup$2 = ArticleViewer.this.lambda$showPopup$2(view2, motionEvent);
                    return lambda$showPopup$2;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda58
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    ArticleViewer.this.lambda$showPopup$3(keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(false);
            TextView textView = new TextView(this.parentActivity);
            this.deleteView = textView;
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2));
            this.deleteView.setGravity(16);
            this.deleteView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.deleteView.setTextSize(1, 15.0f);
            this.deleteView.setTypeface(AndroidUtilities.bold());
            this.deleteView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
            this.deleteView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ArticleViewer.this.lambda$showPopup$4(view2);
                }
            });
            this.popupLayout.addView(this.deleteView, LayoutHelper.createFrame(-2, 48.0f));
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationEnabled(false);
            this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda60
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ArticleViewer.this.lambda$showPopup$5();
                }
            });
        }
        this.deleteView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
        if (actionBarPopupWindowLayout2 != null) {
            actionBarPopupWindowLayout2.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.popupWindow.setFocusable(true);
        this.popupWindow.showAtLocation(view, i, i2, i3);
        this.popupWindow.startAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showPopup$2(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$3(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$4(View view) {
        DrawingText drawingText = this.pressedLinkOwnerLayout;
        if (drawingText != null) {
            AndroidUtilities.addToClipboard(drawingText.getText());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(this.parentActivity, LocaleController.getString(R.string.TextCopied), 0).show();
            }
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$5() {
        View view = this.pressedLinkOwnerView;
        if (view != null) {
            this.pressedLinkOwnerLayout = null;
            view.invalidate();
            this.pressedLinkOwnerView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_iv.RichText getBlockCaption(TL_iv.PageBlock pageBlock, int i) {
        if (i == 2) {
            TL_iv.RichText blockCaption = getBlockCaption(pageBlock, 0);
            if (blockCaption instanceof TL_iv.textEmpty) {
                blockCaption = null;
            }
            TL_iv.RichText blockCaption2 = getBlockCaption(pageBlock, 1);
            if (blockCaption2 instanceof TL_iv.textEmpty) {
                blockCaption2 = null;
            }
            if (blockCaption != null && blockCaption2 == null) {
                return blockCaption;
            }
            if (blockCaption == null && blockCaption2 != null) {
                return blockCaption2;
            }
            if (blockCaption == null || blockCaption2 == null) {
                return null;
            }
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = " ";
            TL_iv.textConcat textconcat = new TL_iv.textConcat();
            textconcat.texts.add(blockCaption);
            textconcat.texts.add(textplain);
            textconcat.texts.add(blockCaption2);
            return textconcat;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i == 0) {
                return pageblockphoto.caption.text;
            }
            if (i == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i == 0) {
                return pageblockcollage.caption.text;
            }
            if (i == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i == 0) {
                return pageblockembed.caption.text;
            }
            if (i == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return getBlockCaption(((TL_iv.pageBlockCover) pageBlock).cover, i);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i == 1) {
                            return pageblockmap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    private View getLastNonListCell(View view) {
        if (view instanceof BlockListItemCell) {
            BlockListItemCell blockListItemCell = (BlockListItemCell) view;
            return blockListItemCell.blockLayout != null ? getLastNonListCell(blockListItemCell.blockLayout.itemView) : view;
        }
        if (!(view instanceof BlockOrderedListItemCell)) {
            return view;
        }
        BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
        return blockOrderedListItemCell.blockLayout != null ? getLastNonListCell(blockOrderedListItemCell.blockLayout.itemView) : view;
    }

    public static boolean isListItemBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_pageBlockListItem) || (pageBlock instanceof TL_pageBlockOrderedListItem);
    }

    public static boolean isHeadingBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_iv.PageBlock getLastNonListPageBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            TL_iv.PageBlock pageBlock2 = ((TL_pageBlockListItem) pageBlock).blockItem;
            return pageBlock2 != null ? getLastNonListPageBlock(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((TL_pageBlockOrderedListItem) pageBlock).blockItem;
        return pageBlock3 != null ? getLastNonListPageBlock(pageBlock3) : pageBlock3;
    }

    private boolean openAllParentBlocks(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
        boolean z;
        TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
        if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
            if (pageblockdetails.open) {
                return false;
            }
            pageblockdetails.open = true;
            return true;
        }
        if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
            return false;
        }
        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
        TL_iv.PageBlock lastNonListPageBlock2 = getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
        if (lastNonListPageBlock2 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) lastNonListPageBlock2;
            if (!pageblockdetails2.open) {
                pageblockdetails2.open = true;
                z = true;
                return !openAllParentBlocks(tL_pageBlockDetailsChild2) || z;
            }
        }
        z = false;
        if (openAllParentBlocks(tL_pageBlockDetailsChild2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_iv.PageBlock fixListBlock(TL_iv.PageBlock pageBlock, TL_iv.PageBlock pageBlock2) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            ((TL_pageBlockListItem) pageBlock).blockItem = pageBlock2;
            return pageBlock;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock2;
        }
        ((TL_pageBlockOrderedListItem) pageBlock).blockItem = pageBlock2;
        return pageBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_iv.PageBlock wrapInTableBlock(TL_iv.PageBlock pageBlock, TL_iv.PageBlock pageBlock2) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) pageBlock;
            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
            tL_pageBlockListItem2.isCheckbox = tL_pageBlockListItem.isCheckbox;
            tL_pageBlockListItem2.checked = tL_pageBlockListItem.checked;
            tL_pageBlockListItem2.parent = tL_pageBlockListItem.parent;
            tL_pageBlockListItem2.blockItem = wrapInTableBlock(tL_pageBlockListItem.blockItem, pageBlock2);
            return tL_pageBlockListItem2;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock2;
        }
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) pageBlock;
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageBlockOrderedListItem.isCheckbox;
        tL_pageBlockOrderedListItem2.checked = tL_pageBlockOrderedListItem.checked;
        tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListItem.parent;
        tL_pageBlockOrderedListItem2.blockItem = wrapInTableBlock(tL_pageBlockOrderedListItem.blockItem, pageBlock2);
        return tL_pageBlockOrderedListItem2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInterfaceForCurrentPage(Object obj, boolean z, int i) {
        int i2;
        int dp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof CachedWeb)) {
                return;
            }
            if (!z && i != 0) {
                PageLayout[] pageLayoutArr = this.pages;
                PageLayout pageLayout = pageLayoutArr[1];
                pageLayoutArr[1] = pageLayoutArr[0];
                pageLayoutArr[0] = pageLayout;
                this.actionBar.swap();
                this.page0Background.set(this.pages[0].getBackgroundColor(), true);
                this.page1Background.set(this.pages[1].getBackgroundColor(), true);
                Sheet sheet = this.sheet;
                if (sheet != null) {
                    sheet.updateLastVisible();
                }
                int indexOfChild = this.containerView.indexOfChild(this.pages[0]);
                int indexOfChild2 = this.containerView.indexOfChild(this.pages[1]);
                if (i == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.containerView.removeView(this.pages[0]);
                        this.containerView.addView(this.pages[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.containerView.removeView(this.pages[0]);
                    this.containerView.addView(this.pages[0], indexOfChild);
                }
                this.pageSwitchAnimation = new AnimatorSet();
                this.pages[0].setVisibility(0);
                final int i3 = i == 1 ? 0 : 1;
                this.pages[i3].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
                this.pages[i3].setLayerType(2, null);
                if (i == 1) {
                    this.pages[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i == -1) {
                    this.pages[0].setTranslationX(0.0f);
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.pages[1], (Property<PageLayout, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.pageSwitchAnimation.setDuration(320L);
                this.pageSwitchAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.pageSwitchAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.textSelectionHelper.setParentView(articleViewer.pages[0].listView);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer2.textSelectionHelper;
                        PageLayout[] pageLayoutArr2 = articleViewer2.pages;
                        articleTextSelectionHelper.layoutManager = pageLayoutArr2[0].layoutManager;
                        pageLayoutArr2[i3].setBackgroundDrawable(null);
                        ArticleViewer.this.pages[i3].setLayerType(0, null);
                        ArticleViewer.this.pageSwitchAnimation = null;
                        ArticleViewer.this.windowView.openingPage = false;
                    }
                });
                this.windowView.openingPage = true;
                WebActionBar webActionBar = this.actionBar;
                PageLayout pageLayout2 = this.pages[0];
                webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
                WebActionBar webActionBar2 = this.actionBar;
                PageLayout pageLayout3 = this.pages[0];
                webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
                WebActionBar webActionBar3 = this.actionBar;
                PageLayout pageLayout4 = this.pages[0];
                webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
                WebActionBar webActionBar4 = this.actionBar;
                PageLayout pageLayout5 = this.pages[0];
                webActionBar4.setIsLocal(pageLayout5 != null && pageLayout5.isLocal());
                AnimatorSet animatorSet = this.pageSwitchAnimation;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda23(animatorSet));
            }
            if (!z) {
                this.textSelectionHelper.clear(true);
            }
            WebpageAdapter webpageAdapter = this.pages[z ? 1 : 0].adapter;
            if (z) {
                ArrayList arrayList = this.pagesStack;
                obj = arrayList.get(arrayList.size() - 2);
            }
            this.pages[z ? 1 : 0].cleanup();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.pages[z ? 1 : 0].setWeb(null);
                this.pages[z ? 1 : 0].setType(0);
                webpageAdapter.isRtl = webPage.cached_page.rtl;
                webpageAdapter.currentPage = webPage;
                int size = webPage.cached_page.blocks.size();
                while (i2 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i2);
                    if (i2 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText blockCaption = getBlockCaption(pageblockcover, 0);
                            TL_iv.RichText blockCaption2 = getBlockCaption(pageblockcover, 1);
                            if (((blockCaption != null && !(blockCaption instanceof TL_iv.textEmpty)) || (blockCaption2 != null && !(blockCaption2 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    webpageAdapter.channelBlock = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        i2 = (i2 == 1 && webpageAdapter.channelBlock != null) ? i2 + 1 : 0;
                    }
                    webpageAdapter.addBlock(webpageAdapter, pageBlock, 0, 0, i2 == size + (-1) ? i2 : 0);
                }
                webpageAdapter.notifyDataSetChanged();
                if (this.pagesStack.size() == 1 || i == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i4 = sharedPreferences.getInt(str, -1);
                    boolean z2 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z2 == (point.x <= point.y ? 0 : 1)) {
                        dp = sharedPreferences.getInt(str + "o", 0) - this.pages[z ? 1 : 0].listView.getPaddingTop();
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    if (i4 != -1) {
                        this.pages[z ? 1 : 0].layoutManager.scrollToPositionWithOffset(i4, dp);
                    }
                } else {
                    LinearLayoutManager linearLayoutManager = this.pages[z ? 1 : 0].layoutManager;
                    Sheet sheet2 = this.sheet;
                    linearLayoutManager.scrollToPositionWithOffset((sheet2 == null || !sheet2.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof CachedWeb) {
                this.pages[z ? 1 : 0].setType(1);
                this.pages[z ? 1 : 0].scrollToTop(false);
                this.pages[z ? 1 : 0].setWeb((CachedWeb) obj);
            }
            if (!z) {
                checkScrollAnimated();
            }
            updateTitle(false);
            updatePages();
        }
    }

    public BotWebViewContainer.MyWebView getLastWebView() {
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || !pageLayout.isWeb()) {
            return null;
        }
        if (this.pages[0].getWebView() == null) {
            this.pages[0].webViewContainer.checkCreateWebView();
        }
        return this.pages[0].getWebView();
    }

    private boolean addPageToStack(TLRPC.WebPage webPage, String str, int i) {
        saveCurrentPagePosition();
        this.pagesStack.add(webPage);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(webPage, false, i);
        return scrollToAnchor(str, false);
    }

    private boolean addPageToStack(String str, int i) {
        saveCurrentPagePosition();
        CachedWeb cachedWeb = new CachedWeb(str);
        this.pagesStack.add(cachedWeb);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(cachedWeb, false, i);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goBack() {
        boolean z = false;
        if (this.pagesStack.size() <= 1) {
            this.windowView.movingPage = false;
            this.windowView.startedTracking = false;
            FrameLayout frameLayout = this.containerView;
            Sheet sheet = this.sheet;
            float backProgress = sheet != null ? sheet.getBackProgress() * this.sheet.windowView.getWidth() : frameLayout.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = frameLayout.getMeasuredWidth() - backProgress;
            Sheet sheet2 = this.sheet;
            if (sheet2 != null) {
                animatorSet.playTogether(sheet2.animateBackProgressTo(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        PageLayout[] pageLayoutArr = articleViewer.pages;
                        PageLayout pageLayout = pageLayoutArr[1];
                        pageLayoutArr[1] = pageLayoutArr[0];
                        pageLayoutArr[0] = pageLayout;
                        articleViewer.actionBar.swap();
                        ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                        ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                        Sheet sheet3 = ArticleViewer.this.sheet;
                        if (sheet3 != null) {
                            sheet3.updateLastVisible();
                        }
                        ArrayList arrayList = ArticleViewer.this.pagesStack;
                        Object remove = arrayList.remove(arrayList.size() - 1);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                        articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                        articleTextSelectionHelper.clear(true);
                        ArticleViewer.this.updateTitle(false);
                        ArticleViewer.this.updatePages();
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        if (remove instanceof CachedWeb) {
                            ((CachedWeb) remove).destroy();
                        }
                        if (remove instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) remove);
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 == null) {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
                        } else {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        }
                    }
                    ArticleViewer.this.windowView.movingPage = false;
                    ArticleViewer.this.windowView.startedTracking = false;
                    ArticleViewer.this.closeAnimationInProgress = false;
                }
            });
            animatorSet.start();
            this.closeAnimationInProgress = true;
            return;
        }
        this.windowView.openingPage = true;
        this.windowView.movingPage = true;
        this.windowView.startMovingHeaderHeight = this.currentHeaderHeight;
        this.pages[1].setVisibility(0);
        this.pages[1].setAlpha(1.0f);
        this.pages[1].setTranslationX(0.0f);
        this.pages[0].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
        ArrayList arrayList = this.pagesStack;
        updateInterfaceForCurrentPage(arrayList.get(arrayList.size() - 2), true, -1);
        PageLayout pageLayout = this.pages[0];
        pageLayout.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        pageLayout.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, pageLayout.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!ArticleViewer.this.windowView.openingPage) {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
                } else {
                    ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    PageLayout pageLayout2 = pageLayoutArr[1];
                    pageLayoutArr[1] = pageLayoutArr[0];
                    pageLayoutArr[0] = pageLayout2;
                    articleViewer.actionBar.swap();
                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                    Sheet sheet3 = ArticleViewer.this.sheet;
                    if (sheet3 != null) {
                        sheet3.updateLastVisible();
                    }
                    ArrayList arrayList2 = ArticleViewer.this.pagesStack;
                    Object remove = arrayList2.remove(arrayList2.size() - 1);
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                    articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                    articleTextSelectionHelper.clear(true);
                    ArticleViewer.this.updateTitle(false);
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.pages[1].cleanup();
                    ArticleViewer.this.pages[1].setVisibility(8);
                    if (remove instanceof CachedWeb) {
                        ((CachedWeb) remove).destroy();
                    }
                    if (remove instanceof TLRPC.WebPage) {
                        WebInstantView.recycle((TLRPC.WebPage) remove);
                    }
                }
                ArticleViewer.this.windowView.openingPage = false;
                ArticleViewer.this.windowView.startedTracking = false;
                ArticleViewer.this.closeAnimationInProgress = false;
            }
        });
        animatorSet2.start();
        WebActionBar webActionBar = this.actionBar;
        PageLayout pageLayout2 = this.pages[0];
        webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
        WebActionBar webActionBar2 = this.actionBar;
        PageLayout pageLayout3 = this.pages[0];
        webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
        WebActionBar webActionBar3 = this.actionBar;
        PageLayout pageLayout4 = this.pages[0];
        webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
        WebActionBar webActionBar4 = this.actionBar;
        PageLayout pageLayout5 = this.pages[0];
        if (pageLayout5 != null && pageLayout5.isLocal()) {
            z = true;
        }
        webActionBar4.setIsLocal(z);
        this.closeAnimationInProgress = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: goBack, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setParentActivity$29(final int i) {
        boolean z = false;
        if (this.pagesStack.size() <= 1) {
            this.windowView.movingPage = false;
            this.windowView.startedTracking = false;
            FrameLayout frameLayout = this.containerView;
            Sheet sheet = this.sheet;
            float backProgress = sheet != null ? sheet.getBackProgress() * this.sheet.windowView.getWidth() : frameLayout.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = frameLayout.getMeasuredWidth() - backProgress;
            Sheet sheet2 = this.sheet;
            if (sheet2 != null) {
                animatorSet.playTogether(sheet2.animateBackProgressTo(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        PageLayout[] pageLayoutArr = articleViewer.pages;
                        PageLayout pageLayout = pageLayoutArr[1];
                        pageLayoutArr[1] = pageLayoutArr[0];
                        pageLayoutArr[0] = pageLayout;
                        articleViewer.actionBar.swap();
                        ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                        ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                        Sheet sheet3 = ArticleViewer.this.sheet;
                        if (sheet3 != null) {
                            sheet3.updateLastVisible();
                        }
                        ArrayList arrayList = ArticleViewer.this.pagesStack;
                        Object remove = arrayList.remove(arrayList.size() - 1);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                        articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                        articleTextSelectionHelper.clear(true);
                        ArticleViewer.this.updateTitle(false);
                        ArticleViewer.this.updatePages();
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        if (remove instanceof CachedWeb) {
                            ((CachedWeb) remove).destroy();
                        }
                        if (remove instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) remove);
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 == null) {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
                        } else {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        }
                    }
                    ArticleViewer.this.windowView.movingPage = false;
                    ArticleViewer.this.windowView.startedTracking = false;
                    ArticleViewer.this.closeAnimationInProgress = false;
                }
            });
            animatorSet.start();
            this.closeAnimationInProgress = true;
            return;
        }
        this.windowView.openingPage = true;
        this.pages[1].setVisibility(0);
        this.pages[1].setAlpha(1.0f);
        this.pages[1].setTranslationX(0.0f);
        this.pages[0].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
        updateInterfaceForCurrentPage(this.pagesStack.get(i), true, -1);
        PageLayout pageLayout = this.pages[0];
        pageLayout.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        pageLayout.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, pageLayout.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!ArticleViewer.this.windowView.openingPage) {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    PageLayout pageLayout2 = pageLayoutArr[1];
                    pageLayoutArr[1] = pageLayoutArr[0];
                    pageLayoutArr[0] = pageLayout2;
                    articleViewer.actionBar.swap();
                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                    Sheet sheet3 = ArticleViewer.this.sheet;
                    if (sheet3 != null) {
                        sheet3.updateLastVisible();
                    }
                    for (int size = ArticleViewer.this.pagesStack.size() - 1; size > i; size--) {
                        arrayList.add(ArticleViewer.this.pagesStack.remove(size));
                    }
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                    articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                    articleTextSelectionHelper.clear(true);
                    ArticleViewer.this.updateTitle(false);
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.pages[1].cleanup();
                    ArticleViewer.this.pages[1].setVisibility(8);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof CachedWeb) {
                            ((CachedWeb) next).destroy();
                        }
                        if (next instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) next);
                        }
                    }
                }
                ArticleViewer.this.windowView.openingPage = false;
                ArticleViewer.this.windowView.startedTracking = false;
                ArticleViewer.this.closeAnimationInProgress = false;
            }
        });
        animatorSet2.start();
        WebActionBar webActionBar = this.actionBar;
        PageLayout pageLayout2 = this.pages[0];
        webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
        WebActionBar webActionBar2 = this.actionBar;
        PageLayout pageLayout3 = this.pages[0];
        webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
        WebActionBar webActionBar3 = this.actionBar;
        PageLayout pageLayout4 = this.pages[0];
        webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
        WebActionBar webActionBar4 = this.actionBar;
        PageLayout pageLayout5 = this.pages[0];
        if (pageLayout5 != null && pageLayout5.isLocal()) {
            z = true;
        }
        webActionBar4.setIsLocal(z);
        this.closeAnimationInProgress = true;
    }

    public boolean scrollToAnchor(String str, boolean z) {
        Integer num = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Integer num2 = (Integer) this.pages[0].adapter.anchors.get(lowerCase);
        if (num2 != null) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.pages[0].adapter.anchorsParent.get(lowerCase);
            if (textanchor != null) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = WebInstantView.filterRecursiveAnchorLinks(textanchor.text, !TextUtils.isEmpty(this.pages[0].adapter.currentPage.cached_page.url) ? this.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : this.pages[0].adapter.currentPage.url.toLowerCase(), lowerCase);
                int typeForBlock = this.pages[0].adapter.getTypeForBlock(pageblockparagraph);
                RecyclerView.ViewHolder onCreateViewHolder = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock);
                this.pages[0].adapter.bindBlockToHolder(typeForBlock, onCreateViewHolder, pageblockparagraph, 0, 0, false);
                BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
                builder.setApplyTopPadding(false);
                builder.setApplyBottomPadding(false);
                final LinearLayout linearLayout = new LinearLayout(this.parentActivity);
                linearLayout.setOrientation(1);
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
                this.textSelectionHelperBottomSheet = articleTextSelectionHelper;
                articleTextSelectionHelper.setParentView(linearLayout);
                this.textSelectionHelperBottomSheet.setCallback(new TextSelectionHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.8
                    @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
                    public void onStateChanged(boolean z2) {
                        BottomSheet bottomSheet = ArticleViewer.this.linkSheet;
                        if (bottomSheet != null) {
                            bottomSheet.setDisableScroll(z2);
                        }
                    }
                });
                TextView textView = new TextView(this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.9
                    @Override // android.widget.TextView, android.view.View
                    protected void onDraw(Canvas canvas) {
                        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
                        super.onDraw(canvas);
                    }
                };
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(LocaleController.getString(R.string.InstantViewReference));
                textView.setGravity((this.pages[0].adapter.isRtl ? 5 : 3) | 16);
                textView.setTextColor(getTextColor());
                textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                onCreateViewHolder.itemView.setTag("bottomSheet");
                linearLayout.addView(onCreateViewHolder.itemView, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                TextSelectionHelper.TextSelectionOverlay overlayView = this.textSelectionHelperBottomSheet.getOverlayView(this.parentActivity);
                FrameLayout frameLayout = new FrameLayout(this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.10
                    @Override // android.view.ViewGroup, android.view.View
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        TextSelectionHelper.TextSelectionOverlay overlayView2 = ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                            return true;
                        }
                        if (overlayView2.checkOnTap(motionEvent)) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 && ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                            if (ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                                return super.dispatchTouchEvent(motionEvent);
                            }
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }

                    @Override // android.widget.FrameLayout, android.view.View
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(i, i2);
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredHeight() + AndroidUtilities.dp(8.0f), TLObject.FLAG_30));
                    }
                };
                builder.setDelegate(new BottomSheet.BottomSheetDelegate() { // from class: org.telegram.ui.ArticleViewer.11
                    @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegate, org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
                    public boolean canDismiss() {
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = ArticleViewer.this.textSelectionHelperBottomSheet;
                        if (articleTextSelectionHelper2 == null || !articleTextSelectionHelper2.isInSelectionMode()) {
                            return true;
                        }
                        ArticleViewer.this.textSelectionHelperBottomSheet.clear();
                        return false;
                    }
                });
                frameLayout.addView(linearLayout, -1, -2);
                frameLayout.addView(overlayView, -1, -2);
                builder.setCustomView(frameLayout);
                if (this.textSelectionHelper.isInSelectionMode()) {
                    this.textSelectionHelper.clear();
                }
                BottomSheet create = builder.create();
                this.linkSheet = create;
                showDialog(create);
            } else if (num2.intValue() >= 0 && num2.intValue() < this.pages[0].adapter.blocks.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.pages[0].adapter.blocks.get(num2.intValue());
                TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(pageBlock);
                if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.pages[0].adapter.updateRows();
                    this.pages[0].adapter.notifyDataSetChanged();
                }
                int indexOf = this.pages[0].adapter.localBlocks.indexOf(pageBlock);
                if (indexOf != -1) {
                    num2 = Integer.valueOf(indexOf);
                }
                Integer num3 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                if (num3 != null) {
                    if (num3.intValue() == -1) {
                        int typeForBlock2 = this.pages[0].adapter.getTypeForBlock(pageBlock);
                        RecyclerView.ViewHolder onCreateViewHolder2 = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock2);
                        this.pages[0].adapter.bindBlockToHolder(typeForBlock2, onCreateViewHolder2, pageBlock, 0, 0, false);
                        onCreateViewHolder2.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.pages[0].listView.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Integer num4 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                        if (num4.intValue() != -1) {
                            num = num4;
                        }
                    } else {
                        num = num3;
                    }
                }
                if (this.pages[0].adapter.padding) {
                    num2 = Integer.valueOf(num2.intValue() + 1);
                }
                if (z) {
                    SmoothScroller smoothScroller = new SmoothScroller(this.pages[0].getContext()) { // from class: org.telegram.ui.ArticleViewer.12
                        @Override // androidx.recyclerview.widget.LinearSmoothScroller
                        protected int getVerticalSnapPreference() {
                            return -1;
                        }
                    };
                    smoothScroller.setTargetPosition(num2.intValue());
                    smoothScroller.setOffset((-AndroidUtilities.dp(56.0f)) - num.intValue());
                    this.pages[0].layoutManager.startSmoothScroll(smoothScroller);
                } else {
                    this.pages[0].layoutManager.scrollToPositionWithOffset(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                }
            }
            return true;
        }
        return false;
    }

    private boolean removeLastPageFromStack() {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        ArrayList arrayList = this.pagesStack;
        Object remove = arrayList.remove(arrayList.size() - 1);
        if (remove instanceof CachedWeb) {
            ((CachedWeb) remove).destroy();
        }
        if (remove instanceof TLRPC.WebPage) {
            WebInstantView.recycle((TLRPC.WebPage) remove);
        }
        ArrayList arrayList2 = this.pagesStack;
        updateInterfaceForCurrentPage(arrayList2.get(arrayList2.size() - 1), false, -1);
        return true;
    }

    protected void startCheckLongPress(float f, float f2, View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new CheckForTap();
        }
        if (view.getTag() != null && view.getTag() == "bottomSheet" && (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) != null) {
            articleTextSelectionHelper.setMaybeView((int) f, (int) f2, view);
        } else {
            this.textSelectionHelper.setMaybeView((int) f, (int) f2, view);
        }
        this.windowView.postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    protected void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        CheckForLongPress checkForLongPress = this.pendingCheckForLongPress;
        if (checkForLongPress != null) {
            this.windowView.removeCallbacks(checkForLongPress);
            this.pendingCheckForLongPress = null;
        }
        CheckForTap checkForTap = this.pendingCheckForTap;
        if (checkForTap != null) {
            this.windowView.removeCallbacks(checkForTap);
            this.pendingCheckForTap = null;
        }
    }

    @Override // org.telegram.ui.IArticleViewer
    public Resources getResources() {
        return resources;
    }

    public static class Resources {
        public TextPaint errorTextPaint;
        public final boolean isRichMessage;
        public final SparseArray photoCaptionTextPaints = new SparseArray();
        public final SparseArray photoCreditTextPaints = new SparseArray();
        public final SparseArray titleTextPaints = new SparseArray();
        public final SparseArray kickerTextPaints = new SparseArray();
        public final SparseArray headerTextPaints = new SparseArray();
        public final SparseArray subtitleTextPaints = new SparseArray();
        public final SparseArray subheaderTextPaints = new SparseArray();
        public final SparseArray heading1TextPaints = new SparseArray();
        public final SparseArray heading2TextPaints = new SparseArray();
        public final SparseArray heading3TextPaints = new SparseArray();
        public final SparseArray heading4TextPaints = new SparseArray();
        public final SparseArray heading5TextPaints = new SparseArray();
        public final SparseArray heading6TextPaints = new SparseArray();
        public final SparseArray authorTextPaints = new SparseArray();
        public final SparseArray footerTextPaints = new SparseArray();
        public final SparseArray paragraphTextPaints = new SparseArray();
        public final SparseArray listTextPaints = new SparseArray();
        public final SparseArray preformattedTextPaints = new SparseArray();
        public final SparseArray quoteTextPaints = new SparseArray();
        public final SparseArray embedPostTextPaints = new SparseArray();
        public final SparseArray embedPostCaptionTextPaints = new SparseArray();
        public final SparseArray mediaCaptionTextPaints = new SparseArray();
        public final SparseArray mediaCreditTextPaints = new SparseArray();
        public final SparseArray relatedArticleTextPaints = new SparseArray();
        public final SparseArray detailsTextPaints = new SparseArray();
        public final SparseArray tableTextPaints = new SparseArray();

        public Resources(boolean z) {
            this.isRichMessage = z;
        }

        public void updatePaintColors(IArticleViewer iArticleViewer) {
            setMapColors(iArticleViewer, this.titleTextPaints);
            setMapColors(iArticleViewer, this.kickerTextPaints);
            setMapColors(iArticleViewer, this.subtitleTextPaints);
            setMapColors(iArticleViewer, this.headerTextPaints);
            setMapColors(iArticleViewer, this.subheaderTextPaints);
            setMapColors(iArticleViewer, this.heading1TextPaints);
            setMapColors(iArticleViewer, this.heading2TextPaints);
            setMapColors(iArticleViewer, this.heading3TextPaints);
            setMapColors(iArticleViewer, this.heading4TextPaints);
            setMapColors(iArticleViewer, this.heading5TextPaints);
            setMapColors(iArticleViewer, this.heading6TextPaints);
            setMapColors(iArticleViewer, this.quoteTextPaints);
            setMapColors(iArticleViewer, this.preformattedTextPaints);
            setMapColors(iArticleViewer, this.paragraphTextPaints);
            setMapColors(iArticleViewer, this.listTextPaints);
            setMapColors(iArticleViewer, this.embedPostTextPaints);
            setMapColors(iArticleViewer, this.mediaCaptionTextPaints);
            setMapColors(iArticleViewer, this.mediaCreditTextPaints);
            setMapColors(iArticleViewer, this.photoCaptionTextPaints);
            setMapColors(iArticleViewer, this.photoCreditTextPaints);
            setMapColors(iArticleViewer, this.authorTextPaints);
            setMapColors(iArticleViewer, this.footerTextPaints);
            setMapColors(iArticleViewer, this.embedPostCaptionTextPaints);
            setMapColors(iArticleViewer, this.relatedArticleTextPaints);
            setMapColors(iArticleViewer, this.detailsTextPaints);
            setMapColors(iArticleViewer, this.tableTextPaints);
        }

        private void setMapColors(IArticleViewer iArticleViewer, SparseArray sparseArray) {
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                TextPaint textPaint = (TextPaint) sparseArray.valueAt(i);
                if (textPaint != null) {
                    if ((keyAt & 8) != 0 || (keyAt & 512) != 0) {
                        textPaint.setColor(iArticleViewer.getLinkTextColor());
                    } else {
                        textPaint.setColor(iArticleViewer.getTextColor());
                    }
                }
            }
        }

        public void updatePaintFonts(int i) {
            ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i).commit();
            Typeface typeface = i == 0 ? Typeface.DEFAULT : Typeface.SERIF;
            Typeface typeface2 = i == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
            Typeface bold = i == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
            Typeface typeface3 = i == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
            for (int i2 = 0; i2 < this.quoteTextPaints.size(); i2++) {
                updateFontEntry(this.quoteTextPaints.keyAt(i2), (TextPaint) this.quoteTextPaints.valueAt(i2), typeface, typeface3, bold, typeface2);
            }
            for (int i3 = 0; i3 < this.preformattedTextPaints.size(); i3++) {
                updateFontEntry(this.preformattedTextPaints.keyAt(i3), (TextPaint) this.preformattedTextPaints.valueAt(i3), typeface, typeface3, bold, typeface2);
            }
            for (int i4 = 0; i4 < this.paragraphTextPaints.size(); i4++) {
                updateFontEntry(this.paragraphTextPaints.keyAt(i4), (TextPaint) this.paragraphTextPaints.valueAt(i4), typeface, typeface3, bold, typeface2);
            }
            for (int i5 = 0; i5 < this.listTextPaints.size(); i5++) {
                updateFontEntry(this.listTextPaints.keyAt(i5), (TextPaint) this.listTextPaints.valueAt(i5), typeface, typeface3, bold, typeface2);
            }
            for (int i6 = 0; i6 < this.embedPostTextPaints.size(); i6++) {
                updateFontEntry(this.embedPostTextPaints.keyAt(i6), (TextPaint) this.embedPostTextPaints.valueAt(i6), typeface, typeface3, bold, typeface2);
            }
            for (int i7 = 0; i7 < this.mediaCaptionTextPaints.size(); i7++) {
                updateFontEntry(this.mediaCaptionTextPaints.keyAt(i7), (TextPaint) this.mediaCaptionTextPaints.valueAt(i7), typeface, typeface3, bold, typeface2);
            }
            for (int i8 = 0; i8 < this.mediaCreditTextPaints.size(); i8++) {
                updateFontEntry(this.mediaCreditTextPaints.keyAt(i8), (TextPaint) this.mediaCreditTextPaints.valueAt(i8), typeface, typeface3, bold, typeface2);
            }
            for (int i9 = 0; i9 < this.photoCaptionTextPaints.size(); i9++) {
                updateFontEntry(this.photoCaptionTextPaints.keyAt(i9), (TextPaint) this.photoCaptionTextPaints.valueAt(i9), typeface, typeface3, bold, typeface2);
            }
            for (int i10 = 0; i10 < this.photoCreditTextPaints.size(); i10++) {
                updateFontEntry(this.photoCreditTextPaints.keyAt(i10), (TextPaint) this.photoCreditTextPaints.valueAt(i10), typeface, typeface3, bold, typeface2);
            }
            for (int i11 = 0; i11 < this.authorTextPaints.size(); i11++) {
                updateFontEntry(this.authorTextPaints.keyAt(i11), (TextPaint) this.authorTextPaints.valueAt(i11), typeface, typeface3, bold, typeface2);
            }
            for (int i12 = 0; i12 < this.footerTextPaints.size(); i12++) {
                updateFontEntry(this.footerTextPaints.keyAt(i12), (TextPaint) this.footerTextPaints.valueAt(i12), typeface, typeface3, bold, typeface2);
            }
            for (int i13 = 0; i13 < this.embedPostCaptionTextPaints.size(); i13++) {
                updateFontEntry(this.embedPostCaptionTextPaints.keyAt(i13), (TextPaint) this.embedPostCaptionTextPaints.valueAt(i13), typeface, typeface3, bold, typeface2);
            }
            for (int i14 = 0; i14 < this.relatedArticleTextPaints.size(); i14++) {
                updateFontEntry(this.relatedArticleTextPaints.keyAt(i14), (TextPaint) this.relatedArticleTextPaints.valueAt(i14), typeface, typeface3, bold, typeface2);
            }
            for (int i15 = 0; i15 < this.detailsTextPaints.size(); i15++) {
                updateFontEntry(this.detailsTextPaints.keyAt(i15), (TextPaint) this.detailsTextPaints.valueAt(i15), typeface, typeface3, bold, typeface2);
            }
            for (int i16 = 0; i16 < this.tableTextPaints.size(); i16++) {
                updateFontEntry(this.tableTextPaints.keyAt(i16), (TextPaint) this.tableTextPaints.valueAt(i16), typeface, typeface3, bold, typeface2);
            }
        }

        private void updateFontEntry(int i, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
            int i2 = i & 1;
            if (i2 != 0 && (i & 2) != 0) {
                textPaint.setTypeface(typeface2);
                return;
            }
            if (i2 != 0) {
                textPaint.setTypeface(typeface3);
            } else if ((i & 2) != 0) {
                textPaint.setTypeface(typeface4);
            } else {
                if ((i & 4) != 0) {
                    return;
                }
                textPaint.setTypeface(typeface);
            }
        }
    }

    public static void drawQuoteLines(Canvas canvas, IArticleViewer iArticleViewer, TL_iv.PageBlock pageBlock, int i) {
        if (pageBlock == null || iArticleViewer == null || quoteLinePaint == null) {
            return;
        }
        int padx = iArticleViewer.padx();
        int i2 = 0;
        int dp = i - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i3 = pageBlock.quoteLevels;
        if (i3 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(padx), 0.0f, r10 + AndroidUtilities.dp(2.0f), dp, quoteLinePaint);
                return;
            }
            return;
        }
        while (i3 != 0) {
            if ((i3 & 1) != 0) {
                canvas.drawRect(AndroidUtilities.dp((i2 * 14) + padx), 0.0f, r11 + AndroidUtilities.dp(2.0f), dp, quoteLinePaint);
            }
            i3 >>>= 1;
            i2++;
        }
    }

    public static int getTextFlags(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return getTextFlags(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return getTextFlags(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return getTextFlags(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getTextFlags(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return getTextFlags(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            if (((TL_iv.textUrl) richText).webpage_id != 0) {
                return getTextFlags(richText.parentRichText) | 512;
            }
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return getTextFlags(richText.parentRichText) | 128;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return getTextFlags(richText.parentRichText) | 256;
        }
        if (richText instanceof TL_iv.textMarked) {
            return getTextFlags(richText.parentRichText) | 64;
        }
        if (richText != null) {
            return getTextFlags(richText.parentRichText);
        }
        return 0;
    }

    public static TL_iv.RichText getLastRichText(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return getLastRichText(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getLastRichText(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getLastRichText(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getLastRichText(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getLastRichText(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return getLastRichText(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return getLastRichText(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textAnchor) {
            getLastRichText(((TL_iv.textAnchor) richText).text);
        } else {
            if (richText instanceof TL_iv.textSubscript) {
                return getLastRichText(((TL_iv.textSubscript) richText).text);
            }
            if (richText instanceof TL_iv.textSuperscript) {
                return getLastRichText(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return getLastRichText(((TL_iv.textMarked) richText).text);
            }
            if (richText instanceof TL_iv.textPhone) {
                return getLastRichText(((TL_iv.textPhone) richText).text);
            }
            if (richText instanceof TL_iv.textSpoiler) {
                return getLastRichText(((TL_iv.textSpoiler) richText).text);
            }
        }
        return richText;
    }

    private CharSequence getText(WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, richText, richText2, pageBlock, i);
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(iArticleViewer, webpageAdapter != null ? webpageAdapter.currentPage : null, view, richText, richText2, pageBlock, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getText(TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(this, webPage, view, richText, richText2, pageBlock, i);
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Object textPaintUrlSpan;
        Object textPaintUrlSpan2;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null, "mailto:" + getUrl(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            TextPaint textPaint = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null;
            if (texturl.webpage_id != 0) {
                textPaintUrlSpan2 = new TextPaintWebpageUrlSpan(textPaint, getUrl(richText2));
            } else {
                textPaintUrlSpan2 = new TextPaintUrlSpan(textPaint, getUrl(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(textPaintUrlSpan2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, textanchor.text, pageBlock, i));
            spannableStringBuilder3.setSpan(new AnchorSpan(textanchor.name), 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (richText2 instanceof TL_iv.textEmpty) {
            return "";
        }
        int i6 = 1;
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i7 = 0;
            while (i7 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i7);
                TL_iv.RichText lastRichText = getLastRichText(richText3);
                boolean z = i >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != 0;
                if (z && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - i6) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - i6, spannableStringBuilder4.length(), 33);
                }
                int i8 = i7;
                int i9 = size;
                CharSequence text = getText(iArticleViewer, webPage, view, richText, richText3, pageBlock, i);
                int textFlags = getTextFlags(lastRichText);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(text);
                if (textFlags != 0 && !(text instanceof SpannableStringBuilder)) {
                    if ((textFlags & 8) != 0 || (textFlags & 512) != 0) {
                        String url = getUrl(richText3);
                        if (url == null) {
                            url = getUrl(richText);
                        }
                        if ((textFlags & 512) != 0) {
                            textPaintUrlSpan = new TextPaintWebpageUrlSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock), url);
                        } else {
                            textPaintUrlSpan = new TextPaintUrlSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock), url);
                        }
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(textPaintUrlSpan, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock)), length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z && i8 != i9 - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i7 = i8 + 1;
                size = i9;
                i6 = 1;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                spannableStringBuilder5.setSpan(new TextPaintMarkSpan((metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null), 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
            if (spannableStringBuilder6.length() != 0) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                spannableStringBuilder6.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null, "tel:" + getUrl(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document documentWithId = WebPageUtils.getDocumentWithId(webPage, textimage.document_id);
            TLRPC.Photo photoWithId = WebPageUtils.getPhotoWithId(webPage, textimage.photo_id);
            if (documentWithId != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int dp = AndroidUtilities.dp(textimage.w);
                int dp2 = AndroidUtilities.dp(textimage.h);
                int abs = Math.abs(i);
                if (dp > abs) {
                    i4 = (int) (dp2 * (abs / dp));
                    i5 = abs;
                } else {
                    i4 = dp2;
                    i5 = dp;
                }
                if (view != null) {
                    spannableStringBuilder8.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, (Object) webPage, i5, i4, false, AndroidUtilities.computePerceivedBrightness(iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhite)) <= 0.705f), 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (!(photoWithId instanceof WebInstantView.WebPhoto)) {
                return "";
            }
            WebInstantView.WebPhoto webPhoto = (WebInstantView.WebPhoto) photoWithId;
            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
            int dp3 = AndroidUtilities.dp(textimage.w);
            int dp4 = AndroidUtilities.dp(textimage.h);
            int abs2 = Math.abs(i);
            if (dp3 > abs2) {
                i2 = (int) (dp4 * (abs2 / dp3));
                i3 = abs2;
            } else {
                i2 = dp4;
                i3 = dp3;
            }
            if (view != null) {
                spannableStringBuilder9.setSpan(new TextPaintImageReceiverSpan(view, webPhoto, (Object) webPage, i3, i2, false, false), 0, spannableStringBuilder9.length(), 33);
            }
            return spannableStringBuilder9;
        }
        if (richText2 instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
            if (textmath.bitmap == null && !textmath.tried) {
                textmath.tried = true;
                try {
                    JLatexMathDrawable build = JLatexMathDrawable.builder(textmath.source).textSize(AndroidUtilities.dp(20.0f)).build();
                    int intrinsicWidth = build.getIntrinsicWidth();
                    int intrinsicHeight = build.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        build.draw(new Canvas(createBitmap));
                        textmath.w = intrinsicWidth;
                        textmath.h = intrinsicHeight;
                        try {
                            textmath.depth = build.icon().getIconDepth();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        textmath.bitmap = createBitmap;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (textmath.bitmap == null) {
                String str = textmath.source;
                return str == null ? "" : str;
            }
            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
            spannableStringBuilder10.setSpan(new TextPaintImageReceiverSpan(view, textmath.bitmap, textmath.w, textmath.h, iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), textmath.depth), 0, spannableStringBuilder10.length(), 33);
            String str2 = textmath.source;
            if (str2 != null && !str2.isEmpty()) {
                spannableStringBuilder10.setSpan(new TextSelectionHelper.ReplaceCopyTextSpannable(textmath.source), 0, spannableStringBuilder10.length(), 33);
            }
            return spannableStringBuilder10;
        }
        return "not supported " + richText2;
    }

    public static CharSequence getPlainText(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return getPlainText(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getPlainText(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getPlainText(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getPlainText(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getPlainText(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return getPlainText(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return getPlainText(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return getPlainText(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            int size = richText.texts.size();
            for (int i = 0; i < size; i++) {
                sb.append(getPlainText(richText.texts.get(i)));
            }
            return sb;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return getPlainText(((TL_iv.textSubscript) richText).text);
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return getPlainText(((TL_iv.textSuperscript) richText).text);
        }
        if (richText instanceof TL_iv.textMarked) {
            return getPlainText(((TL_iv.textMarked) richText).text);
        }
        if (richText instanceof TL_iv.textPhone) {
            return getPlainText(((TL_iv.textPhone) richText).text);
        }
        boolean z = richText instanceof TL_iv.textImage;
        return "";
    }

    public static String getUrl(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return getUrl(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getUrl(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getUrl(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getUrl(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getUrl(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return ((TL_iv.textEmail) richText).email;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).url;
        }
        if (richText instanceof TL_iv.textPhone) {
            return ((TL_iv.textPhone) richText).phone;
        }
        return null;
    }

    @Override // org.telegram.ui.IArticleViewer
    public int getTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
    }

    @Override // org.telegram.ui.IArticleViewer
    public int getLinkTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteLinkText);
    }

    @Override // org.telegram.ui.IArticleViewer
    public int getGrayTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteGrayText);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextPaint getTextPaint(IArticleViewer iArticleViewer, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        SparseArray sparseArray;
        int dp;
        int textColor;
        int textColor2;
        int i;
        int textFlags = getTextFlags(richText2);
        int dp2 = AndroidUtilities.dp(14.0f);
        Resources resources2 = iArticleViewer.getResources();
        int dp3 = AndroidUtilities.dp((resources2.isRichMessage ? SharedConfig.fontSize : SharedConfig.ivFontSize) - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                sparseArray = resources2.photoCaptionTextPaints;
                dp = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray = resources2.photoCreditTextPaints;
                dp = AndroidUtilities.dp(12.0f);
            }
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                sparseArray = resources2.photoCaptionTextPaints;
                dp = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray = resources2.photoCreditTextPaints;
                dp = AndroidUtilities.dp(12.0f);
            }
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray = resources2.titleTextPaints;
            dp = AndroidUtilities.dp(23.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray = resources2.kickerTextPaints;
            dp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray = resources2.authorTextPaints;
            dp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray = resources2.footerTextPaints;
            dp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray = resources2.subtitleTextPaints;
            dp = AndroidUtilities.dp(20.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray = resources2.headerTextPaints;
            dp = AndroidUtilities.dp(20.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray = resources2.subheaderTextPaints;
            dp = AndroidUtilities.dp(17.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray = resources2.heading1TextPaints;
            dp = AndroidUtilities.dp(18.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray = resources2.heading2TextPaints;
            dp = AndroidUtilities.dp(16.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray = resources2.heading3TextPaints;
            dp = AndroidUtilities.dp(15.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray = resources2.heading4TextPaints;
            dp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray = resources2.heading5TextPaints;
            dp = AndroidUtilities.dp(13.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            sparseArray = resources2.heading6TextPaints;
            dp = AndroidUtilities.dp(12.0f);
            textColor = iArticleViewer.getTextColor();
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.text == richText) {
                    sparseArray = resources2.quoteTextPaints;
                    dp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getTextColor();
                } else {
                    if (pageblockblockquote.caption == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        dp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    }
                    sparseArray = null;
                    textColor2 = -65536;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.text == richText) {
                    sparseArray = resources2.quoteTextPaints;
                    dp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getTextColor();
                } else {
                    if (pageblockpullquote.caption == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        dp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    }
                    sparseArray = null;
                    textColor2 = -65536;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                sparseArray = resources2.preformattedTextPaints;
                dp2 = AndroidUtilities.dp(14.0f);
                textColor2 = iArticleViewer.getTextColor();
                textFlags |= 4;
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                sparseArray = resources2.paragraphTextPaints;
                dp = AndroidUtilities.dp(16.0f);
                textColor = iArticleViewer.getTextColor();
            } else if (isListItemBlock(pageBlock)) {
                sparseArray = resources2.listTextPaints;
                dp = AndroidUtilities.dp(16.0f);
                textColor = iArticleViewer.getTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                if (richText5 == richText2 || richText5 == richText) {
                    sparseArray = resources2.photoCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                } else {
                    sparseArray = resources2.photoCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                }
                textColor = iArticleViewer.getGrayTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                if (richText6 == richText2 || richText6 == richText) {
                    sparseArray = resources2.photoCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                } else {
                    sparseArray = resources2.photoCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                }
                textColor = iArticleViewer.getGrayTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                if (richText7 == richText2 || richText7 == richText) {
                    sparseArray = resources2.photoCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                } else {
                    sparseArray = resources2.photoCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                }
                textColor = iArticleViewer.getGrayTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                if (richText2 == pageCaption.text) {
                    sparseArray = resources2.photoCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                    textColor = iArticleViewer.getGrayTextColor();
                } else if (richText2 == pageCaption.credit) {
                    sparseArray = resources2.photoCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                    textColor = iArticleViewer.getGrayTextColor();
                } else {
                    if (richText2 != null) {
                        sparseArray = resources2.embedPostTextPaints;
                        dp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getTextColor();
                    }
                    sparseArray = null;
                    textColor2 = -65536;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                    sparseArray = resources2.mediaCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                } else {
                    sparseArray = resources2.mediaCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                }
                textColor = iArticleViewer.getTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                    sparseArray = resources2.mediaCaptionTextPaints;
                    dp = AndroidUtilities.dp(14.0f);
                } else {
                    sparseArray = resources2.mediaCreditTextPaints;
                    dp = AndroidUtilities.dp(12.0f);
                }
                textColor = iArticleViewer.getTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                sparseArray = resources2.relatedArticleTextPaints;
                dp = AndroidUtilities.dp(15.0f);
                textColor = iArticleViewer.getGrayTextColor();
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                sparseArray = resources2.detailsTextPaints;
                dp = AndroidUtilities.dp(15.0f);
                textColor = iArticleViewer.getTextColor();
            } else {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray = resources2.tableTextPaints;
                    dp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getTextColor();
                }
                sparseArray = null;
                textColor2 = -65536;
            }
            i = textFlags & 256;
            if (i == 0 || (textFlags & 128) != 0) {
                dp2 -= AndroidUtilities.dp(4.0f);
            }
            if (sparseArray != null) {
                if (resources2.errorTextPaint == null) {
                    TextPaint textPaint = new TextPaint(1);
                    resources2.errorTextPaint = textPaint;
                    textPaint.setColor(-65536);
                }
                resources2.errorTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                return resources2.errorTextPaint;
            }
            TextPaint textPaint2 = (TextPaint) sparseArray.get(textFlags);
            if (textPaint2 == null) {
                textPaint2 = new TextPaint(1);
                if ((textFlags & 4) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
                } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                    textPaint2.setTypeface(AndroidUtilities.bold());
                } else if (iArticleViewer.selectedFont != 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !isHeadingBlock(pageBlock)) {
                    int i2 = textFlags & 1;
                    if (i2 != 0 && (textFlags & 2) != 0) {
                        textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC));
                    } else if (i2 != 0) {
                        textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    } else if ((textFlags & 2) != 0) {
                        textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || isHeadingBlock(pageBlock)) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                } else {
                    int i3 = textFlags & 1;
                    if (i3 != 0 && (textFlags & 2) != 0) {
                        textPaint2.setTypeface(Typeface.create("serif", 3));
                    } else if (i3 != 0) {
                        textPaint2.setTypeface(Typeface.create("serif", 1));
                    } else if ((textFlags & 2) != 0) {
                        textPaint2.setTypeface(Typeface.create("serif", 2));
                    } else {
                        textPaint2.setTypeface(Typeface.create("serif", 0));
                    }
                }
                if ((textFlags & 32) != 0) {
                    textPaint2.setFlags(textPaint2.getFlags() | 16);
                }
                if ((textFlags & 16) != 0) {
                    textPaint2.setFlags(textPaint2.getFlags() | 8);
                }
                if ((textFlags & 8) != 0 || (textFlags & 512) != 0) {
                    textPaint2.setFlags(textPaint2.getFlags());
                    textColor2 = iArticleViewer.getLinkTextColor();
                }
                if (i != 0) {
                    textPaint2.baselineShift -= AndroidUtilities.dp(6.0f);
                } else if ((textFlags & 128) != 0) {
                    textPaint2.baselineShift += AndroidUtilities.dp(2.0f);
                }
                textPaint2.setColor(textColor2);
                sparseArray.put(textFlags, textPaint2);
            }
            textPaint2.setTextSize(dp2 + dp3);
            return textPaint2;
        }
        int i4 = textColor;
        dp2 = dp;
        textColor2 = i4;
        i = textFlags & 256;
        if (i == 0) {
        }
        dp2 -= AndroidUtilities.dp(4.0f);
        if (sparseArray != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    private DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        return createLayoutForText(this, view, charSequence, richText, i, i2, pageBlock, alignment, i3, webpageAdapter);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:54|(3:55|56|(3:60|(3:(2:64|65)(2:67|68)|66|61)|69))|71|(2:72|73)|(10:77|78|79|(5:82|(1:84)(1:94)|(3:(1:87)(1:91)|88|89)(2:92|93)|90|80)|95|96|97|98|(7:102|103|104|(5:107|(1:109)(1:119)|(3:(1:112)(1:116)|113|114)(2:117|118)|115|105)|120|121|122)|154)|159|97|98|(8:100|102|103|104|(1:105)|120|121|122)|154) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037f A[Catch: Exception -> 0x03a0, TryCatch #0 {Exception -> 0x03a0, blocks: (B:104:0x0378, B:105:0x037c, B:107:0x037f, B:109:0x0397, B:113:0x03ac, B:115:0x03b4, B:121:0x03be), top: B:103:0x0378 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        TextPaint textPaint;
        StaticLayout staticLayout;
        LinkPath linkPath;
        LinkPath linkPath2;
        LinkPath linkPath3;
        TextPaintMarkSpan[] textPaintMarkSpanArr;
        LinkPath linkPath4;
        int i4;
        int i5;
        TextPaintWebpageUrlSpan[] textPaintWebpageUrlSpanArr;
        int i6;
        WebpageAdapter adapter;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int dp = i < 0 ? AndroidUtilities.dp(10.0f) : i;
        CharSequence text = charSequence != null ? charSequence : getText(iArticleViewer, webpageAdapter, view, richText, richText, pageBlock, dp);
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if ((pageBlock instanceof TL_iv.pageBlockEmbedPost) && richText == null) {
            if (((TL_iv.pageBlockEmbedPost) pageBlock).author == charSequence) {
                if (embedPostAuthorPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    embedPostAuthorPaint = textPaint2;
                    textPaint2.setColor(iArticleViewer.getTextColor());
                }
                embedPostAuthorPaint.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                textPaint = embedPostAuthorPaint;
            } else {
                if (embedPostDatePaint == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    embedPostDatePaint = textPaint3;
                    textPaint3.setColor(iArticleViewer.getGrayTextColor());
                }
                embedPostDatePaint.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                textPaint = embedPostDatePaint;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockChannel) {
            if (channelNamePaint == null) {
                TextPaint textPaint4 = new TextPaint(1);
                channelNamePaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.bold());
                TextPaint textPaint5 = new TextPaint(1);
                channelNamePhotoPaint = textPaint5;
                textPaint5.setTypeface(AndroidUtilities.bold());
            }
            channelNamePaint.setColor(iArticleViewer.getTextColor());
            channelNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
            channelNamePhotoPaint.setColor(-1);
            channelNamePhotoPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint = (webpageAdapter == null || webpageAdapter.channelBlock == null) ? channelNamePaint : channelNamePhotoPaint;
        } else if (pageBlock instanceof TL_pageBlockRelatedArticlesChild) {
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) pageBlock;
            if (charSequence == tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).title) {
                if (relatedArticleHeaderPaint == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    relatedArticleHeaderPaint = textPaint6;
                    textPaint6.setTypeface(AndroidUtilities.bold());
                }
                relatedArticleHeaderPaint.setColor(iArticleViewer.getTextColor());
                relatedArticleHeaderPaint.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                textPaint = relatedArticleHeaderPaint;
            } else {
                if (relatedArticleTextPaint == null) {
                    relatedArticleTextPaint = new TextPaint(1);
                }
                relatedArticleTextPaint.setColor(iArticleViewer.getGrayTextColor());
                relatedArticleTextPaint.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                textPaint = relatedArticleTextPaint;
            }
        } else if (isListItemBlock(pageBlock) && charSequence != null) {
            if (listTextPointerPaint == null) {
                TextPaint textPaint7 = new TextPaint(1);
                listTextPointerPaint = textPaint7;
                textPaint7.setColor(iArticleViewer.getTextColor());
            }
            if (listTextNumPaint == null) {
                TextPaint textPaint8 = new TextPaint(1);
                listTextNumPaint = textPaint8;
                textPaint8.setColor(iArticleViewer.getTextColor());
            }
            listTextPointerPaint.setTextSize(AndroidUtilities.dp(19.0f) + dp2);
            listTextNumPaint.setTextSize(AndroidUtilities.dp(16.0f) + dp2);
            if ((pageBlock instanceof TL_pageBlockListItem) && !((TL_pageBlockListItem) pageBlock).parent.pageBlockList.ordered) {
                textPaint = listTextPointerPaint;
            } else {
                textPaint = listTextNumPaint;
            }
        } else {
            textPaint = getTextPaint(iArticleViewer, richText, richText, pageBlock);
        }
        TextPaint textPaint9 = textPaint;
        CharSequence replaceEmoji = Emoji.replaceEmoji(text, textPaint9.getFontMetricsInt(), false, null, 2);
        if (i3 != 0) {
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                staticLayout = StaticLayoutEx.createStaticLayout(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp, i3);
            } else {
                staticLayout = StaticLayoutEx.createStaticLayout(replaceEmoji, textPaint9, dp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, dp, i3);
            }
        } else {
            if (replaceEmoji.charAt(replaceEmoji.length() - 1) == '\n') {
                replaceEmoji = replaceEmoji.subSequence(0, replaceEmoji.length() - 1);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                staticLayout = new StaticLayout(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                staticLayout = new StaticLayout(replaceEmoji, textPaint9, dp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
            }
        }
        if (staticLayout == null) {
            return null;
        }
        CharSequence text2 = staticLayout.getText();
        if (i2 >= 0 && !iArticleViewer.searchResults.isEmpty() && iArticleViewer.searchText != null && (adapter = iArticleViewer.getAdapter()) != null) {
            String lowerCase = replaceEmoji.toString().toLowerCase();
            int i7 = 0;
            while (true) {
                int indexOf = lowerCase.indexOf(iArticleViewer.searchText, i7);
                if (indexOf < 0) {
                    break;
                }
                int length = iArticleViewer.searchText.length() + indexOf;
                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                    adapter.searchTextOffset.put(iArticleViewer.searchText + pageBlock + richText + indexOf, Integer.valueOf(i2 + staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf))));
                }
                i7 = length;
            }
        }
        boolean z = text2 instanceof Spanned;
        if (z) {
            Spanned spanned = (Spanned) text2;
            try {
                AnchorSpan[] anchorSpanArr = (AnchorSpan[]) spanned.getSpans(0, spanned.length(), AnchorSpan.class);
                int lineCount = staticLayout.getLineCount();
                if (anchorSpanArr != null && anchorSpanArr.length > 0) {
                    for (int i8 = 0; i8 < anchorSpanArr.length; i8++) {
                        if (lineCount <= 1) {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i8].getName(), Integer.valueOf(i2));
                        } else {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i8].getName(), Integer.valueOf(i2 + staticLayout.getLineTop(staticLayout.getLineForOffset(spanned.getSpanStart(anchorSpanArr[i8])))));
                        }
                    }
                }
            } catch (Exception unused) {
            }
            float f = 0.0f;
            try {
                textPaintWebpageUrlSpanArr = (TextPaintWebpageUrlSpan[]) spanned.getSpans(0, spanned.length(), TextPaintWebpageUrlSpan.class);
            } catch (Exception unused2) {
            }
            if (textPaintWebpageUrlSpanArr != null && textPaintWebpageUrlSpanArr.length > 0) {
                linkPath3 = new LinkPath(true);
                try {
                    linkPath3.setAllowReset(false);
                    int i9 = 0;
                    while (i9 < textPaintWebpageUrlSpanArr.length) {
                        int spanStart = spanned.getSpanStart(textPaintWebpageUrlSpanArr[i9]);
                        int spanEnd = spanned.getSpanEnd(textPaintWebpageUrlSpanArr[i9]);
                        linkPath3.setCurrentLayout(staticLayout, spanStart, f);
                        int i10 = textPaintWebpageUrlSpanArr[i9].getTextPaint() != null ? textPaintWebpageUrlSpanArr[i9].getTextPaint().baselineShift : 0;
                        if (i10 != 0) {
                            i6 = i10 + AndroidUtilities.dp(i10 > 0 ? 5.0f : -2.0f);
                        } else {
                            i6 = 0;
                        }
                        linkPath3.setBaselineShift(i6);
                        staticLayout.getSelectionPath(spanStart, spanEnd, linkPath3);
                        i9++;
                        f = 0.0f;
                    }
                    linkPath3.setAllowReset(true);
                } catch (Exception unused3) {
                }
                textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
                if (textPaintMarkSpanArr != null && textPaintMarkSpanArr.length > 0) {
                    linkPath4 = new LinkPath(true);
                    try {
                        linkPath4.setAllowReset(false);
                        for (i4 = 0; i4 < textPaintMarkSpanArr.length; i4++) {
                            int spanStart2 = spanned.getSpanStart(textPaintMarkSpanArr[i4]);
                            int spanEnd2 = spanned.getSpanEnd(textPaintMarkSpanArr[i4]);
                            linkPath4.setCurrentLayout(staticLayout, spanStart2, 0.0f);
                            int i11 = textPaintMarkSpanArr[i4].getTextPaint() != null ? textPaintMarkSpanArr[i4].getTextPaint().baselineShift : 0;
                            if (i11 != 0) {
                                i5 = i11 + AndroidUtilities.dp(i11 > 0 ? 5.0f : -2.0f);
                            } else {
                                i5 = 0;
                            }
                            linkPath4.setBaselineShift(i5);
                            staticLayout.getSelectionPath(spanStart2, spanEnd2, linkPath4);
                        }
                        linkPath4.setAllowReset(true);
                    } catch (Exception unused4) {
                    }
                    linkPath = linkPath4;
                    linkPath2 = linkPath3;
                }
                linkPath = null;
                linkPath2 = linkPath3;
            }
            linkPath3 = null;
            textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
            if (textPaintMarkSpanArr != null) {
                linkPath4 = new LinkPath(true);
                linkPath4.setAllowReset(false);
                while (i4 < textPaintMarkSpanArr.length) {
                }
                linkPath4.setAllowReset(true);
                linkPath = linkPath4;
                linkPath2 = linkPath3;
            }
            linkPath = null;
            linkPath2 = linkPath3;
        } else {
            linkPath = null;
            linkPath2 = null;
        }
        DrawingText drawingText = new DrawingText(iArticleViewer);
        drawingText.textLayout = staticLayout;
        drawingText.textPath = linkPath2;
        drawingText.markPath = linkPath;
        drawingText.parentBlock = pageBlock;
        drawingText.parentText = richText;
        drawingText.spoilersPool = new Stack();
        drawingText.spoilers = new ArrayList();
        drawingText.spoilersPatchedLayout = new AtomicReference();
        if (z) {
            SpoilerEffect.addSpoilers(view, staticLayout, (Spanned) text2, drawingText.spoilersPool, drawingText.spoilers);
        }
        if (view != null) {
            ArrayList arrayList = (ArrayList) liveDrawingTexts.get(view);
            if (arrayList != null) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    DrawingText drawingText2 = (DrawingText) arrayList.get(i12);
                    if (drawingText2.parentBlock != pageBlock || (richText != null && drawingText2.parentText == richText)) {
                        drawingText2.detach(view);
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (richText != null) {
                if (arrayList == null) {
                    WeakHashMap weakHashMap = liveDrawingTexts;
                    ArrayList arrayList2 = new ArrayList();
                    weakHashMap.put(view, arrayList2);
                    arrayList = arrayList2;
                }
                arrayList.add(drawingText);
            }
            if (view.isAttachedToWindow()) {
                drawingText.attach(view);
            }
        }
        return drawingText;
    }

    @Override // org.telegram.ui.IArticleViewer
    public boolean allowTouches() {
        return this.pageSwitchAnimation == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkLayoutForLinks(WebpageAdapter webpageAdapter, MotionEvent motionEvent, View view, DrawingText drawingText, int i, int i2) {
        return checkLayoutForLinks(this, webpageAdapter, motionEvent, view, drawingText, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0227, code lost:
    
        if (r0.isShowing() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0161, code lost:
    
        r0 = new android.graphics.Path();
        r5 = r21.spoilers.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
    
        if (r5.hasNext() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0172, code lost:
    
        r6 = ((org.telegram.ui.Components.spoilers.SpoilerEffect) r5.next()).getBounds();
        r0.addRect(r6.left, r6.top, r6.right, r6.bottom, android.graphics.Path.Direction.CW);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018f, code lost:
    
        r0.computeBounds(new android.graphics.RectF(), false);
        r0 = (float) java.lang.Math.sqrt((r5.width() * r5.width()) + (r5.height() * r5.height()));
        ((org.telegram.ui.Components.spoilers.SpoilerEffect) r21.spoilers.get(0)).setOnRippleEndCallback(new org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda55(r20, r21));
        r3 = r21.spoilers.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
    
        if (r3.hasNext() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        r7 = r23;
        ((org.telegram.ui.Components.spoilers.SpoilerEffect) r3.next()).startRipple(r7, r4, r0);
        r23 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01df, code lost:
    
        r20.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
    
        if (r20.getParent() == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e8, code lost:
    
        r20.getParent().requestDisallowInterceptTouchEvent(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean checkLayoutForLinks(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, MotionEvent motionEvent, final View view, final DrawingText drawingText, int i, int i2) {
        MotionEvent motionEvent2;
        float f;
        TextStyleSpan[] textStyleSpanArr;
        int i3;
        if (!iArticleViewer.allowTouches() || view == null) {
            return false;
        }
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(view);
        if (textSelectionHelper != null && !textSelectionHelper.isSelectable(view)) {
            return false;
        }
        iArticleViewer.pressedLinkOwnerView = view;
        if (drawingText != null) {
            StaticLayout staticLayout = drawingText.textLayout;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float f2 = 2.14748365E9f;
                float f3 = 0.0f;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    f3 = Math.max(staticLayout.getLineWidth(i4), f3);
                    f2 = Math.min(staticLayout.getLineLeft(i4), f2);
                }
                float f4 = x;
                float f5 = i + f2;
                if (f4 >= f5 && f4 <= f5 + f3 && y >= i2 && y <= staticLayout.getHeight() + i2) {
                    iArticleViewer.pressedLinkOwnerLayout = drawingText;
                    iArticleViewer.pressedLayoutY = i2;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i5 = x - i;
                        int i6 = y - i2;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i6);
                            float f6 = i5;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f6);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f6 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f6) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TextPaintUrlSpan.class);
                                if (textPaintUrlSpanArr == null || textPaintUrlSpanArr.length <= 0) {
                                    f = f6;
                                } else {
                                    TextPaintUrlSpan textPaintUrlSpan = textPaintUrlSpanArr[0];
                                    int spanStart = spannable.getSpanStart(textPaintUrlSpan);
                                    int spanEnd = spannable.getSpanEnd(textPaintUrlSpan);
                                    int i7 = 1;
                                    while (i7 < textPaintUrlSpanArr.length) {
                                        TextPaintUrlSpan textPaintUrlSpan2 = textPaintUrlSpanArr[i7];
                                        TextPaintUrlSpan[] textPaintUrlSpanArr2 = textPaintUrlSpanArr;
                                        int spanStart2 = spannable.getSpanStart(textPaintUrlSpan2);
                                        float f7 = f6;
                                        int spanEnd2 = spannable.getSpanEnd(textPaintUrlSpan2);
                                        if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                            spanStart = spanStart2;
                                            spanEnd = spanEnd2;
                                            textPaintUrlSpan = textPaintUrlSpan2;
                                        }
                                        i7++;
                                        textPaintUrlSpanArr = textPaintUrlSpanArr2;
                                        f6 = f7;
                                    }
                                    f = f6;
                                    LinkSpanDrawable linkSpanDrawable = iArticleViewer.pressedLink;
                                    if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != textPaintUrlSpan) {
                                        LinkSpanDrawable linkSpanDrawable2 = iArticleViewer.pressedLink;
                                        if (linkSpanDrawable2 != null) {
                                            iArticleViewer.links.removeLink(linkSpanDrawable2);
                                        }
                                        LinkSpanDrawable linkSpanDrawable3 = new LinkSpanDrawable(textPaintUrlSpan, null, f4, y);
                                        iArticleViewer.pressedLink = linkSpanDrawable3;
                                        linkSpanDrawable3.setColor(iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhiteLinkSelection) & 872415231);
                                        iArticleViewer.links.addLink(iArticleViewer.pressedLink, iArticleViewer.pressedLinkOwnerLayout);
                                        try {
                                            LinkPath obtainNewPath = iArticleViewer.pressedLink.obtainNewPath();
                                            obtainNewPath.setCurrentLayout(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = textPaintUrlSpan.getTextPaint();
                                            int i8 = textPaint != null ? textPaint.baselineShift : 0;
                                            if (i8 != 0) {
                                                i3 = i8 + AndroidUtilities.dp(i8 > 0 ? 5.0f : -2.0f);
                                            } else {
                                                i3 = 0;
                                            }
                                            obtainNewPath.setBaselineShift(i3);
                                            staticLayout.getSelectionPath(spanStart, spanEnd, obtainNewPath);
                                            view.invalidate();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                }
                                List list = drawingText.spoilers;
                                if (list != null && !list.isEmpty() && (textStyleSpanArr = (TextStyleSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TextStyleSpan.class)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= textStyleSpanArr.length) {
                                            break;
                                        }
                                        if (textStyleSpanArr[i9].isSpoiler()) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                }
                motionEvent2 = motionEvent;
                iArticleViewer.checkLayoutForLinks(motionEvent2, view);
                return view instanceof BlockDetailsCell ? iArticleViewer.pressedLink != null : iArticleViewer.pressedLinkOwnerLayout != null;
            }
            if (motionEvent.getAction() == 1) {
                LinkSpanDrawable linkSpanDrawable4 = iArticleViewer.pressedLink;
                if (linkSpanDrawable4 != null) {
                    iArticleViewer.handleLinkClick(webpageAdapter, (TextPaintUrlSpan) linkSpanDrawable4.getSpan());
                    removePressedLink(iArticleViewer);
                }
            } else if (motionEvent.getAction() == 3) {
                ActionBarPopupWindow actionBarPopupWindow = iArticleViewer.popupWindow;
                if (actionBarPopupWindow != null) {
                }
                removePressedLink(iArticleViewer);
            }
            iArticleViewer.checkLayoutForLinks(motionEvent2, view);
            if (view instanceof BlockDetailsCell) {
            }
        }
        motionEvent2 = motionEvent;
        iArticleViewer.checkLayoutForLinks(motionEvent2, view);
        if (view instanceof BlockDetailsCell) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkLayoutForLinks$7(final View view, final DrawingText drawingText) {
        view.post(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.lambda$checkLayoutForLinks$6(ArticleViewer.DrawingText.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkLayoutForLinks$6(DrawingText drawingText, View view) {
        drawingText.spoilers.clear();
        drawingText.spoilersPatchedLayout.set(null);
        view.invalidate();
    }

    @Override // org.telegram.ui.IArticleViewer
    public void checkLayoutForLinks(MotionEvent motionEvent, View view) {
        if (motionEvent.getAction() == 0) {
            startCheckLongPress(motionEvent.getX(), motionEvent.getY(), view);
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            return;
        }
        cancelCheckLongPress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Browser.Progress makeProgress(LinkSpanDrawable linkSpanDrawable, DrawingText drawingText) {
        return makeProgress(this, linkSpanDrawable, drawingText);
    }

    private static Browser.Progress makeProgress(final IArticleViewer iArticleViewer, final LinkSpanDrawable linkSpanDrawable, final DrawingText drawingText) {
        if (linkSpanDrawable == null) {
            return null;
        }
        return new Browser.Progress() { // from class: org.telegram.ui.ArticleViewer.13
            @Override // org.telegram.messenger.browser.Browser.Progress
            public void init() {
                IArticleViewer iArticleViewer2 = IArticleViewer.this;
                DrawingText drawingText2 = drawingText;
                iArticleViewer2.loadingText = drawingText2;
                iArticleViewer2.loadingLinkView = drawingText2 != null ? drawingText2.latestParentView : null;
                IArticleViewer.this.loadingLink = (TextPaintUrlSpan) linkSpanDrawable.getSpan();
                IArticleViewer iArticleViewer3 = IArticleViewer.this;
                iArticleViewer3.links.removeLoading(iArticleViewer3.loadingLinkDrawable, true);
                DrawingText drawingText3 = drawingText;
                if (drawingText3 != null) {
                    IArticleViewer.this.loadingLinkDrawable = LinkSpanDrawable.LinkCollector.makeLoading(drawingText3.textLayout, linkSpanDrawable.getSpan(), 0.0f);
                    int themedColor = IArticleViewer.this.getThemedColor(Theme.key_chat_linkSelectBackground);
                    IArticleViewer.this.loadingLinkDrawable.setColors(Theme.multAlpha(themedColor, 0.8f), Theme.multAlpha(themedColor, 1.3f), Theme.multAlpha(themedColor, 1.0f), Theme.multAlpha(themedColor, 4.0f));
                    IArticleViewer.this.loadingLinkDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    IArticleViewer iArticleViewer4 = IArticleViewer.this;
                    iArticleViewer4.links.addLoading(iArticleViewer4.loadingLinkDrawable, drawingText);
                }
                View view = IArticleViewer.this.loadingLinkView;
                if (view != null) {
                    view.invalidate();
                }
                super.init();
            }

            @Override // org.telegram.messenger.browser.Browser.Progress
            public void end() {
                IArticleViewer iArticleViewer2 = IArticleViewer.this;
                iArticleViewer2.links.removeLoading(iArticleViewer2.loadingLinkDrawable, true);
                View view = IArticleViewer.this.loadingLinkView;
                if (view != null) {
                    view.invalidate();
                }
                IArticleViewer.this.loadingLink = null;
                super.end();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removePressedLink(IArticleViewer iArticleViewer) {
        if (iArticleViewer.pressedLink == null && iArticleViewer.pressedLinkOwnerView == null) {
            return;
        }
        View view = iArticleViewer.pressedLinkOwnerView;
        iArticleViewer.links.clear();
        iArticleViewer.pressedLink = null;
        iArticleViewer.pressedLinkOwnerLayout = null;
        iArticleViewer.pressedLinkOwnerView = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public void openWebpageUrl(final String str, final String str2, final Browser.Progress progress) {
        Activity activity = this.parentActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout != null && pageLayout.isLocal()) {
            String string = LocaleController.getString(R.string.OpenUrlAlert2);
            int indexOf = string.indexOf("%");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new URLSpan(str), indexOf, str.length() + indexOf, 33);
            }
            new AlertDialog.Builder(this.parentActivity, getResourcesProvider()).setTitle(LocaleController.getString(R.string.OpenUrlTitle)).setMessage(spannableStringBuilder).setMessageTextViewClickable(false).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda51
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    ArticleViewer.this.lambda$openWebpageUrl$8(str, str2, progress, alertDialog, i);
                }
            }).show();
            return;
        }
        openWebpageUrlInternal(str, str2, progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrl$8(String str, String str2, Browser.Progress progress, AlertDialog alertDialog, int i) {
        openWebpageUrlInternal(str, str2, progress);
    }

    private void openWebpageUrlInternal(final String str, final String str2, final Browser.Progress progress) {
        Sheet sheet;
        Browser.Progress progress2 = this.loadingProgress;
        if (progress2 != null) {
            progress2.cancel();
        }
        this.loadingProgress = progress;
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        final boolean[] zArr = new boolean[1];
        if (Browser.openInExternalApp(this.parentActivity, str, false)) {
            if (!this.pagesStack.isEmpty() || (sheet = this.sheet) == null) {
                return;
            }
            sheet.dismiss(false);
            return;
        }
        final Utilities.Callback0Return callback0Return = new Utilities.Callback0Return() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda64
            @Override // org.telegram.messenger.Utilities.Callback0Return
            public final Object run() {
                Boolean lambda$openWebpageUrlInternal$10;
                lambda$openWebpageUrlInternal$10 = ArticleViewer.this.lambda$openWebpageUrlInternal$10(str, zArr, progress);
                return lambda$openWebpageUrlInternal$10;
            }
        };
        final int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        final TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda65
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArticleViewer.this.lambda$openWebpageUrlInternal$12(i, progress, str2, callback0Return, tL_messages_getWebPage, tLObject, tL_error);
            }
        });
        if (progress != null) {
            progress.onCancel(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda66
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$openWebpageUrlInternal$13(i, progress);
                }
            });
            progress.init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$openWebpageUrlInternal$10(String str, boolean[] zArr, final Browser.Progress progress) {
        if (!Browser.isInternalUri(Uri.parse(str), zArr)) {
            return Boolean.FALSE;
        }
        if (progress != null) {
            progress.onEnd(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda69
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$openWebpageUrlInternal$9(progress);
                }
            });
        } else {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
        }
        Browser.openUrl(this.parentActivity, Uri.parse(str), true, true, false, progress, null, true, true, false);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrlInternal$9(Browser.Progress progress) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrlInternal$12(final int i, final Browser.Progress progress, final String str, final Utilities.Callback0Return callback0Return, final TLRPC.TL_messages_getWebPage tL_messages_getWebPage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$openWebpageUrlInternal$11(i, progress, tLObject, str, callback0Return, tL_messages_getWebPage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrlInternal$11(int i, Browser.Progress progress, TLObject tLObject, String str, Utilities.Callback0Return callback0Return, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        if (this.openUrlReqId == 0 || i != this.lastReqId) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        this.openUrlReqId = 0;
        showProgressView(true, false);
        if (this.isVisible) {
            if (tLObject instanceof TLRPC.TL_messages_webPage) {
                TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_webPage.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_webPage.chats, false);
                TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                if (webPage != null && (webPage.cached_page instanceof TL_iv.TL_page)) {
                    addPageToStack(webPage, str, 1);
                    return;
                } else {
                    if (((Boolean) callback0Return.run()).booleanValue()) {
                        return;
                    }
                    if (MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                        addPageToStack(tL_messages_getWebPage.url, 1);
                        return;
                    } else {
                        Browser.openUrl(this.parentActivity, tL_messages_getWebPage.url);
                        return;
                    }
                }
            }
            if (tLObject instanceof TLRPC.TL_webPage) {
                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                    addPageToStack(tL_webPage, str, 1);
                    return;
                }
            }
            if (((Boolean) callback0Return.run()).booleanValue()) {
                return;
            }
            if (MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                addPageToStack(tL_messages_getWebPage.url, 1);
            } else {
                Browser.openUrl(this.parentActivity, tL_messages_getWebPage.url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrlInternal$13(int i, Browser.Progress progress) {
        if (this.lastReqId == i && this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        BlockAudioCell blockAudioCell;
        MessageObject messageObject;
        if (i == NotificationCenter.messagePlayingDidStart) {
            if (this.pages == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                PageLayout[] pageLayoutArr = this.pages;
                if (i3 >= pageLayoutArr.length) {
                    return;
                }
                int childCount = pageLayoutArr[i3].listView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.pages[i3].listView.getChildAt(i4);
                    if (childAt instanceof BlockAudioCell) {
                        ((BlockAudioCell) childAt).updateButtonState(true);
                    }
                }
                i3++;
            }
        } else if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.pages == null) {
                return;
            }
            int i5 = 0;
            while (true) {
                PageLayout[] pageLayoutArr2 = this.pages;
                if (i5 >= pageLayoutArr2.length) {
                    return;
                }
                int childCount2 = pageLayoutArr2[i5].listView.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = this.pages[i5].listView.getChildAt(i6);
                    if (childAt2 instanceof BlockAudioCell) {
                        BlockAudioCell blockAudioCell2 = (BlockAudioCell) childAt2;
                        if (blockAudioCell2.getMessageObject() != null) {
                            blockAudioCell2.updateButtonState(true);
                        }
                    }
                }
                i5++;
            }
        } else if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            if (this.pages == null) {
                return;
            }
            int i7 = 0;
            while (true) {
                PageLayout[] pageLayoutArr3 = this.pages;
                if (i7 >= pageLayoutArr3.length) {
                    return;
                }
                int childCount3 = pageLayoutArr3[i7].listView.getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 < childCount3) {
                        View childAt3 = this.pages[i7].listView.getChildAt(i8);
                        if ((childAt3 instanceof BlockAudioCell) && (messageObject = (blockAudioCell = (BlockAudioCell) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null) {
                                messageObject.audioProgress = playingMessageObject.audioProgress;
                                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                blockAudioCell.updatePlayingMessageProgress();
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                i7++;
            }
        } else {
            if (i != NotificationCenter.emojiLoaded || this.pages == null) {
                return;
            }
            int i9 = 0;
            while (true) {
                PageLayout[] pageLayoutArr4 = this.pages;
                if (i9 >= pageLayoutArr4.length) {
                    return;
                }
                int childCount4 = pageLayoutArr4[i9].listView.getChildCount();
                for (int i10 = 0; i10 < childCount4; i10++) {
                    View childAt4 = this.pages[i9].listView.getChildAt(i10);
                    if (childAt4 instanceof BlockTableCell) {
                        ((BlockTableCell) childAt4).tableLayout.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i9++;
            }
        }
    }

    public void updateThemeColors(float f) {
        refreshThemeColors();
        updatePaintColors(this);
        if (this.windowView != null) {
            this.pages[0].listView.invalidateViews();
            this.pages[1].listView.invalidateViews();
            this.windowView.invalidate();
            this.searchPanel.invalidate();
            if (f == 1.0f) {
                this.pages[0].adapter.notifyDataSetChanged();
                this.pages[1].adapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePaintSize() {
        for (int i = 0; i < 2; i++) {
            this.pages[i].adapter.notifyDataSetChanged();
            this.pages[i].adapter.resetCachedHeights();
        }
    }

    public static void updatePaintColors(IArticleViewer iArticleViewer) {
        TextPaint textPaint = listTextPointerPaint;
        if (textPaint != null) {
            textPaint.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint2 = listTextNumPaint;
        if (textPaint2 != null) {
            textPaint2.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint3 = embedPostAuthorPaint;
        if (textPaint3 != null) {
            textPaint3.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint4 = channelNamePaint;
        if (textPaint4 != null) {
            textPaint4.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint5 = channelNamePhotoPaint;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = relatedArticleHeaderPaint;
        if (textPaint6 != null) {
            textPaint6.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint7 = relatedArticleTextPaint;
        if (textPaint7 != null) {
            textPaint7.setColor(iArticleViewer.getGrayTextColor());
        }
        TextPaint textPaint8 = embedPostDatePaint;
        if (textPaint8 != null) {
            textPaint8.setColor(iArticleViewer.getGrayTextColor());
        }
        createPaint(iArticleViewer, true);
        resources.updatePaintColors(iArticleViewer);
    }

    public void setParentActivity(final Activity activity, BaseFragment baseFragment) {
        Sheet sheet;
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        this.parentFragment = baseFragment;
        int currentAccount = (baseFragment == null || (baseFragment instanceof EmptyBaseFragment)) ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.parentActivity;
        if (activity2 == activity || (activity2 != null && this.isSheet && (sheet = this.sheet) != null && sheet.dialog != null)) {
            updatePaintColors(this);
            refreshThemeColors();
            return;
        }
        this.parentActivity = activity;
        this.selectedFont = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        createPaint(this, false);
        this.backgroundPaint = new Paint();
        this.layerShadowDrawable = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.slideDotDrawable = activity.getResources().getDrawable(R.drawable.slide_dot_small);
        this.slideDotBigDrawable = activity.getResources().getDrawable(R.drawable.slide_dot_big);
        this.scrimPaint = new Paint();
        WindowView windowView = new WindowView(activity);
        this.windowView = windowView;
        windowView.setWillNotDraw(false);
        this.windowView.setClipChildren(true);
        this.windowView.setFocusable(false);
        FrameLayout frameLayout = new FrameLayout(activity) { // from class: org.telegram.ui.ArticleViewer.14
            /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
            @Override // android.view.ViewGroup
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected boolean drawChild(Canvas canvas, View view, long j) {
                int i;
                int i2;
                if (ArticleViewer.this.windowView != null && (ArticleViewer.this.windowView.movingPage || ArticleViewer.this.windowView.openingPage)) {
                    int measuredWidth = getMeasuredWidth();
                    int translationX = (int) ArticleViewer.this.pages[0].getTranslationX();
                    PageLayout[] pageLayoutArr = ArticleViewer.this.pages;
                    if (view == pageLayoutArr[1]) {
                        i = translationX;
                    } else {
                        i = measuredWidth;
                        if (view == pageLayoutArr[0]) {
                            i2 = translationX;
                            int save = canvas.save();
                            canvas.clipRect(i2, 0, i, getHeight());
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restoreToCount(save);
                            if (translationX != 0) {
                                PageLayout[] pageLayoutArr2 = ArticleViewer.this.pages;
                                if (view == pageLayoutArr2[0]) {
                                    float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                                    ArticleViewer.this.layerShadowDrawable.setBounds(translationX - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                                    ArticleViewer.this.layerShadowDrawable.setAlpha((int) (max * 255.0f));
                                    ArticleViewer.this.layerShadowDrawable.draw(canvas);
                                } else if (view == pageLayoutArr2[1]) {
                                    float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                                    ArticleViewer.this.scrimPaint.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                                    canvas.drawRect(i2, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                                }
                            }
                            return drawChild;
                        }
                    }
                    i2 = 0;
                    int save2 = canvas.save();
                    canvas.clipRect(i2, 0, i, getHeight());
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    canvas.restoreToCount(save2);
                    if (translationX != 0) {
                    }
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override // android.view.View
            public void invalidate() {
                super.invalidate();
            }
        };
        this.containerView = frameLayout;
        this.windowView.addView(frameLayout, LayoutHelper.createFrame(-1, -1, 51));
        if (this.sheet == null) {
            this.windowView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$14;
                    lambda$setParentActivity$14 = ArticleViewer.lambda$setParentActivity$14(view, windowInsets);
                    return lambda$setParentActivity$14;
                }
            });
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.fullscreenVideoContainer = frameLayout2;
        frameLayout2.setBackgroundColor(-16777216);
        this.fullscreenVideoContainer.setVisibility(4);
        this.windowView.addView(this.fullscreenVideoContainer, LayoutHelper.createFrame(-1, -1.0f));
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(activity);
        this.fullscreenAspectRatioView = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setVisibility(0);
        this.fullscreenAspectRatioView.setBackgroundColor(-16777216);
        this.fullscreenVideoContainer.addView(this.fullscreenAspectRatioView, LayoutHelper.createFrame(-1, -1, 17));
        this.fullscreenTextureView = new TextureView(activity);
        this.pages = new PageLayout[2];
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                break;
            }
            final PageLayout pageLayout = new PageLayout(activity, getResourcesProvider());
            pageLayoutArr[i] = pageLayout;
            pageLayout.setVisibility(i == 0 ? 0 : 8);
            this.containerView.addView(pageLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            pageLayout.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda14
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                public final boolean onItemClick(View view, int i2) {
                    boolean lambda$setParentActivity$15;
                    lambda$setParentActivity$15 = ArticleViewer.this.lambda$setParentActivity$15(view, i2);
                    return lambda$setParentActivity$15;
                }
            });
            pageLayout.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda15
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ boolean hasDoubleTap(View view, int i2) {
                    return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i2);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ void onDoubleTap(View view, int i2, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i2, f, f2);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public final void onItemClick(View view, int i2, float f, float f2) {
                    ArticleViewer.this.lambda$setParentActivity$18(pageLayout, view, i2, f, f2);
                }
            });
            i++;
        }
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.bulletinContainer = frameLayout3;
        FrameLayout frameLayout4 = this.containerView;
        Sheet sheet2 = this.sheet;
        frameLayout4.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, (sheet2 == null || sheet2.halfSize()) ? 0.0f : 56.0f, 0.0f, 0.0f));
        this.headerPaint.setColor(-16777216);
        this.statusBarPaint.setColor(-16777216);
        this.headerProgressPaint.setColor(-14408666);
        this.navigationBarPaint.setColor(-16777216);
        WebActionBar webActionBar = new WebActionBar(activity, getResourcesProvider()) { // from class: org.telegram.ui.ArticleViewer.15
            @Override // org.telegram.ui.web.WebActionBar
            protected void onSearchUpdated(String str) {
                ArticleViewer.this.processSearch(str.toLowerCase());
            }

            @Override // org.telegram.ui.web.WebActionBar
            protected void onColorsUpdated() {
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override // org.telegram.ui.web.WebActionBar
            protected void onScrolledProgress(float f) {
                ArticleViewer.this.pages[0].addProgress(f);
            }

            @Override // org.telegram.ui.web.WebActionBar
            protected void onAddressColorsChanged(int i2, int i3) {
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setColors(i2, i3);
                }
            }

            @Override // org.telegram.ui.web.WebActionBar
            protected void onAddressingProgress(float f) {
                super.onAddressingProgress(f);
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setOpenProgress(f);
                }
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override // org.telegram.ui.web.WebActionBar, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                ((ViewGroup.MarginLayoutParams) ArticleViewer.this.addressBarList.getLayoutParams()).topMargin = getMeasuredHeight();
            }

            @Override // org.telegram.ui.web.WebActionBar
            public void showAddress(boolean z, boolean z2) {
                super.showAddress(z, z2);
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setOpened(z);
                }
            }

            @Override // org.telegram.ui.web.WebActionBar
            protected WebInstantView.Loader getInstantViewLoader() {
                return ArticleViewer.this.pages[0].loadInstant();
            }
        };
        this.actionBar = webActionBar;
        webActionBar.occupyStatusBar(this.sheet != null);
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        this.actionBar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$24(activity, view);
            }
        });
        this.actionBar.addressEditText.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.ArticleViewer.16
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (ArticleViewer.this.actionBar.isAddressing() && ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setInput(editable == null ? null : editable.toString());
                }
            }
        });
        AddressBarList addressBarList = new AddressBarList(activity);
        this.addressBarList = addressBarList;
        addressBarList.setOpenProgress(0.0f);
        this.addressBarList.listView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.ArticleViewer.17
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (ArticleViewer.this.addressBarList.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.addressEditText);
                }
            }
        });
        this.containerView.addView(this.addressBarList, LayoutHelper.createFrame(-1, -1.0f));
        this.lineProgressTickRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$25();
            }
        };
        this.actionBar.backButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$26(view);
            }
        });
        this.actionBar.backButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda19
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$setParentActivity$32;
                lambda$setParentActivity$32 = ArticleViewer.this.lambda$setParentActivity$32(view);
                return lambda$setParentActivity$32;
            }
        });
        this.actionBar.setMenuListener(new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda20
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArticleViewer.this.lambda$setParentActivity$39(activity, (Integer) obj);
            }
        });
        this.actionBar.forwardButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$40(view);
            }
        });
        FrameLayout frameLayout5 = new FrameLayout(this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.20
            @Override // android.view.View
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchPanel = frameLayout5;
        frameLayout5.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda22
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setParentActivity$41;
                lambda$setParentActivity$41 = ArticleViewer.lambda$setParentActivity$41(view, motionEvent);
                return lambda$setParentActivity$41;
            }
        });
        this.searchPanel.setWillNotDraw(false);
        this.searchPanel.setTranslationY(AndroidUtilities.dp(51.0f));
        this.searchPanel.setVisibility(4);
        this.searchPanel.setFocusable(true);
        this.searchPanel.setFocusableInTouchMode(true);
        this.searchPanel.setClickable(true);
        this.searchPanel.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.containerView.addView(this.searchPanel, LayoutHelper.createFrame(-1, 51, 80));
        new KeyboardNotifier(this.windowView, new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda9
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArticleViewer.this.lambda$setParentActivity$42((Integer) obj);
            }
        });
        ImageView imageView = new ImageView(this.parentActivity);
        this.searchUpButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.searchUpButton.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.searchUpButton;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        int themedColor = getThemedColor(i2);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ImageView imageView3 = this.searchUpButton;
        int i3 = Theme.key_actionBarActionModeDefaultSelector;
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i3), 1));
        this.searchPanel.addView(this.searchUpButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.searchUpButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$43(view);
            }
        });
        this.searchUpButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView4;
        imageView4.setScaleType(scaleType);
        this.searchDownButton.setImageResource(R.drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), mode));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i3), 1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$44(view);
            }
        });
        this.searchDownButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        AnimatedTextView animatedTextView = new AnimatedTextView(this.parentActivity, true, true, true);
        this.searchCountText = animatedTextView;
        animatedTextView.setScaleProperty(0.6f);
        this.searchCountText.setAnimationProperties(0.4f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchCountText.setTextColor(getThemedColor(i2));
        this.searchCountText.setTextSize(AndroidUtilities.dp(15.0f));
        this.searchCountText.setTypeface(AndroidUtilities.bold());
        this.searchCountText.setGravity(3);
        this.searchCountText.getDrawable().setOverrideFullWidth(AndroidUtilities.displaySize.x);
        this.searchPanel.addView(this.searchCountText, LayoutHelper.createFrame(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int color = this.sheet == null ? Theme.getColor(Theme.key_windowBackgroundGray, null, true) : getThemedColor(Theme.key_windowBackgroundGray);
        int i4 = (AndroidUtilities.computePerceivedBrightness(color) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.navigationBarPaint.setColor(color);
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.systemUiVisibility = i4;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.pages[0].listView);
        if (MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled()) {
            this.textSelectionHelper.setOnTranslate(new TextSelectionHelper.OnTranslateListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda12
                @Override // org.telegram.ui.Cells.TextSelectionHelper.OnTranslateListener
                public final void run(CharSequence charSequence, String str, String str2, Runnable runnable) {
                    ArticleViewer.this.lambda$setParentActivity$45(charSequence, str, str2, runnable);
                }
            });
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.pages[0].layoutManager;
        articleTextSelectionHelper2.setCallback(new TextSelectionHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.21
            @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
            public void onStateChanged(boolean z) {
                if (z) {
                    ArticleViewer.this.actionBar.showSearch(false, true);
                }
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
            public void onTextCopied() {
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    BulletinFactory.of(ArticleViewer.this.containerView, null).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        FrameLayout frameLayout6 = this.containerView;
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(frameLayout6, frameLayout6);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new PinchToZoomHelper.ClipBoundsListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.PinchToZoomHelper.ClipBoundsListener
            public final void getClipTopBottom(float[] fArr) {
                ArticleViewer.this.lambda$setParentActivity$46(fArr);
            }
        });
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.22
            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public /* synthetic */ TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.-CC.$default$getCurrentTextureView(this);
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public /* synthetic */ void onZoomFinished(MessageObject messageObject) {
                PinchToZoomHelper.Callback.-CC.$default$onZoomFinished(this, messageObject);
            }

            @Override // org.telegram.ui.PinchToZoomHelper.Callback
            public void onZoomStarted(MessageObject messageObject) {
                PageLayout pageLayout2 = ArticleViewer.this.pages[0];
                if (pageLayout2 != null) {
                    pageLayout2.listView.cancelClickRunnables(true);
                }
            }
        });
        this.backgroundPaint.setColor(getThemedColor(Theme.key_iv_background));
        updatePaintColors(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$setParentActivity$14(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setParentActivity$15(View view, int i) {
        if (!(view instanceof BlockRelatedArticlesCell)) {
            return false;
        }
        BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
        showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$18(PageLayout pageLayout, View view, int i, float f, float f2) {
        if (this.sheet == null || i - 1 >= 0) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (articleTextSelectionHelper != null) {
                if (articleTextSelectionHelper.isInSelectionMode()) {
                    this.textSelectionHelper.clear();
                    return;
                }
                this.textSelectionHelper.clear();
            }
            WebpageAdapter adapter = pageLayout.getAdapter();
            if ((view instanceof ReportCell) && adapter.currentPage != null) {
                ReportCell reportCell = (ReportCell) view;
                if (this.previewsReqId == 0) {
                    if ((!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) && !reportCell.web) {
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat("previews");
                        if (!(userOrChat instanceof TLRPC.TL_user)) {
                            final int i2 = UserConfig.selectedAccount;
                            final long j = adapter.currentPage.id;
                            showProgressView(true, true);
                            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                            tL_contacts_resolveUsername.username = "previews";
                            this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda39
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    ArticleViewer.this.lambda$setParentActivity$17(i2, j, tLObject, tL_error);
                                }
                            });
                            return;
                        }
                        openPreviewsChat((TLRPC.User) userOrChat, adapter.currentPage.id);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i < 0 || i >= adapter.localBlocks.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.localBlocks.get(i);
            TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(pageBlock);
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(this.currentAccount).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) lastNonListPageBlock).channel), this.parentFragment, 2);
                close(false, true);
                return;
            }
            if (lastNonListPageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null, null);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                View lastNonListCell = getLastNonListCell(view);
                if (lastNonListCell instanceof BlockDetailsCell) {
                    this.pressedLinkOwnerLayout = null;
                    this.pressedLinkOwnerView = null;
                    if (adapter.blocks.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                    pageblockdetails.open = !pageblockdetails.open;
                    int itemCount = adapter.getItemCount();
                    adapter.updateRows();
                    int abs = Math.abs(adapter.getItemCount() - itemCount);
                    BlockDetailsCell blockDetailsCell = (BlockDetailsCell) lastNonListCell;
                    blockDetailsCell.arrow.setAnimationProgressAnimated(pageblockdetails.open ? 0.0f : 1.0f);
                    blockDetailsCell.invalidate();
                    if (abs != 0) {
                        if (pageblockdetails.open) {
                            adapter.notifyItemRangeInserted(i + 1, abs);
                        } else {
                            adapter.notifyItemRangeRemoved(i + 1, abs);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$17(final int i, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$16(tLObject, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$16(TLObject tLObject, int i, long j) {
        if (this.previewsReqId == 0) {
            return;
        }
        this.previewsReqId = 0;
        showProgressView(true, false);
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            if (tL_contacts_resolvedPeer.users.isEmpty()) {
                return;
            }
            openPreviewsChat(tL_contacts_resolvedPeer.users.get(0), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$24(final Activity activity, View view) {
        if (this.actionBar.longClicked) {
            return;
        }
        final PageLayout pageLayout = this.pages[0];
        if (pageLayout.isWeb()) {
            if (pageLayout.getWebView() == null || this.actionBar.isAddressing()) {
                return;
            }
            if (this.addressBarList != null) {
                BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
                String title = webView != null ? webView.getTitle() : null;
                final String magic2tonsite = BotWebViewContainer.magic2tonsite(webView != null ? webView.getUrl() : null);
                AddressBarList addressBarList = this.addressBarList;
                Bitmap favicon = webView != null ? webView.getFavicon() : null;
                if (TextUtils.isEmpty(title)) {
                    title = LocaleController.getString(R.string.WebEmpty);
                }
                addressBarList.setCurrent(favicon, title, TextUtils.isEmpty(magic2tonsite) ? "about:blank" : magic2tonsite, new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda32
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$19(magic2tonsite);
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ArticleViewer.this.lambda$setParentActivity$20(pageLayout, activity, (String) obj);
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda34
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ArticleViewer.this.lambda$setParentActivity$21((String) obj);
                    }
                }, new ArticleViewer$$ExternalSyntheticLambda35(this), new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda36
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ArticleViewer.this.lambda$setParentActivity$22(magic2tonsite, pageLayout, view2);
                    }
                });
            }
            this.actionBar.showAddress("", new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda37
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ArticleViewer.lambda$setParentActivity$23(ArticleViewer.PageLayout.this, activity, (String) obj);
                }
            });
            return;
        }
        if (this.sheet != null) {
            SmoothScroller smoothScroller = new SmoothScroller(activity);
            if (this.sheet.halfSize()) {
                smoothScroller.setTargetPosition(1);
                smoothScroller.setOffset(-AndroidUtilities.dp(32.0f));
            } else {
                smoothScroller.setTargetPosition(0);
            }
            pageLayout.layoutManager.startSmoothScroll(smoothScroller);
            return;
        }
        pageLayout.listView.smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$19(String str) {
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        editTextBoldCursor.setText(str);
        EditTextBoldCursor editTextBoldCursor2 = this.actionBar.addressEditText;
        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$20(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int i = 0;
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i2]), length);
            i = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i2]), i);
        }
        this.actionBar.showAddress(false, true);
        Uri uriParseSafe = Utilities.uriParseSafe(str);
        if ((uRLSpanArr.length > 0 && length == 0 && i > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                str = Browser.replace(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
            }
            pageLayout.getWebView().loadUrl(str);
            return;
        }
        AddressBarList.pushRecentSearch(activity, str);
        pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$21(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionBar.addressEditText.setText(str);
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$22(String str, PageLayout pageLayout, View view) {
        this.actionBar.showAddress(false, true);
        AndroidUtilities.hideKeyboard(this.actionBar.addressEditText);
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(pageLayout.webViewContainer, getResourcesProvider()).createCopyLinkBulletin().show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setParentActivity$23(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int i = 0;
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i2]), length);
            i = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i2]), i);
        }
        Uri uriParseSafe = Utilities.uriParseSafe(str);
        if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
            if ((uRLSpanArr.length > 0 && length == 0 && i > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                    str = Browser.replace(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                }
                pageLayout.getWebView().loadUrl(str);
                return;
            }
            AddressBarList.pushRecentSearch(activity, str);
            pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$25() {
        float currentProgress = 0.7f - this.actionBar.lineProgressView.getCurrentProgress();
        if (currentProgress > 0.0f) {
            float f = currentProgress < 0.25f ? 0.01f : 0.02f;
            LineProgressView lineProgressView = this.actionBar.lineProgressView;
            lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$26(View view) {
        if (this.actionBar.isSearching()) {
            this.actionBar.showSearch(false, true);
            return;
        }
        if (this.actionBar.isAddressing()) {
            this.actionBar.showAddress(false, true);
            return;
        }
        if (isFirstArticle() && this.pages[0].hasBackButton()) {
            this.pages[0].back();
            return;
        }
        if (this.pagesStack.size() > 1) {
            goBack();
            return;
        }
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(false);
        } else {
            close(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setParentActivity$32(View view) {
        if (this.pages[0] == null) {
            return false;
        }
        final float rotation = this.actionBar.backButtonDrawable.getRotation();
        Sheet sheet = this.sheet;
        final ItemOptions makeOptions = ItemOptions.makeOptions(sheet != null ? sheet.windowView : this.windowView, view);
        int color = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_iv_background) : this.pages[0].getBackgroundColor();
        int color2 = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText) : AndroidUtilities.computePerceivedBrightness(this.pages[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
        int multAlpha = Theme.multAlpha(color2, 0.65f);
        final BotWebViewContainer.MyWebView webView = this.pages[0].getWebView();
        int i = 3;
        if (webView != null) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            final int currentIndex = copyBackForwardList.getCurrentIndex();
            if (copyBackForwardList.getCurrentIndex() > 0) {
                final int i2 = 0;
                while (i2 < currentIndex) {
                    WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i2);
                    makeOptions.add(itemAtIndex.getTitle(), new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArticleViewer.lambda$setParentActivity$27(currentIndex, i2, webView);
                        }
                    });
                    ActionBarMenuSubItem last = makeOptions.getLast();
                    if (last != null) {
                        last.setSubtext(itemAtIndex.getUrl());
                        final Bitmap favicon = webView.getFavicon(itemAtIndex.getUrl());
                        if (favicon == null) {
                            favicon = itemAtIndex.getFavicon();
                        }
                        final Paint paint = new Paint(i);
                        last.setTextAndIcon(itemAtIndex.getTitle(), 0, new Drawable() { // from class: org.telegram.ui.ArticleViewer.18
                            @Override // android.graphics.drawable.Drawable
                            public int getOpacity() {
                                return -2;
                            }

                            @Override // android.graphics.drawable.Drawable
                            public void setAlpha(int i3) {
                            }

                            @Override // android.graphics.drawable.Drawable
                            public void setColorFilter(ColorFilter colorFilter) {
                            }

                            @Override // android.graphics.drawable.Drawable
                            public void draw(Canvas canvas) {
                                if (favicon != null) {
                                    canvas.save();
                                    canvas.translate(getBounds().left, getBounds().top);
                                    canvas.scale(getBounds().width() / favicon.getWidth(), getBounds().height() / favicon.getHeight());
                                    canvas.drawBitmap(favicon, 0.0f, 0.0f, paint);
                                    canvas.restore();
                                }
                            }

                            @Override // android.graphics.drawable.Drawable
                            public int getIntrinsicHeight() {
                                return AndroidUtilities.dp(24.0f);
                            }

                            @Override // android.graphics.drawable.Drawable
                            public int getIntrinsicWidth() {
                                return AndroidUtilities.dp(24.0f);
                            }
                        });
                        last.setTextColor(color2);
                        last.setSubtextColor(multAlpha);
                    }
                    i2++;
                    i = 3;
                }
            }
        }
        for (final int size = this.pagesStack.size() - 2; size >= 0; size--) {
            Object obj = this.pagesStack.get(size);
            if (obj instanceof CachedWeb) {
                CachedWeb cachedWeb = (CachedWeb) obj;
                makeOptions.add(cachedWeb.getTitle(), new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$28(size);
                    }
                });
                ActionBarMenuSubItem last2 = makeOptions.getLast();
                if (last2 != null) {
                    last2.setSubtext(cachedWeb.lastUrl);
                    final Bitmap favicon2 = webView != null ? webView.getFavicon(cachedWeb.lastUrl) : null;
                    if (favicon2 == null) {
                        favicon2 = cachedWeb.favicon;
                    }
                    final Paint paint2 = new Paint(3);
                    last2.setTextAndIcon(cachedWeb.getTitle(), 0, new Drawable() { // from class: org.telegram.ui.ArticleViewer.19
                        @Override // android.graphics.drawable.Drawable
                        public int getOpacity() {
                            return -2;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void setAlpha(int i3) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void setColorFilter(ColorFilter colorFilter) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public void draw(Canvas canvas) {
                            if (favicon2 != null) {
                                canvas.save();
                                canvas.translate(getBounds().left, getBounds().top);
                                canvas.scale(getBounds().width() / favicon2.getWidth(), getBounds().height() / favicon2.getHeight());
                                canvas.drawBitmap(favicon2, 0.0f, 0.0f, paint2);
                                canvas.restore();
                            }
                        }

                        @Override // android.graphics.drawable.Drawable
                        public int getIntrinsicHeight() {
                            return AndroidUtilities.dp(24.0f);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public int getIntrinsicWidth() {
                            return AndroidUtilities.dp(24.0f);
                        }
                    });
                    last2.setTextColor(color2);
                    last2.setSubtextColor(multAlpha);
                    last2.setColors(color2, color2);
                }
            } else if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                makeOptions.add(webPage.title, new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$29(size);
                    }
                });
                ActionBarMenuSubItem last3 = makeOptions.getLast();
                if (last3 != null) {
                    last3.setTextAndIcon(webPage.title, R.drawable.msg_instant);
                    last3.setTextColor(color2);
                    if (!TextUtils.isEmpty(webPage.site_name)) {
                        last3.setSubtext(webPage.site_name);
                    }
                    last3.setSubtextColor(multAlpha);
                    last3.imageView.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                    last3.imageView.setScaleX(1.45f);
                    last3.imageView.setScaleY(1.45f);
                    last3.setColors(color2, color2);
                }
            }
        }
        makeOptions.setScrimViewBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), this.actionBar.getBackgroundColor()));
        makeOptions.setBackgroundColor(color);
        makeOptions.updateColors();
        if (makeOptions.getItemsCount() <= 0) {
            return false;
        }
        checkScrollAnimated(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$31(makeOptions, rotation);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setParentActivity$27(int i, int i2, BotWebViewContainer.MyWebView myWebView) {
        for (int i3 = 0; i3 < i - i2; i3++) {
            myWebView.goBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$31(ItemOptions itemOptions, final float f) {
        this.actionBar.backButtonDrawable.setRotation(0.0f, true);
        itemOptions.setOnDismiss(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$30(f);
            }
        });
        itemOptions.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$30(float f) {
        this.actionBar.backButtonDrawable.setRotation(f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$39(Activity activity, Integer num) {
        WebInstantView.Loader loader;
        final String str;
        File file;
        String str2;
        FrameLayout frameLayout;
        String str3;
        if ((this.pages[0].isArticle() && this.pages[0].adapter.currentPage == null) || this.parentActivity == null) {
            return;
        }
        if (num.intValue() == 1) {
            WebActionBar webActionBar = this.actionBar;
            int dp = AndroidUtilities.dp(56.0f);
            this.currentHeaderHeight = dp;
            webActionBar.setHeight(dp);
            this.actionBar.showSearch(true, true);
            return;
        }
        String str4 = null;
        str4 = null;
        if (num.intValue() == 2) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                } else {
                    str3 = this.pages[0].getWebView().getUrl();
                }
            } else if (this.pages[0].adapter.currentPage == null) {
                return;
            } else {
                str3 = this.pages[0].adapter.currentPage.url;
            }
            String magic2tonsite = BotWebViewContainer.magic2tonsite(str3);
            showDialog(new ShareAlert(this.parentActivity, null, magic2tonsite, false, magic2tonsite, false, AndroidUtilities.computePerceivedBrightness(this.actionBar.getBackgroundColor()) < 0.721f ? new DarkThemeResourceProvider() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                }
                str2 = this.pages[0].getWebView().getUrl();
                frameLayout = this.pages[0].webViewContainer;
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                str2 = this.pages[0].adapter.currentPage.url;
                frameLayout = this.pages[0];
            }
            addBookmark(str2, this.currentAccount, frameLayout, this.sheet, getResourcesProvider());
            return;
        }
        if (num.intValue() == 7) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.showAsSheet(new BookmarksFragment(this.sheet != null ? new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda40
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$33();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda35(this)), bottomSheetParams);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
            bottomSheetParams2.transitionFromLeft = true;
            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment2 != null) {
                safeLastFragment2.showAsSheet(new HistoryFragment(this.sheet != null ? new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda41
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$34();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda42(this)), bottomSheetParams2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                }
                str = this.pages[0].getWebView().getUrl();
                file = null;
                str4 = this.pages[0].getWebView().getOpenURL();
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                String str5 = this.pages[0].adapter.currentPage.url;
                if (this.pages[0].adapter.currentPage.cached_page != null) {
                    str = str5;
                    file = this.pages[0].adapter.currentPage.cached_page.local;
                } else {
                    str = str5;
                    file = null;
                }
            }
            Activity activity2 = this.parentActivity;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", this.parentActivity, getResourcesProvider(), true);
                return;
            }
            if (str == null) {
                return;
            }
            final String hostAuthority = AndroidUtilities.getHostAuthority(str4, true);
            final String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            final Runnable runnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$setParentActivity$35(str);
                }
            };
            final Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda44
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ArticleViewer.this.lambda$setParentActivity$36(hostAuthority2, hostAuthority, (Boolean) obj);
                }
            };
            if (this.pages[0].isWeb() && MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(this.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
                AlertsCreator.showOpenExternalBrowserAlert(activity, getResourcesProvider(), str, true, true, new Utilities.Callback2() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda45
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        ArticleViewer.lambda$setParentActivity$37(Utilities.Callback.this, runnable, (Boolean) obj, (Boolean) obj2);
                    }
                });
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (num.intValue() == 4) {
            if (this.pages[0].isWeb()) {
                openWebSettings();
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
            builder.setApplyTopPadding(false);
            LinearLayout linearLayout = new LinearLayout(this.parentActivity);
            linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            linearLayout.setOrientation(1);
            HeaderCell headerCell = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell.setText(LocaleController.getString(R.string.FontSize));
            linearLayout.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
            linearLayout.addView(new TextSizeCell(this.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
            HeaderCell headerCell2 = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell2.setText(LocaleController.getString(R.string.FontType));
            linearLayout.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
            int i = 0;
            while (i < 2) {
                this.fontCells[i] = new FontCell(this.parentActivity);
                if (i == 0) {
                    this.fontCells[i].setTextAndTypeface(LocaleController.getString(R.string.Default), Typeface.DEFAULT);
                } else if (i == 1) {
                    this.fontCells[i].setTextAndTypeface("Serif", Typeface.SERIF);
                }
                this.fontCells[i].select(i == this.selectedFont, false);
                this.fontCells[i].setTag(Integer.valueOf(i));
                this.fontCells[i].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArticleViewer.this.lambda$setParentActivity$38(view);
                    }
                });
                linearLayout.addView(this.fontCells[i], LayoutHelper.createLinear(-1, 50));
                i++;
            }
            builder.setCustomView(linearLayout);
            BottomSheet create = builder.create();
            this.linkSheet = create;
            showDialog(create);
            return;
        }
        if (num.intValue() == 5) {
            if (!this.pages[0].isWeb() || this.pages[0].getWebView() == null) {
                return;
            }
            this.pages[0].getWebView().reload();
            return;
        }
        if (num.intValue() != 10 || (loader = this.pages[0].currentInstantLoader) == null || loader.getWebPage() == null) {
            return;
        }
        addPageToStack(loader.getWebPage(), null, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$33() {
        this.sheet.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$34() {
        this.sheet.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$35(String str) {
        Browser.openInExternalBrowser(this.parentActivity, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$36(String str, String str2, Boolean bool) {
        MessagesController.getInstance(this.currentAccount).addWebBrowserException(str, true);
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, str)) {
            MessagesController.getInstance(this.currentAccount).addWebBrowserException(str2, true);
        }
        if (!bool.booleanValue()) {
            showRestrictedWebsiteToast();
        } else {
            LaunchActivity.whenResumed = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.showRestrictedWebsiteToast();
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setParentActivity$37(Utilities.Callback callback, Runnable runnable, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            if (bool2.booleanValue()) {
                callback.run(Boolean.TRUE);
            }
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$38(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.selectedFont = intValue;
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            this.fontCells[i2].select(i2 == intValue, true);
            i2++;
        }
        resources.updatePaintFonts(this.selectedFont);
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                return;
            }
            pageLayoutArr[i].adapter.notifyDataSetChanged();
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$40(View view) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$42(Integer num) {
        FrameLayout frameLayout = this.searchPanel;
        float f = -num.intValue();
        this.searchPanelTranslation = f;
        frameLayout.setTranslationY(f + (AndroidUtilities.dp(51.0f) * (1.0f - this.searchPanelAlpha)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$43(View view) {
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().findNext(false);
                return;
            }
            return;
        }
        scrollToSearchIndex(this.currentSearchIndex - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$44(View view) {
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().findNext(true);
                return;
            }
            return;
        }
        scrollToSearchIndex(this.currentSearchIndex + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$45(CharSequence charSequence, String str, String str2, Runnable runnable) {
        TranslateAlert2.showAlert(this.parentActivity, this.parentFragment, this.currentAccount, str, str2, charSequence, null, false, null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$46(float[] fArr) {
        fArr[0] = this.currentHeaderHeight;
        fArr[1] = this.pages[0].listView.getMeasuredHeight();
    }

    public static void addBookmark(String str, int i, FrameLayout frameLayout, final Sheet sheet, Theme.ResourcesProvider resourcesProvider) {
        String magic2tonsite = BotWebViewContainer.magic2tonsite(str);
        final long clientUserId = UserConfig.getInstance(i).getClientUserId();
        SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(magic2tonsite, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = magic2tonsite;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = magic2tonsite;
        webPage.display_url = magic2tonsite;
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i, tL_message, false, false));
        BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.lambda$addBookmark$47(ArticleViewer.Sheet.this, clientUserId);
            }
        })).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addBookmark$47(Sheet sheet, long j) {
        if (sheet != null) {
            sheet.dismiss(true);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", j);
            safeLastFragment.presentFragment(new ChatActivity(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRestrictedWebsiteToast() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        this.showRestrictedToastOnResume = false;
        if (!this.attachedToWindow || (launchActivity = LaunchActivity.instance) == null || launchActivity.isFinishing()) {
            return;
        }
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() == null) {
                return;
            } else {
                frameLayout = this.pages[0].webViewContainer;
            }
        } else if (this.pages[0].adapter.currentPage == null) {
            return;
        } else {
            frameLayout = this.pages[0];
        }
        BulletinFactory.of(frameLayout, getResourcesProvider()).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda68
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.openWebSettings();
            }
        }), 4).show(true);
    }

    public void openBookmark(String str) {
        if (this.parentActivity == null || str == null) {
            return;
        }
        this.actionBar.showAddress(false, true);
        if (Browser.isInternalUri(Uri.parse(str), null)) {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
            Browser.openAsInternalIntent(this.parentActivity, str);
            return;
        }
        if (Browser.openInExternalApp(this.parentActivity, str, false)) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || pageLayout.getWebView() == null) {
            Browser.openInTelegramBrowser(this.parentActivity, str, null);
        } else {
            this.pages[0].getWebView().loadUrl(str);
        }
    }

    public void openHistoryEntry(BrowserHistory.Entry entry) {
        if (this.parentActivity == null || entry == null) {
            return;
        }
        this.actionBar.showAddress(false, true);
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || pageLayout.getWebView() == null) {
            Browser.openInTelegramBrowser(this.parentActivity, entry.url, null);
        } else {
            this.pages[0].getWebView().loadUrl(entry.url, entry.meta);
        }
    }

    public void openWebSettings() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            safeLastFragment.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda42(this)), bottomSheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVideoPlayer() {
        BlockVideoCell blockVideoCell;
        RecyclerListView recyclerListView = this.pages[0].listView;
        if (recyclerListView == null || !this.attachedToWindow) {
            return;
        }
        float measuredHeight = recyclerListView.getMeasuredHeight() / 2.0f;
        float f = 0.0f;
        BlockVideoCell blockVideoCell2 = null;
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof BlockVideoCell) {
                float top = childAt.getTop() + (childAt.getMeasuredHeight() / 2.0f);
                if (blockVideoCell2 == null || Math.abs(measuredHeight - top) < Math.abs(measuredHeight - f)) {
                    blockVideoCell2 = (BlockVideoCell) childAt;
                    f = top;
                }
            }
        }
        boolean isVisibleOrAnimating = PhotoViewer.getInstance().isVisibleOrAnimating();
        if (isVisibleOrAnimating || ((blockVideoCell = this.currentPlayer) != null && blockVideoCell != blockVideoCell2 && this.videoPlayer != null)) {
            if (this.videoPlayer != null) {
                LongSparseArray longSparseArray = this.videoStates;
                long j = this.currentPlayer.currentBlock.video_id;
                BlockVideoCell blockVideoCell3 = this.currentPlayer;
                longSparseArray.put(j, blockVideoCell3.setState(BlockVideoCellState.fromPlayer(this.videoPlayer, blockVideoCell3)));
                if (this.currentPlayer.videoState != null) {
                    if (this.currentPlayer.videoState.lastFrameBitmap != null) {
                        this.currentPlayer.imageView.setImageBitmap(this.currentPlayer.videoState.lastFrameBitmap);
                    }
                    this.currentPlayer.updateButtonState(false);
                }
                this.videoPlayer.release(null);
            }
            this.videoPlayer = null;
            this.currentPlayer = null;
        }
        if (isVisibleOrAnimating || blockVideoCell2 == null) {
            return;
        }
        blockVideoCell2.startVideoPlayer();
        this.currentPlayer = blockVideoCell2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSearchButtons() {
        int i;
        int size;
        if (this.searchResults != null || this.pages[0].isWeb()) {
            if (this.pages[0].isWeb()) {
                i = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchIndex();
                size = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchCount();
            } else {
                i = this.currentSearchIndex;
                size = this.searchResults.size();
            }
            this.searchUpButton.setEnabled(size > 0 && i != 0);
            this.searchDownButton.setEnabled(size > 0 && i != size + (-1));
            ImageView imageView = this.searchUpButton;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.searchDownButton;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.searchCountText.cancelAnimation();
            if (size < 0) {
                this.searchCountText.setText("");
                return;
            }
            if (size == 0) {
                this.searchCountText.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.searchCountText.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.searchCountText.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i + 1), Integer.valueOf(size)));
            }
        }
    }

    public static class SearchResult {
        private TL_iv.PageBlock block;
        private int index;
        private Object text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSearch(final String str) {
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.searchResults.clear();
            this.searchText = str;
            this.pages[0].adapter.searchTextOffset.clear();
            showSearchPanel(false);
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() != null) {
                    this.pages[0].getWebView().search("", new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda52
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArticleViewer.this.updateSearchButtons();
                        }
                    });
                    updateSearchButtons();
                }
            } else {
                this.pages[0].listView.invalidateViews();
                scrollToSearchIndex(0);
            }
            this.lastSearchIndex = -1;
            return;
        }
        final int i = this.lastSearchIndex + 1;
        this.lastSearchIndex = i;
        if (this.pages[0].isWeb()) {
            showSearchPanel(true);
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().search(str, new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda52
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.updateSearchButtons();
                    }
                });
                updateSearchButtons();
                return;
            }
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$50(str, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSearch$50(final String str, final int i) {
        final HashMap hashMap = new HashMap(this.pages[0].adapter.textToBlocks);
        final ArrayList arrayList = new ArrayList(this.pages[0].adapter.textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$49(arrayList, hashMap, str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSearch$49(ArrayList arrayList, HashMap hashMap, final String str, final int i) {
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) hashMap.get(obj);
            if (obj instanceof TL_iv.RichText) {
                TL_iv.RichText richText = (TL_iv.RichText) obj;
                WebpageAdapter webpageAdapter = this.pages[c].adapter;
                pageBlock = pageBlock2;
                CharSequence text = getText(webpageAdapter, (View) null, richText, richText, pageBlock2, MediaDataController.MAX_STYLE_RUNS_COUNT);
                if (!TextUtils.isEmpty(text)) {
                    lowerCase = text.toString().toLowerCase();
                }
                lowerCase = null;
            } else {
                pageBlock = pageBlock2;
                if (obj instanceof String) {
                    lowerCase = ((String) obj).toLowerCase();
                }
                lowerCase = null;
            }
            if (lowerCase != null) {
                int i3 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(str, i3);
                    if (indexOf >= 0) {
                        int length = str.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            SearchResult searchResult = new SearchResult();
                            searchResult.index = indexOf;
                            searchResult.block = pageBlock;
                            searchResult.text = obj;
                            arrayList2.add(searchResult);
                        }
                        i3 = length;
                    }
                }
            }
            i2++;
            c = 0;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda75
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$48(i, arrayList2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSearch$48(int i, ArrayList arrayList, String str) {
        if (i == this.lastSearchIndex) {
            showSearchPanel(true);
            this.searchResults = arrayList;
            this.searchText = str;
            this.pages[0].adapter.searchTextOffset.clear();
            this.pages[0].listView.invalidateViews();
            scrollToSearchIndex(0);
        }
    }

    public void showSearchPanel(final boolean z) {
        this.searchPanel.setVisibility(0);
        ValueAnimator valueAnimator = this.searchPanelAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.searchPanelAlpha, z ? 1.0f : 0.0f);
        this.searchPanelAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda62
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ArticleViewer.this.lambda$showSearchPanel$51(valueAnimator2);
            }
        });
        this.searchPanelAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.23
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ArticleViewer.this.searchPanelAlpha = z ? 1.0f : 0.0f;
                ArticleViewer.this.searchPanel.setTranslationY(ArticleViewer.this.searchPanelTranslation + ((1.0f - ArticleViewer.this.searchPanelAlpha) * AndroidUtilities.dp(51.0f)));
                if (z) {
                    return;
                }
                ArticleViewer.this.searchPanel.setVisibility(8);
            }
        });
        this.searchPanelAnimator.setDuration(320L);
        this.searchPanelAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchPanelAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSearchPanel$51(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchPanelAlpha = floatValue;
        this.searchPanel.setTranslationY(this.searchPanelTranslation + ((1.0f - floatValue) * AndroidUtilities.dp(51.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void scrollToSearchIndex(int i) {
        int size;
        int i2;
        if (i < 0 || i >= this.searchResults.size()) {
            updateSearchButtons();
            return;
        }
        this.currentSearchIndex = i;
        updateSearchButtons();
        SearchResult searchResult = (SearchResult) this.searchResults.get(i);
        TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(searchResult.block);
        int size2 = this.pages[0].adapter.blocks.size();
        for (int i3 = 0; i3 < size2; i3++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.pages[0].adapter.blocks.get(i3);
            if (pageBlock instanceof TL_pageBlockDetailsChild) {
                TL_pageBlockDetailsChild tL_pageBlockDetailsChild = (TL_pageBlockDetailsChild) pageBlock;
                if (tL_pageBlockDetailsChild.block == searchResult.block || tL_pageBlockDetailsChild.block == lastNonListPageBlock) {
                    if (openAllParentBlocks(tL_pageBlockDetailsChild)) {
                        this.pages[0].adapter.updateRows();
                        this.pages[0].adapter.notifyDataSetChanged();
                    }
                    size = this.pages[0].adapter.localBlocks.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            i2 = -1;
                            break;
                        }
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) this.pages[0].adapter.localBlocks.get(i2);
                        if (pageBlock2 == searchResult.block || pageBlock2 == lastNonListPageBlock) {
                            break;
                        }
                        if (pageBlock2 instanceof TL_pageBlockDetailsChild) {
                            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) pageBlock2;
                            if (tL_pageBlockDetailsChild2.block == searchResult.block || tL_pageBlockDetailsChild2.block == lastNonListPageBlock) {
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        return;
                    }
                    if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                        this.pages[0].adapter.updateRows();
                        this.pages[0].adapter.notifyDataSetChanged();
                    }
                    String str = this.searchText + searchResult.block + searchResult.text + searchResult.index;
                    Integer num = (Integer) this.pages[0].adapter.searchTextOffset.get(str);
                    if (num == null) {
                        int typeForBlock = this.pages[0].adapter.getTypeForBlock(searchResult.block);
                        RecyclerView.ViewHolder onCreateViewHolder = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock);
                        this.pages[0].adapter.bindBlockToHolder(typeForBlock, onCreateViewHolder, searchResult.block, 0, 0, false);
                        onCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.pages[0].listView.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        num = (Integer) this.pages[0].adapter.searchTextOffset.get(str);
                        if (num == null) {
                            num = 0;
                        }
                    }
                    SmoothScroller smoothScroller = new SmoothScroller(this.pages[0].getContext()) { // from class: org.telegram.ui.ArticleViewer.24
                        @Override // androidx.recyclerview.widget.LinearSmoothScroller
                        protected int getVerticalSnapPreference() {
                            return -1;
                        }
                    };
                    if (this.pages[0].adapter.padding) {
                        i2++;
                    }
                    smoothScroller.setTargetPosition(i2);
                    smoothScroller.setOffset(-(((this.currentHeaderHeight - AndroidUtilities.dp(56.0f)) - num.intValue()) + AndroidUtilities.dp(100.0f)));
                    smoothScroller.setDurationScale(1.2f);
                    this.pages[0].layoutManager.startSmoothScroll(smoothScroller);
                    this.pages[0].listView.invalidateViews();
                    return;
                }
            }
        }
        size = this.pages[0].adapter.localBlocks.size();
        i2 = 0;
        while (true) {
            if (i2 < size) {
            }
            i2++;
        }
        if (i2 != -1) {
        }
    }

    private void checkScrollAnimated() {
        checkScrollAnimated(null);
    }

    private void checkScrollAnimated(final Runnable runnable) {
        if (this.currentHeaderHeight == AndroidUtilities.dp(56.0f)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.currentHeaderHeight), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda38
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArticleViewer.this.lambda$checkScrollAnimated$52(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.25
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        if (runnable != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkScrollAnimated$52(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentHeaderHeight(int i) {
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar == null || webActionBar.isSearching() || this.actionBar.isAddressing()) {
            return;
        }
        int clamp = Utilities.clamp(i, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.currentHeaderHeight = clamp;
        this.actionBar.setHeight(clamp);
        this.textSelectionHelper.setTopOffset(this.currentHeaderHeight);
        int i2 = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i2 >= pageLayoutArr.length) {
                return;
            }
            pageLayoutArr[i2].listView.setTopGlowOffset(this.currentHeaderHeight);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkScroll(int i) {
        Sheet sheet = this.sheet;
        if (sheet == null || sheet.attachedToActionBar) {
            setCurrentHeaderHeight(this.currentHeaderHeight - i);
        }
    }

    private void openPreviewsChat(TLRPC.User user, long j) {
        if (user == null || !(this.parentActivity instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j);
        ((LaunchActivity) this.parentActivity).presentFragment(new ChatActivity(bundle), false, true);
        close(false, true);
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, null, null);
    }

    public boolean open(MessageObject messageObject, TLRPC.WebPage webPage) {
        return open(messageObject, webPage, null, null, null);
    }

    public boolean open(TLRPC.TL_webPage tL_webPage, String str) {
        return open(null, tL_webPage, str, null, null);
    }

    public boolean open(String str) {
        return open(null, null, null, str, null);
    }

    public boolean open(String str, Browser.Progress progress) {
        return open(null, null, null, str, progress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean open(final MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2, Browser.Progress progress) {
        final TLRPC.WebPage webPage2;
        String str3;
        boolean z;
        int lastIndexOf;
        String str4;
        TL_iv.Page page;
        if (this.parentActivity == null || (this.sheet == null && this.isVisible && !this.collapsed)) {
            return false;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && (baseFragment.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.parentFragment.getParentLayout());
        }
        if (messageObject != null) {
            TLRPC.WebPage webPage3 = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z = (webPage3 == null || (page = webPage3.cached_page) == null || page.local == null) ? false : true;
            for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
                TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str5 = messageObject.messageOwner.message;
                        int i2 = messageEntity.offset;
                        String lowerCase = str5.substring(i2, messageEntity.length + i2).toLowerCase();
                        if (!TextUtils.isEmpty(webPage3.cached_page.url)) {
                            str4 = webPage3.cached_page.url.toLowerCase();
                        } else {
                            str4 = webPage3.url.toLowerCase();
                        }
                        if (lowerCase.contains(str4) || str4.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            str3 = lowerCase.substring(lastIndexOf2 + 1);
                            webPage2 = webPage3;
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            webPage2 = webPage3;
            str3 = null;
        } else {
            if (str == null || (lastIndexOf = str.lastIndexOf(35)) == -1) {
                webPage2 = webPage;
                str3 = null;
            } else {
                str3 = str.substring(lastIndexOf + 1);
                webPage2 = webPage;
            }
            z = false;
        }
        int i3 = (this.sheet == null || this.pagesStack.isEmpty()) ? 0 : 1;
        this.collapsed = false;
        if (i3 == 0) {
            this.pagesStack.clear();
            this.containerView.setTranslationX(0.0f);
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.setBackProgress(0.0f);
            }
            this.containerView.setTranslationY(0.0f);
            this.pages[0].setTranslationY(0.0f);
            this.pages[0].setTranslationX(0.0f);
            this.pages[1].setTranslationX(0.0f);
            this.pages[0].setAlpha(1.0f);
            this.windowView.setInnerTranslationX(0.0f);
            this.pages[0].scrollToTop(false);
            setCurrentHeaderHeight(AndroidUtilities.dp(56.0f));
        }
        Sheet sheet2 = this.sheet;
        if (sheet2 != null && BotWebViewContainer.firstWebView) {
            sheet2.animationsLock.lock();
        }
        if (webPage2 != null) {
            boolean addPageToStack = addPageToStack(webPage2, str3, i3);
            if (!z) {
                if (addPageToStack || str3 == null) {
                    str3 = null;
                }
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage2.hash;
                }
                final int i4 = messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount;
                final boolean z2 = i3;
                final String str6 = str3;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        ArticleViewer.this.lambda$open$54(i4, webPage2, messageObject, z2, str6, tLObject, tL_error);
                    }
                });
            }
        } else {
            addPageToStack(str2, i3);
        }
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar != null && i3 == 0) {
            webActionBar.setIsLocal(this.pages[0].isLocal());
        }
        this.lastInsets = null;
        if (this.sheet != null) {
            if (i3 == 0) {
                AndroidUtilities.removeFromParent(this.windowView);
                this.sheet.setContainerView(this.windowView);
                this.sheet.windowView.addView(this.windowView, LayoutHelper.createFrame(-1, -1.0f));
            }
        } else if (!this.isVisible) {
            WindowManager windowManager = (WindowManager) this.parentActivity.getSystemService("window");
            if (this.attachedToWindow) {
                try {
                    windowManager.removeView(this.windowView);
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                this.windowView.setFocusable(false);
                this.containerView.setFocusable(false);
                windowManager.addView(this.windowView, this.windowLayoutParams);
            } catch (Exception e2) {
                FileLog.e(e2);
                return false;
            }
        } else {
            this.windowLayoutParams.flags &= -17;
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        }
        this.isVisible = true;
        this.animationInProgress = 1;
        if (i3 == 0) {
            Sheet sheet3 = this.sheet;
            if (sheet3 == null) {
                this.windowView.setAlpha(0.0f);
                this.containerView.setAlpha(0.0f);
                final AnimatorSet animatorSet = new AnimatorSet();
                WindowView windowView = this.windowView;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(windowView, (Property<WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.animationEndRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$open$55();
                    }
                };
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.interpolator);
                animatorSet.addListener(new 26());
                this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.this.lambda$open$56(animatorSet);
                    }
                });
            } else if (i3 != 0) {
                sheet3.animationsLock.unlock();
            } else {
                sheet3.show();
            }
        }
        this.containerView.setLayerType(2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$54(final int i, final TLRPC.WebPage webPage, final MessageObject messageObject, final boolean z, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$open$53(tLObject, i, webPage, messageObject, z, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$53(TLObject tLObject, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) {
        TL_iv.Page page;
        TLObject tLObject2 = tLObject;
        int i2 = 0;
        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
            MessagesController.getInstance(i).putUsers(tL_messages_webPage.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_webPage.chats, false);
            tLObject2 = tL_messages_webPage.webpage;
        }
        if (tLObject2 instanceof TLRPC.TL_webPage) {
            TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
            if (tL_webPage.cached_page == null) {
                return;
            }
            if (!this.pagesStack.isEmpty() && this.pagesStack.get(0) == webPage) {
                if (messageObject != null) {
                    messageObject.messageOwner.media.webpage = tL_webPage;
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
                if (z) {
                    this.pagesStack.add(tL_webPage);
                } else {
                    this.pagesStack.set(0, tL_webPage);
                }
                if (this.pagesStack.size() == 1) {
                    ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                    updateInterfaceForCurrentPage(tL_webPage, false, z ? 1 : 0);
                    if (str != null) {
                        scrollToAnchor(str, false);
                    }
                }
            }
            LongSparseArray longSparseArray = new LongSparseArray(1);
            longSparseArray.put(tL_webPage.id, tL_webPage);
            MessagesStorage.getInstance(i).putWebPages(longSparseArray);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
            TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
            if (webPage == null || (page = webPage.cached_page) == null) {
                return;
            }
            int i3 = page.views;
            int i4 = tL_webPageNotModified.cached_page_views;
            if (i3 != i4) {
                page.views = i4;
                page.flags |= 8;
                while (true) {
                    PageLayout[] pageLayoutArr = this.pages;
                    if (i2 >= pageLayoutArr.length) {
                        break;
                    }
                    if (pageLayoutArr[i2].adapter.currentPage == webPage) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.pages[i2].listView.findViewHolderForAdapterPosition(this.pages[i2].adapter.getItemCount() - 1);
                        if (findViewHolderForAdapterPosition != null) {
                            this.pages[i2].adapter.onViewAttachedToWindow(findViewHolderForAdapterPosition);
                        }
                    }
                    i2++;
                }
                if (messageObject != null) {
                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$55() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null || this.windowView == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
    }

    class 26 extends AnimatorListenerAdapter {
        26() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$26$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.26.this.lambda$onAnimationEnd$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAnimationEnd$0() {
            ArticleViewer.this.notificationsLocker.unlock();
            if (ArticleViewer.this.animationEndRunnable != null) {
                ArticleViewer.this.animationEndRunnable.run();
                ArticleViewer.this.animationEndRunnable = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$56(AnimatorSet animatorSet) {
        this.notificationsLocker.lock();
        animatorSet.start();
    }

    private void showProgressView(boolean z, final boolean z2) {
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.lineProgressTickRunnable);
            if (z2) {
                this.actionBar.lineProgressView.setProgress(0.0f, false);
                this.actionBar.lineProgressView.setProgress(0.3f, true);
                AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
                return;
            }
            this.actionBar.lineProgressView.setProgress(1.0f, true);
            return;
        }
        AnimatorSet animatorSet = this.progressViewAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.progressViewAnimation = animatorSet2;
        if (z2) {
            this.progressView.setVisibility(0);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 0.0f));
        }
        this.progressViewAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.27
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator) || z2) {
                    return;
                }
                ArticleViewer.this.progressView.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    return;
                }
                ArticleViewer.this.progressViewAnimation = null;
            }
        });
        this.progressViewAnimation.setDuration(150L);
        this.progressViewAnimation.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCurrentPagePosition() {
        int findFirstVisibleItemPosition;
        if (this.pages[0].adapter.currentPage == null || (findFirstVisibleItemPosition = this.pages[0].layoutManager.findFirstVisibleItemPosition()) == -1) {
            return;
        }
        View findViewByPosition = this.pages[0].layoutManager.findViewByPosition(findFirstVisibleItemPosition);
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.pages[0].adapter.currentPage.id;
        SharedPreferences.Editor putInt = edit.putInt(str, findFirstVisibleItemPosition).putInt(str + "o", top);
        String str2 = str + "r";
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(str2, point.x > point.y).commit();
    }

    private void refreshThemeColors() {
        TextView textView = this.deleteView;
        if (textView != null) {
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2));
            this.deleteView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        ImageView imageView = this.searchUpButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        ImageView imageView2 = this.searchDownButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        AnimatedTextView animatedTextView = this.searchCountText;
        if (animatedTextView != null) {
            animatedTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar != null) {
            PageLayout pageLayout = this.pages[0];
            webActionBar.setMenuColors((pageLayout == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout.getBackgroundColor());
            WebActionBar webActionBar2 = this.actionBar;
            PageLayout pageLayout2 = this.pages[0];
            webActionBar2.setColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getActionBarColor(), true);
        }
        this.backgroundPaint.setColor(getThemedColor(Theme.key_iv_background));
    }

    public void close(boolean z, boolean z2) {
        if (this.parentActivity == null || this.closeAnimationInProgress || !this.isVisible || checkAnimation()) {
            return;
        }
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(false);
            return;
        }
        if (this.fullscreenVideoContainer.getVisibility() == 0) {
            if (this.customView != null) {
                this.fullscreenVideoContainer.setVisibility(4);
                this.customViewCallback.onCustomViewHidden();
                this.fullscreenVideoContainer.removeView(this.customView);
                this.customView = null;
            } else {
                WebPlayerView webPlayerView = this.fullscreenedVideo;
                if (webPlayerView != null) {
                    webPlayerView.exitFullscreen();
                }
            }
            if (!z2) {
                return;
            }
        }
        if (this.textSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
            return;
        }
        if (this.actionBar.isSearching()) {
            this.actionBar.showSearch(false, true);
            return;
        }
        if (this.actionBar.isAddressing()) {
            this.actionBar.showAddress(false, true);
            return;
        }
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, true);
            this.openUrlReqId = 0;
            showProgressView(true, false);
        }
        if (this.previewsReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.previewsReqId, true);
            this.previewsReqId = 0;
            showProgressView(true, false);
        }
        saveCurrentPagePosition();
        if (z && !z2 && removeLastPageFromStack()) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.emojiLoaded);
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        this.parentFragment = null;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        WindowView windowView = this.windowView;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(windowView, (Property<WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.animationInProgress = 2;
        this.animationEndRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$close$57();
            }
        };
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.28
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.animationEndRunnable != null) {
                    ArticleViewer.this.animationEndRunnable.run();
                    ArticleViewer.this.animationEndRunnable = null;
                }
            }
        });
        this.transitionAnimationStartTime = System.currentTimeMillis();
        this.containerView.setLayerType(2, null);
        animatorSet.start();
        for (int i = 0; i < this.videoStates.size(); i++) {
            BlockVideoCellState blockVideoCellState = (BlockVideoCellState) this.videoStates.valueAt(i);
            Bitmap bitmap = blockVideoCellState.lastFrameBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                blockVideoCellState.lastFrameBitmap = null;
            }
        }
        this.videoStates.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$57() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        onClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClosed() {
        this.isVisible = false;
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i < pageLayoutArr.length) {
                pageLayoutArr[i].cleanup();
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.parentActivity.getWindow().clearFlags(128);
        for (int i2 = 0; i2 < this.createdWebViews.size(); i2++) {
            ((BlockEmbedCell) this.createdWebViews.get(i2)).destroyWebView(false);
        }
        this.containerView.post(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$onClosed$58();
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$58() {
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void loadChannel(final IArticleViewer iArticleViewer, final BlockChannelCell blockChannelCell, final WebpageAdapter webpageAdapter, TLRPC.Chat chat) {
        if (iArticleViewer.loadingChannel || !ChatObject.isPublic(chat)) {
            return;
        }
        iArticleViewer.loadingChannel = true;
        final int currentAccount = iArticleViewer.getCurrentAccount();
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = chat.username;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArticleViewer.lambda$loadChannel$60(IArticleViewer.this, webpageAdapter, currentAccount, blockChannelCell, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadChannel$60(final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter, final int i, final BlockChannelCell blockChannelCell, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.lambda$loadChannel$59(IArticleViewer.this, webpageAdapter, tL_error, tLObject, i, blockChannelCell);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadChannel$59(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, TLRPC.TL_error tL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        iArticleViewer.loadingChannel = false;
        if (webpageAdapter.blocks.isEmpty()) {
            return;
        }
        if (tL_error == null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                iArticleViewer.loadedChannel = chat;
                if (chat.left && !chat.kicked) {
                    blockChannelCell.setState(0, false);
                    return;
                } else {
                    blockChannelCell.setState(4, false);
                    return;
                }
            }
            blockChannelCell.setState(4, false);
            return;
        }
        blockChannelCell.setState(4, false);
    }

    public static void joinChannel(final int i, final BlockChannelCell blockChannelCell, final TLRPC.Chat chat) {
        final TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
        tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_joinChannel, new Utilities.Callback2() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda61
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ArticleViewer.lambda$joinChannel$65(ArticleViewer.BlockChannelCell.this, i, tL_channels_joinChannel, chat, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinChannel$65(final BlockChannelCell blockChannelCell, final int i, final TLRPC.TL_channels_joinChannel tL_channels_joinChannel, final TLRPC.Chat chat, TLRPC.ChatInviteJoinResult chatInviteJoinResult, final TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.lambda$joinChannel$61(ArticleViewer.BlockChannelCell.this, i, tL_error, tL_channels_joinChannel);
                }
            });
            return;
        }
        boolean z2 = false;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    z = false;
                    break;
                }
                TLRPC.Update update = updates.updates.get(i2);
                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                    z = true;
                    break;
                }
                i2++;
            }
            MessagesController.getInstance(i).processUpdates(updates, false);
            z2 = z;
        } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda72
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.lambda$joinChannel$62(i, tL_chatInviteJoinResultWebView, chat);
                }
            });
            z2 = true;
        }
        if (!z2) {
            MessagesController.getInstance(i).generateJoinMessage(chat.id, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.BlockChannelCell.this.setState(2, false);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.lambda$joinChannel$64(i, chat);
            }
        }, 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = chat.id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinChannel$61(BlockChannelCell blockChannelCell, int i, TLRPC.TL_error tL_error, TLRPC.TL_channels_joinChannel tL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tL_error, null, tL_channels_joinChannel, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinChannel$62(int i, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, TLRPC.Chat chat) {
        MessagesController.getInstance(i).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.webview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinChannel$64(int i, TLRPC.Chat chat) {
        MessagesController.getInstance(i).loadFullChat(chat.id, 0, true);
    }

    private boolean checkAnimation() {
        if (this.animationInProgress != 0 && Math.abs(this.transitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.animationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.animationEndRunnable = null;
            }
            this.animationInProgress = 0;
        }
        return this.animationInProgress != 0;
    }

    public void destroyArticleViewer() {
        WindowView windowView;
        if (this.parentActivity == null || (windowView = this.windowView) == null) {
            return;
        }
        if (this.sheet == null) {
            try {
                if (windowView.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i = 0; i < this.createdWebViews.size(); i++) {
            ((BlockEmbedCell) this.createdWebViews.get(i)).destroyWebView(true);
        }
        this.createdWebViews.clear();
        try {
            this.parentActivity.getWindow().clearFlags(128);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.parentActivity = null;
        this.parentFragment = null;
        Instance = null;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void showDialog(Dialog dialog) {
        if (this.parentActivity == null) {
            return;
        }
        try {
            Dialog dialog2 = this.visibleDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.visibleDialog = dialog;
            dialog.setCanceledOnTouchOutside(true);
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda47
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ArticleViewer.this.lambda$showDialog$66(dialogInterface);
                }
            });
            dialog.show();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$66(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    public static final class WebPageUtils {
        public static TLRPC.Photo getPhotoWithId(TLObject tLObject, long j) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getPhotoWithId((TL_iv.RichMessage) tLObject, j);
            }
            if (tLObject instanceof TL_iv.Page) {
                return getPhotoWithId((TL_iv.Page) tLObject, j);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getPhotoWithId((TLRPC.WebPage) tLObject, j);
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TL_iv.RichMessage richMessage, long j) {
            if (richMessage == null) {
                return null;
            }
            for (int i = 0; i < richMessage.photos.size(); i++) {
                TLRPC.Photo photo = richMessage.photos.get(i);
                if (photo.id == j) {
                    return photo;
                }
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TL_iv.Page page, long j) {
            if (page == null) {
                return null;
            }
            for (int i = 0; i < page.photos.size(); i++) {
                TLRPC.Photo photo = page.photos.get(i);
                if (photo.id == j) {
                    return photo;
                }
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TLRPC.WebPage webPage, long j) {
            if (webPage != null && webPage.cached_page != null) {
                TLRPC.Photo photo = webPage.photo;
                if (photo != null && photo.id == j) {
                    return photo;
                }
                for (int i = 0; i < webPage.cached_page.photos.size(); i++) {
                    TLRPC.Photo photo2 = webPage.cached_page.photos.get(i);
                    if (photo2.id == j) {
                        return photo2;
                    }
                }
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TLObject tLObject, long j) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getDocumentWithId((TL_iv.RichMessage) tLObject, j);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getDocumentWithId((TLRPC.WebPage) tLObject, j);
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TL_iv.RichMessage richMessage, long j) {
            if (richMessage == null) {
                return null;
            }
            for (int i = 0; i < richMessage.documents.size(); i++) {
                TLRPC.Document document = richMessage.documents.get(i);
                if (document.id == j) {
                    return document;
                }
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TLRPC.WebPage webPage, long j) {
            if (webPage != null && webPage.cached_page != null) {
                TLRPC.Document document = webPage.document;
                if (document != null && document.id == j) {
                    return document;
                }
                for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
                    TLRPC.Document document2 = webPage.cached_page.documents.get(i);
                    if (document2.id == j) {
                        return document2;
                    }
                }
            }
            return null;
        }

        public static boolean isVideo(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static boolean isVideo(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static TLObject getMedia(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
            return null;
        }

        public static TLObject getMedia(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
            return null;
        }

        public static File getMediaFile(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TLRPC.Photo photoWithId = getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
        }

        public static File getMediaFile(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TLRPC.Photo photoWithId = getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
        }
    }

    @Override // org.telegram.ui.IArticleViewer
    public WebpageAdapter getAdapter() {
        return this.pages[0].adapter;
    }

    public class WebpageAdapter extends RecyclerListView.SelectionAdapter {
        private TL_iv.pageBlockChannel channelBlock;
        private Context context;
        private TLRPC.WebPage currentPage;
        public int fullHeight;
        private boolean isRtl;
        public int[] itemHeights;
        private final boolean padding;
        public int[] sumItemHeights;
        private ArrayList localBlocks = new ArrayList();
        private ArrayList blocks = new ArrayList();
        private ArrayList photoBlocks = new ArrayList();
        private HashMap anchors = new HashMap();
        private HashMap anchorsOffset = new HashMap();
        private HashMap anchorsParent = new HashMap();
        private HashMap audioBlocks = new HashMap();
        private ArrayList audioMessages = new ArrayList();
        private HashMap textToBlocks = new HashMap();
        private ArrayList textBlocks = new ArrayList();
        private HashMap searchTextOffset = new HashMap();
        private final Runnable calculateContentHeightRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$WebpageAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.WebpageAdapter.this.lambda$new$1();
            }
        };

        public WebpageAdapter(Context context, boolean z) {
            this.context = context;
            this.padding = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TLRPC.Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TLRPC.Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        private void setRichTextParents(TL_iv.RichText richText, TL_iv.RichText richText2) {
            if (richText2 == null) {
                return;
            }
            richText2.parentRichText = richText;
            if (richText2 instanceof TL_iv.textFixed) {
                setRichTextParents(richText2, ((TL_iv.textFixed) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textItalic) {
                setRichTextParents(richText2, ((TL_iv.textItalic) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textBold) {
                setRichTextParents(richText2, ((TL_iv.textBold) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textUnderline) {
                setRichTextParents(richText2, ((TL_iv.textUnderline) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textStrike) {
                setRichTextParents(richText2, ((TL_iv.textStrike) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textEmail) {
                setRichTextParents(richText2, ((TL_iv.textEmail) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textPhone) {
                setRichTextParents(richText2, ((TL_iv.textPhone) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textUrl) {
                setRichTextParents(richText2, ((TL_iv.textUrl) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textConcat) {
                int size = richText2.texts.size();
                for (int i = 0; i < size; i++) {
                    setRichTextParents(richText2, richText2.texts.get(i));
                }
                return;
            }
            if (richText2 instanceof TL_iv.textSubscript) {
                setRichTextParents(richText2, ((TL_iv.textSubscript) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textSuperscript) {
                setRichTextParents(richText2, ((TL_iv.textSuperscript) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textMarked) {
                setRichTextParents(richText2, ((TL_iv.textMarked) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textSpoiler) {
                setRichTextParents(richText2, ((TL_iv.textSpoiler) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                setRichTextParents(richText2, textanchor.text);
                String lowerCase = textanchor.name.toLowerCase();
                this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                TL_iv.RichText richText3 = textanchor.text;
                if (richText3 instanceof TL_iv.textPlain) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        this.anchorsParent.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    this.anchorsParent.put(lowerCase, textanchor);
                }
                this.anchorsOffset.put(lowerCase, -1);
            }
        }

        private void addTextBlock(Object obj, TL_iv.PageBlock pageBlock) {
            if ((obj instanceof TL_iv.textEmpty) || this.textToBlocks.containsKey(obj)) {
                return;
            }
            this.textToBlocks.put(obj, pageBlock);
            this.textBlocks.add(obj);
        }

        private void setRichTextParents(TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
                setRichTextParents(null, pageBlock2.caption.text);
                setRichTextParents(null, pageBlock2.caption.credit);
                addTextBlock(pageBlock2.caption.text, pageBlock2);
                addTextBlock(pageBlock2.caption.credit, pageBlock2);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
                setRichTextParents(null, pageBlock3.text);
                addTextBlock(pageBlock3.text, pageBlock3);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
                setRichTextParents(null, pageBlock4.text);
                addTextBlock(pageBlock4.text, pageBlock4);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
                setRichTextParents(null, pageBlock5.text);
                addTextBlock(pageBlock5.text, pageBlock5);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockHeader) {
                TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
                setRichTextParents(null, pageBlock6.text);
                addTextBlock(pageBlock6.text, pageBlock6);
                return;
            }
            if (ArticleViewer.isHeadingBlock(pageBlock)) {
                TL_iv.RichText richText = pageBlock.text;
                setRichTextParents(null, richText);
                addTextBlock(richText, pageBlock);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
                setRichTextParents(null, pageBlock7.text);
                addTextBlock(pageBlock7.text, pageBlock7);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
                setRichTextParents(null, pageBlock8.text);
                addTextBlock(pageBlock8.text, pageBlock8);
                return;
            }
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                setRichTextParents(null, pageblockslideshow.caption.text);
                setRichTextParents(null, pageblockslideshow.caption.credit);
                addTextBlock(pageblockslideshow.caption.text, pageblockslideshow);
                addTextBlock(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    setRichTextParents(pageblockslideshow.items.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                setRichTextParents(null, pageBlock9.caption.text);
                setRichTextParents(null, pageBlock9.caption.credit);
                addTextBlock(pageBlock9.caption.text, pageBlock9);
                addTextBlock(pageBlock9.caption.credit, pageBlock9);
                return;
            }
            if (pageBlock instanceof TL_pageBlockListItem) {
                TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) pageBlock;
                TL_iv.RichText richText2 = tL_pageBlockListItem.textItem;
                if (richText2 != null) {
                    setRichTextParents(null, richText2);
                    addTextBlock(tL_pageBlockListItem.textItem, tL_pageBlockListItem);
                    return;
                } else {
                    TL_iv.PageBlock pageBlock10 = tL_pageBlockListItem.blockItem;
                    if (pageBlock10 != null) {
                        setRichTextParents(pageBlock10);
                        return;
                    }
                    return;
                }
            }
            if (pageBlock instanceof TL_pageBlockOrderedListItem) {
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) pageBlock;
                TL_iv.RichText richText3 = tL_pageBlockOrderedListItem.textItem;
                if (richText3 != null) {
                    setRichTextParents(null, richText3);
                    addTextBlock(tL_pageBlockOrderedListItem.textItem, tL_pageBlockOrderedListItem);
                    return;
                } else {
                    TL_iv.PageBlock pageBlock11 = tL_pageBlockOrderedListItem.blockItem;
                    if (pageBlock11 != null) {
                        setRichTextParents(pageBlock11);
                        return;
                    }
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                setRichTextParents(null, pageblockcollage.caption.text);
                setRichTextParents(null, pageblockcollage.caption.credit);
                addTextBlock(pageblockcollage.caption.text, pageblockcollage);
                addTextBlock(pageblockcollage.caption.credit, pageblockcollage);
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    setRichTextParents(pageblockcollage.items.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
                setRichTextParents(null, pageBlock12.caption.text);
                setRichTextParents(null, pageBlock12.caption.credit);
                addTextBlock(pageBlock12.caption.text, pageBlock12);
                addTextBlock(pageBlock12.caption.credit, pageBlock12);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
                setRichTextParents(null, pageBlock13.text);
                addTextBlock(pageBlock13.text, pageBlock13);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                setRichTextParents(null, pageblockblockquote.text);
                setRichTextParents(null, pageblockblockquote.caption);
                addTextBlock(pageblockblockquote.text, pageblockblockquote);
                addTextBlock(pageblockblockquote.caption, pageblockblockquote);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                setRichTextParents(null, pageblockdetails.title);
                addTextBlock(pageblockdetails.title, pageblockdetails);
                int size3 = pageblockdetails.blocks.size();
                while (i < size3) {
                    setRichTextParents(pageblockdetails.blocks.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
                setRichTextParents(null, pageBlock14.caption.text);
                setRichTextParents(null, pageBlock14.caption.credit);
                addTextBlock(pageBlock14.caption.text, pageBlock14);
                addTextBlock(pageBlock14.caption.credit, pageBlock14);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                setRichTextParents(null, pageblockpullquote.text);
                setRichTextParents(null, pageblockpullquote.caption);
                addTextBlock(pageblockpullquote.text, pageblockpullquote);
                addTextBlock(pageblockpullquote.caption, pageblockpullquote);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
                setRichTextParents(null, pageBlock15.caption.text);
                setRichTextParents(null, pageBlock15.caption.credit);
                addTextBlock(pageBlock15.caption.text, pageBlock15);
                addTextBlock(pageBlock15.caption.credit, pageBlock15);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                setRichTextParents(null, pageblocktable.title);
                addTextBlock(pageblocktable.title, pageblocktable);
                int size4 = pageblocktable.rows.size();
                for (int i2 = 0; i2 < size4; i2++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i2);
                    int size5 = pagetablerow.cells.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i3);
                        setRichTextParents(null, pagetablecell.text);
                        addTextBlock(pagetablecell.text, pageblocktable);
                    }
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
                setRichTextParents(null, pageBlock16.text);
                addTextBlock(pageBlock16.text, pageBlock16);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                setRichTextParents(((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
                setRichTextParents(null, pageblockauthordate.author);
                addTextBlock(pageblockauthordate.author, pageblockauthordate);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockMap) {
                    TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                    setRichTextParents(null, pageBlock17.caption.text);
                    setRichTextParents(null, pageBlock17.caption.credit);
                    addTextBlock(pageBlock17.caption.text, pageBlock17);
                    addTextBlock(pageBlock17.caption.credit, pageBlock17);
                    return;
                }
                if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                    TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                    setRichTextParents(null, pageblockrelatedarticles.title);
                    addTextBlock(pageblockrelatedarticles.title, pageblockrelatedarticles);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.tgnet.tl.TL_iv$PageBlock] */
        /* JADX WARN: Type inference failed for: r1v42, types: [org.telegram.tgnet.tl.TL_iv$PageBlock] */
        /* JADX WARN: Type inference failed for: r25v0, types: [org.telegram.ui.ArticleViewer$WebpageAdapter] */
        public void addBlock(WebpageAdapter webpageAdapter, TL_iv.PageBlock pageBlock, int i, int i2, int i3) {
            TL_iv.pageBlockOrderedList pageblockorderedlist;
            TL_iv.PageListOrderedItem pageListOrderedItem;
            TL_iv.PageListOrderedItem pageListOrderedItem2;
            int i4;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem;
            int i5;
            int i6;
            TL_iv.PageListItem pageListItem;
            int i7;
            int i8;
            TL_pageBlockListParent tL_pageBlockListParent;
            TL_iv.pageBlockList pageblocklist;
            String str;
            TL_pageBlockListItem tL_pageBlockListItem;
            int i9;
            int i10;
            int i11 = 0;
            int i12 = 1;
            boolean z = pageBlock instanceof TL_pageBlockDetailsChild;
            TL_iv.PageBlock pageBlock2 = z ? ((TL_pageBlockDetailsChild) pageBlock).block : pageBlock;
            if (!(pageBlock2 instanceof TL_iv.pageBlockList) && !(pageBlock2 instanceof TL_iv.pageBlockOrderedList)) {
                setRichTextParents(pageBlock2);
                addAllMediaFromBlock(webpageAdapter, pageBlock2);
            }
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(pageBlock2);
            if (lastNonListPageBlock instanceof TL_iv.pageBlockUnsupported) {
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAnchor) {
                this.anchors.put(((TL_iv.pageBlockAnchor) lastNonListPageBlock).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                return;
            }
            if ((lastNonListPageBlock instanceof TL_iv.pageBlockTitle) || (lastNonListPageBlock instanceof TL_iv.pageBlockHeader) || ArticleViewer.isHeadingBlock(lastNonListPageBlock)) {
                String replaceAll = ArticleViewer.getPlainText(lastNonListPageBlock.text).toString().toLowerCase().replaceAll("[\\[\\]\\(\\)\\{\\}]", "").replaceAll(" ", "-");
                if (!this.anchors.containsKey(replaceAll)) {
                    this.anchors.put(replaceAll, Integer.valueOf(this.blocks.size()));
                }
            }
            boolean z2 = lastNonListPageBlock instanceof TL_iv.pageBlockList;
            if (!z2 && !(lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList)) {
                this.blocks.add(pageBlock);
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) lastNonListPageBlock;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i13 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                lastNonListPageBlock.mid = i13;
                tL_message.id = i13;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(ArticleViewer.this.currentAccount).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.webpage = this.currentPage;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = getDocumentWithId(pageblockaudio.audio_id);
                tL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(pageblockaudio, messageObject);
                String musicAuthor = messageObject.getMusicAuthor(false);
                String musicTitle = messageObject.getMusicTitle(false);
                if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                    return;
                }
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    addTextBlock(String.format("%s - %s", musicAuthor, musicTitle), lastNonListPageBlock);
                    return;
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    addTextBlock(musicTitle, lastNonListPageBlock);
                    return;
                } else {
                    addTextBlock(musicAuthor, lastNonListPageBlock);
                    return;
                }
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) lastNonListPageBlock;
                if (pageblockblockquoteblocks.blocks.isEmpty()) {
                    return;
                }
                int max = Math.max(0, lastNonListPageBlock.level);
                int i14 = lastNonListPageBlock.quoteLevels;
                boolean z3 = (i14 == 0 && lastNonListPageBlock.level <= 0) || lastNonListPageBlock.bottom;
                lastNonListPageBlock.level = -1;
                int size = pageblockblockquoteblocks.blocks.size();
                int i15 = 0;
                while (i15 < size) {
                    TL_iv.PageBlock pageBlock3 = pageblockblockquoteblocks.blocks.get(i15);
                    if (!(pageBlock3 instanceof TL_iv.pageBlockUnsupported)) {
                        if (pageBlock3 instanceof TL_iv.pageBlockAnchor) {
                            this.anchors.put(((TL_iv.pageBlockAnchor) pageBlock3).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        } else {
                            pageBlock3.level = max + 1;
                            pageBlock3.quoteLevels = (1 << max) | i14;
                            pageBlock3.bottom = i15 == size + (-1) && z3;
                            i10 = i15;
                            addBlock(webpageAdapter, pageBlock3, i, i2, i3);
                            i15 = i10 + 1;
                        }
                    }
                    i10 = i15;
                    i15 = i10 + 1;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) lastNonListPageBlock;
                if (pageblockembedpost.blocks.isEmpty()) {
                    return;
                }
                lastNonListPageBlock.level = -1;
                while (i11 < pageblockembedpost.blocks.size()) {
                    TL_iv.PageBlock pageBlock4 = pageblockembedpost.blocks.get(i11);
                    if (!(pageBlock4 instanceof TL_iv.pageBlockUnsupported)) {
                        if (pageBlock4 instanceof TL_iv.pageBlockAnchor) {
                            this.anchors.put(((TL_iv.pageBlockAnchor) pageBlock4).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        } else {
                            pageBlock4.level = 1;
                            if (i11 == pageblockembedpost.blocks.size() - 1) {
                                pageBlock4.bottom = true;
                            }
                            this.blocks.add(pageBlock4);
                            addAllMediaFromBlock(webpageAdapter, pageBlock4);
                        }
                    }
                    i11++;
                }
                if (TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.text)) && TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.credit))) {
                    return;
                }
                TL_pageBlockEmbedPostCaption tL_pageBlockEmbedPostCaption = new TL_pageBlockEmbedPostCaption();
                tL_pageBlockEmbedPostCaption.parent = pageblockembedpost;
                tL_pageBlockEmbedPostCaption.caption = pageblockembedpost.caption;
                this.blocks.add(tL_pageBlockEmbedPostCaption);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) lastNonListPageBlock;
                TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow = new TL_pageBlockRelatedArticlesShadow();
                tL_pageBlockRelatedArticlesShadow.parent = pageblockrelatedarticles;
                ArrayList arrayList = this.blocks;
                arrayList.add(arrayList.size() - 1, tL_pageBlockRelatedArticlesShadow);
                int size2 = pageblockrelatedarticles.articles.size();
                while (i11 < size2) {
                    TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = new TL_pageBlockRelatedArticlesChild();
                    tL_pageBlockRelatedArticlesChild.parent = pageblockrelatedarticles;
                    tL_pageBlockRelatedArticlesChild.num = i11;
                    this.blocks.add(tL_pageBlockRelatedArticlesChild);
                    i11++;
                }
                if (i3 == 0) {
                    TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow2 = new TL_pageBlockRelatedArticlesShadow();
                    tL_pageBlockRelatedArticlesShadow2.parent = pageblockrelatedarticles;
                    this.blocks.add(tL_pageBlockRelatedArticlesShadow2);
                    return;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                int size3 = pageblockdetails.blocks.size();
                while (i11 < size3) {
                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild = new TL_pageBlockDetailsChild();
                    tL_pageBlockDetailsChild.parent = pageBlock;
                    tL_pageBlockDetailsChild.block = pageblockdetails.blocks.get(i11);
                    addBlock(webpageAdapter, ArticleViewer.this.wrapInTableBlock(pageBlock, tL_pageBlockDetailsChild), i + 1, i2, i3);
                    i11++;
                }
                return;
            }
            String str2 = ".%d";
            if (z2) {
                TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) lastNonListPageBlock;
                TL_pageBlockListParent tL_pageBlockListParent2 = new TL_pageBlockListParent();
                tL_pageBlockListParent2.pageBlockList = pageblocklist2;
                tL_pageBlockListParent2.level = i2;
                int size4 = pageblocklist2.items.size();
                int i16 = 0;
                while (i16 < size4) {
                    TL_iv.PageListItem pageListItem2 = pageblocklist2.items.get(i16);
                    TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
                    tL_pageBlockListItem2.index = i16;
                    tL_pageBlockListItem2.parent = tL_pageBlockListParent2;
                    if (pageblocklist2.ordered) {
                        if (this.isRtl) {
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(i16 + 1);
                            tL_pageBlockListItem2.num = String.format(str2, objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = Integer.valueOf(i16 + 1);
                            tL_pageBlockListItem2.num = String.format("%d.", objArr2);
                        }
                    } else {
                        tL_pageBlockListItem2.num = "•";
                    }
                    tL_pageBlockListParent2.items.add(tL_pageBlockListItem2);
                    if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem2;
                        tL_pageBlockListItem2.textItem = tL_pageListItemText.text;
                        tL_pageBlockListItem2.isCheckbox = tL_pageListItemText.checkbox;
                        tL_pageBlockListItem2.checked = tL_pageListItemText.checked;
                        pageListItem = pageListItem2;
                    } else {
                        boolean z4 = pageListItem2 instanceof TL_iv.TL_pageListItemBlocks;
                        pageListItem = pageListItem2;
                        if (z4) {
                            TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem2;
                            tL_pageBlockListItem2.isCheckbox = tL_pageListItemBlocks.checkbox;
                            tL_pageBlockListItem2.checked = tL_pageListItemBlocks.checked;
                            if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                                tL_pageBlockListItem2.blockItem = tL_pageListItemBlocks.blocks.get(0);
                                pageListItem = pageListItem2;
                            } else {
                                TL_iv.TL_pageListItemText tL_pageListItemText2 = new TL_iv.TL_pageListItemText();
                                TL_iv.textPlain textplain = new TL_iv.textPlain();
                                textplain.text = " ";
                                tL_pageListItemText2.text = textplain;
                                pageListItem = tL_pageListItemText2;
                            }
                        }
                    }
                    TL_iv.PageListItem pageListItem3 = pageListItem;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild2.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild2.block = tL_pageBlockListItem2;
                        i7 = i16;
                        i8 = size4;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        pageblocklist = pageblocklist2;
                        str = str2;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild2, i, i2 + 1, i3);
                    } else {
                        i7 = i16;
                        i8 = size4;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        pageblocklist = pageblocklist2;
                        str = str2;
                        addBlock(webpageAdapter, i7 == 0 ? ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockListItem2) : tL_pageBlockListItem2, i, i2 + 1, i3);
                    }
                    if (pageListItem3 instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = (TL_iv.TL_pageListItemBlocks) pageListItem3;
                        int size5 = tL_pageListItemBlocks2.blocks.size();
                        int i17 = 1;
                        while (i17 < size5) {
                            TL_pageBlockListItem tL_pageBlockListItem3 = new TL_pageBlockListItem();
                            tL_pageBlockListItem3.blockItem = tL_pageListItemBlocks2.blocks.get(i17);
                            tL_pageBlockListItem3.parent = tL_pageBlockListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild3 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild3.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild3.block = tL_pageBlockListItem3;
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i17;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild3, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i17;
                                addBlock(webpageAdapter, tL_pageBlockListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockListParent.items.add(tL_pageBlockListItem);
                            i17 = i9 + 1;
                        }
                    }
                    i16 = i7 + 1;
                    tL_pageBlockListParent2 = tL_pageBlockListParent;
                    str2 = str;
                    size4 = i8;
                    pageblocklist2 = pageblocklist;
                    i12 = 1;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist2 = (TL_iv.pageBlockOrderedList) lastNonListPageBlock;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = new TL_pageBlockOrderedListParent();
                tL_pageBlockOrderedListParent.pageBlockOrderedList = pageblockorderedlist2;
                tL_pageBlockOrderedListParent.level = i2;
                int size6 = pageblockorderedlist2.items.size();
                int i18 = 0;
                while (i18 < size6) {
                    TL_iv.PageListOrderedItem pageListOrderedItem3 = pageblockorderedlist2.items.get(i18);
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
                    tL_pageBlockOrderedListItem2.index = i18;
                    tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListParent;
                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem2);
                    if (pageListOrderedItem3 instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem3;
                        tL_pageBlockOrderedListItem2.textItem = tL_pageListOrderedItemText.text;
                        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemText.checkbox;
                        tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemText.checked;
                        if (TextUtils.isEmpty(tL_pageListOrderedItemText.num)) {
                            if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i18 + 1));
                                pageblockorderedlist = pageblockorderedlist2;
                                pageListOrderedItem2 = pageListOrderedItem3;
                            } else {
                                tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i18 + 1));
                            }
                        } else if (this.isRtl) {
                            tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemText.num;
                        } else {
                            tL_pageBlockOrderedListItem2.num = tL_pageListOrderedItemText.num + ".";
                        }
                        pageblockorderedlist = pageblockorderedlist2;
                        pageListOrderedItem2 = pageListOrderedItem3;
                    } else {
                        if (pageListOrderedItem3 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem3;
                            tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemBlocks.checkbox;
                            tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemBlocks.checked;
                            if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                                pageblockorderedlist = pageblockorderedlist2;
                                tL_pageBlockOrderedListItem2.blockItem = tL_pageListOrderedItemBlocks.blocks.get(0);
                                pageListOrderedItem = pageListOrderedItem3;
                            } else {
                                pageblockorderedlist = pageblockorderedlist2;
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                                TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                                textplain2.text = " ";
                                tL_pageListOrderedItemText2.text = textplain2;
                                pageListOrderedItem = tL_pageListOrderedItemText2;
                            }
                            if (TextUtils.isEmpty(tL_pageListOrderedItemBlocks.num)) {
                                if (this.isRtl) {
                                    tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i18 + 1));
                                    pageListOrderedItem2 = pageListOrderedItem;
                                } else {
                                    tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i18 + 1));
                                    pageListOrderedItem2 = pageListOrderedItem;
                                }
                            } else if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemBlocks.num;
                                pageListOrderedItem2 = pageListOrderedItem;
                            } else {
                                tL_pageBlockOrderedListItem2.num = tL_pageListOrderedItemBlocks.num + ".";
                                pageListOrderedItem2 = pageListOrderedItem;
                            }
                        }
                        pageblockorderedlist = pageblockorderedlist2;
                        pageListOrderedItem2 = pageListOrderedItem3;
                    }
                    TL_iv.PageListOrderedItem pageListOrderedItem4 = pageListOrderedItem2;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild4 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild4.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild4.block = tL_pageBlockOrderedListItem2;
                        i4 = i18;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild4, i, i2 + 1, i3);
                    } else {
                        i4 = i18;
                        addBlock(webpageAdapter, i4 == 0 ? ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockOrderedListItem2) : tL_pageBlockOrderedListItem2, i, i2 + 1, i3);
                    }
                    if (pageListOrderedItem4 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem4;
                        int size7 = tL_pageListOrderedItemBlocks2.blocks.size();
                        int i19 = 1;
                        while (i19 < size7) {
                            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = new TL_pageBlockOrderedListItem();
                            tL_pageBlockOrderedListItem3.blockItem = tL_pageListOrderedItemBlocks2.blocks.get(i19);
                            tL_pageBlockOrderedListItem3.parent = tL_pageBlockOrderedListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild5 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild5.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild5.block = tL_pageBlockOrderedListItem3;
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i19;
                                i6 = size7;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild5, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i19;
                                i6 = size7;
                                addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                            i19 = i5 + 1;
                            size7 = i6;
                        }
                    }
                    i18 = i4 + 1;
                    pageblockorderedlist2 = pageblockorderedlist;
                }
            }
        }

        private void addAllMediaFromBlock(WebpageAdapter webpageAdapter, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                TLRPC.Photo photoWithId = getPhotoWithId(pageblockphoto.photo_id);
                if (photoWithId != null) {
                    pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 56, true);
                    pageblockphoto.thumbObject = photoWithId;
                    this.photoBlocks.add(pageBlock);
                    return;
                }
                return;
            }
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && WebPageUtils.isVideo(webpageAdapter.currentPage, pageBlock)) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document documentWithId = getDocumentWithId(pageblockvideo.video_id);
                if (documentWithId != null) {
                    pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 56, true);
                    pageblockvideo.thumbObject = documentWithId;
                    this.photoBlocks.add(pageBlock);
                    return;
                }
                return;
            }
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i);
                    pageBlock2.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, pageBlock2);
                    i++;
                }
                ArticleViewer.access$9208(ArticleViewer.this);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i);
                    pageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, pageBlock3);
                    i++;
                }
                ArticleViewer.access$9208(ArticleViewer.this);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                addAllMediaFromBlock(webpageAdapter, ((TL_iv.pageBlockCover) pageBlock).cover);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View blockVideoCell;
            if (i == 2147483646) {
                View view2 = new View(this.context) { // from class: org.telegram.ui.ArticleViewer.WebpageAdapter.1
                    @Override // android.view.View
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), TLObject.FLAG_30));
                    }
                };
                view2.setImportantForAccessibility(2);
                view = view2;
            } else {
                switch (i) {
                    case 0:
                        view = new BlockParagraphCell(this.context, ArticleViewer.this, this);
                        break;
                    case 1:
                        view = new BlockHeaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 2:
                        view = new BlockDividerCell(this.context);
                        break;
                    case 3:
                        view = ArticleViewer.this.new BlockEmbedCell(this.context, this);
                        break;
                    case 4:
                        view = new BlockSubtitleCell(this.context, ArticleViewer.this, this);
                        break;
                    case 5:
                        blockVideoCell = new BlockVideoCell(this.context, ArticleViewer.this, this, 0);
                        view = blockVideoCell;
                        break;
                    case 6:
                        view = new BlockPullquoteCell(this.context, ArticleViewer.this, this);
                        break;
                    case 7:
                        view = new BlockBlockquoteCell(this.context, ArticleViewer.this, this);
                        break;
                    case 8:
                        view = ArticleViewer.this.new BlockSlideshowCell(this.context, this);
                        break;
                    case 9:
                        blockVideoCell = new BlockPhotoCell(this.context, ArticleViewer.this, this, 0);
                        view = blockVideoCell;
                        break;
                    case 10:
                        view = new BlockAuthorDateCell(this.context, ArticleViewer.this, this);
                        break;
                    case 11:
                        view = new BlockTitleCell(this.context, ArticleViewer.this, this);
                        break;
                    case 12:
                        view = new BlockListItemCell(this.context, ArticleViewer.this, this);
                        break;
                    case 13:
                        view = new BlockFooterCell(this.context, ArticleViewer.this, this);
                        break;
                    case 14:
                        view = new BlockPreformattedCell(this.context, ArticleViewer.this, this);
                        break;
                    case 15:
                        view = new BlockSubheaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 16:
                        view = new BlockEmbedPostCell(this.context, ArticleViewer.this, this);
                        break;
                    case 17:
                        view = ArticleViewer.this.new BlockCollageCell(this.context, this);
                        break;
                    case 18:
                        blockVideoCell = new BlockChannelCell(this.context, ArticleViewer.this, this, 0);
                        view = blockVideoCell;
                        break;
                    case 19:
                        view = new BlockAudioCell(this.context, ArticleViewer.this, this);
                        break;
                    case 20:
                        view = new BlockKickerCell(this.context, ArticleViewer.this, this);
                        break;
                    case 21:
                        view = new BlockOrderedListItemCell(this.context, ArticleViewer.this, this);
                        break;
                    case 22:
                        blockVideoCell = new BlockMapCell(this.context, ArticleViewer.this, this, 0);
                        view = blockVideoCell;
                        break;
                    case 23:
                        view = new BlockRelatedArticlesCell(this.context, ArticleViewer.this, this);
                        break;
                    case 24:
                        view = new BlockDetailsCell(this.context, ArticleViewer.this, this);
                        break;
                    case 25:
                        view = new BlockTableCell(this.context, ArticleViewer.this, this);
                        break;
                    case 26:
                        view = new BlockRelatedArticlesHeaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 27:
                        view = new BlockDetailsBottomCell(this.context);
                        break;
                    case 28:
                        view = new BlockRelatedArticlesShadowCell(this.context, ArticleViewer.this);
                        break;
                    default:
                        switch (i) {
                            case 90:
                                blockVideoCell = ArticleViewer.this.new ReportCell(this.context, false);
                                view = blockVideoCell;
                                break;
                            case 91:
                                view = ArticleViewer.this.new ReportCell(this.context, true);
                                break;
                            case 92:
                                view = new BlockMathCell(this.context, ArticleViewer.this, this);
                                break;
                            default:
                                TextView textView = new TextView(this.context);
                                textView.setBackgroundColor(-65536);
                                textView.setTextColor(-16777216);
                                textView.setTextSize(1, 20.0f);
                                view = textView;
                                break;
                        }
                }
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            view.setFocusable(true);
            return new RecyclerListView.Holder(view);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.padding) {
                i--;
            }
            int i2 = i;
            if (i2 < 0 || i2 >= this.localBlocks.size()) {
                return;
            }
            bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, (TL_iv.PageBlock) this.localBlocks.get(i2), i2, this.localBlocks.size(), false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 90 || viewHolder.getItemViewType() == 91) {
                ReportCell reportCell = (ReportCell) viewHolder.itemView;
                TL_iv.Page page = this.currentPage.cached_page;
                reportCell.setViews(page != null ? page.views : 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bindBlockToHolder(int i, RecyclerView.ViewHolder viewHolder, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z) {
            TL_iv.PageBlock pageBlock2;
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                pageBlock2 = ((TL_iv.pageBlockCover) pageBlock).cover;
            } else {
                pageBlock2 = pageBlock instanceof TL_pageBlockDetailsChild ? ((TL_pageBlockDetailsChild) pageBlock).block : pageBlock;
            }
            if (i == 92) {
                ((BlockMathCell) viewHolder.itemView).setBlock((TL_iv.pageBlockMath) pageBlock2);
                return;
            }
            if (i != 100) {
                switch (i) {
                    case 0:
                        ((BlockParagraphCell) viewHolder.itemView).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                        break;
                    case 1:
                        ((BlockHeaderCell) viewHolder.itemView).setBlock(pageBlock2);
                        break;
                    case 2:
                        break;
                    case 3:
                        ((BlockEmbedCell) viewHolder.itemView).setBlock((TL_iv.pageBlockEmbed) pageBlock2);
                        break;
                    case 4:
                        ((BlockSubtitleCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                        break;
                    case 5:
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), z, i2 == 0, i2 == i3 - 1);
                        blockVideoCell.setParentBlock(this.channelBlock, pageBlock);
                        break;
                    case 6:
                        ((BlockPullquoteCell) viewHolder.itemView).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                        break;
                    case 7:
                        ((BlockBlockquoteCell) viewHolder.itemView).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                        break;
                    case 8:
                        ((BlockSlideshowCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSlideshow) pageBlock2);
                        break;
                    case 9:
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock2, this.currentPage, null, z, i2 == 0);
                        blockPhotoCell.setParentBlock(pageBlock);
                        break;
                    case 10:
                        ((BlockAuthorDateCell) viewHolder.itemView).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                        break;
                    case 11:
                        ((BlockTitleCell) viewHolder.itemView).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                        break;
                    case 12:
                        ((BlockListItemCell) viewHolder.itemView).setBlock((TL_pageBlockListItem) pageBlock2);
                        break;
                    case 13:
                        ((BlockFooterCell) viewHolder.itemView).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                        break;
                    case 14:
                        ((BlockPreformattedCell) viewHolder.itemView).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                        break;
                    case 15:
                        ((BlockSubheaderCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                        break;
                    case 16:
                        ((BlockEmbedPostCell) viewHolder.itemView).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                        break;
                    case 17:
                        ((BlockCollageCell) viewHolder.itemView).setBlock((TL_iv.pageBlockCollage) pageBlock2);
                        break;
                    case 18:
                        ((BlockChannelCell) viewHolder.itemView).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                        break;
                    case 19:
                        ((BlockAudioCell) viewHolder.itemView).setBlock((TL_iv.pageBlockAudio) pageBlock2, i2 == 0, i2 == i3 - 1);
                        break;
                    case 20:
                        ((BlockKickerCell) viewHolder.itemView).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                        break;
                    case 21:
                        ((BlockOrderedListItemCell) viewHolder.itemView).setBlock((TL_pageBlockOrderedListItem) pageBlock2);
                        break;
                    case 22:
                        ((BlockMapCell) viewHolder.itemView).setBlock((TL_iv.pageBlockMap) pageBlock2, i2 == 0, i2 == i3 - 1);
                        break;
                    case 23:
                        ((BlockRelatedArticlesCell) viewHolder.itemView).setBlock((TL_pageBlockRelatedArticlesChild) pageBlock2, this.currentPage);
                        break;
                    case 24:
                        ((BlockDetailsCell) viewHolder.itemView).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                        break;
                    case 25:
                        ((BlockTableCell) viewHolder.itemView).setBlock((TL_iv.pageBlockTable) pageBlock2);
                        break;
                    case 26:
                        ((BlockRelatedArticlesHeaderCell) viewHolder.itemView).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                        break;
                    case 27:
                        break;
                }
                return;
            }
            ((TextView) viewHolder.itemView).setText("unsupported block " + pageBlock2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTypeForBlock(TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                return 0;
            }
            if ((pageBlock instanceof TL_iv.pageBlockHeader) || ArticleViewer.isHeadingBlock(pageBlock)) {
                return 1;
            }
            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                return 2;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                return 3;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                return 4;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return 5;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return 6;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return 7;
            }
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                return 8;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return 9;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                return 10;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                return 11;
            }
            if (pageBlock instanceof TL_pageBlockListItem) {
                return 12;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                return 13;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return 14;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                return 15;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                return 16;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                return 17;
            }
            if (pageBlock instanceof TL_iv.pageBlockChannel) {
                return 18;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                return 19;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                return 20;
            }
            if (pageBlock instanceof TL_pageBlockOrderedListItem) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                return 23;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return 24;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                return 25;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                return 26;
            }
            if (pageBlock instanceof TL_pageBlockRelatedArticlesShadow) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof TL_pageBlockDetailsChild) {
                return getTypeForBlock(((TL_pageBlockDetailsChild) pageBlock).block);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return getTypeForBlock(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            TL_iv.Page page;
            if (this.padding) {
                if (i == 0) {
                    return 2147483646;
                }
                i--;
            }
            if (i == this.localBlocks.size()) {
                TLRPC.WebPage webPage = this.currentPage;
                return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
            }
            return getTypeForBlock((TL_iv.PageBlock) this.localBlocks.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i;
            TLRPC.WebPage webPage = this.currentPage;
            if (webPage == null || webPage.cached_page == null) {
                i = 0;
            } else {
                i = this.localBlocks.size();
                if (this.currentPage.cached_page.local == null) {
                    i++;
                }
            }
            return this.padding ? i + 1 : i;
        }

        private boolean isBlockOpened(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                return ((TL_iv.pageBlockDetails) lastNonListPageBlock).open;
            }
            if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
                return false;
            }
            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
            TL_iv.PageBlock lastNonListPageBlock2 = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
            if (!(lastNonListPageBlock2 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) lastNonListPageBlock2).open) {
                return isBlockOpened(tL_pageBlockDetailsChild2);
            }
            return false;
        }

        public void resetCachedHeights() {
            for (int i = 0; i < this.localBlocks.size(); i++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.localBlocks.get(i);
                if (pageBlock != null) {
                    pageBlock.cachedWidth = 0;
                    pageBlock.cachedHeight = 0;
                }
            }
            calculateContentHeight();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRows() {
            this.localBlocks.clear();
            int size = this.blocks.size();
            for (int i = 0; i < size; i++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.blocks.get(i);
                TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(pageBlock);
                if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild) || isBlockOpened((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.localBlocks.add(pageBlock);
                }
            }
            if (this.localBlocks.size() < 100) {
                calculateContentHeight();
            } else {
                this.itemHeights = null;
            }
        }

        public void calculateContentHeight() {
            Utilities.globalQueue.cancelRunnable(this.calculateContentHeightRunnable);
            Utilities.globalQueue.postRunnable(this.calculateContentHeightRunnable, 100L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$new$1() {
            RecyclerListView recyclerListView;
            int i;
            int i2;
            ArrayList arrayList = new ArrayList(this.localBlocks);
            int size = arrayList.size();
            Sheet sheet = ArticleViewer.this.sheet;
            int i3 = 0;
            int i4 = size + ((sheet == null || !sheet.halfSize()) ? 0 : 1);
            final int[] iArr = new int[i4];
            final int[] iArr2 = new int[i4];
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout == null || (recyclerListView = pageLayout.listView) == null) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
            int i5 = 0;
            int i6 = 0;
            while (i6 < i4) {
                boolean z = this.padding;
                if (z && i6 == 0) {
                    iArr[i3] = i3;
                } else {
                    int i7 = z ? i6 - 1 : i6;
                    TL_iv.PageBlock pageBlock = (i7 < 0 || i7 >= arrayList.size()) ? null : (TL_iv.PageBlock) arrayList.get(i7);
                    if (pageBlock != null && pageBlock.cachedHeight != 0 && pageBlock.cachedWidth == View.MeasureSpec.getSize(makeMeasureSpec)) {
                        iArr[i6] = pageBlock.cachedHeight;
                    } else {
                        RecyclerView.ViewHolder createViewHolder = createViewHolder(recyclerListView, getTypeForBlock(pageBlock));
                        i = i5;
                        i2 = i6;
                        bindBlockToHolder(createViewHolder.getItemViewType(), createViewHolder, pageBlock, i7, arrayList.size(), true);
                        createViewHolder.itemView.measure(makeMeasureSpec, makeMeasureSpec2);
                        int measuredHeight = createViewHolder.itemView.getMeasuredHeight();
                        iArr[i2] = measuredHeight;
                        if (pageBlock != null) {
                            pageBlock.cachedHeight = measuredHeight;
                            pageBlock.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                        }
                        int i8 = i2 - 1;
                        iArr2[i2] = (i8 >= 0 ? 0 : iArr2[i8]) + iArr[i2];
                        i5 = i + iArr[i2];
                        i6 = i2 + 1;
                        i3 = 0;
                    }
                }
                i = i5;
                i2 = i6;
                int i82 = i2 - 1;
                iArr2[i2] = (i82 >= 0 ? 0 : iArr2[i82]) + iArr[i2];
                i5 = i + iArr[i2];
                i6 = i2 + 1;
                i3 = 0;
            }
            final int i9 = i5;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$WebpageAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.WebpageAdapter.this.lambda$new$0(i9, iArr, iArr2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i, int[] iArr, int[] iArr2) {
            this.fullHeight = i;
            this.itemHeights = iArr;
            this.sumItemHeights = iArr2;
            ArticleViewer.this.updatePages();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cleanup() {
            this.currentPage = null;
            this.blocks.clear();
            this.photoBlocks.clear();
            this.audioBlocks.clear();
            this.audioMessages.clear();
            this.anchors.clear();
            this.anchorsParent.clear();
            this.anchorsOffset.clear();
            this.textBlocks.clear();
            this.textToBlocks.clear();
            this.channelBlock = null;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemChanged(int i) {
            updateRows();
            super.notifyItemChanged(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemMoved(int i, int i2) {
            updateRows();
            super.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }
    }

    public static class BlockVideoCellState {
        Bitmap lastFrameBitmap;
        long playFrom;

        public static BlockVideoCellState fromPlayer(VideoPlayerHolderBase videoPlayerHolderBase, BlockVideoCell blockVideoCell) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayerHolderBase.getCurrentPosition();
            if (videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView != null && blockVideoCell.textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = createBitmap;
                } else {
                    blockVideoCellState.lastFrameBitmap = blockVideoCell.textureView.getBitmap();
                }
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, TextureView textureView) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = createBitmap;
                } else {
                    blockVideoCellState.lastFrameBitmap = textureView.getBitmap();
                }
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, SurfaceView surfaceView) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (surfaceView != null && Build.VERSION.SDK_INT >= 24) {
                Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap);
                blockVideoCellState.lastFrameBitmap = createBitmap;
            }
            return blockVideoCellState;
        }
    }

    public interface IBlock {
        int getBoundLeft();

        int getBoundRight();

        int getLastLineBoundRight();

        public abstract /* synthetic */ class -CC {
            public static int $default$getMinWidth(IBlock iBlock) {
                int boundLeft = iBlock.getBoundLeft();
                int boundRight = iBlock.getBoundRight();
                if (boundLeft < 0 || boundRight < 0 || boundRight < boundLeft) {
                    return -1;
                }
                return boundRight - boundLeft;
            }
        }
    }

    public static class BlockVideoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        private AspectRatioFrameLayout aspectRatioFrameLayout;
        FrameLayout aspectRationContainer;
        private boolean attached;
        private boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean calcHeight;
        private boolean cancelLoading;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockVideo currentBlock;
        private TLRPC.Document currentDocument;
        private int currentType;
        private boolean firstFrameRendered;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private boolean isGif;
        private final IArticleViewer parent;
        private TL_iv.PageBlock parentBlock;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;
        private TextureView textureView;
        private BlockVideoCellState videoState;

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockVideoCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setNeedsQualityThumb(true);
            this.imageView.setShouldGenerateQualityThumb(true);
            this.currentType = i;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
            this.channelCell = new BlockChannelCell(context, iArticleViewer, webpageAdapter, 1);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setResizeMode(0);
            TextureView textureView = new TextureView(context);
            this.textureView = textureView;
            textureView.setOpaque(false);
            this.aspectRationContainer = new FrameLayout(getContext());
            this.aspectRatioFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -2, 1));
            this.aspectRationContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1, 17));
            addView(this.aspectRationContainer, LayoutHelper.createFrame(-1, -2.0f));
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) {
            setBlock(pageblockvideo, null, blockVideoCellState, z, z2, z3);
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, TLObject tLObject, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) {
            IArticleViewer iArticleViewer;
            VideoPlayerHolderBase videoPlayerHolderBase;
            TL_iv.pageBlockVideo pageblockvideo2 = this.currentBlock;
            if (pageblockvideo2 != null && (videoPlayerHolderBase = (iArticleViewer = this.parent).videoPlayer) != null && iArticleViewer.currentPlayer == this) {
                LongSparseArray longSparseArray = iArticleViewer.videoStates;
                long j = pageblockvideo2.video_id;
                BlockVideoCellState fromPlayer = BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this);
                this.videoState = fromPlayer;
                longSparseArray.put(j, fromPlayer);
            }
            this.currentBlock = pageblockvideo;
            this.videoState = blockVideoCellState;
            this.parentBlock = null;
            this.calcHeight = z;
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null) {
                this.currentDocument = webpageAdapter.getDocumentWithId(pageblockvideo.video_id);
            } else if (tLObject != null) {
                this.currentDocument = WebPageUtils.getDocumentWithId(tLObject, pageblockvideo.video_id);
            } else {
                this.currentDocument = null;
            }
            this.isGif = MessageObject.isVideoDocument(this.currentDocument) || MessageObject.isGifDocument(this.currentDocument);
            this.isFirst = z2;
            this.channelCell.setVisibility(4);
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TL_iv.pageBlockChannel pageblockchannel, TL_iv.PageBlock pageBlock) {
            this.parentBlock = pageBlock;
            if (pageblockchannel == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(pageblockchannel);
            this.channelCell.setVisibility(0);
        }

        public View getChannelCell() {
            return this.channelCell;
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        public TL_iv.pageBlockVideo getCurrentBlock() {
            return this.currentBlock;
        }

        public TextureView getTextureView() {
            return this.textureView;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        
            if (r1 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L30;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.channelBlock != null) {
                    motionEvent.getAction();
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    if (x >= this.buttonX && x <= r2 + AndroidUtilities.dp(48.0f)) {
                        if (y >= this.buttonY) {
                        }
                    }
                }
                if (this.buttonState != 0) {
                    this.photoPressed = true;
                }
                this.buttonPressed = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    this.parent.openPhoto(this.currentBlock, this.adapter);
                } else if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
        @Override // android.widget.FrameLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            TL_iv.pageBlockVideo pageblockvideo;
            int i5;
            int dp;
            int i6;
            int i7;
            WebpageAdapter webpageAdapter;
            int dp2;
            int i8;
            boolean z;
            int i9;
            int size = View.MeasureSpec.getSize(i);
            int i10 = this.currentType;
            if (i10 == 1) {
                size = ((View) getParent()).getMeasuredWidth();
                i4 = ((View) getParent()).getMeasuredHeight();
            } else if (i10 == 2) {
                float f = this.groupPosition.ph;
                Point point = AndroidUtilities.displaySize;
                i4 = (int) Math.ceil(f * Math.max(point.x, point.y) * 0.5f);
            } else {
                i3 = size;
                i4 = 0;
                int currentAccount = this.parent.getCurrentAccount();
                pageblockvideo = this.currentBlock;
                if (pageblockvideo == null) {
                    if (this.currentType == 0 && (i9 = pageblockvideo.level) > 0) {
                        i7 = AndroidUtilities.dp(i9 * 14) + AndroidUtilities.dp(18.0f);
                        this.textX = i7;
                        i6 = i3 - (AndroidUtilities.dp(18.0f) + i7);
                        dp = i6;
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                        dp = i3 - AndroidUtilities.dp(36.0f);
                        i6 = i3;
                        i7 = 0;
                    }
                    if (this.currentDocument != null) {
                        int dp3 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 48);
                        int i11 = this.currentType;
                        if (i11 == 0) {
                            int size2 = this.currentDocument.attributes.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    z = false;
                                    break;
                                }
                                if (this.currentDocument.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i4 = (int) ((i6 / r11.w) * r11.h);
                                    z = true;
                                    break;
                                }
                                i12++;
                            }
                            float f2 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f3 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z) {
                                i4 = (int) ((i6 / f2) * f3);
                            }
                            if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                                i4 = Math.min(i4, i6);
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    i6 = (int) ((max / f3) * f2);
                                    i7 += ((i3 - i7) - i6) / 2;
                                    i4 = max;
                                }
                            }
                            if (i4 == 0) {
                                i4 = AndroidUtilities.dp(100.0f);
                            } else if (i4 < dp3) {
                                i4 = dp3;
                            }
                        } else if (i11 == 2) {
                            if ((this.groupPosition.flags & 2) == 0) {
                                i6 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.groupPosition.flags & 8) == 0) {
                                dp2 = i4 - AndroidUtilities.dp(2.0f);
                                this.imageView.setQualityThumbDocument(this.currentDocument);
                                this.imageView.setImageCoords(i7, (!this.isFirst || (i8 = this.currentType) == 1 || i8 == 2 || this.currentBlock.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i6, dp2);
                                if (!this.calcHeight) {
                                    if (this.isGif) {
                                        BlockVideoCellState blockVideoCellState = this.videoState;
                                        if (blockVideoCellState != null && blockVideoCellState.lastFrameBitmap != null) {
                                            this.imageView.setStrippedLocation(null);
                                            this.imageView.setImageBitmap(this.videoState.lastFrameBitmap);
                                        } else {
                                            this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                            File pathToAttach = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                            File pathToAttach2 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                            if (this.autoDownload || pathToAttach.exists() || pathToAttach2.exists()) {
                                                this.imageView.setStrippedLocation(null);
                                                this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                            } else {
                                                this.imageView.setStrippedLocation(ImageLocation.getForDocument(this.currentDocument));
                                                this.imageView.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                            }
                                        }
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        ImageReceiver imageReceiver = this.imageView;
                                        ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument);
                                        WebpageAdapter webpageAdapter2 = this.adapter;
                                        imageReceiver.setImage(null, null, forDocument, "80_80_b", 0L, null, webpageAdapter2 != null ? webpageAdapter2.currentPage : null, 1);
                                    }
                                }
                                this.imageView.setAspectFit(true);
                                float f4 = dp3;
                                this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f4) / 2.0f));
                                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f4) / 2.0f));
                                this.buttonY = imageY;
                                RadialProgress2 radialProgress2 = this.radialProgress;
                                int i13 = this.buttonX;
                                radialProgress2.setProgressRect(i13, imageY, i13 + dp3, dp3 + imageY);
                            }
                        }
                        dp2 = i4;
                        this.imageView.setQualityThumbDocument(this.currentDocument);
                        this.imageView.setImageCoords(i7, (!this.isFirst || (i8 = this.currentType) == 1 || i8 == 2 || this.currentBlock.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i6, dp2);
                        if (!this.calcHeight) {
                        }
                        this.imageView.setAspectFit(true);
                        float f42 = dp3;
                        this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f42) / 2.0f));
                        int imageY2 = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f42) / 2.0f));
                        this.buttonY = imageY2;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        int i132 = this.buttonX;
                        radialProgress22.setProgressRect(i132, imageY2, i132 + dp3, dp3 + imageY2);
                    }
                    int i14 = i4;
                    int imageY3 = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                    this.textY = imageY3;
                    if (this.currentType == 0) {
                        IArticleViewer iArticleViewer = this.parent;
                        TL_iv.pageBlockVideo pageblockvideo2 = this.currentBlock;
                        DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockvideo2.caption.text, dp, imageY3, pageblockvideo2, this.adapter);
                        this.captionLayout = createLayoutForText;
                        if (createLayoutForText != null) {
                            int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp4;
                            i14 += dp4 + AndroidUtilities.dp(4.0f);
                            DrawingText drawingText = this.captionLayout;
                            drawingText.x = this.textX;
                            drawingText.y = this.textY;
                        }
                        IArticleViewer iArticleViewer2 = this.parent;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.currentBlock;
                        TL_iv.RichText richText = pageblockvideo3.caption.credit;
                        int i15 = this.textY + this.creditOffset;
                        WebpageAdapter webpageAdapter3 = this.adapter;
                        DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, dp, i15, pageblockvideo3, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                        this.creditLayout = createLayoutForText2;
                        if (createLayoutForText2 != null) {
                            i14 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                            DrawingText drawingText2 = this.creditLayout;
                            drawingText2.x = this.textX;
                            drawingText2.y = this.textY + this.creditOffset;
                        }
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        i14 += AndroidUtilities.dp(8.0f);
                    }
                    i5 = (this.currentType == 2 || ((this.parentBlock instanceof TL_iv.pageBlockCover) && (webpageAdapter = this.adapter) != null && webpageAdapter.blocks.size() > 1 && (this.adapter.blocks.get(1) instanceof TL_iv.pageBlockChannel))) ? i14 : i14 + AndroidUtilities.dp(8.0f);
                } else {
                    i5 = 1;
                }
                this.channelCell.measure(i, i2);
                this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.aspectRationContainer.getLayoutParams();
                layoutParams.leftMargin = (int) this.imageView.getImageX();
                layoutParams.topMargin = (int) this.imageView.getImageY();
                layoutParams.width = (int) this.imageView.getImageWidth();
                layoutParams.height = (int) this.imageView.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30));
            }
            i3 = size;
            int currentAccount2 = this.parent.getCurrentAccount();
            pageblockvideo = this.currentBlock;
            if (pageblockvideo == null) {
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.aspectRationContainer.getLayoutParams();
            layoutParams2.leftMargin = (int) this.imageView.getImageX();
            layoutParams2.topMargin = (int) this.imageView.getImageY();
            layoutParams2.width = (int) this.imageView.getImageWidth();
            layoutParams2.height = (int) this.imageView.getImageHeight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getDrawRegion(), ArticleViewer.photoBackgroundPaint);
            }
            this.imageView.draw(canvas);
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
            super.onDraw(canvas);
            if (this.imageView.getVisible()) {
                this.radialProgress.draw(canvas);
            }
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 0 : 4;
        }

        public void updateButtonState(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean z2 = true;
            boolean z3 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument).exists() || FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z3) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                if (!this.isGif) {
                    this.buttonState = 3;
                } else {
                    this.buttonState = -1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                BlockVideoCellState blockVideoCellState = this.videoState;
                float f = 0.0f;
                if (blockVideoCellState != null && blockVideoCellState.lastFrameBitmap != null) {
                    this.buttonState = -1;
                } else {
                    if (!FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                        if (!this.cancelLoading && this.autoDownload && this.isGif) {
                            this.buttonState = 1;
                        } else {
                            this.buttonState = 0;
                        }
                    } else {
                        this.buttonState = 1;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress != null) {
                            f = fileProgress.floatValue();
                        }
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                    this.radialProgress.setProgress(f, false);
                }
                z2 = false;
                this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                this.radialProgress.setProgress(f, false);
            }
            invalidate();
        }

        private void didPressedButton(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            int i = this.buttonState;
            if (i == 0) {
                this.cancelLoading = false;
                this.radialProgress.setProgress(0.0f, false);
                if (!this.isGif) {
                    FileLoader.getInstance(currentAccount).loadFile(this.currentDocument, this.adapter.currentPage, 1, 1);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.adapter.currentPage, 1);
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    this.imageView.setAllowStartAnimation(true);
                    this.imageView.startAnimation();
                    this.buttonState = -1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    return;
                }
                return;
            }
            this.cancelLoading = true;
            if (this.isGif) {
                this.imageView.cancelLoadImage();
            } else {
                FileLoader.getInstance(currentAccount).cancelLoadFile(this.currentDocument);
            }
            this.buttonState = 0;
            this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            invalidate();
        }

        private void updateAttachedState() {
            if (getVisibility() == 0 && isAttachedToWindow()) {
                attach();
            } else {
                detach();
            }
        }

        private void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
        }

        private void detach() {
            IArticleViewer iArticleViewer;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (this.attached) {
                this.attached = false;
                TL_iv.pageBlockVideo pageblockvideo = this.currentBlock;
                if (pageblockvideo != null && (videoPlayerHolderBase = (iArticleViewer = this.parent).videoPlayer) != null && iArticleViewer.currentPlayer == this) {
                    iArticleViewer.videoStates.put(pageblockvideo.video_id, setState(BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this)));
                }
                this.imageView.onDetachedFromWindow();
                DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
                this.firstFrameRendered = false;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            updateAttachedState();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateAttachedState();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.View
        public void setVisibility(int i) {
            super.setVisibility(i);
            updateAttachedState();
        }

        public BlockVideoCellState setState(BlockVideoCellState blockVideoCellState) {
            Bitmap bitmap;
            Bitmap bitmap2;
            Bitmap bitmap3;
            BlockVideoCellState blockVideoCellState2 = this.videoState;
            if (blockVideoCellState2 != null && blockVideoCellState != null && (bitmap2 = blockVideoCellState.lastFrameBitmap) != null && (bitmap3 = blockVideoCellState2.lastFrameBitmap) != null && bitmap2 != bitmap3) {
                bitmap3.recycle();
                this.videoState.lastFrameBitmap = null;
            }
            BlockVideoCellState blockVideoCellState3 = this.videoState;
            if (blockVideoCellState3 != null && blockVideoCellState != null && blockVideoCellState.lastFrameBitmap == null && (bitmap = blockVideoCellState3.lastFrameBitmap) != null) {
                blockVideoCellState.playFrom = blockVideoCellState3.playFrom;
                blockVideoCellState.lastFrameBitmap = bitmap;
            }
            this.videoState = blockVideoCellState;
            return blockVideoCellState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void startVideoPlayer() {
            if (this.currentDocument != null) {
                IArticleViewer iArticleViewer = this.parent;
                if (iArticleViewer.videoPlayer != null) {
                    return;
                }
                iArticleViewer.videoPlayer = new VideoPlayerHolderBase() { // from class: org.telegram.ui.ArticleViewer.BlockVideoCell.1
                    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
                    public boolean needRepeat() {
                        return true;
                    }

                    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
                    public void onRenderedFirstFrame() {
                        super.onRenderedFirstFrame();
                        if (this.firstFrameRendered) {
                            return;
                        }
                        this.firstFrameRendered = true;
                        BlockVideoCell.this.textureView.setAlpha(1.0f);
                        if (BlockVideoCell.this.currentBlock != null) {
                            LongSparseArray longSparseArray = BlockVideoCell.this.parent.videoStates;
                            long j = BlockVideoCell.this.currentBlock.video_id;
                            BlockVideoCell blockVideoCell = BlockVideoCell.this;
                            longSparseArray.put(j, blockVideoCell.setState(BlockVideoCellState.fromPlayer(blockVideoCell.parent.videoPlayer, BlockVideoCell.this)));
                        }
                    }
                }.with(this.textureView);
                TLRPC.Document document = this.currentDocument;
                for (int i = 0; i < document.attributes.size(); i++) {
                    if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i);
                        this.aspectRatioFrameLayout.setAspectRatio(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                    }
                }
                Uri prepareUri = this.adapter.currentPage == null ? null : FileStreamLoadOperation.prepareUri(this.parent.getCurrentAccount(), document, this.adapter.currentPage);
                if (prepareUri == null) {
                    return;
                }
                VideoPlayerHolderBase videoPlayerHolderBase = this.parent.videoPlayer;
                BlockVideoCellState blockVideoCellState = this.videoState;
                videoPlayerHolderBase.seekTo(blockVideoCellState == null ? 0L : blockVideoCellState.playFrom);
                this.parent.videoPlayer.preparePlayer(prepareUri, true, 1.0f);
                this.parent.videoPlayer.play();
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            if (this.isGif) {
                this.buttonState = 2;
                didPressedButton(true);
            } else {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.TAG;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public static class BlockAudioCell extends View implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockAudio currentBlock;
        private TLRPC.Document currentDocument;
        private MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private boolean isFirst;
        private String lastTimeString;
        private final IArticleViewer parent;
        private RadialProgress2 radialProgress;
        private SeekBar seekBar;
        private int seekBarX;
        private int seekBarY;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockAudioCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(58.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
            SeekBar seekBar = new SeekBar(this);
            this.seekBar = seekBar;
            seekBar.setDelegate(new SeekBar.SeekBarDelegate() { // from class: org.telegram.ui.ArticleViewer$BlockAudioCell$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public /* synthetic */ boolean isSeekBarDragAllowed() {
                    return SeekBar.SeekBarDelegate.-CC.$default$isSeekBarDragAllowed(this);
                }

                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public /* synthetic */ void onSeekBarContinuousDrag(float f) {
                    SeekBar.SeekBarDelegate.-CC.$default$onSeekBarContinuousDrag(this, f);
                }

                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public final void onSeekBarDrag(float f) {
                    ArticleViewer.BlockAudioCell.this.lambda$new$0(f);
                }

                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public /* synthetic */ void onSeekBarPressed() {
                    SeekBar.SeekBarDelegate.-CC.$default$onSeekBarPressed(this);
                }

                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public /* synthetic */ void onSeekBarReleased() {
                    SeekBar.SeekBarDelegate.-CC.$default$onSeekBarReleased(this);
                }

                @Override // org.telegram.ui.Components.SeekBar.SeekBarDelegate
                public /* synthetic */ boolean reverseWaveform() {
                    return SeekBar.SeekBarDelegate.-CC.$default$reverseWaveform(this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(float f) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
        }

        public void setBlock(TL_iv.pageBlockAudio pageblockaudio, boolean z, boolean z2) {
            this.currentBlock = pageblockaudio;
            MessageObject messageObject = (MessageObject) this.adapter.audioBlocks.get(this.currentBlock);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                this.currentDocument = messageObject.getDocument();
            }
            this.isFirst = z;
            SeekBar seekBar = this.seekBar;
            int themedColor = this.parent.getThemedColor(Theme.key_chat_inAudioSeekbar);
            int themedColor2 = this.parent.getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
            IArticleViewer iArticleViewer = this.parent;
            int i = Theme.key_chat_inAudioSeekbarFill;
            seekBar.setColors(themedColor, themedColor2, iArticleViewer.getThemedColor(i), this.parent.getThemedColor(i), this.parent.getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
            updateButtonState(false);
            requestLayout();
        }

        public MessageObject getMessageObject() {
            return this.currentMessageObject;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (r1 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            r12.buttonPressed = 1;
            invalidate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        
            if (r12.buttonState == 0) goto L23;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.seekBar.onTouch(motionEvent.getAction(), motionEvent.getX() - this.seekBarX, motionEvent.getY() - this.seekBarY)) {
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (this.buttonState != -1) {
                    if (x >= this.buttonX && x <= r2 + AndroidUtilities.dp(48.0f)) {
                        if (y >= this.buttonY) {
                        }
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.buttonPressed = 0;
            }
            return this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder;
            int i3 = 1;
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(54.0f);
            TL_iv.pageBlockAudio pageblockaudio = this.currentBlock;
            if (pageblockaudio != null) {
                if (pageblockaudio.level > 0) {
                    this.textX = AndroidUtilities.dp(r0 * 14) + AndroidUtilities.dp(18.0f);
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int dp2 = (size - this.textX) - AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(44.0f);
                this.buttonX = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(5.0f);
                this.buttonY = dp4;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i4 = this.buttonX;
                radialProgress2.setProgressRect(i4, dp4, i4 + dp3, dp4 + dp3);
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockAudio pageblockaudio2 = this.currentBlock;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockaudio2.caption.text, dp2, this.textY, pageblockaudio2, this.adapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp5 = AndroidUtilities.dp(8.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp5;
                    dp += dp5 + AndroidUtilities.dp(8.0f);
                }
                int i5 = dp;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockAudio pageblockaudio3 = this.currentBlock;
                DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, null, pageblockaudio3.caption.credit, dp2, this.textY + this.creditOffset, pageblockaudio3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.adapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i5 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                String musicAuthor = this.currentMessageObject.getMusicAuthor(false);
                String musicTitle = this.currentMessageObject.getMusicTitle(false);
                int dp6 = this.buttonX + AndroidUtilities.dp(50.0f) + dp3;
                this.seekBarX = dp6;
                int dp7 = (size - dp6) - AndroidUtilities.dp(18.0f);
                if (!TextUtils.isEmpty(musicTitle) || !TextUtils.isEmpty(musicAuthor)) {
                    if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", musicAuthor, musicTitle));
                    } else if (!TextUtils.isEmpty(musicTitle)) {
                        spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                    }
                    if (!TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, dp7, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText(this.parent);
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(ellipsize, ArticleViewer.audioTimePaint, dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
                } else {
                    this.titleLayout = null;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2);
                }
                this.seekBar.setSize(dp7, AndroidUtilities.dp(30.0f));
                i3 = i5;
            }
            setMeasuredDimension(size, i3);
            updatePlayingMessageProgress();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            this.radialProgress.setProgressColor(this.parent.getThemedColor(Theme.key_chat_inFileProgress));
            this.radialProgress.draw(canvas);
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.draw(canvas);
            canvas.restore();
            if (this.durationLayout != null) {
                canvas.save();
                canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY + AndroidUtilities.dp(6.0f));
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            int i = 0;
            if (this.titleLayout != null) {
                canvas.save();
                this.titleLayout.x = this.buttonX + AndroidUtilities.dp(54.0f);
                this.titleLayout.y = this.seekBarY - AndroidUtilities.dp(16.0f);
                DrawingText drawingText = this.titleLayout;
                canvas.translate(drawingText.x, drawingText.y);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.captionLayout != null) {
                canvas.save();
                DrawingText drawingText2 = this.captionLayout;
                int i2 = this.textX;
                drawingText2.x = i2;
                int i3 = this.textY;
                drawingText2.y = i3;
                canvas.translate(i2, i3);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                DrawingText drawingText3 = this.creditLayout;
                int i4 = this.textX;
                drawingText3.x = i4;
                int i5 = this.textY + this.creditOffset;
                drawingText3.y = i5;
                canvas.translate(i4, i5);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return i == 3 ? 3 : 0;
        }

        public void updatePlayingMessageProgress() {
            int i;
            if (this.currentDocument == null || this.currentMessageObject == null) {
                return;
            }
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(this.currentMessageObject.audioProgress);
            }
            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.currentDocument.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i = (int) documentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.currentMessageObject.audioProgressSec;
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i);
            String str = this.lastTimeString;
            if (str == null || !str.equals(formatShortDuration)) {
                this.lastTimeString = formatShortDuration;
                ArticleViewer.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(formatShortDuration, ArticleViewer.audioTimePaint, (int) Math.ceil(ArticleViewer.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            ArticleViewer.audioTimePaint.setColor(this.parent.getTextColor());
            invalidate();
        }

        public void updateButtonState(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean exists = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (!FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    this.radialProgress.setProgress(0.0f, z);
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                } else {
                    this.buttonState = 3;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        this.radialProgress.setProgress(fileProgress.floatValue(), z);
                    } else {
                        this.radialProgress.setProgress(0.0f, z);
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                }
            }
            updatePlayingMessageProgress();
        }

        private void didPressedButton(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            int i = this.buttonState;
            if (i == 0) {
                if (this.adapter == null || !MediaController.getInstance().setPlaylist(this.adapter.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    return;
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
                return;
            }
            if (i == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    FileLoader.getInstance(currentAccount).cancelLoadFile(this.currentDocument);
                    this.buttonState = 2;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            this.radialProgress.setProgress(0.0f, false);
            FileLoader fileLoader = FileLoader.getInstance(currentAccount);
            TLRPC.Document document = this.currentDocument;
            WebpageAdapter webpageAdapter = this.adapter;
            fileLoader.loadFile(document, webpageAdapter == null ? null : webpageAdapter.currentPage, 1, 1);
            this.buttonState = 3;
            this.radialProgress.setIcon(getIconForCurrentState(), true, z);
            invalidate();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                drawingText3.detach(this);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateButtonState(false);
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                drawingText3.attach(this);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.TAG;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                arrayList.add(drawingText3);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
            if (this.titleLayout != null) {
                sb.append(", ");
                sb.append(this.titleLayout.getText());
            }
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockEmbedPostCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private AvatarDrawable avatarDrawable;
        private ImageReceiver avatarImageView;
        private boolean avatarVisible;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockEmbedPost currentBlock;
        private DrawingText dateLayout;
        private int lineHeight;
        private DrawingText nameLayout;
        private final IArticleViewer parent;
        private int textX;
        private int textY;

        public BlockEmbedPostCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
            this.avatarImageView.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            this.avatarDrawable = new AvatarDrawable();
        }

        public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
            this.currentBlock = pageblockembedpost;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            int i3 = 1;
            if (pageblockembedpost != null) {
                if (pageblockembedpost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    this.textY = AndroidUtilities.dp(4.0f);
                    int dp = size - AndroidUtilities.dp(50.0f);
                    IArticleViewer iArticleViewer = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.currentBlock;
                    DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockembedpost2.caption.text, dp, this.textY, pageblockembedpost2, this.adapter);
                    this.captionLayout = createLayoutForText;
                    if (createLayoutForText != null) {
                        int dp2 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                        this.creditOffset = dp2;
                        r13 = dp2 + AndroidUtilities.dp(4.0f);
                    }
                    IArticleViewer iArticleViewer2 = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.currentBlock;
                    DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockembedpost3.caption.credit, dp, this.textY + this.creditOffset, pageblockembedpost3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.adapter);
                    this.creditLayout = createLayoutForText2;
                    if (createLayoutForText2 != null) {
                        r13 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    }
                    i3 = r13;
                } else {
                    long j = pageblockembedpost.author_photo_id;
                    boolean z = j != 0;
                    this.avatarVisible = z;
                    if (z) {
                        TLRPC.Photo photoWithId = this.adapter.getPhotoWithId(j);
                        boolean z2 = photoWithId instanceof TLRPC.TL_photo;
                        this.avatarVisible = z2;
                        if (z2) {
                            this.avatarDrawable.setInfo(0L, this.currentBlock.author, null);
                            this.avatarImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.dp(40.0f), true), photoWithId), "40_40", this.avatarDrawable, 0L, (String) null, this.adapter.currentPage, 1);
                        }
                    }
                    IArticleViewer iArticleViewer3 = this.parent;
                    String str = this.currentBlock.author;
                    int dp3 = size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50);
                    TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.currentBlock;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    DrawingText createLayoutForText3 = ArticleViewer.createLayoutForText(iArticleViewer3, this, str, null, dp3, 0, pageblockembedpost4, alignment, 1, this.adapter);
                    this.nameLayout = createLayoutForText3;
                    if (createLayoutForText3 != null) {
                        createLayoutForText3.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.y = AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.createLayoutForText(this.parent, this, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.date * 1000), (TL_iv.RichText) null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.currentBlock, this.adapter);
                    } else {
                        this.dateLayout = null;
                    }
                    int dp4 = AndroidUtilities.dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.dp(32.0f);
                        this.textY = AndroidUtilities.dp(56.0f);
                        int dp5 = size - AndroidUtilities.dp(50.0f);
                        IArticleViewer iArticleViewer4 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.currentBlock;
                        DrawingText createLayoutForText4 = ArticleViewer.createLayoutForText(iArticleViewer4, this, (CharSequence) null, pageblockembedpost5.caption.text, dp5, this.textY, pageblockembedpost5, this.adapter);
                        this.captionLayout = createLayoutForText4;
                        if (createLayoutForText4 != null) {
                            int dp6 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp6;
                            dp4 += dp6 + AndroidUtilities.dp(4.0f);
                        }
                        int i4 = dp4;
                        IArticleViewer iArticleViewer5 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.currentBlock;
                        DrawingText createLayoutForText5 = ArticleViewer.createLayoutForText(iArticleViewer5, this, (CharSequence) null, pageblockembedpost6.caption.credit, dp5, this.textY + this.creditOffset, pageblockembedpost6, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : alignment, this.adapter);
                        this.creditLayout = createLayoutForText5;
                        dp4 = createLayoutForText5 != null ? i4 + AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight() : i4;
                    } else {
                        this.captionLayout = null;
                        this.creditLayout = null;
                    }
                    DrawingText drawingText = this.dateLayout;
                    if (drawingText != null) {
                        drawingText.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.dateLayout.y = AndroidUtilities.dp(29.0f);
                    }
                    DrawingText drawingText2 = this.captionLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY;
                    }
                    DrawingText drawingText3 = this.creditLayout;
                    if (drawingText3 != null) {
                        drawingText3.x = this.textX;
                        drawingText3.y = this.textY;
                    }
                    i3 = dp4;
                }
                this.lineHeight = i3;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            if (pageblockembedpost == null) {
                return;
            }
            if (!(pageblockembedpost instanceof TL_pageBlockEmbedPostCaption)) {
                if (this.avatarVisible) {
                    this.avatarImageView.draw(canvas);
                }
                if (this.nameLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f));
                    ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                    this.nameLayout.draw(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.dateLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                    ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                    this.dateLayout.draw(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.lineHeight - (this.currentBlock.level == 0 ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                r1 = i;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, r1);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                r1++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, r1);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                arrayList.add(drawingText3);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                arrayList.add(drawingText4);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                drawingText3.attach(this);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                drawingText4.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                drawingText3.detach(this);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                drawingText4.detach(this);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
            if (this.nameLayout != null) {
                sb.append(", ");
                sb.append(this.nameLayout.getText());
            }
            if (this.dateLayout != null) {
                sb.append(", ");
                sb.append(this.dateLayout.getText());
            }
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockParagraphCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockParagraph currentBlock;
        private final IArticleViewer parent;
        public DrawingText textLayout;
        public int textX;
        public int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockParagraphCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
            this.currentBlock = pageblockparagraph;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            Layout.Alignment ALIGN_RIGHT;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockParagraph pageblockparagraph = this.currentBlock;
            if (pageblockparagraph != null) {
                i3 = 0;
                if (pageblockparagraph.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14));
                }
                if (this.currentBlock.text instanceof TL_iv.textMath) {
                    ALIGN_RIGHT = Layout.Alignment.ALIGN_CENTER;
                } else {
                    WebpageAdapter webpageAdapter = this.adapter;
                    ALIGN_RIGHT = (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT();
                }
                Layout.Alignment alignment = ALIGN_RIGHT;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, null, this.currentBlock.text, (size - AndroidUtilities.dp(r1.padx())) - this.textX, this.textY, this.currentBlock, alignment, 0, this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(this.parent.pady());
                    } else {
                        dp = AndroidUtilities.dp(this.parent.pady() * 2);
                    }
                    i3 = height + dp;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class BlockEmbedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockEmbed currentBlock;
        private int exactWebViewHeight;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;
        private final WebPlayerView videoView;
        private boolean wasUserInteraction;
        private final TouchyWebView webView;

        /* JADX INFO: Access modifiers changed from: private */
        class TelegramWebviewProxy {
            private TelegramWebviewProxy() {
            }

            @JavascriptInterface
            public void postEvent(final String str, final String str2) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$BlockEmbedCell$TelegramWebviewProxy$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.BlockEmbedCell.TelegramWebviewProxy.this.lambda$postEvent$0(str, str2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$postEvent$0(String str, String str2) {
                if ("resize_frame".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        BlockEmbedCell.this.exactWebViewHeight = Utilities.parseInt((CharSequence) jSONObject.getString("height")).intValue();
                        BlockEmbedCell.this.requestLayout();
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public class TouchyWebView extends WebView {
            public TouchyWebView(Context context) {
                super(context);
                setFocusable(false);
            }

            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                BlockEmbedCell.this.wasUserInteraction = true;
                if (BlockEmbedCell.this.currentBlock != null) {
                    if (!BlockEmbedCell.this.currentBlock.allow_scrolling) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        }

        public BlockEmbedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                WebPlayerView webPlayerView = new WebPlayerView(context, false, false, new WebPlayerView.WebPlayerViewDelegate() { // from class: org.telegram.ui.ArticleViewer.BlockEmbedCell.1
                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public boolean checkInlinePermissions() {
                        return false;
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public ViewGroup getTextureViewContainer() {
                        return null;
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void onInlineSurfaceTextureReady() {
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, int i3, boolean z2) {
                        return null;
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void prepareToSwitchInlineMode(boolean z, Runnable runnable, float f, boolean z2) {
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void onInitFailed() {
                        BlockEmbedCell.this.webView.setVisibility(0);
                        BlockEmbedCell.this.videoView.setVisibility(4);
                        BlockEmbedCell.this.videoView.loadVideo(null, null, null, null, false);
                        HashMap hashMap = new HashMap();
                        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                        BlockEmbedCell.this.webView.loadUrl(BlockEmbedCell.this.currentBlock.url, hashMap);
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void onVideoSizeChanged(float f, int i) {
                        ArticleViewer.this.fullscreenAspectRatioView.setAspectRatio(f, i);
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public TextureView onSwitchToFullscreen(View view, boolean z, float f, int i, boolean z2) {
                        if (z) {
                            ArticleViewer.this.fullscreenAspectRatioView.addView(ArticleViewer.this.fullscreenTextureView, LayoutHelper.createFrame(-1, -1.0f));
                            ArticleViewer.this.fullscreenAspectRatioView.setVisibility(0);
                            ArticleViewer.this.fullscreenAspectRatioView.setAspectRatio(f, i);
                            BlockEmbedCell blockEmbedCell = BlockEmbedCell.this;
                            ArticleViewer.this.fullscreenedVideo = blockEmbedCell.videoView;
                            ArticleViewer.this.fullscreenVideoContainer.addView(view, LayoutHelper.createFrame(-1, -1.0f));
                            ArticleViewer.this.fullscreenVideoContainer.setVisibility(0);
                        } else {
                            ArticleViewer.this.fullscreenAspectRatioView.removeView(ArticleViewer.this.fullscreenTextureView);
                            ArticleViewer.this.fullscreenedVideo = null;
                            ArticleViewer.this.fullscreenAspectRatioView.setVisibility(8);
                            ArticleViewer.this.fullscreenVideoContainer.setVisibility(4);
                        }
                        return ArticleViewer.this.fullscreenTextureView;
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void onSharePressed() {
                        if (ArticleViewer.this.parentActivity == null) {
                            return;
                        }
                        ArticleViewer.this.showDialog(new ShareAlert(ArticleViewer.this.parentActivity, null, BlockEmbedCell.this.currentBlock.url, false, BlockEmbedCell.this.currentBlock.url, false));
                    }

                    @Override // org.telegram.ui.Components.WebPlayerView.WebPlayerViewDelegate
                    public void onPlayStateChanged(WebPlayerView webPlayerView2, boolean z) {
                        if (z) {
                            if (ArticleViewer.this.currentPlayingVideo != null && ArticleViewer.this.currentPlayingVideo != webPlayerView2) {
                                ArticleViewer.this.currentPlayingVideo.pause();
                            }
                            ArticleViewer.this.currentPlayingVideo = webPlayerView2;
                            try {
                                ArticleViewer.this.parentActivity.getWindow().addFlags(128);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        if (ArticleViewer.this.currentPlayingVideo == webPlayerView2) {
                            ArticleViewer.this.currentPlayingVideo = null;
                        }
                        try {
                            ArticleViewer.this.parentActivity.getWindow().clearFlags(128);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                });
                this.videoView = webPlayerView;
                addView(webPlayerView);
                ArticleViewer.this.createdWebViews.add(this);
                TouchyWebView touchyWebView = new TouchyWebView(context);
                this.webView = touchyWebView;
                touchyWebView.getSettings().setJavaScriptEnabled(true);
                touchyWebView.getSettings().setDomStorageEnabled(true);
                touchyWebView.getSettings().setAllowContentAccess(true);
                touchyWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                touchyWebView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                touchyWebView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(touchyWebView, true);
                touchyWebView.setWebChromeClient(new 2(ArticleViewer.this));
                touchyWebView.setWebViewClient(new 3(ArticleViewer.this));
                addView(touchyWebView);
                return;
            }
            this.videoView = null;
            this.webView = null;
        }

        class 2 extends WebChromeClient {
            final /* synthetic */ ArticleViewer val$this$0;

            2(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
                onShowCustomView(view, customViewCallback);
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (ArticleViewer.this.customView == null) {
                    ArticleViewer.this.customView = view;
                    ArticleViewer.this.customViewCallback = customViewCallback;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$BlockEmbedCell$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArticleViewer.BlockEmbedCell.2.this.lambda$onShowCustomView$0();
                        }
                    }, 100L);
                    return;
                }
                customViewCallback.onCustomViewHidden();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onShowCustomView$0() {
                if (ArticleViewer.this.customView != null) {
                    ArticleViewer.this.fullscreenVideoContainer.addView(ArticleViewer.this.customView, LayoutHelper.createFrame(-1, -1.0f));
                    ArticleViewer.this.fullscreenVideoContainer.setVisibility(0);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                super.onHideCustomView();
                if (ArticleViewer.this.customView == null) {
                    return;
                }
                ArticleViewer.this.fullscreenVideoContainer.setVisibility(4);
                ArticleViewer.this.fullscreenVideoContainer.removeView(ArticleViewer.this.customView);
                if (ArticleViewer.this.customViewCallback != null && !ArticleViewer.this.customViewCallback.getClass().getName().contains(".chromium.")) {
                    ArticleViewer.this.customViewCallback.onCustomViewHidden();
                }
                ArticleViewer.this.customView = null;
            }
        }

        class 3 extends WebViewClient {
            final /* synthetic */ ArticleViewer val$this$0;

            3(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null && launchActivity.isFinishing()) {
                        return true;
                    }
                    new AlertDialog.Builder(BlockEmbedCell.this.getContext(), null).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() { // from class: org.telegram.ui.ArticleViewer$BlockEmbedCell$3$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArticleViewer.BlockEmbedCell.3.this.lambda$onRenderProcessGone$0();
                        }
                    })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onRenderProcessGone$0() {
                Browser.openUrl(BlockEmbedCell.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView, String str) {
                super.onLoadResource(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!BlockEmbedCell.this.wasUserInteraction) {
                    return false;
                }
                Browser.openUrl(ArticleViewer.this.parentActivity, str);
                return true;
            }
        }

        public void destroyWebView(boolean z) {
            try {
                TouchyWebView touchyWebView = this.webView;
                if (touchyWebView != null) {
                    touchyWebView.stopLoading();
                    this.webView.loadUrl("about:blank");
                    if (z) {
                        this.webView.destroy();
                    }
                }
                this.currentBlock = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            WebPlayerView webPlayerView = this.videoView;
            if (webPlayerView != null) {
                webPlayerView.destroy();
            }
        }

        public void setBlock(TL_iv.pageBlockEmbed pageblockembed) {
            TL_iv.pageBlockEmbed pageblockembed2 = this.currentBlock;
            this.currentBlock = pageblockembed;
            TouchyWebView touchyWebView = this.webView;
            if (touchyWebView != null) {
                touchyWebView.setBackgroundColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            }
            TL_iv.pageBlockEmbed pageblockembed3 = this.currentBlock;
            if (pageblockembed2 != pageblockembed3) {
                this.wasUserInteraction = false;
                TouchyWebView touchyWebView2 = this.webView;
                if (touchyWebView2 != null) {
                    if (pageblockembed3.allow_scrolling) {
                        touchyWebView2.setVerticalScrollBarEnabled(true);
                        this.webView.setHorizontalScrollBarEnabled(true);
                    } else {
                        touchyWebView2.setVerticalScrollBarEnabled(false);
                        this.webView.setHorizontalScrollBarEnabled(false);
                    }
                }
                this.exactWebViewHeight = 0;
                TouchyWebView touchyWebView3 = this.webView;
                if (touchyWebView3 != null) {
                    try {
                        touchyWebView3.loadUrl("about:blank");
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                try {
                    TL_iv.pageBlockEmbed pageblockembed4 = this.currentBlock;
                    String str = pageblockembed4.html;
                    if (str != null) {
                        TouchyWebView touchyWebView4 = this.webView;
                        if (touchyWebView4 != null) {
                            touchyWebView4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                            this.webView.setVisibility(0);
                        }
                        WebPlayerView webPlayerView = this.videoView;
                        if (webPlayerView != null) {
                            webPlayerView.setVisibility(4);
                            this.videoView.loadVideo(null, null, null, null, false);
                        }
                    } else {
                        long j = pageblockembed4.poster_photo_id;
                        if (this.videoView.loadVideo(pageblockembed.url, j != 0 ? this.parentAdapter.getPhotoWithId(j) : null, this.parentAdapter.currentPage, null, false)) {
                            TouchyWebView touchyWebView5 = this.webView;
                            if (touchyWebView5 != null) {
                                touchyWebView5.setVisibility(4);
                                this.webView.stopLoading();
                                this.webView.loadUrl("about:blank");
                            }
                            WebPlayerView webPlayerView2 = this.videoView;
                            if (webPlayerView2 != null) {
                                webPlayerView2.setVisibility(0);
                            }
                        } else {
                            TouchyWebView touchyWebView6 = this.webView;
                            if (touchyWebView6 != null) {
                                touchyWebView6.setVisibility(0);
                                HashMap hashMap = new HashMap();
                                hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                this.webView.loadUrl(this.currentBlock.url, hashMap);
                            }
                            WebPlayerView webPlayerView3 = this.videoView;
                            if (webPlayerView3 != null) {
                                webPlayerView3.setVisibility(4);
                                this.videoView.loadVideo(null, null, null, null, false);
                            }
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            requestLayout();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (!ArticleViewer.this.isVisible) {
                this.currentBlock = null;
            }
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
        @Override // android.widget.FrameLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int dp;
            int dp2;
            DrawingText drawingText;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockEmbed pageblockembed = this.currentBlock;
            if (pageblockembed != null) {
                if (pageblockembed.level > 0) {
                    int dp3 = AndroidUtilities.dp(r14 * 14) + AndroidUtilities.dp(18.0f);
                    this.listX = dp3;
                    this.textX = dp3;
                    i4 = size - (dp3 + AndroidUtilities.dp(18.0f));
                    i5 = i4;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    int dp4 = size - AndroidUtilities.dp(36.0f);
                    if (this.currentBlock.full_width) {
                        i4 = size;
                    } else {
                        i4 = size - AndroidUtilities.dp(36.0f);
                        this.listX += AndroidUtilities.dp(18.0f);
                    }
                    i5 = dp4;
                }
                int i6 = this.currentBlock.w;
                float f = i6 == 0 ? 1.0f : size / i6;
                int i7 = this.exactWebViewHeight;
                if (i7 != 0) {
                    dp = AndroidUtilities.dp(i7);
                } else {
                    dp = (int) ((i6 == 0 ? AndroidUtilities.dp(r1.h) : r1.h) * f);
                }
                if (dp == 0) {
                    dp = AndroidUtilities.dp(10.0f);
                }
                int i8 = dp;
                TouchyWebView touchyWebView = this.webView;
                if (touchyWebView != null) {
                    touchyWebView.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i8, TLObject.FLAG_30));
                }
                WebPlayerView webPlayerView = this.videoView;
                if (webPlayerView != null && webPlayerView.getParent() == this) {
                    this.videoView.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i8, TLObject.FLAG_30));
                }
                int dp5 = AndroidUtilities.dp(8.0f) + i8;
                this.textY = dp5;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockEmbed pageblockembed2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, pageblockembed2.caption.text, i5, dp5, pageblockembed2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp6 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp6;
                    i8 += dp6 + AndroidUtilities.dp(4.0f);
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockEmbed pageblockembed3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockembed3.caption.credit, i5, this.textY + this.creditOffset, pageblockembed3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i8 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.creditOffset;
                }
                i3 = i8 + AndroidUtilities.dp(5.0f);
                TL_iv.pageBlockEmbed pageblockembed4 = this.currentBlock;
                int i9 = pageblockembed4.level;
                if (i9 > 0 && !pageblockembed4.bottom) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    if (i9 == 0 && this.captionLayout != null) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    }
                    drawingText = this.captionLayout;
                    if (drawingText != null) {
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                }
                i3 += dp2;
                drawingText = this.captionLayout;
                if (drawingText != null) {
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            TouchyWebView touchyWebView = this.webView;
            if (touchyWebView != null) {
                int i5 = this.listX;
                touchyWebView.layout(i5, 0, touchyWebView.getMeasuredWidth() + i5, this.webView.getMeasuredHeight());
            }
            WebPlayerView webPlayerView = this.videoView;
            if (webPlayerView == null || webPlayerView.getParent() != this) {
                return;
            }
            WebPlayerView webPlayerView2 = this.videoView;
            int i6 = this.listX;
            webPlayerView2.layout(i6, 0, webPlayerView2.getMeasuredWidth() + i6, this.videoView.getMeasuredHeight());
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockTableCell extends FrameLayout implements TableLayout.TableLayoutDelegate, TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockTable currentBlock;
        private boolean firstLayout;
        private int listX;
        private int listY;
        private final IArticleViewer parent;
        private HorizontalScrollView scrollView;
        private float selectionDownX;
        private float selectionDownY;
        private final Runnable selectionLongPress;
        private boolean selectionPending;
        public TableLayout tableLayout;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        public BlockTableCell(Context context, final IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.selectionLongPress = new Runnable() { // from class: org.telegram.ui.ArticleViewer.BlockTableCell.1
                @Override // java.lang.Runnable
                public void run() {
                    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
                    if (BlockTableCell.this.selectionPending) {
                        BlockTableCell.this.selectionPending = false;
                        if (!BlockTableCell.this.parent.canStartSelection(BlockTableCell.this) || (textSelectionHelper = BlockTableCell.this.parent.getTextSelectionHelper(BlockTableCell.this)) == null || textSelectionHelper.isInSelectionMode()) {
                            return;
                        }
                        textSelectionHelper.setMaybeView((int) BlockTableCell.this.selectionDownX, (int) BlockTableCell.this.selectionDownY, BlockTableCell.this);
                        textSelectionHelper.trySelect(BlockTableCell.this);
                        if (textSelectionHelper.isInSelectionMode()) {
                            for (ViewParent parent = BlockTableCell.this.getParent(); parent != null; parent = parent.getParent()) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            try {
                                BlockTableCell.this.performHapticFeedback(0, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            };
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) { // from class: org.telegram.ui.ArticleViewer.BlockTableCell.2
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                    BlockTableCell.this.tableLayout.getMeasuredWidth();
                    getMeasuredWidth();
                    AndroidUtilities.dp(36.0f);
                    return onInterceptTouchEvent;
                }

                @Override // android.widget.HorizontalScrollView, android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
                        return false;
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override // android.view.View
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    if (iArticleViewer2.pressedLinkOwnerLayout != null) {
                        iArticleViewer2.pressedLinkOwnerLayout = null;
                        iArticleViewer2.pressedLinkOwnerView = null;
                    }
                    BlockTableCell.this.updateChildTextPositions();
                    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(null);
                    if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
                        return;
                    }
                    textSelectionHelper.invalidate();
                }

                @Override // android.view.View
                protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    ArticleViewer.removePressedLink(iArticleViewer);
                    return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
                }

                @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i, int i2) {
                    BlockTableCell.this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
                    setMeasuredDimension(View.MeasureSpec.getSize(i), BlockTableCell.this.tableLayout.getMeasuredHeight());
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(AndroidUtilities.dp(iArticleViewer.padx()), 0, AndroidUtilities.dp(iArticleViewer.padx()), 0);
            this.scrollView.setClipToPadding(false);
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            TableLayout tableLayout = new TableLayout(context, this, iArticleViewer.getTextSelectionHelper(null));
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            this.tableLayout.setRowOrderPreserved(true);
            this.scrollView.addView(this.tableLayout, new FrameLayout.LayoutParams(-2, -2));
            setWillNotDraw(false);
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public DrawingText createTextLayout(TL_iv.pageTableCell pagetablecell, int i) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (pagetablecell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            return ArticleViewer.createLayoutForText(this.parent, this, null, pagetablecell.text, i, -1, this.currentBlock, alignment, 0, this.adapter);
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public Paint getLinePaint() {
            return ArticleViewer.tableLinePaint;
        }

        public Paint getHalfLinePaint() {
            return ArticleViewer.tableHalfLinePaint;
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public Paint getHeaderPaint() {
            return ArticleViewer.tableHeaderPaint;
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public Paint getStripPaint() {
            return ArticleViewer.tableStripPaint;
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public void onLayoutChild(TableLayout.CellText cellText, int i, int i2) {
            if (!(cellText instanceof DrawingText) || this.parent.searchResults.isEmpty() || this.parent.searchText == null) {
                return;
            }
            DrawingText drawingText = (DrawingText) cellText;
            String lowerCase = drawingText.textLayout.getText().toString().toLowerCase();
            int i3 = 0;
            while (true) {
                int indexOf = lowerCase.indexOf(this.parent.searchText, i3);
                if (indexOf < 0) {
                    return;
                }
                int length = this.parent.searchText.length() + indexOf;
                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                    HashMap hashMap = this.adapter.searchTextOffset;
                    String str = this.parent.searchText + this.currentBlock + drawingText.parentText + indexOf;
                    StaticLayout staticLayout = drawingText.textLayout;
                    hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i2));
                }
                i3 = length;
            }
        }

        public void setBlock(TL_iv.pageBlockTable pageblocktable) {
            int i;
            this.currentBlock = pageblocktable;
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, this.parent.getThemedColor(Theme.key_windowBackgroundWhite));
            this.tableLayout.removeAllChildrens();
            this.tableLayout.setDrawLines(this.currentBlock.bordered);
            this.tableLayout.setStriped(this.currentBlock.striped);
            TableLayout tableLayout = this.tableLayout;
            WebpageAdapter webpageAdapter = this.adapter;
            tableLayout.setRtl(webpageAdapter != null && webpageAdapter.isRtl);
            if (this.currentBlock.rows.isEmpty()) {
                i = 0;
            } else {
                TL_iv.pageTableRow pagetablerow = this.currentBlock.rows.get(0);
                int size = pagetablerow.cells.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = pagetablerow.cells.get(i2).colspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    i += i3;
                }
            }
            int size2 = this.currentBlock.rows.size();
            for (int i4 = 0; i4 < size2; i4++) {
                TL_iv.pageTableRow pagetablerow2 = this.currentBlock.rows.get(i4);
                int size3 = pagetablerow2.cells.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i6);
                    int i7 = pagetablecell.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = pagetablecell.rowspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    if (pagetablecell.text != null) {
                        this.tableLayout.addChild(pagetablecell, i5, i4, i7);
                    } else {
                        this.tableLayout.addChild(i5, i4, i7, i8);
                    }
                    i5 += i7;
                }
            }
            this.tableLayout.setColumnCount(i);
            this.firstLayout = true;
            requestLayout();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.parent.canStartSelection(this)) {
                    this.selectionDownX = motionEvent.getX();
                    this.selectionDownY = motionEvent.getY();
                    this.selectionPending = true;
                    removeCallbacks(this.selectionLongPress);
                    postDelayed(this.selectionLongPress, ViewConfiguration.getLongPressTimeout());
                }
            } else if (actionMasked == 2) {
                if (this.selectionPending) {
                    float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    if (Math.abs(motionEvent.getX() - this.selectionDownX) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.selectionDownY) > scaledTouchSlop) {
                        this.selectionPending = false;
                        removeCallbacks(this.selectionLongPress);
                    }
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.selectionPending = false;
                removeCallbacks(this.selectionLongPress);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                TableLayout.CellText cellText = childAt.textLayout;
                if ((cellText instanceof DrawingText) && ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, (DrawingText) cellText, (this.scrollView.getPaddingLeft() - this.scrollView.getScrollX()) + this.listX + childAt.getTextX(), this.listY + childAt.getTextY())) {
                    return true;
                }
            }
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.titleLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
        public void invalidate() {
            super.invalidate();
            this.tableLayout.invalidate();
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int i4;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockTable pageblocktable = this.currentBlock;
            if (pageblocktable != null) {
                if (pageblocktable.level > 0) {
                    int dp2 = AndroidUtilities.dp(r13 * 14);
                    this.listX = dp2;
                    dp = dp2 + AndroidUtilities.dp(this.parent.padx());
                    this.textX = dp;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                    dp = AndroidUtilities.dp(this.parent.padx() * 2);
                }
                int i5 = size - dp;
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockTable pageblocktable2 = this.currentBlock;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, pageblocktable2.title, i5, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.adapter);
                this.titleLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = 0;
                    i4 = createLayoutForText.getHeight() + AndroidUtilities.dp(8.0f);
                    this.listY = i4;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.listY = AndroidUtilities.dp(8.0f);
                    i4 = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = i4 + this.scrollView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                TL_iv.pageBlockTable pageblocktable3 = this.currentBlock;
                if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                    i3 += AndroidUtilities.dp(8.0f);
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
            updateChildTextPositions();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateChildTextPositions() {
            int i = this.titleLayout == null ? 0 : 1;
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i2);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText != null) {
                    cellText.setX(((childAt.getTextX() + this.listX) + AndroidUtilities.dp(18.0f)) - this.scrollView.getScrollX());
                    childAt.textLayout.setY(childAt.getTextY() + this.listY);
                    childAt.textLayout.setRow(childAt.getRow());
                    childAt.setSelectionIndex(i);
                    i++;
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            HorizontalScrollView horizontalScrollView = this.scrollView;
            int i5 = this.listX;
            horizontalScrollView.layout(i5, this.listY, horizontalScrollView.getMeasuredWidth() + i5, this.listY + this.scrollView.getMeasuredHeight());
            if (this.firstLayout) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    this.scrollView.setScrollX((this.tableLayout.getMeasuredWidth() - this.scrollView.getMeasuredWidth()) + AndroidUtilities.dp(36.0f));
                } else {
                    this.scrollView.setScrollX(0);
                }
                this.firstLayout = false;
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.titleLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    arrayList.add(cellText);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    cellText.attach(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    cellText.detach(this);
                }
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
            if (this.titleLayout != null) {
                sb.append(", ");
                sb.append(this.titleLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    private class BlockCollageCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockCollage currentBlock;
        private GroupedMessages group;
        private boolean inLayout;
        private RecyclerView.Adapter innerAdapter;
        private RecyclerListView innerListView;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public class GroupedMessages {
            public boolean hasSibling;
            public ArrayList posArray = new ArrayList();
            public HashMap positions = new HashMap();
            private int maxSizeWidth = MediaDataController.MAX_STYLE_RUNS_COUNT;

            public GroupedMessages() {
            }

            private class MessageGroupedLayoutAttempt {
                public float[] heights;
                public int[] lineCounts;

                public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                    this.lineCounts = new int[]{i, i2};
                    this.heights = new float[]{f, f2};
                }

                public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                    this.lineCounts = new int[]{i, i2, i3};
                    this.heights = new float[]{f, f2, f3};
                }

                public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                    this.lineCounts = new int[]{i, i2, i3, i4};
                    this.heights = new float[]{f, f2, f3, f4};
                }
            }

            private float multiHeight(float[] fArr, int i, int i2) {
                float f = 0.0f;
                while (i < i2) {
                    f += fArr[i];
                    i++;
                }
                return this.maxSizeWidth / f;
            }

            /* JADX WARN: Code restructure failed: missing block: B:183:0x06a8, code lost:
            
                if (r9[2] > r9[3]) goto L158;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
            /* JADX WARN: Type inference failed for: r8v1 */
            /* JADX WARN: Type inference failed for: r8v20, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r8v24 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void calculate() {
                int i;
                ?? r8;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                float f;
                int i9;
                TLRPC.Document documentWithId;
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                float f2;
                float f3;
                this.posArray.clear();
                this.positions.clear();
                int size = BlockCollageCell.this.currentBlock.items.size();
                if (size <= 1) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                this.hasSibling = false;
                int i10 = 0;
                boolean z = false;
                float f4 = 1.0f;
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock = BlockCollageCell.this.currentBlock.items.get(i10);
                    if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        TLRPC.Photo photoWithId = BlockCollageCell.this.parentAdapter.getPhotoWithId(((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                        if (photoWithId == null) {
                            i10++;
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                            groupedMessagePosition.last = i10 != size + (-1);
                            f2 = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            groupedMessagePosition.aspectRatio = f2;
                            if (f2 <= 1.2f) {
                                sb.append("w");
                            } else if (f2 < 0.8f) {
                                sb.append("n");
                            } else {
                                sb.append("q");
                            }
                            f3 = groupedMessagePosition.aspectRatio;
                            f4 += f3;
                            if (f3 > 2.0f) {
                                z = true;
                            }
                            this.positions.put(pageBlock, groupedMessagePosition);
                            this.posArray.add(groupedMessagePosition);
                            i10++;
                        }
                    } else {
                        if ((pageBlock instanceof TL_iv.pageBlockVideo) && (documentWithId = BlockCollageCell.this.parentAdapter.getDocumentWithId(((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 90);
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                            groupedMessagePosition2.last = i10 != size + (-1);
                            if (closestPhotoSizeWithSize != null) {
                            }
                            groupedMessagePosition2.aspectRatio = f2;
                            if (f2 <= 1.2f) {
                            }
                            f3 = groupedMessagePosition2.aspectRatio;
                            f4 += f3;
                            if (f3 > 2.0f) {
                            }
                            this.positions.put(pageBlock, groupedMessagePosition2);
                            this.posArray.add(groupedMessagePosition2);
                        }
                        i10++;
                    }
                }
                int dp = AndroidUtilities.dp(120.0f);
                float dp2 = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int min = (int) (dp2 / (Math.min(point.x, point.y) / this.maxSizeWidth));
                float dp3 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float min2 = Math.min(point2.x, point2.y);
                float f5 = this.maxSizeWidth;
                int i11 = (int) (dp3 / (min2 / f5));
                float f6 = f5 / 814.0f;
                float f7 = f4 / size;
                if (z || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i12 = 0; i12 < size; i12++) {
                        if (f7 > 1.1f) {
                            fArr[i12] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i12)).aspectRatio);
                        } else {
                            fArr[i12] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) this.posArray.get(i12)).aspectRatio);
                        }
                        fArr[i12] = Math.max(0.66667f, Math.min(1.7f, fArr[i12]));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 1; i13 < size2; i13++) {
                        int i14 = size2 - i13;
                        if (i13 <= 3) {
                            if (i14 <= 3) {
                                arrayList.add(new MessageGroupedLayoutAttempt(i13, i14, multiHeight(fArr, 0, i13), multiHeight(fArr, i13, size2)));
                            }
                        }
                    }
                    for (int i15 = 1; i15 < size2 - 1; i15++) {
                        int i16 = 1;
                        while (true) {
                            int i17 = size2 - i15;
                            if (i16 < i17) {
                                int i18 = i17 - i16;
                                if (i15 <= 3) {
                                    if (i16 <= (f7 < 0.85f ? 4 : 3) && i18 <= 3) {
                                        int i19 = i15 + i16;
                                        f = f7;
                                        i9 = i16;
                                        arrayList.add(new MessageGroupedLayoutAttempt(i15, i16, i18, multiHeight(fArr, 0, i15), multiHeight(fArr, i15, i19), multiHeight(fArr, i19, size2)));
                                        i16 = i9 + 1;
                                        f7 = f;
                                    }
                                }
                                f = f7;
                                i9 = i16;
                                i16 = i9 + 1;
                                f7 = f;
                            }
                        }
                    }
                    int i20 = 1;
                    while (i20 < size2 - 2) {
                        int i21 = 1;
                        while (true) {
                            int i22 = size2 - i20;
                            if (i21 < i22) {
                                int i23 = 1;
                                while (true) {
                                    int i24 = i22 - i21;
                                    if (i23 < i24) {
                                        int i25 = i24 - i23;
                                        if (i20 > 3 || i21 > 3 || i23 > 3) {
                                            i3 = i23;
                                            i4 = i22;
                                            i5 = i21;
                                            i6 = size2;
                                            i7 = size;
                                            i8 = min;
                                        } else if (i25 > 3) {
                                            i3 = i23;
                                            i4 = i22;
                                            i5 = i21;
                                            i6 = size2;
                                            i7 = size;
                                            i8 = min;
                                            i23 = i3 + 1;
                                            min = i8;
                                            i22 = i4;
                                            size = i7;
                                            i21 = i5;
                                            size2 = i6;
                                        } else {
                                            int i26 = i20 + i21;
                                            int i27 = i26 + i23;
                                            i6 = size2;
                                            i3 = i23;
                                            i4 = i22;
                                            i5 = i21;
                                            i7 = size;
                                            i8 = min;
                                            arrayList.add(new MessageGroupedLayoutAttempt(i20, i21, i23, i25, multiHeight(fArr, 0, i20), multiHeight(fArr, i20, i26), multiHeight(fArr, i26, i27), multiHeight(fArr, i27, size2)));
                                        }
                                        i23 = i3 + 1;
                                        min = i8;
                                        i22 = i4;
                                        size = i7;
                                        i21 = i5;
                                        size2 = i6;
                                    }
                                }
                                i21++;
                                size = size;
                            }
                        }
                        i20++;
                        size = size;
                    }
                    i = size;
                    int i28 = min;
                    float f8 = (this.maxSizeWidth / 3) * 4;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f9 = 0.0f;
                    for (int i29 = 0; i29 < arrayList.size(); i29++) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList.get(i29);
                        int i30 = 0;
                        float f10 = Float.MAX_VALUE;
                        float f11 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i30 >= fArr2.length) {
                                break;
                            }
                            float f12 = fArr2[i30];
                            f11 += f12;
                            if (f12 < f10) {
                                f10 = f12;
                            }
                            i30++;
                        }
                        float abs = Math.abs(f11 - f8);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i31 = iArr[0];
                            int i32 = iArr[1];
                            if (i31 <= i32 && (iArr.length <= 2 || i32 <= iArr[2])) {
                                if (iArr.length > 3) {
                                }
                            }
                            abs *= 1.2f;
                        }
                        if (f10 < i28) {
                            abs *= 1.5f;
                        }
                        if (messageGroupedLayoutAttempt == null || abs < f9) {
                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                            f9 = abs;
                        }
                    }
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i33 = 0;
                    int i34 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i34 >= iArr2.length) {
                            break;
                        }
                        int i35 = iArr2[i34];
                        float f13 = messageGroupedLayoutAttempt.heights[i34];
                        int i36 = this.maxSizeWidth;
                        MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                        for (int i37 = 0; i37 < i35; i37++) {
                            int i38 = (int) (fArr[i33] * f13);
                            i36 -= i38;
                            MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) this.posArray.get(i33);
                            int i39 = i34 == 0 ? 4 : 0;
                            if (i34 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i39 |= 8;
                            }
                            if (i37 == 0) {
                                i39 |= 1;
                            }
                            if (i37 == i35 - 1) {
                                i2 = i39 | 2;
                                groupedMessagePosition3 = groupedMessagePosition4;
                            } else {
                                i2 = i39;
                            }
                            groupedMessagePosition4.set(i37, i37, i34, i34, i38, f13 / 814.0f, i2);
                            i33++;
                        }
                        groupedMessagePosition3.pw += i36;
                        groupedMessagePosition3.spanSize += i36;
                        i34++;
                    }
                    r8 = 1;
                } else {
                    if (size == 2) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                        String sb2 = sb.toString();
                        if (sb2.equals("ww") && f7 > f6 * 1.4d) {
                            float f14 = groupedMessagePosition5.aspectRatio;
                            float f15 = groupedMessagePosition6.aspectRatio;
                            if (f14 - f15 < 0.2d) {
                                float f16 = this.maxSizeWidth;
                                float round = Math.round(Math.min(f16 / f14, Math.min(f16 / f15, 407.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, this.maxSizeWidth, round, 7);
                                groupedMessagePosition6.set(0, 0, 1, 1, this.maxSizeWidth, round, 11);
                            }
                        }
                        if (sb2.equals("ww") || sb2.equals("qq")) {
                            int i40 = this.maxSizeWidth / 2;
                            float f17 = i40;
                            float round2 = Math.round(Math.min(f17 / groupedMessagePosition5.aspectRatio, Math.min(f17 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, i40, round2, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, i40, round2, 14);
                        } else {
                            float f18 = this.maxSizeWidth;
                            float f19 = groupedMessagePosition5.aspectRatio;
                            int max = (int) Math.max(0.4f * f18, Math.round((f18 / f19) / ((1.0f / f19) + (1.0f / groupedMessagePosition6.aspectRatio))));
                            int i41 = this.maxSizeWidth - max;
                            if (i41 < min) {
                                max -= min - i41;
                                i41 = min;
                            }
                            float min3 = Math.min(814.0f, Math.round(Math.min(i41 / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, i41, min3, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, max, min3, 14);
                        }
                    } else if (size == 3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f20 = groupedMessagePosition8.aspectRatio;
                            float min4 = Math.min(407.0f, Math.round((this.maxSizeWidth * f20) / (groupedMessagePosition9.aspectRatio + f20)));
                            int max2 = (int) Math.max(min, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r3))));
                            int round3 = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + i11, this.maxSizeWidth - max2));
                            groupedMessagePosition7.set(0, 0, 0, 1, round3, 1.0f, 13);
                            float f21 = (814.0f - min4) / 814.0f;
                            groupedMessagePosition8.set(1, 1, 0, 0, max2, f21, 6);
                            float f22 = min4 / 814.0f;
                            groupedMessagePosition9.set(0, 1, 1, 1, max2, f22, 10);
                            int i42 = this.maxSizeWidth;
                            groupedMessagePosition9.spanSize = i42;
                            groupedMessagePosition7.siblingHeights = new float[]{f22, f21};
                            groupedMessagePosition8.spanSize = i42 - round3;
                            groupedMessagePosition9.leftSpanOffset = round3;
                            this.hasSibling = true;
                        } else {
                            float round4 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition7.set(0, 1, 0, 0, this.maxSizeWidth, round4, 7);
                            int i43 = this.maxSizeWidth / 2;
                            float f23 = i43;
                            float min5 = Math.min(814.0f - round4, Math.round(Math.min(f23 / groupedMessagePosition8.aspectRatio, f23 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                            groupedMessagePosition8.set(0, 0, 1, 1, i43, min5, 9);
                            groupedMessagePosition9.set(1, 1, 1, 1, i43, min5, 10);
                        }
                    } else if (size == 4) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) this.posArray.get(2);
                        MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) this.posArray.get(3);
                        if (sb.charAt(0) == 'w') {
                            float round5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition10.set(0, 2, 0, 0, this.maxSizeWidth, round5, 7);
                            float round6 = Math.round(this.maxSizeWidth / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                            float f24 = min;
                            int max3 = (int) Math.max(f24, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition11.aspectRatio * round6));
                            int max4 = (int) Math.max(Math.max(f24, this.maxSizeWidth * 0.33f), groupedMessagePosition13.aspectRatio * round6);
                            int i44 = (this.maxSizeWidth - max3) - max4;
                            float min6 = Math.min(814.0f - round5, round6) / 814.0f;
                            groupedMessagePosition11.set(0, 0, 1, 1, max3, min6, 9);
                            groupedMessagePosition12.set(1, 1, 1, 1, i44, min6, 8);
                            groupedMessagePosition13.set(2, 2, 1, 1, max4, min6, 10);
                        } else {
                            int max5 = Math.max(min, Math.round(814.0f / (((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition12.aspectRatio)) + (1.0f / ((MessageObject.GroupedMessagePosition) this.posArray.get(3)).aspectRatio))));
                            float f25 = dp;
                            float f26 = max5;
                            float min7 = Math.min(0.33f, Math.max(f25, f26 / groupedMessagePosition11.aspectRatio) / 814.0f);
                            float min8 = Math.min(0.33f, Math.max(f25, f26 / groupedMessagePosition12.aspectRatio) / 814.0f);
                            float f27 = (1.0f - min7) - min8;
                            int round7 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + i11, this.maxSizeWidth - max5));
                            groupedMessagePosition10.set(0, 0, 0, 2, round7, min7 + min8 + f27, 13);
                            groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                            groupedMessagePosition12.set(0, 1, 1, 1, max5, min8, 2);
                            groupedMessagePosition12.spanSize = this.maxSizeWidth;
                            groupedMessagePosition13.set(0, 1, 2, 2, max5, f27, 10);
                            int i45 = this.maxSizeWidth;
                            groupedMessagePosition13.spanSize = i45;
                            groupedMessagePosition11.spanSize = i45 - round7;
                            groupedMessagePosition12.leftSpanOffset = round7;
                            groupedMessagePosition13.leftSpanOffset = round7;
                            groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f27};
                            this.hasSibling = true;
                        }
                    }
                    i = size;
                    r8 = 1;
                }
                int i46 = i;
                for (int i47 = 0; i47 < i46; i47 += r8) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) this.posArray.get(i47);
                    if ((groupedMessagePosition14.flags & r8) != 0) {
                        groupedMessagePosition14.edge = r8;
                    }
                }
            }
        }

        public BlockCollageCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.group = new GroupedMessages();
            this.parentAdapter = webpageAdapter;
            RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.1
                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
                public void requestLayout() {
                    if (BlockCollageCell.this.inLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.innerListView = recyclerListView;
            recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.2
                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition;
                    int i = 0;
                    rect.bottom = 0;
                    if (!(view instanceof BlockPhotoCell)) {
                        groupedMessagePosition = view instanceof BlockVideoCell ? (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock);
                    }
                    if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float max = Math.max(point.x, point.y) * 0.5f;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= groupedMessagePosition.siblingHeights.length) {
                            break;
                        }
                        i3 += (int) Math.ceil(r2[i2] * max);
                        i2++;
                    }
                    int dp2 = i3 + ((groupedMessagePosition.maxY - groupedMessagePosition.minY) * AndroidUtilities.dp2(11.0f));
                    int size = BlockCollageCell.this.group.posArray.size();
                    while (true) {
                        if (i < size) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.posArray.get(i);
                            byte b = groupedMessagePosition2.minY;
                            byte b2 = groupedMessagePosition.minY;
                            if (b == b2 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b != b2 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b == b2)) {
                                dp2 -= ((int) Math.ceil(max * groupedMessagePosition2.ph)) - AndroidUtilities.dp(4.0f);
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                    rect.bottom = -dp2;
                }
            });
            GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, MediaDataController.MAX_STYLE_RUNS_COUNT, 1, true) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.3
                @Override // androidx.recyclerview.widget.GridLayoutManagerFixed
                public boolean shouldLayoutChildFromOpositeSide(View view) {
                    return false;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManagerFixed
                protected boolean hasSiblingChild(int i) {
                    byte b;
                    MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1));
                    if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b != 0) {
                        int size = BlockCollageCell.this.group.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.posArray.get(i2);
                            if (groupedMessagePosition2 != groupedMessagePosition) {
                                byte b2 = groupedMessagePosition2.minY;
                                byte b3 = groupedMessagePosition.minY;
                                if (b2 <= b3 && groupedMessagePosition2.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            };
            gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.4
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    return ((MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1))).spanSize;
                }
            });
            this.innerListView.setLayoutManager(gridLayoutManagerFixed);
            RecyclerListView recyclerListView2 = this.innerListView;
            RecyclerView.Adapter adapter = new RecyclerView.Adapter() { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.5
                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View blockPhotoCell;
                    if (i == 0) {
                        Context context2 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        blockPhotoCell = new BlockPhotoCell(context2, ArticleViewer.this, blockCollageCell.parentAdapter, 2);
                    } else {
                        Context context3 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        blockPhotoCell = new BlockVideoCell(context3, ArticleViewer.this, blockCollageCell2.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(blockPhotoCell);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    TL_iv.PageBlock pageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() == 0) {
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.groupPosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(pageBlock);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockCollageCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                    } else {
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.groupPosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(pageBlock);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public int getItemCount() {
                    if (BlockCollageCell.this.currentBlock == null) {
                        return 0;
                    }
                    return BlockCollageCell.this.currentBlock.items.size();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public int getItemViewType(int i) {
                    return BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
                }
            };
            this.innerAdapter = adapter;
            recyclerListView2.setAdapter(adapter);
            addView(this.innerListView, LayoutHelper.createFrame(-1, -2.0f));
            setWillNotDraw(false);
        }

        public void setBlock(TL_iv.pageBlockCollage pageblockcollage) {
            if (this.currentBlock != pageblockcollage) {
                this.currentBlock = pageblockcollage;
                this.group.calculate();
            }
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setGlowColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            int i4 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockCollage pageblockcollage = this.currentBlock;
            if (pageblockcollage != null) {
                if (pageblockcollage.level > 0) {
                    int dp2 = AndroidUtilities.dp(r15 * 14) + AndroidUtilities.dp(18.0f);
                    this.listX = dp2;
                    this.textX = dp2;
                    i3 = size - (dp2 + AndroidUtilities.dp(18.0f));
                    dp = i3;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    dp = size - AndroidUtilities.dp(36.0f);
                    i3 = size;
                }
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int dp3 = measuredHeight + AndroidUtilities.dp(8.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, pageblockcollage2.caption.text, dp, dp3, pageblockcollage2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp4;
                    measuredHeight += dp4 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockcollage3.caption.credit, dp, this.textY + this.creditOffset, pageblockcollage3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    measuredHeight += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                i4 = measuredHeight + AndroidUtilities.dp(16.0f);
                TL_iv.pageBlockCollage pageblockcollage4 = this.currentBlock;
                if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                    i4 += AndroidUtilities.dp(8.0f);
                }
            }
            setMeasuredDimension(size, i4);
            this.inLayout = false;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(this.listX, AndroidUtilities.dp(8.0f), this.listX + this.innerListView.getMeasuredWidth(), this.innerListView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    private class BlockSlideshowCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockSlideshow currentBlock;
        private int currentPage;
        private View dotsContainer;
        private PagerAdapter innerAdapter;
        private ViewPager innerListView;
        private float pageOffset;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public BlockSlideshowCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
            if (ArticleViewer.dotsPaint == null) {
                Paint unused = ArticleViewer.dotsPaint = new Paint(1);
                ArticleViewer.dotsPaint.setColor(-1);
            }
            ViewPager viewPager = new ViewPager(context) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.1
                @Override // androidx.viewpager.widget.ViewPager, android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return super.onTouchEvent(motionEvent);
                }

                @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    ArticleViewer.this.cancelCheckLongPress();
                    return super.onInterceptTouchEvent(motionEvent);
                }
            };
            this.innerListView = viewPager;
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.2
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    float measuredWidth = BlockSlideshowCell.this.innerListView.getMeasuredWidth();
                    if (measuredWidth == 0.0f) {
                        return;
                    }
                    BlockSlideshowCell.this.pageOffset = (((i * measuredWidth) + i2) - (r0.currentPage * measuredWidth)) / measuredWidth;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    BlockSlideshowCell.this.currentPage = i;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }
            });
            ViewPager viewPager2 = this.innerListView;
            PagerAdapter pagerAdapter = new PagerAdapter() { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.3

                class ObjectContainer {
                    private TL_iv.PageBlock block;
                    private View view;

                    ObjectContainer() {
                    }
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public int getCount() {
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return 0;
                    }
                    return BlockSlideshowCell.this.currentBlock.items.size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public boolean isViewFromObject(View view, Object obj) {
                    return ((ObjectContainer) obj).view == view;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public int getItemPosition(Object obj) {
                    return BlockSlideshowCell.this.currentBlock.items.contains(((ObjectContainer) obj).block) ? -1 : -2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.viewpager.widget.PagerAdapter
                public Object instantiateItem(ViewGroup viewGroup, int i) {
                    BlockVideoCell blockVideoCell;
                    TL_iv.PageBlock pageBlock = BlockSlideshowCell.this.currentBlock.items.get(i);
                    if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        Context context2 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                        BlockPhotoCell blockPhotoCell = new BlockPhotoCell(context2, ArticleViewer.this, blockSlideshowCell.parentAdapter, 1);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockSlideshowCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                        blockVideoCell = blockPhotoCell;
                    } else {
                        Context context3 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell2 = BlockSlideshowCell.this;
                        BlockVideoCell blockVideoCell2 = new BlockVideoCell(context3, ArticleViewer.this, blockSlideshowCell2.parentAdapter, 1);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell2.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
                        blockVideoCell = blockVideoCell2;
                    }
                    viewGroup.addView(blockVideoCell);
                    ObjectContainer objectContainer = new ObjectContainer();
                    objectContainer.view = blockVideoCell;
                    objectContainer.block = pageBlock;
                    return objectContainer;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                    viewGroup.removeView(((ObjectContainer) obj).view);
                }
            };
            this.innerAdapter = pagerAdapter;
            viewPager2.setAdapter(pagerAdapter);
            AndroidUtilities.setViewPagerEdgeEffectColor(this.innerListView, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            addView(this.innerListView);
            View view = new View(context) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.4
                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    int i;
                    int i2;
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return;
                    }
                    int count = BlockSlideshowCell.this.innerAdapter.getCount();
                    int dp = (AndroidUtilities.dp(7.0f) * count) + ((count - 1) * AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(4.0f);
                    if (dp < getMeasuredWidth()) {
                        i = (getMeasuredWidth() - dp) / 2;
                    } else {
                        int dp2 = AndroidUtilities.dp(4.0f);
                        int dp3 = AndroidUtilities.dp(13.0f);
                        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3;
                        int i3 = (count - measuredWidth) - 1;
                        if (BlockSlideshowCell.this.currentPage != i3 || BlockSlideshowCell.this.pageOffset >= 0.0f) {
                            if (BlockSlideshowCell.this.currentPage >= i3) {
                                i2 = ((count - (measuredWidth * 2)) - 1) * dp3;
                            } else if (BlockSlideshowCell.this.currentPage > measuredWidth) {
                                i2 = ((int) (BlockSlideshowCell.this.pageOffset * dp3)) + ((BlockSlideshowCell.this.currentPage - measuredWidth) * dp3);
                            } else if (BlockSlideshowCell.this.currentPage != measuredWidth || BlockSlideshowCell.this.pageOffset <= 0.0f) {
                                i = dp2;
                            } else {
                                i2 = (int) (BlockSlideshowCell.this.pageOffset * dp3);
                            }
                            i = dp2 - i2;
                        } else {
                            i = dp2 - (((int) (BlockSlideshowCell.this.pageOffset * dp3)) + (((count - (measuredWidth * 2)) - 1) * dp3));
                        }
                    }
                    int i4 = 0;
                    while (i4 < BlockSlideshowCell.this.currentBlock.items.size()) {
                        int dp4 = AndroidUtilities.dp(4.0f) + i + (AndroidUtilities.dp(13.0f) * i4);
                        Drawable drawable = BlockSlideshowCell.this.currentPage == i4 ? ArticleViewer.this.slideDotBigDrawable : ArticleViewer.this.slideDotDrawable;
                        drawable.setBounds(dp4 - AndroidUtilities.dp(5.0f), 0, dp4 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f));
                        drawable.draw(canvas);
                        i4++;
                    }
                }
            };
            this.dotsContainer = view;
            addView(view);
            setWillNotDraw(false);
        }

        public void setBlock(TL_iv.pageBlockSlideshow pageblockslideshow) {
            this.currentBlock = pageblockslideshow;
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setCurrentItem(0, false);
            this.innerListView.forceLayout();
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int dp = AndroidUtilities.dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), TLObject.FLAG_30));
                int dp2 = size - AndroidUtilities.dp(36.0f);
                int dp3 = dp + AndroidUtilities.dp(16.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, pageblockslideshow.caption.text, dp2, dp3, pageblockslideshow, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp4;
                    dp += dp4 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockslideshow2.caption.credit, dp2, this.textY + this.creditOffset, pageblockslideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    dp += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                i3 = dp + AndroidUtilities.dp(16.0f);
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(0, AndroidUtilities.dp(8.0f), this.innerListView.getMeasuredWidth(), AndroidUtilities.dp(8.0f) + this.innerListView.getMeasuredHeight());
            int bottom = this.innerListView.getBottom() - AndroidUtilities.dp(23.0f);
            View view = this.dotsContainer;
            view.layout(0, bottom, view.getMeasuredWidth(), this.dotsContainer.getMeasuredHeight() + bottom);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private CheckBoxBase checkbox;
        private TL_pageBlockListItem currentBlock;
        private int currentBlockType;
        private boolean drawDot;
        private int numOffsetY;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            if ((tL_pageBlockListItem != null ? tL_pageBlockListItem.numLayout : null) == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx() - 3);
                TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                return (measuredWidth - tL_pageBlockListParent.maxNumWidth) - (tL_pageBlockListParent.level * AndroidUtilities.dp(12.0f));
            }
            return ((AndroidUtilities.dp(this.parent.padx() - 3) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(r0.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            int boundLeft;
            int dp = AndroidUtilities.dp(this.parent.padx());
            int min = this.checkbox != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (this.textX - AndroidUtilities.dp(26.0f)) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            if (tL_pageBlockListItem != null && tL_pageBlockListItem.numLayout != null) {
                min = Math.min(min, (numLayoutX() + this.currentBlock.numLayout.getBoundLeft()) - dp);
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                min = Math.min(min, (drawingText.x + drawingText.getBoundLeft()) - dp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundLeft = ((IBlock) callback).getBoundLeft()) != -1) {
                    min = Math.min(min, this.blockX + boundLeft);
                }
            }
            if (min == Integer.MAX_VALUE) {
                return -1;
            }
            return min;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            int boundRight;
            int dp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int max = (tL_pageBlockListItem == null || tL_pageBlockListItem.numLayout == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, numLayoutX() + this.currentBlock.numLayout.getBoundRight() + dp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                max = Math.max(max, drawingText.x + drawingText.getBoundRight() + dp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundRight = ((IBlock) callback).getBoundRight()) != -1) {
                    max = Math.max(max, this.blockX + boundRight);
                }
            }
            if (max == Integer.MIN_VALUE) {
                return -1;
            }
            return max;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int i;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        i = this.blockX;
                    }
                }
                return -1;
            }
            i = drawingText.x + drawingText.getLastLineBoundRight();
            lastLineBoundRight = AndroidUtilities.dp(this.parent.padx());
            return i + lastLineBoundRight;
        }

        public void setBlock(TL_pageBlockListItem tL_pageBlockListItem) {
            WebpageAdapter webpageAdapter;
            WebpageAdapter webpageAdapter2;
            if (this.currentBlock != tL_pageBlockListItem) {
                this.currentBlock = tL_pageBlockListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                TL_iv.PageBlock pageBlock = this.currentBlock.blockItem;
                if (pageBlock != null && (webpageAdapter2 = this.adapter) != null) {
                    int typeForBlock = webpageAdapter2.getTypeForBlock(pageBlock);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.adapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            TL_iv.PageBlock pageBlock2 = this.currentBlock.blockItem;
            if (pageBlock2 != null && (webpageAdapter = this.adapter) != null) {
                webpageAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, pageBlock2, 0, 0, false);
            }
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockListItem.index == 0 && tL_pageBlockListItem.parent.level == 0) ? AndroidUtilities.dp(this.parent.pady() + 2) : 0;
                this.numOffsetY = 0;
                TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                if (tL_pageBlockListParent.lastMaxNumCalcWidth != size || tL_pageBlockListParent.lastFontSize != SharedConfig.ivFontSize) {
                    tL_pageBlockListParent.lastMaxNumCalcWidth = size;
                    tL_pageBlockListParent.lastFontSize = SharedConfig.ivFontSize;
                    tL_pageBlockListParent.maxNumWidth = 0;
                    int size2 = tL_pageBlockListParent.items.size();
                    boolean z = true;
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockListItem tL_pageBlockListItem2 = (TL_pageBlockListItem) this.currentBlock.parent.items.get(i6);
                        String str = tL_pageBlockListItem2.num;
                        if (str != null) {
                            if (tL_pageBlockListItem2.isCheckbox && "•".equalsIgnoreCase(str)) {
                                tL_pageBlockListItem2.numLayout = null;
                            } else {
                                tL_pageBlockListItem2.numLayout = ArticleViewer.createLayoutForText(this.parent, this, tL_pageBlockListItem2.num, (TL_iv.RichText) null, size - AndroidUtilities.dp(r0.padx() * 3), this.textY, this.currentBlock, this.adapter);
                                TL_pageBlockListParent tL_pageBlockListParent2 = this.currentBlock.parent;
                                tL_pageBlockListParent2.maxNumWidth = Math.max(tL_pageBlockListParent2.maxNumWidth, (int) Math.ceil(r0.getLineWidth(0)));
                                z = false;
                            }
                        }
                    }
                    if (ArticleViewer.listTextNumPaint != null && !z) {
                        TL_pageBlockListParent tL_pageBlockListParent3 = this.currentBlock.parent;
                        tL_pageBlockListParent3.maxNumWidth = Math.max(tL_pageBlockListParent3.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                    }
                }
                TL_pageBlockListItem tL_pageBlockListItem3 = this.currentBlock;
                this.drawDot = !tL_pageBlockListItem3.parent.pageBlockList.ordered;
                if (tL_pageBlockListItem3.isCheckbox) {
                    if (this.checkbox == null) {
                        CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, this.parent.getResourcesProvider());
                        this.checkbox = checkBoxBase;
                        checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                        this.checkbox.setBackgroundType(10);
                        this.checkbox.setDrawUnchecked(true);
                        this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
                    }
                    this.checkbox.setChecked(this.currentBlock.checked, false);
                } else {
                    this.checkbox = null;
                }
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int dp2 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockListParent tL_pageBlockListParent4 = this.currentBlock.parent;
                    this.textX = dp2 + tL_pageBlockListParent4.maxNumWidth + (tL_pageBlockListParent4.level * AndroidUtilities.dp(12.0f));
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                int dp3 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int dp4 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockListParent tL_pageBlockListParent5 = this.currentBlock.parent;
                    dp3 -= (dp4 + tL_pageBlockListParent5.maxNumWidth) + (tL_pageBlockListParent5.level * AndroidUtilities.dp(12.0f));
                }
                int i7 = dp3;
                TL_pageBlockListItem tL_pageBlockListItem4 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockListItem4.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer = this.parent;
                    int i8 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, i7, i8, tL_pageBlockListItem4, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - this.textLayout.getLineAscent(0);
                        }
                        i5 = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady());
                    }
                } else {
                    TL_iv.PageBlock pageBlock = tL_pageBlockListItem4.blockItem;
                    if (pageBlock != null) {
                        this.blockX = this.textX;
                        int i9 = this.textY;
                        this.blockY = i9;
                        RecyclerView.ViewHolder viewHolder = this.blockLayout;
                        if (viewHolder != null) {
                            View view = viewHolder.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i9 - AndroidUtilities.dp(this.parent.pady());
                                WebpageAdapter webpageAdapter4 = this.adapter;
                                if (webpageAdapter4 == null || !webpageAdapter4.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                }
                                i7 += AndroidUtilities.dp(this.parent.padx());
                                i3 = 0 - AndroidUtilities.dp(this.parent.pady());
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    dp = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    TL_pageBlockListItem tL_pageBlockListItem5 = this.currentBlock;
                                    i3 = ((tL_pageBlockListItem5.index == 0 && tL_pageBlockListItem5.parent.level == 0) ? 0 - AndroidUtilities.dp(this.parent.pady() + 2) : 0) - AndroidUtilities.dp(this.parent.pady());
                                    i7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        dp = AndroidUtilities.dp(this.parent.padx() * 2);
                                    }
                                    i3 = 0;
                                }
                                i7 += dp;
                                i3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            TL_pageBlockListItem tL_pageBlockListItem6 = this.currentBlock;
                            if (tL_pageBlockListItem6.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                if (tL_pageBlockListItem6.index == 0 && tL_pageBlockListItem6.parent.level == 0) {
                                    i3 -= AndroidUtilities.dp(this.parent.pady() + 2);
                                }
                                i3 -= AndroidUtilities.dp(this.parent.pady());
                            } else {
                                View view2 = this.blockLayout.itemView;
                                if (!(view2 instanceof BlockOrderedListItemCell)) {
                                    if (view2 instanceof BlockListItemCell) {
                                        this.verticalAlign = ((BlockListItemCell) view2).verticalAlign;
                                    }
                                } else {
                                    this.verticalAlign = ((BlockOrderedListItemCell) view2).verticalAlign;
                                }
                            }
                            if (this.verticalAlign && this.currentBlock.numLayout != null) {
                                this.textY = ((this.blockLayout.itemView.getMeasuredHeight() - this.currentBlock.numLayout.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                                this.drawDot = false;
                            }
                            i5 = i3 + this.blockLayout.itemView.getMeasuredHeight();
                        }
                        i5 += AndroidUtilities.dp(this.parent.pady());
                    }
                }
                ArrayList arrayList = this.currentBlock.parent.items;
                if (arrayList.get(arrayList.size() - 1) == this.currentBlock) {
                    i5 += AndroidUtilities.dp(this.parent.pady());
                }
                TL_pageBlockListItem tL_pageBlockListItem7 = this.currentBlock;
                if (tL_pageBlockListItem7.index == 0 && tL_pageBlockListItem7.parent.level == 0) {
                    i5 += AndroidUtilities.dp(this.parent.pady() + 2);
                }
                i4 = i5;
                DrawingText drawingText4 = this.textLayout;
                if (drawingText4 != null) {
                    drawingText4.x = this.textX;
                    drawingText4.y = this.textY;
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView) && (textSelectionHelper = this.parent.getTextSelectionHelper(null)) != null) {
                    textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(textSelectionHelper.arrayList);
                    Iterator it = textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) it.next();
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText5 = (DrawingText) textLayoutBlock;
                            drawingText5.x += this.blockX;
                            drawingText5.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i4);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockY + this.blockLayout.itemView.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    int dp = measuredWidth - AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                    canvas.translate((dp - tL_pageBlockListParent.maxNumWidth) - (tL_pageBlockListParent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                } else {
                    int dp2 = AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
                    canvas.translate(((dp2 + tL_pageBlockListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockListItem.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.setBounds(this.textX - AndroidUtilities.dp(26.0f), this.textY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
        public void invalidate() {
            super.invalidate();
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                viewHolder.itemView.invalidate();
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if (callback instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) callback).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockOrderedListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private CheckBoxBase checkbox;
        private TL_pageBlockOrderedListItem currentBlock;
        private int currentBlockType;
        private int numOffsetY;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockOrderedListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            if ((tL_pageBlockOrderedListItem != null ? tL_pageBlockOrderedListItem.numLayout : null) == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx());
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                return (measuredWidth - tL_pageBlockOrderedListParent.maxNumWidth) - (tL_pageBlockOrderedListParent.level * AndroidUtilities.dp(20.0f));
            }
            return ((AndroidUtilities.dp(this.parent.padx()) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(r0.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            int boundLeft;
            int dp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int min = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (numLayoutX() + this.currentBlock.numLayout.getBoundLeft()) - dp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                min = Math.min(min, (drawingText.x + drawingText.getBoundLeft()) - dp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundLeft = ((IBlock) callback).getBoundLeft()) != -1) {
                    min = Math.min(min, this.blockX + boundLeft);
                }
            }
            if (min == Integer.MAX_VALUE) {
                return -1;
            }
            return min;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            int boundRight;
            int dp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int max = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? TLObject.FLAG_31 : Math.max(TLObject.FLAG_31, numLayoutX() + this.currentBlock.numLayout.getBoundRight() + dp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                max = Math.max(max, drawingText.x + drawingText.getBoundRight() + dp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundRight = ((IBlock) callback).getBoundRight()) != -1) {
                    max = Math.max(max, this.blockX + boundRight);
                }
            }
            if (max == Integer.MIN_VALUE) {
                return -1;
            }
            return max;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int i;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        i = this.blockX;
                    }
                }
                return -1;
            }
            i = drawingText.x + drawingText.getLastLineBoundRight();
            lastLineBoundRight = AndroidUtilities.dp(this.parent.padx());
            return i + lastLineBoundRight;
        }

        public void setBlock(TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem) {
            WebpageAdapter webpageAdapter;
            WebpageAdapter webpageAdapter2;
            if (this.currentBlock != tL_pageBlockOrderedListItem) {
                this.currentBlock = tL_pageBlockOrderedListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                TL_iv.PageBlock pageBlock = this.currentBlock.blockItem;
                if (pageBlock != null && (webpageAdapter2 = this.adapter) != null) {
                    int typeForBlock = webpageAdapter2.getTypeForBlock(pageBlock);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.adapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            TL_iv.PageBlock pageBlock2 = this.currentBlock.blockItem;
            if (pageBlock2 != null && (webpageAdapter = this.adapter) != null) {
                webpageAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, pageBlock2, 0, 0, false);
            }
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockOrderedListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockOrderedListItem.index == 0 && tL_pageBlockOrderedListItem.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                if (tL_pageBlockOrderedListParent.lastMaxNumCalcWidth != size || tL_pageBlockOrderedListParent.lastFontSize != SharedConfig.ivFontSize) {
                    tL_pageBlockOrderedListParent.lastMaxNumCalcWidth = size;
                    tL_pageBlockOrderedListParent.lastFontSize = SharedConfig.ivFontSize;
                    tL_pageBlockOrderedListParent.maxNumWidth = 0;
                    int size2 = tL_pageBlockOrderedListParent.items.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = (TL_pageBlockOrderedListItem) this.currentBlock.parent.items.get(i6);
                        String str = tL_pageBlockOrderedListItem2.num;
                        if (str != null) {
                            tL_pageBlockOrderedListItem2.numLayout = ArticleViewer.createLayoutForText(this.parent, this, str, (TL_iv.RichText) null, size - AndroidUtilities.dp(r0.padx() * 3), this.textY, this.currentBlock, this.adapter);
                            TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent2 = this.currentBlock.parent;
                            tL_pageBlockOrderedListParent2.maxNumWidth = Math.max(tL_pageBlockOrderedListParent2.maxNumWidth, (int) Math.ceil(r0.getLineWidth(0)));
                        }
                    }
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent3 = this.currentBlock.parent;
                    tL_pageBlockOrderedListParent3.maxNumWidth = Math.max(tL_pageBlockOrderedListParent3.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                if (this.currentBlock.isCheckbox) {
                    if (this.checkbox == null) {
                        CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, this.parent.getResourcesProvider());
                        this.checkbox = checkBoxBase;
                        checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                        this.checkbox.setBackgroundType(10);
                        this.checkbox.setDrawUnchecked(true);
                        this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
                    }
                    this.checkbox.setChecked(this.currentBlock.checked, false);
                } else {
                    this.checkbox = null;
                }
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int dp2 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent4 = this.currentBlock.parent;
                    this.textX = dp2 + tL_pageBlockOrderedListParent4.maxNumWidth + (tL_pageBlockOrderedListParent4.level * AndroidUtilities.dp(20.0f));
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                this.verticalAlign = false;
                int dp3 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int dp4 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent5 = this.currentBlock.parent;
                    dp3 -= (dp4 + tL_pageBlockOrderedListParent5.maxNumWidth) + (tL_pageBlockOrderedListParent5.level * AndroidUtilities.dp(20.0f));
                }
                int i7 = dp3;
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockOrderedListItem3.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer = this.parent;
                    int i8 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, i7, i8, tL_pageBlockOrderedListItem3, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - this.textLayout.getLineAscent(0);
                        }
                        i5 = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                    }
                } else {
                    TL_iv.PageBlock pageBlock = tL_pageBlockOrderedListItem3.blockItem;
                    if (pageBlock != null) {
                        this.blockX = this.textX;
                        int i9 = this.textY;
                        this.blockY = i9;
                        RecyclerView.ViewHolder viewHolder = this.blockLayout;
                        if (viewHolder != null) {
                            View view = viewHolder.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i9 - AndroidUtilities.dp(8.0f);
                                WebpageAdapter webpageAdapter4 = this.adapter;
                                if (webpageAdapter4 == null || !webpageAdapter4.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                }
                                i7 += AndroidUtilities.dp(18.0f);
                                i3 = 0 - AndroidUtilities.dp(8.0f);
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    dp = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    i3 = 0 - AndroidUtilities.dp(8.0f);
                                    i7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        dp = AndroidUtilities.dp(36.0f);
                                    }
                                    i3 = 0;
                                }
                                i7 += dp;
                                i3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            if (this.currentBlock.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                i3 -= AndroidUtilities.dp(8.0f);
                            } else {
                                View view2 = this.blockLayout.itemView;
                                if (view2 instanceof BlockOrderedListItemCell) {
                                    this.verticalAlign = ((BlockOrderedListItemCell) view2).verticalAlign;
                                } else if (view2 instanceof BlockListItemCell) {
                                    this.verticalAlign = ((BlockListItemCell) view2).verticalAlign;
                                }
                            }
                            if (this.verticalAlign && this.currentBlock.numLayout != null) {
                                this.textY = (this.blockLayout.itemView.getMeasuredHeight() - this.currentBlock.numLayout.getHeight()) / 2;
                            }
                            i5 = i3 + this.blockLayout.itemView.getMeasuredHeight();
                        }
                        i5 += AndroidUtilities.dp(8.0f);
                    }
                }
                ArrayList arrayList = this.currentBlock.parent.items;
                if (arrayList.get(arrayList.size() - 1) == this.currentBlock) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem4 = this.currentBlock;
                if (tL_pageBlockOrderedListItem4.index == 0 && tL_pageBlockOrderedListItem4.parent.level == 0) {
                    i5 += AndroidUtilities.dp(10.0f);
                }
                i4 = i5;
                DrawingText drawingText4 = this.textLayout;
                if (drawingText4 != null) {
                    drawingText4.x = this.textX;
                    drawingText4.y = this.textY;
                    DrawingText drawingText5 = this.currentBlock.numLayout;
                    if (drawingText5 != null) {
                        drawingText4.prefix = drawingText5.textLayout.getText();
                    }
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView) && (textSelectionHelper = this.parent.getTextSelectionHelper(null)) != null) {
                    textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(textSelectionHelper.arrayList);
                    Iterator it = textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) it.next();
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText6 = (DrawingText) textLayoutBlock;
                            drawingText6.x += this.blockX;
                            drawingText6.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i4);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockY + this.blockLayout.itemView.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    int dp = measuredWidth - AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                    canvas.translate((dp - tL_pageBlockOrderedListParent.maxNumWidth) - (tL_pageBlockOrderedListParent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                } else {
                    int dp2 = AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
                    canvas.translate(((dp2 + tL_pageBlockOrderedListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockOrderedListItem.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.setBounds(this.textX - AndroidUtilities.dp(26.0f), this.textY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
        public void invalidate() {
            super.invalidate();
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                viewHolder.itemView.invalidate();
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if (callback instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) callback).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDetailsCell extends View implements Drawable.Callback, TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private AnimatedArrowDrawable arrow;
        private TL_iv.pageBlockDetails currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public BlockDetailsCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            this.arrow = new AnimatedArrowDrawable(iArticleViewer.getGrayTextColor(), true);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate();
        }

        public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
            this.currentBlock = pageblockdetails;
            this.arrow.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
            this.arrow.setCallback(this);
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(39.0f);
            this.textX = AndroidUtilities.dp(50.0f);
            this.textY = AndroidUtilities.dp(11.0f) + 1;
            TL_iv.pageBlockDetails pageblockdetails = this.currentBlock;
            if (pageblockdetails != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblockdetails.title;
                int dp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 3);
                TL_iv.pageBlockDetails pageblockdetails2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp2, 0, pageblockdetails2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    dp = Math.max(dp, AndroidUtilities.dp(21.0f) + this.textLayout.getHeight());
                    int height = ((this.textLayout.getHeight() + AndroidUtilities.dp(21.0f)) - this.textLayout.getHeight()) / 2;
                    this.textY = height;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = height;
                }
            }
            setMeasuredDimension(size, dp + 1);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.save();
            canvas.translate(AndroidUtilities.dp(this.parent.padx()), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
            this.arrow.draw(canvas);
            canvas.restore();
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            float measuredHeight = getMeasuredHeight() - 1;
            canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, ArticleViewer.dividerPaint);
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence buildAccessibilityText;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (buildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(buildAccessibilityText).append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
            TL_iv.pageBlockDetails pageblockdetails = this.currentBlock;
            spannableStringBuilder.append((CharSequence) LocaleController.getString((pageblockdetails == null || !pageblockdetails.open) ? R.string.AccDescrIVCollapsed : R.string.AccDescrIVExpanded));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDetailsBottomCell extends View {
        private final RectF rect;

        public BlockDetailsBottomCell(Context context) {
            super(context);
            this.rect = new RectF();
            setImportantForAccessibility(2);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(4.0f) + 1);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, ArticleViewer.dividerPaint);
        }
    }

    public static class BlockRelatedArticlesShadowCell extends View {
        private final IArticleViewer parent;
        private CombinedDrawable shadowDrawable;

        public BlockRelatedArticlesShadowCell(Context context, IArticleViewer iArticleViewer) {
            super(context);
            this.parent = iArticleViewer;
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(iArticleViewer.getThemedColor(Theme.key_iv_backgroundGray)), Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, -16777216));
            this.shadowDrawable = combinedDrawable;
            combinedDrawable.setFullsize(true);
            setBackgroundDrawable(this.shadowDrawable);
            setImportantForAccessibility(2);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, this.parent.getThemedColor(Theme.key_iv_backgroundGray), false);
        }
    }

    public static class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockRelatedArticles currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockRelatedArticlesHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
            this.currentBlock = pageblockrelatedarticles;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.currentBlock;
            if (pageblockrelatedarticles != null) {
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = AndroidUtilities.dp(6.0f) + ((AndroidUtilities.dp(32.0f) - this.textLayout.getHeight()) / 2);
                }
            }
            if (this.textLayout != null) {
                setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
                DrawingText drawingText = this.textLayout;
                drawingText.x = this.textX;
                drawingText.y = this.textY;
                return;
            }
            setMeasuredDimension(size, 1);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVRelatedArticles));
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockRelatedArticlesCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private TL_pageBlockRelatedArticlesChild currentBlock;
        private TLObject currentPage;
        private boolean divider;
        private boolean drawImage;
        private ImageReceiver imageView;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textOffset;
        private int textX;
        private int textY;

        public BlockRelatedArticlesCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(10.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild, TLObject tLObject) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            this.currentPage = tLObject;
            requestLayout();
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            TLRPC.Photo photo;
            int i3;
            boolean z;
            int i4;
            String str;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = this.currentBlock;
            this.divider = tL_pageBlockRelatedArticlesChild.num != tL_pageBlockRelatedArticlesChild.parent.articles.size() - 1;
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild2 = this.currentBlock;
            TL_iv.pageRelatedArticle pagerelatedarticle = tL_pageBlockRelatedArticlesChild2.parent.articles.get(tL_pageBlockRelatedArticlesChild2.num);
            int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            long j = pagerelatedarticle.photo_id;
            if (j != 0) {
                WebpageAdapter webpageAdapter = this.adapter;
                photo = webpageAdapter != null ? webpageAdapter.getPhotoWithId(j) : WebPageUtils.getPhotoWithId(this.currentPage, j);
            } else {
                photo = null;
            }
            if (photo != null) {
                this.drawImage = true;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                this.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, photo), "64_64_b", closestPhotoSizeWithSize.size, null, this.currentPage, 1);
            } else {
                this.drawImage = false;
            }
            int dp2 = AndroidUtilities.dp(60.0f);
            int dp3 = size - AndroidUtilities.dp(36.0f);
            if (this.drawImage) {
                float dp4 = AndroidUtilities.dp(44.0f);
                this.imageView.setImageCoords((size - r1) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp4, dp4);
                dp3 = (int) (dp3 - (this.imageView.getImageWidth() + AndroidUtilities.dp(6.0f)));
            }
            int i5 = dp3;
            int dp5 = AndroidUtilities.dp(18.0f);
            String str2 = pagerelatedarticle.title;
            if (str2 != null) {
                i3 = dp2;
                this.textLayout = ArticleViewer.createLayoutForText(this.parent, this, str2, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.adapter);
            } else {
                i3 = dp2;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                int i6 = 4 - lineCount;
                this.textOffset = this.textLayout.getHeight() + AndroidUtilities.dp(6.0f) + dp;
                dp5 += this.textLayout.getHeight();
                int i7 = 0;
                while (true) {
                    if (i7 >= lineCount) {
                        z = false;
                        break;
                    } else {
                        if (this.textLayout.getLineLeft(i7) != 0.0f) {
                            z = true;
                            break;
                        }
                        i7++;
                    }
                }
                DrawingText drawingText2 = this.textLayout;
                drawingText2.x = this.textX;
                drawingText2.y = this.textY;
                i4 = i6;
            } else {
                this.textOffset = 0;
                z = false;
                i4 = 4;
            }
            if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
                str = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000), pagerelatedarticle.author);
            } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
                str = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
            } else if (pagerelatedarticle.published_date != 0) {
                str = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
                str = pagerelatedarticle.description;
            } else {
                str = pagerelatedarticle.url;
            }
            String str3 = str;
            IArticleViewer iArticleViewer = this.parent;
            int i8 = this.textY + this.textOffset;
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild3 = this.currentBlock;
            WebpageAdapter webpageAdapter2 = this.adapter;
            DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, str3, null, i5, i8, tL_pageBlockRelatedArticlesChild3, ((webpageAdapter2 == null || !webpageAdapter2.isRtl) && !z) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), i4, this.adapter);
            this.textLayout2 = createLayoutForText;
            if (createLayoutForText != null) {
                dp5 += createLayoutForText.getHeight();
                if (this.textLayout != null) {
                    dp5 += AndroidUtilities.dp(6.0f) + dp;
                }
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.x = this.textX;
                drawingText3.y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, dp5) + (this.divider ? 1 : 0));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.drawImage) {
                this.imageView.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.textX, AndroidUtilities.dp(10.0f));
            int i2 = 0;
            if (this.textLayout != null) {
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.translate(0.0f, this.textOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
            }
            canvas.restore();
            if (this.divider) {
                WebpageAdapter webpageAdapter = this.adapter;
                float dp = (webpageAdapter == null || !webpageAdapter.isRtl) ? AndroidUtilities.dp(17.0f) : 0.0f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    i2 = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(dp, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence buildAccessibilityText;
            CharSequence buildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (buildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(buildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (buildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(buildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.PageBlock currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        public void setBlock(TL_iv.PageBlock pageBlock) {
            this.currentBlock = pageBlock;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.PageBlock pageBlock = this.currentBlock;
            if (pageBlock != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageBlock.text;
                int dp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.PageBlock pageBlock2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp, i4, pageBlock2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (this.textX + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return this.textX + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return this.textX + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDividerCell extends View {
        private final RectF rect;

        public BlockDividerCell(Context context) {
            super(context);
            this.rect = new RectF();
            setImportantForAccessibility(2);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(18.0f));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            this.rect.set(getMeasuredWidth() / 3, AndroidUtilities.dp(8.0f), r0 * 2, AndroidUtilities.dp(10.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), ArticleViewer.dividerPaint);
        }
    }

    public static class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubtitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockSubtitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
            this.currentBlock = pageblocksubtitle;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockSubtitle pageblocksubtitle = this.currentBlock;
            if (pageblocksubtitle != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblocksubtitle.text;
                int dp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp, i4, pageblocksubtitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockPullquoteCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockPullquote currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockPullquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            int min = drawingText != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, drawingText.x + drawingText.getBoundLeft()) : ConnectionsManager.DEFAULT_DATACENTER_ID;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                min = Math.min(min, drawingText2.x + drawingText2.getBoundLeft());
            }
            if (min == Integer.MAX_VALUE) {
                return -1;
            }
            return min - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            int max = drawingText != null ? Math.max(TLObject.FLAG_31, drawingText.x + drawingText.getBoundRight()) : TLObject.FLAG_31;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                max = Math.max(max, drawingText2.x + drawingText2.getBoundRight());
            }
            if (max == Integer.MIN_VALUE) {
                return -1;
            }
            return max + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int dp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.x + drawingText.getLastLineBoundRight();
                dp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.x + drawingText2.getLastLineBoundRight();
                dp = AndroidUtilities.dp(this.parent.padx());
            }
            return lastLineBoundRight + dp;
        }

        public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
            this.currentBlock = pageblockpullquote;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockPullquote pageblockpullquote = this.currentBlock;
            if (pageblockpullquote != null) {
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, (CharSequence) null, pageblockpullquote.text, size - AndroidUtilities.dp(r0.padx() * 2), this.textY, this.currentBlock, this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(this.parent.pady()) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
                this.textY2 = AndroidUtilities.dp(2.0f) + i3;
                DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(this.parent, this, (CharSequence) null, this.currentBlock.caption, size - AndroidUtilities.dp(r1.padx() * 2), this.textY2, this.currentBlock, this.adapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(this.parent.pady()) + this.textLayout2.getHeight();
                    DrawingText drawingText2 = this.textLayout2;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(this.parent.pady());
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence buildAccessibilityText;
            CharSequence buildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (buildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(buildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (buildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(buildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVPullquote));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockBlockquoteCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockBlockquote currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockBlockquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            int dp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            int min = drawingText != null ? Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, (drawingText.x + drawingText.getBoundLeft()) - dp) : ConnectionsManager.DEFAULT_DATACENTER_ID;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                min = Math.min(min, (drawingText2.x + drawingText2.getBoundLeft()) - dp);
            }
            if (min == Integer.MAX_VALUE) {
                return -1;
            }
            return min - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            int dp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            int max = drawingText != null ? Math.max(TLObject.FLAG_31, drawingText.x + drawingText.getBoundRight() + dp) : TLObject.FLAG_31;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                max = Math.max(max, drawingText2.x + drawingText2.getBoundRight() + dp);
            }
            if (max == Integer.MIN_VALUE) {
                return -1;
            }
            return max + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int dp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.x + drawingText.getLastLineBoundRight();
                dp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.x + drawingText2.getLastLineBoundRight();
                dp = AndroidUtilities.dp(this.parent.padx());
            }
            return lastLineBoundRight + dp;
        }

        public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
            this.currentBlock = pageblockblockquote;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textY = AndroidUtilities.dp(this.parent.pady());
            if (this.currentBlock != null) {
                int dp = size - AndroidUtilities.dp((this.parent.padx() * 2) + 14);
                if (this.currentBlock.level > 0) {
                    dp -= AndroidUtilities.dp(r0 * 14);
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote = this.currentBlock;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockblockquote.text, dp, this.textY, pageblockblockquote, this.adapter);
                this.textLayout = createLayoutForText;
                i3 = createLayoutForText != null ? AndroidUtilities.dp(this.parent.pady()) + this.textLayout.getHeight() : 0;
                if (this.currentBlock.level > 0) {
                    WebpageAdapter webpageAdapter = this.adapter;
                    if (webpageAdapter != null && webpageAdapter.isRtl) {
                        this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + 14);
                    } else {
                        this.textX = AndroidUtilities.dp(this.currentBlock.level * 14) + AndroidUtilities.dp(this.parent.padx() + 14);
                    }
                } else {
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                        this.textX = AndroidUtilities.dp(14.0f);
                    } else {
                        this.textX = AndroidUtilities.dp(this.parent.padx() + 14);
                    }
                }
                int dp2 = i3 + AndroidUtilities.dp(this.parent.pady());
                this.textY2 = dp2;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote2 = this.currentBlock;
                DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockblockquote2.caption, dp, dp2, pageblockblockquote2, this.adapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(this.parent.pady()) + this.textLayout2.getHeight();
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(this.parent.pady());
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
                DrawingText drawingText2 = this.textLayout2;
                if (drawingText2 != null) {
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || !webpageAdapter.isRtl) {
                canvas.drawRect(AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14)), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.parent.padx() + 2 + (this.currentBlock.level * 14)), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            } else {
                canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), r0 + AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence buildAccessibilityText;
            CharSequence buildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (buildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(buildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (buildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(buildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockPhotoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean calcHeight;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockPhoto currentBlock;
        private String currentFilter;
        private TLObject currentPage;
        private TLRPC.Photo currentPhoto;
        private TLRPC.PhotoSize currentPhotoObject;
        private TLRPC.PhotoSize currentPhotoObjectThumb;
        private String currentThumbFilter;
        private int currentType;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private Drawable linkDrawable;
        private final IArticleViewer parent;
        private TL_iv.PageBlock parentBlock;
        private Object parentObject;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockPhotoCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.channelCell = new BlockChannelCell(context, iArticleViewer, webpageAdapter, 1);
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
            this.currentType = i;
        }

        public void setBlock(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, Object obj, boolean z, boolean z2) {
            this.parentBlock = null;
            this.currentBlock = pageblockphoto;
            this.currentPage = tLObject;
            this.parentObject = obj;
            this.calcHeight = z;
            this.isFirst = z2;
            this.channelCell.setVisibility(4);
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                this.linkDrawable = getResources().getDrawable(R.drawable.msg_instant_link);
            }
            TL_iv.pageBlockPhoto pageblockphoto2 = this.currentBlock;
            if (pageblockphoto2 != null) {
                TLRPC.Photo photoWithId = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto2.photo_id);
                if (photoWithId != null) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                } else {
                    this.currentPhotoObject = null;
                }
            } else {
                this.currentPhotoObject = null;
            }
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TL_iv.PageBlock pageBlock) {
            this.parentBlock = pageBlock;
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || webpageAdapter.channelBlock == null || !(this.parentBlock instanceof TL_iv.pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(this.adapter.channelBlock);
            this.channelCell.setVisibility(0);
        }

        public View getChannelCell() {
            return this.channelCell;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        
            if (r1 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L30;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.channelBlock != null) {
                    motionEvent.getAction();
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    if (x >= this.buttonX && x <= r2 + AndroidUtilities.dp(48.0f)) {
                        if (y >= this.buttonY) {
                        }
                    }
                }
                if (this.buttonState != 0) {
                    this.photoPressed = true;
                }
                this.buttonPressed = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    this.parent.openPhoto(this.currentBlock, this.adapter);
                } else if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
                this.buttonPressed = 0;
            }
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        public TL_iv.pageBlockPhoto getCurrentBlock() {
            return this.currentBlock;
        }

        public TLObject getCurrentPage() {
            return this.currentPage;
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
        @Override // android.widget.FrameLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            TL_iv.pageBlockPhoto pageblockphoto;
            int dp;
            int i5;
            int i6;
            WebpageAdapter webpageAdapter;
            int i7;
            int i8;
            int dp2;
            int i9;
            int i10;
            int size = View.MeasureSpec.getSize(i);
            int i11 = this.currentType;
            int i12 = 1;
            if (i11 == 1) {
                size = ((View) getParent()).getMeasuredWidth();
                i4 = ((View) getParent()).getMeasuredHeight();
            } else if (i11 == 2) {
                float f = this.groupPosition.ph;
                Point point = AndroidUtilities.displaySize;
                i4 = (int) Math.ceil(f * Math.max(point.x, point.y) * 0.5f);
            } else {
                i3 = size;
                i4 = 0;
                pageblockphoto = this.currentBlock;
                if (pageblockphoto != null) {
                    this.currentPhoto = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto.photo_id);
                    int dp3 = AndroidUtilities.dp(48.0f);
                    if (this.currentType == 0 && (i10 = this.currentBlock.level) > 0) {
                        i6 = AndroidUtilities.dp(i10 * 14) + AndroidUtilities.dp(18.0f);
                        this.textX = i6;
                        i5 = i3 - (AndroidUtilities.dp(18.0f) + i6);
                        dp = i5;
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                        dp = i3 - AndroidUtilities.dp(36.0f);
                        i5 = i3;
                        i6 = 0;
                    }
                    TLRPC.Photo photo = this.currentPhoto;
                    if (photo != null && (this.currentPhotoObject != null || (photo instanceof WebInstantView.WebPhoto))) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.currentPhotoObjectThumb = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.currentPhotoObject;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.currentPhotoObjectThumb = null;
                        }
                        TLRPC.Photo photo2 = this.currentPhoto;
                        if (photo2 instanceof WebInstantView.WebPhoto) {
                            WebInstantView.WebPhoto webPhoto = (WebInstantView.WebPhoto) photo2;
                            i7 = webPhoto.w;
                            i8 = webPhoto.h;
                        } else {
                            int i13 = photoSize.w;
                            int i14 = photoSize.h;
                            i7 = i13;
                            i8 = i14;
                        }
                        int i15 = this.currentType;
                        if (i15 == 0) {
                            float f2 = i7;
                            float f3 = i8;
                            i4 = (int) ((i5 / f2) * f3);
                            if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                                i4 = Math.min(i4, i5);
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    i5 = (int) ((max / f3) * f2);
                                    i6 += ((i3 - i6) - i5) / 2;
                                    i4 = max;
                                }
                            }
                        } else if (i15 == 2) {
                            if ((this.groupPosition.flags & 2) == 0) {
                                i5 -= AndroidUtilities.dp(2.0f);
                            }
                            dp2 = (this.groupPosition.flags & 8) == 0 ? i4 - AndroidUtilities.dp(2.0f) : i4;
                            if (this.groupPosition.leftSpanOffset != 0) {
                                int ceil = (int) Math.ceil((r5 * i3) / 1000.0f);
                                i5 -= ceil;
                                i6 += ceil;
                            }
                            this.imageView.setImageCoords(i6, (!this.isFirst || (i9 = this.currentType) == 1 || i9 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i5, dp2);
                            if (this.currentType != 0) {
                                this.currentFilter = null;
                            } else {
                                this.currentFilter = String.format(Locale.US, "%d_%d", Integer.valueOf(i5), Integer.valueOf(dp2));
                            }
                            this.currentThumbFilter = "80_80_b";
                            this.autoDownload = (DownloadController.getInstance(this.parent.getCurrentAccount()).getCurrentDownloadMask() & 1) == 0;
                            if (!this.calcHeight) {
                                if (this.currentPhoto instanceof WebInstantView.WebPhoto) {
                                    this.autoDownload = true;
                                    this.imageView.setStrippedLocation(null);
                                    WebInstantView.loadPhoto((WebInstantView.WebPhoto) this.currentPhoto, this.imageView, new Runnable() { // from class: org.telegram.ui.ArticleViewer$BlockPhotoCell$$ExternalSyntheticLambda0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ArticleViewer.BlockPhotoCell.this.lambda$onMeasure$0();
                                        }
                                    });
                                } else {
                                    File pathToAttach = FileLoader.getInstance(this.parent.getCurrentAccount()).getPathToAttach(this.currentPhotoObject, true);
                                    if (this.autoDownload || pathToAttach.exists()) {
                                        this.imageView.setStrippedLocation(null);
                                        ImageReceiver imageReceiver = this.imageView;
                                        ImageLocation forPhoto = ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto);
                                        String str = this.currentFilter;
                                        ImageLocation forPhoto2 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                        String str2 = this.currentThumbFilter;
                                        long j = this.currentPhotoObject.size;
                                        WebpageAdapter webpageAdapter2 = this.adapter;
                                        imageReceiver.setImage(forPhoto, str, forPhoto2, str2, j, null, webpageAdapter2 != null ? webpageAdapter2.currentPage : this.parentObject, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto));
                                        ImageReceiver imageReceiver2 = this.imageView;
                                        String str3 = this.currentFilter;
                                        ImageLocation forPhoto3 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                        String str4 = this.currentThumbFilter;
                                        long j2 = this.currentPhotoObject.size;
                                        WebpageAdapter webpageAdapter3 = this.adapter;
                                        imageReceiver2.setImage(null, str3, forPhoto3, str4, j2, null, webpageAdapter3 != null ? webpageAdapter3.currentPage : this.parentObject, 1);
                                    }
                                }
                            }
                            float f4 = dp3;
                            this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f4) / 2.0f));
                            int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f4) / 2.0f));
                            this.buttonY = imageY;
                            RadialProgress2 radialProgress2 = this.radialProgress;
                            int i16 = this.buttonX;
                            radialProgress2.setProgressRect(i16, imageY, i16 + dp3, dp3 + imageY);
                        }
                        dp2 = i4;
                        this.imageView.setImageCoords(i6, (!this.isFirst || (i9 = this.currentType) == 1 || i9 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i5, dp2);
                        if (this.currentType != 0) {
                        }
                        this.currentThumbFilter = "80_80_b";
                        this.autoDownload = (DownloadController.getInstance(this.parent.getCurrentAccount()).getCurrentDownloadMask() & 1) == 0;
                        if (!this.calcHeight) {
                        }
                        float f42 = dp3;
                        this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f42) / 2.0f));
                        int imageY2 = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f42) / 2.0f));
                        this.buttonY = imageY2;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        int i162 = this.buttonX;
                        radialProgress22.setProgressRect(i162, imageY2, i162 + dp3, dp3 + imageY2);
                    }
                    int i17 = i4;
                    int imageY3 = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                    this.textY = imageY3;
                    if (this.currentType == 0) {
                        IArticleViewer iArticleViewer = this.parent;
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.currentBlock;
                        DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockphoto2.caption.text, dp, imageY3, pageblockphoto2, this.adapter);
                        this.captionLayout = createLayoutForText;
                        if (createLayoutForText != null) {
                            int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp4;
                            i17 += dp4 + AndroidUtilities.dp(4.0f);
                        }
                        int i18 = i17;
                        IArticleViewer iArticleViewer2 = this.parent;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.currentBlock;
                        TL_iv.RichText richText = pageblockphoto3.caption.credit;
                        int i19 = this.textY + this.creditOffset;
                        WebpageAdapter webpageAdapter4 = this.adapter;
                        DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, null, richText, dp, i19, pageblockphoto3, (webpageAdapter4 == null || !webpageAdapter4.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), 0, this.adapter);
                        this.creditLayout = createLayoutForText2;
                        i17 = createLayoutForText2 != null ? i18 + AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight() : i18;
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        i17 += AndroidUtilities.dp(8.0f);
                    }
                    boolean z = (this.parentBlock instanceof TL_iv.pageBlockCover) && (webpageAdapter = this.adapter) != null && webpageAdapter.blocks != null && this.adapter.blocks.size() > 1 && (this.adapter.blocks.get(1) instanceof TL_iv.pageBlockChannel);
                    if (this.currentType != 2 && !z) {
                        i17 += AndroidUtilities.dp(8.0f);
                    }
                    i12 = i17;
                    DrawingText drawingText = this.captionLayout;
                    if (drawingText != null) {
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                    DrawingText drawingText2 = this.creditLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY + this.creditOffset;
                    }
                }
                this.channelCell.measure(i, i2);
                this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i3, i12);
            }
            i3 = size;
            pageblockphoto = this.currentBlock;
            if (pageblockphoto != null) {
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            setMeasuredDimension(i3, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMeasure$0() {
            requestLayout();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), ArticleViewer.photoBackgroundPaint);
            }
            this.imageView.draw(canvas);
            if (this.imageView.getVisible()) {
                this.radialProgress.draw(canvas);
            }
            if (!TextUtils.isEmpty(this.currentBlock.url) && !(this.currentPhoto instanceof WebInstantView.WebPhoto)) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
                int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.dp(11.0f));
                this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
                this.linkDrawable.draw(canvas);
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            return i == 1 ? 3 : 4;
        }

        private void didPressedButton(boolean z) {
            if (this.currentPhotoObject == null) {
                return;
            }
            int i = this.buttonState;
            if (i == 0) {
                this.radialProgress.setProgress(0.0f, z);
                this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.currentPage, 1);
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i == 1) {
                this.imageView.cancelLoadImage();
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            }
        }

        public void updateButtonState(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentPhotoObject);
            File pathToAttach = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentPhotoObject, true);
            File pathToAttach2 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentPhotoObject, false);
            boolean z2 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z2) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f = 0.0f;
                if (this.autoDownload || FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f = fileProgress.floatValue();
                    }
                } else {
                    this.buttonState = 0;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                this.radialProgress.setProgress(f, false);
            }
            invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageView.onDetachedFromWindow();
            DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.TAG;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public static class BlockMapCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private DrawingText captionLayout;
        private Drawable chat_redLocationIcon;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockMap currentBlock;
        private int currentMapProvider;
        private int currentType;
        private ImageReceiver imageView;
        private boolean isFirst;
        private final IArticleViewer parent;
        private boolean photoPressed;
        private int textX;
        private int textY;

        public BlockMapCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.currentType = i;
        }

        public void setBlock(TL_iv.pageBlockMap pageblockmap, boolean z, boolean z2) {
            this.currentBlock = pageblockmap;
            this.isFirst = z;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                this.photoPressed = true;
            } else if (motionEvent.getAction() == 1 && this.photoPressed) {
                this.photoPressed = false;
                try {
                    TLRPC.GeoPoint geoPoint = this.currentBlock.geo;
                    double d = geoPoint.lat;
                    double d2 = geoPoint._long;
                    getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
        @Override // android.widget.FrameLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int size = View.MeasureSpec.getSize(i);
            int i9 = this.currentType;
            int i10 = 0;
            int i11 = 1;
            if (i9 == 1) {
                i3 = ((View) getParent()).getMeasuredWidth();
                size = ((View) getParent()).getMeasuredHeight();
            } else {
                i3 = size;
                if (i9 != 2) {
                    size = 0;
                }
            }
            TL_iv.pageBlockMap pageblockmap = this.currentBlock;
            if (pageblockmap != null) {
                if (this.currentType == 0 && (i8 = pageblockmap.level) > 0) {
                    i10 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i8 * 14);
                    this.textX = i10;
                    i4 = i3 - (AndroidUtilities.dp(18.0f) + i10);
                    dp = i4;
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                    dp = i3 - AndroidUtilities.dp(36.0f);
                    i4 = i3;
                }
                if (this.currentType == 0) {
                    TL_iv.pageBlockMap pageblockmap2 = this.currentBlock;
                    size = (int) ((i4 / pageblockmap2.w) * pageblockmap2.h);
                    Point point = AndroidUtilities.displaySize;
                    int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                    if (size > max) {
                        TL_iv.pageBlockMap pageblockmap3 = this.currentBlock;
                        i4 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                        i10 += ((i3 - i10) - i4) / 2;
                        i5 = max;
                        ImageReceiver imageReceiver = this.imageView;
                        float f = i10;
                        float dp2 = (!this.isFirst || (i7 = this.currentType) == 1 || i7 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
                        float f2 = i4;
                        float f3 = i5;
                        imageReceiver.setImageCoords(f, dp2, f2, f3);
                        int currentAccount = this.parent.getCurrentAccount();
                        TLRPC.GeoPoint geoPoint = this.currentBlock.geo;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        float f4 = AndroidUtilities.density;
                        String formapMapUrl = AndroidUtilities.formapMapUrl(currentAccount, d, d2, (int) (f2 / f4), (int) (f3 / f4), true, 15, -1);
                        TLRPC.GeoPoint geoPoint2 = this.currentBlock.geo;
                        float f5 = AndroidUtilities.density;
                        WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f2 / f5), (int) (f3 / f5), 15, Math.min(2, (int) Math.ceil(f5)));
                        i6 = MessagesController.getInstance(currentAccount).mapProvider;
                        this.currentMapProvider = i6;
                        if (i6 != 2) {
                            if (createWithGeoPoint != null) {
                                ImageReceiver imageReceiver2 = this.imageView;
                                ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                                WebpageAdapter webpageAdapter = this.adapter;
                                imageReceiver2.setImage(forWebFile, null, null, null, webpageAdapter != null ? webpageAdapter.currentPage : null, 0);
                            }
                        } else if (formapMapUrl != null) {
                            this.imageView.setImage(formapMapUrl, null, null, null, 0L);
                        }
                        int imageY = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                        this.textY = imageY;
                        if (this.currentType == 0) {
                            IArticleViewer iArticleViewer = this.parent;
                            TL_iv.pageBlockMap pageblockmap4 = this.currentBlock;
                            DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockmap4.caption.text, dp, imageY, pageblockmap4, this.adapter);
                            this.captionLayout = createLayoutForText;
                            if (createLayoutForText != null) {
                                int dp3 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                                this.creditOffset = dp3;
                                i5 += dp3 + AndroidUtilities.dp(4.0f);
                                DrawingText drawingText = this.captionLayout;
                                drawingText.x = this.textX;
                                drawingText.y = this.textY;
                            }
                            IArticleViewer iArticleViewer2 = this.parent;
                            TL_iv.pageBlockMap pageblockmap5 = this.currentBlock;
                            TL_iv.RichText richText = pageblockmap5.caption.credit;
                            int i12 = this.textY + this.creditOffset;
                            WebpageAdapter webpageAdapter2 = this.adapter;
                            DrawingText createLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, dp, i12, pageblockmap5, (webpageAdapter2 == null || !webpageAdapter2.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                            this.creditLayout = createLayoutForText2;
                            if (createLayoutForText2 != null) {
                                i5 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                                DrawingText drawingText2 = this.creditLayout;
                                drawingText2.x = this.textX;
                                drawingText2.y = this.textY + this.creditOffset;
                            }
                        }
                        if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                            i5 += AndroidUtilities.dp(8.0f);
                        }
                        i11 = i5;
                        if (this.currentType != 2) {
                            i11 += AndroidUtilities.dp(8.0f);
                        }
                    }
                }
                i5 = size;
                ImageReceiver imageReceiver3 = this.imageView;
                float f6 = i10;
                if (this.isFirst) {
                }
                float f22 = i4;
                float f32 = i5;
                imageReceiver3.setImageCoords(f6, dp2, f22, f32);
                int currentAccount2 = this.parent.getCurrentAccount();
                TLRPC.GeoPoint geoPoint3 = this.currentBlock.geo;
                double d3 = geoPoint3.lat;
                double d22 = geoPoint3._long;
                float f42 = AndroidUtilities.density;
                String formapMapUrl2 = AndroidUtilities.formapMapUrl(currentAccount2, d3, d22, (int) (f22 / f42), (int) (f32 / f42), true, 15, -1);
                TLRPC.GeoPoint geoPoint22 = this.currentBlock.geo;
                float f52 = AndroidUtilities.density;
                WebFile createWithGeoPoint2 = WebFile.createWithGeoPoint(geoPoint22, (int) (f22 / f52), (int) (f32 / f52), 15, Math.min(2, (int) Math.ceil(f52)));
                i6 = MessagesController.getInstance(currentAccount2).mapProvider;
                this.currentMapProvider = i6;
                if (i6 != 2) {
                }
                int imageY2 = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                this.textY = imageY2;
                if (this.currentType == 0) {
                }
                if (!this.isFirst) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                i11 = i5;
                if (this.currentType != 2) {
                }
            }
            setMeasuredDimension(i3, i11);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            Theme.chat_docBackPaint.setColor(this.parent.getThemedColor(Theme.key_chat_inLocationBackground));
            canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
            int i = 0;
            int centerX = (int) (this.imageView.getCenterX() - (Theme.chat_locationDrawable[0].getIntrinsicWidth() / 2));
            int centerY = (int) (this.imageView.getCenterY() - (Theme.chat_locationDrawable[0].getIntrinsicHeight() / 2));
            Drawable drawable = Theme.chat_locationDrawable[0];
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, Theme.chat_locationDrawable[0].getIntrinsicHeight() + centerY);
            Theme.chat_locationDrawable[0].draw(canvas);
            this.imageView.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                if (this.chat_redLocationIcon == null) {
                    this.chat_redLocationIcon = ContextCompat.getDrawable(getContext(), R.drawable.map_pin).mutate();
                }
                int intrinsicWidth = (int) (this.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight));
                this.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                this.chat_redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                this.chat_redLocationIcon.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.Map));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockChannelCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private Paint backgroundPaint;
        private int buttonWidth;
        private AnimatorSet currentAnimation;
        private TL_iv.pageBlockChannel currentBlock;
        private int currentState;
        private int currentType;
        private ImageView imageView;
        private final IArticleViewer parent;
        private ContextProgressView progressView;
        private DrawingText textLayout;
        private TextView textView;
        private int textX;
        private int textX2;
        private int textY;

        public BlockChannelCell(Context context, final IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(11.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.backgroundPaint = new Paint();
            this.currentType = i;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setText(LocaleController.getString(R.string.ChannelJoin));
            this.textView.setGravity(19);
            addView(this.textView, LayoutHelper.createFrame(-2, 39, 53));
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$BlockChannelCell$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArticleViewer.BlockChannelCell.this.lambda$new$0(iArticleViewer, view);
                }
            });
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.list_check);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(39, 39, 53));
            ContextProgressView contextProgressView = new ContextProgressView(context, 0);
            this.progressView = contextProgressView;
            addView(contextProgressView, LayoutHelper.createFrame(39, 39, 53));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(IArticleViewer iArticleViewer, View view) {
            if (this.currentState != 0) {
                return;
            }
            setState(1, true);
            ArticleViewer.joinChannel(iArticleViewer.getCurrentAccount(), this, iArticleViewer.loadedChannel);
        }

        public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
            this.currentBlock = pageblockchannel;
            if (this.currentType == 0) {
                int themedColor = this.parent.getThemedColor(Theme.key_switchTrack);
                int red = Color.red(themedColor);
                int green = Color.green(themedColor);
                int blue = Color.blue(themedColor);
                this.textView.setTextColor(this.parent.getLinkTextColor());
                this.backgroundPaint.setColor(Color.argb(34, red, green, blue));
                this.imageView.setColorFilter(new PorterDuffColorFilter(this.parent.getGrayTextColor(), PorterDuff.Mode.MULTIPLY));
            } else {
                this.textView.setTextColor(-1);
                this.backgroundPaint.setColor(2130706432);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.parent.getCurrentAccount()).getChat(Long.valueOf(pageblockchannel.channel.id));
            if (chat == null || chat.min) {
                ArticleViewer.loadChannel(this.parent, this, this.adapter, pageblockchannel.channel);
                setState(1, false);
            } else {
                this.parent.loadedChannel = chat;
                if (chat.left && !chat.kicked) {
                    setState(0, false);
                } else {
                    setState(4, false);
                }
            }
            requestLayout();
        }

        public void setState(int i, boolean z) {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.currentState = i;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                TextView textView = this.textView;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, i == 0 ? 1.0f : 0.0f);
                TextView textView2 = this.textView;
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, i == 0 ? 1.0f : 0.1f);
                TextView textView3 = this.textView;
                Property property3 = View.SCALE_Y;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, i == 0 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
                this.currentAnimation.setDuration(150L);
                this.currentAnimation.start();
                return;
            }
            this.textView.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.textView.setScaleX(i == 0 ? 1.0f : 0.1f);
            this.textView.setScaleY(i == 0 ? 1.0f : 0.1f);
            this.progressView.setAlpha(i == 1 ? 1.0f : 0.0f);
            this.progressView.setScaleX(i == 1 ? 1.0f : 0.1f);
            this.progressView.setScaleY(i == 1 ? 1.0f : 0.1f);
            this.imageView.setAlpha(i == 2 ? 1.0f : 0.0f);
            this.imageView.setScaleX(i == 2 ? 1.0f : 0.1f);
            this.imageView.setScaleY(i == 2 ? 1.0f : 0.1f);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.currentType != 0) {
                return super.onTouchEvent(motionEvent);
            }
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
            this.buttonWidth = this.textView.getMeasuredWidth();
            this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
            TL_iv.pageBlockChannel pageblockchannel = this.currentBlock;
            if (pageblockchannel != null) {
                this.textLayout = ArticleViewer.createLayoutForText(this.parent, this, pageblockchannel.channel.title, null, (size - AndroidUtilities.dp(52.0f)) - this.buttonWidth, this.textY, this.currentBlock, StaticLayoutEx.ALIGN_LEFT(), 1, this.adapter);
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    this.textX2 = this.textX;
                } else {
                    this.textX2 = (getMeasuredWidth() - this.textX) - this.buttonWidth;
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.imageView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(39.0f));
            this.progressView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(39.0f));
            TextView textView = this.textView;
            int i5 = this.textX2;
            textView.layout(i5, 0, textView.getMeasuredWidth() + i5, this.textView.getMeasuredHeight());
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.backgroundPaint);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null || drawingText.getLineCount() <= 0) {
                return;
            }
            canvas.save();
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                canvas.translate((getMeasuredWidth() - this.textLayout.getLineWidth(0)) - this.textX, this.textY);
            } else {
                canvas.translate(this.textX, this.textY);
            }
            if (this.currentType == 0) {
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
            }
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrChannel));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockAuthorDate currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockAuthorDateCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
            this.currentBlock = pageblockauthordate;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11, types: [android.text.Spannable] */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r5v5, types: [android.text.Spannable$Factory] */
        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            Spannable spannable;
            MetricAffectingSpan[] metricAffectingSpanArr;
            CharSequence charSequence;
            int indexOf;
            int i3 = 0;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockAuthorDate pageblockauthordate = this.currentBlock;
            if (pageblockauthordate != null) {
                IArticleViewer iArticleViewer = this.parent;
                WebpageAdapter webpageAdapter = this.adapter;
                TL_iv.RichText richText = pageblockauthordate.author;
                CharSequence text = ArticleViewer.getText(iArticleViewer, webpageAdapter, this, richText, richText, pageblockauthordate, size);
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, text.length(), MetricAffectingSpan.class);
                } else {
                    spannable = null;
                    metricAffectingSpanArr = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    charSequence = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000), text);
                } else if (!TextUtils.isEmpty(text)) {
                    charSequence = LocaleController.formatString(R.string.ArticleByAuthor, text);
                } else {
                    charSequence = LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) charSequence, text)) != -1) {
                            charSequence = Spannable.Factory.getInstance().newSpannable(charSequence);
                            for (int i4 = 0; i4 < metricAffectingSpanArr.length; i4++) {
                                MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i4];
                                charSequence.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i4]) + indexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, charSequence, (TL_iv.RichText) null, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                        this.textX = (int) Math.floor(((size - this.textLayout.getLineLeft(0)) - this.textLayout.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    i3 = dp;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockTitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockTitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
            this.currentBlock = pageblocktitle;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockTitle pageblocktitle = this.currentBlock;
            if (pageblocktitle != null) {
                if (pageblocktitle.first) {
                    i3 = AndroidUtilities.dp(this.parent.pady());
                    this.textY = AndroidUtilities.dp(this.parent.pady() * 2);
                } else {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    i3 = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int dp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.pageBlockTitle pageblocktitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp, i4, pageblocktitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVTitle));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockKicker currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockKickerCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
            this.currentBlock = pageblockkicker;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockKicker pageblockkicker = this.currentBlock;
            if (pageblockkicker != null) {
                if (pageblockkicker.first) {
                    this.textY = AndroidUtilities.dp(16.0f);
                    i3 = AndroidUtilities.dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                    i3 = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int dp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.pageBlockKicker pageblockkicker2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, richText, dp, i4, pageblockkicker2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), 0, this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVKicker));
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockFooter currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockFooterCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
            this.currentBlock = pageblockfooter;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockFooter pageblockfooter = this.currentBlock;
            if (pageblockfooter != null) {
                i3 = 0;
                if (pageblockfooter.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14));
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int dp2 = (size - AndroidUtilities.dp(iArticleViewer.padx() * 2)) - this.textX;
                int i4 = this.textY;
                TL_iv.pageBlockFooter pageblockfooter2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp2, i4, pageblockfooter2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(this.parent.pady());
                    } else {
                        dp = AndroidUtilities.dp(this.parent.pady() * 2);
                    }
                    i3 = height + dp;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVFooter));
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockPreformattedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockPreformatted currentBlock;
        private final IArticleViewer parent;
        private HorizontalScrollView scrollView;
        private CharSequence text;
        private View textContainer;
        private DrawingText textLayout;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockPreformattedCell(Context context, final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) { // from class: org.telegram.ui.ArticleViewer.BlockPreformattedCell.1
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override // android.view.View
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    if (iArticleViewer2.pressedLinkOwnerLayout != null) {
                        iArticleViewer2.pressedLinkOwnerLayout = null;
                        iArticleViewer2.pressedLinkOwnerView = null;
                    }
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            this.textContainer = new View(context) { // from class: org.telegram.ui.ArticleViewer.BlockPreformattedCell.2
                @Override // android.view.View
                protected void onMeasure(int i, int i2) {
                    int i3;
                    int i4 = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        if (BlockPreformattedCell.this.text == null) {
                            BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                            blockPreformattedCell.text = ArticleViewer.getText(iArticleViewer, webpageAdapter, this, blockPreformattedCell.currentBlock.text, BlockPreformattedCell.this.currentBlock.text, BlockPreformattedCell.this.currentBlock, AndroidUtilities.dp(5000.0f));
                            if (!TextUtils.isEmpty(BlockPreformattedCell.this.currentBlock.language)) {
                                BlockPreformattedCell blockPreformattedCell2 = BlockPreformattedCell.this;
                                blockPreformattedCell2.text = CodeHighlighting.getHighlighted(blockPreformattedCell2.text, BlockPreformattedCell.this.currentBlock.language);
                            }
                        }
                        BlockPreformattedCell blockPreformattedCell3 = BlockPreformattedCell.this;
                        blockPreformattedCell3.textLayout = ArticleViewer.createLayoutForText(iArticleViewer, this, blockPreformattedCell3.text, (TL_iv.RichText) null, AndroidUtilities.dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, webpageAdapter);
                        if (BlockPreformattedCell.this.textLayout != null) {
                            i3 = BlockPreformattedCell.this.textLayout.getHeight();
                            int lineCount = BlockPreformattedCell.this.textLayout.getLineCount();
                            for (int i5 = 0; i5 < lineCount; i5++) {
                                i4 = Math.max((int) Math.ceil(BlockPreformattedCell.this.textLayout.getLineWidth(i5)), i4);
                            }
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 1;
                    }
                    setMeasuredDimension(i4 + AndroidUtilities.dp(32.0f), i3);
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    WebpageAdapter webpageAdapter2 = webpageAdapter;
                    BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                    return ArticleViewer.checkLayoutForLinks(iArticleViewer2, webpageAdapter2, motionEvent, blockPreformattedCell, blockPreformattedCell.textLayout, 0, 0) || super.onTouchEvent(motionEvent);
                }

                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    if (BlockPreformattedCell.this.textLayout != null) {
                        canvas.save();
                        ArticleViewer.drawTextSelection(iArticleViewer, canvas, BlockPreformattedCell.this);
                        BlockPreformattedCell.this.textLayout.draw(canvas, this);
                        canvas.restore();
                        BlockPreformattedCell.this.textLayout.x = (int) getX();
                        BlockPreformattedCell.this.textLayout.y = (int) getY();
                    }
                }
            };
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            int dp = AndroidUtilities.dp(16.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            int dp2 = AndroidUtilities.dp(12.0f);
            layoutParams.bottomMargin = dp2;
            layoutParams.topMargin = dp2;
            NotificationCenter.listenEmojiLoading(this.textContainer);
            this.scrollView.addView(this.textContainer, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.ArticleViewer$BlockPreformattedCell$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        ArticleViewer.BlockPreformattedCell.lambda$new$0(IArticleViewer.this, view, i, i2, i3, i4);
                    }
                });
            }
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$new$0(IArticleViewer iArticleViewer, View view, int i, int i2, int i3, int i4) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(null);
            if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
                return;
            }
            textSelectionHelper.invalidate();
        }

        public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
            this.text = null;
            this.currentBlock = pageblockpreformatted;
            this.scrollView.setScrollX(0);
            this.textContainer.requestLayout();
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            if (this.textLayout == null) {
                return -1;
            }
            return (AndroidUtilities.dp(16.0f) + this.textLayout.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(16.0f) + this.textLayout.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(16.0f) + this.textLayout.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, this.scrollView.getMeasuredHeight());
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), ArticleViewer.preformattedBackgroundPaint);
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVCode));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
        public void invalidate() {
            this.textContainer.invalidate();
            super.invalidate();
        }
    }

    public static class BlockSubheaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubheader currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public /* bridge */ /* synthetic */ int getMinWidth() {
            return IBlock.-CC.$default$getMinWidth(this);
        }

        public BlockSubheaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
            this.currentBlock = pageblocksubheader;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockSubheader pageblocksubheader = this.currentBlock;
            if (pageblocksubheader != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblocksubheader.text;
                int dp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.pageBlockSubheader pageblocksubheader2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText createLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, dp, i4, pageblocksubheader2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = this.textY + createLayoutForText.getHeight();
                    int i5 = this.textY;
                    i3 = height + i5;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = i5;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockMathCell extends HorizontalScrollView implements Theme.Colorable, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockMath currentBlock;
        private ImageView imageView;
        private FrameLayout layout;
        private final IArticleViewer parent;
        private int width;

        public BlockMathCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            FrameLayout frameLayout = new FrameLayout(context);
            this.layout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.layout.addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f));
            updateColors();
        }

        public void setBlock(TL_iv.pageBlockMath pageblockmath) {
            this.currentBlock = pageblockmath;
            this.imageView.setImageBitmap(null);
            this.imageView.setPadding(AndroidUtilities.dp(this.parent.padx()), 0, AndroidUtilities.dp(this.parent.padx()), 0);
            this.imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            this.width = AndroidUtilities.dp(this.parent.padx() * 2);
            if (pageblockmath != null) {
                try {
                    JLatexMathDrawable build = JLatexMathDrawable.builder(pageblockmath.source).textSize(AndroidUtilities.dp(20.0f)).build();
                    int intrinsicWidth = build.getIntrinsicWidth();
                    int intrinsicHeight = build.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    this.imageView.setImageBitmap(createBitmap);
                    ImageView imageView = this.imageView;
                    int dp = intrinsicWidth + AndroidUtilities.dp(this.parent.padx() * 2);
                    this.width = dp;
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(dp, intrinsicHeight));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        @Override // org.telegram.ui.ActionBar.Theme.Colorable
        public void updateColors() {
            this.imageView.setColorFilter(new PorterDuffColorFilter(this.parent.getTextColor(), PorterDuff.Mode.SRC_IN));
        }

        @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
        }

        @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i3 - i;
            int i6 = this.width;
            if (i6 > i5) {
                super.onLayout(z, i, i2, i3, i4);
            } else {
                FrameLayout frameLayout = this.layout;
                frameLayout.layout((i5 - i6) / 2, 0, (i5 + i6) / 2, frameLayout.getMeasuredHeight());
            }
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundLeft() {
            if (this.width > getMeasuredWidth()) {
                return 0;
            }
            return (getMeasuredWidth() - this.width) / 2;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getBoundRight() {
            return this.width > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.width) / 2;
        }

        @Override // org.telegram.ui.ArticleViewer.IBlock
        public int getLastLineBoundRight() {
            return getBoundRight();
        }

        public int getMinWidth() {
            return this.width;
        }
    }

    private class ReportCell extends FrameLayout {
        private boolean hasViews;
        private TextView textView;
        private TextView viewsTextView;
        public final boolean web;

        public ReportCell(Context context, boolean z) {
            super(context);
            this.web = z;
            setTag(90);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(LocaleController.getString(z ? R.string.PreviewFeedbackAuto : R.string.PreviewFeedback2));
            this.textView.setTextSize(1, 12.0f);
            this.textView.setGravity(17);
            this.textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            addView(this.textView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.viewsTextView = textView2;
            textView2.setTextSize(1, 12.0f);
            this.viewsTextView.setGravity(19);
            this.viewsTextView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            addView(this.viewsTextView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
        }

        public void setViews(int i) {
            if (i == 0) {
                this.hasViews = false;
                this.viewsTextView.setVisibility(8);
                this.textView.setGravity(17);
            } else {
                this.hasViews = true;
                this.viewsTextView.setVisibility(0);
                this.textView.setGravity(21);
                this.viewsTextView.setText(LocaleController.formatPluralStringComma("Views", i));
            }
            int themedColor = ArticleViewer.this.getThemedColor(Theme.key_switchTrack);
            this.textView.setTextColor(ArticleViewer.this.getGrayTextColor());
            this.viewsTextView.setTextColor(ArticleViewer.this.getGrayTextColor());
            this.textView.setBackgroundColor(Color.argb(34, Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor)));
        }
    }

    @Override // org.telegram.ui.IArticleViewer
    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper(View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        return (view == null || view.getTag() == null || view.getTag() != "bottomSheet" || (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) == null) ? this.textSelectionHelper : articleTextSelectionHelper;
    }

    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(iArticleViewer, canvas, articleSelectableView, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        drawTextSelection(this, canvas, articleSelectableView, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper((View) articleSelectableView);
        if (textSelectionHelper != null) {
            textSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    @Override // org.telegram.ui.IArticleViewer
    public boolean openPhoto(TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        ArrayList arrayList;
        int indexOf;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || WebPageUtils.isVideo(webpageAdapter.currentPage, pageBlock)) {
                arrayList = new ArrayList(webpageAdapter.photoBlocks);
                indexOf = webpageAdapter.photoBlocks.indexOf(pageBlock);
            } else {
                arrayList = Collections.singletonList(pageBlock);
                indexOf = 0;
            }
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            photoViewer.setParentActivity(this.parentFragment);
            if (photoViewer.openPhoto(indexOf, new RealPageBlocksAdapter(webpageAdapter.currentPage, arrayList), new PageBlocksPhotoViewerProvider(arrayList))) {
                checkVideoPlayer();
                return true;
            }
        }
        return false;
    }

    private class RealPageBlocksAdapter implements PhotoViewer.PageBlocksAdapter {
        private final TLRPC.WebPage page;
        private final List pageBlocks;

        private RealPageBlocksAdapter(TLRPC.WebPage webPage, List list) {
            this.page = webPage;
            this.pageBlocks = list;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public int getItemsCount() {
            return this.pageBlocks.size();
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public TL_iv.PageBlock get(int i) {
            return (TL_iv.PageBlock) this.pageBlocks.get(i);
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public List getAll() {
            return this.pageBlocks;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public boolean isVideo(int i) {
            return i < this.pageBlocks.size() && i >= 0 && WebPageUtils.isVideo(this.page, get(i));
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public boolean isHardwarePlayer(int i) {
            return i < this.pageBlocks.size() && i >= 0 && !WebPageUtils.isVideo(this.page, get(i)) && ArticleViewer.this.pages[0].adapter.getTypeForBlock(get(i)) == 5;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public TLObject getMedia(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMedia(this.page, get(i));
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public File getFile(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMediaFile(this.page, get(i));
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public String getFileName(int i) {
            TLObject media = getMedia(i);
            if (media instanceof TLRPC.Photo) {
                media = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) media).sizes, AndroidUtilities.getPhotoSize());
            }
            return FileLoader.getAttachFileName(media);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CharSequence getCaption(int i) {
            SpannableStringBuilder spannableStringBuilder;
            TL_iv.PageBlock pageBlock = get(i);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
                if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new URLSpan(str) { // from class: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            ArticleViewer articleViewer = ArticleViewer.this;
                            String url = getURL();
                            ArticleViewer articleViewer2 = ArticleViewer.this;
                            articleViewer.openWebpageUrl(url, null, articleViewer2.makeProgress(articleViewer2.pressedLink, articleViewer2.pressedLinkOwnerLayout));
                        }
                    }, 0, str.length(), 34);
                    if (spannableStringBuilder == null) {
                        return spannableStringBuilder;
                    }
                    TL_iv.RichText blockCaption = ArticleViewer.this.getBlockCaption(pageBlock, 2);
                    CharSequence text = ArticleViewer.this.getText(this.page, (View) null, blockCaption, blockCaption, pageBlock, -AndroidUtilities.dp(100.0f));
                    if (!(text instanceof Spannable)) {
                        return text;
                    }
                    Spannable spannable = (Spannable) text;
                    TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(0, text.length(), TextPaintUrlSpan.class);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text.toString());
                    if (textPaintUrlSpanArr != null && textPaintUrlSpanArr.length > 0) {
                        for (int i2 = 0; i2 < textPaintUrlSpanArr.length; i2++) {
                            spannableStringBuilder2.setSpan(new URLSpan(textPaintUrlSpanArr[i2].getUrl()) { // from class: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.2
                                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                                public void onClick(View view) {
                                    ArticleViewer.this.openWebpageUrl(getURL(), null, null);
                                }
                            }, spannable.getSpanStart(textPaintUrlSpanArr[i2]), spannable.getSpanEnd(textPaintUrlSpanArr[i2]), 33);
                        }
                    }
                    return spannableStringBuilder2;
                }
            }
            spannableStringBuilder = null;
            if (spannableStringBuilder == null) {
            }
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public TLRPC.PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize2 != null) {
                    int i = closestPhotoSizeWithSize2.size;
                    iArr[0] = i;
                    if (i == 0) {
                        iArr[0] = -1;
                    }
                    return closestPhotoSizeWithSize2;
                }
                iArr[0] = -1;
                return null;
            }
            if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
                return null;
            }
            int i2 = closestPhotoSizeWithSize.size;
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public void updateSlideshowCell(TL_iv.PageBlock pageBlock) {
            int childCount = ArticleViewer.this.pages[0].listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ArticleViewer.this.pages[0].listView.getChildAt(i);
                if (childAt instanceof BlockSlideshowCell) {
                    BlockSlideshowCell blockSlideshowCell = (BlockSlideshowCell) childAt;
                    int indexOf = blockSlideshowCell.currentBlock.items.indexOf(pageBlock);
                    if (indexOf != -1) {
                        blockSlideshowCell.innerListView.setCurrentItem(indexOf, false);
                        return;
                    }
                }
            }
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public Object getParentObject() {
            return this.page;
        }
    }

    private class PageBlocksPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private final List pageBlocks;
        private final int[] tempArr = new int[2];

        public PageBlocksPhotoViewerProvider(List list) {
            this.pageBlocks = list;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            ImageReceiver imageReceiverFromListView;
            if (i < 0 || i >= this.pageBlocks.size() || (imageReceiverFromListView = getImageReceiverFromListView(ArticleViewer.this.pages[0].listView, (TL_iv.PageBlock) this.pageBlocks.get(i), this.tempArr)) == null) {
                return null;
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            int[] iArr = this.tempArr;
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ArticleViewer.this.pages[0].listView;
            placeProviderObject.imageReceiver = imageReceiverFromListView;
            placeProviderObject.thumb = imageReceiverFromListView.getBitmapSafe();
            placeProviderObject.radius = imageReceiverFromListView.getRoundRadius(true);
            placeProviderObject.clipTopAddition = ArticleViewer.this.currentHeaderHeight;
            return placeProviderObject;
        }

        private ImageReceiver getImageReceiverFromListView(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ImageReceiver imageReceiverView = getImageReceiverView(viewGroup.getChildAt(i), pageBlock, iArr);
                if (imageReceiverView != null) {
                    return imageReceiverView;
                }
            }
            return null;
        }

        private ImageReceiver getImageReceiverView(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
            ImageReceiver imageReceiverView;
            ImageReceiver imageReceiverView2;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (view instanceof BlockPhotoCell) {
                BlockPhotoCell blockPhotoCell = (BlockPhotoCell) view;
                if (blockPhotoCell.currentBlock != pageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                return blockPhotoCell.imageView;
            }
            if (view instanceof BlockVideoCell) {
                BlockVideoCell blockVideoCell = (BlockVideoCell) view;
                if (blockVideoCell.currentBlock != pageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                ArticleViewer articleViewer = ArticleViewer.this;
                if (blockVideoCell == articleViewer.currentPlayer && (videoPlayerHolderBase = articleViewer.videoPlayer) != null && videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        blockVideoCell.imageView.setImageBitmap(blockVideoCell.textureView.getBitmap());
                    } else {
                        Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        blockVideoCell.imageView.setImageBitmap(createBitmap);
                    }
                    blockVideoCell.firstFrameRendered = false;
                    blockVideoCell.textureView.setAlpha(0.0f);
                }
                return blockVideoCell.imageView;
            }
            if (view instanceof BlockCollageCell) {
                ImageReceiver imageReceiverFromListView = getImageReceiverFromListView(((BlockCollageCell) view).innerListView, pageBlock, iArr);
                if (imageReceiverFromListView != null) {
                    return imageReceiverFromListView;
                }
                return null;
            }
            if (view instanceof BlockSlideshowCell) {
                ImageReceiver imageReceiverFromListView2 = getImageReceiverFromListView(((BlockSlideshowCell) view).innerListView, pageBlock, iArr);
                if (imageReceiverFromListView2 != null) {
                    return imageReceiverFromListView2;
                }
                return null;
            }
            if (view instanceof BlockListItemCell) {
                BlockListItemCell blockListItemCell = (BlockListItemCell) view;
                if (blockListItemCell.blockLayout == null || (imageReceiverView2 = getImageReceiverView(blockListItemCell.blockLayout.itemView, pageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView2;
            }
            if (!(view instanceof BlockOrderedListItemCell)) {
                return null;
            }
            BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
            if (blockOrderedListItemCell.blockLayout == null || (imageReceiverView = getImageReceiverView(blockOrderedListItemCell.blockLayout.itemView, pageBlock, iArr)) == null) {
                return null;
            }
            return imageReceiverView;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void onClose() {
            super.onClose();
            ArticleViewer.this.checkVideoPlayer();
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void onReleasePlayerBeforeClose(int i) {
            TL_iv.PageBlock pageBlock = (i < 0 || i >= this.pageBlocks.size()) ? null : (TL_iv.PageBlock) this.pageBlocks.get(i);
            VideoPlayer videoPlayer = PhotoViewer.getInstance().getVideoPlayer();
            TextureView videoTextureView = PhotoViewer.getInstance().getVideoTextureView();
            SurfaceView videoSurfaceView = PhotoViewer.getInstance().getVideoSurfaceView();
            BlockVideoCell viewFromListView = getViewFromListView(ArticleViewer.this.pages[0].listView, pageBlock);
            if (viewFromListView != null && videoPlayer != null && videoTextureView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.currentBlock.video_id, viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoTextureView)));
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            if (viewFromListView != null && videoPlayer != null && videoSurfaceView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.currentBlock.video_id, viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoSurfaceView)));
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            ArticleViewer.this.checkVideoPlayer();
        }

        private BlockVideoCell getViewFromListView(ViewGroup viewGroup, TL_iv.PageBlock pageBlock) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof BlockVideoCell) {
                    BlockVideoCell blockVideoCell = (BlockVideoCell) childAt;
                    if (blockVideoCell.currentBlock == pageBlock) {
                        return blockVideoCell;
                    }
                }
            }
            return null;
        }
    }

    @Override // org.telegram.ui.IArticleViewer
    public int getThemedColor(int i) {
        return Theme.getColor(i, getResourcesProvider());
    }

    public boolean isFirstArticle() {
        return this.pagesStack.size() > 0 && (this.pagesStack.get(0) instanceof TLRPC.WebPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$67() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda6(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$68() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda6(this));
    }

    public void updatePages() {
        PageLayout[] pageLayoutArr;
        PageLayout pageLayout;
        if (this.actionBar == null || (pageLayout = (pageLayoutArr = this.pages)[0]) == null || pageLayoutArr[1] == null) {
            return;
        }
        float translationX = pageLayout.getVisibility() != 0 ? 0.0f : 1.0f - (this.pages[0].getTranslationX() / this.pages[0].getWidth());
        float f = 1.0f - translationX;
        this.actionBar.setProgress(0, this.pages[0].getProgress());
        this.actionBar.setProgress(1, this.pages[1].getProgress());
        this.actionBar.setTransitionProgress(f);
        if (!this.actionBar.isAddressing() && !this.actionBar.isSearching() && (this.windowView.movingPage || this.windowView.openingPage)) {
            if (isFirstArticle() || this.pagesStack.size() > 1) {
                float lerp = AndroidUtilities.lerp((this.pages[0].hasBackButton() || this.pagesStack.size() > 1) ? 1.0f : 0.0f, (this.pages[1].hasBackButton() || this.pagesStack.size() > 2) ? 1.0f : 0.0f, f);
                this.actionBar.backButtonDrawable.setRotation(1.0f - lerp, false);
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(lerp > 0.5f);
            } else {
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(false);
            }
            this.actionBar.setHasForward(this.pages[0].hasForwardButton());
            this.actionBar.setIsLocal(this.pages[0].isLocal());
            this.actionBar.setIsLoaded(this.pages[0].getWebView() != null && this.pages[0].getWebView().isPageLoaded());
        }
        this.actionBar.setBackgroundColor(0, this.page0Background.set(this.pages[0].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setBackgroundColor(1, this.page1Background.set(this.pages[1].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setColors(ColorUtils.blendARGB(this.pages[0].getActionBarColor(), this.pages[1].getActionBarColor(), f), false);
        this.actionBar.setMenuType((translationX > 0.5f ? this.pages[0] : this.pages[1]).type);
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.windowView.invalidate();
            return;
        }
        WindowView windowView = this.windowView;
        if (windowView != null) {
            windowView.invalidate();
        }
    }

    public void updateTitle(boolean z) {
        this.actionBar.setTitle(0, this.pages[0].getTitle(), z);
        this.actionBar.setSubtitle(0, this.pages[0].getSubtitle(), false);
        this.actionBar.setIsDangerous(0, this.pages[0].isWeb() && this.pages[0].getWebView() != null && this.pages[0].getWebView().isUrlDangerous(), false);
        this.actionBar.setTitle(1, this.pages[1].getTitle(), z);
        this.actionBar.setSubtitle(1, this.pages[1].getSubtitle(), false);
        this.actionBar.setIsDangerous(1, this.pages[1].isWeb() && this.pages[1].getWebView() != null && this.pages[1].getWebView().isUrlDangerous(), false);
    }

    public void setOpener(BotWebViewContainer.MyWebView myWebView) {
        if (this.pages == null) {
            return;
        }
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                return;
            }
            PageLayout pageLayout = pageLayoutArr[i];
            if (pageLayout != null) {
                pageLayout.webViewContainer.setOpener(myWebView);
            }
            i++;
        }
    }

    public class PageLayout extends FrameLayout {
        public final WebpageAdapter adapter;
        public boolean backButton;
        private final GradientClip clip;
        public WebInstantView.Loader currentInstantLoader;
        public ErrorContainer errorContainer;
        private boolean errorShown;
        public boolean forwardButton;
        private String lastFormattedUrl;
        private String lastUrl;
        private boolean lastVisible;
        public final LinearLayoutManager layoutManager;
        public final RecyclerListView listView;
        public float overrideProgress;
        public boolean paused;
        private boolean swipeBack;
        public final ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
        public int type;
        private CachedWeb web;
        public int webActionBarColor;
        public int webBackgroundColor;
        public final BotWebViewContainer webViewContainer;

        public void pause() {
            if (this.paused) {
                return;
            }
            if (getWebView() != null) {
                getWebView().onPause();
            }
            this.paused = true;
        }

        public void resume() {
            if (this.paused) {
                if (getWebView() != null) {
                    getWebView().onResume();
                }
                this.paused = false;
            }
        }

        public PageLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int i = Theme.key_iv_background;
            this.webActionBarColor = ArticleViewer.this.getThemedColor(i);
            this.webBackgroundColor = ArticleViewer.this.getThemedColor(i);
            this.paused = false;
            this.overrideProgress = -1.0f;
            this.clip = new GradientClip();
            WebpageListView webpageListView = new WebpageListView(context, resourcesProvider) { // from class: org.telegram.ui.ArticleViewer.PageLayout.1
                {
                    ArticleViewer articleViewer = ArticleViewer.this;
                }

                @Override // org.telegram.ui.ArticleViewer.WebpageListView, org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    PageLayout.this.overrideProgress = -1.0f;
                }
            };
            this.listView = webpageListView;
            webpageListView.setClipToPadding(false);
            float f = 56.0f;
            webpageListView.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
            webpageListView.setTopGlowOffset(AndroidUtilities.dp(56.0f));
            ((DefaultItemAnimator) webpageListView.getItemAnimator()).setDelayAnimations(false);
            Sheet sheet = ArticleViewer.this.sheet;
            WebpageAdapter webpageAdapter = ArticleViewer.this.new WebpageAdapter(context, sheet != null && sheet.halfSize());
            this.adapter = webpageAdapter;
            webpageListView.setAdapter(webpageAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
            this.layoutManager = linearLayoutManager;
            webpageListView.setLayoutManager(linearLayoutManager);
            webpageListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.ArticleViewer.PageLayout.2
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    if (i2 == 0) {
                        ArticleViewer.this.textSelectionHelper.stopScrolling();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (recyclerView.getChildCount() == 0) {
                        return;
                    }
                    recyclerView.invalidate();
                    ArticleViewer.this.textSelectionHelper.onParentScrolled();
                    ArticleViewer articleViewer = ArticleViewer.this;
                    Sheet sheet2 = articleViewer.sheet;
                    if (sheet2 == null) {
                        if (articleViewer.windowView != null) {
                            ArticleViewer.this.windowView.invalidate();
                        }
                    } else {
                        sheet2.windowView.invalidate();
                    }
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.checkScroll(i3);
                }
            });
            addView(webpageListView, LayoutHelper.createFrame(-1, -1.0f));
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(getContext()) { // from class: org.telegram.ui.ArticleViewer.PageLayout.3
                private boolean ignoreLayout;

                @Override // android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i2, int i3) {
                    this.ignoreLayout = true;
                    setOffsetY(View.MeasureSpec.getSize(i3) * 0.4f);
                    this.ignoreLayout = false;
                    int size = View.MeasureSpec.getSize(i3);
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp((sheet2 == null || sheet2.halfSize()) ? 56.0f : 0.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                }

                @Override // android.view.View, android.view.ViewParent
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.swipeContainer = webViewSwipeContainer;
            webViewSwipeContainer.setShouldWaitWebViewScroll(true);
            webViewSwipeContainer.setFullSize(true);
            webViewSwipeContainer.setAllowFullSizeSwipe(true);
            BotWebViewContainer botWebViewContainer = new BotWebViewContainer(getContext(), resourcesProvider, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite), false) { // from class: org.telegram.ui.ArticleViewer.PageLayout.4
                @Override // org.telegram.ui.web.BotWebViewContainer
                public void setPageLoaded(String str, boolean z) {
                    WebInstantView.Loader loader;
                    if (ArticleViewer.this.actionBar != null) {
                        PageLayout pageLayout = PageLayout.this;
                        if (pageLayout == ArticleViewer.this.pages[0] && (loader = pageLayout.currentInstantLoader) != null && loader.getWebPage() == null) {
                            PageLayout.this.currentInstantLoader.retryLocal(getWebView());
                        }
                    }
                    super.setPageLoaded(str, z);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer
                public void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                    super.onWebViewCreated(myWebView);
                    PageLayout.this.swipeContainer.setWebView(myWebView);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer
                protected void onURLChanged(String str, boolean z, boolean z2) {
                    PageLayout pageLayout = PageLayout.this;
                    pageLayout.backButton = !z;
                    pageLayout.forwardButton = !z2;
                    ArticleViewer.this.updateTitle(true);
                    PageLayout pageLayout2 = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (pageLayout2 != articleViewer.pages[0] || articleViewer.actionBar.isAddressing() || ArticleViewer.this.actionBar.isSearching() || ArticleViewer.this.windowView.movingPage || ArticleViewer.this.windowView.openingPage) {
                        return;
                    }
                    if (ArticleViewer.this.isFirstArticle() || ArticleViewer.this.pagesStack.size() > 1) {
                        BackDrawable backDrawable = ArticleViewer.this.actionBar.backButtonDrawable;
                        PageLayout pageLayout3 = PageLayout.this;
                        backDrawable.setRotation((pageLayout3.backButton || ArticleViewer.this.pagesStack.size() > 1) ? 0.0f : 1.0f, true);
                        WebActionBar webActionBar = ArticleViewer.this.actionBar;
                        PageLayout pageLayout4 = PageLayout.this;
                        webActionBar.setBackButtonCached(pageLayout4.backButton || ArticleViewer.this.pagesStack.size() > 1);
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState(false);
                    } else {
                        ArticleViewer.this.actionBar.setBackButtonCached(false);
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState(false);
                    }
                    ArticleViewer.this.actionBar.setHasForward(PageLayout.this.forwardButton);
                    WebActionBar webActionBar2 = ArticleViewer.this.actionBar;
                    PageLayout pageLayout5 = ArticleViewer.this.pages[0];
                    webActionBar2.setIsTonsite(pageLayout5 != null && pageLayout5.isTonsite());
                    WebActionBar webActionBar3 = ArticleViewer.this.actionBar;
                    PageLayout pageLayout6 = ArticleViewer.this.pages[0];
                    webActionBar3.setIsLocal(pageLayout6 != null && pageLayout6.isLocal());
                }

                @Override // org.telegram.ui.web.BotWebViewContainer
                protected void onTitleChanged(String str) {
                    ArticleViewer.this.updateTitle(true);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer
                protected void onFaviconChanged(Bitmap bitmap) {
                    super.onFaviconChanged(bitmap);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer
                protected void onErrorShown(boolean z, int i2, String str) {
                    if (z) {
                        PageLayout.this.createErrorContainer();
                        PageLayout.this.errorContainer.set(getWebView() != null ? getWebView().getUrl() : null, i2, str);
                        PageLayout pageLayout = PageLayout.this;
                        ErrorContainer errorContainer = pageLayout.errorContainer;
                        ArticleViewer articleViewer = ArticleViewer.this;
                        int i3 = Theme.key_iv_background;
                        errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(articleViewer.getThemedColor(i3)) <= 0.721f, false);
                        PageLayout pageLayout2 = PageLayout.this;
                        pageLayout2.errorContainer.setBackgroundColor(ArticleViewer.this.getThemedColor(i3));
                    }
                    PageLayout pageLayout3 = PageLayout.this;
                    AndroidUtilities.updateViewVisibilityAnimated(pageLayout3.errorContainer, pageLayout3.errorShown = z, 1.0f, false);
                    invalidate();
                }
            };
            this.webViewContainer = botWebViewContainer;
            botWebViewContainer.setOnCloseRequestedListener(new Runnable() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$0();
                }
            });
            botWebViewContainer.setWebViewProgressListener(new Consumer() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ArticleViewer.PageLayout.this.lambda$new$1((Float) obj);
                }
            });
            botWebViewContainer.setDelegate(new BotWebViewContainer.Delegate() { // from class: org.telegram.ui.ArticleViewer.PageLayout.5
                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ BotSensors getBotSensors() {
                    return BotWebViewContainer.Delegate.-CC.$default$getBotSensors(this);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ boolean isClipboardAvailable() {
                    return BotWebViewContainer.Delegate.-CC.$default$isClipboardAvailable(this);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onEmojiStatusGranted(boolean z) {
                    BotWebViewContainer.Delegate.-CC.$default$onEmojiStatusGranted(this, z);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onEmojiStatusSet(TLRPC.Document document) {
                    BotWebViewContainer.Delegate.-CC.$default$onEmojiStatusSet(this, document);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ String onFullscreenRequested(boolean z, boolean z2) {
                    return BotWebViewContainer.Delegate.-CC.$default$onFullscreenRequested(this, z, z2);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onLocationGranted(boolean z) {
                    BotWebViewContainer.Delegate.-CC.$default$onLocationGranted(this, z);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onOpenBackFromTabs() {
                    BotWebViewContainer.Delegate.-CC.$default$onOpenBackFromTabs(this);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onOrientationLockChanged(boolean z) {
                    BotWebViewContainer.Delegate.-CC.$default$onOrientationLockChanged(this, z);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onSendWebViewData(String str) {
                    BotWebViewContainer.Delegate.-CC.$default$onSendWebViewData(this, str);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onSetBackButtonVisible(boolean z) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onSetSettingsButtonVisible(boolean z) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onSetupMainButton(boolean z, boolean z2, String str, long j, int i2, int i3, boolean z3, boolean z4) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i2, int i3, boolean z3, boolean z4, String str2) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onSharedTo(ArrayList arrayList) {
                    BotWebViewContainer.Delegate.-CC.$default$onSharedTo(this, arrayList);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppExpand() {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onWebAppReady() {
                    BotWebViewContainer.Delegate.-CC.$default$onWebAppReady(this);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppSetActionBarColor(int i2, int i3, boolean z) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppSetBackgroundColor(int i2) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public /* synthetic */ void onWebAppSetNavigationBarColor(int i2) {
                    BotWebViewContainer.Delegate.-CC.$default$onWebAppSetNavigationBarColor(this, i2);
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppSetupClosingBehavior(boolean z) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppSwipingBehavior(boolean z) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List list) {
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onCloseRequested(Runnable runnable) {
                    PageLayout pageLayout = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (articleViewer.pages[0] == pageLayout) {
                        articleViewer.goBack();
                    }
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onCloseToTabs() {
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null) {
                        sheet2.dismiss(true);
                    }
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onInstantClose() {
                    PageLayout pageLayout = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    Sheet sheet2 = articleViewer.sheet;
                    if (sheet2 != null) {
                        sheet2.dismissInstant();
                    } else if (articleViewer.pages[0] == pageLayout) {
                        articleViewer.goBack();
                    }
                }

                @Override // org.telegram.ui.web.BotWebViewContainer.Delegate
                public void onWebAppBackgroundChanged(boolean z, int i2) {
                    PageLayout.this.setWebBgColor(z, i2);
                }
            });
            botWebViewContainer.setWebViewScrollListener(new BotWebViewContainer.WebViewScrollListener() { // from class: org.telegram.ui.ArticleViewer.PageLayout.6
                @Override // org.telegram.ui.web.BotWebViewContainer.WebViewScrollListener
                public void onWebViewScrolled(WebView webView, int i2, int i3) {
                    ArticleViewer.this.updatePages();
                }
            });
            webViewSwipeContainer.addView(botWebViewContainer, LayoutHelper.createFrame(-1, -1.0f));
            webViewSwipeContainer.setScrollEndListener(new Runnable() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$2();
                }
            });
            webViewSwipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda3
                @Override // org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate
                public final void onDismiss(boolean z) {
                    ArticleViewer.PageLayout.this.lambda$new$3(z);
                }
            });
            webViewSwipeContainer.setScrollListener(new Runnable() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$4();
                }
            });
            Sheet sheet2 = ArticleViewer.this.sheet;
            if (sheet2 != null && !sheet2.halfSize()) {
                f = 0.0f;
            }
            webViewSwipeContainer.setTopActionBarOffsetY(AndroidUtilities.dp(f) + AndroidUtilities.statusBarHeight);
            addView(webViewSwipeContainer, LayoutHelper.createFrame(-1, -1.0f));
            cleanup();
            setType(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return;
            }
            BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
            if (bottomSheetTabs == null || !bottomSheetTabs.tryRemoveTabWith(ArticleViewer.this)) {
                ArticleViewer.this.close(true, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(Float f) {
            ArticleViewer articleViewer = ArticleViewer.this;
            if (this == articleViewer.pages[0]) {
                if (articleViewer.actionBar.lineProgressView.getCurrentProgress() > f.floatValue()) {
                    ArticleViewer.this.actionBar.lineProgressView.setProgress(0.0f, false);
                }
                ArticleViewer.this.actionBar.lineProgressView.setProgress(f.floatValue(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2() {
            this.webViewContainer.invalidateViewPortHeight(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$3(boolean z) {
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet != null) {
                this.swipeBack = true;
                sheet.dismiss(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$4() {
            this.webViewContainer.invalidateViewPortHeight();
            ErrorContainer errorContainer = this.errorContainer;
            if (errorContainer != null) {
                errorContainer.layout.setTranslationY((((-this.swipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY()) - this.swipeContainer.getSwipeOffsetY()) / 2.0f);
            }
            ArticleViewer.this.updatePages();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebBgColor(boolean z, int i) {
            if (z) {
                this.webActionBarColor = Theme.blendOver(ArticleViewer.this.getThemedColor(Theme.key_iv_background), i);
                ArticleViewer articleViewer = ArticleViewer.this;
                if (this == articleViewer.pages[0]) {
                    if (SharedConfig.adaptableColorInBrowser) {
                        articleViewer.actionBar.setColors(this.webActionBarColor, true);
                    }
                    Sheet sheet = ArticleViewer.this.sheet;
                    if (sheet != null) {
                        sheet.checkNavColor();
                    }
                }
            } else {
                this.webBackgroundColor = Theme.blendOver(-1, i);
                ArticleViewer articleViewer2 = ArticleViewer.this;
                if (this == articleViewer2.pages[0]) {
                    if (SharedConfig.adaptableColorInBrowser) {
                        articleViewer2.actionBar.setMenuColors(this.webBackgroundColor);
                    }
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null) {
                        sheet2.checkNavColor();
                    }
                }
            }
            ArticleViewer.this.updatePages();
        }

        public ErrorContainer createErrorContainer() {
            if (this.errorContainer == null) {
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                ErrorContainer errorContainer = new ErrorContainer(getContext());
                this.errorContainer = errorContainer;
                webViewSwipeContainer.addView(errorContainer, LayoutHelper.createFrame(-1, -1.0f));
                this.errorContainer.buttonView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$PageLayout$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArticleViewer.PageLayout.this.lambda$createErrorContainer$5(view);
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(this.errorContainer, this.errorShown, 1.0f, false);
            }
            return this.errorContainer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$createErrorContainer$5(View view) {
            BotWebViewContainer.MyWebView webView = this.webViewContainer.getWebView();
            if (webView != null) {
                webView.reload();
            }
        }

        public boolean isWeb() {
            return this.type == 1;
        }

        public boolean isArticle() {
            return this.type == 0;
        }

        public void setType(int i) {
            if (this.type != i) {
                cleanup();
            }
            this.type = i;
            this.listView.setVisibility(isArticle() ? 0 : 8);
            this.swipeContainer.setVisibility(isWeb() ? 0 : 8);
        }

        public String getTitle() {
            BotWebViewContainer.MyWebView webView;
            if (isArticle()) {
                if (this.adapter.currentPage == null || this.adapter.currentPage.site_name == null) {
                    if (this.adapter.currentPage != null && this.adapter.currentPage.title != null) {
                        return this.adapter.currentPage.title;
                    }
                } else {
                    return this.adapter.currentPage.site_name;
                }
            }
            if (isWeb() && (webView = this.webViewContainer.getWebView()) != null) {
                return webView.getTitle();
            }
            return "";
        }

        public int getBackgroundColor() {
            if (isWeb() && SharedConfig.adaptableColorInBrowser) {
                if (this.errorShown) {
                    return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
                }
                return this.webBackgroundColor;
            }
            return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public int getActionBarColor() {
            if (isWeb() && SharedConfig.adaptableColorInBrowser) {
                return this.webActionBarColor;
            }
            return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public String getSubtitle() {
            BotWebViewContainer.MyWebView webView;
            if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return "";
            }
            if (TextUtils.equals(this.lastUrl, webView.getUrl())) {
                return this.lastFormattedUrl;
            }
            try {
                String url = webView.getUrl();
                this.lastUrl = url;
                Uri parse = Uri.parse(BotWebViewContainer.magic2tonsite(url));
                String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
                if (!isTonsite()) {
                    try {
                        try {
                            Uri parse2 = Uri.parse(uri);
                            if (parse2.getHost() != null) {
                                parse = parse2;
                            }
                            String IDN_toUnicode = Browser.IDN_toUnicode(parse.getHost());
                            String[] split = IDN_toUnicode.split("\\.");
                            if (split.length > 2 && ArticleViewer.this.actionBar != null && HintView2.measureCorrectly(IDN_toUnicode, ArticleViewer.this.actionBar.titlePaint) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                                IDN_toUnicode = split[split.length - 2] + '.' + split[split.length - 1];
                            }
                            uri = Browser.replace(parse, null, "", IDN_toUnicode, null);
                        } catch (Exception e) {
                            FileLog.e((Throwable) e, false);
                        }
                        uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                if (uri.startsWith("//")) {
                    uri = uri.substring(2);
                }
                if (uri.startsWith("www.")) {
                    uri = uri.substring(4);
                }
                if (uri.endsWith("/")) {
                    uri = uri.substring(0, uri.length() - 1);
                }
                int indexOf = uri.indexOf("#");
                if (indexOf >= 0) {
                    uri = uri.substring(0, indexOf);
                }
                this.lastFormattedUrl = uri;
                return uri;
            } catch (Exception unused) {
                return webView.getUrl();
            }
        }

        public void setLastVisible(boolean z) {
            if (this.lastVisible != z) {
                this.lastVisible = z;
                this.webViewContainer.setKeyboardFocusable(z);
            }
        }

        public boolean hasBackButton() {
            return this.backButton;
        }

        public void back() {
            if (!isWeb() || getWebView() == null) {
                return;
            }
            getWebView().goBack();
        }

        public boolean hasForwardButton() {
            return this.forwardButton;
        }

        public float getListTop() {
            if (isArticle()) {
                float height = this.listView.getHeight();
                for (int i = 0; i < this.listView.getChildCount(); i++) {
                    View childAt = this.listView.getChildAt(i);
                    RecyclerListView recyclerListView = this.listView;
                    if (((recyclerListView == null || recyclerListView.getLayoutManager() == null) ? 0 : this.listView.getLayoutManager().getItemViewType(childAt)) == 2147483646) {
                        height = Math.min(height, childAt.getBottom());
                    } else {
                        height = Math.min(height, childAt.getTop());
                    }
                }
                return height;
            }
            if (isWeb()) {
                return this.swipeContainer.getTranslationY();
            }
            return 0.0f;
        }

        public float getProgress() {
            BotWebViewContainer.MyWebView webView;
            Sheet sheet;
            View findViewByPosition;
            float min;
            if (isArticle()) {
                float f = this.overrideProgress;
                if (f >= 0.0f) {
                    return f;
                }
                int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                if (this.layoutManager.findViewByPosition(findFirstVisibleItemPosition) == null) {
                    return 0.0f;
                }
                int[] iArr = this.adapter.sumItemHeights;
                if (iArr == null) {
                    int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null && sheet2.halfSize()) {
                        if (findFirstVisibleItemPosition < 1) {
                            findFirstVisibleItemPosition = 1;
                        }
                        if (findLastVisibleItemPosition < 1) {
                            findLastVisibleItemPosition = 1;
                        }
                    }
                    int itemCount = this.layoutManager.getItemCount() - 2;
                    if (findLastVisibleItemPosition >= itemCount) {
                        findViewByPosition = this.layoutManager.findViewByPosition(itemCount);
                    } else {
                        findViewByPosition = this.layoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    }
                    if (findViewByPosition == null) {
                        return 0.0f;
                    }
                    float width = getWidth() / (r3 - 1);
                    float measuredHeight = findViewByPosition.getMeasuredHeight();
                    if (findLastVisibleItemPosition >= itemCount) {
                        min = (((itemCount - findFirstVisibleItemPosition) * width) * (this.listView.getMeasuredHeight() - findViewByPosition.getTop())) / measuredHeight;
                    } else {
                        min = width * (1.0f - ((Math.min(0, findViewByPosition.getTop() - this.listView.getPaddingTop()) + measuredHeight) / measuredHeight));
                    }
                    return ((findFirstVisibleItemPosition * width) + min) / getWidth();
                }
                int i = findFirstVisibleItemPosition - 1;
                return Utilities.clamp01((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((findFirstVisibleItemPosition == 0 && (sheet = ArticleViewer.this.sheet) != null && sheet.halfSize()) ? 0 : -r2.getTop())) / Math.max(1, this.adapter.fullHeight - this.listView.getHeight()));
            }
            if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return 0.0f;
            }
            return webView.getScrollProgress();
        }

        public void addProgress(float f) {
            BotWebViewContainer.MyWebView webView;
            float clamp01 = Utilities.clamp01(getProgress() + f);
            if (isArticle() || !isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return;
            }
            webView.setScrollProgress(clamp01);
            ArticleViewer.this.updatePages();
        }

        public boolean isAtTop() {
            if (isArticle()) {
                return !this.listView.canScrollVertically(-1);
            }
            isWeb();
            return false;
        }

        public void scrollToTop(boolean z) {
            if (!isArticle()) {
                if (isWeb()) {
                    if (z) {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                        webViewSwipeContainer.stickTo((-webViewSwipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
                        return;
                    } else {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
                        webViewSwipeContainer2.setSwipeOffsetY((-webViewSwipeContainer2.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
                        return;
                    }
                }
                return;
            }
            if (z) {
                SmoothScroller smoothScroller = new SmoothScroller(getContext());
                Sheet sheet = ArticleViewer.this.sheet;
                if (sheet != null && sheet.halfSize()) {
                    smoothScroller.setTargetPosition(1);
                    smoothScroller.setOffset(-AndroidUtilities.dp(32.0f));
                } else {
                    smoothScroller.setTargetPosition(0);
                }
                this.layoutManager.startSmoothScroll(smoothScroller);
                return;
            }
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            Sheet sheet2 = ArticleViewer.this.sheet;
            linearLayoutManager.scrollToPositionWithOffset((sheet2 == null || !sheet2.halfSize()) ? 0 : 1, ArticleViewer.this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
        }

        public RecyclerListView getListView() {
            return this.listView;
        }

        public WebpageAdapter getAdapter() {
            return this.adapter;
        }

        public BotWebViewContainer getWebContainer() {
            return this.webViewContainer;
        }

        public BotWebViewContainer.MyWebView getWebView() {
            BotWebViewContainer botWebViewContainer = this.webViewContainer;
            if (botWebViewContainer != null) {
                return botWebViewContainer.getWebView();
            }
            return null;
        }

        public boolean isTonsite() {
            BotWebViewContainer.MyWebView webView;
            if (isWeb() && (webView = getWebView()) != null) {
                return BotWebViewContainer.isTonsite(BotWebViewContainer.magic2tonsite(webView.getUrl()));
            }
            return false;
        }

        public boolean isLocal() {
            WebpageAdapter webpageAdapter;
            return (isWeb() || (webpageAdapter = this.adapter) == null || webpageAdapter.currentPage == null || this.adapter.currentPage.cached_page == null || this.adapter.currentPage.cached_page.local == null) ? false : true;
        }

        public void cleanup() {
            this.backButton = false;
            this.forwardButton = false;
            setWeb(null);
            this.webViewContainer.destroyWebView();
            this.webViewContainer.resetWebView();
            ArticleViewer articleViewer = ArticleViewer.this;
            int i = Theme.key_iv_background;
            this.webActionBarColor = articleViewer.getThemedColor(i);
            int themedColor = ArticleViewer.this.getThemedColor(i);
            this.webBackgroundColor = themedColor;
            ErrorContainer errorContainer = this.errorContainer;
            if (errorContainer != null) {
                errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(themedColor) <= 0.721f, true);
                this.errorContainer.setBackgroundColor(this.webBackgroundColor);
                ErrorContainer errorContainer2 = this.errorContainer;
                this.errorShown = false;
                AndroidUtilities.updateViewVisibilityAnimated(errorContainer2, false, 1.0f, false);
            }
            this.adapter.cleanup();
            invalidate();
        }

        public void setWeb(CachedWeb cachedWeb) {
            CachedWeb cachedWeb2 = this.web;
            if (cachedWeb2 != cachedWeb) {
                if (cachedWeb2 != null) {
                    cachedWeb2.detach(this);
                }
                this.web = cachedWeb;
                if (cachedWeb != null) {
                    cachedWeb.attach(this);
                }
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
            }
        }

        public WebInstantView.Loader loadInstant() {
            if (!isWeb()) {
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
                return null;
            }
            if (getWebView() == null) {
                WebInstantView.Loader loader2 = this.currentInstantLoader;
                if (loader2 != null) {
                    loader2.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
                return null;
            }
            WebInstantView.Loader loader3 = this.currentInstantLoader;
            if (loader3 != null && (loader3.currentIsLoaded != getWebView().isPageLoaded() || this.currentInstantLoader.currentProgress != getWebView().getProgress())) {
                this.currentInstantLoader.retryLocal(getWebView());
                return this.currentInstantLoader;
            }
            if (this.currentInstantLoader != null && TextUtils.equals(getWebView().getUrl(), this.currentInstantLoader.currentUrl)) {
                return this.currentInstantLoader;
            }
            WebInstantView.Loader loader4 = this.currentInstantLoader;
            if (loader4 != null) {
                loader4.cancel();
                this.currentInstantLoader.recycle();
                this.currentInstantLoader = null;
            }
            WebInstantView.Loader loader5 = new WebInstantView.Loader(ArticleViewer.this.currentAccount);
            this.currentInstantLoader = loader5;
            loader5.start(getWebView());
            return this.currentInstantLoader;
        }

        @Override // android.view.View
        public void setTranslationX(float f) {
            super.setTranslationX(f);
            ArticleViewer.this.updatePages();
            if (ArticleViewer.this.windowView.openingPage) {
                ArticleViewer.this.containerView.invalidate();
            }
            if (ArticleViewer.this.windowView.movingPage) {
                ArticleViewer.this.containerView.invalidate();
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.setCurrentHeaderHeight((int) (articleViewer.windowView.startMovingHeaderHeight + ((AndroidUtilities.dp(56.0f) - ArticleViewer.this.windowView.startMovingHeaderHeight) * (f / getMeasuredWidth()))));
            }
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet != null) {
                sheet.updateTranslation();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            ErrorContainer errorContainer;
            super.onAttachedToWindow();
            if (!this.errorShown || (errorContainer = this.errorContainer) == null) {
                return;
            }
            ArticleViewer articleViewer = ArticleViewer.this;
            int i = Theme.key_iv_background;
            errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(articleViewer.getThemedColor(i)) <= 0.721f, false);
            this.errorContainer.setBackgroundColor(ArticleViewer.this.getThemedColor(i));
        }
    }

    public class CachedWeb extends BottomSheetTabs.WebTabData {
        public CachedWeb(String str) {
            this.lastUrl = str;
            this.currentUrl = str;
        }

        public void attach(PageLayout pageLayout) {
            if (pageLayout == null) {
                return;
            }
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.onResume();
                pageLayout.webViewContainer.replaceWebView(UserConfig.selectedAccount, this.webView, this.proxy);
                pageLayout.setWebBgColor(true, this.actionBarColor);
                pageLayout.setWebBgColor(false, this.backgroundColor);
                return;
            }
            String str = this.lastUrl;
            if (str != null) {
                pageLayout.webViewContainer.loadUrl(UserConfig.selectedAccount, str);
            }
        }

        public void detach(PageLayout pageLayout) {
            if (pageLayout == null) {
                return;
            }
            pageLayout.webViewContainer.preserveWebView();
            this.webView = pageLayout.webViewContainer.getWebView();
            this.proxy = pageLayout.webViewContainer.getProxy();
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.onPause();
                this.title = this.webView.getTitle();
                this.favicon = this.webView.getFavicon();
                this.lastUrl = this.webView.getUrl();
                this.actionBarColor = pageLayout.webActionBarColor;
                this.backgroundColor = pageLayout.webBackgroundColor;
            }
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabs.WebTabData
        public String getTitle() {
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null && !TextUtils.isEmpty(myWebView.getTitle())) {
                return this.webView.getTitle();
            }
            return super.getTitle();
        }
    }

    public class WebpageListView extends RecyclerListView {
        public WebpageListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                    int measuredHeight = getMeasuredHeight();
                    childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                    return;
                }
            }
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ActionBarPopupWindow actionBarPopupWindow;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLinkOwnerLayout != null && articleViewer.pressedLink == null && (((actionBarPopupWindow = articleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.pressedLink = null;
                articleViewer2.pressedLinkOwnerLayout = null;
                articleViewer2.pressedLinkOwnerView = null;
            } else {
                ArticleViewer articleViewer3 = ArticleViewer.this;
                if (articleViewer3.pressedLinkOwnerLayout != null && articleViewer3.pressedLink != null && motionEvent.getAction() == 1 && (getAdapter() instanceof WebpageAdapter)) {
                    ArticleViewer articleViewer4 = ArticleViewer.this;
                    WebpageAdapter webpageAdapter = (WebpageAdapter) getAdapter();
                    ArticleViewer articleViewer5 = ArticleViewer.this;
                    articleViewer4.checkLayoutForLinks(webpageAdapter, motionEvent, articleViewer5.pressedLinkOwnerView, articleViewer5.pressedLinkOwnerLayout, 0, 0);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            ActionBarPopupWindow actionBarPopupWindow;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLinkOwnerLayout != null && articleViewer.pressedLink == null && (((actionBarPopupWindow = articleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.pressedLink = null;
                articleViewer2.pressedLinkOwnerLayout = null;
                articleViewer2.pressedLinkOwnerView = null;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            ArticleViewer.this.checkVideoPlayer();
            super.dispatchDraw(canvas);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public void onScrolled(int i, int i2) {
            Sheet.WindowView windowView;
            super.onScrolled(i, i2);
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet == null || (windowView = sheet.windowView) == null) {
                return;
            }
            windowView.invalidate();
        }
    }

    public class Sheet implements BaseFragment.AttachedSheet, BottomSheetTabsOverlay.Sheet {
        public final AnimationNotificationsLocker animationsLock = new AnimationNotificationsLocker();
        public boolean attachedToActionBar;
        private float backProgress;
        public View containerView;
        public final Context context;
        public BottomSheetTabDialog dialog;
        private ValueAnimator dismissAnimator;
        private float dismissProgress;
        private boolean dismissing;
        private boolean dismissingIntoTabs;
        public BaseFragment fragment;
        public boolean fullyAttachedToActionBar;
        private boolean hadDialog;
        private boolean lastVisible;
        public boolean nestedVerticalScroll;
        private Runnable onDismissListener;
        private ValueAnimator openAnimator;
        private float openProgress;
        private boolean released;
        public Theme.ResourcesProvider resourcesProvider;
        private boolean wasFullyVisible;
        public final WindowView windowView;

        public final boolean halfSize() {
            return true;
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void setKeyboardHeightFromParent(int i) {
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean showDialog(Dialog dialog) {
            return false;
        }

        public ArticleViewer getArticleViewer() {
            return ArticleViewer.this;
        }

        public Sheet(BaseFragment baseFragment) {
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            Context context = baseFragment.getContext();
            this.context = context;
            WindowView windowView = new WindowView(context);
            this.windowView = windowView;
            new KeyboardNotifier(windowView, true, new Utilities.Callback() { // from class: org.telegram.ui.ArticleViewer$Sheet$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ArticleViewer.Sheet.this.lambda$new$0((Integer) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Integer num) {
            ArticleViewer.this.keyboardVisible = num.intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
        }

        public void setContainerView(View view) {
            this.containerView = view;
            updateTranslation();
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.Sheet
        public WindowView getWindowView() {
            return this.windowView;
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.Sheet
        public boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
            this.dialog = bottomSheetTabDialog;
            if (bottomSheetTabDialog != null) {
                this.hadDialog = true;
            }
            return true;
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.Sheet
        public boolean hadDialog() {
            return this.hadDialog;
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.Sheet
        public BottomSheetTabs.WebTabData saveState() {
            BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
            webTabData.title = ArticleViewer.this.actionBar.getTitle();
            ArticleViewer articleViewer = ArticleViewer.this;
            webTabData.articleViewer = articleViewer;
            PageLayout pageLayout = articleViewer.pages[0];
            webTabData.actionBarColor = (pageLayout == null || !SharedConfig.adaptableColorInBrowser) ? articleViewer.getThemedColor(Theme.key_iv_background) : pageLayout.getActionBarColor();
            ArticleViewer articleViewer2 = ArticleViewer.this;
            PageLayout pageLayout2 = articleViewer2.pages[0];
            webTabData.backgroundColor = (pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? articleViewer2.getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor();
            webTabData.overrideActionBarColor = true;
            webTabData.articleProgress = !this.attachedToActionBar ? 0.0f : ArticleViewer.this.pages[0].getProgress();
            PageLayout pageLayout3 = ArticleViewer.this.pages[0];
            webTabData.view2 = pageLayout3;
            webTabData.favicon = (pageLayout3 == null || pageLayout3.getWebView() == null) ? null : ArticleViewer.this.pages[0].getWebView().getFavicon();
            View view = webTabData.view2;
            if (view != null) {
                webTabData.viewWidth = view.getWidth();
                webTabData.viewHeight = webTabData.view2.getHeight();
            }
            webTabData.viewScroll = getListTop();
            webTabData.themeIsDark = Theme.isCurrentThemeDark();
            return webTabData;
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean isShown() {
            WindowView windowView;
            return !this.dismissing && !this.released && this.openProgress > 0.5f && (windowView = this.windowView) != null && windowView.isAttachedToWindow() && this.windowView.isVisible() && this.backProgress < 1.0f;
        }

        public void attachInternal(BaseFragment baseFragment) {
            this.released = false;
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                if (chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                    chatActivity.getChatActivityEnterView().hidePopup(true, false);
                }
            }
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            if (bottomSheetTabDialog != null) {
                bottomSheetTabDialog.attach();
            } else {
                AndroidUtilities.removeFromParent(this.windowView);
                if (baseFragment.getLayoutContainer() != null) {
                    baseFragment.getLayoutContainer().addView(this.windowView);
                }
            }
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout != null) {
                pageLayout.resume();
            }
            PageLayout pageLayout2 = ArticleViewer.this.pages[1];
            if (pageLayout2 != null) {
                pageLayout2.resume();
            }
            ArticleViewer.activeSheets.add(ArticleViewer.this);
        }

        public void show() {
            if (this.dismissing) {
                return;
            }
            attachInternal(this.fragment);
            animateOpen(true, true, null);
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet, android.content.DialogInterface
        public void dismiss() {
            dismiss(true);
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void dismiss(boolean z) {
            if (this.dismissing) {
                return;
            }
            this.dismissing = true;
            this.dismissingIntoTabs = z;
            if (z) {
                LaunchActivity.instance.getBottomSheetTabsOverlay().dismissSheet(this);
            } else {
                animateDismiss(true, true, new Runnable() { // from class: org.telegram.ui.ArticleViewer$Sheet$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArticleViewer.Sheet.this.lambda$dismiss$1();
                    }
                });
            }
            checkNavColor();
            checkFullyVisible();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dismiss$1() {
            release();
            ArticleViewer.this.destroy();
        }

        @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.Sheet
        public void release() {
            this.released = true;
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout != null && pageLayout.swipeBack) {
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = ArticleViewer.this.pages[0].swipeContainer;
                webViewSwipeContainer.setSwipeOffsetY((-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                ArticleViewer.this.pages[0].swipeBack = false;
            }
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null) {
                pageLayout2.pause();
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            if (pageLayout3 != null) {
                pageLayout3.pause();
            }
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            if (bottomSheetTabDialog != null) {
                bottomSheetTabDialog.detach();
            }
            BaseFragment baseFragment = this.fragment;
            if (baseFragment != null) {
                baseFragment.removeSheet(this);
                if (this.dialog == null) {
                    AndroidUtilities.removeFromParent(this.windowView);
                }
            }
            Runnable runnable = this.onDismissListener;
            if (runnable != null) {
                runnable.run();
                this.onDismissListener = null;
            }
            ArticleViewer.activeSheets.remove(ArticleViewer.this);
        }

        public void dismissInstant() {
            if (this.dismissing) {
                return;
            }
            this.dismissing = true;
            release();
            ArticleViewer.this.destroy();
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean isFullyVisible() {
            return this.fullyAttachedToActionBar && this.dismissProgress <= 0.0f && this.openProgress >= 1.0f && this.backProgress <= 0.0f && !this.dismissingIntoTabs && !this.dismissing;
        }

        public void checkFullyVisible() {
            if (this.wasFullyVisible != isFullyVisible()) {
                this.wasFullyVisible = isFullyVisible();
                BaseFragment baseFragment = this.fragment;
                if (baseFragment != null && (baseFragment.getParentLayout() instanceof ActionBarLayout)) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.fragment.getParentLayout();
                    ActionBarLayout.LayoutContainer layoutContainer = actionBarLayout.containerView;
                    if (layoutContainer != null) {
                        layoutContainer.invalidate();
                    }
                    ActionBarLayout.LayoutContainer layoutContainer2 = actionBarLayout.sheetContainer;
                    if (layoutContainer2 != null) {
                        layoutContainer2.invalidate();
                        return;
                    }
                    return;
                }
                if (this.windowView.getParent() instanceof View) {
                    ((View) this.windowView.getParent()).invalidate();
                }
            }
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean attachedToParent() {
            return this.windowView.isAttachedToWindow();
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean onAttachedBackPressed() {
            if (!ArticleViewer.this.keyboardVisible) {
                if (ArticleViewer.this.actionBar.isSearching()) {
                    ArticleViewer.this.actionBar.showSearch(false, true);
                    return true;
                }
                if (ArticleViewer.this.actionBar.isAddressing()) {
                    ArticleViewer.this.actionBar.showAddress(false, true);
                    return true;
                }
                if (ArticleViewer.this.isFirstArticle() && ArticleViewer.this.pages[0].hasBackButton()) {
                    ArticleViewer.this.pages[0].back();
                    return true;
                }
                if (ArticleViewer.this.pagesStack.size() > 1) {
                    ArticleViewer.this.goBack();
                    return true;
                }
                dismiss(false);
                return true;
            }
            AndroidUtilities.hideKeyboard(this.windowView);
            return true;
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public int getNavigationBarColor(int i) {
            float min = this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress);
            int backgroundColor = getBackgroundColor();
            if (ArticleViewer.this.actionBar != null) {
                backgroundColor = ColorUtils.blendARGB(backgroundColor, ArticleViewer.this.actionBar.addressBackgroundColor, ArticleViewer.this.actionBar.addressingProgress);
            }
            return ColorUtils.blendARGB(i, backgroundColor, min);
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public boolean isAttachedLightStatusBar() {
            return this.attachedToActionBar && (this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress)) > 0.25f && AndroidUtilities.computePerceivedBrightness(getActionBarColor()) >= 0.721f;
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void setOnDismissListener(Runnable runnable) {
            this.onDismissListener = runnable;
        }

        public void reset() {
            this.dismissing = false;
            this.dismissingIntoTabs = false;
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.dismissAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.dismissProgress = 0.0f;
            this.openProgress = 0.0f;
            checkFullyVisible();
            updateTranslation();
            this.windowView.invalidate();
            this.windowView.requestLayout();
        }

        public void animateOpen(final boolean z, boolean z2, final Runnable runnable) {
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
                this.openAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$Sheet$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.Sheet.this.lambda$animateOpen$2(valueAnimator2);
                    }
                });
                this.openAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.Sheet.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Sheet.this.openProgress = z ? 1.0f : 0.0f;
                        Sheet.this.updateTranslation();
                        Sheet.this.checkNavColor();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        Sheet.this.checkFullyVisible();
                        if (z) {
                            Sheet.this.animationsLock.unlock();
                        }
                    }
                });
                if (z) {
                    this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.openAnimator.setDuration(320L);
                } else {
                    this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.openAnimator.setDuration(180L);
                }
                this.openAnimator.start();
                return;
            }
            this.openProgress = z ? 1.0f : 0.0f;
            updateTranslation();
            if (runnable != null) {
                runnable.run();
            }
            checkFullyVisible();
            if (z) {
                this.animationsLock.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateOpen$2(ValueAnimator valueAnimator) {
            this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateTranslation();
            checkNavColor();
            checkFullyVisible();
        }

        public void animateDismiss(final boolean z, boolean z2, final Runnable runnable) {
            ValueAnimator valueAnimator = this.dismissAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.dismissProgress, z ? 1.0f : 0.0f);
                this.dismissAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$Sheet$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.Sheet.this.lambda$animateDismiss$3(valueAnimator2);
                    }
                });
                this.dismissAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.Sheet.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Sheet.this.dismissProgress = z ? 1.0f : 0.0f;
                        if (!Sheet.this.dismissingIntoTabs) {
                            Sheet.this.updateTranslation();
                        }
                        Sheet.this.checkNavColor();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        Sheet.this.checkFullyVisible();
                    }
                });
                this.dismissAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.dismissAnimator.setDuration(250L);
                this.dismissAnimator.start();
                return;
            }
            this.dismissProgress = z ? 1.0f : 0.0f;
            if (!this.dismissingIntoTabs) {
                updateTranslation();
            }
            if (runnable != null) {
                runnable.run();
            }
            checkFullyVisible();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateDismiss$3(ValueAnimator valueAnimator) {
            this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (!this.dismissingIntoTabs) {
                updateTranslation();
            }
            checkNavColor();
            checkFullyVisible();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getListTop() {
            int i = 0;
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            float translationX = (pageLayout == null || pageLayout.getVisibility() != 0) ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth());
            float f = 1.0f - translationX;
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null && pageLayout2.getVisibility() == 0) {
                i = (int) (ArticleViewer.this.pages[0].getListTop() * translationX * ArticleViewer.this.pages[0].getAlpha());
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            return (pageLayout3 == null || pageLayout3.getVisibility() != 0) ? i : i + ((int) (ArticleViewer.this.pages[1].getListTop() * f * ArticleViewer.this.pages[1].getAlpha()));
        }

        public void checkNavColor() {
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            AndroidUtilities.setLightStatusBar(bottomSheetTabDialog != null ? bottomSheetTabDialog.windowView : this.windowView, isAttachedLightStatusBar());
            BottomSheetTabDialog bottomSheetTabDialog2 = this.dialog;
            if (bottomSheetTabDialog2 != null) {
                bottomSheetTabDialog2.updateNavigationBarColor();
            } else {
                LaunchActivity.instance.checkSystemBarColors(true, true, true);
                AndroidUtilities.setLightNavigationBar(getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
            }
        }

        public int getBackgroundColor() {
            if (!SharedConfig.adaptableColorInBrowser) {
                return Theme.getColor(Theme.key_iv_navigationBackground);
            }
            return ColorUtils.blendARGB(ArticleViewer.this.pages[0].getBackgroundColor(), ArticleViewer.this.pages[1].getBackgroundColor(), 1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())));
        }

        public int getActionBarColor() {
            if (!SharedConfig.adaptableColorInBrowser) {
                return Theme.getColor(Theme.key_iv_background);
            }
            return ColorUtils.blendARGB(ArticleViewer.this.pages[0].getActionBarColor(), ArticleViewer.this.pages[1].getActionBarColor(), 1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getListPaddingTop() {
            return AndroidUtilities.dp(20.0f);
        }

        public int getEmptyPadding() {
            int dp = AndroidUtilities.dp(16.0f);
            View view = this.containerView;
            return (dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight())) - (getListTop() - getListPaddingTop());
        }

        public void updateTranslation() {
            View view = this.containerView;
            if (view == null) {
                return;
            }
            view.setTranslationY(getEmptyPadding() * Math.max(1.0f - this.openProgress, this.dismissingIntoTabs ? 0.0f : this.dismissProgress));
            this.windowView.invalidate();
        }

        public class WindowView extends SizeNotifierFrameLayout implements BaseFragment.AttachedSheetWindow, BottomSheetTabsOverlay.SheetView {
            private final AnimatedFloat attachedActionBar;
            private final Paint backgroundPaint;
            private final Path clipPath;
            private Path clipPath2;
            private RectF clipRect;
            private boolean drawingFromOverlay;
            private final Paint handlePaint;
            private final Paint headerBackgroundPaint;
            private final RectF rect;
            private final RectF rect2;
            private final Paint scrimPaint;
            private final Paint shadowPaint;
            private boolean stoppedAtFling;

            public WindowView(Context context) {
                super(context);
                this.scrimPaint = new Paint(1);
                this.shadowPaint = new Paint(1);
                this.backgroundPaint = new Paint(1);
                this.handlePaint = new Paint(1);
                this.headerBackgroundPaint = new Paint(1);
                this.attachedActionBar = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.clipPath = new Path();
                this.rect = new RectF();
                this.rect2 = new RectF();
                this.clipRect = new RectF();
                this.clipPath2 = new Path();
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                Sheet.this.updateTranslation();
            }

            public boolean isVisible() {
                return AndroidUtilities.lerp(Sheet.this.getListTop() - Sheet.this.getListPaddingTop(), 0, Utilities.clamp01(this.attachedActionBar.get())) < getHeight();
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                float f;
                if (this.drawingFromOverlay) {
                    return;
                }
                float min = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (96.0f * min * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                int listTop = Sheet.this.getListTop() - Sheet.this.getListPaddingTop();
                boolean z = listTop < AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() && min > 0.95f;
                Sheet sheet = Sheet.this;
                if (sheet.attachedToActionBar != z) {
                    sheet.attachedToActionBar = z;
                    sheet.checkNavColor();
                }
                float f2 = this.attachedActionBar.set(z);
                Sheet sheet2 = Sheet.this;
                if (sheet2.fullyAttachedToActionBar != (f2 >= 0.999f)) {
                    sheet2.fullyAttachedToActionBar = f2 >= 0.999f;
                    sheet2.checkFullyVisible();
                }
                int lerp = AndroidUtilities.lerp(listTop, 0, Utilities.clamp01(f2));
                float emptyPadding = Sheet.this.getEmptyPadding() * Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress);
                canvas.save();
                canvas.translate(getWidth() * Sheet.this.backProgress, emptyPadding);
                float f3 = lerp;
                this.rect.set(0.0f, f3, getWidth(), getHeight() + AndroidUtilities.dp(16.0f));
                float f4 = 1.0f - f2;
                float dp = AndroidUtilities.dp(24.0f) * f4;
                if (f2 < 1.0f) {
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), Theme.multAlpha(-16777216, min * 0.26f));
                    canvas.drawRoundRect(this.rect, dp, dp, this.shadowPaint);
                }
                if (dp <= 0.0f) {
                    canvas.clipRect(this.rect);
                } else {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rect, dp, dp, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                }
                this.backgroundPaint.setColor(ArticleViewer.this.pages[1].getBackgroundColor());
                canvas.drawRect(this.rect, this.backgroundPaint);
                this.backgroundPaint.setColor(ArticleViewer.this.pages[0].getBackgroundColor());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                rectF.left = ArticleViewer.this.pages[0].getX();
                canvas.drawRect(rectF, this.backgroundPaint);
                ArticleViewer.this.actionBar.drawShadow = z && Sheet.this.getListPaddingTop() + listTop <= AndroidUtilities.statusBarHeight + ArticleViewer.this.currentHeaderHeight;
                if (f2 > 0.0f) {
                    canvas.save();
                    float lerp2 = AndroidUtilities.lerp(Sheet.this.getListPaddingTop() + listTop + 1, 0, f2);
                    canvas.translate(0.0f, lerp2);
                    f = 0.0f;
                    ArticleViewer.this.actionBar.drawBackground(canvas, ((listTop + Sheet.this.getListPaddingTop()) + 1) - lerp2, 1.0f, f2, true);
                    canvas.restore();
                } else {
                    f = 0.0f;
                }
                canvas.translate(f, -emptyPadding);
                if (!AndroidUtilities.makingGlobalBlurBitmap && (!ArticleViewer.this.pages[0].isWeb() || canvas.isHardwareAccelerated())) {
                    super.dispatchDraw(canvas);
                }
                canvas.translate(f, emptyPadding);
                if (f2 < 1.0f) {
                    this.handlePaint.setColor(ColorUtils.blendARGB(Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(Sheet.this.getBackgroundColor()) < 0.721f ? -1 : -16777216, 0.15f), -16777216, f2));
                    this.handlePaint.setAlpha((int) (r1.getAlpha() * f4));
                    float width = getWidth() / 2.0f;
                    float listPaddingTop = (f3 + (Sheet.this.getListPaddingTop() / 2.0f)) - (AndroidUtilities.dp(8.0f) * f2);
                    float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), f2) / 2.0f;
                    this.rect.set(width - lerp3, listPaddingTop - AndroidUtilities.dp(2.0f), width + lerp3, listPaddingTop + AndroidUtilities.dp(2.0f));
                    RectF rectF2 = this.rect;
                    canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.rect.height() / 2.0f, this.handlePaint);
                }
                canvas.restore();
            }

            @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.SheetView
            public void setDrawingFromOverlay(boolean z) {
                if (this.drawingFromOverlay != z) {
                    this.drawingFromOverlay = z;
                    invalidate();
                }
            }

            @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.SheetView
            public RectF getRect() {
                this.clipRect.set(0.0f, (Sheet.this.attachedToActionBar ? 0 : r1.getListTop() - Sheet.this.getListPaddingTop()) + (Sheet.this.getEmptyPadding() * Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress)), getWidth(), getHeight());
                return this.clipRect;
            }

            @Override // org.telegram.ui.ActionBar.BottomSheetTabsOverlay.SheetView
            public float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2, boolean z) {
                rectF2.set(getRect());
                AndroidUtilities.lerp(rectF2, rectF, f, rectF2);
                float min = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                float f3 = 1.0f - f;
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (min * f3 * 96.0f * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f);
                this.backgroundPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.clipPath2.rewind();
                this.clipPath2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(this.clipPath2, this.backgroundPaint);
                if (getChildCount() == 1) {
                    if (Sheet.this.attachedToActionBar) {
                        canvas.save();
                        canvas.clipPath(this.clipPath2);
                        canvas.translate(0.0f, rectF2.top);
                        ArticleViewer.this.actionBar.draw(canvas);
                        canvas.restore();
                    }
                    View childAt = getChildAt(0);
                    canvas.save();
                    float lerp2 = z ? 1.0f : AndroidUtilities.lerp(1.0f, 0.99f, f);
                    float f4 = lerp2 - 1.0f;
                    if (Math.abs(f4) > 0.01f) {
                        canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.clipPath(this.clipPath2);
                    if (Math.abs(f4) > 0.01f) {
                        float f5 = 1.0f / lerp2;
                        canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.translate(0.0f, (-Sheet.this.getListTop()) + rectF2.top + ((Sheet.this.attachedToActionBar ? ArticleViewer.this.actionBar.getMeasuredHeight() : 0) * f3));
                    childAt.draw(canvas);
                    canvas.restore();
                }
                return lerp;
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < (Sheet.this.attachedToActionBar ? 0 : r1.getListTop())) {
                        Sheet.this.dismiss(true);
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public boolean onNestedFling(View view, float f, float f2, boolean z) {
                return super.onNestedFling(view, f, f2, z);
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public boolean onNestedPreFling(View view, float f, float f2) {
                boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
                if (Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    if (ArticleViewer.this.pages[0].isAtTop() && f2 < -1000.0f) {
                        Sheet.this.dismiss(true);
                    } else {
                        Sheet.this.animateDismiss(false, true, null);
                    }
                }
                if (f != 0.0f || f2 != 0.0f) {
                    ArticleViewer.this.textSelectionHelper.cancelTextSelectionRunnable();
                }
                this.stoppedAtFling = true;
                return onNestedPreFling;
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
                super.onNestedScroll(view, i, i2, i3, i4);
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
                Sheet sheet = Sheet.this;
                if (!sheet.nestedVerticalScroll) {
                    sheet.nestedVerticalScroll = i2 != 0;
                }
                if (ArticleViewer.this.pages[0].isAtTop() && Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    iArr[1] = Math.min((int) (Sheet.this.getEmptyPadding() * Sheet.this.dismissProgress), i2);
                    Sheet sheet2 = Sheet.this;
                    sheet2.dismissProgress = Utilities.clamp(sheet2.dismissProgress - (i2 / Sheet.this.getEmptyPadding()), 1.0f, 0.0f);
                    Sheet.this.updateTranslation();
                    Sheet.this.checkFullyVisible();
                }
                if (i == 0 && i2 == 0) {
                    return;
                }
                ArticleViewer.this.textSelectionHelper.cancelTextSelectionRunnable();
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public void onNestedScrollAccepted(View view, View view2, int i) {
                super.onNestedScrollAccepted(view, view2, i);
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public boolean onStartNestedScroll(View view, View view2, int i) {
                this.stoppedAtFling = false;
                return Sheet.this.halfSize() && i == 2;
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public void onStopNestedScroll(View view) {
                Sheet sheet = Sheet.this;
                sheet.nestedVerticalScroll = false;
                if (sheet.halfSize() && !this.stoppedAtFling && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    if (Sheet.this.dismissProgress > 0.25f) {
                        Sheet.this.dismiss(true);
                    } else {
                        Sheet.this.animateDismiss(false, true, null);
                    }
                }
                super.onStopNestedScroll(view);
            }
        }

        public void setBackProgress(float f) {
            this.backProgress = f;
            this.windowView.invalidate();
            checkNavColor();
            checkFullyVisible();
        }

        public float getBackProgress() {
            return this.backProgress;
        }

        public ValueAnimator animateBackProgressTo(float f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.backProgress, f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$Sheet$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ArticleViewer.Sheet.this.lambda$animateBackProgressTo$4(valueAnimator);
                }
            });
            return ofFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateBackProgressTo$4(ValueAnimator valueAnimator) {
            setBackProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public void setLastVisible(boolean z) {
            this.lastVisible = z;
            ArticleViewer.this.pages[0].setLastVisible(z);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }

        public void updateLastVisible() {
            ArticleViewer.this.pages[0].setLastVisible(this.lastVisible);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
        public BulletinFactory getBulletinFactory() {
            FrameLayout frameLayout;
            if (!ArticleViewer.this.pages[0].isWeb()) {
                if (ArticleViewer.this.pages[0].adapter.currentPage == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0];
            } else {
                if (ArticleViewer.this.pages[0].getWebView() == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0].webViewContainer;
            }
            return BulletinFactory.of(frameLayout, ArticleViewer.this.getResourcesProvider());
        }
    }

    public static class ErrorContainer extends FrameLayout {
        public final ButtonWithCounterView buttonView;
        private final TextView codeView;
        private boolean dark;
        private ValueAnimator darkAnimator;
        private final TextView descriptionView;
        private final BackupImageView imageView;
        private boolean imageViewSet;
        public final LinearLayout layout;
        private final TextView titleView;

        public ErrorContainer(Context context) {
            super(context);
            this.dark = true;
            setVisibility(8);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
            linearLayout.setOrientation(1);
            linearLayout.setGravity(3);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(100, 100));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 19.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(-1);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 3, 0, 4, 0, 2));
            TextView textView2 = new TextView(context);
            this.descriptionView = textView2;
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(-1);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 3, 0, 0, 0, 1));
            TextView textView3 = new TextView(context);
            this.codeView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setAlpha(0.4f);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 3));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setMinWidth(AndroidUtilities.dp(140.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Refresh), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 40, 3, 0, 12, 0, 0));
        }

        public void setDark(boolean z, boolean z2) {
            if (this.dark == z) {
                return;
            }
            this.dark = z;
            ValueAnimator valueAnimator = this.darkAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                this.darkAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.ErrorContainer.this.lambda$setDark$0(valueAnimator2);
                    }
                });
                this.darkAnimator.start();
                return;
            }
            this.titleView.setTextColor(!z ? -16777216 : -1);
            this.descriptionView.setTextColor(!z ? -16777216 : -1);
            this.codeView.setTextColor(z ? -1 : -16777216);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setDark$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.titleView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
            this.descriptionView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
            this.codeView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
        }

        public void set(String str, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            this.descriptionView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebErrorInfoBot, str)));
            this.codeView.setText(str2);
        }

        public void set(String str, int i, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            String magic2tonsite = BotWebViewContainer.magic2tonsite(str);
            this.descriptionView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((magic2tonsite == null || Uri.parse(magic2tonsite) == null || Uri.parse(magic2tonsite).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(magic2tonsite).getAuthority())), this.descriptionView.getPaint().getFontMetricsInt(), false));
            this.codeView.setText(str2);
        }

        @Override // android.view.View
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0 || this.imageViewSet) {
                return;
            }
            this.imageViewSet = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.imageView, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, "🧐", "100_100");
        }
    }

    public void destroy() {
        for (int i = 0; i < this.pagesStack.size(); i++) {
            Object obj = this.pagesStack.get(i);
            if (obj instanceof CachedWeb) {
                PageLayout pageLayout = this.pages[0];
                if (pageLayout != null && pageLayout.web == obj) {
                    ((CachedWeb) obj).detach(this.pages[0]);
                }
                PageLayout pageLayout2 = this.pages[1];
                if (pageLayout2 != null && pageLayout2.web == obj) {
                    ((CachedWeb) obj).detach(this.pages[1]);
                }
                ((CachedWeb) obj).destroy();
            } else if (obj instanceof TLRPC.WebPage) {
                WebInstantView.recycle((TLRPC.WebPage) obj);
            }
        }
        this.pagesStack.clear();
        destroyArticleViewer();
    }
}
