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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class nm0 extends RecyclerView implements dh.a {
    public static int[] Z2;
    public static boolean a3;
    public static final Method b3;
    public static final Paint c3;
    public static final Path d3;
    public static final float[] e3;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.y B1;
    public boolean B2;
    public int C1;
    public final m.g3 C2;
    public View D1;
    public final yt D2;
    public final Rect E1;
    public Matrix E2;
    public boolean F1;
    public boolean F2;
    public int G1;
    public yl0 G2;
    public boolean H1;
    public Utilities.CallbackReturn H2;
    public boolean I1;
    public Utilities.CallbackReturn I2;
    public boolean J1;
    public tv J2;
    public jg.i K1;
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
    public fm0 Q1;
    public boolean Q2;
    public boolean R1;
    public boolean R2;
    public boolean S0;
    public xl0 S1;
    public ea S2;
    public am0 T0;
    public xa0 T1;
    public boolean T2;
    public bm0 U0;
    public boolean U1;
    public boolean U2;
    public cm0 V0;
    public boolean V1;
    public lm0 V2;
    public dm0 W0;
    public boolean W1;
    public int W2;
    public boolean X0;
    public int X1;
    public ArrayList X2;
    public s4.u0 Y0;
    public int Y1;
    public final Path Y2;
    public zl0 Z0;
    public int Z1;
    public View a1;
    public int a2;
    public bh.r b1;
    public boolean b2;
    public em0 c1;
    public boolean c2;
    public tl0 d1;
    public int d2;
    public im0 e1;
    public int e2;
    public boolean f1;
    public org.telegram.ui.wi f2;
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
    public rl0 l2;
    public long m1;
    public q0.a m2;
    public ArrayList n1;
    public final org.telegram.ui.ActionBar.u6 n2;
    public ArrayList o1;
    public boolean o2;
    public View p1;
    public final pe p2;
    public int q1;
    public boolean q2;
    public int r1;
    public final ig.o1 r2;
    public int s1;
    public Paint s2;
    public int t1;
    public boolean t2;
    public int u1;
    public int u2;
    public boolean v1;
    public GenericProvider v2;
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
        b3 = method;
        c3 = new Paint(1);
        new Paint(1);
        d3 = new Path();
        e3 = new float[8];
    }

    public nm0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float y1(View view) {
        return view.getTag(R.id.dragging) != null ? view.getTop() : view.getY();
    }

    public final void A1() {
        tl0 tl0Var = this.d1;
        if (tl0Var != null) {
            tl0Var.updateColors();
        }
    }

    public final void B1() {
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void C0() {
        try {
            super.C0();
        } catch (NullPointerException unused) {
        }
    }

    public final void D0(Runnable runnable) {
        this.D2.b.add(new vt(runnable, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f7, float f10) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < 2) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.s1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
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

    public boolean E0(float f7) {
        return true;
    }

    public boolean F0(View view) {
        return true;
    }

    public boolean H0(View view, float f7, float f10) {
        return true;
    }

    public final void I0(boolean z10) {
        em0 em0Var = this.c1;
        if (em0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(em0Var);
            this.c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                k1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            n1(null, view);
        }
        this.E1.setEmpty();
        fm0 fm0Var = this.Q1;
        if (fm0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fm0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j10) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof dh.a) && ((X != this.G2 && X != this.S2) || this.F2)) {
                ((dh.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x9 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x9, y3, childAt.getWidth() + x9, childAt.getHeight() + y3)) {
                this.A2 = true;
                drawChild(canvas, childAt, j10);
                this.A2 = false;
            }
        }
    }

    public final void K0(boolean z10) {
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
        boolean S0 = S0();
        int i10 = S0 ? 0 : 8;
        if (!this.W1 || !SharedConfig.animationsEnabled()) {
            z10 = false;
        }
        if (!z10) {
            this.z2 = i10;
            this.a1.setVisibility(i10);
            this.a1.setAlpha(1.0f);
        } else if (this.z2 != i10) {
            this.z2 = i10;
            if (i10 == 0) {
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
                alpha.setDuration(150L).setListener(new i10(this, 15)).start();
            }
        }
        if (this.y1) {
            if (b1() && this.U2) {
                return;
            }
            int i11 = S0 ? 4 : 0;
            if (getVisibility() != i11) {
                setVisibility(i11);
            }
            this.U1 = true;
        }
    }

    public final void L0(boolean z10) {
        tl0 tl0Var;
        s4.e1 T;
        tl0 tl0Var2;
        View view;
        s4.e1 T2;
        int b10;
        int S;
        if (((this.I1 || z10) && this.d1 != null) || !(this.w1 == 0 || this.e1 == null)) {
            s4.p0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.c0) {
                s4.c0 c0Var = (s4.c0) layoutManager;
                if (c0Var.o == 1) {
                    if (this.e1 == null) {
                        int L0 = c0Var.L0();
                        Math.abs(c0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.I1 && !z10) || (tl0Var = this.d1) == null || tl0Var.n) {
                            return;
                        }
                        s4.h0 adapter = getAdapter();
                        if (adapter instanceof ul0) {
                            ul0 ul0Var = (ul0) adapter;
                            float H = ul0Var.H(this);
                            this.d1.setIsVisible(ul0Var.E(this));
                            this.d1.setProgress(Math.min(1.0f, H));
                            this.d1.a(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.w1 == 1 ? 0 : getPaddingTop();
                    int i10 = this.w1;
                    float f7 = 32.0f;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i10 != 1 && i10 != 3) {
                        if (i10 == 2) {
                            this.l1 = 0.0f;
                            if (this.e1.h() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            int i12 = 0;
                            int i13 = Integer.MAX_VALUE;
                            View view2 = null;
                            View view3 = null;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                View childAt = getChildAt(i14);
                                int bottom = childAt.getBottom();
                                if (bottom > this.u1 + paddingTop) {
                                    if (bottom < i11) {
                                        view3 = childAt;
                                        i11 = bottom;
                                    }
                                    i12 = Math.max(i12, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.u1 + paddingTop && bottom < i13) {
                                        view2 = childAt;
                                        i13 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T2 = T(view3)) == null || (S = this.e1.S((b10 = T2.b()))) < 0) {
                                return;
                            }
                            if (this.q1 != S || this.p1 == null) {
                                View view4 = this.p1;
                                boolean z11 = view4 == null;
                                View T3 = this.e1.T(S, view4);
                                if (z11) {
                                    T0(T3, false);
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
                            int i15 = (i12 == 0 || i12 >= getMeasuredHeight() - getPaddingBottom()) ? this.u1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.p1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.u1);
                                int i16 = height2 < height ? height2 - height : paddingTop;
                                if (i16 < 0) {
                                    this.p1.setTag(Integer.valueOf(paddingTop + i15 + i16));
                                } else {
                                    this.p1.setTag(Integer.valueOf(paddingTop + i15));
                                }
                            } else {
                                this.p1.setTag(Integer.valueOf(paddingTop + i15));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = Integer.MAX_VALUE;
                    View view6 = null;
                    while (i17 < childCount2) {
                        View childAt2 = getChildAt(i17);
                        float f10 = f7;
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.u1 + paddingTop) {
                            if (bottom2 < i11) {
                                i11 = bottom2;
                                view6 = childAt2;
                            }
                            i18 = Math.max(i18, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(f10) + this.u1 + paddingTop && bottom2 < i19) {
                                i19 = bottom2;
                            }
                        }
                        i17++;
                        f7 = f10;
                    }
                    if (view6 == null || (T = T(view6)) == null) {
                        return;
                    }
                    int b11 = T.b();
                    int abs = Math.abs(c0Var.N0() - b11) + 1;
                    if ((this.I1 || z10) && (tl0Var2 = this.d1) != null && !tl0Var2.n && (getAdapter() instanceof ul0)) {
                        this.d1.setProgress(Math.min(1.0f, b11 / ((this.e1.h() - abs) + 1)));
                    }
                    this.o1.addAll(this.n1);
                    this.n1.clear();
                    if (this.e1.h() == 0) {
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
                        int i20 = b11;
                        for (int i21 = this.s1; i21 < this.s1 + this.t1; i21++) {
                            if (this.o1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.o1.get(0);
                                this.o1.remove(0);
                            }
                            boolean z12 = view == null;
                            View T4 = this.e1.T(i21, view);
                            if (z12) {
                                T0(T4, false);
                            }
                            this.n1.add(T4);
                            int M3 = this.e1.M(i21);
                            if (i21 == this.s1) {
                                int Q2 = this.e1.Q(i20);
                                if (Q2 == M3 - 1) {
                                    T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                } else if (Q2 == M3 - 2) {
                                    View childAt3 = getChildAt(i20 - b11);
                                    T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    T4.setTag(0);
                                }
                                i20 = (M3 - this.e1.Q(b11)) + i20;
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

    public final void M0(float f7, float f10) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.wi wiVar = this.f2;
            int[] iArr2 = this.k2;
            org.telegram.ui.wn wnVar = wiVar.d;
            iArr2[0] = (int) wnVar.I9;
            iArr2[1] = wnVar.Ra;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.e2;
                if (i11 != S) {
                    int i12 = this.d2;
                    boolean z10 = i11 > i12 || S > i12;
                    org.telegram.ui.wn wnVar2 = this.f2.d;
                    org.telegram.ui.hm hmVar = wnVar2.A0;
                    ArrayList arrayList = wnVar2.K6;
                    int i13 = S - hmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) wnVar2.N6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            S = arrayList.indexOf(arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + wnVar2.A0.J;
                        }
                    }
                    if (z10) {
                        int i14 = this.e2;
                        if (S <= i14) {
                            while (i14 > S) {
                                if (i14 != this.d2 && this.f2.a(i14)) {
                                    this.f2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        } else if (!this.f2.a) {
                            for (int i15 = i14 + 1; i15 <= S; i15++) {
                                if (i15 != this.d2 && this.f2.a(i15)) {
                                    this.f2.b(i15, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i16 = this.e2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.d2 && this.f2.a(i16)) {
                                    this.f2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.f2.a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.d2 && this.f2.a(i17)) {
                                    this.f2.b(i17, true, min2, min);
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
        boolean i12;
        boolean i13;
        if (this.S2 == null && view != null && x1(view) && ((Boolean) this.G2.a.run(view)).booleanValue() && j1(view)) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                i13 = false;
                i12 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                i12 = i1(U0, true);
                i13 = i1(U02, false);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(q1(), y1(view)), view.getX() + view.getWidth(), Math.min(p1(), G0(view)));
            if (i12 && i13) {
                i12 = y1(view) >= rectF.top;
                boolean z10 = G0(view) <= rectF.bottom;
                if (i12 && z10) {
                    return;
                } else {
                    i13 = z10;
                }
            }
            Path path = this.Y2;
            if (!i12 && !i13) {
                path.rewind();
                float f7 = this.L2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                return;
            }
            if (!i12) {
                path.rewind();
                path.addRoundRect(rectF, this.M2, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                if (i13) {
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.N2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void O0(Canvas canvas) {
        boolean z10 = this.Q2;
        if (z10 || this.R2) {
            canvas.clipRect(0.0f, z10 ? getSectionsEdgeTop() : -getHeight(), getWidth(), this.R2 ? getSectionsEdgeBottom() : getHeight() * 2);
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof h90 ? ((h90) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(q1(), y1(view) - (z10 ? this.L2 : 0.0f)), view.getRight(), Math.min(p1(), (G0(view2) + (z11 ? this.L2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        float f7 = this.L2;
        this.J2.run(canvas, rectF, Float.valueOf(f7), Float.valueOf(f7), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        float f10;
        float f11;
        float[] fArr;
        int i11;
        View view;
        if (this.J2 == null || this.G2 == null) {
            return;
        }
        canvas.save();
        O0(canvas);
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (b0()) {
            if (this.X2 == null) {
                this.X2 = new ArrayList();
            }
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i12 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i12);
                if (childAt != this.a1 && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((Boolean) this.G2.a.run(childAt)).booleanValue()) {
                    float y12 = y1(childAt);
                    float G0 = G0(childAt);
                    s4.e1 T = T(childAt);
                    if (!T.j() || childAt.getAlpha() >= 1.0f) {
                        if (h1(T.b())) {
                        }
                        ArrayList arrayList = this.X2;
                        float alpha = childAt.getAlpha();
                        jm0 jm0Var = new jm0();
                        jm0Var.a = y12;
                        jm0Var.b = G0;
                        jm0Var.c = alpha;
                        arrayList.add(jm0Var);
                    } else {
                        if (T.j() && (i11 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i11 / 1000.0d)) + 1;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i13);
                                if (view != null && view != childAt && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            if (view != null && G0 > view.getY() && ((Boolean) this.G2.a.run(view)).booleanValue() && !T(view).j()) {
                                y12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < y12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.X2;
                        float alpha2 = childAt.getAlpha();
                        jm0 jm0Var2 = new jm0();
                        jm0Var2.a = y12;
                        jm0Var2.b = G0;
                        jm0Var2.c = alpha2;
                        arrayList2.add(jm0Var2);
                    }
                }
                i12++;
            }
            ArrayList arrayList3 = this.X2;
            float f14 = this.L2;
            p1 p1Var = new p1(23, this, canvas);
            ArrayList arrayList4 = km0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f7 = 1.0f;
                i10 = 0;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.n4(20));
                arrayList4.clear();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    float f15 = ((jm0) arrayList3.get(i14)).b;
                    int i15 = i14 + 1;
                    while (i15 < arrayList3.size() && ((jm0) arrayList3.get(i15)).a <= 1.5f + f15) {
                        f15 = Math.max(f15, ((jm0) arrayList3.get(i15)).b);
                        i15++;
                    }
                    float f16 = Float.MAX_VALUE;
                    float f17 = Float.MIN_VALUE;
                    boolean z11 = z10;
                    int i16 = i14;
                    float f18 = Float.MAX_VALUE;
                    float f19 = Float.MIN_VALUE;
                    while (i16 < i15) {
                        float f20 = f12;
                        jm0 jm0Var3 = (jm0) arrayList3.get(i16);
                        float f21 = f13;
                        if (jm0Var3.c >= 0.99f) {
                            f18 = Math.min(f18, jm0Var3.a);
                            f19 = Math.max(f19, jm0Var3.b);
                        }
                        i16++;
                        f13 = f21;
                        f12 = f20;
                    }
                    float f22 = f12;
                    float f23 = f13;
                    Object[] objArr = f18 != Float.MAX_VALUE ? z11 ? 1 : 0 : false;
                    float f24 = f23;
                    for (int i17 = i14; i17 < i15; i17++) {
                        jm0 jm0Var4 = (jm0) arrayList3.get(i17);
                        f16 = Math.min(f16, jm0Var4.a);
                        f17 = Math.max(f17, jm0Var4.b);
                        f24 = Math.max(f24, jm0Var4.c);
                    }
                    if (f24 >= 0.001f) {
                        if (objArr == true) {
                            float f25 = f23;
                            jm0 jm0Var5 = null;
                            for (int i18 = i14; i18 < i15; i18++) {
                                jm0 jm0Var6 = (jm0) arrayList3.get(i18);
                                float f26 = jm0Var6.c;
                                if (f26 < 0.99f) {
                                    float f27 = jm0Var6.a;
                                    if (f27 < f18) {
                                        float f28 = (f18 - f27) * f26;
                                        if (f28 > f25) {
                                            jm0Var5 = jm0Var6;
                                            f25 = f28;
                                        }
                                    }
                                }
                            }
                            float f29 = f23;
                            jm0 jm0Var7 = null;
                            while (i14 < i15) {
                                jm0 jm0Var8 = (jm0) arrayList3.get(i14);
                                float f30 = jm0Var8.c;
                                if (f30 < 0.99f) {
                                    float f31 = jm0Var8.b;
                                    if (f31 > f19) {
                                        float f32 = (f31 - f19) * f30;
                                        if (f32 > f29) {
                                            jm0Var7 = jm0Var8;
                                            f29 = f32;
                                        }
                                    }
                                }
                                i14++;
                            }
                            if (jm0Var5 != null) {
                                float f33 = jm0Var5.a;
                                float f34 = jm0Var5.c;
                                if (f34 > 0.001f) {
                                    float lerp = AndroidUtilities.lerp(f18, f33, f34);
                                    f10 = AndroidUtilities.lerp(f14, f34 * f14, (f18 - lerp) / ((f18 - f33) + 0.001f));
                                    f18 = lerp;
                                    if (jm0Var7 != null) {
                                        float f35 = jm0Var7.b;
                                        float f36 = jm0Var7.c;
                                        if (f36 > 0.001f) {
                                            float lerp2 = AndroidUtilities.lerp(f19, f35, f36);
                                            f11 = AndroidUtilities.lerp(f14, f36 * f14, (lerp2 - f19) / ((f35 - f19) + 0.001f));
                                            f16 = f18;
                                            f19 = lerp2;
                                            f24 = f22;
                                        }
                                    }
                                    f11 = f14;
                                    f16 = f18;
                                    f24 = f22;
                                }
                            }
                            f10 = f14;
                            if (jm0Var7 != null) {
                            }
                            f11 = f14;
                            f16 = f18;
                            f24 = f22;
                        } else {
                            f11 = f14;
                            f10 = f11;
                            f19 = f17;
                        }
                        if (f19 > f16) {
                            fArr = new float[5];
                            fArr[0] = f16;
                            fArr[z11 ? 1 : 0] = f19;
                            fArr[2] = f10;
                            fArr[3] = f11;
                            fArr[4] = f24;
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i14 = i15;
                            z10 = z11 ? 1 : 0;
                            f13 = f23;
                            f12 = f22;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i14 = i15;
                    z10 = z11 ? 1 : 0;
                    f13 = f23;
                    f12 = f22;
                }
                boolean z12 = z10;
                f7 = f12;
                i10 = 0;
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    float[] fArr2 = (float[]) arrayList4.get(i19);
                    float f37 = fArr2[0];
                    float f38 = fArr2[z12 ? 1 : 0];
                    float f39 = fArr2[2];
                    float f40 = fArr2[3];
                    float f41 = fArr2[4];
                    if (i19 > 0) {
                        float f42 = f37 - ((float[]) arrayList4.get(i19 - 1))[z12 ? 1 : 0];
                        float f43 = f14 * 0.2f;
                        if (f42 < f43) {
                            f39 = Math.min(f39, (f42 / f43) * f14);
                        }
                    }
                    if (i19 < arrayList4.size() - 1) {
                        float f44 = ((float[]) arrayList4.get(i19 + 1))[0] - f38;
                        float f45 = 0.2f * f14;
                        if (f44 < f45) {
                            f40 = Math.min(f40, (f44 / f45) * f14);
                        }
                    }
                    p1Var.run(Float.valueOf(f37), Float.valueOf(f38), Float.valueOf(f39), Float.valueOf(f40), Float.valueOf(f41));
                }
            }
            this.X2.clear();
        } else {
            f7 = 1.0f;
            i10 = 0;
            int i20 = -1;
            int i21 = -1;
            View view2 = null;
            View view3 = null;
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt2 = getChildAt(i22);
                if (childAt2 == this.a1 || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.G2.a.run(childAt2)).booleanValue() || h1(RecyclerView.R(childAt2))) {
                    P0(canvas, view2, view3, Y0(i20, view2), a1(i21, view3));
                    i20 = -1;
                    i21 = -1;
                    view2 = null;
                    view3 = null;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i20, view2), a1(i21, view3));
                        i20 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i20 = i22;
                        view2 = childAt2;
                    }
                    i21 = i22;
                    view3 = childAt2;
                }
            }
            P0(canvas, view2, view3, Y0(i20, view2), a1(i21, view3));
        }
        if (this.K2 != null) {
            for (int i23 = i10; i23 < this.K2.size(); i23++) {
                long longValue = ((Long) this.K2.get(i23)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float height = getHeight();
                float f46 = this.L2;
                float f47 = height + f46;
                float f48 = -f46;
                for (int i24 = i10; i24 < getChildCount(); i24++) {
                    View childAt3 = getChildAt(i24);
                    int R = RecyclerView.R(childAt3);
                    if (R >= unpackA && R <= unpackB) {
                        f47 = Math.min(f47, y1(childAt3));
                        f48 = Math.max(f48, G0(childAt3));
                    }
                }
                if (f47 < f48) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.G2.c, f47, (getWidth() - getPaddingRight()) - this.G2.c, f48);
                    float f49 = this.L2;
                    this.J2.run(canvas, rectF, Float.valueOf(f49), Float.valueOf(f49), Float.valueOf(f7));
                }
            }
        }
        canvas.restore();
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.y yVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (rect.isEmpty() || (yVar = this.B1) == null) {
            return;
        }
        int i10 = this.G1;
        if ((i10 == -2 || i10 == this.C1) && this.D1 != null) {
            if (getAdapter() instanceof mm0) {
                ((mm0) getAdapter()).getClass();
            }
            this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
        } else {
            yVar.setBounds(rect);
        }
        canvas.save();
        int i11 = this.G1;
        if ((i11 == -2 || i11 == this.C1) && (aVar = this.m2) != null) {
            aVar.accept(canvas);
        }
        int i12 = this.G1;
        if ((i12 == -2 || i12 == this.C1) && (view = this.D1) != null) {
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

    public boolean S0() {
        return (getAdapter() == null || this.V1 || getAdapter().h() != 0) ? false : true;
    }

    public final void T0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z10) {
            int i10 = this.w1;
            if (i10 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e) {
                    FileLog.e(e);
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
        boolean i12;
        boolean i13;
        if (view.getParent() != this || !b1() || !j1(view)) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            i13 = false;
            i12 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            i12 = i1(U0, true);
            i13 = i1(U02, false);
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(this.Q2 ? getSectionsEdgeTop() : 0.0f, y1(view)), view.getX() + view.getWidth(), Math.min(this.R2 ? getSectionsEdgeBottom() : getHeight(), G0(view)));
        if (i12 && i13 && !z10) {
            i12 = y1(view) >= rectF.top;
            boolean z11 = G0(view) <= rectF.bottom;
            if (i12 && z11) {
                return org.telegram.ui.ActionBar.y6.c0(0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.n2));
            }
            i13 = z11;
        }
        Path path = new Path();
        if ((!i12 && !i13) || z10) {
            path.rewind();
            float f7 = this.L2;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        } else if (!i12) {
            path.rewind();
            path.addRoundRect(rectF, this.M2, Path.Direction.CW);
        } else if (!i13) {
            path.rewind();
            path.addRoundRect(rectF, this.N2, Path.Direction.CW);
        }
        return new sl0(this, view, path, rectF);
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.v2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.u6 u6Var = this.n2;
        Paint d = u6Var != null ? u6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (this.Q2 || view == null || i10 > 0 || getAdapter() == null || this.I2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (xt xtVar : this.D2.a) {
            if (xtVar != null && xtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (this.R2 || view == null || i10 < getChildCount() - 1 || getAdapter() == null || this.I2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.I2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
    }

    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
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
            if ((X instanceof dh.a) && ((X != this.G2 && X != this.S2) || this.F2)) {
                ((dh.a) X).b(aVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x9 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x9, y3, childAt.getWidth() + x9, childAt.getHeight() + y3)) {
                aVar.getClass();
                android.support.v4.media.session.x.a(aVar, childAt);
            }
        }
    }

    public final boolean b1() {
        return (this.G2 == null && this.S2 == null) ? false : true;
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
    public final boolean canScrollVertically(int i10) {
        return this.R1 && super.canScrollVertically(i10);
    }

    public final void d1(boolean z10) {
        View view = this.L1;
        if (view != null) {
            k1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                n1(null, view);
            }
        }
        if (z10) {
            return;
        }
        this.B1.setState(StateSet.NOTHING);
        this.E1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        rl0 rl0Var = this.l2;
        if (rl0Var != null) {
            nm0 nm0Var = rl0Var.a;
            if (rl0Var.d || rl0Var.e) {
                for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
                    View childAt = nm0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !rl0Var.c.contains(childAt)) {
                        Float f7 = (Float) rl0Var.b.get(R, null);
                        if (f7 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f7.floatValue());
                        }
                    }
                }
                rl0Var.d = false;
            }
        }
        if (this.S0 && this.z1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.z1) {
            R0(canvas);
        }
        bh.r rVar = this.b1;
        if (rVar != null) {
            rVar.draw(canvas);
        }
        if (this.x1) {
            return;
        }
        int i11 = this.w1;
        if (i11 == 1) {
            if (this.e1 == null || this.n1.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < this.n1.size(); i12++) {
                View view2 = (View) this.n1.get(i12);
                int save = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i11 != 2 || this.e1 == null || (view = this.p1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.p1.getWidth() : 0.0f, ((Integer) this.p1.getTag()).intValue());
        Drawable drawable = this.j1;
        if (drawable != null) {
            drawable.setBounds(0, this.p1.getMeasuredHeight(), getWidth(), this.j1.getIntrinsicHeight() + this.p1.getMeasuredHeight());
            this.j1.setAlpha((int) (this.k1 * 255.0f));
            this.j1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.m1);
            this.m1 = elapsedRealtime;
            float f10 = this.k1;
            float f11 = this.l1;
            if (f10 < f11) {
                float f12 = (min / 180.0f) + f10;
                this.k1 = f12;
                if (f12 > f11) {
                    this.k1 = f11;
                }
                invalidate();
            } else if (f10 > f11) {
                float f13 = f10 - (min / 180.0f);
                this.k1 = f13;
                if (f13 < f11) {
                    this.k1 = f11;
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
            int i10 = this.x2 - 1;
            this.x2 = i10;
            if (i10 == 0 && this.y2) {
                setOverScrollMode(2);
            }
        }
        tl0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.a0 || !fastScroll.l0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.e1 == null || (view = this.p1) == null || view.getAlpha() == 0.0f || !this.p1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.G2 == null || this.A2) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        O0(canvas);
        N0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        B1();
    }

    public final void e1(xl0 xl0Var, int i10, boolean z10) {
        xa0 xa0Var = this.T1;
        if (xa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xa0Var);
            this.T1 = null;
        }
        s4.e1 K = K(xl0Var.run());
        if (K == null) {
            if (z10) {
                this.S1 = xl0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c10 = K.c();
        this.w2 = c10;
        l1(c10, view);
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
        if (i10 > 0) {
            this.S1 = null;
            xa0 xa0Var2 = new xa0(this, 21);
            this.T1 = xa0Var2;
            AndroidUtilities.runOnUIThread(xa0Var2, i10);
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!Z0() || getOverScrollMode() == 2) {
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
                FileLog.e(th2);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void f1() {
        Utilities.CallbackReturn callbackReturn;
        tv tvVar;
        s4.n0 n0Var = this.G2;
        if (n0Var != null) {
            q0(n0Var);
            this.G2 = null;
        }
        s4.n0 n0Var2 = this.S2;
        if (n0Var2 != null) {
            q0(n0Var2);
            this.S2 = null;
        }
        Utilities.CallbackReturn callbackReturn2 = this.H2;
        if (callbackReturn2 == null || (callbackReturn = this.I2) == null || (tvVar = this.J2) == null) {
            return;
        }
        if (this.T2 || this.Q2 || this.R2) {
            yl0 yl0Var = new yl0(this, callbackReturn2, this.O2, this.P2);
            this.G2 = yl0Var;
            i(yl0Var);
        } else {
            ea eaVar = new ea(this, callbackReturn2, callbackReturn, this.O2, this.L2, tvVar, this.P2, this.U2, this.V2);
            this.S2 = eaVar;
            i(eaVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void g0(View view) {
        if (!(getAdapter() instanceof mm0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        s4.e1 G = G(view);
        if (G != null) {
            view.setEnabled(((mm0) getAdapter()).D(G));
            if (this.o2) {
                view.setAccessibilityDelegate(this.p2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.p6) {
                ((org.telegram.ui.ActionBar.p6) childAt).updateColors();
            }
            childAt.invalidate();
        }
    }

    public View getEmptyView() {
        return this.a1;
    }

    public tl0 getFastScroll() {
        return this.d1;
    }

    public ArrayList<View> getHeaders() {
        return this.n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.o1;
    }

    public am0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.u0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public int getSectionColorForDecoration() {
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, this.n2);
    }

    public int getSectionsBackgroundColorForDecoration() {
        return i0.a.o(org.telegram.ui.ActionBar.y6.w0(this.W2, this.n2), 255);
    }

    public boolean getSectionsDrawBackground() {
        return this.U2;
    }

    public float getSectionsEdgeBottom() {
        return getHeight() - getPaddingBottom();
    }

    public float getSectionsEdgeTop() {
        return getPaddingTop();
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

    public final boolean h1(int i10) {
        if (this.K2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.K2.size(); i11++) {
                long longValue = ((Long) this.K2.get(i11)).longValue();
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

    public final boolean i1(View view, boolean z10) {
        if (view == null || !j1(view)) {
            return false;
        }
        return z10 ? !this.Q2 || G0(view) > q1() : !this.R2 || y1(view) < p1();
    }

    public final boolean j1(View view) {
        ea eaVar = this.S2;
        if (eaVar != null) {
            return eaVar.u(view);
        }
        yl0 yl0Var = this.G2;
        return yl0Var != null && ((Boolean) yl0Var.a.run(view)).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    public void k1(View view, float f7, float f10, boolean z10) {
        if (this.h1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    public final void l1(int i10, View view) {
        xa0 xa0Var = this.T1;
        if (xa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xa0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 == null) {
            return;
        }
        boolean z10 = i10 != this.C1;
        if (getAdapter() instanceof mm0) {
            ((mm0) getAdapter()).getClass();
        }
        if (i10 != -1) {
            this.C1 = i10;
        }
        this.D1 = view;
        if (this.A1 == 8) {
            org.telegram.ui.ActionBar.y6.D1(this.B1, this.Y1, 0);
        } else if (this.Z1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.y6.D1(this.B1, i10 == 0 ? this.Z1 : 0, i10 == getAdapter().h() + (-2) ? this.Z1 : 0);
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
        if (z10) {
            this.B1.setVisible(false, false);
            this.B1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(W0(i10));
        this.B1.setBounds(rect);
        if (z10 && getVisibility() == 0) {
            this.B1.setVisible(true, false);
        }
    }

    public final void m1() {
        int i10;
        xa0 xa0Var = this.T1;
        if (xa0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xa0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.w2) != -1) {
            l1(i10, view);
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

    public final void n1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.E1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                l1(this.M1, view);
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
            B1();
        }
    }

    public final void o1(nm0 nm0Var, boolean z10) {
        ViewParent parent;
        if (nm0Var == null || (parent = nm0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tl0 tl0Var = this.d1;
        if (tl0Var == null || tl0Var.getParent() == getParent()) {
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
        rl0 rl0Var = this.l2;
        if (rl0Var != null) {
            rl0Var.a();
        }
        if (this.t2) {
            this.t2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.O1) {
            o1(this, true);
        }
        if (this.Z0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i10 = org.telegram.ui.wn.fd;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tl0 tl0Var = this.d1;
        if (tl0Var != null) {
            this.H1 = true;
            int paddingTop = i11 + (tl0Var.a ? getPaddingTop() : tl0Var.h0);
            tl0 tl0Var2 = this.d1;
            if (tl0Var2.g0) {
                tl0Var2.layout(0, paddingTop, tl0Var2.getMeasuredWidth(), this.d1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.d1.getMeasuredWidth();
                tl0 tl0Var3 = this.d1;
                tl0Var3.layout(measuredWidth, paddingTop, tl0Var3.getMeasuredWidth() + measuredWidth, this.d1.getMeasuredHeight() + paddingTop);
            }
            this.H1 = false;
        }
        L0(false);
        xl0 xl0Var = this.S1;
        if (xl0Var != null) {
            e1(xl0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        tl0 tl0Var = this.d1;
        if (tl0Var != null && tl0Var.getLayoutParams() != null) {
            tl0 tl0Var2 = this.d1;
            int measuredHeight = (getMeasuredHeight() - (tl0Var2.a ? getPaddingTop() : tl0Var2.h0)) - getPaddingBottom();
            this.d1.getLayoutParams().height = measuredHeight;
            this.d1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        bh.r rVar = this.b1;
        if (rVar != null) {
            rVar.requestLayout();
        }
        int i14 = this.w1;
        if (i14 != 1) {
            if (i14 != 2 || this.e1 == null || (view = this.p1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.e1 == null || this.n1.isEmpty()) {
            return;
        }
        for (int i15 = 0; i15 < this.n1.size(); i15++) {
            T0((View) this.n1.get(i15), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        tl0 tl0Var = this.d1;
        if (tl0Var != null && tl0Var.n) {
            return false;
        }
        boolean z10 = this.b2;
        m.g3 g3Var = this.C2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.i2 = Float.MAX_VALUE;
            this.j2 = Float.MAX_VALUE;
            this.b2 = false;
            this.c2 = false;
            o1(this, false);
            this.g2 = false;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.i2 == Float.MAX_VALUE && this.j2 == Float.MAX_VALUE) {
            this.i2 = motionEvent.getX();
            this.j2 = motionEvent.getY();
        }
        if (!this.c2 && Math.abs(motionEvent.getY() - this.j2) > this.a2) {
            this.c2 = true;
            o1(this, true);
        }
        if (this.c2) {
            M0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.wi wiVar = this.f2;
            int[] iArr = this.k2;
            org.telegram.ui.wn wnVar = wiVar.d;
            iArr[0] = (int) wnVar.I9;
            iArr[1] = wnVar.Ra;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.k2[1] && (this.e2 >= this.d2 || !this.f2.a)) {
                this.h2 = false;
                if (!this.g2) {
                    this.g2 = true;
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    AndroidUtilities.runOnUIThread(g3Var);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.k2[0] || (this.e2 > this.d2 && this.f2.a)) {
                this.g2 = false;
                AndroidUtilities.cancelRunOnUIThread(g3Var);
            } else {
                this.h2 = true;
                if (!this.g2) {
                    this.g2 = true;
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    AndroidUtilities.runOnUIThread(g3Var);
                    return true;
                }
            }
        }
        return true;
    }

    public final float p1() {
        return this.R2 ? getSectionsEdgeBottom() : getHeight() + this.L2;
    }

    public final float q1() {
        return this.Q2 ? getSectionsEdgeTop() : -this.L2;
    }

    public final void r1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.V1 || this.B2) {
            return;
        }
        super.requestLayout();
    }

    public final void s1(dm0 dm0Var, long j10) {
        this.W0 = dm0Var;
        jg.i iVar = this.K1;
        boolean z10 = dm0Var != null;
        v20 v20Var = (v20) iVar.a;
        v20Var.t = z10;
        v20Var.u = j10;
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.o2 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.h0 h0Var) {
        s4.h0 adapter = getAdapter();
        ig.o1 o1Var = this.r2;
        if (adapter != null) {
            adapter.a.unregisterObserver(o1Var);
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
        if (h0Var instanceof im0) {
            this.e1 = (im0) h0Var;
        } else {
            this.e1 = null;
        }
        super.setAdapter(h0Var);
        if (h0Var != null) {
            h0Var.B(o1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.v1 = z10;
    }

    public void setBitmapSectionsBackgroundColorKey(int i10) {
        if (this.W2 == i10) {
            return;
        }
        this.W2 = i10;
        invalidate();
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.F2 = z10;
        if (z10) {
            setSectionsRounding(false);
        }
    }

    public void setDisableHighlightState(boolean z10) {
        this.h1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.O1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.S0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.z1 = z10;
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

    public void setFastScrollEnabled(int i10) {
        this.d1 = new tl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        tl0 tl0Var = this.d1;
        if (tl0Var == null) {
            return;
        }
        tl0Var.setVisibility(z10 ? 0 : 8);
        this.d1.a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(s4.m0 m0Var) {
        super.setItemAnimator(m0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.v2 = genericProvider;
    }

    public void setItemsEnterAnimator(rl0 rl0Var) {
        this.l2 = rl0Var;
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
            intValue = org.telegram.ui.ActionBar.y6.w0(b1() ? org.telegram.ui.ActionBar.y6.j6 : org.telegram.ui.ActionBar.y6.i6, this.n2);
        } else {
            intValue = num.intValue();
        }
        this.u2 = intValue;
        org.telegram.ui.ActionBar.y6.E1(this.B1, intValue, true);
    }

    public void setOnInterceptTouchListener(zl0 zl0Var) {
        this.Z0 = zl0Var;
    }

    public void setOnItemClickListener(am0 am0Var) {
        this.T0 = am0Var;
    }

    public void setOnItemLongClickListener(cm0 cm0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = cm0Var;
        jg.i iVar = this.K1;
        boolean z10 = cm0Var != null;
        v20 v20Var = (v20) iVar.a;
        v20Var.t = z10;
        v20Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(s4.u0 u0Var) {
        this.Y0 = u0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.j1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.u1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.q2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.R1 = z10;
    }

    public void setSections(boolean z10) {
        v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsDrawBackground(boolean z10) {
        if (this.U2 == z10) {
            return;
        }
        this.U2 = z10;
        ea eaVar = this.S2;
        if (eaVar != null) {
            nm0 nm0Var = eaVar.a;
            if (eaVar.K != z10) {
                eaVar.K = z10;
                nm0Var.a0();
                nm0Var.invalidate();
            }
            this.y1 = false;
            if (this.a1 != null) {
                setVisibility(0);
            }
        }
    }

    public void setSectionsDrawingMode(lm0 lm0Var) {
        if (this.V2 == lm0Var) {
            return;
        }
        this.V2 = lm0Var;
        ea eaVar = this.S2;
        if (eaVar != null) {
            nm0 nm0Var = eaVar.a;
            if (eaVar.L == lm0Var) {
                return;
            }
            eaVar.L = lm0Var;
            nm0Var.a0();
            nm0Var.invalidate();
        }
    }

    public void setSectionsRounding(boolean z10) {
        if (this.Q2 == z10 && this.R2 == z10) {
            return;
        }
        this.Q2 = z10;
        this.R2 = z10;
        f1();
        invalidate();
    }

    public void setSectionsType(int i10) {
        this.w1 = i10;
        if (i10 == 1 || i10 == 3) {
            this.n1 = new ArrayList();
            this.o1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i10) {
        this.u2 = i10;
        org.telegram.ui.Cells.y yVar = this.B1;
        if (yVar != null) {
            yVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.y6.Z(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.y6.Z(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.y6.j0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.y6.g0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.y6.g0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.y yVar2 = this.B1;
        if (yVar2 != null) {
            yVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.Y1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.m2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.A1 = i10;
    }

    public void setSkipDrawSection(boolean z10) {
        this.x1 = z10;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.Z1 = i10;
    }

    public void setTranslateSelector(boolean z10) {
        this.G1 = z10 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.G1 = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        tl0 tl0Var = this.d1;
        if (tl0Var != null) {
            tl0Var.setTranslationY(f7);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (Z2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.U1 = false;
        }
    }

    public final void t1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.B2 = true;
        setPadding(i10, i11, i12, i13);
        this.B2 = false;
    }

    public final void u1() {
        v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (!this.X0) {
            return super.v(i10, i11, i12, iArr, iArr2);
        }
        dm0 dm0Var = this.W0;
        if (dm0Var != null) {
            dm0Var.o(i11);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        return true;
    }

    public void v1(int i10, float f7, boolean z10) {
        ai.d0 d0Var = new ai.d0(7);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new fi.d5(this, d0Var, sparseIntArray, 3), new vi(sparseIntArray, 2));
        w1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, z10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.B1 == drawable || super.verifyDrawable(drawable);
    }

    public final void w1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, boolean z10) {
        tv tvVar = new tv(this, 18);
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.j6, this.n2);
        this.H2 = callbackReturn;
        this.I2 = callbackReturn2;
        this.O2 = i10;
        this.P2 = z10;
        this.L2 = f7;
        this.M2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.N2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.J2 = tvVar;
        if (AndroidUtilities.isTablet() && !this.F2) {
            this.R2 = true;
            this.Q2 = true;
        }
        f1();
    }

    public boolean x1(View view) {
        return true;
    }

    public boolean z1() {
        return this.G;
    }

    public nm0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
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
        this.p2 = new pe(1);
        this.q2 = true;
        this.r2 = new ig.o1(this, 1);
        this.C2 = new m.g3(this, 24);
        this.V2 = lm0.a;
        this.W2 = org.telegram.ui.ActionBar.y6.a7;
        this.Y2 = new Path();
        this.n2 = u6Var;
        yt ytVar = new yt();
        this.D2 = ytVar;
        setEdgeEffectFactory(ytVar);
        org.telegram.ui.ActionBar.f7.m(this, 21, org.telegram.ui.ActionBar.y6.s8, u6Var);
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.i6, u6Var);
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
            FileLog.e(th2);
        }
        super.setOnScrollListener(new ml(this, 11));
        this.E.add(new hm0(context, this));
    }

    public void setOnItemClickListener(bm0 bm0Var) {
        this.U0 = bm0Var;
    }

    public void setOnItemLongClickListener(dm0 dm0Var) {
        s1(dm0Var, ViewConfiguration.getLongPressTimeout());
    }
}
