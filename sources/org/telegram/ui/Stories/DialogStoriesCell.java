package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;

/* loaded from: classes5.dex */
public abstract class DialogStoriesCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public float K;
    private ActionBar actionBar;
    Adapter adapter;
    Paint addCirclePaint;
    private final Drawable addNewStoryDrawable;
    private int addNewStoryLastColor;
    ArrayList afterNextLayout;
    public boolean allowGlobalUpdates;
    ArrayList animateToDialogIds;
    private Runnable animationRunnable;
    private final BoolAnimator animatorHasTitleText;
    Paint backgroundPaint;
    private long checkedStoryNotificationDeletion;
    private int clipTop;
    boolean collapsed;
    private ValueAnimator collapsedOvershootAnimator;
    private float collapsedOvershootProgress;
    float collapsedProgress;
    private float collapsedProgress1;
    private float collapsedProgress2;
    private float collapsedSpringCoef;
    Comparator comparator;
    int currentAccount;
    public int currentCellWidth;
    int currentState;
    private CharSequence currentTitle;
    boolean drawCircleForce;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeGradientMatrix;
    private Paint ellipsizePaint;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    ImageView emojiStatusView;
    private ValueAnimator expandOvershootAnimator;
    private float expandOvershootAnimatorProgress;
    private float expandedSpringCoef;
    BaseFragment fragment;
    private StoriesUtilities.EnsureStoryFileLoadedObject globalCancelable;
    Paint grayPaint;
    private boolean hasOverlayText;
    DefaultItemAnimator itemAnimator;
    ArrayList items;
    private boolean lastUploadingCloseFriends;
    LinearLayoutManager layoutManager;
    RecyclerListView listViewMini;
    private float menuItemsOffset;
    Adapter miniAdapter;
    private final DefaultItemAnimator miniItemAnimator;
    ArrayList miniItems;
    CanvasButton miniItemsClickArea;
    ArrayList oldItems;
    ArrayList oldMiniItems;
    private float overScrollCoef;
    private int overlayTextId;
    private float overscrollProgress;
    private int overscrollSelectedPosition;
    private StoryCell overscrollSelectedView;
    private HintView2 premiumHint;
    private Drawable premiumStar;
    public RadialProgress radialProgress;
    public RecyclerListView recyclerListView;
    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    AnimatorSet storiesAnimatorSet;
    private OvershootInterpolator storiesCollapseInterpolator;
    StoriesController storiesController;
    private OvershootInterpolator storiesExpandInterpolator;
    ActionBarAnimatedSubtitleOverlayContainer subtitleOverlayContainer;
    ImageView telegramLogoView;
    private ValueAnimator textAnimator;
    AnimatedTextView titleView;
    private final int type;
    boolean updateOnIdleState;
    private SpannableStringBuilder uploadingString;
    private ValueAnimator valueAnimator;
    ArrayList viewsDrawInParent;
    private ValueAnimator yStoriesAnimator;
    private float yStoriesProgress;

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public abstract void onMiniListClicked();

    public abstract void onUserLongPressed(View view, long j);

    public DialogStoriesCell(Context context, BaseFragment baseFragment, int i, int i2) {
        super(context);
        this.animatorHasTitleText = new BoolAnimator(1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.oldItems = new ArrayList();
        this.oldMiniItems = new ArrayList();
        this.items = new ArrayList();
        this.miniItems = new ArrayList();
        this.adapter = new Adapter(false);
        this.miniAdapter = new Adapter(true);
        this.grayPaint = new Paint();
        this.addCirclePaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.miniItemsClickArea = new CanvasButton(this);
        this.collapsedProgress = -1.0f;
        this.currentState = -1;
        this.viewsDrawInParent = new ArrayList();
        this.animateToDialogIds = new ArrayList();
        this.afterNextLayout = new ArrayList();
        this.collapsedProgress1 = -1.0f;
        this.allowGlobalUpdates = true;
        this.overScrollCoef = 1.0f;
        this.collapsedSpringCoef = 0.95f;
        this.expandedSpringCoef = 0.9f;
        this.comparator = new Comparator() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DialogStoriesCell.$r8$lambda$mrKyDE7kqyAfP266l3FH_xwibtA((DialogStoriesCell.StoryCell) obj, (DialogStoriesCell.StoryCell) obj2);
            }
        };
        this.K = 0.3f;
        this.collapsedOvershootProgress = 1.0f;
        this.storiesExpandInterpolator = new OvershootInterpolator(this.expandedSpringCoef);
        this.storiesCollapseInterpolator = new OvershootInterpolator(this.collapsedSpringCoef);
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        this.type = i2;
        this.currentAccount = i;
        this.fragment = baseFragment;
        this.menuItemsOffset = AndroidUtilities.dp(68.0f);
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.Stories.DialogStoriesCell.1
            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (DialogStoriesCell.this.viewsDrawInParent.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                for (int i7 = 0; i7 < DialogStoriesCell.this.afterNextLayout.size(); i7++) {
                    ((Runnable) DialogStoriesCell.this.afterNextLayout.get(i7)).run();
                }
                DialogStoriesCell.this.afterNextLayout.clear();
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || (DialogStoriesCell.this.collapsedProgress1 <= 0.2f && DialogStoriesCell.this.getAlpha() != 0.0f)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.miniItemsClickArea.setDelegate(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                DialogStoriesCell.this.onMiniListClicked();
            }
        });
        this.miniItemsClickArea.setLongPress(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                DialogStoriesCell.this.getClass();
            }
        });
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                super.onScrolled(recyclerView, i3, i4);
                DialogStoriesCell.this.invalidate();
                DialogStoriesCell.this.checkLoadMore();
                if (DialogStoriesCell.this.premiumHint != null) {
                    DialogStoriesCell.this.premiumHint.hide();
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setDelayAnimations(false);
        this.itemAnimator.setDurations(150L);
        this.itemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(this.itemAnimator);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda9
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i3) {
                DialogStoriesCell.$r8$lambda$xFWur6qm8_1KfUznYA6ylL3EWxQ(DialogStoriesCell.this, view, i3);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda10
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i3) {
                return DialogStoriesCell.$r8$lambda$iZpO6_i7iOjjk-qrorlW7zdmwI4(DialogStoriesCell.this, view, i3);
            }
        });
        this.recyclerListView.setAdapter(this.adapter);
        addView(this.recyclerListView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, false);
        this.titleView = animatedTextView;
        animatedTextView.setGravity(3);
        this.titleView.setTextColor(getTextLogoColor());
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.titleView.setImportantForAccessibility(1);
        this.titleView.setFocusableInTouchMode(true);
        addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f));
        ImageView imageView = new ImageView(context);
        this.telegramLogoView = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        this.telegramLogoView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.telegramLogoView.setImageResource(R.drawable.telegram_logo_2);
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        this.telegramLogoView.setImportantForAccessibility(1);
        this.telegramLogoView.setFocusableInTouchMode(true);
        addView(this.telegramLogoView, LayoutHelper.createFrame(90, 22.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, AndroidUtilities.dp(26.0f));
        this.statusDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.center = true;
        swapAnimatedEmojiDrawable.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.emojiStatusView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.emojiStatusView.setImageDrawable(this.statusDrawable);
        addView(this.emojiStatusView, LayoutHelper.createFrame(40, 40.0f));
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = new ActionBarAnimatedSubtitleOverlayContainer(context, null, this.ellipsizeSpanAnimator) { // from class: org.telegram.ui.Stories.DialogStoriesCell.6
            @Override // org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer, me.vkryl.android.animator.ReplaceAnimator.Callback
            public void onItemChanged(ReplaceAnimator replaceAnimator) {
                super.onItemChanged(replaceAnimator);
                DialogStoriesCell.this.invalidate();
            }
        };
        this.subtitleOverlayContainer = actionBarAnimatedSubtitleOverlayContainer;
        addView(actionBarAnimatedSubtitleOverlayContainer, LayoutHelper.createFrame(-2, -2.0f));
        this.grayPaint.setColor(-2762018);
        this.grayPaint.setStyle(Paint.Style.STROKE);
        this.grayPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.addNewStoryDrawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_addstory);
        RecyclerListView recyclerListView3 = new RecyclerListView(getContext()) { // from class: org.telegram.ui.Stories.DialogStoriesCell.7
            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // org.telegram.ui.Components.RecyclerListView, androidx.recyclerview.widget.RecyclerView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                DialogStoriesCell.this.viewsDrawInParent.clear();
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    StoryCell storyCell = (StoryCell) getChildAt(i4);
                    int childAdapterPosition = getChildAdapterPosition(storyCell);
                    storyCell.position = childAdapterPosition;
                    boolean z = true;
                    storyCell.drawInParent = true;
                    storyCell.isFirst = childAdapterPosition == 0;
                    if (childAdapterPosition != DialogStoriesCell.this.miniItems.size() - 1) {
                        z = false;
                    }
                    storyCell.isLast = z;
                    DialogStoriesCell.this.viewsDrawInParent.add(storyCell);
                }
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                Collections.sort(dialogStoriesCell.viewsDrawInParent, dialogStoriesCell.comparator);
                while (i3 < DialogStoriesCell.this.viewsDrawInParent.size()) {
                    StoryCell storyCell2 = (StoryCell) DialogStoriesCell.this.viewsDrawInParent.get(i3);
                    int save = canvas.save();
                    canvas.translate(storyCell2.getX(), storyCell2.getY());
                    if (storyCell2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (storyCell2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(storyCell2.getScaleX(), storyCell2.getScaleY(), AndroidUtilities.dp(14.0f), storyCell2.getCy());
                    storyCell2.draw(canvas2);
                    canvas2.restoreToCount(save);
                    i3++;
                    canvas = canvas2;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView
            public void onScrolled(int i3, int i4) {
                super.onScrolled(i3, i4);
                if (DialogStoriesCell.this.premiumHint != null) {
                    DialogStoriesCell.this.premiumHint.hide();
                }
            }
        };
        this.listViewMini = recyclerListView3;
        recyclerListView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.listViewMini.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: org.telegram.ui.Stories.DialogStoriesCell.8
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
                rect.setEmpty();
                if (childLayoutPosition == 1) {
                    rect.left = (-AndroidUtilities.dp(85.0f)) + AndroidUtilities.dp(31.0f);
                } else if (childLayoutPosition == 2) {
                    rect.left = (-AndroidUtilities.dp(85.0f)) + AndroidUtilities.dp(31.0f);
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() { // from class: org.telegram.ui.Stories.DialogStoriesCell.9
            @Override // androidx.recyclerview.widget.DefaultItemAnimator
            protected float animateByScale(View view) {
                return 0.6f;
            }
        };
        this.miniItemAnimator = defaultItemAnimator2;
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setSupportsChangeAnimations(false);
        this.listViewMini.setItemAnimator(defaultItemAnimator2);
        this.listViewMini.setAdapter(this.miniAdapter);
        this.listViewMini.setClipChildren(false);
        addView(this.listViewMini, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        checkUi_titleVisibility();
        updateItems(false, false);
    }

    public static /* synthetic */ void $r8$lambda$xFWur6qm8_1KfUznYA6ylL3EWxQ(DialogStoriesCell dialogStoriesCell, View view, int i) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.openStoryForCell((StoryCell) view, false);
    }

    public static /* synthetic */ boolean $r8$lambda$iZpO6_i7iOjjk-qrorlW7zdmwI4(DialogStoriesCell dialogStoriesCell, View view, int i) {
        if (dialogStoriesCell.collapsedProgress != 0.0f || dialogStoriesCell.overscrollProgress != 0.0f) {
            return false;
        }
        dialogStoriesCell.onUserLongPressed(view, ((StoryCell) view).dialogId);
        return false;
    }

    public void setMenuItemsOffset(float f) {
        this.menuItemsOffset = f;
    }

    public void openStoryForCell(StoryCell storyCell) {
        openStoryForCell(storyCell, false);
    }

    private void openStoryForCell(final StoryCell storyCell, boolean z) {
        ValueAnimator valueAnimator;
        if ((z && (valueAnimator = this.expandOvershootAnimator) != null && valueAnimator.isRunning()) || storyCell == null) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        if (storyCell.isSelf && !this.storiesController.hasSelfStories()) {
            if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                showPremiumHint();
                return;
            } else {
                openStoryRecorder();
                return;
            }
        }
        if (this.storiesController.hasStories(storyCell.dialogId) || this.storiesController.hasUploadingStories(storyCell.dialogId)) {
            TL_stories.PeerStories stories = this.storiesController.getStories(storyCell.dialogId);
            final long j = storyCell.dialogId;
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.globalCancelable = null;
            }
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    DialogStoriesCell.$r8$lambda$8OYoFk9fxNC3d_gkA7fmbD7OTnM(DialogStoriesCell.this, storyCell, j);
                }
            };
            if (z) {
                runnable.run();
                return;
            }
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoaded = StoriesUtilities.ensureStoryFileLoaded(stories, runnable);
            storyCell.cancellable = ensureStoryFileLoaded;
            this.globalCancelable = ensureStoryFileLoaded;
            if (ensureStoryFileLoaded != null) {
                this.storiesController.setLoading(storyCell.dialogId, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$8OYoFk9fxNC3d_gkA7fmbD7OTnM(final DialogStoriesCell dialogStoriesCell, StoryCell storyCell, final long j) {
        boolean z;
        final boolean z2;
        boolean z3;
        BaseFragment baseFragment = dialogStoriesCell.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int i = storyCell.position;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= dialogStoriesCell.items.size()) {
                z = true;
                break;
            }
            long j2 = ((Item) dialogStoriesCell.items.get(i2)).dialogId;
            if (j2 != UserConfig.getInstance(dialogStoriesCell.currentAccount).clientUserId && dialogStoriesCell.storiesController.hasUnreadStories(j2)) {
                z = false;
                break;
            }
            i2++;
        }
        if (storyCell.isSelf && (!z || dialogStoriesCell.items.size() == 1)) {
            arrayList.add(Long.valueOf(storyCell.dialogId));
            z2 = true;
        } else {
            if (!storyCell.isSelf && dialogStoriesCell.storiesController.hasUnreadStories(storyCell.dialogId)) {
                for (int i3 = 0; i3 < dialogStoriesCell.items.size(); i3++) {
                    long j3 = ((Item) dialogStoriesCell.items.get(i3)).dialogId;
                    if (!storyCell.isSelf && dialogStoriesCell.storiesController.hasUnreadStories(j3)) {
                        arrayList.add(Long.valueOf(j3));
                    }
                    if (j3 == storyCell.dialogId) {
                        i = arrayList.size() - 1;
                    }
                }
                z2 = false;
                z3 = true;
                StoryViewer orCreateStoryViewer = dialogStoriesCell.fragment.getOrCreateStoryViewer();
                orCreateStoryViewer.doOnAnimationReady(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogStoriesCell.this.storiesController.setLoading(j, false);
                    }
                });
                orCreateStoryViewer.open(dialogStoriesCell.getContext(), null, arrayList, i, null, null, StoriesListPlaceProvider.of(dialogStoriesCell.recyclerListView).with(new StoriesListPlaceProvider.LoadNextInterface() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda18
                    @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.LoadNextInterface
                    public final void loadNext(boolean z4) {
                        DialogStoriesCell.$r8$lambda$x0us1vaudtfA-_a2EN8Y0lqrdM8(DialogStoriesCell.this, z2, z4);
                    }
                }).setPaginationParaments(dialogStoriesCell.type == 1, z3, z2), false);
            }
            for (int i4 = 0; i4 < dialogStoriesCell.items.size(); i4++) {
                if (dialogStoriesCell.storiesController.hasStories(((Item) dialogStoriesCell.items.get(i4)).dialogId)) {
                    arrayList.add(Long.valueOf(((Item) dialogStoriesCell.items.get(i4)).dialogId));
                } else if (i4 <= i) {
                    i--;
                }
            }
            z2 = false;
        }
        z3 = false;
        StoryViewer orCreateStoryViewer2 = dialogStoriesCell.fragment.getOrCreateStoryViewer();
        orCreateStoryViewer2.doOnAnimationReady(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                DialogStoriesCell.this.storiesController.setLoading(j, false);
            }
        });
        orCreateStoryViewer2.open(dialogStoriesCell.getContext(), null, arrayList, i, null, null, StoriesListPlaceProvider.of(dialogStoriesCell.recyclerListView).with(new StoriesListPlaceProvider.LoadNextInterface() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda18
            @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.LoadNextInterface
            public final void loadNext(boolean z4) {
                DialogStoriesCell.$r8$lambda$x0us1vaudtfA-_a2EN8Y0lqrdM8(DialogStoriesCell.this, z2, z4);
            }
        }).setPaginationParaments(dialogStoriesCell.type == 1, z3, z2), false);
    }

    public static /* synthetic */ void $r8$lambda$x0us1vaudtfA-_a2EN8Y0lqrdM8(DialogStoriesCell dialogStoriesCell, boolean z, boolean z2) {
        dialogStoriesCell.getClass();
        if (!z && z2) {
            dialogStoriesCell.storiesController.loadNextStories(dialogStoriesCell.type == 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLoadMore() {
        if (this.layoutManager.findLastVisibleItemPosition() + 10 > this.items.size() || isReadAtPosition(this.layoutManager.findLastVisibleItemPosition() + 9)) {
            this.storiesController.loadNextStories(this.type == 1);
        }
    }

    private boolean isReadAtPosition(int i) {
        return i < this.items.size() && this.storiesController.getUnreadState(((Item) this.items.get(i)).dialogId) == 0;
    }

    public float getOverScrollCoef() {
        return this.overScrollCoef;
    }

    public void updateItems(boolean z, boolean z2) {
        boolean z3 = true;
        if ((this.currentState == 1 || this.overscrollProgress != 0.0f) && !z2) {
            this.updateOnIdleState = true;
            return;
        }
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.oldMiniItems.clear();
        this.oldMiniItems.addAll(this.miniItems);
        this.items.clear();
        if (this.type != 1) {
            this.items.add(new Item(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        }
        ArrayList hiddenList = this.type == 1 ? this.storiesController.getHiddenList() : this.storiesController.getDialogListStories();
        for (int i = 0; i < hiddenList.size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) hiddenList.get(i)).peer);
            if (peerDialogId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.items.add(new Item(peerDialogId));
            }
        }
        int size = this.items.size();
        if (!this.storiesController.hasSelfStories()) {
            size--;
        }
        int max = Math.max(1, Math.max(this.storiesController.getTotalStoriesCount(this.type == 1), size));
        this.currentTitle = null;
        if (this.storiesController.hasOnlySelfStories()) {
            if (this.storiesController.hasUploadingStories(UserConfig.getInstance(this.currentAccount).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.uploadingString == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
                        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                        valueOf.setSpan(uploadingDotsSpannable, valueOf.length() - 1, valueOf.length(), 0);
                        uploadingDotsSpannable.setParent(this.titleView, true);
                        this.uploadingString = valueOf;
                    }
                    this.currentTitle = this.uploadingString;
                } else {
                    this.currentTitle = string;
                }
            } else {
                this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", max, new Object[0]);
        }
        if (!this.hasOverlayText) {
            this.titleView.setText(this.currentTitle, z && !LocaleController.isRTL);
        }
        BoolAnimator boolAnimator = this.animatorHasTitleText;
        if (TextUtils.isEmpty(this.currentTitle) && !this.hasOverlayText) {
            z3 = false;
        }
        boolAnimator.setValue(z3, z);
        this.miniItems.clear();
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            if (((Item) this.items.get(i2)).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId || shouldDrawSelfInMini()) {
                this.miniItems.add((Item) this.items.get(i2));
                if (this.miniItems.size() >= 3) {
                    break;
                }
            }
        }
        if (z) {
            if (this.currentState == 2) {
                this.listViewMini.setItemAnimator(this.miniItemAnimator);
                this.recyclerListView.setItemAnimator(null);
            } else {
                this.recyclerListView.setItemAnimator(this.itemAnimator);
                this.listViewMini.setItemAnimator(null);
            }
        } else {
            this.recyclerListView.setItemAnimator(null);
            this.listViewMini.setItemAnimator(null);
        }
        this.adapter.setItems(this.oldItems, this.items);
        this.miniAdapter.setItems(this.oldMiniItems, this.miniItems);
        this.oldItems.clear();
        invalidate();
    }

    private boolean shouldDrawSelfInMini() {
        if (this.storiesController.hasUnreadStories(UserConfig.getInstance(this.currentAccount).clientUserId)) {
            return true;
        }
        return this.storiesController.hasSelfStories() && this.storiesController.getDialogListStories().size() <= 3;
    }

    public static /* synthetic */ int $r8$lambda$mrKyDE7kqyAfP266l3FH_xwibtA(StoryCell storyCell, StoryCell storyCell2) {
        return storyCell2.position - storyCell.position;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03bc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        float f6;
        boolean z;
        float f7;
        boolean z2;
        float f8;
        float f9;
        float dp;
        float f10;
        float lerp;
        float f11;
        float f12;
        float lerp2;
        float lerp3;
        float f13;
        double pow;
        float f14;
        int childAdapterPosition;
        canvas.save();
        int i2 = this.clipTop;
        boolean z3 = false;
        if (i2 > 0) {
            canvas.clipRect(0, i2, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f15 = 0.0f;
        float lerp4 = AndroidUtilities.lerp(0.0f, measuredHeight, this.collapsedProgress1);
        this.recyclerListView.setTranslationY(lerp4);
        this.listViewMini.setTranslationY(lerp4);
        this.listViewMini.setTranslationX(this.menuItemsOffset);
        for (int i3 = 0; i3 < this.viewsDrawInParent.size(); i3++) {
            ((StoryCell) this.viewsDrawInParent.get(i3)).drawInParent = false;
        }
        this.viewsDrawInParent.clear();
        int i4 = this.currentState;
        int i5 = -1;
        if ((i4 == 1 || i4 == 0) && !this.animateToDialogIds.isEmpty()) {
            i = -1;
            for (int i6 = 0; i6 < this.recyclerListView.getChildCount(); i6++) {
                StoryCell storyCell = (StoryCell) this.recyclerListView.getChildAt(i6);
                if (storyCell.dialogId == ((Long) this.animateToDialogIds.get(0)).longValue()) {
                    i = this.recyclerListView.getChildAdapterPosition(storyCell);
                }
            }
        } else {
            i = this.currentState == 2 ? 0 : -1;
        }
        int i7 = this.currentState;
        if (i7 >= 0 && i7 != 2) {
            if (i == -1) {
                i = this.layoutManager.findFirstCompletelyVisibleItemPosition();
                if (i == -1) {
                    i = this.layoutManager.findFirstVisibleItemPosition();
                }
                z = true;
            } else {
                z = false;
            }
            f2 = 4.0f;
            f3 = 16.0f;
            this.recyclerListView.setAlpha(1.0f - Utilities.clamp(this.collapsedProgress / this.K, 1.0f, 0.0f));
            this.overscrollSelectedPosition = -1;
            if (this.overscrollProgress != 0.0f) {
                int i8 = 0;
                int i9 = -1;
                while (i8 < this.recyclerListView.getChildCount()) {
                    View childAt = this.recyclerListView.getChildAt(i8);
                    if (childAt.getX() < f15) {
                        f14 = lerp4;
                    } else if (childAt.getX() + childAt.getMeasuredWidth() <= getMeasuredWidth() && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt)) >= 0 && (i9 == i5 || childAdapterPosition < i9)) {
                        f14 = lerp4;
                        if (((Item) this.items.get(childAdapterPosition)).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            this.overscrollSelectedView = (StoryCell) childAt;
                            i9 = childAdapterPosition;
                        }
                        i8++;
                        lerp4 = f14;
                        i5 = -1;
                        f15 = 0.0f;
                    } else {
                        f14 = lerp4;
                    }
                    i8++;
                    lerp4 = f14;
                    i5 = -1;
                    f15 = 0.0f;
                }
                f = lerp4;
                f4 = 2.0f;
                this.overscrollSelectedPosition = i9;
            } else {
                f = lerp4;
                f4 = 2.0f;
            }
            float f16 = 0.0f;
            int i10 = 0;
            while (i10 < this.recyclerListView.getChildCount()) {
                StoryCell storyCell2 = (StoryCell) this.recyclerListView.getChildAt(i10);
                storyCell2.setClipInParent(z3);
                int childAdapterPosition2 = this.recyclerListView.getChildAdapterPosition(storyCell2);
                float f17 = this.collapsedProgress;
                if (childAdapterPosition2 >= i && childAdapterPosition2 < this.animateToDialogIds.size() + i) {
                    int i11 = childAdapterPosition2 - i;
                    if (i11 == i + 2) {
                        f17 = this.collapsedProgress;
                    } else {
                        if (i11 == i + 1) {
                            pow = Math.pow(this.collapsedProgress, 0.5d);
                        } else {
                            pow = Math.pow(this.collapsedProgress, 0.25d);
                        }
                        f17 = (float) pow;
                    }
                }
                if (childAdapterPosition2 < i) {
                    f17 = (float) Math.pow(this.collapsedProgress, 0.25d);
                }
                storyCell2.setProgressToCollapsed(f17, this.collapsedProgress2, this.overscrollProgress, this.overscrollSelectedPosition == storyCell2.position);
                if (childAdapterPosition2 > i && childAdapterPosition2 < this.animateToDialogIds.size() + i) {
                    StoryCell storyCell3 = (StoryCell) this.recyclerListView.getChildAt(i10 - 1);
                    if (storyCell3 != null) {
                        float dp2 = AndroidUtilities.dp(48.0f);
                        float dp3 = AndroidUtilities.dp(26.33f);
                        float lerp5 = AndroidUtilities.lerp(dp2, dp3, storyCell3.progressToCollapsed) + AndroidUtilities.dp(8.0f);
                        float lerp6 = (AndroidUtilities.lerp(dp2, dp3, storyCell2.progressToCollapsed) + AndroidUtilities.dp(8.0f)) / f4;
                        float centerX = storyCell3.params.originalAvatarRect.centerX() + storyCell3.getX();
                        float centerY = storyCell3.params.originalAvatarRect.centerY() + storyCell3.getY();
                        float centerX2 = (storyCell2.params.originalAvatarRect.centerX() + storyCell2.getX()) - centerX;
                        float centerY2 = (storyCell2.params.originalAvatarRect.centerY() + storyCell2.getY()) - centerY;
                        f7 = measuredHeight;
                        z2 = z;
                        if (((float) Math.sqrt((centerX2 * centerX2) + (centerY2 * centerY2))) < (lerp5 / f4) + lerp6) {
                            float degrees = (float) Math.toDegrees(Math.acos(r2 / r13) * 2.0d);
                            float degrees2 = (float) Math.toDegrees(Math.atan2(centerY2, centerX2));
                            float f18 = degrees / f4;
                            StoriesUtilities.AvatarStoryParams avatarStoryParams = storyCell3.params;
                            avatarStoryParams.rightTopAngleToExclude = degrees2 - f18;
                            avatarStoryParams.rightBottomAngleToExclude = degrees2 + f18;
                            float degrees3 = (float) Math.toDegrees(Math.atan2(-centerY2, -centerX2));
                            float f19 = -Math.abs(degrees3 - f18);
                            float abs = Math.abs(degrees3 + f18);
                            StoriesUtilities.AvatarStoryParams avatarStoryParams2 = storyCell2.params;
                            avatarStoryParams2.leftTopAngleToExclude = f19;
                            avatarStoryParams2.leftBottomAngleToExclude = abs;
                            f8 = 0.0f;
                        } else {
                            StoriesUtilities.AvatarStoryParams avatarStoryParams3 = storyCell3.params;
                            f8 = 0.0f;
                            avatarStoryParams3.rightTopAngleToExclude = 0.0f;
                            avatarStoryParams3.rightBottomAngleToExclude = 0.0f;
                            StoriesUtilities.AvatarStoryParams avatarStoryParams4 = storyCell2.params;
                            avatarStoryParams4.leftTopAngleToExclude = 0.0f;
                            avatarStoryParams4.leftBottomAngleToExclude = 0.0f;
                        }
                        storyCell3.params.useArcProgress = false;
                        storyCell2.params.useArcProgress = false;
                    } else {
                        f7 = measuredHeight;
                        z2 = z;
                        f8 = 0.0f;
                    }
                } else {
                    f7 = measuredHeight;
                    z2 = z;
                    f8 = 0.0f;
                    StoriesUtilities.AvatarStoryParams avatarStoryParams5 = storyCell2.params;
                    avatarStoryParams5.rightTopAngleToExclude = 0.0f;
                    avatarStoryParams5.rightBottomAngleToExclude = 0.0f;
                    avatarStoryParams5.leftTopAngleToExclude = 0.0f;
                    avatarStoryParams5.leftBottomAngleToExclude = 0.0f;
                    avatarStoryParams5.useArcProgress = false;
                }
                float dp4 = AndroidUtilities.dp(16.0f) * Utilities.clamp((this.overscrollProgress - 0.5f) / 0.5f, 1.0f, f8);
                float f20 = (float) (((1.0f - r1) * 0.5f) + 0.5d);
                if (childAdapterPosition2 <= i) {
                    f9 = 0.0f;
                    dp = 0.0f;
                } else if (childAdapterPosition2 == i + 1) {
                    dp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.collapsedProgress) + ((AndroidUtilities.dp(16.0f) * f17) - AndroidUtilities.dpf2(0.5f));
                    f9 = 0.0f;
                } else {
                    f9 = 0.0f;
                    dp = ((AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(16.0f) * f17)) - AndroidUtilities.dpf2(0.5f)) + AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.collapsedProgress);
                }
                float f21 = dp + this.menuItemsOffset;
                if (!this.collapsed) {
                    if (this.overscrollProgress > f9) {
                        int i12 = storyCell2.position;
                        int i13 = this.overscrollSelectedPosition;
                        if (i12 < i13) {
                            f13 = -dp4;
                        } else if (i12 > i13) {
                            f13 = dp4;
                        }
                        lerp = AndroidUtilities.lerp(f21 - storyCell2.getLeft(), f13, 1.0f - this.expandOvershootAnimatorProgress);
                        f10 = 0.0f;
                    }
                    f13 = 0.0f;
                    lerp = AndroidUtilities.lerp(f21 - storyCell2.getLeft(), f13, 1.0f - this.expandOvershootAnimatorProgress);
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    lerp = AndroidUtilities.lerp(0.0f, f21 - storyCell2.getLeft(), this.storiesCollapseInterpolator.getInterpolation(this.collapsedOvershootProgress));
                }
                float clamp = MathUtils.clamp((this.collapsedProgress1 - 0.2f) / 0.1f, f10, 1.0f);
                int i14 = childAdapterPosition2 - i;
                if (i14 == 0) {
                    f11 = 0.65f;
                    lerp2 = AndroidUtilities.lerp(f10, f - f7, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                } else {
                    f11 = 0.65f;
                    if (i14 == 1) {
                        lerp2 = AndroidUtilities.lerp(f10, (f - f7) * 0.65f, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                    } else {
                        f12 = 0.0f;
                        float f22 = (storyCell2.position == this.overscrollSelectedPosition || this.overscrollProgress <= f10) ? 0.0f : (-dp4) / f4;
                        if (i14 != 0) {
                            lerp3 = AndroidUtilities.lerp(f22, f - f7, this.yStoriesProgress);
                        } else {
                            lerp3 = i14 == 1 ? AndroidUtilities.lerp(f22, (f - f7) * f11, this.yStoriesProgress) : 0.0f;
                        }
                        float lerp7 = AndroidUtilities.lerp(lerp3, f12, clamp);
                        if (this.collapsedProgress <= 0.0f) {
                            boolean z4 = childAdapterPosition2 >= i && childAdapterPosition2 <= i + 2;
                            if (z2) {
                                if (i14 >= 0 && i14 < this.animateToDialogIds.size()) {
                                    storyCell2.setCrossfadeTo(((Long) this.animateToDialogIds.get(i14)).longValue());
                                } else {
                                    storyCell2.setCrossfadeTo(-1L);
                                }
                            } else {
                                storyCell2.setCrossfadeTo(-1L);
                            }
                            storyCell2.drawInParent = z4;
                            storyCell2.isFirst = childAdapterPosition2 == i;
                            storyCell2.isLast = childAdapterPosition2 >= (this.animateToDialogIds.size() + i) + (-1);
                            storyCell2.setTranslationX(lerp);
                            storyCell2.setTranslationY(lerp7);
                            if (z4) {
                                this.viewsDrawInParent.add(storyCell2);
                            }
                        } else if (this.recyclerListView.getItemAnimator() == null || !this.recyclerListView.getItemAnimator().isRunning()) {
                            if (this.overscrollProgress > 0.0f) {
                                int i15 = storyCell2.position;
                                int i16 = this.overscrollSelectedPosition;
                                if (i15 < i16) {
                                    storyCell2.setAlpha(f20);
                                } else if (i15 > i16) {
                                    storyCell2.setAlpha(f20);
                                } else {
                                    storyCell2.setAlpha(1.0f);
                                }
                            } else {
                                storyCell2.setAlpha(1.0f);
                            }
                            storyCell2.setTranslationX(lerp);
                            storyCell2.setTranslationY(lerp7);
                        }
                        if (!storyCell2.drawInParent) {
                            float x = this.recyclerListView.getX() + storyCell2.getX() + (storyCell2.getMeasuredWidth() / f4) + (AndroidUtilities.dp(70.0f) / f4);
                            if (f16 == 0.0f || x > f16) {
                                f16 = x;
                            }
                        }
                        i10++;
                        measuredHeight = f7;
                        z = z2;
                        z3 = false;
                    }
                }
                f12 = lerp2;
                if (storyCell2.position == this.overscrollSelectedPosition) {
                }
                if (i14 != 0) {
                }
                float lerp72 = AndroidUtilities.lerp(lerp3, f12, clamp);
                if (this.collapsedProgress <= 0.0f) {
                }
                if (!storyCell2.drawInParent) {
                }
                i10++;
                measuredHeight = f7;
                z = z2;
                z3 = false;
            }
            f5 = f16;
        } else {
            f = lerp4;
            f2 = 4.0f;
            f3 = 16.0f;
            f4 = 2.0f;
            float f23 = 0.0f;
            for (int i17 = 0; i17 < this.listViewMini.getChildCount(); i17++) {
                float x2 = this.listViewMini.getX() + ((StoryCell) this.listViewMini.getChildAt(i17)).getX() + r3.getMeasuredWidth();
                if (f23 == 0.0f || x2 > f23) {
                    f23 = x2;
                }
            }
            f5 = f23;
        }
        if (this.premiumHint != null) {
            float lerp8 = AndroidUtilities.lerp(29, 74, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.collapsedProgress));
            if (this.recyclerListView.getChildCount() > 0) {
                lerp8 += this.recyclerListView.getChildAt(0).getLeft();
            }
            this.premiumHint.setJoint(0.0f, lerp8);
        }
        float min = Math.min(this.collapsedProgress, this.collapsedProgress2);
        float visibleItemsMeasuredWidthWithAlpha = (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * min) - AndroidUtilities.dp(6.0f);
        boolean z5 = min != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z5) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth() - visibleItemsMeasuredWidthWithAlpha, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (min != 0.0f) {
            float totalVisibility = this.subtitleOverlayContainer.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            this.titleView.setPivotX(0.0f);
            this.titleView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.subtitleOverlayContainer.getTotalVisibility()));
            this.titleView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.subtitleOverlayContainer.getTotalVisibility()));
            this.titleView.setTranslationY((((f + AndroidUtilities.dp(14.0f)) - ((this.titleView.getMeasuredHeight() - this.titleView.getTextHeight()) / f4)) + AndroidUtilities.dp(f2)) - (AndroidUtilities.dp(6.0f) * this.subtitleOverlayContainer.getTotalVisibility()));
            float avatarRight = f5 + (-r3) + getAvatarRight(AndroidUtilities.dp(72.0f), this.collapsedProgress) + AndroidUtilities.dp(12.0f);
            this.titleView.setTranslationX(avatarRight);
            this.titleView.getDrawable().setRightPadding((avatarRight - AndroidUtilities.dp(12.0f)) + (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * min));
            this.telegramLogoView.setTranslationX(this.titleView.getTranslationX() + AndroidUtilities.dp(1.0f));
            this.telegramLogoView.setTranslationY(f + AndroidUtilities.dp(22.333f) + totalVisibility);
            this.emojiStatusView.setTranslationX((this.titleView.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + this.telegramLogoView.getMeasuredWidth());
            this.emojiStatusView.setTranslationY(f + AndroidUtilities.dp(11.333f) + totalVisibility);
            this.subtitleOverlayContainer.setTranslationX(this.titleView.getTranslationX());
            this.subtitleOverlayContainer.setTranslationY(f + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i18 = this.currentState;
        if (i18 >= 0 && i18 != 2) {
            Collections.sort(this.viewsDrawInParent, this.comparator);
            for (int i19 = 0; i19 < this.viewsDrawInParent.size(); i19++) {
                StoryCell storyCell4 = (StoryCell) this.viewsDrawInParent.get(i19);
                canvas2.save();
                canvas2.translate(this.recyclerListView.getX() + storyCell4.getX(), this.recyclerListView.getY() + storyCell4.getY());
                storyCell4.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z5) {
            float dp5 = AndroidUtilities.dp(f3);
            if (this.ellipsizeGradient == null) {
                f6 = dp5;
                this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, f6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.ellipsizeGradientMatrix = new Matrix();
                Paint paint = new Paint(1);
                this.ellipsizePaint = paint;
                paint.setShader(this.ellipsizeGradient);
                this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                f6 = dp5;
            }
            this.ellipsizeGradientMatrix.reset();
            this.ellipsizeGradientMatrix.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - f6, 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - f6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateItems(false, false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onAttachedToWindow();
        this.statusDrawable.attach();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onDetachedFromWindow();
        StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
        if (ensureStoryFileLoadedObject != null) {
            ensureStoryFileLoadedObject.cancel();
            this.globalCancelable = null;
        }
        this.statusDrawable.detach();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.currentCellWidth = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated && this.allowGlobalUpdates) {
            updateItems(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    DialogStoriesCell.this.checkLoadMore();
                }
            });
        }
    }

    public void setProgressToCollapse(float f) {
        setProgressToCollapse(f, true);
    }

    public void setProgressToCollapse(float f, boolean z) {
        if (this.collapsedProgress1 == f) {
            return;
        }
        this.collapsedProgress1 = f;
        checkCollapsedProgress();
        final boolean z2 = f > this.K;
        if (z2 != this.collapsed) {
            this.collapsed = z2;
            AnimatorSet animatorSet = this.storiesAnimatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.storiesAnimatorSet.cancel();
                this.storiesAnimatorSet = null;
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                this.valueAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DialogStoriesCell.$r8$lambda$kIGiKkjtJiH8mQngDb3JNuAxbiI(DialogStoriesCell.this, valueAnimator);
                    }
                });
                this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                float f2 = this.collapsedProgress1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
                this.yStoriesAnimator = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DialogStoriesCell.$r8$lambda$bZ_RG7GVZQQHHYuOWKequuNYPmo(DialogStoriesCell.this, valueAnimator);
                    }
                });
                this.yStoriesAnimator.setDuration(100L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.storiesAnimatorSet = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.DialogStoriesCell.10
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        DialogStoriesCell.this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
                        DialogStoriesCell.this.checkCollapsedProgress();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        try {
                            DialogStoriesCell.this.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                });
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.valueAnimator);
                arrayList.add(this.yStoriesAnimator);
                if (this.collapsed) {
                    this.storiesAnimatorSet.setDuration(1000L);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                    this.collapsedOvershootAnimator = ofFloat3;
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.$r8$lambda$zqIIp3EJWOVI4CjAbihX_sd7fcM(DialogStoriesCell.this, valueAnimator);
                        }
                    });
                    OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.collapsedSpringCoef);
                    this.storiesCollapseInterpolator = overshootInterpolator;
                    this.collapsedOvershootAnimator.setInterpolator(overshootInterpolator);
                    this.collapsedOvershootAnimator.setDuration(750L);
                    arrayList.add(this.collapsedOvershootAnimator);
                } else {
                    this.expandOvershootAnimator = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                    OvershootInterpolator overshootInterpolator2 = new OvershootInterpolator(this.expandedSpringCoef);
                    this.storiesExpandInterpolator = overshootInterpolator2;
                    this.expandOvershootAnimator.setInterpolator(overshootInterpolator2);
                    this.expandOvershootAnimator.setDuration(350L);
                    this.expandOvershootAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.$r8$lambda$dxsLqT6ug588TK9Bhx3kN2t3vD0(DialogStoriesCell.this, valueAnimator);
                        }
                    });
                    arrayList.add(this.expandOvershootAnimator);
                }
                this.storiesAnimatorSet.playTogether(arrayList);
                this.storiesAnimatorSet.start();
                return;
            }
            this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
            checkCollapsedProgress();
            AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda4
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    ((View) obj).setTranslationY(0.0f);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$kIGiKkjtJiH8mQngDb3JNuAxbiI(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogStoriesCell.checkCollapsedProgress();
    }

    public static /* synthetic */ void $r8$lambda$bZ_RG7GVZQQHHYuOWKequuNYPmo(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static /* synthetic */ void $r8$lambda$zqIIp3EJWOVI4CjAbihX_sd7fcM(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static /* synthetic */ void $r8$lambda$dxsLqT6ug588TK9Bhx3kN2t3vD0(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogStoriesCell.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCollapsedProgress() {
        this.collapsedProgress = 1.0f - AndroidUtilities.lerp(1.0f - this.collapsedProgress1, 1.0f, 1.0f - this.collapsedProgress2);
        checkUi_titleVisibility();
        float f = this.collapsedProgress;
        updateCurrentState(f == 1.0f ? 2 : f != 0.0f ? 1 : 0);
        invalidate();
    }

    public float getCollapsedProgress() {
        return this.collapsedProgress;
    }

    public void scrollToFirstCell() {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    public void updateColors() {
        StoriesUtilities.updateColors();
        final int textColor = getTextColor();
        this.titleView.setTextColor(getTextLogoColor());
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.updateColors();
        }
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda12
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                DialogStoriesCell.$r8$lambda$Elfeqd_jiE4bOsxLma6AIZYknaU(textColor, (View) obj);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.listViewMini, new Consumer() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda13
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                ((DialogStoriesCell.StoryCell) ((View) obj)).invalidate();
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Elfeqd_jiE4bOsxLma6AIZYknaU(int i, View view) {
        StoryCell storyCell = (StoryCell) view;
        storyCell.invalidate();
        storyCell.textView.setTextColor(i);
    }

    private int getTextLogoColor() {
        return getThemedColor(Theme.key_telegram_color_dialogsLogo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        if (this.type == 0) {
            return getThemedColor(Theme.key_actionBarDefaultTitle);
        }
        return getThemedColor(Theme.key_actionBarDefaultArchivedTitle);
    }

    public boolean scrollTo(long j) {
        int i = 0;
        while (true) {
            if (i >= this.items.size()) {
                i = -1;
                break;
            }
            if (((Item) this.items.get(i)).dialogId == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            if (i < this.layoutManager.findFirstCompletelyVisibleItemPosition()) {
                this.layoutManager.scrollToPositionWithOffset(i, 0);
                return true;
            }
            if (i > this.layoutManager.findLastCompletelyVisibleItemPosition()) {
                this.layoutManager.scrollToPositionWithOffset(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public void afterNextLayout(Runnable runnable) {
        this.afterNextLayout.add(runnable);
    }

    public boolean isExpanded() {
        int i = this.currentState;
        return i == 0 || i == 1;
    }

    public boolean isFullExpanded() {
        return this.currentState == 0;
    }

    public boolean scrollToFirst() {
        if (this.layoutManager.findFirstVisibleItemPosition() == 0) {
            return false;
        }
        this.recyclerListView.smoothScrollToPosition(0);
        return true;
    }

    public void openStoryRecorder() {
        openStoryRecorder(0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void openStoryRecorder(final long j) {
        final StoryCell storyCell;
        StoriesController.StoryLimit checkStoryLimit;
        if (j == 0 && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
            this.fragment.showDialog(new LimitReachedBottomSheet(this.fragment, getContext(), checkStoryLimit.getLimitReachedType(), this.currentAccount, null));
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.recyclerListView.getChildCount()) {
                storyCell = null;
                break;
            }
            StoryCell storyCell2 = (StoryCell) this.recyclerListView.getChildAt(i);
            if (j == 0) {
                if (storyCell2.isSelf) {
                    break;
                } else {
                    i++;
                }
            } else if (storyCell2.dialogId == j) {
                break;
            } else {
                i++;
            }
        }
        if (storyCell == null) {
            return;
        }
        if (j != 0) {
            BaseFragment baseFragment = this.fragment;
            Theme.ResourcesProvider resourceProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3, resourceProvider);
            alertDialog.showDelayed(500L);
            MessagesController.getInstance(this.currentAccount).getStoriesController().canSendStoryFor(j, new Consumer() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda19
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    DialogStoriesCell.$r8$lambda$9dz_S7ZA65t4PpNWPtYlquc69sE(DialogStoriesCell.this, alertDialog, j, storyCell, (Boolean) obj);
                }
            }, true, resourceProvider);
            return;
        }
        StoryRecorder.getInstance(this.fragment.getParentActivity(), this.currentAccount).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
    }

    public static /* synthetic */ void $r8$lambda$9dz_S7ZA65t4PpNWPtYlquc69sE(DialogStoriesCell dialogStoriesCell, AlertDialog alertDialog, long j, StoryCell storyCell, Boolean bool) {
        dialogStoriesCell.getClass();
        alertDialog.dismiss();
        if (bool.booleanValue()) {
            StoryRecorder.getInstance(dialogStoriesCell.fragment.getParentActivity(), dialogStoriesCell.currentAccount).selectedPeerId(j).canChangePeer(false).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
        }
    }

    public void setTitleOverlayText(String str, int i) {
        this.subtitleOverlayContainer.setText(i == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
        if (str != null) {
            this.hasOverlayText = true;
            if (this.overlayTextId != i) {
                this.overlayTextId = i;
                this.titleView.setText(LocaleController.getString(str, i), !LocaleController.isRTL);
            }
        } else {
            this.hasOverlayText = false;
            this.overlayTextId = 0;
            this.titleView.setText(this.currentTitle, !LocaleController.isRTL);
        }
        this.animatorHasTitleText.setValue(this.hasOverlayText, true);
        this.ellipsizeSpanAnimator.removeView(this.titleView);
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.clipTop != i) {
            this.clipTop = i;
            invalidate();
        }
    }

    public void openSelfStories() {
        if (this.storiesController.hasSelfStories()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
            this.fragment.getOrCreateStoryViewer().open(getContext(), null, arrayList, 0, null, null, StoriesListPlaceProvider.of(this.listViewMini), false);
        }
    }

    public void onResume() {
        this.storiesController.checkExpiredStories();
        for (int i = 0; i < this.items.size(); i++) {
            TL_stories.PeerStories stories = this.storiesController.getStories(((Item) this.items.get(i)).dialogId);
            if (stories != null) {
                this.storiesController.preloadUserStories(stories);
            }
        }
    }

    public void setOverscroll(float f) {
        this.overscrollProgress = f / AndroidUtilities.dp(90.0f);
        invalidate();
        this.recyclerListView.invalidate();
    }

    public boolean openOverscrollSelectedStory() {
        ValueAnimator valueAnimator = this.expandOvershootAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        openStoryForCell(this.overscrollSelectedView, true);
        return true;
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public float overscrollProgress() {
        return this.overscrollProgress;
    }

    private class Adapter extends AdapterWithDiffUtils {
        boolean mini;

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public Adapter(boolean z) {
            this.mini = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StoryCell storyCell = DialogStoriesCell.this.new StoryCell(viewGroup.getContext());
            storyCell.mini = this.mini;
            if (this.mini) {
                storyCell.setProgressToCollapsed(1.0f, 1.0f, 0.0f, false);
            }
            return new RecyclerListView.Holder(storyCell);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StoryCell storyCell = (StoryCell) viewHolder.itemView;
            storyCell.position = i;
            if (this.mini) {
                storyCell.setDialogId(((Item) DialogStoriesCell.this.miniItems.get(i)).dialogId);
            } else {
                storyCell.setDialogId(((Item) DialogStoriesCell.this.items.get(i)).dialogId);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return (this.mini ? DialogStoriesCell.this.miniItems : DialogStoriesCell.this.items).size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class Item extends AdapterWithDiffUtils.Item {
        final long dialogId;

        public Item(long j) {
            super(0, false);
            this.dialogId = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && this.dialogId == ((Item) obj).dialogId;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId));
        }
    }

    public StoryCell findStoryCell(long j) {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (this.currentState == 2) {
            recyclerListView = this.listViewMini;
        }
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof StoryCell) {
                StoryCell storyCell = (StoryCell) childAt;
                if (storyCell.dialogId == j) {
                    return storyCell;
                }
            }
        }
        return null;
    }

    public class StoryCell extends FrameLayout {
        AvatarDrawable avatarDrawable;
        public ImageReceiver avatarImage;
        private float bounceScale;
        public StoriesUtilities.EnsureStoryFileLoadedObject cancellable;
        TLRPC.Chat chat;
        AvatarDrawable crossfadeAvatarDrawable;
        public ImageReceiver crossfadeToAvatarImage;
        boolean crossfadeToDialog;
        long crossfadeToDialogId;
        private float cx;
        private float cy;
        long dialogId;
        public boolean drawAvatar;
        public boolean drawInParent;
        private final AnimatedFloat failT;
        boolean isFail;
        public boolean isFirst;
        public boolean isLast;
        boolean isSelf;
        private boolean isUploadingState;
        private boolean mini;
        private float overscrollProgress;
        public final StoriesUtilities.AvatarStoryParams params;
        public int position;
        float progressToCollapsed;
        float progressToCollapsed2;
        boolean progressWasDrawn;
        public RadialProgress radialProgress;
        private boolean selectedForOverscroll;
        float textAlpha;
        float textAlphaTransition;
        SimpleTextView textView;
        FrameLayout textViewContainer;
        TLRPC.User user;
        private Drawable verifiedDrawable;

        public StoryCell(Context context) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.avatarImage = new ImageReceiver(this);
            this.crossfadeToAvatarImage = new ImageReceiver(this);
            this.crossfadeAvatarDrawable = new AvatarDrawable();
            this.drawAvatar = true;
            StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(true);
            this.params = avatarStoryParams;
            this.textAlpha = 1.0f;
            this.textAlphaTransition = 1.0f;
            this.bounceScale = 1.0f;
            this.failT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            avatarStoryParams.isArchive = DialogStoriesCell.this.type == 1;
            avatarStoryParams.isDialogStoriesCell = true;
            this.avatarImage.setInvalidateAll(true);
            this.avatarImage.setAllowLoadingOnAttachedOnly(true);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.textViewContainer = frameLayout;
            frameLayout.setClipChildren(false);
            if (!this.mini) {
                setClipChildren(false);
            }
            createTextView();
            addView(this.textViewContainer, LayoutHelper.createFrame(-1, -2.0f));
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            this.crossfadeToAvatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        private void createTextView() {
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.textView = simpleTextView;
            simpleTextView.setTypeface(AndroidUtilities.bold());
            this.textView.setGravity(17);
            this.textView.setTextSize(11);
            this.textView.setTextColor(DialogStoriesCell.this.getTextColor());
            NotificationCenter.listenEmojiLoading(this.textView);
            this.textView.setMaxLines(1);
            this.textViewContainer.addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            this.crossfadeToAvatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setDialogId(long j) {
            TLRPC.Chat chat;
            long j2 = this.dialogId;
            boolean z = j2 == j;
            if (!z && this.cancellable != null) {
                DialogStoriesCell.this.storiesController.setLoading(j2, false);
                this.cancellable.cancel();
                this.cancellable = null;
            }
            this.dialogId = j;
            this.isSelf = j == UserConfig.getInstance(DialogStoriesCell.this.currentAccount).getClientUserId();
            this.isFail = DialogStoriesCell.this.storiesController.isLastUploadingFailed(j);
            if (j > 0) {
                TLRPC.User user = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getUser(Long.valueOf(j));
                this.user = user;
                this.chat = null;
                chat = user;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getChat(Long.valueOf(-j));
                this.chat = chat2;
                this.user = null;
                chat = chat2;
            }
            if (chat == null) {
                this.textView.setText("");
                this.avatarImage.clearImage();
                return;
            }
            this.avatarDrawable.setInfo(DialogStoriesCell.this.currentAccount, (TLObject) chat);
            this.avatarImage.setForUserOrChat(chat, this.avatarDrawable);
            if (this.mini) {
                return;
            }
            this.textView.setRightDrawable((Drawable) null);
            if (DialogStoriesCell.this.storiesController.isLastUploadingFailed(j)) {
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.FailedStory));
                this.isUploadingState = false;
                return;
            }
            if (!Utilities.isNullOrEmpty(DialogStoriesCell.this.storiesController.getUploadingStories(j))) {
                this.textView.setTextSize(10);
                StoriesUtilities.applyUploadingStr(this.textView, true, false);
                this.isUploadingState = true;
                return;
            }
            if (DialogStoriesCell.this.storiesController.getEditingStory(j) != null) {
                this.textView.setTextSize(10);
                StoriesUtilities.applyUploadingStr(this.textView, true, false);
                this.isUploadingState = true;
                return;
            }
            if (this.isSelf) {
                if (z && this.isUploadingState && !this.mini) {
                    final SimpleTextView simpleTextView = this.textView;
                    createTextView();
                    if (DialogStoriesCell.this.textAnimator != null) {
                        DialogStoriesCell.this.textAnimator.cancel();
                        DialogStoriesCell.this.textAnimator = null;
                    }
                    DialogStoriesCell.this.textAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                    DialogStoriesCell.this.textAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$StoryCell$$ExternalSyntheticLambda1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.StoryCell.$r8$lambda$H8govuMrSExAMNCUjH0izRsRzZQ(DialogStoriesCell.StoryCell.this, simpleTextView, valueAnimator);
                        }
                    });
                    DialogStoriesCell.this.textAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.DialogStoriesCell.StoryCell.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            DialogStoriesCell.this.textAnimator = null;
                            AndroidUtilities.removeFromParent(simpleTextView);
                        }
                    });
                    DialogStoriesCell.this.textAnimator.setDuration(150L);
                    this.textView.setAlpha(0.0f);
                    this.textView.setTranslationY(AndroidUtilities.dp(5.0f));
                    DialogStoriesCell.this.animationRunnable = new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogStoriesCell.StoryCell.$r8$lambda$-Ncll0VsR_VlZQL-C9COQA7Mjr0(DialogStoriesCell.StoryCell.this);
                        }
                    };
                }
                AndroidUtilities.runOnUIThread(DialogStoriesCell.this.animationRunnable, 500L);
                this.isUploadingState = false;
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.MyStory));
                return;
            }
            if (this.user != null) {
                this.textView.setTextSize(11);
                String str = this.user.first_name;
                String trim = str != null ? str.trim() : "";
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    trim = trim.substring(0, indexOf);
                }
                if (this.user.verified) {
                    if (this.verifiedDrawable == null) {
                        this.verifiedDrawable = DialogStoriesCell.this.createVerifiedDrawable();
                    }
                    this.textView.setText(Emoji.replaceEmoji(trim, this.textView.getPaint().getFontMetricsInt(), false));
                    this.textView.setRightDrawable(this.verifiedDrawable);
                    return;
                }
                this.textView.setText(Emoji.replaceEmoji(trim, this.textView.getPaint().getFontMetricsInt(), false));
                this.textView.setRightDrawable((Drawable) null);
                return;
            }
            this.textView.setTextSize(11);
            this.textView.setText(Emoji.replaceEmoji(this.chat.title, this.textView.getPaint().getFontMetricsInt(), false));
            this.textView.setRightDrawable((Drawable) null);
        }

        public static /* synthetic */ void $r8$lambda$H8govuMrSExAMNCUjH0izRsRzZQ(StoryCell storyCell, View view, ValueAnimator valueAnimator) {
            storyCell.getClass();
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - floatValue;
            view.setAlpha(f);
            view.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue);
            storyCell.textView.setAlpha(floatValue);
            storyCell.textView.setTranslationY(AndroidUtilities.dp(5.0f) * f);
        }

        public static /* synthetic */ void $r8$lambda$-Ncll0VsR_VlZQL-C9COQA7Mjr0(StoryCell storyCell) {
            if (DialogStoriesCell.this.textAnimator != null) {
                DialogStoriesCell.this.textAnimator.start();
            }
            DialogStoriesCell.this.animationRunnable = null;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mini ? AndroidUtilities.dp(70.0f) : DialogStoriesCell.this.currentCellWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
        }

        float getCy() {
            float dp = AndroidUtilities.dp(48.0f);
            float dp2 = AndroidUtilities.dp(26.33f);
            return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - dp2) / 2.0f, DialogStoriesCell.this.collapsedProgress1) + (AndroidUtilities.lerp(dp, dp2, this.progressToCollapsed) / 2.0f);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            boolean z;
            Paint unreadCirclePaint;
            float f5;
            float f6;
            boolean z2;
            float f7;
            RadialProgress radialProgress;
            Canvas canvas2 = canvas;
            float dp = AndroidUtilities.dp(48.0f);
            float dp2 = AndroidUtilities.dp(26.33f);
            float dp3 = AndroidUtilities.dp(8.0f) * Utilities.clamp(DialogStoriesCell.this.overscrollProgress / 0.5f, 1.0f, 0.0f);
            if (this.selectedForOverscroll) {
                dp3 += AndroidUtilities.dp(16.0f) * Utilities.clamp((DialogStoriesCell.this.overscrollProgress - 0.5f) / 0.5f, 1.0f, 0.0f);
            }
            float lerp = AndroidUtilities.lerp(dp + dp3, dp2, this.progressToCollapsed);
            float f8 = lerp / 2.0f;
            float measuredWidth = (getMeasuredWidth() / 2.0f) - f8;
            float lerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.progressToCollapsed);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - dp2) / 2.0f, this.progressToCollapsed);
            float clamp = Utilities.clamp(this.progressToCollapsed / 0.5f, 1.0f, 0.0f);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            avatarStoryParams.drawSegments = true;
            if (!avatarStoryParams.forceAnimateProgressToSegments) {
                avatarStoryParams.progressToSegments = 1.0f - DialogStoriesCell.this.collapsedProgress2;
            }
            float f9 = lerp3 + lerp;
            this.params.originalAvatarRect.set(lerp2, lerp3, lerp2 + lerp, f9);
            this.params.additionalInset = AndroidUtilities.dpf2(1.33f) * this.progressToCollapsed;
            this.avatarImage.setAlpha(1.0f);
            this.avatarImage.setRoundRadius((int) f8);
            float f10 = lerp2 + f8;
            this.cx = f10;
            float f11 = lerp3 + f8;
            this.cy = f11;
            if (DialogStoriesCell.this.type == 0) {
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                f = 1.0f;
                dialogStoriesCell.backgroundPaint.setColor(dialogStoriesCell.getThemedColor(Theme.key_actionBarDefault));
            } else {
                f = 1.0f;
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.backgroundPaint.setColor(dialogStoriesCell2.getThemedColor(Theme.key_actionBarDefaultArchived));
            }
            if (this.progressToCollapsed != 0.0f) {
                canvas2.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(1.5f) + f8, DialogStoriesCell.this.backgroundPaint);
            }
            canvas2.save();
            float f12 = this.bounceScale;
            canvas2.scale(f12, f12, this.cx, this.cy);
            if (this.radialProgress == null) {
                this.radialProgress = DialogStoriesCell.this.radialProgress;
            }
            ArrayList uploadingAndEditingStories = DialogStoriesCell.this.storiesController.getUploadingAndEditingStories(this.dialogId);
            boolean z3 = (uploadingAndEditingStories == null || uploadingAndEditingStories.isEmpty()) ? false : true;
            if (z3 || (this.progressWasDrawn && (radialProgress = this.radialProgress) != null && radialProgress.getAnimatedProgress() < 0.98f)) {
                f2 = lerp2;
                f3 = lerp3;
                if (!z3) {
                    z = DialogStoriesCell.this.lastUploadingCloseFriends;
                    f4 = 1.0f;
                } else {
                    float f13 = 0.0f;
                    for (int i = 0; i < uploadingAndEditingStories.size(); i++) {
                        f13 += ((StoriesController.UploadingStory) uploadingAndEditingStories.get(i)).progress;
                    }
                    float size = (DialogStoriesCell.this.storiesController.uploadedStories + f13) / (r2 + uploadingAndEditingStories.size());
                    DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                    boolean isCloseFriends = ((StoriesController.UploadingStory) uploadingAndEditingStories.get(uploadingAndEditingStories.size() - 1)).isCloseFriends();
                    dialogStoriesCell3.lastUploadingCloseFriends = isCloseFriends;
                    f4 = size;
                    z = isCloseFriends;
                }
                invalidate();
                if (this.radialProgress == null) {
                    DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
                    RadialProgress radialProgress2 = dialogStoriesCell4.radialProgress;
                    if (radialProgress2 != null) {
                        this.radialProgress = radialProgress2;
                    } else {
                        RadialProgress radialProgress3 = new RadialProgress(this);
                        this.radialProgress = radialProgress3;
                        dialogStoriesCell4.radialProgress = radialProgress3;
                        radialProgress3.setBackground(null, true, false);
                    }
                }
                if (this.drawAvatar) {
                    canvas2.save();
                    canvas2.scale(this.params.getScale(), this.params.getScale(), this.params.originalAvatarRect.centerX(), this.params.originalAvatarRect.centerY());
                    this.avatarImage.setImageCoords(this.params.originalAvatarRect);
                    this.avatarImage.draw(canvas2);
                    canvas2.restore();
                }
                this.radialProgress.setDiff(0);
                if (z) {
                    unreadCirclePaint = StoriesUtilities.getCloseFriendsPaint(this.avatarImage);
                } else {
                    unreadCirclePaint = StoriesUtilities.getUnreadCirclePaint(this.avatarImage, true);
                }
                unreadCirclePaint.setAlpha(NotificationCenter.didReceiveSmsCode);
                this.radialProgress.setPaint(unreadCirclePaint);
                this.radialProgress.setProgressRect((int) (this.avatarImage.getImageX() - AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageY() - AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageY2() + AndroidUtilities.dp(3.0f)));
                this.radialProgress.setProgress(Utilities.clamp(f4, 1.0f, 0.0f), this.progressWasDrawn);
                if (this.avatarImage.getVisible()) {
                    this.radialProgress.draw(canvas2);
                }
                this.progressWasDrawn = true;
                DialogStoriesCell.this.drawCircleForce = true;
                invalidate();
            } else {
                float f14 = this.failT.set(this.isFail);
                if (this.drawAvatar) {
                    if (this.progressWasDrawn) {
                        StoriesUtilities.AvatarStoryParams avatarStoryParams2 = this.params;
                        avatarStoryParams2.forceAnimateProgressToSegments = true;
                        avatarStoryParams2.progressToSegments = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.DialogStoriesCell$StoryCell$$ExternalSyntheticLambda0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogStoriesCell.StoryCell.$r8$lambda$eYeNNiW5WF236p-WDrz4A6BMMhs(DialogStoriesCell.StoryCell.this, valueAnimator);
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.DialogStoriesCell.StoryCell.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                StoryCell.this.params.forceAnimateProgressToSegments = false;
                            }
                        });
                        f6 = lerp2;
                        z2 = true;
                        ofFloat.setDuration(100L);
                        ofFloat.start();
                    } else {
                        f6 = lerp2;
                        z2 = true;
                    }
                    StoriesUtilities.AvatarStoryParams avatarStoryParams3 = this.params;
                    float f15 = f14 * avatarStoryParams3.progressToSegments;
                    avatarStoryParams3.animate = this.progressWasDrawn ^ z2;
                    avatarStoryParams3.progressToArc = getArcProgress(this.cx, f8);
                    StoriesUtilities.AvatarStoryParams avatarStoryParams4 = this.params;
                    avatarStoryParams4.isLast = this.isLast;
                    avatarStoryParams4.isFirst = this.isFirst;
                    avatarStoryParams4.alpha = f - f15;
                    boolean z4 = this.isSelf;
                    if (!z4 && this.crossfadeToDialog) {
                        f5 = clamp;
                        avatarStoryParams4.crossfadeToDialog = this.crossfadeToDialogId;
                        avatarStoryParams4.crossfadeToDialogProgress = this.progressToCollapsed2;
                    } else {
                        f5 = clamp;
                        avatarStoryParams4.crossfadeToDialog = 0L;
                    }
                    if (z4) {
                        f3 = lerp3;
                        f7 = f11;
                        f2 = f6;
                        StoriesUtilities.drawAvatarWithStory(this.dialogId, canvas2, this.avatarImage, DialogStoriesCell.this.storiesController.hasSelfStories(), this.params);
                        canvas2 = canvas;
                    } else {
                        f3 = lerp3;
                        f7 = f11;
                        f2 = f6;
                        long j = this.dialogId;
                        canvas2 = canvas;
                        StoriesUtilities.drawAvatarWithStory(j, canvas2, this.avatarImage, DialogStoriesCell.this.storiesController.hasStories(j), this.params);
                    }
                    if (f15 > 0.0f) {
                        Paint errorPaint = StoriesUtilities.getErrorPaint(this.avatarImage);
                        errorPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        errorPaint.setAlpha((int) (255.0f * f15));
                        canvas2.drawCircle(f10, f7, (f8 + AndroidUtilities.dp(4.0f)) * this.params.getScale(), errorPaint);
                    }
                    f14 = f15;
                } else {
                    f2 = lerp2;
                    f5 = clamp;
                    f3 = lerp3;
                }
                this.progressWasDrawn = false;
                if (this.drawAvatar) {
                    canvas2.save();
                    float f16 = f - f5;
                    canvas2.scale(f16, f16, this.cx + AndroidUtilities.dp(16.0f), this.cy + AndroidUtilities.dp(16.0f));
                    drawPlus(canvas2, this.cx, this.cy, 1.0f);
                    drawFail(canvas2, this.cx, this.cy, f14);
                    canvas2.restore();
                }
            }
            canvas2.restore();
            if (this.crossfadeToDialog && this.progressToCollapsed2 > 0.0f) {
                this.crossfadeToAvatarImage.setImageCoords(f2, f3, lerp, lerp);
                this.crossfadeToAvatarImage.setAlpha(this.progressToCollapsed2);
                this.crossfadeToAvatarImage.draw(canvas2);
            }
            this.textViewContainer.setTranslationY(f9 + (AndroidUtilities.dp(7.0f) * (1.0f - this.progressToCollapsed)));
            this.textViewContainer.setTranslationX(f2 - measuredWidth);
            if (!this.mini) {
                if (this.isSelf) {
                    this.textAlpha = 1.0f;
                } else {
                    StoriesUtilities.AvatarStoryParams avatarStoryParams5 = this.params;
                    float f17 = avatarStoryParams5.progressToSate;
                    this.textAlpha = avatarStoryParams5.globalState == 2 ? 0.7f : 1.0f;
                }
                float f18 = this.textAlphaTransition * this.textAlpha;
                this.textViewContainer.setAlpha(f18);
                this.textViewContainer.setVisibility(f18 > 0.0f ? 0 : 4);
            }
            super.dispatchDraw(canvas);
        }

        public static /* synthetic */ void $r8$lambda$eYeNNiW5WF236p-WDrz4A6BMMhs(StoryCell storyCell, ValueAnimator valueAnimator) {
            storyCell.params.progressToSegments = AndroidUtilities.lerp(0.0f, 1.0f - DialogStoriesCell.this.collapsedProgress2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            storyCell.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClipInParent(boolean z) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).setClipChildren(z);
            }
            if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
                return;
            }
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
        }

        private float getArcProgress(float f, float f2) {
            if (!this.isLast && DialogStoriesCell.this.overscrollProgress <= 0.0f) {
                if (AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), CubicBezierInterpolator.EASE_OUT.getInterpolation(this.progressToCollapsed)) < (f2 + AndroidUtilities.dpf2(3.5f)) * 2.0f) {
                    return ((float) Math.toDegrees(Math.acos((r4 / 2.0f) / r5))) * 2.0f;
                }
            }
            return 0.0f;
        }

        @Override // android.view.View
        public void setPressed(boolean z) {
            super.setPressed(z);
            if (z) {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
                if (avatarStoryParams.buttonBounce == null) {
                    avatarStoryParams.buttonBounce = new ButtonBounce(this, 1.5f, 5.0f);
                }
            }
            ButtonBounce buttonBounce = this.params.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(z);
            }
        }

        @Override // android.view.View
        public void invalidate() {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                RecyclerListView recyclerListView = dialogStoriesCell.listViewMini;
                if (parent == recyclerListView) {
                    recyclerListView.invalidate();
                } else {
                    dialogStoriesCell.invalidate();
                }
            }
            super.invalidate();
        }

        @Override // android.view.View
        public void invalidate(int i, int i2, int i3, int i4) {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                RecyclerListView recyclerListView = DialogStoriesCell.this.listViewMini;
                if (parent == recyclerListView) {
                    recyclerListView.invalidate();
                }
                DialogStoriesCell.this.invalidate();
            }
            super.invalidate(i, i2, i3, i4);
        }

        public void drawPlus(Canvas canvas, float f, float f2, float f3) {
            DialogStoriesCell dialogStoriesCell;
            int i;
            if (this.isSelf && !DialogStoriesCell.this.storiesController.hasStories(this.dialogId) && Utilities.isNullOrEmpty(DialogStoriesCell.this.storiesController.getUploadingStories(this.dialogId))) {
                float dp = f + AndroidUtilities.dp(16.0f);
                float dp2 = f2 + AndroidUtilities.dp(16.0f);
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell2.getThemedColor(Theme.key_telegram_color), f3));
                if (DialogStoriesCell.this.type == 0) {
                    DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                    dialogStoriesCell3.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell3.getThemedColor(Theme.key_actionBarDefault), f3));
                } else {
                    DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
                    dialogStoriesCell4.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell4.getThemedColor(Theme.key_actionBarDefaultArchived), f3));
                }
                canvas.drawCircle(dp, dp2, AndroidUtilities.dp(11.0f), DialogStoriesCell.this.backgroundPaint);
                canvas.drawCircle(dp, dp2, AndroidUtilities.dp(9.0f), DialogStoriesCell.this.addCirclePaint);
                if (DialogStoriesCell.this.type == 0) {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefault;
                } else {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefaultArchived;
                }
                int themedColor = dialogStoriesCell.getThemedColor(i);
                if (themedColor != DialogStoriesCell.this.addNewStoryLastColor) {
                    DialogStoriesCell.this.addNewStoryDrawable.setColorFilter(new PorterDuffColorFilter(DialogStoriesCell.this.addNewStoryLastColor = themedColor, PorterDuff.Mode.MULTIPLY));
                }
                DialogStoriesCell.this.addNewStoryDrawable.setAlpha((int) (f3 * 255.0f));
                DialogStoriesCell.this.addNewStoryDrawable.setBounds((int) (dp - (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 - (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicHeight() / 2.0f)), (int) (dp + (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicWidth() / 2.0f)), (int) (dp2 + (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicHeight() / 2.0f)));
                DialogStoriesCell.this.addNewStoryDrawable.draw(canvas);
            }
        }

        public void drawFail(Canvas canvas, float f, float f2, float f3) {
            if (f3 <= 0.0f) {
                return;
            }
            float dp = f + AndroidUtilities.dp(17.0f);
            float dp2 = f2 + AndroidUtilities.dp(17.0f);
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            dialogStoriesCell.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell.getThemedColor(Theme.key_text_RedBold), f3));
            if (DialogStoriesCell.this.type == 0) {
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell2.getThemedColor(Theme.key_actionBarDefault), f3));
            } else {
                DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                dialogStoriesCell3.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell3.getThemedColor(Theme.key_actionBarDefaultArchived), f3));
            }
            float dp3 = AndroidUtilities.dp(9.0f) * CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f3);
            canvas.drawCircle(dp, dp2, AndroidUtilities.dp(2.0f) + dp3, DialogStoriesCell.this.backgroundPaint);
            canvas.drawCircle(dp, dp2, dp3, DialogStoriesCell.this.addCirclePaint);
            DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
            dialogStoriesCell4.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell4.getTextColor(), f3));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp - AndroidUtilities.dp(1.0f), dp2 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + dp, AndroidUtilities.dpf2(1.6f) + dp2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), DialogStoriesCell.this.addCirclePaint);
            rectF.set(dp - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + dp2, dp + AndroidUtilities.dp(1.0f), dp2 + AndroidUtilities.dpf2(4.6f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), DialogStoriesCell.this.addCirclePaint);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImage.onAttachedToWindow();
            this.crossfadeToAvatarImage.onAttachedToWindow();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImage.onDetachedFromWindow();
            this.crossfadeToAvatarImage.onDetachedFromWindow();
            this.params.onDetachFromWindow();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.cancellable = null;
            }
        }

        public void setProgressToCollapsed(float f, float f2, float f3, boolean z) {
            float clamp;
            if (this.progressToCollapsed != f || this.progressToCollapsed2 != f2 || this.overscrollProgress != f3 || this.selectedForOverscroll != z) {
                this.selectedForOverscroll = z;
                this.progressToCollapsed = f;
                this.progressToCollapsed2 = f2;
                invalidate();
                DialogStoriesCell.this.recyclerListView.invalidate();
            }
            if (this.mini) {
                clamp = 0.0f;
            } else {
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                clamp = 1.0f - Utilities.clamp(dialogStoriesCell.collapsedProgress / dialogStoriesCell.K, 1.0f, 0.0f);
            }
            this.textAlphaTransition = clamp;
            float f4 = clamp * this.textAlpha;
            this.textViewContainer.setAlpha(f4);
            this.textViewContainer.setVisibility(f4 > 0.0f ? 0 : 4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setCrossfadeTo(long j) {
            TLRPC.Chat chat;
            if (this.crossfadeToDialogId != j) {
                this.crossfadeToDialogId = j;
                boolean z = j != -1;
                this.crossfadeToDialog = z;
                if (!z) {
                    this.crossfadeToAvatarImage.clearImage();
                    return;
                }
                if (j > 0) {
                    TLRPC.User user = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getUser(Long.valueOf(j));
                    this.user = user;
                    this.chat = null;
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getChat(Long.valueOf(-j));
                    this.chat = chat2;
                    this.user = null;
                    chat = chat2;
                }
                if (chat != null) {
                    this.crossfadeAvatarDrawable.setInfo(DialogStoriesCell.this.currentAccount, (TLObject) chat);
                    this.crossfadeToAvatarImage.setForUserOrChat(chat, this.crossfadeAvatarDrawable);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable createVerifiedDrawable() {
        final Drawable mutate = ContextCompat.getDrawable(getContext(), R.drawable.verified_area).mutate();
        final Drawable mutate2 = ContextCompat.getDrawable(getContext(), R.drawable.verified_check).mutate();
        CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, mutate2) { // from class: org.telegram.ui.Stories.DialogStoriesCell.11
            int lastColor;

            @Override // org.telegram.ui.Components.CombinedDrawable, android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                DialogStoriesCell dialogStoriesCell;
                int i;
                DialogStoriesCell dialogStoriesCell2;
                int i2;
                if (DialogStoriesCell.this.type == 0) {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefault;
                } else {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefaultArchived;
                }
                int themedColor = dialogStoriesCell.getThemedColor(i);
                if (this.lastColor != themedColor) {
                    this.lastColor = themedColor;
                    if (DialogStoriesCell.this.type == 0) {
                        dialogStoriesCell2 = DialogStoriesCell.this;
                        i2 = Theme.key_actionBarDefaultTitle;
                    } else {
                        dialogStoriesCell2 = DialogStoriesCell.this;
                        i2 = Theme.key_actionBarDefaultArchivedTitle;
                    }
                    int themedColor2 = dialogStoriesCell2.getThemedColor(i2);
                    Drawable drawable = mutate;
                    int blendARGB = ColorUtils.blendARGB(themedColor2, themedColor, 0.1f);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(blendARGB, mode));
                    mutate2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                }
                super.draw(canvas);
            }
        };
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    private void updateCurrentState(int i) {
        if (this.currentState == i) {
            return;
        }
        this.currentState = i;
        if (i != 1 && this.updateOnIdleState) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    DialogStoriesCell.this.updateItems(true, false);
                }
            });
        }
        int i2 = this.currentState;
        if (i2 == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda15
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    DialogStoriesCell.$r8$lambda$uphkWwldF1xtsXmD_0Esj8hjJVg((View) obj);
                }
            });
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
            checkExpanded();
        } else if (i2 == 1) {
            this.animateToDialogIds.clear();
            for (int i3 = 0; i3 < this.items.size(); i3++) {
                if (((Item) this.items.get(i3)).dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() || shouldDrawSelfInMini()) {
                    this.animateToDialogIds.add(Long.valueOf(((Item) this.items.get(i3)).dialogId));
                    if (this.animateToDialogIds.size() == 3) {
                        break;
                    }
                }
            }
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
        } else if (i2 == 2) {
            this.listViewMini.setVisibility(0);
            this.recyclerListView.setVisibility(4);
            this.layoutManager.scrollToPositionWithOffset(0, 0);
            MessagesController.getInstance(this.currentAccount).getStoriesController().scheduleSort();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.globalCancelable = null;
            }
        }
        invalidate();
    }

    public static /* synthetic */ void $r8$lambda$uphkWwldF1xtsXmD_0Esj8hjJVg(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    static float getAvatarRight(int i, float f) {
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f) / 2.0f;
        return AndroidUtilities.lerp((i / 2.0f) - lerp, 0.0f, f) + (lerp * 2.0f);
    }

    private void checkExpanded() {
        if (System.currentTimeMillis() < this.checkedStoryNotificationDeletion) {
            return;
        }
        this.checkedStoryNotificationDeletion = System.currentTimeMillis() + 60000;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(f);
        }
    }

    public HintView2 getPremiumHint() {
        return this.premiumHint;
    }

    private HintView2 makePremiumHint() {
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            return hintView2;
        }
        this.premiumHint = new HintView2(getContext(), 1).setBgColor(getThemedColor(Theme.key_undo_background)).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_CENTER).setJoint(0.0f, 29.0f);
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), Theme.key_undo_cancelColor, 0, new Runnable() { // from class: org.telegram.ui.Stories.DialogStoriesCell$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                DialogStoriesCell.$r8$lambda$cAxV0LXQaLeTA7TgP2-k3qIMUwo(DialogStoriesCell.this);
            }
        });
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
        if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
            replaceSingleTag.setSpan(new TypefaceSpan(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
        }
        HintView2 hintView22 = this.premiumHint;
        hintView22.setMaxWidthPx(HintView2.cutInFancyHalf(replaceSingleTag, hintView22.getTextPaint()));
        this.premiumHint.setText(replaceSingleTag);
        this.premiumHint.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
        if (getParent() instanceof FrameLayout) {
            ((FrameLayout) getParent()).addView(this.premiumHint, LayoutHelper.createFrame(-1, 150, 51));
        }
        return this.premiumHint;
    }

    public static /* synthetic */ void $r8$lambda$cAxV0LXQaLeTA7TgP2-k3qIMUwo(DialogStoriesCell dialogStoriesCell) {
        HintView2 hintView2 = dialogStoriesCell.premiumHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        dialogStoriesCell.fragment.presentFragment(new PremiumPreviewFragment("stories"));
    }

    public void showPremiumHint() {
        makePremiumHint();
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            if (hintView2.shown()) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.premiumHint.show();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.currentState == 2) {
            int size = this.miniItems.size();
            this.miniItemsClickArea.setRect((int) this.listViewMini.getX(), (int) this.listViewMini.getY(), (int) (this.listViewMini.getX() + AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f))), (int) (this.listViewMini.getY() + this.listViewMini.getHeight()));
            if (this.miniItemsClickArea.checkTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void updateStatus(TLRPC.User user, boolean z) {
        if (this.statusDrawable == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
        if (emojiStatusDocumentId != null) {
            boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.statusDrawable.set(emojiStatusDocumentId.longValue(), z);
            this.statusDrawable.setParticles(z2, z);
        } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            if (this.premiumStar == null) {
                this.premiumStar = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.premiumStar = new AnimatedEmojiDrawable.WrapSizeDrawable(this.premiumStar, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f)) { // from class: org.telegram.ui.Stories.DialogStoriesCell.12
                    @Override // org.telegram.ui.Components.AnimatedEmojiDrawable.WrapSizeDrawable, android.graphics.drawable.Drawable
                    public void draw(Canvas canvas) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
                        super.draw(canvas);
                        canvas.restore();
                    }
                };
            }
            this.premiumStar.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
            this.statusDrawable.set(this.premiumStar, z);
            this.statusDrawable.setParticles(false, z);
        } else {
            this.statusDrawable.set((Drawable) null, z);
            this.statusDrawable.setParticles(false, z);
        }
        this.statusDrawable.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
        this.emojiStatusView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThemedColor(int i) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getResourceProvider() == null) {
            return Theme.getColor(i);
        }
        return this.fragment.getThemedColor(i);
    }

    @Override // me.vkryl.android.animator.FactorAnimator.Target
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            checkUi_titleVisibility();
        }
    }

    private void checkUi_titleVisibility() {
        float clamp = MathUtils.clamp(Math.min(this.collapsedProgress, this.collapsedProgress2), 0.0f, 1.0f);
        float floatValue = this.animatorHasTitleText.getFloatValue();
        float f = 1.0f - floatValue;
        float f2 = floatValue * clamp;
        float f3 = f * clamp;
        AnimatedTextView animatedTextView = this.titleView;
        if (animatedTextView != null) {
            animatedTextView.setAlpha(f2);
            this.titleView.setVisibility(f2 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.telegramLogoView;
        if (imageView != null) {
            imageView.setAlpha(f3);
            this.telegramLogoView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.emojiStatusView;
        if (imageView2 != null) {
            imageView2.setAlpha(f3);
            this.emojiStatusView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.setAlpha(clamp);
            this.subtitleOverlayContainer.setVisibility(clamp > 0.0f ? 0 : 8);
        }
    }
}
