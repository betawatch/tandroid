package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class rz extends FrameLayout {
    public static final /* synthetic */ int H0 = 0;
    public boolean A0;
    public float B0;
    public ValueAnimator C0;
    public org.telegram.ui.gu D0;
    public boolean E;
    public org.telegram.ui.gu E0;
    public boolean F;
    public fh.g F0;
    public final di.b1 G;
    public final Path G0;
    public final int H;
    public final jg.i0 I;
    public final org.telegram.ui.l4 J;
    public nz K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public final GradientDrawable U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.h6 a;
    public int a0;
    public final TextPaint b;
    public int b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public int d0;
    public final Paint e;
    public int e0;
    public PorterDuffColorFilter f;
    public int f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public boolean i0;
    public final nr j0;
    public final SparseIntArray k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public boolean n;
    public final SparseIntArray n0;
    public final SparseIntArray o0;
    public final SparseIntArray p0;
    public float q0;
    public long r;
    public int r0;
    public boolean s;
    public int s0;
    public final kz t0;
    public Drawable u0;
    public int v0;
    public float w;
    public final ik w0;
    public float x;
    public float x0;
    public AnimatorSet y;
    public final org.telegram.ui.Cells.g2 y0;
    public di.n4 z0;

    public rz(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.M = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.V = org.telegram.ui.ActionBar.m6.K8;
        this.W = org.telegram.ui.ActionBar.m6.I8;
        this.a0 = org.telegram.ui.ActionBar.m6.J8;
        this.b0 = org.telegram.ui.ActionBar.m6.L8;
        this.c0 = org.telegram.ui.ActionBar.m6.s8;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = nr.h;
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        this.w0 = new ik(this, 6);
        this.y0 = new org.telegram.ui.Cells.g2(3, this);
        this.G0 = new Path();
        this.a = h6Var;
        textPaint2.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.U = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        int i7 = 2;
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.m6.w0(this.V, h6Var));
        setHorizontalScrollBarEnabled(false);
        di.b1 b1Var = new di.b1(19, context, this);
        this.G = b1Var;
        b1Var.setClipChildren(false);
        kz kzVar = new kz(this);
        this.t0 = kzVar;
        kzVar.C = false;
        b1Var.setItemAnimator(kzVar);
        b1Var.setSelectorType(9);
        b1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.t6.l(b1Var, 20, this.b0, h6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, i7);
        this.I = i0Var;
        b1Var.setLayoutManager(i0Var);
        new v4.z(new qz(this)).h(b1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.H = max;
        b1Var.setPadding(max, 0, max, 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i7, this, context);
        this.J = l4Var;
        l4Var.C(true);
        b1Var.setAdapter(l4Var);
        b1Var.setOnItemClickListener(new iz(this));
        b1Var.setOnItemLongClickListener(new iz(this));
        b1Var.setOnScrollListener(new oa(this, 10));
        b1Var.z2 = true;
        b1Var.setOverScrollMode(2);
        addView(b1Var, c8.ma.e(-1, 36, 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreadOnlyBannerProgress(float f10) {
        if (this.B0 == f10) {
            return;
        }
        this.B0 = f10;
        di.n4 n4Var = this.z0;
        if (n4Var != null) {
            n4Var.setAlpha(f10);
            this.z0.setVisibility(f10 > 0.0f ? 0 : 8);
            this.z0.setClickable(this.A0);
        }
        requestLayout();
        invalidate();
        org.telegram.ui.gu guVar = this.E0;
        if (guVar != null) {
            guVar.run();
        }
    }

    public final void b(int i7, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i7;
        }
        this.k0.put(size, i7);
        this.l0.put(size, i10);
        this.m0.put(i7, size);
        int i11 = this.M;
        if (i11 != -1 && i11 == i7) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        oz ozVar = new oz(this, i7, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        ozVar.e = z11;
        ozVar.f = z12;
        this.N = org.telegram.messenger.f3.C(24.0f, ozVar.a(true), this.N);
        arrayList2.add(ozVar);
    }

    public final void c(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d0 = i7;
        this.e0 = i10;
        this.f0 = i11;
        this.g0 = i13;
        this.b0 = i12;
        org.telegram.ui.ActionBar.t6.J(this.G, i12, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.y0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new mz(this, 1));
        this.y.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            oz ozVar = (oz) arrayList.get(i7);
            if (ozVar.d != ((org.telegram.ui.tw) this.K).a(ozVar.a)) {
                if (((org.telegram.ui.tw) this.K).a(ozVar.a) < 0) {
                    continue;
                } else {
                    if (this.n0.get(i7) != ozVar.a(true) || this.i0) {
                        this.i0 = true;
                        requestLayout();
                        this.N = 0;
                        oz e10 = e();
                        if (e10 != null) {
                            e10.b(org.telegram.messenger.hd.N0(2131750795, null));
                        }
                        for (int i10 = 0; i10 < size; i10++) {
                            this.N = org.telegram.messenger.f3.C(24.0f, ((oz) arrayList.get(i10)).a(true), this.N);
                        }
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        this.G.setItemAnimator(this.t0);
                        this.J.f();
                        return;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.clipPath(this.G0);
        super.dispatchDraw(canvas);
        if (this.B0 <= 0.0f || this.z0 == null) {
            canvas2 = canvas;
        } else {
            int alpha = org.telegram.ui.ActionBar.m6.k0.getAlpha();
            org.telegram.ui.ActionBar.m6.k0.setAlpha((int) (alpha * this.B0));
            float top = this.z0.getTop();
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.g0.L(9.0f), top, getMeasuredWidth() - org.telegram.messenger.g0.L(9.0f), top, org.telegram.ui.ActionBar.m6.k0);
            org.telegram.ui.ActionBar.m6.k0.setAlpha(alpha);
        }
        canvas2.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        float f11;
        float f12;
        v4.f1 K;
        int i7;
        int i10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        di.b1 b1Var = this.G;
        if (view == b1Var) {
            getMeasuredHeight();
            int alpha = (int) (b1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.U;
            gradientDrawable.setAlpha(alpha);
            if (this.P || this.R != -1) {
                int L0 = this.I.L0();
                if (L0 == -1 || (K = b1Var.K(L0)) == null) {
                    f10 = 2.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    if (this.P) {
                        i7 = this.r0;
                        i10 = this.L;
                    } else {
                        i7 = this.L;
                        i10 = this.R;
                    }
                    SparseIntArray sparseIntArray = this.p0;
                    int i11 = sparseIntArray.get(i7);
                    int i12 = sparseIntArray.get(i10);
                    SparseIntArray sparseIntArray2 = this.n0;
                    f10 = 2.0f;
                    int i13 = sparseIntArray2.get(i7);
                    int i14 = sparseIntArray2.get(i10);
                    SparseIntArray sparseIntArray3 = this.o0;
                    sparseIntArray3.get(i7);
                    sparseIntArray3.get(i10);
                    float L = this.O != 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.W1(this.Q, i11, i12) : org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.W1(this.Q, i11, i12) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    f12 = org.telegram.messenger.g0.W1(this.Q, i13, i14);
                    f11 = L;
                }
            } else {
                v4.f1 K2 = b1Var.K(this.L);
                if (K2 != null) {
                    pz pzVar = (pz) K2.a;
                    f12 = Math.max(org.telegram.messenger.g0.L(16.0f), pzVar.a0 ? org.telegram.messenger.g0.T1(pzVar.j0, pzVar.d, pzVar.y) : pzVar.d);
                    f11 = (int) com.google.android.gms.internal.vision.e2.A(pzVar.a0 ? org.telegram.messenger.g0.T1(pzVar.j0 + org.telegram.messenger.g0.L(20.0f), pzVar.getMeasuredWidth(), pzVar.y) : pzVar.getMeasuredWidth(), f12, 2.0f, pzVar.getX());
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
                f10 = 2.0f;
            }
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(b1Var.getTranslationX(), 0.0f);
                canvas.scale(b1Var.getScaleX(), 1.0f, b1Var.getX() + b1Var.getPivotX(), b1Var.getPivotY());
                float f13 = this.O / f10;
                int measuredHeight = ((b1Var.getMeasuredHeight() / 2) + b1Var.getTop()) - org.telegram.messenger.g0.L(14.0f);
                gradientDrawable.setBounds((int) ((f11 - org.telegram.messenger.g0.L(12.5f)) - f13), measuredHeight, (int) (f11 + f12 + org.telegram.messenger.g0.L(12.5f) + f13), org.telegram.messenger.g0.L(28.0f) + measuredHeight);
                gradientDrawable.setAlpha(31);
                gradientDrawable.draw(canvas);
                canvas.restore();
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long min = Math.min(17L, elapsedRealtime - this.r);
        this.r = elapsedRealtime;
        boolean z10 = this.n;
        boolean z11 = true;
        if (z10 || this.w != 0.0f) {
            if (this.s) {
                float f14 = this.w;
                boolean z12 = f14 <= 0.0f;
                float f15 = (min / 420.0f) + f14;
                this.w = f15;
                if (!z10 && z12 && f15 >= 0.0f) {
                    this.w = 0.0f;
                }
                if (this.w >= 1.0f) {
                    this.w = 1.0f;
                    this.s = false;
                }
            } else {
                float f16 = this.w;
                r3 = f16 >= 0.0f;
                float f17 = f16 - (min / 420.0f);
                this.w = f17;
                if (!z10 && r3 && f17 <= 0.0f) {
                    this.w = 0.0f;
                }
                if (this.w <= -1.0f) {
                    this.w = -1.0f;
                    this.s = true;
                }
            }
            r3 = true;
        }
        if (z10) {
            float f18 = this.x;
            if (f18 < 1.0f) {
                float f19 = (min / 180.0f) + f18;
                this.x = f19;
                if (f19 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            z11 = r3;
        } else {
            if (!z10) {
                float f20 = this.x;
                if (f20 > 0.0f) {
                    float f21 = f20 - (min / 180.0f);
                    this.x = f21;
                    if (f21 < 0.0f) {
                        this.x = 0.0f;
                    }
                }
            }
            z11 = r3;
        }
        if (z11) {
            b1Var.g1();
            b1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final oz e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((oz) arrayList.get(i7)).e) {
                return (oz) arrayList.get(i7);
            }
            i7++;
        }
    }

    public final void f(int i7) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.T == i7 || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.T = i7;
        this.G.y0(i7);
    }

    public final void g(oz ozVar, int i7) {
        if (ozVar.f) {
            nz nzVar = this.K;
            if (nzVar != null) {
                ((org.telegram.ui.tw) nzVar).c(ozVar, false);
                return;
            }
            return;
        }
        int i10 = this.L;
        boolean z10 = i10 < i7;
        this.T = -1;
        this.r0 = i10;
        this.s0 = this.M;
        this.L = i7;
        this.M = ozVar.a;
        boolean z11 = this.P;
        ik ikVar = this.w0;
        if (z11) {
            org.telegram.messenger.g0.r(ikVar);
            this.P = false;
        }
        this.q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        org.telegram.messenger.g0.h3(ikVar, 16L);
        nz nzVar2 = this.K;
        if (nzVar2 != null) {
            ((org.telegram.ui.tw) nzVar2).c(ozVar, z10);
        }
        f(i7);
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        oz e10 = e();
        if (e10 == null) {
            return -1;
        }
        return e10.a;
    }

    public int getFirstTabId() {
        return this.k0.get(0, 0);
    }

    public int getLastTabId() {
        return this.k0.get(getTabsCount() - 1, 0);
    }

    public ek0 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public ek0 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public float getUnreadOnlyBannerHeight() {
        return org.telegram.messenger.g0.L(48.0f) * this.B0;
    }

    public final void h(float f10, int i7) {
        int i10 = this.m0.get(i7, -1);
        if (i10 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.R = i10;
            this.S = i7;
        } else {
            this.R = -1;
            this.S = -1;
        }
        this.Q = f10;
        di.b1 b1Var = this.G;
        b1Var.g1();
        b1Var.invalidate();
        invalidate();
        f(i10);
        if (f10 >= 1.0f) {
            this.R = -1;
            this.S = -1;
            this.L = i10;
            this.M = i7;
        }
    }

    public final boolean i(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.l0.get(i10, -1) == i7) {
                this.L = i10;
                this.M = this.k0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void j(org.telegram.ui.gu guVar, org.telegram.ui.gu guVar2) {
        this.D0 = guVar;
        this.E0 = guVar2;
    }

    public final void k(boolean z10, boolean z11) {
        if (this.A0 == z10 && (z11 || this.C0 == null)) {
            return;
        }
        this.A0 = z10;
        if (z10 && this.z0 == null) {
            di.n4 n4Var = new di.n4(this, getContext());
            this.z0 = n4Var;
            addView(n4Var, c8.ma.d(-1, 48.0f, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        ValueAnimator valueAnimator = this.C0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C0 = null;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            float f11 = this.B0;
            if (f11 != f10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new x(this, 24));
                this.C0.addListener(new mz(this, 0));
                this.C0.setDuration(320L);
                this.C0.setInterpolator(nr.h);
                this.C0.start();
                return;
            }
        }
        setUnreadOnlyBannerProgress(f10);
    }

    public final void l(int i7) {
        int i10 = 0;
        while (true) {
            di.b1 b1Var = this.G;
            if (i10 >= b1Var.getChildCount()) {
                return;
            }
            if (b1Var.getChildAt(i10) instanceof pz) {
                pz pzVar = (pz) b1Var.getChildAt(i10);
                if (pzVar.b.a == i7) {
                    pzVar.b(1.0f, 0);
                    try {
                        pzVar.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i10++;
        }
    }

    public final void m() {
        SparseIntArray sparseIntArray = this.p0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.n0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.o0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = this.H;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((oz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((oz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.O / 2) + i7);
            i7 += org.telegram.messenger.g0.L(24.0f) + a10 + this.O;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.h0 != i13) {
            this.h0 = i13;
            this.T = -1;
            if (this.P) {
                org.telegram.messenger.g0.r(this.w0);
                this.P = false;
                setEnabled(true);
                nz nzVar = this.K;
                if (nzVar != null) {
                    ((org.telegram.ui.tw) nzVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i7) - (this.H * 2);
            oz e10 = e();
            if (e10 != null) {
                e10.b(org.telegram.messenger.hd.N0(2131750795, null));
                int a10 = e10.a(false);
                e10.b(org.telegram.messenger.hd.N0(this.N > size ? 2131750794 : 2131750795, null));
                int a11 = e10.a(false) + (this.N - a10);
                int i11 = this.O;
                int size2 = a11 < size ? (size - a11) / arrayList.size() : 0;
                this.O = size2;
                if (i11 != size2) {
                    this.F = true;
                    di.b1 b1Var = this.G;
                    v4.n0 itemAnimator = b1Var.getItemAnimator();
                    b1Var.setItemAnimator(null);
                    this.J.f();
                    b1Var.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                m();
                this.i0 = false;
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + org.telegram.messenger.g0.L(36.0f) + getPaddingTop() + ((int) getUnreadOnlyBannerHeight()), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.Q = f10;
        di.b1 b1Var = this.G;
        b1Var.g1();
        b1Var.invalidate();
        invalidate();
        nz nzVar = this.K;
        if (nzVar != null) {
            ((org.telegram.ui.tw) nzVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.F0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(nz nzVar) {
        this.K = nzVar;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        di.b1 b1Var = this.G;
        b1Var.g1();
        b1Var.invalidate();
        this.J.f();
        invalidate();
        if (this.n || !this.E) {
            return;
        }
        org.telegram.messenger.ur.a0(org.telegram.messenger.k10.t0).y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList V0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).V0();
        int size = V0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.so soVar = (org.telegram.messenger.so) V0.get(i7);
            if (soVar.d()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(soVar.a));
            }
        }
        org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).p3();
        ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new fi.l5(20));
        this.E = false;
    }
}
