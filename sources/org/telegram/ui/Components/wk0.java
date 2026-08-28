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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class wk0 extends RecyclerView implements jg.a {
    public static int[] M2;
    public static boolean N2;
    public static final Method O2;
    public static final Paint P2;
    public static final Paint Q2;
    public static final Path R2;
    public static final float[] S2;
    public int A1;
    public final at A2;
    public View B1;
    public Matrix B2;
    public final Rect C1;
    public boolean C2;
    public boolean D1;
    public kk0 D2;
    public int E1;
    public Utilities.CallbackReturn E2;
    public boolean F1;
    public Utilities.Callback5 F2;
    public boolean G1;
    public ArrayList G2;
    public boolean H1;
    public float H2;
    public n5.e0 I1;
    public float[] I2;
    public View J1;
    public float[] J2;
    public int K1;
    public ArrayList K2;
    public boolean L1;
    public final Path L2;
    public boolean M1;
    public boolean N1;
    public qk0 O1;
    public boolean P1;
    public boolean Q0;
    public jk0 Q1;
    public mk0 R0;
    public ib0 R1;
    public nk0 S0;
    public boolean S1;
    public ok0 T0;
    public boolean T1;
    public pk0 U0;
    public boolean U1;
    public boolean V0;
    public int V1;
    public f2.d1 W0;
    public int W1;
    public lk0 X0;
    public int X1;
    public View Y0;
    public int Y1;
    public fh.d2 Z0;
    public boolean Z1;
    public ag.d a1;
    public boolean a2;
    public fk0 b1;
    public int b2;
    public sk0 c1;
    public int c2;
    public boolean d1;
    public org.telegram.ui.ei d2;
    public boolean e1;
    public boolean e2;
    public boolean f1;
    public boolean f2;
    public boolean g1;
    public float g2;
    public Drawable h1;
    public float h2;
    public float i1;
    public int[] i2;
    public float j1;
    public dk0 j2;
    public long k1;
    public q0.a k2;
    public ArrayList l1;
    public final org.telegram.ui.ActionBar.b6 l2;
    public ArrayList m1;
    public boolean m2;
    public View n1;
    public final fe n2;
    public int o1;
    public boolean o2;
    public int p1;
    public final f2.i1 p2;
    public int q1;
    public Paint q2;
    public int r1;
    public boolean r2;
    public int s1;
    public GenericProvider s2;
    public boolean t1;
    public int t2;
    public int u1;
    public int u2;
    public boolean v1;
    public boolean v2;
    public boolean w1;
    public int w2;
    public boolean x1;
    public boolean x2;
    public int y1;
    public boolean y2;
    public org.telegram.ui.Cells.z z1;
    public final m.i3 z2;

    static {
        Method method;
        try {
            method = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            method = null;
        }
        O2 = method;
        P2 = new Paint(1);
        Q2 = new Paint(1);
        R2 = new Path();
        S2 = new float[8];
    }

    public wk0(Context context) {
        this(context, null);
    }

    public static float G0(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    public static void N0(Canvas canvas, RectF rectF, float f10, float f11, float f12, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean z10 = SharedConfig.shadowsInSections;
        Paint paint = P2;
        Paint paint2 = Q2;
        if (z10) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.f6.l1(f12, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.f6.l1(f12, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(f12, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var)));
        if (f10 == f11) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        Path path = R2;
        path.rewind();
        float[] fArr = S2;
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
        this.A2.b.add(new ys(runnable, 1));
    }

    public final void D0(ClippingImageView clippingImageView, FrameLayout.LayoutParams layoutParams) {
        if (this.Z0 == null) {
            this.Z0 = new fh.d2(this, getContext(), 19);
        }
        this.Z0.addView(clippingImageView, layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final View E(float f10, float f11) {
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < 2) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if ((!(childAt instanceof org.telegram.ui.Cells.t1) && !(childAt instanceof org.telegram.ui.Cells.w0)) || childAt.getVisibility() != 4) {
                    float translationX = i9 == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i9 == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i9++;
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
        ag.d dVar = this.a1;
        if (dVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dVar);
            this.a1 = null;
        }
        View view = this.J1;
        if (view != null) {
            if (z10) {
                h1(view, 0.0f, 0.0f, false);
            }
            this.J1 = null;
            k1(null, view);
        }
        this.C1.setEmpty();
        qk0 qk0Var = this.O1;
        if (qk0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qk0Var);
            this.O1 = null;
        }
        this.L1 = false;
    }

    public final void J0(boolean z10) {
        if (this.e1) {
            return;
        }
        if (getAdapter() == null || this.Y0 == null) {
            if (!this.S1 || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.S1 = false;
            return;
        }
        boolean S0 = S0();
        int i9 = S0 ? 0 : 8;
        if (!this.U1 || !SharedConfig.animationsEnabled()) {
            z10 = false;
        }
        if (!z10) {
            this.w2 = i9;
            this.Y0.setVisibility(i9);
            this.Y0.setAlpha(1.0f);
        } else if (this.w2 != i9) {
            this.w2 = i9;
            if (i9 == 0) {
                this.Y0.animate().setListener(null).cancel();
                if (this.Y0.getVisibility() == 8) {
                    this.Y0.setVisibility(0);
                    this.Y0.setAlpha(0.0f);
                    if (this.V1 == 1) {
                        this.Y0.setScaleX(0.7f);
                        this.Y0.setScaleY(0.7f);
                    }
                }
                this.Y0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.Y0.getVisibility() != 8) {
                ViewPropertyAnimator alpha = this.Y0.animate().alpha(0.0f);
                if (this.V1 == 1) {
                    alpha.scaleY(0.7f).scaleX(0.7f);
                }
                alpha.setDuration(150L).setListener(new r60(this, 13)).start();
            }
        }
        if (this.w1) {
            int i10 = S0 ? 4 : 0;
            if (getVisibility() != i10) {
                setVisibility(i10);
            }
            this.S1 = true;
        }
    }

    public final void K0(boolean z10) {
        fk0 fk0Var;
        f2.q1 T;
        fk0 fk0Var2;
        View view;
        f2.q1 T2;
        int b10;
        int S;
        if (((this.G1 || z10) && this.b1 != null) || !(this.u1 == 0 || this.c1 == null)) {
            f2.z0 layoutManager = getLayoutManager();
            if (layoutManager instanceof f2.m0) {
                f2.m0 m0Var = (f2.m0) layoutManager;
                if (m0Var.o == 1) {
                    if (this.c1 == null) {
                        int L0 = m0Var.L0();
                        Math.abs(m0Var.N0() - L0);
                        if (L0 == -1) {
                            return;
                        }
                        if ((!this.G1 && !z10) || (fk0Var = this.b1) == null || fk0Var.n) {
                            return;
                        }
                        f2.r0 adapter = getAdapter();
                        if (adapter instanceof gk0) {
                            gk0 gk0Var = (gk0) adapter;
                            float H = gk0Var.H(this);
                            this.b1.setIsVisible(gk0Var.E(this));
                            this.b1.setProgress(Math.min(1.0f, H));
                            this.b1.a(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.u1 == 1 ? 0 : getPaddingTop();
                    int i9 = this.u1;
                    int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i9 != 1 && i9 != 3) {
                        if (i9 == 2) {
                            this.j1 = 0.0f;
                            if (this.c1.h() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            View view2 = null;
                            int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            View view3 = null;
                            int i12 = 0;
                            for (int i13 = 0; i13 < childCount; i13++) {
                                View childAt = getChildAt(i13);
                                int bottom = childAt.getBottom();
                                if (bottom > this.s1 + paddingTop) {
                                    if (bottom < i10) {
                                        view3 = childAt;
                                        i10 = bottom;
                                    }
                                    i12 = Math.max(i12, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.s1 + paddingTop && bottom < i11) {
                                        view2 = childAt;
                                        i11 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (T2 = T(view3)) == null || (S = this.c1.S((b10 = T2.b()))) < 0) {
                                return;
                            }
                            if (this.o1 != S || this.n1 == null) {
                                View view4 = this.n1;
                                boolean z11 = view4 == null;
                                View T3 = this.c1.T(S, view4);
                                if (z11) {
                                    T0(T3, false);
                                }
                                this.n1 = T3;
                                T3.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.n1;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.n1.getMeasuredHeight());
                                this.o1 = S;
                            }
                            if (this.n1 != null && view2 != null && view2.getClass() != this.n1.getClass()) {
                                this.j1 = 1.0f;
                            }
                            int M = this.c1.M(S);
                            int Q = this.c1.Q(b10);
                            int i14 = (i12 == 0 || i12 >= getMeasuredHeight() - getPaddingBottom()) ? this.s1 : -paddingTop;
                            if (Q == M - 1) {
                                int height = this.n1.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.s1);
                                int i15 = height2 < height ? height2 - height : paddingTop;
                                if (i15 < 0) {
                                    this.n1.setTag(Integer.valueOf(paddingTop + i14 + i15));
                                } else {
                                    this.n1.setTag(Integer.valueOf(paddingTop + i14));
                                }
                            } else {
                                this.n1.setTag(Integer.valueOf(paddingTop + i14));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    View view6 = null;
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount2; i18++) {
                        View childAt2 = getChildAt(i18);
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.s1 + paddingTop) {
                            if (bottom2 < i10) {
                                i10 = bottom2;
                                view6 = childAt2;
                            }
                            i17 = Math.max(i17, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(32.0f) + this.s1 + paddingTop && bottom2 < i16) {
                                i16 = bottom2;
                            }
                        }
                    }
                    if (view6 == null || (T = T(view6)) == null) {
                        return;
                    }
                    int b11 = T.b();
                    int abs = Math.abs(m0Var.N0() - b11) + 1;
                    if ((this.G1 || z10) && (fk0Var2 = this.b1) != null && !fk0Var2.n && (getAdapter() instanceof gk0)) {
                        this.b1.setProgress(Math.min(1.0f, b11 / ((this.c1.h() - abs) + 1)));
                    }
                    this.m1.addAll(this.l1);
                    this.l1.clear();
                    if (this.c1.h() == 0) {
                        return;
                    }
                    if (this.o1 != b11 || this.p1 != abs) {
                        this.o1 = b11;
                        this.p1 = abs;
                        this.r1 = 1;
                        int S3 = this.c1.S(b11);
                        this.q1 = S3;
                        int M3 = (this.c1.M(S3) + b11) - this.c1.Q(b11);
                        while (M3 < b11 + abs) {
                            M3 += this.c1.M(this.q1 + this.r1);
                            this.r1++;
                        }
                    }
                    if (this.u1 != 3) {
                        int i19 = b11;
                        for (int i20 = this.q1; i20 < this.q1 + this.r1; i20++) {
                            if (this.m1.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.m1.get(0);
                                this.m1.remove(0);
                            }
                            boolean z12 = view == null;
                            View T4 = this.c1.T(i20, view);
                            if (z12) {
                                T0(T4, false);
                            }
                            this.l1.add(T4);
                            int M4 = this.c1.M(i20);
                            if (i20 == this.q1) {
                                int Q3 = this.c1.Q(i19);
                                if (Q3 == M4 - 1) {
                                    T4.setTag(Integer.valueOf((-T4.getHeight()) + paddingTop));
                                } else if (Q3 == M4 - 2) {
                                    View childAt3 = getChildAt(i19 - b11);
                                    T4.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    T4.setTag(0);
                                }
                                i19 = (M4 - this.c1.Q(b11)) + i19;
                            } else {
                                View childAt4 = getChildAt(i19 - b11);
                                if (childAt4 != null) {
                                    T4.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    T4.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                }
                                i19 += M4;
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
        int[] iArr = this.i2;
        float min = Math.min(measuredHeight - iArr[1], Math.max(f11, iArr[0]));
        float min2 = Math.min(getMeasuredWidth(), Math.max(f10, 0.0f));
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            org.telegram.ui.ei eiVar = this.d2;
            int[] iArr2 = this.i2;
            org.telegram.ui.qn qnVar = eiVar.d;
            iArr2[0] = (int) qnVar.o9;
            iArr2[1] = qnVar.wa;
            View childAt = getChildAt(i9);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(min2, min)) {
                int S = RecyclerView.S(childAt);
                int i10 = this.c2;
                if (i10 != S) {
                    int i11 = this.b2;
                    boolean z10 = i10 > i11 || S > i11;
                    org.telegram.ui.qn qnVar2 = this.d2.d;
                    org.telegram.ui.bm bmVar = qnVar2.w0;
                    ArrayList arrayList = qnVar2.q6;
                    int i12 = S - bmVar.F;
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i12);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) qnVar2.t6.f(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList2 = groupedMessages.messages;
                            S = arrayList.indexOf(arrayList2.get(z10 ? 0 : arrayList2.size() - 1)) + qnVar2.w0.F;
                        }
                    }
                    if (z10) {
                        int i13 = this.c2;
                        if (S <= i13) {
                            while (i13 > S) {
                                if (i13 != this.b2 && this.d2.a(i13)) {
                                    this.d2.b(i13, false, min2, min);
                                }
                                i13--;
                            }
                        } else if (!this.d2.a) {
                            for (int i14 = i13 + 1; i14 <= S; i14++) {
                                if (i14 != this.b2 && this.d2.a(i14)) {
                                    this.d2.b(i14, true, min2, min);
                                }
                            }
                        }
                    } else {
                        int i15 = this.c2;
                        if (S > i15) {
                            while (i15 < S) {
                                if (i15 != this.b2 && this.d2.a(i15)) {
                                    this.d2.b(i15, false, min2, min);
                                }
                                i15++;
                            }
                        } else if (!this.d2.a) {
                            for (int i16 = i15 - 1; i16 >= S; i16--) {
                                if (i16 != this.b2 && this.d2.a(i16)) {
                                    this.d2.b(i16, true, min2, min);
                                }
                            }
                        }
                    }
                }
                if (this.d2.a) {
                    return;
                }
                this.c2 = S;
                return;
            }
        }
    }

    public final void M0(Canvas canvas, View view) {
        boolean z10;
        boolean z11;
        if (view == null || !((Boolean) this.D2.a.run(view)).booleanValue()) {
            return;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z11 = false;
            z10 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z10 = U0 != null && ((Boolean) this.D2.a.run(U0)).booleanValue();
            z11 = U02 != null && ((Boolean) this.D2.a.run(U02)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), Math.max(-this.H2, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.H2), G0(view)));
        if (z10 && z11) {
            z10 = t1(view) >= rectF.top;
            boolean z12 = G0(view) <= rectF.bottom;
            if (z10 && z12) {
                return;
            } else {
                z11 = z12;
            }
        }
        Path path = this.L2;
        if (!z10 && !z11) {
            path.rewind();
            float f10 = this.H2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.clipPath(path);
            return;
        }
        if (!z10) {
            path.rewind();
            path.addRoundRect(rectF, this.I2, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            if (z11) {
                return;
            }
            path.rewind();
            path.addRoundRect(rectF, this.J2, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    public final void O0(Canvas canvas, int i9, int i10, int i11, int i12, int i13) {
        if (i10 < i9 || i9 < 0 || i10 < 0) {
            return;
        }
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = TLObject.FLAG_31;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null) {
                int R = RecyclerView.R(childAt);
                int top = childAt.getTop();
                if (R >= i9 && R <= i10) {
                    i14 = Math.min(top, i14);
                    i15 = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), i15);
                }
            }
        }
        if (i14 < i15) {
            if (this.q2 == null) {
                this.q2 = new Paint(1);
            }
            this.q2.setColor(i11);
            canvas.drawRect(0.0f, i14 - i12, getWidth(), i15 + i13, this.q2);
        }
    }

    public final void P0(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof t70 ? ((t70) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getLeft(), Math.max(-this.H2, t1(view) - (z10 ? this.H2 : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.H2), (G0(view2) + (z11 ? this.H2 : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.F2.run(canvas, rectF, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(view.getAlpha()));
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
        int i9;
        View view;
        if (this.F2 == null) {
            return;
        }
        f2.w0 w0Var = this.V;
        if (w0Var == null || !w0Var.k()) {
            f10 = 1.0f;
            int i10 = -1;
            View view2 = null;
            View view3 = null;
            int i11 = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt == this.Y0 || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.0f || !((Boolean) this.D2.a.run(childAt)).booleanValue() || g1(RecyclerView.R(childAt))) {
                    P0(canvas, view2, view3, Y0(i10, view2), a1(i11, view3));
                    i10 = -1;
                    view2 = null;
                    view3 = null;
                    i11 = -1;
                } else {
                    if (view2 != null && Math.abs(view3.getAlpha() - childAt.getAlpha()) > 0.1f) {
                        P0(canvas, view2, view3, Y0(i10, view2), a1(i11, view3));
                        i10 = -1;
                        view2 = null;
                    }
                    if (view2 == null) {
                        i10 = i12;
                        view2 = childAt;
                    }
                    i11 = i12;
                    view3 = childAt;
                }
            }
            P0(canvas, view2, view3, Y0(i10, view2), a1(i11, view3));
        } else {
            if (this.K2 == null) {
                this.K2 = new ArrayList();
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2 != this.Y0 && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && ((Boolean) this.D2.a.run(childAt2)).booleanValue()) {
                    float t12 = t1(childAt2);
                    float G0 = G0(childAt2);
                    f2.q1 T = T(childAt2);
                    if (!T.j() || childAt2.getAlpha() >= 1.0f) {
                        if (g1(T.b())) {
                        }
                        ArrayList arrayList = this.K2;
                        float alpha = childAt2.getAlpha();
                        tk0 tk0Var = new tk0();
                        tk0Var.a = t12;
                        tk0Var.b = G0;
                        tk0Var.c = alpha;
                        arrayList.add(tk0Var);
                    } else {
                        if (T.j() && (i9 = T.i) >= 0) {
                            int ceil = ((int) Math.ceil(i9 / 1000.0d)) + 1;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= getChildCount()) {
                                    view = null;
                                    break;
                                }
                                view = getChildAt(i14);
                                if (view != null && view != childAt2 && RecyclerView.R(view) == ceil) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            if (view != null && G0 > view.getY() && ((Boolean) this.D2.a.run(view)).booleanValue() && !T(view).j()) {
                                t12 -= 1.0f;
                                G0 = view.getY();
                                if (G0 < t12) {
                                }
                            }
                        }
                        ArrayList arrayList2 = this.K2;
                        float alpha2 = childAt2.getAlpha();
                        tk0 tk0Var2 = new tk0();
                        tk0Var2.a = t12;
                        tk0Var2.b = G0;
                        tk0Var2.c = alpha2;
                        arrayList2.add(tk0Var2);
                    }
                }
            }
            ArrayList arrayList3 = this.K2;
            float f13 = this.H2;
            ArrayList arrayList4 = uk0.a;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                f10 = 1.0f;
            } else {
                Collections.sort(arrayList3, new j9.a(29));
                arrayList4.clear();
                int i15 = 0;
                while (i15 < arrayList3.size()) {
                    float f14 = ((tk0) arrayList3.get(i15)).b;
                    int i16 = i15 + 1;
                    while (i16 < arrayList3.size() && ((tk0) arrayList3.get(i16)).a <= f14 + 1.5f) {
                        f14 = Math.max(f14, ((tk0) arrayList3.get(i16)).b);
                        i16++;
                    }
                    float f15 = Float.MAX_VALUE;
                    float f16 = Float.MIN_VALUE;
                    float f17 = Float.MAX_VALUE;
                    float f18 = Float.MIN_VALUE;
                    for (int i17 = i15; i17 < i16; i17++) {
                        tk0 tk0Var3 = (tk0) arrayList3.get(i17);
                        if (tk0Var3.c >= 0.99f) {
                            f17 = Math.min(f17, tk0Var3.a);
                            f18 = Math.max(f18, tk0Var3.b);
                        }
                    }
                    boolean z10 = f17 != Float.MAX_VALUE;
                    float f19 = 0.0f;
                    for (int i18 = i15; i18 < i16; i18++) {
                        tk0 tk0Var4 = (tk0) arrayList3.get(i18);
                        f15 = Math.min(f15, tk0Var4.a);
                        f16 = Math.max(f16, tk0Var4.b);
                        f19 = Math.max(f19, tk0Var4.c);
                    }
                    if (f19 >= 0.001f) {
                        if (z10) {
                            float f20 = 0.0f;
                            tk0 tk0Var5 = null;
                            for (int i19 = i15; i19 < i16; i19++) {
                                tk0 tk0Var6 = (tk0) arrayList3.get(i19);
                                float f21 = tk0Var6.c;
                                if (f21 < 0.99f) {
                                    float f22 = tk0Var6.a;
                                    if (f22 < f17) {
                                        float f23 = (f17 - f22) * f21;
                                        if (f23 > f20) {
                                            tk0Var5 = tk0Var6;
                                            f20 = f23;
                                        }
                                    }
                                }
                            }
                            tk0 tk0Var7 = null;
                            float f24 = 0.0f;
                            while (i15 < i16) {
                                tk0 tk0Var8 = (tk0) arrayList3.get(i15);
                                float f25 = tk0Var8.c;
                                if (f25 < 0.99f) {
                                    float f26 = tk0Var8.b;
                                    if (f26 > f18) {
                                        float f27 = (f26 - f18) * f25;
                                        if (f27 > f24) {
                                            tk0Var7 = tk0Var8;
                                            f24 = f27;
                                        }
                                    }
                                }
                                i15++;
                            }
                            if (tk0Var5 != null) {
                                float f28 = tk0Var5.a;
                                float f29 = tk0Var5.c;
                                if (f29 > 0.001f) {
                                    float lerp = AndroidUtilities.lerp(f17, f28, f29);
                                    f11 = AndroidUtilities.lerp(f13, f29 * f13, (f17 - lerp) / ((f17 - f28) + 0.001f));
                                    f17 = lerp;
                                    if (tk0Var7 != null) {
                                        float f30 = tk0Var7.b;
                                        float f31 = tk0Var7.c;
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
                            if (tk0Var7 != null) {
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
                            i15 = i16;
                        }
                    }
                    fArr = null;
                    if (fArr == null) {
                    }
                    i15 = i16;
                }
                f10 = 1.0f;
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    float[] fArr2 = (float[]) arrayList4.get(i20);
                    float f32 = fArr2[0];
                    float f33 = fArr2[1];
                    float f34 = fArr2[2];
                    float f35 = fArr2[3];
                    float f36 = fArr2[4];
                    if (i20 > 0) {
                        float f37 = f32 - ((float[]) arrayList4.get(i20 - 1))[1];
                        float f38 = f13 * 0.2f;
                        if (f37 < f38) {
                            f34 = Math.min(f34, (f37 / f38) * f13);
                        }
                    }
                    if (i20 < arrayList4.size() - 1) {
                        float f39 = ((float[]) arrayList4.get(i20 + 1))[0] - f33;
                        float f40 = 0.2f * f13;
                        if (f39 < f40) {
                            f35 = Math.min(f35, (f39 / f40) * f13);
                        }
                    }
                    Float valueOf = Float.valueOf(f34);
                    Float valueOf2 = Float.valueOf(f35);
                    Float valueOf3 = Float.valueOf(f36);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.D2.c, f32, (getWidth() - this.D2.c) - getPaddingRight(), f33);
                    this.F2.run(canvas, rectF, valueOf, valueOf2, valueOf3);
                }
            }
            this.K2.clear();
        }
        if (this.G2 != null) {
            for (int i21 = 0; i21 < this.G2.size(); i21++) {
                long longValue = ((Long) this.G2.get(i21)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float height = getHeight();
                float f41 = this.H2;
                float f42 = height + f41;
                float f43 = -f41;
                for (int i22 = 0; i22 < getChildCount(); i22++) {
                    View childAt3 = getChildAt(i22);
                    int R = RecyclerView.R(childAt3);
                    if (R >= unpackA && R <= unpackB) {
                        f42 = Math.min(f42, t1(childAt3));
                        f43 = Math.max(f43, G0(childAt3));
                    }
                }
                if (f42 < f43) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.D2.c, f42, (getWidth() - getPaddingRight()) - this.D2.c, f43);
                    this.F2.run(canvas, rectF2, Float.valueOf(this.H2), Float.valueOf(this.H2), Float.valueOf(f10));
                }
            }
        }
    }

    public final void R0(Canvas canvas) {
        org.telegram.ui.Cells.z zVar;
        q0.a aVar;
        View view;
        Rect rect = this.C1;
        if (rect.isEmpty() || (zVar = this.z1) == null) {
            return;
        }
        int i9 = this.E1;
        if ((i9 == -2 || i9 == this.A1) && this.B1 != null) {
            if (getAdapter() instanceof vk0) {
                ((vk0) getAdapter()).getClass();
            }
            this.z1.setBounds(this.B1.getLeft(), this.B1.getTop(), this.B1.getRight(), this.B1.getBottom());
        } else {
            zVar.setBounds(rect);
        }
        canvas.save();
        int i10 = this.E1;
        if ((i10 == -2 || i10 == this.A1) && (aVar = this.k2) != null) {
            aVar.accept(canvas);
        }
        int i11 = this.E1;
        if ((i11 == -2 || i11 == this.A1) && (view = this.B1) != null) {
            canvas.translate(view.getX() - rect.left, this.B1.getY() - rect.top);
            this.z1.setAlpha((int) (this.B1.getAlpha() * 255.0f));
        }
        if (b1()) {
            canvas.save();
            M0(canvas, this.B1);
            this.z1.draw(canvas);
            canvas.restore();
        } else {
            this.z1.draw(canvas);
        }
        canvas.restore();
    }

    public boolean S0() {
        return (getAdapter() == null || this.T1 || getAdapter().h() != 0) ? false : true;
    }

    public final void T0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z10) {
            int i9 = this.u1;
            if (i9 == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i9 == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final View U0(int i9) {
        if (i9 == -1) {
            return null;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R == i9) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable V0(View view, boolean z10) {
        boolean z11;
        boolean z12;
        if (view.getParent() != this || !b1() || !((Boolean) this.D2.a.run(view)).booleanValue()) {
            return null;
        }
        int R = RecyclerView.R(view);
        if (R == -1) {
            z12 = false;
            z11 = false;
        } else {
            View U0 = U0(R - 1);
            View U02 = U0(R + 1);
            z11 = U0 != null && ((Boolean) this.D2.a.run(U0)).booleanValue();
            z12 = U02 != null && ((Boolean) this.D2.a.run(U02)).booleanValue();
        }
        RectF rectF = new RectF();
        rectF.set(view.getX(), Math.max(0.0f, t1(view)), view.getX() + view.getWidth(), Math.min(getHeight(), G0(view)));
        if (z11 && z12 && !z10) {
            z11 = t1(view) >= rectF.top;
            boolean z13 = G0(view) <= rectF.bottom;
            if (z11 && z13) {
                return org.telegram.ui.ActionBar.f6.b0(0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.l2));
            }
            z12 = z13;
        }
        Path path = new Path();
        if ((!z11 && !z12) || z10) {
            path.rewind();
            float f10 = this.H2;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else if (!z11) {
            path.rewind();
            path.addRoundRect(rectF, this.I2, Path.Direction.CW);
        } else if (!z12) {
            path.rewind();
            path.addRoundRect(rectF, this.J2, Path.Direction.CW);
        }
        return new ek0(this, view, path, rectF);
    }

    public Integer W0(int i9) {
        GenericProvider genericProvider = this.s2;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i9));
        }
        return null;
    }

    public final Paint X0(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.l2;
        Paint O = b6Var != null ? b6Var.O(str) : null;
        return O != null ? O : org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final boolean Y0(int i9, View view) {
        int R;
        if (view == null || i9 > 0 || getAdapter() == null || this.E2 == null || (R = RecyclerView.R(view)) == -1 || R == 0) {
            return false;
        }
        return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(R - 1)))).booleanValue();
    }

    public final boolean Z0() {
        for (zs zsVar : this.A2.a) {
            if (zsVar != null && zsVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a1(int i9, View view) {
        int R;
        if (view == null || i9 < getChildCount() - 1 || getAdapter() == null || this.E2 == null || (R = RecyclerView.R(view)) == -1 || R == getAdapter().h() - 1) {
            return false;
        }
        return ((Boolean) this.E2.run(Integer.valueOf(getAdapter().j(R + 1)))).booleanValue();
    }

    public final boolean b1() {
        return this.D2 != null;
    }

    public final void c1() {
        if (this.e1) {
            return;
        }
        this.e1 = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.Y0;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.Y0.setVisibility(8);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i9) {
        return this.P1 && super.canScrollVertically(i9);
    }

    public final void d1(boolean z10) {
        View view = this.J1;
        if (view != null) {
            h1(view, 0.0f, 0.0f, false);
            this.J1 = null;
            if (z10) {
                k1(null, view);
            }
        }
        if (z10) {
            return;
        }
        this.z1.setState(StateSet.NOTHING);
        this.C1.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        dk0 dk0Var = this.j2;
        if (dk0Var != null) {
            wk0 wk0Var = dk0Var.a;
            if (dk0Var.d || dk0Var.e) {
                for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                    View childAt = wk0Var.getChildAt(i9);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && !dk0Var.c.contains(childAt)) {
                        Float f10 = (Float) dk0Var.b.get(R, null);
                        if (f10 == null) {
                            childAt.setAlpha(1.0f);
                        } else {
                            childAt.setAlpha(f10.floatValue());
                        }
                    }
                }
                dk0Var.d = false;
            }
        }
        if (this.Q0 && this.x1) {
            R0(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.Q0 && !this.x1) {
            R0(canvas);
        }
        fh.d2 d2Var = this.Z0;
        if (d2Var != null) {
            d2Var.draw(canvas);
        }
        if (this.v1) {
            return;
        }
        int i10 = this.u1;
        if (i10 == 1) {
            if (this.c1 == null || this.l1.isEmpty()) {
                return;
            }
            for (int i11 = 0; i11 < this.l1.size(); i11++) {
                View view2 = (View) this.l1.get(i11);
                int save = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(save);
            }
            return;
        }
        if (i10 != 2 || this.c1 == null || (view = this.n1) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int save2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.n1.getWidth() : 0.0f, ((Integer) this.n1.getTag()).intValue());
        Drawable drawable = this.h1;
        if (drawable != null) {
            drawable.setBounds(0, this.n1.getMeasuredHeight(), getWidth(), this.h1.getIntrinsicHeight() + this.n1.getMeasuredHeight());
            this.h1.setAlpha((int) (this.i1 * 255.0f));
            this.h1.draw(canvas);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min = Math.min(20L, elapsedRealtime - this.k1);
            this.k1 = elapsedRealtime;
            float f11 = this.i1;
            float f12 = this.j1;
            if (f11 < f12) {
                float f13 = (min / 180.0f) + f11;
                this.i1 = f13;
                if (f13 > f12) {
                    this.i1 = f12;
                }
                invalidate();
            } else if (f11 > f12) {
                float f14 = f11 - (min / 180.0f);
                this.i1 = f14;
                if (f14 < f12) {
                    this.i1 = f12;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.n1.getMeasuredHeight());
        this.n1.draw(canvas);
        canvas.restoreToCount(save2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.u2 == 0 && this.v2) {
                setOverScrollMode(0);
            }
            this.u2++;
        } else if (action == 1 || action == 3) {
            int i9 = this.u2 - 1;
            this.u2 = i9;
            if (i9 == 0 && this.v2) {
                setOverScrollMode(2);
            }
        }
        fk0 fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.T || !fastScroll.g0 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.c1 == null || (view = this.n1) == null || view.getAlpha() == 0.0f || !this.n1.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!b1() || this.x2) {
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
            if (this.B2 == null) {
                this.B2 = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.B2)) {
                canvas.concat(this.B2);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, uptimeMillis);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i9 = 0; i9 < itemDecorationCount; i9++) {
            Object X = X(i9);
            if ((X instanceof jg.a) && (X != this.D2 || this.C2)) {
                ((jg.a) X).e(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                this.x2 = true;
                drawChild(canvas, childAt, uptimeMillis);
                this.x2 = false;
            }
        }
    }

    public final void e1(jk0 jk0Var, int i9, boolean z10) {
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1 = null;
        }
        f2.q1 K = K(jk0Var.run());
        if (K == null) {
            if (z10) {
                this.Q1 = jk0Var;
                return;
            }
            return;
        }
        View view = K.a;
        int c10 = K.c();
        this.t2 = c10;
        i1(c10, view);
        org.telegram.ui.Cells.z zVar = this.z1;
        if (zVar != null) {
            Drawable current = zVar.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.T0 == null && this.S0 == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.z1.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        org.telegram.ui.Cells.z zVar2 = this.z1;
        if (zVar2 != null && zVar2.isStateful() && this.z1.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.z1);
        }
        if (i9 > 0) {
            this.Q1 = null;
            ib0 ib0Var2 = new ib0(this, 19);
            this.R1 = ib0Var2;
            AndroidUtilities.runOnUIThread(ib0Var2, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void f0(View view) {
        if (!(getAdapter() instanceof vk0)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        f2.q1 G = G(view);
        if (G != null) {
            view.setEnabled(((vk0) getAdapter()).D(G));
            if (this.m2) {
                view.setAccessibilityDelegate(this.n2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f1() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof org.telegram.ui.ActionBar.w5) {
                ((org.telegram.ui.ActionBar.w5) childAt).d();
            }
            childAt.invalidate();
        }
    }

    @Override // jg.a
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
        for (int i9 = 0; i9 < itemDecorationCount; i9++) {
            Object X = X(i9);
            if ((X instanceof jg.a) && (X != this.D2 || this.C2)) {
                ((jg.a) X).g(xVar, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                xVar.getClass();
                android.support.v4.media.session.z.a(xVar, childAt);
            }
        }
    }

    public final boolean g1(int i9) {
        if (this.G2 != null && i9 >= 0) {
            for (int i10 = 0; i10 < this.G2.size(); i10++) {
                long longValue = ((Long) this.G2.get(i10)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                if (i9 >= unpackA && i9 <= unpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    public View getEmptyView() {
        return this.Y0;
    }

    public fk0 getFastScroll() {
        return this.b1;
    }

    public ArrayList<View> getHeaders() {
        return this.l1;
    }

    public ArrayList<View> getHeadersCache() {
        return this.m1;
    }

    public mk0 getOnItemClickListener() {
        return this.R0;
    }

    public f2.d1 getOnScrollListener() {
        return this.W0;
    }

    public View getPinnedHeader() {
        return this.n1;
    }

    public View getPressedChildView() {
        return this.J1;
    }

    public Drawable getSelectorDrawable() {
        return this.z1;
    }

    public Rect getSelectorRect() {
        return this.C1;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public void h1(View view, float f10, float f11, boolean z10) {
        if (this.f1 || view == null) {
            return;
        }
        view.setPressed(z10);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public final void i1(int i9, View view) {
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1 = null;
            this.Q1 = null;
        }
        if (this.z1 == null) {
            return;
        }
        boolean z10 = i9 != this.A1;
        if (getAdapter() instanceof vk0) {
            ((vk0) getAdapter()).getClass();
        }
        if (i9 != -1) {
            this.A1 = i9;
        }
        this.B1 = view;
        if (this.y1 == 8) {
            org.telegram.ui.ActionBar.f6.A1(this.z1, this.W1, 0);
        } else if (this.X1 > 0 && getAdapter() != null) {
            org.telegram.ui.ActionBar.f6.A1(this.z1, i9 == 0 ? this.X1 : 0, i9 == getAdapter().h() + (-2) ? this.X1 : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.C1;
        rect.set(left, top, right, bottom);
        boolean isEnabled = view.isEnabled();
        if (this.D1 != isEnabled) {
            this.D1 = isEnabled;
        }
        if (z10) {
            this.z1.setVisible(false, false);
            this.z1.setState(StateSet.NOTHING);
        }
        setListSelectorColor(W0(i9));
        this.z1.setBounds(rect);
        if (z10 && getVisibility() == 0) {
            this.z1.setVisible(true, false);
        }
    }

    public final void j1() {
        int i9;
        ib0 ib0Var = this.R1;
        if (ib0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
            this.R1.run();
            this.R1 = null;
            this.B1 = null;
            return;
        }
        this.R1 = null;
        this.Q1 = null;
        View view = this.B1;
        if (view != null && (i9 = this.t2) != -1) {
            i1(i9, view);
            org.telegram.ui.Cells.z zVar = this.z1;
            if (zVar != null) {
                zVar.setState(new int[0]);
                invalidateDrawable(this.z1);
            }
            this.B1 = null;
            this.t2 = -1;
            return;
        }
        org.telegram.ui.Cells.z zVar2 = this.z1;
        if (zVar2 != null) {
            Drawable current = zVar2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        org.telegram.ui.Cells.z zVar3 = this.z1;
        if (zVar3 != null && zVar3.isStateful() && this.z1.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.z1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.z1;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    public final void k1(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.C1;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                i1(this.K1, view);
                org.telegram.ui.Cells.z zVar = this.z1;
                if (zVar != null) {
                    Drawable current = zVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            v1();
        }
    }

    public final void l1(wk0 wk0Var, boolean z10) {
        ViewParent parent;
        if (wk0Var == null || (parent = wk0Var.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z10);
        ViewParent touchParent = getTouchParent();
        if (touchParent == null) {
            return;
        }
        touchParent.requestDisallowInterceptTouchEvent(z10);
    }

    public final void m1(int i9, boolean z10) {
        this.U1 = z10;
        this.V1 = i9;
    }

    public final void n1(pk0 pk0Var, long j10) {
        this.U0 = pk0Var;
        n5.e0 e0Var = this.I1;
        boolean z10 = pk0Var != null;
        v10 v10Var = (v10) e0Var.b;
        v10Var.t = z10;
        v10Var.u = j10;
    }

    public final void o1(int i9, int i10, int i11, int i12) {
        if (getPaddingLeft() == i9 && getPaddingTop() == i10 && getPaddingRight() == i11 && getPaddingBottom() == i12) {
            return;
        }
        this.y2 = true;
        setPadding(i9, i10, i11, i12);
        this.y2 = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fk0 fk0Var = this.b1;
        if (fk0Var == null || fk0Var.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.b1.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.b1);
        }
        ((ViewGroup) getParent()).addView(this.b1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        dk0 dk0Var = this.j2;
        if (dk0Var != null) {
            dk0Var.a();
        }
        if (this.r2) {
            this.r2 = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.M1) {
            l1(this, true);
        }
        if (this.X0 == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i9 = org.telegram.ui.qn.Dc;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        fk0 fk0Var = this.b1;
        if (fk0Var != null) {
            this.F1 = true;
            int paddingTop = i10 + (fk0Var.a ? getPaddingTop() : fk0Var.d0);
            fk0 fk0Var2 = this.b1;
            if (fk0Var2.c0) {
                fk0Var2.layout(0, paddingTop, fk0Var2.getMeasuredWidth(), this.b1.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.b1.getMeasuredWidth();
                fk0 fk0Var3 = this.b1;
                fk0Var3.layout(measuredWidth, paddingTop, fk0Var3.getMeasuredWidth() + measuredWidth, this.b1.getMeasuredHeight() + paddingTop);
            }
            this.F1 = false;
        }
        K0(false);
        jk0 jk0Var = this.Q1;
        if (jk0Var != null) {
            e1(jk0Var, 700, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        fk0 fk0Var = this.b1;
        if (fk0Var != null && fk0Var.getLayoutParams() != null) {
            fk0 fk0Var2 = this.b1;
            int measuredHeight = (getMeasuredHeight() - (fk0Var2.a ? getPaddingTop() : fk0Var2.d0)) - getPaddingBottom();
            this.b1.getLayoutParams().height = measuredHeight;
            this.b1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        }
        this.Y1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        View view;
        super.onSizeChanged(i9, i10, i11, i12);
        fh.d2 d2Var = this.Z0;
        if (d2Var != null) {
            d2Var.requestLayout();
        }
        int i13 = this.u1;
        if (i13 != 1) {
            if (i13 != 2 || this.c1 == null || (view = this.n1) == null) {
                return;
            }
            T0(view, true);
            return;
        }
        if (this.c1 == null || this.l1.isEmpty()) {
            return;
        }
        for (int i14 = 0; i14 < this.l1.size(); i14++) {
            T0((View) this.l1.get(i14), true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        fk0 fk0Var = this.b1;
        if (fk0Var != null && fk0Var.n) {
            return false;
        }
        boolean z10 = this.Z1;
        m.i3 i3Var = this.z2;
        if (!z10 || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.g2 = Float.MAX_VALUE;
            this.h2 = Float.MAX_VALUE;
            this.Z1 = false;
            this.a2 = false;
            l1(this, false);
            this.e2 = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            return super.onTouchEvent(motionEvent);
        }
        if (this.g2 == Float.MAX_VALUE && this.h2 == Float.MAX_VALUE) {
            this.g2 = motionEvent.getX();
            this.h2 = motionEvent.getY();
        }
        if (!this.a2 && Math.abs(motionEvent.getY() - this.h2) > this.Y1) {
            this.a2 = true;
            l1(this, true);
        }
        if (this.a2) {
            L0(motionEvent.getX(), motionEvent.getY());
            org.telegram.ui.ei eiVar = this.d2;
            int[] iArr = this.i2;
            org.telegram.ui.qn qnVar = eiVar.d;
            iArr[0] = (int) qnVar.o9;
            iArr[1] = qnVar.wa;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.i2[1] && (this.c2 >= this.b2 || !this.d2.a)) {
                this.f2 = false;
                if (!this.e2) {
                    this.e2 = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.i2[0] || (this.c2 > this.b2 && this.d2.a)) {
                this.e2 = false;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
            } else {
                this.f2 = true;
                if (!this.e2) {
                    this.e2 = true;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    AndroidUtilities.runOnUIThread(i3Var);
                    return true;
                }
            }
        }
        return true;
    }

    public void p1() {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void q1(int i9, float f10, boolean z10) {
        r1(new mh.c(5), i9, f10, new wu(this, 15), z10);
    }

    public final void r1(Utilities.CallbackReturn callbackReturn, int i9, float f10, Utilities.Callback5 callback5, boolean z10) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new kh.f5(this, callbackReturn, sparseIntArray, 3), new mi(sparseIntArray, 2));
        s1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i9, f10, callback5, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.T1 || this.y2) {
            return;
        }
        super.requestLayout();
    }

    public final void s1(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i9, float f10, Utilities.Callback5 callback5, boolean z10) {
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j6, this.l2));
        this.E2 = callbackReturn2;
        this.H2 = f10;
        this.I2 = new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f};
        this.J2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10};
        this.F2 = callback5;
        f2.y0 y0Var = this.D2;
        if (y0Var != null) {
            p0(y0Var);
        }
        kk0 kk0Var = new kk0(this, callbackReturn, i9, z10);
        this.D2 = kk0Var;
        i(kk0Var);
    }

    public void setAccessibilityEnabled(boolean z10) {
        this.m2 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.r0 r0Var) {
        f2.r0 adapter = getAdapter();
        f2.i1 i1Var = this.p2;
        if (adapter != null) {
            adapter.a.unregisterObserver(i1Var);
        }
        ArrayList arrayList = this.l1;
        if (arrayList != null) {
            arrayList.clear();
            this.m1.clear();
        }
        this.o1 = -1;
        this.A1 = -1;
        this.B1 = null;
        this.C1.setEmpty();
        this.n1 = null;
        if (r0Var instanceof sk0) {
            this.c1 = (sk0) r0Var;
        } else {
            this.c1 = null;
        }
        super.setAdapter(r0Var);
        if (r0Var != null) {
            r0Var.B(i1Var);
        }
        J0(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z10) {
        this.g1 = z10;
    }

    public void setAllowStopHeaveOperations(boolean z10) {
        this.t1 = z10;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z10) {
        this.C2 = z10;
    }

    public void setDisableHighlightState(boolean z10) {
        this.f1 = z10;
    }

    public void setDisallowInterceptTouchEvents(boolean z10) {
        this.M1 = z10;
    }

    public void setDrawSelection(boolean z10) {
        this.Q0 = z10;
    }

    public void setDrawSelectorBehind(boolean z10) {
        this.x1 = z10;
    }

    public void setEmptyView(View view) {
        View view2 = this.Y0;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.Y0 = view;
        if (this.U1 && view != null) {
            view.setVisibility(8);
        }
        if (!this.e1) {
            this.w2 = -1;
            J0(false);
            return;
        }
        View view3 = this.Y0;
        if (view3 != null) {
            this.w2 = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i9) {
        this.b1 = new fk0(this, getContext(), i9);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.b1);
        }
    }

    public void setFastScrollVisible(boolean z10) {
        fk0 fk0Var = this.b1;
        if (fk0Var == null) {
            return;
        }
        fk0Var.setVisibility(z10 ? 0 : 8);
        this.b1.T = z10;
    }

    public void setHideIfEmpty(boolean z10) {
        this.w1 = z10;
    }

    public void setInstantClick(boolean z10) {
        this.N1 = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(f2.w0 w0Var) {
        super.setItemAnimator(w0Var);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.s2 = genericProvider;
    }

    public void setItemsEnterAnimator(dk0 dk0Var) {
        this.j2 = dk0Var;
    }

    public void setListSelectorColor(Integer num) {
        int intValue;
        org.telegram.ui.Cells.z zVar = this.z1;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.f6.v0(b1() ? org.telegram.ui.ActionBar.f6.j6 : org.telegram.ui.ActionBar.f6.i6, this.l2);
        } else {
            intValue = num.intValue();
        }
        org.telegram.ui.ActionBar.f6.B1(zVar, intValue, true);
    }

    public void setOnInterceptTouchListener(lk0 lk0Var) {
        this.X0 = lk0Var;
    }

    public void setOnItemClickListener(mk0 mk0Var) {
        this.R0 = mk0Var;
    }

    public void setOnItemLongClickListener(ok0 ok0Var) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.T0 = ok0Var;
        n5.e0 e0Var = this.I1;
        boolean z10 = ok0Var != null;
        v10 v10Var = (v10) e0Var.b;
        v10Var.t = z10;
        v10Var.u = longPressTimeout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(f2.d1 d1Var) {
        this.W0 = d1Var;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.h1 = drawable;
    }

    public void setPinnedSectionOffsetY(int i9) {
        this.s1 = i9;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z10) {
        this.o2 = z10;
    }

    public void setScrollEnabled(boolean z10) {
        this.P1 = z10;
    }

    public void setSections(boolean z10) {
        q1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z10);
    }

    public void setSectionsType(int i9) {
        this.u1 = i9;
        if (i9 == 1 || i9 == 3) {
            this.l1 = new ArrayList();
            this.m1 = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i9) {
        org.telegram.ui.Cells.z zVar = this.z1;
        if (zVar != null) {
            zVar.setCallback(null);
        }
        int i10 = this.y1;
        if (i10 == 8) {
            this.z1 = org.telegram.ui.ActionBar.f6.Y(i9, this.W1, 0);
        } else if (i10 == 9) {
            this.z1 = null;
        } else {
            int i11 = this.X1;
            if (i11 > 0) {
                this.z1 = org.telegram.ui.ActionBar.f6.Y(i9, i11, i11);
            } else {
                int i12 = this.W1;
                if (i12 > 0 && i10 != 1) {
                    this.z1 = org.telegram.ui.ActionBar.f6.i0(i12, i12, i12, i12, 0, i9, -16777216);
                } else if (i10 == 2) {
                    this.z1 = org.telegram.ui.ActionBar.f6.f0(i9, 2, -1);
                } else {
                    this.z1 = org.telegram.ui.ActionBar.f6.f0(i9, i10, i12);
                }
            }
        }
        org.telegram.ui.Cells.z zVar2 = this.z1;
        if (zVar2 != null) {
            zVar2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i9) {
        this.W1 = i9;
    }

    public void setSelectorTransformer(q0.a aVar) {
        this.k2 = aVar;
    }

    public void setSelectorType(int i9) {
        this.y1 = i9;
    }

    public void setSkipDrawSection(boolean z10) {
        this.v1 = z10;
    }

    public void setTopBottomSelectorRadius(int i9) {
        this.X1 = i9;
    }

    public void setTranslateSelector(boolean z10) {
        this.E1 = z10 ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i9) {
        if (i9 <= 0) {
            i9 = -1;
        }
        this.E1 = i9;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        fk0 fk0Var = this.b1;
        if (fk0Var != null) {
            fk0Var.setTranslationY(f10);
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z10) {
        if (M2 != null) {
            super.setVerticalScrollBarEnabled(z10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 != 0) {
            this.S1 = false;
        }
    }

    public boolean u1() {
        return this.C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean v(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        if (!this.V0) {
            return super.v(i9, i10, i11, iArr, iArr2);
        }
        pk0 pk0Var = this.U0;
        if (pk0Var != null) {
            pk0Var.u(i10);
        }
        iArr[0] = i9;
        iArr[1] = i10;
        return true;
    }

    public final void v1() {
        org.telegram.ui.Cells.z zVar = this.z1;
        if (zVar == null || !zVar.isStateful()) {
            return;
        }
        if (this.J1 != null) {
            if (this.z1.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.z1);
            }
        } else if (this.R1 == null) {
            this.z1.setState(StateSet.NOTHING);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.z1 == drawable || super.verifyDrawable(drawable);
    }

    public wk0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.Q0 = true;
        this.g1 = true;
        this.o1 = -1;
        this.p1 = -1;
        this.v1 = false;
        this.w1 = true;
        this.y1 = 2;
        this.C1 = new Rect();
        this.E1 = -1;
        this.P1 = true;
        this.g2 = Float.MAX_VALUE;
        this.h2 = Float.MAX_VALUE;
        this.m2 = true;
        this.n2 = new fe(1);
        this.o2 = true;
        this.p2 = new f2.i1(this, 2);
        this.z2 = new m.i3(this, 26);
        this.L2 = new Path();
        this.l2 = b6Var;
        at atVar = new at();
        this.A2 = atVar;
        setEdgeEffectFactory(atVar);
        setGlowColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, b6Var));
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 2, -1);
        this.z1 = f02;
        f02.setCallback(this);
        try {
            if (!N2) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                M2 = iArr;
                if (iArr == null) {
                    M2 = new int[0];
                }
                N2 = true;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(M2);
            Method method = O2;
            if (method != null) {
                method.invoke(this, obtainStyledAttributes);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.setOnScrollListener(new kn(this, 9));
        this.A.add(new f2.a0(this, context));
    }

    public void setOnItemClickListener(nk0 nk0Var) {
        this.S0 = nk0Var;
    }

    public void setOnItemLongClickListener(pk0 pk0Var) {
        n1(pk0Var, ViewConfiguration.getLongPressTimeout());
    }
}
