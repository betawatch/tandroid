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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class ez extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public boolean D;
    public boolean E;
    public final bi.q1 F;
    public final int G;
    public final jg.i0 H;
    public final org.telegram.ui.l4 I;
    public az J;
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
    public final org.telegram.ui.ActionBar.f6 a;
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
    public final xq i0;
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
    public final yy s0;
    public Drawable t0;
    public int u0;
    public final dt v0;
    public float w;
    public float w0;
    public float x;
    public final org.telegram.ui.Cells.f2 x0;
    public AnimatorSet y;
    public fh.g y0;
    public final Path z0;

    public ez(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.L = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.U = org.telegram.ui.ActionBar.k6.K8;
        this.V = org.telegram.ui.ActionBar.k6.I8;
        this.W = org.telegram.ui.ActionBar.k6.J8;
        this.a0 = org.telegram.ui.ActionBar.k6.L8;
        this.b0 = org.telegram.ui.ActionBar.k6.s8;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = xq.h;
        this.j0 = new SparseIntArray(5);
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        int i7 = 3;
        this.v0 = new dt(this, i7);
        this.x0 = new org.telegram.ui.Cells.f2(i7, this);
        this.z0 = new Path();
        this.a = f6Var;
        textPaint2.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.N(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.T = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        int i10 = 2;
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.U, f6Var));
        setHorizontalScrollBarEnabled(false);
        bi.q1 q1Var = new bi.q1(19, context, this);
        this.F = q1Var;
        q1Var.setClipChildren(false);
        yy yyVar = new yy(this);
        this.s0 = yyVar;
        yyVar.C = false;
        q1Var.setItemAnimator(yyVar);
        q1Var.setSelectorType(9);
        q1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.r6.m(q1Var, 20, this.a0, f6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, i10);
        this.H = i0Var;
        q1Var.setLayoutManager(i0Var);
        new v4.y(new dz(this)).h(q1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.G = max;
        q1Var.setPadding(max, 0, max, 0);
        q1Var.setClipToPadding(false);
        q1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i10, this, context);
        this.I = l4Var;
        l4Var.C(true);
        q1Var.setAdapter(l4Var);
        q1Var.setOnItemClickListener(new wy(this));
        q1Var.setOnItemLongClickListener(new wy(this));
        q1Var.setOnScrollListener(new ui(this, 7));
        q1Var.y2 = true;
        q1Var.setOverScrollMode(2);
        addView(q1Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, int i10, String str, ArrayList arrayList, boolean z9, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.L == -1) {
            this.L = i7;
        }
        this.j0.put(size, i7);
        this.k0.put(size, i10);
        this.l0.put(i7, size);
        int i11 = this.L;
        if (i11 != -1 && i11 == i7) {
            this.K = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        bz bzVar = new bz(this, i7, org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z9);
        bzVar.e = z10;
        bzVar.f = z11;
        this.M = org.telegram.messenger.k5.C(24.0f, bzVar.a(true), this.M);
        arrayList2.add(bzVar);
    }

    public final void b(int i7, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c0 = i7;
        this.d0 = i10;
        this.e0 = i11;
        this.f0 = i13;
        this.a0 = i12;
        org.telegram.ui.ActionBar.r6.K(this.F, i12, this.a);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.y = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.x0, 0.0f, 1.0f));
        this.y.setDuration(320L);
        this.y.addListener(new z5(this, 27));
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
        boolean z9 = false;
        for (int i7 = 0; i7 < size; i7++) {
            bz bzVar = (bz) arrayList.get(i7);
            if (bzVar.d != ((org.telegram.ui.nw) this.J).a(bzVar.a)) {
                if (((org.telegram.ui.nw) this.J).a(bzVar.a) < 0) {
                    continue;
                } else {
                    if (this.m0.get(i7) != bzVar.a(true) || this.h0) {
                        this.h0 = true;
                        requestLayout();
                        this.M = 0;
                        bz d = d();
                        if (d != null) {
                            d.b(org.telegram.messenger.hd.M0(2131750808, null));
                        }
                        for (int i10 = 0; i10 < size; i10++) {
                            this.M = org.telegram.messenger.k5.C(24.0f, ((bz) arrayList.get(i10)).a(true), this.M);
                        }
                        z9 = true;
                        if (z9) {
                            return;
                        }
                        this.F.setItemAnimator(this.s0);
                        this.I.f();
                        return;
                    }
                    z9 = true;
                }
            }
        }
        if (z9) {
        }
    }

    public final bz d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (((bz) arrayList.get(i7)).e) {
                return (bz) arrayList.get(i7);
            }
            i7++;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float f10;
        float f11;
        float f12;
        float f13;
        v4.d1 K;
        int i7;
        int i10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        bi.q1 q1Var = this.F;
        if (view == q1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (q1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.T;
            gradientDrawable.setAlpha(alpha);
            if (this.O || this.Q != -1) {
                int L0 = this.H.L0();
                if (L0 == -1 || (K = q1Var.K(L0)) == null) {
                    f10 = 2.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                } else {
                    if (this.O) {
                        i7 = this.q0;
                        i10 = this.K;
                    } else {
                        i7 = this.K;
                        i10 = this.Q;
                    }
                    SparseIntArray sparseIntArray = this.o0;
                    int i11 = sparseIntArray.get(i7);
                    int i12 = sparseIntArray.get(i10);
                    f10 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.m0;
                    int i13 = sparseIntArray2.get(i7);
                    int i14 = sparseIntArray2.get(i10);
                    f11 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.n0;
                    sparseIntArray3.get(i7);
                    sparseIntArray3.get(i10);
                    float L = this.N != 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.W1(this.P, i11, i12) : org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.W1(this.P, i11, i12) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    f13 = org.telegram.messenger.g0.W1(this.P, i13, i14);
                    f12 = L;
                }
            } else {
                v4.d1 K2 = q1Var.K(this.K);
                if (K2 != null) {
                    cz czVar = (cz) K2.a;
                    f13 = Math.max(org.telegram.messenger.g0.L(16.0f), czVar.W ? org.telegram.messenger.g0.T1(czVar.i0, czVar.d, czVar.y) : czVar.d);
                    f12 = (int) com.google.android.recaptcha.internal.a.A(czVar.W ? org.telegram.messenger.g0.T1(czVar.i0 + org.telegram.messenger.g0.L(20.0f), czVar.getMeasuredWidth(), czVar.y) : czVar.getMeasuredWidth(), f13, 2.0f, czVar.getX());
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
                canvas.translate(q1Var.getTranslationX(), f11);
                canvas.scale(q1Var.getScaleX(), 1.0f, q1Var.getX() + q1Var.getPivotX(), q1Var.getPivotY());
                float f14 = this.N / f10;
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
        boolean z9 = this.n;
        boolean z10 = true;
        float f15 = !z9 ? 0.0f : 0.0f;
        if (this.s) {
            float f16 = this.w;
            boolean z11 = f16 <= f15;
            float f17 = (min / 420.0f) + f16;
            this.w = f17;
            if (!z9 && z11 && f17 >= f15) {
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
            if (!z9 && r3 && f19 <= 0.0f) {
                this.w = 0.0f;
            }
            if (this.w <= -1.0f) {
                this.w = -1.0f;
                this.s = true;
            }
        }
        r3 = true;
        if (z9) {
            float f20 = this.x;
            if (f20 < 1.0f) {
                float f21 = (min / 180.0f) + f20;
                this.x = f21;
                if (f21 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            z10 = r3;
        } else {
            if (!z9) {
                float f22 = this.x;
                if (f22 > 0.0f) {
                    float f23 = f22 - (min / 180.0f);
                    this.x = f23;
                    if (f23 < 0.0f) {
                        this.x = 0.0f;
                    }
                }
            }
            z10 = r3;
        }
        if (z10) {
            q1Var.g1();
            q1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i7) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.S == i7 || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.S = i7;
        this.F.y0(i7);
    }

    public final void f(bz bzVar, int i7) {
        if (bzVar.f) {
            az azVar = this.J;
            if (azVar != null) {
                ((org.telegram.ui.nw) azVar).c(bzVar, false);
                return;
            }
            return;
        }
        int i10 = this.K;
        boolean z9 = i10 < i7;
        this.S = -1;
        this.q0 = i10;
        this.r0 = this.L;
        this.K = i7;
        this.L = bzVar.a;
        boolean z10 = this.O;
        dt dtVar = this.v0;
        if (z10) {
            org.telegram.messenger.g0.r(dtVar);
            this.O = false;
        }
        this.p0 = 0.0f;
        this.P = 0.0f;
        this.O = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(dtVar, 16L);
        az azVar2 = this.J;
        if (azVar2 != null) {
            ((org.telegram.ui.nw) azVar2).c(bzVar, z9);
        }
        e(i7);
    }

    public final void g(float f10, int i7) {
        int i10 = this.l0.get(i7, -1);
        if (i10 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.Q = i10;
            this.R = i7;
        } else {
            this.Q = -1;
            this.R = -1;
        }
        this.P = f10;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        invalidate();
        e(i10);
        if (f10 >= 1.0f) {
            this.Q = -1;
            this.R = -1;
            this.K = i10;
            this.L = i7;
        }
    }

    public int getCurrentTabId() {
        return this.L;
    }

    public int getCurrentTabStableId() {
        return this.k0.get(this.K, -1);
    }

    public int getDefaultTabId() {
        bz d = d();
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

    public pj0 getListView() {
        return this.F;
    }

    public int getSelectorColorKey() {
        return this.a0;
    }

    public Drawable getSelectorDrawable() {
        return this.T;
    }

    public pj0 getTabsContainer() {
        return this.F;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i7) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.k0.get(i10, -1) == i7) {
                this.K = i10;
                this.L = this.j0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i7) {
        int i10 = 0;
        while (true) {
            bi.q1 q1Var = this.F;
            if (i10 >= q1Var.getChildCount()) {
                return;
            }
            if (q1Var.getChildAt(i10) instanceof cz) {
                cz czVar = (cz) q1Var.getChildAt(i10);
                if (czVar.b.a == i7) {
                    czVar.b(1.0f, 0);
                    try {
                        czVar.performHapticFeedback(3);
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
        SparseIntArray sparseIntArray = this.o0;
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.m0;
        sparseIntArray2.clear();
        SparseIntArray sparseIntArray3 = this.n0;
        sparseIntArray3.clear();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = this.G;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((bz) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((bz) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.N / 2) + i7);
            i7 += org.telegram.messenger.g0.L(24.0f) + a10 + this.N;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.g0 != i13) {
            this.g0 = i13;
            this.S = -1;
            if (this.O) {
                org.telegram.messenger.g0.r(this.v0);
                this.O = false;
                setEnabled(true);
                az azVar = this.J;
                if (azVar != null) {
                    ((org.telegram.ui.nw) azVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i7) - (this.G * 2);
            bz d = d();
            if (d != null) {
                d.b(org.telegram.messenger.hd.M0(2131750808, null));
                int a10 = d.a(false);
                d.b(org.telegram.messenger.hd.M0(this.M > size ? 2131750807 : 2131750808, null));
                int a11 = d.a(false) + (this.M - a10);
                int i11 = this.N;
                int size2 = a11 < size ? (size - a11) / arrayList.size() : 0;
                this.N = size2;
                if (i11 != size2) {
                    this.E = true;
                    bi.q1 q1Var = this.F;
                    v4.l0 itemAnimator = q1Var.getItemAnimator();
                    q1Var.setItemAnimator(null);
                    this.I.f();
                    q1Var.setItemAnimator(itemAnimator);
                    this.E = false;
                }
                j();
                this.h0 = false;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.z0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i7 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.P = f10;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        invalidate();
        az azVar = this.J;
        if (azVar != null) {
            ((org.telegram.ui.nw) azVar).b(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.y0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(az azVar) {
        this.J = azVar;
    }

    public void setIsEditing(boolean z9) {
        this.n = z9;
        this.s = true;
        bi.q1 q1Var = this.F;
        q1Var.g1();
        q1Var.invalidate();
        this.I.f();
        invalidate();
        if (this.n || !this.D) {
            return;
        }
        org.telegram.messenger.yr.a0(org.telegram.messenger.p10.s0).y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).T0();
        int size = T0.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.get(i7);
            if (voVar.e()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(voVar.a));
            }
        }
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).i3();
        ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_messages_updateDialogFiltersOrder, new di.u5(20));
        this.D = false;
    }
}
