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
import c8.lc;
import e2.r0;
import h1.a;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.vl;
import r0.a0;
import r0.i0;
import r0.j;
import r0.j0;
import r0.l;
import r0.r;
import r0.s;
import r0.t;
import u0.c;
import u0.e;
import u0.f;
import u0.g;
import u0.h;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements l {
    public static final float T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final e U = new e();
    public static final int[] V = {R.attr.fillViewport};
    public boolean D;
    public boolean E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public final int[] J;
    public final int[] K;
    public int L;
    public int M;
    public h N;
    public final r0 O;
    public final j P;
    public float Q;
    public g R;
    public final vl S;
    public final float a;
    public long b;
    public final Rect c;
    public OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public r h;
    public int n;
    public boolean r;
    public boolean s;
    public View w;
    public boolean x;
    public VelocityTracker y;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private r getScrollFeedbackProvider() {
        if (this.h == null) {
            this.h = new r(this);
        }
        return this.h;
    }

    public static boolean n(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && n((View) parent, nestedScrollView);
    }

    public boolean A(int i7, int i10) {
        return this.P.g(i7, i10);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z9;
        EdgeEffect edgeEffect = this.e;
        if (lc.a(edgeEffect) != 0.0f) {
            lc.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z9 = true;
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (lc.a(edgeEffect2) == 0.0f) {
            return z9;
        }
        lc.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void C(int i7) {
        this.P.h(i7);
    }

    public final void a() {
        this.d.abortAnimation();
        C(1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final boolean b(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !p(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            x(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            x(c(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (view != null && view.isFocused() && !p(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void computeScroll() {
        int round;
        int i7;
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int currY = this.d.getCurrY();
        int i10 = currY - this.M;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f;
        if (i10 <= 0 || lc.a(edgeEffect) == 0.0f) {
            if (i10 < 0 && lc.a(edgeEffect2) != 0.0f) {
                float f10 = height;
                round = Math.round(lc.b(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (round != i10) {
                    edgeEffect2.finish();
                }
            }
            this.M = currY;
            int[] iArr = this.K;
            iArr[1] = 0;
            d(0, i10, 1, iArr, null);
            i7 = i10 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
            if (i7 != 0) {
                int scrollY = getScrollY();
                u(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i7 - scrollY2;
                iArr[1] = 0;
                e(0, scrollY2, 0, i11, this.J, 1, iArr);
                i7 = i11 - iArr[1];
            }
            if (i7 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                a();
            }
            if (this.d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                C(1);
                return;
            }
        }
        round = Math.round(lc.b(edgeEffect, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i10) {
            edgeEffect.finish();
        }
        i10 -= round;
        this.M = currY;
        int[] iArr2 = this.K;
        iArr2[1] = 0;
        d(0, i10, 1, iArr2, null);
        i7 = i10 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i7 != 0) {
        }
        if (i7 != 0) {
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

    public boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        return this.P.c(i7, i10, i11, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.P.a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.P.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return d(i7, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.P.d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
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
            i10 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        this.P.d(0, i10, 0, i12, iArr, i13, iArr2);
    }

    public final boolean f(KeyEvent keyEvent) {
        this.c.setEmpty();
        int childCount = getChildCount();
        int i7 = qs.O1;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? j(33) : b(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? j(qs.O1) : b(qs.O1);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i7 = 33;
                        }
                        v(i7);
                        return false;
                    }
                    if (keyCode == 92) {
                        return j(33);
                    }
                    if (keyCode == 93) {
                        return j(qs.O1);
                    }
                    if (keyCode == 122) {
                        v(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        v(qs.O1);
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
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, qs.O1);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(qs.O1)) {
                return true;
            }
        }
        return false;
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
        return this.O.b();
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
        if (this.Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.Q;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.P.f(0);
    }

    public void i(int i7) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
            A(2, 1);
            this.M = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.P.d;
    }

    public final boolean j(int i7) {
        int childCount;
        boolean z9 = i7 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return w(i7, rect.top, rect.bottom);
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        r0 r0Var = this.O;
        if (i7 == 1) {
            r0Var.b = 0;
        } else {
            r0Var.a = 0;
        }
        C(i7);
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        q(i12, i13, iArr);
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        q(i12, i13, null);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0128, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00dd, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        NestedScrollView nestedScrollView;
        float f11;
        NestedScrollView nestedScrollView2;
        float f12;
        long j3;
        float f13;
        float sqrt;
        int i14;
        NestedScrollView nestedScrollView3;
        float f14;
        if (motionEvent.getAction() != 8 || this.x) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
            i7 = 9;
            f10 = axisValue;
        } else if ((motionEvent.getSource() & TLObject.FLAG_22) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue2;
            i7 = 26;
        } else {
            f10 = 0.0f;
            i7 = 0;
            i10 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        x(-((int) (getVerticalScrollFactorCompat() * f10)), i7, motionEvent, i10, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i7 != 0) {
            vl vlVar = this.S;
            NestedScrollView nestedScrollView4 = (NestedScrollView) ((n) vlVar.f).a;
            int[] iArr = (int[]) vlVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i15 = 1;
            if (vlVar.c == source && vlVar.d == deviceId && vlVar.b == i7) {
                z9 = false;
                i11 = 0;
            } else {
                Context context = (Context) vlVar.e;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i11 = 0;
                int source2 = motionEvent.getSource();
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 34) {
                    Method method = j0.a;
                    i12 = a.j(viewConfiguration, deviceId2, i7, source2);
                } else {
                    Method method2 = j0.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i7, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
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
                if (i16 >= 34) {
                    i13 = a.i(viewConfiguration, deviceId3, i7, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i7, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i13 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i13 = Integer.MIN_VALUE;
                }
                iArr[1] = i13;
                vlVar.c = source;
                vlVar.d = deviceId;
                vlVar.b = i7;
                z9 = true;
            }
            if (iArr[i11] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = (VelocityTracker) vlVar.g;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                vlVar.g = null;
                return true;
            }
            if (((VelocityTracker) vlVar.g) == null) {
                vlVar.g = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = (VelocityTracker) vlVar.g;
            Map map = s.a;
            velocityTracker2.addMovement(motionEvent);
            int i17 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = s.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new t());
                }
                t tVar = (t) map2.get(velocityTracker2);
                long[] jArr = tVar.b;
                long eventTime = motionEvent.getEventTime();
                if (tVar.d != 0 && eventTime - jArr[tVar.e] > 40) {
                    tVar.d = i11;
                    tVar.c = 0.0f;
                }
                int i18 = (tVar.e + 1) % 20;
                tVar.e = i18;
                int i19 = tVar.d;
                if (i19 != 20) {
                    tVar.d = i19 + 1;
                }
                tVar.a[i18] = motionEvent.getAxisValue(26);
                jArr[tVar.e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            t tVar2 = (t) s.a.get(velocityTracker2);
            if (tVar2 != null) {
                float[] fArr = tVar2.a;
                long[] jArr2 = tVar2.b;
                int i20 = tVar2.d;
                if (i20 >= 2) {
                    int i21 = tVar2.e;
                    int i22 = ((i21 + 20) - (i20 - 1)) % 20;
                    long j10 = jArr2[i21];
                    while (true) {
                        j3 = jArr2[i22];
                        if (j10 - j3 <= 100) {
                            break;
                        }
                        tVar2.d--;
                        i22 = (i22 + 1) % 20;
                    }
                    int i23 = tVar2.d;
                    if (i23 >= 2) {
                        if (i23 == 2) {
                            int i24 = (i22 + 1) % 20;
                            if (j3 != jArr2[i24]) {
                                nestedScrollView = nestedScrollView4;
                                f13 = Float.MAX_VALUE;
                                i14 = 1000;
                                sqrt = fArr[i24] / (r12 - j3);
                            }
                        } else {
                            f13 = Float.MAX_VALUE;
                            float f15 = 0.0f;
                            int i25 = 0;
                            int i26 = 0;
                            while (true) {
                                if (i25 >= tVar2.d - 1) {
                                    break;
                                }
                                int i27 = i25 + i22;
                                long j11 = jArr2[i27 % 20];
                                int i28 = (i27 + 1) % i17;
                                if (jArr2[i28] == j11) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i26++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
                                    float f16 = fArr[i28] / (jArr2[i28] - j11);
                                    float abs = (Math.abs(f16) * (f16 - sqrt2)) + f15;
                                    if (i26 == i15) {
                                        abs *= 0.5f;
                                    }
                                    f15 = abs;
                                }
                                i25++;
                                nestedScrollView4 = nestedScrollView3;
                                i17 = 20;
                                i15 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f15) * 2.0f)) * (f15 < 0.0f ? -1.0f : 1.0f);
                            i14 = 1000;
                        }
                        f14 = sqrt * i14;
                        tVar2.c = f14;
                        if (f14 >= (-Math.abs(f13))) {
                            tVar2.c = -Math.abs(f13);
                        } else if (tVar2.c > Math.abs(f13)) {
                            tVar2.c = Math.abs(f13);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f13 = Float.MAX_VALUE;
                i14 = 1000;
                sqrt = 0.0f;
                f14 = sqrt * i14;
                tVar2.c = f14;
                if (f14 >= (-Math.abs(f13))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f11 = a.f(velocityTracker2, i7);
            } else if (i7 == 0) {
                f11 = velocityTracker2.getXVelocity();
            } else if (i7 == 1) {
                f11 = velocityTracker2.getYVelocity();
            } else {
                t tVar3 = (t) s.a.get(velocityTracker2);
                f11 = (tVar3 == null || i7 != 26) ? 0.0f : tVar3.c;
            }
            float f17 = f11 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f17);
            if (z9 || !(signum == Math.signum(vlVar.a) || signum == 0.0f)) {
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
                    nestedScrollView2.i((int) max);
                    f12 = max;
                }
                vlVar.a = f12;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action == 2 && this.x) {
            return true;
        }
        int i7 = action & qs.e4;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i10 = this.I;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.n) > this.F && (2 & getNestedScrollAxes()) == 0) {
                                this.x = true;
                                this.n = y10;
                                if (this.y == null) {
                                    this.y = VelocityTracker.obtain();
                                }
                                this.y.addMovement(motionEvent);
                                this.L = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        t(motionEvent);
                    }
                }
            }
            this.x = false;
            this.I = -1;
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.y = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            C(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.n = y11;
                    this.I = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.y;
                    if (velocityTracker2 == null) {
                        this.y = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.y.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!B(motionEvent) && this.d.isFinished()) {
                        z9 = false;
                    }
                    this.x = z9;
                    A(2, 0);
                }
            }
            if (!B(motionEvent) && this.d.isFinished()) {
                z9 = false;
            }
            this.x = z9;
            VelocityTracker velocityTracker3 = this.y;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.y = null;
            }
        }
        return this.x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = 0;
        this.r = false;
        View view = this.w;
        if (view != null && n(view, this)) {
            View view2 = this.w;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c10 = c(rect);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        }
        this.w = null;
        if (!this.s) {
            if (this.N != null) {
                scrollTo(getScrollX(), this.N.a);
                this.N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.D && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_30));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (z9) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        i((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.P.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        d(i7, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        q(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        r(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z9, boolean z10) {
        super.scrollTo(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = qs.O1;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus != null && p(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i7, rect);
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
        this.N = hVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.a = getScrollY();
        return hVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        g gVar = this.R;
        if (gVar != null) {
            ((qc0) gVar).a.J0(!r1.q1);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !p(findFocus, 0, i12)) {
            return;
        }
        Rect rect = this.c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int c10 = c(rect);
        if (c10 != 0) {
            if (this.E) {
                z(0, c10, false);
            } else {
                scrollBy(0, c10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return o(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float b10;
        int round;
        int i7;
        ViewParent parent2;
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.L = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        obtain.offsetLocation(0.0f, this.L);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.y;
                velocityTracker.computeCurrentVelocity(1000, this.H);
                int yVelocity = (int) velocityTracker.getYVelocity(this.I);
                if (Math.abs(yVelocity) >= this.G) {
                    if (lc.a(edgeEffect) != 0.0f) {
                        if (y(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (lc.a(edgeEffect2) != 0.0f) {
                        int i10 = -yVelocity;
                        if (y(edgeEffect2, i10)) {
                            edgeEffect2.onAbsorb(i10);
                        } else {
                            i(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!this.P.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            i(i11);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.I = -1;
                this.x = false;
                VelocityTracker velocityTracker2 = this.y;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.y = null;
                }
                C(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.I);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.I + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i12 = this.n - y10;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (lc.a(edgeEffect) != 0.0f) {
                        b10 = -lc.b(edgeEffect, -height, x10);
                        if (lc.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (lc.a(edgeEffect2) != 0.0f) {
                            b10 = lc.b(edgeEffect2, height, 1.0f - x10);
                            if (lc.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f10 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i7 = i12 - round;
                        if (!this.x && Math.abs(i7) > this.F) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.x = true;
                            i7 = i7 <= 0 ? i7 - this.F : i7 + this.F;
                        }
                        if (this.x) {
                            int x11 = x(i7, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.n = y10 - x11;
                            this.L += x11;
                        }
                    }
                    f10 = b10;
                    round = Math.round(f10 * getHeight());
                    if (round != 0) {
                    }
                    i7 = i12 - round;
                    if (!this.x) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.x = true;
                        if (i7 <= 0) {
                        }
                    }
                    if (this.x) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.x && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.I = -1;
                this.x = false;
                VelocityTracker velocityTracker3 = this.y;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.y = null;
                }
                C(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.I = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                t(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.I));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.x && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                a();
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.n = y11;
            this.I = pointerId;
            A(2, 0);
        }
        VelocityTracker velocityTracker4 = this.y;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(View view, int i7, int i10) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i10;
    }

    public final void q(int i7, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.P.d(0, scrollY2, 0, i7 - scrollY2, null, i10, iArr);
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        r0 r0Var = this.O;
        if (i10 == 1) {
            r0Var.b = i7;
        } else {
            r0Var.a = i7;
        }
        A(2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.r) {
            this.w = view2;
        } else {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c10 = c(rect);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c10 = c(rect);
        boolean z10 = c10 != 0;
        if (z10) {
            if (z9) {
                scrollBy(0, c10);
                return z10;
            }
            z(0, c10, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        VelocityTracker velocityTracker;
        if (z9 && (velocityTracker = this.y) != null) {
            velocityTracker.recycle();
            this.y = null;
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.r = true;
        super.requestLayout();
    }

    @Override // r0.k
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        d(i7, i10, i11, iArr, null);
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i7 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i10);
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.D) {
            this.D = z9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        j jVar = this.P;
        if (jVar.d) {
            ViewGroup viewGroup = jVar.c;
            WeakHashMap weakHashMap = i0.a;
            a0.j(viewGroup);
        }
        jVar.d = z9;
    }

    public void setOnScrollChangeListener(g gVar) {
        this.R = gVar;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.E = z9;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return A(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        C(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i7);
            this.I = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean u(int i7, int i10, int i11, int i12) {
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i7;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z9 = false;
        } else {
            i13 = 0;
            z9 = true;
        }
        if (i15 > i12) {
            i14 = i12;
        } else {
            if (i15 >= 0) {
                i14 = i15;
                z10 = false;
                if (z10 && !this.P.f(1)) {
                    this.d.springBack(i13, i14, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i13, i14);
                return !z9 || z10;
            }
            i14 = 0;
        }
        z10 = true;
        if (z10) {
            this.d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (z9) {
        }
    }

    public final void v(int i7) {
        boolean z9 = i7 == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z9) {
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
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        w(i7, i10, i11);
    }

    public final boolean w(int i7, int i10, int i11) {
        boolean z9;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z10 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
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
        if (i10 < scrollY || i11 > i12) {
            x(z10 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z9 = true;
        } else {
            z9 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i7);
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(int i7, int i10, MotionEvent motionEvent, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            A(2, i12);
        }
        boolean d = d(0, i7, i12, this.K, this.J);
        int[] iArr = this.J;
        int[] iArr2 = this.K;
        if (d) {
            i13 = i7 - iArr2[1];
            i14 = iArr[1];
        } else {
            i13 = i7;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z12 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z9;
        boolean z13 = u(i13, 0, scrollY, scrollRange) && !this.P.f(i12);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i10, scrollY2);
        }
        iArr2[1] = 0;
        e(0, scrollY2, 0, i13 - scrollY2, this.J, i12, iArr2);
        int i15 = i14 + iArr[1];
        int i16 = i13 - iArr2[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.e;
        if (i17 < 0) {
            if (z12) {
                lc.b(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            lc.b(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (motionEvent != null) {
                z10 = false;
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, false);
            } else {
                z10 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z11 = z10;
            } else {
                z11 = z13;
            }
            if (z11 && i12 == 0 && (velocityTracker = this.y) != null) {
                velocityTracker.clear();
            }
            if (i12 == 1) {
                C(i12);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i15;
        }
        z10 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z11 = z10;
        if (z11) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
        }
        return i15;
    }

    public final boolean y(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float a10 = lc.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i7) * 0.35f;
        float f10 = this.a * 0.015f;
        double log = Math.log(abs / f10);
        double d = T;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f10))) < a10;
    }

    public final void z(int i7, int i10, boolean z9) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, qs.Z3);
            if (z9) {
                A(2, 1);
            } else {
                C(1);
            }
            this.M = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.d.isFinished()) {
                a();
            }
            scrollBy(i7, i10);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.c = new Rect();
        this.r = true;
        this.s = false;
        this.w = null;
        this.x = false;
        this.E = true;
        this.I = -1;
        this.J = new int[2];
        this.K = new int[2];
        this.S = new vl(getContext(), new n(this));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.e = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f = edgeEffect2;
        this.a = com.google.android.recaptcha.internal.a.D(context.getResources().getDisplayMetrics().density, 160.0f, 386.0878f, 0.84f);
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.F = viewConfiguration.getScaledTouchSlop();
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.O = new r0();
        this.P = new j(this);
        setNestedScrollingEnabled(true);
        i0.j(this, U);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
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
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
