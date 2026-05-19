package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.HashSet;
import java.util.Set;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedLinearLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.glass.GlassTabView;

/* loaded from: classes4.dex */
public class MainTabsLayout extends AnimatedLinearLayout {
    private float animatedLongSelectedViewCenterX;
    private float animatedLongSelectedViewOffsetX;
    private final BoolAnimator animatorIsScaled;
    private int biggestTabTextWidth;
    private final ClickHelper clickHelper;
    private boolean drawCustomSelector;
    private boolean isInLongPress;
    private View lastLongSelectedView;
    private float lastLongSelectedViewCenterX;
    private float lastLongSelectedViewWidth;
    private int maxWidthPx;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Runnable restoreDrawSelector;
    final SpringAnimation scaleX;
    final SpringAnimation scaleY;
    final SpringAnimation selectedTabPositionOffsetX;
    final SpringAnimation selectedTabPositionX;
    final Paint selectorPaint;
    private int[] tabsLeftPos;
    private float[] tabsTextWidth;
    private float[] tabsTextWidthWithMargin;
    private int[] tabsWeight;
    private int[] tabsWidth;
    private final Set tabsWithIgnoreClick;
    private int visibleChildCount;
    private static final float[] PASS_TEXT_SIZES_DP = {12.0f, 12.0f, 10.0f};
    private static final int[] PASS_PADDINGS_DP = {16, 8, 4};

    public interface Tab {
        float measureTextWidth(float f);

        void setTextSizeDp(float f);
    }

    public MainTabsLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.restoreDrawSelector = new Runnable() { // from class: org.telegram.ui.MainTabsLayout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainTabsLayout.this.lambda$new$0();
            }
        };
        this.selectorPaint = new Paint(1);
        SpringAnimation springAnimation = new SpringAnimation(this, DynamicAnimation.SCALE_X, 1.0f);
        this.scaleX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, DynamicAnimation.SCALE_Y, 1.0f);
        this.scaleY = springAnimation2;
        SpringAnimation springAnimation3 = new SpringAnimation(this, new FloatPropertyCompat("selectedTabPositionOffsetX") { // from class: org.telegram.ui.MainTabsLayout.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(MainTabsLayout mainTabsLayout) {
                return mainTabsLayout.animatedLongSelectedViewOffsetX;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(MainTabsLayout mainTabsLayout, float f) {
                mainTabsLayout.animatedLongSelectedViewOffsetX = f;
                mainTabsLayout.invalidate();
            }
        });
        this.selectedTabPositionOffsetX = springAnimation3;
        SpringAnimation springAnimation4 = new SpringAnimation(this, new FloatPropertyCompat("selectedTabPositionX") { // from class: org.telegram.ui.MainTabsLayout.2
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(MainTabsLayout mainTabsLayout) {
                return mainTabsLayout.animatedLongSelectedViewCenterX;
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(MainTabsLayout mainTabsLayout, float f) {
                mainTabsLayout.animatedLongSelectedViewCenterX = f;
                mainTabsLayout.invalidate();
            }
        });
        this.selectedTabPositionX = springAnimation4;
        springAnimation3.setSpring(new SpringForce(1.0f).setStiffness(1500.0f).setDampingRatio(0.75f));
        springAnimation.setSpring(new SpringForce(1.0f).setStiffness(250.0f).setDampingRatio(0.25f));
        springAnimation2.setSpring(new SpringForce(1.0f).setStiffness(250.0f).setDampingRatio(0.25f));
        springAnimation4.setSpring(new SpringForce(1.0f).setStiffness(1500.0f).setDampingRatio(0.75f));
        this.tabsWithIgnoreClick = new HashSet();
        this.animatorIsScaled = new BoolAnimator(0, new FactorAnimator.Target() { // from class: org.telegram.ui.MainTabsLayout$$ExternalSyntheticLambda1
            @Override // me.vkryl.android.animator.FactorAnimator.Target
            public /* synthetic */ void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.-CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override // me.vkryl.android.animator.FactorAnimator.Target
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                MainTabsLayout.this.lambda$new$1(i, f, f2, factorAnimator);
            }
        }, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.clickHelper = new ClickHelper(new ClickHelper.Delegate() { // from class: org.telegram.ui.MainTabsLayout.3
            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean forceEnableVibration() {
                return ClickHelper.Delegate.-CC.$default$forceEnableVibration(this);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f, float f2) {
                return ClickHelper.Delegate.-CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public boolean needCancelTouchBySlopMove() {
                return false;
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public boolean needLongPress(float f, float f2) {
                return true;
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onClickAt(View view, float f, float f2) {
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onClickTouchDown(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onClickTouchDown(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onClickTouchMove(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onClickTouchMove(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public /* synthetic */ void onClickTouchUp(View view, float f, float f2) {
                ClickHelper.Delegate.-CC.$default$onClickTouchUp(this, view, f, f2);
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public boolean needClickAt(View view, float f, float f2) {
                MainTabsLayout.this.lastLongSelectedView = null;
                View findChildUnder = MainTabsLayout.findChildUnder(MainTabsLayout.this, f, f2);
                return (findChildUnder == null || MainTabsLayout.this.tabsWithIgnoreClick.contains(findChildUnder)) ? false : true;
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public boolean onLongPressRequestedAt(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.isInLongPress = true;
                AndroidUtilities.cancelRunOnUIThread(MainTabsLayout.this.restoreDrawSelector);
                MainTabsLayout.this.setSkipDrawSelector(true);
                MainTabsLayout.this.checkLongMove(f, f2, true, false);
                MainTabsLayout.this.invalidate();
                longTouchStart();
                return true;
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, false);
                MainTabsLayout.this.invalidate();
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 long, still in use, count: 1, list:
                  (r0v0 long) from 0x0006: ARITH (r0v1 long) = (r0v0 long) * (750 long)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:452)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public long getLongPressDuration() {
                /*
                    r4 = this;
                    long r0 = me.vkryl.android.util.ClickHelper.Delegate.-CC.$default$getLongPressDuration(r4)
                    r2 = 750(0x2ee, double:3.705E-321)
                    long r0 = r0 * r2
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r0 = r0 / r2
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MainTabsLayout.3.getLongPressDuration():long");
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onLongPressFinish(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, true);
                MainTabsLayout.this.isInLongPress = false;
                AndroidUtilities.runOnUIThread(MainTabsLayout.this.restoreDrawSelector, 450L);
                if (MainTabsLayout.this.lastLongSelectedView != null) {
                    MainTabsLayout.this.lastLongSelectedView.performClick();
                }
                MainTabsLayout.this.lastLongSelectedView = null;
                MainTabsLayout.this.invalidate();
                longTouchEnd();
            }

            @Override // me.vkryl.android.util.ClickHelper.Delegate
            public void onLongPressCancelled(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, true);
                MainTabsLayout.this.isInLongPress = false;
                AndroidUtilities.runOnUIThread(MainTabsLayout.this.restoreDrawSelector, 450L);
                MainTabsLayout.this.lastLongSelectedView = null;
                MainTabsLayout.this.invalidate();
                longTouchEnd();
            }

            private void longTouchStart() {
                MainTabsLayout.this.animatorIsScaled.setValue(true, true);
            }

            private void longTouchEnd() {
                MainTabsLayout.this.animatorIsScaled.setValue(false, true);
            }
        });
        this.resourcesProvider = resourcesProvider;
    }

    public void setMaxWidth(int i) {
        if (this.maxWidthPx != i) {
            this.maxWidthPx = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r5 = r9;
     */
    @Override // org.telegram.ui.Components.AnimatedLinearLayout, android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i4 = this.maxWidthPx;
        if (i4 > 0 && size > i4) {
            size = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int length = PASS_TEXT_SIZES_DP.length - 1;
        float f = -1.0f;
        while (true) {
            float[] fArr = PASS_TEXT_SIZES_DP;
            if (i3 >= fArr.length) {
                break;
            }
            float f2 = fArr[i3];
            if (f2 != f) {
                measureTabTexts(f2);
                f = fArr[i3];
            }
            int dp = AndroidUtilities.dp(PASS_PADDINGS_DP[i3]);
            int childCount = getChildCount();
            float f3 = 0.0f;
            for (int i5 = 0; i5 < childCount; i5++) {
                if (isViewVisible(getChildAt(i5))) {
                    f3 += this.tabsTextWidth[i5] + (dp * 2);
                }
            }
            i3 = (f3 > ((float) paddingLeft) && i3 != PASS_TEXT_SIZES_DP.length - 1) ? i3 + 1 : 0;
        }
        applyPassTextSize(length);
        int dp2 = AndroidUtilities.dp(PASS_PADDINGS_DP[length]) * 2;
        int max = (paddingLeft / Math.max(1, this.visibleChildCount)) - dp2;
        int childCount2 = getChildCount();
        int i6 = 0;
        float f4 = 0.0f;
        for (int i7 = 0; i7 < childCount2; i7++) {
            if (!isViewVisible(getChildAt(i7))) {
                float[] fArr2 = this.tabsTextWidth;
                this.tabsTextWidthWithMargin[i7] = 0.0f;
                fArr2[i7] = 0.0f;
                this.tabsWeight[i7] = 0;
            } else {
                float[] fArr3 = this.tabsTextWidthWithMargin;
                float f5 = this.tabsTextWidth[i7] + dp2;
                fArr3[i7] = f5;
                int[] iArr = this.tabsWeight;
                int i8 = f5 > ((float) (max + dp2)) ? 0 : 1;
                iArr[i7] = i8;
                f4 += f5;
                i6 += i8;
            }
        }
        if (i6 == 0) {
            int childCount3 = getChildCount();
            for (int i9 = 0; i9 < childCount3; i9++) {
                this.tabsWeight[i9] = isViewVisible(getChildAt(i9)) ? 1 : 0;
            }
            i6 = this.visibleChildCount;
        }
        float f6 = paddingLeft;
        if (f4 > f6) {
            float f7 = f6 / f4;
            int childCount4 = getChildCount();
            for (int i10 = 0; i10 < childCount4; i10++) {
                float[] fArr4 = this.tabsTextWidthWithMargin;
                fArr4[i10] = fArr4[i10] * f7;
            }
        } else {
            float f8 = min;
            if (f4 < f8) {
                float f9 = (f8 - f4) / i6;
                int childCount5 = getChildCount();
                for (int i11 = 0; i11 < childCount5; i11++) {
                    float[] fArr5 = this.tabsTextWidthWithMargin;
                    fArr5[i11] = fArr5[i11] + (this.tabsWeight[i11] * f9);
                }
            }
        }
        int childCount6 = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount6; i13++) {
            if (isViewVisible(getChildAt(i13))) {
                this.tabsWidth[i13] = Math.round(this.tabsTextWidthWithMargin[i13]);
                this.tabsLeftPos[i13] = i12;
                i12 += this.tabsWidth[i13];
            }
        }
        setMeasuredDimension(i12 + getPaddingLeft() + getPaddingRight(), size2);
        int childCount7 = getChildCount();
        for (int i14 = 0; i14 < childCount7; i14++) {
            getChildAt(i14).measure(View.MeasureSpec.makeMeasureSpec(this.tabsWidth[i14], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        calculateTotalSizesAfterMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void measureTabTexts(float f) {
        int childCount = getChildCount();
        float[] fArr = this.tabsTextWidth;
        if (fArr == null || fArr.length < childCount) {
            this.tabsTextWidth = new float[childCount];
            this.tabsTextWidthWithMargin = new float[childCount];
            this.tabsWeight = new int[childCount];
            this.tabsLeftPos = new int[childCount];
            this.tabsWidth = new int[childCount];
        }
        int i = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!isViewVisible(childAt)) {
                this.tabsTextWidth[i2] = -1.0f;
            } else {
                float measureTextWidth = childAt instanceof Tab ? ((Tab) childAt).measureTextWidth(f) : 0.0f;
                this.tabsTextWidth[i2] = measureTextWidth;
                f2 = Math.max(f2, measureTextWidth);
                i++;
            }
        }
        this.biggestTabTextWidth = (int) Math.ceil(f2);
        this.visibleChildCount = i;
    }

    private void applyPassTextSize(int i) {
        float f = PASS_TEXT_SIZES_DP[i];
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof Tab) {
                ((Tab) childAt).setTextSizeDp(f);
            }
        }
    }

    @Override // org.telegram.ui.Components.AnimatedLinearLayout
    protected void setChildVisibilityFactor(View view, float f) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    @Override // org.telegram.ui.Components.AnimatedLinearLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkVisualWidth();
    }

    @Override // org.telegram.ui.Components.AnimatedLinearLayout
    protected void onItemsChanged() {
        super.onItemsChanged();
        checkVisualWidth();
    }

    private void checkVisualWidth() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            ListAnimator.Entry entry = getEntry(i);
            ((GlassTabView) ((AnimatedLinearLayout.Holder) entry.item).view).setVisualWidth(entry.getRectF().width());
        }
    }

    public void setTabSelected(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof GlassTabView) {
                ((GlassTabView) childAt).setSelected(childAt == view, z);
            }
        }
    }

    private View findSelectedTab() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof GlassTabView) && ((GlassTabView) childAt).isTabSelected()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        setSkipDrawSelector(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z) {
        this.drawCustomSelector = z;
        if (z) {
            this.selectorPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_glass_tabSelected, this.resourcesProvider), 0.09f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof GlassTabView)) {
                ((GlassTabView) childAt).setSkipDrawSelector(z);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.drawCustomSelector) {
            float f = this.animatedLongSelectedViewCenterX + this.animatedLongSelectedViewOffsetX;
            float interpolatedWidthByX = getInterpolatedWidthByX(f, this);
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f2 = interpolatedWidthByX / 2.0f;
            float f3 = height / 2.0f;
            canvas.drawRoundRect(f - f2, (getHeight() - height) / 2.0f, f + f2, (getHeight() + height) / 2.0f, f3, f3, this.selectorPaint);
        }
        super.dispatchDraw(canvas);
    }

    public static View findChildUnder(ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLongMove(float f, float f2, boolean z, boolean z2) {
        float clampXToChildrenCenters = clampXToChildrenCenters(f, this);
        View findNearestVisibleChildByX = findNearestVisibleChildByX(clampXToChildrenCenters, this);
        if (z) {
            View findSelectedTab = findSelectedTab();
            if (findSelectedTab != null) {
                float x = findSelectedTab.getX() + (findSelectedTab.getWidth() / 2.0f);
                this.animatedLongSelectedViewCenterX = x;
                this.animatedLongSelectedViewOffsetX = x - clampXToChildrenCenters;
                this.selectedTabPositionOffsetX.animateToFinalPosition(0.0f);
                if (findSelectedTab != findNearestVisibleChildByX && findNearestVisibleChildByX != null) {
                    findNearestVisibleChildByX.performClick();
                }
            }
            this.selectedTabPositionX.cancel();
        }
        if (!z2) {
            this.animatedLongSelectedViewCenterX = clampXToChildrenCenters;
            invalidate();
        }
        if (findNearestVisibleChildByX != null) {
            this.lastLongSelectedView = findNearestVisibleChildByX;
            setTabSelected(findNearestVisibleChildByX, true);
            if (z2) {
                float width = findNearestVisibleChildByX.getWidth();
                float x2 = findNearestVisibleChildByX.getX() + (width / 2.0f);
                if (this.lastLongSelectedViewWidth == width && this.lastLongSelectedViewCenterX == x2) {
                    return;
                }
                this.selectedTabPositionX.animateToFinalPosition(x2);
            }
        }
    }

    public void addTabToIgnoreClick(View view) {
        this.tabsWithIgnoreClick.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i, float f, float f2, FactorAnimator factorAnimator) {
        setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f));
        setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f));
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        checkLayerType();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        checkLayerType();
    }

    private void checkLayerType() {
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkPivot(View view, float f, float f2) {
        float f3;
        float f4;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f5 = width * 0.5f;
        float f6 = height * 0.5f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f7 / f5;
        float f10 = f8 / f6;
        float sqrt = (float) Math.sqrt((f9 * f9) + (f10 * f10));
        if (sqrt > 1.0E-4f) {
            float f11 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
            f3 = (f7 * f11) + f5;
            f4 = (f8 * f11) + f6;
        } else {
            f3 = f5;
            f4 = f6;
        }
        float lerp = AndroidUtilities.lerp(f5, f3, 1.0f);
        float lerp2 = AndroidUtilities.lerp(f6, f4, 3.0f);
        view.setPivotX(lerp);
        view.setPivotY(lerp2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.clickHelper.onTouchEvent(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private static float clampXToChildrenCenters(float f, ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            boolean z = false;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float x = childAt.getX() + (childAt.getWidth() * 0.5f);
                    if (x < f2) {
                        f2 = x;
                    }
                    if (x > f3) {
                        f3 = x;
                    }
                    z = true;
                }
            }
            if (!z) {
                return f;
            }
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }

    private static View findNearestVisibleChildByX(float f, ViewGroup viewGroup) {
        View view = null;
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            float f2 = Float.MAX_VALUE;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float abs = Math.abs((childAt.getX() + (childAt.getWidth() * 0.5f)) - f);
                    if (abs < f2) {
                        view = childAt;
                        f2 = abs;
                    }
                }
            }
        }
        return view;
    }

    private static float getInterpolatedWidthByX(float f, ViewGroup viewGroup) {
        int width;
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return 0.0f;
        }
        View view = null;
        View view2 = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0) {
                float x = childAt.getX() + (childAt.getWidth() * 0.5f);
                if (x <= f && (view == null || x > getCenterX(view))) {
                    view = childAt;
                }
                if (x >= f && (view2 == null || x < getCenterX(view2))) {
                    view2 = childAt;
                }
            }
        }
        if (view == null && view2 == null) {
            return 0.0f;
        }
        if (view == null) {
            width = view2.getWidth();
        } else if (view2 == null) {
            width = view.getWidth();
        } else {
            float centerX = getCenterX(view);
            float centerX2 = getCenterX(view2);
            if (view == view2 || centerX == centerX2) {
                width = view.getWidth();
            } else {
                width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f - centerX) / (centerX2 - centerX));
            }
        }
        return width;
    }

    private static float getCenterX(View view) {
        return view.getX() + (view.getWidth() * 0.5f);
    }
}
