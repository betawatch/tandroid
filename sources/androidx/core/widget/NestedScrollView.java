package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import g1.a;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import k7.v7;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import r0.b0;
import r0.i;
import r0.j0;
import r0.k0;
import r0.l;
import r0.n;
import r0.t;
import r0.u;
import r0.v;
import u0.c;
import u0.e;
import u0.f;
import u0.g;
import u0.h;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements n {
    public static final float Q = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final e R = new e();
    public static final int[] S = {R.attr.fillViewport};
    public boolean B;
    public final int C;
    public final int D;
    public final int E;
    public int F;
    public final int[] G;
    public final int[] H;
    public int I;
    public int J;
    public h K;
    public final c5.e L;
    public final l M;
    public float N;
    public g O;
    public final i P;
    public final float a;
    public long b;
    public final Rect c;
    public OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public t h;
    public int n;
    public boolean r;
    public boolean s;
    public View v;
    public boolean w;
    public VelocityTracker x;
    public boolean y;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private t getScrollFeedbackProvider() {
        if (this.h == null) {
            this.h = new t(this);
        }
        return this.h;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    public final boolean A(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.e;
        if (v7.a(edgeEffect) != 0.0f) {
            v7.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (v7.a(edgeEffect2) == 0.0f) {
            return z4;
        }
        v7.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void B(int i10) {
        this.M.h(i10);
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        g(i10, i11, i12, iArr, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        q(i13, i14, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void computeScroll() {
        int round;
        int i10;
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int currY = this.d.getCurrY();
        int i11 = currY - this.J;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f;
        if (i11 <= 0 || v7.a(edgeEffect) == 0.0f) {
            if (i11 < 0 && v7.a(edgeEffect2) != 0.0f) {
                float f10 = height;
                round = Math.round(v7.b(edgeEffect2, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (round != i11) {
                    edgeEffect2.finish();
                }
            }
            this.J = currY;
            int[] iArr = this.H;
            iArr[1] = 0;
            g(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                t(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                h(0, scrollY2, 0, i12, this.G, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                d();
            }
            if (this.d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                B(1);
                return;
            }
        }
        round = Math.round(v7.b(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i11) {
            edgeEffect.finish();
        }
        i11 -= round;
        this.J = currY;
        int[] iArr2 = this.H;
        iArr2[1] = 0;
        g(0, i11, 1, iArr2, null);
        i10 = i11 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i10 != 0) {
        }
        if (i10 != 0) {
        }
        if (this.d.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    public final void d() {
        this.d.abortAnimation();
        B(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z4) {
        return this.M.a(f10, f11, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.M.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return g(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.M.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i11 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i11 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final boolean e(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            w(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            w(f(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return this.M.c(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c5.e eVar = this.L;
        return eVar.b | eVar.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.N;
    }

    public void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.M.d(0, i11, 0, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.M.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : e(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : e(130);
                    }
                    if (keyCode == 62) {
                        u(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        u(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        u(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.M.d;
    }

    @Override // r0.n
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        q(i13, i14, iArr);
    }

    public void k(int i10) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
            z(2, 1);
            this.J = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i10) {
        int childCount;
        boolean z4 = i10 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return v(i10, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i10, int i11) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // r0.m
    public final void o(int i10, View view) {
        c5.e eVar = this.L;
        if (i10 == 1) {
            eVar.b = 0;
        } else {
            eVar.a = 0;
        }
        B(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        int i11;
        char c3;
        int i12;
        int i13;
        boolean z4;
        NestedScrollView nestedScrollView;
        float f11;
        NestedScrollView nestedScrollView2;
        float f12;
        long j10;
        float f13;
        float sqrt;
        NestedScrollView nestedScrollView3;
        float f14;
        if (motionEvent.getAction() != 8 || this.w) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i11 = (int) motionEvent.getX();
            f10 = axisValue;
            i10 = 9;
        } else if ((motionEvent.getSource() & TLObject.FLAG_22) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i11 = getWidth() / 2;
            f10 = axisValue2;
            i10 = 26;
        } else {
            f10 = 0.0f;
            i10 = 0;
            i11 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        w(-((int) (getVerticalScrollFactorCompat() * f10)), i10, motionEvent, i11, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 != 0) {
            i iVar = this.P;
            NestedScrollView nestedScrollView4 = (NestedScrollView) iVar.b.b;
            int[] iArr = iVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (iVar.f == source && iVar.g == deviceId && iVar.e == i10) {
                z4 = false;
                c3 = 0;
            } else {
                Context context = iVar.a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                c3 = 0;
                int source2 = motionEvent.getSource();
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    Method method = k0.a;
                    i12 = a.j(viewConfiguration, deviceId2, i10, source2);
                } else {
                    Method method2 = k0.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i10, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i12 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                iArr[0] = i12;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i14 >= 34) {
                    i13 = a.i(viewConfiguration, deviceId3, i10, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i10, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i13 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i13 = TLObject.FLAG_31;
                }
                iArr[1] = i13;
                iVar.f = source;
                iVar.g = deviceId;
                iVar.e = i10;
                z4 = true;
            }
            if (iArr[c3] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = iVar.c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                iVar.c = null;
                return true;
            }
            if (iVar.c == null) {
                iVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = iVar.c;
            Map map = u.a;
            velocityTracker2.addMovement(motionEvent);
            int i15 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = u.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new v());
                }
                v vVar = (v) map2.get(velocityTracker2);
                long[] jArr = vVar.b;
                long eventTime = motionEvent.getEventTime();
                if (vVar.d != 0 && eventTime - jArr[vVar.e] > 40) {
                    vVar.d = 0;
                    vVar.c = 0.0f;
                }
                int i16 = (vVar.e + 1) % 20;
                vVar.e = i16;
                int i17 = vVar.d;
                if (i17 != 20) {
                    vVar.d = i17 + 1;
                }
                vVar.a[i16] = motionEvent.getAxisValue(26);
                jArr[vVar.e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, Float.MAX_VALUE);
            v vVar2 = (v) u.a.get(velocityTracker2);
            if (vVar2 != null) {
                float[] fArr = vVar2.a;
                long[] jArr2 = vVar2.b;
                int i18 = vVar2.d;
                if (i18 >= 2) {
                    int i19 = vVar2.e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long j11 = jArr2[i19];
                    while (true) {
                        j10 = jArr2[i20];
                        if (j11 - j10 <= 100) {
                            break;
                        }
                        vVar2.d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = vVar2.d;
                    if (i21 >= 2) {
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j10 != jArr2[i22]) {
                                nestedScrollView = nestedScrollView4;
                                sqrt = fArr[i22] / (r12 - j10);
                                f13 = Float.MAX_VALUE;
                            }
                        } else {
                            f13 = Float.MAX_VALUE;
                            float f15 = 0.0f;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= vVar2.d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j12 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % i15;
                                if (jArr2[i26] == j12) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i24++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                    float f16 = fArr[i26] / (jArr2[i26] - j12);
                                    float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                    if (i24 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f15 = abs;
                                }
                                i23++;
                                nestedScrollView4 = nestedScrollView3;
                                i15 = 20;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                        }
                        f14 = sqrt * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        vVar2.c = f14;
                        if (f14 >= (-Math.abs(f13))) {
                            vVar2.c = -Math.abs(f13);
                        } else if (vVar2.c > Math.abs(f13)) {
                            vVar2.c = Math.abs(f13);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f13 = Float.MAX_VALUE;
                sqrt = 0.0f;
                f14 = sqrt * MediaDataController.MAX_STYLE_RUNS_COUNT;
                vVar2.c = f14;
                if (f14 >= (-Math.abs(f13))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f11 = a.f(velocityTracker2, i10);
            } else if (i10 == 0) {
                f11 = velocityTracker2.getXVelocity();
            } else if (i10 == 1) {
                f11 = velocityTracker2.getYVelocity();
            } else {
                v vVar3 = (v) u.a.get(velocityTracker2);
                f11 = (vVar3 == null || i10 != 26) ? 0.0f : vVar3.c;
            }
            float f17 = f11 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f17);
            if (z4 || !(signum == Math.signum(iVar.d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f17) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f17, iArr[1]));
                if (max == 0.0f) {
                    f12 = 0.0f;
                } else {
                    nestedScrollView2.d.abortAnimation();
                    nestedScrollView2.k((int) max);
                    f12 = max;
                }
                iVar.d = f12;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.w) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.F;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.n) > this.C && (2 & getNestedScrollAxes()) == 0) {
                                this.w = true;
                                this.n = y10;
                                if (this.x == null) {
                                    this.x = VelocityTracker.obtain();
                                }
                                this.x.addMovement(motionEvent);
                                this.I = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        r(motionEvent);
                    }
                }
            }
            this.w = false;
            this.F = -1;
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.x = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            B(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.n = y11;
                    this.F = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.x;
                    if (velocityTracker2 == null) {
                        this.x = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.x.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!A(motionEvent) && this.d.isFinished()) {
                        z4 = false;
                    }
                    this.w = z4;
                    z(2, 0);
                }
            }
            if (!A(motionEvent) && this.d.isFinished()) {
                z4 = false;
            }
            this.w = z4;
            VelocityTracker velocityTracker3 = this.x;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.x = null;
            }
        }
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = 0;
        this.r = false;
        View view = this.v;
        if (view != null && m(view, this)) {
            View view2 = this.v;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int f10 = f(rect);
            if (f10 != 0) {
                scrollBy(0, f10);
            }
        }
        this.v = null;
        if (!this.s) {
            if (this.K != null) {
                scrollTo(getScrollX(), this.K.a);
                this.K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.y && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_30));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        k((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.M.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        g(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        q(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        s(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z4, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.K = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.a = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        g gVar = this.O;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i13)) {
            return;
        }
        Rect rect = this.c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int f10 = f(rect);
        if (f10 != 0) {
            if (this.B) {
                y(0, f10, false);
            } else {
                scrollBy(0, f10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return p(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        o(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float b10;
        int round;
        int i10;
        ViewParent parent2;
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        obtain.offsetLocation(0.0f, this.I);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.x;
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.E);
                int yVelocity = (int) velocityTracker.getYVelocity(this.F);
                if (Math.abs(yVelocity) >= this.D) {
                    if (v7.a(edgeEffect) != 0.0f) {
                        if (x(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (v7.a(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (x(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            k(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!this.M.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            k(i12);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.F = -1;
                this.w = false;
                VelocityTracker velocityTracker2 = this.x;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.x = null;
                }
                B(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.F);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.F + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i13 = this.n - y10;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (v7.a(edgeEffect) != 0.0f) {
                        b10 = -v7.b(edgeEffect, -height, x10);
                        if (v7.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (v7.a(edgeEffect2) != 0.0f) {
                            b10 = v7.b(edgeEffect2, height, 1.0f - x10);
                            if (v7.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f10 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i10 = i13 - round;
                        if (!this.w && Math.abs(i10) > this.C) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.w = true;
                            i10 = i10 <= 0 ? i10 - this.C : i10 + this.C;
                        }
                        if (this.w) {
                            int w10 = w(i10, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.n = y10 - w10;
                            this.I += w10;
                        }
                    }
                    f10 = b10;
                    round = Math.round(f10 * getHeight());
                    if (round != 0) {
                    }
                    i10 = i13 - round;
                    if (!this.w) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.w = true;
                        if (i10 <= 0) {
                        }
                    }
                    if (this.w) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.w && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.F = -1;
                this.w = false;
                VelocityTracker velocityTracker3 = this.x;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.x = null;
                }
                B(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.F = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                r(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.F));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.w && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                d();
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.n = y11;
            this.F = pointerId;
            z(2, 0);
        }
        VelocityTracker velocityTracker4 = this.x;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final void q(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.M.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i10);
            this.F = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.r) {
            this.v = view2;
        } else {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int f10 = f(rect);
            if (f10 != 0) {
                scrollBy(0, f10);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int f10 = f(rect);
        boolean z10 = f10 != 0;
        if (z10) {
            if (z4) {
                scrollBy(0, f10);
                return z10;
            }
            y(0, f10, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.x) != null) {
            velocityTracker.recycle();
            this.x = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.r = true;
        super.requestLayout();
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        c5.e eVar = this.L;
        if (i11 == 1) {
            eVar.b = i10;
        } else {
            eVar.a = i10;
        }
        z(2, i11);
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.y) {
            this.y = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        l lVar = this.M;
        if (lVar.d) {
            ViewGroup viewGroup = lVar.c;
            WeakHashMap weakHashMap = j0.a;
            b0.k(viewGroup);
        }
        lVar.d = z4;
    }

    public void setOnScrollChangeListener(g gVar) {
        this.O = gVar;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.B = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return z(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        B(0);
    }

    public final boolean t(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z4;
        int i15;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z4 = false;
        } else {
            z4 = true;
            i14 = 0;
        }
        if (i16 > i13) {
            i15 = i13;
            z10 = true;
        } else if (i16 < 0) {
            z10 = true;
            i15 = 0;
        } else {
            i15 = i16;
            z10 = false;
        }
        if (z10 && !this.M.f(1)) {
            this.d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        return z4 || z10;
    }

    public final void u(int i10) {
        boolean z4 = i10 == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        v(i10, i11, i12);
    }

    public final boolean v(int i10, int i11, int i12) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z12 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            w(z10 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z4) {
        int i14;
        int i15;
        boolean z10;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            z(2, i13);
        }
        boolean g10 = g(0, i10, i13, this.H, this.G);
        int[] iArr = this.G;
        int[] iArr2 = this.H;
        if (g10) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z12 = t(i14, 0, scrollY, scrollRange) && !this.M.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        h(0, scrollY2, 0, i14 - scrollY2, this.G, i13, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.e;
        if (i18 < 0) {
            if (z11) {
                v7.b(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i18 > scrollRange && z11) {
            v7.b(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z10 = false;
            } else {
                z10 = z12;
            }
            if (z10 && i13 == 0 && (velocityTracker = this.x) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                B(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z10 = false;
        if (z10) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
        }
        return i16;
    }

    public final boolean x(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a2 = v7.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.a * 0.015f;
        double log = Math.log(abs / f10);
        double d = Q;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f10))) < a2;
    }

    public final void y(int i10, int i11, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, MediaDataController.MAX_LINKS_COUNT);
            if (z4) {
                z(2, 1);
            } else {
                B(1);
            }
            this.J = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.d.isFinished()) {
                d();
            }
            scrollBy(i10, i11);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean z(int i10, int i11) {
        return this.M.g(i10, i11);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.c = new Rect();
        this.r = true;
        this.s = false;
        this.v = null;
        this.w = false;
        this.B = true;
        this.F = -1;
        this.G = new int[2];
        this.H = new int[2];
        this.P = new i(getContext(), new f1(this, 21));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            edgeEffect = c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.e = edgeEffect;
        if (i11 >= 31) {
            edgeEffect2 = c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f = edgeEffect2;
        this.a = e2.c.z(context.getResources().getDisplayMetrics().density, 160.0f, 386.0878f, 0.84f);
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.C = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, S, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.L = new c5.e();
        this.M = new l(this);
        setNestedScrollingEnabled(true);
        j0.k(this, R);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
