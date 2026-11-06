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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class pj0 extends RecyclerView implements eh.a {
    public static int[] Y2;
    public static boolean Z2;
    public static final Method a3;
    public static final Paint b3;
    public static final Path c3;
    public static final float[] d3;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final dt C2;
    public View D1;
    public final os D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public zi0 G2;
    public boolean H1;
    public org.telegram.messenger.d20 H2;
    public boolean I1;
    public org.telegram.messenger.d20 I2;
    public boolean J1;
    public ax J2;
    public qt K1;
    public ArrayList K2;
    public View L1;
    public float L2;
    public int M1;
    public float[] M2;
    public boolean N1;
    public float[] N2;
    public boolean O1;
    public int O2;
    public boolean P1;
    public boolean P2;
    public gj0 Q1;
    public int Q2;
    public boolean R1;
    public q9 R2;
    public boolean S0;
    public yi0 S1;
    public boolean S2;
    public bj0 T0;
    public ob0 T1;
    public boolean T2;
    public cj0 U0;
    public boolean U1;
    public nj0 U2;
    public dj0 V0;
    public boolean V1;
    public int V2;
    public ej0 W0;
    public boolean W1;
    public ArrayList W2;
    public boolean X0;
    public int X1;
    public final Path X2;
    public v4.s0 Y0;
    public int Y1;
    public aj0 Z0;
    public int Z1;
    public View a1;
    public int a2;
    public bi.e5 b1;
    public boolean b2;
    public fj0 c1;
    public boolean c2;
    public ui0 d1;
    public int d2;
    public kj0 e1;
    public int e2;
    public boolean f1;
    public m.c3 f2;
    public boolean g1;
    public boolean g2;
    public boolean h1;
    public boolean h2;
    public boolean i1;
    public float i2;
    public Drawable j1;
    public float j2;
    public float k1;
    public int[] k2;
    public float l1;
    public si0 l2;
    public long m1;
    public q0.a m2;
    public ArrayList n1;
    public final org.telegram.ui.ActionBar.f6 n2;
    public ArrayList o1;
    public boolean o2;
    public View p1;
    public final yd p2;
    public int q1;
    public boolean q2;
    public int r1;
    public final jg.n1 r2;
    public int s1;
    public Paint s2;
    public int t1;
    public boolean t2;
    public int u1;
    public int u2;
    public boolean v1;
    public org.telegram.messenger.k9 v2;
    public int w1;
    public int w2;
    public boolean x1;
    public int x2;
    public boolean y1;
    public boolean y2;
    public boolean z1;
    public int z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        a3 = method;
        b3 = new Paint(1);
        new Paint(1);
        c3 = new Path();
        d3 = new float[8];
    }

    public pj0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a1(View view) {
        if (!(view instanceof jj0)) {
            return false;
        }
        xs0 xs0Var = (xs0) ((jj0) view);
        return xs0Var.b2 && xs0Var.f2 > 0;
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
        this.D2.b.add(new ls(runnable, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f10, float f11) {
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < 2) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.q1) && !(childAt instanceof org.telegram.ui.Cells.t0)) || childAt.getVisibility() != 4) {
                    float translationX = i7 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i7 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i7++;
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

    public final void I0(boolean z9) {
        fj0 fj0Var = this.c1;
        if (fj0Var != null) {
            org.telegram.messenger.g0.r(fj0Var);
            this.c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z9) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            m1(view, null);
        }
        this.E1.setEmpty();
        gj0 gj0Var = this.Q1;
        if (gj0Var != null) {
            org.telegram.messenger.g0.r(gj0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i7 = 0; i7 < itemDecorationCount; i7++) {
            Object X = X(i7);
            if ((X instanceof eh.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
                ((eh.a) X).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.A2 = true;
                drawChild(canvas, childAt, j3);
                this.A2 = false;
            }
        }
    }

    public final void K0(boolean z9) {
        if (this.g1) {
            return;
        }
        if (getAdapter() == null || this.a1 == null) {
            if (!this.U1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.U1 = false;
            return;
        }
        boolean R0 = R0();
        int i7 = R0 ? 0 : 8;
        if (!this.W1 || !org.telegram.messenger.iz.c()) {
            z9 = false;
        }
        if (!z9) {
            this.z2 = i7;
            this.a1.setVisibility(i7);
            this.a1.setAlpha(1.0f);
        } else if (this.z2 != i7) {
            this.z2 = i7;
            if (i7 == 0) {
                this.a1.animate().setListener(null).cancel();
                if (this.a1.getVisibility() == 8) {
                    this.a1.setVisibility(0);
                    this.a1.setAlpha(0.0f);
                    if (this.X1 == 1) {
                        this.a1.setScaleX(0.7f);
                        this.a1.setScaleY(0.7f);
                    }
                }
                this.a1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.a1.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.a1.animate().alpha(0.0f);
                if (this.X1 == 1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new e60(this, 14)).start();
            }
        }
        if (this.y1) {
            if (b1() && this.T2) {
                return;
            }
            int i10 = R0 ? 4 : 0;
            if (getVisibility() != i10) {
                setVisibility(i10);
            }
            this.U1 = true;
        }
    }

    public final void L0(boolean z9) {
        ui0 ui0Var;
        v4.d1 T;
        ui0 ui0Var2;
        View view;
        v4.d1 T2;
        int b10;
        int S;
        if (((this.I1 || z9) && this.d1 != null) || !(this.w1 == 0 || this.e1 == null)) {
            v4.n0 layoutManager = getLayoutManager();
            if (layoutManager instanceof v4.b0) {
                v4.b0 b0Var = (v4.b0) layoutManager;
                if (b0Var.o == 1) {
                    if (this.e1 == null) {
                        int L0 = b0Var.L0();
                        Math.abs(b0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.I1 && !z9) || (ui0Var = this.d1) == null || ui0Var.n) {
                            return;
                        }
                        v4.g0 adapter = getAdapter();
                        if (adapter instanceof vi0) {
                            vi0 vi0Var = (vi0) adapter;
                            float H = vi0Var.H(this);
                            this.d1.setIsVisible(vi0Var.E(this));
                            this.d1.setProgress(Math.min(1.0f, H));
                            this.d1.b(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.w1 == 1 ? 0 : getPaddingTop();
                    int i7 = this.w1;
                    float f10 = 32.0f;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i7 != 1 && i7 != 3) {
                        if (i7 == 2) {
                            this.l1 = 0.0f;
                            if (this.e1.b() == 0) {
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
                                if (bottom > this.u1 + paddingTop) {
                                    if (bottom < i10) {
                                        view3 = childAt;
                                        i10 = bottom;
                                    }
                                    i11 = Math.max(i11, bottom);
                                    if (bottom >= org.telegram.messenger.g0.L(32.0f) + this.u1 + paddingTop && bottom < i12) {
                                        view2 = childAt;
                                        i12 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T2 = T(view3)) == null || (S = this.e1.S((b10 = T2.b()))) < 0) {
                                return;
                            }
                            if (this.q1 != S || this.p1 == null) {
                                View view4 = this.p1;
                                boolean z10 = view4 == null;
                                View T3 = this.e1.T(S, view4);
                                if (z10) {
                                    S0(T3, false);
                                }
                                this.p1 = T3;
                                T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.p1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.p1.getMeasuredHeight());
                                this.q1 = S;
                            }
                            if (this.p1 != null && view2 != null && view2.getClass() != this.p1.getClass()) {
                                this.l1 = 1.0f;
                            }
                            int M = this.e1.M(S);
                            int Q = this.e1.Q(b10);
                            int i14 = (i11 == 0 || i11 >= getMeasuredHeight() - getPaddingBottom()) ? this.u1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.p1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.u1);
                                int i15 = height2 < height ? height2 - height : paddingTop;
                                if (i15 < 0) {
                                    this.p1.setTag(Integer.valueOf(paddingTop + i14 + i15));
                                } else {
                                    this.p1.setTag(Integer.valueOf(paddingTop + i14));
                                }
                            } else {
                                this.p1.setTag(Integer.valueOf(paddingTop + i14));
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
                        if (bottom2 > this.u1 + paddingTop) {
                            if (bottom2 < i10) {
                                i10 = bottom2;
                                view6 = childAt2;
                            }
                            i17 = Math.max(i17, bottom2);
                            if (bottom2 >= org.telegram.messenger.g0.L(f11) + this.u1 + paddingTop && bottom2 < i18) {
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
                    if ((this.I1 || z9) && (ui0Var2 = this.d1) != null && !ui0Var2.n && (getAdapter() instanceof vi0)) {
                        this.d1.setProgress(Math.min(1.0f, b11 / ((this.e1.b() - abs) + 1)));
                    }
                    this.o1.addAll(this.n1);
                    this.n1.clear();
                    if (this.e1.b() == 0) {
                        return;
                    }
                    if (this.q1 != b11 || this.r1 != abs) {
                        this.q1 = b11;
                        this.r1 = abs;
                        this.t1 = 1;
                        int S2 = this.e1.S(b11);
                        this.s1 = S2;
                        int M2 = (this.e1.M(S2) + b11) - this.e1.Q(b11);
                        while (M2 < b11 + abs) {
                            M2 += this.e1.M(this.s1 + this.t1);
                            this.t1++;
                        }
                    }
                    if (this.w1 != 3) {
                        int i19 = b11;
                        for (int i20 = this.s1; i20 < this.s1 + this.t1; i20++) {
                            if (this.o1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.o1.get(0);
                                this.o1.remove(0);
                            }
                            boolean z11 = view == null;
                            View T4 = this.e1.T(i20, view);
                            if (z11) {
                                S0(T4, false);
                            }
                            this.n1.add(T4);
                            int M3 = this.e1.M(i20);
                            if (i20 == this.s1) {
                                int Q2 = this.e1.Q(i19);
                                if (Q2 == M3 - 1) {
                                    T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                } else if (Q2 == M3 - 2) {
                                    View childAt3 = getChildAt(i19 - b11);
                                    T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -org.telegram.messenger.g0.L(100.0f), 0)));
                                } else {
                                    T4.setTag(0);
                                }
                                i19 = (M3 - this.e1.Q(b11)) + i19;
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
        org.telegram.messenger.dj djVar;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            m.c3 c3Var = this.f2;
            int[] iArr2 = this.k2;
            org.telegram.ui.an anVar = (org.telegram.ui.an) c3Var.d;
            iArr2[0] = (int) anVar.L9;
            iArr2[1] = anVar.Ua;
            View childAt = getChildAt(i7);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.e2;
                if (i10 != S) {
                    int i11 = this.d2;
                    boolean z9 = i10 > i11 || S > i11;
                    org.telegram.ui.an anVar2 = (org.telegram.ui.an) this.f2.d;
                    org.telegram.ui.jl jlVar = anVar2.C0;
                    ArrayList arrayList = anVar2.K6;
                    int i12 = S - jlVar.J;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i12);
                        if (ijVar.U == 0 && ijVar.A2() && (djVar = (org.telegram.messenger.dj) anVar2.N6.f(ijVar.d1())) != null) {
                            ArrayList arrayList2 = djVar.d;
                            S = arrayList.indexOf((org.telegram.messenger.ij) arrayList2.get(z9 ? 0 : arrayList2.size() - 1)) + anVar2.C0.J;
                        }
                    }
                    if (z9) {
                        int i13 = this.e2;
                        if (S <= i13) {
                            while (i13 > S) {
                                if (i13 != this.d2 && this.f2.a(i13)) {
                                    this.f2.c(i13, false, min2, min);
                                }
                                i13--;
                            }
                        } else if (!this.f2.a) {
                            for (int i14 = i13 + 1; i14 <= S; i14++) {
                                if (i14 != this.d2 && this.f2.a(i14)) {
                                    this.f2.c(i14, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i15 = this.e2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.d2 && this.f2.a(i15)) {
                                    this.f2.c(i15, false, min2, min);
                                }
                                i15++;
                            }
                        } else if (!this.f2.a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.d2 && this.f2.a(i16)) {
                                    this.f2.c(i16, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (this.f2.a) {
                    return;
                }
                this.e2 = S;
                return;
            }
        }
    }

    public final void N0(Canvas canvas, View view) {
        boolean z9;
        boolean z10;
        if (this.R2 == null && view != null && u1(view) && ((Boolean) this.G2.a.a(view)).booleanValue() && i1(view)) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                z10 = false;
                z9 = false;
            } else {
                View T0 = T0(R - 1);
                View T02 = T0(R + 1);
                z9 = T0 != null && i1(T0);
                z10 = T02 != null && i1(T02);
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), Math.max((-this.L2) - this.Q2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.L2, G0(view)));
            if (z9 && z10) {
                z9 = v1(view) >= rectF.top;
                boolean z11 = G0(view) <= rectF.bottom;
                if (z9 && z11) {
                    return;
                } else {
                    z10 = z11;
                }
            }
            Path path = this.X2;
            if (!z9 && !z10) {
                path.rewind();
                float f10 = this.L2;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                return;
            }
            if (!z9) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                if (z10) {
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas, View view, View view2, boolean z9, boolean z10) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof f70 ? ((f70) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(view.getLeft(), Math.max((-this.L2) - this.Q2, v1(view) - (z9 ? this.L2 : 0.0f)), view.getRight(), Math.min(getHeight() + this.L2, (G0(view2) + (z10 ? this.L2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        float f10 = this.L2;
        this.J2.i(canvas, rectF, Float.valueOf(f10), Float.valueOf(f10), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(Canvas canvas) {
        float f10;
        int i7;
        boolean z9;
        float f11;
        float f12;
        float[] fArr;
        int i10;
        View view;
        if (this.J2 == null || this.G2 == null) {
            return;
        }
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (b0()) {
            if (this.W2 == null) {
                this.W2 = new ArrayList();
            }
            int i11 = 0;
            while (true) {
                z9 = true;
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (childAt != this.a1 && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.G2.a.a(childAt)).booleanValue()) {
                    float v12 = v1(childAt);
                    float G0 = G0(childAt);
                    v4.d1 T = T(childAt);
                    if (!T.j() || childAt.getAlpha() >= 1.0f) {
                        if (h1(T.b())) {
                        }
                        ArrayList arrayList = this.W2;
                        float alpha = childAt.getAlpha();
                        lj0 lj0Var = new lj0();
                        lj0Var.a = v12;
                        lj0Var.b = G0;
                        lj0Var.c = alpha;
                        arrayList.add(lj0Var);
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
                            if (view != null && G0 > view.getY() && ((Boolean) this.G2.a.a(view)).booleanValue() && !T(view).j()) {
                                v12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < v12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.W2;
                        float alpha2 = childAt.getAlpha();
                        lj0 lj0Var2 = new lj0();
                        lj0Var2.a = v12;
                        lj0Var2.b = G0;
                        lj0Var2.c = alpha2;
                        arrayList2.add(lj0Var2);
                    }
                }
                i11++;
            }
            ArrayList arrayList3 = this.W2;
            float f15 = this.L2;
            ArrayList arrayList4 = mj0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f10 = 1.0f;
                i7 = 0;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.oe(13));
                arrayList4.clear();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    float f16 = ((lj0) arrayList3.get(i13)).b;
                    int i14 = i13 + 1;
                    while (i14 < arrayList3.size() && ((lj0) arrayList3.get(i14)).a <= f16 + 1.5f) {
                        f16 = Math.max(f16, ((lj0) arrayList3.get(i14)).b);
                        i14++;
                    }
                    float f17 = Float.MAX_VALUE;
                    float f18 = Float.MIN_VALUE;
                    boolean z10 = z9;
                    int i15 = i13;
                    float f19 = f13;
                    float f20 = Float.MAX_VALUE;
                    float f21 = Float.MIN_VALUE;
                    while (i15 < i14) {
                        float f22 = f14;
                        lj0 lj0Var3 = (lj0) arrayList3.get(i15);
                        if (lj0Var3.c >= 0.99f) {
                            f20 = Math.min(f20, lj0Var3.a);
                            f21 = Math.max(f21, lj0Var3.b);
                        }
                        i15++;
                        f14 = f22;
                    }
                    float f23 = f14;
                    Object[] objArr = f20 != Float.MAX_VALUE ? z10 ? 1 : 0 : false;
                    float f24 = f23;
                    for (int i16 = i13; i16 < i14; i16++) {
                        lj0 lj0Var4 = (lj0) arrayList3.get(i16);
                        f17 = Math.min(f17, lj0Var4.a);
                        f18 = Math.max(f18, lj0Var4.b);
                        f24 = Math.max(f24, lj0Var4.c);
                    }
                    if (f24 >= 0.001f) {
                        if (objArr == true) {
                            float f25 = f23;
                            lj0 lj0Var5 = null;
                            for (int i17 = i13; i17 < i14; i17++) {
                                lj0 lj0Var6 = (lj0) arrayList3.get(i17);
                                float f26 = lj0Var6.c;
                                if (f26 < 0.99f) {
                                    float f27 = lj0Var6.a;
                                    if (f27 < f20) {
                                        float f28 = (f20 - f27) * f26;
                                        if (f28 > f25) {
                                            lj0Var5 = lj0Var6;
                                            f25 = f28;
                                        }
                                    }
                                }
                            }
                            float f29 = f23;
                            lj0 lj0Var7 = null;
                            while (i13 < i14) {
                                lj0 lj0Var8 = (lj0) arrayList3.get(i13);
                                float f30 = lj0Var8.c;
                                if (f30 < 0.99f) {
                                    float f31 = lj0Var8.b;
                                    if (f31 > f21) {
                                        float f32 = (f31 - f21) * f30;
                                        if (f32 > f29) {
                                            lj0Var7 = lj0Var8;
                                            f29 = f32;
                                        }
                                    }
                                }
                                i13++;
                            }
                            if (lj0Var5 != null) {
                                float f33 = lj0Var5.a;
                                float f34 = lj0Var5.c;
                                if (f34 > 0.001f) {
                                    float T1 = org.telegram.messenger.g0.T1(f20, f33, f34);
                                    f11 = org.telegram.messenger.g0.T1(f15, f34 * f15, (f20 - T1) / ((f20 - f33) + 0.001f));
                                    f20 = T1;
                                    if (lj0Var7 != null) {
                                        float f35 = lj0Var7.b;
                                        float f36 = lj0Var7.c;
                                        if (f36 > 0.001f) {
                                            float T12 = org.telegram.messenger.g0.T1(f21, f35, f36);
                                            f12 = org.telegram.messenger.g0.T1(f15, f36 * f15, (T12 - f21) / ((f35 - f21) + 0.001f));
                                            f21 = T12;
                                            f24 = f19;
                                            f17 = f20;
                                        }
                                    }
                                    f12 = f15;
                                    f17 = f20;
                                    f24 = f19;
                                }
                            }
                            f11 = f15;
                            if (lj0Var7 != null) {
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
                            fArr[z10 ? 1 : 0] = f21;
                            fArr[2] = f11;
                            fArr[3] = f12;
                            fArr[4] = f24;
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i13 = i14;
                            z9 = z10 ? 1 : 0;
                            f13 = f19;
                            f14 = f23;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i13 = i14;
                    z9 = z10 ? 1 : 0;
                    f13 = f19;
                    f14 = f23;
                }
                boolean z11 = z9;
                f10 = f13;
                i7 = 0;
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    float[] fArr2 = (float[]) arrayList4.get(i18);
                    float f37 = fArr2[0];
                    float f38 = fArr2[z11 ? 1 : 0];
                    float f39 = fArr2[2];
                    float f40 = fArr2[3];
                    float f41 = fArr2[4];
                    if (i18 > 0) {
                        float f42 = f37 - ((float[]) arrayList4.get(i18 - 1))[z11 ? 1 : 0];
                        float f43 = f15 * 0.2f;
                        if (f42 < f43) {
                            f39 = Math.min(f39, (f42 / f43) * f15);
                        }
                    }
                    if (i18 < arrayList4.size() - 1) {
                        float f44 = ((float[]) arrayList4.get(i18 + 1))[0] - f38;
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
                        rectF.set(getPaddingLeft() + this.G2.c, f37, (getWidth() - this.G2.c) - getPaddingRight(), f38);
                        this.J2.i(canvas, rectF, valueOf, valueOf2, valueOf3);
                    }
                }
            }
            this.W2.clear();
        } else {
            f10 = 1.0f;
            i7 = 0;
            int i19 = -1;
            int i20 = -1;
            View view2 = null;
            View view3 = null;
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 == this.a1 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.G2.a.a(childAt2)).booleanValue() || h1(RecyclerView.R(childAt2))) {
                    O0(canvas, view2, view3, X0(i19, view2), Z0(i20, view3));
                    i19 = -1;
                    i20 = -1;
                    view2 = null;
                    view3 = null;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        O0(canvas, view2, view3, X0(i19, view2), Z0(i20, view3));
                        i19 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i19 = i21;
                        view2 = childAt2;
                    }
                    i20 = i21;
                    view3 = childAt2;
                }
            }
            O0(canvas, view2, view3, X0(i19, view2), Z0(i20, view3));
        }
        if (this.K2 != null) {
            for (int i22 = i7; i22 < this.K2.size(); i22++) {
                long longValue = ((Long) this.K2.get(i22)).longValue();
                Typeface typeface = org.telegram.messenger.g0.a;
                int i23 = (int) (longValue >> 32);
                int i24 = (int) longValue;
                float height = getHeight();
                float f46 = this.L2;
                float f47 = height + f46;
                float f48 = -f46;
                for (int i25 = i7; i25 < getChildCount(); i25++) {
                    View childAt3 = getChildAt(i25);
                    int R = RecyclerView.R(childAt3);
                    if (R >= i23 && R <= i24) {
                        f47 = Math.min(f47, v1(childAt3));
                        f48 = Math.max(f48, G0(childAt3));
                    }
                }
                if (f47 < f48) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(getPaddingLeft() + this.G2.c, f47, (getWidth() - getPaddingRight()) - this.G2.c, f48);
                    float f49 = this.L2;
                    this.J2.i(canvas, rectF2, Float.valueOf(f49), Float.valueOf(f49), Float.valueOf(f10));
                }
            }
        }
    }

    public final void Q0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (rect.isEmpty() || (yVar = this.B1) == null) {
            return;
        }
        int i7 = this.G1;
        if ((i7 == -2 || i7 == this.C1) && this.D1 != null) {
            if (getAdapter() instanceof oj0) {
                ((oj0) getAdapter()).getClass();
            }
            this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
        } else {
            yVar.setBounds(rect);
        }
        canvas.save();
        int i10 = this.G1;
        if ((i10 == -2 || i10 == this.C1) && (aVar = this.m2) != null) {
            aVar.accept(canvas);
        }
        int i11 = this.G1;
        if ((i11 == -2 || i11 == this.C1) && (view = this.D1) != null) {
            canvas.translate(view.getX() - rect.left, this.D1.getY() - rect.top);
            this.B1.setAlpha((int) (this.D1.getAlpha() * 255.0f));
        }
        if (this.G2 != null) {
            canvas.save();
            N0(canvas, this.D1);
            this.B1.draw(canvas);
            canvas.restore();
        } else {
            this.B1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean R0() {
        return (getAdapter() == null || this.V1 || getAdapter().b() != 0) ? false : true;
    }

    public final void S0(View view, boolean z9) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z9) {
            int i7 = this.w1;
            if (i7 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View T0(int i7) {
        if (i7 == -1) {
            return null;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R == i7) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable U0(View view, boolean z9) {
        boolean z10;
        boolean z11;
        if (view.getParent() != this || !b1() || !i1(view)) {
            return null;
        }
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
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z10 && z11 && !z9) {
            z10 = v1(view) >= rectF.top;
            boolean z12 = G0(view) <= rectF.bottom;
            if (z10 && z12) {
                return org.telegram.ui.ActionBar.k6.d0(0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.n2));
            }
            z11 = z12;
        }
        Path path = new Path();
        if ((!z10 && !z11) || z9) {
            path.rewind();
            float f10 = this.L2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else if (!z10) {
            path.rewind();
            path.addRoundRect(rectF, this.M2, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.N2, Path.Direction.CW);
        }
        return new ti0(this, view, path, rectF);
    }

    public Integer V0(int i7) {
        org.telegram.messenger.k9 k9Var = this.v2;
        if (k9Var != null) {
            return (Integer) k9Var.j(Integer.valueOf(i7));
        }
        return null;
    }

    public final Paint W0(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.n2;
        Paint d = f6Var != null ? f6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final boolean X0(int i7, View view) {
        int R;
        if (view == null || i7 > 0 || getAdapter() == null || this.I2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.I2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
    }

    public final boolean Y0() {
        for (ns nsVar : this.D2.a) {
            if (nsVar != null && nsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z0(int i7, View view) {
        int R;
        if (view == null || i7 < getChildCount() - 1 || getAdapter() == null || this.I2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().b() - 1) {
            return false;
        }
        return ((Boolean) this.I2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
    }

    public final boolean b1() {
        return (this.G2 == null && this.R2 == null) ? false : true;
    }

    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.a = true;
            return;
        }
        if (Y0() && getOverScrollMode() != 2) {
            aVar.a = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i7 = 0; i7 < itemDecorationCount; i7++) {
            Object X = X(i7);
            if ((X instanceof eh.a) && ((X != this.G2 && X != this.R2) || this.F2)) {
                ((eh.a) X).c(aVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                aVar.getClass();
                android.support.v4.media.session.w.a(aVar, childAt);
            }
        }
    }

    public final void c1() {
        if (this.g1) {
            return;
        }
        this.g1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.a1;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.a1.setVisibility(8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.R1 && super.canScrollVertically(i7);
    }

    @Override // eh.a
    public void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!Y0() || getOverScrollMode() == 2) {
            J0(canvas, rectF, uptimeMillis);
            return;
        }
        if (this.E2 == null) {
            this.E2 = new Matrix();
        }
        int save = canvas.save();
        Matrix matrix = getMatrix();
        if (!matrix.isIdentity() && matrix.invert(this.E2)) {
            canvas.concat(this.E2);
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

    public final void d1(boolean z9) {
        View view = this.L1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z9) {
                m1(view, null);
            }
        }
        if (z9) {
            return;
        }
        this.B1.setState(StateSet.NOTHING);
        this.E1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        si0 si0Var = this.l2;
        if (si0Var != null) {
            pj0 pj0Var = si0Var.a;
            if (si0Var.d || si0Var.e) {
                for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                    View childAt = pj0Var.getChildAt(i7);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !si0Var.c.contains(childAt)) {
                        Float f10 = (Float) si0Var.b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                si0Var.d = false;
            }
        }
        if (this.S0 && this.z1) {
            Q0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.z1) {
            Q0(canvas);
        }
        bi.e5 e5Var = this.b1;
        if (e5Var != null) {
            e5Var.draw(canvas);
        }
        if (this.x1) {
            return;
        }
        int i10 = this.w1;
        if (i10 == 1) {
            if (this.e1 == null || this.n1.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.n1.size(); i11++) {
                View view2 = (View) this.n1.get(i11);
                int save = canvas.save();
                canvas.translate(org.telegram.messenger.hd.a0 ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i10 != 2 || this.e1 == null || (view = this.p1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(org.telegram.messenger.hd.a0 ? getWidth() - this.p1.getWidth() : 0.0f, ((Integer) this.p1.getTag()).intValue());
        Drawable drawable = this.j1;
        if (drawable != null) {
            drawable.setBounds(0, this.p1.getMeasuredHeight(), getWidth(), this.j1.getIntrinsicHeight() + this.p1.getMeasuredHeight());
            this.j1.setAlpha((int) (this.k1 * 255.0f));
            this.j1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.m1);
            this.m1 = elapsedRealtime;
            float f11 = this.k1;
            float f12 = this.l1;
            if (f11 < f12) {
                float f13 = (min / 180.0f) + f11;
                this.k1 = f13;
                if (f13 > f12) {
                    this.k1 = f12;
                }
                invalidate();
            } else if (f11 > f12) {
                float f14 = f11 - (min / 180.0f);
                this.k1 = f14;
                if (f14 < f12) {
                    this.k1 = f12;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.p1.getMeasuredHeight());
        this.p1.draw(canvas);
        canvas.restoreToCount(save2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.x2 == 0 && this.y2) {
                setOverScrollMode(0);
            }
            this.x2++;
        } else if (action == 1 || action == 3) {
            int i7 = this.x2 - 1;
            this.x2 = i7;
            if (i7 == 0 && this.y2) {
                setOverScrollMode(2);
            }
        }
        ui0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.a0 || !fastScroll.l0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.e1 == null || (view = this.p1) == null || view.getAlpha() == 0.0f || !this.p1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.G2 == null || this.A2) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        N0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(yi0 yi0Var, int i7, boolean z9) {
        ob0 ob0Var = this.T1;
        if (ob0Var != null) {
            org.telegram.messenger.g0.r(ob0Var);
            this.T1 = null;
        }
        v4.d1 K = K(yi0Var.run());
        if (K == null) {
            if (z9) {
                this.S1 = yi0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c10 = K.c();
        this.w2 = c10;
        k1(c10, view);
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            Drawable current = yVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.V0 == null && this.U0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.B1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null && yVar2.isStateful() && this.B1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.B1);
        }
        if (i7 > 0) {
            this.S1 = null;
            ob0 ob0Var2 = new ob0(this, 14);
            this.T1 = ob0Var2;
            org.telegram.messenger.g0.i3(ob0Var2, i7);
        }
    }

    public final void f1() {
        org.telegram.messenger.d20 d20Var;
        ax axVar;
        v4.m0 m0Var = this.G2;
        if (m0Var != null) {
            q0(m0Var);
            this.G2 = null;
        }
        v4.m0 m0Var2 = this.R2;
        if (m0Var2 != null) {
            q0(m0Var2);
            this.R2 = null;
        }
        org.telegram.messenger.d20 d20Var2 = this.H2;
        if (d20Var2 == null || (d20Var = this.I2) == null || (axVar = this.J2) == null) {
            return;
        }
        if (this.S2) {
            zi0 zi0Var = new zi0(this, d20Var2, this.O2, this.P2);
            this.G2 = zi0Var;
            i(zi0Var);
        } else {
            q9 q9Var = new q9(this, d20Var2, d20Var, this.O2, this.L2, axVar, this.P2, this.T2, this.U2);
            this.R2 = q9Var;
            i(q9Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0(View view) {
        if (!(getAdapter() instanceof oj0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        v4.d1 G = G(view);
        if (G != null) {
            view.setEnabled(((oj0) getAdapter()).D(G));
            if (this.o2) {
                view.setAccessibilityDelegate(this.p2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g1() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof org.telegram.ui.ActionBar.a6) {
                ((org.telegram.ui.ActionBar.a6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.a1;
    }

    public ui0 getFastScroll() {
        return this.d1;
    }

    public ArrayList<View> getHeaders() {
        return this.n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.o1;
    }

    public bj0 getOnItemClickListener() {
        return this.T0;
    }

    public v4.s0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.n2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(this.V2, this.n2), org.telegram.messenger.qs.e4);
    }

    public boolean getSectionsDrawBackground() {
        return this.T2;
    }

    public int getSectionsOverscanTop() {
        return this.Q2;
    }

    public Drawable getSelectorDrawable() {
        return this.B1;
    }

    public int getSelectorDrawableColor() {
        return this.u2;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i7) {
        if (this.K2 != null && i7 >= 0) {
            for (int i10 = 0; i10 < this.K2.size(); i10++) {
                long longValue = ((Long) this.K2.get(i10)).longValue();
                Typeface typeface = org.telegram.messenger.g0.a;
                int i11 = (int) (longValue >> 32);
                int i12 = (int) longValue;
                if (i7 >= i11 && i7 <= i12) {
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
        q9 q9Var = this.R2;
        if (q9Var != null) {
            return q9Var.u(view);
        }
        zi0 zi0Var = this.G2;
        return zi0Var != null && ((Boolean) zi0Var.a.a(view)).booleanValue();
    }

    public void j1(View view, float f10, float f11, boolean z9) {
        if (this.h1 || view == null) {
            return;
        }
        view.setPressed(z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public final void k1(int i7, View view) {
        ob0 ob0Var = this.T1;
        if (ob0Var != null) {
            org.telegram.messenger.g0.r(ob0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 == null) {
            return;
        }
        boolean z9 = i7 != this.C1;
        if (getAdapter() instanceof oj0) {
            ((oj0) getAdapter()).getClass();
        }
        if (i7 != -1) {
            this.C1 = i7;
        }
        this.D1 = view;
        if (this.A1 == 8) {
            org.telegram.ui.ActionBar.k6.G1(this.B1, this.Y1, 0);
        } else if (this.Z1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.k6.G1(this.B1, i7 == 0 ? this.Z1 : 0, i7 == getAdapter().b() + (-2) ? this.Z1 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.E1;
        rect.set(left, top, right, bottom);
        boolean isEnabled = view.isEnabled();
        if (this.F1 != isEnabled) {
            this.F1 = isEnabled;
        }
        if (z9) {
            this.B1.setVisible(false, false);
            this.B1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(V0(i7));
        this.B1.setBounds(rect);
        if (z9 && getVisibility() == 0) {
            this.B1.setVisible(true, false);
        }
    }

    public final void l1() {
        int i7;
        ob0 ob0Var = this.T1;
        if (ob0Var != null) {
            org.telegram.messenger.g0.r(ob0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i7 = this.w2) != -1) {
            k1(i7, view);
            org.telegram.ui.Cells.y yVar = this.B1;
            if (yVar != null) {
                yVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.w2 = -1;
            return;
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            Drawable current = yVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.y yVar3 = this.B1;
        if (yVar3 != null && yVar3.isStateful() && this.B1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.B1);
        }
    }

    public final void m1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.E1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                k1(this.M1, view);
                org.telegram.ui.Cells.y yVar = this.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            y1();
        }
    }

    public final void n1(pj0 pj0Var, boolean z9) {
        ViewParent parent;
        if (pj0Var == null || (parent = pj0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z9);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z9);
    }

    public final void o1(int i7, boolean z9) {
        this.W1 = z9;
        this.X1 = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ui0 ui0Var = this.d1;
        if (ui0Var == null || ui0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.d1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.d1);
        }
        ((ViewGroup) getParent()).addView(this.d1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        si0 si0Var = this.l2;
        if (si0Var != null) {
            si0Var.a();
        }
        if (this.t2) {
            this.t2 = false;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.O1) {
            n1(this, true);
        }
        if (this.Z0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i7 = org.telegram.ui.an.id;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ui0 ui0Var = this.d1;
        if (ui0Var != null) {
            this.H1 = true;
            int paddingTop = i10 + (ui0Var.a ? getPaddingTop() : ui0Var.h0);
            ui0 ui0Var2 = this.d1;
            if (ui0Var2.g0) {
                ui0Var2.layout(0, paddingTop, ui0Var2.getMeasuredWidth(), this.d1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.d1.getMeasuredWidth();
                ui0 ui0Var3 = this.d1;
                ui0Var3.layout(measuredWidth, paddingTop, ui0Var3.getMeasuredWidth() + measuredWidth, this.d1.getMeasuredHeight() + paddingTop);
            }
            this.H1 = false;
        }
        L0(false);
        yi0 yi0Var = this.S1;
        if (yi0Var != null) {
            e1(yi0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ui0 ui0Var = this.d1;
        if (ui0Var != null && ui0Var.getLayoutParams() != null) {
            ui0 ui0Var2 = this.d1;
            int measuredHeight = (getMeasuredHeight() - (ui0Var2.a ? getPaddingTop() : ui0Var2.h0)) - getPaddingBottom();
            this.d1.getLayoutParams().height = measuredHeight;
            this.d1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i7, i10, i11, i12);
        bi.e5 e5Var = this.b1;
        if (e5Var != null) {
            e5Var.requestLayout();
        }
        int i13 = this.w1;
        if (i13 != 1) {
            if (i13 != 2 || this.e1 == null || (view = this.p1) == null) {
                return;
            }
            S0(view, true);
            return;
        }
        if (this.e1 == null || this.n1.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < this.n1.size(); i14++) {
            S0((View) this.n1.get(i14), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ui0 ui0Var = this.d1;
        if (ui0Var != null && ui0Var.n) {
            return false;
        }
        boolean z9 = this.b2;
        dt dtVar = this.C2;
        if (!z9 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.i2 = Float.MAX_VALUE;
            this.j2 = Float.MAX_VALUE;
            this.b2 = false;
            this.c2 = false;
            n1(this, false);
            this.g2 = false;
            org.telegram.messenger.g0.r(dtVar);
            return super.onTouchEvent(motionEvent);
        }
        if (this.i2 == Float.MAX_VALUE && this.j2 == Float.MAX_VALUE) {
            this.i2 = motionEvent.getX();
            this.j2 = motionEvent.getY();
        }
        if (!this.c2 && Math.abs(motionEvent.getY() - this.j2) > this.a2) {
            this.c2 = true;
            n1(this, true);
        }
        if (this.c2) {
            M0(motionEvent.getX(), motionEvent.getY());
            m.c3 c3Var = this.f2;
            int[] iArr = this.k2;
            org.telegram.ui.an anVar = (org.telegram.ui.an) c3Var.d;
            iArr[0] = (int) anVar.L9;
            iArr[1] = anVar.Ua;
            if (motionEvent.getY() > (getMeasuredHeight() - org.telegram.messenger.g0.L(56.0f)) - this.k2[1] && (this.e2 >= this.d2 || !this.f2.a)) {
                this.h2 = false;
                if (!this.g2) {
                    this.g2 = true;
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.h3(dtVar);
                    return true;
                }
            } else if (motionEvent.getY() >= org.telegram.messenger.g0.L(56.0f) + this.k2[0] || (this.e2 > this.d2 && this.f2.a)) {
                this.g2 = false;
                org.telegram.messenger.g0.r(dtVar);
            } else {
                this.h2 = true;
                if (!this.g2) {
                    this.g2 = true;
                    org.telegram.messenger.g0.r(dtVar);
                    org.telegram.messenger.g0.h3(dtVar);
                    return true;
                }
            }
        }
        return true;
    }

    public final void p1(ej0 ej0Var, long j3) {
        this.W0 = ej0Var;
        qt qtVar = this.K1;
        boolean z9 = ej0Var != null;
        a10 a10Var = (a10) qtVar.b;
        a10Var.t = z9;
        a10Var.u = j3;
    }

    public final void q1(int i7, int i10, int i11, int i12) {
        if (getPaddingLeft() == i7 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.B2 = true;
        setPadding(i7, i10, i11, i12);
        this.B2 = false;
    }

    public final void r1() {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.V1 || this.B2) {
            return;
        }
        super.requestLayout();
    }

    public void s1(int i7, float f10, boolean z9) {
        ai.c0 c0Var = new ai.c0(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new fi.u4(this, c0Var, sparseIntArray, 3), new fi(sparseIntArray, 2));
        t1((org.telegram.messenger.d20) pair.first, (org.telegram.messenger.d20) pair.second, i7, f10, z9);
    }

    public void setAccessibilityEnabled(boolean z9) {
        this.o2 = z9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(v4.g0 g0Var) {
        v4.g0 adapter = getAdapter();
        jg.n1 n1Var = this.r2;
        if (adapter != null) {
            adapter.a.unregisterObserver(n1Var);
        }
        ArrayList arrayList = this.n1;
        if (arrayList != null) {
            arrayList.clear();
            this.o1.clear();
        }
        this.q1 = -1;
        this.C1 = -1;
        this.D1 = null;
        this.E1.setEmpty();
        this.p1 = null;
        if (g0Var instanceof kj0) {
            this.e1 = (kj0) g0Var;
        } else {
            this.e1 = null;
        }
        super.setAdapter(g0Var);
        if (g0Var != null) {
            g0Var.B(n1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z9) {
        this.i1 = z9;
    }

    public void setAllowStopHeaveOperations(boolean z9) {
        this.v1 = z9;
    }

    public void setBitmapSectionsBackgroundColorKey(int i7) {
        if (this.V2 == i7) {
            return;
        }
        this.V2 = i7;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z9) {
        this.F2 = z9;
        if (z9) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z9) {
        this.h1 = z9;
    }

    public void setDisallowInterceptTouchEvents(boolean z9) {
        this.O1 = z9;
    }

    public void setDrawSelection(boolean z9) {
        this.S0 = z9;
    }

    public void setDrawSelectorBehind(boolean z9) {
        this.z1 = z9;
    }

    public void setEmptyView(View view) {
        View view2 = this.a1;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.a1 = view;
        if (this.W1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.g1) {
            this.z2 = -1;
            K0(false);
            return;
        }
        View view3 = this.a1;
        if (view3 != null) {
            this.z2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i7) {
        this.d1 = new ui0(this, getContext(), i7);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.d1);
        }
    }

    public void setFastScrollVisible(boolean z9) {
        ui0 ui0Var = this.d1;
        if (ui0Var == null) {
            return;
        }
        ui0Var.setVisibility(z9 ? 0 : 8);
        this.d1.a0 = z9;
    }

    public void setHideIfEmpty(boolean z9) {
        this.y1 = z9;
    }

    public void setInstantClick(boolean z9) {
        this.P1 = z9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(v4.l0 l0Var) {
        super.setItemAnimator(l0Var);
    }

    public void setItemSelectorColorProvider(org.telegram.messenger.k9 k9Var) {
        this.v2 = k9Var;
    }

    public void setItemsEnterAnimator(si0 si0Var) {
        this.l2 = si0Var;
    }

    public void setLegacySections(boolean z9) {
        if (this.S2 == z9) {
            return;
        }
        this.S2 = z9;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.k6.w0(b1() ? org.telegram.ui.ActionBar.k6.j6 : org.telegram.ui.ActionBar.k6.i6, this.n2);
        } else {
            intValue = num.intValue();
        }
        this.u2 = intValue;
        org.telegram.ui.ActionBar.k6.H1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(aj0 aj0Var) {
        this.Z0 = aj0Var;
    }

    public void setOnItemClickListener(bj0 bj0Var) {
        this.T0 = bj0Var;
    }

    public void setOnItemLongClickListener(dj0 dj0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = dj0Var;
        qt qtVar = this.K1;
        boolean z9 = dj0Var != null;
        a10 a10Var = (a10) qtVar.b;
        a10Var.t = z9;
        a10Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(v4.s0 s0Var) {
        this.Y0 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i7) {
        this.u1 = i7;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z9) {
        this.q2 = z9;
    }

    public void setScrollEnabled(boolean z9) {
        this.R1 = z9;
    }

    public void setSections(boolean z9) {
        s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), z9);
    }

    public void setSectionsDrawBackground(boolean z9) {
        if (this.T2 == z9) {
            return;
        }
        this.T2 = z9;
        if (z9) {
            setLegacySections(false);
        }
        q9 q9Var = this.R2;
        if (q9Var != null) {
            pj0 pj0Var = q9Var.a;
            if (q9Var.K != z9) {
                q9Var.K = z9;
                pj0Var.a0();
                pj0Var.invalidate();
            }
            this.y1 = false;
            if (this.a1 != null) {
                setVisibility(0);
            }
        }
    }

    public void setSectionsDrawingMode(nj0 nj0Var) {
        if (this.U2 == nj0Var) {
            return;
        }
        this.U2 = nj0Var;
        q9 q9Var = this.R2;
        if (q9Var != null) {
            pj0 pj0Var = q9Var.a;
            if (q9Var.L == nj0Var) {
                return;
            }
            q9Var.L = nj0Var;
            pj0Var.a0();
            pj0Var.invalidate();
        }
    }

    public void setSectionsOverscanTop(int i7) {
        this.Q2 = i7;
    }

    public void setSectionsType(int i7) {
        this.w1 = i7;
        if (i7 == 1 || i7 == 3) {
            this.n1 = new ArrayList();
            this.o1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i7) {
        this.u2 = i7;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i10 = this.A1;
        if (i10 == 8) {
            this.B1 = org.telegram.ui.ActionBar.k6.a0(i7, this.Y1, 0);
        } else if (i10 == 9) {
            this.B1 = null;
        } else {
            int i11 = this.Z1;
            if (i11 > 0) {
                this.B1 = org.telegram.ui.ActionBar.k6.a0(i7, i11, i11);
            } else {
                int i12 = this.Y1;
                if (i12 > 0 && i10 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.k6.k0(i12, i12, i12, i12, 0, i7, -16777216);
                } else if (i10 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.k6.h0(i7, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.k6.h0(i7, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i7) {
        this.Y1 = i7;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.m2 = aVar;
    }

    public void setSelectorType(int i7) {
        this.A1 = i7;
    }

    public void setSkipDrawSection(boolean z9) {
        this.x1 = z9;
    }

    public void setTopBottomSelectorRadius(int i7) {
        this.Z1 = i7;
    }

    public void setTranslateSelector(boolean z9) {
        this.G1 = z9 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i7) {
        if (i7 <= 0) {
            i7 = -1;
        }
        this.G1 = i7;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ui0 ui0Var = this.d1;
        if (ui0Var != null) {
            ui0Var.setTranslationY(f10);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z9) {
        if (Y2 != null) {
            super.setVerticalScrollBarEnabled(z9);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            this.U1 = false;
        }
    }

    public final void t1(org.telegram.messenger.d20 d20Var, org.telegram.messenger.d20 d20Var2, int i7, float f10, boolean z9) {
        ax axVar = new ax(this, 16);
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.j6, this.n2);
        this.H2 = d20Var;
        this.I2 = d20Var2;
        this.O2 = i7;
        this.P2 = z9;
        this.L2 = f10;
        this.M2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.J2 = axVar;
        f1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        if (!this.X0) {
            return super.v(i7, i10, i11, iArr, iArr2);
        }
        ej0 ej0Var = this.W0;
        if (ej0Var != null) {
            ej0Var.q(i10);
        }
        iArr[0] = i7;
        iArr[1] = i10;
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.B1 == drawable || super.verifyDrawable(drawable);
    }

    public boolean w1() {
        return this.G;
    }

    public final void x1() {
        ui0 ui0Var = this.d1;
        if (ui0Var != null) {
            ui0Var.updateColors();
        }
    }

    public final void y1() {
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar == null || !yVar.isStateful()) {
            return;
        }
        if (this.L1 != null) {
            if (this.B1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.B1);
            }
        } else if (this.T1 == null) {
            this.B1.setState(StateSet.NOTHING);
        }
    }

    public pj0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.S0 = true;
        this.i1 = true;
        this.q1 = -1;
        this.r1 = -1;
        this.x1 = false;
        this.y1 = true;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.i2 = Float.MAX_VALUE;
        this.j2 = Float.MAX_VALUE;
        this.o2 = true;
        this.p2 = new yd(1);
        this.q2 = true;
        this.r2 = new jg.n1(this, 1);
        this.C2 = new dt(this, 10);
        this.S2 = true;
        this.U2 = nj0.a;
        this.V2 = org.telegram.ui.ActionBar.k6.a7;
        this.X2 = new Path();
        this.n2 = f6Var;
        os osVar = new os();
        this.D2 = osVar;
        setEdgeEffectFactory(osVar);
        org.telegram.ui.ActionBar.r6.m(this, 21, org.telegram.ui.ActionBar.k6.s8, f6Var);
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, f6Var);
        try {
            if (!Z2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                Y2 = iArr;
                if (iArr == null) {
                    Y2 = new int[0];
                }
                Z2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(Y2);
            Method method = a3;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        super.setOnScrollListener(new ui(this, 13));
        this.E.add(new ij0(context, this));
    }

    public void setOnItemClickListener(cj0 cj0Var) {
        this.U0 = cj0Var;
    }

    public void setOnItemLongClickListener(ej0 ej0Var) {
        p1(ej0Var, ViewConfiguration.getLongPressTimeout());
    }
}
