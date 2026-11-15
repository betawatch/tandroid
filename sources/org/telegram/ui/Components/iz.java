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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class iz extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public final Path A0;
    public boolean E;
    public boolean F;
    public final di.c1 G;
    public final int H;
    public final jg.i0 I;
    public final org.telegram.ui.l4 J;
    public ez K;
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
    public final org.telegram.ui.ActionBar.e6 a;
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
    public final er j0;
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
    public final cz t0;
    public Drawable u0;
    public int v0;
    public float w;
    public final zj w0;
    public float x;
    public float x0;
    public AnimatorSet y;
    public final org.telegram.ui.Cells.f2 y0;
    public fh.g z0;

    public iz(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.V = org.telegram.ui.ActionBar.j6.K8;
        this.W = org.telegram.ui.ActionBar.j6.I8;
        this.a0 = org.telegram.ui.ActionBar.j6.J8;
        this.b0 = org.telegram.ui.ActionBar.j6.L8;
        this.c0 = org.telegram.ui.ActionBar.j6.s8;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = er.h;
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        this.w0 = new zj(this, 6);
        this.y0 = new org.telegram.ui.Cells.f2(3, this);
        this.A0 = new Path();
        this.a = e6Var;
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
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.w0(this.V, e6Var));
        setHorizontalScrollBarEnabled(false);
        di.c1 c1Var = new di.c1(19, context, this);
        this.G = c1Var;
        c1Var.setClipChildren(false);
        cz czVar = new cz(this);
        this.t0 = czVar;
        czVar.C = false;
        c1Var.setItemAnimator(czVar);
        c1Var.setSelectorType(9);
        c1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.q6.l(c1Var, 20, this.b0, e6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, i7);
        this.I = i0Var;
        c1Var.setLayoutManager(i0Var);
        new v4.y(new hz(this)).h(c1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.H = max;
        c1Var.setPadding(max, 0, max, 0);
        c1Var.setClipToPadding(false);
        c1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i7, this, context);
        this.J = l4Var;
        l4Var.C(true);
        c1Var.setAdapter(l4Var);
        c1Var.setOnItemClickListener(new az(this));
        c1Var.setOnItemLongClickListener(new az(this));
        c1Var.setOnScrollListener(new ri(this, 9));
        c1Var.z2 = true;
        c1Var.setOverScrollMode(2);
        addView(c1Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
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
        fz fzVar = new fz(this, i7, org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        fzVar.e = z11;
        fzVar.f = z12;
        this.N = org.telegram.messenger.k5.C(24.0f, fzVar.a(true), this.N);
        arrayList2.add(fzVar);
    }

    public final void b(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d0 = i7;
        this.e0 = i10;
        this.f0 = i11;
        this.g0 = i13;
        this.b0 = i12;
        org.telegram.ui.ActionBar.q6.J(this.G, i12, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.y0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new x5(this, 27));
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
        for (int i7 = 0; i7 < size; i7++) {
            fz fzVar = (fz) arrayList.get(i7);
            if (fzVar.d != ((org.telegram.ui.pw) this.K).a(fzVar.a)) {
                if (((org.telegram.ui.pw) this.K).a(fzVar.a) < 0) {
                    continue;
                } else {
                    if (this.n0.get(i7) != fzVar.a(true) || this.i0) {
                        this.i0 = true;
                        requestLayout();
                        this.N = 0;
                        fz d = d();
                        if (d != null) {
                            d.b(org.telegram.messenger.hd.M0(2131750807, null));
                        }
                        for (int i10 = 0; i10 < size; i10++) {
                            this.N = org.telegram.messenger.k5.C(24.0f, ((fz) arrayList.get(i10)).a(true), this.N);
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

    public final fz d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((fz) arrayList.get(i7)).e) {
                return (fz) arrayList.get(i7);
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.A0);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        float f11;
        float f12;
        float f13;
        v4.e1 K;
        int i7;
        int i10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        di.c1 c1Var = this.G;
        if (view == c1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (c1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.U;
            gradientDrawable.setAlpha(alpha);
            if (this.P || this.R != -1) {
                int L0 = this.I.L0();
                if (L0 == -1 || (K = c1Var.K(L0)) == null) {
                    f10 = 2.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
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
                    f10 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.n0;
                    int i13 = sparseIntArray2.get(i7);
                    int i14 = sparseIntArray2.get(i10);
                    f11 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.o0;
                    sparseIntArray3.get(i7);
                    sparseIntArray3.get(i10);
                    float L = this.O != 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.W1(this.Q, i11, i12) : org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.W1(this.Q, i11, i12) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    f13 = org.telegram.messenger.g0.W1(this.Q, i13, i14);
                    f12 = L;
                }
            } else {
                v4.e1 K2 = c1Var.K(this.L);
                if (K2 != null) {
                    gz gzVar = (gz) K2.a;
                    f13 = Math.max(org.telegram.messenger.g0.L(16.0f), gzVar.a0 ? org.telegram.messenger.g0.T1(gzVar.j0, gzVar.d, gzVar.y) : gzVar.d);
                    f12 = (int) com.google.android.gms.internal.vision.e2.A(gzVar.a0 ? org.telegram.messenger.g0.T1(gzVar.j0 + org.telegram.messenger.g0.L(20.0f), gzVar.getMeasuredWidth(), gzVar.y) : gzVar.getMeasuredWidth(), f13, 2.0f, gzVar.getX());
                    f10 = 2.0f;
                    f11 = 0.0f;
                } else {
                    f10 = 2.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                }
            }
            if (f13 != f11) {
                canvas.save();
                canvas.translate(c1Var.getTranslationX(), f11);
                canvas.scale(c1Var.getScaleX(), 1.0f, c1Var.getX() + c1Var.getPivotX(), c1Var.getPivotY());
                float f14 = this.O / f10;
                int L2 = (measuredHeight / 2) - org.telegram.messenger.g0.L(14.0f);
                gradientDrawable.setBounds((int) ((f12 - org.telegram.messenger.g0.L(12.5f)) - f14), L2, (int) (f12 + f13 + org.telegram.messenger.g0.L(12.5f) + f14), org.telegram.messenger.g0.L(28.0f) + L2);
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
        float f15 = !z10 ? 0.0f : 0.0f;
        if (this.s) {
            float f16 = this.w;
            boolean z12 = f16 <= f15;
            float f17 = (min / 420.0f) + f16;
            this.w = f17;
            if (!z10 && z12 && f17 >= f15) {
                this.w = f15;
            }
            if (this.w >= 1.0f) {
                this.w = 1.0f;
                this.s = false;
            }
        } else {
            float f18 = this.w;
            r3 = f18 >= 0.0f;
            float f19 = f18 - (min / 420.0f);
            this.w = f19;
            if (!z10 && r3 && f19 <= 0.0f) {
                this.w = 0.0f;
            }
            if (this.w <= -1.0f) {
                this.w = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z10) {
            float f20 = this.x;
            if (f20 < 1.0f) {
                float f21 = (min / 180.0f) + f20;
                this.x = f21;
                if (f21 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            z11 = r3;
        } else {
            if (!z10) {
                float f22 = this.x;
                if (f22 > 0.0f) {
                    float f23 = f22 - (min / 180.0f);
                    this.x = f23;
                    if (f23 < 0.0f) {
                        this.x = 0.0f;
                    }
                }
            }
            z11 = r3;
        }
        if (z11) {
            c1Var.g1();
            c1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i7) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.T == i7 || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.T = i7;
        this.G.y0(i7);
    }

    public final void f(fz fzVar, int i7) {
        if (fzVar.f) {
            ez ezVar = this.K;
            if (ezVar != null) {
                ((org.telegram.ui.pw) ezVar).c(fzVar, false);
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
        this.M = fzVar.a;
        boolean z11 = this.P;
        zj zjVar = this.w0;
        if (z11) {
            org.telegram.messenger.g0.r(zjVar);
            this.P = false;
        }
        this.q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(zjVar, 16L);
        ez ezVar2 = this.K;
        if (ezVar2 != null) {
            ((org.telegram.ui.pw) ezVar2).c(fzVar, z10);
        }
        e(i7);
    }

    public final void g(float f10, int i7) {
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
        di.c1 c1Var = this.G;
        c1Var.g1();
        c1Var.invalidate();
        invalidate();
        e(i10);
        if (f10 >= 1.0f) {
            this.R = -1;
            this.S = -1;
            this.L = i10;
            this.M = i7;
        }
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        fz d = d();
        if (d == null) {
            return -1;
        }
        return d.a;
    }

    public int getFirstTabId() {
        return this.k0.get(0, 0);
    }

    public int getLastTabId() {
        return this.k0.get(getTabsCount() - 1, 0);
    }

    public uj0 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public uj0 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.l0.get(i10, -1) == i7) {
                this.L = i10;
                this.M = this.k0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i7) {
        int i10 = 0;
        while (true) {
            di.c1 c1Var = this.G;
            if (i10 >= c1Var.getChildCount()) {
                return;
            }
            if (c1Var.getChildAt(i10) instanceof gz) {
                gz gzVar = (gz) c1Var.getChildAt(i10);
                if (gzVar.b.a == i7) {
                    gzVar.b(1.0f, 0);
                    try {
                        gzVar.performHapticFeedback(3);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            i10++;
        }
    }

    public final void j() {
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
            int a10 = ((fz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((fz) arrayList.get(i10)).d);
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
                ez ezVar = this.K;
                if (ezVar != null) {
                    ((org.telegram.ui.pw) ezVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i7) - (this.H * 2);
            fz d = d();
            if (d != null) {
                d.b(org.telegram.messenger.hd.M0(2131750807, null));
                int a10 = d.a(false);
                d.b(org.telegram.messenger.hd.M0(this.N > size ? 2131750806 : 2131750807, null));
                int a11 = d.a(false) + (this.N - a10);
                int i11 = this.O;
                int size2 = a11 < size ? (size - a11) / arrayList.size() : 0;
                this.O = size2;
                if (i11 != size2) {
                    this.F = true;
                    di.c1 c1Var = this.G;
                    v4.m0 itemAnimator = c1Var.getItemAnimator();
                    c1Var.setItemAnimator(null);
                    this.J.f();
                    c1Var.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                j();
                this.i0 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.A0;
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
        di.c1 c1Var = this.G;
        c1Var.g1();
        c1Var.invalidate();
        invalidate();
        ez ezVar = this.K;
        if (ezVar != null) {
            ((org.telegram.ui.pw) ezVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.z0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(ez ezVar) {
        this.K = ezVar;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        di.c1 c1Var = this.G;
        c1Var.g1();
        c1Var.invalidate();
        this.J.f();
        invalidate();
        if (this.n || !this.E) {
            return;
        }
        org.telegram.messenger.vr.a0(org.telegram.messenger.m10.t0).y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).T0();
        int size = T0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.so soVar = (org.telegram.messenger.so) T0.get(i7);
            if (soVar.e()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(soVar.a));
            }
        }
        org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).i3();
        ConnectionsManager.getInstance(org.telegram.messenger.m10.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new fi.m5(20));
        this.E = false;
    }
}
