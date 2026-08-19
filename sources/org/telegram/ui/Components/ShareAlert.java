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
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

/* loaded from: classes5.dex */
public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private AnimatorSet animatorSet;
    private View bottomFadeView;
    private FrameLayout bulletinContainer;
    public FrameLayout bulletinContainer2;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    private float chatActivityEnterViewAnimateFromTop;
    private EditTextEmoji commentTextView;
    private int containerViewTop;
    private boolean copyLinkOnEnd;
    private float currentPanTranslationY;
    private boolean darkTheme;
    private ShareAlertDelegate delegate;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private TLRPC.TL_exportedMessageLink exportedMessageLink;
    private BlurredBackgroundWithFadeDrawable fadeDrawable;
    public boolean forceDarkThemeForHint;
    private FrameLayout frameLayout;
    private FrameLayout frameLayout2;
    private boolean fullyShown;
    private RecyclerListView gridView;
    private int hasPoll;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean includeStory;
    public boolean includeStoryFromMessage;
    private boolean isChannel;
    private int keyboardSize2;
    private float keyboardT;
    int lastOffset;
    private GridLayoutManager layoutManager;
    private LinearLayout linkContainer;
    private TextView linkCopyButton;
    private SimpleTextView linkTextView;
    private String[] linkToCopy;
    private ShareDialogsAdapter listAdapter;
    private boolean loadingLink;
    private Paint paint;
    private boolean panTranslationMoveLayout;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private FrameLayout pickerBottom;
    private FrameLayout pickerBottomLayout;
    private int previousScrollOffsetY;
    private ArrayList recentSearchObjects;
    private LongSparseArray recentSearchObjectsById;
    private RectF rect;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private ShareSearchAdapter searchAdapter;
    private StickerEmptyView searchEmptyView;
    private RecyclerListView searchGridView;
    private boolean searchIsVisible;
    private FillLastGridLayoutManager searchLayoutManager;
    FragmentSearchField searchView;
    private boolean searchWasVisibleBeforeTopics;
    protected Map selectedDialogTopics;
    protected LongSparseArray selectedDialogs;
    private TLRPC.Dialog selectedTopicDialog;
    private ActionBarPopupWindow sendPopupWindow;
    protected ArrayList sendingMessageObjects;
    private String[] sendingText;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private ShareTopicsAdapter shareTopicsAdapter;
    private LinearLayout sharesCountLayout;
    private int shiftDp;
    private boolean showSendersName;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    TL_stories.StoryItem storyItem;
    private SwitchView switchView;
    private Insets systemInsets;
    private TextPaint textPaint;
    public int timestamp;
    public CheckBox2 timestampCheckbox;
    public FrameLayout timestampFrameLayout;
    public LinearLayout timestampLayout;
    public TextView timestampTextView;
    private ValueAnimator topBackgroundAnimator;
    private int topBeforeSwitch;
    private SpringAnimation topicsAnimation;
    ActionBar topicsBackActionBar;
    private RecyclerListView topicsGridView;
    private GridLayoutManager topicsLayoutManager;
    private boolean updateSearchAdapter;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public static class DialogSearchResult {
        public int date;
        public TLRPC.Dialog dialog = new TLRPC.TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public interface ShareAlertDelegate {

        public abstract /* synthetic */ class -CC {
            public static void $default$didShare(ShareAlertDelegate shareAlertDelegate) {
            }
        }

        boolean didCopy();

        void didShare();
    }

    public static /* synthetic */ boolean $r8$lambda$fa9TxitH_bTtIw4ogWXMyiVk3as(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    protected void onShareStory(View view) {
    }

    public void setStoryToShare(TL_stories.StoryItem storyItem) {
        this.storyItem = storyItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SwitchView extends FrameLayout {
        private AnimatorSet animator;
        private int currentTab;
        private int lastColor;
        private SimpleTextView leftTab;
        private LinearGradient linearGradient;
        private Paint paint;
        private RectF rect;
        private SimpleTextView rightTab;
        private View searchBackground;
        private View slidingView;

        protected abstract void onTabSwitch(int i);

        public SwitchView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ShareAlert.this.getThemedColor(Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            View view2 = new View(context) { // from class: org.telegram.ui.Components.ShareAlert.SwitchView.1
                @Override // android.view.View
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    invalidate();
                }

                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                    int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                    if (offsetColor != SwitchView.this.lastColor) {
                        SwitchView.this.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                        SwitchView.this.paint.setShader(SwitchView.this.linearGradient);
                    }
                    SwitchView.this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(SwitchView.this.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), SwitchView.this.paint);
                }
            };
            this.slidingView = view2;
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(ShareAlert.this.getThemedColor(i));
            this.leftTab.setTextSize(13);
            this.leftTab.setLeftDrawable(R.drawable.msg_tabs_mic1);
            this.leftTab.setText(LocaleController.getString(R.string.VoipGroupInviteCanSpeak));
            this.leftTab.setGravity(17);
            addView(this.leftTab, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            this.leftTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$SwitchView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShareAlert.SwitchView.this.switchToTab(0);
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(ShareAlert.this.getThemedColor(i));
            this.rightTab.setTextSize(13);
            this.rightTab.setLeftDrawable(R.drawable.msg_tabs_mic2);
            this.rightTab.setText(LocaleController.getString(R.string.VoipGroupInviteListenOnly));
            this.rightTab.setGravity(17);
            addView(this.rightTab, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            this.rightTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$SwitchView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShareAlert.SwitchView.this.switchToTab(1);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void switchToTab(int i) {
            if (this.currentTab == i) {
                return;
            }
            this.currentTab = i;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.slidingView, (Property<View, Float>) View.TRANSLATION_X, this.currentTab == 0 ? 0.0f : r2.getMeasuredWidth()));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ShareAlert.SwitchView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SwitchView.this.animator = null;
                }
            });
            this.animator.start();
            onTabSwitch(this.currentTab);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            ((FrameLayout.LayoutParams) this.slidingView.getLayoutParams()).width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.slidingView.setTranslationX(this.currentTab == 0 ? 0.0f : r1.width);
            super.onMeasure(i, i2);
        }
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2, boolean z2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = new ArrayList();
            arrayList.add(messageObject);
        } else {
            arrayList = null;
        }
        return new ShareAlert(context, null, arrayList, str, null, z, str2, null, z2, false);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
        this(context, arrayList, str, z, str2, z2, null);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, resourcesProvider);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, false, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x08e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShareAlert(final Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        LinearLayout linearLayout;
        int i;
        this.sendingText = new String[2];
        this.shadow = new View[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.selectedDialogs = new LongSparseArray();
        this.selectedDialogTopics = new HashMap();
        this.containerViewTop = -1;
        this.fullyShown = false;
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.linkToCopy = new String[2];
        this.recentSearchObjects = new ArrayList();
        this.recentSearchObjectsById = new LongSparseArray();
        this.systemInsets = Insets.NONE;
        this.shiftDp = 4;
        this.showSendersName = true;
        this.lastOffset = ConnectionsManager.DEFAULT_DATACENTER_ID;
        ArrayList arrayList2 = new ArrayList();
        this.iBlur3Positions = arrayList2;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        int i2 = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.setColor(getThemedColor(i2));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() { // from class: org.telegram.ui.Components.ShareAlert.1
                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() { // from class: org.telegram.ui.Components.ShareAlert.2
                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override // org.telegram.ui.Components.blur3.RenderNodeWithHash.Renderer
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3FactoryFade = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.resourcesProvider = resourcesProvider;
        this.includeStory = z4;
        this.parentActivity = AndroidUtilities.findActivity(context);
        this.darkTheme = z3;
        if (z3) {
            this.resourcesProvider = new DarkThemeResourceProvider() { // from class: org.telegram.ui.Components.ShareAlert.3
                @Override // org.telegram.ui.Stories.DarkThemeResourceProvider
                public void appendColors() {
                    SparseIntArray sparseIntArray = this.sparseIntArray;
                    int i3 = Theme.key_windowBackgroundGray;
                    int i4 = Theme.key_dialogBackground;
                    sparseIntArray.put(i3, getColor(i4));
                    this.sparseIntArray.put(Theme.key_divider, -15264235);
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, Theme.multAlpha(-1, 0.45f));
                    this.sparseIntArray.put(Theme.key_dialogBackgroundGray, 352321535);
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, getColor(i4));
                }
            };
        }
        blurredBackgroundSourceColor.setColor(getThemedColor(i2));
        this.parentFragment = chatActivity;
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i3 = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i3;
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z2;
        String[] strArr = this.linkToCopy;
        strArr[0] = str3;
        strArr[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                this.linkToCopy[0] = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername + "/" + messageObject.getId();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr2 = this.linkToCopy;
                    sb.append(strArr2[0]);
                    sb.append("?single");
                    strArr2[0] = sb.toString();
                }
            }
        }
        this.sendingMessageObjects = arrayList;
        this.searchAdapter = new ShareSearchAdapter(context);
        this.isChannel = z;
        String[] strArr3 = this.sendingText;
        strArr3[0] = str;
        strArr3[1] = str2;
        this.useSmoothKeyboard = true;
        super.setDelegate(new BottomSheet.BottomSheetDelegate() { // from class: org.telegram.ui.Components.ShareAlert.4
            @Override // org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegate, org.telegram.ui.ActionBar.BottomSheet.BottomSheetDelegateInterface
            public void onOpenAnimationEnd() {
                ShareAlert.this.fullyShown = true;
            }
        });
        ArrayList arrayList3 = this.sendingMessageObjects;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                MessageObject messageObject2 = (MessageObject) this.sendingMessageObjects.get(i4);
                if (messageObject2.isTodo()) {
                    this.hasPoll = 3;
                } else if (messageObject2.isPoll()) {
                    int i5 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.hasPoll = i5;
                    if (i5 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            this.loadingLink = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new RequestDelegate() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ShareAlert.$r8$lambda$RULzyCWd2fKBeF5-C4-3IOjnhE8(ShareAlert.this, context, tLObject, tL_error);
                }
            });
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) { // from class: org.telegram.ui.Components.ShareAlert.5
            private int fromOffsetTop;
            private int fromScrollY;
            private boolean fullHeight;
            private boolean lightStatusBar;
            private final AnimatedFloat pinnedToTop;
            private int previousTopOffset;
            private int toOffsetTop;
            private int toScrollY;
            private int topOffset;
            private boolean ignoreLayout = false;
            private RectF rect1 = new RectF();

            {
                this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) { // from class: org.telegram.ui.Components.ShareAlert.5.1
                    @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                    protected void onTransitionStart(boolean z5, int i6) {
                        super.onTransitionStart(z5, i6);
                        if (ShareAlert.this.previousScrollOffsetY == ShareAlert.this.scrollOffsetY) {
                            5.this.fromScrollY = -1;
                        } else {
                            5 r5 = 5.this;
                            r5.fromScrollY = ShareAlert.this.previousScrollOffsetY;
                            5 r52 = 5.this;
                            r52.toScrollY = ShareAlert.this.scrollOffsetY;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            5 r53 = 5.this;
                            ShareAlert.this.scrollOffsetY = r53.fromScrollY;
                        }
                        if (5.this.topOffset != 5.this.previousTopOffset) {
                            5.this.fromOffsetTop = 0;
                            5.this.toOffsetTop = 0;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            if (!z5) {
                                5 r54 = 5.this;
                                5.access$2220(r54, r54.topOffset - 5.this.previousTopOffset);
                            } else {
                                5 r55 = 5.this;
                                5.access$2212(r55, r55.topOffset - 5.this.previousTopOffset);
                            }
                            5 r56 = 5.this;
                            ShareAlert.this.scrollOffsetY = z5 ? r56.fromScrollY : r56.toScrollY;
                        } else {
                            5.this.fromOffsetTop = -1;
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        invalidate();
                    }

                    @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                    protected void onTransitionEnd() {
                        super.onTransitionEnd();
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.keyboardT = ((shareAlert.commentTextView == null || !ShareAlert.this.commentTextView.isPopupVisible()) && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f)) ? 0.0f : 1.0f;
                        ShareAlert.this.panTranslationMoveLayout = false;
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        ShareAlert.this.gridView.setTopGlowOffset(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.gridView.setTranslationY(0.0f);
                        ShareAlert.this.searchGridView.setTranslationY(0.0f);
                        ShareAlert.this.updateBottomOverlay();
                    }

                    @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                    protected void onPanTranslationUpdate(float f, float f2, boolean z5) {
                        ShareAlert.this.keyboardT = f2;
                        super.onPanTranslationUpdate(f, f2, z5);
                        for (int i6 = 0; i6 < ((BottomSheet) ShareAlert.this).containerView.getChildCount(); i6++) {
                            View childAt = ((BottomSheet) ShareAlert.this).containerView.getChildAt(i6);
                            if (childAt != ShareAlert.this.pickerBottom && childAt != ShareAlert.this.bulletinContainer && childAt != ShareAlert.this.shadow[1] && childAt != ShareAlert.this.sharesCountLayout && childAt != ShareAlert.this.frameLayout2) {
                                ShareAlert shareAlert = ShareAlert.this;
                                if (childAt != shareAlert.timestampFrameLayout && childAt != shareAlert.writeButtonContainer) {
                                    childAt.setTranslationY(f);
                                }
                            }
                        }
                        ShareAlert.this.currentPanTranslationY = f;
                        if (5.this.fromScrollY != -1) {
                            if (!z5) {
                                f2 = 1.0f - f2;
                            }
                            float f3 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((r5.fromScrollY * f3) + (5.this.toScrollY * f2));
                            float f4 = ShareAlert.this.currentPanTranslationY + ((5.this.fromScrollY - 5.this.toScrollY) * f3);
                            ShareAlert.this.gridView.setTranslationY(f4);
                            if (z5) {
                                ShareAlert.this.searchGridView.setTranslationY(f4);
                            } else {
                                ShareAlert.this.searchGridView.setTranslationY(f4 + ShareAlert.this.gridView.getPaddingTop());
                            }
                        } else if (5.this.fromOffsetTop != -1) {
                            float f5 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((r5.fromOffsetTop * f5) + (5.this.toOffsetTop * f2));
                            if (!z5) {
                                f5 = f2;
                            }
                            if (z5) {
                                ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY - ((5.this.fromOffsetTop - 5.this.toOffsetTop) * f2));
                            } else {
                                ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY + ((5.this.toOffsetTop - 5.this.fromOffsetTop) * f5));
                            }
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.frameLayout2.invalidate();
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.setCurrentPanTranslationY(shareAlert2.currentPanTranslationY);
                        ShareAlert.this.updateBottomOverlay();
                        invalidate();
                    }

                    @Override // org.telegram.ui.ActionBar.AdjustPanLayoutHelper
                    protected boolean heightAnimationEnabled() {
                        if (ShareAlert.this.isDismissed() || !ShareAlert.this.fullyShown) {
                            return false;
                        }
                        return !ShareAlert.this.commentTextView.isPopupVisible();
                    }
                };
                this.lightStatusBar = AndroidUtilities.computePerceivedBrightness(ShareAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                this.pinnedToTop = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            static /* synthetic */ int access$2212(5 r1, int i6) {
                int i7 = r1.toOffsetTop + i6;
                r1.toOffsetTop = i7;
                return i7;
            }

            static /* synthetic */ int access$2220(5 r1, int i6) {
                int i7 = r1.toOffsetTop - i6;
                r1.toOffsetTop = i7;
                return i7;
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            protected void drawList(Canvas canvas, boolean z5, ArrayList arrayList4) {
                if (ShareAlert.this.gridView.getVisibility() == 0 && ShareAlert.this.gridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.gridView.getX(), ShareAlert.this.gridView.getY());
                    ShareAlert.this.gridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.topicsGridView.getVisibility() == 0 && ShareAlert.this.topicsGridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.topicsGridView.getX(), ShareAlert.this.topicsGridView.getY());
                    ShareAlert.this.topicsGridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.searchGridView.getVisibility() != 0 || ShareAlert.this.searchGridView.getAlpha() < 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(ShareAlert.this.searchGridView.getX(), ShareAlert.this.searchGridView.getY());
                ShareAlert.this.searchGridView.draw(canvas);
                canvas.restore();
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
            protected Theme.ResourcesProvider getResourceProvider() {
                return ((BottomSheet) ShareAlert.this).resourcesProvider;
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.setResizableView(this);
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                int size2;
                int dp;
                if (getLayoutParams().height > 0) {
                    size2 = getLayoutParams().height;
                } else {
                    size2 = View.MeasureSpec.getSize(i7);
                }
                ShareAlert.this.layoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                ShareAlert.this.searchLayoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                if (!((BottomSheet) ShareAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) ShareAlert.this).backgroundPaddingLeft, ShareAlert.this.systemInsets.top, ((BottomSheet) ShareAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size2 - getPaddingTop();
                int dp2 = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil(Math.max(ShareAlert.this.searchAdapter.getItemCount(), ShareAlert.this.listAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (ShareAlert.this.topicsGridView.getVisibility() != 8 && (dp = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil((ShareAlert.this.shareTopicsAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop) > dp2) {
                    dp2 = AndroidUtilities.lerp(dp2, dp, ShareAlert.this.topicsGridView.getAlpha());
                }
                int i8 = dp2 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
                int dp3 = AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout != null ? 48 : 0) + 100) + ShareAlert.this.systemInsets.bottom;
                if (ShareAlert.this.gridView.getPaddingTop() != i8 || ShareAlert.this.gridView.getPaddingBottom() != dp3) {
                    this.ignoreLayout = true;
                    ShareAlert.this.gridView.setPadding(0, i8, 0, dp3);
                    ShareAlert.this.topicsGridView.setPadding(0, i8, 0, dp3);
                    this.ignoreLayout = false;
                }
                if (((BottomSheet) ShareAlert.this).keyboardVisible && getLayoutParams().height <= 0 && ShareAlert.this.searchGridView.getPaddingTop() != i8) {
                    this.ignoreLayout = true;
                    ShareAlert.this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout == null ? 0 : 48) + 60) + ShareAlert.this.systemInsets.bottom);
                    this.ignoreLayout = false;
                }
                boolean z5 = dp2 >= size2;
                this.fullHeight = z5;
                this.topOffset = z5 ? 0 : size2 - dp2;
                this.ignoreLayout = true;
                ShareAlert.this.checkCurrentList(false);
                this.ignoreLayout = false;
                setMeasuredDimension(View.MeasureSpec.getSize(i6), size2);
                onMeasureInternal(i6, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }

            private void onMeasureInternal(int i6, int i7) {
                int i8;
                int size2 = View.MeasureSpec.getSize(i6);
                int size3 = View.MeasureSpec.getSize(i7);
                int i9 = size2 - (((BottomSheet) ShareAlert.this).backgroundPaddingLeft * 2);
                ShareAlert.this.keyboardSize2 = measureKeyboardHeight();
                int i10 = 0;
                if (!ShareAlert.this.commentTextView.isWaitingForKeyboardOpen() && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f) && !ShareAlert.this.commentTextView.isPopupShowing() && !ShareAlert.this.commentTextView.isAnimatePopupClosing()) {
                    this.ignoreLayout = true;
                    ShareAlert.this.commentTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                this.ignoreLayout = true;
                if (ShareAlert.this.keyboardSize2 > AndroidUtilities.dp(20.0f)) {
                    if (!ShareAlert.this.commentTextView.isPopupVisible()) {
                        ShareAlert.this.commentTextView.hideEmojiView();
                    }
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(8);
                    }
                } else {
                    if (!AndroidUtilities.isInMultiwindow) {
                        size3 -= ((BottomSheet) ShareAlert.this).keyboardVisible ? 0 : ShareAlert.this.commentTextView.getEmojiPadding();
                        i7 = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
                    }
                    int i11 = ShareAlert.this.commentTextView.isPopupShowing() ? 8 : 0;
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(i11);
                    }
                }
                int i12 = i7;
                this.ignoreLayout = false;
                int childCount = getChildCount();
                while (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), (size3 - ShareAlert.this.systemInsets.top) + getPaddingTop()), TLObject.FLAG_30));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size3 - ShareAlert.this.systemInsets.top) + getPaddingTop(), TLObject.FLAG_30));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            }
                        } else {
                            i8 = i6;
                            measureChildWithMargins(childAt, i8, 0, i12, 0);
                            i10++;
                            i6 = i8;
                        }
                    }
                    i8 = i6;
                    i10++;
                    i6 = i8;
                }
                ShareAlert.this.updateBottomOverlay();
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int measureKeyboardHeight = measureKeyboardHeight();
                int max = (((BottomSheet) ShareAlert.this).keyboardVisible || measureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(ShareAlert.this.systemInsets.bottom, ShareAlert.this.commentTextView.getEmojiPadding());
                setBottomClip(max);
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i17 = layoutParams.gravity;
                        if (i17 == -1) {
                            i17 = 51;
                        }
                        int i18 = i17 & 112;
                        int i19 = i17 & 7;
                        if (i19 == 1) {
                            i10 = (((i8 - i6) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i11 = layoutParams.rightMargin;
                        } else if (i19 == 5) {
                            i10 = (((i8 - i6) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                            i11 = ((BottomSheet) ShareAlert.this).backgroundPaddingLeft;
                        } else {
                            i12 = layoutParams.leftMargin + getPaddingLeft();
                            if (i18 == 16) {
                                if (i18 == 48) {
                                    i15 = layoutParams.topMargin + getPaddingTop() + this.topOffset;
                                } else if (i18 == 80) {
                                    i13 = ((i9 - max) - i7) - measuredHeight3;
                                    i14 = layoutParams.bottomMargin;
                                } else {
                                    i15 = layoutParams.topMargin;
                                }
                                if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                                    if (!AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + measureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    i15 = measuredHeight - measuredHeight2;
                                }
                                if (childAt == ShareAlert.this.bottomFadeView) {
                                    i15 += ShareAlert.this.systemInsets.bottom;
                                }
                                childAt.layout(i12, i15, measuredWidth + i12, measuredHeight3 + i15);
                            } else {
                                i13 = ((((i9 - max) - (this.topOffset + i7)) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i14 = layoutParams.bottomMargin;
                            }
                            i15 = i13 - i14;
                            if (ShareAlert.this.commentTextView != null) {
                                if (!AndroidUtilities.isTablet()) {
                                }
                                i15 = measuredHeight - measuredHeight2;
                            }
                            if (childAt == ShareAlert.this.bottomFadeView) {
                            }
                            childAt.layout(i12, i15, measuredWidth + i12, measuredHeight3 + i15);
                        }
                        i12 = i10 - i11;
                        if (i18 == 16) {
                        }
                        i15 = i13 - i14;
                        if (ShareAlert.this.commentTextView != null) {
                        }
                        if (childAt == ShareAlert.this.bottomFadeView) {
                        }
                        childAt.layout(i12, i15, measuredWidth + i12, measuredHeight3 + i15);
                    }
                }
                notifyHeightChanged();
                ShareAlert.this.updateBottomOverlay();
                ShareAlert.this.updateLayout();
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!this.fullHeight) {
                    if (motionEvent.getAction() == 0 && motionEvent.getY() < this.topOffset - AndroidUtilities.dp(30.0f)) {
                        ShareAlert.this.dismiss();
                        return true;
                    }
                } else if (motionEvent.getAction() == 0 && ShareAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ShareAlert.this.scrollOffsetY - AndroidUtilities.dp(30.0f)) {
                    ShareAlert.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override // android.view.View, android.view.ViewParent
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                float f;
                canvas.save();
                canvas.translate(0.0f, ShareAlert.this.currentPanTranslationY);
                int dp = (ShareAlert.this.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) + AndroidUtilities.dp(6.0f) + this.topOffset;
                ShareAlert shareAlert = ShareAlert.this;
                int i6 = shareAlert.containerViewTop = ((shareAlert.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.topOffset;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(60.0f) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (((BottomSheet) ShareAlert.this).isFullscreen) {
                    f = 0.0f;
                } else {
                    dp += ShareAlert.this.systemInsets.top;
                    boolean z5 = this.fullHeight && ((BottomSheet) ShareAlert.this).backgroundPaddingTop + i6 < ShareAlert.this.systemInsets.top;
                    int i7 = i6 + ShareAlert.this.systemInsets.top;
                    int i8 = -((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                    f = this.pinnedToTop.set(z5);
                    i6 = AndroidUtilities.lerp(i7, i8, f);
                }
                ShareAlert.this.shadowDrawable.setBounds(0, i6, getMeasuredWidth(), measuredHeight);
                ShareAlert.this.shadowDrawable.draw(canvas);
                ShareAlert shareAlert2 = ShareAlert.this;
                if (shareAlert2.bulletinContainer2 != null) {
                    if (i6 <= shareAlert2.systemInsets.top && ShareAlert.this.bulletinContainer2.getChildCount() > 0) {
                        ShareAlert.this.bulletinContainer2.setTranslationY(0.0f);
                        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                        if (visibleBulletin != null) {
                            if (visibleBulletin.getLayout() != null) {
                                visibleBulletin.getLayout().setTop(true);
                            }
                            visibleBulletin.hide();
                        }
                    } else {
                        ShareAlert.this.bulletinContainer2.setTranslationY(Math.max(0, ((i6 + ((BottomSheet) r1).backgroundPaddingTop) - ShareAlert.this.bulletinContainer2.getTop()) - ShareAlert.this.bulletinContainer2.getMeasuredHeight()));
                    }
                }
                if (f < 1.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    this.rect1.set((getMeasuredWidth() - dp2) / 2, dp, (getMeasuredWidth() + dp2) / 2, dp + AndroidUtilities.dp(4.0f));
                    Theme.dialogs_onlineCirclePaint.setColor(ShareAlert.this.getThemedColor(Theme.key_sheet_scrollUp));
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (r0.getAlpha() * (1.0f - f)));
                    canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility = getSystemUiVisibility();
                    boolean z6 = this.lightStatusBar && ((float) 0) > ((float) ShareAlert.this.systemInsets.top) * 0.5f;
                    if (z6 != ((systemUiVisibility & 8192) > 0)) {
                        setSystemUiVisibility(z6 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                    }
                }
                canvas.restore();
                this.previousTopOffset = this.topOffset;
            }

            @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && ShareAlert.this.scrollableViewNoiseSuppressor != null) {
                    ShareAlert.this.blur3_InvalidateBlur();
                    if (ShareAlert.this.iBlur3SourceGlassFrosted != null) {
                        ShareAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlassFrosted.updateDisplayListIfNeeded();
                    }
                    if (ShareAlert.this.iBlur3SourceGlass != null) {
                        ShareAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlass.updateDisplayListIfNeeded();
                    }
                }
                canvas.save();
                canvas.clipRect(0.0f, getPaddingTop() + ShareAlert.this.currentPanTranslationY, getMeasuredWidth(), getMeasuredHeight() + ShareAlert.this.currentPanTranslationY + AndroidUtilities.dp(50.0f));
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if ((view instanceof EmojiView) && ShareAlert.this.emojiViewChildBg != null) {
                    canvas.save();
                    ShareAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                    canvas.clipPath(ShareAlert.this.emojiViewChildBg.getPath());
                    ShareAlert.this.emojiViewChildBg.draw(canvas);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFade.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.containerView.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i6, 0, i6, this.systemInsets.bottom);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        int i7 = Theme.key_dialogBackground;
        frameLayout.setBackgroundColor(getThemedColor(i7));
        if (this.darkTheme && this.linkToCopy[1] != null) {
            SwitchView switchView = new SwitchView(context) { // from class: org.telegram.ui.Components.ShareAlert.6
                @Override // org.telegram.ui.Components.ShareAlert.SwitchView
                protected void onTabSwitch(int i8) {
                    ShareAlert.this.updateLinkTextView();
                }
            };
            this.switchView = switchView;
            this.frameLayout.addView(switchView, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        fragmentSearchField.editText.addTextChangedListener(new TextWatcher() { // from class: org.telegram.ui.Components.ShareAlert.7
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(ShareAlert.this.searchView.editText.getText())) {
                    ShareAlert.this.checkCurrentList(false);
                }
                if (ShareAlert.this.updateSearchAdapter) {
                    String obj = ShareAlert.this.searchView.editText.getText().toString();
                    if (obj.length() != 0) {
                        if (ShareAlert.this.searchEmptyView != null) {
                            ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        }
                    } else if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.listAdapter) {
                        int currentTop = ShareAlert.this.getCurrentTop();
                        ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        ShareAlert.this.searchEmptyView.showProgress(false, true);
                        ShareAlert.this.checkCurrentList(false);
                        ShareAlert.this.listAdapter.notifyDataSetChanged();
                        if (currentTop > 0) {
                            ShareAlert.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                        }
                    }
                    if (ShareAlert.this.searchAdapter != null) {
                        ShareAlert.this.searchAdapter.searchDialogs(obj);
                    }
                }
            }
        });
        this.searchView.editText.setHint(LocaleController.getString(R.string.ShareSendTo));
        this.searchView.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda13
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return ShareAlert.$r8$lambda$6psQtn38yqc0ja4cbkfiOK3dSik(ShareAlert.this, textView, i8, keyEvent);
            }
        });
        this.searchView.setCloseButtonOnClickListener(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                ShareAlert.$r8$lambda$O2yH0haBtpzxOMJ85TtMKC2r24Q(ShareAlert.this);
            }
        });
        this.frameLayout.addView(this.searchView, LayoutHelper.createFrame(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        ActionBar actionBar = new ActionBar(context);
        this.topicsBackActionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.topicsBackActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.topicsBackActionBar;
        int i8 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(getThemedColor(i8));
        this.topicsBackActionBar.setSubtitleColor(getThemedColor(Theme.key_dialogTextGray2));
        this.topicsBackActionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), false);
        this.topicsBackActionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
        this.topicsBackActionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.Components.ShareAlert.8
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i9) {
                ShareAlert.this.onBackPressed();
            }
        });
        this.topicsBackActionBar.setVisibility(8);
        this.frameLayout.addView(this.topicsBackActionBar, LayoutHelper.createFrame(-1, 58, 83));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider);
        this.topicsGridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        this.topicsLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.topicsLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.Components.ShareAlert.9
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i9) {
                if (i9 == 0) {
                    return ShareAlert.this.topicsLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.topicsGridView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.ShareAlert.10
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                if (i10 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        RecyclerListView recyclerListView2 = this.topicsGridView;
        ShareTopicsAdapter shareTopicsAdapter = new ShareTopicsAdapter(context);
        this.shareTopicsAdapter = shareTopicsAdapter;
        recyclerListView2.setAdapter(shareTopicsAdapter);
        RecyclerListView recyclerListView3 = this.topicsGridView;
        int i9 = Theme.key_dialogScrollGlow;
        recyclerListView3.setGlowColor(getThemedColor(i9));
        this.topicsGridView.setVerticalScrollBarEnabled(false);
        this.topicsGridView.setHorizontalScrollBarEnabled(false);
        this.topicsGridView.setOverScrollMode(2);
        this.topicsGridView.setSelectorDrawableColor(0);
        this.topicsGridView.setItemSelectorColorProvider(new GenericProvider() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda15
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                return ShareAlert.$r8$lambda$ecX7uqh2NAahRSKkgn7yzUDSRcY((Integer) obj);
            }
        });
        this.topicsGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.topicsGridView.setClipToPadding(false);
        this.topicsGridView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.ShareAlert.11
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                } else {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                }
            }
        });
        this.topicsGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda16
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i10) {
                ShareAlert.$r8$lambda$ZOGEhZqp47NkJpRfaBR3ylvcyQM(ShareAlert.this, view, i10);
            }
        });
        this.topicsGridView.setVisibility(8);
        this.containerView.addView(this.topicsGridView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView4 = new RecyclerListView(context, this.resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.12
            @Override // org.telegram.ui.Components.RecyclerListView
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.gridView = recyclerListView4;
        recyclerListView4.setSelectorDrawableColor(0);
        this.gridView.setItemSelectorColorProvider(new GenericProvider() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda17
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                return ShareAlert.$r8$lambda$1PcynxTGhKcpqzn9H9A8Iu69dXA((Integer) obj);
            }
        });
        this.gridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.gridView.setClipToPadding(false);
        RecyclerListView recyclerListView5 = this.gridView;
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 4);
        this.layoutManager = gridLayoutManager2;
        recyclerListView5.setLayoutManager(gridLayoutManager2);
        RecyclerListView recyclerListView6 = this.gridView;
        ViewGroup viewGroup2 = this.containerView;
        Objects.requireNonNull(recyclerListView6);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView6, viewGroup2, new EmojiView$$ExternalSyntheticLambda15(recyclerListView6));
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.Components.ShareAlert.13
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i10) {
                if (i10 == 0) {
                    return ShareAlert.this.layoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setOverScrollMode(2);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.ShareAlert.14
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                } else {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                }
            }
        });
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView7 = this.gridView;
        ShareDialogsAdapter shareDialogsAdapter = new ShareDialogsAdapter(context);
        this.listAdapter = shareDialogsAdapter;
        recyclerListView7.setAdapter(shareDialogsAdapter);
        this.gridView.setGlowColor(getThemedColor(i9));
        this.gridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda18
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i10) {
                ShareAlert.$r8$lambda$2yfJKqnhklW5mQrM1DngP5MHPY4(ShareAlert.this, view, i10);
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.ShareAlert.15
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                if (i11 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().getLayout() != null && (Bulletin.getVisibleBulletin().getLayout().getParent() instanceof View) && ((View) Bulletin.getVisibleBulletin().getLayout().getParent()).getParent() == ShareAlert.this.bulletinContainer2) {
                    Bulletin.hideVisible();
                }
                if (Build.VERSION.SDK_INT < 31 || ShareAlert.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                ShareAlert.this.scrollableViewNoiseSuppressor.onScrolled(i10, i11);
                ShareAlert.this.blur3_InvalidateBlur();
            }
        });
        RecyclerListView recyclerListView8 = new RecyclerListView(context, this.resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.16
            @Override // org.telegram.ui.Components.RecyclerListView
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.searchGridView = recyclerListView8;
        recyclerListView8.setItemSelectorColorProvider(new GenericProvider() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda19
            @Override // org.telegram.messenger.GenericProvider
            public final Object provide(Object obj) {
                return ShareAlert.$r8$lambda$qkwDv7PSB2Nua20LSuVOwcrHWOU((Integer) obj);
            }
        });
        this.searchGridView.setSelectorDrawableColor(0);
        this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.searchGridView.setClipToPadding(false);
        RecyclerListView recyclerListView9 = this.searchGridView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), 4, 0, this.searchGridView);
        this.searchLayoutManager = fillLastGridLayoutManager;
        recyclerListView9.setLayoutManager(fillLastGridLayoutManager);
        this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: org.telegram.ui.Components.ShareAlert.17
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i10) {
                return ShareAlert.this.searchAdapter.getSpanSize(4, i10);
            }
        });
        this.searchGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda20
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i10) {
                ShareAlert.$r8$lambda$Dcwj_BA7YuJb6yzmAzXXXc2ln-w(ShareAlert.this, view, i10);
            }
        });
        this.searchGridView.setHasFixedSize(true);
        this.searchGridView.setItemAnimator(null);
        this.searchGridView.setHorizontalScrollBarEnabled(false);
        this.searchGridView.setVerticalScrollBarEnabled(false);
        this.searchGridView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.ShareAlert.18
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                if (i11 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        this.searchGridView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Components.ShareAlert.19
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    if (holder.getItemViewType() != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    } else {
                        int adapterPosition = holder.getAdapterPosition() % 4;
                        rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                        return;
                    }
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
            }
        });
        this.searchGridView.setAdapter(this.searchAdapter);
        this.searchGridView.setGlowColor(getThemedColor(i9));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.searchGridView, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, this.resourcesProvider);
        flickerLoadingView.setViewType(12);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1, this.resourcesProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.searchEmptyView.setAnimateLayoutChange(true);
        this.searchEmptyView.showProgress(false, false);
        if (this.darkTheme) {
            this.searchEmptyView.title.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
        }
        this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.searchGridView.setEmptyView(this.searchEmptyView);
        this.searchGridView.setHideIfEmpty(false);
        this.searchGridView.setAnimateEmptyView(true, 0);
        this.containerView.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(this.searchGridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context) { // from class: org.telegram.ui.Components.ShareAlert.20
            @Override // android.view.View
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ShareAlert.this.fadeDrawable.setBounds(0, (getMeasuredHeight() - ShareAlert.this.systemInsets.bottom) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ShareAlert.this.fadeDrawable.draw(canvas);
            }
        };
        this.bottomFadeView = view;
        this.containerView.addView(view, LayoutHelper.createFrame(-1, NotificationCenter.dialogsUnreadPollVotesCounterChanged, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.darkTheme || this.linkToCopy[1] == null) ? 58.0f : 111.0f);
        this.shadow[0] = new View(context);
        View view2 = this.shadow[0];
        int i10 = Theme.key_dialogShadowLine;
        view2.setBackgroundColor(getThemedColor(i10));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        this.containerView.addView(this.frameLayout, LayoutHelper.createFrame(-1, (!this.darkTheme || this.linkToCopy[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i10));
        this.shadow[1].setLayoutParams(layoutParams2);
        if (this.isChannel || this.linkToCopy[0] != null) {
            if (this.darkTheme) {
                this.pickerBottom = new FrameLayout(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout2;
                this.pickerBottom.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                this.pickerBottomLayout.addView(linearLayout2, LayoutHelper.createFrame(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.linkContainer = linearLayout3;
                linearLayout3.setOrientation(0);
                ScaleStateListAnimator.apply(this.linkContainer, 0.015f, 1.2f);
                this.linkContainer.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ShareAlert.$r8$lambda$LxttCDT1_OV5SgcamMYMGjr0ROA(ShareAlert.this, view3);
                    }
                });
                SimpleTextView simpleTextView = new SimpleTextView(context);
                this.linkTextView = simpleTextView;
                simpleTextView.setTextSize(15);
                this.linkTextView.setTextColor(getThemedColor(Theme.key_share_linkText));
                this.linkTextView.setEllipsizeByGradient(true);
                updateLinkTextView();
                this.linkContainer.addView(this.linkTextView, LayoutHelper.createLinear(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                this.linkCopyButton = textView;
                textView.setTextSize(1, 14.0f);
                this.linkCopyButton.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.linkCopyButton.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                this.linkCopyButton.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                this.linkCopyButton.setTypeface(AndroidUtilities.bold());
                this.linkCopyButton.setGravity(17);
                TextView textView2 = this.linkCopyButton;
                int i11 = Theme.key_listSelector;
                textView2.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i11), 4, 4));
                this.linkContainer.addView(this.linkCopyButton, LayoutHelper.createLinear(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                this.linkCopyButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ShareAlert.$r8$lambda$as_bWnnP3rv08oThGgAnVo9Js3k(ShareAlert.this, view3);
                    }
                });
                ScaleStateListAnimator.apply(this.linkCopyButton);
                this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 83));
                ArrayList arrayList4 = this.sendingMessageObjects;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner != null && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject3 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) && !messageObject3.isForwarded()) {
                        linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                ShareAlert.$r8$lambda$nWJZ8gvozx1KIcw9vJ6X9l6UVw4(ShareAlert.this, messageObject3, view3);
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i11), 6, 6));
                        ScaleStateListAnimator.apply(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i12 = Theme.key_share_icon;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
                        TextView textView3 = new TextView(context);
                        textView3.setTextColor(getThemedColor(i12));
                        textView3.setTextSize(1, 15.0f);
                        textView3.setGravity(17);
                        textView3.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i = 8;
                        linearLayout2.addView(this.linkContainer, LayoutHelper.createLinear(-1, 42, 1.0f, 23, 11, 0, i, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i = 11;
                linearLayout2.addView(this.linkContainer, LayoutHelper.createLinear(-1, 42, 1.0f, 23, 11, 0, i, 0));
                if (linearLayout != null) {
                }
            } else {
                this.pickerBottom = new FrameLayout(context);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout3;
                this.pickerBottom.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView4 = new TextView(context);
                int i13 = Theme.key_listSelector;
                textView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i13), 2, AndroidUtilities.dp(22.0f)));
                textView4.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                textView4.setTextSize(1, 14.0f);
                textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView4.setTypeface(AndroidUtilities.bold());
                textView4.setGravity(17);
                if (this.darkTheme && this.linkToCopy[1] != null) {
                    textView4.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView4.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ShareAlert.$r8$lambda$B9-kV7A2GUs-vS4lKeoQfg70Z2c(ShareAlert.this, view3);
                    }
                });
                this.pickerBottomLayout.addView(textView4, LayoutHelper.createFrame(-1, -1, 119));
                this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 87));
                ArrayList arrayList5 = this.sendingMessageObjects;
                if (arrayList5 != null && arrayList5.size() > 0 && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner != null && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.sharesCountLayout = linearLayout4;
                        linearLayout4.setOrientation(0);
                        this.sharesCountLayout.setGravity(16);
                        this.sharesCountLayout.setBackground(Theme.createSelectorDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : i13), 2, AndroidUtilities.dp(22.0f)));
                        this.pickerBottomLayout.addView(this.sharesCountLayout, LayoutHelper.createFrame(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        this.sharesCountLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                ShareAlert.$r8$lambda$IYxbsSQKcooVsktziueDlFj8_Ck(ShareAlert.this, messageObject4, view3);
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2), PorterDuff.Mode.MULTIPLY));
                        this.sharesCountLayout.addView(imageView2, LayoutHelper.createLinear(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView5 = new TextView(context);
                        textView5.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView5.setTextSize(1, 14.0f);
                        textView5.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                        textView5.setGravity(16);
                        textView5.setTypeface(AndroidUtilities.bold());
                        this.sharesCountLayout.addView(textView5, LayoutHelper.createLinear(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            this.shadow[1].setAlpha(0.0f);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.bulletinContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.pickerBottomLayout != null ? 48.0f : 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout5;
        this.containerView.addView(frameLayout5, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        21 r2 = new 21(context);
        this.frameLayout2 = r2;
        r2.setWillNotDraw(false);
        this.frameLayout2.setAlpha(0.0f);
        this.frameLayout2.setVisibility(4);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ShareAlert.$r8$lambda$fa9TxitH_bTtIw4ogWXMyiVk3as(view3, motionEvent);
            }
        });
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i7)) > 0.721f);
        22 r22 = new 22(context, this.sizeNotifierFrameLayout, null, 1, true, this.resourcesProvider);
        this.commentTextView = r22;
        r22.includeNavigationBar = true;
        if (this.darkTheme) {
            EditTextCaption editText = r22.getEditText();
            int i14 = Theme.key_voipgroup_nameText;
            editText.setTextColor(getThemedColor(i14));
            this.commentTextView.getEditText().setCursorColor(getThemedColor(i14));
        }
        this.commentTextView.setHint(LocaleController.getString(R.string.ShareComment));
        this.commentTextView.onResume();
        this.commentTextView.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2, 51));
        this.frameLayout2.setClipChildren(false);
        this.frameLayout2.setClipToPadding(false);
        this.commentTextView.setClipChildren(false);
        this.commentTextView.getEditText().addTextChangedListener(new 23());
        FrameLayout frameLayout6 = new FrameLayout(context) { // from class: org.telegram.ui.Components.ShareAlert.24
            @Override // android.view.View
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ShareAlert.this.selectedDialogs.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout6;
        frameLayout6.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(110, 50, 85));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, this.resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.25
            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isInScheduleMode() {
                return false;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isInactive() {
                return false;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean isOpen() {
                return true;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public boolean shouldDrawBackground() {
                return true;
            }

            @Override // org.telegram.ui.Components.ChatActivityEnterView.SendButton
            public int getFillColor() {
                return ShareAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
            }
        };
        this.writeButton = sendButton;
        sendButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        this.writeButtonContainer.addView(sendButton2, LayoutHelper.createFrameMatchParent());
        this.writeButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ShareAlert.this.sendInternal(true);
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda10
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                boolean onSendLongClick;
                onSendLongClick = r0.onSendLongClick(ShareAlert.this.writeButton);
                return onSendLongClick;
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.timestamp = num.intValue();
            this.timestampFrameLayout = new FrameLayout(context);
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.timestampLayout = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            this.timestampLayout.setClipToPadding(false);
            this.timestampLayout.setOrientation(0);
            this.timestampLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, this.resourcesProvider);
            this.timestampCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            this.timestampCheckbox.setDrawUnchecked(true);
            this.timestampCheckbox.setChecked(false, false);
            this.timestampCheckbox.setDrawBackgroundAsArc(10);
            this.timestampLayout.addView(this.timestampCheckbox, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView6 = new TextView(context);
            this.timestampTextView = textView6;
            textView6.setTextColor(getThemedColor(i8));
            this.timestampTextView.setTextSize(1, 14.0f);
            this.timestampTextView.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            this.timestampLayout.addView(this.timestampTextView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(this.timestampLayout, 0.025f, 1.5f);
            this.timestampLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShareAlert.$r8$lambda$a4V2Uih3sSl5ErnnX2PuvYULYjs(ShareAlert.this, view3);
                }
            });
            this.timestampFrameLayout.addView(this.timestampLayout, LayoutHelper.createFrame(-2, -2, 17));
            if (this.pickerBottom == null) {
                View view3 = new View(context);
                view3.setBackgroundColor(getThemedColor(Theme.key_divider));
                this.timestampFrameLayout.addView(view3, LayoutHelper.createFrame(-1.0f, this.darkTheme ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(this.timestampFrameLayout, LayoutHelper.createFrame(-1, 58, 83));
            if (this.pickerBottom == null) {
                this.timestampFrameLayout.setAlpha(0.0f);
                this.timestampFrameLayout.setVisibility(4);
            }
        }
        this.fadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3FactoryFade.create(this.bottomFadeView, (BlurredBackgroundColorProvider) null));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.fadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        BlurredBackgroundDrawable create = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.emojiViewChildBg = create;
        create.enableInAppKeyboardOptimization();
        this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.emojiViewChildBg.setThickness(AndroidUtilities.dp(32.0f));
        this.emojiViewChildBg.setIntensity(0.4f);
        BlurredBackgroundDrawable create2 = this.iBlur3FactoryLiquidGlass.create(this.frameLayout2, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.captionContainerBg = create2;
        create2.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(9.0f));
        this.frameLayout2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            BlurredBackgroundDrawable create3 = this.iBlur3FactoryLiquidGlass.create(frameLayout7, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            create3.setPadding(AndroidUtilities.dp(9.0f));
            create3.setRadius(AndroidUtilities.dp(22.0f));
            this.pickerBottomLayout.setBackground(create3);
            this.pickerBottomLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout8 = this.timestampFrameLayout;
        if (frameLayout8 != null) {
            BlurredBackgroundDrawable create4 = this.iBlur3FactoryLiquidGlass.create(frameLayout8, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            create4.setPadding(AndroidUtilities.dp(9.0f));
            create4.setRadius(AndroidUtilities.dp(22.0f));
            this.timestampFrameLayout.setBackground(create4);
            this.timestampFrameLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        updateSelectedCount(0);
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        if (this.listAdapter.dialogs.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        DialogsSearchAdapter.loadRecentSearch(this.currentAccount, 0, new DialogsSearchAdapter.OnRecentSearchLoaded() { // from class: org.telegram.ui.Components.ShareAlert.26
            @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.OnRecentSearchLoaded
            public void setRecentSearch(ArrayList arrayList6, LongSparseArray longSparseArray) {
                if (arrayList6 != null) {
                    int i15 = 0;
                    while (i15 < arrayList6.size()) {
                        TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) arrayList6.get(i15)).object;
                        if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                            arrayList6.remove(i15);
                            i15--;
                        }
                        i15++;
                    }
                }
                ShareAlert.this.recentSearchObjects = arrayList6;
                ShareAlert.this.recentSearchObjectsById = longSparseArray;
                for (int i16 = 0; i16 < ShareAlert.this.recentSearchObjects.size(); i16++) {
                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i16);
                    TLObject tLObject2 = recentSearchObject.object;
                    if (tLObject2 instanceof TLRPC.User) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
                    }
                }
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
        });
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false, 1.0f, false);
        ViewCompat.setOnApplyWindowInsetsListener(getContainer(), new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda12
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view4, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets;
                onApplyWindowInsets = ShareAlert.this.onApplyWindowInsets(view4, windowInsetsCompat);
                return onApplyWindowInsets;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$RULzyCWd2fKBeF5-C4-3IOjnhE8(final ShareAlert shareAlert, final Context context, final TLObject tLObject, TLRPC.TL_error tL_error) {
        shareAlert.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                ShareAlert.$r8$lambda$bmyCcpxlhi4PUq-hpdEmLs_u_es(ShareAlert.this, tLObject, context);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$bmyCcpxlhi4PUq-hpdEmLs_u_es(ShareAlert shareAlert, TLObject tLObject, Context context) {
        if (tLObject != null) {
            shareAlert.getClass();
            shareAlert.exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject;
            shareAlert.updateLinkTextView();
            if (shareAlert.copyLinkOnEnd) {
                shareAlert.copyLink(context);
            }
        }
        shareAlert.loadingLink = false;
    }

    public static /* synthetic */ boolean $r8$lambda$6psQtn38yqc0ja4cbkfiOK3dSik(ShareAlert shareAlert, TextView textView, int i, KeyEvent keyEvent) {
        shareAlert.getClass();
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(shareAlert.searchView.editText);
        return false;
    }

    public static /* synthetic */ void $r8$lambda$O2yH0haBtpzxOMJ85TtMKC2r24Q(ShareAlert shareAlert) {
        shareAlert.updateSearchAdapter = true;
        shareAlert.searchView.editText.setText("");
        AndroidUtilities.showKeyboard(shareAlert.searchView.editText);
    }

    public static /* synthetic */ Integer $r8$lambda$ecX7uqh2NAahRSKkgn7yzUDSRcY(Integer num) {
        return 0;
    }

    public static /* synthetic */ void $r8$lambda$ZOGEhZqp47NkJpRfaBR3ylvcyQM(ShareAlert shareAlert, View view, int i) {
        if (shareAlert.shareTopicsAdapter.isBotForum && i == 1) {
            shareAlert.onTopicCreateCellClick();
            return;
        }
        TLRPC.TL_forumTopic itemTopic = shareAlert.shareTopicsAdapter.getItemTopic(i);
        if (itemTopic != null) {
            shareAlert.onTopicCellClick(itemTopic);
        }
    }

    public static /* synthetic */ Integer $r8$lambda$1PcynxTGhKcpqzn9H9A8Iu69dXA(Integer num) {
        return 0;
    }

    public static /* synthetic */ void $r8$lambda$2yfJKqnhklW5mQrM1DngP5MHPY4(ShareAlert shareAlert, View view, int i) {
        if (i < 0) {
            shareAlert.getClass();
            return;
        }
        TLRPC.Dialog item = shareAlert.listAdapter.getItem(i);
        if (item == null) {
            return;
        }
        shareAlert.selectDialog(view, item);
    }

    public static /* synthetic */ Integer $r8$lambda$qkwDv7PSB2Nua20LSuVOwcrHWOU(Integer num) {
        return 0;
    }

    public static /* synthetic */ void $r8$lambda$Dcwj_BA7YuJb6yzmAzXXXc2ln-w(ShareAlert shareAlert, View view, int i) {
        if (i < 0) {
            shareAlert.getClass();
            return;
        }
        TLRPC.Dialog item = shareAlert.searchAdapter.getItem(i);
        if (item == null) {
            return;
        }
        shareAlert.selectDialog(view, item);
    }

    public static /* synthetic */ void $r8$lambda$LxttCDT1_OV5SgcamMYMGjr0ROA(ShareAlert shareAlert, View view) {
        if (shareAlert.selectedDialogs.size() == 0) {
            if (shareAlert.isChannel || shareAlert.linkToCopy[0] != null) {
                shareAlert.dismiss();
                PhotoViewer.getInstance().closePhoto(true, false);
                if (shareAlert.linkToCopy[0] == null && shareAlert.loadingLink) {
                    shareAlert.copyLinkOnEnd = true;
                    Toast.makeText(shareAlert.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    shareAlert.copyLink(shareAlert.getContext());
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$as_bWnnP3rv08oThGgAnVo9Js3k(ShareAlert shareAlert, View view) {
        if (shareAlert.selectedDialogs.size() == 0) {
            if (shareAlert.isChannel || shareAlert.linkToCopy[0] != null) {
                shareAlert.dismiss();
                if (shareAlert.linkToCopy[0] == null && shareAlert.loadingLink) {
                    shareAlert.copyLinkOnEnd = true;
                    Toast.makeText(shareAlert.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    shareAlert.copyLink(shareAlert.getContext());
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$nWJZ8gvozx1KIcw9vJ6X9l6UVw4(ShareAlert shareAlert, MessageObject messageObject, View view) {
        BaseFragment baseFragment = shareAlert.parentFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getSafeLastFragment();
        }
        if (baseFragment == null) {
            return;
        }
        shareAlert.dismiss();
        baseFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public static /* synthetic */ void $r8$lambda$B9-kV7A2GUs-vS4lKeoQfg70Z2c(ShareAlert shareAlert, View view) {
        if (shareAlert.selectedDialogs.size() == 0) {
            if (shareAlert.isChannel || shareAlert.linkToCopy[0] != null) {
                shareAlert.dismiss();
                if (shareAlert.linkToCopy[0] == null && shareAlert.loadingLink) {
                    shareAlert.copyLinkOnEnd = true;
                    Toast.makeText(shareAlert.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    shareAlert.copyLink(shareAlert.getContext());
                }
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$IYxbsSQKcooVsktziueDlFj8_Ck(ShareAlert shareAlert, MessageObject messageObject, View view) {
        BaseFragment baseFragment = shareAlert.parentFragment;
        if (baseFragment == null) {
            baseFragment = LaunchActivity.getSafeLastFragment();
        }
        if (baseFragment == null) {
            return;
        }
        shareAlert.dismiss();
        baseFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    class 21 extends FrameLayout {
        21(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }

        @Override // android.view.View
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            if (ShareAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ShareAlert.this.chatActivityEnterViewAnimateFromTop != ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.chatActivityEnterViewAnimateFromTop) {
                if (ShareAlert.this.topBackgroundAnimator != null) {
                    ShareAlert.this.topBackgroundAnimator.cancel();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.captionEditTextTopOffset = shareAlert.chatActivityEnterViewAnimateFromTop - (ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset);
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(shareAlert2.captionEditTextTopOffset, 0.0f);
                ShareAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ShareAlert$21$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ShareAlert.21.$r8$lambda$xaJhQ_cJNoTkaDGCAq-Z56_zdBo(ShareAlert.21.this, valueAnimator);
                    }
                });
                ShareAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ShareAlert.this.topBackgroundAnimator.setDuration(200L);
                ShareAlert.this.topBackgroundAnimator.start();
                ShareAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            ShareAlert.this.shadow[1].setTranslationY((-(ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ShareAlert.this.captionEditTextTopOffset + ShareAlert.this.currentPanTranslationY + ((ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f)) * (1.0f - getAlpha())));
        }

        public static /* synthetic */ void $r8$lambda$xaJhQ_cJNoTkaDGCAq-Z56_zdBo(21 r1, ValueAnimator valueAnimator) {
            ShareAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShareAlert.this.frameLayout2.invalidate();
            r1.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            ShareAlert.this.captionContainerBg.setBounds(0, (int) ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            ShareAlert.this.captionContainerBg.draw(canvas);
            canvas.save();
            canvas.clipRect(0.0f, ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    class 22 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        22(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void bottomPanelTranslationY(float f) {
            super.bottomPanelTranslationY(f);
            ShareAlert.this.updateBottomOverlay();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ShareAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ShareAlert$22$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        EditTextCaption.this.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ShareAlert.this.chatActivityEnterViewAnimateFromTop = r2.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset;
            ShareAlert.this.frameLayout2.invalidate();
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void showPopup(int i) {
            super.showPopup(i);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        public void hidePopup(boolean z) {
            super.hidePopup(z);
        }

        @Override // org.telegram.ui.Components.EditTextEmoji
        protected void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(ShareAlert.this.systemInsets.bottom);
            }
            FrameLayout frameLayout = ShareAlert.this.timestampFrameLayout;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            if (ShareAlert.this.frameLayout2 != null) {
                ShareAlert.this.frameLayout2.bringToFront();
            }
            if (ShareAlert.this.writeButtonContainer != null) {
                ShareAlert.this.writeButtonContainer.bringToFront();
            }
        }
    }

    class 23 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        23() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$23$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareAlert.this.updateSelectedCount(1);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$a4V2Uih3sSl5ErnnX2PuvYULYjs(ShareAlert shareAlert, View view) {
        shareAlert.timestampCheckbox.setChecked(!r3.isChecked(), true);
        shareAlert.updateLinkTextView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        if (!this.systemInsets.equals(insets)) {
            this.systemInsets = insets;
            this.container.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPremiumBlockedToast(View view, long j) {
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
            createSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            createSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    ShareAlert.$r8$lambda$9EDos9WlIJ5zJdEPwty4rLuXI-Q(ShareAlert.this);
                }
            });
        }
        createSimpleBulletin.show();
    }

    public static /* synthetic */ void $r8$lambda$9EDos9WlIJ5zJdEPwty4rLuXI-Q(ShareAlert shareAlert) {
        shareAlert.getClass();
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                ShareAlert.$r8$lambda$zIySNlfjdaZnyQ7LG4nDjEIRPKc();
            }
        };
        if (shareAlert.isKeyboardVisible()) {
            FragmentSearchField fragmentSearchField = shareAlert.searchView;
            if (fragmentSearchField != null) {
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
            }
            AndroidUtilities.runOnUIThread(runnable, 300L);
            return;
        }
        runnable.run();
    }

    public static /* synthetic */ void $r8$lambda$zIySNlfjdaZnyQ7LG4nDjEIRPKc() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectDialog(View view, final TLRPC.Dialog dialog) {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler;
        int i;
        if (dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
            return;
        }
        if (dialog != null && (((view instanceof ShareDialogCell) && ((ShareDialogCell) view).isBlocked()) || ((view instanceof ProfileSearchCell) && ((ProfileSearchCell) view).isBlocked()))) {
            showPremiumBlockedToast(view, dialog.id);
            return;
        }
        if (this.topicsGridView.getVisibility() != 8 || this.parentActivity == null) {
            return;
        }
        if (DialogObject.isChatDialog(dialog.id)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || (i = this.hasPoll) == 2 || i == 3)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity);
                builder.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                int i2 = this.hasPoll;
                if (i2 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodoAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodo));
                    }
                } else if (i2 == 2) {
                    if (this.isChannel) {
                        builder.setMessage(LocaleController.getString(R.string.PublicPollCantForward));
                    } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPollsAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPolls));
                    }
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ChannelCantSendMessage));
                }
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && this.hasPoll != 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity);
            builder2.setTitle(LocaleController.getString(R.string.SendMessageTitle));
            int i3 = this.hasPoll;
            if (i3 == 3) {
                builder2.setMessage(LocaleController.getString(R.string.TodoCantForwardSecretChat));
            } else if (i3 != 0) {
                builder2.setMessage(LocaleController.getString(R.string.PollCantForwardSecretChat));
            } else {
                builder2.setMessage(LocaleController.getString(R.string.InvoiceCantForwardSecretChat));
            }
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
            builder2.show();
            return;
        }
        if (this.selectedDialogs.indexOfKey(dialog.id) >= 0) {
            this.selectedDialogs.remove(dialog.id);
            this.selectedDialogTopics.remove(dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(false, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(false, true);
            }
            updateSelectedCount(1);
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (isBotForumWithNotEmptyTopics(user) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.selectedTopicDialog = dialog;
                this.topicsLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - this.topicsGridView.getPaddingTop());
                final AtomicReference atomicReference = new AtomicReference();
                final 27 r3 = new 27(dialog, atomicReference, view);
                atomicReference.set(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda22
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareAlert.$r8$lambda$COFwo-GZ-Z9KjzGXTzvz6Krgets(ShareAlert.this, atomicReference, r3, dialog);
                    }
                });
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i4 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(r3, i4);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    r3.didReceivedNotification(i4, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            this.selectedDialogs.put(dialog.id, dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(true, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(true, true);
            }
            updateSelectedCount(2);
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            if (this.searchIsVisible) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id);
                if (dialog2 == null) {
                    this.listAdapter.dialogsMap.put(dialog.id, dialog);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog);
                } else if (dialog2.id != j) {
                    this.listAdapter.dialogs.remove(dialog2);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog2);
                }
                this.listAdapter.notifyDataSetChanged();
                this.updateSearchAdapter = false;
                this.searchView.editText.setText("");
                checkCurrentList(false);
                AndroidUtilities.hideKeyboard(this.searchView.editText);
            }
        }
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (shareSearchAdapter == null || (categoryAdapterRecycler = shareSearchAdapter.categoryAdapter) == null) {
            return;
        }
        categoryAdapterRecycler.notifyItemRangeChanged(0, categoryAdapterRecycler.getItemCount());
    }

    class 27 implements NotificationCenter.NotificationCenterDelegate {
        final /* synthetic */ View val$cell;
        final /* synthetic */ TLRPC.Dialog val$dialog;
        final /* synthetic */ AtomicReference val$timeoutRef;

        27(TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
            this.val$dialog = dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (((Long) objArr[0]).longValue() == (-this.val$dialog.id)) {
                boolean z = (ShareAlert.this.shareTopicsAdapter.topics == null && MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id) != null) || this.val$timeoutRef.get() == null;
                ShareAlert.this.shareTopicsAdapter.topics = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForum = UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForumWithManageTopics = UserObject.isBotForumWithEditableTopics(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                if (z) {
                    ShareAlert.this.shareTopicsAdapter.notifyDataSetChanged();
                }
                if (ShareAlert.this.shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) ShareAlert.this).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    ShareAlert.this.topicsGridView.setVisibility(0);
                    ShareAlert.this.topicsGridView.setAlpha(0.0f);
                    ShareAlert.this.topicsBackActionBar.setVisibility(0);
                    ShareAlert.this.topicsBackActionBar.setAlpha(0.0f);
                    if (!UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                        if (ChatObject.isMonoForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                            ShareAlert shareAlert = ShareAlert.this;
                            shareAlert.topicsBackActionBar.setTitle(ForumUtilities.getMonoForumTitle(((BottomSheet) shareAlert).currentAccount, MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-this.val$dialog.id))));
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            ShareAlert shareAlert2 = ShareAlert.this;
                            shareAlert2.topicsBackActionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)).title);
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                        }
                    } else {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.topicsBackActionBar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((BottomSheet) shareAlert3).currentAccount).getUser(Long.valueOf(this.val$dialog.id))));
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    }
                    ShareAlert shareAlert4 = ShareAlert.this;
                    shareAlert4.searchWasVisibleBeforeTopics = shareAlert4.searchIsVisible;
                    if (ShareAlert.this.topicsAnimation != null) {
                        ShareAlert.this.topicsAnimation.cancel();
                    }
                    final int[] iArr = new int[2];
                    ShareAlert.this.topicsAnimation = new SpringAnimation(new FloatValueHolder(0.0f)).setSpring(new SpringForce(1000.0f).setStiffness((ShareAlert.this.parentFragment == null || !ShareAlert.this.parentFragment.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
                    SpringAnimation springAnimation = ShareAlert.this.topicsAnimation;
                    final View view = this.val$cell;
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Components.ShareAlert$27$$ExternalSyntheticLambda0
                        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
                        }
                    });
                    ShareAlert.this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Components.ShareAlert$27$$ExternalSyntheticLambda1
                        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                            ShareAlert.27.$r8$lambda$XS5XOBr6YCBBLkwDHsPDCTlKMKo(ShareAlert.27.this, dynamicAnimation, z2, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.start();
                    if (this.val$timeoutRef.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) this.val$timeoutRef.get());
                        this.val$timeoutRef.set(null);
                    }
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$XS5XOBr6YCBBLkwDHsPDCTlKMKo(27 r0, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ShareAlert.this.gridView.setVisibility(8);
            ShareAlert.this.searchGridView.setVisibility(8);
            ShareAlert.this.searchView.setVisibility(8);
            ShareAlert.this.topicsAnimation = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$COFwo-GZ-Z9KjzGXTzvz6Krgets(ShareAlert shareAlert, AtomicReference atomicReference, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.Dialog dialog) {
        shareAlert.getClass();
        atomicReference.set(null);
        notificationCenterDelegate.didReceivedNotification(NotificationCenter.topicsDidLoaded, shareAlert.currentAccount, Long.valueOf(-dialog.id));
    }

    private boolean isBotForumWithNotEmptyTopics(TLRPC.User user) {
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return ((topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id)) ? false : true;
    }

    private void collapseTopics() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        final View view = null;
        this.selectedTopicDialog = null;
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if ((childAt instanceof ShareDialogCell) && ((ShareDialogCell) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        SpringAnimation springAnimation = this.topicsAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        getMainGridView().setVisibility(0);
        this.searchView.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce();
            this.searchView.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchView.editText);
        }
        final int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        SpringAnimation spring = springAnimation2.setSpring(springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
        this.topicsAnimation = spring;
        spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
            }
        });
        this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda1
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ShareAlert.$r8$lambda$4HfY0SuagTUcljb7OhWfrpRAA0c(ShareAlert.this, dynamicAnimation, z, f, f2);
            }
        });
        this.topicsAnimation.start();
    }

    public static /* synthetic */ void $r8$lambda$4HfY0SuagTUcljb7OhWfrpRAA0c(ShareAlert shareAlert, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        shareAlert.topicsGridView.setVisibility(8);
        shareAlert.topicsBackActionBar.setVisibility(8);
        shareAlert.shareTopicsAdapter.topics = null;
        shareAlert.shareTopicsAdapter.notifyDataSetChanged();
        shareAlert.topicsAnimation = null;
        shareAlert.searchWasVisibleBeforeTopics = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        this.topicsGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        this.topicsGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        this.topicsGridView.setScaleX(f3);
        this.topicsGridView.setScaleY(f3);
        this.topicsGridView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        mainGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        this.searchView.setPivotX(r4.getWidth() / 2.0f);
        this.searchView.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        this.searchView.setScaleX(f6);
        this.searchView.setScaleY(f6);
        this.searchView.setAlpha(f5);
        this.topicsBackActionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        this.topicsBackActionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.setAlpha(f);
        this.topicsGridView.getLocationInWindow(iArr);
        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        for (int i = 0; i < mainGridView.getChildCount(); i++) {
            View childAt = mainGridView.getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < this.topicsGridView.getChildCount(); i2++) {
            View childAt2 = this.topicsGridView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) ((-((childAt2.getY() + this.topicsGridView.getTranslationY()) - view.getY())) * Math.pow(d, 2.0d)));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSendLongClick(View view) {
        int measuredHeight;
        ChatActivity chatActivity;
        if (this.parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.sendingMessageObjects != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ShareAlert.28
                private Rect popupRect = new Rect();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                        return false;
                    }
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    ShareAlert.this.sendPopupWindow.dismiss();
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda23
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    ShareAlert.$r8$lambda$p6H-5T_-k0OHxSJVpqrjSh2ZXW4(ShareAlert.this, keyEvent);
                }
            });
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, true, false, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ShowSendersName), 0);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), true, false, true, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.HideSendersName), 0);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareAlert.$r8$lambda$SE9rtxXfJ8_P-ziRbK7KjLWryKg(ShareAlert.this, actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareAlert.$r8$lambda$Uncoq7-WccoWl08COl-4PU4d9VI(ShareAlert.this, actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -8.0f));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Components.ShareAlert.29
            private Rect popupRect = new Rect();

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                    return false;
                }
                view2.getHitRect(this.popupRect);
                if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                ShareAlert.this.sendPopupWindow.dismiss();
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda26
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                ShareAlert.$r8$lambda$FVbC3P8nOT93TNtUuci6WSt2K_0(ShareAlert.this, keyEvent);
            }
        });
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShareAlert.$r8$lambda$AsyASwfrhaTV3oPW4aC7U8rvKUI(ShareAlert.this, view2);
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda28
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShareAlert.$r8$lambda$-s8FT6P7I734RLBE1VAIu__BFzc(ShareAlert.this, view2);
            }
        });
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (this.keyboardVisible && (chatActivity = this.parentFragment) != null && chatActivity.contentView.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = iArr[1] + view.getMeasuredHeight();
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), measuredHeight);
        this.sendPopupWindow.dimBehind();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$p6H-5T_-k0OHxSJVpqrjSh2ZXW4(ShareAlert shareAlert, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        shareAlert.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = shareAlert.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            shareAlert.sendPopupWindow.dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$SE9rtxXfJ8_P-ziRbK7KjLWryKg(ShareAlert shareAlert, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        shareAlert.showSendersName = true;
        actionBarMenuSubItem.setChecked(true);
        actionBarMenuSubItem2.setChecked(!shareAlert.showSendersName);
    }

    public static /* synthetic */ void $r8$lambda$Uncoq7-WccoWl08COl-4PU4d9VI(ShareAlert shareAlert, ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        shareAlert.showSendersName = false;
        actionBarMenuSubItem.setChecked(false);
        actionBarMenuSubItem2.setChecked(!shareAlert.showSendersName);
    }

    public static /* synthetic */ void $r8$lambda$FVbC3P8nOT93TNtUuci6WSt2K_0(ShareAlert shareAlert, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        shareAlert.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = shareAlert.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            shareAlert.sendPopupWindow.dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$AsyASwfrhaTV3oPW4aC7U8rvKUI(ShareAlert shareAlert, View view) {
        ActionBarPopupWindow actionBarPopupWindow = shareAlert.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            shareAlert.sendPopupWindow.dismiss();
        }
        shareAlert.sendInternal(false);
    }

    public static /* synthetic */ void $r8$lambda$-s8FT6P7I734RLBE1VAIu__BFzc(ShareAlert shareAlert, View view) {
        ActionBarPopupWindow actionBarPopupWindow = shareAlert.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            shareAlert.sendPopupWindow.dismiss();
        }
        shareAlert.sendInternal(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendInternal(final boolean z) {
        int i;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, this.selectedDialogs.keyAt(i2), this.frameLayout2.getTag() != null && this.commentTextView.length() > 0)) {
                return;
            }
        }
        int i3 = 0;
        final CharSequence[] charSequenceArr = {this.commentTextView.getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CheckBox2 checkBox2 = this.timestampCheckbox;
        final int i4 = (checkBox2 == null || !checkBox2.isChecked()) ? -1 : this.timestamp;
        ArrayList arrayList = new ArrayList();
        if (this.sendingMessageObjects != null) {
            i = 0;
            while (i3 < this.selectedDialogs.size()) {
                long keyAt = this.selectedDialogs.keyAt(i3);
                long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(keyAt);
                if (sendPaidMessagesStars <= 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(keyAt));
                }
                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars > 0) {
                    i++;
                }
                if (sendPaidMessagesStars > 0) {
                    i++;
                }
                if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(keyAt))) {
                    arrayList.add(Long.valueOf(keyAt));
                }
                i3++;
            }
        } else {
            SwitchView switchView = this.switchView;
            int i5 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                int i6 = 0;
                for (int i7 = 0; i7 < this.selectedDialogs.size(); i7++) {
                    long keyAt2 = this.selectedDialogs.keyAt(i7);
                    long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(keyAt2);
                    if (sendPaidMessagesStars2 <= 0) {
                        sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(keyAt2));
                    }
                    if (this.storyItem != null && this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                        i6++;
                    }
                    if (sendPaidMessagesStars2 > 0) {
                        i6++;
                    }
                    if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(keyAt2))) {
                        arrayList.add(Long.valueOf(keyAt2));
                    }
                }
                i = i6;
            } else if (this.sendingText[i5] != null) {
                i = 0;
                while (i3 < this.selectedDialogs.size()) {
                    long keyAt3 = this.selectedDialogs.keyAt(i3);
                    long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(keyAt3);
                    if (sendPaidMessagesStars3 <= 0) {
                        sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(keyAt3));
                    }
                    if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars3 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars3 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(keyAt3))) {
                        arrayList.add(Long.valueOf(keyAt3));
                    }
                    i3++;
                }
            } else {
                i = 0;
            }
        }
        AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ShareAlert.$r8$lambda$UKHS_kMY01m5e2Q2ET4xtfgWj2g(ShareAlert.this, charSequenceArr, entities, z, i4, (HashMap) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v20 */
    public static /* synthetic */ void $r8$lambda$UKHS_kMY01m5e2Q2ET4xtfgWj2g(ShareAlert shareAlert, CharSequence[] charSequenceArr, ArrayList arrayList, boolean z, int i, HashMap hashMap) {
        boolean z2;
        boolean z3;
        Long l;
        char c;
        MessageObject messageObject;
        int i2;
        MessageObject messageObject2;
        long longValue;
        Long l2;
        long j;
        SendMessagesHelper.SendMessageParams of;
        long j2;
        int i3;
        long longValue2;
        HashMap hashMap2 = hashMap;
        long j3 = 0;
        ?? r8 = 0;
        if (shareAlert.sendingMessageObjects != null) {
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < shareAlert.selectedDialogs.size()) {
                long keyAt = shareAlert.selectedDialogs.keyAt(i4);
                boolean isMonoForum = MessagesController.getInstance(shareAlert.currentAccount).isMonoForum(keyAt);
                Long l3 = hashMap2 == null ? 0L : (Long) hashMap2.get(Long.valueOf(keyAt));
                if (l3 != null && l3.longValue() > j3) {
                    z4 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(shareAlert.selectedDialogs.get(keyAt));
                if (tL_forumTopic == null || !isMonoForum) {
                    j2 = j3;
                } else {
                    j2 = j3;
                    j3 = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                }
                MessageObject messageObject3 = (tL_forumTopic == null || isMonoForum) ? null : new MessageObject(shareAlert.currentAccount, tL_forumTopic.topicStartMessage, r8, r8);
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (shareAlert.frameLayout2.getTag() == null || shareAlert.commentTextView.length() <= 0) {
                    i3 = i4;
                } else {
                    CharSequence charSequence = charSequenceArr[r8];
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), keyAt, messageObject3, messageObject3, null, true, arrayList, null, null, z, 0, 0, null, false);
                    if (l3 == null) {
                        i3 = i4;
                        longValue2 = j2;
                    } else {
                        i3 = i4;
                        longValue2 = l3.longValue();
                    }
                    of2.payStars = longValue2;
                    of2.monoForumPeer = j3;
                    SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(of2);
                }
                int sendMessage = SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(shareAlert.sendingMessageObjects, keyAt, !shareAlert.showSendersName, false, z, 0, 0, messageObject3, i, l3 == null ? j2 : l3.longValue(), j3, null);
                if (sendMessage != 0) {
                    arrayList2.add(Long.valueOf(keyAt));
                }
                if (shareAlert.selectedDialogs.size() == 1) {
                    AlertsCreator.showSendMediaAlert(sendMessage, shareAlert.parentFragment, null);
                    if (sendMessage != 0) {
                        break;
                    }
                }
                i4 = i3 + 1;
                j3 = j2;
                r8 = 0;
            }
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                long longValue3 = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) shareAlert.selectedDialogs.get(longValue3);
                shareAlert.selectedDialogs.remove(longValue3);
                if (dialog != null) {
                    shareAlert.selectedDialogTopics.remove(dialog);
                }
            }
            if (!shareAlert.selectedDialogs.isEmpty()) {
                shareAlert.onSend(shareAlert.selectedDialogs, shareAlert.sendingMessageObjects.size(), shareAlert.selectedDialogs.size() == 1 ? (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(shareAlert.selectedDialogs.valueAt(0)) : null, !z4);
            }
        } else {
            SwitchView switchView = shareAlert.switchView;
            int i6 = switchView != null ? switchView.currentTab : 0;
            if (shareAlert.storyItem != null) {
                z3 = false;
                for (int i7 = 0; i7 < shareAlert.selectedDialogs.size(); i7++) {
                    long keyAt2 = shareAlert.selectedDialogs.keyAt(i7);
                    boolean isMonoForum2 = MessagesController.getInstance(shareAlert.currentAccount).isMonoForum(keyAt2);
                    if (hashMap2 == null) {
                        l2 = 0L;
                    } else {
                        l2 = (Long) hashMap2.get(Long.valueOf(keyAt2));
                    }
                    if (l2 != null && l2.longValue() > 0) {
                        z3 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(shareAlert.selectedDialogs.get(keyAt2));
                    long peerDialogId = (tL_forumTopic2 == null || !isMonoForum2) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                    MessageObject messageObject4 = (tL_forumTopic2 == null || isMonoForum2) ? null : new MessageObject(shareAlert.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                    if (shareAlert.storyItem == null) {
                        if (shareAlert.frameLayout2.getTag() != null && shareAlert.commentTextView.length() > 0) {
                            CharSequence charSequence2 = charSequenceArr[0];
                            of = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), keyAt2, messageObject4, messageObject4, null, true, arrayList, null, null, z, 0, 0, null, false);
                            j = peerDialogId;
                        } else {
                            j = peerDialogId;
                            of = SendMessagesHelper.SendMessageParams.of(shareAlert.sendingText[i6], keyAt2, messageObject4, messageObject4, null, true, null, null, null, z, 0, 0, null, false);
                        }
                    } else {
                        j = peerDialogId;
                        if (shareAlert.frameLayout2.getTag() != null && shareAlert.commentTextView.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject5 = messageObject4;
                            messageObject4 = messageObject5;
                            SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), keyAt2, null, messageObject5, null, true, null, null, null, z, 0, 0, null, false));
                        }
                        of = SendMessagesHelper.SendMessageParams.of(null, keyAt2, messageObject4, messageObject4, null, true, null, null, null, z, 0, 0, null, false);
                        of.sendingStory = shareAlert.storyItem;
                    }
                    of.payStars = l2 == null ? 0L : l2.longValue();
                    of.monoForumPeer = j;
                    SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(of);
                }
            } else if (shareAlert.sendingText[i6] != null) {
                int i8 = 0;
                z3 = false;
                while (i8 < shareAlert.selectedDialogs.size()) {
                    long keyAt3 = shareAlert.selectedDialogs.keyAt(i8);
                    boolean isMonoForum3 = MessagesController.getInstance(shareAlert.currentAccount).isMonoForum(keyAt3);
                    if (hashMap2 == null) {
                        l = 0L;
                    } else {
                        l = (Long) hashMap2.get(Long.valueOf(keyAt3));
                    }
                    if (l != null && l.longValue() > 0) {
                        z3 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(shareAlert.selectedDialogs.get(keyAt3));
                    long peerDialogId2 = (tL_forumTopic3 == null || !isMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    if (tL_forumTopic3 == null || isMonoForum3) {
                        c = 0;
                        messageObject = null;
                    } else {
                        c = 0;
                        messageObject = new MessageObject(shareAlert.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (shareAlert.frameLayout2.getTag() == null || shareAlert.commentTextView.length() <= 0) {
                        i2 = i6;
                        messageObject2 = messageObject;
                    } else {
                        CharSequence charSequence3 = charSequenceArr[c];
                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), keyAt3, messageObject, messageObject, null, true, arrayList, null, null, z, 0, 0, null, false);
                        messageObject2 = messageObject;
                        if (l == null) {
                            i2 = i6;
                            longValue = 0;
                        } else {
                            i2 = i6;
                            longValue = l.longValue();
                        }
                        of3.payStars = longValue;
                        of3.monoForumPeer = peerDialogId2;
                        SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(of3);
                    }
                    SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(shareAlert.sendingText[i2], keyAt3, messageObject2, messageObject2, null, true, null, null, null, z, 0, 0, null, false);
                    of4.payStars = l == null ? 0L : l.longValue();
                    of4.monoForumPeer = peerDialogId2;
                    SendMessagesHelper.getInstance(shareAlert.currentAccount).sendMessage(of4);
                    i8++;
                    i6 = i2;
                    hashMap2 = hashMap;
                }
            } else {
                z2 = false;
                LongSparseArray longSparseArray = shareAlert.selectedDialogs;
                shareAlert.onSend(longSparseArray, 1, (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(longSparseArray.valueAt(0)), !z2);
            }
            z2 = z3;
            LongSparseArray longSparseArray2 = shareAlert.selectedDialogs;
            shareAlert.onSend(longSparseArray2, 1, (TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(longSparseArray2.valueAt(0)), !z2);
        }
        ShareAlertDelegate shareAlertDelegate = shareAlert.delegate;
        if (shareAlertDelegate != null) {
            shareAlertDelegate.didShare();
        }
        shareAlert.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        if (this.gridView.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.gridView.getPaddingTop();
        if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    private RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public void setDelegate(ShareAlertDelegate shareAlertDelegate) {
        this.delegate = shareAlertDelegate;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        super.dismissInternal();
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void onBackPressed() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.commentTextView.hidePopup(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayout() {
        if (this.panTranslationMoveLayout) {
            return;
        }
        RecyclerListView recyclerListView = this.searchIsVisible ? this.searchGridView : this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            return;
        }
        View childAt = recyclerListView.getChildAt(0);
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = recyclerListView.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.lastOffset = childAt.getTop();
            runShadowAnimation(0, false);
        } else {
            this.lastOffset = ConnectionsManager.DEFAULT_DATACENTER_ID;
            runShadowAnimation(0, true);
            top = i2;
        }
        if (this.topicsGridView.getVisibility() == 0) {
            RecyclerListView recyclerListView2 = this.topicsGridView;
            if (recyclerListView2.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView2.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView2.getChildCount(); i3++) {
                if (recyclerListView2.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView2.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView2.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 >= 0 && holder2 != null && holder2.getAdapterPosition() == 0) {
                this.lastOffset = childAt2.getTop();
                runShadowAnimation(0, false);
            } else {
                this.lastOffset = ConnectionsManager.DEFAULT_DATACENTER_ID;
                runShadowAnimation(0, true);
                top2 = i4;
            }
            top = AndroidUtilities.lerp(top, top2, this.topicsGridView.getAlpha());
        }
        int i5 = this.scrollOffsetY;
        if (i5 != top) {
            this.previousScrollOffsetY = i5;
            RecyclerListView recyclerListView3 = this.gridView;
            float f = top;
            int i6 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i6;
            recyclerListView3.setTopGlowOffset(i6);
            RecyclerListView recyclerListView4 = this.searchGridView;
            int i7 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i7;
            recyclerListView4.setTopGlowOffset(i7);
            RecyclerListView recyclerListView5 = this.topicsGridView;
            int i8 = (int) (f + this.currentPanTranslationY);
            this.scrollOffsetY = i8;
            recyclerListView5.setTopGlowOffset(i8);
            this.frameLayout.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.containerView.invalidate();
        }
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ShareAlert.30
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    ShareAlert.this.shadow[i].setVisibility(4);
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    private void copyLink(Context context) {
        final boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            String link = getLink();
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (link == null) {
                link = this.exportedMessageLink.link;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", link));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if (shareAlertDelegate != null && shareAlertDelegate.didCopy()) {
                return;
            }
            if (this.parentActivity instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new Function() { // from class: org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda21
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        Bulletin createCopyLinkBulletin;
                        createCopyLinkBulletin = ((BulletinFactory) obj).createCopyLinkBulletin(z);
                        return createCopyLinkBulletin;
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private boolean showCommentTextView(final boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            FrameLayout frameLayout = this.timestampFrameLayout;
            if (frameLayout != null && this.pickerBottom == null) {
                frameLayout.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else {
            FrameLayout frameLayout2 = this.pickerBottom;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        FrameLayout frameLayout3 = this.pickerBottom;
        if (frameLayout3 != null) {
            ViewCompat.setImportantForAccessibility(frameLayout3, z ? 4 : 1);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            ViewCompat.setImportantForAccessibility(linearLayout, z ? 4 : 1);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout4 = this.frameLayout2;
        Property property = View.ALPHA;
        float f = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout5 = this.timestampFrameLayout;
        if (frameLayout5 != null && this.pickerBottom == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout6 = this.pickerBottom;
        if (frameLayout6 == null || frameLayout6.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.shadow[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.darkTheme && z) {
                f = AndroidUtilities.dp(this.timestampLayout != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property2, f));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ShareAlert.31
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    if (!z) {
                        ShareAlert.this.frameLayout2.setVisibility(4);
                        ShareAlert shareAlert = ShareAlert.this;
                        if (shareAlert.timestampFrameLayout != null && shareAlert.pickerBottom == null) {
                            ShareAlert.this.timestampFrameLayout.setVisibility(4);
                        }
                        ShareAlert.this.writeButtonContainer.setVisibility(4);
                    } else if (ShareAlert.this.pickerBottom != null) {
                        ShareAlert.this.pickerBottom.setVisibility(4);
                    }
                    ShareAlert.this.animatorSet = null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    ShareAlert.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.start();
        return true;
    }

    public void updateSelectedCount(int i) {
        if (this.selectedDialogs.size() == 0) {
            showCommentTextView(false);
            return;
        }
        ArrayList arrayList = this.sendingMessageObjects;
        int size = arrayList == null ? 1 : arrayList.size();
        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            long j2 = ((TLRPC.Dialog) this.selectedDialogs.valueAt(i2)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j2));
            }
            j += sendPaidMessagesStars;
        }
        this.writeButton.setCount(Math.max(1, this.selectedDialogs.size()), i != 0);
        this.writeButton.setStarsPrice(j, size, i != 0);
        showCommentTextView(true);
        this.commentTextView.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), this.writeButton.width()), 0);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.BaseFragment.AttachedSheet
    public void dismiss() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.fullyShown = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private ArrayList dialogs = new ArrayList();
        private LongSparseArray dialogsMap = new LongSparseArray();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        private class MyStoryDialog extends TLRPC.Dialog {
            private MyStoryDialog() {
                this.id = Long.MAX_VALUE;
            }
        }

        public ShareDialogsAdapter(Context context) {
            this.context = context;
            fetchDialogs();
        }

        public void fetchDialogs() {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            this.dialogs.clear();
            this.dialogsMap.clear();
            long j = UserConfig.getInstance(((BottomSheet) ShareAlert.this).currentAccount).clientUserId;
            if (ShareAlert.this.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                this.dialogs.add(myStoryDialog);
                this.dialogsMap.put(myStoryDialog.id, myStoryDialog);
            }
            if (!MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.isEmpty()) {
                TLRPC.Dialog dialog = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.get(0);
                this.dialogs.add(dialog);
                this.dialogsMap.put(dialog.id, dialog);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC.Dialog dialog2 = allDialogs.get(i);
                if (dialog2 instanceof TLRPC.TL_dialog) {
                    long j2 = dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (!DialogObject.isUserDialog(dialog2.id)) {
                            TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog2.folder_id == 1) {
                                    arrayList.add(dialog2);
                                } else {
                                    this.dialogs.add(dialog2);
                                }
                                this.dialogsMap.put(dialog2.id, dialog2);
                            }
                        } else {
                            if (dialog2.folder_id == 1) {
                                arrayList.add(dialog2);
                            } else {
                                this.dialogs.add(dialog2);
                            }
                            this.dialogsMap.put(dialog2.id, dialog2);
                        }
                    }
                }
            }
            this.dialogs.addAll(arrayList);
            if (ShareAlert.this.parentFragment != null) {
                int i2 = ShareAlert.this.parentFragment.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList arrayList2 = this.dialogs;
                    ArrayList arrayList3 = new ArrayList(arrayList2.subList(0, Math.min(4, arrayList2.size())));
                    this.dialogs.clear();
                    this.dialogs.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!this.dialogs.isEmpty() && this.dialogs.size() < 80) {
                        ArrayList arrayList4 = this.dialogs;
                        arrayList4.add((TLRPC.Dialog) arrayList4.get(arrayList4.size() - 1));
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.dialogs.size()) {
                return null;
            }
            return (TLRPC.Dialog) this.dialogs.get(i2);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.ShareDialogsAdapter.1
                    @Override // org.telegram.ui.Cells.ShareDialogCell
                    protected String repostToCustomName() {
                        if (ShareAlert.this.includeStoryFromMessage) {
                            return LocaleController.getString(R.string.RepostToStory);
                        }
                        return super.repostToCustomName();
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                TLRPC.Dialog item = getItem(i);
                if (item == null) {
                    return;
                }
                shareDialogCell.setTopic((TLRPC.TL_forumTopic) ShareAlert.this.selectedDialogTopics.get(item), MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).isMonoForum(item.id), false);
                long j = item.id;
                shareDialogCell.setDialog(j, ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private boolean isBotForum;
        private boolean isBotForumWithManageTopics;
        private List topics;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public ShareTopicsAdapter(Context context) {
            this.context = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List list = this.topics;
            return (list != null ? list.size() + 1 : 0) + (this.isBotForum ? 1 : 0);
        }

        public TLRPC.TL_forumTopic getItemTopic(int i) {
            int i2 = i - 1;
            if (this.isBotForum) {
                i2 = i - 2;
            }
            List list = this.topics;
            if (list == null || i2 < 0 || i2 >= list.size()) {
                return null;
            }
            return (TLRPC.TL_forumTopic) this.topics.get(i2);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            if (i == 0 || i == 2) {
                shareTopicCell = new ShareTopicCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(this.context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                if (i == 1 && this.isBotForum) {
                    shareTopicCell.setAsNewBotForumTopic(this.isBotForumWithManageTopics);
                } else if (this.topics != null) {
                    TLRPC.TL_forumTopic itemTopic = getItemTopic(i);
                    shareTopicCell.setTopic(ShareAlert.this.selectedTopicDialog, itemTopic, itemTopic != null && ShareAlert.this.selectedDialogs.indexOfKey((long) itemTopic.id) >= 0, null);
                }
            }
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapter;
        RecyclerView categoryListView;
        private Context context;
        int itemsCount;
        private int lastGlobalSearchId;
        int lastItemCont;
        private int lastLocalSearchId;
        private int lastSearchId;
        private String lastSearchText;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private Runnable searchRunnable2;
        private ArrayList searchResult = new ArrayList();
        int hintsCell = -1;
        int resentTitleCell = -1;
        int firstEmptyViewCell = -1;
        int recentDialogsStartRow = -1;
        int searchResultsStartRow = -1;
        int lastFilledItem = -1;
        boolean internalDialogsIsSearching = false;

        public ShareSearchAdapter(Context context) {
            this.context = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.1
                @Override // org.telegram.ui.Adapters.SearchAdapterHelper
                protected boolean filter(TLObject tLObject) {
                    return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
                }
            };
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.2
                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeCallParticipants(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$getExcludeUsers(this);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public /* synthetic */ void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.-CC.$default$onSetHashtags(this, arrayList, hashMap);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public void onDataSetChanged(int i) {
                    ShareSearchAdapter.this.lastGlobalSearchId = i;
                    if (ShareSearchAdapter.this.lastLocalSearchId != i) {
                        ShareSearchAdapter.this.searchResult.clear();
                    }
                    ShareSearchAdapter shareSearchAdapter = ShareSearchAdapter.this;
                    int i2 = shareSearchAdapter.lastItemCont;
                    if (shareSearchAdapter.getItemCount() == 0 && !ShareSearchAdapter.this.searchAdapterHelper.isSearchInProgress()) {
                        ShareSearchAdapter shareSearchAdapter2 = ShareSearchAdapter.this;
                        if (!shareSearchAdapter2.internalDialogsIsSearching) {
                            ShareAlert.this.searchEmptyView.showProgress(false, true);
                            ShareSearchAdapter.this.notifyDataSetChanged();
                            ShareAlert.this.checkCurrentList(true);
                        }
                    }
                    ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                    ShareSearchAdapter.this.notifyDataSetChanged();
                    ShareAlert.this.checkCurrentList(true);
                }

                @Override // org.telegram.ui.Adapters.SearchAdapterHelper.SearchAdapterHelperDelegate
                public boolean canApplySearchResults(int i) {
                    return i == ShareSearchAdapter.this.lastSearchId;
                }
            });
        }

        private void searchDialogsInternal(final String str, final int i) {
            MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    ShareAlert.ShareSearchAdapter.$r8$lambda$wFSR2UrlZTa-dZk4YqMnzcdAzU4(ShareAlert.ShareSearchAdapter.this, str, i);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:197:0x0400 A[Catch: Exception -> 0x041d, LOOP:7: B:181:0x034d->B:197:0x0400, LOOP_END, TryCatch #0 {Exception -> 0x041d, blocks: (B:3:0x0007, B:5:0x0016, B:8:0x0023, B:10:0x0031, B:14:0x003d, B:16:0x0044, B:17:0x0046, B:18:0x006b, B:20:0x0071, B:35:0x0089, B:38:0x0093, B:23:0x009b, B:26:0x00a1, B:29:0x00ac, B:42:0x00b4, B:45:0x00c7, B:46:0x00ec, B:48:0x00f2, B:51:0x0106, B:53:0x010d, B:56:0x0118, B:58:0x0122, B:61:0x013b, B:63:0x0141, B:67:0x0159, B:73:0x0166, B:75:0x016d, B:77:0x0185, B:79:0x0194, B:80:0x01c8, B:83:0x019f, B:71:0x01dd, B:94:0x01ed, B:95:0x01fa, B:97:0x0200, B:98:0x0226, B:100:0x022c, B:105:0x0243, B:107:0x024b, B:110:0x0262, B:112:0x0268, B:147:0x027f, B:116:0x0284, B:119:0x028a, B:122:0x0297, B:125:0x029d, B:127:0x02a3, B:129:0x02a7, B:131:0x02ab, B:137:0x02af, B:134:0x02b3, B:154:0x02d4, B:155:0x02d7, B:156:0x02dd, B:158:0x02e3, B:160:0x02ed, B:162:0x02f1, B:164:0x02f4, B:168:0x02f9, B:169:0x0310, B:171:0x0316, B:174:0x0324, B:177:0x0338, B:179:0x0343, B:182:0x034f, B:184:0x0357, B:187:0x036e, B:189:0x0374, B:193:0x038c, B:199:0x0397, B:201:0x039e, B:203:0x03b2, B:204:0x03b9, B:206:0x03c4, B:207:0x03f9, B:208:0x03d0, B:197:0x0400, B:220:0x040c), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0397 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01dd A[Catch: Exception -> 0x041d, LOOP:2: B:55:0x0116->B:71:0x01dd, LOOP_END, TryCatch #0 {Exception -> 0x041d, blocks: (B:3:0x0007, B:5:0x0016, B:8:0x0023, B:10:0x0031, B:14:0x003d, B:16:0x0044, B:17:0x0046, B:18:0x006b, B:20:0x0071, B:35:0x0089, B:38:0x0093, B:23:0x009b, B:26:0x00a1, B:29:0x00ac, B:42:0x00b4, B:45:0x00c7, B:46:0x00ec, B:48:0x00f2, B:51:0x0106, B:53:0x010d, B:56:0x0118, B:58:0x0122, B:61:0x013b, B:63:0x0141, B:67:0x0159, B:73:0x0166, B:75:0x016d, B:77:0x0185, B:79:0x0194, B:80:0x01c8, B:83:0x019f, B:71:0x01dd, B:94:0x01ed, B:95:0x01fa, B:97:0x0200, B:98:0x0226, B:100:0x022c, B:105:0x0243, B:107:0x024b, B:110:0x0262, B:112:0x0268, B:147:0x027f, B:116:0x0284, B:119:0x028a, B:122:0x0297, B:125:0x029d, B:127:0x02a3, B:129:0x02a7, B:131:0x02ab, B:137:0x02af, B:134:0x02b3, B:154:0x02d4, B:155:0x02d7, B:156:0x02dd, B:158:0x02e3, B:160:0x02ed, B:162:0x02f1, B:164:0x02f4, B:168:0x02f9, B:169:0x0310, B:171:0x0316, B:174:0x0324, B:177:0x0338, B:179:0x0343, B:182:0x034f, B:184:0x0357, B:187:0x036e, B:189:0x0374, B:193:0x038c, B:199:0x0397, B:201:0x039e, B:203:0x03b2, B:204:0x03b9, B:206:0x03c4, B:207:0x03f9, B:208:0x03d0, B:197:0x0400, B:220:0x040c), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0166 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $r8$lambda$wFSR2UrlZTa-dZk4YqMnzcdAzU4(ShareSearchAdapter shareSearchAdapter, String str, int i) {
            String str2;
            int i2;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            int i3;
            String str3;
            char c;
            int i4 = 0;
            shareSearchAdapter.getClass();
            try {
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    shareSearchAdapter.lastSearchId = -1;
                    shareSearchAdapter.updateSearchResults(new ArrayList(), shareSearchAdapter.lastSearchId);
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i5 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i5];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                SQLiteCursor queryFinalized = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                while (queryFinalized.next()) {
                    long longValue = queryFinalized.longValue(0);
                    DialogSearchResult dialogSearchResult = new DialogSearchResult();
                    dialogSearchResult.date = queryFinalized.intValue(1);
                    longSparseArray.put(longValue, dialogSearchResult);
                    if (DialogObject.isUserDialog(longValue)) {
                        if (!arrayList.contains(Long.valueOf(longValue))) {
                            arrayList.add(Long.valueOf(longValue));
                        }
                    } else if (DialogObject.isChatDialog(longValue)) {
                        long j = -longValue;
                        if (!arrayList2.contains(Long.valueOf(j))) {
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                }
                queryFinalized.dispose();
                String str4 = ";;;";
                if (arrayList.isEmpty()) {
                    str2 = ";;;";
                    i2 = 0;
                } else {
                    SQLiteCursor queryFinalized2 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, status, name FROM users WHERE uid IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                    int i6 = 0;
                    while (queryFinalized2.next()) {
                        String stringValue = queryFinalized2.stringValue(2);
                        String translitString2 = LocaleController.getInstance().getTranslitString(stringValue);
                        if (stringValue.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int lastIndexOf = stringValue.lastIndexOf(str4);
                        String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                        char c2 = 0;
                        while (true) {
                            if (i4 >= i5) {
                                i3 = i6;
                                break;
                            }
                            int i7 = i4;
                            String str5 = strArr[i7];
                            if (stringValue.startsWith(str5)) {
                                i3 = i6;
                            } else {
                                i3 = i6;
                                if (!stringValue.contains(" " + str5)) {
                                    if (translitString2 != null) {
                                        if (!translitString2.startsWith(str5)) {
                                            if (translitString2.contains(" " + str5)) {
                                            }
                                        }
                                    }
                                    if (substring != null && substring.startsWith(str5)) {
                                        c2 = 2;
                                    }
                                    if (c2 == 0) {
                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                        if (byteBufferValue != null) {
                                            TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                            byteBufferValue.reuse();
                                            String str6 = str4;
                                            DialogSearchResult dialogSearchResult2 = (DialogSearchResult) longSparseArray.get(TLdeserialize.id);
                                            TLRPC.UserStatus userStatus = TLdeserialize.status;
                                            if (userStatus != null) {
                                                str3 = str6;
                                                c = 1;
                                                userStatus.expires = queryFinalized2.intValue(1);
                                            } else {
                                                str3 = str6;
                                                c = 1;
                                            }
                                            if (c2 == c) {
                                                dialogSearchResult2.name = AndroidUtilities.generateSearchName(TLdeserialize.first_name, TLdeserialize.last_name, str5);
                                            } else {
                                                dialogSearchResult2.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize), null, "@" + str5);
                                            }
                                            dialogSearchResult2.object = TLdeserialize;
                                            dialogSearchResult2.dialog.id = TLdeserialize.id;
                                            i6 = i3 + 1;
                                        }
                                    } else {
                                        i4 = i7 + 1;
                                        i6 = i3;
                                    }
                                }
                            }
                            c2 = 1;
                            if (c2 == 0) {
                            }
                        }
                        str3 = str4;
                        i6 = i3;
                        str4 = str3;
                        i4 = 0;
                    }
                    str2 = str4;
                    queryFinalized2.dispose();
                    i2 = i6;
                }
                if (!arrayList2.isEmpty()) {
                    SQLiteCursor queryFinalized3 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, name FROM chats WHERE uid IN(%s)", TextUtils.join(",", arrayList2)), new Object[0]);
                    while (queryFinalized3.next()) {
                        String stringValue2 = queryFinalized3.stringValue(1);
                        String translitString3 = LocaleController.getInstance().getTranslitString(stringValue2);
                        if (stringValue2.equals(translitString3)) {
                            translitString3 = null;
                        }
                        for (int i8 = 0; i8 < i5; i8++) {
                            String str7 = strArr[i8];
                            if (!stringValue2.startsWith(str7)) {
                                if (!stringValue2.contains(" " + str7)) {
                                    if (translitString3 != null) {
                                        if (!translitString3.startsWith(str7)) {
                                            if (translitString3.contains(" " + str7)) {
                                            }
                                        }
                                    }
                                }
                            }
                            NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if (TLdeserialize2 != null && !ChatObject.isNotInChat(TLdeserialize2) && (!ChatObject.isChannel(TLdeserialize2) || TLdeserialize2.creator || (((tL_chatAdminRights = TLdeserialize2.admin_rights) != null && tL_chatAdminRights.post_messages) || TLdeserialize2.megagroup))) {
                                    DialogSearchResult dialogSearchResult3 = (DialogSearchResult) longSparseArray.get(-TLdeserialize2.id);
                                    dialogSearchResult3.name = AndroidUtilities.generateSearchName(TLdeserialize2.title, null, str7);
                                    dialogSearchResult3.object = TLdeserialize2;
                                    dialogSearchResult3.dialog.id = -TLdeserialize2.id;
                                    i2++;
                                }
                            }
                        }
                    }
                    queryFinalized3.dispose();
                }
                ArrayList arrayList3 = new ArrayList(i2);
                for (int i9 = 0; i9 < longSparseArray.size(); i9++) {
                    DialogSearchResult dialogSearchResult4 = (DialogSearchResult) longSparseArray.valueAt(i9);
                    if (dialogSearchResult4.object != null && dialogSearchResult4.name != null) {
                        arrayList3.add(dialogSearchResult4);
                    }
                }
                SQLiteCursor queryFinalized4 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                while (queryFinalized4.next()) {
                    if (longSparseArray.indexOfKey(queryFinalized4.longValue(3)) < 0) {
                        String stringValue3 = queryFinalized4.stringValue(2);
                        String translitString4 = LocaleController.getInstance().getTranslitString(stringValue3);
                        if (stringValue3.equals(translitString4)) {
                            translitString4 = null;
                        }
                        String str8 = str2;
                        int lastIndexOf2 = stringValue3.lastIndexOf(str8);
                        String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 3) : null;
                        int i10 = 0;
                        char c3 = 0;
                        while (true) {
                            if (i10 >= i5) {
                                break;
                            }
                            String str9 = strArr[i10];
                            if (!stringValue3.startsWith(str9)) {
                                if (!stringValue3.contains(" " + str9)) {
                                    if (translitString4 != null) {
                                        if (!translitString4.startsWith(str9)) {
                                            if (translitString4.contains(" " + str9)) {
                                            }
                                        }
                                    }
                                    if (substring2 != null && substring2.startsWith(str9)) {
                                        c3 = 2;
                                    }
                                    if (c3 == 0) {
                                        NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                        if (byteBufferValue3 != null) {
                                            TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                            DialogSearchResult dialogSearchResult5 = new DialogSearchResult();
                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                            if (userStatus2 != null) {
                                                userStatus2.expires = queryFinalized4.intValue(1);
                                            }
                                            dialogSearchResult5.dialog.id = TLdeserialize3.id;
                                            dialogSearchResult5.object = TLdeserialize3;
                                            if (c3 == 1) {
                                                dialogSearchResult5.name = AndroidUtilities.generateSearchName(TLdeserialize3.first_name, TLdeserialize3.last_name, str9);
                                            } else {
                                                dialogSearchResult5.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(TLdeserialize3), null, "@" + str9);
                                            }
                                            arrayList3.add(dialogSearchResult5);
                                        }
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            c3 = 1;
                            if (c3 == 0) {
                            }
                        }
                        str2 = str8;
                    }
                }
                queryFinalized4.dispose();
                Collections.sort(arrayList3, new Comparator() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda4
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ShareAlert.ShareSearchAdapter.$r8$lambda$N2leCj1fsSDLiXy7aIlYyot2xnY(obj, obj2);
                    }
                });
                shareSearchAdapter.updateSearchResults(arrayList3, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static /* synthetic */ int $r8$lambda$N2leCj1fsSDLiXy7aIlYyot2xnY(Object obj, Object obj2) {
            int i = ((DialogSearchResult) obj).date;
            int i2 = ((DialogSearchResult) obj2).date;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }

        private void updateSearchResults(final ArrayList arrayList, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ShareAlert.ShareSearchAdapter.$r8$lambda$ryGJYuyvUmdNaKf2jinZWkvtsYg(ShareAlert.ShareSearchAdapter.this, i, arrayList);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$ryGJYuyvUmdNaKf2jinZWkvtsYg(ShareSearchAdapter shareSearchAdapter, int i, ArrayList arrayList) {
            if (i != shareSearchAdapter.lastSearchId) {
                return;
            }
            shareSearchAdapter.getItemCount();
            shareSearchAdapter.internalDialogsIsSearching = false;
            shareSearchAdapter.lastLocalSearchId = i;
            if (shareSearchAdapter.lastGlobalSearchId != i) {
                shareSearchAdapter.searchAdapterHelper.clear();
            }
            if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.searchAdapter) {
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLObject tLObject = ((DialogSearchResult) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) tLObject, true);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) tLObject, true);
                }
            }
            boolean z = !shareSearchAdapter.searchResult.isEmpty() && arrayList.isEmpty();
            if (shareSearchAdapter.searchResult.isEmpty()) {
                arrayList.isEmpty();
            }
            if (z) {
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBeforeSwitch = shareAlert2.getCurrentTop();
            }
            shareSearchAdapter.searchResult = arrayList;
            shareSearchAdapter.searchAdapterHelper.mergeResults(arrayList, null);
            int i3 = shareSearchAdapter.lastItemCont;
            if (shareSearchAdapter.getItemCount() == 0 && !shareSearchAdapter.searchAdapterHelper.isSearchInProgress() && !shareSearchAdapter.internalDialogsIsSearching) {
                ShareAlert.this.searchEmptyView.showProgress(false, true);
            } else {
                ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i3);
            }
            shareSearchAdapter.notifyDataSetChanged();
            ShareAlert.this.checkCurrentList(true);
        }

        public void searchDialogs(final String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                Runnable runnable = this.searchRunnable2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    final int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareAlert.ShareSearchAdapter.$r8$lambda$0cxqHqtisHdwDC_zPNU6q9eFmKQ(ShareAlert.ShareSearchAdapter.this, str, i);
                        }
                    };
                    this.searchRunnable = runnable2;
                    dispatchQueue.postRunnable(runnable2, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }

        public static /* synthetic */ void $r8$lambda$0cxqHqtisHdwDC_zPNU6q9eFmKQ(final ShareSearchAdapter shareSearchAdapter, final String str, final int i) {
            shareSearchAdapter.searchRunnable = null;
            shareSearchAdapter.searchDialogsInternal(str, i);
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ShareAlert.ShareSearchAdapter.$r8$lambda$IHKfdo-1KUm5Zj03fXogqdkP1n0(ShareAlert.ShareSearchAdapter.this, i, str);
                }
            };
            shareSearchAdapter.searchRunnable2 = runnable;
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static /* synthetic */ void $r8$lambda$IHKfdo-1KUm5Zj03fXogqdkP1n0(ShareSearchAdapter shareSearchAdapter, int i, String str) {
            shareSearchAdapter.searchRunnable2 = null;
            if (i != shareSearchAdapter.lastSearchId) {
                return;
            }
            shareSearchAdapter.searchAdapterHelper.queryServerSearch(str, true, true, true, true, false, 0L, false, 0, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.searchResultsStartRow = -1;
            this.lastFilledItem = -1;
            if (TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                this.firstEmptyViewCell = i;
                this.itemsCount = i + 2;
                this.hintsCell = i + 1;
                if (ShareAlert.this.recentSearchObjects.size() > 0) {
                    int i2 = this.itemsCount;
                    int i3 = i2 + 1;
                    this.itemsCount = i3;
                    this.resentTitleCell = i2;
                    this.recentDialogsStartRow = i3;
                    this.itemsCount = i3 + ShareAlert.this.recentSearchObjects.size();
                }
                int i4 = this.itemsCount;
                int i5 = i4 + 1;
                this.itemsCount = i5;
                this.lastFilledItem = i4;
                this.lastItemCont = i5;
                return i5;
            }
            int i6 = this.itemsCount;
            int i7 = i6 + 1;
            this.itemsCount = i7;
            this.firstEmptyViewCell = i6;
            this.searchResultsStartRow = i7;
            int size = i7 + this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size();
            this.itemsCount = size;
            if (size == 1) {
                this.firstEmptyViewCell = -1;
                this.itemsCount = 0;
                this.lastItemCont = 0;
                return 0;
            }
            int i8 = size + 1;
            this.itemsCount = i8;
            this.lastFilledItem = size;
            this.lastItemCont = i8;
            return i8;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = this.recentDialogsStartRow;
            if (i >= i2 && i2 >= 0) {
                int i3 = i - i2;
                if (i3 >= 0 && i3 < ShareAlert.this.recentSearchObjects.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i3)).object;
                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                    if (tLObject instanceof TLRPC.User) {
                        tL_dialog.id = ((TLRPC.User) tLObject).id;
                        return tL_dialog;
                    }
                    if (tLObject instanceof TLRPC.Chat) {
                        tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                        return tL_dialog;
                    }
                }
                return null;
            }
            int i4 = i - 1;
            if (i4 < 0) {
                return null;
            }
            if (i4 < this.searchResult.size()) {
                return ((DialogSearchResult) this.searchResult.get(i4)).dialog;
            }
            int size = i4 - this.searchResult.size();
            ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            if (size < localServerSearch.size()) {
                TLObject tLObject2 = (TLObject) localServerSearch.get(size);
                TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                if (tLObject2 instanceof TLRPC.User) {
                    tL_dialog2.id = ((TLRPC.User) tLObject2).id;
                    return tL_dialog2;
                }
                if (tLObject2 instanceof TLRPC.Chat) {
                    tL_dialog2.id = -((TLRPC.Chat) tLObject2).id;
                    return tL_dialog2;
                }
            }
            return null;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4) ? false : true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            if (i == 0) {
                view = new ProfileSearchCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider).useCustomPaints().showPremiumBlock(true);
            } else if (i != 2) {
                if (i == 3) {
                    GraySectionCell graySectionCell = new GraySectionCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                    graySectionCell.setTextColor(Theme.key_graySectionText);
                    graySectionCell.setBackgroundColor(ShareAlert.this.getThemedColor(Theme.key_graySection));
                    graySectionCell.setText(LocaleController.getString(R.string.Recent));
                    view2 = graySectionCell;
                } else if (i == 4) {
                    view2 = new View(this.context) { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.6
                        @Override // android.view.View
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, TLObject.FLAG_30));
                        }
                    };
                } else if (i == 5) {
                    View shareDialogCell = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider);
                    shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                    view2 = shareDialogCell;
                } else {
                    View view3 = new View(this.context);
                    view3.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                    view2 = view3;
                }
                view = view2;
            } else {
                RecyclerListView recyclerListView = new RecyclerListView(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.3
                    @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                this.categoryListView = recyclerListView;
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context) { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.4
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler = new DialogsSearchAdapter.CategoryAdapterRecycler(this.context, ((BottomSheet) ShareAlert.this).currentAccount, true, true, ((BottomSheet) ShareAlert.this).resourcesProvider) { // from class: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.5
                    @Override // org.telegram.ui.Adapters.DialogsSearchAdapter.CategoryAdapterRecycler, androidx.recyclerview.widget.RecyclerView.Adapter
                    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                        TLRPC.Chat chat;
                        String str;
                        HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                        if (ShareAlert.this.darkTheme || ShareAlert.this.forceDarkThemeForHint) {
                            hintDialogCell.setColors(Theme.key_voipgroup_nameText, Theme.key_voipgroup_inviteMembersBackground);
                        }
                        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i2);
                        TLRPC.Peer peer = tL_topPeer.peer;
                        long j = peer.user_id;
                        TLRPC.User user = null;
                        if (j != 0) {
                            user = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                            chat = null;
                        } else {
                            long j2 = peer.channel_id;
                            if (j2 != 0) {
                                j = -j2;
                                chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                            } else {
                                long j3 = peer.chat_id;
                                if (j3 != 0) {
                                    j = -j3;
                                    chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                                } else {
                                    chat = null;
                                    j = 0;
                                }
                            }
                        }
                        boolean z = j == hintDialogCell.getDialogId();
                        hintDialogCell.setTag(Long.valueOf(j));
                        if (user != null) {
                            str = UserObject.getFirstName(user);
                        } else {
                            str = chat != null ? chat.title : "";
                        }
                        hintDialogCell.setDialog(j, true, str);
                        hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, z);
                    }
                };
                this.categoryAdapter = categoryAdapterRecycler;
                recyclerListView.setAdapter(categoryAdapterRecycler);
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Components.ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda1
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                    public final void onItemClick(View view4, int i2) {
                        ShareAlert.ShareSearchAdapter.$r8$lambda$OM-TumkQWqmSerVEXR5Az7T29lI(ShareAlert.ShareSearchAdapter.this, view4, i2);
                    }
                });
                view = recyclerListView;
            }
            return new RecyclerListView.Holder(view);
        }

        public static /* synthetic */ void $r8$lambda$OM-TumkQWqmSerVEXR5Az7T29lI(ShareSearchAdapter shareSearchAdapter, View view, int i) {
            shareSearchAdapter.getClass();
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i);
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            if (j == 0) {
                long j2 = peer.channel_id;
                if (j2 == 0) {
                    j2 = peer.chat_id;
                    if (j2 == 0) {
                        j = 0;
                    }
                }
                j = -j2;
            }
            if (hintDialogCell.isBlocked()) {
                ShareAlert.this.showPremiumBlockedToast(hintDialogCell, j);
                return;
            }
            tL_dialog.id = j;
            ShareAlert.this.selectDialog(null, tL_dialog);
            hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.text.SpannableStringBuilder] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            String str;
            String str2;
            long j2;
            int indexOfIgnoreCase;
            TLObject tLObject;
            CharSequence charSequence;
            int indexOfIgnoreCase2;
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 5) {
                TLObject tLObject2 = null;
                r6 = null;
                String formatName = null;
                TLRPC.TL_encryptedChat tL_encryptedChat = null;
                if (TextUtils.isEmpty(this.lastSearchText)) {
                    int i2 = this.recentDialogsStartRow;
                    long j3 = 0;
                    if (i2 < 0 || i < i2) {
                        tLObject = null;
                        charSequence = null;
                    } else {
                        TLObject tLObject3 = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i - i2)).object;
                        if (tLObject3 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject3;
                            j3 = user.id;
                            formatName = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                            j3 = -chat.id;
                            formatName = chat.title;
                        } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                            tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                            TLRPC.User user2 = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_encryptedChat.user_id));
                            if (user2 != null) {
                                j3 = user2.id;
                                formatName = ContactsController.formatName(user2.first_name, user2.last_name);
                            }
                        }
                        String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        if (TextUtils.isEmpty(lastFoundUsername) || formatName == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(formatName.toString(), lastFoundUsername)) == -1) {
                            tLObject = tLObject3;
                            charSequence = formatName;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatName);
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), indexOfIgnoreCase2, lastFoundUsername.length() + indexOfIgnoreCase2, 33);
                            tLObject = tLObject3;
                            charSequence = spannableStringBuilder;
                        }
                    }
                    TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
                    View view = viewHolder.itemView;
                    if (view instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) view).setData(tLObject, tL_encryptedChat2, charSequence, null, false, false);
                        ((ProfileSearchCell) viewHolder.itemView).useSeparator = i < getItemCount() + (-2);
                        return;
                    } else {
                        CharSequence charSequence2 = charSequence;
                        if (view instanceof ShareDialogCell) {
                            ((ShareDialogCell) view).setDialog(j3, ShareAlert.this.selectedDialogs.indexOfKey(j3) >= 0, charSequence2);
                            return;
                        }
                        return;
                    }
                }
                int i3 = i - 1;
                if (i3 < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(i3);
                    j2 = dialogSearchResult.dialog.id;
                    str2 = dialogSearchResult.name;
                } else {
                    i3 -= this.searchResult.size();
                    tLObject2 = (TLObject) this.searchAdapterHelper.getLocalServerSearch().get(i3);
                    if (tLObject2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) tLObject2;
                        j = user3.id;
                        str = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                        j = -chat2.id;
                        str = chat2.title;
                    }
                    String lastFoundUsername2 = this.searchAdapterHelper.getLastFoundUsername();
                    if (TextUtils.isEmpty(lastFoundUsername2) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), lastFoundUsername2)) == -1) {
                        str2 = str;
                    } else {
                        ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), indexOfIgnoreCase, lastFoundUsername2.length() + indexOfIgnoreCase, 33);
                        str2 = spannableStringBuilder2;
                    }
                    j2 = j;
                }
                TLObject tLObject4 = tLObject2;
                View view2 = viewHolder.itemView;
                if (view2 instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view2).setData(tLObject4, null, str2, null, false, false);
                    ((ProfileSearchCell) viewHolder.itemView).useSeparator = i3 < getItemCount() + (-2);
                    return;
                } else {
                    if (view2 instanceof ShareDialogCell) {
                        ((ShareDialogCell) view2).setDialog(j2, ShareAlert.this.selectedDialogs.indexOfKey(j2) >= 0, str2);
                        return;
                    }
                    return;
                }
            }
            if (viewHolder.getItemViewType() == 2) {
                ((RecyclerListView) viewHolder.itemView).getAdapter().notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == this.lastFilledItem) {
                return 4;
            }
            if (i == this.firstEmptyViewCell) {
                return 1;
            }
            if (i == this.hintsCell) {
                return 2;
            }
            if (i == this.resentTitleCell) {
                return 3;
            }
            return TextUtils.isEmpty(this.lastSearchText) ? 0 : 5;
        }

        public int getSpanSize(int i, int i2) {
            if (i2 == this.hintsCell || i2 == this.resentTitleCell || i2 == this.firstEmptyViewCell || i2 == this.lastFilledItem || getItemViewType(i2) == 0) {
                return i;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCurrentList(boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.searchView.editText.getText()) || ((this.keyboardVisible && this.searchView.editText.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            this.searchAdapter.notifyDataSetChanged();
            this.listAdapter.notifyDataSetChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, -this.searchGridView.getPaddingTop());
                } else {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - this.searchGridView.getPaddingTop());
                }
                this.searchAdapter.searchDialogs(this.searchView.editText.getText().toString());
                return;
            }
            if (this.lastOffset == Integer.MAX_VALUE) {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    private String getLink() {
        String str;
        SwitchView switchView = this.switchView;
        if (switchView != null) {
            str = this.linkToCopy[switchView.currentTab];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
            str = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            if (str == null) {
                str = this.linkToCopy[0];
            }
        }
        CheckBox2 checkBox2 = this.timestampCheckbox;
        if (checkBox2 != null && checkBox2.isChecked()) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.timestamp)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLinkTextView() {
        if (this.linkTextView != null) {
            String link = getLink();
            if (link != null) {
                if (link.startsWith("https://")) {
                    link = link.substring(8);
                } else if (link.startsWith("http://")) {
                    link = link.substring(7);
                }
            }
            this.linkTextView.setText(link);
        }
    }

    public void updateBottomOverlay() {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        if (this.frameLayout2 == null) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        float f = 0.0f;
        if (editTextEmoji != null && editTextEmoji.isPopupVisible()) {
            this.keyboardT = this.commentTextView.getEmojiPaddingShown();
        } else {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
            if (sizeNotifierFrameLayout != null && (adjustPanLayoutHelper = sizeNotifierFrameLayout.adjustPanLayoutHelper) != null && !adjustPanLayoutHelper.animationInProgress()) {
                this.keyboardT = this.keyboardSize2 > AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f;
            }
        }
        FrameLayout frameLayout = this.timestampFrameLayout;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.pickerBottom;
        if (frameLayout2 != null) {
            float f2 = -f;
            frameLayout2.setTranslationY(f2);
            LinearLayout linearLayout = this.sharesCountLayout;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f2);
            }
        }
        float f3 = -f;
        this.frameLayout2.setTranslationY(f3);
        this.writeButtonContainer.setTranslationY(f3);
    }

    private void onTopicCellClick(TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Dialog dialog;
        if (tL_forumTopic == null || (dialog = this.selectedTopicDialog) == null) {
            return;
        }
        long j = dialog.id;
        boolean isMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(j);
        TLRPC.Dialog dialog2 = this.selectedTopicDialog;
        this.selectedDialogs.put(j, dialog2);
        this.selectedDialogTopics.put(dialog2, tL_forumTopic);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog2.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog2.id, dialog2);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog2);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(tL_forumTopic, isMonoForum, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    private void onTopicCreateCellClick() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        this.selectedDialogs.put(dialog.id, dialog);
        this.selectedDialogTopics.remove(dialog);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog.id, dialog);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(null, false, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }
}
