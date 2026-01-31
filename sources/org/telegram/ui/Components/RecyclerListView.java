package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.EdgeEffectTrackerFactory;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.FiltersSetupActivity;

/* loaded from: classes5.dex */
public class RecyclerListView extends RecyclerView implements IBlur3Capture {
    private static int[] attributes;
    private static boolean gotAttributes;
    private static final Method initializeScrollbars;
    private static final float[] radii;
    private static final Paint sectionBackgroundPaint;
    private static final Path sectionBackgroundPath;
    private View.AccessibilityDelegate accessibilityDelegate;
    private boolean accessibilityEnabled;
    private int activeTouches;
    private boolean adaptiveOverScroll;
    private boolean allowItemsInteractionDuringAnimation;
    private boolean allowStopHeaveOperations;
    private boolean animateEmptyView;
    public boolean applyPaddingToSections;
    private Paint backgroundPaint;
    private Runnable clickRunnable;
    private final Path clipPath;
    private int currentChildPosition;
    private View currentChildView;
    private int currentFirst;
    int currentSelectedPosition;
    private int currentVisible;
    private boolean disableHighlightState;
    private boolean disallowInterceptTouchEvents;
    private Utilities.Callback5 drawSectionBackground;
    private boolean drawSelection;
    private boolean drawSelectorBehind;
    private final EdgeEffectTrackerFactory edgeEffectTrackerFactory;
    private View emptyView;
    int emptyViewAnimateToVisibility;
    private int emptyViewAnimationType;
    private FastScroll fastScroll;
    public boolean fastScrollAnimationRunning;
    private GestureDetectorFixDoubleTap gestureDetector;
    private GenericProvider getSelectorColor;
    private ArrayList headers;
    private ArrayList headersCache;
    private boolean hiddenByEmptyView;
    private boolean hideIfEmpty;
    private int highlightPosition;
    private boolean ignoreClipChild;
    private boolean ignoreLayout;
    private boolean instantClick;
    private boolean interceptedByChild;
    private boolean isChildViewEnabled;
    private boolean isHidden;
    private Utilities.CallbackReturn isViewTypeSection;
    RecyclerItemsEnterAnimator itemsEnterAnimator;
    private long lastAlphaAnimationTime;
    float lastX;
    float lastY;
    int[] listPaddings;
    private boolean longPressCalled;
    boolean multiSelectionGesture;
    boolean multiSelectionGestureStarted;
    onMultiSelectionChanged multiSelectionListener;
    boolean multiselectScrollRunning;
    boolean multiselectScrollToTop;
    private final RecyclerView.AdapterDataObserver observer;
    private OnInterceptTouchListener onInterceptTouchListener;
    private OnItemClickListener onItemClickListener;
    private OnItemClickListenerExtended onItemClickListenerExtended;
    private OnItemLongClickListener onItemLongClickListener;
    private OnItemLongClickListenerExtended onItemLongClickListenerExtended;
    private RecyclerView.OnScrollListener onScrollListener;
    private FrameLayout overlayContainer;
    private IntReturnCallback pendingHighlightPosition;
    private View pinnedHeader;
    private float pinnedHeaderShadowAlpha;
    private Drawable pinnedHeaderShadowDrawable;
    private float pinnedHeaderShadowTargetAlpha;
    private Runnable removeHighlighSelectionRunnable;
    private boolean resetSelectorOnChanged;
    protected final Theme.ResourcesProvider resourcesProvider;
    private boolean scrollEnabled;
    public boolean scrolledByUserOnce;
    Runnable scroller;
    public boolean scrollingByUser;
    private int sectionOffset;
    private float sectionRadius;
    private float[] sectionRadiusBottom;
    private float[] sectionRadiusTop;
    private ArrayList sections;
    private SectionsAdapter sectionsAdapter;
    private int sectionsCount;
    private ListSectionsDecoration sectionsItemDecoration;
    private int sectionsType;
    private Runnable selectChildRunnable;
    HashSet selectedPositions;
    protected Drawable selectorDrawable;
    protected int selectorPosition;
    private int selectorRadius;
    protected android.graphics.Rect selectorRect;
    protected Consumer selectorTransformer;
    private int selectorType;
    protected View selectorView;
    private boolean selfOnLayout;
    private Matrix selfTransformationsMatrix;
    private int startSection;
    int startSelectionFrom;
    private boolean stoppedAllHeavyOperations;
    private int topBottomSelectorRadius;
    private int touchSlop;
    private int translateSelector;
    public boolean useLayoutPositionOnClick;
    boolean useRelativePositions;

    public interface IntReturnCallback {
        int run();
    }

    public interface OnInterceptTouchListener {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public interface OnItemClickListenerExtended {

        public abstract /* synthetic */ class -CC {
            public static boolean $default$hasDoubleTap(OnItemClickListenerExtended onItemClickListenerExtended, View view, int i) {
                return false;
            }

            public static void $default$onDoubleTap(OnItemClickListenerExtended onItemClickListenerExtended, View view, int i, float f, float f2) {
            }
        }

        boolean hasDoubleTap(View view, int i);

        void onDoubleTap(View view, int i, float f, float f2);

        void onItemClick(View view, int i, float f, float f2);
    }

    public interface OnItemLongClickListener {
        boolean onItemClick(View view, int i);
    }

    public interface OnItemLongClickListenerExtended {

        public abstract /* synthetic */ class -CC {
            public static void $default$onLongClickRelease(OnItemLongClickListenerExtended onItemLongClickListenerExtended) {
            }

            public static void $default$onMove(OnItemLongClickListenerExtended onItemLongClickListenerExtended, float f, float f2) {
            }
        }

        boolean onItemClick(View view, int i, float f, float f2);

        void onLongClickRelease();

        void onMove(float f, float f2);
    }

    public static abstract class SelectionAdapter extends RecyclerView.Adapter {
        public int getSelectionBottomPadding(View view) {
            return 0;
        }

        public abstract boolean isEnabled(RecyclerView.ViewHolder viewHolder);
    }

    public interface onMultiSelectionChanged {
        boolean canSelect(int i);

        int checkPosition(int i, boolean z);

        void getPaddings(int[] iArr);

        boolean limitReached();

        void onSelectionChanged(int i, boolean z, float f, float f2);

        void scrollBy(int i);
    }

    protected boolean allowSelectChildAtPosition(float f, float f2) {
        return true;
    }

    protected boolean allowSelectChildAtPosition(View view) {
        return true;
    }

    protected boolean canHighlightChildAt(View view, float f, float f2) {
        return true;
    }

    protected void emptyViewUpdated(boolean z, boolean z2) {
    }

    public ViewParent getTouchParent() {
        return null;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        initializeScrollbars = method;
        sectionBackgroundPaint = new Paint(1);
        sectionBackgroundPath = new Path();
        radii = new float[8];
    }

    public void setSelectorTransformer(Consumer consumer) {
        this.selectorTransformer = consumer;
    }

    public FastScroll getFastScroll() {
        return this.fastScroll;
    }

    public static abstract class FastScrollAdapter extends SelectionAdapter {
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return true;
        }

        public abstract String getLetter(int i);

        public abstract void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr);

        public void onFastScrollSingleTap() {
        }

        public void onFinishFastScroll(RecyclerListView recyclerListView) {
        }

        public void onStartFastScroll() {
        }

        public int getTotalItemsCount() {
            return getItemCount();
        }

        public float getScrollProgress(RecyclerListView recyclerListView) {
            return recyclerListView.computeVerticalScrollOffset() / ((getTotalItemsCount() * recyclerListView.getChildAt(0).getMeasuredHeight()) - recyclerListView.getMeasuredHeight());
        }
    }

    public static abstract class SectionsAdapter extends FastScrollAdapter {
        private int count;
        private ArrayList hashes = new ArrayList();
        private SparseIntArray sectionCache;
        private int sectionCount;
        private SparseIntArray sectionCountCache;
        private SparseIntArray sectionPositionCache;

        public abstract int getCountForSection(int i);

        public abstract Object getItem(int i, int i2);

        public abstract int getItemViewType(int i, int i2);

        public abstract int getSectionCount();

        public abstract View getSectionHeaderView(int i, View view);

        public abstract boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2);

        public abstract void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder);

        public void cleanupCache() {
            SparseIntArray sparseIntArray = this.sectionCache;
            if (sparseIntArray == null) {
                this.sectionCache = new SparseIntArray();
                this.sectionPositionCache = new SparseIntArray();
                this.sectionCountCache = new SparseIntArray();
            } else {
                sparseIntArray.clear();
                this.sectionPositionCache.clear();
                this.sectionCountCache.clear();
            }
            this.count = -1;
            this.sectionCount = -1;
        }

        public void notifySectionsChanged() {
            cleanupCache();
        }

        public SectionsAdapter() {
            cleanupCache();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void notifyDataSetChanged() {
            update(false);
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return isEnabled(viewHolder, getSectionForPosition(adapterPosition), getPositionInSectionForPosition(adapterPosition));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int i = this.count;
            if (i >= 0) {
                return i;
            }
            this.count = 0;
            int internalGetSectionCount = internalGetSectionCount();
            for (int i2 = 0; i2 < internalGetSectionCount; i2++) {
                this.count += internalGetCountForSection(i2);
            }
            return this.count;
        }

        public final Object getItem(int i) {
            return getItem(getSectionForPosition(i), getPositionInSectionForPosition(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return getItemViewType(getSectionForPosition(i), getPositionInSectionForPosition(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            onBindViewHolder(getSectionForPosition(i), getPositionInSectionForPosition(i), viewHolder);
        }

        private int internalGetCountForSection(int i) {
            int i2 = this.sectionCountCache.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            int countForSection = getCountForSection(i);
            this.sectionCountCache.put(i, countForSection);
            return countForSection;
        }

        private int internalGetSectionCount() {
            int i = this.sectionCount;
            if (i >= 0) {
                return i;
            }
            int sectionCount = getSectionCount();
            this.sectionCount = sectionCount;
            return sectionCount;
        }

        public final int getSectionForPosition(int i) {
            int i2 = this.sectionCache.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            int internalGetSectionCount = internalGetSectionCount();
            int i3 = 0;
            int i4 = 0;
            while (i3 < internalGetSectionCount) {
                int internalGetCountForSection = internalGetCountForSection(i3) + i4;
                if (i >= i4 && i < internalGetCountForSection) {
                    this.sectionCache.put(i, i3);
                    return i3;
                }
                i3++;
                i4 = internalGetCountForSection;
            }
            return -1;
        }

        public int getPositionInSectionForPosition(int i) {
            int i2 = this.sectionPositionCache.get(i, ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            int internalGetSectionCount = internalGetSectionCount();
            int i3 = 0;
            int i4 = 0;
            while (i3 < internalGetSectionCount) {
                int internalGetCountForSection = internalGetCountForSection(i3) + i4;
                if (i >= i4 && i < internalGetCountForSection) {
                    int i5 = i - i4;
                    this.sectionPositionCache.put(i, i5);
                    return i5;
                }
                i3++;
                i4 = internalGetCountForSection;
            }
            return -1;
        }

        public void update(boolean z) {
            final ArrayList arrayList = new ArrayList(this.hashes);
            updateHashes();
            if (z) {
                DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: org.telegram.ui.Components.RecyclerListView.SectionsAdapter.1
                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getOldListSize() {
                        return arrayList.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public int getNewListSize() {
                        return SectionsAdapter.this.hashes.size();
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areItemsTheSame(int i, int i2) {
                        return Objects.equals(arrayList.get(i), SectionsAdapter.this.hashes.get(i2));
                    }

                    @Override // androidx.recyclerview.widget.DiffUtil.Callback
                    public boolean areContentsTheSame(int i, int i2) {
                        return areItemsTheSame(i, i2);
                    }
                }, true).dispatchUpdatesTo(this);
            } else {
                super.notifyDataSetChanged();
            }
        }

        public void updateHashes() {
            cleanupCache();
            this.hashes.clear();
            int internalGetSectionCount = internalGetSectionCount();
            for (int i = 0; i < internalGetSectionCount; i++) {
                int internalGetCountForSection = internalGetCountForSection(i);
                for (int i2 = 0; i2 < internalGetCountForSection; i2++) {
                    this.hashes.add(Integer.valueOf(getHash(i, i2)));
                }
            }
        }

        public int getHash(int i, int i2) {
            return Objects.hash(Integer.valueOf((-49612) * i), getItem(i, i2));
        }
    }

    public static class Holder extends RecyclerView.ViewHolder {
        public Holder(View view) {
            super(view);
        }
    }

    public class FastScroll extends View {
        private int activeColor;
        private Path arrowPath;
        private float bubbleProgress;
        private String currentLetter;
        Drawable fastScrollBackgroundDrawable;
        Drawable fastScrollShadowDrawable;
        private float floatingDateProgress;
        private boolean floatingDateVisible;
        private boolean fromTop;
        private float fromWidth;
        Runnable hideFloatingDateRunnable;
        private StaticLayout inLetterLayout;
        private int inactiveColor;
        boolean isMoving;
        boolean isRtl;
        public boolean isVisible;
        private float lastLetterY;
        private long lastUpdateTime;
        private float lastY;
        private StaticLayout letterLayout;
        private TextPaint letterPaint;
        private StaticLayout oldLetterLayout;
        private StaticLayout outLetterLayout;
        private Paint paint;
        private Paint paint2;
        private Path path;
        private int[] positionWithOffset;
        private boolean pressed;
        private float progress;
        private float[] radii;
        private RectF rect;
        private float replaceLayoutProgress;
        private int scrollX;
        private StaticLayout stableLetterLayout;
        private float startDy;
        long startTime;
        float startY;
        private float textX;
        private float textY;
        public int topOffset;
        float touchSlop;
        private int type;
        public boolean usePadding;
        float viewAlpha;
        float visibilityAlpha;

        public FastScroll(Context context, int i) {
            super(context);
            this.usePadding = true;
            this.rect = new RectF();
            this.paint = new Paint(1);
            this.paint2 = new Paint(1);
            this.replaceLayoutProgress = 1.0f;
            this.letterPaint = new TextPaint(1);
            this.path = new Path();
            this.arrowPath = new Path();
            this.radii = new float[8];
            this.positionWithOffset = new int[2];
            this.hideFloatingDateRunnable = new Runnable() { // from class: org.telegram.ui.Components.RecyclerListView.FastScroll.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!FastScroll.this.pressed) {
                        FastScroll.this.floatingDateVisible = false;
                        FastScroll.this.invalidate();
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(FastScroll.this.hideFloatingDateRunnable);
                        AndroidUtilities.runOnUIThread(FastScroll.this.hideFloatingDateRunnable, 4000L);
                    }
                }
            };
            this.viewAlpha = 1.0f;
            this.type = i;
            if (i == 0) {
                this.letterPaint.setTextSize(AndroidUtilities.dp(45.0f));
                this.isRtl = LocaleController.isRTL;
            } else {
                this.isRtl = false;
                this.letterPaint.setTextSize(AndroidUtilities.dp(13.0f));
                this.letterPaint.setTypeface(AndroidUtilities.bold());
                Paint paint = this.paint2;
                int i2 = Theme.key_windowBackgroundWhite;
                paint.setColor(Theme.getColor(i2, RecyclerListView.this.resourcesProvider));
                Drawable mutate = ContextCompat.getDrawable(context, R.drawable.calendar_date).mutate();
                this.fastScrollBackgroundDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(Theme.getColor(i2, RecyclerListView.this.resourcesProvider), -1, 0.1f), PorterDuff.Mode.MULTIPLY));
            }
            for (int i3 = 0; i3 < 8; i3++) {
                this.radii[i3] = AndroidUtilities.dp(44.0f);
            }
            this.scrollX = AndroidUtilities.dp(this.isRtl ? 10.0f : (i == 0 ? NotificationCenter.walletPendingTransactionsChanged : NotificationCenter.appConfigUpdated) - 15);
            if (RecyclerListView.this.hasSections()) {
                this.scrollX += AndroidUtilities.dp(this.isRtl ? -4.0f : 6.0f);
            }
            updateColors();
            setFocusableInTouchMode(true);
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.fastScrollShadowDrawable = ContextCompat.getDrawable(context, R.drawable.fast_scroll_shadow);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateColors() {
            this.inactiveColor = this.type == 0 ? Theme.getColor(Theme.key_fastScrollInactive, RecyclerListView.this.resourcesProvider) : ColorUtils.setAlphaComponent(-16777216, 102);
            this.activeColor = Theme.getColor(Theme.key_fastScrollActive, RecyclerListView.this.resourcesProvider);
            this.paint.setColor(this.inactiveColor);
            if (this.type == 0) {
                this.letterPaint.setColor(Theme.getColor(Theme.key_fastScrollText, RecyclerListView.this.resourcesProvider));
            } else {
                this.letterPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, RecyclerListView.this.resourcesProvider));
            }
            invalidate();
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x015a, code lost:
        
            if (r0 <= (org.telegram.messenger.AndroidUtilities.dp(30.0f) + r8)) goto L81;
         */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.isVisible) {
                this.pressed = false;
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.lastY = y;
                this.startY = y;
                float ceil = ((float) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.progress)) + AndroidUtilities.dp(12.0f);
                if ((!this.isRtl || x <= AndroidUtilities.dp(25.0f)) && (this.isRtl || x >= AndroidUtilities.dp(107.0f))) {
                    float f = this.lastY;
                    if (f >= ceil && f <= AndroidUtilities.dp(30.0f) + ceil) {
                        if (this.type == 1 && !this.floatingDateVisible) {
                            if ((!this.isRtl || x <= AndroidUtilities.dp(25.0f)) && (this.isRtl || x >= getMeasuredWidth() - AndroidUtilities.dp(25.0f))) {
                                float f2 = this.lastY;
                                if (f2 >= ceil) {
                                }
                            }
                            return false;
                        }
                        this.startDy = this.lastY - ceil;
                        this.startTime = System.currentTimeMillis();
                        this.pressed = true;
                        this.isMoving = false;
                        this.lastUpdateTime = System.currentTimeMillis();
                        invalidate();
                        RecyclerView.Adapter adapter = RecyclerListView.this.getAdapter();
                        showFloatingDate();
                        if (adapter instanceof FastScrollAdapter) {
                            ((FastScrollAdapter) adapter).onStartFastScroll();
                        }
                        return true;
                    }
                }
                return false;
            }
            if (action != 1) {
                if (action == 2) {
                    if (!this.pressed) {
                        return true;
                    }
                    if (Math.abs(motionEvent.getY() - this.startY) > this.touchSlop) {
                        this.isMoving = true;
                    }
                    if (this.isMoving) {
                        float y2 = motionEvent.getY();
                        float dp = AndroidUtilities.dp(12.0f) + this.startDy;
                        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(42.0f)) + this.startDy;
                        if (y2 < dp) {
                            y2 = dp;
                        } else if (y2 > measuredHeight) {
                            y2 = measuredHeight;
                        }
                        float f3 = y2 - this.lastY;
                        this.lastY = y2;
                        float measuredHeight2 = this.progress + (f3 / (getMeasuredHeight() - AndroidUtilities.dp(54.0f)));
                        this.progress = measuredHeight2;
                        if (measuredHeight2 < 0.0f) {
                            this.progress = 0.0f;
                        } else if (measuredHeight2 > 1.0f) {
                            this.progress = 1.0f;
                        }
                        getCurrentLetter(true);
                        invalidate();
                    }
                    return true;
                }
                if (action != 3) {
                    return this.pressed;
                }
            }
            RecyclerView.Adapter adapter2 = RecyclerListView.this.getAdapter();
            if (this.pressed && !this.isMoving && System.currentTimeMillis() - this.startTime < 150 && (adapter2 instanceof FastScrollAdapter)) {
                ((FastScrollAdapter) adapter2).onFastScrollSingleTap();
            }
            this.isMoving = false;
            this.pressed = false;
            this.lastUpdateTime = System.currentTimeMillis();
            invalidate();
            if (adapter2 instanceof FastScrollAdapter) {
                ((FastScrollAdapter) adapter2).onFinishFastScroll(RecyclerListView.this);
            }
            showFloatingDate();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getCurrentLetter(boolean z) {
            RecyclerView.LayoutManager layoutManager = RecyclerListView.this.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.getOrientation() == 1) {
                    RecyclerView.Adapter adapter = RecyclerListView.this.getAdapter();
                    if (adapter instanceof FastScrollAdapter) {
                        FastScrollAdapter fastScrollAdapter = (FastScrollAdapter) adapter;
                        fastScrollAdapter.getPositionForScrollProgress(RecyclerListView.this, this.progress, this.positionWithOffset);
                        if (z) {
                            int[] iArr = this.positionWithOffset;
                            linearLayoutManager.scrollToPositionWithOffset(iArr[0], (-iArr[1]) + RecyclerListView.this.sectionOffset);
                        }
                        String letter = fastScrollAdapter.getLetter(this.positionWithOffset[0]);
                        if (letter == null) {
                            StaticLayout staticLayout = this.letterLayout;
                            if (staticLayout != null) {
                                this.oldLetterLayout = staticLayout;
                            }
                            this.letterLayout = null;
                            return;
                        }
                        if (letter.equals(this.currentLetter)) {
                            return;
                        }
                        this.currentLetter = letter;
                        if (this.type == 0) {
                            this.letterLayout = new StaticLayout(letter, this.letterPaint, MediaDataController.MAX_STYLE_RUNS_COUNT, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.outLetterLayout = this.letterLayout;
                            int measureText = ((int) this.letterPaint.measureText(letter)) + 1;
                            TextPaint textPaint = this.letterPaint;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.letterLayout = new StaticLayout(letter, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.outLetterLayout != null) {
                                String[] split = letter.split(" ");
                                String[] split2 = this.outLetterLayout.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.outLetterLayout.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new EmptyStubSpan(), split2[0].length(), charSequence.length(), 0);
                                    this.outLetterLayout = new StaticLayout(spannableStringBuilder, this.letterPaint, ((int) this.letterPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(letter);
                                    spannableStringBuilder2.setSpan(new EmptyStubSpan(), split[0].length(), letter.length(), 0);
                                    this.inLetterLayout = new StaticLayout(spannableStringBuilder2, this.letterPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(letter);
                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), 0, split[0].length(), 0);
                                    this.stableLetterLayout = new StaticLayout(spannableStringBuilder3, this.letterPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.inLetterLayout = this.letterLayout;
                                    this.stableLetterLayout = null;
                                }
                                this.fromWidth = this.outLetterLayout.getWidth();
                                this.replaceLayoutProgress = 0.0f;
                                this.fromTop = getProgress() > this.lastLetterY;
                            }
                            this.lastLetterY = getProgress();
                        }
                        this.oldLetterLayout = null;
                        if (this.letterLayout.getLineCount() > 0) {
                            this.letterLayout.getLineWidth(0);
                            this.letterLayout.getLineLeft(0);
                            if (this.isRtl) {
                                this.textX = (AndroidUtilities.dp(10.0f) + ((AndroidUtilities.dp(88.0f) - this.letterLayout.getLineWidth(0)) / 2.0f)) - this.letterLayout.getLineLeft(0);
                            } else {
                                this.textX = ((AndroidUtilities.dp(88.0f) - this.letterLayout.getLineWidth(0)) / 2.0f) - this.letterLayout.getLineLeft(0);
                            }
                            this.textY = (AndroidUtilities.dp(88.0f) - this.letterLayout.getHeight()) / 2;
                        }
                    }
                }
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(this.type == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i2));
            this.arrowPath.reset();
            this.arrowPath.setLastPoint(0.0f, 0.0f);
            this.arrowPath.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            this.arrowPath.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            this.arrowPath.close();
        }

        /* JADX WARN: Code restructure failed: missing block: B:70:0x01f1, code lost:
        
            if (r14[6] == r9) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0201, code lost:
        
            if (r14[4] == r9) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onDraw(Canvas canvas) {
            int i;
            float f;
            float dp;
            float dp2;
            StaticLayout staticLayout;
            int paddingTop = (this.usePadding ? getPaddingTop() : 0) + ((int) Math.ceil(((getMeasuredHeight() - r2) - AndroidUtilities.dp(54.0f)) * this.progress));
            this.rect.set(this.scrollX, AndroidUtilities.dp(12.0f) + paddingTop, this.scrollX + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(42.0f) + paddingTop);
            if (this.type == 0) {
                this.paint.setColor(ColorUtils.blendARGB(this.inactiveColor, this.activeColor, this.bubbleProgress));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.paint);
            } else {
                this.paint.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite, RecyclerListView.this.resourcesProvider), -1, 0.1f));
                float dp3 = AndroidUtilities.dp(27.0f) + paddingTop;
                this.fastScrollShadowDrawable.setBounds(getMeasuredWidth() - this.fastScrollShadowDrawable.getIntrinsicWidth(), (int) (dp3 - (this.fastScrollShadowDrawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (dp3 + (this.fastScrollShadowDrawable.getIntrinsicHeight() / 2)));
                this.fastScrollShadowDrawable.draw(canvas);
                canvas.drawCircle(this.scrollX + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(27.0f) + paddingTop, AndroidUtilities.dp(24.0f), this.paint);
                this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, RecyclerListView.this.resourcesProvider));
                canvas.save();
                canvas.translate(this.scrollX + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(34.0f) + paddingTop + (AndroidUtilities.dp(2.0f) * this.bubbleProgress));
                canvas.drawPath(this.arrowPath, this.paint);
                canvas.restore();
                canvas.save();
                canvas.translate(this.scrollX + AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(24.0f) + paddingTop) - (AndroidUtilities.dp(2.0f) * this.bubbleProgress));
                canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
                canvas.drawPath(this.arrowPath, this.paint);
                canvas.restore();
            }
            int i2 = this.type;
            if (i2 == 0) {
                if (this.isMoving || this.bubbleProgress != 0.0f) {
                    this.paint.setAlpha((int) (this.bubbleProgress * 255.0f));
                    int dp4 = AndroidUtilities.dp(30.0f) + paddingTop;
                    int dp5 = paddingTop - AndroidUtilities.dp(46.0f);
                    if (dp5 <= AndroidUtilities.dp(12.0f)) {
                        f = AndroidUtilities.dp(12.0f) - dp5;
                        i = AndroidUtilities.dp(12.0f);
                    } else {
                        i = dp5;
                        f = 0.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(10.0f), i);
                    if (f <= AndroidUtilities.dp(29.0f)) {
                        dp2 = AndroidUtilities.dp(44.0f);
                        dp = AndroidUtilities.dp(4.0f) + ((f / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f));
                    } else {
                        dp = AndroidUtilities.dp(44.0f);
                        dp2 = ((1.0f - ((f - AndroidUtilities.dp(29.0f)) / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(4.0f);
                    }
                    boolean z = this.isRtl;
                    if (z) {
                        float[] fArr = this.radii;
                        if (fArr[0] == dp2) {
                        }
                        if (!z) {
                            float[] fArr2 = this.radii;
                            fArr2[1] = dp2;
                            fArr2[0] = dp2;
                            fArr2[7] = dp;
                            fArr2[6] = dp;
                        } else {
                            float[] fArr3 = this.radii;
                            fArr3[3] = dp2;
                            fArr3[2] = dp2;
                            fArr3[5] = dp;
                            fArr3[4] = dp;
                        }
                        this.path.reset();
                        this.rect.set(!this.isRtl ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(!this.isRtl ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                        this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
                        this.path.close();
                        staticLayout = this.letterLayout;
                        if (staticLayout == null) {
                            staticLayout = this.oldLetterLayout;
                        }
                        if (staticLayout != null) {
                            canvas.save();
                            float f2 = this.bubbleProgress;
                            canvas.scale(f2, f2, this.scrollX, dp4 - i);
                            canvas.drawPath(this.path, this.paint);
                            canvas.translate(this.textX, this.textY);
                            staticLayout.draw(canvas);
                            canvas.restore();
                        }
                    }
                    if (!z) {
                        float[] fArr4 = this.radii;
                        if (fArr4[2] == dp2) {
                        }
                        if (!z) {
                        }
                        this.path.reset();
                        this.rect.set(!this.isRtl ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(!this.isRtl ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                        this.path.addRoundRect(this.rect, this.radii, Path.Direction.CW);
                        this.path.close();
                    }
                    staticLayout = this.letterLayout;
                    if (staticLayout == null) {
                    }
                    if (staticLayout != null) {
                    }
                }
            } else if (i2 == 1 && this.letterLayout != null && this.floatingDateProgress != 0.0f) {
                canvas.save();
                float f3 = (this.floatingDateProgress * 0.3f) + 0.7f;
                canvas.scale(f3, f3, this.rect.right - AndroidUtilities.dp(12.0f), this.rect.centerY());
                float centerY = this.rect.centerY();
                float dp6 = (this.rect.left - (AndroidUtilities.dp(30.0f) * this.bubbleProgress)) - AndroidUtilities.dp(8.0f);
                this.letterLayout.getHeight();
                AndroidUtilities.dp(6.0f);
                this.rect.set((dp6 - ((this.replaceLayoutProgress * this.letterLayout.getWidth()) + (this.fromWidth * (1.0f - this.replaceLayoutProgress)))) - AndroidUtilities.dp(36.0f), (centerY - (this.letterLayout.getHeight() / 2.0f)) - AndroidUtilities.dp(8.0f), dp6 - AndroidUtilities.dp(12.0f), (this.letterLayout.getHeight() / 2.0f) + centerY + AndroidUtilities.dp(8.0f));
                int alpha = this.paint2.getAlpha();
                int alpha2 = this.letterPaint.getAlpha();
                this.paint2.setAlpha((int) (alpha * this.floatingDateProgress));
                Drawable drawable = this.fastScrollBackgroundDrawable;
                RectF rectF = this.rect;
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.fastScrollBackgroundDrawable.setAlpha((int) (this.floatingDateProgress * 255.0f));
                this.fastScrollBackgroundDrawable.draw(canvas);
                float f4 = this.replaceLayoutProgress;
                if (f4 != 1.0f) {
                    float f5 = f4 + 0.10666667f;
                    this.replaceLayoutProgress = f5;
                    if (f5 > 1.0f) {
                        this.replaceLayoutProgress = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.replaceLayoutProgress != 1.0f) {
                    canvas.save();
                    this.rect.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
                    canvas.clipRect(this.rect);
                    if (this.outLetterLayout != null) {
                        this.letterPaint.setAlpha((int) (alpha2 * this.floatingDateProgress * (1.0f - this.replaceLayoutProgress)));
                        canvas.save();
                        canvas.translate((dp6 - this.outLetterLayout.getWidth()) - AndroidUtilities.dp(24.0f), (centerY - (this.outLetterLayout.getHeight() / 2.0f)) + ((this.fromTop ? -1 : 1) * AndroidUtilities.dp(15.0f) * this.replaceLayoutProgress));
                        this.outLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    if (this.inLetterLayout != null) {
                        this.letterPaint.setAlpha((int) (alpha2 * this.floatingDateProgress * this.replaceLayoutProgress));
                        canvas.save();
                        canvas.translate((dp6 - this.inLetterLayout.getWidth()) - AndroidUtilities.dp(24.0f), (centerY - (this.inLetterLayout.getHeight() / 2.0f)) + (AndroidUtilities.dp(15.0f) * (this.fromTop ? 1 : -1) * (1.0f - this.replaceLayoutProgress)));
                        this.inLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    if (this.stableLetterLayout != null) {
                        this.letterPaint.setAlpha((int) (alpha2 * this.floatingDateProgress));
                        canvas.save();
                        canvas.translate((dp6 - this.stableLetterLayout.getWidth()) - AndroidUtilities.dp(24.0f), centerY - (this.stableLetterLayout.getHeight() / 2.0f));
                        this.stableLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    this.letterPaint.setAlpha((int) (alpha2 * this.floatingDateProgress));
                    canvas.save();
                    canvas.translate((dp6 - this.letterLayout.getWidth()) - AndroidUtilities.dp(24.0f), (centerY - (this.letterLayout.getHeight() / 2.0f)) + (AndroidUtilities.dp(15.0f) * (1.0f - this.replaceLayoutProgress)));
                    this.letterLayout.draw(canvas);
                    canvas.restore();
                }
                this.paint2.setAlpha(alpha);
                this.letterPaint.setAlpha(alpha2);
                canvas.restore();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastUpdateTime;
            if (j < 0 || j > 17) {
                j = 17;
            }
            boolean z2 = this.isMoving;
            if ((z2 && this.letterLayout != null && this.bubbleProgress < 1.0f) || ((!z2 || this.letterLayout == null) && this.bubbleProgress > 0.0f)) {
                this.lastUpdateTime = currentTimeMillis;
                invalidate();
                if (this.isMoving && this.letterLayout != null) {
                    float f6 = this.bubbleProgress + (j / 120.0f);
                    this.bubbleProgress = f6;
                    if (f6 > 1.0f) {
                        this.bubbleProgress = 1.0f;
                    }
                } else {
                    float f7 = this.bubbleProgress - (j / 120.0f);
                    this.bubbleProgress = f7;
                    if (f7 < 0.0f) {
                        this.bubbleProgress = 0.0f;
                    }
                }
            }
            boolean z3 = this.floatingDateVisible;
            if (z3) {
                float f8 = this.floatingDateProgress;
                if (f8 != 1.0f) {
                    float f9 = f8 + (j / 120.0f);
                    this.floatingDateProgress = f9;
                    if (f9 > 1.0f) {
                        this.floatingDateProgress = 1.0f;
                    }
                    invalidate();
                    return;
                }
            }
            if (z3) {
                return;
            }
            float f10 = this.floatingDateProgress;
            if (f10 != 0.0f) {
                float f11 = f10 - (j / 120.0f);
                this.floatingDateProgress = f11;
                if (f11 < 0.0f) {
                    this.floatingDateProgress = 0.0f;
                }
                invalidate();
            }
        }

        @Override // android.view.View
        public void layout(int i, int i2, int i3, int i4) {
            if (RecyclerListView.this.selfOnLayout) {
                super.layout(i, i2, i3, i4);
            }
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }

        @Override // android.view.View
        public boolean isPressed() {
            return this.pressed;
        }

        public void showFloatingDate() {
            if (this.type != 1) {
                return;
            }
            if (!this.floatingDateVisible) {
                this.floatingDateVisible = true;
                invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
            AndroidUtilities.runOnUIThread(this.hideFloatingDateRunnable, 2000L);
        }

        public void setIsVisible(boolean z) {
            if (this.isVisible != z) {
                this.isVisible = z;
                float f = z ? 1.0f : 0.0f;
                this.visibilityAlpha = f;
                super.setAlpha(this.viewAlpha * f);
            }
        }

        public void setVisibilityAlpha(float f) {
            if (this.visibilityAlpha != f) {
                this.visibilityAlpha = f;
                super.setAlpha(this.viewAlpha * f);
            }
        }

        @Override // android.view.View
        public void setAlpha(float f) {
            if (this.viewAlpha != f) {
                this.viewAlpha = f;
                super.setAlpha(f * this.visibilityAlpha);
            }
        }

        @Override // android.view.View
        public float getAlpha() {
            return this.viewAlpha;
        }

        public int getScrollBarY() {
            return ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.progress)) + AndroidUtilities.dp(17.0f);
        }

        public float getProgress() {
            return this.progress;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class RecyclerListViewItemClickListener implements RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        public RecyclerListViewItemClickListener(Context context) {
            RecyclerListView.this.gestureDetector = new GestureDetectorFixDoubleTap(context, new GestureDetectorFixDoubleTap.OnGestureListener() { // from class: org.telegram.ui.Components.RecyclerListView.RecyclerListViewItemClickListener.1
                private View doubleTapView;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onDown(MotionEvent motionEvent) {
                    return false;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    if (RecyclerListView.this.currentChildView != null) {
                        if (RecyclerListView.this.onItemClickListenerExtended == null || !RecyclerListView.this.onItemClickListenerExtended.hasDoubleTap(RecyclerListView.this.currentChildView, RecyclerListView.this.currentChildPosition)) {
                            onPressItem(RecyclerListView.this.currentChildView, motionEvent);
                        } else {
                            this.doubleTapView = RecyclerListView.this.currentChildView;
                        }
                    }
                    return false;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (this.doubleTapView == null || RecyclerListView.this.onItemClickListenerExtended == null || !RecyclerListView.this.onItemClickListenerExtended.hasDoubleTap(this.doubleTapView, RecyclerListView.this.currentChildPosition)) {
                        return false;
                    }
                    onPressItem(this.doubleTapView, motionEvent);
                    this.doubleTapView = null;
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    if (this.doubleTapView == null || RecyclerListView.this.onItemClickListenerExtended == null || !RecyclerListView.this.onItemClickListenerExtended.hasDoubleTap(this.doubleTapView, RecyclerListView.this.currentChildPosition)) {
                        return false;
                    }
                    RecyclerListView.this.onItemClickListenerExtended.onDoubleTap(this.doubleTapView, RecyclerListView.this.currentChildPosition, motionEvent.getX(), motionEvent.getY());
                    this.doubleTapView = null;
                    return true;
                }

                private void onPressItem(final View view, MotionEvent motionEvent) {
                    if (view != null) {
                        if (RecyclerListView.this.onItemClickListener == null && RecyclerListView.this.onItemClickListenerExtended == null) {
                            return;
                        }
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        RecyclerListView.this.onChildPressed(view, x, y, true);
                        final int i = RecyclerListView.this.currentChildPosition;
                        if (RecyclerListView.this.instantClick && i != -1) {
                            try {
                                view.playSoundEffect(0);
                            } catch (Exception unused) {
                            }
                            view.sendAccessibilityEvent(1);
                            if (RecyclerListView.this.onItemClickListener != null) {
                                RecyclerListView.this.onItemClickListener.onItemClick(view, i);
                            } else if (RecyclerListView.this.onItemClickListenerExtended != null) {
                                RecyclerListView.this.onItemClickListenerExtended.onItemClick(view, i, x - view.getX(), y - view.getY());
                            }
                        }
                        AndroidUtilities.runOnUIThread(RecyclerListView.this.clickRunnable = new Runnable() { // from class: org.telegram.ui.Components.RecyclerListView.RecyclerListViewItemClickListener.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (this == RecyclerListView.this.clickRunnable) {
                                    RecyclerListView.this.clickRunnable = null;
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    RecyclerListView.this.onChildPressed(view2, 0.0f, 0.0f, false);
                                    if (RecyclerListView.this.instantClick) {
                                        return;
                                    }
                                    try {
                                        view.playSoundEffect(0);
                                    } catch (Exception unused2) {
                                    }
                                    view.sendAccessibilityEvent(1);
                                    if (i != -1) {
                                        if (RecyclerListView.this.onItemClickListener != null) {
                                            RecyclerListView.this.onItemClickListener.onItemClick(view, i);
                                        } else if (RecyclerListView.this.onItemClickListenerExtended != null) {
                                            OnItemClickListenerExtended onItemClickListenerExtended = RecyclerListView.this.onItemClickListenerExtended;
                                            View view3 = view;
                                            onItemClickListenerExtended.onItemClick(view3, i, x - view3.getX(), y - view.getY());
                                        }
                                    }
                                }
                            }
                        }, ViewConfiguration.getPressedStateDuration());
                        if (RecyclerListView.this.selectChildRunnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(RecyclerListView.this.selectChildRunnable);
                            RecyclerListView.this.selectChildRunnable = null;
                            RecyclerListView.this.currentChildView = null;
                            RecyclerListView.this.interceptedByChild = false;
                            RecyclerListView.this.removeSelection(view, motionEvent);
                        }
                    }
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    if (RecyclerListView.this.currentChildView == null || RecyclerListView.this.currentChildPosition == -1) {
                        return;
                    }
                    if (RecyclerListView.this.onItemLongClickListener == null && RecyclerListView.this.onItemLongClickListenerExtended == null) {
                        return;
                    }
                    View view = RecyclerListView.this.currentChildView;
                    if (RecyclerListView.this.onItemLongClickListener != null) {
                        if (RecyclerListView.this.onItemLongClickListener.onItemClick(RecyclerListView.this.currentChildView, RecyclerListView.this.currentChildPosition)) {
                            try {
                                view.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            view.sendAccessibilityEvent(2);
                            return;
                        }
                        return;
                    }
                    if (RecyclerListView.this.onItemLongClickListenerExtended.onItemClick(RecyclerListView.this.currentChildView, RecyclerListView.this.currentChildPosition, motionEvent.getX() - RecyclerListView.this.currentChildView.getX(), motionEvent.getY() - RecyclerListView.this.currentChildView.getY())) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                        view.sendAccessibilityEvent(2);
                        RecyclerListView.this.longPressCalled = true;
                    }
                }

                @Override // org.telegram.ui.Components.GestureDetectorFixDoubleTap.OnGestureListener
                public boolean hasDoubleTap(MotionEvent motionEvent) {
                    return RecyclerListView.this.onItemLongClickListenerExtended != null;
                }
            });
            RecyclerListView.this.gestureDetector.setIsLongpressEnabled(false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            View findChildViewUnder;
            int actionMasked = motionEvent.getActionMasked();
            boolean z = RecyclerListView.this.getScrollState() == 0;
            if ((actionMasked == 0 || actionMasked == 5) && RecyclerListView.this.currentChildView == null && z) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                RecyclerListView.this.longPressCalled = false;
                RecyclerView.ItemAnimator itemAnimator = RecyclerListView.this.getItemAnimator();
                if ((RecyclerListView.this.allowItemsInteractionDuringAnimation || itemAnimator == null || !itemAnimator.isRunning()) && RecyclerListView.this.allowSelectChildAtPosition(x, y) && (findChildViewUnder = RecyclerListView.this.findChildViewUnder(x, y)) != null && RecyclerListView.this.allowSelectChildAtPosition(findChildViewUnder)) {
                    RecyclerListView.this.currentChildView = findChildViewUnder;
                }
                if (RecyclerListView.this.currentChildView instanceof ViewGroup) {
                    float x2 = motionEvent.getX() - RecyclerListView.this.currentChildView.getLeft();
                    float y2 = motionEvent.getY() - RecyclerListView.this.currentChildView.getTop();
                    ViewGroup viewGroup = (ViewGroup) RecyclerListView.this.currentChildView;
                    int childCount = viewGroup.getChildCount() - 1;
                    while (true) {
                        if (childCount < 0) {
                            break;
                        }
                        View childAt = viewGroup.getChildAt(childCount);
                        if (x2 >= childAt.getLeft() && x2 <= childAt.getRight() && y2 >= childAt.getTop() && y2 <= childAt.getBottom() && childAt.isClickable()) {
                            RecyclerListView.this.currentChildView = null;
                            break;
                        }
                        childCount--;
                    }
                }
                RecyclerListView.this.currentChildPosition = -1;
                if (RecyclerListView.this.currentChildView != null) {
                    RecyclerListView recyclerListView = RecyclerListView.this;
                    if (recyclerListView.useLayoutPositionOnClick) {
                        recyclerListView.currentChildPosition = recyclerView.getChildLayoutPosition(recyclerListView.currentChildView);
                    } else {
                        recyclerListView.currentChildPosition = recyclerView.getChildAdapterPosition(recyclerListView.currentChildView);
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - RecyclerListView.this.currentChildView.getLeft(), motionEvent.getY() - RecyclerListView.this.currentChildView.getTop(), 0);
                    if (RecyclerListView.this.currentChildView.onTouchEvent(obtain)) {
                        RecyclerListView.this.interceptedByChild = true;
                    }
                    obtain.recycle();
                }
            }
            if (RecyclerListView.this.currentChildView != null && !RecyclerListView.this.interceptedByChild) {
                try {
                    RecyclerListView.this.gestureDetector.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (actionMasked == 0 || actionMasked == 5) {
                if (!RecyclerListView.this.interceptedByChild && RecyclerListView.this.currentChildView != null) {
                    final float x3 = motionEvent.getX();
                    final float y3 = motionEvent.getY();
                    RecyclerListView.this.selectChildRunnable = new Runnable() { // from class: org.telegram.ui.Components.RecyclerListView$RecyclerListViewItemClickListener$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecyclerListView.RecyclerListViewItemClickListener.this.lambda$onInterceptTouchEvent$0(x3, y3);
                        }
                    };
                    AndroidUtilities.runOnUIThread(RecyclerListView.this.selectChildRunnable, ViewConfiguration.getTapTimeout());
                    if (RecyclerListView.this.currentChildView.isEnabled()) {
                        RecyclerListView recyclerListView2 = RecyclerListView.this;
                        if (recyclerListView2.canHighlightChildAt(recyclerListView2.currentChildView, x3 - RecyclerListView.this.currentChildView.getX(), y3 - RecyclerListView.this.currentChildView.getY())) {
                            RecyclerListView recyclerListView3 = RecyclerListView.this;
                            recyclerListView3.positionSelector(recyclerListView3.currentChildPosition, RecyclerListView.this.currentChildView);
                            Drawable drawable = RecyclerListView.this.selectorDrawable;
                            if (drawable != null) {
                                Drawable current = drawable.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (RecyclerListView.this.onItemLongClickListener != null || RecyclerListView.this.onItemClickListenerExtended != null) {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    } else {
                                        ((TransitionDrawable) current).resetTransition();
                                    }
                                }
                                RecyclerListView.this.selectorDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            RecyclerListView.this.updateSelectorState();
                        }
                    }
                    RecyclerListView.this.selectorRect.setEmpty();
                } else {
                    RecyclerListView.this.selectorRect.setEmpty();
                }
            } else if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z) && RecyclerListView.this.currentChildView != null) {
                if (RecyclerListView.this.selectChildRunnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(RecyclerListView.this.selectChildRunnable);
                    RecyclerListView.this.selectChildRunnable = null;
                }
                View view = RecyclerListView.this.currentChildView;
                RecyclerListView recyclerListView4 = RecyclerListView.this;
                recyclerListView4.onChildPressed(recyclerListView4.currentChildView, 0.0f, 0.0f, false);
                RecyclerListView.this.currentChildView = null;
                RecyclerListView.this.interceptedByChild = false;
                RecyclerListView.this.removeSelection(view, motionEvent);
                if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && RecyclerListView.this.onItemLongClickListenerExtended != null && RecyclerListView.this.longPressCalled) {
                    RecyclerListView.this.onItemLongClickListenerExtended.onLongClickRelease();
                    RecyclerListView.this.longPressCalled = false;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInterceptTouchEvent$0(float f, float f2) {
            if (RecyclerListView.this.selectChildRunnable == null || RecyclerListView.this.currentChildView == null) {
                return;
            }
            RecyclerListView recyclerListView = RecyclerListView.this;
            recyclerListView.onChildPressed(recyclerListView.currentChildView, f, f2, true);
            RecyclerListView.this.selectChildRunnable = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            RecyclerListView.this.cancelClickRunnables(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public View findChildViewUnder(float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        while (i < 2) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if ((!(childAt instanceof ChatMessageCell) && !(childAt instanceof ChatActionCell)) || childAt.getVisibility() != 4) {
                    float translationX = i == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f >= childAt.getLeft() + translationX && f <= childAt.getRight() + translationX && f2 >= childAt.getTop() + translationY && f2 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i++;
        }
        return null;
    }

    public void setDisableHighlightState(boolean z) {
        this.disableHighlightState = z;
    }

    public View getPressedChildView() {
        return this.currentChildView;
    }

    protected void onChildPressed(View view, float f, float f2, boolean z) {
        if (this.disableHighlightState || view == null) {
            return;
        }
        view.setPressed(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSelection(View view, MotionEvent motionEvent) {
        if (view == null || this.selectorRect.isEmpty()) {
            return;
        }
        if (view.isEnabled()) {
            positionSelector(this.currentChildPosition, view);
            Drawable drawable = this.selectorDrawable;
            if (drawable != null) {
                Drawable current = drawable.getCurrent();
                if (current instanceof TransitionDrawable) {
                    ((TransitionDrawable) current).resetTransition();
                }
                if (motionEvent != null) {
                    this.selectorDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
            }
        } else {
            this.selectorRect.setEmpty();
        }
        updateSelectorState();
    }

    public void cancelClickRunnables(boolean z) {
        Runnable runnable = this.selectChildRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.selectChildRunnable = null;
        }
        View view = this.currentChildView;
        if (view != null) {
            if (z) {
                onChildPressed(view, 0.0f, 0.0f, false);
            }
            this.currentChildView = null;
            removeSelection(view, null);
        }
        this.selectorRect.setEmpty();
        Runnable runnable2 = this.clickRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.clickRunnable = null;
        }
        this.interceptedByChild = false;
    }

    public void setResetSelectorOnChanged(boolean z) {
        this.resetSelectorOnChanged = z;
    }

    public int[] getResourceDeclareStyleableIntArray(String str, String str2) {
        try {
            Field field = Class.forName(str + ".R$styleable").getField(str2);
            if (field != null) {
                return (int[]) field.get(null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public RecyclerListView(Context context) {
        this(context, null);
    }

    public RecyclerListView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.drawSelection = true;
        this.allowItemsInteractionDuringAnimation = true;
        this.currentFirst = -1;
        this.currentVisible = -1;
        this.hideIfEmpty = true;
        this.selectorType = 2;
        this.selectorRect = new android.graphics.Rect();
        this.translateSelector = -1;
        this.scrollEnabled = true;
        this.lastX = Float.MAX_VALUE;
        this.lastY = Float.MAX_VALUE;
        this.accessibilityEnabled = true;
        this.accessibilityDelegate = new View.AccessibilityDelegate() { // from class: org.telegram.ui.Components.RecyclerListView.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (view.isEnabled()) {
                    accessibilityNodeInfo.addAction(16);
                }
            }
        };
        this.resetSelectorOnChanged = true;
        this.observer = new RecyclerView.AdapterDataObserver() { // from class: org.telegram.ui.Components.RecyclerListView.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                RecyclerListView.this.checkIfEmpty(true);
                if (RecyclerListView.this.resetSelectorOnChanged) {
                    RecyclerListView.this.currentFirst = -1;
                    if (RecyclerListView.this.removeHighlighSelectionRunnable == null) {
                        RecyclerListView.this.selectorRect.setEmpty();
                    }
                }
                RecyclerListView.this.invalidate();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                RecyclerListView.this.checkIfEmpty(true);
                if (RecyclerListView.this.pinnedHeader == null || RecyclerListView.this.pinnedHeader.getAlpha() != 0.0f) {
                    return;
                }
                RecyclerListView.this.currentFirst = -1;
                RecyclerListView.this.invalidateViews();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                RecyclerListView.this.checkIfEmpty(true);
            }
        };
        this.scroller = new Runnable() { // from class: org.telegram.ui.Components.RecyclerListView.6
            @Override // java.lang.Runnable
            public void run() {
                int dp;
                RecyclerListView recyclerListView = RecyclerListView.this;
                recyclerListView.multiSelectionListener.getPaddings(recyclerListView.listPaddings);
                if (RecyclerListView.this.multiselectScrollToTop) {
                    dp = -AndroidUtilities.dp(12.0f);
                    RecyclerListView.this.chekMultiselect(0.0f, r2.listPaddings[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    RecyclerListView.this.chekMultiselect(0.0f, r2.getMeasuredHeight() - RecyclerListView.this.listPaddings[1]);
                }
                RecyclerListView.this.multiSelectionListener.scrollBy(dp);
                RecyclerListView recyclerListView2 = RecyclerListView.this;
                if (recyclerListView2.multiselectScrollRunning) {
                    AndroidUtilities.runOnUIThread(recyclerListView2.scroller);
                }
            }
        };
        this.applyPaddingToSections = false;
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        EdgeEffectTrackerFactory edgeEffectTrackerFactory = new EdgeEffectTrackerFactory();
        this.edgeEffectTrackerFactory = edgeEffectTrackerFactory;
        setEdgeEffectFactory(edgeEffectTrackerFactory);
        setGlowColor(getThemedColor(Theme.key_actionBarDefault));
        Drawable selectorDrawable = Theme.getSelectorDrawable(getThemedColor(Theme.key_listSelector), false);
        this.selectorDrawable = selectorDrawable;
        selectorDrawable.setCallback(this);
        try {
            if (!gotAttributes) {
                int[] resourceDeclareStyleableIntArray = getResourceDeclareStyleableIntArray("com.android.internal", "View");
                attributes = resourceDeclareStyleableIntArray;
                if (resourceDeclareStyleableIntArray == null) {
                    attributes = new int[0];
                }
                gotAttributes = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributes);
            Method method = initializeScrollbars;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.RecyclerListView.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                RecyclerListView.this.checkStopHeavyOperations(i);
                if (i != 0 && RecyclerListView.this.currentChildView != null) {
                    if (RecyclerListView.this.selectChildRunnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(RecyclerListView.this.selectChildRunnable);
                        RecyclerListView.this.selectChildRunnable = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        RecyclerListView.this.gestureDetector.onTouchEvent(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    RecyclerListView.this.currentChildView.onTouchEvent(obtain);
                    obtain.recycle();
                    View view = RecyclerListView.this.currentChildView;
                    RecyclerListView recyclerListView = RecyclerListView.this;
                    recyclerListView.onChildPressed(recyclerListView.currentChildView, 0.0f, 0.0f, false);
                    RecyclerListView.this.currentChildView = null;
                    RecyclerListView.this.removeSelection(view, null);
                    RecyclerListView.this.interceptedByChild = false;
                }
                if (RecyclerListView.this.onScrollListener != null) {
                    RecyclerListView.this.onScrollListener.onScrollStateChanged(recyclerView, i);
                }
                RecyclerListView recyclerListView2 = RecyclerListView.this;
                boolean z = i == 1 || i == 2;
                recyclerListView2.scrollingByUser = z;
                if (z) {
                    recyclerListView2.scrolledByUserOnce = true;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (RecyclerListView.this.onScrollListener != null) {
                    RecyclerListView.this.onScrollListener.onScrolled(recyclerView, i, i2);
                }
                RecyclerListView recyclerListView = RecyclerListView.this;
                if (recyclerListView.selectorPosition != -1) {
                    recyclerListView.selectorRect.offset(-i, -i2);
                    RecyclerListView recyclerListView2 = RecyclerListView.this;
                    Drawable drawable = recyclerListView2.selectorDrawable;
                    if (drawable != null) {
                        drawable.setBounds(recyclerListView2.selectorRect);
                    }
                    RecyclerListView.this.invalidate();
                } else {
                    recyclerListView.selectorRect.setEmpty();
                }
                RecyclerListView.this.checkSection(false);
                if (i2 != 0 && RecyclerListView.this.fastScroll != null) {
                    RecyclerListView.this.fastScroll.showFloatingDate();
                }
                if (RecyclerListView.this.pendingHighlightPosition != null) {
                    RecyclerListView recyclerListView3 = RecyclerListView.this;
                    recyclerListView3.highlightRowInternal(recyclerListView3.pendingHighlightPosition, 700, false);
                }
            }
        });
        addOnItemTouchListener(new RecyclerListViewItemClickListener(context));
    }

    protected void drawSectionBackground(Canvas canvas, int i, int i2, int i3) {
        drawSectionBackground(canvas, i, i2, i3, 0, 0);
    }

    protected void drawSectionBackground(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        if (i2 < i || i < 0 || i2 < 0) {
            return;
        }
        int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i7 = TLObject.FLAG_31;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null) {
                int childAdapterPosition = getChildAdapterPosition(childAt);
                int top = childAt.getTop();
                if (childAdapterPosition >= i && childAdapterPosition <= i2) {
                    i6 = Math.min(top, i6);
                    i7 = Math.max((int) (top + (childAt.getHeight() * childAt.getAlpha())), i7);
                }
            }
        }
        if (i6 < i7) {
            if (this.backgroundPaint == null) {
                this.backgroundPaint = new Paint(1);
            }
            this.backgroundPaint.setColor(i3);
            canvas.drawRect(0.0f, i6 - i4, getWidth(), i7 + i5, this.backgroundPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkStopHeavyOperations(int i) {
        if (i == 0) {
            if (this.stoppedAllHeavyOperations) {
                this.stoppedAllHeavyOperations = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            }
            return;
        }
        if (this.stoppedAllHeavyOperations || !this.allowStopHeaveOperations) {
            return;
        }
        this.stoppedAllHeavyOperations = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        if (attributes != null) {
            super.setVerticalScrollBarEnabled(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null && fastScroll.getLayoutParams() != null) {
            FastScroll fastScroll2 = this.fastScroll;
            int measuredHeight = (getMeasuredHeight() - (fastScroll2.usePadding ? getPaddingTop() : fastScroll2.topOffset)) - getPaddingBottom();
            this.fastScroll.getLayoutParams().height = measuredHeight;
            this.fastScroll.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null) {
            this.selfOnLayout = true;
            int paddingTop = i2 + (fastScroll.usePadding ? getPaddingTop() : fastScroll.topOffset);
            FastScroll fastScroll2 = this.fastScroll;
            if (fastScroll2.isRtl) {
                fastScroll2.layout(0, paddingTop, fastScroll2.getMeasuredWidth(), this.fastScroll.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.fastScroll.getMeasuredWidth();
                FastScroll fastScroll3 = this.fastScroll;
                fastScroll3.layout(measuredWidth, paddingTop, fastScroll3.getMeasuredWidth() + measuredWidth, this.fastScroll.getMeasuredHeight() + paddingTop);
            }
            this.selfOnLayout = false;
        }
        checkSection(false);
        IntReturnCallback intReturnCallback = this.pendingHighlightPosition;
        if (intReturnCallback != null) {
            highlightRowInternal(intReturnCallback, 700, false);
        }
    }

    public void setSelectorType(int i) {
        this.selectorType = i;
    }

    public void setSelectorRadius(int i) {
        this.selectorRadius = i;
    }

    public void setTopBottomSelectorRadius(int i) {
        this.topBottomSelectorRadius = i;
    }

    public void setDrawSelectorBehind(boolean z) {
        this.drawSelectorBehind = z;
    }

    public void setSelectorDrawableColor(int i) {
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        int i2 = this.selectorType;
        if (i2 == 8) {
            this.selectorDrawable = Theme.createRadSelectorDrawable(i, this.selectorRadius, 0);
        } else if (i2 == 9) {
            this.selectorDrawable = null;
        } else {
            int i3 = this.topBottomSelectorRadius;
            if (i3 > 0) {
                this.selectorDrawable = Theme.createRadSelectorDrawable(i, i3, i3);
            } else {
                int i4 = this.selectorRadius;
                if (i4 > 0 && i2 != 1) {
                    this.selectorDrawable = Theme.createSimpleSelectorRoundRectDrawable(i4, 0, i, -16777216);
                } else if (i2 == 2) {
                    this.selectorDrawable = Theme.getSelectorDrawable(i, false);
                } else {
                    this.selectorDrawable = Theme.createSelectorDrawable(i, i2, i4);
                }
            }
        }
        Drawable drawable2 = this.selectorDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public void checkSection(boolean z) {
        FastScroll fastScroll;
        RecyclerView.ViewHolder childViewHolder;
        FastScroll fastScroll2;
        View view;
        int i;
        RecyclerView.ViewHolder childViewHolder2;
        int adapterPosition;
        int sectionForPosition;
        if (((this.scrollingByUser || z) && this.fastScroll != null) || !(this.sectionsType == 0 || this.sectionsAdapter == null)) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.getOrientation() == 1) {
                    if (this.sectionsAdapter != null) {
                        int paddingTop = this.sectionsType == 1 ? 0 : getPaddingTop();
                        int i2 = this.sectionsType;
                        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        if (i2 != 1 && i2 != 3) {
                            if (i2 == 2) {
                                this.pinnedHeaderShadowTargetAlpha = 0.0f;
                                if (this.sectionsAdapter.getItemCount() == 0) {
                                    return;
                                }
                                int childCount = getChildCount();
                                View view2 = null;
                                int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                View view3 = null;
                                int i5 = 0;
                                for (int i6 = 0; i6 < childCount; i6++) {
                                    View childAt = getChildAt(i6);
                                    int bottom = childAt.getBottom();
                                    if (bottom > this.sectionOffset + paddingTop) {
                                        if (bottom < i3) {
                                            view3 = childAt;
                                            i3 = bottom;
                                        }
                                        i5 = Math.max(i5, bottom);
                                        if (bottom >= this.sectionOffset + paddingTop + AndroidUtilities.dp(32.0f) && bottom < i4) {
                                            view2 = childAt;
                                            i4 = bottom;
                                        }
                                    }
                                }
                                if (view3 == null || (childViewHolder2 = getChildViewHolder(view3)) == null || (sectionForPosition = this.sectionsAdapter.getSectionForPosition((adapterPosition = childViewHolder2.getAdapterPosition()))) < 0) {
                                    return;
                                }
                                if (this.currentFirst != sectionForPosition || this.pinnedHeader == null) {
                                    View sectionHeaderView = getSectionHeaderView(sectionForPosition, this.pinnedHeader);
                                    this.pinnedHeader = sectionHeaderView;
                                    sectionHeaderView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                    View view4 = this.pinnedHeader;
                                    view4.layout(0, 0, view4.getMeasuredWidth(), this.pinnedHeader.getMeasuredHeight());
                                    this.currentFirst = sectionForPosition;
                                }
                                if (this.pinnedHeader != null && view2 != null && view2.getClass() != this.pinnedHeader.getClass()) {
                                    this.pinnedHeaderShadowTargetAlpha = 1.0f;
                                }
                                int countForSection = this.sectionsAdapter.getCountForSection(sectionForPosition);
                                int positionInSectionForPosition = this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition);
                                int i7 = (i5 == 0 || i5 >= getMeasuredHeight() - getPaddingBottom()) ? this.sectionOffset : 0;
                                if (positionInSectionForPosition == countForSection - 1) {
                                    int height = this.pinnedHeader.getHeight();
                                    int top = ((view3.getTop() - paddingTop) - this.sectionOffset) + view3.getHeight();
                                    int i8 = top < height ? top - height : paddingTop;
                                    if (i8 < 0) {
                                        this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i7 + i8));
                                    } else {
                                        this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i7));
                                    }
                                } else {
                                    this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i7));
                                }
                                invalidate();
                                return;
                            }
                            return;
                        }
                        int childCount2 = getChildCount();
                        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        View view5 = null;
                        int i10 = 0;
                        for (int i11 = 0; i11 < childCount2; i11++) {
                            View childAt2 = getChildAt(i11);
                            int bottom2 = childAt2.getBottom();
                            if (bottom2 > this.sectionOffset + paddingTop) {
                                if (bottom2 < i3) {
                                    i3 = bottom2;
                                    view5 = childAt2;
                                }
                                i10 = Math.max(i10, bottom2);
                                if (bottom2 >= this.sectionOffset + paddingTop + AndroidUtilities.dp(32.0f) && bottom2 < i9) {
                                    i9 = bottom2;
                                }
                            }
                        }
                        if (view5 == null || (childViewHolder = getChildViewHolder(view5)) == null) {
                            return;
                        }
                        int adapterPosition2 = childViewHolder.getAdapterPosition();
                        int abs = Math.abs(linearLayoutManager.findLastVisibleItemPosition() - adapterPosition2) + 1;
                        if ((this.scrollingByUser || z) && (fastScroll2 = this.fastScroll) != null && !fastScroll2.isPressed() && (getAdapter() instanceof FastScrollAdapter)) {
                            this.fastScroll.setProgress(Math.min(1.0f, adapterPosition2 / ((this.sectionsAdapter.getTotalItemsCount() - abs) + 1)));
                        }
                        this.headersCache.addAll(this.headers);
                        this.headers.clear();
                        if (this.sectionsAdapter.getItemCount() == 0) {
                            return;
                        }
                        if (this.currentFirst != adapterPosition2 || this.currentVisible != abs) {
                            this.currentFirst = adapterPosition2;
                            this.currentVisible = abs;
                            this.sectionsCount = 1;
                            int sectionForPosition2 = this.sectionsAdapter.getSectionForPosition(adapterPosition2);
                            this.startSection = sectionForPosition2;
                            int countForSection2 = (this.sectionsAdapter.getCountForSection(sectionForPosition2) + adapterPosition2) - this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition2);
                            while (countForSection2 < adapterPosition2 + abs) {
                                countForSection2 += this.sectionsAdapter.getCountForSection(this.startSection + this.sectionsCount);
                                this.sectionsCount++;
                            }
                        }
                        if (this.sectionsType != 3) {
                            int i12 = adapterPosition2;
                            for (int i13 = this.startSection; i13 < this.startSection + this.sectionsCount; i13++) {
                                if (this.headersCache.isEmpty()) {
                                    view = null;
                                } else {
                                    view = (View) this.headersCache.get(0);
                                    this.headersCache.remove(0);
                                }
                                View sectionHeaderView2 = getSectionHeaderView(i13, view);
                                this.headers.add(sectionHeaderView2);
                                int countForSection3 = this.sectionsAdapter.getCountForSection(i13);
                                if (i13 == this.startSection) {
                                    int positionInSectionForPosition2 = this.sectionsAdapter.getPositionInSectionForPosition(i12);
                                    if (positionInSectionForPosition2 == countForSection3 - 1) {
                                        sectionHeaderView2.setTag(Integer.valueOf((-sectionHeaderView2.getHeight()) + paddingTop));
                                    } else if (positionInSectionForPosition2 == countForSection3 - 2) {
                                        View childAt3 = getChildAt(i12 - adapterPosition2);
                                        if (childAt3 != null) {
                                            i = childAt3.getTop() + paddingTop;
                                        } else {
                                            i = -AndroidUtilities.dp(100.0f);
                                        }
                                        sectionHeaderView2.setTag(Integer.valueOf(Math.min(i, 0)));
                                    } else {
                                        sectionHeaderView2.setTag(0);
                                    }
                                    countForSection3 -= this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition2);
                                } else {
                                    View childAt4 = getChildAt(i12 - adapterPosition2);
                                    if (childAt4 != null) {
                                        sectionHeaderView2.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                    } else {
                                        sectionHeaderView2.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                    }
                                }
                                i12 += countForSection3;
                            }
                            return;
                        }
                        return;
                    }
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    Math.abs(linearLayoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition);
                    if (findFirstVisibleItemPosition == -1) {
                        return;
                    }
                    if ((!this.scrollingByUser && !z) || (fastScroll = this.fastScroll) == null || fastScroll.isPressed()) {
                        return;
                    }
                    RecyclerView.Adapter adapter = getAdapter();
                    if (adapter instanceof FastScrollAdapter) {
                        FastScrollAdapter fastScrollAdapter = (FastScrollAdapter) adapter;
                        float scrollProgress = fastScrollAdapter.getScrollProgress(this);
                        this.fastScroll.setIsVisible(fastScrollAdapter.fastScrollIsVisible(this));
                        this.fastScroll.setProgress(Math.min(1.0f, scrollProgress));
                        this.fastScroll.getCurrentLetter(false);
                    }
                }
            }
        }
    }

    public void setListSelectorColor(Integer num) {
        Theme.setSelectorDrawableColor(this.selectorDrawable, num == null ? getThemedColor(Theme.key_listSelector) : num.intValue(), true);
    }

    public Integer getSelectorColor(int i) {
        GenericProvider genericProvider = this.getSelectorColor;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i));
        }
        return null;
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.getSelectorColor = genericProvider;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListenerExtended onItemClickListenerExtended) {
        this.onItemClickListenerExtended = onItemClickListenerExtended;
    }

    public OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public void clickItem(View view, int i) {
        OnItemClickListener onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(view, i);
            return;
        }
        OnItemClickListenerExtended onItemClickListenerExtended = this.onItemClickListenerExtended;
        if (onItemClickListenerExtended != null) {
            onItemClickListenerExtended.onItemClick(view, i, 0.0f, 0.0f);
        }
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        setOnItemLongClickListener(onItemLongClickListener, ViewConfiguration.getLongPressTimeout());
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener, long j) {
        this.onItemLongClickListener = onItemLongClickListener;
        this.gestureDetector.setIsLongpressEnabled(onItemLongClickListener != null);
        this.gestureDetector.setLongpressDuration(j);
    }

    public void setOnItemLongClickListener(OnItemLongClickListenerExtended onItemLongClickListenerExtended) {
        setOnItemLongClickListener(onItemLongClickListenerExtended, ViewConfiguration.getLongPressTimeout());
    }

    public void setOnItemLongClickListener(OnItemLongClickListenerExtended onItemLongClickListenerExtended, long j) {
        this.onItemLongClickListenerExtended = onItemLongClickListenerExtended;
        this.gestureDetector.setIsLongpressEnabled(onItemLongClickListenerExtended != null);
        this.gestureDetector.setLongpressDuration(j);
    }

    public void setEmptyView(View view) {
        View view2 = this.emptyView;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.emptyView = view;
        if (this.animateEmptyView && view != null) {
            view.setVisibility(8);
        }
        if (this.isHidden) {
            View view3 = this.emptyView;
            if (view3 != null) {
                this.emptyViewAnimateToVisibility = 8;
                view3.setVisibility(8);
                return;
            }
            return;
        }
        this.emptyViewAnimateToVisibility = -1;
        checkIfEmpty(false);
    }

    protected boolean updateEmptyViewAnimated() {
        return isAttachedToWindow();
    }

    public View getEmptyView() {
        return this.emptyView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void invalidateViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Theme.Colorable) {
                ((Theme.Colorable) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public void updateFastScrollColors() {
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null) {
            fastScroll.updateColors();
        }
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.pinnedHeaderShadowDrawable = drawable;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.scrollEnabled && super.canScrollVertically(i);
    }

    public void setScrollEnabled(boolean z) {
        this.scrollEnabled = z;
    }

    public void highlightRow(IntReturnCallback intReturnCallback) {
        highlightRowInternal(intReturnCallback, 700, true);
    }

    public void highlightRow(IntReturnCallback intReturnCallback, int i) {
        highlightRowInternal(intReturnCallback, i, true);
    }

    public void removeHighlightRow() {
        int i;
        Runnable runnable = this.removeHighlighSelectionRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.removeHighlighSelectionRunnable.run();
            this.removeHighlighSelectionRunnable = null;
            this.selectorView = null;
            return;
        }
        this.removeHighlighSelectionRunnable = null;
        this.pendingHighlightPosition = null;
        View view = this.selectorView;
        if (view != null && (i = this.highlightPosition) != -1) {
            positionSelector(i, view);
            Drawable drawable = this.selectorDrawable;
            if (drawable != null) {
                drawable.setState(new int[0]);
                invalidateDrawable(this.selectorDrawable);
            }
            this.selectorView = null;
            this.highlightPosition = -1;
            return;
        }
        Drawable drawable2 = this.selectorDrawable;
        if (drawable2 != null) {
            Drawable current = drawable2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        Drawable drawable3 = this.selectorDrawable;
        if (drawable3 != null && drawable3.isStateful() && this.selectorDrawable.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.selectorDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void highlightRowInternal(IntReturnCallback intReturnCallback, int i, boolean z) {
        Runnable runnable = this.removeHighlighSelectionRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.removeHighlighSelectionRunnable = null;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(intReturnCallback.run());
        if (findViewHolderForAdapterPosition == null) {
            if (z) {
                this.pendingHighlightPosition = intReturnCallback;
                return;
            }
            return;
        }
        int layoutPosition = findViewHolderForAdapterPosition.getLayoutPosition();
        this.highlightPosition = layoutPosition;
        positionSelector(layoutPosition, findViewHolderForAdapterPosition.itemView, false, -1.0f, -1.0f, true);
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            Drawable current = drawable.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.onItemLongClickListener != null || this.onItemClickListenerExtended != null) {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                } else {
                    ((TransitionDrawable) current).resetTransition();
                }
            }
            this.selectorDrawable.setHotspot(findViewHolderForAdapterPosition.itemView.getMeasuredWidth() / 2, findViewHolderForAdapterPosition.itemView.getMeasuredHeight() / 2);
        }
        Drawable drawable2 = this.selectorDrawable;
        if (drawable2 != null && drawable2.isStateful() && this.selectorDrawable.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.selectorDrawable);
        }
        if (i > 0) {
            this.pendingHighlightPosition = null;
            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerListView.this.lambda$highlightRowInternal$0();
                }
            };
            this.removeHighlighSelectionRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$highlightRowInternal$0() {
        this.removeHighlighSelectionRunnable = null;
        this.pendingHighlightPosition = null;
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            Drawable current = drawable.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        Drawable drawable2 = this.selectorDrawable;
        if (drawable2 == null || !drawable2.isStateful()) {
            return;
        }
        this.selectorDrawable.setState(StateSet.NOTHING);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.disallowInterceptTouchEvents) {
            requestDisallowInterceptTouchEvent(this, true);
        }
        OnInterceptTouchListener onInterceptTouchListener = this.onInterceptTouchListener;
        return (onInterceptTouchListener != null && onInterceptTouchListener.onInterceptTouchEvent(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    public void setAdaptiveOverScroll() {
        this.adaptiveOverScroll = true;
        setOverScrollMode(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.activeTouches == 0 && this.adaptiveOverScroll) {
                setOverScrollMode(0);
            }
            this.activeTouches++;
        } else if (action == 1 || action == 3) {
            int i = this.activeTouches - 1;
            this.activeTouches = i;
            if (i == 0 && this.adaptiveOverScroll) {
                setOverScrollMode(2);
            }
        }
        FastScroll fastScroll = getFastScroll();
        if (fastScroll != null && fastScroll.isVisible && fastScroll.isMoving && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return true;
        }
        if (this.sectionsAdapter == null || (view = this.pinnedHeader) == null || view.getAlpha() == 0.0f || !this.pinnedHeader.dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void checkIfEmpty() {
        checkIfEmpty(updateEmptyViewAnimated());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIfEmpty(boolean z) {
        if (this.isHidden) {
            return;
        }
        if (getAdapter() == null || this.emptyView == null) {
            if (!this.hiddenByEmptyView || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.hiddenByEmptyView = false;
            return;
        }
        boolean emptyViewIsVisible = emptyViewIsVisible();
        int i = emptyViewIsVisible ? 0 : 8;
        if (!this.animateEmptyView || !SharedConfig.animationsEnabled()) {
            z = false;
        }
        emptyViewUpdated(emptyViewIsVisible, z);
        if (z) {
            if (this.emptyViewAnimateToVisibility != i) {
                this.emptyViewAnimateToVisibility = i;
                if (i == 0) {
                    this.emptyView.animate().setListener(null).cancel();
                    if (this.emptyView.getVisibility() == 8) {
                        this.emptyView.setVisibility(0);
                        this.emptyView.setAlpha(0.0f);
                        if (this.emptyViewAnimationType == 1) {
                            this.emptyView.setScaleX(0.7f);
                            this.emptyView.setScaleY(0.7f);
                        }
                    }
                    this.emptyView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else if (this.emptyView.getVisibility() != 8) {
                    ViewPropertyAnimator alpha = this.emptyView.animate().alpha(0.0f);
                    if (this.emptyViewAnimationType == 1) {
                        alpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    alpha.setDuration(150L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.RecyclerListView.4
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (RecyclerListView.this.emptyView != null) {
                                RecyclerListView.this.emptyView.setVisibility(8);
                            }
                        }
                    }).start();
                }
            }
        } else {
            this.emptyViewAnimateToVisibility = i;
            this.emptyView.setVisibility(i);
            this.emptyView.setAlpha(1.0f);
        }
        if (this.hideIfEmpty) {
            int i2 = emptyViewIsVisible ? 4 : 0;
            if (getVisibility() != i2) {
                setVisibility(i2);
            }
            this.hiddenByEmptyView = true;
        }
    }

    public boolean emptyViewIsVisible() {
        return (getAdapter() == null || isFastScrollAnimationRunning() || getAdapter().getItemCount() != 0) ? false : true;
    }

    public void hide() {
        if (this.isHidden) {
            return;
        }
        this.isHidden = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.emptyView;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.emptyView.setVisibility(8);
    }

    public void show() {
        if (this.isHidden) {
            this.isHidden = false;
            checkIfEmpty(false);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.hiddenByEmptyView = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public void setHideIfEmpty(boolean z) {
        this.hideIfEmpty = z;
    }

    public RecyclerView.OnScrollListener getOnScrollListener() {
        return this.onScrollListener;
    }

    public void setOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener) {
        this.onInterceptTouchListener = onInterceptTouchListener;
    }

    public void setInstantClick(boolean z) {
        this.instantClick = z;
    }

    public void setDisallowInterceptTouchEvents(boolean z) {
        this.disallowInterceptTouchEvents = z;
    }

    public void setFastScrollEnabled(int i) {
        this.fastScroll = new FastScroll(getContext(), i);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.fastScroll);
        }
    }

    public void setFastScrollVisible(boolean z) {
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll == null) {
            return;
        }
        fastScroll.setVisibility(z ? 0 : 8);
        this.fastScroll.isVisible = z;
    }

    public void setSectionsType(int i) {
        this.sectionsType = i;
        if (i == 1 || i == 3) {
            this.headers = new ArrayList();
            this.headersCache = new ArrayList();
        }
    }

    public void setPinnedSectionOffsetY(int i) {
        this.sectionOffset = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void positionSelector(int i, View view) {
        positionSelector(i, view, false, -1.0f, -1.0f, false);
    }

    public void updateSelector() {
        View view;
        int i = this.selectorPosition;
        if (i == -1 || (view = this.selectorView) == null) {
            return;
        }
        positionSelector(i, view);
        invalidate();
    }

    private void positionSelector(int i, View view, boolean z, float f, float f2, boolean z2) {
        Runnable runnable = this.removeHighlighSelectionRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.removeHighlighSelectionRunnable = null;
            this.pendingHighlightPosition = null;
        }
        if (this.selectorDrawable == null) {
            return;
        }
        boolean z3 = i != this.selectorPosition;
        int selectionBottomPadding = getAdapter() instanceof SelectionAdapter ? ((SelectionAdapter) getAdapter()).getSelectionBottomPadding(view) : 0;
        if (i != -1) {
            this.selectorPosition = i;
        }
        this.selectorView = view;
        if (this.selectorType == 8) {
            Theme.setMaskDrawableRad(this.selectorDrawable, this.selectorRadius, 0);
        } else if (this.topBottomSelectorRadius > 0 && getAdapter() != null) {
            Theme.setMaskDrawableRad(this.selectorDrawable, i == 0 ? this.topBottomSelectorRadius : 0, i == getAdapter().getItemCount() + (-2) ? this.topBottomSelectorRadius : 0);
        }
        this.selectorRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom() - selectionBottomPadding);
        boolean isEnabled = view.isEnabled();
        if (this.isChildViewEnabled != isEnabled) {
            this.isChildViewEnabled = isEnabled;
        }
        if (z3) {
            this.selectorDrawable.setVisible(false, false);
            this.selectorDrawable.setState(StateSet.NOTHING);
        }
        setListSelectorColor(getSelectorColor(i));
        this.selectorDrawable.setBounds(this.selectorRect);
        if (z3 && getVisibility() == 0) {
            this.selectorDrawable.setVisible(true, false);
        }
        if (z) {
            this.selectorDrawable.setHotspot(f, f2);
        }
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z) {
        this.allowItemsInteractionDuringAnimation = z;
    }

    public void hideSelector(boolean z) {
        View view = this.currentChildView;
        if (view != null) {
            onChildPressed(view, 0.0f, 0.0f, false);
            this.currentChildView = null;
            if (z) {
                removeSelection(view, null);
            }
        }
        if (z) {
            return;
        }
        this.selectorDrawable.setState(StateSet.NOTHING);
        this.selectorRect.setEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectorState() {
        Drawable drawable = this.selectorDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        if (this.currentChildView != null) {
            if (this.selectorDrawable.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.selectorDrawable);
            }
        } else if (this.removeHighlighSelectionRunnable == null) {
            this.selectorDrawable.setState(StateSet.NOTHING);
        }
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        if (getAdapter() instanceof SelectionAdapter) {
            RecyclerView.ViewHolder findContainingViewHolder = findContainingViewHolder(view);
            if (findContainingViewHolder != null) {
                view.setEnabled(((SelectionAdapter) getAdapter()).isEnabled(findContainingViewHolder));
                if (this.accessibilityEnabled) {
                    view.setAccessibilityDelegate(this.accessibilityDelegate);
                }
            }
        } else {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
        }
        super.onChildAttachedToWindow(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateSelectorState();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.selectorDrawable == drawable || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll == null || fastScroll.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.fastScroll.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.fastScroll);
        }
        ((ViewGroup) getParent()).addView(this.fastScroll);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.observer);
        }
        ArrayList arrayList = this.headers;
        if (arrayList != null) {
            arrayList.clear();
            this.headersCache.clear();
        }
        this.currentFirst = -1;
        this.selectorPosition = -1;
        this.selectorView = null;
        this.selectorRect.setEmpty();
        this.pinnedHeader = null;
        if (adapter instanceof SectionsAdapter) {
            this.sectionsAdapter = (SectionsAdapter) adapter;
        } else {
            this.sectionsAdapter = null;
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.observer);
        }
        checkIfEmpty(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        try {
            super.stopScroll();
        } catch (NullPointerException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.longPressCalled) {
            OnItemLongClickListenerExtended onItemLongClickListenerExtended = this.onItemLongClickListenerExtended;
            if (onItemLongClickListenerExtended != null) {
                onItemLongClickListenerExtended.onMove(i, i2);
            }
            iArr[0] = i;
            iArr[1] = i2;
            return true;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    private View getSectionHeaderView(int i, View view) {
        boolean z = view == null;
        View sectionHeaderView = this.sectionsAdapter.getSectionHeaderView(i, view);
        if (z) {
            ensurePinnedHeaderLayout(sectionHeaderView, false);
        }
        return sectionHeaderView;
    }

    private void ensurePinnedHeaderLayout(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z) {
            int i = this.sectionsType;
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        FrameLayout frameLayout = this.overlayContainer;
        if (frameLayout != null) {
            frameLayout.requestLayout();
        }
        int i5 = this.sectionsType;
        if (i5 == 1) {
            if (this.sectionsAdapter == null || this.headers.isEmpty()) {
                return;
            }
            for (int i6 = 0; i6 < this.headers.size(); i6++) {
                ensurePinnedHeaderLayout((View) this.headers.get(i6), true);
            }
            return;
        }
        if (i5 != 2 || this.sectionsAdapter == null || (view = this.pinnedHeader) == null) {
            return;
        }
        ensurePinnedHeaderLayout(view, true);
    }

    public android.graphics.Rect getSelectorRect() {
        return this.selectorRect;
    }

    public void setTranslateSelector(boolean z) {
        this.translateSelector = z ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.translateSelector = i;
    }

    private void drawSelectors2(Canvas canvas) {
        Drawable drawable;
        Consumer consumer;
        View view;
        if (this.selectorRect.isEmpty() || (drawable = this.selectorDrawable) == null) {
            return;
        }
        int i = this.translateSelector;
        if ((i == -2 || i == this.selectorPosition) && this.selectorView != null) {
            this.selectorDrawable.setBounds(this.selectorView.getLeft(), this.selectorView.getTop(), this.selectorView.getRight(), this.selectorView.getBottom() - (getAdapter() instanceof SelectionAdapter ? ((SelectionAdapter) getAdapter()).getSelectionBottomPadding(this.selectorView) : 0));
        } else {
            drawable.setBounds(this.selectorRect);
        }
        canvas.save();
        int i2 = this.translateSelector;
        if ((i2 == -2 || i2 == this.selectorPosition) && (consumer = this.selectorTransformer) != null) {
            consumer.accept(canvas);
        }
        int i3 = this.translateSelector;
        if ((i3 == -2 || i3 == this.selectorPosition) && (view = this.selectorView) != null) {
            canvas.translate(view.getX() - this.selectorRect.left, this.selectorView.getY() - this.selectorRect.top);
            this.selectorDrawable.setAlpha((int) (this.selectorView.getAlpha() * 255.0f));
        }
        drawSelector(canvas);
        canvas.restore();
    }

    private void drawSelector(Canvas canvas) {
        if (hasSections()) {
            canvas.save();
            clipChild(canvas, this.selectorView);
            this.selectorDrawable.draw(canvas);
            canvas.restore();
            return;
        }
        this.selectorDrawable.draw(canvas);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (hasSections() && !this.ignoreClipChild) {
            canvas.save();
            clipChild(canvas, view);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        View view;
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.itemsEnterAnimator;
        if (recyclerItemsEnterAnimator != null) {
            recyclerItemsEnterAnimator.dispatchDraw();
        }
        if (this.drawSelection && this.drawSelectorBehind) {
            drawSelectors2(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.drawSelection && !this.drawSelectorBehind) {
            drawSelectors2(canvas);
        }
        FrameLayout frameLayout = this.overlayContainer;
        if (frameLayout != null) {
            frameLayout.draw(canvas);
        }
        int i = this.sectionsType;
        if (i == 1) {
            if (this.sectionsAdapter == null || this.headers.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < this.headers.size(); i2++) {
                View view2 = (View) this.headers.get(i2);
                int save = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i != 2 || this.sectionsAdapter == null || (view = this.pinnedHeader) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.pinnedHeader.getWidth() : 0.0f, ((Integer) this.pinnedHeader.getTag()).intValue());
        Drawable drawable = this.pinnedHeaderShadowDrawable;
        if (drawable != null) {
            drawable.setBounds(0, this.pinnedHeader.getMeasuredHeight(), getWidth(), this.pinnedHeader.getMeasuredHeight() + this.pinnedHeaderShadowDrawable.getIntrinsicHeight());
            this.pinnedHeaderShadowDrawable.setAlpha((int) (this.pinnedHeaderShadowAlpha * 255.0f));
            this.pinnedHeaderShadowDrawable.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.lastAlphaAnimationTime);
            this.lastAlphaAnimationTime = elapsedRealtime;
            float f = this.pinnedHeaderShadowAlpha;
            float f2 = this.pinnedHeaderShadowTargetAlpha;
            if (f < f2) {
                float f3 = f + (min / 180.0f);
                this.pinnedHeaderShadowAlpha = f3;
                if (f3 > f2) {
                    this.pinnedHeaderShadowAlpha = f2;
                }
                invalidate();
            } else if (f > f2) {
                float f4 = f - (min / 180.0f);
                this.pinnedHeaderShadowAlpha = f4;
                if (f4 < f2) {
                    this.pinnedHeaderShadowAlpha = f2;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.pinnedHeader.getMeasuredHeight());
        this.pinnedHeader.draw(canvas);
        canvas.restoreToCount(save2);
    }

    public void relayoutPinnedHeader() {
        View view = this.pinnedHeader;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
            View view2 = this.pinnedHeader;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.pinnedHeader.getMeasuredHeight());
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.selectorPosition = -1;
        this.selectorView = null;
        this.selectorRect.setEmpty();
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.itemsEnterAnimator;
        if (recyclerItemsEnterAnimator != null) {
            recyclerItemsEnterAnimator.onDetached();
        }
        if (this.stoppedAllHeavyOperations) {
            this.stoppedAllHeavyOperations = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    public void addOverlayView(View view, FrameLayout.LayoutParams layoutParams) {
        if (this.overlayContainer == null) {
            this.overlayContainer = new FrameLayout(getContext()) { // from class: org.telegram.ui.Components.RecyclerListView.5
                @Override // android.view.View, android.view.ViewParent
                public void requestLayout() {
                    super.requestLayout();
                    try {
                        measure(View.MeasureSpec.makeMeasureSpec(RecyclerListView.this.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(RecyclerListView.this.getMeasuredHeight(), TLObject.FLAG_30));
                        layout(0, 0, RecyclerListView.this.overlayContainer.getMeasuredWidth(), RecyclerListView.this.overlayContainer.getMeasuredHeight());
                    } catch (Exception unused) {
                    }
                }
            };
        }
        this.overlayContainer.addView(view, layoutParams);
    }

    public ArrayList<View> getHeaders() {
        return this.headers;
    }

    public ArrayList<View> getHeadersCache() {
        return this.headersCache;
    }

    public View getPinnedHeader() {
        return this.pinnedHeader;
    }

    public boolean isFastScrollAnimationRunning() {
        return this.fastScrollAnimationRunning;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.fastScrollAnimationRunning || this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setPaddingWithoutRequestLayout(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() == i && getPaddingTop() == i2 && getPaddingRight() == i3 && getPaddingBottom() == i4) {
            return;
        }
        this.ignoreLayout = true;
        setPadding(i, i2, i3, i4);
        this.ignoreLayout = false;
    }

    private void requestDisallowInterceptTouchEvent(View view, boolean z) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimateEmptyView(boolean z, int i) {
        this.animateEmptyView = z;
        this.emptyViewAnimationType = i;
    }

    public static class FoucsableOnTouchListener implements View.OnTouchListener {
        private boolean onFocus;
        private float x;
        private float y;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                this.onFocus = true;
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 2) {
                float x = this.x - motionEvent.getX();
                float y = this.y - motionEvent.getY();
                float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                if (this.onFocus && Math.sqrt((x * x) + (y * y)) > scaledTouchSlop) {
                    this.onFocus = false;
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.onFocus = false;
                parent.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null) {
            fastScroll.setTranslationY(f);
        }
    }

    public void startMultiselect(int i, boolean z, onMultiSelectionChanged onmultiselectionchanged) {
        if (!this.multiSelectionGesture) {
            this.listPaddings = new int[2];
            this.selectedPositions = new HashSet();
            requestDisallowInterceptTouchEvent(this, true);
            this.multiSelectionListener = onmultiselectionchanged;
            this.multiSelectionGesture = true;
            this.currentSelectedPosition = i;
            this.startSelectionFrom = i;
        }
        this.useRelativePositions = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null && fastScroll.pressed) {
            return false;
        }
        if (this.multiSelectionGesture && motionEvent.getAction() != 0 && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (this.lastX == Float.MAX_VALUE && this.lastY == Float.MAX_VALUE) {
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
            }
            if (!this.multiSelectionGestureStarted && Math.abs(motionEvent.getY() - this.lastY) > this.touchSlop) {
                this.multiSelectionGestureStarted = true;
                requestDisallowInterceptTouchEvent(this, true);
            }
            if (this.multiSelectionGestureStarted) {
                chekMultiselect(motionEvent.getX(), motionEvent.getY());
                this.multiSelectionListener.getPaddings(this.listPaddings);
                if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.listPaddings[1] && (this.currentSelectedPosition >= this.startSelectionFrom || !this.multiSelectionListener.limitReached())) {
                    startMultiselectScroll(false);
                } else if (motionEvent.getY() < AndroidUtilities.dp(56.0f) + this.listPaddings[0] && (this.currentSelectedPosition <= this.startSelectionFrom || !this.multiSelectionListener.limitReached())) {
                    startMultiselectScroll(true);
                } else {
                    cancelMultiselectScroll();
                }
            }
            return true;
        }
        this.lastX = Float.MAX_VALUE;
        this.lastY = Float.MAX_VALUE;
        this.multiSelectionGesture = false;
        this.multiSelectionGestureStarted = false;
        requestDisallowInterceptTouchEvent(this, false);
        cancelMultiselectScroll();
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean chekMultiselect(float f, float f2) {
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.listPaddings;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f2, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f, 0.0f));
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            this.multiSelectionListener.getPaddings(this.listPaddings);
            if (!this.useRelativePositions) {
                View childAt = getChildAt(i);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getLeft() + childAt.getMeasuredWidth(), childAt.getTop() + childAt.getMeasuredHeight());
                if (rectF.contains(min2, min)) {
                    int childLayoutPosition = getChildLayoutPosition(childAt);
                    int i2 = this.currentSelectedPosition;
                    if (i2 != childLayoutPosition) {
                        int i3 = this.startSelectionFrom;
                        boolean z = i2 > i3 || childLayoutPosition > i3;
                        childLayoutPosition = this.multiSelectionListener.checkPosition(childLayoutPosition, z);
                        if (z) {
                            int i4 = this.currentSelectedPosition;
                            if (childLayoutPosition <= i4) {
                                while (i4 > childLayoutPosition) {
                                    if (i4 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i4)) {
                                        this.multiSelectionListener.onSelectionChanged(i4, false, min2, min);
                                    }
                                    i4--;
                                }
                            } else if (!this.multiSelectionListener.limitReached()) {
                                for (int i5 = this.currentSelectedPosition + 1; i5 <= childLayoutPosition; i5++) {
                                    if (i5 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i5)) {
                                        this.multiSelectionListener.onSelectionChanged(i5, true, min2, min);
                                    }
                                }
                            }
                        } else {
                            int i6 = this.currentSelectedPosition;
                            if (childLayoutPosition > i6) {
                                while (i6 < childLayoutPosition) {
                                    if (i6 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i6)) {
                                        this.multiSelectionListener.onSelectionChanged(i6, false, min2, min);
                                    }
                                    i6++;
                                }
                            } else if (!this.multiSelectionListener.limitReached()) {
                                for (int i7 = this.currentSelectedPosition - 1; i7 >= childLayoutPosition; i7--) {
                                    if (i7 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i7)) {
                                        this.multiSelectionListener.onSelectionChanged(i7, true, min2, min);
                                    }
                                }
                            }
                        }
                    }
                    if (!this.multiSelectionListener.limitReached()) {
                        this.currentSelectedPosition = childLayoutPosition;
                    }
                }
            }
            i++;
        }
        return true;
    }

    private void cancelMultiselectScroll() {
        this.multiselectScrollRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.scroller);
    }

    private void startMultiselectScroll(boolean z) {
        this.multiselectScrollToTop = z;
        if (this.multiselectScrollRunning) {
            return;
        }
        this.multiselectScrollRunning = true;
        AndroidUtilities.cancelRunOnUIThread(this.scroller);
        AndroidUtilities.runOnUIThread(this.scroller);
    }

    public boolean isMultiselect() {
        return this.multiSelectionGesture;
    }

    protected int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    protected Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : Theme.getThemeDrawable(str);
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public void setItemsEnterAnimator(RecyclerItemsEnterAnimator recyclerItemsEnterAnimator) {
        this.itemsEnterAnimator = recyclerItemsEnterAnimator;
    }

    public void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled = z;
    }

    public void setAllowStopHeaveOperations(boolean z) {
        this.allowStopHeaveOperations = z;
    }

    public void setDrawSelection(boolean z) {
        this.drawSelection = z;
    }

    public boolean hasActiveEdgeEffects() {
        return this.edgeEffectTrackerFactory.hasVisibleEdges();
    }

    public void addEdgeEffectListener(final Runnable runnable) {
        addEdgeEffectListener(new EdgeEffectTrackerFactory.OnEdgeEffectListener() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.Components.EdgeEffectTrackerFactory.OnEdgeEffectListener
            public final void onEdgeEffectVisibilityChange(int i, boolean z) {
                runnable.run();
            }
        });
    }

    public void addEdgeEffectListener(EdgeEffectTrackerFactory.OnEdgeEffectListener onEdgeEffectListener) {
        this.edgeEffectTrackerFactory.addEdgeEffectListener(onEdgeEffectListener);
    }

    public void capture(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (hasActiveEdgeEffects() && getOverScrollMode() != 2) {
            if (this.selfTransformationsMatrix == null) {
                this.selfTransformationsMatrix = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.selfTransformationsMatrix)) {
                canvas.concat(this.selfTransformationsMatrix);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            canvas.restore();
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                this.ignoreClipChild = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.ignoreClipChild = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.blur3.capture.IBlur3Capture
    public long captureCalculateHash(RectF rectF) {
        long uniqueDrawingId;
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        if (hasActiveEdgeEffects() && getOverScrollMode() != 2) {
            return -1L;
        }
        int childCount = getChildCount();
        long j = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                uniqueDrawingId = childAt.getUniqueDrawingId();
                j = MediaDataController.calcHash(j, uniqueDrawingId);
            }
        }
        return j;
    }

    public View findViewByPosition(int i) {
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int childAdapterPosition = getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition == i) {
                return childAt;
            }
        }
        return null;
    }

    public boolean hasSections() {
        return this.sectionsItemDecoration != null;
    }

    public void setSections() {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void setSections(boolean z) {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z);
    }

    public void setSections(int i, float f, boolean z) {
        setSections(new Utilities.CallbackReturn() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Boolean lambda$setSections$2;
                lambda$setSections$2 = RecyclerListView.lambda$setSections$2((View) obj);
                return lambda$setSections$2;
            }
        }, i, f, new RecyclerListView$$ExternalSyntheticLambda2(this), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$setSections$2(View view) {
        return Boolean.valueOf(((view instanceof TextInfoPrivacyCell) || (view instanceof ShadowSectionCell) || (view instanceof FiltersSetupActivity.HintInnerCell) || (view instanceof GraySectionCell) || Objects.equals(view.getTag(), -33024)) ? false : true);
    }

    private static Pair cachedIsViewTypeShadow(final RecyclerListView recyclerListView, final Utilities.CallbackReturn callbackReturn) {
        final SparseIntArray sparseIntArray = new SparseIntArray();
        return new Pair(new Utilities.CallbackReturn() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda6
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Boolean lambda$cachedIsViewTypeShadow$3;
                lambda$cachedIsViewTypeShadow$3 = RecyclerListView.lambda$cachedIsViewTypeShadow$3(Utilities.CallbackReturn.this, recyclerListView, sparseIntArray, (View) obj);
                return lambda$cachedIsViewTypeShadow$3;
            }
        }, new Utilities.CallbackReturn() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda7
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Boolean lambda$cachedIsViewTypeShadow$4;
                lambda$cachedIsViewTypeShadow$4 = RecyclerListView.lambda$cachedIsViewTypeShadow$4(sparseIntArray, (Integer) obj);
                return lambda$cachedIsViewTypeShadow$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$cachedIsViewTypeShadow$3(Utilities.CallbackReturn callbackReturn, RecyclerListView recyclerListView, SparseIntArray sparseIntArray, View view) {
        Boolean bool = (Boolean) callbackReturn.run(view);
        boolean booleanValue = bool.booleanValue();
        RecyclerView.ViewHolder childViewHolder = recyclerListView.getChildViewHolder(view);
        if (childViewHolder != null) {
            sparseIntArray.put(childViewHolder.getItemViewType(), booleanValue ? 1 : 0);
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$cachedIsViewTypeShadow$4(SparseIntArray sparseIntArray, Integer num) {
        int i = sparseIntArray.get(num.intValue(), -1);
        if (i == -1) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(i == 1);
    }

    public void setSections(Utilities.CallbackReturn callbackReturn, int i, float f, Utilities.Callback5 callback5, boolean z) {
        Pair cachedIsViewTypeShadow = cachedIsViewTypeShadow(this, callbackReturn);
        setSections((Utilities.CallbackReturn) cachedIsViewTypeShadow.first, (Utilities.CallbackReturn) cachedIsViewTypeShadow.second, i, f, callback5, z);
    }

    public void setSections(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i, float f, Utilities.Callback5 callback5, boolean z) {
        this.isViewTypeSection = callbackReturn2;
        this.sectionRadius = f;
        this.sectionRadiusTop = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.sectionRadiusBottom = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        this.drawSectionBackground = callback5;
        RecyclerView.ItemDecoration itemDecoration = this.sectionsItemDecoration;
        if (itemDecoration != null) {
            removeItemDecoration(itemDecoration);
        }
        ListSectionsDecoration listSectionsDecoration = new ListSectionsDecoration(callbackReturn, i, z);
        this.sectionsItemDecoration = listSectionsDecoration;
        addItemDecoration(listSectionsDecoration);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        super.setItemAnimator(itemAnimator);
    }

    public static class ListSectionsDecoration extends RecyclerView.ItemDecoration {
        private ArrayList childrenSorted = new ArrayList();
        private boolean enableTopPadding;
        public final Utilities.CallbackReturn isSectionItem;
        private int padding;

        public ListSectionsDecoration(Utilities.CallbackReturn callbackReturn, int i, boolean z) {
            this.isSectionItem = callbackReturn;
            this.padding = i;
            this.enableTopPadding = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int adapterPosition;
            if (((Boolean) this.isSectionItem.run(view)).booleanValue()) {
                int i = this.padding;
                rect.right = i;
                rect.left = i;
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (childViewHolder == null || adapter == null || (adapterPosition = childViewHolder.getAdapterPosition()) == -1) {
                    return;
                }
                boolean z = adapterPosition == 0;
                boolean z2 = adapterPosition == adapter.getItemCount() - 1;
                if (z) {
                    rect.top = this.enableTopPadding ? this.padding : AndroidUtilities.dp(4.0f);
                }
                if (z2) {
                    rect.bottom = this.padding;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (recyclerView instanceof RecyclerListView) {
                ((RecyclerListView) recyclerView).drawSectionsBackgrounds(canvas);
            }
        }
    }

    private void drawSectionBackground(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof JoinToSendSettingsView ? ((JoinToSendSettingsView) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(this.applyPaddingToSections ? getPaddingTop() : -this.sectionRadius, view.getY() - (z ? this.sectionRadius : 0.0f)), view.getRight(), Math.min(getHeight() - (this.applyPaddingToSections ? getPaddingBottom() : -this.sectionRadius), ((view2.getY() + view2.getHeight()) + (z2 ? this.sectionRadius : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.drawSectionBackground.run(canvas, rectF, Float.valueOf(this.sectionRadius), Float.valueOf(this.sectionRadius), Float.valueOf(view.getAlpha()));
    }

    private boolean hasAbove(View view, int i) {
        int childAdapterPosition;
        if (view == null || i > 0 || getAdapter() == null || this.isViewTypeSection == null || (childAdapterPosition = getChildAdapterPosition(view)) == -1 || childAdapterPosition == 0) {
            return false;
        }
        return ((Boolean) this.isViewTypeSection.run(Integer.valueOf(getAdapter().getItemViewType(childAdapterPosition - 1)))).booleanValue();
    }

    private boolean hasBelow(View view, int i) {
        int childAdapterPosition;
        if (view == null || i < getChildCount() - 1 || getAdapter() == null || this.isViewTypeSection == null || (childAdapterPosition = getChildAdapterPosition(view)) == -1 || childAdapterPosition == getAdapter().getItemCount() - 1) {
            return false;
        }
        return ((Boolean) this.isViewTypeSection.run(Integer.valueOf(getAdapter().getItemViewType(childAdapterPosition + 1)))).booleanValue();
    }

    public void drawSectionsBackgrounds(final Canvas canvas) {
        int i;
        View view;
        if (this.drawSectionBackground == null) {
            return;
        }
        if (isAnimating()) {
            if (this.sections == null) {
                this.sections = new ArrayList();
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != this.emptyView && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(childAt)).booleanValue()) {
                    float y = childAt.getY();
                    float y2 = childAt.getY() + childAt.getHeight();
                    RecyclerView.ViewHolder childViewHolder = getChildViewHolder(childAt);
                    if (childViewHolder.isRemoved() && childAt.getAlpha() < 1.0f && childViewHolder.isRemoved() && (i = childViewHolder.mOldCompoundPosition) >= 0) {
                        int ceil = ((int) Math.ceil(i / 1000.0d)) + 1;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= getChildCount()) {
                                view = null;
                                break;
                            }
                            view = getChildAt(i3);
                            if (view != null && view != childAt && getChildAdapterPosition(view) == ceil) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (view != null && y2 > view.getY() && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(view)).booleanValue() && !getChildViewHolder(view).isRemoved()) {
                            y -= 1.0f;
                            y2 = view.getY();
                            if (y2 < y) {
                            }
                        }
                    }
                    this.sections.add(new SectionsDrawer.Section(y, y2, childAt.getAlpha()));
                }
            }
            SectionsDrawer.draw(this.sections, this.sectionRadius, new Utilities.Callback5() { // from class: org.telegram.ui.Components.RecyclerListView$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.Utilities.Callback5
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    RecyclerListView.this.lambda$drawSectionsBackgrounds$5(canvas, (Float) obj, (Float) obj2, (Float) obj3, (Float) obj4, (Float) obj5);
                }
            });
            this.sections.clear();
            return;
        }
        View view2 = null;
        View view3 = null;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != this.emptyView && childAt2.getVisibility() == 0 && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(childAt2)).booleanValue()) {
                if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                    drawSectionBackground(canvas, view2, view3, hasAbove(view2, i4), hasBelow(view3, i5));
                    view2 = null;
                    i4 = -1;
                }
                if (view2 == null) {
                    i4 = i6;
                    view2 = childAt2;
                }
                i5 = i6;
                view3 = childAt2;
            } else {
                drawSectionBackground(canvas, view2, view3, hasAbove(view2, i4), hasBelow(view3, i5));
                view2 = null;
                view3 = null;
                i4 = -1;
                i5 = -1;
            }
        }
        drawSectionBackground(canvas, view2, view3, hasAbove(view2, i4), hasBelow(view3, i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$drawSectionsBackgrounds$5(Canvas canvas, Float f, Float f2, Float f3, Float f4, Float f5) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.sectionsItemDecoration.padding, f.floatValue(), getWidth() - this.sectionsItemDecoration.padding, f2.floatValue());
        this.drawSectionBackground.run(canvas, rectF, f3, f4, f5);
    }

    public static void drawBackgroundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = sectionBackgroundPaint;
        paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.multAlpha(285212672, f3));
        paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), f3));
        if (f == f2) {
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        Path path = sectionBackgroundPath;
        path.rewind();
        float[] fArr = radii;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    public void drawBackgroundRect(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        drawBackgroundRect(canvas, rectF, f, f2, f3, this.resourcesProvider);
    }

    private void clipChild(Canvas canvas, View view) {
        boolean z;
        boolean z2;
        if (view == null || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(view)).booleanValue()) {
            return;
        }
        int childAdapterPosition = getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            z2 = false;
            z = false;
        } else {
            View findViewByPosition = findViewByPosition(childAdapterPosition - 1);
            View findViewByPosition2 = findViewByPosition(childAdapterPosition + 1);
            z = findViewByPosition != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(findViewByPosition)).booleanValue();
            z2 = findViewByPosition2 != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(findViewByPosition2)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(this.applyPaddingToSections ? getPaddingTop() : -this.sectionRadius, view.getY()), view.getX() + view.getWidth(), Math.min(getHeight() - (this.applyPaddingToSections ? getPaddingBottom() : -this.sectionRadius), view.getY() + view.getHeight()));
        if (z && z2) {
            z = view.getY() >= rectF.top;
            boolean z3 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
            if (z && z3) {
                return;
            } else {
                z2 = z3;
            }
        }
        if (!z && !z2) {
            this.clipPath.rewind();
            Path path = this.clipPath;
            float f = this.sectionRadius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return;
        }
        if (!z) {
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, this.sectionRadiusTop, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
        } else {
            if (z2) {
                return;
            }
            this.clipPath.rewind();
            this.clipPath.addRoundRect(rectF, this.sectionRadiusBottom, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
        }
    }

    public Drawable getClipBackground(final View view) {
        boolean z;
        boolean z2;
        if (!hasSections() || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(view)).booleanValue()) {
            return null;
        }
        int childAdapterPosition = getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            z2 = false;
            z = false;
        } else {
            View findViewByPosition = findViewByPosition(childAdapterPosition - 1);
            View findViewByPosition2 = findViewByPosition(childAdapterPosition + 1);
            z = findViewByPosition != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(findViewByPosition)).booleanValue();
            z2 = findViewByPosition2 != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(findViewByPosition2)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(this.applyPaddingToSections ? getPaddingTop() : 0.0f, view.getY()), view.getX() + view.getWidth(), Math.min(getHeight() - (this.applyPaddingToSections ? getPaddingBottom() : 0), view.getY() + view.getHeight()));
        if (z && z2) {
            z = view.getY() >= rectF.top;
            boolean z3 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
            if (z && z3) {
                return Theme.createRoundRectDrawable(0, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            }
            z2 = z3;
        }
        final Path path = new Path();
        if (!z && !z2) {
            path.rewind();
            float f = this.sectionRadius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else if (!z) {
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusTop, Path.Direction.CW);
        } else if (!z2) {
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusBottom, Path.Direction.CW);
        }
        return new Drawable() { // from class: org.telegram.ui.Components.RecyclerListView.7
            private final Paint paint = new Paint(1);

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return -2;
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                canvas.save();
                canvas.translate(-view.getX(), -view.getY());
                canvas.clipPath(path);
                this.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite, RecyclerListView.this.resourcesProvider), this.paint.getAlpha()));
                canvas.drawRect(AndroidUtilities.rectTmp, this.paint);
                canvas.restore();
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i) {
                this.paint.setAlpha(i);
            }
        };
    }

    public static class SectionsDrawer {
        private static final ArrayList groups = new ArrayList();

        public static class Section {
            public float alpha;
            public float from;
            public float to;

            public Section(float f, float f2, float f3) {
                this.from = f;
                this.to = f2;
                this.alpha = f3;
            }
        }

        public static void draw(List list, float f, Utilities.Callback5 callback5) {
            int i;
            if (list == null || list.isEmpty()) {
                return;
            }
            Collections.sort(list, new Comparator() { // from class: org.telegram.ui.Components.RecyclerListView$SectionsDrawer$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$draw$0;
                    lambda$draw$0 = RecyclerListView.SectionsDrawer.lambda$draw$0((RecyclerListView.SectionsDrawer.Section) obj, (RecyclerListView.SectionsDrawer.Section) obj2);
                    return lambda$draw$0;
                }
            });
            groups.clear();
            for (int i2 = 0; i2 < list.size(); i2 = i) {
                float f2 = ((Section) list.get(i2)).to;
                i = i2 + 1;
                while (i < list.size() && ((Section) list.get(i)).from <= 1.5f + f2) {
                    f2 = Math.max(f2, ((Section) list.get(i)).to);
                    i++;
                }
                float[] calculateGroup = calculateGroup(list, i2, i, f);
                if (calculateGroup != null) {
                    groups.add(calculateGroup);
                }
            }
            int i3 = 0;
            while (true) {
                ArrayList arrayList = groups;
                if (i3 >= arrayList.size()) {
                    return;
                }
                float[] fArr = (float[]) arrayList.get(i3);
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = fArr[2];
                float f6 = fArr[3];
                float f7 = fArr[4];
                if (i3 > 0) {
                    float f8 = f3 - ((float[]) arrayList.get(i3 - 1))[1];
                    float f9 = f * 0.2f;
                    if (f8 < f9) {
                        f5 = Math.min(f5, (f8 / f9) * f);
                    }
                }
                if (i3 < arrayList.size() - 1) {
                    float f10 = ((float[]) arrayList.get(i3 + 1))[0] - f4;
                    float f11 = f * 0.2f;
                    if (f10 < f11) {
                        f6 = Math.min(f6, (f10 / f11) * f);
                    }
                }
                callback5.run(Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7));
                i3++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$draw$0(Section section, Section section2) {
            return Float.compare(section.from, section2.from);
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static float[] calculateGroup(List list, int i, int i2, float f) {
            float f2;
            float f3;
            float f4 = f;
            float f5 = Float.MAX_VALUE;
            float f6 = Float.MIN_VALUE;
            int i3 = i;
            float f7 = Float.MAX_VALUE;
            float f8 = Float.MIN_VALUE;
            while (true) {
                f2 = 0.99f;
                if (i3 >= i2) {
                    break;
                }
                Section section = (Section) list.get(i3);
                if (section.alpha >= 0.99f) {
                    f7 = Math.min(f7, section.from);
                    f8 = Math.max(f8, section.to);
                }
                i3++;
            }
            boolean z = f7 != Float.MAX_VALUE;
            float f9 = 0.0f;
            for (int i4 = i; i4 < i2; i4++) {
                Section section2 = (Section) list.get(i4);
                f5 = Math.min(f5, section2.from);
                f6 = Math.max(f6, section2.to);
                f9 = Math.max(f9, section2.alpha);
            }
            if (f9 < 0.001f) {
                return null;
            }
            if (z) {
                Section section3 = null;
                float f10 = 0.0f;
                for (int i5 = i; i5 < i2; i5++) {
                    Section section4 = (Section) list.get(i5);
                    float f11 = section4.alpha;
                    if (f11 < 0.99f) {
                        float f12 = section4.from;
                        if (f12 < f7) {
                            float f13 = (f7 - f12) * f11;
                            if (f13 > f10) {
                                f10 = f13;
                                section3 = section4;
                            }
                        }
                    }
                }
                int i6 = i;
                Section section5 = null;
                float f14 = 0.0f;
                while (i6 < i2) {
                    Section section6 = (Section) list.get(i6);
                    float f15 = section6.alpha;
                    if (f15 < f2) {
                        float f16 = section6.to;
                        if (f16 > f8) {
                            float f17 = (f16 - f8) * f15;
                            if (f17 > f14) {
                                f14 = f17;
                                section5 = section6;
                            }
                        }
                    }
                    i6++;
                    f2 = 0.99f;
                }
                if (section3 != null) {
                    float f18 = section3.alpha;
                    if (f18 > 0.001f) {
                        float lerp = AndroidUtilities.lerp(f7, section3.from, f18);
                        f3 = AndroidUtilities.lerp(f4, section3.alpha * f4, (f7 - lerp) / ((f7 - section3.from) + 0.001f));
                        f7 = lerp;
                        f9 = 1.0f;
                        if (section5 != null) {
                            float f19 = section5.alpha;
                            if (f19 > 0.001f) {
                                float lerp2 = AndroidUtilities.lerp(f8, section5.to, f19);
                                f4 = AndroidUtilities.lerp(f4, section5.alpha * f4, (lerp2 - f8) / ((section5.to - f8) + 0.001f));
                                f8 = lerp2;
                            }
                        }
                        f5 = f7;
                    }
                }
                f3 = f4;
                f9 = 1.0f;
                if (section5 != null) {
                }
                f5 = f7;
            } else {
                f3 = f4;
                f8 = f6;
            }
            if (f8 <= f5) {
                return null;
            }
            return new float[]{f5, f8, f3, f4, f9};
        }
    }
}
