package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class tz extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public boolean D;
    public boolean E;
    public final ag.b1 F;
    public final int G;
    public final org.telegram.ui.br H;
    public final fg.j I;
    public oz J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final GradientDrawable T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.ActionBar.p6 a;
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
    public boolean h0;
    public final gr i0;
    public final SparseIntArray j0;
    public final SparseIntArray k0;
    public final SparseIntArray l0;
    public final SparseIntArray m0;
    public boolean n;
    public final SparseIntArray n0;
    public final SparseIntArray o0;
    public float p0;
    public int q0;
    public long r;
    public int r0;
    public boolean s;
    public final mz s0;
    public Drawable t0;
    public int u0;
    public final ew v0;
    public float w;
    public float w0;
    public float x;
    public final org.telegram.ui.Cells.f2 x0;
    public AnimatorSet y;
    public vg.f y0;
    public final Path z0;

    public tz(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = 1;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.d = textPaint3;
        this.e = new Paint(1);
        this.f = new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN);
        this.h = new ArrayList();
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.t6.K8;
        this.V = org.telegram.ui.ActionBar.t6.I8;
        this.W = org.telegram.ui.ActionBar.t6.J8;
        this.a0 = org.telegram.ui.ActionBar.t6.L8;
        this.b0 = org.telegram.ui.ActionBar.t6.s8;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = gr.h;
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.v0 = new ew(this, i10);
        int i11 = 3;
        this.x0 = new org.telegram.ui.Cells.f2(i11, this);
        this.z0 = new Path();
        this.a = p6Var;
        textPaint2.setTextSize(org.telegram.messenger.i0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float N = org.telegram.messenger.i0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.U, p6Var));
        setHorizontalScrollBarEnabled(false);
        ag.b1 b1Var = new ag.b1(this, context, 14);
        this.F = b1Var;
        b1Var.setClipChildren(false);
        mz mzVar = new mz(this);
        this.s0 = mzVar;
        mzVar.C = false;
        b1Var.setItemAnimator(mzVar);
        b1Var.setSelectorType(9);
        b1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.a0, p6Var);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, i10);
        this.H = brVar;
        b1Var.setLayoutManager(brVar);
        new s4.x(new sz(this)).h(b1Var);
        int max = Math.max(0, org.telegram.messenger.i0.L(11.5f));
        this.G = max;
        b1Var.setPadding(max, 0, max, 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        fg.j jVar = new fg.j(i11, this, context);
        this.I = jVar;
        jVar.C(true);
        b1Var.setAdapter(jVar);
        b1Var.setOnItemClickListener(new kz(this));
        b1Var.setOnItemLongClickListener(new kz(this));
        b1Var.setOnScrollListener(new ag.u(this, 22));
        b1Var.y2 = true;
        b1Var.setOverScrollMode(2);
        addView(b1Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, int i11, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i10;
        }
        this.j0.put(size, i10);
        this.k0.put(size, i11);
        this.l0.put(i10, size);
        int i12 = this.L;
        if (i12 != -1 && i12 == i10) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        pz pzVar = new pz(this, i10, org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        pzVar.e = z11;
        pzVar.f = z12;
        this.M = org.telegram.messenger.m5.C(24.0f, pzVar.a(true), this.M);
        arrayList2.add(pzVar);
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c0 = i10;
        this.d0 = i11;
        this.e0 = i12;
        this.f0 = i14;
        this.a0 = i13;
        org.telegram.ui.ActionBar.a7.K(this.F, i13, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.x0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new w5(this, 27));
        this.y.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            pz pzVar = (pz) arrayList.get(i10);
            if (pzVar.d != ((org.telegram.ui.rx) this.J).a(pzVar.a)) {
                if (((org.telegram.ui.rx) this.J).a(pzVar.a) < 0) {
                    continue;
                } else {
                    if (this.m0.get(i10) != pzVar.a(true) || this.h0) {
                        this.h0 = true;
                        requestLayout();
                        this.M = 0;
                        pz d = d();
                        if (d != null) {
                            d.b(org.telegram.messenger.cd.L0(2131750808, null));
                        }
                        for (int i11 = 0; i11 < size; i11++) {
                            this.M = org.telegram.messenger.m5.C(24.0f, ((pz) arrayList.get(i11)).a(true), this.M);
                        }
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        this.F.setItemAnimator(this.s0);
                        this.I.f();
                        return;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
        }
    }

    public final pz d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((pz) arrayList.get(i10)).e) {
                return (pz) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.z0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x017b, code lost:
    
        if (r16.w != 0.0f) goto L44;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        s4.c1 K;
        int i10;
        int i11;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ag.b1 b1Var = this.F;
        if (view == b1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (b1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.T;
            gradientDrawable.setAlpha(alpha);
            if (this.O || this.Q != -1) {
                int L0 = this.H.L0();
                if (L0 == -1 || (K = b1Var.K(L0)) == null) {
                    f7 = 2.0f;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    if (this.O) {
                        i10 = this.q0;
                        i11 = this.K;
                    } else {
                        i10 = this.K;
                        i11 = this.Q;
                    }
                    SparseIntArray sparseIntArray = this.o0;
                    int i12 = sparseIntArray.get(i10);
                    int i13 = sparseIntArray.get(i11);
                    f7 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.m0;
                    int i14 = sparseIntArray2.get(i10);
                    int i15 = sparseIntArray2.get(i11);
                    f10 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.n0;
                    sparseIntArray3.get(i10);
                    sparseIntArray3.get(i11);
                    float L = this.N != 0 ? org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.W1(this.P, i12, i13) : org.telegram.messenger.i0.L(12.0f) + (org.telegram.messenger.i0.W1(this.P, i12, i13) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    f12 = org.telegram.messenger.i0.W1(this.P, i14, i15);
                    f11 = L;
                }
            } else {
                s4.c1 K2 = b1Var.K(this.K);
                if (K2 != null) {
                    rz rzVar = (rz) K2.a;
                    f12 = Math.max(org.telegram.messenger.i0.L(16.0f), rzVar.W ? org.telegram.messenger.i0.T1(rzVar.i0, rzVar.d, rzVar.y) : rzVar.d);
                    f11 = (int) c3.i0.B(rzVar.W ? org.telegram.messenger.i0.T1(rzVar.i0 + org.telegram.messenger.i0.L(20.0f), rzVar.getMeasuredWidth(), rzVar.y) : rzVar.getMeasuredWidth(), f12, 2.0f, rzVar.getX());
                    f7 = 2.0f;
                    f10 = 0.0f;
                } else {
                    f7 = 2.0f;
                    f10 = 0.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
            }
            if (f12 != f10) {
                canvas.save();
                canvas.translate(b1Var.getTranslationX(), f10);
                canvas.scale(b1Var.getScaleX(), 1.0f, b1Var.getX() + b1Var.getPivotX(), b1Var.getPivotY());
                float f13 = this.N / f7;
                int L2 = (measuredHeight / 2) - org.telegram.messenger.i0.L(14.0f);
                gradientDrawable.setBounds((int) ((f11 - org.telegram.messenger.i0.L(12.5f)) - f13), L2, (int) (f11 + f12 + org.telegram.messenger.i0.L(12.5f) + f13), org.telegram.messenger.i0.L(28.0f) + L2);
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
        float f14 = !z10 ? 0.0f : 0.0f;
        if (this.s) {
            float f15 = this.w;
            boolean z12 = f15 <= f14;
            float f16 = (min / 420.0f) + f15;
            this.w = f16;
            if (!z10 && z12 && f16 >= f14) {
                this.w = f14;
            }
            if (this.w >= 1.0f) {
                this.w = 1.0f;
                this.s = false;
            }
        } else {
            float f17 = this.w;
            r3 = f17 >= 0.0f;
            float f18 = f17 - (min / 420.0f);
            this.w = f18;
            if (!z10 && r3 && f18 <= 0.0f) {
                this.w = 0.0f;
            }
            if (this.w <= -1.0f) {
                this.w = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z10) {
            float f19 = this.x;
            if (f19 < 1.0f) {
                float f20 = (min / 180.0f) + f19;
                this.x = f20;
                if (f20 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            z11 = r3;
        } else {
            if (!z10) {
                float f21 = this.x;
                if (f21 > 0.0f) {
                    float f22 = f21 - (min / 180.0f);
                    this.x = f22;
                    if (f22 < 0.0f) {
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

    public final void e(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.S == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.S = i10;
        this.F.y0(i10);
    }

    public final void f(pz pzVar, int i10) {
        if (pzVar.f) {
            oz ozVar = this.J;
            if (ozVar != null) {
                ((org.telegram.ui.rx) ozVar).c(pzVar, false);
                return;
            }
            return;
        }
        int i11 = this.K;
        boolean z10 = i11 < i10;
        this.S = -1;
        this.q0 = i11;
        this.r0 = this.L;
        this.K = i10;
        this.L = pzVar.a;
        boolean z11 = this.O;
        ew ewVar = this.v0;
        if (z11) {
            org.telegram.messenger.i0.r(ewVar);
            this.O = false;
        }
        this.p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        org.telegram.messenger.i0.h3(ewVar, 16L);
        oz ozVar2 = this.J;
        if (ozVar2 != null) {
            ((org.telegram.ui.rx) ozVar2).c(pzVar, z10);
        }
        e(i10);
    }

    public final void g(float f7, int i10) {
        int i11 = this.l0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            this.Q = i11;
            this.R = i10;
        } else {
            this.Q = -1;
            this.R = -1;
        }
        this.P = f7;
        ag.b1 b1Var = this.F;
        b1Var.g1();
        b1Var.invalidate();
        invalidate();
        e(i11);
        if (f7 >= 1.0f) {
            this.Q = -1;
            this.R = -1;
            this.K = i11;
            this.L = i10;
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        pz d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.j0.get(0, 0);
    }

    public int getLastTabId() {
        return this.j0.get(getTabsCount() - 1, 0);
    }

    public tk0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public tk0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i10) {
        for (int i11 = 0; i11 < this.h.size(); i11++) {
            if (this.k0.get(i11, -1) == i10) {
                this.K = i11;
                this.L = this.j0.get(i11);
                return true;
            }
        }
        return false;
    }

    public final void i(int i10) {
        int i11 = 0;
        while (true) {
            ag.b1 b1Var = this.F;
            if (i11 >= b1Var.getChildCount()) {
                return;
            }
            if (b1Var.getChildAt(i11) instanceof rz) {
                rz rzVar = (rz) b1Var.getChildAt(i11);
                if (rzVar.b.a == i10) {
                    rzVar.b(1.0f, 0);
                    try {
                        rzVar.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i11++;
        }
    }

    public final void j() {
        SparseIntArray sparseIntArray = this.o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = this.G;
        for (int i11 = 0; i11 < size; i11++) {
            int a2 = ((pz) arrayList.get(i11)).a(false);
            sparseIntArray2.put(i11, a2);
            sparseIntArray3.put(i11, ((pz) arrayList.get(i11)).d);
            sparseIntArray.put(i11, (this.N / 2) + i10);
            i10 += org.telegram.messenger.i0.L(24.0f) + a2 + this.N;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.g0 != i14) {
            this.g0 = i14;
            this.S = -1;
            if (this.O) {
                org.telegram.messenger.i0.r(this.v0);
                this.O = false;
                setEnabled(true);
                oz ozVar = this.J;
                if (ozVar != null) {
                    ((org.telegram.ui.rx) ozVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i10) - (this.G * 2);
            pz d = d();
            if (d != null) {
                d.b(org.telegram.messenger.cd.L0(2131750808, null));
                int a2 = d.a(false);
                d.b(org.telegram.messenger.cd.L0(this.M > size ? 2131750807 : 2131750808, null));
                int a10 = d.a(false) + (this.M - a2);
                int i12 = this.N;
                int size2 = a10 < size ? (size - a10) / arrayList.size() : 0;
                this.N = size2;
                if (i12 != size2) {
                    this.E = true;
                    ag.b1 b1Var = this.F;
                    s4.l0 itemAnimator = b1Var.getItemAnimator();
                    b1Var.setItemAnimator(null);
                    this.I.f();
                    b1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.h0 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.z0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), i10 - org.telegram.messenger.i0.L(9.0f), i11 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.P = f7;
        ag.b1 b1Var = this.F;
        b1Var.g1();
        b1Var.invalidate();
        invalidate();
        oz ozVar = this.J;
        if (ozVar != null) {
            ((org.telegram.ui.rx) ozVar).b(f7);
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.y0 = fVar;
        setBackground(fVar);
    }

    public void setDelegate(oz ozVar) {
        this.J = ozVar;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        ag.b1 b1Var = this.F;
        b1Var.g1();
        b1Var.invalidate();
        this.I.f();
        invalidate();
        if (this.n || !this.D) {
            return;
        }
        org.telegram.messenger.hs.a0(org.telegram.messenger.d20.s0).y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList S0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).S0();
        int size = S0.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.get(i10);
            if (apVar.e()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(apVar.a));
            }
        }
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).g3();
        ConnectionsManager.getInstance(org.telegram.messenger.d20.s0).sendRequest(tL_messages_updateDialogFiltersOrder, new ag.c3(15));
        this.D = false;
    }
}
