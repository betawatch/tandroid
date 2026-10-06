package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
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
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class zl0 extends RecyclerView implements bh.a {
    public static int[] Y2;
    public static boolean Z2;
    public static final Method a3;
    public static final Paint b3;
    public static final Path c3;
    public static final float[] d3;
    public boolean A1;
    public int A2;
    public boolean B1;
    public boolean B2;
    public int C1;
    public boolean C2;
    public org.telegram.ui.Cells.z D1;
    public final org.telegram.ui.Cells.t6 D2;
    public int E1;
    public final rt E2;
    public View F1;
    public Matrix F2;
    public final Rect G1;
    public boolean G2;
    public boolean H1;
    public kl0 H2;
    public int I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public Utilities.CallbackReturn J2;
    public boolean K1;
    public pv K2;
    public boolean L1;
    public ArrayList L2;
    public ii.n4 M1;
    public float M2;
    public View N1;
    public float[] N2;
    public int O1;
    public float[] O2;
    public boolean P1;
    public int P2;
    public boolean Q1;
    public boolean Q2;
    public boolean R1;
    public ba R2;
    public rl0 S1;
    public boolean S2;
    public boolean T1;
    public boolean T2;
    public boolean U0;
    public jl0 U1;
    public xl0 U2;
    public ml0 V0;
    public lc0 V1;
    public int V2;
    public nl0 W0;
    public boolean W1;
    public ArrayList W2;
    public ol0 X0;
    public boolean X1;
    public final Path X2;
    public pl0 Y0;
    public boolean Y1;
    public boolean Z0;
    public int Z1;
    public s4.s0 a1;
    public int a2;
    public ll0 b1;
    public int b2;
    public View c1;
    public int c2;
    public ai.f0 d1;
    public boolean d2;
    public ql0 e1;
    public boolean e2;
    public fl0 f1;
    public int f2;
    public ul0 g1;
    public int g2;
    public boolean h1;
    public org.telegram.ui.oi h2;
    public boolean i1;
    public boolean i2;
    public boolean j1;
    public boolean j2;
    public boolean k1;
    public float k2;
    public Drawable l1;
    public float l2;
    public float m1;
    public int[] m2;
    public float n1;
    public dl0 n2;
    public long o1;
    public q0.a o2;
    public ArrayList p1;
    public final org.telegram.ui.ActionBar.d6 p2;
    public ArrayList q1;
    public boolean q2;
    public View r1;
    public final re r2;
    public int s1;
    public boolean s2;
    public int t1;
    public final gg.p1 t2;
    public int u1;
    public Paint u2;
    public int v1;
    public boolean v2;
    public int w1;
    public GenericProvider w2;
    public boolean x1;
    public int x2;
    public int y1;
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
        a3 = method;
        b3 = new Paint(1);
        new Paint(1);
        c3 = new Path();
        d3 = new float[8];
    }

    public zl0(Context context) {
        this(context, null);
    }

    public static float H0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float u1(View view) {
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
        this.E2.b.add(new ot(runnable, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f7, float f10) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < 2) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.u1) && !(childAt instanceof org.telegram.ui.Cells.w0)) || childAt.getVisibility() != 4) {
                    float translationX = i10 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i10 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f7 >= childAt.getLeft() + translationX && f7 <= childAt.getRight() + translationX && f10 >= childAt.getTop() + translationY && f10 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i10++;
        }
        return null;
    }

    public final void E0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.d1 == null) {
            this.d1 = new ai.f0(this, getContext(), 16);
        }
        this.d1.addView(clippingImageView, layoutParams);
    }

    public boolean F0(float f7) {
        return true;
    }

    public boolean G0(View view) {
        return true;
    }

    public boolean I0(View view, float f7, float f10) {
        return true;
    }

    public final void J0(boolean z10) {
        ql0 ql0Var = this.e1;
        if (ql0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ql0Var);
            this.e1 = null;
        }
        View view = this.N1;
        if (view != null) {
            if (z10) {
                j1(view, 0.0f, 0.0f, false);
            }
            this.N1 = null;
            m1(null, view);
        }
        this.G1.setEmpty();
        rl0 rl0Var = this.S1;
        if (rl0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rl0Var);
            this.S1 = null;
        }
        this.P1 = false;
    }

    public void K0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof bh.a) && ((X != this.H2 && X != this.R2) || this.G2)) {
                ((bh.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.B2 = true;
                drawChild(canvas, childAt, j3);
                this.B2 = false;
            }
        }
    }

    public final void L0(boolean z10) {
        if (this.i1) {
            return;
        }
        if (getAdapter() == null || this.c1 == null) {
            if (!this.W1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.W1 = false;
            return;
        }
        boolean S0 = S0();
        int i10 = S0 ? 0 : 8;
        if (!this.Y1 || !SharedConfig.animationsEnabled()) {
            z10 = false;
        }
        if (!z10) {
            this.A2 = i10;
            this.c1.setVisibility(i10);
            this.c1.setAlpha(1.0f);
        } else if (this.A2 != i10) {
            this.A2 = i10;
            if (i10 == 0) {
                this.c1.animate().setListener(null).cancel();
                if (this.c1.getVisibility() == 8) {
                    this.c1.setVisibility(0);
                    this.c1.setAlpha(0.0f);
                    if (this.Z1 == 1) {
                        this.c1.setScaleX(0.7f);
                        this.c1.setScaleY(0.7f);
                    }
                }
                this.c1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.c1.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.c1.animate().alpha(0.0f);
                if (this.Z1 == 1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new hd0(this, 8)).start();
            }
        }
        if (this.A1) {
            int i11 = S0 ? 4 : 0;
            if (getVisibility() != i11) {
                setVisibility(i11);
            }
            this.W1 = true;
        }
    }

    public final void M0(boolean z10) {
        fl0 fl0Var;
        s4.c1 T;
        fl0 fl0Var2;
        View view;
        s4.c1 T2;
        int b10;
        int S;
        if (((this.K1 || z10) && this.f1 != null) || !(this.y1 == 0 || this.g1 == null)) {
            s4.o0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.o == 1) {
                    if (this.g1 == null) {
                        int L0 = c0Var.L0();
                        Math.abs(c0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.K1 && !z10) || (fl0Var = this.f1) == null || fl0Var.n) {
                            return;
                        }
                        s4.h0 adapter = getAdapter();
                        if (adapter instanceof gl0) {
                            gl0 gl0Var = (gl0) adapter;
                            float H = gl0Var.H(this);
                            this.f1.setIsVisible(gl0Var.E(this));
                            this.f1.setProgress(Math.min(1.0f, H));
                            this.f1.a(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.y1 == 1 ? 0 : getPaddingTop();
                    int i10 = this.y1;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i10 != 1 && i10 != 3) {
                        if (i10 == 2) {
                            this.n1 = 0.0f;
                            if (this.g1.h() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            View view2 = null;
                            int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            View view3 = null;
                            int i13 = 0;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = getChildAt(i14);
                                int bottom = childAt.getBottom();
                                if (bottom > this.w1 + paddingTop) {
                                    if (bottom < i11) {
                                        view3 = childAt;
                                        i11 = bottom;
                                    }
                                    i13 = Math.max(i13, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.w1 + paddingTop && bottom < i12) {
                                        view2 = childAt;
                                        i12 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T2 = T(view3)) == null || (S = this.g1.S((b10 = T2.b()))) < 0) {
                                return;
                            }
                            if (this.s1 != S || this.r1 == null) {
                                View view4 = this.r1;
                                boolean z11 = view4 == null;
                                View T3 = this.g1.T(S, view4);
                                if (z11) {
                                    T0(T3, false);
                                }
                                this.r1 = T3;
                                T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.r1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.r1.getMeasuredHeight());
                                this.s1 = S;
                            }
                            if (this.r1 != null && view2 != null && view2.getClass() != this.r1.getClass()) {
                                this.n1 = 1.0f;
                            }
                            int M = this.g1.M(S);
                            int Q = this.g1.Q(b10);
                            int i15 = (i13 == 0 || i13 >= getMeasuredHeight() - getPaddingBottom()) ? this.w1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.r1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.w1);
                                int i16 = height2 < height ? height2 - height : paddingTop;
                                if (i16 < 0) {
                                    this.r1.setTag(Integer.valueOf(paddingTop + i15 + i16));
                                } else {
                                    this.r1.setTag(Integer.valueOf(paddingTop + i15));
                                }
                            } else {
                                this.r1.setTag(Integer.valueOf(paddingTop + i15));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    View view6 = null;
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount2; i19++) {
                        View childAt2 = getChildAt(i19);
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.w1 + paddingTop) {
                            if (bottom2 < i11) {
                                i11 = bottom2;
                                view6 = childAt2;
                            }
                            i18 = Math.max(i18, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(32.0f) + this.w1 + paddingTop && bottom2 < i17) {
                                i17 = bottom2;
                            }
                        }
                    }
                    if (view6 == null || (T = T(view6)) == null) {
                        return;
                    }
                    int b11 = T.b();
                    int abs = Math.abs(c0Var.N0() - b11) + 1;
                    if ((this.K1 || z10) && (fl0Var2 = this.f1) != null && !fl0Var2.n && (getAdapter() instanceof gl0)) {
                        this.f1.setProgress(Math.min(1.0f, b11 / ((this.g1.h() - abs) + 1)));
                    }
                    this.q1.addAll(this.p1);
                    this.p1.clear();
                    if (this.g1.h() == 0) {
                        return;
                    }
                    if (this.s1 != b11 || this.t1 != abs) {
                        this.s1 = b11;
                        this.t1 = abs;
                        this.v1 = 1;
                        int S2 = this.g1.S(b11);
                        this.u1 = S2;
                        int M2 = (this.g1.M(S2) + b11) - this.g1.Q(b11);
                        while (M2 < b11 + abs) {
                            M2 += this.g1.M(this.u1 + this.v1);
                            this.v1++;
                        }
                    }
                    if (this.y1 != 3) {
                        int i20 = b11;
                        for (int i21 = this.u1; i21 < this.u1 + this.v1; i21++) {
                            if (this.q1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.q1.get(0);
                                this.q1.remove(0);
                            }
                            boolean z12 = view == null;
                            View T4 = this.g1.T(i21, view);
                            if (z12) {
                                T0(T4, false);
                            }
                            this.p1.add(T4);
                            int M3 = this.g1.M(i21);
                            if (i21 == this.u1) {
                                int Q2 = this.g1.Q(i20);
                                if (Q2 == M3 - 1) {
                                    T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                } else if (Q2 == M3 - 2) {
                                    View childAt3 = getChildAt(i20 - b11);
                                    T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    T4.setTag(0);
                                }
                                i20 = (M3 - this.g1.Q(b11)) + i20;
                            } else {
                                View childAt4 = getChildAt(i20 - b11);
                                if (childAt4 != null) {
                                    T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    T4.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                }
                                i20 += M3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void N0(float f7, float f10) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.m2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.oi oiVar = this.h2;
            int[] iArr2 = this.m2;
            org.telegram.ui.yn ynVar = oiVar.d;
            iArr2[0] = (int) ynVar.q9;
            iArr2[1] = ynVar.ya;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.g2;
                if (i11 != S) {
                    int i12 = this.f2;
                    boolean z10 = i11 > i12 || S > i12;
                    org.telegram.ui.yn ynVar2 = this.h2.d;
                    org.telegram.ui.jm jmVar = ynVar2.y0;
                    ArrayList arrayList = ynVar2.s6;
                    int i13 = S - jmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) ynVar2.v6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            S = arrayList.indexOf(arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + ynVar2.y0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.g2;
                        if (S <= i14) {
                            while (i14 > S) {
                                if (i14 != this.f2 && this.h2.a(i14)) {
                                    this.h2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        } else if (!this.h2.a) {
                            for (int i15 = i14 + 1; i15 <= S; i15++) {
                                if (i15 != this.f2 && this.h2.a(i15)) {
                                    this.h2.b(i15, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i16 = this.g2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.f2 && this.h2.a(i16)) {
                                    this.h2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.h2.a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.f2 && this.h2.a(i17)) {
                                    this.h2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (this.h2.a) {
                    return;
                }
                this.g2 = S;
                return;
            }
        }
    }

    public final void O0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (this.R2 == null && view != null && i1(view)) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                z10 = U0 != null && i1(U0);
                z11 = U02 != null && i1(U02);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.M2, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.M2), H0(view)));
            if (z10 && z11) {
                z10 = u1(view) >= rectF.top;
                boolean z12 = H0(view) <= rectF.bottom;
                if (z10 && z12) {
                    return;
                } else {
                    z11 = z12;
                }
            }
            Path path = this.X2;
            if (!z10 && !z11) {
                path.rewind();
                float f7 = this.M2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
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

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof y80 ? ((y80) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(-this.M2, u1(view) - (z10 ? this.M2 : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.M2), (H0(view2) + (z11 ? this.M2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        float f7 = this.M2;
        this.K2.run(canvas, rectF, Float.valueOf(f7), Float.valueOf(f7), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float[] fArr;
        int i10;
        View view;
        if (this.K2 == null || this.H2 == null) {
            return;
        }
        if (b0()) {
            if (this.W2 == null) {
                this.W2 = new ArrayList();
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt != this.c1 && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.H2.a.run(childAt)).booleanValue()) {
                    float u12 = u1(childAt);
                    float H0 = H0(childAt);
                    s4.c1 T = T(childAt);
                    if (!T.j() || childAt.getAlpha() >= 1.0f) {
                        if (h1(T.b())) {
                        }
                        ArrayList arrayList = this.W2;
                        float alpha = childAt.getAlpha();
                        vl0 vl0Var = new vl0();
                        vl0Var.a = u12;
                        vl0Var.b = H0;
                        vl0Var.c = alpha;
                        arrayList.add(vl0Var);
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
                            if (view != null && H0 > view.getY() && ((Boolean) this.H2.a.run(view)).booleanValue() && !T(view).j()) {
                                u12 -= 1.0f;
                                H0 = view.getY();
                                if (H0 < u12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.W2;
                        float alpha2 = childAt.getAlpha();
                        vl0 vl0Var2 = new vl0();
                        vl0Var2.a = u12;
                        vl0Var2.b = H0;
                        vl0Var2.c = alpha2;
                        arrayList2.add(vl0Var2);
                    }
                }
            }
            ArrayList arrayList3 = this.W2;
            float f12 = this.M2;
            ArrayList arrayList4 = wl0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f7 = 1.0f;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.ff(13));
                arrayList4.clear();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    float f13 = ((vl0) arrayList3.get(i13)).b;
                    int i14 = i13 + 1;
                    while (i14 < arrayList3.size() && ((vl0) arrayList3.get(i14)).a <= f13 + 1.5f) {
                        f13 = Math.max(f13, ((vl0) arrayList3.get(i14)).b);
                        i14++;
                    }
                    float f14 = Float.MAX_VALUE;
                    float f15 = Float.MIN_VALUE;
                    float f16 = Float.MAX_VALUE;
                    float f17 = Float.MIN_VALUE;
                    for (int i15 = i13; i15 < i14; i15++) {
                        vl0 vl0Var3 = (vl0) arrayList3.get(i15);
                        if (vl0Var3.c >= 0.99f) {
                            f16 = Math.min(f16, vl0Var3.a);
                            f17 = Math.max(f17, vl0Var3.b);
                        }
                    }
                    boolean z10 = f16 != Float.MAX_VALUE;
                    float f18 = 0.0f;
                    for (int i16 = i13; i16 < i14; i16++) {
                        vl0 vl0Var4 = (vl0) arrayList3.get(i16);
                        f14 = Math.min(f14, vl0Var4.a);
                        f15 = Math.max(f15, vl0Var4.b);
                        f18 = Math.max(f18, vl0Var4.c);
                    }
                    if (f18 >= 0.001f) {
                        if (z10) {
                            float f19 = 0.0f;
                            vl0 vl0Var5 = null;
                            for (int i17 = i13; i17 < i14; i17++) {
                                vl0 vl0Var6 = (vl0) arrayList3.get(i17);
                                float f20 = vl0Var6.c;
                                if (f20 < 0.99f) {
                                    float f21 = vl0Var6.a;
                                    if (f21 < f16) {
                                        float f22 = (f16 - f21) * f20;
                                        if (f22 > f19) {
                                            vl0Var5 = vl0Var6;
                                            f19 = f22;
                                        }
                                    }
                                }
                            }
                            vl0 vl0Var7 = null;
                            float f23 = 0.0f;
                            while (i13 < i14) {
                                vl0 vl0Var8 = (vl0) arrayList3.get(i13);
                                float f24 = vl0Var8.c;
                                if (f24 < 0.99f) {
                                    float f25 = vl0Var8.b;
                                    if (f25 > f17) {
                                        float f26 = (f25 - f17) * f24;
                                        if (f26 > f23) {
                                            vl0Var7 = vl0Var8;
                                            f23 = f26;
                                        }
                                    }
                                }
                                i13++;
                            }
                            if (vl0Var5 != null) {
                                float f27 = vl0Var5.a;
                                float f28 = vl0Var5.c;
                                if (f28 > 0.001f) {
                                    float lerp = AndroidUtilities.lerp(f16, f27, f28);
                                    f10 = AndroidUtilities.lerp(f12, f28 * f12, (f16 - lerp) / ((f16 - f27) + 0.001f));
                                    f16 = lerp;
                                    if (vl0Var7 != null) {
                                        float f29 = vl0Var7.b;
                                        float f30 = vl0Var7.c;
                                        if (f30 > 0.001f) {
                                            float lerp2 = AndroidUtilities.lerp(f17, f29, f30);
                                            f11 = AndroidUtilities.lerp(f12, f30 * f12, (lerp2 - f17) / ((f29 - f17) + 0.001f));
                                            f17 = lerp2;
                                            f18 = 1.0f;
                                            f14 = f16;
                                        }
                                    }
                                    f11 = f12;
                                    f14 = f16;
                                    f18 = 1.0f;
                                }
                            }
                            f10 = f12;
                            if (vl0Var7 != null) {
                            }
                            f11 = f12;
                            f14 = f16;
                            f18 = 1.0f;
                        } else {
                            f11 = f12;
                            f10 = f11;
                            f17 = f15;
                        }
                        if (f17 > f14) {
                            fArr = new float[]{f14, f17, f10, f11, f18};
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i13 = i14;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i13 = i14;
                }
                f7 = 1.0f;
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    float[] fArr2 = (float[]) arrayList4.get(i18);
                    float f31 = fArr2[0];
                    float f32 = fArr2[1];
                    float f33 = fArr2[2];
                    float f34 = fArr2[3];
                    float f35 = fArr2[4];
                    if (i18 > 0) {
                        float f36 = f31 - ((float[]) arrayList4.get(i18 - 1))[1];
                        float f37 = f12 * 0.2f;
                        if (f36 < f37) {
                            f33 = Math.min(f33, (f36 / f37) * f12);
                        }
                    }
                    if (i18 < arrayList4.size() - 1) {
                        float f38 = ((float[]) arrayList4.get(i18 + 1))[0] - f32;
                        float f39 = 0.2f * f12;
                        if (f38 < f39) {
                            f34 = Math.min(f34, (f38 / f39) * f12);
                        }
                    }
                    Float valueOf = Float.valueOf(f33);
                    Float valueOf2 = Float.valueOf(f34);
                    Float valueOf3 = Float.valueOf(f35);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.H2.c, f31, (getWidth() - this.H2.c) - getPaddingRight(), f32);
                    this.K2.run(canvas, rectF, valueOf, valueOf2, valueOf3);
                }
            }
            this.W2.clear();
        } else {
            f7 = 1.0f;
            int i19 = -1;
            View view2 = null;
            View view3 = null;
            int i20 = -1;
            for (int i21 = 0; i21 < getChildCount(); i21++) {
                View childAt2 = getChildAt(i21);
                if (childAt2 == this.c1 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.H2.a.run(childAt2)).booleanValue() || h1(RecyclerView.R(childAt2))) {
                    P0(canvas, view2, view3, Y0(i19, view2), a1(i20, view3));
                    i19 = -1;
                    view2 = null;
                    view3 = null;
                    i20 = -1;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i19, view2), a1(i20, view3));
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
            P0(canvas, view2, view3, Y0(i19, view2), a1(i20, view3));
        }
        if (this.L2 != null) {
            for (int i22 = 0; i22 < this.L2.size(); i22++) {
                long longValue = ((Long) this.L2.get(i22)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float height = getHeight();
                float f40 = this.M2;
                float f41 = height + f40;
                float f42 = -f40;
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt3 = getChildAt(i23);
                    int R = RecyclerView.R(childAt3);
                    if (R >= unpackA && R <= unpackB) {
                        f41 = Math.min(f41, u1(childAt3));
                        f42 = Math.max(f42, H0(childAt3));
                    }
                }
                if (f41 < f42) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.H2.c, f41, (getWidth() - getPaddingRight()) - this.H2.c, f42);
                    float f43 = this.M2;
                    this.K2.run(canvas, rectF2, Float.valueOf(f43), Float.valueOf(f43), Float.valueOf(f7));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.G1;
        if (rect.isEmpty() || (zVar = this.D1) == null) {
            return;
        }
        int i10 = this.I1;
        if ((i10 == -2 || i10 == this.E1) && this.F1 != null) {
            if (getAdapter() instanceof yl0) {
                ((yl0) getAdapter()).getClass();
            }
            this.D1.setBounds(this.F1.getLeft(), this.F1.getTop(), this.F1.getRight(), this.F1.getBottom());
        } else {
            zVar.setBounds(rect);
        }
        canvas.save();
        int i11 = this.I1;
        if ((i11 == -2 || i11 == this.E1) && (aVar = this.o2) != null) {
            aVar.accept(canvas);
        }
        int i12 = this.I1;
        if ((i12 == -2 || i12 == this.E1) && (view = this.F1) != null) {
            canvas.translate(view.getX() - rect.left, this.F1.getY() - rect.top);
            this.D1.setAlpha((int) (this.F1.getAlpha() * 255.0f));
        }
        if (this.H2 != null) {
            canvas.save();
            O0(canvas, this.F1);
            this.D1.draw(canvas);
            canvas.restore();
        } else {
            this.D1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean S0() {
        return (getAdapter() == null || this.X1 || getAdapter().h() != 0) ? false : true;
    }

    public final void T0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z10) {
            int i10 = this.y1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View U0(int i10) {
        if (i10 == -1) {
            return null;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R == i10) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable V0(View view, boolean z10) {
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
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z11 = U0 != null && i1(U0);
            z12 = U02 != null && i1(U02);
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), H0(view)));
        if (z11 && z12 && !z10) {
            z11 = u1(view) >= rectF.top;
            boolean z13 = H0(view) <= rectF.bottom;
            if (z11 && z13) {
                return org.telegram.ui.ActionBar.i6.b0(0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, this.p2));
            }
            z12 = z13;
        }
        Path path = new Path();
        if ((!z11 && !z12) || z10) {
            path.rewind();
            float f7 = this.M2;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.N2, Path.Direction.CW);
        } else if (!z12) {
            path.rewind();
            path.addRoundRect(rectF, this.O2, Path.Direction.CW);
        }
        return new el0(this, view, path, rectF);
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.w2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.d6 d6Var = this.p2;
        Paint H = d6Var != null ? d6Var.H(str) : null;
        return H != null ? H : org.telegram.ui.ActionBar.i6.S0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view == null || i10 > 0 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.J2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (qt qtVar : this.E2.a) {
            if (qtVar != null && qtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view == null || i10 < getChildCount() - 1 || getAdapter() == null || this.J2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.J2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            aVar.a = true;
            return;
        }
        if (Z0() && getOverScrollMode() != 2) {
            aVar.a = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof bh.a) && ((X != this.H2 && X != this.R2) || this.G2)) {
                ((bh.a) X).b(aVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                aVar.getClass();
                ah.f.a(aVar, childAt);
            }
        }
    }

    public final boolean b1() {
        return (this.H2 == null && this.R2 == null) ? false : true;
    }

    public final void c1() {
        if (this.i1) {
            return;
        }
        this.i1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.c1;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.c1.setVisibility(8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.T1 && super.canScrollVertically(i10);
    }

    public final void d1(boolean z10) {
        View view = this.N1;
        if (view != null) {
            j1(view, 0.0f, 0.0f, false);
            this.N1 = null;
            if (z10) {
                m1(null, view);
            }
        }
        if (z10) {
            return;
        }
        this.D1.setState(StateSet.NOTHING);
        this.G1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        dl0 dl0Var = this.n2;
        if (dl0Var != null) {
            zl0 zl0Var = dl0Var.a;
            if (dl0Var.d || dl0Var.e) {
                for (int i10 = 0; i10 < zl0Var.getChildCount(); i10++) {
                    View childAt = zl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !dl0Var.c.contains(childAt)) {
                        Float f7 = (Float) dl0Var.b.get(R, null);
                        if (f7 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f7.floatValue());
                        }
                    }
                }
                dl0Var.d = false;
            }
        }
        if (this.U0 && this.B1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.U0 && !this.B1) {
            R0(canvas);
        }
        ai.f0 f0Var = this.d1;
        if (f0Var != null) {
            f0Var.draw(canvas);
        }
        if (this.z1) {
            return;
        }
        int i11 = this.y1;
        if (i11 == 1) {
            if (this.g1 == null || this.p1.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < this.p1.size(); i12++) {
                View view2 = (View) this.p1.get(i12);
                int save = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i11 != 2 || this.g1 == null || (view = this.r1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.r1.getWidth() : 0.0f, ((Integer) this.r1.getTag()).intValue());
        Drawable drawable = this.l1;
        if (drawable != null) {
            drawable.setBounds(0, this.r1.getMeasuredHeight(), getWidth(), this.l1.getIntrinsicHeight() + this.r1.getMeasuredHeight());
            this.l1.setAlpha((int) (this.m1 * 255.0f));
            this.l1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.o1);
            this.o1 = elapsedRealtime;
            float f10 = this.m1;
            float f11 = this.n1;
            if (f10 < f11) {
                float f12 = (min / 180.0f) + f10;
                this.m1 = f12;
                if (f12 > f11) {
                    this.m1 = f11;
                }
                invalidate();
            } else if (f10 > f11) {
                float f13 = f10 - (min / 180.0f);
                this.m1 = f13;
                if (f13 < f11) {
                    this.m1 = f11;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.r1.getMeasuredHeight());
        this.r1.draw(canvas);
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
            int i10 = this.y2 - 1;
            this.y2 = i10;
            if (i10 == 0 && this.z2) {
                setOverScrollMode(2);
            }
        }
        fl0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.a0 || !fastScroll.k0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.g1 == null || (view = this.r1) == null || view.getAlpha() == 0.0f || !this.r1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.H2 == null || this.B2) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        O0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w1();
    }

    public final void e1(jl0 jl0Var, int i10, boolean z10) {
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1 = null;
        }
        s4.c1 K = K(jl0Var.run());
        if (K == null) {
            if (z10) {
                this.U1 = jl0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c10 = K.c();
        this.x2 = c10;
        k1(c10, view);
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            Drawable current = zVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.X0 == null && this.W0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.D1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.z zVar2 = this.D1;
        if (zVar2 != null && zVar2.isStateful() && this.D1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.D1);
        }
        if (i10 > 0) {
            this.U1 = null;
            lc0 lc0Var2 = new lc0(this, 20);
            this.V1 = lc0Var2;
            AndroidUtilities.runOnUIThread(lc0Var2, i10);
        }
    }

    public void f(Canvas canvas, RectF rectF) {
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
        } catch (Throwable th2) {
            try {
                FileLog.e(th2);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void f1() {
        Utilities.CallbackReturn callbackReturn;
        pv pvVar;
        s4.n0 n0Var = this.H2;
        if (n0Var != null) {
            q0(n0Var);
            this.H2 = null;
        }
        s4.n0 n0Var2 = this.R2;
        if (n0Var2 != null) {
            q0(n0Var2);
            this.R2 = null;
        }
        Utilities.CallbackReturn callbackReturn2 = this.I2;
        if (callbackReturn2 == null || (callbackReturn = this.J2) == null || (pvVar = this.K2) == null) {
            return;
        }
        if (this.S2) {
            kl0 kl0Var = new kl0(this, callbackReturn2, this.P2, this.Q2);
            this.H2 = kl0Var;
            i(kl0Var);
        } else {
            ba baVar = new ba(this, callbackReturn2, callbackReturn, this.P2, this.M2, pvVar, this.Q2, this.T2, this.U2);
            this.R2 = baVar;
            i(baVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0(View view) {
        if (!(getAdapter() instanceof yl0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        s4.c1 G = G(view);
        if (G != null) {
            view.setEnabled(((yl0) getAdapter()).D(G));
            if (this.q2) {
                view.setAccessibilityDelegate(this.r2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.y5) {
                ((org.telegram.ui.ActionBar.y5) childAt).e();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.c1;
    }

    public fl0 getFastScroll() {
        return this.f1;
    }

    public ArrayList<View> getHeaders() {
        return this.p1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.q1;
    }

    public ml0 getOnItemClickListener() {
        return this.V0;
    }

    public s4.s0 getOnScrollListener() {
        return this.a1;
    }

    public View getPinnedHeader() {
        return this.r1;
    }

    public View getPressedChildView() {
        return this.N1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, this.p2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.k(org.telegram.ui.ActionBar.i6.v0(this.V2, this.p2), 255);
    }

    public Drawable getSelectorDrawable() {
        return this.D1;
    }

    public Rect getSelectorRect() {
        return this.G1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean h1(int i10) {
        if (this.L2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.L2.size(); i11++) {
                long longValue = ((Long) this.L2.get(i11)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i10 >= unpackA && i10 <= unpackB) {
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
        ba baVar = this.R2;
        if (baVar != null) {
            return baVar.s(view);
        }
        kl0 kl0Var = this.H2;
        return kl0Var != null && ((Boolean) kl0Var.a.run(view)).booleanValue();
    }

    public void j1(View view, float f7, float f10, boolean z10) {
        if (this.j1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(int i10, View view) {
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1 = null;
            this.U1 = null;
        }
        if (this.D1 == null) {
            return;
        }
        boolean z10 = i10 != this.E1;
        if (getAdapter() instanceof yl0) {
            ((yl0) getAdapter()).getClass();
        }
        if (i10 != -1) {
            this.E1 = i10;
        }
        this.F1 = view;
        if (this.C1 == 8) {
            org.telegram.ui.ActionBar.i6.A1(this.D1, this.a2, 0);
        } else if (this.b2 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.i6.A1(this.D1, i10 == 0 ? this.b2 : 0, i10 == getAdapter().h() + (-2) ? this.b2 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.G1;
        rect.set(left, top, right, bottom);
        boolean isEnabled = view.isEnabled();
        if (this.H1 != isEnabled) {
            this.H1 = isEnabled;
        }
        if (z10) {
            this.D1.setVisible(false, false);
            this.D1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(W0(i10));
        this.D1.setBounds(rect);
        if (z10 && getVisibility() == 0) {
            this.D1.setVisible(true, false);
        }
    }

    public final void l1() {
        int i10;
        lc0 lc0Var = this.V1;
        if (lc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lc0Var);
            this.V1.run();
            this.V1 = null;
            this.F1 = null;
            return;
        }
        this.V1 = null;
        this.U1 = null;
        View view = this.F1;
        if (view != null && (i10 = this.x2) != -1) {
            k1(i10, view);
            org.telegram.ui.Cells.z zVar = this.D1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.D1);
            }
            this.F1 = null;
            this.x2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.D1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.D1;
        if (zVar3 != null && zVar3.isStateful() && this.D1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.D1);
        }
    }

    public final void m1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.G1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                k1(this.O1, view);
                org.telegram.ui.Cells.z zVar = this.D1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            w1();
        }
    }

    public final void n1(zl0 zl0Var, boolean z10) {
        ViewParent parent;
        if (zl0Var == null || (parent = zl0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    public final void o1(int i10, boolean z10) {
        this.Y1 = z10;
        this.Z1 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fl0 fl0Var = this.f1;
        if (fl0Var == null || fl0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f1);
        }
        ((ViewGroup) getParent()).addView(this.f1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        dl0 dl0Var = this.n2;
        if (dl0Var != null) {
            dl0Var.a();
        }
        if (this.v2) {
            this.v2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.Q1) {
            n1(this, true);
        }
        if (this.b1 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i10 = org.telegram.ui.yn.Bc;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fl0 fl0Var = this.f1;
        if (fl0Var != null) {
            this.J1 = true;
            int paddingTop = i11 + (fl0Var.a ? getPaddingTop() : fl0Var.h0);
            fl0 fl0Var2 = this.f1;
            if (fl0Var2.g0) {
                fl0Var2.layout(0, paddingTop, fl0Var2.getMeasuredWidth(), this.f1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.f1.getMeasuredWidth();
                fl0 fl0Var3 = this.f1;
                fl0Var3.layout(measuredWidth, paddingTop, fl0Var3.getMeasuredWidth() + measuredWidth, this.f1.getMeasuredHeight() + paddingTop);
            }
            this.J1 = false;
        }
        M0(false);
        jl0 jl0Var = this.U1;
        if (jl0Var != null) {
            e1(jl0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fl0 fl0Var = this.f1;
        if (fl0Var != null && fl0Var.getLayoutParams() != null) {
            fl0 fl0Var2 = this.f1;
            int measuredHeight = (getMeasuredHeight() - (fl0Var2.a ? getPaddingTop() : fl0Var2.h0)) - getPaddingBottom();
            this.f1.getLayoutParams().height = measuredHeight;
            this.f1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.c2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ai.f0 f0Var = this.d1;
        if (f0Var != null) {
            f0Var.requestLayout();
        }
        int i14 = this.y1;
        if (i14 != 1) {
            if (i14 != 2 || this.g1 == null || (view = this.r1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.g1 == null || this.p1.isEmpty()) {
            return;
        }
        for (int i15 = 0; i15 < this.p1.size(); i15++) {
            T0((View) this.p1.get(i15), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fl0 fl0Var = this.f1;
        if (fl0Var != null && fl0Var.n) {
            return false;
        }
        boolean z10 = this.d2;
        org.telegram.ui.Cells.t6 t6Var = this.D2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.k2 = Float.MAX_VALUE;
            this.l2 = Float.MAX_VALUE;
            this.d2 = false;
            this.e2 = false;
            n1(this, false);
            this.i2 = false;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.k2 == Float.MAX_VALUE && this.l2 == Float.MAX_VALUE) {
            this.k2 = motionEvent.getX();
            this.l2 = motionEvent.getY();
        }
        if (!this.e2 && Math.abs(motionEvent.getY() - this.l2) > this.c2) {
            this.e2 = true;
            n1(this, true);
        }
        if (this.e2) {
            N0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.oi oiVar = this.h2;
            int[] iArr = this.m2;
            org.telegram.ui.yn ynVar = oiVar.d;
            iArr[0] = (int) ynVar.q9;
            iArr[1] = ynVar.ya;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.m2[1] && (this.g2 >= this.f2 || !this.h2.a)) {
                this.j2 = false;
                if (!this.i2) {
                    this.i2 = true;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.m2[0] || (this.g2 > this.f2 && this.h2.a)) {
                this.i2 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            } else {
                this.j2 = true;
                if (!this.i2) {
                    this.i2 = true;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                    return true;
                }
            }
        }
        return true;
    }

    public final void p1(pl0 pl0Var, long j3) {
        this.Y0 = pl0Var;
        ii.n4 n4Var = this.M1;
        boolean z10 = pl0Var != null;
        o20 o20Var = (o20) n4Var.b;
        o20Var.t = z10;
        o20Var.u = j3;
    }

    public final void q1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.C2 = true;
        setPadding(i10, i11, i12, i13);
        this.C2 = false;
    }

    public final void r1() {
        s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.X1 || this.C2) {
            return;
        }
        super.requestLayout();
    }

    public void s1(int i10, float f7, boolean z10) {
        ei.c cVar = new ei.c(5);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ci.o5(this, cVar, sparseIntArray, 3), new zi(sparseIntArray, 2));
        t1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, z10);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.q2 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        gg.p1 p1Var = this.t2;
        if (adapter != null) {
            adapter.a.unregisterObserver(p1Var);
        }
        ArrayList arrayList = this.p1;
        if (arrayList != null) {
            arrayList.clear();
            this.q1.clear();
        }
        this.s1 = -1;
        this.E1 = -1;
        this.F1 = null;
        this.G1.setEmpty();
        this.r1 = null;
        if (h0Var instanceof ul0) {
            this.g1 = (ul0) h0Var;
        } else {
            this.g1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(p1Var);
        }
        L0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.k1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.x1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i10) {
        if (this.V2 == i10) {
            return;
        }
        this.V2 = i10;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.G2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.j1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.Q1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.U0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.B1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.c1;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.c1 = view;
        if (this.Y1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.i1) {
            this.A2 = -1;
            L0(false);
            return;
        }
        View view3 = this.c1;
        if (view3 != null) {
            this.A2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.f1 = new fl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.f1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        fl0 fl0Var = this.f1;
        if (fl0Var == null) {
            return;
        }
        fl0Var.setVisibility(z10 ? 0 : 8);
        this.f1.a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.A1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.R1 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(s4.m0 m0Var) {
        super.setItemAnimator(m0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.w2 = genericProvider;
    }

    public void setItemsEnterAnimator(dl0 dl0Var) {
        this.n2 = dl0Var;
    }

    public void setLegacySections(boolean z10) {
        if (this.S2 == z10) {
            return;
        }
        this.S2 = z10;
        f1();
        a0();
        invalidate();
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        org.telegram.ui.Cells.z zVar = this.D1;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.i6.v0(b1() ? org.telegram.ui.ActionBar.i6.j6 : org.telegram.ui.ActionBar.i6.i6, this.p2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.i6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(ll0 ll0Var) {
        this.b1 = ll0Var;
    }

    public void setOnItemClickListener(ml0 ml0Var) {
        this.V0 = ml0Var;
    }

    public void setOnItemLongClickListener(ol0 ol0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.X0 = ol0Var;
        ii.n4 n4Var = this.M1;
        boolean z10 = ol0Var != null;
        o20 o20Var = (o20) n4Var.b;
        o20Var.t = z10;
        o20Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(s4.s0 s0Var) {
        this.a1 = s0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.l1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.w1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.s2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.T1 = z10;
    }

    public void setSections(boolean z10) {
        s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.T2 == z10) {
            return;
        }
        this.T2 = z10;
        ba baVar = this.R2;
        if (baVar != null) {
            zl0 zl0Var = baVar.a;
            if (baVar.K != z10) {
                baVar.K = z10;
                zl0Var.a0();
                zl0Var.invalidate();
            }
            this.A1 = false;
            if (this.c1 != null) {
                setVisibility(0);
            }
        }
    }

    public void setSectionsDrawingMode(xl0 xl0Var) {
        if (this.U2 == xl0Var) {
            return;
        }
        this.U2 = xl0Var;
        ba baVar = this.R2;
        if (baVar != null) {
            zl0 zl0Var = baVar.a;
            if (baVar.L == xl0Var) {
                return;
            }
            baVar.L = xl0Var;
            zl0Var.a0();
            zl0Var.invalidate();
        }
    }

    public void setSectionsType(int i10) {
        this.y1 = i10;
        if (i10 == 1 || i10 == 3) {
            this.p1 = new ArrayList();
            this.q1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.C1;
        if (i11 == 8) {
            this.D1 = org.telegram.ui.ActionBar.i6.Y(i10, this.a2, 0);
        } else if (i11 == 9) {
            this.D1 = null;
        } else {
            int i12 = this.b2;
            if (i12 > 0) {
                this.D1 = org.telegram.ui.ActionBar.i6.Y(i10, i12, i12);
            } else {
                int i13 = this.a2;
                if (i13 > 0 && i11 != 1) {
                    this.D1 = org.telegram.ui.ActionBar.i6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.D1 = org.telegram.ui.ActionBar.i6.f0(i10, 2, -1);
                } else {
                    this.D1 = org.telegram.ui.ActionBar.i6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.D1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.a2 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.o2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.C1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.z1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.b2 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        this.I1 = z10 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.I1 = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        fl0 fl0Var = this.f1;
        if (fl0Var != null) {
            fl0Var.setTranslationY(f7);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Y2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.W1 = false;
        }
    }

    public final void t1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, boolean z10) {
        pv pvVar = new pv(this, 16);
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j6, this.p2));
        this.I2 = callbackReturn;
        this.J2 = callbackReturn2;
        this.P2 = i10;
        this.Q2 = z10;
        this.M2 = f7;
        this.N2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.O2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.K2 = pvVar;
        f1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (!this.Z0) {
            return super.v(i10, i11, i12, iArr, iArr2);
        }
        pl0 pl0Var = this.Y0;
        if (pl0Var != null) {
            pl0Var.q(i11);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        return true;
    }

    public boolean v1() {
        return this.G;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.D1 == drawable || super.verifyDrawable(drawable);
    }

    public final void w1() {
        org.telegram.ui.Cells.z zVar = this.D1;
        if (zVar == null || !zVar.isStateful()) {
            return;
        }
        if (this.N1 != null) {
            if (this.D1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.D1);
            }
        } else if (this.V1 == null) {
            this.D1.setState(StateSet.NOTHING);
        }
    }

    public zl0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.U0 = true;
        this.k1 = true;
        this.s1 = -1;
        this.t1 = -1;
        this.z1 = false;
        this.A1 = true;
        this.C1 = 2;
        this.G1 = new Rect();
        this.I1 = -1;
        this.T1 = true;
        this.k2 = Float.MAX_VALUE;
        this.l2 = Float.MAX_VALUE;
        this.q2 = true;
        this.r2 = new re(1);
        this.s2 = true;
        this.t2 = new gg.p1(this, 1);
        this.D2 = new org.telegram.ui.Cells.t6(this, 20);
        this.U2 = xl0.a;
        this.V2 = org.telegram.ui.ActionBar.i6.a7;
        this.X2 = new Path();
        this.p2 = d6Var;
        rt rtVar = new rt();
        this.E2 = rtVar;
        setEdgeEffectFactory(rtVar);
        setGlowColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.s8, d6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, d6Var), 2, -1);
        this.D1 = f02;
        f02.setCallback(this);
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
            FileLog.e(th2);
        }
        super.setOnScrollListener(new xb0(this, 3));
        this.E.add(new tl0(context, this));
    }

    public void setOnItemClickListener(nl0 nl0Var) {
        this.W0 = nl0Var;
    }

    public void setOnItemLongClickListener(pl0 pl0Var) {
        p1(pl0Var, ViewConfiguration.getLongPressTimeout());
    }
}
