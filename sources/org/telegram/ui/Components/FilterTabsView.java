package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes5.dex */
public abstract class FilterTabsView extends FrameLayout {
    private final Property COLORS;
    private int aActiveTextColorKey;
    private int aBackgroundColorKey;
    private int aTabLineColorKey;
    private int aUnactiveTextColorKey;
    private int activeTextColorKey;
    private final ListAdapter adapter;
    private int additionalTabWidth;
    private int allTabsWidth;
    private boolean animatingIndicator;
    private float animatingIndicatorProgress;
    private final Runnable animationRunnable;
    private float animationTime;
    private float animationValue;
    private int backgroundColorKey;
    BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final Path clipPath;
    private AnimatorSet colorChangeAnimator;
    private final Paint counterPaint;
    private int currentPosition;
    private FilterTabsViewDelegate delegate;
    private final Paint deletePaint;
    private float editingAnimationProgress;
    private boolean editingForwardAnimation;
    private float editingStartAnimationProgress;
    private ColorFilter emojiColorFilter;
    private final SparseIntArray idToPosition;
    private boolean ignoreLayout;
    private final CubicBezierInterpolator interpolator;
    private boolean invalidated;
    private boolean isEditing;
    DefaultItemAnimator itemAnimator;
    private long lastAnimationTime;
    private long lastEditingAnimationTime;
    private final LinearLayoutManager layoutManager;
    private final RecyclerListView listView;
    private final int listViewPaddingH;
    private Drawable lockDrawable;
    private int lockDrawableColor;
    private int manualScrollingToId;
    private int manualScrollingToPosition;
    private boolean orderChanged;
    private final SparseIntArray positionToCount;
    private final SparseIntArray positionToId;
    private final SparseIntArray positionToStableId;
    private final SparseIntArray positionToWidth;
    private final SparseIntArray positionToX;
    private int prevLayoutWidth;
    private int previousId;
    private int previousPosition;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollingToChild;
    private int selectedTabId;
    private int selectorColorKey;
    private final GradientDrawable selectorDrawable;
    private int tabLineColorKey;
    private final ArrayList tabs;
    private final TextPaint textCounterPaint;
    public final TextPaint textPaint;
    private int unactiveTextColorKey;

    public interface FilterTabsViewDelegate {
        boolean canPerformActions();

        boolean didSelectTab(TabView tabView, boolean z);

        int getTabCounter(int i);

        boolean isTabMenuVisible();

        void onDeletePressed(int i);

        void onPageReorder(int i, int i2);

        void onPageScrolled(float f);

        void onPageSelected(Tab tab, boolean z);

        void onSamePageSelected();
    }

    public static /* synthetic */ void $r8$lambda$LUlLhaIciS00vlgmp_dSDwB023s(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    protected abstract void onDefaultTabMoved();

    static /* synthetic */ float access$2716(FilterTabsView filterTabsView, float f) {
        float f2 = filterTabsView.animationTime + f;
        filterTabsView.animationTime = f2;
        return f2;
    }

    public int getCurrentTabStableId() {
        return this.positionToStableId.get(this.currentPosition, -1);
    }

    public int getStableId(int i) {
        return this.positionToStableId.get(i, -1);
    }

    public boolean selectTabWithStableId(int i) {
        for (int i2 = 0; i2 < this.tabs.size(); i2++) {
            if (this.positionToStableId.get(i2, -1) == i) {
                this.currentPosition = i2;
                this.selectedTabId = this.positionToId.get(i2);
                return true;
            }
        }
        return false;
    }

    public class Tab {
        public int counter;
        public int id;
        public boolean isDefault;
        public boolean isLocked;
        public boolean noanimate;
        public CharSequence title;
        public int titleWidth;

        public Tab(int i, CharSequence charSequence, boolean z) {
            this.id = i;
            this.title = charSequence;
            this.noanimate = z;
        }

        public int getWidth(boolean z) {
            int i;
            int ceil = (int) Math.ceil(HintView2.measureCorrectly(this.title, FilterTabsView.this.textPaint));
            this.titleWidth = ceil;
            int i2 = 0;
            if (z) {
                i = FilterTabsView.this.delegate.getTabCounter(this.id);
                if (i < 0) {
                    i = 0;
                }
                if (z) {
                    this.counter = i;
                }
            } else {
                i = this.counter;
            }
            if (i > 0) {
                i2 = AndroidUtilities.dp(-2.0f) + Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(String.format("%d", Integer.valueOf(i))))) + AndroidUtilities.dp(10.0f);
            } else if (!this.isDefault && FilterTabsView.this.isEditing) {
                i2 = AndroidUtilities.dp(12.333f);
            }
            return Math.max(AndroidUtilities.dp(16.0f), ceil + i2);
        }

        public boolean setTitle(String str, ArrayList arrayList, boolean z) {
            if (TextUtils.equals(this.title, str)) {
                return false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            this.title = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, FilterTabsView.this.textPaint.getFontMetricsInt(), false);
            this.title = replaceEmoji;
            this.title = MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, FilterTabsView.this.textPaint.getFontMetricsInt());
            this.noanimate = z;
            return true;
        }
    }

    public class TabView extends View {
        public boolean animateChange;
        public boolean animateCounterChange;
        private float animateFromCountWidth;
        private float animateFromCounterWidth;
        int animateFromTabCount;
        private float animateFromTabWidth;
        float animateFromTextX;
        private int animateFromTitleWidth;
        private float animateFromWidth;
        boolean animateTabCounter;
        private boolean animateTabWidth;
        private boolean animateTextChange;
        private boolean animateTextChangeOut;
        boolean animateTextX;
        private boolean attached;
        public ValueAnimator changeAnimator;
        public float changeProgress;
        private boolean currentNoanimate;
        private int currentPosition;
        private Tab currentTab;
        private CharSequence currentText;
        StaticLayout inCounter;
        private int lastCountWidth;
        private float lastCounterWidth;
        int lastTabCount;
        private float lastTabWidth;
        float lastTextX;
        CharSequence lastTitle;
        StaticLayout lastTitleLayout;
        private int lastTitleWidth;
        private float lastWidth;
        private float locIconXOffset;
        StaticLayout outCounter;
        private float progressToLocked;
        private final RectF rect;
        StaticLayout stableCounter;
        private float tabCounterVisible;
        private int tabWidth;
        private int textHeight;
        private StaticLayout textLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans textLayoutEmojis;
        private int textOffsetX;
        private StaticLayout titleAnimateInLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateInLayoutEmojis;
        private StaticLayout titleAnimateOutLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateOutLayoutEmojis;
        private StaticLayout titleAnimateStableLayout;
        private AnimatedEmojiSpan.EmojiGroupedSpans titleAnimateStableLayoutEmojis;
        private float titleXOffset;

        public TabView(Context context) {
            super(context);
            this.rect = new RectF();
            this.lastTabCount = -1;
        }

        public void setTab(Tab tab, int i) {
            this.currentTab = tab;
            this.currentPosition = i;
            setContentDescription(tab.title);
            requestLayout();
            boolean z = this.currentNoanimate;
            Tab tab2 = this.currentTab;
            if (z != (tab2 != null && tab2.noanimate)) {
                AnimatedEmojiSpan.release(this, this.textLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateInLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
                AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
                if (this.attached) {
                    this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, this.textLayout);
                    this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, this.titleAnimateInLayout);
                    this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, this.titleAnimateOutLayout);
                    this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, this.titleAnimateStableLayout);
                }
                this.currentNoanimate = this.currentTab.noanimate;
            }
        }

        @Override // android.view.View
        public int getId() {
            return this.currentTab.id;
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.animateChange = false;
            this.animateTabCounter = false;
            this.animateCounterChange = false;
            this.animateTextChange = false;
            this.animateTextX = false;
            this.animateTabWidth = false;
            ValueAnimator valueAnimator = this.changeAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.changeAnimator.removeAllUpdateListeners();
                this.changeAnimator.cancel();
                this.changeAnimator = null;
            }
            invalidate();
            AnimatedEmojiSpan.release(this, this.textLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateInLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
            AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(this.currentTab.getWidth(false) + AndroidUtilities.dp(24.0f) + FilterTabsView.this.additionalTabWidth, View.MeasureSpec.getSize(i2));
        }

        /* JADX WARN: Removed duplicated region for block: B:131:0x0949  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x096b  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x09c8  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x09fb  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x06da  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x072b  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x073c  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0777  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x07b3  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0734  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x07e4  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x06b1  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x06b4  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onDraw(Canvas canvas) {
            float f;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            float f2;
            int i9;
            String format;
            int max;
            float f3;
            float f4;
            int i10;
            float f5;
            int i11;
            String str;
            int i12;
            float f6;
            int i13;
            boolean z;
            boolean z2;
            float f7;
            int i14;
            float f8;
            float f9;
            int dp;
            float f10;
            int dp2;
            int lineBottom;
            int lineTop;
            int i15;
            int color;
            float f11;
            float f12;
            int i16;
            Canvas canvas2 = canvas;
            boolean z3 = this.currentTab.isDefault;
            if (FilterTabsView.this.editingAnimationProgress != 0.0f) {
                canvas2.save();
                float f13 = FilterTabsView.this.editingAnimationProgress;
                float sin = (float) Math.sin(((f13 * (this.currentPosition % 2 == 0 ? 1.0f : -1.0f)) + r5) * 3.141592653589793d * 2.5d);
                double elapsedRealtime = (float) ((SystemClock.elapsedRealtime() / 400.0f) * 3.141592653589793d * (this.currentPosition % 2 == 0 ? 1.0f : -1.0f));
                f = 400.0f;
                canvas2.translate((float) (Math.cos(elapsedRealtime) * AndroidUtilities.dp(0.33f) * (this.currentPosition % 2 == 0 ? 1.0f : -1.0f)), (float) (Math.sin(elapsedRealtime) * (-AndroidUtilities.dp(0.33f))));
                canvas2.rotate(sin * 1.4f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            } else {
                f = 400.0f;
            }
            if (FilterTabsView.this.manualScrollingToId != -1) {
                i = FilterTabsView.this.manualScrollingToId;
                i2 = FilterTabsView.this.selectedTabId;
            } else {
                i = FilterTabsView.this.selectedTabId;
                i2 = FilterTabsView.this.previousId;
            }
            if (this.currentTab.id == i) {
                i3 = FilterTabsView.this.activeTextColorKey;
                i4 = FilterTabsView.this.aActiveTextColorKey;
                i5 = FilterTabsView.this.unactiveTextColorKey;
                i6 = FilterTabsView.this.aUnactiveTextColorKey;
                i7 = Theme.key_chats_tabUnreadActiveBackground;
                i8 = Theme.key_chats_tabUnreadUnactiveBackground;
            } else {
                i3 = FilterTabsView.this.unactiveTextColorKey;
                i4 = FilterTabsView.this.aUnactiveTextColorKey;
                i5 = FilterTabsView.this.activeTextColorKey;
                i6 = FilterTabsView.this.aUnactiveTextColorKey;
                i7 = Theme.key_chats_tabUnreadUnactiveBackground;
                i8 = Theme.key_chats_tabUnreadActiveBackground;
            }
            if (i4 < 0) {
                if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToId != -1) && ((i16 = this.currentTab.id) == i || i16 == i2)) {
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.textPaint.setColor(ColorUtils.blendARGB(Theme.getColor(i5, filterTabsView.resourcesProvider), Theme.getColor(i3, FilterTabsView.this.resourcesProvider), FilterTabsView.this.animatingIndicatorProgress));
                } else {
                    FilterTabsView filterTabsView2 = FilterTabsView.this;
                    filterTabsView2.textPaint.setColor(Theme.getColor(i3, filterTabsView2.resourcesProvider));
                }
                f2 = 2.0f;
            } else {
                f2 = 2.0f;
                int color2 = Theme.getColor(i3, FilterTabsView.this.resourcesProvider);
                int color3 = Theme.getColor(i4, FilterTabsView.this.resourcesProvider);
                if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToPosition != -1) && ((i9 = this.currentTab.id) == i || i9 == i2)) {
                    int color4 = Theme.getColor(i5, FilterTabsView.this.resourcesProvider);
                    int color5 = Theme.getColor(i6, FilterTabsView.this.resourcesProvider);
                    FilterTabsView filterTabsView3 = FilterTabsView.this;
                    filterTabsView3.textPaint.setColor(ColorUtils.blendARGB(ColorUtils.blendARGB(color4, color5, filterTabsView3.animationValue), ColorUtils.blendARGB(color2, color3, FilterTabsView.this.animationValue), FilterTabsView.this.animatingIndicatorProgress));
                } else {
                    FilterTabsView filterTabsView4 = FilterTabsView.this;
                    filterTabsView4.textPaint.setColor(ColorUtils.blendARGB(color2, color3, filterTabsView4.animationValue));
                }
            }
            FilterTabsView.this.emojiColorFilter = new PorterDuffColorFilter(FilterTabsView.this.textPaint.getColor(), PorterDuff.Mode.SRC_IN);
            int i17 = this.animateFromTabCount;
            boolean z4 = i17 == 0 && this.animateTabCounter;
            boolean z5 = i17 > 0 && this.currentTab.counter == 0 && this.animateTabCounter;
            boolean z6 = i17 > 0 && this.currentTab.counter > 0 && this.animateTabCounter;
            int i18 = this.currentTab.counter;
            if (i18 > 0 || z5) {
                format = z5 ? String.format("%d", Integer.valueOf(i17)) : String.format("%d", Integer.valueOf(i18));
                float ceil = (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(format));
                max = ((int) Math.max(AndroidUtilities.dp(7.333f), ceil)) + AndroidUtilities.dp(10.0f);
                f3 = ceil;
            } else {
                format = null;
                max = 0;
                f3 = 0.0f;
            }
            if (!z3 && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != 0.0f)) {
                max = (int) (max + ((AndroidUtilities.dp(17.333f) - max) * FilterTabsView.this.editingStartAnimationProgress));
            }
            if (max == 0 || z5) {
                f4 = 0.0f;
            } else {
                f4 = format != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress;
            }
            this.tabCounterVisible = f4;
            int i19 = this.currentTab.titleWidth;
            if (max == 0 || z5) {
                i10 = 0;
            } else {
                i10 = AndroidUtilities.dp((format != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress) * (-2.0f)) + max;
            }
            this.tabWidth = i19 + i10;
            float measuredWidth = (getMeasuredWidth() - this.tabWidth) / f2;
            if (this.animateTextX) {
                float f14 = this.changeProgress;
                measuredWidth = (measuredWidth * f14) + (this.animateFromTextX * (1.0f - f14));
            }
            if (TextUtils.equals(this.currentTab.title, this.currentText)) {
                f5 = 1.0f;
            } else {
                this.currentText = this.currentTab.title;
                StaticLayout staticLayout = new StaticLayout(this.currentText, FilterTabsView.this.textPaint, AndroidUtilities.dp(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.textLayout = staticLayout;
                f5 = 1.0f;
                this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, staticLayout);
                this.textHeight = this.textLayout.getHeight();
                this.textOffsetX = (int) (-this.textLayout.getLineLeft(0));
            }
            if (this.animateTextChange) {
                f8 = this.titleXOffset * (this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress);
                if (this.titleAnimateStableLayout != null) {
                    canvas2.save();
                    canvas2.translate(this.textOffsetX + measuredWidth + f8, ((getMeasuredHeight() - this.textHeight) / f2) + f5);
                    this.titleAnimateStableLayout.draw(canvas2);
                    f11 = 6.0f;
                    f7 = 0.0f;
                    i14 = max;
                    str = format;
                    z = z3;
                    i13 = i7;
                    i11 = i;
                    i12 = i2;
                    z2 = z4;
                    f12 = measuredWidth;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateStableLayout, this.titleAnimateStableLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                } else {
                    i11 = i;
                    str = format;
                    i12 = i2;
                    i13 = i7;
                    z = z3;
                    z2 = z4;
                    f7 = 0.0f;
                    f11 = 6.0f;
                    f12 = measuredWidth;
                    i14 = max;
                }
                if (this.titleAnimateInLayout != null) {
                    canvas2.save();
                    int alpha = FilterTabsView.this.textPaint.getAlpha();
                    FilterTabsView.this.textPaint.setAlpha((int) (alpha * (this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress)));
                    canvas2.translate(f12 + this.textOffsetX + f8, ((getMeasuredHeight() - this.textHeight) / f2) + f5);
                    this.titleAnimateInLayout.draw(canvas2);
                    f6 = f12;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateInLayout, this.titleAnimateInLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(f11), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? f5 - this.changeProgress : this.changeProgress, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                    FilterTabsView.this.textPaint.setAlpha(alpha);
                } else {
                    f6 = f12;
                }
                if (this.titleAnimateOutLayout != null) {
                    canvas2.save();
                    int alpha2 = FilterTabsView.this.textPaint.getAlpha();
                    FilterTabsView.this.textPaint.setAlpha((int) (alpha2 * (this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress)));
                    canvas2.translate(f6 + this.textOffsetX + f8, ((getMeasuredHeight() - this.textHeight) / f2) + f5);
                    this.titleAnimateOutLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.titleAnimateOutLayout, this.titleAnimateOutLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(f11), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, this.animateTextChangeOut ? this.changeProgress : f5 - this.changeProgress, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                    FilterTabsView.this.textPaint.setAlpha(alpha2);
                }
            } else {
                i11 = i;
                str = format;
                i12 = i2;
                f6 = measuredWidth;
                i13 = i7;
                z = z3;
                z2 = z4;
                f7 = 0.0f;
                i14 = max;
                if (this.textLayout != null) {
                    canvas2.save();
                    canvas2.translate(f6 + this.textOffsetX, ((getMeasuredHeight() - this.textHeight) / f2) + f5);
                    this.textLayout.draw(canvas2);
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, this.textLayout, this.textLayoutEmojis, 0.0f, null, computeVerticalScrollOffset() - AndroidUtilities.dp(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, FilterTabsView.this.emojiColorFilter);
                    canvas2.restore();
                }
                f8 = 0.0f;
            }
            if (z2 || str != null || (!z && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != f7))) {
                if (FilterTabsView.this.aBackgroundColorKey < 0) {
                    FilterTabsView.this.textCounterPaint.setColor(Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider));
                } else {
                    FilterTabsView.this.textCounterPaint.setColor(ColorUtils.blendARGB(Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider), Theme.getColor(FilterTabsView.this.aBackgroundColorKey, FilterTabsView.this.resourcesProvider), FilterTabsView.this.animationValue));
                }
                if (!Theme.hasThemeKey(i13) || !Theme.hasThemeKey(i8)) {
                    FilterTabsView.this.counterPaint.setColor(FilterTabsView.this.textPaint.getColor());
                } else {
                    int color6 = Theme.getColor(i13, FilterTabsView.this.resourcesProvider);
                    if ((FilterTabsView.this.animatingIndicator || FilterTabsView.this.manualScrollingToPosition != -1) && ((i15 = this.currentTab.id) == i11 || i15 == i12)) {
                        FilterTabsView.this.counterPaint.setColor(ColorUtils.blendARGB(Theme.getColor(i8, FilterTabsView.this.resourcesProvider), color6, FilterTabsView.this.animatingIndicatorProgress));
                    } else {
                        FilterTabsView.this.counterPaint.setColor(color6);
                    }
                }
                float f15 = this.currentTab.titleWidth;
                boolean z7 = this.animateTextChange;
                if (z7) {
                    float f16 = this.animateFromTitleWidth;
                    float f17 = this.changeProgress;
                    f15 = (f15 * f17) + (f16 * (f5 - f17));
                }
                if (z7 && this.titleAnimateOutLayout == null) {
                    f9 = (f6 - this.titleXOffset) + f8 + f15;
                    dp = AndroidUtilities.dp(5.0f);
                } else {
                    f9 = f6 + f15;
                    dp = AndroidUtilities.dp(5.0f);
                }
                float f18 = f9 + dp;
                int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(17.333f)) / 2;
                if (z || ((!FilterTabsView.this.isEditing && FilterTabsView.this.editingStartAnimationProgress == f7) || str != null)) {
                    FilterTabsView.this.counterPaint.setAlpha(NotificationCenter.didReceiveSmsCode);
                } else {
                    FilterTabsView.this.counterPaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                }
                if (z6) {
                    float f19 = this.animateFromCountWidth;
                    float f20 = i14;
                    if (f19 != f20) {
                        float f21 = this.changeProgress;
                        f10 = (f19 * (f5 - f21)) + (f20 * f21);
                        if (z6) {
                            float f22 = this.animateFromCounterWidth;
                            float f23 = this.changeProgress;
                            f3 = (f22 * (f5 - f23)) + (f3 * f23);
                        }
                        float f24 = measuredHeight;
                        this.rect.set(f18, f24, f10 + f18, AndroidUtilities.dp(17.333f) + measuredHeight);
                        if (!z2 || z5) {
                            canvas2.save();
                            float f25 = !z2 ? this.changeProgress : f5 - this.changeProgress;
                            canvas2.scale(f25, f25, this.rect.centerX(), this.rect.centerY());
                        }
                        RectF rectF = this.rect;
                        float f26 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF, f26, f26, FilterTabsView.this.counterPaint);
                        if (!z6) {
                            if (this.inCounter != null) {
                                dp2 = AndroidUtilities.dp(17.333f);
                                lineBottom = this.inCounter.getLineBottom(0);
                                lineTop = this.inCounter.getLineTop(0);
                            } else if (this.outCounter != null) {
                                dp2 = AndroidUtilities.dp(17.333f);
                                lineBottom = this.outCounter.getLineBottom(0);
                                lineTop = this.outCounter.getLineTop(0);
                            } else {
                                if (this.stableCounter != null) {
                                    dp2 = AndroidUtilities.dp(17.333f);
                                    lineBottom = this.stableCounter.getLineBottom(0);
                                    lineTop = this.stableCounter.getLineTop(0);
                                }
                                float dp3 = f24 - AndroidUtilities.dp(0.5f);
                                float f27 = z ? f5 - FilterTabsView.this.editingStartAnimationProgress : 1.0f;
                                if (this.inCounter != null) {
                                    canvas2.save();
                                    FilterTabsView.this.textCounterPaint.setAlpha((int) (f27 * 255.0f * this.changeProgress));
                                    RectF rectF2 = this.rect;
                                    canvas2.translate(rectF2.left + ((rectF2.width() - f3) / f2), ((f5 - this.changeProgress) * AndroidUtilities.dp(15.0f)) + dp3);
                                    this.inCounter.draw(canvas2);
                                    canvas2.restore();
                                }
                                if (this.outCounter != null) {
                                    canvas2.save();
                                    FilterTabsView.this.textCounterPaint.setAlpha((int) (f27 * 255.0f * (f5 - this.changeProgress)));
                                    RectF rectF3 = this.rect;
                                    canvas2.translate(rectF3.left + ((rectF3.width() - f3) / f2), (this.changeProgress * (-AndroidUtilities.dp(15.0f))) + dp3);
                                    this.outCounter.draw(canvas2);
                                    canvas2.restore();
                                }
                                if (this.stableCounter != null) {
                                    canvas2.save();
                                    FilterTabsView.this.textCounterPaint.setAlpha((int) (f27 * 255.0f));
                                    RectF rectF4 = this.rect;
                                    canvas2.translate(rectF4.left + ((rectF4.width() - f3) / f2), dp3);
                                    this.stableCounter.draw(canvas2);
                                    canvas2.restore();
                                }
                                FilterTabsView.this.textCounterPaint.setAlpha(NotificationCenter.didReceiveSmsCode);
                            }
                            f24 += (dp2 - (lineBottom - lineTop)) / f2;
                            float dp32 = f24 - AndroidUtilities.dp(0.5f);
                            if (z) {
                            }
                            if (this.inCounter != null) {
                            }
                            if (this.outCounter != null) {
                            }
                            if (this.stableCounter != null) {
                            }
                            FilterTabsView.this.textCounterPaint.setAlpha(NotificationCenter.didReceiveSmsCode);
                        } else if (str != null) {
                            if (!z) {
                                FilterTabsView.this.textCounterPaint.setAlpha((int) ((f5 - FilterTabsView.this.editingStartAnimationProgress) * 255.0f));
                            }
                            RectF rectF5 = this.rect;
                            canvas2.drawText(str, rectF5.left + ((rectF5.width() - f3) / f2), measuredHeight + AndroidUtilities.dp(12.5f), FilterTabsView.this.textCounterPaint);
                        }
                        if (!z2 || z5) {
                            canvas2.restore();
                        }
                        if (!z && (FilterTabsView.this.isEditing || FilterTabsView.this.editingStartAnimationProgress != f7)) {
                            FilterTabsView.this.deletePaint.setColor(FilterTabsView.this.textCounterPaint.getColor());
                            FilterTabsView.this.deletePaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                            float dp4 = AndroidUtilities.dp(3.0f);
                            canvas2.drawLine(this.rect.centerX() - dp4, this.rect.centerY() - dp4, this.rect.centerX() + dp4, this.rect.centerY() + dp4, FilterTabsView.this.deletePaint);
                            canvas2 = canvas;
                            canvas2.drawLine(this.rect.centerX() - dp4, this.rect.centerY() + dp4, this.rect.centerX() + dp4, this.rect.centerY() - dp4, FilterTabsView.this.deletePaint);
                        }
                    }
                }
                f10 = i14;
                if (z6) {
                }
                float f242 = measuredHeight;
                this.rect.set(f18, f242, f10 + f18, AndroidUtilities.dp(17.333f) + measuredHeight);
                if (!z2) {
                }
                canvas2.save();
                if (!z2) {
                }
                canvas2.scale(f25, f25, this.rect.centerX(), this.rect.centerY());
                RectF rectF6 = this.rect;
                float f262 = AndroidUtilities.density * 11.5f;
                canvas2.drawRoundRect(rectF6, f262, f262, FilterTabsView.this.counterPaint);
                if (!z6) {
                }
                if (!z2) {
                }
                canvas2.restore();
                if (!z) {
                    FilterTabsView.this.deletePaint.setColor(FilterTabsView.this.textCounterPaint.getColor());
                    FilterTabsView.this.deletePaint.setAlpha((int) (FilterTabsView.this.editingStartAnimationProgress * 255.0f));
                    float dp42 = AndroidUtilities.dp(3.0f);
                    canvas2.drawLine(this.rect.centerX() - dp42, this.rect.centerY() - dp42, this.rect.centerX() + dp42, this.rect.centerY() + dp42, FilterTabsView.this.deletePaint);
                    canvas2 = canvas;
                    canvas2.drawLine(this.rect.centerX() - dp42, this.rect.centerY() + dp42, this.rect.centerX() + dp42, this.rect.centerY() - dp42, FilterTabsView.this.deletePaint);
                }
            }
            float f28 = f3;
            if (FilterTabsView.this.editingAnimationProgress != f7) {
                canvas2.restore();
            }
            this.lastTextX = f6;
            Tab tab = this.currentTab;
            this.lastTabCount = tab.counter;
            this.lastTitleLayout = this.textLayout;
            this.lastTitle = this.currentText;
            this.lastTitleWidth = tab.titleWidth;
            this.lastCountWidth = i14;
            this.lastCounterWidth = f28;
            this.lastTabWidth = this.tabWidth;
            this.lastWidth = getMeasuredWidth();
            if (!this.currentTab.isLocked && this.progressToLocked == f7) {
                return;
            }
            if (FilterTabsView.this.lockDrawable == null) {
                FilterTabsView.this.lockDrawable = ContextCompat.getDrawable(getContext(), R.drawable.other_lockedfolders);
            }
            boolean z8 = this.currentTab.isLocked;
            if (z8) {
                float f29 = this.progressToLocked;
                if (f29 != f5) {
                    this.progressToLocked = f29 + 0.10666667f;
                    this.progressToLocked = Utilities.clamp(this.progressToLocked, 1.0f, 0.0f);
                    color = Theme.getColor(FilterTabsView.this.unactiveTextColorKey, FilterTabsView.this.resourcesProvider);
                    if (FilterTabsView.this.aUnactiveTextColorKey >= 0) {
                        color = ColorUtils.blendARGB(color, Theme.getColor(FilterTabsView.this.aUnactiveTextColorKey, FilterTabsView.this.resourcesProvider), FilterTabsView.this.animationValue);
                    }
                    if (FilterTabsView.this.lockDrawableColor != color) {
                        FilterTabsView.this.lockDrawableColor = color;
                        FilterTabsView.this.lockDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                    }
                    int measuredWidth2 = (int) (((getMeasuredWidth() - FilterTabsView.this.lockDrawable.getIntrinsicWidth()) / f2) + this.locIconXOffset);
                    int measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                    FilterTabsView.this.lockDrawable.setBounds(measuredWidth2, measuredHeight2, FilterTabsView.this.lockDrawable.getIntrinsicWidth() + measuredWidth2, FilterTabsView.this.lockDrawable.getIntrinsicHeight() + measuredHeight2);
                    if (this.progressToLocked != 1.0f) {
                        FilterTabsView.this.lockDrawable.draw(canvas2);
                        return;
                    }
                    canvas2.save();
                    float f30 = this.progressToLocked;
                    canvas2.scale(f30, f30, FilterTabsView.this.lockDrawable.getBounds().centerX(), FilterTabsView.this.lockDrawable.getBounds().centerY());
                    FilterTabsView.this.lockDrawable.draw(canvas2);
                    canvas2.restore();
                    return;
                }
            }
            if (!z8) {
                this.progressToLocked -= 0.10666667f;
            }
            this.progressToLocked = Utilities.clamp(this.progressToLocked, 1.0f, 0.0f);
            color = Theme.getColor(FilterTabsView.this.unactiveTextColorKey, FilterTabsView.this.resourcesProvider);
            if (FilterTabsView.this.aUnactiveTextColorKey >= 0) {
            }
            if (FilterTabsView.this.lockDrawableColor != color) {
            }
            int measuredWidth22 = (int) (((getMeasuredWidth() - FilterTabsView.this.lockDrawable.getIntrinsicWidth()) / f2) + this.locIconXOffset);
            int measuredHeight22 = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            FilterTabsView.this.lockDrawable.setBounds(measuredWidth22, measuredHeight22, FilterTabsView.this.lockDrawable.getIntrinsicWidth() + measuredWidth22, FilterTabsView.this.lockDrawable.getIntrinsicHeight() + measuredHeight22);
            if (this.progressToLocked != 1.0f) {
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.textLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.textLayoutEmojis, this.textLayout);
            this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, this.titleAnimateInLayout);
            this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, this.titleAnimateOutLayout);
            this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, this.titleAnimateStableLayout);
        }

        public boolean animateChange() {
            boolean z;
            String str;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            boolean z2;
            int i2 = this.currentTab.counter;
            int i3 = this.lastTabCount;
            if (i2 != i3) {
                this.animateTabCounter = true;
                this.animateFromTabCount = i3;
                this.animateFromCountWidth = this.lastCountWidth;
                this.animateFromCounterWidth = this.lastCounterWidth;
                if (i3 > 0 && i2 > 0) {
                    String valueOf = String.valueOf(i3);
                    String valueOf2 = String.valueOf(this.currentTab.counter);
                    if (valueOf.length() == valueOf2.length()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                        for (int i4 = 0; i4 < valueOf.length(); i4++) {
                            if (valueOf.charAt(i4) == valueOf2.charAt(i4)) {
                                int i5 = i4 + 1;
                                spannableStringBuilder.setSpan(new EmptyStubSpan(), i4, i5, 0);
                                spannableStringBuilder2.setSpan(new EmptyStubSpan(), i4, i5, 0);
                            } else {
                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i4, i4 + 1, 0);
                            }
                        }
                        int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(valueOf));
                        TextPaint textPaint = FilterTabsView.this.textCounterPaint;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.outCounter = new StaticLayout(spannableStringBuilder, textPaint, ceil, alignment, 1.0f, 0.0f, false);
                        this.stableCounter = new StaticLayout(spannableStringBuilder3, FilterTabsView.this.textCounterPaint, ceil, alignment, 1.0f, 0.0f, false);
                        this.inCounter = new StaticLayout(spannableStringBuilder2, FilterTabsView.this.textCounterPaint, ceil, alignment, 1.0f, 0.0f, false);
                    } else {
                        int ceil2 = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(valueOf));
                        TextPaint textPaint2 = FilterTabsView.this.textCounterPaint;
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                        this.outCounter = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                        this.inCounter = new StaticLayout(valueOf2, FilterTabsView.this.textCounterPaint, (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                    }
                }
                z = true;
            } else {
                z = false;
            }
            int i6 = this.currentTab.counter;
            if (i6 > 0) {
                str = String.format("%d", Integer.valueOf(i6));
                i = Math.max(AndroidUtilities.dp(7.333f), (int) Math.ceil(FilterTabsView.this.textCounterPaint.measureText(str))) + AndroidUtilities.dp(10.0f);
            } else {
                str = null;
                i = 0;
            }
            int dp = this.currentTab.titleWidth + (i != 0 ? i + AndroidUtilities.dp((str != null ? 1.0f : FilterTabsView.this.editingStartAnimationProgress) * 6.0f) : 0);
            float measuredWidth = (getMeasuredWidth() - dp) / 2;
            float f = this.lastTextX;
            if (measuredWidth != f) {
                this.animateTextX = true;
                this.animateFromTextX = f;
                z = true;
            }
            CharSequence charSequence3 = this.lastTitle;
            if (charSequence3 != null && !this.currentTab.title.equals(charSequence3)) {
                if (this.lastTitle.length() > this.currentTab.title.length()) {
                    charSequence = this.lastTitle;
                    charSequence2 = this.currentTab.title;
                    z2 = true;
                } else {
                    charSequence = this.currentTab.title;
                    charSequence2 = this.lastTitle;
                    z2 = false;
                }
                int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, charSequence2);
                if (charSequenceIndexOf >= 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, FilterTabsView.this.textPaint.getFontMetricsInt(), false);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceEmoji);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(replaceEmoji);
                    if (charSequenceIndexOf != 0) {
                        spannableStringBuilder5.setSpan(new EmptyStubSpan(), 0, charSequenceIndexOf, 0);
                    }
                    if (charSequence2.length() + charSequenceIndexOf != charSequence.length()) {
                        spannableStringBuilder5.setSpan(new EmptyStubSpan(), charSequence2.length() + charSequenceIndexOf, charSequence.length(), 0);
                    }
                    spannableStringBuilder4.setSpan(new EmptyStubSpan(), charSequenceIndexOf, charSequence2.length() + charSequenceIndexOf, 0);
                    TextPaint textPaint3 = FilterTabsView.this.textPaint;
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint3, dp2, alignment3, 1.0f, 0.0f, false);
                    this.titleAnimateInLayout = staticLayout;
                    if (this.attached) {
                        this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, staticLayout);
                    }
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, FilterTabsView.this.textPaint, AndroidUtilities.dp(400.0f), alignment3, 1.0f, 0.0f, false);
                    this.titleAnimateStableLayout = staticLayout2;
                    if (this.attached) {
                        this.titleAnimateStableLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateStableLayoutEmojis, staticLayout2);
                    }
                    this.animateTextChange = true;
                    this.animateTextChangeOut = z2;
                    this.titleXOffset = charSequenceIndexOf != 0 ? -this.titleAnimateStableLayout.getPrimaryHorizontal(charSequenceIndexOf) : 0.0f;
                    this.animateFromTitleWidth = this.lastTitleWidth;
                    this.titleAnimateOutLayout = null;
                    AnimatedEmojiSpan.release(this, this.titleAnimateOutLayoutEmojis);
                } else {
                    CharSequence charSequence4 = this.currentTab.title;
                    TextPaint textPaint4 = FilterTabsView.this.textPaint;
                    int dp3 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout3 = new StaticLayout(charSequence4, textPaint4, dp3, alignment4, 1.0f, 0.0f, false);
                    this.titleAnimateInLayout = staticLayout3;
                    if (this.attached) {
                        this.titleAnimateInLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateInLayoutEmojis, staticLayout3);
                    }
                    StaticLayout staticLayout4 = new StaticLayout(this.lastTitle, FilterTabsView.this.textPaint, AndroidUtilities.dp(400.0f), alignment4, 1.0f, 0.0f, false);
                    this.titleAnimateOutLayout = staticLayout4;
                    if (this.attached) {
                        this.titleAnimateOutLayoutEmojis = AnimatedEmojiSpan.update(this.currentTab.noanimate ? 26 : 0, this, this.titleAnimateOutLayoutEmojis, staticLayout4);
                    }
                    this.titleAnimateStableLayout = null;
                    AnimatedEmojiSpan.release(this, this.titleAnimateStableLayoutEmojis);
                    this.animateTextChange = true;
                    this.titleXOffset = 0.0f;
                    this.animateFromTitleWidth = this.lastTitleWidth;
                }
                z = true;
            }
            if (dp == this.lastTabWidth && getMeasuredWidth() == this.lastWidth) {
                return z;
            }
            this.animateTabWidth = true;
            this.animateFromTabWidth = this.lastTabWidth;
            this.animateFromWidth = this.lastWidth;
            return true;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setSelected((this.currentTab == null || FilterTabsView.this.selectedTabId == -1 || this.currentTab.id != FilterTabsView.this.selectedTabId) ? false : true);
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenMenu2)));
            if (this.currentTab != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.currentTab.title);
                Tab tab = this.currentTab;
                int i = tab != null ? tab.counter : 0;
                if (i > 0) {
                    sb.append("\n");
                    sb.append(LocaleController.formatPluralString("AccDescrUnreadCount", i, new Object[0]));
                }
                accessibilityNodeInfo.setContentDescription(sb);
            }
        }

        public void clearTransitionParams() {
            this.animateChange = false;
            this.animateTabCounter = false;
            this.animateCounterChange = false;
            this.animateTextChange = false;
            this.animateTextX = false;
            this.animateTabWidth = false;
            this.changeAnimator = null;
            invalidate();
        }

        public void shakeLockIcon(final float f, final int i) {
            if (i == 6) {
                this.locIconXOffset = 0.0f;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(f));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.FilterTabsView$TabView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    FilterTabsView.TabView.$r8$lambda$suCevi6rjtUBgoVO488L81illBU(FilterTabsView.TabView.this, valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
            animatorSet.setDuration(50L);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FilterTabsView.TabView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TabView tabView = TabView.this;
                    int i2 = i;
                    tabView.shakeLockIcon(i2 == 5 ? 0.0f : -f, i2 + 1);
                    TabView.this.locIconXOffset = 0.0f;
                    TabView.this.invalidate();
                }
            });
            animatorSet.start();
        }

        public static /* synthetic */ void $r8$lambda$suCevi6rjtUBgoVO488L81illBU(TabView tabView, ValueAnimator valueAnimator) {
            tabView.getClass();
            tabView.locIconXOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            tabView.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterTabsView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.textCounterPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.deletePaint = textPaint3;
        this.counterPaint = new Paint(1);
        this.emojiColorFilter = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.tabs = new ArrayList();
        this.selectedTabId = -1;
        this.manualScrollingToPosition = -1;
        this.manualScrollingToId = -1;
        this.scrollingToChild = -1;
        this.tabLineColorKey = Theme.key_actionBarTabLine;
        this.activeTextColorKey = Theme.key_actionBarTabActiveText;
        this.unactiveTextColorKey = Theme.key_actionBarTabUnactiveText;
        this.selectorColorKey = Theme.key_actionBarTabSelector;
        this.backgroundColorKey = Theme.key_actionBarDefault;
        this.aTabLineColorKey = -1;
        this.aActiveTextColorKey = -1;
        this.aUnactiveTextColorKey = -1;
        this.aBackgroundColorKey = -1;
        this.interpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.positionToId = new SparseIntArray(5);
        this.positionToStableId = new SparseIntArray(5);
        this.idToPosition = new SparseIntArray(5);
        this.positionToWidth = new SparseIntArray(5);
        this.positionToCount = new SparseIntArray(5);
        this.positionToX = new SparseIntArray(5);
        this.animationRunnable = new Runnable() { // from class: org.telegram.ui.Components.FilterTabsView.1
            @Override // java.lang.Runnable
            public void run() {
                if (FilterTabsView.this.animatingIndicator) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - FilterTabsView.this.lastAnimationTime;
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    FilterTabsView.access$2716(FilterTabsView.this, elapsedRealtime / 320.0f);
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.setAnimationIdicatorProgress(filterTabsView.interpolator.getInterpolation(FilterTabsView.this.animationTime));
                    if (FilterTabsView.this.animationTime > 1.0f) {
                        FilterTabsView.this.animationTime = 1.0f;
                    }
                    if (FilterTabsView.this.animationTime < 1.0f) {
                        AndroidUtilities.runOnUIThread(FilterTabsView.this.animationRunnable);
                        return;
                    }
                    FilterTabsView.this.animatingIndicator = false;
                    FilterTabsView.this.setEnabled(true);
                    if (FilterTabsView.this.delegate != null) {
                        FilterTabsView.this.delegate.onPageScrolled(1.0f);
                    }
                }
            }
        };
        this.COLORS = new AnimationProperties.FloatProperty("animationValue") { // from class: org.telegram.ui.Components.FilterTabsView.2
            @Override // org.telegram.ui.Components.AnimationProperties.FloatProperty
            public void setValue(FilterTabsView filterTabsView, float f) {
                FilterTabsView.this.animationValue = f;
                FilterTabsView.this.selectorDrawable.setColor(ColorUtils.blendARGB(Theme.getColor(FilterTabsView.this.tabLineColorKey, FilterTabsView.this.resourcesProvider), Theme.getColor(FilterTabsView.this.aTabLineColorKey, FilterTabsView.this.resourcesProvider), f));
                FilterTabsView.this.listView.invalidateViews();
                FilterTabsView.this.listView.invalidate();
                filterTabsView.invalidate();
            }

            @Override // android.util.Property
            public Float get(FilterTabsView filterTabsView) {
                return Float.valueOf(FilterTabsView.this.animationValue);
            }
        };
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        textPaint2.setTextSize(AndroidUtilities.dpf2(11.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.selectorDrawable = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        gradientDrawable.setColor(Theme.getColor(this.tabLineColorKey, resourcesProvider));
        setHorizontalScrollBarEnabled(false);
        RecyclerListView recyclerListView = new RecyclerListView(context) { // from class: org.telegram.ui.Components.FilterTabsView.3
            @Override // android.view.View
            public void setAlpha(float f) {
                super.setAlpha(f);
                FilterTabsView.this.invalidate();
            }

            @Override // org.telegram.ui.Components.RecyclerListView
            protected boolean allowSelectChildAtPosition(View view) {
                return FilterTabsView.this.isEnabled() && FilterTabsView.this.delegate.canPerformActions();
            }

            @Override // org.telegram.ui.Components.RecyclerListView, android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
            }

            @Override // org.telegram.ui.Components.RecyclerListView
            protected boolean canHighlightChildAt(View view, float f, float f2) {
                if (FilterTabsView.this.isEditing) {
                    TabView tabView = (TabView) view;
                    float dp = AndroidUtilities.dp(6.0f);
                    if (tabView.rect.left - dp < f && tabView.rect.right + dp > f) {
                        return false;
                    }
                }
                return super.canHighlightChildAt(view, f, f2);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipChildren(false);
        4 r2 = new 4();
        this.itemAnimator = r2;
        r2.setDelayAnimations(false);
        recyclerListView.setItemAnimator(this.itemAnimator);
        recyclerListView.setSelectorType(9);
        recyclerListView.setSelectorRadius(6);
        recyclerListView.setSelectorDrawableColor(Theme.getColor(this.selectorColorKey, resourcesProvider));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, 0 == true ? 1 : 0) { // from class: org.telegram.ui.Components.FilterTabsView.5
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: org.telegram.ui.Components.FilterTabsView.5.1
                    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                    protected void onTargetFound(View view, RecyclerView.State state2, RecyclerView.SmoothScroller.Action action) {
                        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                        if (calculateDxToMakeVisible > 0 || (calculateDxToMakeVisible == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
                            calculateDxToMakeVisible += AndroidUtilities.dp(60.0f);
                        } else if (calculateDxToMakeVisible < 0 || (calculateDxToMakeVisible == 0 && view.getRight() + AndroidUtilities.dp(21.0f) > FilterTabsView.this.getMeasuredWidth())) {
                            calculateDxToMakeVisible -= AndroidUtilities.dp(60.0f);
                        }
                        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                        int max = Math.max(NotificationCenter.needDeleteDialog, calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible))));
                        if (max > 0) {
                            action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, max, this.mDecelerateInterpolator);
                        }
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                if (FilterTabsView.this.delegate.isTabMenuVisible()) {
                    i = 0;
                }
                return super.scrollHorizontallyBy(i, recycler, state);
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(recyclerListView);
        int max = Math.max(0, AndroidUtilities.dp(11.5f));
        this.listViewPaddingH = max;
        recyclerListView.setPadding(max, 0, max, 0);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setDrawSelectorBehind(true);
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        listAdapter.setHasStableIds(true);
        recyclerListView.setAdapter(listAdapter);
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() { // from class: org.telegram.ui.Components.FilterTabsView$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.-CC.$default$hasDoubleTap(this, view, i);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public /* synthetic */ void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.-CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListenerExtended
            public final void onItemClick(View view, int i, float f, float f2) {
                FilterTabsView.$r8$lambda$CrR86Mrl6vGaCQQYdbpGW3ntky4(FilterTabsView.this, view, i, f, f2);
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.Components.FilterTabsView$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view, int i) {
                return FilterTabsView.$r8$lambda$VrBv4ZNGWfMYQdfP7pQBsh8YIkk(FilterTabsView.this, view, i);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Components.FilterTabsView.6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                FilterTabsView.this.listView.invalidate();
                FilterTabsView.this.invalidate();
            }
        });
        recyclerListView.setAdaptiveOverScroll();
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
    }

    class 4 extends DefaultItemAnimator {
        4() {
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void runPendingAnimations() {
            boolean isEmpty = this.mPendingRemovals.isEmpty();
            boolean isEmpty2 = this.mPendingMoves.isEmpty();
            boolean isEmpty3 = this.mPendingChanges.isEmpty();
            boolean isEmpty4 = this.mPendingAdditions.isEmpty();
            if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.FilterTabsView$4$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        FilterTabsView.4.$r8$lambda$hdoggU4rMPOjHMdROyrmpFPK3SA(FilterTabsView.4.this, valueAnimator);
                    }
                });
                ofFloat.setDuration(getMoveDuration());
                ofFloat.start();
            }
            super.runPendingAnimations();
        }

        public static /* synthetic */ void $r8$lambda$hdoggU4rMPOjHMdROyrmpFPK3SA(4 r0, ValueAnimator valueAnimator) {
            FilterTabsView.this.listView.invalidate();
            FilterTabsView.this.invalidate();
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
        public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                int translationX = i + ((int) view.getTranslationX());
                int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
                resetAnimation(viewHolder);
                int i5 = i3 - translationX;
                int i6 = i4 - translationY;
                if (i5 != 0) {
                    view.setTranslationX(-i5);
                }
                if (i6 != 0) {
                    view.setTranslationY(-i6);
                }
                TabView tabView = (TabView) viewHolder.itemView;
                boolean animateChange = tabView.animateChange();
                if (animateChange) {
                    tabView.changeProgress = 0.0f;
                    tabView.animateChange = true;
                    FilterTabsView.this.listView.invalidate();
                    FilterTabsView.this.invalidate();
                }
                if (i5 == 0 && i6 == 0 && !animateChange) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i3, i4));
                return true;
            }
            return super.animateMove(viewHolder, itemHolderInfo, i, i2, i3, i4);
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator
        protected void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
            super.animateMoveImpl(viewHolder, moveInfo);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                final TabView tabView = (TabView) view;
                if (tabView.animateChange) {
                    ValueAnimator valueAnimator = tabView.changeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tabView.changeAnimator.removeAllUpdateListeners();
                        tabView.changeAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.FilterTabsView$4$$ExternalSyntheticLambda1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            FilterTabsView.4.$r8$lambda$DghHiTLqtaEB-diK1Uy8XexT6xo(FilterTabsView.TabView.this, valueAnimator2);
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FilterTabsView.4.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            tabView.clearTransitionParams();
                        }
                    });
                    tabView.changeAnimator = ofFloat;
                    ofFloat.setDuration(getMoveDuration());
                    ofFloat.start();
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$DghHiTLqtaEB-diK1Uy8XexT6xo(TabView tabView, ValueAnimator valueAnimator) {
            tabView.changeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            tabView.invalidate();
        }

        @Override // androidx.recyclerview.widget.SimpleItemAnimator
        public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
            super.onMoveFinished(viewHolder);
            viewHolder.itemView.setTranslationX(0.0f);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                ((TabView) view).clearTransitionParams();
            }
        }

        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void endAnimation(RecyclerView.ViewHolder viewHolder) {
            super.endAnimation(viewHolder);
            viewHolder.itemView.setTranslationX(0.0f);
            View view = viewHolder.itemView;
            if (view instanceof TabView) {
                ((TabView) view).clearTransitionParams();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$CrR86Mrl6vGaCQQYdbpGW3ntky4(FilterTabsView filterTabsView, View view, int i, float f, float f2) {
        FilterTabsViewDelegate filterTabsViewDelegate;
        if (filterTabsView.delegate.canPerformActions()) {
            TabView tabView = (TabView) view;
            if (!filterTabsView.isEditing) {
                if (i != filterTabsView.currentPosition || (filterTabsViewDelegate = filterTabsView.delegate) == null) {
                    filterTabsView.scrollToTab(tabView.currentTab, i);
                    return;
                } else {
                    filterTabsViewDelegate.onSamePageSelected();
                    return;
                }
            }
            if (i != 0) {
                float dp = AndroidUtilities.dp(6.0f);
                if (tabView.rect.left - dp >= f || tabView.rect.right + dp <= f) {
                    return;
                }
                filterTabsView.delegate.onDeletePressed(tabView.currentTab.id);
            }
        }
    }

    public static /* synthetic */ boolean $r8$lambda$VrBv4ZNGWfMYQdfP7pQBsh8YIkk(FilterTabsView filterTabsView, View view, int i) {
        if (filterTabsView.delegate.canPerformActions() && !filterTabsView.isEditing) {
            if (filterTabsView.delegate.didSelectTab((TabView) view, i == filterTabsView.currentPosition)) {
                filterTabsView.listView.hideSelector(true);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(FilterTabsViewDelegate filterTabsViewDelegate) {
        this.delegate = filterTabsViewDelegate;
    }

    public boolean isAnimatingIndicator() {
        return this.animatingIndicator;
    }

    public void stopAnimatingIndicator() {
        this.animatingIndicator = false;
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        setBackground(blurredBackgroundDrawable);
    }

    public void scrollToTab(Tab tab, int i) {
        if (tab.isLocked) {
            FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
            if (filterTabsViewDelegate != null) {
                filterTabsViewDelegate.onPageSelected(tab, false);
                return;
            }
            return;
        }
        int i2 = this.currentPosition;
        boolean z = i2 < i;
        this.scrollingToChild = -1;
        this.previousPosition = i2;
        this.previousId = this.selectedTabId;
        this.currentPosition = i;
        this.selectedTabId = tab.id;
        if (this.animatingIndicator) {
            AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
            this.animatingIndicator = false;
        }
        this.animationTime = 0.0f;
        this.animatingIndicatorProgress = 0.0f;
        this.animatingIndicator = true;
        setEnabled(false);
        AndroidUtilities.runOnUIThread(this.animationRunnable, 16L);
        FilterTabsViewDelegate filterTabsViewDelegate2 = this.delegate;
        if (filterTabsViewDelegate2 != null) {
            filterTabsViewDelegate2.onPageSelected(tab, z);
        }
        scrollToChild(i);
    }

    public void selectFirstTab() {
        if (this.tabs.isEmpty()) {
            return;
        }
        scrollToTab((Tab) this.tabs.get(0), 0);
    }

    public boolean isFirstTab() {
        return this.currentPosition <= 0;
    }

    public void selectLastTab() {
        if (this.tabs.isEmpty()) {
            return;
        }
        scrollToTab((Tab) this.tabs.get(r0.size() - 1), this.tabs.size() - 1);
    }

    public void setAnimationIdicatorProgress(float f) {
        this.animatingIndicatorProgress = f;
        this.listView.invalidateViews();
        this.listView.invalidate();
        invalidate();
        FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
        if (filterTabsViewDelegate != null) {
            filterTabsViewDelegate.onPageScrolled(f);
        }
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public RecyclerListView getTabsContainer() {
        return this.listView;
    }

    public int getNextPageId(boolean z) {
        return this.positionToId.get(this.currentPosition + (z ? 1 : -1), -1);
    }

    public void removeTabs() {
        this.tabs.clear();
        this.positionToId.clear();
        this.idToPosition.clear();
        this.positionToWidth.clear();
        this.positionToCount.clear();
        this.positionToX.clear();
        this.allTabsWidth = 0;
    }

    public void resetTabId() {
        this.selectedTabId = -1;
    }

    public CharSequence text(String str, ArrayList arrayList) {
        return MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(str), this.textPaint.getFontMetricsInt(), false), arrayList, this.textPaint.getFontMetricsInt());
    }

    public void addTab(int i, int i2, String str, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        int size = this.tabs.size();
        if (size == 0 && this.selectedTabId == -1) {
            this.selectedTabId = i;
        }
        this.positionToId.put(size, i);
        this.positionToStableId.put(size, i2);
        this.idToPosition.put(i, size);
        int i3 = this.selectedTabId;
        if (i3 != -1 && i3 == i) {
            this.currentPosition = size;
        }
        Tab tab = new Tab(i, text(str, arrayList), z);
        tab.isDefault = z2;
        tab.isLocked = z3;
        this.allTabsWidth += tab.getWidth(true) + AndroidUtilities.dp(24.0f);
        this.tabs.add(tab);
    }

    public int getTabsCount() {
        return this.tabs.size();
    }

    public Tab getTab(int i) {
        if (i < 0 || i >= getTabsCount()) {
            return null;
        }
        return (Tab) this.tabs.get(i);
    }

    public void finishAddingTabs(boolean z) {
        this.listView.setItemAnimator(z ? this.itemAnimator : null);
        this.adapter.notifyDataSetChanged();
    }

    public void animateColorsTo(int i, int i2, int i3, int i4, int i5) {
        AnimatorSet animatorSet = this.colorChangeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.aTabLineColorKey = i;
        this.aActiveTextColorKey = i2;
        this.aUnactiveTextColorKey = i3;
        this.aBackgroundColorKey = i5;
        this.selectorColorKey = i4;
        this.listView.setSelectorDrawableColor(Theme.getColor(i4, this.resourcesProvider));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.colorChangeAnimator = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<FilterTabsView, Float>) this.COLORS, 0.0f, 1.0f));
        this.colorChangeAnimator.setDuration(320L);
        this.colorChangeAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.FilterTabsView.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                FilterTabsView filterTabsView = FilterTabsView.this;
                filterTabsView.tabLineColorKey = filterTabsView.aTabLineColorKey;
                FilterTabsView filterTabsView2 = FilterTabsView.this;
                filterTabsView2.backgroundColorKey = filterTabsView2.aBackgroundColorKey;
                FilterTabsView filterTabsView3 = FilterTabsView.this;
                filterTabsView3.activeTextColorKey = filterTabsView3.aActiveTextColorKey;
                FilterTabsView filterTabsView4 = FilterTabsView.this;
                filterTabsView4.unactiveTextColorKey = filterTabsView4.aUnactiveTextColorKey;
                FilterTabsView.this.aTabLineColorKey = -1;
                FilterTabsView.this.aActiveTextColorKey = -1;
                FilterTabsView.this.aUnactiveTextColorKey = -1;
                FilterTabsView.this.aBackgroundColorKey = -1;
            }
        });
        this.colorChangeAnimator.start();
    }

    public int getCurrentTabId() {
        return this.selectedTabId;
    }

    public int getFirstTabId() {
        return this.positionToId.get(0, 0);
    }

    public int getLastTabId() {
        return this.positionToId.get(getTabsCount() - 1, 0);
    }

    public int getSelectorColorKey() {
        return this.selectorColorKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTabsWidths() {
        this.positionToX.clear();
        this.positionToWidth.clear();
        this.positionToCount.clear();
        int i = this.listViewPaddingH;
        int size = this.tabs.size();
        for (int i2 = 0; i2 < size; i2++) {
            int width = ((Tab) this.tabs.get(i2)).getWidth(false);
            this.positionToWidth.put(i2, width);
            this.positionToCount.put(i2, ((Tab) this.tabs.get(i2)).counter);
            this.positionToX.put(i2, (this.additionalTabWidth / 2) + i);
            i += width + AndroidUtilities.dp(24.0f) + this.additionalTabWidth;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.listView) {
            drawSelector(canvas);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.lastEditingAnimationTime);
        this.lastEditingAnimationTime = elapsedRealtime;
        boolean z = this.isEditing;
        boolean z2 = true;
        if (z || this.editingAnimationProgress != 0.0f) {
            if (this.editingForwardAnimation) {
                float f = this.editingAnimationProgress;
                boolean z3 = f <= 0.0f;
                float f2 = f + (min / 420.0f);
                this.editingAnimationProgress = f2;
                if (!z && z3 && f2 >= 0.0f) {
                    this.editingAnimationProgress = 0.0f;
                }
                if (this.editingAnimationProgress >= 1.0f) {
                    this.editingAnimationProgress = 1.0f;
                    this.editingForwardAnimation = false;
                }
            } else {
                float f3 = this.editingAnimationProgress;
                r10 = f3 >= 0.0f;
                float f4 = f3 - (min / 420.0f);
                this.editingAnimationProgress = f4;
                if (!z && r10 && f4 <= 0.0f) {
                    this.editingAnimationProgress = 0.0f;
                }
                if (this.editingAnimationProgress <= -1.0f) {
                    this.editingAnimationProgress = -1.0f;
                    this.editingForwardAnimation = true;
                }
            }
            r10 = true;
        }
        if (z) {
            float f5 = this.editingStartAnimationProgress;
            if (f5 < 1.0f) {
                float f6 = f5 + (min / 180.0f);
                this.editingStartAnimationProgress = f6;
                if (f6 > 1.0f) {
                    this.editingStartAnimationProgress = 1.0f;
                }
            }
            z2 = r10;
        } else {
            if (!z) {
                float f7 = this.editingStartAnimationProgress;
                if (f7 > 0.0f) {
                    float f8 = f7 - (min / 180.0f);
                    this.editingStartAnimationProgress = f8;
                    if (f8 < 0.0f) {
                        this.editingStartAnimationProgress = 0.0f;
                    }
                }
            }
            z2 = r10;
        }
        if (z2) {
            this.listView.invalidateViews();
            this.listView.invalidate();
            invalidate();
        }
        return drawChild;
    }

    private void drawSelector(Canvas canvas) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i;
        int i2;
        float lerp;
        float lerp2;
        float f;
        float measuredWidth;
        int measuredHeight = getMeasuredHeight();
        this.selectorDrawable.setAlpha((int) (this.listView.getAlpha() * 255.0f));
        if (this.animatingIndicator || this.manualScrollingToPosition != -1) {
            int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition != -1 && (findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null) {
                if (this.animatingIndicator) {
                    i = this.previousPosition;
                    i2 = this.currentPosition;
                } else {
                    i = this.currentPosition;
                    i2 = this.manualScrollingToPosition;
                }
                int i3 = this.positionToX.get(i);
                int i4 = this.positionToX.get(i2);
                int i5 = this.positionToWidth.get(i);
                int i6 = this.positionToWidth.get(i2);
                float f2 = this.positionToCount.get(i) != 0 ? 1.0f : 0.0f;
                float f3 = this.positionToCount.get(i2) != 0 ? 1.0f : 0.0f;
                if (this.additionalTabWidth != 0) {
                    lerp = AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) + AndroidUtilities.dp(12.0f);
                } else {
                    lerp = (AndroidUtilities.lerp(i3, i4, this.animatingIndicatorProgress) - (this.positionToX.get(findFirstVisibleItemPosition) - findViewHolderForAdapterPosition.itemView.getLeft())) + AndroidUtilities.dp(12.0f);
                }
                lerp2 = AndroidUtilities.lerp(i5, i6, this.animatingIndicatorProgress);
                AndroidUtilities.lerp(f2, f3, this.animatingIndicatorProgress);
                f = lerp;
            }
            lerp2 = 0.0f;
            f = 0.0f;
        } else {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.currentPosition);
            if (findViewHolderForAdapterPosition2 != null) {
                TabView tabView = (TabView) findViewHolderForAdapterPosition2.itemView;
                lerp2 = Math.max(AndroidUtilities.dp(16.0f), tabView.animateTabWidth ? AndroidUtilities.lerp(tabView.animateFromTabWidth, tabView.tabWidth, tabView.changeProgress) : tabView.tabWidth);
                if (tabView.animateTabWidth) {
                    measuredWidth = AndroidUtilities.lerp(tabView.animateFromTabWidth + AndroidUtilities.dp(20.0f), tabView.getMeasuredWidth(), tabView.changeProgress);
                } else {
                    measuredWidth = tabView.getMeasuredWidth();
                }
                f = (int) (tabView.getX() + ((measuredWidth - lerp2) / 2.0f));
                float unused = tabView.tabCounterVisible;
            }
            lerp2 = 0.0f;
            f = 0.0f;
        }
        if (lerp2 != 0.0f) {
            canvas.save();
            canvas.translate(this.listView.getTranslationX(), 0.0f);
            canvas.scale(this.listView.getScaleX(), 1.0f, this.listView.getPivotX() + this.listView.getX(), this.listView.getPivotY());
            float f4 = this.additionalTabWidth / 2.0f;
            int dp = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
            this.selectorDrawable.setBounds((int) ((f - AndroidUtilities.dp(12.5f)) - f4), dp, (int) (f + lerp2 + AndroidUtilities.dp(12.5f) + f4), AndroidUtilities.dp(28.0f) + dp);
            this.selectorDrawable.setAlpha(31);
            this.selectorDrawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.clipPath.rewind();
        this.clipPath.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i - AndroidUtilities.dp(9.0f), i2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.clipPath);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void updateColors() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.tabs.isEmpty()) {
            int size = View.MeasureSpec.getSize(i) - (this.listViewPaddingH * 2);
            Tab findDefaultTab = findDefaultTab();
            if (findDefaultTab != null) {
                int i3 = R.string.FilterAllChats;
                findDefaultTab.setTitle(LocaleController.getString(i3), null, false);
                int width = findDefaultTab.getWidth(false);
                if (this.allTabsWidth > size) {
                    i3 = R.string.FilterAllChatsShort;
                }
                findDefaultTab.setTitle(LocaleController.getString(i3), null, false);
                int width2 = (this.allTabsWidth - width) + findDefaultTab.getWidth(false);
                int i4 = this.additionalTabWidth;
                int size2 = width2 < size ? (size - width2) / this.tabs.size() : 0;
                this.additionalTabWidth = size2;
                if (i4 != size2) {
                    this.ignoreLayout = true;
                    RecyclerView.ItemAnimator itemAnimator = this.listView.getItemAnimator();
                    this.listView.setItemAnimator(null);
                    this.adapter.notifyDataSetChanged();
                    this.listView.setItemAnimator(itemAnimator);
                    this.ignoreLayout = false;
                }
                updateTabsWidths();
                this.invalidated = false;
            }
        }
        super.onMeasure(i, i2);
    }

    private Tab findDefaultTab() {
        for (int i = 0; i < this.tabs.size(); i++) {
            if (((Tab) this.tabs.get(i)).isDefault) {
                return (Tab) this.tabs.get(i);
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    private void scrollToChild(int i) {
        if (this.tabs.isEmpty() || this.scrollingToChild == i || i < 0 || i >= this.tabs.size()) {
            return;
        }
        this.scrollingToChild = i;
        this.listView.smoothScrollToPosition(i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.prevLayoutWidth != i5) {
            this.prevLayoutWidth = i5;
            this.scrollingToChild = -1;
            if (this.animatingIndicator) {
                AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                this.animatingIndicator = false;
                setEnabled(true);
                FilterTabsViewDelegate filterTabsViewDelegate = this.delegate;
                if (filterTabsViewDelegate != null) {
                    filterTabsViewDelegate.onPageScrolled(1.0f);
                }
            }
        }
    }

    public void selectTabWithId(int i, float f) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 < 0) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f > 0.0f) {
            this.manualScrollingToPosition = i2;
            this.manualScrollingToId = i;
        } else {
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
        }
        this.animatingIndicatorProgress = f;
        this.listView.invalidateViews();
        this.listView.invalidate();
        invalidate();
        scrollToChild(i2);
        if (f >= 1.0f) {
            this.manualScrollingToPosition = -1;
            this.manualScrollingToId = -1;
            this.currentPosition = i2;
            this.selectedTabId = i;
        }
    }

    public boolean isEditing() {
        return this.isEditing;
    }

    public void setIsEditing(boolean z) {
        this.isEditing = z;
        this.editingForwardAnimation = true;
        this.listView.invalidateViews();
        this.listView.invalidate();
        this.adapter.notifyDataSetChanged();
        invalidate();
        if (this.isEditing || !this.orderChanged) {
            return;
        }
        MessagesStorage.getInstance(UserConfig.selectedAccount).saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
        int size = dialogFilters.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            if (dialogFilter.isDefault()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilter.id));
            }
        }
        MessagesController.getInstance(UserConfig.selectedAccount).lockFiltersInternal();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_updateDialogFiltersOrder, new RequestDelegate() { // from class: org.telegram.ui.Components.FilterTabsView$$ExternalSyntheticLambda2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FilterTabsView.$r8$lambda$LUlLhaIciS00vlgmp_dSDwB023s(tLObject, tL_error);
            }
        });
        this.orderChanged = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkTabsCounter() {
        int size = this.tabs.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Tab tab = (Tab) this.tabs.get(i);
            if (tab.counter != this.delegate.getTabCounter(tab.id) && this.delegate.getTabCounter(tab.id) >= 0) {
                if (this.positionToWidth.get(i) != tab.getWidth(true) || this.invalidated) {
                    this.invalidated = true;
                    requestLayout();
                    this.allTabsWidth = 0;
                    findDefaultTab().setTitle(LocaleController.getString(R.string.FilterAllChats), null, false);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.allTabsWidth += ((Tab) this.tabs.get(i2)).getWidth(true) + AndroidUtilities.dp(24.0f);
                    }
                    z = true;
                    if (z) {
                        return;
                    }
                    this.listView.setItemAnimator(this.itemAnimator);
                    this.adapter.notifyDataSetChanged();
                    return;
                }
                z = true;
            }
        }
        if (z) {
        }
    }

    public void notifyTabCounterChanged(int i) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 < 0 || i2 >= this.tabs.size()) {
            return;
        }
        Tab tab = (Tab) this.tabs.get(i2);
        if (tab.counter == this.delegate.getTabCounter(tab.id) || this.delegate.getTabCounter(tab.id) < 0) {
            return;
        }
        this.listView.invalidateViews();
        if (this.positionToWidth.get(i2) != tab.getWidth(true) || this.invalidated) {
            this.invalidated = true;
            requestLayout();
            this.listView.setItemAnimator(this.itemAnimator);
            this.adapter.notifyDataSetChanged();
            this.allTabsWidth = 0;
            findDefaultTab().setTitle(LocaleController.getString(R.string.FilterAllChats), null, false);
            int size = this.tabs.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.allTabsWidth += ((Tab) this.tabs.get(i3)).getWidth(true) + AndroidUtilities.dp(24.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context mContext;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FilterTabsView.this.tabs.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return FilterTabsView.this.positionToStableId.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(FilterTabsView.this.new TabView(this.mContext));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TabView tabView = (TabView) viewHolder.itemView;
            int id = tabView.currentTab != null ? tabView.getId() : -1;
            tabView.setTab((Tab) FilterTabsView.this.tabs.get(i), i);
            if (id != tabView.getId()) {
                tabView.progressToLocked = tabView.currentTab.isLocked ? 1.0f : 0.0f;
            }
        }

        public void swapElements(int i, int i2) {
            int size = FilterTabsView.this.tabs.size();
            if (i < 0 || i2 < 0 || i >= size || i2 >= size) {
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i2);
            int i3 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i3;
            dialogFilters.set(i, dialogFilter2);
            dialogFilters.set(i2, dialogFilter);
            Tab tab = (Tab) FilterTabsView.this.tabs.get(i);
            Tab tab2 = (Tab) FilterTabsView.this.tabs.get(i2);
            int i4 = tab.id;
            tab.id = tab2.id;
            tab2.id = i4;
            int i5 = FilterTabsView.this.positionToStableId.get(i);
            FilterTabsView.this.positionToStableId.put(i, FilterTabsView.this.positionToStableId.get(i2));
            FilterTabsView.this.positionToStableId.put(i2, i5);
            FilterTabsView.this.delegate.onPageReorder(tab2.id, tab.id);
            if (FilterTabsView.this.currentPosition == i) {
                FilterTabsView.this.currentPosition = i2;
                FilterTabsView.this.selectedTabId = tab.id;
            } else if (FilterTabsView.this.currentPosition == i2) {
                FilterTabsView.this.currentPosition = i;
                FilterTabsView.this.selectedTabId = tab2.id;
            }
            if (FilterTabsView.this.previousPosition == i) {
                FilterTabsView.this.previousPosition = i2;
                FilterTabsView.this.previousId = tab.id;
            } else if (FilterTabsView.this.previousPosition == i2) {
                FilterTabsView.this.previousPosition = i;
                FilterTabsView.this.previousId = tab2.id;
            }
            FilterTabsView.this.tabs.set(i, tab2);
            FilterTabsView.this.tabs.set(i2, tab);
            FilterTabsView.this.updateTabsWidths();
            FilterTabsView.this.orderChanged = true;
            FilterTabsView.this.listView.setItemAnimator(FilterTabsView.this.itemAnimator);
            notifyItemMoved(i, i2);
        }

        public void moveElementToStart(int i) {
            int size = FilterTabsView.this.tabs.size();
            if (i < 0 || i >= size) {
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            int i2 = FilterTabsView.this.positionToStableId.get(i);
            int i3 = ((Tab) FilterTabsView.this.tabs.get(i)).id;
            for (int i4 = i - 1; i4 >= 0; i4--) {
                FilterTabsView.this.positionToStableId.put(i4 + 1, FilterTabsView.this.positionToStableId.get(i4));
            }
            MessagesController.DialogFilter remove = dialogFilters.remove(i);
            remove.order = 0;
            dialogFilters.add(0, remove);
            FilterTabsView.this.positionToStableId.put(0, i2);
            FilterTabsView.this.tabs.add(0, (Tab) FilterTabsView.this.tabs.remove(i));
            ((Tab) FilterTabsView.this.tabs.get(0)).id = i3;
            for (int i5 = 0; i5 <= i; i5++) {
                ((Tab) FilterTabsView.this.tabs.get(i5)).id = i5;
                dialogFilters.get(i5).order = i5;
            }
            int i6 = 0;
            while (i6 <= i) {
                if (FilterTabsView.this.currentPosition == i6) {
                    FilterTabsView filterTabsView = FilterTabsView.this;
                    filterTabsView.currentPosition = filterTabsView.selectedTabId = i6 == i ? 0 : i6 + 1;
                }
                if (FilterTabsView.this.previousPosition == i6) {
                    FilterTabsView filterTabsView2 = FilterTabsView.this;
                    filterTabsView2.previousPosition = filterTabsView2.previousId = i6 == i ? 0 : i6 + 1;
                }
                i6++;
            }
            notifyItemMoved(i, 0);
            FilterTabsView.this.delegate.onPageReorder(((Tab) FilterTabsView.this.tabs.get(i)).id, i3);
            FilterTabsView.this.updateTabsWidths();
            FilterTabsView.this.orderChanged = true;
            FilterTabsView.this.listView.setItemAnimator(FilterTabsView.this.itemAnimator);
        }
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        private final Runnable resetDefaultPosition = new Runnable() { // from class: org.telegram.ui.Components.FilterTabsView$TouchHelperCallback$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FilterTabsView.TouchHelperCallback.$r8$lambda$TDp6ng2wuU1qVJLtiMfnQto77L8(FilterTabsView.TouchHelperCallback.this);
            }
        };

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }

        public TouchHelperCallback() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return FilterTabsView.this.isEditing;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && (!FilterTabsView.this.isEditing || (viewHolder.getAdapterPosition() == 0 && ((Tab) FilterTabsView.this.tabs.get(0)).isDefault && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium()))) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((viewHolder.getAdapterPosition() == 0 || viewHolder2.getAdapterPosition() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return false;
            }
            FilterTabsView.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        public static /* synthetic */ void $r8$lambda$TDp6ng2wuU1qVJLtiMfnQto77L8(TouchHelperCallback touchHelperCallback) {
            touchHelperCallback.getClass();
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                return;
            }
            for (int i = 0; i < FilterTabsView.this.tabs.size(); i++) {
                if (((Tab) FilterTabsView.this.tabs.get(i)).isDefault && i != 0) {
                    FilterTabsView.this.adapter.moveElementToStart(i);
                    FilterTabsView.this.listView.scrollToPosition(0);
                    FilterTabsView.this.onDefaultTabMoved();
                    return;
                }
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                FilterTabsView.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                viewHolder.itemView.setBackgroundColor(Theme.getColor(FilterTabsView.this.backgroundColorKey, FilterTabsView.this.resourcesProvider));
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.resetDefaultPosition);
                AndroidUtilities.runOnUIThread(this.resetDefaultPosition, 320L);
            }
            super.onSelectedChanged(viewHolder, i);
            if (viewHolder != null) {
                viewHolder.itemView.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
            viewHolder.itemView.setBackground(null);
            viewHolder.itemView.setTag(R.id.dragging, null);
        }
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    public boolean currentTabIsDefault() {
        Tab findDefaultTab = findDefaultTab();
        return findDefaultTab != null && findDefaultTab.id == this.selectedTabId;
    }

    public int getDefaultTabId() {
        Tab findDefaultTab = findDefaultTab();
        if (findDefaultTab == null) {
            return -1;
        }
        return findDefaultTab.id;
    }

    public boolean isEmpty() {
        return this.tabs.isEmpty();
    }

    public boolean isFirstTabSelected() {
        return this.tabs.isEmpty() || this.selectedTabId == ((Tab) this.tabs.get(0)).id;
    }

    public boolean isLocked(int i) {
        for (int i2 = 0; i2 < this.tabs.size(); i2++) {
            if (((Tab) this.tabs.get(i2)).id == i) {
                return ((Tab) this.tabs.get(i2)).isLocked;
            }
        }
        return false;
    }

    public void shakeLock(int i) {
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            if (this.listView.getChildAt(i2) instanceof TabView) {
                TabView tabView = (TabView) this.listView.getChildAt(i2);
                if (tabView.currentTab.id == i) {
                    tabView.shakeLockIcon(1.0f, 0);
                    try {
                        tabView.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }
}
