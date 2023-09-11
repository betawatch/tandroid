package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$PageListItem;
import org.telegram.tgnet.TLRPC$PageListOrderedItem;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$RichText;
import org.telegram.tgnet.TLRPC$TL_channels_joinChannel;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messageEntityUrl;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_page;
import org.telegram.tgnet.TLRPC$TL_pageBlockAnchor;
import org.telegram.tgnet.TLRPC$TL_pageBlockAudio;
import org.telegram.tgnet.TLRPC$TL_pageBlockAuthorDate;
import org.telegram.tgnet.TLRPC$TL_pageBlockBlockquote;
import org.telegram.tgnet.TLRPC$TL_pageBlockChannel;
import org.telegram.tgnet.TLRPC$TL_pageBlockCollage;
import org.telegram.tgnet.TLRPC$TL_pageBlockCover;
import org.telegram.tgnet.TLRPC$TL_pageBlockDetails;
import org.telegram.tgnet.TLRPC$TL_pageBlockDivider;
import org.telegram.tgnet.TLRPC$TL_pageBlockEmbed;
import org.telegram.tgnet.TLRPC$TL_pageBlockEmbedPost;
import org.telegram.tgnet.TLRPC$TL_pageBlockFooter;
import org.telegram.tgnet.TLRPC$TL_pageBlockHeader;
import org.telegram.tgnet.TLRPC$TL_pageBlockKicker;
import org.telegram.tgnet.TLRPC$TL_pageBlockList;
import org.telegram.tgnet.TLRPC$TL_pageBlockMap;
import org.telegram.tgnet.TLRPC$TL_pageBlockOrderedList;
import org.telegram.tgnet.TLRPC$TL_pageBlockParagraph;
import org.telegram.tgnet.TLRPC$TL_pageBlockPhoto;
import org.telegram.tgnet.TLRPC$TL_pageBlockPreformatted;
import org.telegram.tgnet.TLRPC$TL_pageBlockPullquote;
import org.telegram.tgnet.TLRPC$TL_pageBlockRelatedArticles;
import org.telegram.tgnet.TLRPC$TL_pageBlockSlideshow;
import org.telegram.tgnet.TLRPC$TL_pageBlockSubheader;
import org.telegram.tgnet.TLRPC$TL_pageBlockSubtitle;
import org.telegram.tgnet.TLRPC$TL_pageBlockTable;
import org.telegram.tgnet.TLRPC$TL_pageBlockTitle;
import org.telegram.tgnet.TLRPC$TL_pageBlockUnsupported;
import org.telegram.tgnet.TLRPC$TL_pageBlockVideo;
import org.telegram.tgnet.TLRPC$TL_pageCaption;
import org.telegram.tgnet.TLRPC$TL_pageListItemBlocks;
import org.telegram.tgnet.TLRPC$TL_pageListItemText;
import org.telegram.tgnet.TLRPC$TL_pageListOrderedItemBlocks;
import org.telegram.tgnet.TLRPC$TL_pageListOrderedItemText;
import org.telegram.tgnet.TLRPC$TL_pagePart_layer82;
import org.telegram.tgnet.TLRPC$TL_pageRelatedArticle;
import org.telegram.tgnet.TLRPC$TL_pageTableCell;
import org.telegram.tgnet.TLRPC$TL_pageTableRow;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_textAnchor;
import org.telegram.tgnet.TLRPC$TL_textBold;
import org.telegram.tgnet.TLRPC$TL_textConcat;
import org.telegram.tgnet.TLRPC$TL_textEmail;
import org.telegram.tgnet.TLRPC$TL_textEmpty;
import org.telegram.tgnet.TLRPC$TL_textFixed;
import org.telegram.tgnet.TLRPC$TL_textImage;
import org.telegram.tgnet.TLRPC$TL_textItalic;
import org.telegram.tgnet.TLRPC$TL_textMarked;
import org.telegram.tgnet.TLRPC$TL_textPhone;
import org.telegram.tgnet.TLRPC$TL_textPlain;
import org.telegram.tgnet.TLRPC$TL_textStrike;
import org.telegram.tgnet.TLRPC$TL_textSubscript;
import org.telegram.tgnet.TLRPC$TL_textSuperscript;
import org.telegram.tgnet.TLRPC$TL_textUnderline;
import org.telegram.tgnet.TLRPC$TL_textUrl;
import org.telegram.tgnet.TLRPC$TL_updateNewChannelMessage;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$TL_webPageNotModified;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnchorSpan;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CloseProgressDrawable2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
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
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.TableLayout;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.TextPaintMarkSpan;
import org.telegram.ui.Components.TextPaintSpan;
import org.telegram.ui.Components.TextPaintUrlSpan;
import org.telegram.ui.Components.TextPaintWebpageUrlSpan;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
/* loaded from: classes3.dex */
public class ArticleViewer implements NotificationCenter.NotificationCenterDelegate {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ArticleViewer Instance;
    private static TextPaint channelNamePaint;
    private static TextPaint channelNamePhotoPaint;
    private static Paint dividerPaint;
    private static Paint dotsPaint;
    private static TextPaint embedPostAuthorPaint;
    private static TextPaint embedPostDatePaint;
    private static TextPaint errorTextPaint;
    private static TextPaint listTextNumPaint;
    private static TextPaint listTextPointerPaint;
    private static Paint photoBackgroundPaint;
    private static Paint preformattedBackgroundPaint;
    private static Paint quoteLinePaint;
    private static TextPaint relatedArticleHeaderPaint;
    private static TextPaint relatedArticleTextPaint;
    private static Paint tableHalfLinePaint;
    private static Paint tableHeaderPaint;
    private static Paint tableLinePaint;
    private static Paint tableStripPaint;
    private static Paint urlPaint;
    private static Paint webpageMarkPaint;
    private static Paint webpageSearchPaint;
    private static Paint webpageUrlPaint;
    private WebpageAdapter[] adapter;
    private int anchorsOffsetMeasuredWidth;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private boolean attachedToWindow;
    private ImageView backButton;
    private BackDrawable backDrawable;
    private Paint backgroundPaint;
    private Drawable chat_redLocationIcon;
    private ImageView clearButton;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private int currentAccount;
    private int currentHeaderHeight;
    BlockVideoCell currentPlayer;
    private WebPlayerView currentPlayingVideo;
    private int currentSearchIndex;
    private View customView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private TextView deleteView;
    private boolean drawBlockSelection;
    private FontCell[] fontCells;
    private AspectRatioFrameLayout fullscreenAspectRatioView;
    private TextureView fullscreenTextureView;
    private FrameLayout fullscreenVideoContainer;
    private WebPlayerView fullscreenedVideo;
    private boolean hasCutout;
    private FrameLayout headerView;
    private boolean ignoreOnTextChange;
    private boolean isVisible;
    private boolean keyboardVisible;
    private Object lastInsets;
    private int lastReqId;
    private int lastSearchIndex;
    private Drawable layerShadowDrawable;
    private LinearLayoutManager[] layoutManager;
    private Runnable lineProgressTickRunnable;
    private LineProgressView lineProgressView;
    private BottomSheet linkSheet;
    private RecyclerListView[] listView;
    private TLRPC$Chat loadedChannel;
    private boolean loadingChannel;
    private ActionBarMenuItem menuButton;
    private FrameLayout menuContainer;
    private final AnimationNotificationsLocker notificationsLocker;
    private int openUrlReqId;
    private AnimatorSet pageSwitchAnimation;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int pressedLayoutY;
    private LinkSpanDrawable<TextPaintUrlSpan> pressedLink;
    private DrawingText pressedLinkOwnerLayout;
    private View pressedLinkOwnerView;
    private int previewsReqId;
    private ContextProgressView progressView;
    private AnimatorSet progressViewAnimation;
    private AnimatorSet runAfterKeyboardClose;
    private Paint scrimPaint;
    private FrameLayout searchContainer;
    private SimpleTextView searchCountText;
    private ImageView searchDownButton;
    private EditTextBoldCursor searchField;
    private FrameLayout searchPanel;
    private ArrayList<SearchResult> searchResults;
    private Runnable searchRunnable;
    private View searchShadow;
    private String searchText;
    private ImageView searchUpButton;
    private int selectedFont;
    private Drawable slideDotBigDrawable;
    private Drawable slideDotDrawable;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private SimpleTextView titleTextView;
    private long transitionAnimationStartTime;
    VideoPlayerHolderBase videoPlayer;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static final Property<WindowView, Float> ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty<WindowView>("innerTranslationX") { // from class: org.telegram.ui.ArticleViewer.1
        @Override // org.telegram.ui.Components.AnimationProperties.FloatProperty
        public void setValue(WindowView windowView, float f) {
            windowView.setInnerTranslationX(f);
        }

        @Override // android.util.Property
        public Float get(WindowView windowView) {
            return Float.valueOf(windowView.getInnerTranslationX());
        }
    };
    private static TextPaint audioTimePaint = new TextPaint(1);
    private static SparseArray<TextPaint> photoCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> photoCreditTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> titleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> kickerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> headerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> subtitleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> subheaderTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> authorTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> footerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> paragraphTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> listTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> preformattedTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> quoteTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> embedPostTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> embedPostCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> mediaCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> mediaCreditTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> relatedArticleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> detailsTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> tableTextPaints = new SparseArray<>();
    private ArrayList<BlockEmbedCell> createdWebViews = new ArrayList<>();
    private int lastBlockNum = 1;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private ArrayList<TLRPC$WebPage> pagesStack = new ArrayList<>();
    private boolean animateClear = true;
    private Paint headerPaint = new Paint();
    private Paint statusBarPaint = new Paint();
    private Paint navigationBarPaint = new Paint();
    private Paint headerProgressPaint = new Paint();
    private boolean checkingForLongPress = false;
    private CheckForLongPress pendingCheckForLongPress = null;
    private int pressCount = 0;
    private CheckForTap pendingCheckForTap = null;
    private LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setParentActivity$21(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWindowLayoutParamsForSearch() {
    }

    public ArticleViewer() {
        new LinkPath();
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.selectedFont = 0;
        this.fontCells = new FontCell[2];
        this.searchResults = new ArrayList<>();
        this.lastSearchIndex = -1;
    }

    static /* synthetic */ int access$13408(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    static /* synthetic */ int access$2104(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    public static ArticleViewer getInstance() {
        ArticleViewer articleViewer = Instance;
        if (articleViewer == null) {
            synchronized (ArticleViewer.class) {
                articleViewer = Instance;
                if (articleViewer == null) {
                    articleViewer = new ArticleViewer();
                    Instance = articleViewer;
                }
            }
        }
        return articleViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TL_pageBlockRelatedArticlesChild extends TLRPC$PageBlock {
        private int num;
        private TLRPC$TL_pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesChild() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TL_pageBlockRelatedArticlesShadow extends TLRPC$PageBlock {
        private TLRPC$TL_pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesShadow() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TL_pageBlockDetailsChild extends TLRPC$PageBlock {
        private TLRPC$PageBlock block;
        private TLRPC$PageBlock parent;

        private TL_pageBlockDetailsChild() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TL_pageBlockListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockList pageBlockList;

        private TL_pageBlockListParent(ArticleViewer articleViewer) {
            this.items = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TL_pageBlockListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockListItem(ArticleViewer articleViewer) {
            this.index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TL_pageBlockOrderedListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockOrderedListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockOrderedList pageBlockOrderedList;

        private TL_pageBlockOrderedListParent(ArticleViewer articleViewer) {
            this.items = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TL_pageBlockOrderedListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockOrderedListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockOrderedListItem(ArticleViewer articleViewer) {
            this.index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TL_pageBlockEmbedPostCaption extends TLRPC$TL_pageBlockEmbedPost {
        private TLRPC$TL_pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

    /* loaded from: classes3.dex */
    public class DrawingText implements TextSelectionHelper.TextLayoutBlock {
        private boolean isDrawing;
        private View latestParentView;
        public LinkPath markPath;
        public TLRPC$PageBlock parentBlock;
        public Object parentText;
        public CharSequence prefix;
        public int row;
        public int searchIndex = -1;
        public LinkPath searchPath;
        public StaticLayout textLayout;
        public LinkPath textPath;
        public int x;
        public int y;

        public DrawingText() {
        }

        public void draw(Canvas canvas, View view) {
            float width;
            this.isDrawing = true;
            this.latestParentView = view;
            float f = 0.0f;
            if (!ArticleViewer.this.searchResults.isEmpty()) {
                SearchResult searchResult = (SearchResult) ArticleViewer.this.searchResults.get(ArticleViewer.this.currentSearchIndex);
                if (searchResult.block != this.parentBlock || (searchResult.text != this.parentText && (!(searchResult.text instanceof String) || this.parentText != null))) {
                    this.searchIndex = -1;
                    this.searchPath = null;
                } else if (this.searchIndex != searchResult.index) {
                    LinkPath linkPath = new LinkPath(true);
                    this.searchPath = linkPath;
                    linkPath.setAllowReset(false);
                    this.searchPath.setCurrentLayout(this.textLayout, searchResult.index, 0.0f);
                    this.searchPath.setBaselineShift(0);
                    this.textLayout.getSelectionPath(searchResult.index, searchResult.index + ArticleViewer.this.searchText.length(), this.searchPath);
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
            if (ArticleViewer.this.links.draw(canvas, this)) {
                view.invalidate();
            }
            if (ArticleViewer.this.pressedLinkOwnerLayout == this && ArticleViewer.this.pressedLink == null && ArticleViewer.this.drawBlockSelection) {
                if (getLineCount() == 1) {
                    width = getLineWidth(0);
                    f = getLineLeft(0);
                } else {
                    width = getWidth();
                }
                canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f, 0.0f, f + width + AndroidUtilities.dp(2.0f), getHeight(), ArticleViewer.urlPaint);
            }
            this.textLayout.draw(canvas);
            this.isDrawing = false;
        }

        public void invalidateParent() {
            View view;
            if (this.isDrawing || (view = this.latestParentView) == null) {
                return;
            }
            view.invalidate();
        }

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

        public int getHeight() {
            return this.textLayout.getHeight();
        }

        public int getWidth() {
            return this.textLayout.getWidth();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public StaticLayout getLayout() {
            return this.textLayout;
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

        @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
        public CharSequence getPrefix() {
            return this.prefix;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class TextSizeCell extends FrameLayout {
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
            SeekBarView seekBarView = new SeekBarView(context);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setSeparatorsCount((this.endFontSize - this.startFontSize) + 1);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.TextSizeCell.1
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
                        ArticleViewer.this.adapter[0].searchTextOffset.clear();
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
            this.textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
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

    /* loaded from: classes3.dex */
    public static class FontCell extends FrameLayout {
        private RadioButton radioButton;
        private TextView textView;

        public FontCell(Context context) {
            super(context);
            setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            this.radioButton.setColor(Theme.getColor(Theme.key_dialogRadioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 22, 13.0f, z ? 22 : 0, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ArticleViewer.this.pendingCheckForLongPress == null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pendingCheckForLongPress = new CheckForLongPress();
            }
            ArticleViewer.this.pendingCheckForLongPress.currentPressCount = ArticleViewer.access$2104(ArticleViewer.this);
            if (ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.postDelayed(ArticleViewer.this.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class WindowView extends FrameLayout {
        private float alpha;
        private int bHeight;
        private int bWidth;
        private int bX;
        private int bY;
        private final Paint blackPaint;
        private float innerTranslationX;
        private boolean maybeStartTracking;
        private boolean movingPage;
        private boolean selfLayout;
        private int startMovingHeaderHeight;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker tracker;

        public WindowView(Context context) {
            super(context);
            this.blackPaint = new Paint();
        }

        @Override // android.view.ViewGroup, android.view.View
        @TargetApi(21)
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            List<Rect> boundingRects;
            WindowInsets windowInsets2 = (WindowInsets) ArticleViewer.this.lastInsets;
            ArticleViewer.this.lastInsets = windowInsets;
            if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 28 && ArticleViewer.this.parentActivity != null && (displayCutout = ArticleViewer.this.parentActivity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                ArticleViewer.this.hasCutout = boundingRects.get(0).height() != 0;
            }
            return super.dispatchApplyWindowInsets(windowInsets);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 21 && ArticleViewer.this.lastInsets != null) {
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                if (AndroidUtilities.incorrectDisplaySizeFix) {
                    int i4 = AndroidUtilities.displaySize.y;
                    if (size2 > i4) {
                        size2 = i4;
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
            ArticleViewer.this.menuButton.setAdditionalYOffset(((-(ArticleViewer.this.currentHeaderHeight - AndroidUtilities.dp(56.0f))) / 2) + (i3 < 21 ? AndroidUtilities.statusBarHeight : 0));
            ArticleViewer.this.keyboardVisible = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
            ArticleViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ArticleViewer.this.fullscreenVideoContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayMode()) {
                motionEvent.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
                return ArticleViewer.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = ArticleViewer.this.textSelectionHelper.getOverlayView(getContext());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
            if (ArticleViewer.this.textSelectionHelper.isInSelectionMode() && ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                return true;
            }
            if (overlayView.checkOnTap(motionEvent)) {
                motionEvent.setAction(3);
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
            if (this.selfLayout) {
                return;
            }
            int i6 = i3 - i;
            int i7 = 0;
            if (ArticleViewer.this.anchorsOffsetMeasuredWidth != i6) {
                for (int i8 = 0; i8 < ArticleViewer.this.listView.length; i8++) {
                    for (Map.Entry entry : ArticleViewer.this.adapter[i8].anchorsOffset.entrySet()) {
                        entry.setValue(-1);
                    }
                }
                ArticleViewer.this.anchorsOffsetMeasuredWidth = i6;
            }
            if (Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) {
                i5 = 0;
            } else {
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
                i5 = 0 + windowInsets.getSystemWindowInsetTop();
                i7 = systemWindowInsetLeft;
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

        @Keep
        public void setInnerTranslationX(float f) {
            this.innerTranslationX = f;
            if (ArticleViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) ArticleViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent((ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f) ? false : true);
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

        @Keep
        public float getInnerTranslationX() {
            return this.innerTranslationX;
        }

        private void prepareForMoving(MotionEvent motionEvent) {
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            if (ArticleViewer.this.pagesStack.size() > 1) {
                this.movingPage = true;
                this.startMovingHeaderHeight = ArticleViewer.this.currentHeaderHeight;
                ArticleViewer.this.listView[1].setVisibility(0);
                ArticleViewer.this.listView[1].setAlpha(1.0f);
                ArticleViewer.this.listView[1].setTranslationX(0.0f);
                ArticleViewer.this.listView[0].setBackgroundColor(ArticleViewer.this.backgroundPaint.getColor());
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.updateInterfaceForCurrentPage((TLRPC$WebPage) articleViewer.pagesStack.get(ArticleViewer.this.pagesStack.size() - 2), true, -1);
            } else {
                this.movingPage = false;
            }
            ArticleViewer.this.cancelCheckLongPress();
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) {
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
                if (this.maybeStartTracking && !this.startedTracking && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                    prepareForMoving(motionEvent);
                } else if (this.startedTracking) {
                    ArticleViewer.this.pressedLinkOwnerLayout = null;
                    ArticleViewer.this.pressedLinkOwnerView = null;
                    if (this.movingPage) {
                        ArticleViewer.this.listView[0].setTranslationX(max);
                    } else {
                        float f = max;
                        ArticleViewer.this.containerView.setTranslationX(f);
                        setInnerTranslationX(f);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                this.tracker.computeCurrentVelocity(1000);
                float xVelocity = this.tracker.getXVelocity();
                float yVelocity = this.tracker.getYVelocity();
                if (!this.startedTracking && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    prepareForMoving(motionEvent);
                }
                if (this.startedTracking) {
                    View view = this.movingPage ? ArticleViewer.this.listView[0] : ArticleViewer.this.containerView;
                    float x = view.getX();
                    final boolean z = x < ((float) view.getMeasuredWidth()) / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z) {
                        x = view.getMeasuredWidth() - x;
                        if (this.movingPage) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.listView[0], View.TRANSLATION_X, view.getMeasuredWidth()));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.containerView, View.TRANSLATION_X, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, view.getMeasuredWidth()));
                        }
                    } else if (this.movingPage) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.listView[0], View.TRANSLATION_X, 0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.containerView, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((200.0f / view.getMeasuredWidth()) * x), 50));
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.WindowView.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (WindowView.this.movingPage) {
                                ArticleViewer.this.listView[0].setBackgroundDrawable(null);
                                if (!z) {
                                    WebpageAdapter webpageAdapter = ArticleViewer.this.adapter[1];
                                    ArticleViewer.this.adapter[1] = ArticleViewer.this.adapter[0];
                                    ArticleViewer.this.adapter[0] = webpageAdapter;
                                    RecyclerListView recyclerListView = ArticleViewer.this.listView[1];
                                    ArticleViewer.this.listView[1] = ArticleViewer.this.listView[0];
                                    ArticleViewer.this.listView[0] = recyclerListView;
                                    LinearLayoutManager linearLayoutManager = ArticleViewer.this.layoutManager[1];
                                    ArticleViewer.this.layoutManager[1] = ArticleViewer.this.layoutManager[0];
                                    ArticleViewer.this.layoutManager[0] = linearLayoutManager;
                                    ArticleViewer.this.pagesStack.remove(ArticleViewer.this.pagesStack.size() - 1);
                                    ArticleViewer articleViewer = ArticleViewer.this;
                                    articleViewer.textSelectionHelper.setParentView(articleViewer.listView[0]);
                                    ArticleViewer articleViewer2 = ArticleViewer.this;
                                    articleViewer2.textSelectionHelper.layoutManager = articleViewer2.layoutManager[0];
                                    ArticleViewer.this.titleTextView.setText(ArticleViewer.this.adapter[0].currentPage.site_name == null ? "" : ArticleViewer.this.adapter[0].currentPage.site_name);
                                    ArticleViewer.this.textSelectionHelper.clear(true);
                                    ArticleViewer.this.headerView.invalidate();
                                }
                                ArticleViewer.this.listView[1].setVisibility(8);
                                ArticleViewer.this.headerView.invalidate();
                            } else if (!z) {
                                ArticleViewer.this.saveCurrentPagePosition();
                                ArticleViewer.this.onClosed();
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
            return this.startedTracking;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int i;
            super.dispatchDraw(canvas);
            if ((Build.VERSION.SDK_INT >= 21 && ArticleViewer.this.lastInsets != null) || this.bWidth == 0 || this.bHeight == 0) {
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
            int measuredHeight;
            int systemWindowInsetRight;
            int measuredWidth = getMeasuredWidth();
            float f = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.innerTranslationX, 0.0f, f, measuredHeight2, ArticleViewer.this.backgroundPaint);
            if (Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) {
                return;
            }
            WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
            canvas.drawRect(this.innerTranslationX, 0.0f, f, windowInsets.getSystemWindowInsetTop(), ArticleViewer.this.statusBarPaint);
            if (ArticleViewer.this.hasCutout) {
                int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                if (systemWindowInsetLeft != 0) {
                    canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, ArticleViewer.this.statusBarPaint);
                }
                if (windowInsets.getSystemWindowInsetRight() != 0) {
                    canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f, measuredHeight2, ArticleViewer.this.statusBarPaint);
                }
            }
            canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f, measuredHeight2, ArticleViewer.this.navigationBarPaint);
        }

        @Override // android.view.View
        @Keep
        public void setAlpha(float f) {
            int i = (int) (255.0f * f);
            ArticleViewer.this.backgroundPaint.setAlpha(i);
            ArticleViewer.this.statusBarPaint.setAlpha(i);
            this.alpha = f;
            if (ArticleViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) ArticleViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent((ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f) ? false : true);
            }
            invalidate();
        }

        @Override // android.view.View
        @Keep
        public float getAlpha() {
            return this.alpha;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                if (ArticleViewer.this.searchField.isFocused()) {
                    ArticleViewer.this.searchField.clearFocus();
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.searchField);
                } else {
                    ArticleViewer.this.close(true, false);
                }
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class CheckForLongPress implements Runnable {
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
            if (ArticleViewer.this.pressedLink != null) {
                ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.showCopyPopup(((TextPaintUrlSpan) articleViewer2.pressedLink.getSpan()).getUrl());
                ArticleViewer.this.pressedLink = null;
                ArticleViewer.this.pressedLinkOwnerLayout = null;
                if (ArticleViewer.this.pressedLinkOwnerView != null) {
                    ArticleViewer.this.pressedLinkOwnerView.invalidate();
                    return;
                }
                return;
            }
            if (ArticleViewer.this.pressedLinkOwnerView != null) {
                ArticleViewer articleViewer3 = ArticleViewer.this;
                if (articleViewer3.textSelectionHelper.isSelectable(articleViewer3.pressedLinkOwnerView)) {
                    if (ArticleViewer.this.pressedLinkOwnerView.getTag() != null && ArticleViewer.this.pressedLinkOwnerView.getTag() == "bottomSheet" && (articleTextSelectionHelper = (articleViewer = ArticleViewer.this).textSelectionHelperBottomSheet) != null) {
                        articleTextSelectionHelper.trySelect(articleViewer.pressedLinkOwnerView);
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        articleViewer4.textSelectionHelper.trySelect(articleViewer4.pressedLinkOwnerView);
                    }
                    if (ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                        ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                        return;
                    }
                    return;
                }
            }
            if (ArticleViewer.this.pressedLinkOwnerLayout == null || ArticleViewer.this.pressedLinkOwnerView == null) {
                return;
            }
            ArticleViewer.this.windowView.performHapticFeedback(0, 2);
            int[] iArr = new int[2];
            ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
            int dp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.dp(54.0f);
            if (dp < 0) {
                dp = 0;
            }
            ArticleViewer.this.pressedLinkOwnerView.invalidate();
            ArticleViewer.this.drawBlockSelection = true;
            ArticleViewer articleViewer5 = ArticleViewer.this;
            articleViewer5.showPopup(articleViewer5.pressedLinkOwnerView, 48, 0, dp);
            ArticleViewer.this.listView[0].setLayoutFrozen(true);
            ArticleViewer.this.listView[0].setLayoutFrozen(false);
        }
    }

    private void createPaint(boolean z) {
        if (quoteLinePaint == null) {
            quoteLinePaint = new Paint();
            preformattedBackgroundPaint = new Paint();
            Paint paint = new Paint(1);
            tableLinePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            tableLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            tableHalfLinePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
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
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        webpageSearchPaint.setColor((((((float) Color.red(color)) * 0.2126f) + (((float) Color.green(color)) * 0.7152f)) + (((float) Color.blue(color)) * 0.0722f)) / 255.0f <= 0.705f ? -3041234 : -6551);
        Paint paint3 = webpageUrlPaint;
        int i = Theme.key_windowBackgroundWhiteLinkSelection;
        paint3.setColor(Theme.getColor(i) & 872415231);
        webpageUrlPaint.setPathEffect(LinkPath.getRoundedEffect());
        urlPaint.setColor(Theme.getColor(i) & 872415231);
        urlPaint.setPathEffect(LinkPath.getRoundedEffect());
        Paint paint4 = tableHalfLinePaint;
        int i2 = Theme.key_windowBackgroundWhiteInputField;
        paint4.setColor(Theme.getColor(i2));
        tableLinePaint.setColor(Theme.getColor(i2));
        photoBackgroundPaint.setColor(AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY);
        dividerPaint.setColor(Theme.getColor(Theme.key_divider));
        webpageMarkPaint.setColor(Theme.getColor(i) & 872415231);
        webpageMarkPaint.setPathEffect(LinkPath.getRoundedEffect());
        int color2 = Theme.getColor(Theme.key_switchTrack);
        int red = Color.red(color2);
        int green = Color.green(color2);
        int blue = Color.blue(color2);
        tableStripPaint.setColor(Color.argb(20, red, green, blue));
        tableHeaderPaint.setColor(Color.argb(34, red, green, blue));
        int color3 = Theme.getColor(i);
        preformattedBackgroundPaint.setColor(Color.argb(20, Color.red(color3), Color.green(color3), Color.blue(color3)));
        quoteLinePaint.setColor(Theme.getColor(Theme.key_chat_inReplyLine));
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
        builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArticleViewer.this.lambda$showCopyPopup$0(str, dialogInterface, i);
            }
        });
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3
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
        if (this.parentActivity == null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
                return;
            }
            return;
        }
        int lastIndexOf = str.lastIndexOf(35);
        if (lastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(this.adapter[0].currentPage.cached_page.url) ? this.adapter[0].currentPage.cached_page.url.toLowerCase() : this.adapter[0].currentPage.url.toLowerCase();
            try {
                str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                str2 = "";
            }
            if (str.toLowerCase().contains(lowerCase)) {
                if (TextUtils.isEmpty(str2)) {
                    this.layoutManager[0].scrollToPositionWithOffset(0, 0);
                    checkScrollAnimated();
                    return;
                }
                scrollToAnchor(str2);
                return;
            }
        }
        Browser.openUrl(this.parentActivity, str);
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
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda13
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$showPopup$2;
                    lambda$showPopup$2 = ArticleViewer.this.lambda$showPopup$2(view2, motionEvent);
                    return lambda$showPopup$2;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda39
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    ArticleViewer.this.lambda$showPopup$3(keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(false);
            TextView textView = new TextView(this.parentActivity);
            this.deleteView = textView;
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            this.deleteView.setGravity(16);
            this.deleteView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.deleteView.setTextSize(1, 15.0f);
            this.deleteView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.deleteView.setText(LocaleController.getString("Copy", R.string.Copy).toUpperCase());
            this.deleteView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda11
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
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda15
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ArticleViewer.this.lambda$showPopup$5();
                }
            });
        }
        this.deleteView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
        if (actionBarPopupWindowLayout2 != null) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        this.popupWindow.showAtLocation(view, i, i2, i3);
        this.popupWindow.startAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showPopup$2(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            view.getHitRect(this.popupRect);
            if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            this.popupWindow.dismiss();
            return false;
        }
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
                Toast.makeText(this.parentActivity, LocaleController.getString("TextCopied", R.string.TextCopied), 0).show();
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
    public TLRPC$RichText getBlockCaption(TLRPC$PageBlock tLRPC$PageBlock, int i) {
        if (i == 2) {
            TLRPC$RichText blockCaption = getBlockCaption(tLRPC$PageBlock, 0);
            if (blockCaption instanceof TLRPC$TL_textEmpty) {
                blockCaption = null;
            }
            TLRPC$RichText blockCaption2 = getBlockCaption(tLRPC$PageBlock, 1);
            if (blockCaption2 instanceof TLRPC$TL_textEmpty) {
                blockCaption2 = null;
            }
            if (blockCaption == null || blockCaption2 != null) {
                if (blockCaption != null || blockCaption2 == null) {
                    if (blockCaption == null || blockCaption2 == null) {
                        return null;
                    }
                    TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
                    tLRPC$TL_textPlain.text = " ";
                    TLRPC$TL_textConcat tLRPC$TL_textConcat = new TLRPC$TL_textConcat();
                    tLRPC$TL_textConcat.texts.add(blockCaption);
                    tLRPC$TL_textConcat.texts.add(tLRPC$TL_textPlain);
                    tLRPC$TL_textConcat.texts.add(blockCaption2);
                    return tLRPC$TL_textConcat;
                }
                return blockCaption2;
            }
            return blockCaption;
        }
        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockEmbedPost.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockEmbedPost.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
            TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockSlideshow.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockSlideshow.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
            TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockPhoto.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockPhoto.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
            TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockCollage.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockCollage.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = (TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockEmbed.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockEmbed.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
            return ((TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock).caption;
        } else {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                if (i == 0) {
                    return tLRPC$TL_pageBlockVideo.caption.text;
                }
                if (i == 1) {
                    return tLRPC$TL_pageBlockVideo.caption.credit;
                }
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                return ((TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock).caption;
            } else {
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                    TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                    if (i == 0) {
                        return tLRPC$TL_pageBlockAudio.caption.text;
                    }
                    if (i == 1) {
                        return tLRPC$TL_pageBlockAudio.caption.credit;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    return getBlockCaption(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover, i);
                } else {
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                        TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock;
                        if (i == 0) {
                            return tLRPC$TL_pageBlockMap.caption.text;
                        }
                        if (i == 1) {
                            return tLRPC$TL_pageBlockMap.caption.credit;
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
        } else if (view instanceof BlockOrderedListItemCell) {
            BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
            return blockOrderedListItemCell.blockLayout != null ? getLastNonListCell(blockOrderedListItemCell.blockLayout.itemView) : view;
        } else {
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isListItemBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        return (tLRPC$PageBlock instanceof TL_pageBlockListItem) || (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TLRPC$PageBlock getLastNonListPageBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            return tL_pageBlockListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockListItem.blockItem) : tL_pageBlockListItem.blockItem;
        } else if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
            return tL_pageBlockOrderedListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockOrderedListItem.blockItem) : tL_pageBlockOrderedListItem.blockItem;
        } else {
            return tLRPC$PageBlock;
        }
    }

    private boolean openAllParentBlocks(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
        boolean z;
        TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
        if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
            if (tLRPC$TL_pageBlockDetails.open) {
                return false;
            }
            tLRPC$TL_pageBlockDetails.open = true;
            return true;
        } else if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
            return false;
        } else {
            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
            TLRPC$PageBlock lastNonListPageBlock2 = getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
            if (lastNonListPageBlock2 instanceof TLRPC$TL_pageBlockDetails) {
                TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails2 = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock2;
                if (!tLRPC$TL_pageBlockDetails2.open) {
                    tLRPC$TL_pageBlockDetails2.open = true;
                    z = true;
                    return !openAllParentBlocks(tL_pageBlockDetailsChild2) || z;
                }
            }
            z = false;
            if (openAllParentBlocks(tL_pageBlockDetailsChild2)) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TLRPC$PageBlock fixListBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            ((TL_pageBlockListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
            return tLRPC$PageBlock;
        } else if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
            ((TL_pageBlockOrderedListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
            return tLRPC$PageBlock;
        } else {
            return tLRPC$PageBlock2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TLRPC$PageBlock wrapInTableBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
            tL_pageBlockListItem2.parent = tL_pageBlockListItem.parent;
            tL_pageBlockListItem2.blockItem = wrapInTableBlock(tL_pageBlockListItem.blockItem, tLRPC$PageBlock2);
            return tL_pageBlockListItem2;
        } else if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
            tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListItem.parent;
            tL_pageBlockOrderedListItem2.blockItem = wrapInTableBlock(tL_pageBlockOrderedListItem.blockItem, tLRPC$PageBlock2);
            return tL_pageBlockOrderedListItem2;
        } else {
            return tLRPC$PageBlock2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInterfaceForCurrentPage(TLRPC$WebPage tLRPC$WebPage, boolean z, int i) {
        TLRPC$WebPage tLRPC$WebPage2;
        int i2;
        int dp;
        if (tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null) {
            return;
        }
        if (!z && i != 0) {
            WebpageAdapter[] webpageAdapterArr = this.adapter;
            WebpageAdapter webpageAdapter = webpageAdapterArr[1];
            webpageAdapterArr[1] = webpageAdapterArr[0];
            webpageAdapterArr[0] = webpageAdapter;
            RecyclerListView[] recyclerListViewArr = this.listView;
            RecyclerListView recyclerListView = recyclerListViewArr[1];
            recyclerListViewArr[1] = recyclerListViewArr[0];
            recyclerListViewArr[0] = recyclerListView;
            LinearLayoutManager[] linearLayoutManagerArr = this.layoutManager;
            LinearLayoutManager linearLayoutManager = linearLayoutManagerArr[1];
            linearLayoutManagerArr[1] = linearLayoutManagerArr[0];
            linearLayoutManagerArr[0] = linearLayoutManager;
            int indexOfChild = this.containerView.indexOfChild(recyclerListViewArr[0]);
            int indexOfChild2 = this.containerView.indexOfChild(this.listView[1]);
            if (i == 1) {
                if (indexOfChild < indexOfChild2) {
                    this.containerView.removeView(this.listView[0]);
                    this.containerView.addView(this.listView[0], indexOfChild2);
                }
            } else if (indexOfChild2 < indexOfChild) {
                this.containerView.removeView(this.listView[0]);
                this.containerView.addView(this.listView[0], indexOfChild);
            }
            this.pageSwitchAnimation = new AnimatorSet();
            this.listView[0].setVisibility(0);
            final int i3 = i == 1 ? 0 : 1;
            this.listView[i3].setBackgroundColor(this.backgroundPaint.getColor());
            if (Build.VERSION.SDK_INT >= 18) {
                this.listView[i3].setLayerType(2, null);
            }
            if (i == 1) {
                this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.listView[0], View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f), ObjectAnimator.ofFloat(this.listView[0], View.ALPHA, 0.0f, 1.0f));
            } else if (i == -1) {
                this.listView[0].setAlpha(1.0f);
                this.listView[0].setTranslationX(0.0f);
                this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.listView[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)), ObjectAnimator.ofFloat(this.listView[1], View.ALPHA, 1.0f, 0.0f));
            }
            this.pageSwitchAnimation.setDuration(150L);
            this.pageSwitchAnimation.setInterpolator(this.interpolator);
            this.pageSwitchAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ArticleViewer.this.listView[1].setVisibility(8);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    articleViewer.textSelectionHelper.setParentView(articleViewer.listView[0]);
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    articleViewer2.textSelectionHelper.layoutManager = articleViewer2.layoutManager[0];
                    ArticleViewer.this.listView[i3].setBackgroundDrawable(null);
                    if (Build.VERSION.SDK_INT >= 18) {
                        ArticleViewer.this.listView[i3].setLayerType(0, null);
                    }
                    ArticleViewer.this.pageSwitchAnimation = null;
                }
            });
            this.pageSwitchAnimation.start();
        }
        if (!z) {
            SimpleTextView simpleTextView = this.titleTextView;
            String str = tLRPC$WebPage.site_name;
            if (str == null) {
                str = "";
            }
            simpleTextView.setText(str);
            this.textSelectionHelper.clear(true);
            this.headerView.invalidate();
        }
        if (z) {
            ArrayList<TLRPC$WebPage> arrayList = this.pagesStack;
            tLRPC$WebPage2 = arrayList.get(arrayList.size() - 2);
        } else {
            tLRPC$WebPage2 = tLRPC$WebPage;
        }
        this.adapter[z ? 1 : 0].isRtl = tLRPC$WebPage.cached_page.rtl;
        this.adapter[z ? 1 : 0].cleanup();
        this.adapter[z ? 1 : 0].currentPage = tLRPC$WebPage2;
        int size = tLRPC$WebPage2.cached_page.blocks.size();
        while (i2 < size) {
            TLRPC$PageBlock tLRPC$PageBlock = tLRPC$WebPage2.cached_page.blocks.get(i2);
            if (i2 == 0) {
                tLRPC$PageBlock.first = true;
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    TLRPC$TL_pageBlockCover tLRPC$TL_pageBlockCover = (TLRPC$TL_pageBlockCover) tLRPC$PageBlock;
                    TLRPC$RichText blockCaption = getBlockCaption(tLRPC$TL_pageBlockCover, 0);
                    TLRPC$RichText blockCaption2 = getBlockCaption(tLRPC$TL_pageBlockCover, 1);
                    if (((blockCaption != null && !(blockCaption instanceof TLRPC$TL_textEmpty)) || (blockCaption2 != null && !(blockCaption2 instanceof TLRPC$TL_textEmpty))) && size > 1) {
                        TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$WebPage2.cached_page.blocks.get(1);
                        if (tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockChannel) {
                            this.adapter[z ? 1 : 0].channelBlock = (TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2;
                        }
                    }
                }
            } else {
                i2 = (i2 == 1 && this.adapter[z ? 1 : 0].channelBlock != null) ? i2 + 1 : 0;
            }
            WebpageAdapter[] webpageAdapterArr2 = this.adapter;
            webpageAdapterArr2[z ? 1 : 0].addBlock(webpageAdapterArr2[z ? 1 : 0], tLRPC$PageBlock, 0, 0, i2 == size + (-1) ? i2 : 0);
        }
        this.adapter[z ? 1 : 0].notifyDataSetChanged();
        if (this.pagesStack.size() == 1 || i == -1) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
            String str2 = "article" + tLRPC$WebPage2.id;
            int i4 = sharedPreferences.getInt(str2, -1);
            boolean z2 = sharedPreferences.getBoolean(str2 + "r", true);
            Point point = AndroidUtilities.displaySize;
            if (z2 == (point.x > point.y)) {
                dp = sharedPreferences.getInt(str2 + "o", 0) - this.listView[z ? 1 : 0].getPaddingTop();
            } else {
                dp = AndroidUtilities.dp(10.0f);
            }
            if (i4 != -1) {
                this.layoutManager[z ? 1 : 0].scrollToPositionWithOffset(i4, dp);
            }
        } else {
            this.layoutManager[z ? 1 : 0].scrollToPositionWithOffset(0, 0);
        }
        if (z) {
            return;
        }
        checkScrollAnimated();
    }

    private boolean addPageToStack(TLRPC$WebPage tLRPC$WebPage, String str, int i) {
        saveCurrentPagePosition();
        this.pagesStack.add(tLRPC$WebPage);
        showSearch(false);
        updateInterfaceForCurrentPage(tLRPC$WebPage, false, i);
        return scrollToAnchor(str);
    }

    private boolean scrollToAnchor(String str) {
        Integer num = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Integer num2 = (Integer) this.adapter[0].anchors.get(lowerCase);
        if (num2 != null) {
            TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) this.adapter[0].anchorsParent.get(lowerCase);
            if (tLRPC$TL_textAnchor != null) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = new TLRPC$TL_pageBlockParagraph();
                tLRPC$TL_pageBlockParagraph.text = tLRPC$TL_textAnchor.text;
                int typeForBlock = this.adapter[0].getTypeForBlock(tLRPC$TL_pageBlockParagraph);
                RecyclerView.ViewHolder onCreateViewHolder = this.adapter[0].onCreateViewHolder(null, typeForBlock);
                this.adapter[0].bindBlockToHolder(typeForBlock, onCreateViewHolder, tLRPC$TL_pageBlockParagraph, 0, 0);
                BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
                builder.setApplyTopPadding(false);
                builder.setApplyBottomPadding(false);
                final LinearLayout linearLayout = new LinearLayout(this.parentActivity);
                linearLayout.setOrientation(1);
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
                this.textSelectionHelperBottomSheet = articleTextSelectionHelper;
                articleTextSelectionHelper.setParentView(linearLayout);
                this.textSelectionHelperBottomSheet.setCallback(new TextSelectionHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.3
                    @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
                    public void onStateChanged(boolean z) {
                        if (ArticleViewer.this.linkSheet != null) {
                            ArticleViewer.this.linkSheet.setDisableScroll(z);
                        }
                    }
                });
                TextView textView = new TextView(this, this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.4
                    @Override // android.widget.TextView, android.view.View
                    protected void onDraw(Canvas canvas) {
                        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
                        super.onDraw(canvas);
                    }
                };
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setText(LocaleController.getString("InstantViewReference", R.string.InstantViewReference));
                textView.setGravity((this.adapter[0].isRtl ? 5 : 3) | 16);
                textView.setTextColor(getTextColor());
                textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                onCreateViewHolder.itemView.setTag("bottomSheet");
                linearLayout.addView(onCreateViewHolder.itemView, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = this.textSelectionHelperBottomSheet.getOverlayView(this.parentActivity);
                FrameLayout frameLayout = new FrameLayout(this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.5
                    @Override // android.view.ViewGroup, android.view.View
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        TextSelectionHelper<Cell>.TextSelectionOverlay overlayView2 = ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext());
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
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredHeight() + AndroidUtilities.dp(8.0f), 1073741824));
                    }
                };
                builder.setDelegate(new BottomSheet.BottomSheetDelegate() { // from class: org.telegram.ui.ArticleViewer.6
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
            } else if (num2.intValue() >= 0 && num2.intValue() < this.adapter[0].blocks.size()) {
                TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) this.adapter[0].blocks.get(num2.intValue());
                TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
                if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.adapter[0].updateRows();
                    this.adapter[0].notifyDataSetChanged();
                }
                int indexOf = this.adapter[0].localBlocks.indexOf(tLRPC$PageBlock);
                if (indexOf != -1) {
                    num2 = Integer.valueOf(indexOf);
                }
                Integer num3 = (Integer) this.adapter[0].anchorsOffset.get(lowerCase);
                if (num3 != null) {
                    if (num3.intValue() == -1) {
                        int typeForBlock2 = this.adapter[0].getTypeForBlock(tLRPC$PageBlock);
                        RecyclerView.ViewHolder onCreateViewHolder2 = this.adapter[0].onCreateViewHolder(null, typeForBlock2);
                        this.adapter[0].bindBlockToHolder(typeForBlock2, onCreateViewHolder2, tLRPC$PageBlock, 0, 0);
                        onCreateViewHolder2.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.listView[0].getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Integer num4 = (Integer) this.adapter[0].anchorsOffset.get(lowerCase);
                        if (num4.intValue() != -1) {
                            num = num4;
                        }
                    } else {
                        num = num3;
                    }
                }
                this.layoutManager[0].scrollToPositionWithOffset(num2.intValue(), (this.currentHeaderHeight - AndroidUtilities.dp(56.0f)) - num.intValue());
            }
            return true;
        }
        return false;
    }

    private boolean removeLastPageFromStack() {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        ArrayList<TLRPC$WebPage> arrayList = this.pagesStack;
        arrayList.remove(arrayList.size() - 1);
        ArrayList<TLRPC$WebPage> arrayList2 = this.pagesStack;
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

    private int getTextFlags(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 4;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 2;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 1;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 16;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 32;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            if (((TLRPC$TL_textUrl) tLRPC$RichText).webpage_id != 0) {
                return getTextFlags(tLRPC$RichText.parentRichText) | LiteMode.FLAG_CALLS_ANIMATIONS;
            }
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 128;
        } else {
            if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
                return getTextFlags(tLRPC$RichText.parentRichText) | LiteMode.FLAG_CHAT_BLUR;
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
                return getTextFlags(tLRPC$RichText.parentRichText) | 64;
            }
            if (tLRPC$RichText != null) {
                return getTextFlags(tLRPC$RichText.parentRichText);
            }
            return 0;
        }
    }

    private TLRPC$RichText getLastRichText(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText == null) {
            return null;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getLastRichText(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getLastRichText(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getLastRichText(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getLastRichText(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getLastRichText(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getLastRichText(((TLRPC$TL_textEmail) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return getLastRichText(((TLRPC$TL_textUrl) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textAnchor) {
            getLastRichText(((TLRPC$TL_textAnchor) tLRPC$RichText).text);
            return tLRPC$RichText;
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getLastRichText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
        } else {
            if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
                return getLastRichText(((TLRPC$TL_textSuperscript) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
                return getLastRichText(((TLRPC$TL_textMarked) tLRPC$RichText).text);
            }
            return tLRPC$RichText instanceof TLRPC$TL_textPhone ? getLastRichText(((TLRPC$TL_textPhone) tLRPC$RichText).text) : tLRPC$RichText;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getText(WebpageAdapter webpageAdapter, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.text.SpannableStringBuilder] */
    public CharSequence getText(TLRPC$WebPage tLRPC$WebPage, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        int i2;
        int i3;
        Object textPaintUrlSpan;
        Object textPaintUrlSpan2;
        TextPaint textPaint = null;
        if (tLRPC$RichText2 == null) {
            return null;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textFixed) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textFixed) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textItalic) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textItalic) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textBold) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textBold) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textUnderline) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textUnderline) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textStrike) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textStrike) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textEmail) tLRPC$RichText2).text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock);
                }
                spannableStringBuilder.setSpan(new TextPaintUrlSpan(textPaint, "mailto:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
            TLRPC$TL_textUrl tLRPC$TL_textUrl = (TLRPC$TL_textUrl) tLRPC$RichText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textUrl.text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            TextPaint textPaint2 = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null;
            if (tLRPC$TL_textUrl.webpage_id != 0) {
                textPaintUrlSpan2 = new TextPaintWebpageUrlSpan(textPaint2, getUrl(tLRPC$RichText2));
            } else {
                textPaintUrlSpan2 = new TextPaintUrlSpan(textPaint2, getUrl(tLRPC$RichText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(textPaintUrlSpan2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPlain) {
            return ((TLRPC$TL_textPlain) tLRPC$RichText2).text;
        } else {
            if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
                TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) tLRPC$RichText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textAnchor.text, tLRPC$PageBlock, i));
                spannableStringBuilder3.setSpan(new AnchorSpan(tLRPC$TL_textAnchor.name), 0, spannableStringBuilder3.length(), 17);
                return spannableStringBuilder3;
            }
            ?? r2 = "";
            if (tLRPC$RichText2 instanceof TLRPC$TL_textEmpty) {
                return "";
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                int size = tLRPC$RichText2.texts.size();
                int i4 = 0;
                while (i4 < size) {
                    TLRPC$RichText tLRPC$RichText3 = tLRPC$RichText2.texts.get(i4);
                    TLRPC$RichText lastRichText = getLastRichText(tLRPC$RichText3);
                    boolean z = i >= 0 && (tLRPC$RichText3 instanceof TLRPC$TL_textUrl) && ((TLRPC$TL_textUrl) tLRPC$RichText3).webpage_id != j;
                    if (z && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    int i5 = i4;
                    int i6 = size;
                    CharSequence text = getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$RichText3, tLRPC$PageBlock, i);
                    int textFlags = getTextFlags(lastRichText);
                    int length = spannableStringBuilder4.length();
                    spannableStringBuilder4.append(text);
                    if (textFlags != 0 && !(text instanceof SpannableStringBuilder)) {
                        if ((textFlags & 8) != 0 || (textFlags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            String url = getUrl(tLRPC$RichText3);
                            if (url == null) {
                                url = getUrl(tLRPC$RichText);
                            }
                            if ((textFlags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                                textPaintUrlSpan = new TextPaintWebpageUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                            } else {
                                textPaintUrlSpan = new TextPaintUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                            }
                            if (length != spannableStringBuilder4.length()) {
                                spannableStringBuilder4.setSpan(textPaintUrlSpan, length, spannableStringBuilder4.length(), 33);
                            }
                        } else if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock)), length, spannableStringBuilder4.length(), 33);
                        }
                    }
                    if (z && i5 != i6 - 1) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    i4 = i5 + 1;
                    size = i6;
                    j = 0;
                }
                return spannableStringBuilder4;
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
                return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text, tLRPC$PageBlock, i);
            } else {
                if (tLRPC$RichText2 instanceof TLRPC$TL_textSuperscript) {
                    return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textSuperscript) tLRPC$RichText2).text, tLRPC$PageBlock, i);
                }
                if (tLRPC$RichText2 instanceof TLRPC$TL_textMarked) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textMarked) tLRPC$RichText2).text, tLRPC$PageBlock, i));
                    MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
                    if (spannableStringBuilder5.length() != 0) {
                        spannableStringBuilder5.setSpan(new TextPaintMarkSpan((metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null), 0, spannableStringBuilder5.length(), 33);
                    }
                    return spannableStringBuilder5;
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textPhone) tLRPC$RichText2).text, tLRPC$PageBlock, i));
                    MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder6.getSpans(0, spannableStringBuilder6.length(), MetricAffectingSpan.class);
                    if (spannableStringBuilder6.length() != 0) {
                        TextPaint textPaint3 = (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null;
                        spannableStringBuilder6.setSpan(new TextPaintUrlSpan(textPaint3, "tel:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder6.length(), 33);
                    }
                    return spannableStringBuilder6;
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textImage) {
                    TLRPC$TL_textImage tLRPC$TL_textImage = (TLRPC$TL_textImage) tLRPC$RichText2;
                    TLRPC$Document documentWithId = WebPageUtils.getDocumentWithId(tLRPC$WebPage, tLRPC$TL_textImage.document_id);
                    if (documentWithId != null) {
                        r2 = new SpannableStringBuilder("*");
                        int dp = AndroidUtilities.dp(tLRPC$TL_textImage.w);
                        int dp2 = AndroidUtilities.dp(tLRPC$TL_textImage.h);
                        int abs = Math.abs(i);
                        if (dp > abs) {
                            i2 = (int) (dp2 * (abs / dp));
                            i3 = abs;
                        } else {
                            i2 = dp2;
                            i3 = dp;
                        }
                        if (view != null) {
                            int color = Theme.getColor(Theme.key_windowBackgroundWhite);
                            r2.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, tLRPC$WebPage, i3, i2, false, (((((float) Color.red(color)) * 0.2126f) + (((float) Color.green(color)) * 0.7152f)) + (((float) Color.blue(color)) * 0.0722f)) / 255.0f <= 0.705f), 0, r2.length(), 33);
                        }
                    }
                    return r2;
                } else {
                    return "not supported " + tLRPC$RichText2;
                }
            }
        }
    }

    public static CharSequence getPlainText(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText == null) {
            return "";
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getPlainText(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getPlainText(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getPlainText(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getPlainText(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getPlainText(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getPlainText(((TLRPC$TL_textEmail) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return getPlainText(((TLRPC$TL_textUrl) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPlain) {
            return ((TLRPC$TL_textPlain) tLRPC$RichText).text;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textAnchor) {
            return getPlainText(((TLRPC$TL_textAnchor) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmpty) {
            return "";
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textConcat) {
            StringBuilder sb = new StringBuilder();
            int size = tLRPC$RichText.texts.size();
            for (int i = 0; i < size; i++) {
                sb.append(getPlainText(tLRPC$RichText.texts.get(i)));
            }
            return sb;
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getPlainText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
        } else {
            if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
                return getPlainText(((TLRPC$TL_textSuperscript) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
                return getPlainText(((TLRPC$TL_textMarked) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
                return getPlainText(((TLRPC$TL_textPhone) tLRPC$RichText).text);
            }
            boolean z = tLRPC$RichText instanceof TLRPC$TL_textImage;
            return "";
        }
    }

    public static String getUrl(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getUrl(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getUrl(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getUrl(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getUrl(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getUrl(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return ((TLRPC$TL_textEmail) tLRPC$RichText).email;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return ((TLRPC$TL_textUrl) tLRPC$RichText).url;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
            return ((TLRPC$TL_textPhone) tLRPC$RichText).phone;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        return Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLinkTextColor() {
        return Theme.getColor(Theme.key_windowBackgroundWhiteLinkText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getGrayTextColor() {
        return Theme.getColor(Theme.key_windowBackgroundWhiteGrayText);
    }

    private TextPaint getTextPaint(TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock) {
        int textColor;
        SparseArray<TextPaint> sparseArray;
        int dp;
        SparseArray<TextPaint> sparseArray2;
        int dp2;
        SparseArray<TextPaint> sparseArray3;
        int dp3;
        SparseArray<TextPaint> sparseArray4;
        int dp4;
        SparseArray<TextPaint> sparseArray5;
        int dp5;
        SparseArray<TextPaint> sparseArray6;
        int dp6;
        SparseArray<TextPaint> sparseArray7;
        int dp7;
        int textFlags = getTextFlags(tLRPC$RichText2);
        int dp8 = AndroidUtilities.dp(14.0f);
        int dp9 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        SparseArray<TextPaint> sparseArray8 = null;
        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
            TLRPC$RichText tLRPC$RichText3 = ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText3 == tLRPC$RichText2 || tLRPC$RichText3 == tLRPC$RichText) {
                sparseArray7 = photoCaptionTextPaints;
                dp7 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray7 = photoCreditTextPaints;
                dp7 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray7;
            dp8 = dp7;
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
            TLRPC$RichText tLRPC$RichText4 = ((TLRPC$TL_pageBlockMap) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText4 == tLRPC$RichText2 || tLRPC$RichText4 == tLRPC$RichText) {
                sparseArray6 = photoCaptionTextPaints;
                dp6 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray6 = photoCreditTextPaints;
                dp6 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray6;
            dp8 = dp6;
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
            sparseArray8 = titleTextPaints;
            dp8 = AndroidUtilities.dp(23.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
            sparseArray8 = kickerTextPaints;
            dp8 = AndroidUtilities.dp(14.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
            sparseArray8 = authorTextPaints;
            dp8 = AndroidUtilities.dp(14.0f);
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
            sparseArray8 = footerTextPaints;
            dp8 = AndroidUtilities.dp(14.0f);
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
            sparseArray8 = subtitleTextPaints;
            dp8 = AndroidUtilities.dp(20.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
            sparseArray8 = headerTextPaints;
            dp8 = AndroidUtilities.dp(20.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
            sparseArray8 = subheaderTextPaints;
            dp8 = AndroidUtilities.dp(17.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
            TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = (TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockBlockquote.text == tLRPC$RichText) {
                sparseArray8 = quoteTextPaints;
                dp8 = AndroidUtilities.dp(15.0f);
                textColor = getTextColor();
            } else {
                if (tLRPC$TL_pageBlockBlockquote.caption == tLRPC$RichText) {
                    sparseArray8 = photoCaptionTextPaints;
                    dp8 = AndroidUtilities.dp(14.0f);
                    textColor = getGrayTextColor();
                }
                textColor = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
            TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = (TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockPullquote.text == tLRPC$RichText) {
                sparseArray8 = quoteTextPaints;
                dp8 = AndroidUtilities.dp(15.0f);
                textColor = getTextColor();
            } else {
                if (tLRPC$TL_pageBlockPullquote.caption == tLRPC$RichText) {
                    sparseArray8 = photoCaptionTextPaints;
                    dp8 = AndroidUtilities.dp(14.0f);
                    textColor = getGrayTextColor();
                }
                textColor = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
            sparseArray8 = preformattedTextPaints;
            dp8 = AndroidUtilities.dp(14.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
            sparseArray8 = paragraphTextPaints;
            dp8 = AndroidUtilities.dp(16.0f);
            textColor = getTextColor();
        } else if (isListItemBlock(tLRPC$PageBlock)) {
            sparseArray8 = listTextPaints;
            dp8 = AndroidUtilities.dp(16.0f);
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
            TLRPC$RichText tLRPC$RichText5 = ((TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText5 == tLRPC$RichText2 || tLRPC$RichText5 == tLRPC$RichText) {
                sparseArray5 = photoCaptionTextPaints;
                dp5 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray5 = photoCreditTextPaints;
                dp5 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray5;
            dp8 = dp5;
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
            TLRPC$RichText tLRPC$RichText6 = ((TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText6 == tLRPC$RichText2 || tLRPC$RichText6 == tLRPC$RichText) {
                sparseArray4 = photoCaptionTextPaints;
                dp4 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray4 = photoCreditTextPaints;
                dp4 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray4;
            dp8 = dp4;
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
            TLRPC$RichText tLRPC$RichText7 = ((TLRPC$TL_pageBlockCollage) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText7 == tLRPC$RichText2 || tLRPC$RichText7 == tLRPC$RichText) {
                sparseArray3 = photoCaptionTextPaints;
                dp3 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray3 = photoCreditTextPaints;
                dp3 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray3;
            dp8 = dp3;
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = ((TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock).caption;
            if (tLRPC$RichText2 == tLRPC$TL_pageCaption.text) {
                sparseArray8 = photoCaptionTextPaints;
                dp8 = AndroidUtilities.dp(14.0f);
                textColor = getGrayTextColor();
            } else if (tLRPC$RichText2 == tLRPC$TL_pageCaption.credit) {
                sparseArray8 = photoCreditTextPaints;
                dp8 = AndroidUtilities.dp(12.0f);
                textColor = getGrayTextColor();
            } else {
                if (tLRPC$RichText2 != null) {
                    sparseArray8 = embedPostTextPaints;
                    dp8 = AndroidUtilities.dp(14.0f);
                    textColor = getTextColor();
                }
                textColor = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
            if (tLRPC$RichText2 == ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).caption.text) {
                sparseArray2 = mediaCaptionTextPaints;
                dp2 = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray2 = mediaCreditTextPaints;
                dp2 = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray2;
            dp8 = dp2;
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
            if (tLRPC$RichText2 == ((TLRPC$TL_pageBlockAudio) tLRPC$PageBlock).caption.text) {
                sparseArray = mediaCaptionTextPaints;
                dp = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray = mediaCreditTextPaints;
                dp = AndroidUtilities.dp(12.0f);
            }
            sparseArray8 = sparseArray;
            dp8 = dp;
            textColor = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
            sparseArray8 = relatedArticleTextPaints;
            dp8 = AndroidUtilities.dp(15.0f);
            textColor = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
            sparseArray8 = detailsTextPaints;
            dp8 = AndroidUtilities.dp(15.0f);
            textColor = getTextColor();
        } else {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                sparseArray8 = tableTextPaints;
                dp8 = AndroidUtilities.dp(15.0f);
                textColor = getTextColor();
            }
            textColor = -65536;
        }
        int i = textFlags & LiteMode.FLAG_CHAT_BLUR;
        if (i != 0 || (textFlags & 128) != 0) {
            dp8 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray8 == null) {
            if (errorTextPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                errorTextPaint = textPaint;
                textPaint.setColor(-65536);
            }
            errorTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
            return errorTextPaint;
        }
        TextPaint textPaint2 = sparseArray8.get(textFlags);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((textFlags & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            } else if (this.selectedFont != 1 && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader)) {
                int i2 = textFlags & 1;
                if (i2 != 0 && (textFlags & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC));
                } else if (i2 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                } else if ((textFlags & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader)) {
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
            if ((textFlags & 8) != 0 || (textFlags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                textPaint2.setFlags(textPaint2.getFlags());
                textColor = getLinkTextColor();
            }
            if (i != 0) {
                textPaint2.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if ((textFlags & 128) != 0) {
                textPaint2.baselineShift += AndroidUtilities.dp(2.0f);
            }
            textPaint2.setColor(textColor);
            sparseArray8.put(textFlags, textPaint2);
        }
        textPaint2.setTextSize(dp8 + dp9);
        return textPaint2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, 0, tLRPC$PageBlock, alignment, 0, webpageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, i2, tLRPC$PageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:51|(3:52|53|(3:57|(3:(2:61|62)(2:64|65)|63|58)|66))|68|(2:69|70)|(10:74|75|76|(5:79|(1:81)(1:91)|(3:(1:84)(1:88)|85|86)(2:89|90)|87|77)|92|93|94|95|(7:99|101|102|(5:105|(1:107)(1:117)|(3:(1:110)(1:114)|111|112)(2:115|116)|113|103)|118|119|120)|123)|130|94|95|(8:97|99|101|102|(1:103)|118|119|120)|123) */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037f A[Catch: Exception -> 0x03bd, TryCatch #1 {Exception -> 0x03bd, blocks: (B:139:0x0378, B:140:0x037c, B:142:0x037f, B:144:0x0396, B:150:0x03a9, B:152:0x03b1, B:153:0x03ba), top: B:166:0x0378 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        TextPaint textPaint;
        StaticLayout staticLayout;
        LinkPath linkPath;
        LinkPath linkPath2;
        TextPaintMarkSpan[] textPaintMarkSpanArr;
        LinkPath linkPath3;
        int i4;
        int i5;
        TextPaintWebpageUrlSpan[] textPaintWebpageUrlSpanArr;
        int i6;
        LinkPath linkPath4 = null;
        if (charSequence == null && (tLRPC$RichText == null || (tLRPC$RichText instanceof TLRPC$TL_textEmpty))) {
            return null;
        }
        int dp = i < 0 ? AndroidUtilities.dp(10.0f) : i;
        CharSequence text = charSequence != null ? charSequence : getText(webpageAdapter, view, tLRPC$RichText, tLRPC$RichText, tLRPC$PageBlock, dp);
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) && tLRPC$RichText == null) {
            if (((TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock).author == charSequence) {
                if (embedPostAuthorPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    embedPostAuthorPaint = textPaint2;
                    textPaint2.setColor(getTextColor());
                }
                embedPostAuthorPaint.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                textPaint = embedPostAuthorPaint;
            } else {
                if (embedPostDatePaint == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    embedPostDatePaint = textPaint3;
                    textPaint3.setColor(getGrayTextColor());
                }
                embedPostDatePaint.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                textPaint = embedPostDatePaint;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockChannel) {
            if (channelNamePaint == null) {
                TextPaint textPaint4 = new TextPaint(1);
                channelNamePaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                TextPaint textPaint5 = new TextPaint(1);
                channelNamePhotoPaint = textPaint5;
                textPaint5.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            }
            channelNamePaint.setColor(getTextColor());
            channelNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
            channelNamePhotoPaint.setColor(-1);
            channelNamePhotoPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint = webpageAdapter.channelBlock != null ? channelNamePhotoPaint : channelNamePaint;
        } else if (tLRPC$PageBlock instanceof TL_pageBlockRelatedArticlesChild) {
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) tLRPC$PageBlock;
            if (charSequence == tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).title) {
                if (relatedArticleHeaderPaint == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    relatedArticleHeaderPaint = textPaint6;
                    textPaint6.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                }
                relatedArticleHeaderPaint.setColor(getTextColor());
                relatedArticleHeaderPaint.setTextSize(AndroidUtilities.dp(15.0f) + dp2);
                textPaint = relatedArticleHeaderPaint;
            } else {
                if (relatedArticleTextPaint == null) {
                    relatedArticleTextPaint = new TextPaint(1);
                }
                relatedArticleTextPaint.setColor(getGrayTextColor());
                relatedArticleTextPaint.setTextSize(AndroidUtilities.dp(14.0f) + dp2);
                textPaint = relatedArticleTextPaint;
            }
        } else if (isListItemBlock(tLRPC$PageBlock) && charSequence != null) {
            if (listTextPointerPaint == null) {
                TextPaint textPaint7 = new TextPaint(1);
                listTextPointerPaint = textPaint7;
                textPaint7.setColor(getTextColor());
            }
            if (listTextNumPaint == null) {
                TextPaint textPaint8 = new TextPaint(1);
                listTextNumPaint = textPaint8;
                textPaint8.setColor(getTextColor());
            }
            listTextPointerPaint.setTextSize(AndroidUtilities.dp(19.0f) + dp2);
            listTextNumPaint.setTextSize(AndroidUtilities.dp(16.0f) + dp2);
            if ((tLRPC$PageBlock instanceof TL_pageBlockListItem) && !((TL_pageBlockListItem) tLRPC$PageBlock).parent.pageBlockList.ordered) {
                textPaint = listTextPointerPaint;
            } else {
                textPaint = listTextNumPaint;
            }
        } else {
            textPaint = getTextPaint(tLRPC$RichText, tLRPC$RichText, tLRPC$PageBlock);
        }
        TextPaint textPaint9 = textPaint;
        CharSequence replaceEmoji = Emoji.replaceEmoji(text, textPaint9.getFontMetricsInt(), false, (int[]) null, 1);
        if (i3 != 0) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                staticLayout = StaticLayoutEx.createStaticLayout(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp, i3);
            } else {
                staticLayout = StaticLayoutEx.createStaticLayout(replaceEmoji, textPaint9, dp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, dp, i3);
            }
        } else {
            if (replaceEmoji.charAt(replaceEmoji.length() - 1) == '\n') {
                replaceEmoji = replaceEmoji.subSequence(0, replaceEmoji.length() - 1);
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                staticLayout = new StaticLayout(replaceEmoji, textPaint9, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                staticLayout = new StaticLayout(replaceEmoji, textPaint9, dp, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
            }
        }
        if (staticLayout == null) {
            return null;
        }
        CharSequence text2 = staticLayout.getText();
        if (i2 >= 0 && !this.searchResults.isEmpty() && this.searchText != null) {
            String lowerCase = replaceEmoji.toString().toLowerCase();
            int i7 = 0;
            while (true) {
                int indexOf = lowerCase.indexOf(this.searchText, i7);
                if (indexOf < 0) {
                    break;
                }
                int length = this.searchText.length() + indexOf;
                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                    this.adapter[0].searchTextOffset.put(this.searchText + tLRPC$PageBlock + tLRPC$RichText + indexOf, Integer.valueOf(i2 + staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf))));
                }
                i7 = length;
            }
        }
        if (text2 instanceof Spanned) {
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
            try {
                textPaintWebpageUrlSpanArr = (TextPaintWebpageUrlSpan[]) spanned.getSpans(0, spanned.length(), TextPaintWebpageUrlSpan.class);
            } catch (Exception unused2) {
            }
            if (textPaintWebpageUrlSpanArr != null && textPaintWebpageUrlSpanArr.length > 0) {
                linkPath2 = new LinkPath(true);
                try {
                    linkPath2.setAllowReset(false);
                    for (int i9 = 0; i9 < textPaintWebpageUrlSpanArr.length; i9++) {
                        int spanStart = spanned.getSpanStart(textPaintWebpageUrlSpanArr[i9]);
                        int spanEnd = spanned.getSpanEnd(textPaintWebpageUrlSpanArr[i9]);
                        linkPath2.setCurrentLayout(staticLayout, spanStart, 0.0f);
                        int i10 = textPaintWebpageUrlSpanArr[i9].getTextPaint() != null ? textPaintWebpageUrlSpanArr[i9].getTextPaint().baselineShift : 0;
                        if (i10 != 0) {
                            i6 = i10 + AndroidUtilities.dp(i10 > 0 ? 5.0f : -2.0f);
                        } else {
                            i6 = 0;
                        }
                        linkPath2.setBaselineShift(i6);
                        staticLayout.getSelectionPath(spanStart, spanEnd, linkPath2);
                    }
                    linkPath2.setAllowReset(true);
                } catch (Exception unused3) {
                }
                textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
                if (textPaintMarkSpanArr != null && textPaintMarkSpanArr.length > 0) {
                    linkPath3 = new LinkPath(true);
                    try {
                        linkPath3.setAllowReset(false);
                        for (i4 = 0; i4 < textPaintMarkSpanArr.length; i4++) {
                            int spanStart2 = spanned.getSpanStart(textPaintMarkSpanArr[i4]);
                            int spanEnd2 = spanned.getSpanEnd(textPaintMarkSpanArr[i4]);
                            linkPath3.setCurrentLayout(staticLayout, spanStart2, 0.0f);
                            int i11 = textPaintMarkSpanArr[i4].getTextPaint() != null ? textPaintMarkSpanArr[i4].getTextPaint().baselineShift : 0;
                            if (i11 != 0) {
                                i5 = i11 + AndroidUtilities.dp(i11 > 0 ? 5.0f : -2.0f);
                            } else {
                                i5 = 0;
                            }
                            linkPath3.setBaselineShift(i5);
                            staticLayout.getSelectionPath(spanStart2, spanEnd2, linkPath3);
                        }
                        linkPath3.setAllowReset(true);
                    } catch (Exception unused4) {
                    }
                    linkPath4 = linkPath3;
                }
                linkPath = linkPath4;
                linkPath4 = linkPath2;
            }
            linkPath2 = null;
            textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
            if (textPaintMarkSpanArr != null) {
                linkPath3 = new LinkPath(true);
                linkPath3.setAllowReset(false);
                while (i4 < textPaintMarkSpanArr.length) {
                }
                linkPath3.setAllowReset(true);
                linkPath4 = linkPath3;
            }
            linkPath = linkPath4;
            linkPath4 = linkPath2;
        } else {
            linkPath = null;
        }
        DrawingText drawingText = new DrawingText();
        drawingText.textLayout = staticLayout;
        drawingText.textPath = linkPath4;
        drawingText.markPath = linkPath;
        drawingText.parentBlock = tLRPC$PageBlock;
        drawingText.parentText = tLRPC$RichText;
        return drawingText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d7, code lost:
        if (r0.isShowing() == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean checkLayoutForLinks(WebpageAdapter webpageAdapter, MotionEvent motionEvent, View view, DrawingText drawingText, int i, int i2) {
        boolean z;
        boolean z2;
        String str;
        int i3;
        if (this.pageSwitchAnimation == null && view != null && this.textSelectionHelper.isSelectable(view)) {
            this.pressedLinkOwnerView = view;
            if (drawingText != null) {
                StaticLayout staticLayout = drawingText.textLayout;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                String str2 = null;
                if (motionEvent.getAction() == 0) {
                    float f = 2.14748365E9f;
                    int lineCount = staticLayout.getLineCount();
                    float f2 = 0.0f;
                    for (int i4 = 0; i4 < lineCount; i4++) {
                        f2 = Math.max(staticLayout.getLineWidth(i4), f2);
                        f = Math.min(staticLayout.getLineLeft(i4), f);
                    }
                    float f3 = x;
                    float f4 = i + f;
                    if (f3 >= f4 && f3 <= f4 + f2 && y >= i2 && y <= staticLayout.getHeight() + i2) {
                        this.pressedLinkOwnerLayout = drawingText;
                        this.pressedLayoutY = i2;
                        if (staticLayout.getText() instanceof Spannable) {
                            int i5 = x - i;
                            try {
                                int lineForVertical = staticLayout.getLineForVertical(y - i2);
                                float f5 = i5;
                                int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f5);
                                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                                if (lineLeft <= f5 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f5) {
                                    Spannable spannable = (Spannable) staticLayout.getText();
                                    TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TextPaintUrlSpan.class);
                                    if (textPaintUrlSpanArr != null && textPaintUrlSpanArr.length > 0) {
                                        TextPaintUrlSpan textPaintUrlSpan = textPaintUrlSpanArr[0];
                                        int spanStart = spannable.getSpanStart(textPaintUrlSpan);
                                        int spanEnd = spannable.getSpanEnd(textPaintUrlSpan);
                                        for (int i6 = 1; i6 < textPaintUrlSpanArr.length; i6++) {
                                            TextPaintUrlSpan textPaintUrlSpan2 = textPaintUrlSpanArr[i6];
                                            int spanStart2 = spannable.getSpanStart(textPaintUrlSpan2);
                                            int spanEnd2 = spannable.getSpanEnd(textPaintUrlSpan2);
                                            if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                                spanEnd = spanEnd2;
                                                textPaintUrlSpan = textPaintUrlSpan2;
                                                spanStart = spanStart2;
                                            }
                                        }
                                        LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable = this.pressedLink;
                                        if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != textPaintUrlSpan) {
                                            LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable2 = this.pressedLink;
                                            if (linkSpanDrawable2 != null) {
                                                this.links.removeLink(linkSpanDrawable2);
                                            }
                                            LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable3 = new LinkSpanDrawable<>(textPaintUrlSpan, null, f3, y);
                                            this.pressedLink = linkSpanDrawable3;
                                            linkSpanDrawable3.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection) & 872415231);
                                            this.links.addLink(this.pressedLink, this.pressedLinkOwnerLayout);
                                            try {
                                                LinkPath obtainNewPath = this.pressedLink.obtainNewPath();
                                                obtainNewPath.setCurrentLayout(staticLayout, spanStart, 0.0f);
                                                TextPaint textPaint = textPaintUrlSpan.getTextPaint();
                                                int i7 = textPaint != null ? textPaint.baselineShift : 0;
                                                if (i7 != 0) {
                                                    i3 = i7 + AndroidUtilities.dp(i7 > 0 ? 5.0f : -2.0f);
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
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable4 = this.pressedLink;
                        if (linkSpanDrawable4 != null) {
                            String url = linkSpanDrawable4.getSpan().getUrl();
                            if (url != null) {
                                BottomSheet bottomSheet = this.linkSheet;
                                if (bottomSheet != null) {
                                    bottomSheet.dismiss();
                                    this.linkSheet = null;
                                }
                                int lastIndexOf = url.lastIndexOf(35);
                                if (lastIndexOf != -1) {
                                    String lowerCase = !TextUtils.isEmpty(webpageAdapter.currentPage.cached_page.url) ? webpageAdapter.currentPage.cached_page.url.toLowerCase() : webpageAdapter.currentPage.url.toLowerCase();
                                    try {
                                        str = URLDecoder.decode(url.substring(lastIndexOf + 1), "UTF-8");
                                    } catch (Exception unused) {
                                        str = "";
                                    }
                                    str2 = str;
                                    if (url.toLowerCase().contains(lowerCase)) {
                                        if (TextUtils.isEmpty(str2)) {
                                            this.layoutManager[0].scrollToPositionWithOffset(0, 0);
                                            checkScrollAnimated();
                                        } else {
                                            scrollToAnchor(str2);
                                        }
                                        z2 = true;
                                        if (!z2) {
                                            openWebpageUrl(this.pressedLink.getSpan().getUrl(), str2);
                                        }
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                }
                            }
                        }
                    } else {
                        if (motionEvent.getAction() == 3) {
                            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
                            if (actionBarPopupWindow != null) {
                            }
                        }
                        z = false;
                        if (z) {
                            removePressedLink();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                z = false;
                if (z) {
                }
            }
            if (motionEvent.getAction() == 0) {
                startCheckLongPress(motionEvent.getX(), motionEvent.getY(), view);
            }
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                cancelCheckLongPress();
            }
            return view instanceof BlockDetailsCell ? this.pressedLink != null : this.pressedLinkOwnerLayout != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePressedLink() {
        if (this.pressedLink == null && this.pressedLinkOwnerView == null) {
            return;
        }
        View view = this.pressedLinkOwnerView;
        this.links.clear();
        this.pressedLink = null;
        this.pressedLinkOwnerLayout = null;
        this.pressedLinkOwnerView = null;
        if (view != null) {
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openWebpageUrl(String str, final String str2) {
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        final int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
        tLRPC$TL_messages_getWebPage.url = str;
        tLRPC$TL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda34
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$openWebpageUrl$7(i, str2, tLRPC$TL_messages_getWebPage, tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrl$7(final int i, final String str, final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$openWebpageUrl$6(i, tLObject, str, tLRPC$TL_messages_getWebPage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openWebpageUrl$6(int i, TLObject tLObject, String str, TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage) {
        if (this.openUrlReqId == 0 || i != this.lastReqId) {
            return;
        }
        this.openUrlReqId = 0;
        showProgressView(true, false);
        if (this.isVisible) {
            if (tLObject instanceof TLRPC$TL_webPage) {
                TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject;
                if (tLRPC$TL_webPage.cached_page instanceof TLRPC$TL_page) {
                    addPageToStack(tLRPC$TL_webPage, str, 1);
                    return;
                }
            }
            Browser.openUrl(this.parentActivity, tLRPC$TL_messages_getWebPage.url);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        BlockAudioCell blockAudioCell;
        MessageObject messageObject;
        if (i == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.listView == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                RecyclerListView[] recyclerListViewArr = this.listView;
                if (i3 >= recyclerListViewArr.length) {
                    return;
                }
                int childCount = recyclerListViewArr[i3].getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.listView[i3].getChildAt(i4);
                    if (childAt instanceof BlockAudioCell) {
                        ((BlockAudioCell) childAt).updateButtonState(true);
                    }
                }
                i3++;
            }
        } else if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.listView == null) {
                return;
            }
            int i5 = 0;
            while (true) {
                RecyclerListView[] recyclerListViewArr2 = this.listView;
                if (i5 >= recyclerListViewArr2.length) {
                    return;
                }
                int childCount2 = recyclerListViewArr2[i5].getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = this.listView[i5].getChildAt(i6);
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
            if (this.listView == null) {
                return;
            }
            int i7 = 0;
            while (true) {
                RecyclerListView[] recyclerListViewArr3 = this.listView;
                if (i7 >= recyclerListViewArr3.length) {
                    return;
                }
                int childCount3 = recyclerListViewArr3[i7].getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 < childCount3) {
                        View childAt3 = this.listView[i7].getChildAt(i8);
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
        }
    }

    public void updateThemeColors(float f) {
        refreshThemeColors();
        updatePaintColors();
        if (this.windowView != null) {
            this.listView[0].invalidateViews();
            this.listView[1].invalidateViews();
            this.windowView.invalidate();
            this.searchPanel.invalidate();
            if (f == 1.0f) {
                this.adapter[0].notifyDataSetChanged();
                this.adapter[1].notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePaintSize() {
        for (int i = 0; i < 2; i++) {
            this.adapter[i].notifyDataSetChanged();
        }
    }

    private void updatePaintFonts() {
        ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", this.selectedFont).commit();
        int i = this.selectedFont;
        Typeface typeface = i == 0 ? Typeface.DEFAULT : Typeface.SERIF;
        Typeface typeface2 = i == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
        Typeface typeface3 = this.selectedFont == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM) : Typeface.create("serif", 1);
        Typeface typeface4 = this.selectedFont == 0 ? AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC) : Typeface.create("serif", 3);
        for (int i2 = 0; i2 < quoteTextPaints.size(); i2++) {
            updateFontEntry(quoteTextPaints.keyAt(i2), quoteTextPaints.valueAt(i2), typeface, typeface4, typeface3, typeface2);
        }
        for (int i3 = 0; i3 < preformattedTextPaints.size(); i3++) {
            updateFontEntry(preformattedTextPaints.keyAt(i3), preformattedTextPaints.valueAt(i3), typeface, typeface4, typeface3, typeface2);
        }
        for (int i4 = 0; i4 < paragraphTextPaints.size(); i4++) {
            updateFontEntry(paragraphTextPaints.keyAt(i4), paragraphTextPaints.valueAt(i4), typeface, typeface4, typeface3, typeface2);
        }
        for (int i5 = 0; i5 < listTextPaints.size(); i5++) {
            updateFontEntry(listTextPaints.keyAt(i5), listTextPaints.valueAt(i5), typeface, typeface4, typeface3, typeface2);
        }
        for (int i6 = 0; i6 < embedPostTextPaints.size(); i6++) {
            updateFontEntry(embedPostTextPaints.keyAt(i6), embedPostTextPaints.valueAt(i6), typeface, typeface4, typeface3, typeface2);
        }
        for (int i7 = 0; i7 < mediaCaptionTextPaints.size(); i7++) {
            updateFontEntry(mediaCaptionTextPaints.keyAt(i7), mediaCaptionTextPaints.valueAt(i7), typeface, typeface4, typeface3, typeface2);
        }
        for (int i8 = 0; i8 < mediaCreditTextPaints.size(); i8++) {
            updateFontEntry(mediaCreditTextPaints.keyAt(i8), mediaCreditTextPaints.valueAt(i8), typeface, typeface4, typeface3, typeface2);
        }
        for (int i9 = 0; i9 < photoCaptionTextPaints.size(); i9++) {
            updateFontEntry(photoCaptionTextPaints.keyAt(i9), photoCaptionTextPaints.valueAt(i9), typeface, typeface4, typeface3, typeface2);
        }
        for (int i10 = 0; i10 < photoCreditTextPaints.size(); i10++) {
            updateFontEntry(photoCreditTextPaints.keyAt(i10), photoCreditTextPaints.valueAt(i10), typeface, typeface4, typeface3, typeface2);
        }
        for (int i11 = 0; i11 < authorTextPaints.size(); i11++) {
            updateFontEntry(authorTextPaints.keyAt(i11), authorTextPaints.valueAt(i11), typeface, typeface4, typeface3, typeface2);
        }
        for (int i12 = 0; i12 < footerTextPaints.size(); i12++) {
            updateFontEntry(footerTextPaints.keyAt(i12), footerTextPaints.valueAt(i12), typeface, typeface4, typeface3, typeface2);
        }
        for (int i13 = 0; i13 < embedPostCaptionTextPaints.size(); i13++) {
            updateFontEntry(embedPostCaptionTextPaints.keyAt(i13), embedPostCaptionTextPaints.valueAt(i13), typeface, typeface4, typeface3, typeface2);
        }
        for (int i14 = 0; i14 < relatedArticleTextPaints.size(); i14++) {
            updateFontEntry(relatedArticleTextPaints.keyAt(i14), relatedArticleTextPaints.valueAt(i14), typeface, typeface4, typeface3, typeface2);
        }
        for (int i15 = 0; i15 < detailsTextPaints.size(); i15++) {
            updateFontEntry(detailsTextPaints.keyAt(i15), detailsTextPaints.valueAt(i15), typeface, typeface4, typeface3, typeface2);
        }
        for (int i16 = 0; i16 < tableTextPaints.size(); i16++) {
            updateFontEntry(tableTextPaints.keyAt(i16), tableTextPaints.valueAt(i16), typeface, typeface4, typeface3, typeface2);
        }
    }

    private void updateFontEntry(int i, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i2 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }

    private void updatePaintColors() {
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        int i = 0;
        while (true) {
            RecyclerListView[] recyclerListViewArr = this.listView;
            if (i >= recyclerListViewArr.length) {
                break;
            }
            recyclerListViewArr[i].setGlowColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            i++;
        }
        TextPaint textPaint = listTextPointerPaint;
        if (textPaint != null) {
            textPaint.setColor(getTextColor());
        }
        TextPaint textPaint2 = listTextNumPaint;
        if (textPaint2 != null) {
            textPaint2.setColor(getTextColor());
        }
        TextPaint textPaint3 = embedPostAuthorPaint;
        if (textPaint3 != null) {
            textPaint3.setColor(getTextColor());
        }
        TextPaint textPaint4 = channelNamePaint;
        if (textPaint4 != null) {
            textPaint4.setColor(getTextColor());
        }
        TextPaint textPaint5 = channelNamePhotoPaint;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = relatedArticleHeaderPaint;
        if (textPaint6 != null) {
            textPaint6.setColor(getTextColor());
        }
        TextPaint textPaint7 = relatedArticleTextPaint;
        if (textPaint7 != null) {
            textPaint7.setColor(getGrayTextColor());
        }
        TextPaint textPaint8 = embedPostDatePaint;
        if (textPaint8 != null) {
            textPaint8.setColor(getGrayTextColor());
        }
        createPaint(true);
        setMapColors(titleTextPaints);
        setMapColors(kickerTextPaints);
        setMapColors(subtitleTextPaints);
        setMapColors(headerTextPaints);
        setMapColors(subheaderTextPaints);
        setMapColors(quoteTextPaints);
        setMapColors(preformattedTextPaints);
        setMapColors(paragraphTextPaints);
        setMapColors(listTextPaints);
        setMapColors(embedPostTextPaints);
        setMapColors(mediaCaptionTextPaints);
        setMapColors(mediaCreditTextPaints);
        setMapColors(photoCaptionTextPaints);
        setMapColors(photoCreditTextPaints);
        setMapColors(authorTextPaints);
        setMapColors(footerTextPaints);
        setMapColors(embedPostCaptionTextPaints);
        setMapColors(relatedArticleTextPaints);
        setMapColors(detailsTextPaints);
        setMapColors(tableTextPaints);
    }

    private void setMapColors(SparseArray<TextPaint> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            TextPaint valueAt = sparseArray.valueAt(i);
            if ((keyAt & 8) != 0 || (keyAt & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                valueAt.setColor(getLinkTextColor());
            } else {
                valueAt.setColor(getTextColor());
            }
        }
    }

    public void setParentActivity(Activity activity, BaseFragment baseFragment) {
        this.parentFragment = baseFragment;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        if (this.parentActivity == activity) {
            updatePaintColors();
            refreshThemeColors();
            return;
        }
        this.parentActivity = activity;
        this.selectedFont = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        createPaint(false);
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
        FrameLayout frameLayout = new FrameLayout(activity) { // from class: org.telegram.ui.ArticleViewer.7
            /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
            @Override // android.view.ViewGroup
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected boolean drawChild(Canvas canvas, View view, long j) {
                int i2;
                int i3;
                if (ArticleViewer.this.windowView.movingPage) {
                    int measuredWidth = getMeasuredWidth();
                    int translationX = (int) ArticleViewer.this.listView[0].getTranslationX();
                    if (view == ArticleViewer.this.listView[1]) {
                        i2 = translationX;
                    } else {
                        i2 = measuredWidth;
                        if (view == ArticleViewer.this.listView[0]) {
                            i3 = translationX;
                            int save = canvas.save();
                            canvas.clipRect(i3, 0, i2, getHeight());
                            boolean drawChild = super.drawChild(canvas, view, j);
                            canvas.restoreToCount(save);
                            if (translationX != 0) {
                                if (view != ArticleViewer.this.listView[0]) {
                                    if (view == ArticleViewer.this.listView[1]) {
                                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                                        ArticleViewer.this.scrimPaint.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                                        canvas.drawRect(i3, 0.0f, i2, getHeight(), ArticleViewer.this.scrimPaint);
                                    }
                                } else {
                                    float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                                    ArticleViewer.this.layerShadowDrawable.setBounds(translationX - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                                    ArticleViewer.this.layerShadowDrawable.setAlpha((int) (max * 255.0f));
                                    ArticleViewer.this.layerShadowDrawable.draw(canvas);
                                }
                            }
                            return drawChild;
                        }
                    }
                    i3 = 0;
                    int save2 = canvas.save();
                    canvas.clipRect(i3, 0, i2, getHeight());
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
        if (Build.VERSION.SDK_INT >= 21) {
            this.windowView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(ArticleViewer$$ExternalSyntheticLambda4.INSTANCE);
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
        this.listView = new RecyclerListView[2];
        this.adapter = new WebpageAdapter[2];
        this.layoutManager = new LinearLayoutManager[2];
        int i2 = 0;
        while (i2 < this.listView.length) {
            WebpageAdapter[] webpageAdapterArr = this.adapter;
            final WebpageAdapter webpageAdapter = new WebpageAdapter(this.parentActivity);
            webpageAdapterArr[i2] = webpageAdapter;
            this.listView[i2] = new RecyclerListView(activity) { // from class: org.telegram.ui.ArticleViewer.8
                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                    super.onLayout(z, i3, i4, i5, i6);
                    int childCount = getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = getChildAt(i7);
                        if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                            int measuredHeight = getMeasuredHeight();
                            childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                            return;
                        }
                    }
                }

                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (ArticleViewer.this.pressedLinkOwnerLayout == null || ArticleViewer.this.pressedLink != null || ((ArticleViewer.this.popupWindow != null && ArticleViewer.this.popupWindow.isShowing()) || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3))) {
                        if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLink != null && motionEvent.getAction() == 1) {
                            ArticleViewer articleViewer = ArticleViewer.this;
                            articleViewer.checkLayoutForLinks(webpageAdapter, motionEvent, articleViewer.pressedLinkOwnerView, ArticleViewer.this.pressedLinkOwnerLayout, 0, 0);
                        }
                    } else {
                        ArticleViewer.this.pressedLink = null;
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLink == null && ((ArticleViewer.this.popupWindow == null || !ArticleViewer.this.popupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                        ArticleViewer.this.pressedLink = null;
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override // android.view.View
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.containerView.invalidate();
                        float measuredWidth = f / getMeasuredWidth();
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.setCurrentHeaderHeight((int) (articleViewer.windowView.startMovingHeaderHeight + ((AndroidUtilities.dp(56.0f) - ArticleViewer.this.windowView.startMovingHeaderHeight) * measuredWidth)));
                    }
                }

                @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
                protected void dispatchDraw(Canvas canvas) {
                    ArticleViewer.this.checkVideoPlayer();
                    super.dispatchDraw(canvas);
                }
            };
            ((DefaultItemAnimator) this.listView[i2].getItemAnimator()).setDelayAnimations(false);
            RecyclerListView recyclerListView = this.listView[i2];
            LinearLayoutManager[] linearLayoutManagerArr = this.layoutManager;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.parentActivity, 1, false);
            linearLayoutManagerArr[i2] = linearLayoutManager;
            recyclerListView.setLayoutManager(linearLayoutManager);
            this.listView[i2].setAdapter(webpageAdapter);
            this.listView[i2].setClipToPadding(false);
            this.listView[i2].setVisibility(i2 == 0 ? 0 : 8);
            this.listView[i2].setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
            this.listView[i2].setTopGlowOffset(AndroidUtilities.dp(56.0f));
            this.containerView.addView(this.listView[i2], LayoutHelper.createFrame(-1, -1.0f));
            this.listView[i2].setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda42
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                public final boolean onItemClick(View view, int i3) {
                    boolean lambda$setParentActivity$9;
                    lambda$setParentActivity$9 = ArticleViewer.this.lambda$setParentActivity$9(view, i3);
                    return lambda$setParentActivity$9;
                }
            });
            this.listView[i2].setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda41
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ boolean hasDoubleTap(View view, int i3) {
                    return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i3);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public /* synthetic */ void onDoubleTap(View view, int i3, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i3, f, f2);
                }

                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
                public final void onItemClick(View view, int i3, float f, float f2) {
                    ArticleViewer.this.lambda$setParentActivity$12(webpageAdapter, view, i3, f, f2);
                }
            });
            this.listView[i2].setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.ArticleViewer.9
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                    if (i3 == 0) {
                        ArticleViewer.this.textSelectionHelper.stopScrolling();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (recyclerView.getChildCount() == 0) {
                        return;
                    }
                    recyclerView.invalidate();
                    ArticleViewer.this.textSelectionHelper.onParentScrolled();
                    ArticleViewer.this.headerView.invalidate();
                    ArticleViewer.this.checkScroll(i4);
                }
            });
            i2++;
        }
        this.headerPaint.setColor(-16777216);
        this.statusBarPaint.setColor(-16777216);
        this.headerProgressPaint.setColor(-14408666);
        this.navigationBarPaint.setColor(-16777216);
        FrameLayout frameLayout3 = new FrameLayout(activity) { // from class: org.telegram.ui.ArticleViewer.10
            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                int itemCount;
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(0.0f, 0.0f, measuredWidth, measuredHeight, ArticleViewer.this.headerPaint);
                if (ArticleViewer.this.layoutManager == null) {
                    return;
                }
                int findFirstVisibleItemPosition = ArticleViewer.this.layoutManager[0].findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = ArticleViewer.this.layoutManager[0].findLastVisibleItemPosition();
                int itemCount2 = ArticleViewer.this.layoutManager[0].getItemCount() - 2;
                View findViewByPosition = findLastVisibleItemPosition >= itemCount2 ? ArticleViewer.this.layoutManager[0].findViewByPosition(itemCount2) : ArticleViewer.this.layoutManager[0].findViewByPosition(findFirstVisibleItemPosition);
                if (findViewByPosition == null) {
                    return;
                }
                float f = measuredWidth / (itemCount - 1);
                ArticleViewer.this.layoutManager[0].getChildCount();
                float measuredHeight2 = findViewByPosition.getMeasuredHeight();
                canvas.drawRect(0.0f, 0.0f, (findFirstVisibleItemPosition * f) + (findLastVisibleItemPosition >= itemCount2 ? (((itemCount2 - findFirstVisibleItemPosition) * f) * (ArticleViewer.this.listView[0].getMeasuredHeight() - findViewByPosition.getTop())) / measuredHeight2 : (1.0f - ((Math.min(0, findViewByPosition.getTop() - ArticleViewer.this.listView[0].getPaddingTop()) + measuredHeight2) / measuredHeight2)) * f), measuredHeight, ArticleViewer.this.headerProgressPaint);
            }
        };
        this.headerView = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, 56.0f));
        this.headerView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$13(view);
            }
        });
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        this.titleTextView = simpleTextView;
        simpleTextView.setGravity(19);
        this.titleTextView.setTextSize(20);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextView.setTextColor(-5000269);
        this.titleTextView.setPivotX(0.0f);
        this.titleTextView.setPivotY(AndroidUtilities.dp(28.0f));
        this.headerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 56.0f, 51, 72.0f, 0.0f, 96.0f, 0.0f));
        LineProgressView lineProgressView = new LineProgressView(activity);
        this.lineProgressView = lineProgressView;
        lineProgressView.setProgressColor(-1);
        this.lineProgressView.setPivotX(0.0f);
        this.lineProgressView.setPivotY(AndroidUtilities.dp(2.0f));
        this.headerView.addView(this.lineProgressView, LayoutHelper.createFrame(-1, 2.0f, 83, 0.0f, 0.0f, 0.0f, 1.0f));
        this.lineProgressTickRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$14();
            }
        };
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.menuContainer = frameLayout4;
        this.headerView.addView(frameLayout4, LayoutHelper.createFrame(48, 56, 53));
        View view = new View(activity);
        this.searchShadow = view;
        view.setBackgroundResource(R.drawable.header_shadow);
        this.searchShadow.setAlpha(0.0f);
        this.containerView.addView(this.searchShadow, LayoutHelper.createFrame(-1, 3.0f, 51, 0.0f, 56.0f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(this.parentActivity);
        this.searchContainer = frameLayout5;
        frameLayout5.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.searchContainer.setVisibility(4);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            this.searchContainer.setAlpha(0.0f);
        }
        this.headerView.addView(this.searchContainer, LayoutHelper.createFrame(-1, 56.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(this, this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.11
            @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.searchField = editTextBoldCursor;
        editTextBoldCursor.setCursorWidth(1.5f);
        EditTextBoldCursor editTextBoldCursor2 = this.searchField;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor2.setTextColor(Theme.getColor(i4));
        this.searchField.setCursorColor(Theme.getColor(i4));
        this.searchField.setTextSize(1, 18.0f);
        this.searchField.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        this.searchField.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.searchField;
        int i5 = R.string.Search;
        editTextBoldCursor3.setHint(LocaleController.getString("Search", i5));
        this.searchField.setBackgroundResource(0);
        this.searchField.setPadding(0, 0, 0, 0);
        this.searchField.setInputType(this.searchField.getInputType() | 524288);
        if (i3 < 23) {
            this.searchField.setCustomSelectionActionModeCallback(new ActionMode.Callback(this) { // from class: org.telegram.ui.ArticleViewer.12
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
        }
        this.searchField.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                boolean lambda$setParentActivity$15;
                lambda$setParentActivity$15 = ArticleViewer.this.lambda$setParentActivity$15(textView, i6, keyEvent);
                return lambda$setParentActivity$15;
            }
        });
        this.searchField.addTextChangedListener(new 13());
        this.searchField.setImeOptions(33554435);
        this.searchField.setTextIsSelectable(false);
        this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 72.0f, 0.0f, 48.0f, 0.0f));
        ImageView imageView = new ImageView(this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.14
            @Override // android.widget.ImageView, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    ArticleViewer.this.clearButton.setVisibility(4);
                    ArticleViewer.this.clearButton.setAlpha(0.0f);
                    ArticleViewer.this.clearButton.setRotation(45.0f);
                    ArticleViewer.this.clearButton.setScaleX(0.0f);
                    ArticleViewer.this.clearButton.setScaleY(0.0f);
                    return;
                }
                ArticleViewer.this.clearButton.setAlpha(1.0f);
                ArticleViewer.this.clearButton.setRotation(0.0f);
                ArticleViewer.this.clearButton.setScaleX(1.0f);
                ArticleViewer.this.clearButton.setScaleY(1.0f);
            }
        };
        this.clearButton = imageView;
        imageView.setImageDrawable(new CloseProgressDrawable2(this) { // from class: org.telegram.ui.ArticleViewer.15
            @Override // org.telegram.ui.Components.CloseProgressDrawable2
            protected int getCurrentColor() {
                return Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
            }
        });
        this.clearButton.setScaleType(ImageView.ScaleType.CENTER);
        this.clearButton.setAlpha(0.0f);
        this.clearButton.setRotation(45.0f);
        this.clearButton.setScaleX(0.0f);
        this.clearButton.setScaleY(0.0f);
        this.clearButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$16(view2);
            }
        });
        this.clearButton.setContentDescription(LocaleController.getString("ClearButton", R.string.ClearButton));
        this.searchContainer.addView(this.clearButton, LayoutHelper.createFrame(48, -1, 21));
        ImageView imageView2 = new ImageView(activity);
        this.backButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        backDrawable.setAnimationTime(200.0f);
        this.backDrawable.setColor(Theme.getColor(i4));
        this.backDrawable.setRotatedColor(-5000269);
        this.backDrawable.setRotation(1.0f, false);
        this.backButton.setImageDrawable(this.backDrawable);
        this.backButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.headerView.addView(this.backButton, LayoutHelper.createFrame(54, 56.0f));
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$17(view2);
            }
        });
        this.backButton.setContentDescription(LocaleController.getString("AccDescrGoBack", R.string.AccDescrGoBack));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(this.parentActivity, null, 1090519039, -5000269) { // from class: org.telegram.ui.ArticleViewer.16
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem
            public void toggleSubMenu() {
                super.toggleSubMenu();
                ArticleViewer.this.listView[0].stopScroll();
                ArticleViewer.this.checkScrollAnimated();
            }
        };
        this.menuButton = actionBarMenuItem;
        actionBarMenuItem.setLayoutInScreen(true);
        this.menuButton.setDuplicateParentStateEnabled(false);
        this.menuButton.setClickable(true);
        this.menuButton.setIcon(R.drawable.ic_ab_other);
        this.menuButton.addSubItem(1, R.drawable.msg_search, LocaleController.getString("Search", i5));
        this.menuButton.addSubItem(2, R.drawable.msg_share, LocaleController.getString("ShareFile", R.string.ShareFile));
        this.menuButton.addSubItem(3, R.drawable.msg_openin, LocaleController.getString("OpenInExternalApp", R.string.OpenInExternalApp));
        this.menuButton.addSubItem(4, R.drawable.msg_settings_old, LocaleController.getString("Settings", R.string.Settings));
        this.menuButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.menuButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.menuContainer.addView(this.menuButton, LayoutHelper.createFrame(48, 56.0f));
        ContextProgressView contextProgressView = new ContextProgressView(activity, 2);
        this.progressView = contextProgressView;
        contextProgressView.setVisibility(8);
        this.menuContainer.addView(this.progressView, LayoutHelper.createFrame(48, 56.0f));
        this.menuButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$18(view2);
            }
        });
        this.menuButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda38
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
            public final void onItemClick(int i6) {
                ArticleViewer.this.lambda$setParentActivity$20(i6);
            }
        });
        FrameLayout frameLayout6 = new FrameLayout(this, this.parentActivity) { // from class: org.telegram.ui.ArticleViewer.17
            @Override // android.view.View
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchPanel = frameLayout6;
        frameLayout6.setOnTouchListener(ArticleViewer$$ExternalSyntheticLambda14.INSTANCE);
        this.searchPanel.setWillNotDraw(false);
        this.searchPanel.setVisibility(4);
        this.searchPanel.setFocusable(true);
        this.searchPanel.setFocusableInTouchMode(true);
        this.searchPanel.setClickable(true);
        this.searchPanel.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.containerView.addView(this.searchPanel, LayoutHelper.createFrame(-1, 51, 80));
        ImageView imageView3 = new ImageView(this.parentActivity);
        this.searchUpButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.searchUpButton.setImageResource(R.drawable.msg_go_up);
        this.searchUpButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4), PorterDuff.Mode.MULTIPLY));
        ImageView imageView4 = this.searchUpButton;
        int i6 = Theme.key_actionBarActionModeDefaultSelector;
        imageView4.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i6), 1));
        this.searchPanel.addView(this.searchUpButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.searchUpButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$22(view2);
            }
        });
        this.searchUpButton.setContentDescription(LocaleController.getString("AccDescrSearchNext", R.string.AccDescrSearchNext));
        ImageView imageView5 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView5;
        imageView5.setScaleType(ImageView.ScaleType.CENTER);
        this.searchDownButton.setImageResource(R.drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4), PorterDuff.Mode.MULTIPLY));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(i6), 1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$23(view2);
            }
        });
        this.searchDownButton.setContentDescription(LocaleController.getString("AccDescrSearchPrev", R.string.AccDescrSearchPrev));
        SimpleTextView simpleTextView2 = new SimpleTextView(this.parentActivity);
        this.searchCountText = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(i4));
        this.searchCountText.setTextSize(15);
        this.searchCountText.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.searchCountText.setGravity(3);
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
        int i7 = 1792;
        int color = Theme.getColor(Theme.key_windowBackgroundGray, null, true);
        if ((AndroidUtilities.computePerceivedBrightness(color) >= 0.721f) && i3 >= 26) {
            i7 = 1808;
        }
        this.navigationBarPaint.setColor(color);
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.systemUiVisibility = i7;
        if (i3 >= 21) {
            layoutParams2.flags |= -2147417856;
            if (i3 >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.listView[0]);
        if (MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled()) {
            this.textSelectionHelper.setOnTranslate(new TextSelectionHelper.OnTranslateListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda40
                @Override // org.telegram.ui.Cells.TextSelectionHelper.OnTranslateListener
                public final void run(CharSequence charSequence, String str, String str2, Runnable runnable) {
                    ArticleViewer.this.lambda$setParentActivity$24(charSequence, str, str2, runnable);
                }
            });
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.layoutManager[0];
        articleTextSelectionHelper2.setCallback(new TextSelectionHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.18
            @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
            public void onStateChanged(boolean z) {
                if (z) {
                    ArticleViewer.this.showSearch(false);
                }
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.Callback
            public void onTextCopied() {
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    BulletinFactory.of(ArticleViewer.this.containerView, null).createCopyBulletin(LocaleController.getString("TextCopied", R.string.TextCopied)).show();
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        FrameLayout frameLayout7 = this.containerView;
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(frameLayout7, frameLayout7);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new PinchToZoomHelper.ClipBoundsListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda43
            @Override // org.telegram.ui.PinchToZoomHelper.ClipBoundsListener
            public final void getClipTopBottom(float[] fArr) {
                ArticleViewer.this.lambda$setParentActivity$25(fArr);
            }
        });
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() { // from class: org.telegram.ui.ArticleViewer.19
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
                if (ArticleViewer.this.listView[0] != null) {
                    ArticleViewer.this.listView[0].cancelClickRunnables(true);
                }
            }
        });
        updatePaintColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$setParentActivity$8(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setParentActivity$9(View view, int i) {
        if (view instanceof BlockRelatedArticlesCell) {
            BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
            showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$12(WebpageAdapter webpageAdapter, View view, int i, float f, float f2) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            if (articleTextSelectionHelper.isInSelectionMode()) {
                this.textSelectionHelper.clear();
                return;
            }
            this.textSelectionHelper.clear();
        }
        if ((view instanceof ReportCell) && webpageAdapter.currentPage != null) {
            ReportCell reportCell = (ReportCell) view;
            if (this.previewsReqId == 0) {
                if (!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) {
                    TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat("previews");
                    if (!(userOrChat instanceof TLRPC$TL_user)) {
                        final int i2 = UserConfig.selectedAccount;
                        final long j = webpageAdapter.currentPage.id;
                        showProgressView(true, true);
                        TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
                        tLRPC$TL_contacts_resolveUsername.username = "previews";
                        this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                ArticleViewer.this.lambda$setParentActivity$11(i2, j, tLObject, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    openPreviewsChat((TLRPC$User) userOrChat, webpageAdapter.currentPage.id);
                }
            }
        } else if (i < 0 || i >= webpageAdapter.localBlocks.size()) {
        } else {
            TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) webpageAdapter.localBlocks.get(i);
            TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockChannel) {
                MessagesController.getInstance(this.currentAccount).openByUserName(ChatObject.getPublicUsername(((TLRPC$TL_pageBlockChannel) lastNonListPageBlock).channel), this.parentFragment, 2);
                close(false, true);
            } else if (lastNonListPageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null);
            } else if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                View lastNonListCell = getLastNonListCell(view);
                if (lastNonListCell instanceof BlockDetailsCell) {
                    this.pressedLinkOwnerLayout = null;
                    this.pressedLinkOwnerView = null;
                    if (webpageAdapter.blocks.indexOf(tLRPC$PageBlock) < 0) {
                        return;
                    }
                    TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
                    tLRPC$TL_pageBlockDetails.open = !tLRPC$TL_pageBlockDetails.open;
                    int itemCount = webpageAdapter.getItemCount();
                    webpageAdapter.updateRows();
                    int abs = Math.abs(webpageAdapter.getItemCount() - itemCount);
                    BlockDetailsCell blockDetailsCell = (BlockDetailsCell) lastNonListCell;
                    blockDetailsCell.arrow.setAnimationProgressAnimated(tLRPC$TL_pageBlockDetails.open ? 0.0f : 1.0f);
                    blockDetailsCell.invalidate();
                    if (abs != 0) {
                        if (tLRPC$TL_pageBlockDetails.open) {
                            webpageAdapter.notifyItemRangeInserted(i + 1, abs);
                        } else {
                            webpageAdapter.notifyItemRangeRemoved(i + 1, abs);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$11(final int i, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$10(tLObject, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$10(TLObject tLObject, int i, long j) {
        if (this.previewsReqId == 0) {
            return;
        }
        this.previewsReqId = 0;
        showProgressView(true, false);
        if (tLObject != null) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
            if (tLRPC$TL_contacts_resolvedPeer.users.isEmpty()) {
                return;
            }
            openPreviewsChat(tLRPC$TL_contacts_resolvedPeer.users.get(0), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$13(View view) {
        this.listView[0].smoothScrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$14() {
        float currentProgress = 0.7f - this.lineProgressView.getCurrentProgress();
        if (currentProgress > 0.0f) {
            float f = currentProgress < 0.25f ? 0.01f : 0.02f;
            LineProgressView lineProgressView = this.lineProgressView;
            lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setParentActivity$15(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null) {
            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                AndroidUtilities.hideKeyboard(this.searchField);
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 13 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        13() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (ArticleViewer.this.ignoreOnTextChange) {
                ArticleViewer.this.ignoreOnTextChange = false;
                return;
            }
            ArticleViewer.this.processSearch(charSequence.toString().toLowerCase());
            if (ArticleViewer.this.clearButton != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    if (ArticleViewer.this.clearButton.getTag() != null) {
                        ArticleViewer.this.clearButton.setTag(null);
                        ArticleViewer.this.clearButton.clearAnimation();
                        if (ArticleViewer.this.animateClear) {
                            ArticleViewer.this.clearButton.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.0f).setDuration(180L).scaleY(0.0f).scaleX(0.0f).rotation(45.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.ArticleViewer$13$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArticleViewer.13.this.lambda$onTextChanged$0();
                                }
                            }).start();
                            return;
                        }
                        ArticleViewer.this.clearButton.setAlpha(0.0f);
                        ArticleViewer.this.clearButton.setRotation(45.0f);
                        ArticleViewer.this.clearButton.setScaleX(0.0f);
                        ArticleViewer.this.clearButton.setScaleY(0.0f);
                        ArticleViewer.this.clearButton.setVisibility(4);
                        ArticleViewer.this.animateClear = true;
                    }
                } else if (ArticleViewer.this.clearButton.getTag() == null) {
                    ArticleViewer.this.clearButton.setTag(1);
                    ArticleViewer.this.clearButton.clearAnimation();
                    ArticleViewer.this.clearButton.setVisibility(0);
                    if (ArticleViewer.this.animateClear) {
                        ArticleViewer.this.clearButton.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f).setDuration(180L).scaleY(1.0f).scaleX(1.0f).rotation(0.0f).start();
                        return;
                    }
                    ArticleViewer.this.clearButton.setAlpha(1.0f);
                    ArticleViewer.this.clearButton.setRotation(0.0f);
                    ArticleViewer.this.clearButton.setScaleX(1.0f);
                    ArticleViewer.this.clearButton.setScaleY(1.0f);
                    ArticleViewer.this.animateClear = true;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTextChanged$0() {
            ArticleViewer.this.clearButton.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$16(View view) {
        if (this.searchField.length() != 0) {
            this.searchField.setText("");
        }
        this.searchField.requestFocus();
        AndroidUtilities.showKeyboard(this.searchField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$17(View view) {
        if (this.searchContainer.getTag() != null) {
            showSearch(false);
        } else {
            close(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$18(View view) {
        this.menuButton.toggleSubMenu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$20(int i) {
        Activity activity;
        if (this.adapter[0].currentPage == null || (activity = this.parentActivity) == null) {
            return;
        }
        if (i == 1) {
            showSearch(true);
        } else if (i == 2) {
            showDialog(new ShareAlert(this.parentActivity, null, this.adapter[0].currentPage.url, false, this.adapter[0].currentPage.url, false));
        } else if (i == 3) {
            Browser.openUrl((Context) this.parentActivity, !TextUtils.isEmpty(this.adapter[0].currentPage.cached_page.url) ? this.adapter[0].currentPage.cached_page.url : this.adapter[0].currentPage.url, true, false);
        } else if (i == 4) {
            BottomSheet.Builder builder = new BottomSheet.Builder(activity);
            builder.setApplyTopPadding(false);
            LinearLayout linearLayout = new LinearLayout(this.parentActivity);
            linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            linearLayout.setOrientation(1);
            HeaderCell headerCell = new HeaderCell(this.parentActivity);
            headerCell.setText(LocaleController.getString("FontSize", R.string.FontSize));
            linearLayout.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
            linearLayout.addView(new TextSizeCell(this.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
            HeaderCell headerCell2 = new HeaderCell(this.parentActivity);
            headerCell2.setText(LocaleController.getString("FontType", R.string.FontType));
            linearLayout.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
            int i2 = 0;
            while (i2 < 2) {
                this.fontCells[i2] = new FontCell(this.parentActivity);
                if (i2 == 0) {
                    this.fontCells[i2].setTextAndTypeface(LocaleController.getString("Default", R.string.Default), Typeface.DEFAULT);
                } else if (i2 == 1) {
                    this.fontCells[i2].setTextAndTypeface("Serif", Typeface.SERIF);
                }
                this.fontCells[i2].select(i2 == this.selectedFont, false);
                this.fontCells[i2].setTag(Integer.valueOf(i2));
                this.fontCells[i2].setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArticleViewer.this.lambda$setParentActivity$19(view);
                    }
                });
                linearLayout.addView(this.fontCells[i2], LayoutHelper.createLinear(-1, 50));
                i2++;
            }
            builder.setCustomView(linearLayout);
            BottomSheet create = builder.create();
            this.linkSheet = create;
            showDialog(create);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$19(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.selectedFont = intValue;
        int i = 0;
        while (i < 2) {
            this.fontCells[i].select(i == intValue, true);
            i++;
        }
        updatePaintFonts();
        for (int i2 = 0; i2 < this.listView.length; i2++) {
            this.adapter[i2].notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$22(View view) {
        scrollToSearchIndex(this.currentSearchIndex - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$23(View view) {
        scrollToSearchIndex(this.currentSearchIndex + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$24(CharSequence charSequence, String str, String str2, Runnable runnable) {
        TranslateAlert2.showAlert(this.parentActivity, this.parentFragment, this.currentAccount, str, str2, charSequence, null, false, null, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParentActivity$25(float[] fArr) {
        fArr[0] = this.currentHeaderHeight;
        fArr[1] = this.listView[0].getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVideoPlayer() {
        BlockVideoCell blockVideoCell;
        RecyclerListView recyclerListView = this.listView[0];
        if (recyclerListView == null && this.attachedToWindow) {
            return;
        }
        float f = 0.0f;
        float measuredHeight = recyclerListView.getMeasuredHeight() / 2.0f;
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
        boolean z = !PhotoViewer.getInstance().isVisibleOrAnimating();
        if (!z || ((blockVideoCell = this.currentPlayer) != null && blockVideoCell != blockVideoCell2 && this.videoPlayer != null)) {
            VideoPlayerHolderBase videoPlayerHolderBase = this.videoPlayer;
            if (videoPlayerHolderBase != null) {
                this.currentPlayer.playFrom = videoPlayerHolderBase.getCurrentPosition();
                this.videoPlayer.release(null);
            }
            this.videoPlayer = null;
            this.currentPlayer = null;
        }
        if (!z || blockVideoCell2 == null) {
            return;
        }
        blockVideoCell2.startVideoPlayer();
        this.currentPlayer = blockVideoCell2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSearch(final boolean z) {
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null) {
            if ((frameLayout.getTag() != null) == z) {
                return;
            }
            this.searchContainer.setTag(z ? 1 : null);
            this.searchResults.clear();
            this.searchText = null;
            this.adapter[0].searchTextOffset.clear();
            this.currentSearchIndex = 0;
            if (this.attachedToWindow) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                if (z) {
                    this.searchContainer.setVisibility(0);
                    this.backDrawable.setRotation(0.0f, true);
                } else {
                    this.menuButton.setVisibility(0);
                    this.listView[0].invalidateViews();
                    AndroidUtilities.hideKeyboard(this.searchField);
                    updateWindowLayoutParamsForSearch();
                }
                ArrayList arrayList = new ArrayList();
                if (Build.VERSION.SDK_INT >= 21) {
                    if (z) {
                        this.searchContainer.setAlpha(1.0f);
                    }
                    int left = this.menuContainer.getLeft() + (this.menuContainer.getMeasuredWidth() / 2);
                    int top = this.menuContainer.getTop() + (this.menuContainer.getMeasuredHeight() / 2);
                    float sqrt = (float) Math.sqrt((left * left) + (top * top));
                    FrameLayout frameLayout2 = this.searchContainer;
                    float f = z ? 0.0f : sqrt;
                    if (!z) {
                        sqrt = 0.0f;
                    }
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout2, left, top, f, sqrt);
                    arrayList.add(createCircularReveal);
                    createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.20
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                return;
                            }
                            ArticleViewer.this.searchContainer.setAlpha(0.0f);
                        }
                    });
                } else {
                    FrameLayout frameLayout3 = this.searchContainer;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    fArr[0] = z ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, fArr));
                }
                if (!z) {
                    arrayList.add(ObjectAnimator.ofFloat(this.searchPanel, View.ALPHA, 0.0f));
                }
                View view = this.searchShadow;
                Property property2 = View.ALPHA;
                float[] fArr2 = new float[1];
                fArr2[0] = z ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(view, property2, fArr2));
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.21
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            ArticleViewer.this.updateWindowLayoutParamsForSearch();
                            ArticleViewer.this.searchField.requestFocus();
                            AndroidUtilities.showKeyboard(ArticleViewer.this.searchField);
                            ArticleViewer.this.menuButton.setVisibility(4);
                            return;
                        }
                        ArticleViewer.this.searchContainer.setVisibility(4);
                        ArticleViewer.this.searchPanel.setVisibility(4);
                        ArticleViewer.this.searchField.setText("");
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        if (z) {
                            return;
                        }
                        ArticleViewer.this.backDrawable.setRotation(1.0f, true);
                    }
                });
                animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                if (!z && !AndroidUtilities.usingHardwareInput && this.keyboardVisible) {
                    this.runAfterKeyboardClose = animatorSet;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda20
                        @Override // java.lang.Runnable
                        public final void run() {
                            ArticleViewer.this.lambda$showSearch$26();
                        }
                    }, 300L);
                    return;
                }
                animatorSet.start();
                return;
            }
            this.searchContainer.setAlpha(z ? 1.0f : 0.0f);
            this.menuButton.setVisibility(z ? 4 : 0);
            this.backDrawable.setRotation(z ? 0.0f : 1.0f, false);
            this.searchShadow.setAlpha(z ? 1.0f : 0.0f);
            if (z) {
                this.searchContainer.setVisibility(0);
            } else {
                this.searchContainer.setVisibility(4);
                this.searchPanel.setVisibility(4);
                this.searchField.setText("");
            }
            updateWindowLayoutParamsForSearch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSearch$26() {
        AnimatorSet animatorSet = this.runAfterKeyboardClose;
        if (animatorSet != null) {
            animatorSet.start();
            this.runAfterKeyboardClose = null;
        }
    }

    private void updateSearchButtons() {
        ArrayList<SearchResult> arrayList = this.searchResults;
        if (arrayList == null) {
            return;
        }
        this.searchUpButton.setEnabled((arrayList.isEmpty() || this.currentSearchIndex == 0) ? false : true);
        this.searchDownButton.setEnabled((this.searchResults.isEmpty() || this.currentSearchIndex == this.searchResults.size() - 1) ? false : true);
        ImageView imageView = this.searchUpButton;
        imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
        ImageView imageView2 = this.searchDownButton;
        imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
        int size = this.searchResults.size();
        if (size < 0) {
            this.searchCountText.setText("");
        } else if (size == 0) {
            this.searchCountText.setText(LocaleController.getString("NoResult", R.string.NoResult));
        } else if (size == 1) {
            this.searchCountText.setText(LocaleController.getString("OneResult", R.string.OneResult));
        } else {
            this.searchCountText.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(this.currentSearchIndex + 1), Integer.valueOf(size)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SearchResult {
        private TLRPC$PageBlock block;
        private int index;
        private Object text;

        private SearchResult() {
        }
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
            this.adapter[0].searchTextOffset.clear();
            this.searchPanel.setVisibility(4);
            this.listView[0].invalidateViews();
            scrollToSearchIndex(0);
            this.lastSearchIndex = -1;
            return;
        }
        final int i = this.lastSearchIndex + 1;
        this.lastSearchIndex = i;
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$29(str, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSearch$29(final String str, final int i) {
        final HashMap hashMap = new HashMap(this.adapter[0].textToBlocks);
        final ArrayList arrayList = new ArrayList(this.adapter[0].textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$28(arrayList, hashMap, str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$processSearch$28(ArrayList arrayList, HashMap hashMap, final String str, final int i) {
        TLRPC$PageBlock tLRPC$PageBlock;
        String lowerCase;
        String str2;
        1 r11;
        TLRPC$PageBlock tLRPC$PageBlock2;
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            TLRPC$PageBlock tLRPC$PageBlock3 = (TLRPC$PageBlock) hashMap.get(obj);
            if (obj instanceof TLRPC$RichText) {
                TLRPC$RichText tLRPC$RichText = (TLRPC$RichText) obj;
                WebpageAdapter webpageAdapter = this.adapter[c];
                String str3 = null;
                tLRPC$PageBlock = tLRPC$PageBlock3;
                CharSequence text = getText(webpageAdapter, (View) null, tLRPC$RichText, tLRPC$RichText, tLRPC$PageBlock3, 1000);
                str2 = str3;
                if (!TextUtils.isEmpty(text)) {
                    lowerCase = text.toString().toLowerCase();
                    r11 = str3;
                }
                lowerCase = str2;
                r11 = str2;
            } else {
                String str4 = null;
                tLRPC$PageBlock = tLRPC$PageBlock3;
                str2 = str4;
                if (obj instanceof String) {
                    lowerCase = ((String) obj).toLowerCase();
                    r11 = str4;
                }
                lowerCase = str2;
                r11 = str2;
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
                            tLRPC$PageBlock2 = tLRPC$PageBlock;
                            searchResult.block = tLRPC$PageBlock2;
                            searchResult.text = obj;
                            arrayList2.add(searchResult);
                        } else {
                            tLRPC$PageBlock2 = tLRPC$PageBlock;
                        }
                        tLRPC$PageBlock = tLRPC$PageBlock2;
                        i3 = length;
                    }
                }
            }
            i2++;
            c = 0;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$processSearch$27(i, arrayList2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processSearch$27(int i, ArrayList arrayList, String str) {
        if (i == this.lastSearchIndex) {
            this.searchPanel.setAlpha(1.0f);
            this.searchPanel.setVisibility(0);
            this.searchResults = arrayList;
            this.searchText = str;
            this.adapter[0].searchTextOffset.clear();
            this.listView[0].invalidateViews();
            scrollToSearchIndex(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae A[SYNTHETIC] */
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
        SearchResult searchResult = this.searchResults.get(i);
        TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(searchResult.block);
        int size2 = this.adapter[0].blocks.size();
        for (int i3 = 0; i3 < size2; i3++) {
            TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) this.adapter[0].blocks.get(i3);
            if (tLRPC$PageBlock instanceof TL_pageBlockDetailsChild) {
                TL_pageBlockDetailsChild tL_pageBlockDetailsChild = (TL_pageBlockDetailsChild) tLRPC$PageBlock;
                if (tL_pageBlockDetailsChild.block == searchResult.block || tL_pageBlockDetailsChild.block == lastNonListPageBlock) {
                    if (openAllParentBlocks(tL_pageBlockDetailsChild)) {
                        this.adapter[0].updateRows();
                        this.adapter[0].notifyDataSetChanged();
                    }
                    size = this.adapter[0].localBlocks.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            i2 = -1;
                            break;
                        }
                        TLRPC$PageBlock tLRPC$PageBlock2 = (TLRPC$PageBlock) this.adapter[0].localBlocks.get(i2);
                        if (tLRPC$PageBlock2 == searchResult.block || tLRPC$PageBlock2 == lastNonListPageBlock) {
                            break;
                        }
                        if (tLRPC$PageBlock2 instanceof TL_pageBlockDetailsChild) {
                            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) tLRPC$PageBlock2;
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
                        this.adapter[0].updateRows();
                        this.adapter[0].notifyDataSetChanged();
                    }
                    String str = this.searchText + searchResult.block + searchResult.text + searchResult.index;
                    Integer num = (Integer) this.adapter[0].searchTextOffset.get(str);
                    if (num == null) {
                        int typeForBlock = this.adapter[0].getTypeForBlock(searchResult.block);
                        RecyclerView.ViewHolder onCreateViewHolder = this.adapter[0].onCreateViewHolder(null, typeForBlock);
                        this.adapter[0].bindBlockToHolder(typeForBlock, onCreateViewHolder, searchResult.block, 0, 0);
                        onCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.listView[0].getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        num = (Integer) this.adapter[0].searchTextOffset.get(str);
                        if (num == null) {
                            num = 0;
                        }
                    }
                    this.layoutManager[0].scrollToPositionWithOffset(i2, ((this.currentHeaderHeight - AndroidUtilities.dp(56.0f)) - num.intValue()) + AndroidUtilities.dp(100.0f));
                    this.listView[0].invalidateViews();
                    return;
                }
            }
        }
        size = this.adapter[0].localBlocks.size();
        i2 = 0;
        while (true) {
            if (i2 < size) {
            }
            i2++;
        }
        if (i2 != -1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkScrollAnimated() {
        if (this.currentHeaderHeight == AndroidUtilities.dp(56.0f)) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.currentHeaderHeight), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArticleViewer.this.lambda$checkScrollAnimated$30(valueAnimator);
            }
        });
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkScrollAnimated$30(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentHeaderHeight(int i) {
        if (this.searchContainer.getTag() != null) {
            return;
        }
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        if (i < dp2) {
            i = dp2;
        } else if (i > dp) {
            i = dp;
        }
        float f = dp - dp2;
        if (f == 0.0f) {
            f = 1.0f;
        }
        this.currentHeaderHeight = i;
        float f2 = (((i - dp2) / f) * 0.2f) + 0.8f;
        this.backButton.setScaleX(f2);
        this.backButton.setScaleY(f2);
        this.backButton.setTranslationY((dp - this.currentHeaderHeight) / 2);
        this.menuContainer.setScaleX(f2);
        this.menuContainer.setScaleY(f2);
        this.titleTextView.setScaleX(f2);
        this.titleTextView.setScaleY(f2);
        this.lineProgressView.setScaleY((((i - dp2) / f) * 0.5f) + 0.5f);
        this.menuContainer.setTranslationY((dp - this.currentHeaderHeight) / 2);
        this.titleTextView.setTranslationY((dp - this.currentHeaderHeight) / 2);
        this.headerView.setTranslationY(this.currentHeaderHeight - dp);
        this.searchShadow.setTranslationY(this.currentHeaderHeight - dp);
        int i2 = 0;
        this.menuButton.setAdditionalYOffset(((-(this.currentHeaderHeight - dp)) / 2) + (Build.VERSION.SDK_INT < 21 ? AndroidUtilities.statusBarHeight : 0));
        this.textSelectionHelper.setTopOffset(this.currentHeaderHeight);
        while (true) {
            RecyclerListView[] recyclerListViewArr = this.listView;
            if (i2 >= recyclerListViewArr.length) {
                return;
            }
            recyclerListViewArr[i2].setTopGlowOffset(this.currentHeaderHeight);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkScroll(int i) {
        setCurrentHeaderHeight(this.currentHeaderHeight - i);
    }

    private void openPreviewsChat(TLRPC$User tLRPC$User, long j) {
        if (tLRPC$User == null || !(this.parentActivity instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
        bundle.putString("botUser", "webpage" + j);
        ((LaunchActivity) this.parentActivity).presentFragment(new ChatActivity(bundle), false, true);
        close(false, true);
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, true);
    }

    public boolean open(TLRPC$TL_webPage tLRPC$TL_webPage, String str) {
        return open(null, tLRPC$TL_webPage, str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean open(final MessageObject messageObject, TLRPC$WebPage tLRPC$WebPage, String str, boolean z) {
        final TLRPC$WebPage tLRPC$WebPage2;
        String str2;
        int lastIndexOf;
        String lowerCase;
        if (this.parentActivity == null || ((this.isVisible && !this.collapsed) || (messageObject == null && tLRPC$WebPage == null))) {
            return false;
        }
        if (messageObject != null) {
            tLRPC$WebPage = messageObject.messageOwner.media.webpage;
            for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = messageObject.messageOwner.entities.get(i);
                if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityUrl) {
                    try {
                        String str3 = messageObject.messageOwner.message;
                        int i2 = tLRPC$MessageEntity.offset;
                        String lowerCase2 = str3.substring(i2, tLRPC$MessageEntity.length + i2).toLowerCase();
                        if (!TextUtils.isEmpty(tLRPC$WebPage.cached_page.url)) {
                            lowerCase = tLRPC$WebPage.cached_page.url.toLowerCase();
                        } else {
                            lowerCase = tLRPC$WebPage.url.toLowerCase();
                        }
                        if (lowerCase2.contains(lowerCase) || lowerCase.contains(lowerCase2)) {
                            int lastIndexOf2 = lowerCase2.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            str2 = lowerCase2.substring(lastIndexOf2 + 1);
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            str2 = null;
        } else if (str != null && (lastIndexOf = str.lastIndexOf(35)) != -1) {
            str2 = str.substring(lastIndexOf + 1);
        } else {
            tLRPC$WebPage2 = tLRPC$WebPage;
            str2 = null;
            this.pagesStack.clear();
            this.collapsed = false;
            this.containerView.setTranslationX(0.0f);
            this.containerView.setTranslationY(0.0f);
            this.listView[0].setTranslationY(0.0f);
            this.listView[0].setTranslationX(0.0f);
            this.listView[1].setTranslationX(0.0f);
            this.listView[0].setAlpha(1.0f);
            this.windowView.setInnerTranslationX(0.0f);
            this.layoutManager[0].scrollToPositionWithOffset(0, 0);
            if (!z) {
                setCurrentHeaderHeight(AndroidUtilities.dp(56.0f));
            } else {
                checkScrollAnimated();
            }
            boolean addPageToStack = addPageToStack(tLRPC$WebPage2, str2, 0);
            if (z) {
                final String str4 = (addPageToStack || str2 == null) ? null : str2;
                TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
                tLRPC$TL_messages_getWebPage.url = tLRPC$WebPage2.url;
                TLRPC$Page tLRPC$Page = tLRPC$WebPage2.cached_page;
                if ((tLRPC$Page instanceof TLRPC$TL_pagePart_layer82) || tLRPC$Page.part) {
                    tLRPC$TL_messages_getWebPage.hash = 0;
                } else {
                    tLRPC$TL_messages_getWebPage.hash = tLRPC$WebPage2.hash;
                }
                final int i3 = UserConfig.selectedAccount;
                ConnectionsManager.getInstance(i3).sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda35
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ArticleViewer.this.lambda$open$32(tLRPC$WebPage2, messageObject, i3, str4, tLObject, tLRPC$TL_error);
                    }
                });
            }
            this.lastInsets = null;
            if (this.isVisible) {
                WindowManager windowManager = (WindowManager) this.parentActivity.getSystemService("window");
                if (this.attachedToWindow) {
                    try {
                        windowManager.removeView(this.windowView);
                    } catch (Exception unused) {
                    }
                }
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 21) {
                        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                        layoutParams.flags = -2013200384;
                        if (i4 >= 28) {
                            layoutParams.layoutInDisplayCutoutMode = 1;
                        }
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
            this.windowView.setAlpha(0.0f);
            this.containerView.setAlpha(0.0f);
            final AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
            this.animationEndRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$open$33();
                }
            };
            animatorSet.setDuration(150L);
            animatorSet.setInterpolator(this.interpolator);
            animatorSet.addListener(new 22());
            this.transitionAnimationStartTime = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$open$34(animatorSet);
                }
            });
            if (Build.VERSION.SDK_INT >= 18) {
                this.containerView.setLayerType(2, null);
            }
            return true;
        }
        tLRPC$WebPage2 = tLRPC$WebPage;
        this.pagesStack.clear();
        this.collapsed = false;
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.listView[0].setTranslationY(0.0f);
        this.listView[0].setTranslationX(0.0f);
        this.listView[1].setTranslationX(0.0f);
        this.listView[0].setAlpha(1.0f);
        this.windowView.setInnerTranslationX(0.0f);
        this.layoutManager[0].scrollToPositionWithOffset(0, 0);
        if (!z) {
        }
        boolean addPageToStack2 = addPageToStack(tLRPC$WebPage2, str2, 0);
        if (z) {
        }
        this.lastInsets = null;
        if (this.isVisible) {
        }
        this.isVisible = true;
        this.animationInProgress = 1;
        this.windowView.setAlpha(0.0f);
        this.containerView.setAlpha(0.0f);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.windowView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
        this.animationEndRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$open$33();
            }
        };
        animatorSet2.setDuration(150L);
        animatorSet2.setInterpolator(this.interpolator);
        animatorSet2.addListener(new 22());
        this.transitionAnimationStartTime = System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$open$34(animatorSet2);
            }
        });
        if (Build.VERSION.SDK_INT >= 18) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$32(final TLRPC$WebPage tLRPC$WebPage, final MessageObject messageObject, final int i, final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$open$31(tLObject, tLRPC$WebPage, messageObject, i, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$31(TLObject tLObject, TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject, int i, String str) {
        TLRPC$Page tLRPC$Page;
        int i2 = 0;
        if (tLObject instanceof TLRPC$TL_webPage) {
            TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject;
            if (tLRPC$TL_webPage.cached_page == null) {
                return;
            }
            if (!this.pagesStack.isEmpty() && this.pagesStack.get(0) == tLRPC$WebPage) {
                if (messageObject != null) {
                    messageObject.messageOwner.media.webpage = tLRPC$TL_webPage;
                    TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
                    tLRPC$TL_messages_messages.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled, 0);
                }
                this.pagesStack.set(0, tLRPC$TL_webPage);
                if (this.pagesStack.size() == 1) {
                    ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tLRPC$TL_webPage.id).commit();
                    updateInterfaceForCurrentPage(tLRPC$TL_webPage, false, 0);
                    if (str != null) {
                        scrollToAnchor(str);
                    }
                }
            }
            LongSparseArray<TLRPC$WebPage> longSparseArray = new LongSparseArray<>(1);
            longSparseArray.put(tLRPC$TL_webPage.id, tLRPC$TL_webPage);
            MessagesStorage.getInstance(i).putWebPages(longSparseArray);
        } else if (tLObject instanceof TLRPC$TL_webPageNotModified) {
            TLRPC$TL_webPageNotModified tLRPC$TL_webPageNotModified = (TLRPC$TL_webPageNotModified) tLObject;
            if (tLRPC$WebPage == null || (tLRPC$Page = tLRPC$WebPage.cached_page) == null) {
                return;
            }
            int i3 = tLRPC$Page.views;
            int i4 = tLRPC$TL_webPageNotModified.cached_page_views;
            if (i3 != i4) {
                tLRPC$Page.views = i4;
                tLRPC$Page.flags |= 8;
                while (true) {
                    WebpageAdapter[] webpageAdapterArr = this.adapter;
                    if (i2 >= webpageAdapterArr.length) {
                        break;
                    }
                    if (webpageAdapterArr[i2].currentPage == tLRPC$WebPage) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView[i2].findViewHolderForAdapterPosition(this.adapter[i2].getItemCount() - 1);
                        if (findViewHolderForAdapterPosition != null) {
                            this.adapter[i2].onViewAttachedToWindow(findViewHolderForAdapterPosition);
                        }
                    }
                    i2++;
                }
                if (messageObject != null) {
                    TLRPC$TL_messages_messages tLRPC$TL_messages_messages2 = new TLRPC$TL_messages_messages();
                    tLRPC$TL_messages_messages2.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled, 0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$open$33() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null || this.windowView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            frameLayout.setLayerType(0, null);
        }
        this.animationInProgress = 0;
        AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class 22 extends AnimatorListenerAdapter {
        22() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$22$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.22.this.lambda$onAnimationEnd$0();
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
    public /* synthetic */ void lambda$open$34(AnimatorSet animatorSet) {
        this.notificationsLocker.lock();
        animatorSet.start();
    }

    private void showProgressView(boolean z, final boolean z2) {
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.lineProgressTickRunnable);
            if (z2) {
                this.lineProgressView.setProgress(0.0f, false);
                this.lineProgressView.setProgress(0.3f, true);
                AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
                return;
            }
            this.lineProgressView.setProgress(1.0f, true);
            return;
        }
        AnimatorSet animatorSet = this.progressViewAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.progressViewAnimation = new AnimatorSet();
        if (z2) {
            this.progressView.setVisibility(0);
            this.menuContainer.setEnabled(false);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.menuButton, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.menuButton, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 1.0f));
        } else {
            this.menuButton.setVisibility(0);
            this.menuContainer.setEnabled(true);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.menuButton, View.ALPHA, 1.0f));
        }
        this.progressViewAnimation.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.23
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    return;
                }
                if (!z2) {
                    ArticleViewer.this.progressView.setVisibility(4);
                } else {
                    ArticleViewer.this.menuButton.setVisibility(4);
                }
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
        if (this.adapter[0].currentPage == null || (findFirstVisibleItemPosition = this.layoutManager[0].findFirstVisibleItemPosition()) == -1) {
            return;
        }
        View findViewByPosition = this.layoutManager[0].findViewByPosition(findFirstVisibleItemPosition);
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        String str = "article" + this.adapter[0].currentPage.id;
        SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, findFirstVisibleItemPosition).putInt(str + "o", top);
        String str2 = str + "r";
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(str2, point.x > point.y).commit();
    }

    private void refreshThemeColors() {
        TextView textView = this.deleteView;
        if (textView != null) {
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
            this.deleteView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }
        EditTextBoldCursor editTextBoldCursor = this.searchField;
        if (editTextBoldCursor != null) {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(i));
            this.searchField.setCursorColor(Theme.getColor(i));
            this.searchField.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        }
        ImageView imageView = this.searchUpButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        ImageView imageView2 = this.searchDownButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        SimpleTextView simpleTextView = this.searchCountText;
        if (simpleTextView != null) {
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        ActionBarMenuItem actionBarMenuItem = this.menuButton;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.redrawPopup(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground));
            this.menuButton.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem), false);
            this.menuButton.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        }
        ImageView imageView3 = this.clearButton;
        if (imageView3 != null) {
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
        }
        BackDrawable backDrawable = this.backDrawable;
        if (backDrawable != null) {
            backDrawable.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        }
    }

    public void close(boolean z, boolean z2) {
        if (this.parentActivity == null || this.closeAnimationInProgress || !this.isVisible || checkAnimation()) {
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
        } else if (this.searchContainer.getTag() != null) {
            showSearch(false);
        } else {
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.windowView, View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
            this.animationInProgress = 2;
            this.animationEndRunnable = new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$close$37();
                }
            };
            animatorSet.setDuration(150L);
            animatorSet.setInterpolator(this.interpolator);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.ArticleViewer.26
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (ArticleViewer.this.animationEndRunnable != null) {
                        ArticleViewer.this.animationEndRunnable.run();
                        ArticleViewer.this.animationEndRunnable = null;
                    }
                }
            });
            this.transitionAnimationStartTime = System.currentTimeMillis();
            if (Build.VERSION.SDK_INT >= 18) {
                this.containerView.setLayerType(2, null);
            }
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$37() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            frameLayout.setLayerType(0, null);
        }
        this.animationInProgress = 0;
        onClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClosed() {
        this.isVisible = false;
        for (int i = 0; i < this.listView.length; i++) {
            this.adapter[i].cleanup();
        }
        try {
            this.parentActivity.getWindow().clearFlags(128);
        } catch (Exception e) {
            FileLog.e(e);
        }
        for (int i2 = 0; i2 < this.createdWebViews.size(); i2++) {
            this.createdWebViews.get(i2).destroyWebView(false);
        }
        this.containerView.post(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$onClosed$38();
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$38() {
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadChannel(final BlockChannelCell blockChannelCell, final WebpageAdapter webpageAdapter, TLRPC$Chat tLRPC$Chat) {
        if (this.loadingChannel || !ChatObject.isPublic(tLRPC$Chat)) {
            return;
        }
        this.loadingChannel = true;
        TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
        tLRPC$TL_contacts_resolveUsername.username = tLRPC$Chat.username;
        final int i = UserConfig.selectedAccount;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda37
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$loadChannel$40(webpageAdapter, i, blockChannelCell, tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChannel$40(final WebpageAdapter webpageAdapter, final int i, final BlockChannelCell blockChannelCell, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.this.lambda$loadChannel$39(webpageAdapter, tLRPC$TL_error, tLObject, i, blockChannelCell);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadChannel$39(WebpageAdapter webpageAdapter, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        this.loadingChannel = false;
        if (this.parentFragment == null || webpageAdapter.blocks.isEmpty()) {
            return;
        }
        if (tLRPC$TL_error == null) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            if (!tLRPC$TL_contacts_resolvedPeer.chats.isEmpty()) {
                MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_contacts_resolvedPeer.chats.get(0);
                this.loadedChannel = tLRPC$Chat;
                if (tLRPC$Chat.left && !tLRPC$Chat.kicked) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void joinChannel(final BlockChannelCell blockChannelCell, final TLRPC$Chat tLRPC$Chat) {
        final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
        tLRPC$TL_channels_joinChannel.channel = MessagesController.getInputChannel(tLRPC$Chat);
        final int i = UserConfig.selectedAccount;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_channels_joinChannel, new RequestDelegate() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda36
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$joinChannel$44(blockChannelCell, i, tLRPC$TL_channels_joinChannel, tLRPC$Chat, tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$joinChannel$44(final BlockChannelCell blockChannelCell, final int i, final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel, final TLRPC$Chat tLRPC$Chat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        boolean z;
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    ArticleViewer.this.lambda$joinChannel$41(blockChannelCell, i, tLRPC$TL_error, tLRPC$TL_channels_joinChannel);
                }
            });
            return;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        int i2 = 0;
        while (true) {
            if (i2 >= tLRPC$Updates.updates.size()) {
                z = false;
                break;
            }
            TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i2);
            if ((tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) && (((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).message.action instanceof TLRPC$TL_messageActionChatAddUser)) {
                z = true;
                break;
            }
            i2++;
        }
        MessagesController.getInstance(i).processUpdates(tLRPC$Updates, false);
        if (!z) {
            MessagesController.getInstance(i).generateJoinMessage(tLRPC$Chat.id, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.BlockChannelCell.this.setState(2, false);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                ArticleViewer.lambda$joinChannel$43(i, tLRPC$Chat);
            }
        }, 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = tLRPC$Chat.id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$joinChannel$41(BlockChannelCell blockChannelCell, int i, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tLRPC$TL_error, this.parentFragment, tLRPC$TL_channels_joinChannel, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joinChannel$43(int i, TLRPC$Chat tLRPC$Chat) {
        MessagesController.getInstance(i).loadFullChat(tLRPC$Chat.id, 0, true);
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
        try {
            if (windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
            }
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        for (int i = 0; i < this.createdWebViews.size(); i++) {
            this.createdWebViews.get(i).destroyWebView(true);
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
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ArticleViewer.this.lambda$showDialog$45(dialogInterface);
                }
            });
            dialog.show();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$45(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class WebPageUtils {
        public static TLRPC$Photo getPhotoWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
                TLRPC$Photo tLRPC$Photo = tLRPC$WebPage.photo;
                if (tLRPC$Photo != null && tLRPC$Photo.id == j) {
                    return tLRPC$Photo;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.photos.size(); i++) {
                    TLRPC$Photo tLRPC$Photo2 = tLRPC$WebPage.cached_page.photos.get(i);
                    if (tLRPC$Photo2.id == j) {
                        return tLRPC$Photo2;
                    }
                }
            }
            return null;
        }

        public static TLRPC$Document getDocumentWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
                TLRPC$Document tLRPC$Document = tLRPC$WebPage.document;
                if (tLRPC$Document != null && tLRPC$Document.id == j) {
                    return tLRPC$Document;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.documents.size(); i++) {
                    TLRPC$Document tLRPC$Document2 = tLRPC$WebPage.cached_page.documents.get(i);
                    if (tLRPC$Document2.id == j) {
                        return tLRPC$Document2;
                    }
                }
            }
            return null;
        }

        public static boolean isVideo(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            TLRPC$Document documentWithId;
            if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || (documentWithId = getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static TLObject getMedia(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                return getPhotoWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                return getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id);
            }
            return null;
        }

        public static File getMediaFile(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            TLRPC$Document documentWithId;
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            } else if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || (documentWithId = getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) == null) {
                return null;
            } else {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class WebpageAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$TL_pageBlockChannel channelBlock;
        private Context context;
        private TLRPC$WebPage currentPage;
        private boolean isRtl;
        private ArrayList<TLRPC$PageBlock> localBlocks = new ArrayList<>();
        private ArrayList<TLRPC$PageBlock> blocks = new ArrayList<>();
        private ArrayList<TLRPC$PageBlock> photoBlocks = new ArrayList<>();
        private HashMap<String, Integer> anchors = new HashMap<>();
        private HashMap<String, Integer> anchorsOffset = new HashMap<>();
        private HashMap<String, TLRPC$TL_textAnchor> anchorsParent = new HashMap<>();
        private HashMap<TLRPC$TL_pageBlockAudio, MessageObject> audioBlocks = new HashMap<>();
        private ArrayList<MessageObject> audioMessages = new ArrayList<>();
        private HashMap<Object, TLRPC$PageBlock> textToBlocks = new HashMap<>();
        private ArrayList<Object> textBlocks = new ArrayList<>();
        private HashMap<String, Integer> searchTextOffset = new HashMap<>();

        public WebpageAdapter(Context context) {
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TLRPC$Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public TLRPC$Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        private void setRichTextParents(TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2) {
            if (tLRPC$RichText2 == null) {
                return;
            }
            tLRPC$RichText2.parentRichText = tLRPC$RichText;
            if (tLRPC$RichText2 instanceof TLRPC$TL_textFixed) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textFixed) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textItalic) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textItalic) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textBold) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textBold) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textUnderline) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUnderline) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textStrike) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textStrike) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textEmail) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textEmail) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textPhone) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUrl) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
                int size = tLRPC$RichText2.texts.size();
                for (int i = 0; i < size; i++) {
                    setRichTextParents(tLRPC$RichText2, tLRPC$RichText2.texts.get(i));
                }
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSuperscript) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSuperscript) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textMarked) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textMarked) tLRPC$RichText2).text);
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
                TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) tLRPC$RichText2;
                setRichTextParents(tLRPC$RichText2, tLRPC$TL_textAnchor.text);
                String lowerCase = tLRPC$TL_textAnchor.name.toLowerCase();
                this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                TLRPC$RichText tLRPC$RichText3 = tLRPC$TL_textAnchor.text;
                if (tLRPC$RichText3 instanceof TLRPC$TL_textPlain) {
                    if (!TextUtils.isEmpty(((TLRPC$TL_textPlain) tLRPC$RichText3).text)) {
                        this.anchorsParent.put(lowerCase, tLRPC$TL_textAnchor);
                    }
                } else if (!(tLRPC$RichText3 instanceof TLRPC$TL_textEmpty)) {
                    this.anchorsParent.put(lowerCase, tLRPC$TL_textAnchor);
                }
                this.anchorsOffset.put(lowerCase, -1);
            }
        }

        private void addTextBlock(Object obj, TLRPC$PageBlock tLRPC$PageBlock) {
            if ((obj instanceof TLRPC$TL_textEmpty) || this.textToBlocks.containsKey(obj)) {
                return;
            }
            this.textToBlocks.put(obj, tLRPC$PageBlock);
            this.textBlocks.add(obj);
        }

        private void setRichTextParents(TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.text, tLRPC$TL_pageBlockEmbedPost);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.credit, tLRPC$TL_pageBlockEmbedPost);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = (TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockParagraph.text);
                addTextBlock(tLRPC$TL_pageBlockParagraph.text, tLRPC$TL_pageBlockParagraph);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
                TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker = (TLRPC$TL_pageBlockKicker) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockKicker.text);
                addTextBlock(tLRPC$TL_pageBlockKicker.text, tLRPC$TL_pageBlockKicker);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
                TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = (TLRPC$TL_pageBlockFooter) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockFooter.text);
                addTextBlock(tLRPC$TL_pageBlockFooter.text, tLRPC$TL_pageBlockFooter);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
                TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = (TLRPC$TL_pageBlockHeader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockHeader.text);
                addTextBlock(tLRPC$TL_pageBlockHeader.text, tLRPC$TL_pageBlockHeader);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
                TLRPC$TL_pageBlockPreformatted tLRPC$TL_pageBlockPreformatted = (TLRPC$TL_pageBlockPreformatted) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockPreformatted.text);
                addTextBlock(tLRPC$TL_pageBlockPreformatted.text, tLRPC$TL_pageBlockPreformatted);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
                TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = (TLRPC$TL_pageBlockSubheader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockSubheader.text);
                addTextBlock(tLRPC$TL_pageBlockSubheader.text, tLRPC$TL_pageBlockSubheader);
            } else {
                int i = 0;
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                    TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockSlideshow.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockSlideshow.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockSlideshow.caption.text, tLRPC$TL_pageBlockSlideshow);
                    addTextBlock(tLRPC$TL_pageBlockSlideshow.caption.credit, tLRPC$TL_pageBlockSlideshow);
                    int size = tLRPC$TL_pageBlockSlideshow.items.size();
                    while (i < size) {
                        setRichTextParents(tLRPC$TL_pageBlockSlideshow.items.get(i));
                        i++;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                    TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockPhoto.caption.text, tLRPC$TL_pageBlockPhoto);
                    addTextBlock(tLRPC$TL_pageBlockPhoto.caption.credit, tLRPC$TL_pageBlockPhoto);
                } else if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
                    TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
                    if (tL_pageBlockListItem.textItem != null) {
                        setRichTextParents(null, tL_pageBlockListItem.textItem);
                        addTextBlock(tL_pageBlockListItem.textItem, tL_pageBlockListItem);
                    } else if (tL_pageBlockListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockListItem.blockItem);
                    }
                } else if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
                    if (tL_pageBlockOrderedListItem.textItem != null) {
                        setRichTextParents(null, tL_pageBlockOrderedListItem.textItem);
                        addTextBlock(tL_pageBlockOrderedListItem.textItem, tL_pageBlockOrderedListItem);
                    } else if (tL_pageBlockOrderedListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockOrderedListItem.blockItem);
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                    TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockCollage.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockCollage.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockCollage.caption.text, tLRPC$TL_pageBlockCollage);
                    addTextBlock(tLRPC$TL_pageBlockCollage.caption.credit, tLRPC$TL_pageBlockCollage);
                    int size2 = tLRPC$TL_pageBlockCollage.items.size();
                    while (i < size2) {
                        setRichTextParents(tLRPC$TL_pageBlockCollage.items.get(i));
                        i++;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
                    TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = (TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockEmbed.caption.text, tLRPC$TL_pageBlockEmbed);
                    addTextBlock(tLRPC$TL_pageBlockEmbed.caption.credit, tLRPC$TL_pageBlockEmbed);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
                    TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = (TLRPC$TL_pageBlockSubtitle) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockSubtitle.text);
                    addTextBlock(tLRPC$TL_pageBlockSubtitle.text, tLRPC$TL_pageBlockSubtitle);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                    TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = (TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.caption);
                    addTextBlock(tLRPC$TL_pageBlockBlockquote.text, tLRPC$TL_pageBlockBlockquote);
                    addTextBlock(tLRPC$TL_pageBlockBlockquote.caption, tLRPC$TL_pageBlockBlockquote);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
                    TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockDetails.title);
                    addTextBlock(tLRPC$TL_pageBlockDetails.title, tLRPC$TL_pageBlockDetails);
                    int size3 = tLRPC$TL_pageBlockDetails.blocks.size();
                    while (i < size3) {
                        setRichTextParents(tLRPC$TL_pageBlockDetails.blocks.get(i));
                        i++;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                    TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockVideo.caption.text, tLRPC$TL_pageBlockVideo);
                    addTextBlock(tLRPC$TL_pageBlockVideo.caption.credit, tLRPC$TL_pageBlockVideo);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                    TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = (TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockPullquote.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockPullquote.caption);
                    addTextBlock(tLRPC$TL_pageBlockPullquote.text, tLRPC$TL_pageBlockPullquote);
                    addTextBlock(tLRPC$TL_pageBlockPullquote.caption, tLRPC$TL_pageBlockPullquote);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                    TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockAudio.caption.text, tLRPC$TL_pageBlockAudio);
                    addTextBlock(tLRPC$TL_pageBlockAudio.caption.credit, tLRPC$TL_pageBlockAudio);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                    TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable = (TLRPC$TL_pageBlockTable) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockTable.title);
                    addTextBlock(tLRPC$TL_pageBlockTable.title, tLRPC$TL_pageBlockTable);
                    int size4 = tLRPC$TL_pageBlockTable.rows.size();
                    for (int i2 = 0; i2 < size4; i2++) {
                        TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow = tLRPC$TL_pageBlockTable.rows.get(i2);
                        int size5 = tLRPC$TL_pageTableRow.cells.size();
                        for (int i3 = 0; i3 < size5; i3++) {
                            TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = tLRPC$TL_pageTableRow.cells.get(i3);
                            setRichTextParents(null, tLRPC$TL_pageTableCell.text);
                            addTextBlock(tLRPC$TL_pageTableCell.text, tLRPC$TL_pageBlockTable);
                        }
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
                    TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle = (TLRPC$TL_pageBlockTitle) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockTitle.text);
                    addTextBlock(tLRPC$TL_pageBlockTitle.text, tLRPC$TL_pageBlockTitle);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    setRichTextParents(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
                    TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = (TLRPC$TL_pageBlockAuthorDate) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockAuthorDate.author);
                    addTextBlock(tLRPC$TL_pageBlockAuthorDate.author, tLRPC$TL_pageBlockAuthorDate);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                    TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.text, tLRPC$TL_pageBlockMap);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.credit, tLRPC$TL_pageBlockMap);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                    TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = (TLRPC$TL_pageBlockRelatedArticles) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockRelatedArticles.title);
                    addTextBlock(tLRPC$TL_pageBlockRelatedArticles.title, tLRPC$TL_pageBlockRelatedArticles);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:146:0x04e2  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x050c  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x05a5 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.tgnet.TLRPC$PageBlock] */
        /* JADX WARN: Type inference failed for: r1v41, types: [org.telegram.tgnet.TLRPC$PageBlock] */
        /* JADX WARN: Type inference failed for: r24v0, types: [org.telegram.ui.ArticleViewer$WebpageAdapter] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void addBlock(WebpageAdapter webpageAdapter, TLRPC$PageBlock tLRPC$PageBlock, int i, int i2, int i3) {
            TLRPC$TL_pageListOrderedItemText tLRPC$TL_pageListOrderedItemText;
            TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem;
            String str;
            TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem2;
            int i4;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem;
            int i5;
            int i6;
            TLRPC$TL_pageListItemText tLRPC$TL_pageListItemText;
            int i7;
            int i8;
            TL_pageBlockListParent tL_pageBlockListParent;
            TLRPC$TL_pageBlockList tLRPC$TL_pageBlockList;
            String str2;
            TL_pageBlockListItem tL_pageBlockListItem;
            int i9;
            boolean z = tLRPC$PageBlock instanceof TL_pageBlockDetailsChild;
            TLRPC$PageBlock tLRPC$PageBlock2 = z ? ((TL_pageBlockDetailsChild) tLRPC$PageBlock).block : tLRPC$PageBlock;
            if (!(tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockList) && !(tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockOrderedList)) {
                setRichTextParents(tLRPC$PageBlock2);
                addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock2);
            }
            TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tLRPC$PageBlock2);
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockUnsupported) {
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockAnchor) {
                this.anchors.put(((TLRPC$TL_pageBlockAnchor) lastNonListPageBlock).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                return;
            }
            boolean z2 = lastNonListPageBlock instanceof TLRPC$TL_pageBlockList;
            if (!z2 && !(lastNonListPageBlock instanceof TLRPC$TL_pageBlockOrderedList)) {
                this.blocks.add(tLRPC$PageBlock);
            }
            int i10 = 0;
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockAudio) {
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) lastNonListPageBlock;
                TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                tLRPC$TL_message.out = true;
                int i11 = -Long.valueOf(tLRPC$TL_pageBlockAudio.audio_id).hashCode();
                lastNonListPageBlock.mid = i11;
                tLRPC$TL_message.id = i11;
                tLRPC$TL_message.peer_id = new TLRPC$TL_peerUser();
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
                TLRPC$Peer tLRPC$Peer = tLRPC$TL_message.peer_id;
                long clientUserId = UserConfig.getInstance(ArticleViewer.this.currentAccount).getClientUserId();
                tLRPC$Peer.user_id = clientUserId;
                tLRPC$TL_peerUser.user_id = clientUserId;
                tLRPC$TL_message.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_message.message = "";
                TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
                tLRPC$TL_message.media = tLRPC$TL_messageMediaDocument;
                tLRPC$TL_messageMediaDocument.webpage = this.currentPage;
                tLRPC$TL_messageMediaDocument.flags |= 3;
                tLRPC$TL_messageMediaDocument.document = getDocumentWithId(tLRPC$TL_pageBlockAudio.audio_id);
                tLRPC$TL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(tLRPC$TL_pageBlockAudio, messageObject);
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
            1 r13 = null;
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) lastNonListPageBlock;
                if (tLRPC$TL_pageBlockEmbedPost.blocks.isEmpty()) {
                    return;
                }
                lastNonListPageBlock.level = -1;
                while (i10 < tLRPC$TL_pageBlockEmbedPost.blocks.size()) {
                    TLRPC$PageBlock tLRPC$PageBlock3 = tLRPC$TL_pageBlockEmbedPost.blocks.get(i10);
                    if (!(tLRPC$PageBlock3 instanceof TLRPC$TL_pageBlockUnsupported)) {
                        if (tLRPC$PageBlock3 instanceof TLRPC$TL_pageBlockAnchor) {
                            this.anchors.put(((TLRPC$TL_pageBlockAnchor) tLRPC$PageBlock3).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        } else {
                            tLRPC$PageBlock3.level = 1;
                            if (i10 == tLRPC$TL_pageBlockEmbedPost.blocks.size() - 1) {
                                tLRPC$PageBlock3.bottom = true;
                            }
                            this.blocks.add(tLRPC$PageBlock3);
                            addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock3);
                        }
                    }
                    i10++;
                }
                if (TextUtils.isEmpty(ArticleViewer.getPlainText(tLRPC$TL_pageBlockEmbedPost.caption.text)) && TextUtils.isEmpty(ArticleViewer.getPlainText(tLRPC$TL_pageBlockEmbedPost.caption.credit))) {
                    return;
                }
                TL_pageBlockEmbedPostCaption tL_pageBlockEmbedPostCaption = new TL_pageBlockEmbedPostCaption();
                tL_pageBlockEmbedPostCaption.parent = tLRPC$TL_pageBlockEmbedPost;
                tL_pageBlockEmbedPostCaption.caption = tLRPC$TL_pageBlockEmbedPost.caption;
                this.blocks.add(tL_pageBlockEmbedPostCaption);
            } else if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = (TLRPC$TL_pageBlockRelatedArticles) lastNonListPageBlock;
                TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow = new TL_pageBlockRelatedArticlesShadow();
                tL_pageBlockRelatedArticlesShadow.parent = tLRPC$TL_pageBlockRelatedArticles;
                ArrayList<TLRPC$PageBlock> arrayList = this.blocks;
                arrayList.add(arrayList.size() - 1, tL_pageBlockRelatedArticlesShadow);
                int size = tLRPC$TL_pageBlockRelatedArticles.articles.size();
                while (i10 < size) {
                    TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = new TL_pageBlockRelatedArticlesChild();
                    tL_pageBlockRelatedArticlesChild.parent = tLRPC$TL_pageBlockRelatedArticles;
                    tL_pageBlockRelatedArticlesChild.num = i10;
                    this.blocks.add(tL_pageBlockRelatedArticlesChild);
                    i10++;
                }
                if (i3 == 0) {
                    TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow2 = new TL_pageBlockRelatedArticlesShadow();
                    tL_pageBlockRelatedArticlesShadow2.parent = tLRPC$TL_pageBlockRelatedArticles;
                    this.blocks.add(tL_pageBlockRelatedArticlesShadow2);
                }
            } else if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
                int size2 = tLRPC$TL_pageBlockDetails.blocks.size();
                while (i10 < size2) {
                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild = new TL_pageBlockDetailsChild();
                    tL_pageBlockDetailsChild.parent = tLRPC$PageBlock;
                    tL_pageBlockDetailsChild.block = tLRPC$TL_pageBlockDetails.blocks.get(i10);
                    addBlock(webpageAdapter, ArticleViewer.this.wrapInTableBlock(tLRPC$PageBlock, tL_pageBlockDetailsChild), i + 1, i2, i3);
                    i10++;
                }
            } else {
                String str3 = "%d.";
                if (z2) {
                    TLRPC$TL_pageBlockList tLRPC$TL_pageBlockList2 = (TLRPC$TL_pageBlockList) lastNonListPageBlock;
                    TL_pageBlockListParent tL_pageBlockListParent2 = new TL_pageBlockListParent();
                    tL_pageBlockListParent2.pageBlockList = tLRPC$TL_pageBlockList2;
                    tL_pageBlockListParent2.level = i2;
                    int size3 = tLRPC$TL_pageBlockList2.items.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        TLRPC$PageListItem tLRPC$PageListItem = tLRPC$TL_pageBlockList2.items.get(i12);
                        TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
                        tL_pageBlockListItem2.index = i12;
                        tL_pageBlockListItem2.parent = tL_pageBlockListParent2;
                        if (!tLRPC$TL_pageBlockList2.ordered) {
                            tL_pageBlockListItem2.num = "•";
                        } else if (this.isRtl) {
                            tL_pageBlockListItem2.num = String.format(".%d", Integer.valueOf(i12 + 1));
                        } else {
                            tL_pageBlockListItem2.num = String.format(str3, Integer.valueOf(i12 + 1));
                        }
                        tL_pageBlockListParent2.items.add(tL_pageBlockListItem2);
                        if (tLRPC$PageListItem instanceof TLRPC$TL_pageListItemText) {
                            tL_pageBlockListItem2.textItem = ((TLRPC$TL_pageListItemText) tLRPC$PageListItem).text;
                            tLRPC$TL_pageListItemText = tLRPC$PageListItem;
                        } else {
                            boolean z3 = tLRPC$PageListItem instanceof TLRPC$TL_pageListItemBlocks;
                            tLRPC$TL_pageListItemText = tLRPC$PageListItem;
                            if (z3) {
                                TLRPC$TL_pageListItemBlocks tLRPC$TL_pageListItemBlocks = (TLRPC$TL_pageListItemBlocks) tLRPC$PageListItem;
                                if (!tLRPC$TL_pageListItemBlocks.blocks.isEmpty()) {
                                    tL_pageBlockListItem2.blockItem = tLRPC$TL_pageListItemBlocks.blocks.get(0);
                                    tLRPC$TL_pageListItemText = tLRPC$PageListItem;
                                } else {
                                    TLRPC$TL_pageListItemText tLRPC$TL_pageListItemText2 = new TLRPC$TL_pageListItemText();
                                    TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
                                    tLRPC$TL_textPlain.text = " ";
                                    tLRPC$TL_pageListItemText2.text = tLRPC$TL_textPlain;
                                    tLRPC$TL_pageListItemText = tLRPC$TL_pageListItemText2;
                                }
                            }
                        }
                        TLRPC$PageListItem tLRPC$PageListItem2 = tLRPC$TL_pageListItemText;
                        if (z) {
                            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = new TL_pageBlockDetailsChild();
                            tL_pageBlockDetailsChild2.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                            tL_pageBlockDetailsChild2.block = tL_pageBlockListItem2;
                            i7 = i12;
                            i8 = size3;
                            tL_pageBlockListParent = tL_pageBlockListParent2;
                            tLRPC$TL_pageBlockList = tLRPC$TL_pageBlockList2;
                            str2 = str3;
                            addBlock(webpageAdapter, tL_pageBlockDetailsChild2, i, i2 + 1, i3);
                        } else {
                            i7 = i12;
                            i8 = size3;
                            tL_pageBlockListParent = tL_pageBlockListParent2;
                            tLRPC$TL_pageBlockList = tLRPC$TL_pageBlockList2;
                            str2 = str3;
                            addBlock(webpageAdapter, i7 == 0 ? ArticleViewer.this.fixListBlock(tLRPC$PageBlock, tL_pageBlockListItem2) : tL_pageBlockListItem2, i, i2 + 1, i3);
                        }
                        if (tLRPC$PageListItem2 instanceof TLRPC$TL_pageListItemBlocks) {
                            TLRPC$TL_pageListItemBlocks tLRPC$TL_pageListItemBlocks2 = (TLRPC$TL_pageListItemBlocks) tLRPC$PageListItem2;
                            int size4 = tLRPC$TL_pageListItemBlocks2.blocks.size();
                            int i13 = 1;
                            while (i13 < size4) {
                                TL_pageBlockListItem tL_pageBlockListItem3 = new TL_pageBlockListItem();
                                tL_pageBlockListItem3.blockItem = tLRPC$TL_pageListItemBlocks2.blocks.get(i13);
                                tL_pageBlockListItem3.parent = tL_pageBlockListParent;
                                if (z) {
                                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild3 = new TL_pageBlockDetailsChild();
                                    tL_pageBlockDetailsChild3.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                                    tL_pageBlockDetailsChild3.block = tL_pageBlockListItem3;
                                    tL_pageBlockListItem = tL_pageBlockListItem3;
                                    i9 = i13;
                                    addBlock(webpageAdapter, tL_pageBlockDetailsChild3, i, i2 + 1, i3);
                                } else {
                                    tL_pageBlockListItem = tL_pageBlockListItem3;
                                    i9 = i13;
                                    addBlock(webpageAdapter, tL_pageBlockListItem, i, i2 + 1, i3);
                                }
                                tL_pageBlockListParent.items.add(tL_pageBlockListItem);
                                i13 = i9 + 1;
                            }
                        }
                        i12 = i7 + 1;
                        str3 = str2;
                        tL_pageBlockListParent2 = tL_pageBlockListParent;
                        size3 = i8;
                        tLRPC$TL_pageBlockList2 = tLRPC$TL_pageBlockList;
                        r13 = null;
                    }
                    return;
                }
                String str4 = "%d.";
                if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockOrderedList) {
                    TLRPC$TL_pageBlockOrderedList tLRPC$TL_pageBlockOrderedList = (TLRPC$TL_pageBlockOrderedList) lastNonListPageBlock;
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = new TL_pageBlockOrderedListParent();
                    tL_pageBlockOrderedListParent.pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList;
                    tL_pageBlockOrderedListParent.level = i2;
                    int size5 = tLRPC$TL_pageBlockOrderedList.items.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem3 = tLRPC$TL_pageBlockOrderedList.items.get(i14);
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
                        tL_pageBlockOrderedListItem2.index = i14;
                        tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListParent;
                        tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem2);
                        if (tLRPC$PageListOrderedItem3 instanceof TLRPC$TL_pageListOrderedItemText) {
                            TLRPC$TL_pageListOrderedItemText tLRPC$TL_pageListOrderedItemText2 = (TLRPC$TL_pageListOrderedItemText) tLRPC$PageListOrderedItem3;
                            tL_pageBlockOrderedListItem2.textItem = tLRPC$TL_pageListOrderedItemText2.text;
                            if (TextUtils.isEmpty(tLRPC$TL_pageListOrderedItemText2.num)) {
                                if (this.isRtl) {
                                    tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i14 + 1));
                                } else {
                                    tL_pageBlockOrderedListItem2.num = String.format(str4, Integer.valueOf(i14 + 1));
                                }
                            } else if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = "." + tLRPC$TL_pageListOrderedItemText2.num;
                            } else {
                                tL_pageBlockOrderedListItem2.num = tLRPC$TL_pageListOrderedItemText2.num + ".";
                            }
                        } else if (tLRPC$PageListOrderedItem3 instanceof TLRPC$TL_pageListOrderedItemBlocks) {
                            TLRPC$TL_pageListOrderedItemBlocks tLRPC$TL_pageListOrderedItemBlocks = (TLRPC$TL_pageListOrderedItemBlocks) tLRPC$PageListOrderedItem3;
                            if (!tLRPC$TL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                                tL_pageBlockOrderedListItem2.blockItem = tLRPC$TL_pageListOrderedItemBlocks.blocks.get(0);
                                tLRPC$TL_pageListOrderedItemText = tLRPC$PageListOrderedItem3;
                            } else {
                                TLRPC$TL_pageListOrderedItemText tLRPC$TL_pageListOrderedItemText3 = new TLRPC$TL_pageListOrderedItemText();
                                TLRPC$TL_textPlain tLRPC$TL_textPlain2 = new TLRPC$TL_textPlain();
                                tLRPC$TL_textPlain2.text = " ";
                                tLRPC$TL_pageListOrderedItemText3.text = tLRPC$TL_textPlain2;
                                tLRPC$TL_pageListOrderedItemText = tLRPC$TL_pageListOrderedItemText3;
                            }
                            if (TextUtils.isEmpty(tLRPC$TL_pageListOrderedItemBlocks.num)) {
                                if (this.isRtl) {
                                    tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i14 + 1));
                                } else {
                                    tL_pageBlockOrderedListItem2.num = String.format(str4, Integer.valueOf(i14 + 1));
                                }
                            } else if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = "." + tLRPC$TL_pageListOrderedItemBlocks.num;
                            } else {
                                tL_pageBlockOrderedListItem2.num = tLRPC$TL_pageListOrderedItemBlocks.num + ".";
                            }
                            tLRPC$PageListOrderedItem = tLRPC$TL_pageListOrderedItemText;
                            if (!z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild4 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild4.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                                tL_pageBlockDetailsChild4.block = tL_pageBlockOrderedListItem2;
                                str = str4;
                                tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                                i4 = i14;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild4, i, i2 + 1, i3);
                            } else {
                                str = str4;
                                tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                                i4 = i14;
                                addBlock(webpageAdapter, i4 == 0 ? ArticleViewer.this.fixListBlock(tLRPC$PageBlock, tL_pageBlockOrderedListItem2) : tL_pageBlockOrderedListItem2, i, i2 + 1, i3);
                            }
                            if (!(tLRPC$PageListOrderedItem2 instanceof TLRPC$TL_pageListOrderedItemBlocks)) {
                                TLRPC$TL_pageListOrderedItemBlocks tLRPC$TL_pageListOrderedItemBlocks2 = (TLRPC$TL_pageListOrderedItemBlocks) tLRPC$PageListOrderedItem2;
                                int size6 = tLRPC$TL_pageListOrderedItemBlocks2.blocks.size();
                                int i15 = 1;
                                while (i15 < size6) {
                                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = new TL_pageBlockOrderedListItem();
                                    tL_pageBlockOrderedListItem3.blockItem = tLRPC$TL_pageListOrderedItemBlocks2.blocks.get(i15);
                                    tL_pageBlockOrderedListItem3.parent = tL_pageBlockOrderedListParent;
                                    if (z) {
                                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild5 = new TL_pageBlockDetailsChild();
                                        tL_pageBlockDetailsChild5.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                                        tL_pageBlockDetailsChild5.block = tL_pageBlockOrderedListItem3;
                                        tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                        i5 = i15;
                                        i6 = size6;
                                        addBlock(webpageAdapter, tL_pageBlockDetailsChild5, i, i2 + 1, i3);
                                    } else {
                                        tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                        i5 = i15;
                                        i6 = size6;
                                        addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                                    }
                                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                                    i15 = i5 + 1;
                                    size6 = i6;
                                }
                                continue;
                            }
                            i14 = i4 + 1;
                            str4 = str;
                        }
                        tLRPC$PageListOrderedItem = tLRPC$PageListOrderedItem3;
                        if (!z) {
                        }
                        if (!(tLRPC$PageListOrderedItem2 instanceof TLRPC$TL_pageListOrderedItemBlocks)) {
                        }
                        i14 = i4 + 1;
                        str4 = str;
                    }
                }
            }
        }

        private void addAllMediaFromBlock(WebpageAdapter webpageAdapter, TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$TL_pageBlockPhoto.photo_id);
                if (photoWithId != null) {
                    tLRPC$TL_pageBlockPhoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 56, true);
                    tLRPC$TL_pageBlockPhoto.thumbObject = photoWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                }
            } else if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) && WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                TLRPC$Document documentWithId = getDocumentWithId(tLRPC$TL_pageBlockVideo.video_id);
                if (documentWithId != null) {
                    tLRPC$TL_pageBlockVideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 56, true);
                    tLRPC$TL_pageBlockVideo.thumbObject = documentWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                }
            } else {
                int i = 0;
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                    TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
                    int size = tLRPC$TL_pageBlockSlideshow.items.size();
                    while (i < size) {
                        TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$TL_pageBlockSlideshow.items.get(i);
                        tLRPC$PageBlock2.groupId = ArticleViewer.this.lastBlockNum;
                        addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock2);
                        i++;
                    }
                    ArticleViewer.access$13408(ArticleViewer.this);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                    TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                    int size2 = tLRPC$TL_pageBlockCollage.items.size();
                    while (i < size2) {
                        TLRPC$PageBlock tLRPC$PageBlock3 = tLRPC$TL_pageBlockCollage.items.get(i);
                        tLRPC$PageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                        addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock3);
                        i++;
                    }
                    ArticleViewer.access$13408(ArticleViewer.this);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    addAllMediaFromBlock(webpageAdapter, ((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView;
            View blockVideoCell;
            if (i != 90) {
                switch (i) {
                    case 0:
                        textView = new BlockParagraphCell(this.context, this);
                        break;
                    case 1:
                        textView = new BlockHeaderCell(this.context, this);
                        break;
                    case 2:
                        textView = new BlockDividerCell(this.context);
                        break;
                    case 3:
                        textView = new BlockEmbedCell(this.context, this);
                        break;
                    case 4:
                        textView = new BlockSubtitleCell(this.context, this);
                        break;
                    case 5:
                        blockVideoCell = new BlockVideoCell(this.context, this, 0);
                        textView = blockVideoCell;
                        break;
                    case 6:
                        textView = new BlockPullquoteCell(this.context, this);
                        break;
                    case 7:
                        textView = new BlockBlockquoteCell(this.context, this);
                        break;
                    case 8:
                        textView = new BlockSlideshowCell(this.context, this);
                        break;
                    case 9:
                        blockVideoCell = new BlockPhotoCell(this.context, this, 0);
                        textView = blockVideoCell;
                        break;
                    case 10:
                        textView = new BlockAuthorDateCell(this.context, this);
                        break;
                    case 11:
                        textView = new BlockTitleCell(this.context, this);
                        break;
                    case 12:
                        textView = new BlockListItemCell(this.context, this);
                        break;
                    case 13:
                        textView = new BlockFooterCell(this.context, this);
                        break;
                    case 14:
                        textView = new BlockPreformattedCell(this.context, this);
                        break;
                    case 15:
                        textView = new BlockSubheaderCell(this.context, this);
                        break;
                    case 16:
                        textView = new BlockEmbedPostCell(this.context, this);
                        break;
                    case 17:
                        textView = new BlockCollageCell(this.context, this);
                        break;
                    case 18:
                        blockVideoCell = new BlockChannelCell(this.context, this, 0);
                        textView = blockVideoCell;
                        break;
                    case 19:
                        textView = new BlockAudioCell(this.context, this);
                        break;
                    case 20:
                        textView = new BlockKickerCell(this.context, this);
                        break;
                    case 21:
                        textView = new BlockOrderedListItemCell(this.context, this);
                        break;
                    case 22:
                        blockVideoCell = new BlockMapCell(this.context, this, 0);
                        textView = blockVideoCell;
                        break;
                    case 23:
                        textView = new BlockRelatedArticlesCell(this.context, this);
                        break;
                    case 24:
                        textView = new BlockDetailsCell(this.context, this);
                        break;
                    case 25:
                        textView = new BlockTableCell(this.context, this);
                        break;
                    case 26:
                        textView = new BlockRelatedArticlesHeaderCell(this.context, this);
                        break;
                    case 27:
                        textView = new BlockDetailsBottomCell(this.context);
                        break;
                    case 28:
                        textView = new BlockRelatedArticlesShadowCell(this.context);
                        break;
                    default:
                        TextView textView2 = new TextView(this.context);
                        textView2.setBackgroundColor(-65536);
                        textView2.setTextColor(-16777216);
                        textView2.setTextSize(1, 20.0f);
                        textView = textView2;
                        break;
                }
            } else {
                textView = new ReportCell(this.context);
            }
            textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            textView.setFocusable(true);
            return new RecyclerListView.Holder(textView);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < this.localBlocks.size()) {
                bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, this.localBlocks.get(i), i, this.localBlocks.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 90) {
                ReportCell reportCell = (ReportCell) viewHolder.itemView;
                TLRPC$Page tLRPC$Page = this.currentPage.cached_page;
                reportCell.setViews(tLRPC$Page != null ? tLRPC$Page.views : 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bindBlockToHolder(int i, RecyclerView.ViewHolder viewHolder, TLRPC$PageBlock tLRPC$PageBlock, int i2, int i3) {
            TLRPC$PageBlock tLRPC$PageBlock2;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                tLRPC$PageBlock2 = ((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover;
            } else {
                tLRPC$PageBlock2 = tLRPC$PageBlock instanceof TL_pageBlockDetailsChild ? ((TL_pageBlockDetailsChild) tLRPC$PageBlock).block : tLRPC$PageBlock;
            }
            if (i != 100) {
                switch (i) {
                    case 0:
                        ((BlockParagraphCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock2);
                        return;
                    case 1:
                        ((BlockHeaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockHeader) tLRPC$PageBlock2);
                        return;
                    case 2:
                        BlockDividerCell blockDividerCell = (BlockDividerCell) viewHolder.itemView;
                        return;
                    case 3:
                        ((BlockEmbedCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock2);
                        return;
                    case 4:
                        ((BlockSubtitleCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSubtitle) tLRPC$PageBlock2);
                        return;
                    case 5:
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.setBlock((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        blockVideoCell.setParentBlock(this.channelBlock, tLRPC$PageBlock);
                        return;
                    case 6:
                        ((BlockPullquoteCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock2);
                        return;
                    case 7:
                        ((BlockBlockquoteCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock2);
                        return;
                    case 8:
                        ((BlockSlideshowCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock2);
                        return;
                    case 9:
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        blockPhotoCell.setParentBlock(tLRPC$PageBlock);
                        return;
                    case 10:
                        ((BlockAuthorDateCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockAuthorDate) tLRPC$PageBlock2);
                        return;
                    case 11:
                        ((BlockTitleCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockTitle) tLRPC$PageBlock2);
                        return;
                    case 12:
                        ((BlockListItemCell) viewHolder.itemView).setBlock((TL_pageBlockListItem) tLRPC$PageBlock2);
                        return;
                    case 13:
                        ((BlockFooterCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockFooter) tLRPC$PageBlock2);
                        return;
                    case 14:
                        ((BlockPreformattedCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockPreformatted) tLRPC$PageBlock2);
                        return;
                    case 15:
                        ((BlockSubheaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSubheader) tLRPC$PageBlock2);
                        return;
                    case 16:
                        ((BlockEmbedPostCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock2);
                        return;
                    case 17:
                        ((BlockCollageCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockCollage) tLRPC$PageBlock2);
                        return;
                    case 18:
                        ((BlockChannelCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2);
                        return;
                    case 19:
                        ((BlockAudioCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockAudio) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        return;
                    case 20:
                        ((BlockKickerCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockKicker) tLRPC$PageBlock2);
                        return;
                    case 21:
                        ((BlockOrderedListItemCell) viewHolder.itemView).setBlock((TL_pageBlockOrderedListItem) tLRPC$PageBlock2);
                        return;
                    case 22:
                        ((BlockMapCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockMap) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        return;
                    case 23:
                        ((BlockRelatedArticlesCell) viewHolder.itemView).setBlock((TL_pageBlockRelatedArticlesChild) tLRPC$PageBlock2);
                        return;
                    case 24:
                        ((BlockDetailsCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockDetails) tLRPC$PageBlock2);
                        return;
                    case 25:
                        ((BlockTableCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockTable) tLRPC$PageBlock2);
                        return;
                    case 26:
                        ((BlockRelatedArticlesHeaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockRelatedArticles) tLRPC$PageBlock2);
                        return;
                    case 27:
                        BlockDetailsBottomCell blockDetailsBottomCell = (BlockDetailsBottomCell) viewHolder.itemView;
                        return;
                    default:
                        return;
                }
            }
            ((TextView) viewHolder.itemView).setText("unsupported block " + tLRPC$PageBlock2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTypeForBlock(TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
                return 0;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
                return 1;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDivider) {
                return 2;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
                return 3;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
                return 4;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                return 5;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                return 6;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                return 7;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                return 8;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                return 9;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
                return 10;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
                return 11;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
                return 12;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
                return 13;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
                return 14;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
                return 15;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                return 16;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                return 17;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockChannel) {
                return 18;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                return 19;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
                return 20;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
                return 21;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                return 22;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                return 23;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
                return 24;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                return 25;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                return 26;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockRelatedArticlesShadow) {
                return 28;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockDetailsChild) {
                return getTypeForBlock(((TL_pageBlockDetailsChild) tLRPC$PageBlock).block);
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                return getTypeForBlock(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
            }
            return 100;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.localBlocks.size()) {
                return 90;
            }
            return getTypeForBlock(this.localBlocks.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            TLRPC$WebPage tLRPC$WebPage = this.currentPage;
            if (tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null) {
                return 0;
            }
            return this.localBlocks.size() + 1;
        }

        private boolean isBlockOpened(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
            TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                return ((TLRPC$TL_pageBlockDetails) lastNonListPageBlock).open;
            }
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
                TLRPC$PageBlock lastNonListPageBlock2 = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
                if (!(lastNonListPageBlock2 instanceof TLRPC$TL_pageBlockDetails) || ((TLRPC$TL_pageBlockDetails) lastNonListPageBlock2).open) {
                    return isBlockOpened(tL_pageBlockDetailsChild2);
                }
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRows() {
            this.localBlocks.clear();
            int size = this.blocks.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PageBlock tLRPC$PageBlock = this.blocks.get(i);
                TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tLRPC$PageBlock);
                if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild) || isBlockOpened((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.localBlocks.add(tLRPC$PageBlock);
                }
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockVideoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private AspectRatioFrameLayout aspectRatioFrameLayout;
        private boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean cancelLoading;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockVideo currentBlock;
        private TLRPC$Document currentDocument;
        private int currentType;
        private boolean firstFrameRendered;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private boolean isGif;
        private WebpageAdapter parentAdapter;
        private TLRPC$PageBlock parentBlock;
        private boolean photoPressed;
        public long playFrom;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;
        private TextureView textureView;

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockVideoCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
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
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            this.channelCell = new BlockChannelCell(context, this.parentAdapter, 1);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setResizeMode(0);
            TextureView textureView = new TextureView(context);
            this.textureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.textureView);
            addView(this.aspectRatioFrameLayout);
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.aspectRatioFrameLayout && ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public void setBlock(TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockVideo;
            this.parentBlock = null;
            TLRPC$Document documentWithId = this.parentAdapter.getDocumentWithId(tLRPC$TL_pageBlockVideo.video_id);
            this.currentDocument = documentWithId;
            this.isGif = MessageObject.isVideoDocument(documentWithId) || MessageObject.isGifDocument(this.currentDocument);
            this.isFirst = z;
            this.channelCell.setVisibility(4);
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel, TLRPC$PageBlock tLRPC$PageBlock) {
            this.parentBlock = tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockChannel == null || !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(tLRPC$TL_pageBlockChannel);
            this.channelCell.setVisibility(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
            if (r2 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L31;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this, this.imageView, this.textureView, null)) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                if (this.parentAdapter.channelBlock != null && motionEvent.getAction() == 1) {
                    MessagesController.getInstance(ArticleViewer.this.currentAccount).openByUserName(ChatObject.getPublicUsername(this.parentAdapter.channelBlock.channel), ArticleViewer.this.parentFragment, 2);
                    ArticleViewer.this.close(false, true);
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    int i = this.buttonX;
                    if (x >= i && x <= i + AndroidUtilities.dp(48.0f)) {
                        int i2 = this.buttonY;
                        if (y >= i2) {
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
                    ArticleViewer.this.openPhoto(this.currentBlock, this.parentAdapter);
                } else if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0216  */
        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo;
            int dp;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            boolean z;
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute;
            int i11;
            int size = View.MeasureSpec.getSize(i);
            int i12 = this.currentType;
            int i13 = 1;
            if (i12 == 1) {
                size = ((View) getParent()).getMeasuredWidth();
                i4 = ((View) getParent()).getMeasuredHeight();
            } else if (i12 == 2) {
                float f = this.groupPosition.ph;
                Point point = AndroidUtilities.displaySize;
                i4 = (int) Math.ceil(f * Math.max(point.x, point.y) * 0.5f);
            } else {
                i3 = size;
                i4 = 0;
                tLRPC$TL_pageBlockVideo = this.currentBlock;
                if (tLRPC$TL_pageBlockVideo != null) {
                    if (this.currentType == 0 && (i11 = tLRPC$TL_pageBlockVideo.level) > 0) {
                        i6 = AndroidUtilities.dp(i11 * 14) + AndroidUtilities.dp(18.0f);
                        this.textX = i6;
                        i5 = i3 - (AndroidUtilities.dp(18.0f) + i6);
                        dp = i5;
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                        dp = i3 - AndroidUtilities.dp(36.0f);
                        i5 = i3;
                        i6 = 0;
                    }
                    if (this.currentDocument != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 48);
                        int i14 = this.currentType;
                        if (i14 == 0) {
                            int size2 = this.currentDocument.attributes.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size2) {
                                    z = false;
                                    break;
                                }
                                if (this.currentDocument.attributes.get(i15) instanceof TLRPC$TL_documentAttributeVideo) {
                                    i4 = (int) ((i5 / tLRPC$DocumentAttribute.w) * tLRPC$DocumentAttribute.h);
                                    z = true;
                                    break;
                                }
                                i15++;
                            }
                            float f2 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f3 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z) {
                                i4 = (int) ((i5 / f2) * f3);
                            }
                            if (this.parentBlock instanceof TLRPC$TL_pageBlockCover) {
                                i4 = Math.min(i4, i5);
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    int i16 = (int) ((max / f3) * f2);
                                    i6 += ((i3 - i6) - i16) / 2;
                                    i5 = i16;
                                    i4 = max;
                                }
                            }
                            if (i4 == 0) {
                                i4 = AndroidUtilities.dp(100.0f);
                            } else if (i4 < dp2) {
                                i4 = dp2;
                            }
                        } else if (i14 == 2) {
                            if ((this.groupPosition.flags & 2) == 0) {
                                i5 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.groupPosition.flags & 8) == 0) {
                                int i17 = i5;
                                i8 = i4;
                                i4 -= AndroidUtilities.dp(2.0f);
                                i9 = i17;
                                this.imageView.setQualityThumbDocument(this.currentDocument);
                                int dp3 = (!this.isFirst || (i10 = this.currentType) == 1 || i10 == 2 || this.currentBlock.level > 0) ? 0 : AndroidUtilities.dp(8.0f);
                                this.imageView.setImageCoords(i6, dp3, i9, i4);
                                if (!this.isGif) {
                                    this.autoDownload = DownloadController.getInstance(ArticleViewer.this.currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                    File pathToAttach = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true);
                                    if (this.autoDownload || pathToAttach.exists()) {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 1000), this.currentDocument), "200_200", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.parentAdapter.currentPage, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(ImageLocation.getForDocument(this.currentDocument));
                                        this.imageView.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.parentAdapter.currentPage, 1);
                                    }
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.aspectRatioFrameLayout.getLayoutParams();
                                    layoutParams.leftMargin = i6;
                                    layoutParams.topMargin = dp3;
                                    layoutParams.width = i9;
                                    layoutParams.height = i4;
                                } else {
                                    this.imageView.setStrippedLocation(null);
                                    this.imageView.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", 0L, null, this.parentAdapter.currentPage, 1);
                                }
                                float f4 = dp2;
                                this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f4) / 2.0f));
                                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f4) / 2.0f));
                                this.buttonY = imageY;
                                RadialProgress2 radialProgress2 = this.radialProgress;
                                int i18 = this.buttonX;
                                radialProgress2.setProgressRect(i18, imageY, i18 + dp2, dp2 + imageY);
                                i7 = i8;
                            }
                        }
                        i9 = i5;
                        i8 = i4;
                        this.imageView.setQualityThumbDocument(this.currentDocument);
                        if (this.isFirst) {
                        }
                        this.imageView.setImageCoords(i6, dp3, i9, i4);
                        if (!this.isGif) {
                        }
                        float f42 = dp2;
                        this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f42) / 2.0f));
                        int imageY2 = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f42) / 2.0f));
                        this.buttonY = imageY2;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        int i182 = this.buttonX;
                        radialProgress22.setProgressRect(i182, imageY2, i182 + dp2, dp2 + imageY2);
                        i7 = i8;
                    } else {
                        i7 = i4;
                    }
                    int imageY3 = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                    this.textY = imageY3;
                    if (this.currentType == 0) {
                        ArticleViewer articleViewer = ArticleViewer.this;
                        TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo2 = this.currentBlock;
                        DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockVideo2.caption.text, dp, imageY3, tLRPC$TL_pageBlockVideo2, this.parentAdapter);
                        this.captionLayout = createLayoutForText;
                        if (createLayoutForText != null) {
                            int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp4;
                            i7 += dp4 + AndroidUtilities.dp(4.0f);
                            DrawingText drawingText = this.captionLayout;
                            drawingText.x = this.textX;
                            drawingText.y = this.textY;
                        }
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo3 = this.currentBlock;
                        DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockVideo3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockVideo3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                        this.creditLayout = createLayoutForText2;
                        if (createLayoutForText2 != null) {
                            i7 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                            DrawingText drawingText2 = this.creditLayout;
                            drawingText2.x = this.textX;
                            drawingText2.y = this.textY + this.creditOffset;
                        }
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        i7 += AndroidUtilities.dp(8.0f);
                    }
                    boolean z2 = (this.parentBlock instanceof TLRPC$TL_pageBlockCover) && this.parentAdapter.blocks.size() > 1 && (this.parentAdapter.blocks.get(1) instanceof TLRPC$TL_pageBlockChannel);
                    if (this.currentType != 2 && !z2) {
                        i7 += AndroidUtilities.dp(8.0f);
                    }
                    i13 = i7;
                }
                this.channelCell.measure(i, i2);
                this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            }
            i3 = size;
            tLRPC$TL_pageBlockVideo = this.currentBlock;
            if (tLRPC$TL_pageBlockVideo != null) {
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getDrawRegion(), ArticleViewer.photoBackgroundPaint);
            }
            if (!ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                this.imageView.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
            super.onDraw(canvas);
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this) || !this.imageView.getVisible()) {
                return;
            }
            this.radialProgress.draw(canvas);
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
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean z2 = true;
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                if (!this.isGif) {
                    this.buttonState = 3;
                } else {
                    this.buttonState = -1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f = 0.0f;
                if (!FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
                    if (!this.cancelLoading && this.autoDownload && this.isGif) {
                        this.buttonState = 1;
                    } else {
                        this.buttonState = 0;
                        z2 = false;
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
            invalidate();
        }

        private void didPressedButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.cancelLoading = false;
                this.radialProgress.setProgress(0.0f, false);
                if (!this.isGif) {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.parentAdapter.currentPage, 1);
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
            } else if (i == 1) {
                this.cancelLoading = true;
                if (!this.isGif) {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).cancelLoadFile(this.currentDocument);
                } else {
                    this.imageView.cancelLoadImage();
                }
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            } else if (i != 2) {
                if (i == 3) {
                    ArticleViewer.this.openPhoto(this.currentBlock, this.parentAdapter);
                }
            } else {
                this.imageView.setAllowStartAnimation(true);
                this.imageView.startAnimation();
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageView.onDetachedFromWindow();
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
            this.playFrom = 0L;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void startVideoPlayer() {
            if (this.currentDocument != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                if (articleViewer.videoPlayer != null) {
                    return;
                }
                articleViewer.videoPlayer = new VideoPlayerHolderBase() { // from class: org.telegram.ui.ArticleViewer.BlockVideoCell.1
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
                    }
                }.with(this.textureView);
                Uri prepareUri = FileStreamLoadOperation.prepareUri(ArticleViewer.this.currentAccount, this.currentDocument, this.parentAdapter.currentPage);
                if (prepareUri == null) {
                    return;
                }
                ArticleViewer.this.videoPlayer.seekTo(this.playFrom);
                ArticleViewer.this.videoPlayer.preparePlayer(prepareUri, true);
                ArticleViewer.this.videoPlayer.play();
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
                return;
            }
            updateButtonState(true);
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
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
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachVideo", R.string.AttachVideo));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockAudioCell extends View implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockAudio currentBlock;
        private TLRPC$Document currentDocument;
        private MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private boolean isFirst;
        private String lastTimeString;
        private WebpageAdapter parentAdapter;
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

        public BlockAudioCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(58.0f);
            this.parentAdapter = webpageAdapter;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            SeekBar seekBar = new SeekBar(this);
            this.seekBar = seekBar;
            seekBar.setDelegate(new SeekBar.SeekBarDelegate() { // from class: org.telegram.ui.ArticleViewer$BlockAudioCell$$ExternalSyntheticLambda0
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

        public void setBlock(TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockAudio;
            MessageObject messageObject = (MessageObject) this.parentAdapter.audioBlocks.get(this.currentBlock);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                this.currentDocument = messageObject.getDocument();
            }
            this.isFirst = z;
            SeekBar seekBar = this.seekBar;
            int color = Theme.getColor(Theme.key_chat_inAudioSeekbar);
            int color2 = Theme.getColor(Theme.key_chat_inAudioCacheSeekbar);
            int i = Theme.key_chat_inAudioSeekbarFill;
            seekBar.setColors(color, color2, Theme.getColor(i), Theme.getColor(i), Theme.getColor(Theme.key_chat_inAudioSeekbarSelected));
            updateButtonState(false);
            requestLayout();
        }

        public MessageObject getMessageObject() {
            return this.currentMessageObject;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
            if (r1 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
            if (r12.buttonState == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
            r12.buttonPressed = 1;
            invalidate();
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
                    int i = this.buttonX;
                    if (x >= i && x <= i + AndroidUtilities.dp(48.0f)) {
                        int i2 = this.buttonY;
                        if (y >= i2) {
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
            return this.buttonPressed != 0 || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder;
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(54.0f);
            TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockAudio != null) {
                int i4 = tLRPC$TL_pageBlockAudio.level;
                if (i4 > 0) {
                    this.textX = AndroidUtilities.dp(i4 * 14) + AndroidUtilities.dp(18.0f);
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int dp2 = (size - this.textX) - AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(44.0f);
                this.buttonX = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(5.0f);
                this.buttonY = dp4;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.buttonX;
                radialProgress2.setProgressRect(i5, dp4, i5 + dp3, dp4 + dp3);
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio2.caption.text, dp2, this.textY, tLRPC$TL_pageBlockAudio2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp5 = AndroidUtilities.dp(8.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp5;
                    dp += dp5 + AndroidUtilities.dp(8.0f);
                }
                int i6 = dp;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio3.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockAudio3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i6 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    i6 += AndroidUtilities.dp(8.0f);
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
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, musicAuthor.length(), 18);
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, dp7, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText();
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(ellipsize, ArticleViewer.audioTimePaint, dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
                } else {
                    this.titleLayout = null;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2);
                }
                this.seekBar.setSize(dp7, AndroidUtilities.dp(30.0f));
                i3 = i6;
            }
            setMeasuredDimension(size, i3);
            updatePlayingMessageProgress();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            this.radialProgress.setProgressColor(Theme.getColor(Theme.key_chat_inFileProgress));
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
            if (this.titleLayout != null) {
                canvas.save();
                this.titleLayout.x = this.buttonX + AndroidUtilities.dp(54.0f);
                this.titleLayout.y = this.seekBarY - AndroidUtilities.dp(16.0f);
                DrawingText drawingText = this.titleLayout;
                canvas.translate(drawingText.x, drawingText.y);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.captionLayout != null) {
                canvas.save();
                DrawingText drawingText2 = this.captionLayout;
                int i2 = this.textX;
                drawingText2.x = i2;
                int i3 = this.textY;
                drawingText2.y = i3;
                canvas.translate(i2, i3);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                DrawingText drawingText3 = this.creditLayout;
                int i4 = this.textX;
                drawingText3.x = i4;
                int i5 = this.textY;
                int i6 = this.creditOffset;
                drawingText3.y = i5 + i6;
                canvas.translate(i4, i5 + i6);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
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
            if (this.currentDocument == null || this.currentMessageObject == null) {
                return;
            }
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(this.currentMessageObject.audioProgress);
            }
            int i = 0;
            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.currentDocument.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.currentDocument.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                        i = (int) tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.currentMessageObject.audioProgressSec;
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i);
            String str = this.lastTimeString;
            if (str == null || (str != null && !str.equals(formatShortDuration))) {
                this.lastTimeString = formatShortDuration;
                ArticleViewer.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(formatShortDuration, ArticleViewer.audioTimePaint, (int) Math.ceil(ArticleViewer.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            ArticleViewer.audioTimePaint.setColor(ArticleViewer.this.getTextColor());
            invalidate();
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (!FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
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
            int i = this.buttonState;
            if (i == 0) {
                if (MediaController.getInstance().setPlaylist(this.parentAdapter.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                }
            } else if (i == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                }
            } else if (i == 2) {
                this.radialProgress.setProgress(0.0f, false);
                FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
            } else if (i == 3) {
                FileLoader.getInstance(ArticleViewer.this.currentAccount).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateButtonState(false);
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
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public int getObserverTag() {
            return this.TAG;
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockEmbedPostCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private AvatarDrawable avatarDrawable;
        private ImageReceiver avatarImageView;
        private boolean avatarVisible;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockEmbedPost currentBlock;
        private DrawingText dateLayout;
        private int lineHeight;
        private DrawingText nameLayout;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public BlockEmbedPostCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
            this.avatarImageView.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            this.avatarDrawable = new AvatarDrawable();
        }

        public void setBlock(TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost) {
            this.currentBlock = tLRPC$TL_pageBlockEmbedPost;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockEmbedPost != null) {
                if (tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    this.textY = AndroidUtilities.dp(4.0f);
                    int dp = size - AndroidUtilities.dp(50.0f);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost2 = this.currentBlock;
                    DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost2.caption.text, dp, this.textY, tLRPC$TL_pageBlockEmbedPost2, this.parentAdapter);
                    this.captionLayout = createLayoutForText;
                    if (createLayoutForText != null) {
                        int dp2 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                        this.creditOffset = dp2;
                        r13 = 0 + dp2 + AndroidUtilities.dp(4.0f);
                    }
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost3 = this.currentBlock;
                    DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.creditLayout = createLayoutForText2;
                    if (createLayoutForText2 != null) {
                        r13 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    }
                    i3 = r13;
                } else {
                    long j = tLRPC$TL_pageBlockEmbedPost.author_photo_id;
                    boolean z = j != 0;
                    this.avatarVisible = z;
                    if (z) {
                        TLRPC$Photo photoWithId = this.parentAdapter.getPhotoWithId(j);
                        boolean z2 = photoWithId instanceof TLRPC$TL_photo;
                        this.avatarVisible = z2;
                        if (z2) {
                            this.avatarDrawable.setInfo(0L, this.currentBlock.author, null);
                            this.avatarImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.dp(40.0f), true), photoWithId), "40_40", this.avatarDrawable, 0L, (String) null, this.parentAdapter.currentPage, 1);
                        }
                    }
                    DrawingText createLayoutForText3 = ArticleViewer.this.createLayoutForText(this, this.currentBlock.author, null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.parentAdapter);
                    this.nameLayout = createLayoutForText3;
                    if (createLayoutForText3 != null) {
                        createLayoutForText3.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.y = AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.this.createLayoutForText(this, LocaleController.getInstance().chatFullDate.format(this.currentBlock.date * 1000), null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.currentBlock, this.parentAdapter);
                    } else {
                        this.dateLayout = null;
                    }
                    int dp3 = AndroidUtilities.dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.dp(32.0f);
                        this.textY = AndroidUtilities.dp(56.0f);
                        int dp4 = size - AndroidUtilities.dp(50.0f);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost4 = this.currentBlock;
                        DrawingText createLayoutForText4 = articleViewer3.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost4.caption.text, dp4, this.textY, tLRPC$TL_pageBlockEmbedPost4, this.parentAdapter);
                        this.captionLayout = createLayoutForText4;
                        if (createLayoutForText4 != null) {
                            int dp5 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp5;
                            dp3 += dp5 + AndroidUtilities.dp(4.0f);
                        }
                        int i4 = dp3;
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost5 = this.currentBlock;
                        DrawingText createLayoutForText5 = articleViewer4.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost5.caption.credit, dp4, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost5, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                        this.creditLayout = createLayoutForText5;
                        if (createLayoutForText5 != null) {
                            i4 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                        }
                        dp3 = i4;
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
                    i3 = dp3;
                }
                this.lineHeight = i3;
            }
            setMeasuredDimension(size, i3);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbedPost == null) {
                return;
            }
            if (!(tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption)) {
                if (this.avatarVisible) {
                    this.avatarImageView.draw(canvas);
                }
                if (this.nameLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f));
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.nameLayout.draw(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.dateLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                    ArticleViewer.this.drawTextSelection(canvas, this, i);
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
                ArticleViewer.this.drawTextSelection(canvas, this, r1);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                r1++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, r1);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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
    }

    /* loaded from: classes3.dex */
    public class BlockParagraphCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockParagraph currentBlock;
        private WebpageAdapter parentAdapter;
        public DrawingText textLayout;
        public int textX;
        public int textY;

        public BlockParagraphCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph) {
            this.currentBlock = tLRPC$TL_pageBlockParagraph;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockParagraph != null) {
                int i4 = tLRPC$TL_pageBlockParagraph.level;
                if (i4 == 0) {
                    this.textY = AndroidUtilities.dp(8.0f);
                    this.textX = AndroidUtilities.dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((i4 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(8.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
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
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
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
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockEmbedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockEmbed currentBlock;
        private int exactWebViewHeight;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;
        private WebPlayerView videoView;
        private boolean wasUserInteraction;
        private TouchyWebView webView;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class TelegramWebviewProxy {
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

        /* loaded from: classes3.dex */
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

        @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
        public BlockEmbedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            WebPlayerView webPlayerView = new WebPlayerView(context, false, false, new WebPlayerView.WebPlayerViewDelegate(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockEmbedCell.1
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
            this.webView.getSettings().setDomStorageEnabled(true);
            this.webView.getSettings().setAllowContentAccess(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 17) {
                this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
            }
            if (i >= 21) {
                this.webView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
            }
            this.webView.setWebChromeClient(new 2(ArticleViewer.this));
            this.webView.setWebViewClient(new WebViewClient(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockEmbedCell.3
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
                    if (BlockEmbedCell.this.wasUserInteraction) {
                        Browser.openUrl(ArticleViewer.this.parentActivity, str);
                        return true;
                    }
                    return false;
                }
            });
            addView(this.webView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class 2 extends WebChromeClient {
            2(ArticleViewer articleViewer) {
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

        public void destroyWebView(boolean z) {
            try {
                this.webView.stopLoading();
                this.webView.loadUrl("about:blank");
                if (z) {
                    this.webView.destroy();
                }
                this.currentBlock = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.videoView.destroy();
        }

        public void setBlock(TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed) {
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed2 = this.currentBlock;
            this.currentBlock = tLRPC$TL_pageBlockEmbed;
            this.webView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed3 = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbed2 != tLRPC$TL_pageBlockEmbed3) {
                this.wasUserInteraction = false;
                if (tLRPC$TL_pageBlockEmbed3.allow_scrolling) {
                    this.webView.setVerticalScrollBarEnabled(true);
                    this.webView.setHorizontalScrollBarEnabled(true);
                } else {
                    this.webView.setVerticalScrollBarEnabled(false);
                    this.webView.setHorizontalScrollBarEnabled(false);
                }
                this.exactWebViewHeight = 0;
                try {
                    this.webView.loadUrl("about:blank");
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed4 = this.currentBlock;
                    String str = tLRPC$TL_pageBlockEmbed4.html;
                    if (str != null) {
                        this.webView.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                        this.videoView.setVisibility(4);
                        this.videoView.loadVideo(null, null, null, null, false);
                        this.webView.setVisibility(0);
                    } else {
                        long j = tLRPC$TL_pageBlockEmbed4.poster_photo_id;
                        if (this.videoView.loadVideo(tLRPC$TL_pageBlockEmbed.url, j != 0 ? this.parentAdapter.getPhotoWithId(j) : null, this.parentAdapter.currentPage, null, false)) {
                            this.webView.setVisibility(4);
                            this.videoView.setVisibility(0);
                            this.webView.stopLoading();
                            this.webView.loadUrl("about:blank");
                        } else {
                            this.webView.setVisibility(0);
                            this.videoView.setVisibility(4);
                            this.videoView.loadVideo(null, null, null, null, false);
                            HashMap hashMap = new HashMap();
                            hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                            this.webView.loadUrl(this.currentBlock.url, hashMap);
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
            if (ArticleViewer.this.isVisible) {
                return;
            }
            this.currentBlock = null;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int dp;
            DrawingText drawingText;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbed != null) {
                if (tLRPC$TL_pageBlockEmbed.level > 0) {
                    int dp2 = AndroidUtilities.dp(i4 * 14) + AndroidUtilities.dp(18.0f);
                    this.listX = dp2;
                    this.textX = dp2;
                    i5 = size - (dp2 + AndroidUtilities.dp(18.0f));
                    i6 = i5;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    int dp3 = size - AndroidUtilities.dp(36.0f);
                    if (this.currentBlock.full_width) {
                        i5 = size;
                    } else {
                        i5 = size - AndroidUtilities.dp(36.0f);
                        this.listX += AndroidUtilities.dp(18.0f);
                    }
                    i6 = dp3;
                }
                TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed2 = this.currentBlock;
                int i8 = tLRPC$TL_pageBlockEmbed2.w;
                float f = i8 == 0 ? 1.0f : size / i8;
                int i9 = this.exactWebViewHeight;
                if (i9 != 0) {
                    i7 = AndroidUtilities.dp(i9);
                } else {
                    float f2 = tLRPC$TL_pageBlockEmbed2.h;
                    if (i8 == 0) {
                        f2 = AndroidUtilities.dp(f2);
                    }
                    i7 = (int) (f2 * f);
                }
                if (i7 == 0) {
                    i7 = AndroidUtilities.dp(10.0f);
                }
                int i10 = i7;
                this.webView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                if (this.videoView.getParent() == this) {
                    this.videoView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + i10, 1073741824));
                }
                int dp4 = AndroidUtilities.dp(8.0f) + i10;
                this.textY = dp4;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed3 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbed3.caption.text, i6, dp4, tLRPC$TL_pageBlockEmbed3, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp5 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp5;
                    i10 += dp5 + AndroidUtilities.dp(4.0f);
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed4 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbed4.caption.credit, i6, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbed4, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i10 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.creditOffset;
                }
                i3 = i10 + AndroidUtilities.dp(5.0f);
                TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed5 = this.currentBlock;
                int i11 = tLRPC$TL_pageBlockEmbed5.level;
                if (i11 > 0 && !tLRPC$TL_pageBlockEmbed5.bottom) {
                    dp = AndroidUtilities.dp(8.0f);
                } else {
                    if (i11 == 0 && this.captionLayout != null) {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    drawingText = this.captionLayout;
                    if (drawingText != null) {
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                }
                i3 += dp;
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
            int i5 = this.listX;
            touchyWebView.layout(i5, 0, touchyWebView.getMeasuredWidth() + i5, this.webView.getMeasuredHeight());
            if (this.videoView.getParent() == this) {
                WebPlayerView webPlayerView = this.videoView;
                int i6 = this.listX;
                webPlayerView.layout(i6, 0, webPlayerView.getMeasuredWidth() + i6, this.videoView.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* loaded from: classes3.dex */
    public class BlockTableCell extends FrameLayout implements TableLayout.TableLayoutDelegate, TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockTable currentBlock;
        private boolean firstLayout;
        private int listX;
        private int listY;
        private WebpageAdapter parentAdapter;
        private HorizontalScrollView scrollView;
        private TableLayout tableLayout;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        public BlockTableCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockTableCell.1
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() > getMeasuredWidth() - AndroidUtilities.dp(36.0f) && onInterceptTouchEvent) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
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
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null) {
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                    BlockTableCell.this.updateChildTextPositions();
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
                    if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                        return;
                    }
                    ArticleViewer.this.textSelectionHelper.invalidate();
                }

                @Override // android.view.View
                protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    ArticleViewer.this.removePressedLink();
                    return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
                }

                @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int i, int i2) {
                    BlockTableCell.this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
                    setMeasuredDimension(View.MeasureSpec.getSize(i), BlockTableCell.this.tableLayout.getMeasuredHeight());
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            this.scrollView.setClipToPadding(false);
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            TableLayout tableLayout = new TableLayout(context, this, ArticleViewer.this.textSelectionHelper);
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            this.tableLayout.setRowOrderPreserved(true);
            this.scrollView.addView(this.tableLayout, new FrameLayout.LayoutParams(-2, -2));
            setWillNotDraw(false);
        }

        @Override // org.telegram.ui.Components.TableLayout.TableLayoutDelegate
        public DrawingText createTextLayout(TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell, int i) {
            Layout.Alignment alignment;
            if (tLRPC$TL_pageTableCell == null) {
                return null;
            }
            if (tLRPC$TL_pageTableCell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (tLRPC$TL_pageTableCell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            return ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageTableCell.text, i, -1, this.currentBlock, alignment, 0, this.parentAdapter);
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
        public void onLayoutChild(DrawingText drawingText, int i, int i2) {
            if (drawingText == null || ArticleViewer.this.searchResults.isEmpty() || ArticleViewer.this.searchText == null) {
                return;
            }
            String lowerCase = drawingText.textLayout.getText().toString().toLowerCase();
            int i3 = 0;
            while (true) {
                int indexOf = lowerCase.indexOf(ArticleViewer.this.searchText, i3);
                if (indexOf < 0) {
                    return;
                }
                int length = ArticleViewer.this.searchText.length() + indexOf;
                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                    StaticLayout staticLayout = drawingText.textLayout;
                    ArticleViewer.this.adapter[0].searchTextOffset.put(ArticleViewer.this.searchText + this.currentBlock + drawingText.parentText + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i2));
                }
                i3 = length;
            }
        }

        public void setBlock(TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable) {
            int i;
            this.currentBlock = tLRPC$TL_pageBlockTable;
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor(Theme.key_windowBackgroundWhite));
            this.tableLayout.removeAllChildrens();
            this.tableLayout.setDrawLines(this.currentBlock.bordered);
            this.tableLayout.setStriped(this.currentBlock.striped);
            this.tableLayout.setRtl(this.parentAdapter.isRtl);
            if (this.currentBlock.rows.isEmpty()) {
                i = 0;
            } else {
                TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow = this.currentBlock.rows.get(0);
                int size = tLRPC$TL_pageTableRow.cells.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = tLRPC$TL_pageTableRow.cells.get(i2).colspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    i += i3;
                }
            }
            int size2 = this.currentBlock.rows.size();
            for (int i4 = 0; i4 < size2; i4++) {
                TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow2 = this.currentBlock.rows.get(i4);
                int size3 = tLRPC$TL_pageTableRow2.cells.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = tLRPC$TL_pageTableRow2.cells.get(i6);
                    int i7 = tLRPC$TL_pageTableCell.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = tLRPC$TL_pageTableCell.rowspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    if (tLRPC$TL_pageTableCell.text != null) {
                        this.tableLayout.addChild(tLRPC$TL_pageTableCell, i5, i4, i7);
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

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, childAt.textLayout, (this.scrollView.getPaddingLeft() - this.scrollView.getScrollX()) + this.listX + childAt.getTextX(), this.listY + childAt.getTextY())) {
                    return true;
                }
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.titleLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
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
            TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable = this.currentBlock;
            if (tLRPC$TL_pageBlockTable != null) {
                int i5 = tLRPC$TL_pageBlockTable.level;
                if (i5 > 0) {
                    int dp2 = AndroidUtilities.dp(i5 * 14);
                    this.listX = dp2;
                    dp = dp2 + AndroidUtilities.dp(18.0f);
                    this.textX = dp;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    dp = AndroidUtilities.dp(36.0f);
                }
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockTable2.title, size - dp, 0, tLRPC$TL_pageBlockTable2, Layout.Alignment.ALIGN_CENTER, 0, this.parentAdapter);
                this.titleLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = 0;
                    i4 = createLayoutForText.getHeight() + AndroidUtilities.dp(8.0f) + 0;
                    this.listY = i4;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.listY = AndroidUtilities.dp(8.0f);
                    i4 = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = i4 + this.scrollView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable3 = this.currentBlock;
                if (tLRPC$TL_pageBlockTable3.level > 0 && !tLRPC$TL_pageBlockTable3.bottom) {
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
                DrawingText drawingText = childAt.textLayout;
                if (drawingText != null) {
                    drawingText.x = ((childAt.getTextX() + this.listX) + AndroidUtilities.dp(18.0f)) - this.scrollView.getScrollX();
                    childAt.textLayout.y = childAt.getTextY() + this.listY;
                    childAt.textLayout.row = childAt.getRow();
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
                if (this.parentAdapter.isRtl) {
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
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                DrawingText drawingText2 = this.tableLayout.getChildAt(i).textLayout;
                if (drawingText2 != null) {
                    arrayList.add(drawingText2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockCollageCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockCollage currentBlock;
        private GroupedMessages group;
        private boolean inLayout;
        private RecyclerView.Adapter innerAdapter;
        private RecyclerListView innerListView;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        /* loaded from: classes3.dex */
        public class GroupedMessages {
            public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
            public HashMap<TLObject, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
            private int maxSizeWidth = 1000;

            public GroupedMessages() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* loaded from: classes3.dex */
            public class MessageGroupedLayoutAttempt {
                public float[] heights;
                public int[] lineCounts;

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, float f, float f2) {
                    this.lineCounts = new int[]{i, i2};
                    this.heights = new float[]{f, f2};
                }

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, int i3, float f, float f2, float f3) {
                    this.lineCounts = new int[]{i, i2, i3};
                    this.heights = new float[]{f, f2, f3};
                }

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
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

            /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void calculate() {
                int i;
                int i2;
                float f;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                float f2;
                TLRPC$Document documentWithId;
                TLRPC$PhotoSize closestPhotoSizeWithSize;
                float f3;
                float f4;
                this.posArray.clear();
                this.positions.clear();
                int size = BlockCollageCell.this.currentBlock.items.size();
                if (size <= 1) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i11 = 0;
                float f5 = 1.0f;
                boolean z = false;
                while (i11 < size) {
                    TLRPC$PageBlock tLRPC$PageBlock = BlockCollageCell.this.currentBlock.items.get(i11);
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                        TLRPC$Photo photoWithId = BlockCollageCell.this.parentAdapter.getPhotoWithId(((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
                        if (photoWithId == null) {
                            i11++;
                        } else {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                            groupedMessagePosition.last = i11 != size + (-1);
                            f3 = closestPhotoSizeWithSize != null ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            groupedMessagePosition.aspectRatio = f3;
                            if (f3 <= 1.2f) {
                                sb.append("w");
                            } else if (f3 < 0.8f) {
                                sb.append("n");
                            } else {
                                sb.append("q");
                            }
                            f4 = groupedMessagePosition.aspectRatio;
                            f5 += f4;
                            if (f4 > 2.0f) {
                                z = true;
                            }
                            this.positions.put(tLRPC$PageBlock, groupedMessagePosition);
                            this.posArray.add(groupedMessagePosition);
                            i11++;
                        }
                    } else {
                        if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) && (documentWithId = BlockCollageCell.this.parentAdapter.getDocumentWithId(((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) != null) {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 90);
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                            groupedMessagePosition2.last = i11 != size + (-1);
                            if (closestPhotoSizeWithSize != null) {
                            }
                            groupedMessagePosition2.aspectRatio = f3;
                            if (f3 <= 1.2f) {
                            }
                            f4 = groupedMessagePosition2.aspectRatio;
                            f5 += f4;
                            if (f4 > 2.0f) {
                            }
                            this.positions.put(tLRPC$PageBlock, groupedMessagePosition2);
                            this.posArray.add(groupedMessagePosition2);
                        }
                        i11++;
                    }
                }
                int dp = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int dp2 = (int) (AndroidUtilities.dp(120.0f) / (Math.min(point.x, point.y) / this.maxSizeWidth));
                Point point2 = AndroidUtilities.displaySize;
                int i12 = this.maxSizeWidth;
                int dp3 = (int) (AndroidUtilities.dp(40.0f) / (Math.min(point2.x, point2.y) / i12));
                float f6 = i12 / 814.0f;
                float f7 = f5 / size;
                int i13 = 3;
                if (z || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i14 = 0; i14 < size; i14++) {
                        if (f7 > 1.1f) {
                            fArr[i14] = Math.max(1.0f, this.posArray.get(i14).aspectRatio);
                        } else {
                            fArr[i14] = Math.min(1.0f, this.posArray.get(i14).aspectRatio);
                        }
                        fArr[i14] = Math.max(0.66667f, Math.min(1.7f, fArr[i14]));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i15 = 1; i15 < size2; i15++) {
                        int i16 = size2 - i15;
                        if (i15 <= 3 && i16 <= 3) {
                            arrayList.add(new MessageGroupedLayoutAttempt(this, i15, i16, multiHeight(fArr, 0, i15), multiHeight(fArr, i15, size2)));
                        }
                    }
                    int i17 = 1;
                    while (i17 < size2 - 1) {
                        int i18 = 1;
                        while (true) {
                            int i19 = size2 - i17;
                            if (i18 < i19) {
                                int i20 = i19 - i18;
                                if (i17 <= i13) {
                                    if (i18 <= (f7 < 0.85f ? 4 : 3) && i20 <= i13) {
                                        int i21 = i17 + i18;
                                        i9 = i18;
                                        i10 = i17;
                                        arrayList.add(new MessageGroupedLayoutAttempt(this, i17, i18, i20, multiHeight(fArr, 0, i17), multiHeight(fArr, i17, i21), multiHeight(fArr, i21, size2)));
                                        i18 = i9 + 1;
                                        i17 = i10;
                                        i13 = 3;
                                    }
                                }
                                i9 = i18;
                                i10 = i17;
                                i18 = i9 + 1;
                                i17 = i10;
                                i13 = 3;
                            }
                        }
                        i17++;
                        i13 = 3;
                    }
                    int i22 = 1;
                    while (i22 < size2 - 2) {
                        int i23 = 1;
                        while (true) {
                            int i24 = size2 - i22;
                            if (i23 < i24) {
                                int i25 = 1;
                                while (true) {
                                    int i26 = i24 - i23;
                                    if (i25 < i26) {
                                        int i27 = i26 - i25;
                                        if (i22 > 3 || i23 > 3 || i25 > 3 || i27 > 3) {
                                            i3 = i25;
                                            i4 = i24;
                                            i5 = i23;
                                            i6 = size;
                                            i7 = size2;
                                            i8 = dp2;
                                        } else {
                                            int i28 = i22 + i23;
                                            int i29 = i28 + i25;
                                            i7 = size2;
                                            i3 = i25;
                                            i4 = i24;
                                            i5 = i23;
                                            i6 = size;
                                            i8 = dp2;
                                            arrayList.add(new MessageGroupedLayoutAttempt(this, i22, i23, i25, i27, multiHeight(fArr, 0, i22), multiHeight(fArr, i22, i28), multiHeight(fArr, i28, i29), multiHeight(fArr, i29, size2)));
                                        }
                                        i25 = i3 + 1;
                                        dp2 = i8;
                                        i24 = i4;
                                        i23 = i5;
                                        size = i6;
                                        size2 = i7;
                                    }
                                }
                                i23++;
                                size = size;
                            }
                        }
                        i22++;
                        size = size;
                    }
                    i = size;
                    int i30 = dp2;
                    float f8 = (this.maxSizeWidth / 3) * 4;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f9 = 0.0f;
                    for (int i31 = 0; i31 < arrayList.size(); i31++) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList.get(i31);
                        int i32 = 0;
                        float f10 = Float.MAX_VALUE;
                        float f11 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i32 >= fArr2.length) {
                                break;
                            }
                            f11 += fArr2[i32];
                            if (fArr2[i32] < f10) {
                                f10 = fArr2[i32];
                            }
                            i32++;
                        }
                        float abs = Math.abs(f11 - f8);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            if (iArr[0] <= iArr[1]) {
                                if (iArr.length > 2 && iArr[1] > iArr[2]) {
                                    f = 1.2f;
                                    abs *= f;
                                } else if (iArr.length <= 3 || iArr[2] <= iArr[3]) {
                                }
                            }
                            f = 1.2f;
                            abs *= f;
                        }
                        if (f10 < i30) {
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
                        float f12 = messageGroupedLayoutAttempt.heights[i34];
                        int i36 = this.maxSizeWidth;
                        MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                        for (int i37 = 0; i37 < i35; i37++) {
                            int i38 = (int) (fArr[i33] * f12);
                            i36 -= i38;
                            MessageObject.GroupedMessagePosition groupedMessagePosition4 = this.posArray.get(i33);
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
                            groupedMessagePosition4.set(i37, i37, i34, i34, i38, f12 / 814.0f, i2);
                            i33++;
                        }
                        groupedMessagePosition3.pw += i36;
                        groupedMessagePosition3.spanSize += i36;
                        i34++;
                    }
                } else {
                    if (size == 2) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition5 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition6 = this.posArray.get(1);
                        String sb2 = sb.toString();
                        if (sb2.equals("ww")) {
                            double d = f6;
                            Double.isNaN(d);
                            if (f7 > d * 1.4d) {
                                float f13 = groupedMessagePosition5.aspectRatio;
                                float f14 = groupedMessagePosition6.aspectRatio;
                                if (f13 - f14 < 0.2d) {
                                    int i40 = this.maxSizeWidth;
                                    float round = Math.round(Math.min(i40 / f13, Math.min(i40 / f14, 407.0f))) / 814.0f;
                                    groupedMessagePosition5.set(0, 0, 0, 0, this.maxSizeWidth, round, 7);
                                    groupedMessagePosition6.set(0, 0, 1, 1, this.maxSizeWidth, round, 11);
                                }
                            }
                        }
                        if (sb2.equals("ww") || sb2.equals("qq")) {
                            int i41 = this.maxSizeWidth / 2;
                            float f15 = i41;
                            float round2 = Math.round(Math.min(f15 / groupedMessagePosition5.aspectRatio, Math.min(f15 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, i41, round2, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, i41, round2, 14);
                        } else {
                            int i42 = this.maxSizeWidth;
                            float f16 = groupedMessagePosition5.aspectRatio;
                            int max = (int) Math.max(i42 * 0.4f, Math.round((i42 / f16) / ((1.0f / f16) + (1.0f / groupedMessagePosition6.aspectRatio))));
                            int i43 = this.maxSizeWidth - max;
                            if (i43 < dp2) {
                                max -= dp2 - i43;
                                i43 = dp2;
                            }
                            float min = Math.min(814.0f, Math.round(Math.min(i43 / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, i43, min, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, max, min, 14);
                        }
                    } else if (size == 3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition7 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition8 = this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition9 = this.posArray.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f17 = groupedMessagePosition8.aspectRatio;
                            float min2 = Math.min(407.0f, Math.round((this.maxSizeWidth * f17) / (groupedMessagePosition9.aspectRatio + f17)));
                            int max2 = (int) Math.max(dp2, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min2, groupedMessagePosition8.aspectRatio * f2))));
                            int round3 = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + dp3, this.maxSizeWidth - max2));
                            groupedMessagePosition7.set(0, 0, 0, 1, round3, 1.0f, 13);
                            float f18 = (814.0f - min2) / 814.0f;
                            groupedMessagePosition8.set(1, 1, 0, 0, max2, f18, 6);
                            float f19 = min2 / 814.0f;
                            groupedMessagePosition9.set(0, 1, 1, 1, max2, f19, 10);
                            int i44 = this.maxSizeWidth;
                            groupedMessagePosition9.spanSize = i44;
                            groupedMessagePosition7.siblingHeights = new float[]{f19, f18};
                            groupedMessagePosition8.spanSize = i44 - round3;
                            groupedMessagePosition9.leftSpanOffset = round3;
                        } else {
                            float round4 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition7.set(0, 1, 0, 0, this.maxSizeWidth, round4, 7);
                            int i45 = this.maxSizeWidth / 2;
                            float f20 = 814.0f - round4;
                            float f21 = i45;
                            float min3 = Math.min(f20, Math.round(Math.min(f21 / groupedMessagePosition8.aspectRatio, f21 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                            groupedMessagePosition8.set(0, 0, 1, 1, i45, min3, 9);
                            groupedMessagePosition9.set(1, 1, 1, 1, i45, min3, 10);
                        }
                    } else if (size == 4) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition10 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition11 = this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition12 = this.posArray.get(2);
                        MessageObject.GroupedMessagePosition groupedMessagePosition13 = this.posArray.get(3);
                        if (sb.charAt(0) == 'w') {
                            float round5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition10.set(0, 2, 0, 0, this.maxSizeWidth, round5, 7);
                            float round6 = Math.round(this.maxSizeWidth / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                            float f22 = dp2;
                            int max3 = (int) Math.max(f22, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition11.aspectRatio * round6));
                            int max4 = (int) Math.max(Math.max(f22, this.maxSizeWidth * 0.33f), groupedMessagePosition13.aspectRatio * round6);
                            float min4 = Math.min(814.0f - round5, round6) / 814.0f;
                            groupedMessagePosition11.set(0, 0, 1, 1, max3, min4, 9);
                            groupedMessagePosition12.set(1, 1, 1, 1, (this.maxSizeWidth - max3) - max4, min4, 8);
                            groupedMessagePosition13.set(2, 2, 1, 1, max4, min4, 10);
                        } else {
                            int max5 = Math.max(dp2, Math.round(814.0f / (((1.0f / groupedMessagePosition11.aspectRatio) + (1.0f / groupedMessagePosition12.aspectRatio)) + (1.0f / this.posArray.get(3).aspectRatio))));
                            float f23 = dp;
                            float f24 = max5;
                            float min5 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition11.aspectRatio) / 814.0f);
                            float min6 = Math.min(0.33f, Math.max(f23, f24 / groupedMessagePosition12.aspectRatio) / 814.0f);
                            float f25 = (1.0f - min5) - min6;
                            int round7 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + dp3, this.maxSizeWidth - max5));
                            groupedMessagePosition10.set(0, 0, 0, 2, round7, min5 + min6 + f25, 13);
                            groupedMessagePosition11.set(1, 1, 0, 0, max5, min5, 6);
                            groupedMessagePosition12.set(0, 1, 1, 1, max5, min6, 2);
                            groupedMessagePosition12.spanSize = this.maxSizeWidth;
                            groupedMessagePosition13.set(0, 1, 2, 2, max5, f25, 10);
                            int i46 = this.maxSizeWidth;
                            groupedMessagePosition13.spanSize = i46;
                            groupedMessagePosition11.spanSize = i46 - round7;
                            groupedMessagePosition12.leftSpanOffset = round7;
                            groupedMessagePosition13.leftSpanOffset = round7;
                            groupedMessagePosition10.siblingHeights = new float[]{min5, min6, f25};
                        }
                    }
                    i = size;
                }
                int i47 = i;
                for (int i48 = 0; i48 < i47; i48++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = this.posArray.get(i48);
                    if ((groupedMessagePosition14.flags & 1) != 0) {
                        groupedMessagePosition14.edge = true;
                    }
                }
            }
        }

        public BlockCollageCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.group = new GroupedMessages();
            this.parentAdapter = webpageAdapter;
            RecyclerListView recyclerListView = new RecyclerListView(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.1
                @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
                public void requestLayout() {
                    if (BlockCollageCell.this.inLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.innerListView = recyclerListView;
            recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.2
                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition;
                    int i = 0;
                    rect.bottom = 0;
                    if (!(view instanceof BlockPhotoCell)) {
                        groupedMessagePosition = view instanceof BlockVideoCell ? BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    } else {
                        groupedMessagePosition = BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock);
                    }
                    if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float max = Math.max(point.x, point.y) * 0.5f;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = groupedMessagePosition.siblingHeights;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        i3 += (int) Math.ceil(fArr[i2] * max);
                        i2++;
                    }
                    int dp2 = i3 + ((groupedMessagePosition.maxY - groupedMessagePosition.minY) * AndroidUtilities.dp2(11.0f));
                    int size = BlockCollageCell.this.group.posArray.size();
                    while (true) {
                        if (i < size) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = BlockCollageCell.this.group.posArray.get(i);
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
            GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.3
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
                    MessageObject.GroupedMessagePosition groupedMessagePosition = BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1));
                    if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b != 0) {
                        int size = BlockCollageCell.this.group.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = BlockCollageCell.this.group.posArray.get(i2);
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
            gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.4
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    return BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1)).spanSize;
                }
            });
            this.innerListView.setLayoutManager(gridLayoutManagerFixed);
            RecyclerListView recyclerListView2 = this.innerListView;
            RecyclerView.Adapter adapter = new RecyclerView.Adapter(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockCollageCell.5
                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View blockPhotoCell;
                    if (i == 0) {
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        blockPhotoCell = new BlockPhotoCell(blockCollageCell.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    } else {
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        blockPhotoCell = new BlockVideoCell(blockCollageCell2.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(blockPhotoCell);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    TLRPC$PageBlock tLRPC$PageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() == 0) {
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock, true, true);
                        return;
                    }
                    BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                    blockVideoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                    blockVideoCell.setBlock((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock, true, true);
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
                    return BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1) instanceof TLRPC$TL_pageBlockPhoto ? 0 : 1;
                }
            };
            this.innerAdapter = adapter;
            recyclerListView2.setAdapter(adapter);
            addView(this.innerListView, LayoutHelper.createFrame(-1, -2.0f));
            setWillNotDraw(false);
        }

        public void setBlock(TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage) {
            if (this.currentBlock != tLRPC$TL_pageBlockCollage) {
                this.currentBlock = tLRPC$TL_pageBlockCollage;
                this.group.calculate();
            }
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setGlowColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            int i4 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = this.currentBlock;
            if (tLRPC$TL_pageBlockCollage != null) {
                int i5 = tLRPC$TL_pageBlockCollage.level;
                if (i5 > 0) {
                    int dp2 = AndroidUtilities.dp(i5 * 14) + AndroidUtilities.dp(18.0f);
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
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int dp3 = measuredHeight + AndroidUtilities.dp(8.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage2.caption.text, dp, dp3, tLRPC$TL_pageBlockCollage2, this.parentAdapter);
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
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockCollage3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    measuredHeight += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                i4 = measuredHeight + AndroidUtilities.dp(16.0f);
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage4 = this.currentBlock;
                if (tLRPC$TL_pageBlockCollage4.level > 0 && !tLRPC$TL_pageBlockCollage4.bottom) {
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
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockSlideshowCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockSlideshow currentBlock;
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
            ViewPager viewPager = new ViewPager(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.1
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
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.2
                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    BlockSlideshowCell blockSlideshowCell;
                    float measuredWidth = BlockSlideshowCell.this.innerListView.getMeasuredWidth();
                    if (measuredWidth == 0.0f) {
                        return;
                    }
                    BlockSlideshowCell.this.pageOffset = (((i * measuredWidth) + i2) - (blockSlideshowCell.currentPage * measuredWidth)) / measuredWidth;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    BlockSlideshowCell.this.currentPage = i;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }
            });
            ViewPager viewPager2 = this.innerListView;
            PagerAdapter pagerAdapter = new PagerAdapter(ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.3

                /* loaded from: classes3.dex */
                class ObjectContainer {
                    private TLRPC$PageBlock block;
                    private View view;

                    ObjectContainer(3 r1) {
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
                    TLRPC$PageBlock tLRPC$PageBlock = BlockSlideshowCell.this.currentBlock.items.get(i);
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                        BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                        BlockPhotoCell blockPhotoCell = new BlockPhotoCell(blockSlideshowCell.getContext(), BlockSlideshowCell.this.parentAdapter, 1);
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock, true, true);
                        blockVideoCell = blockPhotoCell;
                    } else {
                        BlockSlideshowCell blockSlideshowCell2 = BlockSlideshowCell.this;
                        BlockVideoCell blockVideoCell2 = new BlockVideoCell(blockSlideshowCell2.getContext(), BlockSlideshowCell.this.parentAdapter, 1);
                        blockVideoCell2.setBlock((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock, true, true);
                        blockVideoCell = blockVideoCell2;
                    }
                    viewGroup.addView(blockVideoCell);
                    ObjectContainer objectContainer = new ObjectContainer(this);
                    objectContainer.view = blockVideoCell;
                    objectContainer.block = tLRPC$PageBlock;
                    return objectContainer;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                    viewGroup.removeView(((ObjectContainer) obj).view);
                }
            };
            this.innerAdapter = pagerAdapter;
            viewPager2.setAdapter(pagerAdapter);
            AndroidUtilities.setViewPagerEdgeEffectColor(this.innerListView, Theme.getColor(Theme.key_windowBackgroundWhite));
            addView(this.innerListView);
            View view = new View(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockSlideshowCell.4
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

        public void setBlock(TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow) {
            this.currentBlock = tLRPC$TL_pageBlockSlideshow;
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
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int dp = AndroidUtilities.dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
                int dp2 = size - AndroidUtilities.dp(36.0f);
                int dp3 = dp + AndroidUtilities.dp(16.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow.caption.text, dp2, dp3, tLRPC$TL_pageBlockSlideshow, this.parentAdapter);
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
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow2.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockSlideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
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
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView {
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private TL_pageBlockListItem currentBlock;
        private int currentBlockType;
        private boolean drawDot;
        private int numOffsetY;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public BlockListItemCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
        }

        public void setBlock(TL_pageBlockListItem tL_pageBlockListItem) {
            if (this.currentBlock != tL_pageBlockListItem) {
                this.currentBlock = tL_pageBlockListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                if (this.currentBlock.blockItem != null) {
                    int typeForBlock = this.parentAdapter.getTypeForBlock(this.currentBlock.blockItem);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.parentAdapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            if (this.currentBlock.blockItem != null) {
                this.parentAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, this.currentBlock.blockItem, 0, 0);
            }
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0398  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03f5  */
        @Override // android.view.View
        @SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int dp;
            int dp2;
            int i3;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText;
            DrawingText drawingText2;
            RecyclerView.ViewHolder viewHolder;
            Iterator<TextSelectionHelper.TextLayoutBlock> it;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockListItem.index == 0 && this.currentBlock.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                if (this.currentBlock.parent.lastMaxNumCalcWidth != size || this.currentBlock.parent.lastFontSize != SharedConfig.ivFontSize) {
                    this.currentBlock.parent.lastMaxNumCalcWidth = size;
                    this.currentBlock.parent.lastFontSize = SharedConfig.ivFontSize;
                    this.currentBlock.parent.maxNumWidth = 0;
                    int size2 = this.currentBlock.parent.items.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockListItem tL_pageBlockListItem2 = (TL_pageBlockListItem) this.currentBlock.parent.items.get(i6);
                        if (tL_pageBlockListItem2.num != null) {
                            tL_pageBlockListItem2.numLayout = ArticleViewer.this.createLayoutForText(this, tL_pageBlockListItem2.num, null, size - AndroidUtilities.dp(54.0f), this.textY, this.currentBlock, this.parentAdapter);
                            this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(tL_pageBlockListItem2.numLayout.getLineWidth(0)));
                        }
                    }
                    this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                this.drawDot = !this.currentBlock.parent.pageBlockList.ordered;
                if (!this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(24.0f) + this.currentBlock.parent.maxNumWidth + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int dp3 = (size - AndroidUtilities.dp(18.0f)) - this.textX;
                if (this.parentAdapter.isRtl) {
                    dp3 -= (AndroidUtilities.dp(6.0f) + this.currentBlock.parent.maxNumWidth) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
                }
                int i7 = dp3;
                if (this.currentBlock.textItem != null) {
                    DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.textItem, i7, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        if (this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0) {
                            this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - this.textLayout.getLineAscent(0);
                        }
                        dp = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                        i5 += dp;
                    }
                    if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                        i5 += AndroidUtilities.dp(8.0f);
                    }
                    if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                        i5 += AndroidUtilities.dp(10.0f);
                    }
                    i4 = i5;
                    drawingText2 = this.textLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY;
                    }
                    viewHolder = this.blockLayout;
                    if (viewHolder != null && (viewHolder.itemView instanceof TextSelectionHelper.ArticleSelectableView)) {
                        ArticleViewer.this.textSelectionHelper.arrayList.clear();
                        ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                        it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                        while (it.hasNext()) {
                            TextSelectionHelper.TextLayoutBlock next = it.next();
                            if (next instanceof DrawingText) {
                                DrawingText drawingText3 = (DrawingText) next;
                                drawingText3.x += this.blockX;
                                drawingText3.y += this.blockY;
                            }
                        }
                    }
                } else {
                    if (this.currentBlock.blockItem != null) {
                        this.blockX = this.textX;
                        int i8 = this.textY;
                        this.blockY = i8;
                        RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                        if (viewHolder2 != null) {
                            View view = viewHolder2.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i8 - AndroidUtilities.dp(8.0f);
                                if (!this.parentAdapter.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(18.0f);
                                }
                                i7 += AndroidUtilities.dp(18.0f);
                                i3 = 0 - AndroidUtilities.dp(8.0f);
                            } else {
                                if (!(view instanceof BlockHeaderCell) && !(view instanceof BlockSubheaderCell) && !(view instanceof BlockTitleCell) && !(view instanceof BlockSubtitleCell)) {
                                    if (ArticleViewer.this.isListItemBlock(this.currentBlock.blockItem)) {
                                        this.blockX = 0;
                                        this.blockY = 0;
                                        this.textY = 0;
                                        i3 = ((this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) ? 0 - AndroidUtilities.dp(10.0f) : 0) - AndroidUtilities.dp(8.0f);
                                        i7 = size;
                                    } else {
                                        if (this.blockLayout.itemView instanceof BlockTableCell) {
                                            this.blockX -= AndroidUtilities.dp(18.0f);
                                            dp2 = AndroidUtilities.dp(36.0f);
                                        }
                                        i3 = 0;
                                    }
                                } else {
                                    if (!this.parentAdapter.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(18.0f);
                                    }
                                    dp2 = AndroidUtilities.dp(18.0f);
                                }
                                i7 += dp2;
                                i3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0 && (drawingText = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText.getLineCount() > 0) {
                                this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            if (this.currentBlock.blockItem instanceof TLRPC$TL_pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                                    i3 -= AndroidUtilities.dp(10.0f);
                                }
                                i3 -= AndroidUtilities.dp(8.0f);
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
                        dp = AndroidUtilities.dp(8.0f);
                        i5 += dp;
                    }
                    if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                    }
                    if (this.currentBlock.index == 0) {
                        i5 += AndroidUtilities.dp(10.0f);
                    }
                    i4 = i5;
                    drawingText2 = this.textLayout;
                    if (drawingText2 != null) {
                    }
                    viewHolder = this.blockLayout;
                    if (viewHolder != null) {
                        ArticleViewer.this.textSelectionHelper.arrayList.clear();
                        ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                        it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                        while (it.hasNext()) {
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
                if (this.parentAdapter.isRtl) {
                    canvas.translate(((measuredWidth - AndroidUtilities.dp(15.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                } else {
                    canvas.translate(((AndroidUtilities.dp(15.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
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
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) view).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockOrderedListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView {
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private TL_pageBlockOrderedListItem currentBlock;
        private int currentBlockType;
        private int numOffsetY;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public BlockOrderedListItemCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
        }

        public void setBlock(TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem) {
            if (this.currentBlock != tL_pageBlockOrderedListItem) {
                this.currentBlock = tL_pageBlockOrderedListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                if (this.currentBlock.blockItem != null) {
                    int typeForBlock = this.parentAdapter.getTypeForBlock(this.currentBlock.blockItem);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.parentAdapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            if (this.currentBlock.blockItem != null) {
                this.parentAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, this.currentBlock.blockItem, 0, 0);
            }
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x03b6  */
        @Override // android.view.View
        @SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int dp;
            int dp2;
            int i3;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText;
            DrawingText drawingText2;
            RecyclerView.ViewHolder viewHolder;
            Iterator<TextSelectionHelper.TextLayoutBlock> it;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockOrderedListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockOrderedListItem.index == 0 && this.currentBlock.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                if (this.currentBlock.parent.lastMaxNumCalcWidth != size || this.currentBlock.parent.lastFontSize != SharedConfig.ivFontSize) {
                    this.currentBlock.parent.lastMaxNumCalcWidth = size;
                    this.currentBlock.parent.lastFontSize = SharedConfig.ivFontSize;
                    this.currentBlock.parent.maxNumWidth = 0;
                    int size2 = this.currentBlock.parent.items.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = (TL_pageBlockOrderedListItem) this.currentBlock.parent.items.get(i6);
                        if (tL_pageBlockOrderedListItem2.num != null) {
                            tL_pageBlockOrderedListItem2.numLayout = ArticleViewer.this.createLayoutForText(this, tL_pageBlockOrderedListItem2.num, null, size - AndroidUtilities.dp(54.0f), this.textY, this.currentBlock, this.parentAdapter);
                            this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(tL_pageBlockOrderedListItem2.numLayout.getLineWidth(0)));
                        }
                    }
                    this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                if (!this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(24.0f) + this.currentBlock.parent.maxNumWidth + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                this.verticalAlign = false;
                int dp3 = (size - AndroidUtilities.dp(18.0f)) - this.textX;
                if (this.parentAdapter.isRtl) {
                    dp3 -= (AndroidUtilities.dp(6.0f) + this.currentBlock.parent.maxNumWidth) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
                }
                int i7 = dp3;
                if (this.currentBlock.textItem != null) {
                    DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.textItem, i7, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        if (this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - this.textLayout.getLineAscent(0);
                        }
                        dp = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                        i5 += dp;
                    }
                    if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                        i5 += AndroidUtilities.dp(8.0f);
                    }
                    if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                        i5 += AndroidUtilities.dp(10.0f);
                    }
                    i4 = i5;
                    drawingText2 = this.textLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY;
                        if (this.currentBlock.numLayout != null) {
                            this.textLayout.prefix = this.currentBlock.numLayout.textLayout.getText();
                        }
                    }
                    viewHolder = this.blockLayout;
                    if (viewHolder != null && (viewHolder.itemView instanceof TextSelectionHelper.ArticleSelectableView)) {
                        ArticleViewer.this.textSelectionHelper.arrayList.clear();
                        ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                        it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                        while (it.hasNext()) {
                            TextSelectionHelper.TextLayoutBlock next = it.next();
                            if (next instanceof DrawingText) {
                                DrawingText drawingText3 = (DrawingText) next;
                                drawingText3.x += this.blockX;
                                drawingText3.y += this.blockY;
                            }
                        }
                    }
                } else {
                    if (this.currentBlock.blockItem != null) {
                        this.blockX = this.textX;
                        int i8 = this.textY;
                        this.blockY = i8;
                        RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                        if (viewHolder2 != null) {
                            View view = viewHolder2.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i8 - AndroidUtilities.dp(8.0f);
                                if (!this.parentAdapter.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(18.0f);
                                }
                                i7 += AndroidUtilities.dp(18.0f);
                                i3 = 0 - AndroidUtilities.dp(8.0f);
                            } else {
                                if (!(view instanceof BlockHeaderCell) && !(view instanceof BlockSubheaderCell) && !(view instanceof BlockTitleCell) && !(view instanceof BlockSubtitleCell)) {
                                    if (ArticleViewer.this.isListItemBlock(this.currentBlock.blockItem)) {
                                        this.blockX = 0;
                                        this.blockY = 0;
                                        this.textY = 0;
                                        i3 = 0 - AndroidUtilities.dp(8.0f);
                                        i7 = size;
                                    } else {
                                        if (this.blockLayout.itemView instanceof BlockTableCell) {
                                            this.blockX -= AndroidUtilities.dp(18.0f);
                                            dp2 = AndroidUtilities.dp(36.0f);
                                        }
                                        i3 = 0;
                                    }
                                } else {
                                    if (!this.parentAdapter.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(18.0f);
                                    }
                                    dp2 = AndroidUtilities.dp(18.0f);
                                }
                                i7 += dp2;
                                i3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0 && (drawingText = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText.getLineCount() > 0) {
                                this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            if (this.currentBlock.blockItem instanceof TLRPC$TL_pageBlockDetails) {
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
                        dp = AndroidUtilities.dp(8.0f);
                        i5 += dp;
                    }
                    if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                    }
                    if (this.currentBlock.index == 0) {
                        i5 += AndroidUtilities.dp(10.0f);
                    }
                    i4 = i5;
                    drawingText2 = this.textLayout;
                    if (drawingText2 != null) {
                    }
                    viewHolder = this.blockLayout;
                    if (viewHolder != null) {
                        ArticleViewer.this.textSelectionHelper.arrayList.clear();
                        ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                        it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                        while (it.hasNext()) {
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
                if (this.parentAdapter.isRtl) {
                    canvas.translate(((measuredWidth - AndroidUtilities.dp(18.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                } else {
                    canvas.translate(((AndroidUtilities.dp(18.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
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
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) view).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockDetailsCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private AnimatedArrowDrawable arrow;
        private TLRPC$TL_pageBlockDetails currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public BlockDetailsCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(50.0f);
            this.textY = AndroidUtilities.dp(11.0f) + 1;
            this.parentAdapter = webpageAdapter;
            this.arrow = new AnimatedArrowDrawable(ArticleViewer.getGrayTextColor(), true);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate();
        }

        public void setBlock(TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails) {
            this.currentBlock = tLRPC$TL_pageBlockDetails;
            this.arrow.setAnimationProgress(tLRPC$TL_pageBlockDetails.open ? 0.0f : 1.0f);
            this.arrow.setCallback(this);
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(39.0f);
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = this.currentBlock;
            if (tLRPC$TL_pageBlockDetails != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockDetails.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
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
            canvas.translate(AndroidUtilities.dp(18.0f), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
            this.arrow.draw(canvas);
            canvas.restore();
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            float measuredHeight = getMeasuredHeight() - 1;
            canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, ArticleViewer.dividerPaint);
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BlockDetailsBottomCell extends View {
        public BlockDetailsBottomCell(Context context) {
            super(context);
            new RectF();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BlockRelatedArticlesShadowCell extends View {
        private CombinedDrawable shadowDrawable;

        public BlockRelatedArticlesShadowCell(Context context) {
            super(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, -16777216));
            this.shadowDrawable = combinedDrawable;
            combinedDrawable.setFullsize(true);
            setBackgroundDrawable(this.shadowDrawable);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, Theme.getColor(Theme.key_windowBackgroundGray), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockRelatedArticles currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockRelatedArticlesHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles) {
            this.currentBlock = tLRPC$TL_pageBlockRelatedArticles;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = this.currentBlock;
            if (tLRPC$TL_pageBlockRelatedArticles != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockRelatedArticles.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.parentAdapter);
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockRelatedArticlesCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TL_pageBlockRelatedArticlesChild currentBlock;
        private boolean divider;
        private boolean drawImage;
        private ImageReceiver imageView;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textOffset;
        private int textX;
        private int textY;

        public BlockRelatedArticlesCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(10.0f);
            this.parentAdapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            requestLayout();
        }

        @Override // android.view.View
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            boolean z;
            int i4;
            String str;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            this.divider = this.currentBlock.num != this.currentBlock.parent.articles.size() - 1;
            TLRPC$TL_pageRelatedArticle tLRPC$TL_pageRelatedArticle = this.currentBlock.parent.articles.get(this.currentBlock.num);
            int dp2 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            long j = tLRPC$TL_pageRelatedArticle.photo_id;
            TLRPC$Photo photoWithId = j != 0 ? this.parentAdapter.getPhotoWithId(j) : null;
            if (photoWithId != null) {
                this.drawImage = true;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 80, true);
                this.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photoWithId), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, photoWithId), "64_64_b", closestPhotoSizeWithSize.size, null, this.parentAdapter.currentPage, 1);
            } else {
                this.drawImage = false;
            }
            int dp3 = AndroidUtilities.dp(60.0f);
            int dp4 = size - AndroidUtilities.dp(36.0f);
            if (this.drawImage) {
                float dp5 = AndroidUtilities.dp(44.0f);
                this.imageView.setImageCoords((size - dp) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp5, dp5);
                dp4 = (int) (dp4 - (this.imageView.getImageWidth() + AndroidUtilities.dp(6.0f)));
            }
            int i5 = dp4;
            int dp6 = AndroidUtilities.dp(18.0f);
            String str2 = tLRPC$TL_pageRelatedArticle.title;
            if (str2 != null) {
                i3 = dp3;
                this.textLayout = ArticleViewer.this.createLayoutForText(this, str2, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.parentAdapter);
            } else {
                i3 = dp3;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                int i6 = 4 - lineCount;
                this.textOffset = this.textLayout.getHeight() + AndroidUtilities.dp(6.0f) + dp2;
                dp6 += this.textLayout.getHeight();
                int i7 = 0;
                while (true) {
                    if (i7 >= lineCount) {
                        z = false;
                        break;
                    } else if (this.textLayout.getLineLeft(i7) != 0.0f) {
                        z = true;
                        break;
                    } else {
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
            if (tLRPC$TL_pageRelatedArticle.published_date != 0 && !TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleDateByAuthor", R.string.ArticleDateByAuthor, LocaleController.getInstance().chatFullDate.format(tLRPC$TL_pageRelatedArticle.published_date * 1000), tLRPC$TL_pageRelatedArticle.author);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleByAuthor", R.string.ArticleByAuthor, tLRPC$TL_pageRelatedArticle.author);
            } else if (tLRPC$TL_pageRelatedArticle.published_date != 0) {
                str = LocaleController.getInstance().chatFullDate.format(tLRPC$TL_pageRelatedArticle.published_date * 1000);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.description)) {
                str = tLRPC$TL_pageRelatedArticle.description;
            } else {
                str = tLRPC$TL_pageRelatedArticle.url;
            }
            DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, str, null, i5, this.textOffset + this.textY, this.currentBlock, (this.parentAdapter.isRtl || z) ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, i4, this.parentAdapter);
            this.textLayout2 = createLayoutForText;
            if (createLayoutForText != null) {
                dp6 += createLayoutForText.getHeight();
                if (this.textLayout != null) {
                    dp6 += AndroidUtilities.dp(6.0f) + dp2;
                }
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.x = this.textX;
                drawingText3.y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, dp6) + (this.divider ? 1 : 0));
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
            if (this.textLayout != null) {
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.translate(0.0f, this.textOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
            }
            canvas.restore();
            if (this.divider) {
                canvas.drawLine(this.parentAdapter.isRtl ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (this.parentAdapter.isRtl ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockHeader currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader) {
            this.currentBlock = tLRPC$TL_pageBlockHeader;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockHeader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockHeader.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BlockDividerCell extends View {
        private RectF rect;

        public BlockDividerCell(Context context) {
            super(context);
            this.rect = new RectF();
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(18.0f));
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth() / 3;
            this.rect.set(measuredWidth, AndroidUtilities.dp(8.0f), measuredWidth * 2, AndroidUtilities.dp(10.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), ArticleViewer.dividerPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockSubtitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubtitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle) {
            this.currentBlock = tLRPC$TL_pageBlockSubtitle;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockSubtitle != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubtitle.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockPullquoteCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockPullquote currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public BlockPullquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote) {
            this.currentBlock = tLRPC$TL_pageBlockPullquote;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = this.currentBlock;
            if (tLRPC$TL_pageBlockPullquote != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockPullquote.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                i3 = 0;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.dp(8.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
                this.textY2 = AndroidUtilities.dp(2.0f) + i3;
                DrawingText createLayoutForText2 = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.caption, size - AndroidUtilities.dp(36.0f), this.textY2, this.currentBlock, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(8.0f) + this.textLayout2.getHeight();
                    DrawingText drawingText2 = this.textLayout2;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(8.0f);
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
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockBlockquoteCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockBlockquote currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public BlockBlockquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote) {
            this.currentBlock = tLRPC$TL_pageBlockBlockquote;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int dp = size - AndroidUtilities.dp(50.0f);
                int i4 = this.currentBlock.level;
                if (i4 > 0) {
                    dp -= AndroidUtilities.dp(i4 * 14);
                }
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote.text, dp, this.textY, tLRPC$TL_pageBlockBlockquote, this.parentAdapter);
                this.textLayout = createLayoutForText;
                i3 = createLayoutForText != null ? 0 + AndroidUtilities.dp(8.0f) + this.textLayout.getHeight() : 0;
                if (this.currentBlock.level > 0) {
                    if (this.parentAdapter.isRtl) {
                        this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + 14);
                    } else {
                        this.textX = AndroidUtilities.dp(this.currentBlock.level * 14) + AndroidUtilities.dp(32.0f);
                    }
                } else if (this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(14.0f);
                } else {
                    this.textX = AndroidUtilities.dp(32.0f);
                }
                int dp2 = i3 + AndroidUtilities.dp(8.0f);
                this.textY2 = dp2;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote2.caption, dp, dp2, tLRPC$TL_pageBlockBlockquote2, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(8.0f) + this.textLayout2.getHeight();
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(8.0f);
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
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
            if (!this.parentAdapter.isRtl) {
                canvas.drawRect(AndroidUtilities.dp((this.currentBlock.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.currentBlock.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            } else {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
                canvas.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), measuredWidth + AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockPhotoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockPhoto currentBlock;
        private String currentFilter;
        private TLRPC$Photo currentPhoto;
        private TLRPC$PhotoSize currentPhotoObject;
        private TLRPC$PhotoSize currentPhotoObjectThumb;
        private String currentThumbFilter;
        private int currentType;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private Drawable linkDrawable;
        private WebpageAdapter parentAdapter;
        private TLRPC$PageBlock parentBlock;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;

        @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockPhotoCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.channelCell = new BlockChannelCell(context, this.parentAdapter, 1);
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
            this.currentType = i;
        }

        public void setBlock(TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto, boolean z, boolean z2) {
            this.parentBlock = null;
            this.currentBlock = tLRPC$TL_pageBlockPhoto;
            this.isFirst = z;
            this.channelCell.setVisibility(4);
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                this.linkDrawable = getResources().getDrawable(R.drawable.msg_instant_link);
            }
            TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto2 = this.currentBlock;
            if (tLRPC$TL_pageBlockPhoto2 != null) {
                TLRPC$Photo photoWithId = this.parentAdapter.getPhotoWithId(tLRPC$TL_pageBlockPhoto2.photo_id);
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

        public void setParentBlock(TLRPC$PageBlock tLRPC$PageBlock) {
            this.parentBlock = tLRPC$PageBlock;
            if (this.parentAdapter.channelBlock == null || !(this.parentBlock instanceof TLRPC$TL_pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(this.parentAdapter.channelBlock);
            this.channelCell.setVisibility(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
            if (r2 <= (r0 + org.telegram.messenger.AndroidUtilities.dp(48.0f))) goto L31;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this, this.imageView, null, null)) {
                return true;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                if (this.parentAdapter.channelBlock != null && motionEvent.getAction() == 1) {
                    MessagesController.getInstance(ArticleViewer.this.currentAccount).openByUserName(ChatObject.getPublicUsername(this.parentAdapter.channelBlock.channel), ArticleViewer.this.parentFragment, 2);
                    ArticleViewer.this.close(false, true);
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    int i = this.buttonX;
                    if (x >= i && x <= i + AndroidUtilities.dp(48.0f)) {
                        int i2 = this.buttonY;
                        if (y >= i2) {
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
                    ArticleViewer.this.openPhoto(this.currentBlock, this.parentAdapter);
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
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto;
            int dp;
            int i5;
            int i6;
            int i7;
            int i8;
            TLRPC$PhotoSize tLRPC$PhotoSize;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int size = View.MeasureSpec.getSize(i);
            int i15 = this.currentType;
            boolean z = false;
            int i16 = 1;
            if (i15 == 1) {
                size = ((View) getParent()).getMeasuredWidth();
                i4 = ((View) getParent()).getMeasuredHeight();
            } else if (i15 == 2) {
                float f = this.groupPosition.ph;
                Point point = AndroidUtilities.displaySize;
                i4 = (int) Math.ceil(f * Math.max(point.x, point.y) * 0.5f);
            } else {
                i3 = size;
                i4 = 0;
                tLRPC$TL_pageBlockPhoto = this.currentBlock;
                if (tLRPC$TL_pageBlockPhoto != null) {
                    this.currentPhoto = this.parentAdapter.getPhotoWithId(tLRPC$TL_pageBlockPhoto.photo_id);
                    int dp2 = AndroidUtilities.dp(48.0f);
                    if (this.currentType == 0 && (i14 = this.currentBlock.level) > 0) {
                        i6 = AndroidUtilities.dp(i14 * 14) + AndroidUtilities.dp(18.0f);
                        this.textX = i6;
                        i5 = i3 - (AndroidUtilities.dp(18.0f) + i6);
                        dp = i5;
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                        dp = i3 - AndroidUtilities.dp(36.0f);
                        i5 = i3;
                        i6 = 0;
                    }
                    TLRPC$Photo tLRPC$Photo = this.currentPhoto;
                    if (tLRPC$Photo == null || this.currentPhotoObject == null) {
                        i7 = dp;
                        i8 = i4;
                    } else {
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 40, true);
                        this.currentPhotoObjectThumb = closestPhotoSizeWithSize;
                        if (this.currentPhotoObject == closestPhotoSizeWithSize) {
                            this.currentPhotoObjectThumb = null;
                        }
                        int i17 = this.currentType;
                        if (i17 == 0) {
                            i4 = (int) ((i5 / tLRPC$PhotoSize.w) * tLRPC$PhotoSize.h);
                            if (this.parentBlock instanceof TLRPC$TL_pageBlockCover) {
                                i4 = Math.min(i4, i5);
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                int max = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    TLRPC$PhotoSize tLRPC$PhotoSize2 = this.currentPhotoObject;
                                    i5 = (int) ((max / tLRPC$PhotoSize2.h) * tLRPC$PhotoSize2.w);
                                    i6 += ((i3 - i6) - i5) / 2;
                                    i4 = max;
                                }
                            }
                            i9 = i5;
                            i7 = dp;
                        } else if (i17 == 2) {
                            if ((this.groupPosition.flags & 2) == 0) {
                                i5 -= AndroidUtilities.dp(2.0f);
                            }
                            int dp3 = (this.groupPosition.flags & 8) == 0 ? i4 - AndroidUtilities.dp(2.0f) : i4;
                            if (this.groupPosition.leftSpanOffset != 0) {
                                i7 = dp;
                                int ceil = (int) Math.ceil((i10 * i3) / 1000.0f);
                                i5 -= ceil;
                                i6 += ceil;
                            } else {
                                i7 = dp;
                            }
                            int i18 = i6;
                            i11 = i4;
                            i4 = dp3;
                            i9 = i5;
                            i12 = i18;
                            this.imageView.setImageCoords(i12, (!this.isFirst || (i13 = this.currentType) == 1 || i13 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i9, i4);
                            if (this.currentType != 0) {
                                this.currentFilter = null;
                            } else {
                                this.currentFilter = String.format(Locale.US, "%d_%d", Integer.valueOf(i9), Integer.valueOf(i4));
                            }
                            this.currentThumbFilter = "80_80_b";
                            this.autoDownload = (DownloadController.getInstance(ArticleViewer.this.currentAccount).getCurrentDownloadMask() & 1) == 0;
                            File pathToAttach = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentPhotoObject, true);
                            if (!this.autoDownload || pathToAttach.exists()) {
                                this.imageView.setStrippedLocation(null);
                                this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.parentAdapter.currentPage, 1);
                            } else {
                                this.imageView.setStrippedLocation(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto));
                                this.imageView.setImage(null, this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.parentAdapter.currentPage, 1);
                            }
                            float f2 = dp2;
                            this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f2) / 2.0f));
                            int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f2) / 2.0f));
                            this.buttonY = imageY;
                            RadialProgress2 radialProgress2 = this.radialProgress;
                            int i19 = this.buttonX;
                            radialProgress2.setProgressRect(i19, imageY, i19 + dp2, dp2 + imageY);
                            i8 = i11;
                        } else {
                            i7 = dp;
                            i9 = i5;
                        }
                        i12 = i6;
                        i11 = i4;
                        this.imageView.setImageCoords(i12, (!this.isFirst || (i13 = this.currentType) == 1 || i13 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f), i9, i4);
                        if (this.currentType != 0) {
                        }
                        this.currentThumbFilter = "80_80_b";
                        this.autoDownload = (DownloadController.getInstance(ArticleViewer.this.currentAccount).getCurrentDownloadMask() & 1) == 0;
                        File pathToAttach2 = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentPhotoObject, true);
                        if (!this.autoDownload) {
                        }
                        this.imageView.setStrippedLocation(null);
                        this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.parentAdapter.currentPage, 1);
                        float f22 = dp2;
                        this.buttonX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - f22) / 2.0f));
                        int imageY2 = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() - f22) / 2.0f));
                        this.buttonY = imageY2;
                        RadialProgress2 radialProgress22 = this.radialProgress;
                        int i192 = this.buttonX;
                        radialProgress22.setProgressRect(i192, imageY2, i192 + dp2, dp2 + imageY2);
                        i8 = i11;
                    }
                    int imageY3 = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                    this.textY = imageY3;
                    if (this.currentType == 0) {
                        ArticleViewer articleViewer = ArticleViewer.this;
                        TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto2 = this.currentBlock;
                        DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockPhoto2.caption.text, i7, imageY3, tLRPC$TL_pageBlockPhoto2, this.parentAdapter);
                        this.captionLayout = createLayoutForText;
                        if (createLayoutForText != null) {
                            int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp4;
                            i8 += dp4 + AndroidUtilities.dp(4.0f);
                        }
                        int i20 = i8;
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto3 = this.currentBlock;
                        DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockPhoto3.caption.credit, i7, this.textY + this.creditOffset, tLRPC$TL_pageBlockPhoto3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.parentAdapter);
                        this.creditLayout = createLayoutForText2;
                        i8 = createLayoutForText2 != null ? i20 + AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight() : i20;
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        i8 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.parentBlock instanceof TLRPC$TL_pageBlockCover) && this.parentAdapter.blocks != null && this.parentAdapter.blocks.size() > 1 && (this.parentAdapter.blocks.get(1) instanceof TLRPC$TL_pageBlockChannel)) {
                        z = true;
                    }
                    if (this.currentType != 2 && !z) {
                        i8 += AndroidUtilities.dp(8.0f);
                    }
                    i16 = i8;
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
                setMeasuredDimension(i3, i16);
            }
            i3 = size;
            tLRPC$TL_pageBlockPhoto = this.currentBlock;
            if (tLRPC$TL_pageBlockPhoto != null) {
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            setMeasuredDimension(i3, i16);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), ArticleViewer.photoBackgroundPaint);
            }
            if (!ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                this.imageView.draw(canvas);
                if (this.imageView.getVisible()) {
                    this.radialProgress.draw(canvas);
                }
            }
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
                int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.dp(11.0f));
                this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
                this.linkDrawable.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            return i == 1 ? 3 : 4;
        }

        private void didPressedButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.radialProgress.setProgress(0.0f, z);
                this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.parentAdapter.currentPage, 1);
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
            } else if (i == 1) {
                this.imageView.cancelLoadImage();
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            }
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentPhotoObject);
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentPhotoObject, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f = 0.0f;
                if (this.autoDownload || FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
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
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
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
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
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
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachPhoto", R.string.AttachPhoto));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockMapCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockMap currentBlock;
        private int currentMapProvider;
        private int currentType;
        private ImageReceiver imageView;
        private boolean isFirst;
        private WebpageAdapter parentAdapter;
        private boolean photoPressed;
        private int textX;
        private int textY;

        public BlockMapCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.currentType = i;
        }

        public void setBlock(TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockMap;
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
                    TLRPC$GeoPoint tLRPC$GeoPoint = this.currentBlock.geo;
                    double d = tLRPC$GeoPoint.lat;
                    double d2 = tLRPC$GeoPoint._long;
                    Activity activity = ArticleViewer.this.parentActivity;
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
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
            TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = this.currentBlock;
            if (tLRPC$TL_pageBlockMap != null) {
                if (this.currentType == 0 && (i8 = tLRPC$TL_pageBlockMap.level) > 0) {
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
                    TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap2 = this.currentBlock;
                    size = (int) ((i4 / tLRPC$TL_pageBlockMap2.w) * tLRPC$TL_pageBlockMap2.h);
                    Point point = AndroidUtilities.displaySize;
                    int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                    if (size > max) {
                        TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap3 = this.currentBlock;
                        i4 = (int) ((max / tLRPC$TL_pageBlockMap3.h) * tLRPC$TL_pageBlockMap3.w);
                        i10 += ((i3 - i10) - i4) / 2;
                        i5 = max;
                        ImageReceiver imageReceiver = this.imageView;
                        float f = i10;
                        float dp2 = (!this.isFirst || (i7 = this.currentType) == 1 || i7 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
                        float f2 = i4;
                        float f3 = i5;
                        imageReceiver.setImageCoords(f, dp2, f2, f3);
                        int i12 = ArticleViewer.this.currentAccount;
                        TLRPC$GeoPoint tLRPC$GeoPoint = this.currentBlock.geo;
                        double d = tLRPC$GeoPoint.lat;
                        double d2 = tLRPC$GeoPoint._long;
                        float f4 = AndroidUtilities.density;
                        String formapMapUrl = AndroidUtilities.formapMapUrl(i12, d, d2, (int) (f2 / f4), (int) (f3 / f4), true, 15, -1);
                        TLRPC$GeoPoint tLRPC$GeoPoint2 = this.currentBlock.geo;
                        float f5 = AndroidUtilities.density;
                        WebFile createWithGeoPoint = WebFile.createWithGeoPoint(tLRPC$GeoPoint2, (int) (f2 / f5), (int) (f3 / f5), 15, Math.min(2, (int) Math.ceil(f5)));
                        i6 = MessagesController.getInstance(ArticleViewer.this.currentAccount).mapProvider;
                        this.currentMapProvider = i6;
                        if (i6 != 2) {
                            if (createWithGeoPoint != null) {
                                this.imageView.setImage(ImageLocation.getForWebFile(createWithGeoPoint), null, null, null, this.parentAdapter.currentPage, 0);
                            }
                        } else if (formapMapUrl != null) {
                            this.imageView.setImage(formapMapUrl, null, null, null, 0L);
                        }
                        int imageY = (int) (this.imageView.getImageY() + this.imageView.getImageHeight() + AndroidUtilities.dp(8.0f));
                        this.textY = imageY;
                        if (this.currentType == 0) {
                            ArticleViewer articleViewer = ArticleViewer.this;
                            TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap4 = this.currentBlock;
                            DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockMap4.caption.text, dp, imageY, tLRPC$TL_pageBlockMap4, this.parentAdapter);
                            this.captionLayout = createLayoutForText;
                            if (createLayoutForText != null) {
                                int dp3 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                                this.creditOffset = dp3;
                                i5 += dp3 + AndroidUtilities.dp(4.0f);
                                DrawingText drawingText = this.captionLayout;
                                drawingText.x = this.textX;
                                drawingText.y = this.textY;
                            }
                            ArticleViewer articleViewer2 = ArticleViewer.this;
                            TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap5 = this.currentBlock;
                            DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockMap5.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockMap5, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
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
                        if (this.currentType != 2) {
                            i5 += AndroidUtilities.dp(8.0f);
                        }
                        i11 = i5;
                    }
                }
                i5 = size;
                ImageReceiver imageReceiver2 = this.imageView;
                float f6 = i10;
                if (this.isFirst) {
                }
                float f22 = i4;
                float f32 = i5;
                imageReceiver2.setImageCoords(f6, dp2, f22, f32);
                int i122 = ArticleViewer.this.currentAccount;
                TLRPC$GeoPoint tLRPC$GeoPoint3 = this.currentBlock.geo;
                double d3 = tLRPC$GeoPoint3.lat;
                double d22 = tLRPC$GeoPoint3._long;
                float f42 = AndroidUtilities.density;
                String formapMapUrl2 = AndroidUtilities.formapMapUrl(i122, d3, d22, (int) (f22 / f42), (int) (f32 / f42), true, 15, -1);
                TLRPC$GeoPoint tLRPC$GeoPoint22 = this.currentBlock.geo;
                float f52 = AndroidUtilities.density;
                WebFile createWithGeoPoint2 = WebFile.createWithGeoPoint(tLRPC$GeoPoint22, (int) (f22 / f52), (int) (f32 / f52), 15, Math.min(2, (int) Math.ceil(f52)));
                i6 = MessagesController.getInstance(ArticleViewer.this.currentAccount).mapProvider;
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
                if (this.currentType != 2) {
                }
                i11 = i5;
            }
            setMeasuredDimension(i3, i11);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            Theme.chat_docBackPaint.setColor(Theme.getColor(Theme.key_chat_inLocationBackground));
            canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
            int centerX = (int) (this.imageView.getCenterX() - (Theme.chat_locationDrawable[0].getIntrinsicWidth() / 2));
            int centerY = (int) (this.imageView.getCenterY() - (Theme.chat_locationDrawable[0].getIntrinsicHeight() / 2));
            Drawable[] drawableArr = Theme.chat_locationDrawable;
            drawableArr[0].setBounds(centerX, centerY, drawableArr[0].getIntrinsicWidth() + centerX, Theme.chat_locationDrawable[0].getIntrinsicHeight() + centerY);
            Theme.chat_locationDrawable[0].draw(canvas);
            this.imageView.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                if (ArticleViewer.this.chat_redLocationIcon == null) {
                    ArticleViewer.this.chat_redLocationIcon = ContextCompat.getDrawable(getContext(), R.drawable.map_pin).mutate();
                }
                int intrinsicWidth = (int) (ArticleViewer.this.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (ArticleViewer.this.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight));
                ArticleViewer.this.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                ArticleViewer.this.chat_redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                ArticleViewer.this.chat_redLocationIcon.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                i = 1;
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString("Map", R.string.Map));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockChannelCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private Paint backgroundPaint;
        private int buttonWidth;
        private AnimatorSet currentAnimation;
        private TLRPC$TL_pageBlockChannel currentBlock;
        private int currentState;
        private int currentType;
        private ImageView imageView;
        private WebpageAdapter parentAdapter;
        private ContextProgressView progressView;
        private DrawingText textLayout;
        private TextView textView;
        private int textX;
        private int textX2;
        private int textY;

        public BlockChannelCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(11.0f);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.backgroundPaint = new Paint();
            this.currentType = i;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textView.setText(LocaleController.getString("ChannelJoin", R.string.ChannelJoin));
            this.textView.setGravity(19);
            addView(this.textView, LayoutHelper.createFrame(-2, 39, 53));
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ArticleViewer$BlockChannelCell$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArticleViewer.BlockChannelCell.this.lambda$new$0(view);
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
        public /* synthetic */ void lambda$new$0(View view) {
            if (this.currentState != 0) {
                return;
            }
            setState(1, true);
            ArticleViewer articleViewer = ArticleViewer.this;
            articleViewer.joinChannel(this, articleViewer.loadedChannel);
        }

        public void setBlock(TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel) {
            this.currentBlock = tLRPC$TL_pageBlockChannel;
            if (this.currentType == 0) {
                int color = Theme.getColor(Theme.key_switchTrack);
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.textView.setTextColor(ArticleViewer.this.getLinkTextColor());
                this.backgroundPaint.setColor(Color.argb(34, red, green, blue));
                this.imageView.setColorFilter(new PorterDuffColorFilter(ArticleViewer.getGrayTextColor(), PorterDuff.Mode.MULTIPLY));
            } else {
                this.textView.setTextColor(-1);
                this.backgroundPaint.setColor(2130706432);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            TLRPC$Chat chat = MessagesController.getInstance(ArticleViewer.this.currentAccount).getChat(Long.valueOf(tLRPC$TL_pageBlockChannel.channel.id));
            if (chat == null || chat.min) {
                ArticleViewer.this.loadChannel(this, this.parentAdapter, tLRPC$TL_pageBlockChannel.channel);
                setState(1, false);
            } else {
                ArticleViewer.this.loadedChannel = chat;
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
                Animator[] animatorArr = new Animator[9];
                TextView textView = this.textView;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = i == 0 ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(textView, property, fArr);
                TextView textView2 = this.textView;
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = i == 0 ? 1.0f : 0.1f;
                animatorArr[1] = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                TextView textView3 = this.textView;
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                fArr3[0] = i == 0 ? 1.0f : 0.1f;
                animatorArr[2] = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                ContextProgressView contextProgressView = this.progressView;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = i == 1 ? 1.0f : 0.0f;
                animatorArr[3] = ObjectAnimator.ofFloat(contextProgressView, property4, fArr4);
                ContextProgressView contextProgressView2 = this.progressView;
                Property property5 = View.SCALE_X;
                float[] fArr5 = new float[1];
                fArr5[0] = i == 1 ? 1.0f : 0.1f;
                animatorArr[4] = ObjectAnimator.ofFloat(contextProgressView2, property5, fArr5);
                ContextProgressView contextProgressView3 = this.progressView;
                Property property6 = View.SCALE_Y;
                float[] fArr6 = new float[1];
                fArr6[0] = i == 1 ? 1.0f : 0.1f;
                animatorArr[5] = ObjectAnimator.ofFloat(contextProgressView3, property6, fArr6);
                ImageView imageView = this.imageView;
                Property property7 = View.ALPHA;
                float[] fArr7 = new float[1];
                fArr7[0] = i == 2 ? 1.0f : 0.0f;
                animatorArr[6] = ObjectAnimator.ofFloat(imageView, property7, fArr7);
                ImageView imageView2 = this.imageView;
                Property property8 = View.SCALE_X;
                float[] fArr8 = new float[1];
                fArr8[0] = i == 2 ? 1.0f : 0.1f;
                animatorArr[7] = ObjectAnimator.ofFloat(imageView2, property8, fArr8);
                ImageView imageView3 = this.imageView;
                Property property9 = View.SCALE_Y;
                float[] fArr9 = new float[1];
                fArr9[0] = i == 2 ? 1.0f : 0.1f;
                animatorArr[8] = ObjectAnimator.ofFloat(imageView3, property9, fArr9);
                animatorSet2.playTogether(animatorArr);
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
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.widget.FrameLayout, android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.buttonWidth = this.textView.getMeasuredWidth();
            this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel = this.currentBlock;
            if (tLRPC$TL_pageBlockChannel != null) {
                this.textLayout = ArticleViewer.this.createLayoutForText(this, tLRPC$TL_pageBlockChannel.channel.title, null, (size - AndroidUtilities.dp(52.0f)) - this.buttonWidth, this.textY, this.currentBlock, StaticLayoutEx.ALIGN_LEFT(), 1, this.parentAdapter);
                if (this.parentAdapter.isRtl) {
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
            if (this.parentAdapter.isRtl) {
                canvas.translate((getMeasuredWidth() - this.textLayout.getLineWidth(0)) - this.textX, this.textY);
            } else {
                canvas.translate(this.textX, this.textY);
            }
            if (this.currentType == 0) {
                ArticleViewer.this.drawTextSelection(canvas, this);
            }
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockAuthorDate currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockAuthorDateCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate) {
            this.currentBlock = tLRPC$TL_pageBlockAuthorDate;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v10, types: [android.text.Spannable] */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v26 */
        /* JADX WARN: Type inference failed for: r15v27 */
        /* JADX WARN: Type inference failed for: r15v28 */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r4v9, types: [android.text.Spannable$Factory] */
        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            Spannable spannable;
            ?? r15;
            int indexOf;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockAuthorDate != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                WebpageAdapter webpageAdapter = this.parentAdapter;
                TLRPC$RichText tLRPC$RichText = tLRPC$TL_pageBlockAuthorDate.author;
                CharSequence text = articleViewer.getText(webpageAdapter, this, tLRPC$RichText, tLRPC$RichText, tLRPC$TL_pageBlockAuthorDate, size);
                MetricAffectingSpan[] metricAffectingSpanArr = null;
                if (text instanceof Spannable) {
                    Spannable spannable2 = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable2.getSpans(0, text.length(), MetricAffectingSpan.class);
                    spannable = spannable2;
                } else {
                    spannable = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    r15 = LocaleController.formatString("ArticleDateByAuthor", R.string.ArticleDateByAuthor, LocaleController.getInstance().chatFullDate.format(this.currentBlock.published_date * 1000), text);
                } else if (!TextUtils.isEmpty(text)) {
                    r15 = LocaleController.formatString("ArticleByAuthor", R.string.ArticleByAuthor, text);
                } else {
                    r15 = LocaleController.getInstance().chatFullDate.format(this.currentBlock.published_date * 1000);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) r15, text)) != -1) {
                            r15 = Spannable.Factory.getInstance().newSpannable(r15);
                            for (int i4 = 0; i4 < metricAffectingSpanArr.length; i4++) {
                                r15.setSpan(metricAffectingSpanArr[i4], spannable.getSpanStart(metricAffectingSpanArr[i4]) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i4]) + indexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, r15, null, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight() + 0;
                    if (this.parentAdapter.isRtl) {
                        this.textX = (int) Math.floor(((size - this.textLayout.getLineLeft(0)) - this.textLayout.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    i3 = dp;
                } else {
                    i3 = 0;
                }
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
            ArticleViewer.this.drawTextSelection(canvas, this);
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
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockTitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockTitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle) {
            this.currentBlock = tLRPC$TL_pageBlockTitle;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle = this.currentBlock;
            if (tLRPC$TL_pageBlockTitle != null) {
                i3 = 0;
                if (tLRPC$TL_pageBlockTitle.first) {
                    i3 = 0 + AndroidUtilities.dp(8.0f);
                    this.textY = AndroidUtilities.dp(16.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVTitle", R.string.AccDescrIVTitle));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockKicker currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockKickerCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker) {
            this.currentBlock = tLRPC$TL_pageBlockKicker;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker = this.currentBlock;
            if (tLRPC$TL_pageBlockKicker != null) {
                i3 = 0;
                if (tLRPC$TL_pageBlockKicker.first) {
                    this.textY = AndroidUtilities.dp(16.0f);
                    i3 = 0 + AndroidUtilities.dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockFooter currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockFooterCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter) {
            this.currentBlock = tLRPC$TL_pageBlockFooter;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockFooter != null) {
                int i4 = tLRPC$TL_pageBlockFooter.level;
                if (i4 == 0) {
                    this.textY = AndroidUtilities.dp(8.0f);
                    this.textX = AndroidUtilities.dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((i4 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(8.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
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
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockPreformattedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockPreformatted currentBlock;
        private WebpageAdapter parentAdapter;
        private HorizontalScrollView scrollView;
        private View textContainer;
        private DrawingText textLayout;

        public BlockPreformattedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockPreformattedCell.1
                @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (BlockPreformattedCell.this.textContainer.getMeasuredWidth() > getMeasuredWidth()) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override // android.view.View
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null) {
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            this.textContainer = new View(context, ArticleViewer.this) { // from class: org.telegram.ui.ArticleViewer.BlockPreformattedCell.2
                @Override // android.view.View
                protected void onMeasure(int i, int i2) {
                    int i3 = 0;
                    int i4 = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                        blockPreformattedCell.textLayout = ArticleViewer.this.createLayoutForText(this, null, blockPreformattedCell.currentBlock.text, AndroidUtilities.dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, BlockPreformattedCell.this.parentAdapter);
                        if (BlockPreformattedCell.this.textLayout != null) {
                            int height = BlockPreformattedCell.this.textLayout.getHeight() + 0;
                            int lineCount = BlockPreformattedCell.this.textLayout.getLineCount();
                            while (i3 < lineCount) {
                                i4 = Math.max((int) Math.ceil(BlockPreformattedCell.this.textLayout.getLineWidth(i3)), i4);
                                i3++;
                            }
                            i3 = height;
                        }
                    } else {
                        i3 = 1;
                    }
                    setMeasuredDimension(i4 + AndroidUtilities.dp(32.0f), i3);
                }

                @Override // android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    WebpageAdapter webpageAdapter2 = blockPreformattedCell.parentAdapter;
                    BlockPreformattedCell blockPreformattedCell2 = BlockPreformattedCell.this;
                    return articleViewer.checkLayoutForLinks(webpageAdapter2, motionEvent, blockPreformattedCell2, blockPreformattedCell2.textLayout, 0, 0) || super.onTouchEvent(motionEvent);
                }

                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    if (BlockPreformattedCell.this.textLayout != null) {
                        canvas.save();
                        BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                        ArticleViewer.this.drawTextSelection(canvas, blockPreformattedCell);
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
            this.scrollView.addView(this.textContainer, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: org.telegram.ui.ArticleViewer$BlockPreformattedCell$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        ArticleViewer.BlockPreformattedCell.this.lambda$new$0(view, i, i2, i3, i4);
                    }
                });
            }
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
            if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                return;
            }
            ArticleViewer.this.textSelectionHelper.invalidate();
        }

        public void setBlock(TLRPC$TL_pageBlockPreformatted tLRPC$TL_pageBlockPreformatted) {
            this.currentBlock = tLRPC$TL_pageBlockPreformatted;
            this.scrollView.setScrollX(0);
            this.textContainer.requestLayout();
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
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
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override // android.view.View, org.telegram.ui.Cells.TextSelectionHelper.SelectableView
        public void invalidate() {
            this.textContainer.invalidate();
            super.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class BlockSubheaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockSubheader currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubheaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader) {
            this.currentBlock = tLRPC$TL_pageBlockSubheader;
            requestLayout();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockSubheader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubheader.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
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
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ReportCell extends FrameLayout {
        private boolean hasViews;
        private TextView textView;
        private TextView viewsTextView;

        public ReportCell(Context context) {
            super(context);
            setTag(90);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(LocaleController.getString("PreviewFeedback2", R.string.PreviewFeedback2));
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
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
            int color = Theme.getColor(Theme.key_switchTrack);
            this.textView.setTextColor(ArticleViewer.getGrayTextColor());
            this.viewsTextView.setTextColor(ArticleViewer.getGrayTextColor());
            this.textView.setBackgroundColor(Color.argb(34, Color.red(color), Color.green(color), Color.blue(color)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(canvas, articleSelectableView, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        View view = (View) articleSelectableView;
        if (view.getTag() != null && view.getTag() == "bottomSheet" && (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) != null) {
            articleTextSelectionHelper.draw(canvas, articleSelectableView, i);
        } else {
            this.textSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    public boolean openPhoto(TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        ArrayList arrayList;
        int indexOf;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
                arrayList = new ArrayList(webpageAdapter.photoBlocks);
                indexOf = webpageAdapter.photoBlocks.indexOf(tLRPC$PageBlock);
            } else {
                arrayList = Collections.singletonList(tLRPC$PageBlock);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class RealPageBlocksAdapter implements PhotoViewer.PageBlocksAdapter {
        private final TLRPC$WebPage page;
        private final List<TLRPC$PageBlock> pageBlocks;

        private RealPageBlocksAdapter(TLRPC$WebPage tLRPC$WebPage, List<TLRPC$PageBlock> list) {
            this.page = tLRPC$WebPage;
            this.pageBlocks = list;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public int getItemsCount() {
            return this.pageBlocks.size();
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public TLRPC$PageBlock get(int i) {
            return this.pageBlocks.get(i);
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public List<TLRPC$PageBlock> getAll() {
            return this.pageBlocks;
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public boolean isVideo(int i) {
            return i < this.pageBlocks.size() && i >= 0 && WebPageUtils.isVideo(this.page, get(i));
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public boolean isHardwarePlayer(int i) {
            return i < this.pageBlocks.size() && i >= 0 && !WebPageUtils.isVideo(this.page, get(i)) && ArticleViewer.this.adapter[0].getTypeForBlock(get(i)) == 5;
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
            if (media instanceof TLRPC$Photo) {
                media = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) media).sizes, AndroidUtilities.getPhotoSize());
            }
            return FileLoader.getAttachFileName(media);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CharSequence getCaption(int i) {
            SpannableStringBuilder spannableStringBuilder;
            TLRPC$PageBlock tLRPC$PageBlock = get(i);
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                String str = ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).url;
                if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new URLSpan(str) { // from class: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            ArticleViewer.this.openWebpageUrl(getURL(), null);
                        }
                    }, 0, str.length(), 34);
                    if (spannableStringBuilder != null) {
                        TLRPC$RichText blockCaption = ArticleViewer.this.getBlockCaption(tLRPC$PageBlock, 2);
                        CharSequence text = ArticleViewer.this.getText(this.page, (View) null, blockCaption, blockCaption, tLRPC$PageBlock, -AndroidUtilities.dp(100.0f));
                        if (text instanceof Spannable) {
                            Spannable spannable = (Spannable) text;
                            TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(0, text.length(), TextPaintUrlSpan.class);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text.toString());
                            if (textPaintUrlSpanArr != null && textPaintUrlSpanArr.length > 0) {
                                for (int i2 = 0; i2 < textPaintUrlSpanArr.length; i2++) {
                                    spannableStringBuilder2.setSpan(new URLSpan(textPaintUrlSpanArr[i2].getUrl()) { // from class: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.2
                                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                                        public void onClick(View view) {
                                            ArticleViewer.this.openWebpageUrl(getURL(), null);
                                        }
                                    }, spannable.getSpanStart(textPaintUrlSpanArr[i2]), spannable.getSpanEnd(textPaintUrlSpanArr[i2]), 33);
                                }
                            }
                            return spannableStringBuilder2;
                        }
                        return text;
                    }
                    return spannableStringBuilder;
                }
            }
            spannableStringBuilder = null;
            if (spannableStringBuilder != null) {
            }
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public TLRPC$PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            if (tLObject instanceof TLRPC$Photo) {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize2 != null) {
                    iArr[0] = closestPhotoSizeWithSize2.size;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    return closestPhotoSizeWithSize2;
                }
                iArr[0] = -1;
                return null;
            } else if (!(tLObject instanceof TLRPC$Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Document) tLObject).thumbs, 90)) == null) {
                return null;
            } else {
                iArr[0] = closestPhotoSizeWithSize.size;
                if (iArr[0] == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize;
            }
        }

        @Override // org.telegram.ui.PhotoViewer.PageBlocksAdapter
        public void updateSlideshowCell(TLRPC$PageBlock tLRPC$PageBlock) {
            int childCount = ArticleViewer.this.listView[0].getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ArticleViewer.this.listView[0].getChildAt(i);
                if (childAt instanceof BlockSlideshowCell) {
                    BlockSlideshowCell blockSlideshowCell = (BlockSlideshowCell) childAt;
                    int indexOf = blockSlideshowCell.currentBlock.items.indexOf(tLRPC$PageBlock);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class PageBlocksPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private final List<TLRPC$PageBlock> pageBlocks;
        private final int[] tempArr = new int[2];

        public PageBlocksPhotoViewerProvider(List<TLRPC$PageBlock> list) {
            this.pageBlocks = list;
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            ImageReceiver imageReceiverFromListView;
            if (i < 0 || i >= this.pageBlocks.size() || (imageReceiverFromListView = getImageReceiverFromListView(ArticleViewer.this.listView[0], this.pageBlocks.get(i), this.tempArr)) == null) {
                return null;
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            int[] iArr = this.tempArr;
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ArticleViewer.this.listView[0];
            placeProviderObject.imageReceiver = imageReceiverFromListView;
            placeProviderObject.thumb = imageReceiverFromListView.getBitmapSafe();
            placeProviderObject.radius = imageReceiverFromListView.getRoundRadius();
            placeProviderObject.clipTopAddition = ArticleViewer.this.currentHeaderHeight;
            return placeProviderObject;
        }

        private ImageReceiver getImageReceiverFromListView(ViewGroup viewGroup, TLRPC$PageBlock tLRPC$PageBlock, int[] iArr) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ImageReceiver imageReceiverView = getImageReceiverView(viewGroup.getChildAt(i), tLRPC$PageBlock, iArr);
                if (imageReceiverView != null) {
                    return imageReceiverView;
                }
            }
            return null;
        }

        private ImageReceiver getImageReceiverView(View view, TLRPC$PageBlock tLRPC$PageBlock, int[] iArr) {
            ImageReceiver imageReceiverView;
            ImageReceiver imageReceiverView2;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (view instanceof BlockPhotoCell) {
                BlockPhotoCell blockPhotoCell = (BlockPhotoCell) view;
                if (blockPhotoCell.currentBlock == tLRPC$PageBlock) {
                    view.getLocationInWindow(iArr);
                    return blockPhotoCell.imageView;
                }
                return null;
            } else if (view instanceof BlockVideoCell) {
                BlockVideoCell blockVideoCell = (BlockVideoCell) view;
                if (blockVideoCell.currentBlock == tLRPC$PageBlock) {
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
                return null;
            } else if (view instanceof BlockCollageCell) {
                ImageReceiver imageReceiverFromListView = getImageReceiverFromListView(((BlockCollageCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView != null) {
                    return imageReceiverFromListView;
                }
                return null;
            } else if (view instanceof BlockSlideshowCell) {
                ImageReceiver imageReceiverFromListView2 = getImageReceiverFromListView(((BlockSlideshowCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView2 != null) {
                    return imageReceiverFromListView2;
                }
                return null;
            } else if (view instanceof BlockListItemCell) {
                BlockListItemCell blockListItemCell = (BlockListItemCell) view;
                if (blockListItemCell.blockLayout == null || (imageReceiverView2 = getImageReceiverView(blockListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView2;
            } else if (view instanceof BlockOrderedListItemCell) {
                BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
                if (blockOrderedListItemCell.blockLayout == null || (imageReceiverView = getImageReceiverView(blockOrderedListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView;
            } else {
                return null;
            }
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void onClose() {
            super.onClose();
            ArticleViewer.this.checkVideoPlayer();
        }

        @Override // org.telegram.ui.PhotoViewer.EmptyPhotoViewerProvider, org.telegram.ui.PhotoViewer.PhotoViewerProvider
        public void onReleasePlayerBeforeClose(int i) {
            VideoPlayer videoPlayer = PhotoViewer.getInstance().getVideoPlayer();
            TextureView videoTextureView = PhotoViewer.getInstance().getVideoTextureView();
            SurfaceView videoSurfaceView = PhotoViewer.getInstance().getVideoSurfaceView();
            BlockVideoCell viewFromListView = getViewFromListView(ArticleViewer.this.listView[0], this.pageBlocks.get(i));
            if (viewFromListView != null && videoPlayer != null && videoTextureView != null) {
                viewFromListView.playFrom = videoPlayer.getCurrentPosition();
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (videoTextureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        viewFromListView.imageView.setImageBitmap(videoTextureView.getBitmap());
                    } else {
                        Surface surface = new Surface(videoTextureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(videoTextureView.getMeasuredWidth(), videoTextureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        viewFromListView.imageView.setImageBitmap(createBitmap);
                    }
                }
            }
            if (viewFromListView != null && videoPlayer != null && videoSurfaceView != null) {
                viewFromListView.playFrom = videoPlayer.getCurrentPosition();
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(videoSurfaceView.getMeasuredWidth(), videoSurfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                AndroidUtilities.getBitmapFromSurface(videoSurfaceView, createBitmap2);
                viewFromListView.imageView.setImageBitmap(createBitmap2);
            }
            ArticleViewer.this.checkVideoPlayer();
        }

        private BlockVideoCell getViewFromListView(ViewGroup viewGroup, TLRPC$PageBlock tLRPC$PageBlock) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof BlockVideoCell) {
                    BlockVideoCell blockVideoCell = (BlockVideoCell) childAt;
                    if (blockVideoCell.currentBlock == tLRPC$PageBlock) {
                        return blockVideoCell;
                    }
                }
            }
            return null;
        }
    }
}
