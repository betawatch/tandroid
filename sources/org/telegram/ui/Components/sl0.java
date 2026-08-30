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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class sl0 extends RecyclerView implements og.a {
    public static int[] N2;
    public static boolean O2;
    public static final Method P2;
    public static final Paint Q2;
    public static final Paint R2;
    public static final Path S2;
    public static final float[] T2;
    public org.telegram.ui.Cells.z A1;
    public final m2.b A2;
    public int B1;
    public final kt B2;
    public View C1;
    public Matrix C2;
    public final Rect D1;
    public boolean D2;
    public boolean E1;
    public gl0 E2;
    public int F1;
    public Utilities.CallbackReturn F2;
    public boolean G1;
    public Utilities.Callback5 G2;
    public boolean H1;
    public ArrayList H2;
    public boolean I1;
    public float I2;
    public ja.c J1;
    public float[] J2;
    public View K1;
    public float[] K2;
    public int L1;
    public ArrayList L2;
    public boolean M1;
    public final Path M2;
    public boolean N1;
    public boolean O1;
    public ml0 P1;
    public boolean Q1;
    public boolean R0;
    public fl0 R1;
    public il0 S0;
    public cc0 S1;
    public jl0 T0;
    public boolean T1;
    public kl0 U0;
    public boolean U1;
    public ll0 V0;
    public boolean V1;
    public boolean W0;
    public int W1;
    public f2.z0 X0;
    public int X1;
    public hl0 Y0;
    public int Y1;
    public View Z0;
    public int Z1;
    public dg.u2 a1;
    public boolean a2;
    public fg.d b1;
    public boolean b2;
    public bl0 c1;
    public int c2;
    public ol0 d1;
    public int d2;
    public boolean e1;
    public org.telegram.ui.mi e2;
    public boolean f1;
    public boolean f2;
    public boolean g1;
    public boolean g2;
    public boolean h1;
    public float h2;
    public Drawable i1;
    public float i2;
    public float j1;
    public int[] j2;
    public float k1;
    public zk0 k2;
    public long l1;
    public q0.a l2;
    public ArrayList m1;
    public final org.telegram.ui.ActionBar.f6 m2;
    public ArrayList n1;
    public boolean n2;
    public View o1;
    public final fe o2;
    public int p1;
    public boolean p2;
    public int q1;
    public final f2.d1 q2;
    public int r1;
    public Paint r2;
    public int s1;
    public boolean s2;
    public int t1;
    public GenericProvider t2;
    public boolean u1;
    public int u2;
    public int v1;
    public int v2;
    public boolean w1;
    public boolean w2;
    public boolean x1;
    public int x2;
    public boolean y1;
    public boolean y2;
    public int z1;
    public boolean z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        P2 = method;
        Q2 = new Paint(1);
        R2 = new Paint(1);
        S2 = new Path();
        T2 = new float[8];
    }

    public sl0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f10, float f11, float f12, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean z4 = SharedConfig.shadowsInSections;
        Paint paint = Q2;
        Paint paint2 = R2;
        if (z4) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.j6.l1(f12, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.j6.l1(f12, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f12, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        if (f10 == f11) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        Path path = S2;
        path.rewind();
        float[] fArr = T2;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        if (SharedConfig.shadowsInSections) {
            canvas.drawPath(path, paint2);
        }
        canvas.drawPath(path, paint);
    }

    private int[] getDrawableStateForSelector() {
        int[] onCreateDrawableState = onCreateDrawableState(1);
        onCreateDrawableState[onCreateDrawableState.length - 1] = 16842919;
        return onCreateDrawableState;
    }

    public static float t1(View view) {
        return view.getTag(R.id.dragging) != null ? view.getTop() : view.getY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void B0() {
        try {
            super.B0();
        } catch (NullPointerException unused) {
        }
    }

    public final void C0(Runnable runnable) {
        this.B2.b.add(new ht(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.a1 == null) {
            this.a1 = new dg.u2(this, getContext(), 22);
        }
        this.a1.addView(clippingImageView, layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f10, float f11) {
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < 2) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                if ((!(childAt instanceof org.telegram.ui.Cells.t1) && !(childAt instanceof org.telegram.ui.Cells.v0)) || childAt.getVisibility() != 4) {
                    float translationX = i10 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i10 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i10++;
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

    public final void I0(boolean z4) {
        fg.d dVar = this.b1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.b1 = null;
        }
        View view = this.K1;
        if (view != null) {
            if (z4) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.K1 = null;
            k1(null, view);
        }
        this.D1.setEmpty();
        ml0 ml0Var = this.P1;
        if (ml0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ml0Var);
            this.P1 = null;
        }
        this.M1 = false;
    }

    public final void J0(boolean z4) {
        if (this.f1) {
            return;
        }
        if (getAdapter() == null || this.Z0 == null) {
            if (!this.T1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.T1 = false;
            return;
        }
        boolean S0 = S0();
        int i10 = S0 ? 0 : 8;
        if (!this.V1 || !SharedConfig.animationsEnabled()) {
            z4 = false;
        }
        if (!z4) {
            this.x2 = i10;
            this.Z0.setVisibility(i10);
            this.Z0.setAlpha(1.0f);
        } else if (this.x2 != i10) {
            this.x2 = i10;
            if (i10 == 0) {
                this.Z0.animate().setListener(null).cancel();
                if (this.Z0.getVisibility() == 8) {
                    this.Z0.setVisibility(0);
                    this.Z0.setAlpha(0.0f);
                    if (this.W1 == 1) {
                        this.Z0.setScaleX(0.7f);
                        this.Z0.setScaleY(0.7f);
                    }
                }
                this.Z0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.Z0.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.Z0.animate().alpha(0.0f);
                if (this.W1 == 1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new nd0(this, 6)).start();
            }
        }
        if (this.x1) {
            int i11 = S0 ? 4 : 0;
            if (getVisibility() != i11) {
                setVisibility(i11);
            }
            this.T1 = true;
        }
    }

    public final void K0(boolean z4) {
        bl0 bl0Var;
        f2.l1 T;
        bl0 bl0Var2;
        View view;
        f2.l1 T3;
        int b10;
        int S;
        if (((this.H1 || z4) && this.c1 != null) || !(this.v1 == 0 || this.d1 == null)) {
            f2.v0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.i0) {
                f2.i0 i0Var = (f2.i0) layoutManager;
                if (i0Var.o == 1) {
                    if (this.d1 == null) {
                        int L0 = i0Var.L0();
                        Math.abs(i0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.H1 && !z4) || (bl0Var = this.c1) == null || bl0Var.n) {
                            return;
                        }
                        f2.o0 adapter = getAdapter();
                        if (adapter instanceof cl0) {
                            cl0 cl0Var = (cl0) adapter;
                            float H = cl0Var.H(this);
                            this.c1.setIsVisible(cl0Var.E(this));
                            this.c1.setProgress(Math.min(1.0f, H));
                            this.c1.a(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.v1 == 1 ? 0 : getPaddingTop();
                    int i10 = this.v1;
                    int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i10 != 1 && i10 != 3) {
                        if (i10 == 2) {
                            this.k1 = 0.0f;
                            if (this.d1.h() == 0) {
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
                                if (bottom > this.t1 + paddingTop) {
                                    if (bottom < i11) {
                                        view3 = childAt;
                                        i11 = bottom;
                                    }
                                    i13 = Math.max(i13, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.t1 + paddingTop && bottom < i12) {
                                        view2 = childAt;
                                        i12 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T3 = T(view3)) == null || (S = this.d1.S((b10 = T3.b()))) < 0) {
                                return;
                            }
                            if (this.p1 != S || this.o1 == null) {
                                View view4 = this.o1;
                                boolean z10 = view4 == null;
                                View T4 = this.d1.T(S, view4);
                                if (z10) {
                                    T0(T4, false);
                                }
                                this.o1 = T4;
                                T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.o1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.o1.getMeasuredHeight());
                                this.p1 = S;
                            }
                            if (this.o1 != null && view2 != null && view2.getClass() != this.o1.getClass()) {
                                this.k1 = 1.0f;
                            }
                            int M = this.d1.M(S);
                            int Q = this.d1.Q(b10);
                            int i15 = (i13 == 0 || i13 >= getMeasuredHeight() - getPaddingBottom()) ? this.t1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.o1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.t1);
                                int i16 = height2 < height ? height2 - height : paddingTop;
                                if (i16 < 0) {
                                    this.o1.setTag(Integer.valueOf(paddingTop + i15 + i16));
                                } else {
                                    this.o1.setTag(Integer.valueOf(paddingTop + i15));
                                }
                            } else {
                                this.o1.setTag(Integer.valueOf(paddingTop + i15));
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
                        if (bottom2 > this.t1 + paddingTop) {
                            if (bottom2 < i11) {
                                i11 = bottom2;
                                view6 = childAt2;
                            }
                            i18 = Math.max(i18, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(32.0f) + this.t1 + paddingTop && bottom2 < i17) {
                                i17 = bottom2;
                            }
                        }
                    }
                    if (view6 == null || (T = T(view6)) == null) {
                        return;
                    }
                    int b11 = T.b();
                    int abs = Math.abs(i0Var.N0() - b11) + 1;
                    if ((this.H1 || z4) && (bl0Var2 = this.c1) != null && !bl0Var2.n && (getAdapter() instanceof cl0)) {
                        this.c1.setProgress(Math.min(1.0f, b11 / ((this.d1.h() - abs) + 1)));
                    }
                    this.n1.addAll(this.m1);
                    this.m1.clear();
                    if (this.d1.h() == 0) {
                        return;
                    }
                    if (this.p1 != b11 || this.q1 != abs) {
                        this.p1 = b11;
                        this.q1 = abs;
                        this.s1 = 1;
                        int S3 = this.d1.S(b11);
                        this.r1 = S3;
                        int M2 = (this.d1.M(S3) + b11) - this.d1.Q(b11);
                        while (M2 < b11 + abs) {
                            M2 += this.d1.M(this.r1 + this.s1);
                            this.s1++;
                        }
                    }
                    if (this.v1 != 3) {
                        int i20 = b11;
                        for (int i21 = this.r1; i21 < this.r1 + this.s1; i21++) {
                            if (this.n1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.n1.get(0);
                                this.n1.remove(0);
                            }
                            boolean z11 = view == null;
                            View T5 = this.d1.T(i21, view);
                            if (z11) {
                                T0(T5, false);
                            }
                            this.m1.add(T5);
                            int M3 = this.d1.M(i21);
                            if (i21 == this.r1) {
                                int Q3 = this.d1.Q(i20);
                                if (Q3 == M3 - 1) {
                                    T5.setTag(Integer.valueOf((-T5.getHeight()) + paddingTop));
                                } else if (Q3 == M3 - 2) {
                                    View childAt3 = getChildAt(i20 - b11);
                                    T5.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    T5.setTag(0);
                                }
                                i20 = (M3 - this.d1.Q(b11)) + i20;
                            } else {
                                View childAt4 = getChildAt(i20 - b11);
                                if (childAt4 != null) {
                                    T5.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    T5.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                }
                                i20 += M3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void L0(float f10, float f11) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.j2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.mi miVar = this.e2;
            int[] iArr2 = this.j2;
            org.telegram.ui.xn xnVar = miVar.d;
            iArr2[0] = (int) xnVar.p9;
            iArr2[1] = xnVar.xa;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.d2;
                if (i11 != S) {
                    int i12 = this.c2;
                    boolean z4 = i11 > i12 || S > i12;
                    org.telegram.ui.xn xnVar2 = this.e2.d;
                    org.telegram.ui.jm jmVar = xnVar2.x0;
                    ArrayList arrayList = xnVar2.r6;
                    int i13 = S - jmVar.G;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) xnVar2.u6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            S = arrayList.indexOf(arrayList2.get(z4 ? 0 : arrayList2.size() - 1)) + xnVar2.x0.G;
                        }
                    }
                    if (z4) {
                        int i14 = this.d2;
                        if (S <= i14) {
                            while (i14 > S) {
                                if (i14 != this.c2 && this.e2.a(i14)) {
                                    this.e2.b(i14, false, min2, min);
                                }
                                i14--;
                            }
                        } else if (!this.e2.a) {
                            for (int i15 = i14 + 1; i15 <= S; i15++) {
                                if (i15 != this.c2 && this.e2.a(i15)) {
                                    this.e2.b(i15, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i16 = this.d2;
                        if (S > i16) {
                            while (i16 < S) {
                                if (i16 != this.c2 && this.e2.a(i16)) {
                                    this.e2.b(i16, false, min2, min);
                                }
                                i16++;
                            }
                        } else if (!this.e2.a) {
                            for (int i17 = i16 - 1; i17 >= S; i17--) {
                                if (i17 != this.c2 && this.e2.a(i17)) {
                                    this.e2.b(i17, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (this.e2.a) {
                    return;
                }
                this.d2 = S;
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z4;
        boolean z10;
        if (view == null || !((Boolean) this.E2.a.run(view)).booleanValue()) {
            return;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z10 = false;
            z4 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z4 = U0 != null && ((Boolean) this.E2.a.run(U0)).booleanValue();
            z10 = U02 != null && ((Boolean) this.E2.a.run(U02)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(-this.I2, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.I2), G0(view)));
        if (z4 && z10) {
            z4 = t1(view) >= rectF.top;
            boolean z11 = G0(view) <= rectF.bottom;
            if (z4 && z11) {
                return;
            } else {
                z10 = z11;
            }
        }
        Path path = this.M2;
        if (!z4 && !z10) {
            path.rewind();
            float f10 = this.I2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            return;
        }
        if (!z4) {
            path.rewind();
            path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            if (z10) {
                return;
            }
            path.rewind();
            path.addRoundRect(rectF, this.K2, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    public final void O0(Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
        if (i11 < i10 || i10 < 0 || i11 < 0) {
            return;
        }
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i16 = TLObject.FLAG_31;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt != null) {
                int R = RecyclerView.R(childAt);
                int top = childAt.getTop();
                if (R >= i10 && R <= i11) {
                    i15 = Math.min(top, i15);
                    i16 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i16);
                }
            }
        }
        if (i15 < i16) {
            if (this.r2 == null) {
                this.r2 = new Paint(1);
            }
            this.r2.setColor(i12);
            canvas.drawRect(0.0f, i15 - i13, getWidth(), i16 + i14, this.r2);
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z4, boolean z10) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof m80 ? ((m80) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(-this.I2, t1(view) - (z4 ? this.I2 : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.I2), (G0(view2) + (z10 ? this.I2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.G2.run(canvas, rectF, Float.valueOf(this.I2), Float.valueOf(this.I2), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float[] fArr;
        int i10;
        View view;
        if (this.G2 == null) {
            return;
        }
        f2.t0 t0Var = this.W;
        if (t0Var == null || !t0Var.k()) {
            f10 = 1.0f;
            int i11 = -1;
            View view2 = null;
            View view3 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt == this.Z0 || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.0f || !((Boolean) this.E2.a.run(childAt)).booleanValue() || g1(RecyclerView.R(childAt))) {
                    P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
                    i11 = -1;
                    view2 = null;
                    view3 = null;
                    i12 = -1;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
                        i11 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i11 = i13;
                        view2 = childAt;
                    }
                    i12 = i13;
                    view3 = childAt;
                }
            }
            P0(canvas, view2, view3, Y0(i11, view2), a1(i12, view3));
        } else {
            if (this.L2 == null) {
                this.L2 = new ArrayList();
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt2 = getChildAt(i14);
                if (childAt2 != this.Z0 && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && ((Boolean) this.E2.a.run(childAt2)).booleanValue()) {
                    float t12 = t1(childAt2);
                    float G0 = G0(childAt2);
                    f2.l1 T = T(childAt2);
                    if (!T.j() || childAt2.getAlpha() >= 1.0f) {
                        if (g1(T.b())) {
                        }
                        ArrayList arrayList = this.L2;
                        float alpha = childAt2.getAlpha();
                        pl0 pl0Var = new pl0();
                        pl0Var.a = t12;
                        pl0Var.b = G0;
                        pl0Var.c = alpha;
                        arrayList.add(pl0Var);
                    } else {
                        if (T.j() && (i10 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i10 / 1000.0d)) + 1;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i15);
                                if (view != null && view != childAt2 && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                            if (view != null && G0 > view.getY() && ((Boolean) this.E2.a.run(view)).booleanValue() && !T(view).j()) {
                                t12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < t12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.L2;
                        float alpha2 = childAt2.getAlpha();
                        pl0 pl0Var2 = new pl0();
                        pl0Var2.a = t12;
                        pl0Var2.b = G0;
                        pl0Var2.c = alpha2;
                        arrayList2.add(pl0Var2);
                    }
                }
            }
            ArrayList arrayList3 = this.L2;
            float f13 = this.I2;
            ArrayList arrayList4 = ql0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f10 = 1.0f;
            } else {
                Collections.sort(arrayList3, new nh.e4(24));
                arrayList4.clear();
                int i16 = 0;
                while (i16 < arrayList3.size()) {
                    float f14 = ((pl0) arrayList3.get(i16)).b;
                    int i17 = i16 + 1;
                    while (i17 < arrayList3.size() && ((pl0) arrayList3.get(i17)).a <= f14 + 1.5f) {
                        f14 = Math.max(f14, ((pl0) arrayList3.get(i17)).b);
                        i17++;
                    }
                    float f15 = Float.MAX_VALUE;
                    float f16 = Float.MIN_VALUE;
                    float f17 = Float.MAX_VALUE;
                    float f18 = Float.MIN_VALUE;
                    for (int i18 = i16; i18 < i17; i18++) {
                        pl0 pl0Var3 = (pl0) arrayList3.get(i18);
                        if (pl0Var3.c >= 0.99f) {
                            f17 = Math.min(f17, pl0Var3.a);
                            f18 = Math.max(f18, pl0Var3.b);
                        }
                    }
                    boolean z4 = f17 != Float.MAX_VALUE;
                    float f19 = 0.0f;
                    for (int i19 = i16; i19 < i17; i19++) {
                        pl0 pl0Var4 = (pl0) arrayList3.get(i19);
                        f15 = Math.min(f15, pl0Var4.a);
                        f16 = Math.max(f16, pl0Var4.b);
                        f19 = Math.max(f19, pl0Var4.c);
                    }
                    if (f19 >= 0.001f) {
                        if (z4) {
                            float f20 = 0.0f;
                            pl0 pl0Var5 = null;
                            for (int i20 = i16; i20 < i17; i20++) {
                                pl0 pl0Var6 = (pl0) arrayList3.get(i20);
                                float f21 = pl0Var6.c;
                                if (f21 < 0.99f) {
                                    float f22 = pl0Var6.a;
                                    if (f22 < f17) {
                                        float f23 = (f17 - f22) * f21;
                                        if (f23 > f20) {
                                            pl0Var5 = pl0Var6;
                                            f20 = f23;
                                        }
                                    }
                                }
                            }
                            pl0 pl0Var7 = null;
                            float f24 = 0.0f;
                            while (i16 < i17) {
                                pl0 pl0Var8 = (pl0) arrayList3.get(i16);
                                float f25 = pl0Var8.c;
                                if (f25 < 0.99f) {
                                    float f26 = pl0Var8.b;
                                    if (f26 > f18) {
                                        float f27 = (f26 - f18) * f25;
                                        if (f27 > f24) {
                                            pl0Var7 = pl0Var8;
                                            f24 = f27;
                                        }
                                    }
                                }
                                i16++;
                            }
                            if (pl0Var5 != null) {
                                float f28 = pl0Var5.a;
                                float f29 = pl0Var5.c;
                                if (f29 > 0.001f) {
                                    float lerp = AndroidUtilities.lerp(f17, f28, f29);
                                    f11 = AndroidUtilities.lerp(f13, f29 * f13, (f17 - lerp) / ((f17 - f28) + 0.001f));
                                    f17 = lerp;
                                    if (pl0Var7 != null) {
                                        float f30 = pl0Var7.b;
                                        float f31 = pl0Var7.c;
                                        if (f31 > 0.001f) {
                                            float lerp2 = AndroidUtilities.lerp(f18, f30, f31);
                                            f12 = AndroidUtilities.lerp(f13, f31 * f13, (lerp2 - f18) / ((f30 - f18) + 0.001f));
                                            f18 = lerp2;
                                            f19 = 1.0f;
                                            f15 = f17;
                                        }
                                    }
                                    f12 = f13;
                                    f15 = f17;
                                    f19 = 1.0f;
                                }
                            }
                            f11 = f13;
                            if (pl0Var7 != null) {
                            }
                            f12 = f13;
                            f15 = f17;
                            f19 = 1.0f;
                        } else {
                            f12 = f13;
                            f11 = f12;
                            f18 = f16;
                        }
                        if (f18 > f15) {
                            fArr = new float[]{f15, f18, f11, f12, f19};
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i16 = i17;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i16 = i17;
                }
                f10 = 1.0f;
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    float[] fArr2 = (float[]) arrayList4.get(i21);
                    float f32 = fArr2[0];
                    float f33 = fArr2[1];
                    float f34 = fArr2[2];
                    float f35 = fArr2[3];
                    float f36 = fArr2[4];
                    if (i21 > 0) {
                        float f37 = f32 - ((float[]) arrayList4.get(i21 - 1))[1];
                        float f38 = f13 * 0.2f;
                        if (f37 < f38) {
                            f34 = Math.min(f34, (f37 / f38) * f13);
                        }
                    }
                    if (i21 < arrayList4.size() - 1) {
                        float f39 = ((float[]) arrayList4.get(i21 + 1))[0] - f33;
                        float f40 = 0.2f * f13;
                        if (f39 < f40) {
                            f35 = Math.min(f35, (f39 / f40) * f13);
                        }
                    }
                    Float valueOf = Float.valueOf(f34);
                    Float valueOf2 = Float.valueOf(f35);
                    Float valueOf3 = Float.valueOf(f36);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.E2.c, f32, (getWidth() - this.E2.c) - getPaddingRight(), f33);
                    this.G2.run(canvas, rectF, valueOf, valueOf2, valueOf3);
                }
            }
            this.L2.clear();
        }
        if (this.H2 != null) {
            for (int i22 = 0; i22 < this.H2.size(); i22++) {
                long longValue = ((Long) this.H2.get(i22)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float height = getHeight();
                float f41 = this.I2;
                float f42 = height + f41;
                float f43 = -f41;
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt3 = getChildAt(i23);
                    int R = RecyclerView.R(childAt3);
                    if (R >= unpackA && R <= unpackB) {
                        f42 = Math.min(f42, t1(childAt3));
                        f43 = Math.max(f43, G0(childAt3));
                    }
                }
                if (f42 < f43) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.E2.c, f42, (getWidth() - getPaddingRight()) - this.E2.c, f43);
                    this.G2.run(canvas, rectF2, Float.valueOf(this.I2), Float.valueOf(this.I2), Float.valueOf(f10));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.D1;
        if (rect.isEmpty() || (zVar = this.A1) == null) {
            return;
        }
        int i10 = this.F1;
        if ((i10 == -2 || i10 == this.B1) && this.C1 != null) {
            if (getAdapter() instanceof rl0) {
                ((rl0) getAdapter()).getClass();
            }
            this.A1.setBounds(this.C1.getLeft(), this.C1.getTop(), this.C1.getRight(), this.C1.getBottom());
        } else {
            zVar.setBounds(rect);
        }
        canvas.save();
        int i11 = this.F1;
        if ((i11 == -2 || i11 == this.B1) && (aVar = this.l2) != null) {
            aVar.accept(canvas);
        }
        int i12 = this.F1;
        if ((i12 == -2 || i12 == this.B1) && (view = this.C1) != null) {
            canvas.translate(view.getX() - rect.left, this.C1.getY() - rect.top);
            this.A1.setAlpha((int) (this.C1.getAlpha() * 255.0f));
        }
        if (b1()) {
            canvas.save();
            M0(canvas, this.C1);
            this.A1.draw(canvas);
            canvas.restore();
        } else {
            this.A1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean S0() {
        return (getAdapter() == null || this.U1 || getAdapter().h() != 0) ? false : true;
    }

    public final void T0(View view, boolean z4) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z4) {
            int i10 = this.v1;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
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

    public final Drawable V0(View view, boolean z4) {
        boolean z10;
        boolean z11;
        if (view.getParent() != this || !b1() || !((Boolean) this.E2.a.run(view)).booleanValue()) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z11 = false;
            z10 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z10 = U0 != null && ((Boolean) this.E2.a.run(U0)).booleanValue();
            z11 = U02 != null && ((Boolean) this.E2.a.run(U02)).booleanValue();
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z10 && z11 && !z4) {
            z10 = t1(view) >= rectF.top;
            boolean z12 = G0(view) <= rectF.bottom;
            if (z10 && z12) {
                return org.telegram.ui.ActionBar.j6.b0(0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, this.m2));
            }
            z11 = z12;
        }
        Path path = new Path();
        if ((!z10 && !z11) || z4) {
            path.rewind();
            float f10 = this.I2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else if (!z10) {
            path.rewind();
            path.addRoundRect(rectF, this.J2, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.K2, Path.Direction.CW);
        }
        return new al0(this, view, path, rectF);
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.t2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.m2;
        Paint G = f6Var != null ? f6Var.G(str) : null;
        return G != null ? G : org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view == null || i10 > 0 || getAdapter() == null || this.F2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.F2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (jt jtVar : this.B2.a) {
            if (jtVar != null && jtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view == null || i10 < getChildCount() - 1 || getAdapter() == null || this.F2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.F2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
    }

    public final boolean b1() {
        return this.E2 != null;
    }

    public final void c1() {
        if (this.f1) {
            return;
        }
        this.f1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.Z0;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.Z0.setVisibility(8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.Q1 && super.canScrollVertically(i10);
    }

    public final void d1(boolean z4) {
        View view = this.K1;
        if (view != null) {
            h1(view, 0.0f, 0.0f, false);
            this.K1 = null;
            if (z4) {
                k1(null, view);
            }
        }
        if (z4) {
            return;
        }
        this.A1.setState(StateSet.NOTHING);
        this.D1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        zk0 zk0Var = this.k2;
        if (zk0Var != null) {
            sl0 sl0Var = zk0Var.a;
            if (zk0Var.d || zk0Var.e) {
                for (int i10 = 0; i10 < sl0Var.getChildCount(); i10++) {
                    View childAt = sl0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !zk0Var.c.contains(childAt)) {
                        Float f10 = (Float) zk0Var.b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                zk0Var.d = false;
            }
        }
        if (this.R0 && this.y1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.R0 && !this.y1) {
            R0(canvas);
        }
        dg.u2 u2Var = this.a1;
        if (u2Var != null) {
            u2Var.draw(canvas);
        }
        if (this.w1) {
            return;
        }
        int i11 = this.v1;
        if (i11 == 1) {
            if (this.d1 == null || this.m1.isEmpty()) {
                return;
            }
            for (int i12 = 0; i12 < this.m1.size(); i12++) {
                View view2 = (View) this.m1.get(i12);
                int save = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i11 != 2 || this.d1 == null || (view = this.o1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.o1.getWidth() : 0.0f, ((Integer) this.o1.getTag()).intValue());
        Drawable drawable = this.i1;
        if (drawable != null) {
            drawable.setBounds(0, this.o1.getMeasuredHeight(), getWidth(), this.i1.getIntrinsicHeight() + this.o1.getMeasuredHeight());
            this.i1.setAlpha((int) (this.j1 * 255.0f));
            this.i1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.l1);
            this.l1 = elapsedRealtime;
            float f11 = this.j1;
            float f12 = this.k1;
            if (f11 < f12) {
                float f13 = (min / 180.0f) + f11;
                this.j1 = f13;
                if (f13 > f12) {
                    this.j1 = f12;
                }
                invalidate();
            } else if (f11 > f12) {
                float f14 = f11 - (min / 180.0f);
                this.j1 = f14;
                if (f14 < f12) {
                    this.j1 = f12;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.o1.getMeasuredHeight());
        this.o1.draw(canvas);
        canvas.restoreToCount(save2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.v2 == 0 && this.w2) {
                setOverScrollMode(0);
            }
            this.v2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.v2 - 1;
            this.v2 = i10;
            if (i10 == 0 && this.w2) {
                setOverScrollMode(2);
            }
        }
        bl0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.U || !fastScroll.h0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.d1 == null || (view = this.o1) == null || view.getAlpha() == 0.0f || !this.o1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!b1() || this.y2) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        M0(canvas, view);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v1();
    }

    public void e(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Z0() && getOverScrollMode() != 2) {
            if (this.C2 == null) {
                this.C2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.C2)) {
                canvas.concat(this.C2);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof og.a) && (X != this.E2 || this.D2)) {
                ((og.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.y2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.y2 = false;
            }
        }
    }

    public final void e1(fl0 fl0Var, int i10, boolean z4) {
        cc0 cc0Var = this.S1;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.S1 = null;
        }
        f2.l1 K = K(fl0Var.run());
        if (K == null) {
            if (z4) {
                this.R1 = fl0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c3 = K.c();
        this.u2 = c3;
        i1(c3, view);
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null) {
            Drawable current = zVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.U0 == null && this.T0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.A1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.z zVar2 = this.A1;
        if (zVar2 != null && zVar2.isStateful() && this.A1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.A1);
        }
        if (i10 > 0) {
            this.R1 = null;
            cc0 cc0Var2 = new cc0(this, 19);
            this.S1 = cc0Var2;
            AndroidUtilities.runOnUIThread(cc0Var2, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void f0(View view) {
        if (!(getAdapter() instanceof rl0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        f2.l1 G = G(view);
        if (G != null) {
            view.setEnabled(((rl0) getAdapter()).D(G));
            if (this.n2) {
                view.setAccessibilityDelegate(this.o2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.a6) {
                ((org.telegram.ui.ActionBar.a6) childAt).e();
            }
            childAt.invalidate();
        }
    }

    @Override // og.a
    public final void g(g.x xVar, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            xVar.b = true;
            return;
        }
        if (Z0() && getOverScrollMode() != 2) {
            xVar.b = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof og.a) && (X != this.E2 || this.D2)) {
                ((og.a) X).g(xVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                xVar.getClass();
                android.support.v4.media.session.y.a(xVar, childAt);
            }
        }
    }

    public final boolean g1(int i10) {
        if (this.H2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.H2.size(); i11++) {
                long longValue = ((Long) this.H2.get(i11)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i10 >= unpackA && i10 <= unpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    public View getEmptyView() {
        return this.Z0;
    }

    public bl0 getFastScroll() {
        return this.c1;
    }

    public ArrayList<View> getHeaders() {
        return this.m1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.n1;
    }

    public il0 getOnItemClickListener() {
        return this.S0;
    }

    public f2.z0 getOnScrollListener() {
        return this.X0;
    }

    public View getPinnedHeader() {
        return this.o1;
    }

    public View getPressedChildView() {
        return this.K1;
    }

    public Drawable getSelectorDrawable() {
        return this.A1;
    }

    public Rect getSelectorRect() {
        return this.D1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f10, float f11, boolean z4) {
        if (this.g1 || view == null) {
            return;
        }
        view.setPressed(z4);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i10, View view) {
        cc0 cc0Var = this.S1;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.S1 = null;
            this.R1 = null;
        }
        if (this.A1 == null) {
            return;
        }
        boolean z4 = i10 != this.B1;
        if (getAdapter() instanceof rl0) {
            ((rl0) getAdapter()).getClass();
        }
        if (i10 != -1) {
            this.B1 = i10;
        }
        this.C1 = view;
        if (this.z1 == 8) {
            org.telegram.ui.ActionBar.j6.A1(this.A1, this.X1, 0);
        } else if (this.Y1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.j6.A1(this.A1, i10 == 0 ? this.Y1 : 0, i10 == getAdapter().h() + (-2) ? this.Y1 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.D1;
        rect.set(left, top, right, bottom);
        boolean isEnabled = view.isEnabled();
        if (this.E1 != isEnabled) {
            this.E1 = isEnabled;
        }
        if (z4) {
            this.A1.setVisible(false, false);
            this.A1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(W0(i10));
        this.A1.setBounds(rect);
        if (z4 && getVisibility() == 0) {
            this.A1.setVisible(true, false);
        }
    }

    public final void j1() {
        int i10;
        cc0 cc0Var = this.S1;
        if (cc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(cc0Var);
            this.S1.run();
            this.S1 = null;
            this.C1 = null;
            return;
        }
        this.S1 = null;
        this.R1 = null;
        View view = this.C1;
        if (view != null && (i10 = this.u2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.A1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.A1);
            }
            this.C1 = null;
            this.u2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.A1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.A1;
        if (zVar3 != null && zVar3.isStateful() && this.A1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.A1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.D1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                i1(this.L1, view);
                org.telegram.ui.Cells.z zVar = this.A1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.A1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            v1();
        }
    }

    public final void l1(sl0 sl0Var, boolean z4) {
        ViewParent parent;
        if (sl0Var == null || (parent = sl0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z4);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z4);
    }

    public final void m1(int i10, boolean z4) {
        this.V1 = z4;
        this.W1 = i10;
    }

    public final void n1(ll0 ll0Var, long j10) {
        this.V0 = ll0Var;
        ja.c cVar = this.J1;
        boolean z4 = ll0Var != null;
        l20 l20Var = (l20) cVar.b;
        l20Var.t = z4;
        l20Var.u = j10;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.z2 = true;
        setPadding(i10, i11, i12, i13);
        this.z2 = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bl0 bl0Var = this.c1;
        if (bl0Var == null || bl0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.c1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.c1);
        }
        ((ViewGroup) getParent()).addView(this.c1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B1 = -1;
        this.C1 = null;
        this.D1.setEmpty();
        zk0 zk0Var = this.k2;
        if (zk0Var != null) {
            zk0Var.a();
        }
        if (this.s2) {
            this.s2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.N1) {
            l1(this, true);
        }
        if (this.Y0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i10 = org.telegram.ui.xn.Ec;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        bl0 bl0Var = this.c1;
        if (bl0Var != null) {
            this.G1 = true;
            int paddingTop = i11 + (bl0Var.a ? getPaddingTop() : bl0Var.e0);
            bl0 bl0Var2 = this.c1;
            if (bl0Var2.d0) {
                bl0Var2.layout(0, paddingTop, bl0Var2.getMeasuredWidth(), this.c1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.c1.getMeasuredWidth();
                bl0 bl0Var3 = this.c1;
                bl0Var3.layout(measuredWidth, paddingTop, bl0Var3.getMeasuredWidth() + measuredWidth, this.c1.getMeasuredHeight() + paddingTop);
            }
            this.G1 = false;
        }
        K0(false);
        fl0 fl0Var = this.R1;
        if (fl0Var != null) {
            e1(fl0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        bl0 bl0Var = this.c1;
        if (bl0Var != null && bl0Var.getLayoutParams() != null) {
            bl0 bl0Var2 = this.c1;
            int measuredHeight = (getMeasuredHeight() - (bl0Var2.a ? getPaddingTop() : bl0Var2.e0)) - getPaddingBottom();
            this.c1.getLayoutParams().height = measuredHeight;
            this.c1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.Z1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        dg.u2 u2Var = this.a1;
        if (u2Var != null) {
            u2Var.requestLayout();
        }
        int i14 = this.v1;
        if (i14 != 1) {
            if (i14 != 2 || this.d1 == null || (view = this.o1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.d1 == null || this.m1.isEmpty()) {
            return;
        }
        for (int i15 = 0; i15 < this.m1.size(); i15++) {
            T0((View) this.m1.get(i15), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        bl0 bl0Var = this.c1;
        if (bl0Var != null && bl0Var.n) {
            return false;
        }
        boolean z4 = this.a2;
        m2.b bVar = this.A2;
        if (!z4 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h2 = Float.MAX_VALUE;
            this.i2 = Float.MAX_VALUE;
            this.a2 = false;
            this.b2 = false;
            l1(this, false);
            this.f2 = false;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            return super.onTouchEvent(motionEvent);
        }
        if (this.h2 == Float.MAX_VALUE && this.i2 == Float.MAX_VALUE) {
            this.h2 = motionEvent.getX();
            this.i2 = motionEvent.getY();
        }
        if (!this.b2 && Math.abs(motionEvent.getY() - this.i2) > this.Z1) {
            this.b2 = true;
            l1(this, true);
        }
        if (this.b2) {
            L0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.mi miVar = this.e2;
            int[] iArr = this.j2;
            org.telegram.ui.xn xnVar = miVar.d;
            iArr[0] = (int) xnVar.p9;
            iArr[1] = xnVar.xa;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.j2[1] && (this.d2 >= this.c2 || !this.e2.a)) {
                this.g2 = false;
                if (!this.f2) {
                    this.f2 = true;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.j2[0] || (this.d2 > this.c2 && this.e2.a)) {
                this.f2 = false;
                AndroidUtilities.cancelRunOnUIThread(bVar);
            } else {
                this.g2 = true;
                if (!this.f2) {
                    this.f2 = true;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar);
                    return true;
                }
            }
        }
        return true;
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f10, boolean z4) {
        r1(new org.telegram.ui.wh(4), i10, f10, new fv(this, 15), z4);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f10, Utilities.Callback5 callback5, boolean z4) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i11 = 2;
        Pair pair = new Pair(new i(this, callbackReturn, sparseIntArray, i11), new ni(sparseIntArray, i11));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f10, callback5, z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.U1 || this.z2) {
            return;
        }
        super.requestLayout();
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f10, Utilities.Callback5 callback5, boolean z4) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j6, this.m2));
        this.F2 = callbackReturn2;
        this.I2 = f10;
        this.J2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.K2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.G2 = callback5;
        f2.u0 u0Var = this.E2;
        if (u0Var != null) {
            p0(u0Var);
        }
        gl0 gl0Var = new gl0(this, callbackReturn, i10, z4);
        this.E2 = gl0Var;
        i(gl0Var);
    }

    public void setAccessibilityEnabled(boolean z4) {
        this.n2 = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.o0 o0Var) {
        f2.o0 adapter = getAdapter();
        f2.d1 d1Var = this.q2;
        if (adapter != null) {
            adapter.a.unregisterObserver(d1Var);
        }
        ArrayList arrayList = this.m1;
        if (arrayList != null) {
            arrayList.clear();
            this.n1.clear();
        }
        this.p1 = -1;
        this.B1 = -1;
        this.C1 = null;
        this.D1.setEmpty();
        this.o1 = null;
        if (o0Var instanceof ol0) {
            this.d1 = (ol0) o0Var;
        } else {
            this.d1 = null;
        }
        super.setAdapter(o0Var);
        if (o0Var != null) {
            o0Var.B(d1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z4) {
        this.h1 = z4;
    }

    public void setAllowStopHeaveOperations(boolean z4) {
        this.u1 = z4;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z4) {
        this.D2 = z4;
    }

    public void setDisableHighlightState(boolean z4) {
        this.g1 = z4;
    }

    public void setDisallowInterceptTouchEvents(boolean z4) {
        this.N1 = z4;
    }

    public void setDrawSelection(boolean z4) {
        this.R0 = z4;
    }

    public void setDrawSelectorBehind(boolean z4) {
        this.y1 = z4;
    }

    public void setEmptyView(View view) {
        View view2 = this.Z0;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.Z0 = view;
        if (this.V1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.f1) {
            this.x2 = -1;
            J0(false);
            return;
        }
        View view3 = this.Z0;
        if (view3 != null) {
            this.x2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.c1 = new bl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.c1);
        }
    }

    public void setFastScrollVisible(boolean z4) {
        bl0 bl0Var = this.c1;
        if (bl0Var == null) {
            return;
        }
        bl0Var.setVisibility(z4 ? 0 : 8);
        this.c1.U = z4;
    }

    public void setHideIfEmpty(boolean z4) {
        this.x1 = z4;
    }

    public void setInstantClick(boolean z4) {
        this.O1 = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(f2.t0 t0Var) {
        super.setItemAnimator(t0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.t2 = genericProvider;
    }

    public void setItemsEnterAnimator(zk0 zk0Var) {
        this.k2 = zk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        org.telegram.ui.Cells.z zVar = this.A1;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.j6.v0(b1() ? org.telegram.ui.ActionBar.j6.j6 : org.telegram.ui.ActionBar.j6.i6, this.m2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.j6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(hl0 hl0Var) {
        this.Y0 = hl0Var;
    }

    public void setOnItemClickListener(il0 il0Var) {
        this.S0 = il0Var;
    }

    public void setOnItemLongClickListener(kl0 kl0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.U0 = kl0Var;
        ja.c cVar = this.J1;
        boolean z4 = kl0Var != null;
        l20 l20Var = (l20) cVar.b;
        l20Var.t = z4;
        l20Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(f2.z0 z0Var) {
        this.X0 = z0Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.i1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i10) {
        this.t1 = i10;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z4) {
        this.p2 = z4;
    }

    public void setScrollEnabled(boolean z4) {
        this.Q1 = z4;
    }

    public void setSections(boolean z4) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z4);
    }

    public void setSectionsType(int i10) {
        this.v1 = i10;
        if (i10 == 1 || i10 == 3) {
            this.m1 = new ArrayList();
            this.n1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.z1;
        if (i11 == 8) {
            this.A1 = org.telegram.ui.ActionBar.j6.Y(i10, this.X1, 0);
        } else if (i11 == 9) {
            this.A1 = null;
        } else {
            int i12 = this.Y1;
            if (i12 > 0) {
                this.A1 = org.telegram.ui.ActionBar.j6.Y(i10, i12, i12);
            } else {
                int i13 = this.X1;
                if (i13 > 0 && i11 != 1) {
                    this.A1 = org.telegram.ui.ActionBar.j6.i0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.A1 = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
                } else {
                    this.A1 = org.telegram.ui.ActionBar.j6.f0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.A1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i10) {
        this.X1 = i10;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.l2 = aVar;
    }

    public void setSelectorType(int i10) {
        this.z1 = i10;
    }

    public void setSkipDrawSection(boolean z4) {
        this.w1 = z4;
    }

    public void setTopBottomSelectorRadius(int i10) {
        this.Y1 = i10;
    }

    public void setTranslateSelector(boolean z4) {
        this.F1 = z4 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i10) {
        if (i10 <= 0) {
            i10 = -1;
        }
        this.F1 = i10;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        bl0 bl0Var = this.c1;
        if (bl0Var != null) {
            bl0Var.setTranslationY(f10);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z4) {
        if (N2 != null) {
            super.setVerticalScrollBarEnabled(z4);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            this.T1 = false;
        }
    }

    public boolean u1() {
        return this.D;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (!this.W0) {
            return super.v(i10, i11, i12, iArr, iArr2);
        }
        ll0 ll0Var = this.V0;
        if (ll0Var != null) {
            ll0Var.p(i11);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        return true;
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.A1;
        if (zVar == null || !zVar.isStateful()) {
            return;
        }
        if (this.K1 != null) {
            if (this.A1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.A1);
            }
        } else if (this.S1 == null) {
            this.A1.setState(StateSet.NOTHING);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.A1 == drawable || super.verifyDrawable(drawable);
    }

    public sl0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.R0 = true;
        this.h1 = true;
        this.p1 = -1;
        this.q1 = -1;
        this.w1 = false;
        this.x1 = true;
        this.z1 = 2;
        this.D1 = new Rect();
        this.F1 = -1;
        this.Q1 = true;
        this.h2 = Float.MAX_VALUE;
        this.i2 = Float.MAX_VALUE;
        this.n2 = true;
        this.o2 = new fe(1);
        this.p2 = true;
        this.q2 = new f2.d1(this, 1);
        this.A2 = new m2.b(this, 28);
        this.M2 = new Path();
        this.m2 = f6Var;
        kt ktVar = new kt();
        this.B2 = ktVar;
        setEdgeEffectFactory(ktVar);
        setGlowColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, f6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 2, -1);
        this.A1 = f02;
        f02.setCallback(this);
        try {
            if (!O2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                N2 = iArr;
                if (iArr == null) {
                    N2 = new int[0];
                }
                O2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(N2);
            Method method = P2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new lb0(this, 3));
        this.B.add(new f2.y(this, context));
    }

    public void setOnItemClickListener(jl0 jl0Var) {
        this.T0 = jl0Var;
    }

    public void setOnItemLongClickListener(ll0 ll0Var) {
        n1(ll0Var, ViewConfiguration.getLongPressTimeout());
    }
}
