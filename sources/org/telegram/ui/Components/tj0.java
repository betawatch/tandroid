package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class tj0 extends RecyclerView implements fh.a {
    public static int[] Z2;
    public static boolean a3;
    public static final Method b3;
    public static final Paint c3;
    public static final Path d3;
    public static final float[] e3;
    public boolean A1;
    public int A2;
    public int B1;
    public boolean B2;
    public org.telegram.ui.Cells.y C1;
    public boolean C2;
    public int D1;
    public final lt D2;
    public View E1;
    public final os E2;
    public final Rect F1;
    public Matrix F2;
    public boolean G1;
    public boolean G2;
    public int H1;
    public dj0 H2;
    public boolean I1;
    public org.telegram.messenger.v10 I2;
    public boolean J1;
    public org.telegram.messenger.v10 J2;
    public boolean K1;
    public zw K2;
    public y00 L1;
    public ArrayList L2;
    public View M1;
    public float M2;
    public int N1;
    public float[] N2;
    public boolean O1;
    public float[] O2;
    public boolean P1;
    public int P2;
    public boolean Q1;
    public boolean Q2;
    public kj0 R1;
    public int R2;
    public boolean S1;
    public p9 S2;
    public boolean T0;
    public cj0 T1;
    public boolean T2;
    public fj0 U0;
    public jb0 U1;
    public boolean U2;
    public gj0 V0;
    public boolean V1;
    public rj0 V2;
    public hj0 W0;
    public boolean W1;
    public int W2;
    public ij0 X0;
    public boolean X1;
    public ArrayList X2;
    public boolean Y0;
    public int Y1;
    public final Path Y2;
    public u4.t0 Z0;
    public int Z1;
    public ej0 a1;
    public int a2;
    public View b1;
    public int b2;
    public ai.o2 c1;
    public boolean c2;
    public jj0 d1;
    public boolean d2;
    public yi0 e1;
    public int e2;
    public oj0 f1;
    public int f2;
    public boolean g1;
    public m.b3 g2;
    public boolean h1;
    public boolean h2;
    public boolean i1;
    public boolean i2;
    public boolean j1;
    public float j2;
    public Drawable k1;
    public float k2;
    public float l1;
    public int[] l2;
    public float m1;
    public wi0 m2;
    public long n1;
    public q0.a n2;
    public ArrayList o1;
    public final org.telegram.ui.ActionBar.e6 o2;
    public ArrayList p1;
    public boolean p2;
    public View q1;
    public final wd q2;
    public int r1;
    public boolean r2;
    public int s1;
    public final kg.j1 s2;
    public int t1;
    public Paint t2;
    public int u1;
    public boolean u2;
    public int v1;
    public int v2;
    public boolean w1;
    public org.telegram.messenger.e9 w2;
    public int x1;
    public int x2;
    public boolean y1;
    public int y2;
    public boolean z1;
    public boolean z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        b3 = method;
        c3 = new Paint(1);
        new Paint(1);
        d3 = new Path();
        e3 = new float[8];
    }

    public tj0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a1(View view) {
        if (!(view instanceof nj0)) {
            return false;
        }
        ws0 ws0Var = (ws0) ((nj0) view);
        return ws0Var.c2 && ws0Var.g2 > 0;
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float v1(View view) {
        return view.getTag(R.id.dragging) != null ? view.getTop() : view.getY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void C0() {
        try {
            super.C0();
        } catch (NullPointerException unused) {
        }
    }

    public final void D0(Runnable runnable) {
        this.E2.b.add(new ls(runnable, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f10, float f11) {
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < 2) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.q1) && !(childAt instanceof org.telegram.ui.Cells.t0)) || childAt.getVisibility() != 4) {
                    float translationX = i3 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i3 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i3++;
        }
        return null;
    }

    public boolean E0(float f10) {
        return true;
    }

    public boolean F0(View view) {
        return true;
    }

    public boolean H0(View view, float f10, float f11) {
        return true;
    }

    public final void I0(boolean z10) {
        jj0 jj0Var = this.d1;
        if (jj0Var != null) {
            org.telegram.messenger.g0.r(jj0Var);
            this.d1 = null;
        }
        View view = this.M1;
        if (view != null) {
            if (z10) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.M1 = null;
            m1(view, null);
        }
        this.F1.setEmpty();
        kj0 kj0Var = this.R1;
        if (kj0Var != null) {
            org.telegram.messenger.g0.r(kj0Var);
            this.R1 = null;
        }
        this.O1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i3 = 0; i3 < itemDecorationCount; i3++) {
            Object X = X(i3);
            if ((X instanceof fh.a) && ((X != this.H2 && X != this.S2) || this.G2)) {
                ((fh.a) X).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y9 = childAt.getY();
            if (rectF.intersects(x10, y9, childAt.getWidth() + x10, childAt.getHeight() + y9)) {
                this.B2 = true;
                drawChild(canvas, childAt, j10);
                this.B2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
        if (this.h1) {
            return;
        }
        if (getAdapter() == null || this.b1 == null) {
            if (!this.V1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.V1 = false;
            return;
        }
        boolean R0 = R0();
        int i3 = R0 ? 0 : 8;
        if (!this.X1 || !org.telegram.messenger.az.c()) {
            z10 = false;
        }
        if (!z10) {
            this.A2 = i3;
            this.b1.setVisibility(i3);
            this.b1.setAlpha(1.0f);
        } else if (this.A2 != i3) {
            this.A2 = i3;
            if (i3 == 0) {
                this.b1.animate().setListener(null).cancel();
                if (this.b1.getVisibility() == 8) {
                    this.b1.setVisibility(0);
                    this.b1.setAlpha(0.0f);
                    if (this.Y1 == 1) {
                        this.b1.setScaleX(0.7f);
                        this.b1.setScaleY(0.7f);
                    }
                }
                this.b1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.b1.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.b1.animate().alpha(0.0f);
                if (this.Y1 == 1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new a60(this, 14)).start();
            }
        }
        if (this.z1) {
            if (b1() && this.U2) {
                return;
            }
            int i10 = R0 ? 4 : 0;
            if (getVisibility() != i10) {
                setVisibility(i10);
            }
            this.V1 = true;
        }
    }

    public final void L0(boolean z10) {
        yi0 yi0Var;
        u4.d1 T;
        yi0 yi0Var2;
        View view;
        u4.d1 T2;
        int b10;
        int S;
        if (((this.J1 || z10) && this.e1 != null) || !(this.x1 == 0 || this.f1 == null)) {
            u4.o0 layoutManager = getLayoutManager();
            if (layoutManager instanceof u4.b0) {
                u4.b0 b0Var = (u4.b0) layoutManager;
                if (b0Var.o == 1) {
                    if (this.f1 == null) {
                        int L0 = b0Var.L0();
                        Math.abs(b0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.J1 && !z10) || (yi0Var = this.e1) == null || yi0Var.n) {
                            return;
                        }
                        u4.h0 adapter = getAdapter();
                        if (adapter instanceof zi0) {
                            zi0 zi0Var = (zi0) adapter;
                            float H = zi0Var.H(this);
                            this.e1.setIsVisible(zi0Var.E(this));
                            this.e1.setProgress(Math.min(1.0f, H));
                            this.e1.b(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.x1 == 1 ? 0 : getPaddingTop();
                    int i3 = this.x1;
                    float f10 = 32.0f;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i3 != 1 && i3 != 3) {
                        if (i3 == 2) {
                            this.m1 = 0.0f;
                            if (this.f1.b() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            int i11 = 0;
                            int i12 = Integer.MAX_VALUE;
                            View view2 = null;
                            View view3 = null;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = getChildAt(i13);
                                int bottom = childAt.getBottom();
                                if (bottom > this.v1 + paddingTop) {
                                    if (bottom < i10) {
                                        view3 = childAt;
                                        i10 = bottom;
                                    }
                                    i11 = Math.max(i11, bottom);
                                    if (bottom >= org.telegram.messenger.g0.L(32.0f) + this.v1 + paddingTop && bottom < i12) {
                                        view2 = childAt;
                                        i12 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T2 = T(view3)) == null || (S = this.f1.S((b10 = T2.b()))) < 0) {
                                return;
                            }
                            if (this.r1 != S || this.q1 == null) {
                                View view4 = this.q1;
                                boolean z11 = view4 == null;
                                View T3 = this.f1.T(S, view4);
                                if (z11) {
                                    S0(T3, false);
                                }
                                this.q1 = T3;
                                T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.q1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.q1.getMeasuredHeight());
                                this.r1 = S;
                            }
                            if (this.q1 != null && view2 != null && view2.getClass() != this.q1.getClass()) {
                                this.m1 = 1.0f;
                            }
                            int M = this.f1.M(S);
                            int Q = this.f1.Q(b10);
                            int i14 = (i11 == 0 || i11 >= getMeasuredHeight() - getPaddingBottom()) ? this.v1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.q1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.v1);
                                int i15 = height2 < height ? height2 - height : paddingTop;
                                if (i15 < 0) {
                                    this.q1.setTag(Integer.valueOf(paddingTop + i14 + i15));
                                } else {
                                    this.q1.setTag(Integer.valueOf(paddingTop + i14));
                                }
                            } else {
                                this.q1.setTag(Integer.valueOf(paddingTop + i14));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = Integer.MAX_VALUE;
                    View view6 = null;
                    while (i16 < childCount2) {
                        View childAt2 = getChildAt(i16);
                        float f11 = f10;
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.v1 + paddingTop) {
                            if (bottom2 < i10) {
                                i10 = bottom2;
                                view6 = childAt2;
                            }
                            i17 = Math.max(i17, bottom2);
                            if (bottom2 >= org.telegram.messenger.g0.L(f11) + this.v1 + paddingTop && bottom2 < i18) {
                                i18 = bottom2;
                            }
                        }
                        i16++;
                        f10 = f11;
                    }
                    if (view6 == null || (T = T(view6)) == null) {
                        return;
                    }
                    int b11 = T.b();
                    int abs = Math.abs(b0Var.N0() - b11) + 1;
                    if ((this.J1 || z10) && (yi0Var2 = this.e1) != null && !yi0Var2.n && (getAdapter() instanceof zi0)) {
                        this.e1.setProgress(Math.min(1.0f, b11 / ((this.f1.b() - abs) + 1)));
                    }
                    this.p1.addAll(this.o1);
                    this.o1.clear();
                    if (this.f1.b() == 0) {
                        return;
                    }
                    if (this.r1 != b11 || this.s1 != abs) {
                        this.r1 = b11;
                        this.s1 = abs;
                        this.u1 = 1;
                        int S2 = this.f1.S(b11);
                        this.t1 = S2;
                        int M2 = (this.f1.M(S2) + b11) - this.f1.Q(b11);
                        while (M2 < b11 + abs) {
                            M2 += this.f1.M(this.t1 + this.u1);
                            this.u1++;
                        }
                    }
                    if (this.x1 != 3) {
                        int i19 = b11;
                        for (int i20 = this.t1; i20 < this.t1 + this.u1; i20++) {
                            if (this.p1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.p1.get(0);
                                this.p1.remove(0);
                            }
                            boolean z12 = view == null;
                            View T4 = this.f1.T(i20, view);
                            if (z12) {
                                S0(T4, false);
                            }
                            this.o1.add(T4);
                            int M3 = this.f1.M(i20);
                            if (i20 == this.t1) {
                                int Q2 = this.f1.Q(i19);
                                if (Q2 == M3 - 1) {
                                    T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                } else if (Q2 == M3 - 2) {
                                    View childAt3 = getChildAt(i19 - b11);
                                    T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -org.telegram.messenger.g0.L(100.0f), 0)));
                                } else {
                                    T4.setTag(0);
                                }
                                i19 = (M3 - this.f1.Q(b11)) + i19;
                            } else {
                                View childAt4 = getChildAt(i19 - b11);
                                if (childAt4 != null) {
                                    T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    T4.setTag(Integer.valueOf(-org.telegram.messenger.g0.L(100.0f)));
                                }
                                i19 += M3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void M0(float f10, float f11) {
        org.telegram.messenger.ui uiVar;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.l2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            m.b3 b3Var = this.g2;
            int[] iArr2 = this.l2;
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) b3Var.d;
            iArr2[0] = (int) wmVar.M9;
            iArr2[1] = wmVar.Va;
            View childAt = getChildAt(i3);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.f2;
                if (i10 != S) {
                    int i11 = this.e2;
                    boolean z10 = i10 > i11 || S > i11;
                    org.telegram.ui.wm wmVar2 = (org.telegram.ui.wm) this.g2.d;
                    org.telegram.ui.fl flVar = wmVar2.D0;
                    ArrayList arrayList = wmVar2.L6;
                    int i12 = S - flVar.K;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i12);
                        if (ziVar.U == 0 && ziVar.A2() && (uiVar = (org.telegram.messenger.ui) wmVar2.O6.f(ziVar.d1())) != null) {
                            ArrayList arrayList2 = uiVar.d;
                            S = arrayList.indexOf((org.telegram.messenger.zi) arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + wmVar2.D0.K;
                        }
                    }
                    if (z10) {
                        int i13 = this.f2;
                        if (S <= i13) {
                            while (i13 > S) {
                                if (i13 != this.e2 && this.g2.a(i13)) {
                                    this.g2.c(i13, false, min2, min);
                                }
                                i13--;
                            }
                        } else if (!this.g2.a) {
                            for (int i14 = i13 + 1; i14 <= S; i14++) {
                                if (i14 != this.e2 && this.g2.a(i14)) {
                                    this.g2.c(i14, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i15 = this.f2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.e2 && this.g2.a(i15)) {
                                    this.g2.c(i15, false, min2, min);
                                }
                                i15++;
                            }
                        } else if (!this.g2.a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.e2 && this.g2.a(i16)) {
                                    this.g2.c(i16, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (this.g2.a) {
                    return;
                }
                this.f2 = S;
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (this.S2 == null && view != null && u1(view) && ((Boolean) this.H2.a.a(view)).booleanValue() && i1(view)) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                z10 = T0 != null && i1(T0);
                z11 = T02 != null && i1(T02);
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), Math.max((-this.M2) - this.R2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.M2, G0(view)));
            if (z10 && z11) {
                z10 = v1(view) >= rectF.top;
                boolean z12 = G0(view) <= rectF.bottom;
                if (z10 && z12) {
                    return;
                } else {
                    z11 = z12;
                }
            }
            Path path = this.Y2;
            if (!z10 && !z11) {
                path.rewind();
                float f10 = this.M2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                return;
            }
            if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                if (z11) {
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof b70 ? ((b70) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(view.getLeft(), Math.max((-this.M2) - this.R2, v1(view) - (z10 ? this.M2 : 0.0f)), view.getRight(), Math.min(getHeight() + this.M2, (G0(view2) + (z11 ? this.M2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        float f10 = this.M2;
        this.K2.j(canvas, rectF, Float.valueOf(f10), Float.valueOf(f10), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(Canvas canvas) {
        float f10;
        int i3;
        boolean z10;
        float f11;
        float f12;
        float[] fArr;
        int i10;
        View view;
        if (this.K2 == null || this.H2 == null) {
            return;
        }
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (b0()) {
            if (this.X2 == null) {
                this.X2 = new ArrayList();
            }
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (childAt != this.b1 && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.H2.a.a(childAt)).booleanValue()) {
                    float v12 = v1(childAt);
                    float G0 = G0(childAt);
                    u4.d1 T = T(childAt);
                    if (!T.j() || childAt.getAlpha() >= 1.0f) {
                        if (h1(T.b())) {
                        }
                        ArrayList arrayList = this.X2;
                        float alpha = childAt.getAlpha();
                        pj0 pj0Var = new pj0();
                        pj0Var.a = v12;
                        pj0Var.b = G0;
                        pj0Var.c = alpha;
                        arrayList.add(pj0Var);
                    } else {
                        if (T.j() && (i10 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i10 / 1000.0d)) + 1;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i12);
                                if (view != null && view != childAt && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            if (view != null && G0 > view.getY() && ((Boolean) this.H2.a.a(view)).booleanValue() && !T(view).j()) {
                                v12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < v12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.X2;
                        float alpha2 = childAt.getAlpha();
                        pj0 pj0Var2 = new pj0();
                        pj0Var2.a = v12;
                        pj0Var2.b = G0;
                        pj0Var2.c = alpha2;
                        arrayList2.add(pj0Var2);
                    }
                }
                i11++;
            }
            ArrayList arrayList3 = this.X2;
            float f15 = this.M2;
            ArrayList arrayList4 = qj0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f10 = 1.0f;
                i3 = 0;
            } else {
                int i13 = 3;
                Collections.sort(arrayList3, new d80(i13));
                arrayList4.clear();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    float f16 = ((pj0) arrayList3.get(i14)).b;
                    int i15 = i14 + 1;
                    while (i15 < arrayList3.size() && ((pj0) arrayList3.get(i15)).a <= f16 + 1.5f) {
                        f16 = Math.max(f16, ((pj0) arrayList3.get(i15)).b);
                        i15++;
                    }
                    float f17 = Float.MAX_VALUE;
                    float f18 = Float.MIN_VALUE;
                    boolean z11 = z10;
                    int i16 = i14;
                    float f19 = f13;
                    float f20 = Float.MAX_VALUE;
                    float f21 = Float.MIN_VALUE;
                    while (i16 < i15) {
                        float f22 = f14;
                        pj0 pj0Var3 = (pj0) arrayList3.get(i16);
                        if (pj0Var3.c >= 0.99f) {
                            f20 = Math.min(f20, pj0Var3.a);
                            f21 = Math.max(f21, pj0Var3.b);
                        }
                        i16++;
                        f14 = f22;
                    }
                    float f23 = f14;
                    Object[] objArr = f20 != Float.MAX_VALUE ? z11 ? 1 : 0 : false;
                    int i17 = i14;
                    float f24 = f23;
                    while (i17 < i15) {
                        int i18 = i13;
                        pj0 pj0Var4 = (pj0) arrayList3.get(i17);
                        f17 = Math.min(f17, pj0Var4.a);
                        f18 = Math.max(f18, pj0Var4.b);
                        f24 = Math.max(f24, pj0Var4.c);
                        i17++;
                        i13 = i18;
                    }
                    int i19 = i13;
                    if (f24 >= 0.001f) {
                        if (objArr == true) {
                            float f25 = f23;
                            pj0 pj0Var5 = null;
                            for (int i20 = i14; i20 < i15; i20++) {
                                pj0 pj0Var6 = (pj0) arrayList3.get(i20);
                                float f26 = pj0Var6.c;
                                if (f26 < 0.99f) {
                                    float f27 = pj0Var6.a;
                                    if (f27 < f20) {
                                        float f28 = (f20 - f27) * f26;
                                        if (f28 > f25) {
                                            pj0Var5 = pj0Var6;
                                            f25 = f28;
                                        }
                                    }
                                }
                            }
                            float f29 = f23;
                            pj0 pj0Var7 = null;
                            while (i14 < i15) {
                                pj0 pj0Var8 = (pj0) arrayList3.get(i14);
                                float f30 = pj0Var8.c;
                                if (f30 < 0.99f) {
                                    float f31 = pj0Var8.b;
                                    if (f31 > f21) {
                                        float f32 = (f31 - f21) * f30;
                                        if (f32 > f29) {
                                            pj0Var7 = pj0Var8;
                                            f29 = f32;
                                        }
                                    }
                                }
                                i14++;
                            }
                            if (pj0Var5 != null) {
                                float f33 = pj0Var5.a;
                                float f34 = pj0Var5.c;
                                if (f34 > 0.001f) {
                                    float T1 = org.telegram.messenger.g0.T1(f20, f33, f34);
                                    f11 = org.telegram.messenger.g0.T1(f15, f34 * f15, (f20 - T1) / ((f20 - f33) + 0.001f));
                                    f20 = T1;
                                    if (pj0Var7 != null) {
                                        float f35 = pj0Var7.b;
                                        float f36 = pj0Var7.c;
                                        if (f36 > 0.001f) {
                                            float T12 = org.telegram.messenger.g0.T1(f21, f35, f36);
                                            f12 = org.telegram.messenger.g0.T1(f15, f36 * f15, (T12 - f21) / ((f35 - f21) + 0.001f));
                                            f17 = f20;
                                            f21 = T12;
                                            f24 = f19;
                                        }
                                    }
                                    f12 = f15;
                                    f17 = f20;
                                    f24 = f19;
                                }
                            }
                            f11 = f15;
                            if (pj0Var7 != null) {
                            }
                            f12 = f15;
                            f17 = f20;
                            f24 = f19;
                        } else {
                            f12 = f15;
                            f11 = f12;
                            f21 = f18;
                        }
                        if (f21 > f17) {
                            fArr = new float[5];
                            fArr[0] = f17;
                            fArr[z11 ? 1 : 0] = f21;
                            fArr[2] = f11;
                            fArr[i19] = f12;
                            fArr[4] = f24;
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i14 = i15;
                            z10 = z11 ? 1 : 0;
                            f13 = f19;
                            f14 = f23;
                            i13 = i19;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i14 = i15;
                    z10 = z11 ? 1 : 0;
                    f13 = f19;
                    f14 = f23;
                    i13 = i19;
                }
                boolean z12 = z10;
                f10 = f13;
                int i21 = i13;
                i3 = 0;
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    float[] fArr2 = (float[]) arrayList4.get(i22);
                    float f37 = fArr2[0];
                    float f38 = fArr2[z12 ? 1 : 0];
                    float f39 = fArr2[2];
                    float f40 = fArr2[i21];
                    float f41 = fArr2[4];
                    if (i22 > 0) {
                        float f42 = f37 - ((float[]) arrayList4.get(i22 - 1))[z12 ? 1 : 0];
                        float f43 = f15 * 0.2f;
                        if (f42 < f43) {
                            f39 = Math.min(f39, (f42 / f43) * f15);
                        }
                    }
                    if (i22 < arrayList4.size() - 1) {
                        float f44 = ((float[]) arrayList4.get(i22 + 1))[0] - f38;
                        float f45 = 0.2f * f15;
                        if (f44 < f45) {
                            f40 = Math.min(f40, (f44 / f45) * f15);
                        }
                    }
                    Float valueOf = Float.valueOf(f39);
                    Float valueOf2 = Float.valueOf(f40);
                    Float valueOf3 = Float.valueOf(f41);
                    if (f38 > f37) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(getPaddingLeft() + this.H2.c, f37, (getWidth() - this.H2.c) - getPaddingRight(), f38);
                        this.K2.j(canvas, rectF, valueOf, valueOf2, valueOf3);
                    }
                }
            }
            this.X2.clear();
        } else {
            f10 = 1.0f;
            i3 = 0;
            int i23 = -1;
            int i24 = -1;
            View view2 = null;
            View view3 = null;
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                View childAt2 = getChildAt(i25);
                if (childAt2 == this.b1 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.H2.a.a(childAt2)).booleanValue() || h1(RecyclerView.R(childAt2))) {
                    O0(canvas, view2, view3, X0(i23, view2), Z0(i24, view3));
                    i23 = -1;
                    i24 = -1;
                    view2 = null;
                    view3 = null;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        O0(canvas, view2, view3, X0(i23, view2), Z0(i24, view3));
                        i23 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i23 = i25;
                        view2 = childAt2;
                    }
                    i24 = i25;
                    view3 = childAt2;
                }
            }
            O0(canvas, view2, view3, X0(i23, view2), Z0(i24, view3));
        }
        if (this.L2 != null) {
            for (int i26 = i3; i26 < this.L2.size(); i26++) {
                long longValue = ((Long) this.L2.get(i26)).longValue();
                Typeface typeface = org.telegram.messenger.g0.a;
                int i27 = (int) (longValue >> 32);
                int i28 = (int) longValue;
                float height = getHeight();
                float f46 = this.M2;
                float f47 = height + f46;
                float f48 = -f46;
                for (int i29 = i3; i29 < getChildCount(); i29++) {
                    View childAt3 = getChildAt(i29);
                    int R = RecyclerView.R(childAt3);
                    if (R >= i27 && R <= i28) {
                        f47 = Math.min(f47, v1(childAt3));
                        f48 = Math.max(f48, G0(childAt3));
                    }
                }
                if (f47 < f48) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(getPaddingLeft() + this.H2.c, f47, (getWidth() - getPaddingRight()) - this.H2.c, f48);
                    float f49 = this.M2;
                    this.K2.j(canvas, rectF2, Float.valueOf(f49), Float.valueOf(f49), Float.valueOf(f10));
                }
            }
        }
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.F1;
        if (rect.isEmpty() || (yVar = this.C1) == null) {
            return;
        }
        int i3 = this.H1;
        if ((i3 == -2 || i3 == this.D1) && this.E1 != null) {
            if (getAdapter() instanceof sj0) {
                ((sj0) getAdapter()).getClass();
            }
            this.C1.setBounds(this.E1.getLeft(), this.E1.getTop(), this.E1.getRight(), this.E1.getBottom());
        } else {
            yVar.setBounds(rect);
        }
        canvas.save();
        int i10 = this.H1;
        if ((i10 == -2 || i10 == this.D1) && (aVar = this.n2) != null) {
            aVar.accept(canvas);
        }
        int i11 = this.H1;
        if ((i11 == -2 || i11 == this.D1) && (view = this.E1) != null) {
            canvas.translate(view.getX() - rect.left, this.E1.getY() - rect.top);
            this.C1.setAlpha((int) (this.E1.getAlpha() * 255.0f));
        }
        if (this.H2 != null) {
            canvas.save();
            N0(canvas, this.E1);
            this.C1.draw(canvas);
            canvas.restore();
        } else {
            this.C1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean R0() {
        return (getAdapter() == null || this.W1 || getAdapter().b() != 0) ? false : true;
    }

    public final void S0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z10) {
            int i3 = this.x1;
            if (i3 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i3 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View T0(int i3) {
        if (i3 == -1) {
            return null;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R == i3) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable U0(View view, boolean z10) {
        boolean z11;
        boolean z12;
        if (view.getParent() != this || !b1() || !i1(view)) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z12 = false;
            z11 = false;
        } else {
            View T0 = T0(R - 1);
            View T02 = T0(R + 1);
            z11 = T0 != null && i1(T0);
            z12 = T02 != null && i1(T02);
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z11 && z12 && !z10) {
            z11 = v1(view) >= rectF.top;
            boolean z13 = G0(view) <= rectF.bottom;
            if (z11 && z13) {
                return org.telegram.ui.ActionBar.k6.d0(0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.o2));
            }
            z12 = z13;
        }
        Path path = new Path();
        if ((!z11 && !z12) || z10) {
            path.rewind();
            float f10 = this.M2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.N2, Path.Direction.CW);
        } else if (!z12) {
            path.rewind();
            path.addRoundRect(rectF, this.O2, Path.Direction.CW);
        }
        return new xi0(this, view, path, rectF);
    }

    public Integer V0(int i3) {
        org.telegram.messenger.e9 e9Var = this.w2;
        if (e9Var != null) {
            return (Integer) e9Var.k(Integer.valueOf(i3));
        }
        return null;
    }

    public final Paint W0(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.o2;
        Paint d = e6Var != null ? e6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final boolean X0(int i3, View view) {
        int R;
        if (view == null || i3 > 0 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
    }

    public final boolean Y0() {
        for (ns nsVar : this.E2.a) {
            if (nsVar != null && nsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i3, View view) {
        int R;
        if (view == null || i3 < getChildCount() - 1 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().b() - 1) {
            return false;
        }
        return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
    }

    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.a = true;
            return;
        }
        if (Y0() && getOverScrollMode() != 2) {
            aVar.a = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i3 = 0; i3 < itemDecorationCount; i3++) {
            Object X = X(i3);
            if ((X instanceof fh.a) && ((X != this.H2 && X != this.S2) || this.G2)) {
                ((fh.a) X).b(aVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y9 = childAt.getY();
            if (rectF.intersects(x10, y9, childAt.getWidth() + x10, childAt.getHeight() + y9)) {
                aVar.getClass();
                android.support.v4.media.session.w.a(aVar, childAt);
            }
        }
    }

    public final boolean b1() {
        return (this.H2 == null && this.S2 == null) ? false : true;
    }

    public final void c1() {
        if (this.h1) {
            return;
        }
        this.h1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.b1;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.b1.setVisibility(8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i3) {
        return this.S1 && super.canScrollVertically(i3);
    }

    @Override // fh.a
    public void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!Y0() || getOverScrollMode() == 2) {
            J0(canvas, rectF, uptimeMillis);
            return;
        }
        if (this.F2 == null) {
            this.F2 = new Matrix();
        }
        int save = canvas.save();
        Matrix matrix = getMatrix();
        if (!matrix.isIdentity() && matrix.invert(this.F2)) {
            canvas.concat(this.F2);
        }
        canvas.translate(-getLeft(), -getTop());
        try {
            super.drawChild(canvas, this, uptimeMillis);
        } catch (Throwable th2) {
            try {
                org.telegram.messenger.a8.g(th2, true);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void d1(boolean z10) {
        View view = this.M1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.M1 = null;
            if (z10) {
                m1(view, null);
            }
        }
        if (z10) {
            return;
        }
        this.C1.setState(StateSet.NOTHING);
        this.F1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        wi0 wi0Var = this.m2;
        if (wi0Var != null) {
            tj0 tj0Var = wi0Var.a;
            if (wi0Var.d || wi0Var.e) {
                for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                    View childAt = tj0Var.getChildAt(i3);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !wi0Var.c.contains(childAt)) {
                        Float f10 = (Float) wi0Var.b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                wi0Var.d = false;
            }
        }
        if (this.T0 && this.A1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.T0 && !this.A1) {
            Q0(canvas);
        }
        ai.o2 o2Var = this.c1;
        if (o2Var != null) {
            o2Var.draw(canvas);
        }
        if (this.y1) {
            return;
        }
        int i10 = this.x1;
        if (i10 == 1) {
            if (this.f1 == null || this.o1.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.o1.size(); i11++) {
                View view2 = (View) this.o1.get(i11);
                int save = canvas.save();
                canvas.translate(org.telegram.messenger.bd.a0 ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i10 != 2 || this.f1 == null || (view = this.q1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(org.telegram.messenger.bd.a0 ? getWidth() - this.q1.getWidth() : 0.0f, ((Integer) this.q1.getTag()).intValue());
        Drawable drawable = this.k1;
        if (drawable != null) {
            drawable.setBounds(0, this.q1.getMeasuredHeight(), getWidth(), this.k1.getIntrinsicHeight() + this.q1.getMeasuredHeight());
            this.k1.setAlpha((int) (this.l1 * 255.0f));
            this.k1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.n1);
            this.n1 = elapsedRealtime;
            float f11 = this.l1;
            float f12 = this.m1;
            if (f11 < f12) {
                float f13 = (min / 180.0f) + f11;
                this.l1 = f13;
                if (f13 > f12) {
                    this.l1 = f12;
                }
                invalidate();
            } else if (f11 > f12) {
                float f14 = f11 - (min / 180.0f);
                this.l1 = f14;
                if (f14 < f12) {
                    this.l1 = f12;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.q1.getMeasuredHeight());
        this.q1.draw(canvas);
        canvas.restoreToCount(save2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.y2 == 0 && this.z2) {
                setOverScrollMode(0);
            }
            this.y2++;
        } else if (action == 1 || action == 3) {
            int i3 = this.y2 - 1;
            this.y2 = i3;
            if (i3 == 0 && this.z2) {
                setOverScrollMode(2);
            }
        }
        yi0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.b0 || !fastScroll.m0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.f1 == null || (view = this.q1) == null || view.getAlpha() == 0.0f || !this.q1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.H2 == null || this.B2) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        N0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(cj0 cj0Var, int i3, boolean z10) {
        jb0 jb0Var = this.U1;
        if (jb0Var != null) {
            org.telegram.messenger.g0.r(jb0Var);
            this.U1 = null;
        }
        u4.d1 K = K(cj0Var.run());
        if (K == null) {
            if (z10) {
                this.T1 = cj0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c2 = K.c();
        this.x2 = c2;
        k1(c2, view);
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null) {
            Drawable current = yVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.W0 == null && this.V0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.C1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.y yVar2 = this.C1;
        if (yVar2 != null && yVar2.isStateful() && this.C1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.C1);
        }
        if (i3 > 0) {
            this.T1 = null;
            jb0 jb0Var2 = new jb0(this, 16);
            this.U1 = jb0Var2;
            org.telegram.messenger.g0.i3(jb0Var2, i3);
        }
    }

    public final void f1() {
        org.telegram.messenger.v10 v10Var;
        zw zwVar;
        u4.n0 n0Var = this.H2;
        if (n0Var != null) {
            q0(n0Var);
            this.H2 = null;
        }
        u4.n0 n0Var2 = this.S2;
        if (n0Var2 != null) {
            q0(n0Var2);
            this.S2 = null;
        }
        org.telegram.messenger.v10 v10Var2 = this.I2;
        if (v10Var2 == null || (v10Var = this.J2) == null || (zwVar = this.K2) == null) {
            return;
        }
        if (this.T2) {
            dj0 dj0Var = new dj0(this, v10Var2, this.P2, this.Q2);
            this.H2 = dj0Var;
            i(dj0Var);
        } else {
            p9 p9Var = new p9(this, v10Var2, v10Var, this.P2, this.M2, zwVar, this.Q2, this.U2, this.V2);
            this.S2 = p9Var;
            i(p9Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0(View view) {
        if (!(getAdapter() instanceof sj0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        u4.d1 G = G(view);
        if (G != null) {
            view.setEnabled(((sj0) getAdapter()).D(G));
            if (this.p2) {
                view.setAccessibilityDelegate(this.q2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g1() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof org.telegram.ui.ActionBar.z5) {
                ((org.telegram.ui.ActionBar.z5) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.b1;
    }

    public yi0 getFastScroll() {
        return this.e1;
    }

    public ArrayList<View> getHeaders() {
        return this.o1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.p1;
    }

    public fj0 getOnItemClickListener() {
        return this.U0;
    }

    public u4.t0 getOnScrollListener() {
        return this.Z0;
    }

    public View getPinnedHeader() {
        return this.q1;
    }

    public View getPressedChildView() {
        return this.M1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.o2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(this.W2, this.o2), org.telegram.messenger.hs.e4);
    }

    public boolean getSectionsDrawBackground() {
        return this.U2;
    }

    public int getSectionsOverscanTop() {
        return this.R2;
    }

    public Drawable getSelectorDrawable() {
        return this.C1;
    }

    public int getSelectorDrawableColor() {
        return this.v2;
    }

    public Rect getSelectorRect() {
        return this.F1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i3) {
        if (this.L2 != null && i3 >= 0) {
            for (int i10 = 0; i10 < this.L2.size(); i10++) {
                long longValue = ((Long) this.L2.get(i10)).longValue();
                Typeface typeface = org.telegram.messenger.g0.a;
                int i11 = (int) (longValue >> 32);
                int i12 = (int) longValue;
                if (i3 >= i11 && i3 <= i12) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i1(View view) {
        p9 p9Var = this.S2;
        if (p9Var != null) {
            return p9Var.u(view);
        }
        dj0 dj0Var = this.H2;
        return dj0Var != null && ((Boolean) dj0Var.a.a(view)).booleanValue();
    }

    public void j1(View view, float f10, float f11, boolean z10) {
        if (this.i1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public final void k1(int i3, View view) {
        jb0 jb0Var = this.U1;
        if (jb0Var != null) {
            org.telegram.messenger.g0.r(jb0Var);
            this.U1 = null;
            this.T1 = null;
        }
        if (this.C1 == null) {
            return;
        }
        boolean z10 = i3 != this.D1;
        if (getAdapter() instanceof sj0) {
            ((sj0) getAdapter()).getClass();
        }
        if (i3 != -1) {
            this.D1 = i3;
        }
        this.E1 = view;
        if (this.B1 == 8) {
            org.telegram.ui.ActionBar.k6.G1(this.C1, this.Z1, 0);
        } else if (this.a2 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.k6.G1(this.C1, i3 == 0 ? this.a2 : 0, i3 == getAdapter().b() + (-2) ? this.a2 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.F1;
        rect.set(left, top, right, bottom);
        boolean isEnabled = view.isEnabled();
        if (this.G1 != isEnabled) {
            this.G1 = isEnabled;
        }
        if (z10) {
            this.C1.setVisible(false, false);
            this.C1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(V0(i3));
        this.C1.setBounds(rect);
        if (z10 && getVisibility() == 0) {
            this.C1.setVisible(true, false);
        }
    }

    public final void l1() {
        int i3;
        jb0 jb0Var = this.U1;
        if (jb0Var != null) {
            org.telegram.messenger.g0.r(jb0Var);
            this.U1.run();
            this.U1 = null;
            this.E1 = null;
            return;
        }
        this.U1 = null;
        this.T1 = null;
        View view = this.E1;
        if (view != null && (i3 = this.x2) != -1) {
            k1(i3, view);
            org.telegram.ui.Cells.y yVar = this.C1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.C1);
            }
            this.E1 = null;
            this.x2 = -1;
            return;
        }
        org.telegram.ui.Cells.y yVar2 = this.C1;
        if (yVar2 != null) {
            Drawable current = yVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.y yVar3 = this.C1;
        if (yVar3 != null && yVar3.isStateful() && this.C1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.C1);
        }
    }

    public final void m1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.F1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                k1(this.N1, view);
                org.telegram.ui.Cells.y yVar = this.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            y1();
        }
    }

    public final void n1(tj0 tj0Var, boolean z10) {
        ViewParent parent;
        if (tj0Var == null || (parent = tj0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    public final void o1(int i3, boolean z10) {
        this.X1 = z10;
        this.Y1 = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yi0 yi0Var = this.e1;
        if (yi0Var == null || yi0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.e1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.e1);
        }
        ((ViewGroup) getParent()).addView(this.e1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        wi0 wi0Var = this.m2;
        if (wi0Var != null) {
            wi0Var.a();
        }
        if (this.u2) {
            this.u2 = false;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.P1) {
            n1(this, true);
        }
        if (this.a1 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i3 = org.telegram.ui.wm.jd;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        yi0 yi0Var = this.e1;
        if (yi0Var != null) {
            this.I1 = true;
            int paddingTop = i10 + (yi0Var.a ? getPaddingTop() : yi0Var.i0);
            yi0 yi0Var2 = this.e1;
            if (yi0Var2.h0) {
                yi0Var2.layout(0, paddingTop, yi0Var2.getMeasuredWidth(), this.e1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.e1.getMeasuredWidth();
                yi0 yi0Var3 = this.e1;
                yi0Var3.layout(measuredWidth, paddingTop, yi0Var3.getMeasuredWidth() + measuredWidth, this.e1.getMeasuredHeight() + paddingTop);
            }
            this.I1 = false;
        }
        L0(false);
        cj0 cj0Var = this.T1;
        if (cj0Var != null) {
            e1(cj0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        yi0 yi0Var = this.e1;
        if (yi0Var != null && yi0Var.getLayoutParams() != null) {
            yi0 yi0Var2 = this.e1;
            int measuredHeight = (getMeasuredHeight() - (yi0Var2.a ? getPaddingTop() : yi0Var2.i0)) - getPaddingBottom();
            this.e1.getLayoutParams().height = measuredHeight;
            this.e1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.b2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i3, i10, i11, i12);
        ai.o2 o2Var = this.c1;
        if (o2Var != null) {
            o2Var.requestLayout();
        }
        int i13 = this.x1;
        if (i13 != 1) {
            if (i13 != 2 || this.f1 == null || (view = this.q1) == null) {
                return;
            }
            S0(view, true);
            return;
        }
        if (this.f1 == null || this.o1.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < this.o1.size(); i14++) {
            S0((View) this.o1.get(i14), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        yi0 yi0Var = this.e1;
        if (yi0Var != null && yi0Var.n) {
            return false;
        }
        boolean z10 = this.c2;
        lt ltVar = this.D2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.j2 = Float.MAX_VALUE;
            this.k2 = Float.MAX_VALUE;
            this.c2 = false;
            this.d2 = false;
            n1(this, false);
            this.h2 = false;
            org.telegram.messenger.g0.r(ltVar);
            return super.onTouchEvent(motionEvent);
        }
        if (this.j2 == Float.MAX_VALUE && this.k2 == Float.MAX_VALUE) {
            this.j2 = motionEvent.getX();
            this.k2 = motionEvent.getY();
        }
        if (!this.d2 && Math.abs(motionEvent.getY() - this.k2) > this.b2) {
            this.d2 = true;
            n1(this, true);
        }
        if (this.d2) {
            M0(motionEvent.getX(), motionEvent.getY());
            m.b3 b3Var = this.g2;
            int[] iArr = this.l2;
            org.telegram.ui.wm wmVar = (org.telegram.ui.wm) b3Var.d;
            iArr[0] = (int) wmVar.M9;
            iArr[1] = wmVar.Va;
            if (motionEvent.getY() > (getMeasuredHeight() - org.telegram.messenger.g0.L(56.0f)) - this.l2[1] && (this.f2 >= this.e2 || !this.g2.a)) {
                this.i2 = false;
                if (!this.h2) {
                    this.h2 = true;
                    org.telegram.messenger.g0.r(ltVar);
                    org.telegram.messenger.g0.h3(ltVar);
                    return true;
                }
            } else if (motionEvent.getY() >= org.telegram.messenger.g0.L(56.0f) + this.l2[0] || (this.f2 > this.e2 && this.g2.a)) {
                this.h2 = false;
                org.telegram.messenger.g0.r(ltVar);
            } else {
                this.i2 = true;
                if (!this.h2) {
                    this.h2 = true;
                    org.telegram.messenger.g0.r(ltVar);
                    org.telegram.messenger.g0.h3(ltVar);
                    return true;
                }
            }
        }
        return true;
    }

    public final void p1(ij0 ij0Var, long j10) {
        this.X0 = ij0Var;
        y00 y00Var = this.L1;
        boolean z10 = ij0Var != null;
        w00 w00Var = (w00) y00Var.a;
        w00Var.t = z10;
        w00Var.u = j10;
    }

    public final void q1(int i3, int i10, int i11, int i12) {
        if (getPaddingLeft() == i3 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.C2 = true;
        setPadding(i3, i10, i11, i12);
        this.C2 = false;
    }

    public final void r1() {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.W1 || this.C2) {
            return;
        }
        super.requestLayout();
    }

    public void s1(int i3, float f10, boolean z10) {
        bi.x xVar = new bi.x(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new gi.s4(this, xVar, sparseIntArray, 3), new di(sparseIntArray, 2));
        t1((org.telegram.messenger.v10) pair.first, (org.telegram.messenger.v10) pair.second, i3, f10, z10);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.p2 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(u4.h0 h0Var) {
        u4.h0 adapter = getAdapter();
        kg.j1 j1Var = this.s2;
        if (adapter != null) {
            adapter.a.unregisterObserver(j1Var);
        }
        ArrayList arrayList = this.o1;
        if (arrayList != null) {
            arrayList.clear();
            this.p1.clear();
        }
        this.r1 = -1;
        this.D1 = -1;
        this.E1 = null;
        this.F1.setEmpty();
        this.q1 = null;
        if (h0Var instanceof oj0) {
            this.f1 = (oj0) h0Var;
        } else {
            this.f1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(j1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.j1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.w1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i3) {
        if (this.W2 == i3) {
            return;
        }
        this.W2 = i3;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
        if (z10) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z10) {
        this.i1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.P1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.T0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.A1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.b1;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.b1 = view;
        if (this.X1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.h1) {
            this.A2 = -1;
            K0(false);
            return;
        }
        View view3 = this.b1;
        if (view3 != null) {
            this.A2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i3) {
        this.e1 = new yi0(this, getContext(), i3);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.e1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        yi0 yi0Var = this.e1;
        if (yi0Var == null) {
            return;
        }
        yi0Var.setVisibility(z10 ? 0 : 8);
        this.e1.b0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.z1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.Q1 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(u4.m0 m0Var) {
        super.setItemAnimator(m0Var);
    }

    public void setItemSelectorColorProvider(org.telegram.messenger.e9 e9Var) {
        this.w2 = e9Var;
    }

    public void setItemsEnterAnimator(wi0 wi0Var) {
        this.m2 = wi0Var;
    }

    public void setLegacySections(boolean z10) {
        if (this.T2 == z10) {
            return;
        }
        this.T2 = z10;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.k6.w0(b1() ? org.telegram.ui.ActionBar.k6.j6 : org.telegram.ui.ActionBar.k6.i6, this.o2);
        } else {
            intValue = num.intValue();
        }
        this.v2 = intValue;
        org.telegram.ui.ActionBar.k6.H1(this.C1, intValue, true);
    }

    public void setOnInterceptTouchListener(ej0 ej0Var) {
        this.a1 = ej0Var;
    }

    public void setOnItemClickListener(fj0 fj0Var) {
        this.U0 = fj0Var;
    }

    public void setOnItemLongClickListener(hj0 hj0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.W0 = hj0Var;
        y00 y00Var = this.L1;
        boolean z10 = hj0Var != null;
        w00 w00Var = (w00) y00Var.a;
        w00Var.t = z10;
        w00Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(u4.t0 t0Var) {
        this.Z0 = t0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.k1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i3) {
        this.v1 = i3;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.r2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.S1 = z10;
    }

    public void setSections(boolean z10) {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.U2 == z10) {
            return;
        }
        this.U2 = z10;
        if (z10) {
            setLegacySections(false);
        }
        p9 p9Var = this.S2;
        if (p9Var != null) {
            tj0 tj0Var = p9Var.a;
            if (p9Var.L != z10) {
                p9Var.L = z10;
                tj0Var.a0();
                tj0Var.invalidate();
            }
            this.z1 = false;
            if (this.b1 != null) {
                setVisibility(0);
            }
        }
    }

    public void setSectionsDrawingMode(rj0 rj0Var) {
        if (this.V2 == rj0Var) {
            return;
        }
        this.V2 = rj0Var;
        p9 p9Var = this.S2;
        if (p9Var != null) {
            tj0 tj0Var = p9Var.a;
            if (p9Var.M == rj0Var) {
                return;
            }
            p9Var.M = rj0Var;
            tj0Var.a0();
            tj0Var.invalidate();
        }
    }

    public void setSectionsOverscanTop(int i3) {
        this.R2 = i3;
    }

    public void setSectionsType(int i3) {
        this.x1 = i3;
        if (i3 == 1 || i3 == 3) {
            this.o1 = new ArrayList();
            this.p1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i3) {
        this.v2 = i3;
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i10 = this.B1;
        if (i10 == 8) {
            this.C1 = org.telegram.ui.ActionBar.k6.a0(i3, this.Z1, 0);
        } else if (i10 == 9) {
            this.C1 = null;
        } else {
            int i11 = this.a2;
            if (i11 > 0) {
                this.C1 = org.telegram.ui.ActionBar.k6.a0(i3, i11, i11);
            } else {
                int i12 = this.Z1;
                if (i12 > 0 && i10 != 1) {
                    this.C1 = org.telegram.ui.ActionBar.k6.k0(i12, i12, i12, i12, 0, i3, -16777216);
                } else if (i10 == 2) {
                    this.C1 = org.telegram.ui.ActionBar.k6.h0(i3, 2, -1);
                } else {
                    this.C1 = org.telegram.ui.ActionBar.k6.h0(i3, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.C1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i3) {
        this.Z1 = i3;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.n2 = aVar;
    }

    public void setSelectorType(int i3) {
        this.B1 = i3;
    }

    public void setSkipDrawSection(boolean z10) {
        this.y1 = z10;
    }

    public void setTopBottomSelectorRadius(int i3) {
        this.a2 = i3;
    }

    public void setTranslateSelector(boolean z10) {
        this.H1 = z10 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i3) {
        if (i3 <= 0) {
            i3 = -1;
        }
        this.H1 = i3;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        yi0 yi0Var = this.e1;
        if (yi0Var != null) {
            yi0Var.setTranslationY(f10);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Z2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 != 0) {
            this.V1 = false;
        }
    }

    public final void t1(org.telegram.messenger.v10 v10Var, org.telegram.messenger.v10 v10Var2, int i3, float f10, boolean z10) {
        zw zwVar = new zw(this, 16);
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.j6, this.o2);
        this.I2 = v10Var;
        this.J2 = v10Var2;
        this.P2 = i3;
        this.Q2 = z10;
        this.M2 = f10;
        this.N2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.K2 = zwVar;
        f1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        if (!this.Y0) {
            return super.v(i3, i10, i11, iArr, iArr2);
        }
        ij0 ij0Var = this.X0;
        if (ij0Var != null) {
            ij0Var.r(i10);
        }
        iArr[0] = i3;
        iArr[1] = i10;
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.C1 == drawable || super.verifyDrawable(drawable);
    }

    public boolean w1() {
        return this.H;
    }

    public final void x1() {
        yi0 yi0Var = this.e1;
        if (yi0Var != null) {
            yi0Var.updateColors();
        }
    }

    public final void y1() {
        org.telegram.ui.Cells.y yVar = this.C1;
        if (yVar == null || !yVar.isStateful()) {
            return;
        }
        if (this.M1 != null) {
            if (this.C1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.C1);
            }
        } else if (this.U1 == null) {
            this.C1.setState(StateSet.NOTHING);
        }
    }

    public tj0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.T0 = true;
        this.j1 = true;
        this.r1 = -1;
        this.s1 = -1;
        this.y1 = false;
        this.z1 = true;
        this.B1 = 2;
        this.F1 = new Rect();
        this.H1 = -1;
        this.S1 = true;
        this.j2 = Float.MAX_VALUE;
        this.k2 = Float.MAX_VALUE;
        this.p2 = true;
        this.q2 = new wd(1);
        this.r2 = true;
        this.s2 = new kg.j1(this, 1);
        this.D2 = new lt(this, 9);
        this.T2 = true;
        this.V2 = rj0.a;
        this.W2 = org.telegram.ui.ActionBar.k6.a7;
        this.Y2 = new Path();
        this.o2 = e6Var;
        os osVar = new os();
        this.E2 = osVar;
        setEdgeEffectFactory(osVar);
        org.telegram.ui.ActionBar.r6.m(this, 21, org.telegram.ui.ActionBar.k6.s8, e6Var);
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, e6Var);
        try {
            if (!a3) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Z2 = iArr;
                if (iArr == null) {
                    Z2 = new int[0];
                }
                a3 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Z2);
            Method method = b3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        super.setOnScrollListener(new ji(this, 15));
        this.F.add(new mj0(context, this));
    }

    public void setOnItemClickListener(gj0 gj0Var) {
        this.V0 = gj0Var;
    }

    public void setOnItemLongClickListener(ij0 ij0Var) {
        p1(ij0Var, ViewConfiguration.getLongPressTimeout());
    }
}
