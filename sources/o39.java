// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class o39 extends RecyclerView implements wg5 {
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
    public ff0 C1;
    public boolean C2;
    public int D1;
    public final bg7 D2;
    public View E1;
    public final qs3 E2;
    public final Rect F1;
    public Matrix F2;
    public boolean G1;
    public boolean G2;
    public int H1;
    public a39 H2;
    public boolean I1;
    public q8c I2;
    public boolean J1;
    public q8c J2;
    public boolean K1;
    public k88 K2;
    public z24 L1;
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
    public g39 R1;
    public int R2;
    public boolean S1;
    public yj0 S2;
    public boolean T0;
    public z29 T1;
    public boolean T2;
    public c39 U0;
    public sr8 U1;
    public boolean U2;
    public d39 V0;
    public boolean V1;
    public m39 V2;
    public e39 W0;
    public boolean W1;
    public int W2;
    public f39 X0;
    public boolean X1;
    public ArrayList X2;
    public boolean Y0;
    public boolean Y1;
    public final Path Y2;
    public i49 Z0;
    public int Z1;
    public b39 a1;
    public int a2;
    public View b1;
    public int b2;
    public oc6 c1;
    public boolean c2;
    public yq4 d1;
    public boolean d2;
    public v29 e1;
    public int e2;
    public j39 f1;
    public int f2;
    public boolean g1;
    public h24 g2;
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
    public t29 m2;
    public long n1;
    public vs2 n2;
    public ArrayList o1;
    public final wjb o2;
    public ArrayList p1;
    public boolean p2;
    public View q1;
    public final hw1 q2;
    public int r1;
    public boolean r2;
    public int s1;
    public final nr7 s2;
    public int t1;
    public Paint t2;
    public int u1;
    public boolean u2;
    public int v1;
    public int v2;
    public boolean w1;
    public js4 w2;
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

    public o39(Context context, wjb wjbVar) {
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
        this.q2 = new hw1();
        this.r2 = true;
        this.s2 = new nr7(this, (byte) 1);
        this.D2 = new bg7(this, (byte) 12);
        this.T2 = true;
        this.V2 = m39.a;
        this.W2 = bkb.Z6;
        this.Y2 = new Path();
        this.o2 = wjbVar;
        qs3 qs3Var = new qs3();
        this.E2 = qs3Var;
        setEdgeEffectFactory(qs3Var);
        zkb.l(this, 21, bkb.r8, wjbVar);
        zkb.l(this, 20, bkb.h6, wjbVar);
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
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        super.setOnScrollListener(new n58(this, (byte) 9));
        this.F.add(new ds5(this, context));
    }

    public static float H0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b1(View view) {
        if (!(view instanceof i39)) {
            return false;
        }
        nfa nfaVar = (nfa) ((i39) view);
        return nfaVar.c2 && nfaVar.g2 > 0;
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
    public final void D0() {
        try {
            super.D0();
        } catch (NullPointerException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f, float f2) {
        float f3;
        float f4;
        int childCount = getChildCount();
        for (int i = 0; i < 2; i++) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if ((!(childAt instanceof gb2) && !(childAt instanceof uk1)) || childAt.getVisibility() != 4) {
                    if (i == 0) {
                        f3 = childAt.getTranslationX();
                        f4 = childAt.getTranslationY();
                    } else {
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    if (f >= childAt.getLeft() + f3 && f <= childAt.getRight() + f3 && f2 >= childAt.getTop() + f4 && f2 <= childAt.getBottom() + f4) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    public final void E0(Runnable runnable) {
        this.E2.b.add(new os3(runnable, (byte) 2));
    }

    public boolean F0(float f) {
        return true;
    }

    public boolean G0(View view) {
        return true;
    }

    public boolean I0(View view, float f, float f2) {
        return true;
    }

    public final void J0(boolean z) {
        yq4 yq4Var = this.d1;
        if (yq4Var != null) {
            gl.r(yq4Var);
            this.d1 = null;
        }
        View view = this.M1;
        if (view != null) {
            if (z) {
                k1(view, 0.0f, 0.0f, false);
            }
            this.M1 = null;
            n1(view, null);
        }
        this.F1.setEmpty();
        g39 g39Var = this.R1;
        if (g39Var != null) {
            gl.r(g39Var);
            this.R1 = null;
        }
        this.O1 = false;
    }

    public void K0(Canvas canvas, RectF rectF, long j) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            Object Y = Y(i);
            if ((Y instanceof wg5) && ((Y != this.H2 && Y != this.S2) || this.G2)) {
                ((wg5) Y).d(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                this.B2 = true;
                drawChild(canvas, childAt, j);
                this.B2 = false;
            }
        }
    }

    public final void L0(boolean z) {
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
        boolean S0 = S0();
        int i = S0 ? 0 : 8;
        if (!this.X1 || !gba.c()) {
            z = false;
        }
        if (!z) {
            this.A2 = i;
            this.b1.setVisibility(i);
            this.b1.setAlpha(1.0f);
        } else if (this.A2 != i) {
            this.A2 = i;
            View view = this.b1;
            if (i == 0) {
                view.animate().setListener(null).cancel();
                if (this.b1.getVisibility() == 8) {
                    this.b1.setVisibility(0);
                    this.b1.setAlpha(0.0f);
                    if (this.Y1) {
                        this.b1.setScaleX(0.7f);
                        this.b1.setScaleY(0.7f);
                    }
                }
                this.b1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (view.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.b1.animate().alpha(0.0f);
                if (this.Y1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new l48(this, (byte) 29)).start();
            }
        }
        if (this.z1) {
            if (c1() && this.U2) {
                return;
            }
            int i2 = S0 ? 4 : 0;
            if (getVisibility() != i2) {
                setVisibility(i2);
            }
            this.V1 = true;
        }
    }

    public final void M0(boolean z) {
        v29 v29Var;
        s49 T;
        v29 v29Var2;
        View view;
        s49 T2;
        int b;
        int S;
        if (((this.J1 || z) && this.e1 != null) || !(this.x1 == 0 || this.f1 == null)) {
            d49 layoutManager = getLayoutManager();
            if (layoutManager instanceof t26) {
                t26 t26Var = (t26) layoutManager;
                if (t26Var.o) {
                    if (this.f1 == null) {
                        int K0 = t26Var.K0();
                        t26Var.M0();
                        if (K0 != -1) {
                            if ((!this.J1 && !z) || (v29Var = this.e1) == null || v29Var.n) {
                                return;
                            }
                            w39 adapter = getAdapter();
                            if (adapter instanceof w29) {
                                w29 w29Var = (w29) adapter;
                                float H = w29Var.H(this);
                                this.e1.setIsVisible(w29Var.E(this));
                                this.e1.setProgress(Math.min(1.0f, H));
                                this.e1.b(false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.x1 == 1 ? 0 : getPaddingTop();
                    int i = this.x1;
                    float f = 32.0f;
                    int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i != 1 && i != 3) {
                        if (i == 2) {
                            this.m1 = 0.0f;
                            if (this.f1.b() != 0) {
                                int childCount = getChildCount();
                                int i3 = 0;
                                int i4 = Integer.MAX_VALUE;
                                View view2 = null;
                                View view3 = null;
                                for (int i5 = 0; i5 < childCount; i5++) {
                                    View childAt = getChildAt(i5);
                                    int bottom = childAt.getBottom();
                                    if (bottom > this.v1 + paddingTop) {
                                        if (bottom < i2) {
                                            view3 = childAt;
                                            i2 = bottom;
                                        }
                                        i3 = Math.max(i3, bottom);
                                        if (bottom >= gl.L(32.0f) + this.v1 + paddingTop && bottom < i4) {
                                            view2 = childAt;
                                            i4 = bottom;
                                        }
                                    }
                                }
                                if (view3 == null || (T2 = T(view3)) == null || (S = this.f1.S((b = T2.b()))) < 0) {
                                    return;
                                }
                                if (this.r1 != S || this.q1 == null) {
                                    View view4 = this.q1;
                                    boolean z2 = view4 == null;
                                    View T3 = this.f1.T(S, view4);
                                    if (z2) {
                                        T0(T3, false);
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
                                int Q = this.f1.Q(b);
                                int i6 = (i3 == 0 || i3 >= getMeasuredHeight() - getPaddingBottom()) ? this.v1 : -paddingTop;
                                int i7 = M - 1;
                                View view6 = this.q1;
                                if (Q == i7) {
                                    int height = view6.getHeight();
                                    int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.v1);
                                    int i8 = height2 < height ? height2 - height : paddingTop;
                                    View view7 = this.q1;
                                    int i9 = paddingTop + i6;
                                    if (i8 < 0) {
                                        view7.setTag(Integer.valueOf(i9 + i8));
                                    } else {
                                        view7.setTag(Integer.valueOf(i9));
                                    }
                                } else {
                                    view6.setTag(Integer.valueOf(paddingTop + i6));
                                }
                                invalidate();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i10 = 0;
                    int i11 = Integer.MAX_VALUE;
                    View view8 = null;
                    while (i10 < childCount2) {
                        View childAt2 = getChildAt(i10);
                        int bottom2 = childAt2.getBottom();
                        float f2 = f;
                        int i12 = this.v1;
                        if (bottom2 > i12 + paddingTop) {
                            if (bottom2 < i2) {
                                view8 = childAt2;
                                i2 = bottom2;
                            }
                            if (bottom2 >= gl.L(f2) + i12 + paddingTop && bottom2 < i11) {
                                i11 = bottom2;
                            }
                        }
                        i10++;
                        f = f2;
                    }
                    if (view8 == null || (T = T(view8)) == null) {
                        return;
                    }
                    int b2 = T.b();
                    int abs = Math.abs(t26Var.M0() - b2) + 1;
                    if ((this.J1 || z) && (v29Var2 = this.e1) != null && !v29Var2.n && (getAdapter() instanceof w29)) {
                        this.e1.setProgress(Math.min(1.0f, b2 / ((this.f1.b() - abs) + 1)));
                    }
                    this.p1.addAll(this.o1);
                    this.o1.clear();
                    if (this.f1.b() != 0) {
                        if (this.r1 != b2 || this.s1 != abs) {
                            this.r1 = b2;
                            this.s1 = abs;
                            this.u1 = 1;
                            int S2 = this.f1.S(b2);
                            this.t1 = S2;
                            int M2 = (this.f1.M(S2) + b2) - this.f1.Q(b2);
                            while (M2 < b2 + abs) {
                                M2 += this.f1.M(this.t1 + this.u1);
                                this.u1++;
                            }
                        }
                        if (this.x1 != 3) {
                            int i13 = b2;
                            for (int i14 = this.t1; i14 < this.t1 + this.u1; i14++) {
                                if (this.p1.isEmpty()) {
                                    view = null;
                                } else {
                                    view = (View) this.p1.get(0);
                                    this.p1.remove(0);
                                }
                                boolean z3 = view == null;
                                View T4 = this.f1.T(i14, view);
                                if (z3) {
                                    T0(T4, false);
                                }
                                this.o1.add(T4);
                                int M3 = this.f1.M(i14);
                                if (i14 == this.t1) {
                                    int Q2 = this.f1.Q(i13);
                                    if (Q2 == M3 - 1) {
                                        T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                    } else if (Q2 == M3 - 2) {
                                        View childAt3 = getChildAt(i13 - b2);
                                        T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -gl.L(100.0f), 0)));
                                    } else {
                                        T4.setTag(0);
                                    }
                                    i13 = (M3 - this.f1.Q(b2)) + i13;
                                } else {
                                    View childAt4 = getChildAt(i13 - b2);
                                    if (childAt4 != null) {
                                        T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                    } else {
                                        T4.setTag(Integer.valueOf(-gl.L(100.0f)));
                                    }
                                    i13 += M3;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void N0(float f, float f2) {
        f27 f27Var;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.l2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f2, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f, 0.0f));
        for (int i = 0; i < getChildCount(); i++) {
            h24 h24Var = this.g2;
            int[] iArr2 = this.l2;
            mu1 mu1Var = (mu1) h24Var.d;
            iArr2[0] = (int) mu1Var.P9;
            iArr2[1] = mu1Var.Ya;
            View childAt = getChildAt(i);
            RectF rectF = gl.P;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i2 = this.f2;
                if (i2 != S) {
                    int i3 = this.e2;
                    boolean z = i2 > i3 || S > i3;
                    mu1 mu1Var2 = (mu1) this.g2.d;
                    vs1 vs1Var = mu1Var2.D0;
                    ArrayList arrayList = mu1Var2.M6;
                    int i4 = S - vs1Var.K;
                    if (i4 >= 0 && i4 < arrayList.size()) {
                        k27 k27Var = (k27) arrayList.get(i4);
                        if (k27Var.U == 0 && k27Var.z2() && (f27Var = (f27) mu1Var2.P6.f(k27Var.c1())) != null) {
                            ArrayList arrayList2 = f27Var.d;
                            S = arrayList.indexOf((k27) arrayList2.get(z ? 0 : arrayList2.size() - 1)) + mu1Var2.D0.K;
                        }
                    }
                    int i5 = this.f2;
                    if (z) {
                        if (S <= i5) {
                            while (i5 > S) {
                                if (i5 != this.e2 && this.g2.b(i5)) {
                                    this.g2.l(min2, min, i5, false);
                                }
                                i5--;
                            }
                        } else if (!this.g2.a) {
                            for (int i6 = i5 + 1; i6 <= S; i6++) {
                                if (i6 != this.e2 && this.g2.b(i6)) {
                                    this.g2.l(min2, min, i6, true);
                                }
                            }
                        }
                    } else if (S > i5) {
                        while (i5 < S) {
                            if (i5 != this.e2 && this.g2.b(i5)) {
                                this.g2.l(min2, min, i5, false);
                            }
                            i5++;
                        }
                    } else if (!this.g2.a) {
                        for (int i7 = i5 - 1; i7 >= S; i7--) {
                            if (i7 != this.e2 && this.g2.b(i7)) {
                                this.g2.l(min2, min, i7, true);
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

    public final void O0(Canvas canvas, View view) {
        boolean z;
        boolean z2;
        if (this.S2 == null && view != null && u1(view) && ((Boolean) this.H2.a.a(view)).booleanValue() && j1(view)) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                z2 = false;
                z = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                z = U0 != null && j1(U0);
                z2 = U02 != null && j1(U02);
            }
            RectF rectF = gl.P;
            rectF.set(view.getX(), Math.max((-this.M2) - this.R2, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight() + this.M2, H0(view)));
            if (z && z2) {
                z = v1(view) >= rectF.top;
                boolean z3 = H0(view) <= rectF.bottom;
                if (z && z3) {
                    return;
                } else {
                    z2 = z3;
                }
            }
            Path path = this.Y2;
            if (z) {
                if (z2) {
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.O2, Path.Direction.CW);
                canvas.clipPath(path);
                return;
            }
            if (z2) {
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                path.rewind();
                float f = this.M2;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof ju5 ? ((ju5) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = gl.P;
        rectF.set(view.getLeft(), Math.max((-this.M2) - this.R2, v1(view) - (z ? this.M2 : 0.0f)), view.getRight(), Math.min(getHeight() + this.M2, (H0(view2) + (z2 ? this.M2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom >= rectF.top) {
            float f = this.M2;
            this.K2.j(canvas, rectF, Float.valueOf(f), Float.valueOf(f), Float.valueOf(view.getAlpha()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(Canvas canvas) {
        float f;
        int i;
        boolean z;
        float[] fArr;
        float f2;
        float f3;
        int i2;
        View view;
        if (this.K2 == null || this.H2 == null) {
            return;
        }
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (c0()) {
            if (this.X2 == null) {
                this.X2 = new ArrayList();
            }
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i3);
                if (childAt != this.b1 && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.H2.a.a(childAt)).booleanValue()) {
                    float v1 = v1(childAt);
                    float H0 = H0(childAt);
                    s49 T = T(childAt);
                    if (!T.j() || childAt.getAlpha() >= 1.0f) {
                        if (i1(T.b())) {
                        }
                        ArrayList arrayList = this.X2;
                        float alpha = childAt.getAlpha();
                        k39 k39Var = new k39();
                        k39Var.a = v1;
                        k39Var.b = H0;
                        k39Var.c = alpha;
                        arrayList.add(k39Var);
                    } else {
                        if (T.j() && (i2 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i2 / 1000.0d)) + 1;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i4);
                                if (view != null && view != childAt && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (view != null && H0 > view.getY() && ((Boolean) this.H2.a.a(view)).booleanValue() && !T(view).j()) {
                                v1 -= 1.0f;
                                H0 = view.getY();
                                if (H0 < v1) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.X2;
                        float alpha2 = childAt.getAlpha();
                        k39 k39Var2 = new k39();
                        k39Var2.a = v1;
                        k39Var2.b = H0;
                        k39Var2.c = alpha2;
                        arrayList2.add(k39Var2);
                    }
                }
                i3++;
            }
            ArrayList arrayList3 = this.X2;
            float f6 = this.M2;
            ArrayList arrayList4 = l39.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f = 1.0f;
                i = 0;
            } else {
                Collections.sort(arrayList3, new fx7((byte) 11));
                arrayList4.clear();
                int i5 = 0;
                while (i5 < arrayList3.size()) {
                    float f7 = ((k39) arrayList3.get(i5)).b;
                    int i6 = i5 + 1;
                    while (i6 < arrayList3.size() && ((k39) arrayList3.get(i6)).a <= f7 + 1.5f) {
                        f7 = Math.max(f7, ((k39) arrayList3.get(i6)).b);
                        i6++;
                    }
                    float f8 = Float.MAX_VALUE;
                    float f9 = Float.MIN_VALUE;
                    boolean z2 = z;
                    int i7 = i5;
                    float f10 = f4;
                    float f11 = Float.MAX_VALUE;
                    float f12 = Float.MIN_VALUE;
                    while (i7 < i6) {
                        float f13 = f5;
                        k39 k39Var3 = (k39) arrayList3.get(i7);
                        if (k39Var3.c >= 0.99f) {
                            f11 = Math.min(f11, k39Var3.a);
                            f12 = Math.max(f12, k39Var3.b);
                        }
                        i7++;
                        f5 = f13;
                    }
                    float f14 = f5;
                    Object[] objArr = f11 != Float.MAX_VALUE ? z2 ? 1 : 0 : false;
                    float f15 = f14;
                    for (int i8 = i5; i8 < i6; i8++) {
                        k39 k39Var4 = (k39) arrayList3.get(i8);
                        f8 = Math.min(f8, k39Var4.a);
                        f9 = Math.max(f9, k39Var4.b);
                        f15 = Math.max(f15, k39Var4.c);
                    }
                    if (f15 >= 0.001f) {
                        if (objArr == true) {
                            float f16 = f14;
                            k39 k39Var5 = null;
                            for (int i9 = i5; i9 < i6; i9++) {
                                k39 k39Var6 = (k39) arrayList3.get(i9);
                                float f17 = k39Var6.c;
                                if (f17 < 0.99f) {
                                    float f18 = k39Var6.a;
                                    if (f18 < f11) {
                                        float f19 = (f11 - f18) * f17;
                                        if (f19 > f16) {
                                            k39Var5 = k39Var6;
                                            f16 = f19;
                                        }
                                    }
                                }
                            }
                            float f20 = f14;
                            k39 k39Var7 = null;
                            while (i5 < i6) {
                                k39 k39Var8 = (k39) arrayList3.get(i5);
                                float f21 = k39Var8.c;
                                if (f21 < 0.99f) {
                                    float f22 = k39Var8.b;
                                    if (f22 > f12) {
                                        float f23 = (f22 - f12) * f21;
                                        if (f23 > f20) {
                                            k39Var7 = k39Var8;
                                            f20 = f23;
                                        }
                                    }
                                }
                                i5++;
                            }
                            if (k39Var5 != null) {
                                float f24 = k39Var5.a;
                                float f25 = k39Var5.c;
                                if (f25 > 0.001f) {
                                    float R1 = gl.R1(f11, f24, f25);
                                    f2 = gl.R1(f6, f25 * f6, (f11 - R1) / ((f11 - f24) + 0.001f));
                                    f11 = R1;
                                    if (k39Var7 != null) {
                                        float f26 = k39Var7.b;
                                        float f27 = k39Var7.c;
                                        if (f27 > 0.001f) {
                                            float R12 = gl.R1(f12, f26, f27);
                                            f3 = gl.R1(f6, f27 * f6, (R12 - f12) / ((f26 - f12) + 0.001f));
                                            f12 = R12;
                                            f15 = f10;
                                            f8 = f11;
                                        }
                                    }
                                    f3 = f6;
                                    f8 = f11;
                                    f15 = f10;
                                }
                            }
                            f2 = f6;
                            if (k39Var7 != null) {
                            }
                            f3 = f6;
                            f8 = f11;
                            f15 = f10;
                        } else {
                            f3 = f6;
                            f2 = f3;
                            f12 = f9;
                        }
                        if (f12 > f8) {
                            fArr = new float[5];
                            fArr[0] = f8;
                            fArr[z2 ? 1 : 0] = f12;
                            fArr[2] = f2;
                            fArr[3] = f3;
                            fArr[4] = f15;
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i5 = i6;
                            z = z2 ? 1 : 0;
                            f4 = f10;
                            f5 = f14;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i5 = i6;
                    z = z2 ? 1 : 0;
                    f4 = f10;
                    f5 = f14;
                }
                boolean z3 = z;
                f = f4;
                i = 0;
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    float[] fArr2 = (float[]) arrayList4.get(i10);
                    float f28 = fArr2[0];
                    float f29 = fArr2[z3 ? 1 : 0];
                    float f30 = fArr2[2];
                    float f31 = fArr2[3];
                    float f32 = fArr2[4];
                    if (i10 > 0) {
                        float f33 = f28 - ((float[]) arrayList4.get(i10 - 1))[z3 ? 1 : 0];
                        float f34 = f6 * 0.2f;
                        if (f33 < f34) {
                            f30 = Math.min(f30, (f33 / f34) * f6);
                        }
                    }
                    if (i10 < arrayList4.size() - 1) {
                        float f35 = ((float[]) arrayList4.get(i10 + 1))[0] - f29;
                        float f36 = 0.2f * f6;
                        if (f35 < f36) {
                            f31 = Math.min(f31, (f35 / f36) * f6);
                        }
                    }
                    Float valueOf = Float.valueOf(f30);
                    Float valueOf2 = Float.valueOf(f31);
                    Float valueOf3 = Float.valueOf(f32);
                    if (f29 > f28) {
                        RectF rectF = gl.P;
                        rectF.set(getPaddingLeft() + this.H2.c, f28, (getWidth() - this.H2.c) - getPaddingRight(), f29);
                        this.K2.j(canvas, rectF, valueOf, valueOf2, valueOf3);
                    }
                }
            }
            this.X2.clear();
        } else {
            f = 1.0f;
            i = 0;
            int i11 = -1;
            int i12 = -1;
            View view2 = null;
            View view3 = null;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2 == this.b1 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.H2.a.a(childAt2)).booleanValue() || i1(RecyclerView.R(childAt2))) {
                    P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
                    i11 = -1;
                    i12 = -1;
                    view2 = null;
                    view3 = null;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
                        i11 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i11 = i13;
                        view2 = childAt2;
                    }
                    i12 = i13;
                    view3 = childAt2;
                }
            }
            P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
        }
        if (this.L2 != null) {
            for (int i14 = i; i14 < this.L2.size(); i14++) {
                long longValue = ((Long) this.L2.get(i14)).longValue();
                Typeface typeface = gl.a;
                int i15 = (int) (longValue >> 32);
                int i16 = (int) longValue;
                float height = getHeight();
                float f37 = this.M2;
                float f38 = height + f37;
                float f39 = -f37;
                for (int i17 = i; i17 < getChildCount(); i17++) {
                    View childAt3 = getChildAt(i17);
                    int R = RecyclerView.R(childAt3);
                    if (R >= i15 && R <= i16) {
                        f38 = Math.min(f38, v1(childAt3));
                        f39 = Math.max(f39, H0(childAt3));
                    }
                }
                if (f38 < f39) {
                    RectF rectF2 = gl.P;
                    rectF2.set(getPaddingLeft() + this.H2.c, f38, (getWidth() - getPaddingRight()) - this.H2.c, f39);
                    float f40 = this.M2;
                    this.K2.j(canvas, rectF2, Float.valueOf(f40), Float.valueOf(f40), Float.valueOf(f));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        ff0 ff0Var;
        vs2 vs2Var;
        View view;
        Rect rect = this.F1;
        if (rect.isEmpty() || (ff0Var = this.C1) == null) {
            return;
        }
        int i = this.H1;
        if ((i == -2 || i == this.D1) && this.E1 != null) {
            if (getAdapter() instanceof n39) {
                ((n39) getAdapter()).getClass();
            }
            this.C1.setBounds(this.E1.getLeft(), this.E1.getTop(), this.E1.getRight(), this.E1.getBottom());
        } else {
            ff0Var.setBounds(rect);
        }
        canvas.save();
        int i2 = this.H1;
        if ((i2 == -2 || i2 == this.D1) && (vs2Var = this.n2) != null) {
            vs2Var.accept(canvas);
        }
        int i3 = this.H1;
        if ((i3 == -2 || i3 == this.D1) && (view = this.E1) != null) {
            canvas.translate(view.getX() - rect.left, this.E1.getY() - rect.top);
            this.C1.setAlpha((int) (this.E1.getAlpha() * 255.0f));
        }
        if (this.H2 != null) {
            canvas.save();
            O0(canvas, this.E1);
            this.C1.draw(canvas);
            canvas.restore();
        } else {
            this.C1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean S0() {
        return (getAdapter() == null || this.W1 || getAdapter().b() != 0) ? false : true;
    }

    public final void T0(View view, boolean z) {
        if (view != null) {
            if (view.isLayoutRequested() || z) {
                int i = this.x1;
                if (i == 1) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    try {
                        view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                } else if (i == 2) {
                    try {
                        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), 0);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
    }

    public final View U0(int i) {
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R == i) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable V0(View view, boolean z) {
        boolean z2;
        boolean z3;
        if (view.getParent() != this || !c1() || !j1(view)) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z3 = false;
            z2 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z2 = U0 != null && j1(U0);
            z3 = U02 != null && j1(U02);
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, v1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), H0(view)));
        if (z2 && z3 && !z) {
            z2 = v1(view) >= rectF.top;
            boolean z4 = H0(view) <= rectF.bottom;
            if (z2 && z4) {
                return bkb.b0(0, bkb.v0(bkb.c6, this.o2));
            }
            z3 = z4;
        }
        Path path = new Path();
        if ((!z2 && !z3) || z) {
            path.rewind();
            float f = this.M2;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else if (!z2) {
            path.rewind();
            path.addRoundRect(rectF, this.N2, Path.Direction.CW);
        } else if (!z3) {
            path.rewind();
            path.addRoundRect(rectF, this.O2, Path.Direction.CW);
        }
        return new u29(this, view, path, rectF);
    }

    public Integer W0(int i) {
        js4 js4Var = this.w2;
        if (js4Var != null) {
            return (Integer) js4Var.m(Integer.valueOf(i));
        }
        return null;
    }

    public final Paint X0(String str) {
        wjb wjbVar = this.o2;
        Paint d = wjbVar != null ? wjbVar.d(str) : null;
        return d != null ? d : bkb.T0(str);
    }

    public final boolean Y0(int i, View view) {
        int R;
        if (view == null || i > 0 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (ps3 ps3Var : this.E2.a) {
            if (ps3Var != null && ps3Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // wg5
    public final void a(tab tabVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            tabVar.b = true;
            return;
        }
        if (Z0() && getOverScrollMode() != 2) {
            tabVar.b = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            Object Y = Y(i);
            if ((Y instanceof wg5) && ((Y != this.H2 && Y != this.S2) || this.G2)) {
                ((wg5) Y).a(tabVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                tabVar.getClass();
                mk1.a(tabVar, childAt);
            }
        }
    }

    public final boolean a1(int i, View view) {
        int R;
        if (view == null || i < getChildCount() - 1 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().b() - 1) {
            return false;
        }
        return ((Boolean) this.J2.a(Integer.valueOf(getAdapter().d(R + 1)))).booleanValue();
    }

    public final boolean c1() {
        return (this.H2 == null && this.S2 == null) ? false : true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.S1 && super.canScrollVertically(i);
    }

    @Override // wg5
    public void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!Z0() || getOverScrollMode() == 2) {
            K0(canvas, rectF, uptimeMillis);
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
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void d1() {
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

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        t29 t29Var = this.m2;
        if (t29Var != null) {
            o39 o39Var = t29Var.a;
            if (t29Var.d || t29Var.e) {
                for (int i = 0; i < o39Var.getChildCount(); i++) {
                    View childAt = o39Var.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !t29Var.c.contains(childAt)) {
                        Float f = (Float) t29Var.b.get(R, null);
                        if (f == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f.floatValue());
                        }
                    }
                }
                t29Var.d = false;
            }
        }
        if (this.T0 && this.A1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.T0 && !this.A1) {
            R0(canvas);
        }
        oc6 oc6Var = this.c1;
        if (oc6Var != null) {
            oc6Var.draw(canvas);
        }
        if (this.y1) {
            return;
        }
        int i2 = this.x1;
        if (i2 == 1) {
            if (this.f1 == null || this.o1.isEmpty()) {
                return;
            }
            for (int i3 = 0; i3 < this.o1.size(); i3++) {
                View view2 = (View) this.o1.get(i3);
                int save = canvas.save();
                canvas.translate(k96.a0 ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i2 != 2 || this.f1 == null || (view = this.q1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(k96.a0 ? getWidth() - this.q1.getWidth() : 0.0f, ((Integer) this.q1.getTag()).intValue());
        Drawable drawable = this.k1;
        if (drawable != null) {
            drawable.setBounds(0, this.q1.getMeasuredHeight(), getWidth(), this.k1.getIntrinsicHeight() + this.q1.getMeasuredHeight());
            this.k1.setAlpha((int) (this.l1 * 255.0f));
            this.k1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.n1);
            this.n1 = elapsedRealtime;
            float f2 = this.l1;
            float f3 = this.m1;
            if (f2 < f3) {
                float f4 = (min / 180.0f) + f2;
                this.l1 = f4;
                if (f4 > f3) {
                    this.l1 = f3;
                }
                invalidate();
            } else if (f2 > f3) {
                float f5 = f2 - (min / 180.0f);
                this.l1 = f5;
                if (f5 < f3) {
                    this.l1 = f3;
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
            int i = this.y2 - 1;
            this.y2 = i;
            if (i == 0 && this.z2) {
                setOverScrollMode(2);
            }
        }
        v29 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.b0 || !fastScroll.m0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.f1 == null || (view = this.q1) == null || view.getAlpha() == 0.0f || !this.q1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (this.H2 == null || this.B2) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        O0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1();
    }

    public final void e1(boolean z) {
        View view = this.M1;
        if (view != null) {
            k1(view, 0.0f, 0.0f, false);
            this.M1 = null;
            if (z) {
                n1(view, null);
            }
        }
        if (z) {
            return;
        }
        this.C1.setState(StateSet.NOTHING);
        this.F1.setEmpty();
    }

    public final void f1(z29 z29Var, int i, boolean z) {
        sr8 sr8Var = this.U1;
        if (sr8Var != null) {
            gl.r(sr8Var);
            this.U1 = null;
        }
        s49 K = K(z29Var.run());
        if (K == null) {
            if (z) {
                this.T1 = z29Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c = K.c();
        this.x2 = c;
        l1(c, view);
        ff0 ff0Var = this.C1;
        if (ff0Var != null) {
            Drawable current = ff0Var.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.W0 == null && this.V0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.C1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        ff0 ff0Var2 = this.C1;
        if (ff0Var2 != null && ff0Var2.isStateful() && this.C1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.C1);
        }
        if (i > 0) {
            this.T1 = null;
            sr8 sr8Var2 = new sr8(this, (byte) 15);
            this.U1 = sr8Var2;
            gl.d3(sr8Var2, i);
        }
    }

    public final void g1() {
        q8c q8cVar;
        k88 k88Var;
        c49 c49Var = this.H2;
        if (c49Var != null) {
            r0(c49Var);
            this.H2 = null;
        }
        c49 c49Var2 = this.S2;
        if (c49Var2 != null) {
            r0(c49Var2);
            this.S2 = null;
        }
        q8c q8cVar2 = this.I2;
        if (q8cVar2 == null || (q8cVar = this.J2) == null || (k88Var = this.K2) == null) {
            return;
        }
        boolean z = this.T2;
        int i = this.P2;
        if (z) {
            a39 a39Var = new a39(this, q8cVar2, i, this.Q2);
            this.H2 = a39Var;
            i(a39Var);
        } else {
            yj0 yj0Var = new yj0(this, q8cVar2, q8cVar, i, this.M2, k88Var, this.Q2, this.U2, this.V2);
            this.S2 = yj0Var;
            i(yj0Var);
        }
    }

    public View getEmptyView() {
        return this.b1;
    }

    public v29 getFastScroll() {
        return this.e1;
    }

    public ArrayList<View> getHeaders() {
        return this.o1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.p1;
    }

    public c39 getOnItemClickListener() {
        return this.U0;
    }

    public i49 getOnScrollListener() {
        return this.Z0;
    }

    public View getPinnedHeader() {
        return this.q1;
    }

    public View getPressedChildView() {
        return this.M1;
    }

    public int getSectionColorForDecoration() {
        return bkb.v0(bkb.c6, this.o2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return bm2.o(bkb.v0(this.W2, this.o2), kk7.d4);
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0(View view) {
        if (!(getAdapter() instanceof n39)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        s49 G = G(view);
        if (G != null) {
            view.setEnabled(((n39) getAdapter()).D(G));
            if (this.p2) {
                view.setAccessibilityDelegate(this.q2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h1() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof tjb) {
                ((tjb) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i1(int i) {
        if (this.L2 != null && i >= 0) {
            for (int i2 = 0; i2 < this.L2.size(); i2++) {
                long longValue = ((Long) this.L2.get(i2)).longValue();
                Typeface typeface = gl.a;
                int i3 = (int) (longValue >> 32);
                int i4 = (int) longValue;
                if (i >= i3 && i <= i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j1(View view) {
        yj0 yj0Var = this.S2;
        if (yj0Var != null) {
            return yj0Var.u(view);
        }
        a39 a39Var = this.H2;
        return a39Var != null && ((Boolean) a39Var.a.a(view)).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ff0 ff0Var = this.C1;
        if (ff0Var != null) {
            ff0Var.jumpToCurrentState();
        }
    }

    public void k1(View view, float f, float f2, boolean z) {
        if (this.i1 || view == null) {
            return;
        }
        view.setPressed(z);
    }

    public final void l1(int i, View view) {
        sr8 sr8Var = this.U1;
        if (sr8Var != null) {
            gl.r(sr8Var);
            this.U1 = null;
            this.T1 = null;
        }
        if (this.C1 != null) {
            boolean z = i != this.D1;
            if (getAdapter() instanceof n39) {
                ((n39) getAdapter()).getClass();
            }
            if (i != -1) {
                this.D1 = i;
            }
            this.E1 = view;
            if (this.B1 == 8) {
                bkb.E1(this.C1, this.Z1, 0);
            } else if (this.a2 > 0 && getAdapter() != null) {
                bkb.E1(this.C1, i == 0 ? this.a2 : 0, i == getAdapter().b() + (-2) ? this.a2 : 0);
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
            if (z) {
                this.C1.setVisible(false, false);
                this.C1.setState(StateSet.NOTHING);
            }
            setListSelectorColor(W0(i));
            this.C1.setBounds(rect);
            if (z && getVisibility() == 0) {
                this.C1.setVisible(true, false);
            }
        }
    }

    public final void m1() {
        int i;
        sr8 sr8Var = this.U1;
        if (sr8Var != null) {
            gl.r(sr8Var);
            this.U1.run();
            this.U1 = null;
            this.E1 = null;
            return;
        }
        this.U1 = null;
        this.T1 = null;
        View view = this.E1;
        if (view != null && (i = this.x2) != -1) {
            l1(i, view);
            ff0 ff0Var = this.C1;
            if (ff0Var != null) {
                ff0Var.setState(new int[0]);
                invalidateDrawable(this.C1);
            }
            this.E1 = null;
            this.x2 = -1;
            return;
        }
        ff0 ff0Var2 = this.C1;
        if (ff0Var2 != null) {
            Drawable current = ff0Var2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        ff0 ff0Var3 = this.C1;
        if (ff0Var3 != null && ff0Var3.isStateful() && this.C1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.C1);
        }
    }

    public final void n1(View view, MotionEvent motionEvent) {
        if (view != null) {
            Rect rect = this.F1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                l1(this.N1, view);
                ff0 ff0Var = this.C1;
                if (ff0Var != null) {
                    Drawable current = ff0Var.getCurrent();
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

    public final void o1(o39 o39Var, boolean z) {
        ViewParent parent;
        if (o39Var == null || (parent = o39Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v29 v29Var = this.e1;
        if (v29Var == null || v29Var.getParent() == getParent()) {
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
        t29 t29Var = this.m2;
        if (t29Var != null) {
            t29Var.a();
        }
        if (this.u2) {
            this.u2 = false;
            kk7.e().k(kk7.j1, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.P1) {
            o1(this, true);
        }
        return this.a1 != null || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v29 v29Var = this.e1;
        if (v29Var != null) {
            this.I1 = true;
            int paddingTop = i2 + (v29Var.a ? getPaddingTop() : v29Var.i0);
            v29 v29Var2 = this.e1;
            if (v29Var2.h0) {
                v29Var2.layout(0, paddingTop, v29Var2.getMeasuredWidth(), this.e1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.e1.getMeasuredWidth();
                v29 v29Var3 = this.e1;
                v29Var3.layout(measuredWidth, paddingTop, v29Var3.getMeasuredWidth() + measuredWidth, this.e1.getMeasuredHeight() + paddingTop);
            }
            this.I1 = false;
        }
        M0(false);
        z29 z29Var = this.T1;
        if (z29Var != null) {
            f1(z29Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        v29 v29Var = this.e1;
        if (v29Var != null && v29Var.getLayoutParams() != null) {
            v29 v29Var2 = this.e1;
            int measuredHeight = (getMeasuredHeight() - (v29Var2.a ? getPaddingTop() : v29Var2.i0)) - getPaddingBottom();
            this.e1.getLayoutParams().height = measuredHeight;
            this.e1.measure(View.MeasureSpec.makeMeasureSpec(gl.L(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.b2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        oc6 oc6Var = this.c1;
        if (oc6Var != null) {
            oc6Var.requestLayout();
        }
        int i5 = this.x1;
        if (i5 != 1) {
            if (i5 != 2 || this.f1 == null || (view = this.q1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.f1 == null || this.o1.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < this.o1.size(); i6++) {
            T0((View) this.o1.get(i6), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        v29 v29Var = this.e1;
        if (v29Var != null && v29Var.n) {
            return false;
        }
        boolean z = this.c2;
        bg7 bg7Var = this.D2;
        if (!z || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.j2 = Float.MAX_VALUE;
            this.k2 = Float.MAX_VALUE;
            this.c2 = false;
            this.d2 = false;
            o1(this, false);
            this.h2 = false;
            gl.r(bg7Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.j2 == Float.MAX_VALUE && this.k2 == Float.MAX_VALUE) {
            this.j2 = motionEvent.getX();
            this.k2 = motionEvent.getY();
        }
        if (!this.d2 && Math.abs(motionEvent.getY() - this.k2) > this.b2) {
            this.d2 = true;
            o1(this, true);
        }
        if (this.d2) {
            N0(motionEvent.getX(), motionEvent.getY());
            h24 h24Var = this.g2;
            int[] iArr = this.l2;
            mu1 mu1Var = (mu1) h24Var.d;
            iArr[0] = (int) mu1Var.P9;
            iArr[1] = mu1Var.Ya;
            if (motionEvent.getY() > (getMeasuredHeight() - gl.L(56.0f)) - this.l2[1] && (this.f2 >= this.e2 || !this.g2.a)) {
                this.i2 = false;
                if (!this.h2) {
                    this.h2 = true;
                    gl.r(bg7Var);
                    gl.c3(bg7Var);
                    return true;
                }
            } else if (motionEvent.getY() >= gl.L(56.0f) + this.l2[0] || (this.f2 > this.e2 && this.g2.a)) {
                this.h2 = false;
                gl.r(bg7Var);
            } else {
                this.i2 = true;
                if (!this.h2) {
                    this.h2 = true;
                    gl.r(bg7Var);
                    gl.c3(bg7Var);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(int i, boolean z) {
        this.X1 = z;
        this.Y1 = i;
    }

    public final void q1(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() == i && getPaddingTop() == i2 && getPaddingRight() == i3 && getPaddingBottom() == i4) {
            return;
        }
        this.C2 = true;
        setPadding(i, i2, i3, i4);
        this.C2 = false;
    }

    public final void r1() {
        s1(gl.L(12.0f), gl.L(16.0f), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.W1 || this.C2) {
            return;
        }
        super.requestLayout();
    }

    public void s1(int i, float f, boolean z) {
        pb pbVar = new pb((byte) 10);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new r(this, pbVar, sparseIntArray, (byte) 3), new z02(sparseIntArray, (byte) 7));
        t1((q8c) pair.first, (q8c) pair.second, i, f, z);
    }

    public void setAccessibilityEnabled(boolean z) {
        this.p2 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(w39 w39Var) {
        w39 adapter = getAdapter();
        nr7 nr7Var = this.s2;
        if (adapter != null) {
            adapter.a.unregisterObserver(nr7Var);
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
        if (w39Var instanceof j39) {
            this.f1 = (j39) w39Var;
        } else {
            this.f1 = null;
        }
        super.setAdapter(w39Var);
        if (w39Var != null) {
            w39Var.B(nr7Var);
        }
        L0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z) {
        this.j1 = z;
    }

    public void setAllowStopHeaveOperations(boolean z) {
        this.w1 = z;
    }

    public void setBitmapSectionsBackgroundColorKey(int i) {
        if (this.W2 == i) {
            return;
        }
        this.W2 = i;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z) {
        this.G2 = z;
        if (z) {
            setLegacySections(false);
        }
    }

    public void setDisableHighlightState(boolean z) {
        this.i1 = z;
    }

    public void setDisallowInterceptTouchEvents(boolean z) {
        this.P1 = z;
    }

    public void setDrawSelection(boolean z) {
        this.T0 = z;
    }

    public void setDrawSelectorBehind(boolean z) {
        this.A1 = z;
    }

    public void setEmptyView(View view) {
        View view2 = this.b1;
        if (view2 != view) {
            if (view2 != null) {
                view2.animate().setListener(null).cancel();
            }
            this.b1 = view;
            if (this.X1 && view != null) {
                view.setVisibility(8);
            }
            if (!this.h1) {
                this.A2 = -1;
                L0(false);
                return;
            }
            View view3 = this.b1;
            if (view3 != null) {
                this.A2 = 8;
                view3.setVisibility(8);
            }
        }
    }

    public void setFastScrollEnabled(int i) {
        this.e1 = new v29(this, getContext(), i);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.e1);
        }
    }

    public void setFastScrollVisible(boolean z) {
        v29 v29Var = this.e1;
        if (v29Var == null) {
            return;
        }
        v29Var.setVisibility(z ? 0 : 8);
        this.e1.b0 = z;
    }

    public void setHideIfEmpty(boolean z) {
        this.z1 = z;
    }

    public void setInstantClick(boolean z) {
        this.Q1 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(b49 b49Var) {
        super.setItemAnimator(b49Var);
    }

    public void setItemSelectorColorProvider(js4 js4Var) {
        this.w2 = js4Var;
    }

    public void setItemsEnterAnimator(t29 t29Var) {
        this.m2 = t29Var;
    }

    public void setLegacySections(boolean z) {
        if (this.T2 == z) {
            return;
        }
        this.T2 = z;
        g1();
        b0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        if (num == null) {
            intValue = bkb.v0(c1() ? bkb.i6 : bkb.h6, this.o2);
        } else {
            intValue = num.intValue();
        }
        this.v2 = intValue;
        bkb.F1(this.C1, intValue, true);
    }

    public void setOnInterceptTouchListener(b39 b39Var) {
        this.a1 = b39Var;
    }

    public void setOnItemClickListener(c39 c39Var) {
        this.U0 = c39Var;
    }

    public void setOnItemLongClickListener(e39 e39Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.W0 = e39Var;
        z24 z24Var = this.L1;
        boolean z = e39Var != null;
        os4 os4Var = (os4) z24Var.b;
        os4Var.t = z;
        os4Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(i49 i49Var) {
        this.Z0 = i49Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.k1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i) {
        this.v1 = i;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z) {
        this.r2 = z;
    }

    public void setScrollEnabled(boolean z) {
        this.S1 = z;
    }

    public void setSections(boolean z) {
        s1(gl.L(12.0f), gl.L(16.0f), z);
    }

    public void setSectionsDrawBackground(boolean z) {
        if (this.U2 != z) {
            this.U2 = z;
            if (z) {
                setLegacySections(false);
            }
            yj0 yj0Var = this.S2;
            if (yj0Var != null) {
                o39 o39Var = yj0Var.a;
                if (yj0Var.L != z) {
                    yj0Var.L = z;
                    o39Var.b0();
                    o39Var.invalidate();
                }
                this.z1 = false;
                if (this.b1 != null) {
                    setVisibility(0);
                }
            }
        }
    }

    public void setSectionsDrawingMode(m39 m39Var) {
        if (this.V2 != m39Var) {
            this.V2 = m39Var;
            yj0 yj0Var = this.S2;
            if (yj0Var != null) {
                o39 o39Var = yj0Var.a;
                if (yj0Var.M != m39Var) {
                    yj0Var.M = m39Var;
                    o39Var.b0();
                    o39Var.invalidate();
                }
            }
        }
    }

    public void setSectionsOverscanTop(int i) {
        this.R2 = i;
    }

    public void setSectionsType(int i) {
        this.x1 = i;
        if (i == 1 || i == 3) {
            this.o1 = new ArrayList();
            this.p1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i) {
        this.v2 = i;
        ff0 ff0Var = this.C1;
        ff0 ff0Var2 = null;
        if (ff0Var != null) {
            ff0Var.setCallback(null);
        }
        int i2 = this.B1;
        if (i2 == 8) {
            ff0Var2 = bkb.Y(i, this.Z1, 0);
            this.C1 = ff0Var2;
        } else if (i2 == 9) {
            this.C1 = null;
        } else {
            int i3 = this.a2;
            if (i3 > 0) {
                ff0Var2 = bkb.Y(i, i3, i3);
                this.C1 = ff0Var2;
            } else {
                int i4 = this.Z1;
                if (i4 > 0 && i2 != 1) {
                    ff0Var2 = bkb.i0(i4, i4, i4, i4, 0, i, -16777216);
                    this.C1 = ff0Var2;
                } else if (i2 == 2) {
                    ff0Var2 = bkb.f0(i, 2, -1);
                    this.C1 = ff0Var2;
                } else {
                    ff0Var2 = bkb.f0(i, i2, i4);
                    this.C1 = ff0Var2;
                }
            }
        }
        if (ff0Var2 != null) {
            ff0Var2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i) {
        this.Z1 = i;
    }

    public void setSelectorTransformer(vs2 vs2Var) {
        this.n2 = vs2Var;
    }

    public void setSelectorType(int i) {
        this.B1 = i;
    }

    public void setSkipDrawSection(boolean z) {
        this.y1 = z;
    }

    public void setTopBottomSelectorRadius(int i) {
        this.a2 = i;
    }

    public void setTranslateSelector(boolean z) {
        this.H1 = z ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.H1 = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        v29 v29Var = this.e1;
        if (v29Var != null) {
            v29Var.setTranslationY(f);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        if (Z2 != null) {
            super.setVerticalScrollBarEnabled(z);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.V1 = false;
        }
    }

    public final void t1(q8c q8cVar, q8c q8cVar2, int i, float f, boolean z) {
        k88 k88Var = new k88((Object) this, (byte) 20);
        zkb.l(this, 20, bkb.i6, this.o2);
        this.I2 = q8cVar;
        this.J2 = q8cVar2;
        this.P2 = i;
        this.Q2 = z;
        this.M2 = f;
        this.N2 = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        this.K2 = k88Var;
        g1();
    }

    public boolean u1(View view) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if (!this.Y0) {
            return super.v(i, i2, i3, iArr, iArr2);
        }
        f39 f39Var = this.X0;
        if (f39Var != null) {
            f39Var.g(i2);
        }
        iArr[0] = i;
        iArr[1] = i2;
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
        v29 v29Var = this.e1;
        if (v29Var != null) {
            v29Var.updateColors();
        }
    }

    public final void y1() {
        ff0 ff0Var = this.C1;
        if (ff0Var == null || !ff0Var.isStateful()) {
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

    public void setOnItemClickListener(d39 d39Var) {
        this.V0 = d39Var;
    }

    public void setOnItemLongClickListener(f39 f39Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = f39Var;
        z24 z24Var = this.L1;
        boolean z = f39Var != null;
        os4 os4Var = (os4) z24Var.b;
        os4Var.t = z;
        os4Var.u = longPressTimeout;
    }

    public o39(Context context) {
        this(context, null);
    }
}
