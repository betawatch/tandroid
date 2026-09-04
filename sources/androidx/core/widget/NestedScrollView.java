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
import b2.q0;
import com.google.android.gms.internal.vision.e2;
import g1.a;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import ji.u4;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import r0.a0;
import r0.i0;
import r0.j0;
import r0.k;
import r0.m;
import r0.s;
import r0.t;
import r0.u;
import u0.c;
import u0.e;
import u0.f;
import u0.g;
import u0.h;
import w7.o7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m {
    public static final float T = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final e U = new e();
    public static final int[] V = {R.attr.fillViewport};
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
    public final q0 O;
    public final k P;
    public float Q;
    public g R;
    public final r0.h S;
    public final float a;
    public long b;
    public final Rect c;
    public OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public s h;
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

    private s getScrollFeedbackProvider() {
        if (this.h == null) {
            this.h = new s(this);
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
        boolean z10;
        EdgeEffect edgeEffect = this.e;
        if (o7.a(edgeEffect) != 0.0f) {
            o7.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (o7.a(edgeEffect2) == 0.0f) {
            return z10;
        }
        o7.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void B(int i10) {
        this.P.h(i10);
    }

    @Override // r0.l
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

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
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
        int i11 = currY - this.M;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f;
        if (i11 <= 0 || o7.a(edgeEffect) == 0.0f) {
            if (i11 < 0 && o7.a(edgeEffect2) != 0.0f) {
                float f7 = height;
                round = Math.round(o7.b(edgeEffect2, (i11 * 4.0f) / f7, 0.5f) * (f7 / 4.0f));
                if (round != i11) {
                    edgeEffect2.finish();
                }
            }
            this.M = currY;
            int[] iArr = this.K;
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
                h(0, scrollY2, 0, i12, this.J, 1, iArr);
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
        round = Math.round(o7.b(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i11) {
            edgeEffect.finish();
        }
        i11 -= round;
        this.M = currY;
        int[] iArr2 = this.K;
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
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f10, boolean z10) {
        return this.P.a(f7, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f10) {
        return this.P.b(f7, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return g(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.P.d(i10, i11, i12, i13, iArr, 0, null);
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
        if (findNextFocus == null || !o(findNextFocus, maxScrollAmount, getHeight())) {
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
        if (view != null && view.isFocused() && !o(view, 0, getHeight())) {
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
        return this.P.c(i10, i11, i12, iArr, iArr2);
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
        q0 q0Var = this.O;
        return q0Var.b | q0Var.a;
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

    public void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.P.d(0, i11, 0, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.P.f(0);
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        q(i13, i14, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.P.d;
    }

    public final boolean j(KeyEvent keyEvent) {
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

    public void k(int i10) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
            z(2, 1);
            this.M = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
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

    @Override // r0.l
    public final void n(int i10, View view) {
        q0 q0Var = this.O;
        if (i10 == 1) {
            q0Var.b = 0;
        } else {
            q0Var.a = 0;
        }
        B(i10);
    }

    public final boolean o(View view, int i10, int i11) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
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
        float f7;
        int i10;
        int i11;
        char c10;
        int i12;
        int i13;
        boolean z10;
        NestedScrollView nestedScrollView;
        float f10;
        NestedScrollView nestedScrollView2;
        float f11;
        long j3;
        float f12;
        float sqrt;
        NestedScrollView nestedScrollView3;
        float f13;
        if (motionEvent.getAction() != 8 || this.w) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i11 = (int) motionEvent.getX();
            f7 = axisValue;
            i10 = 9;
        } else if ((motionEvent.getSource() & TLObject.FLAG_22) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i11 = getWidth() / 2;
            f7 = axisValue2;
            i10 = 26;
        } else {
            f7 = 0.0f;
            i10 = 0;
            i11 = 0;
        }
        if (f7 == 0.0f) {
            return false;
        }
        w(-((int) (getVerticalScrollFactorCompat() * f7)), i10, motionEvent, i11, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 != 0) {
            r0.h hVar = this.S;
            NestedScrollView nestedScrollView4 = (NestedScrollView) hVar.b.b;
            int[] iArr = hVar.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (hVar.f == source && hVar.g == deviceId && hVar.e == i10) {
                z10 = false;
                c10 = 0;
            } else {
                Context context = hVar.a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                c10 = 0;
                int source2 = motionEvent.getSource();
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 34) {
                    Method method = j0.a;
                    i12 = a.j(viewConfiguration, deviceId2, i10, source2);
                } else {
                    Method method2 = j0.a;
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
                hVar.f = source;
                hVar.g = deviceId;
                hVar.e = i10;
                z10 = true;
            }
            if (iArr[c10] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = hVar.c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                hVar.c = null;
                return true;
            }
            if (hVar.c == null) {
                hVar.c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = hVar.c;
            Map map = t.a;
            velocityTracker2.addMovement(motionEvent);
            int i15 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = t.a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new u());
                }
                u uVar = (u) map2.get(velocityTracker2);
                long[] jArr = uVar.b;
                long eventTime = motionEvent.getEventTime();
                if (uVar.d != 0 && eventTime - jArr[uVar.e] > 40) {
                    uVar.d = 0;
                    uVar.c = 0.0f;
                }
                int i16 = (uVar.e + 1) % 20;
                uVar.e = i16;
                int i17 = uVar.d;
                if (i17 != 20) {
                    uVar.d = i17 + 1;
                }
                uVar.a[i16] = motionEvent.getAxisValue(26);
                jArr[uVar.e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, Float.MAX_VALUE);
            u uVar2 = (u) t.a.get(velocityTracker2);
            if (uVar2 != null) {
                float[] fArr = uVar2.a;
                long[] jArr2 = uVar2.b;
                int i18 = uVar2.d;
                if (i18 >= 2) {
                    int i19 = uVar2.e;
                    int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                    long j10 = jArr2[i19];
                    while (true) {
                        j3 = jArr2[i20];
                        if (j10 - j3 <= 100) {
                            break;
                        }
                        uVar2.d--;
                        i20 = (i20 + 1) % 20;
                    }
                    int i21 = uVar2.d;
                    if (i21 >= 2) {
                        if (i21 == 2) {
                            int i22 = (i20 + 1) % 20;
                            if (j3 != jArr2[i22]) {
                                nestedScrollView = nestedScrollView4;
                                sqrt = fArr[i22] / (r12 - j3);
                                f12 = Float.MAX_VALUE;
                            }
                        } else {
                            f12 = Float.MAX_VALUE;
                            float f14 = 0.0f;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                if (i23 >= uVar2.d - 1) {
                                    break;
                                }
                                int i25 = i23 + i20;
                                long j11 = jArr2[i25 % 20];
                                int i26 = (i25 + 1) % i15;
                                if (jArr2[i26] == j11) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i24++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f14 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                                    float f15 = fArr[i26] / (jArr2[i26] - j11);
                                    float abs = (Math.abs(f15) * (f15 - sqrt2)) + f14;
                                    if (i24 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f14 = abs;
                                }
                                i23++;
                                nestedScrollView4 = nestedScrollView3;
                                i15 = 20;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * (f14 < 0.0f ? -1.0f : 1.0f);
                        }
                        f13 = sqrt * MediaDataController.MAX_STYLE_RUNS_COUNT;
                        uVar2.c = f13;
                        if (f13 >= (-Math.abs(f12))) {
                            uVar2.c = -Math.abs(f12);
                        } else if (uVar2.c > Math.abs(f12)) {
                            uVar2.c = Math.abs(f12);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f12 = Float.MAX_VALUE;
                sqrt = 0.0f;
                f13 = sqrt * MediaDataController.MAX_STYLE_RUNS_COUNT;
                uVar2.c = f13;
                if (f13 >= (-Math.abs(f12))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f10 = a.f(velocityTracker2, i10);
            } else if (i10 == 0) {
                f10 = velocityTracker2.getXVelocity();
            } else if (i10 == 1) {
                f10 = velocityTracker2.getYVelocity();
            } else {
                u uVar3 = (u) t.a.get(velocityTracker2);
                f10 = (uVar3 == null || i10 != 26) ? 0.0f : uVar3.c;
            }
            float f16 = f10 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f16);
            if (z10 || !(signum == Math.signum(hVar.d) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f16) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f16, iArr[1]));
                if (max == 0.0f) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView2.d.abortAnimation();
                    nestedScrollView2.k((int) max);
                    f11 = max;
                }
                hVar.d = f11;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.w) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.I;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.n) > this.F && (2 & getNestedScrollAxes()) == 0) {
                                this.w = true;
                                this.n = y3;
                                if (this.x == null) {
                                    this.x = VelocityTracker.obtain();
                                }
                                this.x.addMovement(motionEvent);
                                this.L = 0;
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
            this.I = -1;
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
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 >= childAt.getTop() - scrollY && y10 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.n = y10;
                    this.I = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.x;
                    if (velocityTracker2 == null) {
                        this.x = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.x.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!A(motionEvent) && this.d.isFinished()) {
                        z10 = false;
                    }
                    this.w = z10;
                    z(2, 0);
                }
            }
            if (!A(motionEvent) && this.d.isFinished()) {
                z10 = false;
            }
            this.w = z10;
            VelocityTracker velocityTracker3 = this.x;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.x = null;
            }
        }
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.r = false;
        View view = this.v;
        if (view != null && m(view, this)) {
            View view2 = this.v;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int f7 = f(rect);
            if (f7 != 0) {
                scrollBy(0, f7);
            }
        }
        this.v = null;
        if (!this.s) {
            if (this.N != null) {
                scrollTo(getScrollX(), this.N.a);
                this.N = null;
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
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        k((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return this.P.b(f7, f10);
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
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
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
        if (findNextFocus != null && o(findNextFocus, 0, getHeight())) {
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
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        g gVar = this.R;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !o(findFocus, 0, i13)) {
            return;
        }
        Rect rect = this.c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int f7 = f(rect);
        if (f7 != 0) {
            if (this.E) {
                y(0, f7, false);
            } else {
                scrollBy(0, f7);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return p(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        n(0, view);
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
            this.L = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f7 = 0.0f;
        obtain.offsetLocation(0.0f, this.L);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.x;
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.H);
                int yVelocity = (int) velocityTracker.getYVelocity(this.I);
                if (Math.abs(yVelocity) >= this.G) {
                    if (o7.a(edgeEffect) != 0.0f) {
                        if (x(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (o7.a(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (x(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            k(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f10 = i12;
                        if (!this.P.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            k(i12);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.I = -1;
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
                int findPointerIndex = motionEvent.findPointerIndex(this.I);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.I + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i13 = this.n - y3;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (o7.a(edgeEffect) != 0.0f) {
                        b10 = -o7.b(edgeEffect, -height, x10);
                        if (o7.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (o7.a(edgeEffect2) != 0.0f) {
                            b10 = o7.b(edgeEffect2, height, 1.0f - x10);
                            if (o7.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f7 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i10 = i13 - round;
                        if (!this.w && Math.abs(i10) > this.F) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.w = true;
                            i10 = i10 <= 0 ? i10 - this.F : i10 + this.F;
                        }
                        if (this.w) {
                            int w10 = w(i10, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.n = y3 - w10;
                            this.L += w10;
                        }
                    }
                    f7 = b10;
                    round = Math.round(f7 * getHeight());
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
                this.I = -1;
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
                this.I = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                r(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.I));
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
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.n = y10;
            this.I = pointerId;
            z(2, 0);
        }
        VelocityTracker velocityTracker4 = this.x;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // r0.l
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
        this.P.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i10);
            this.I = motionEvent.getPointerId(i10);
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
            int f7 = f(rect);
            if (f7 != 0) {
                scrollBy(0, f7);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int f7 = f(rect);
        boolean z11 = f7 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f7);
                return z11;
            }
            y(0, f7, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.x) != null) {
            velocityTracker.recycle();
            this.x = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.r = true;
        super.requestLayout();
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        q0 q0Var = this.O;
        if (i11 == 1) {
            q0Var.b = i10;
        } else {
            q0Var.a = i10;
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

    public void setFillViewport(boolean z10) {
        if (z10 != this.y) {
            this.y = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        k kVar = this.P;
        if (kVar.d) {
            ViewGroup viewGroup = kVar.c;
            WeakHashMap weakHashMap = i0.a;
            a0.k(viewGroup);
        }
        kVar.d = z10;
    }

    public void setOnScrollChangeListener(g gVar) {
        this.R = gVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.E = z10;
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
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            z10 = true;
            i14 = 0;
        }
        if (i16 > i13) {
            i15 = i13;
            z11 = true;
        } else if (i16 < 0) {
            z11 = true;
            i15 = 0;
        } else {
            i15 = i16;
            z11 = false;
        }
        if (z11 && !this.P.f(1)) {
            this.d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        return z10 || z11;
    }

    public final void u(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z10) {
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
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            w(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            z(2, i13);
        }
        boolean g10 = g(0, i10, i13, this.K, this.J);
        int[] iArr = this.J;
        int[] iArr2 = this.K;
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
        boolean z12 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z13 = t(i14, 0, scrollY, scrollRange) && !this.P.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        h(0, scrollY2, 0, i14 - scrollY2, this.J, i13, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.e;
        if (i18 < 0) {
            if (z12) {
                o7.b(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i18 > scrollRange && z12) {
            o7.b(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z11 = false;
            } else {
                z11 = z13;
            }
            if (z11 && i13 == 0 && (velocityTracker = this.x) != null) {
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
        z11 = false;
        if (z11) {
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
        float a2 = o7.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f7 = this.a * 0.015f;
        double log = Math.log(abs / f7);
        double d = T;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f7))) < a2;
    }

    public final void y(int i10, int i11, boolean z10) {
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
            if (z10) {
                z(2, 1);
            } else {
                B(1);
            }
            this.M = getScrollY();
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
        return this.P.g(i10, i11);
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
        this.E = true;
        this.I = -1;
        this.J = new int[2];
        this.K = new int[2];
        this.S = new r0.h(getContext(), new u4(this, 26));
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
        this.a = e2.C(context.getResources().getDisplayMetrics().density, 160.0f, 386.0878f, 0.84f);
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.F = viewConfiguration.getScaledTouchSlop();
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.O = new q0();
        this.P = new k(this);
        setNestedScrollingEnabled(true);
        i0.k(this, U);
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
