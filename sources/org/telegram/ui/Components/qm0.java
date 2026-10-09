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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class qm0 extends RecyclerView implements bh.a {
    public static int[] O2;
    public static boolean P2;
    public static final Method Q2;
    public static final Paint R2;
    public static final Paint S2;
    public static final Path T2;
    public static final float[] U2;
    public int A1;
    public boolean A2;
    public org.telegram.ui.Cells.z B1;
    public final org.telegram.ui.Cells.t6 B2;
    public int C1;
    public final eu C2;
    public View D1;
    public Matrix D2;
    public final Rect E1;
    public boolean E2;
    public boolean F1;
    public cm0 F2;
    public int G1;
    public Utilities.CallbackReturn G2;
    public boolean H1;
    public Utilities.Callback5 H2;
    public boolean I1;
    public ArrayList I2;
    public boolean J1;
    public float J2;
    public k2.g0 K1;
    public float[] K2;
    public View L1;
    public float[] L2;
    public int M1;
    public ArrayList M2;
    public boolean N1;
    public final Path N2;
    public boolean O1;
    public boolean P1;
    public jm0 Q1;
    public boolean R1;
    public boolean S0;
    public bm0 S1;
    public em0 T0;
    public bd0 T1;
    public fm0 U0;
    public boolean U1;
    public gm0 V0;
    public boolean V1;
    public hm0 W0;
    public boolean W1;
    public boolean X0;
    public int X1;
    public s4.t0 Y0;
    public int Y1;
    public dm0 Z0;
    public int Z1;
    public View a1;
    public int a2;
    public ai.f0 b1;
    public boolean b2;
    public im0 c1;
    public boolean c2;
    public xl0 d1;
    public int d2;
    public mm0 e1;
    public int e2;
    public boolean f1;
    public org.telegram.ui.bj f2;
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
    public vl0 l2;
    public long m1;
    public q0.a m2;
    public ArrayList n1;
    public final org.telegram.ui.ActionBar.e6 n2;
    public ArrayList o1;
    public boolean o2;
    public View p1;
    public final se p2;
    public int q1;
    public boolean q2;
    public int r1;
    public final gg.o1 r2;
    public int s1;
    public Paint s2;
    public int t1;
    public boolean t2;
    public int u1;
    public GenericProvider u2;
    public boolean v1;
    public int v2;
    public int w1;
    public int w2;
    public boolean x1;
    public boolean x2;
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
        Q2 = method;
        R2 = new Paint(1);
        S2 = new Paint(1);
        T2 = new Path();
        U2 = new float[8];
    }

    public qm0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    public static void O0(Canvas canvas, RectF rectF, float f7, float f10, float f11, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = R2;
        Paint paint2 = S2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.i6.m1(f11, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.i6.m1(f11, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.i6.m1(f11, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
        if (f7 == f10) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f7, f7, paint2);
            }
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        Path path = T2;
        path.rewind();
        float[] fArr = U2;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
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

    public static float u1(View view) {
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
        this.C2.b.add(new bu(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.b1 == null) {
            this.b1 = new ai.f0(this, getContext(), 16);
        }
        this.b1.addView(clippingImageView, layoutParams);
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
        im0 im0Var = this.c1;
        if (im0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(im0Var);
            this.c1 = null;
        }
        View view = this.L1;
        if (view != null) {
            if (z10) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.L1 = null;
            k1(null, view);
        }
        this.E1.setEmpty();
        jm0 jm0Var = this.Q1;
        if (jm0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jm0Var);
            this.Q1 = null;
        }
        this.N1 = false;
    }

    public void J0(Canvas canvas, RectF rectF, long j3) {
        int itemDecorationCount = getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            Object X = X(i10);
            if ((X instanceof bh.a) && (X != this.F2 || this.E2)) {
                ((bh.a) X).f(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                this.z2 = true;
                drawChild(canvas, childAt, j3);
                this.z2 = false;
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
            this.y2 = i10;
            this.a1.setVisibility(i10);
            this.a1.setAlpha(1.0f);
        } else if (this.y2 != i10) {
            this.y2 = i10;
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
                alpha.setDuration(150L).setListener(new vd0(this, 8)).start();
            }
        }
        if (this.y1) {
            int i11 = S0 ? 4 : 0;
            if (getVisibility() != i11) {
                setVisibility(i11);
            }
            this.U1 = true;
        }
    }

    public final void L0(boolean z10) {
        xl0 xl0Var;
        s4.d1 T;
        xl0 xl0Var2;
        View view;
        s4.d1 T3;
        int b10;
        int S;
        if (((this.I1 || z10) && this.d1 != null) || !(this.w1 == 0 || this.e1 == null)) {
            s4.p0 layoutManager = getLayoutManager();
            if (layoutManager instanceof s4.d0) {
                s4.d0 d0Var = (s4.d0) layoutManager;
                if (d0Var.o == 1) {
                    if (this.e1 == null) {
                        int L0 = d0Var.L0();
                        Math.abs(d0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.I1 && !z10) || (xl0Var = this.d1) == null || xl0Var.n) {
                            return;
                        }
                        s4.i0 adapter = getAdapter();
                        if (adapter instanceof yl0) {
                            yl0 yl0Var = (yl0) adapter;
                            float H = yl0Var.H(this);
                            this.d1.setIsVisible(yl0Var.E(this));
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
                            if (view3 == null || (T3 = T(view3)) == null || (S = this.e1.S((b10 = T3.b()))) < 0) {
                                return;
                            }
                            if (this.q1 != S || this.p1 == null) {
                                View view4 = this.p1;
                                boolean z11 = view4 == null;
                                View T4 = this.e1.T(S, view4);
                                if (z11) {
                                    T0(T4, false);
                                }
                                this.p1 = T4;
                                T4.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
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
                    int abs = Math.abs(d0Var.N0() - b11) + 1;
                    if ((this.I1 || z10) && (xl0Var2 = this.d1) != null && !xl0Var2.n && (getAdapter() instanceof yl0)) {
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
                        int S3 = this.e1.S(b11);
                        this.s1 = S3;
                        int M2 = (this.e1.M(S3) + b11) - this.e1.Q(b11);
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
                            View T5 = this.e1.T(i21, view);
                            if (z12) {
                                T0(T5, false);
                            }
                            this.n1.add(T5);
                            int M3 = this.e1.M(i21);
                            if (i21 == this.s1) {
                                int Q3 = this.e1.Q(i20);
                                if (Q3 == M3 - 1) {
                                    T5.setTag(Integer.valueOf((-T5.getHeight()) + paddingTop));
                                } else if (Q3 == M3 - 2) {
                                    View childAt3 = getChildAt(i20 - b11);
                                    T5.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    T5.setTag(0);
                                }
                                i20 = (M3 - this.e1.Q(b11)) + i20;
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

    public final void M0(float f7, float f10) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.k2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f10, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f7, 0.0f));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            org.telegram.ui.bj bjVar = this.f2;
            int[] iArr2 = this.k2;
            org.telegram.ui.zn znVar = bjVar.d;
            iArr2[0] = (int) znVar.s9;
            iArr2[1] = znVar.Ba;
            View childAt = getChildAt(i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i11 = this.e2;
                if (i11 != S) {
                    int i12 = this.d2;
                    boolean z10 = i11 > i12 || S > i12;
                    org.telegram.ui.zn znVar2 = this.f2.d;
                    org.telegram.ui.mm mmVar = znVar2.A0;
                    ArrayList arrayList = znVar2.u6;
                    int i13 = S - mmVar.J;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) znVar2.x6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            S = arrayList.indexOf(arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + znVar2.A0.J;
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
        boolean z10;
        boolean z11;
        if (view != null && t1(view) && ((Boolean) this.F2.a.run(view)).booleanValue()) {
            int R = RecyclerView.R(view);
            if (R == -1) {
                z11 = false;
                z10 = false;
            } else {
                View U0 = U0(R - 1);
                View U02 = U0(R + 1);
                z10 = U0 != null && ((Boolean) this.F2.a.run(U0)).booleanValue();
                z11 = U02 != null && ((Boolean) this.F2.a.run(U02)).booleanValue();
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), Math.max(-this.J2, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.J2), G0(view)));
            if (z10 && z11) {
                z10 = u1(view) >= rectF.top;
                boolean z12 = G0(view) <= rectF.bottom;
                if (z10 && z12) {
                    return;
                } else {
                    z11 = z12;
                }
            }
            Path path = this.N2;
            if (!z10 && !z11) {
                path.rewind();
                float f7 = this.J2;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                return;
            }
            if (!z10) {
                path.rewind();
                path.addRoundRect(rectF, this.K2, Path.Direction.CW);
                canvas.clipPath(path);
            } else {
                if (z11) {
                    return;
                }
                path.rewind();
                path.addRoundRect(rectF, this.L2, Path.Direction.CW);
                canvas.clipPath(path);
            }
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof m90 ? ((m90) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(-this.J2, u1(view) - (z10 ? this.J2 : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.J2), (G0(view2) + (z11 ? this.J2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.H2.run(canvas, rectF, Float.valueOf(this.J2), Float.valueOf(this.J2), Float.valueOf(view.getAlpha()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
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
        if (this.H2 == null) {
            return;
        }
        s4.n0 n0Var = this.c0;
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (n0Var == null || !n0Var.k()) {
            f7 = 1.0f;
            i10 = 0;
            int i12 = -1;
            int i13 = -1;
            View view2 = null;
            View view3 = null;
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt == this.a1 || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.0f || !((Boolean) this.F2.a.run(childAt)).booleanValue() || g1(RecyclerView.R(childAt))) {
                    P0(canvas, view2, view3, Y0(i12, view2), a1(i13, view3));
                    i12 = -1;
                    i13 = -1;
                    view2 = null;
                    view3 = null;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i12, view2), a1(i13, view3));
                        i12 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i12 = i14;
                        view2 = childAt;
                    }
                    i13 = i14;
                    view3 = childAt;
                }
            }
            P0(canvas, view2, view3, Y0(i12, view2), a1(i13, view3));
        } else {
            if (this.M2 == null) {
                this.M2 = new ArrayList();
            }
            int i15 = 0;
            while (true) {
                z10 = true;
                if (i15 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (childAt2 != this.a1 && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && ((Boolean) this.F2.a.run(childAt2)).booleanValue()) {
                    float u12 = u1(childAt2);
                    float G0 = G0(childAt2);
                    s4.d1 T = T(childAt2);
                    if (!T.j() || childAt2.getAlpha() >= 1.0f) {
                        if (g1(T.b())) {
                        }
                        ArrayList arrayList = this.M2;
                        float alpha = childAt2.getAlpha();
                        nm0 nm0Var = new nm0();
                        nm0Var.a = u12;
                        nm0Var.b = G0;
                        nm0Var.c = alpha;
                        arrayList.add(nm0Var);
                    } else {
                        if (T.j() && (i11 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i11 / 1000.0d)) + 1;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i16);
                                if (view != null && view != childAt2 && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                            if (view != null && G0 > view.getY() && ((Boolean) this.F2.a.run(view)).booleanValue() && !T(view).j()) {
                                u12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < u12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.M2;
                        float alpha2 = childAt2.getAlpha();
                        nm0 nm0Var2 = new nm0();
                        nm0Var2.a = u12;
                        nm0Var2.b = G0;
                        nm0Var2.c = alpha2;
                        arrayList2.add(nm0Var2);
                    }
                }
                i15++;
            }
            ArrayList arrayList3 = this.M2;
            float f14 = this.J2;
            ArrayList arrayList4 = om0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f7 = 1.0f;
                i10 = 0;
            } else {
                Collections.sort(arrayList3, new org.telegram.ui.gf(13));
                arrayList4.clear();
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    float f15 = ((nm0) arrayList3.get(i17)).b;
                    int i18 = i17 + 1;
                    while (i18 < arrayList3.size() && ((nm0) arrayList3.get(i18)).a <= f15 + 1.5f) {
                        f15 = Math.max(f15, ((nm0) arrayList3.get(i18)).b);
                        i18++;
                    }
                    float f16 = Float.MAX_VALUE;
                    float f17 = Float.MIN_VALUE;
                    boolean z11 = z10;
                    float f18 = f12;
                    float f19 = f13;
                    float f20 = Float.MAX_VALUE;
                    float f21 = Float.MIN_VALUE;
                    for (int i19 = i17; i19 < i18; i19++) {
                        nm0 nm0Var3 = (nm0) arrayList3.get(i19);
                        if (nm0Var3.c >= 0.99f) {
                            f20 = Math.min(f20, nm0Var3.a);
                            f21 = Math.max(f21, nm0Var3.b);
                        }
                    }
                    Object[] objArr = f20 != Float.MAX_VALUE ? z11 ? 1 : 0 : false;
                    float f22 = f18;
                    for (int i20 = i17; i20 < i18; i20++) {
                        nm0 nm0Var4 = (nm0) arrayList3.get(i20);
                        f16 = Math.min(f16, nm0Var4.a);
                        f17 = Math.max(f17, nm0Var4.b);
                        f22 = Math.max(f22, nm0Var4.c);
                    }
                    if (f22 >= 0.001f) {
                        if (objArr == true) {
                            float f23 = f18;
                            nm0 nm0Var5 = null;
                            for (int i21 = i17; i21 < i18; i21++) {
                                nm0 nm0Var6 = (nm0) arrayList3.get(i21);
                                float f24 = nm0Var6.c;
                                if (f24 < 0.99f) {
                                    float f25 = nm0Var6.a;
                                    if (f25 < f20) {
                                        float f26 = (f20 - f25) * f24;
                                        if (f26 > f23) {
                                            nm0Var5 = nm0Var6;
                                            f23 = f26;
                                        }
                                    }
                                }
                            }
                            float f27 = f18;
                            nm0 nm0Var7 = null;
                            while (i17 < i18) {
                                nm0 nm0Var8 = (nm0) arrayList3.get(i17);
                                float f28 = nm0Var8.c;
                                if (f28 < 0.99f) {
                                    float f29 = nm0Var8.b;
                                    if (f29 > f21) {
                                        float f30 = (f29 - f21) * f28;
                                        if (f30 > f27) {
                                            nm0Var7 = nm0Var8;
                                            f27 = f30;
                                        }
                                    }
                                }
                                i17++;
                            }
                            if (nm0Var5 != null) {
                                float f31 = nm0Var5.a;
                                float f32 = nm0Var5.c;
                                if (f32 > 0.001f) {
                                    float lerp = AndroidUtilities.lerp(f20, f31, f32);
                                    f10 = AndroidUtilities.lerp(f14, f32 * f14, (f20 - lerp) / ((f20 - f31) + 0.001f));
                                    f20 = lerp;
                                    if (nm0Var7 != null) {
                                        float f33 = nm0Var7.b;
                                        float f34 = nm0Var7.c;
                                        if (f34 > 0.001f) {
                                            float lerp2 = AndroidUtilities.lerp(f21, f33, f34);
                                            f11 = AndroidUtilities.lerp(f14, f34 * f14, (lerp2 - f21) / ((f33 - f21) + 0.001f));
                                            f21 = lerp2;
                                            f22 = f19;
                                            f16 = f20;
                                        }
                                    }
                                    f11 = f14;
                                    f16 = f20;
                                    f22 = f19;
                                }
                            }
                            f10 = f14;
                            if (nm0Var7 != null) {
                            }
                            f11 = f14;
                            f16 = f20;
                            f22 = f19;
                        } else {
                            f11 = f14;
                            f10 = f11;
                            f21 = f17;
                        }
                        if (f21 > f16) {
                            fArr = new float[5];
                            fArr[0] = f16;
                            fArr[z11 ? 1 : 0] = f21;
                            fArr[2] = f10;
                            fArr[3] = f11;
                            fArr[4] = f22;
                            if (fArr == null) {
                                arrayList4.add(fArr);
                            }
                            i17 = i18;
                            z10 = z11 ? 1 : 0;
                            f12 = f18;
                            f13 = f19;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i17 = i18;
                    z10 = z11 ? 1 : 0;
                    f12 = f18;
                    f13 = f19;
                }
                boolean z12 = z10;
                f7 = f13;
                i10 = 0;
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    float[] fArr2 = (float[]) arrayList4.get(i22);
                    float f35 = fArr2[0];
                    float f36 = fArr2[z12 ? 1 : 0];
                    float f37 = fArr2[2];
                    float f38 = fArr2[3];
                    float f39 = fArr2[4];
                    if (i22 > 0) {
                        float f40 = f35 - ((float[]) arrayList4.get(i22 - 1))[z12 ? 1 : 0];
                        float f41 = f14 * 0.2f;
                        if (f40 < f41) {
                            f37 = Math.min(f37, (f40 / f41) * f14);
                        }
                    }
                    if (i22 < arrayList4.size() - 1) {
                        float f42 = ((float[]) arrayList4.get(i22 + 1))[0] - f36;
                        float f43 = 0.2f * f14;
                        if (f42 < f43) {
                            f38 = Math.min(f38, (f42 / f43) * f14);
                        }
                    }
                    Float valueOf = Float.valueOf(f37);
                    Float valueOf2 = Float.valueOf(f38);
                    Float valueOf3 = Float.valueOf(f39);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.F2.c, f35, (getWidth() - this.F2.c) - getPaddingRight(), f36);
                    this.H2.run(canvas, rectF, valueOf, valueOf2, valueOf3);
                }
            }
            this.M2.clear();
        }
        if (this.I2 != null) {
            for (int i23 = i10; i23 < this.I2.size(); i23++) {
                long longValue = ((Long) this.I2.get(i23)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float height = getHeight();
                float f44 = this.J2;
                float f45 = height + f44;
                float f46 = -f44;
                for (int i24 = i10; i24 < getChildCount(); i24++) {
                    View childAt3 = getChildAt(i24);
                    int R = RecyclerView.R(childAt3);
                    if (R >= unpackA && R <= unpackB) {
                        f45 = Math.min(f45, u1(childAt3));
                        f46 = Math.max(f46, G0(childAt3));
                    }
                }
                if (f45 < f46) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.F2.c, f45, (getWidth() - getPaddingRight()) - this.F2.c, f46);
                    this.H2.run(canvas, rectF2, Float.valueOf(this.J2), Float.valueOf(this.J2), Float.valueOf(f7));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.E1;
        if (rect.isEmpty() || (zVar = this.B1) == null) {
            return;
        }
        int i10 = this.G1;
        if ((i10 == -2 || i10 == this.C1) && this.D1 != null) {
            if (getAdapter() instanceof pm0) {
                ((pm0) getAdapter()).getClass();
            }
            this.B1.setBounds(this.D1.getLeft(), this.D1.getTop(), this.D1.getRight(), this.D1.getBottom());
        } else {
            zVar.setBounds(rect);
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
        if (b1()) {
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
        if (view.getParent() != this || !b1() || !((Boolean) this.F2.a.run(view)).booleanValue()) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z12 = false;
            z11 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z11 = U0 != null && ((Boolean) this.F2.a.run(U0)).booleanValue();
            z12 = U02 != null && ((Boolean) this.F2.a.run(U02)).booleanValue();
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, u1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z11 && z12 && !z10) {
            z11 = u1(view) >= rectF.top;
            boolean z13 = G0(view) <= rectF.bottom;
            if (z11 && z13) {
                return org.telegram.ui.ActionBar.i6.c0(0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, this.n2));
            }
            z12 = z13;
        }
        Path path = new Path();
        if ((!z11 && !z12) || z10) {
            path.rewind();
            float f7 = this.J2;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.K2, Path.Direction.CW);
        } else if (!z12) {
            path.rewind();
            path.addRoundRect(rectF, this.L2, Path.Direction.CW);
        }
        return new wl0(this, view, path, rectF);
    }

    public Integer W0(int i10) {
        GenericProvider genericProvider = this.u2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i10));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.n2;
        Paint F = e6Var != null ? e6Var.F(str) : null;
        return F != null ? F : org.telegram.ui.ActionBar.i6.T0(str);
    }

    public final boolean Y0(int i10, View view) {
        int R;
        if (view == null || i10 > 0 || getAdapter() == null || this.G2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.G2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (du duVar : this.C2.a) {
            if (duVar != null && duVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i10, View view) {
        int R;
        if (view == null || i10 < getChildCount() - 1 || getAdapter() == null || this.G2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.G2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
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
            if ((X instanceof bh.a) && (X != this.F2 || this.E2)) {
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
                ah.e.a(aVar, childAt);
            }
        }
    }

    public final boolean b1() {
        return this.F2 != null;
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
            h1(view, 0.0f, 0.0f, false);
            this.L1 = null;
            if (z10) {
                k1(null, view);
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
        vl0 vl0Var = this.l2;
        if (vl0Var != null) {
            qm0 qm0Var = vl0Var.a;
            if (vl0Var.d || vl0Var.e) {
                for (int i10 = 0; i10 < qm0Var.getChildCount(); i10++) {
                    View childAt = qm0Var.getChildAt(i10);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !vl0Var.c.contains(childAt)) {
                        Float f7 = (Float) vl0Var.b.get(R, null);
                        if (f7 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f7.floatValue());
                        }
                    }
                }
                vl0Var.d = false;
            }
        }
        if (this.S0 && this.z1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.S0 && !this.z1) {
            R0(canvas);
        }
        ai.f0 f0Var = this.b1;
        if (f0Var != null) {
            f0Var.draw(canvas);
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
            if (this.w2 == 0 && this.x2) {
                setOverScrollMode(0);
            }
            this.w2++;
        } else if (action == 1 || action == 3) {
            int i10 = this.w2 - 1;
            this.w2 = i10;
            if (i10 == 0 && this.x2) {
                setOverScrollMode(2);
            }
        }
        xl0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.a0 || !fastScroll.k0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.e1 == null || (view = this.p1) == null || view.getAlpha() == 0.0f || !this.p1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (!b1() || this.z2) {
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
        w1();
    }

    public final void e1(bm0 bm0Var, int i10, boolean z10) {
        bd0 bd0Var = this.T1;
        if (bd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bd0Var);
            this.T1 = null;
        }
        s4.d1 K = K(bm0Var.run());
        if (K == null) {
            if (z10) {
                this.S1 = bm0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c10 = K.c();
        this.v2 = c10;
        i1(c10, view);
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null) {
            Drawable current = zVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.V0 == null && this.U0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.B1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.z zVar2 = this.B1;
        if (zVar2 != null && zVar2.isStateful() && this.B1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.B1);
        }
        if (i10 > 0) {
            this.S1 = null;
            bd0 bd0Var2 = new bd0(this, 19);
            this.T1 = bd0Var2;
            AndroidUtilities.runOnUIThread(bd0Var2, i10);
        }
    }

    public void f(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!Z0() || getOverScrollMode() == 2) {
            J0(canvas, rectF, uptimeMillis);
            return;
        }
        if (this.D2 == null) {
            this.D2 = new Matrix();
        }
        canvas.save();
        if (getMatrix().invert(this.D2)) {
            canvas.concat(this.D2);
        }
        canvas.translate(-getX(), -getY());
        try {
            super.drawChild(canvas, this, uptimeMillis);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void f0(View view) {
        if (!(getAdapter() instanceof pm0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        s4.d1 G = G(view);
        if (G != null) {
            view.setEnabled(((pm0) getAdapter()).D(G));
            if (this.o2) {
                view.setAccessibilityDelegate(this.p2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f1() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.ActionBar.z5) {
                ((org.telegram.ui.ActionBar.z5) childAt).e();
            }
            childAt.invalidate();
        }
    }

    public final boolean g1(int i10) {
        if (this.I2 != null && i10 >= 0) {
            for (int i11 = 0; i11 < this.I2.size(); i11++) {
                long longValue = ((Long) this.I2.get(i11)).longValue();
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
        return this.a1;
    }

    public xl0 getFastScroll() {
        return this.d1;
    }

    public ArrayList<View> getHeaders() {
        return this.n1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.o1;
    }

    public em0 getOnItemClickListener() {
        return this.T0;
    }

    public s4.t0 getOnScrollListener() {
        return this.Y0;
    }

    public View getPinnedHeader() {
        return this.p1;
    }

    public View getPressedChildView() {
        return this.L1;
    }

    public Drawable getSelectorDrawable() {
        return this.B1;
    }

    public Rect getSelectorRect() {
        return this.E1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f7, float f10, boolean z10) {
        if (this.h1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i10, View view) {
        bd0 bd0Var = this.T1;
        if (bd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bd0Var);
            this.T1 = null;
            this.S1 = null;
        }
        if (this.B1 == null) {
            return;
        }
        boolean z10 = i10 != this.C1;
        if (getAdapter() instanceof pm0) {
            ((pm0) getAdapter()).getClass();
        }
        if (i10 != -1) {
            this.C1 = i10;
        }
        this.D1 = view;
        if (this.A1 == 8) {
            org.telegram.ui.ActionBar.i6.B1(this.B1, this.Y1, 0);
        } else if (this.Z1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.i6.B1(this.B1, i10 == 0 ? this.Z1 : 0, i10 == getAdapter().h() + (-2) ? this.Z1 : 0);
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

    public final void j1() {
        int i10;
        bd0 bd0Var = this.T1;
        if (bd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bd0Var);
            this.T1.run();
            this.T1 = null;
            this.D1 = null;
            return;
        }
        this.T1 = null;
        this.S1 = null;
        View view = this.D1;
        if (view != null && (i10 = this.v2) != -1) {
            i1(i10, view);
            org.telegram.ui.Cells.z zVar = this.B1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.B1);
            }
            this.D1 = null;
            this.v2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.B1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.B1;
        if (zVar3 != null && zVar3.isStateful() && this.B1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.B1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.E1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                i1(this.M1, view);
                org.telegram.ui.Cells.z zVar = this.B1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
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
            w1();
        }
    }

    public final void l1(qm0 qm0Var, boolean z10) {
        ViewParent parent;
        if (qm0Var == null || (parent = qm0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    public final void m1(int i10, boolean z10) {
        this.W1 = z10;
        this.X1 = i10;
    }

    public final void n1(hm0 hm0Var, long j3) {
        this.W0 = hm0Var;
        k2.g0 g0Var = this.K1;
        boolean z10 = hm0Var != null;
        b30 b30Var = (b30) g0Var.b;
        b30Var.t = z10;
        b30Var.u = j3;
    }

    public final void o1(int i10, int i11, int i12, int i13) {
        if (getPaddingLeft() == i10 && getPaddingTop() == i11 && getPaddingRight() == i12 && getPaddingBottom() == i13) {
            return;
        }
        this.A2 = true;
        setPadding(i10, i11, i12, i13);
        this.A2 = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xl0 xl0Var = this.d1;
        if (xl0Var == null || xl0Var.getParent() == getParent()) {
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
        vl0 vl0Var = this.l2;
        if (vl0Var != null) {
            vl0Var.a();
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
            l1(this, true);
        }
        if (this.Z0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i10 = org.telegram.ui.zn.Hc;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        xl0 xl0Var = this.d1;
        if (xl0Var != null) {
            this.H1 = true;
            int paddingTop = i11 + (xl0Var.a ? getPaddingTop() : xl0Var.h0);
            xl0 xl0Var2 = this.d1;
            if (xl0Var2.g0) {
                xl0Var2.layout(0, paddingTop, xl0Var2.getMeasuredWidth(), this.d1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.d1.getMeasuredWidth();
                xl0 xl0Var3 = this.d1;
                xl0Var3.layout(measuredWidth, paddingTop, xl0Var3.getMeasuredWidth() + measuredWidth, this.d1.getMeasuredHeight() + paddingTop);
            }
            this.H1 = false;
        }
        L0(false);
        bm0 bm0Var = this.S1;
        if (bm0Var != null) {
            e1(bm0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xl0 xl0Var = this.d1;
        if (xl0Var != null && xl0Var.getLayoutParams() != null) {
            xl0 xl0Var2 = this.d1;
            int measuredHeight = (getMeasuredHeight() - (xl0Var2.a ? getPaddingTop() : xl0Var2.h0)) - getPaddingBottom();
            this.d1.getLayoutParams().height = measuredHeight;
            this.d1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.a2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        View view;
        super.onSizeChanged(i10, i11, i12, i13);
        ai.f0 f0Var = this.b1;
        if (f0Var != null) {
            f0Var.requestLayout();
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
        xl0 xl0Var = this.d1;
        if (xl0Var != null && xl0Var.n) {
            return false;
        }
        boolean z10 = this.b2;
        org.telegram.ui.Cells.t6 t6Var = this.B2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.i2 = Float.MAX_VALUE;
            this.j2 = Float.MAX_VALUE;
            this.b2 = false;
            this.c2 = false;
            l1(this, false);
            this.g2 = false;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.i2 == Float.MAX_VALUE && this.j2 == Float.MAX_VALUE) {
            this.i2 = motionEvent.getX();
            this.j2 = motionEvent.getY();
        }
        if (!this.c2 && Math.abs(motionEvent.getY() - this.j2) > this.a2) {
            this.c2 = true;
            l1(this, true);
        }
        if (this.c2) {
            M0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.bj bjVar = this.f2;
            int[] iArr = this.k2;
            org.telegram.ui.zn znVar = bjVar.d;
            iArr[0] = (int) znVar.s9;
            iArr[1] = znVar.Ba;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.k2[1] && (this.e2 >= this.d2 || !this.f2.a)) {
                this.h2 = false;
                if (!this.g2) {
                    this.g2 = true;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.k2[0] || (this.e2 > this.d2 && this.f2.a)) {
                this.g2 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
            } else {
                this.h2 = true;
                if (!this.g2) {
                    this.g2 = true;
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var);
                    return true;
                }
            }
        }
        return true;
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i10, float f7, boolean z10) {
        r1(new ei.c(5), i10, f7, new bw(this, 16), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new ci.n5(this, callbackReturn, sparseIntArray, 3), new aj(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i10, f7, callback5, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.V1 || this.A2) {
            return;
        }
        super.requestLayout();
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j6, this.n2));
        this.G2 = callbackReturn2;
        this.J2 = f7;
        this.K2 = new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        this.L2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
        this.H2 = callback5;
        s4.o0 o0Var = this.F2;
        if (o0Var != null) {
            p0(o0Var);
        }
        cm0 cm0Var = new cm0(this, callbackReturn, i10, z10);
        this.F2 = cm0Var;
        i(cm0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.o2 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.i0 i0Var) {
        s4.i0 adapter = getAdapter();
        gg.o1 o1Var = this.r2;
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
        if (i0Var instanceof mm0) {
            this.e1 = (mm0) i0Var;
        } else {
            this.e1 = null;
        }
        super.setAdapter(i0Var);
        if (i0Var != null) {
            i0Var.B(o1Var);
        }
        K0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.i1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.v1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.E2 = z10;
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
            this.y2 = -1;
            K0(false);
            return;
        }
        View view3 = this.a1;
        if (view3 != null) {
            this.y2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i10) {
        this.d1 = new xl0(this, getContext(), i10);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.d1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        xl0 xl0Var = this.d1;
        if (xl0Var == null) {
            return;
        }
        xl0Var.setVisibility(z10 ? 0 : 8);
        this.d1.a0 = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.y1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.P1 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(s4.n0 n0Var) {
        super.setItemAnimator(n0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.u2 = genericProvider;
    }

    public void setItemsEnterAnimator(vl0 vl0Var) {
        this.l2 = vl0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        org.telegram.ui.Cells.z zVar = this.B1;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.i6.w0(b1() ? org.telegram.ui.ActionBar.i6.j6 : org.telegram.ui.ActionBar.i6.i6, this.n2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.i6.C1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(dm0 dm0Var) {
        this.Z0 = dm0Var;
    }

    public void setOnItemClickListener(em0 em0Var) {
        this.T0 = em0Var;
    }

    public void setOnItemLongClickListener(gm0 gm0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.V0 = gm0Var;
        k2.g0 g0Var = this.K1;
        boolean z10 = gm0Var != null;
        b30 b30Var = (b30) g0Var.b;
        b30Var.t = z10;
        b30Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(s4.t0 t0Var) {
        this.Y0 = t0Var;
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
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i10) {
        this.w1 = i10;
        if (i10 == 1 || i10 == 3) {
            this.n1 = new ArrayList();
            this.o1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i10) {
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i11 = this.A1;
        if (i11 == 8) {
            this.B1 = org.telegram.ui.ActionBar.i6.Z(i10, this.Y1, 0);
        } else if (i11 == 9) {
            this.B1 = null;
        } else {
            int i12 = this.Z1;
            if (i12 > 0) {
                this.B1 = org.telegram.ui.ActionBar.i6.Z(i10, i12, i12);
            } else {
                int i13 = this.Y1;
                if (i13 > 0 && i11 != 1) {
                    this.B1 = org.telegram.ui.ActionBar.i6.j0(i13, i13, i13, i13, 0, i10, -16777216);
                } else if (i11 == 2) {
                    this.B1 = org.telegram.ui.ActionBar.i6.g0(i10, 2, -1);
                } else {
                    this.B1 = org.telegram.ui.ActionBar.i6.g0(i10, i11, i13);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.B1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
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
        xl0 xl0Var = this.d1;
        if (xl0Var != null) {
            xl0Var.setTranslationY(f7);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (O2 != null) {
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

    public boolean t1(View view) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if (!this.X0) {
            return super.v(i10, i11, i12, iArr, iArr2);
        }
        hm0 hm0Var = this.W0;
        if (hm0Var != null) {
            hm0Var.q(i11);
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
        return this.B1 == drawable || super.verifyDrawable(drawable);
    }

    public final void w1() {
        org.telegram.ui.Cells.z zVar = this.B1;
        if (zVar == null || !zVar.isStateful()) {
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

    public qm0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.S0 = true;
        this.i1 = true;
        this.q1 = -1;
        this.r1 = -1;
        this.x1 = false;
        this.y1 = true;
        int i10 = 2;
        this.A1 = 2;
        this.E1 = new Rect();
        this.G1 = -1;
        this.R1 = true;
        this.i2 = Float.MAX_VALUE;
        this.j2 = Float.MAX_VALUE;
        this.o2 = true;
        this.p2 = new se(1);
        this.q2 = true;
        this.r2 = new gg.o1(this, 1);
        this.B2 = new org.telegram.ui.Cells.t6(this, 19);
        this.N2 = new Path();
        this.n2 = e6Var;
        eu euVar = new eu();
        this.C2 = euVar;
        setEdgeEffectFactory(euVar);
        setGlowColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s8, e6Var));
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 2, -1);
        this.B1 = g02;
        g02.setCallback(this);
        try {
            if (!P2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                O2 = iArr;
                if (iArr == null) {
                    O2 = new int[0];
                }
                P2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(O2);
            Method method = Q2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        super.setOnScrollListener(new mh0(this, i10));
        this.E.add(new lm0(this, context));
    }

    public void setOnItemClickListener(fm0 fm0Var) {
        this.U0 = fm0Var;
    }

    public void setOnItemLongClickListener(hm0 hm0Var) {
        n1(hm0Var, ViewConfiguration.getLongPressTimeout());
    }
}
