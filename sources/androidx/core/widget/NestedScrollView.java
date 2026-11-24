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
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements ti7 {
    public static final ni7 U = new ni7();
    public static final int[] V = {R.attr.fillViewport};
    public boolean E;
    public boolean F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public final int[] K;
    public final int[] L;
    public int M;
    public int N;
    public qi7 O;
    public final zw8 P;
    public final ri7 Q;
    public float R;
    public pi7 S;
    public final g52 T;
    public final float a;
    public long b;
    public final Rect c;
    public OverScroller d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public xq9 h;
    public int n;
    public boolean r;
    public boolean s;
    public View w;
    public boolean x;
    public VelocityTracker y;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.telegram.messenger.beta.R.attr.nestedScrollViewStyle);
        this.c = new Rect();
        this.r = true;
        this.s = false;
        this.w = null;
        this.x = false;
        this.F = true;
        this.J = -1;
        this.K = new int[2];
        this.L = new int[2];
        this.T = new g52(getContext(), new s34((Object) this, (byte) 18));
        int i = Build.VERSION.SDK_INT;
        this.e = i >= 31 ? ns3.a(context, attributeSet) : new EdgeEffect(context);
        this.f = i >= 31 ? ns3.a(context, attributeSet) : new EdgeEffect(context);
        this.a = yjb.C(context.getResources().getDisplayMetrics().density, 160.0f, 386.0878f, 0.84f);
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.G = viewConfiguration.getScaledTouchSlop();
        this.H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.I = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V, org.telegram.messenger.beta.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.P = new zw8((byte) 3);
        this.Q = new ri7(this);
        setNestedScrollingEnabled(true);
        jdc.k(this, U);
    }

    private xq9 getScrollFeedbackProvider() {
        xq9 xq9Var = this.h;
        if (xq9Var != null) {
            return xq9Var;
        }
        xq9 xq9Var2 = new xq9(this);
        this.h = xq9Var2;
        return xq9Var2;
    }

    public static boolean o(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && o((View) parent, nestedScrollView);
    }

    public boolean A(int i, int i2) {
        return this.Q.g(i, i2);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.e;
        if (wee.a(edgeEffect) != 0.0f) {
            wee.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (wee.a(edgeEffect2) == 0.0f) {
            return z;
        }
        wee.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void C(int i) {
        this.Q.h(i);
    }

    public final void a() {
        this.d.abortAnimation();
        C(1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            sc8.j("ScrollView can host only one direct child");
        }
    }

    public final boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !p(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            x(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            x(c(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
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
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void computeScroll() {
        int round;
        int i;
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int currY = this.d.getCurrY();
        int i2 = currY - this.N;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f;
        if (i2 <= 0 || wee.a(edgeEffect) == 0.0f) {
            if (i2 < 0 && wee.a(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(wee.b(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i2) {
                    edgeEffect2.finish();
                }
            }
            this.N = currY;
            int[] iArr = this.L;
            iArr[1] = 0;
            d(0, i2, 1, iArr, null);
            i = i2 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                oi7.a(this, Math.abs(this.d.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                u(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                f(0, scrollY2, 0, i3, this.K, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
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
        round = Math.round(wee.b(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect.finish();
        }
        i2 -= round;
        this.N = currY;
        int[] iArr2 = this.L;
        iArr2[1] = 0;
        d(0, i2, 1, iArr2, null);
        i = i2 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
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

    public boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.Q.c(i, i2, i3, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || h(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.Q.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.Q.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.Q.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
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
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.Q.d(0, i2, 0, i4, iArr, i5, iArr2);
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
        return this.P.b();
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
        float f = this.R;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            sc8.j("Expected theme to define listPreferredItemHeight.");
            return 0.0f;
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.R = dimension;
        return dimension;
    }

    public final boolean h(KeyEvent keyEvent) {
        this.c.setEmpty();
        int childCount = getChildCount();
        int i = kk7.N1;
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
                        return keyEvent.isAltPressed() ? j(kk7.N1) : b(kk7.N1);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        v(i);
                        return false;
                    }
                    if (keyCode == 92) {
                        return j(33);
                    }
                    if (keyCode == 93) {
                        return j(kk7.N1);
                    }
                    if (keyCode == 122) {
                        v(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        v(kk7.N1);
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
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, kk7.N1);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(kk7.N1)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.Q.f(0);
    }

    public void i(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, TLObject.FLAG_31, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
            A(2, 1);
            this.N = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                oi7.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.Q.d;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return w(i, rect.top, rect.bottom);
    }

    @Override // si7
    public final void k(int i, View view) {
        zw8 zw8Var = this.P;
        if (i == 1) {
            zw8Var.c = 0;
        } else {
            zw8Var.b = 0;
        }
        C(i);
    }

    @Override // ti7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        s(i4, i5, iArr);
    }

    @Override // si7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        s(i4, i5, null);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), 0);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // si7
    public final boolean n(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0129, code lost:
    
        if (r7 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00de, code lost:
    
        if (r8 >= 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int[] iArr;
        float f2;
        float f3;
        long j;
        int i6;
        float f4;
        float sqrt;
        int[] iArr2;
        float f5;
        if (motionEvent.getAction() != 8 || this.x) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & TLObject.FLAG_22) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        x(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            g52 g52Var = this.T;
            NestedScrollView nestedScrollView = (NestedScrollView) ((s34) g52Var.f).b;
            int[] iArr3 = (int[]) g52Var.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (g52Var.c == source && g52Var.d == deviceId && g52Var.b == i) {
                z2 = false;
                z = true;
                i3 = 0;
            } else {
                Context context = (Context) g52Var.e;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i3 = 0;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    Method method = kdc.a;
                    i4 = t4.j(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = kdc.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i4 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                iArr3[0] = i4;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i7 >= 34) {
                    i5 = t4.i(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i5 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i5 = Integer.MIN_VALUE;
                }
                iArr3[1] = i5;
                g52Var.c = source;
                g52Var.d = deviceId;
                g52Var.b = i;
                z2 = true;
            }
            int i8 = iArr3[i3];
            VelocityTracker velocityTracker = (VelocityTracker) g52Var.g;
            if (i8 == Integer.MAX_VALUE) {
                if (velocityTracker == null) {
                    return z;
                }
                velocityTracker.recycle();
                g52Var.g = null;
                return z;
            }
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                g52Var.g = velocityTracker;
            }
            Map map = t9c.a;
            velocityTracker.addMovement(motionEvent);
            char c = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = t9c.a;
                if (!map2.containsKey(velocityTracker)) {
                    map2.put(velocityTracker, new u9c());
                }
                u9c u9cVar = (u9c) map2.get(velocityTracker);
                long[] jArr = u9cVar.b;
                long eventTime = motionEvent.getEventTime();
                int i9 = u9cVar.d;
                if (i9 != 0 && eventTime - jArr[u9cVar.e] > 40) {
                    u9cVar.d = i3;
                    u9cVar.c = 0.0f;
                    i9 = 0;
                }
                int i10 = (u9cVar.e + 1) % 20;
                u9cVar.e = i10;
                if (i9 != 20) {
                    u9cVar.d = i9 + 1;
                }
                u9cVar.a[i10] = motionEvent.getAxisValue(26);
                jArr[u9cVar.e] = eventTime;
            }
            velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
            u9c u9cVar2 = (u9c) t9c.a.get(velocityTracker);
            if (u9cVar2 != null) {
                float[] fArr = u9cVar2.a;
                long[] jArr2 = u9cVar2.b;
                int i11 = u9cVar2.d;
                if (i11 < 2) {
                    iArr = iArr3;
                    f4 = Float.MAX_VALUE;
                } else {
                    int i12 = u9cVar2.e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j2 = jArr2[i12];
                    while (true) {
                        j = jArr2[i13];
                        long j3 = j2 - j;
                        char c2 = c;
                        i6 = u9cVar2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        u9cVar2.d = i6 - 1;
                        i13 = (i13 + 1) % 20;
                        c = c2;
                    }
                    f4 = Float.MAX_VALUE;
                    if (i6 >= 2) {
                        if (i6 == 2) {
                            int i14 = (i13 + 1) % 20;
                            if (j != jArr2[i14]) {
                                iArr = iArr3;
                                sqrt = fArr[i14] / (r11 - j);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 >= u9cVar2.d - 1) {
                                    break;
                                }
                                int i17 = i15 + i13;
                                long j4 = jArr2[i17 % 20];
                                int i18 = (i17 + 1) % 20;
                                if (jArr2[i18] == j4) {
                                    iArr2 = iArr3;
                                } else {
                                    i16++;
                                    iArr2 = iArr3;
                                    float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f6)));
                                    float f7 = fArr[i18] / (jArr2[i18] - j4);
                                    float abs = (Math.abs(f7) * (f7 - sqrt2)) + f6;
                                    if (i16 == z) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i15++;
                                iArr3 = iArr2;
                                z = true;
                            }
                            iArr = iArr3;
                            sqrt = ((float) Math.sqrt(Math.abs(r24) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                        }
                        f5 = sqrt * 1000.0f;
                        u9cVar2.c = f5;
                        if (f5 >= -3.4028235E38f) {
                            u9cVar2.c = -3.4028235E38f;
                        } else if (f5 > f4) {
                            u9cVar2.c = f4;
                        }
                    }
                    iArr = iArr3;
                }
                sqrt = 0.0f;
                f5 = sqrt * 1000.0f;
                u9cVar2.c = f5;
                if (f5 >= -3.4028235E38f) {
                }
            } else {
                iArr = iArr3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f2 = t4.f(velocityTracker, i);
            } else if (i == 0) {
                f2 = velocityTracker.getXVelocity();
            } else if (i == 1) {
                f2 = velocityTracker.getYVelocity();
            } else {
                u9c u9cVar3 = (u9c) t9c.a.get(velocityTracker);
                f2 = (u9cVar3 == null || i != 26) ? 0.0f : u9cVar3.c;
            }
            float f8 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f8);
            if (z2 || (signum != Math.signum(g52Var.a) && signum != 0.0f)) {
                nestedScrollView.d.abortAnimation();
            }
            if (Math.abs(f8) >= iArr[0]) {
                float max = Math.max(-r3, Math.min(f8, iArr[1]));
                if (max == 0.0f) {
                    f3 = 0.0f;
                } else {
                    nestedScrollView.d.abortAnimation();
                    nestedScrollView.i((int) max);
                    f3 = max;
                }
                g52Var.a = f3;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.x) {
            return true;
        }
        int i = action & kk7.d4;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.J;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.n) > this.G && (getNestedScrollAxes() & 2) == 0) {
                                this.x = true;
                                this.n = y;
                                VelocityTracker velocityTracker = this.y;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.y = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.M = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        t(motionEvent);
                    }
                }
            }
            this.x = false;
            this.J = -1;
            VelocityTracker velocityTracker2 = this.y;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.y = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            C(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.n = y2;
                    this.J = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.y;
                    if (velocityTracker3 == null) {
                        this.y = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.y.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!B(motionEvent) && this.d.isFinished()) {
                        z = false;
                    }
                    this.x = z;
                    A(2, 0);
                }
            }
            if (!B(motionEvent) && this.d.isFinished()) {
                z = false;
            }
            this.x = z;
            VelocityTracker velocityTracker4 = this.y;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.y = null;
            }
        }
        return this.x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.r = false;
        View view = this.w;
        if (view != null && o(view, this)) {
            View view2 = this.w;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c = c(rect);
            if (c != 0) {
                scrollBy(0, c);
            }
        }
        this.w = null;
        if (!this.s) {
            if (this.O != null) {
                scrollTo(getScrollX(), this.O.a);
                this.O = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.E || View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
        if (measuredHeight < measuredHeight2) {
            childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, TLObject.FLAG_30));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        i((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.Q.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        s(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        q(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = kk7.N1;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || !p(findNextFocus, 0, getHeight())) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qi7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qi7 qi7Var = (qi7) parcelable;
        super.onRestoreInstanceState(qi7Var.getSuperState());
        this.O = qi7Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        qi7 qi7Var = new qi7(super.onSaveInstanceState());
        qi7Var.a = getScrollY();
        return qi7Var;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        pi7 pi7Var = this.S;
        if (pi7Var != null) {
            ((r38) pi7Var).a.E0(!r0.t1);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !p(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int c = c(rect);
        if (c != 0) {
            if (this.F) {
                z(0, c, false);
            } else {
                scrollBy(0, c);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return n(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float b;
        int round;
        if (this.y == null) {
            this.y = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.M);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.y;
                velocityTracker.computeCurrentVelocity(1000, this.I);
                int yVelocity = (int) velocityTracker.getYVelocity(this.J);
                if (Math.abs(yVelocity) >= this.H) {
                    if (wee.a(edgeEffect) == 0.0f) {
                        int i = -yVelocity;
                        if (wee.a(edgeEffect2) == 0.0f) {
                            float f2 = i;
                            if (!this.Q.b(0.0f, f2)) {
                                dispatchNestedFling(0.0f, f2, true);
                                i(i);
                            }
                        } else if (y(edgeEffect2, i)) {
                            edgeEffect2.onAbsorb(i);
                        } else {
                            i(i);
                        }
                    } else if (y(edgeEffect, yVelocity)) {
                        edgeEffect.onAbsorb(yVelocity);
                    } else {
                        i(-yVelocity);
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.J = -1;
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
                int findPointerIndex = motionEvent.findPointerIndex(this.J);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.J + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.n - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i2 / getHeight();
                    if (wee.a(edgeEffect) != 0.0f) {
                        b = -wee.b(edgeEffect, -height, x);
                        if (wee.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (wee.a(edgeEffect2) != 0.0f) {
                            b = wee.b(edgeEffect2, height, 1.0f - x);
                            if (wee.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i3 = i2 - round;
                        if (!this.x) {
                            int abs = Math.abs(i3);
                            int i4 = this.G;
                            if (abs > i4) {
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.x = true;
                                i3 = i3 > 0 ? i3 - i4 : i3 + i4;
                            }
                        }
                        if (this.x) {
                            int x2 = x(i3, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.n = y - x2;
                            this.M += x2;
                        }
                    }
                    f = b;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    int i32 = i2 - round;
                    if (!this.x) {
                    }
                    if (this.x) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.x && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.J = -1;
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
                this.J = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                t(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.J));
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
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.n = y2;
            this.J = pointerId;
            A(2, 0);
        }
        VelocityTracker velocityTracker4 = this.y;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(View view, int i, int i2) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // si7
    public final void q(View view, View view2, int i, int i2) {
        zw8 zw8Var = this.P;
        if (i2 == 1) {
            zw8Var.c = i;
        } else {
            zw8Var.b = i;
        }
        A(2, i2);
    }

    @Override // si7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        d(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.r) {
            this.w = view2;
        } else {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c = c(rect);
            if (c != 0) {
                scrollBy(0, c);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c = c(rect);
        boolean z2 = c != 0;
        if (z2) {
            if (z) {
                scrollBy(0, c);
                return z2;
            }
            z(0, c, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.y) != null) {
            velocityTracker.recycle();
            this.y = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.r = true;
        super.requestLayout();
    }

    public final void s(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.Q.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.E) {
            this.E = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        ri7 ri7Var = this.Q;
        if (ri7Var.d) {
            ViewGroup viewGroup = ri7Var.c;
            WeakHashMap weakHashMap = jdc.a;
            bdc.j(viewGroup);
        }
        ri7Var.d = z;
    }

    public void setOnScrollChangeListener(pi7 pi7Var) {
        this.S = pi7Var;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.F = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return A(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        C(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i);
            this.J = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean u(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 > 0 || i2 < 0) {
            i5 = 0;
            z = true;
        } else {
            i5 = i2;
            z = false;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.Q.f(1)) {
                    this.d.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void v(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z) {
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
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        w(i, i2, i3);
    }

    public final boolean w(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = !z2 ? bottom <= view.getBottom() : top >= view.getTop();
                    if (!z3) {
                        if (z4) {
                            z3 = true;
                        } else if (!z5) {
                        }
                        view = view2;
                    } else if (z4) {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            x(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            A(2, i4);
        }
        boolean d = d(0, i, i4, this.L, this.K);
        int[] iArr = this.K;
        int[] iArr2 = this.L;
        if (d) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = u(i5, 0, scrollY, scrollRange) && !this.Q.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        f(0, scrollY2, 0, i5 - scrollY2, this.K, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f;
        EdgeEffect edgeEffect2 = this.e;
        if (i9 < 0) {
            if (z4) {
                wee.b(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            wee.b(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                z2 = false;
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            } else {
                z2 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.y) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                C(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z3 = z2;
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    public final boolean y(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float a = wee.a(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        return ((float) (Math.exp(1.7362676463664735d * Math.log((double) (abs / f))) * ((double) f))) < a;
    }

    public final void z(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, kk7.Y3);
            if (z) {
                A(2, 1);
            } else {
                C(1);
            }
            this.N = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.d.isFinished()) {
                a();
            }
            scrollBy(i, i2);
        }
        this.b = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            sc8.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            sc8.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            sc8.j("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
