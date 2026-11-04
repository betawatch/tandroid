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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class bz extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public final Path A0;
    public boolean E;
    public boolean F;
    public final ci.j1 G;
    public final int H;
    public final kg.f0 I;
    public final org.telegram.ui.n4 J;
    public xy K;
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
    public final xq j0;
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
    public final vy t0;
    public Drawable u0;
    public int v0;
    public float w;
    public final lt w0;
    public float x;
    public float x0;
    public AnimatorSet y;
    public final org.telegram.ui.Cells.f2 y0;
    public gh.g z0;

    public bz(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.V = org.telegram.ui.ActionBar.k6.K8;
        this.W = org.telegram.ui.ActionBar.k6.I8;
        this.a0 = org.telegram.ui.ActionBar.k6.J8;
        this.b0 = org.telegram.ui.ActionBar.k6.L8;
        this.c0 = org.telegram.ui.ActionBar.k6.s8;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.j0 = xq.h;
        this.k0 = new SparseIntArray(5);
        this.l0 = new SparseIntArray(5);
        this.m0 = new SparseIntArray(5);
        this.n0 = new SparseIntArray(5);
        this.o0 = new SparseIntArray(5);
        this.p0 = new SparseIntArray(5);
        int i3 = 2;
        this.w0 = new lt(this, i3);
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
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.V, e6Var));
        setHorizontalScrollBarEnabled(false);
        ci.j1 j1Var = new ci.j1(19, context, this);
        this.G = j1Var;
        j1Var.setClipChildren(false);
        vy vyVar = new vy(this);
        this.t0 = vyVar;
        vyVar.C = false;
        j1Var.setItemAnimator(vyVar);
        j1Var.setSelectorType(9);
        j1Var.setSelectorRadius(6);
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.b0, e6Var);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, i3);
        this.I = f0Var;
        j1Var.setLayoutManager(f0Var);
        new u4.y(new az(this)).h(j1Var);
        int max = Math.max(0, org.telegram.messenger.g0.L(11.5f));
        this.H = max;
        j1Var.setPadding(max, 0, max, 0);
        j1Var.setClipToPadding(false);
        j1Var.setDrawSelectorBehind(true);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(i3, this, context);
        this.J = n4Var;
        n4Var.C(true);
        j1Var.setAdapter(n4Var);
        j1Var.setOnItemClickListener(new ty(this));
        j1Var.setOnItemLongClickListener(new ty(this));
        j1Var.setOnScrollListener(new ji(this, 9));
        j1Var.z2 = true;
        j1Var.setOverScrollMode(2);
        addView(j1Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, int i10, String str, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        if (size == 0 && this.M == -1) {
            this.M = i3;
        }
        this.k0.put(size, i3);
        this.l0.put(size, i10);
        this.m0.put(i3, size);
        int i11 = this.M;
        if (i11 != -1 && i11 == i3) {
            this.L = size;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        TextPaint textPaint = this.b;
        yy yyVar = new yy(this, i3, org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), arrayList, textPaint.getFontMetricsInt(), false), z10);
        yyVar.e = z11;
        yyVar.f = z12;
        this.N = org.telegram.messenger.k5.C(24.0f, yyVar.a(true), this.N);
        arrayList2.add(yyVar);
    }

    public final void b(int i3, int i10, int i11, int i12, int i13) {
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d0 = i3;
        this.e0 = i10;
        this.f0 = i11;
        this.g0 = i13;
        this.b0 = i12;
        org.telegram.ui.ActionBar.r6.K(this.G, i12, this.a);
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
        for (int i3 = 0; i3 < size; i3++) {
            yy yyVar = (yy) arrayList.get(i3);
            if (yyVar.d != ((org.telegram.ui.kw) this.K).a(yyVar.a)) {
                if (((org.telegram.ui.kw) this.K).a(yyVar.a) < 0) {
                    continue;
                } else {
                    if (this.n0.get(i3) != yyVar.a(true) || this.i0) {
                        this.i0 = true;
                        requestLayout();
                        this.N = 0;
                        yy d = d();
                        if (d != null) {
                            d.b(org.telegram.messenger.bd.M0(2131750808, null));
                        }
                        for (int i10 = 0; i10 < size; i10++) {
                            this.N = org.telegram.messenger.k5.C(24.0f, ((yy) arrayList.get(i10)).a(true), this.N);
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

    public final yy d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                return null;
            }
            if (((yy) arrayList.get(i3)).e) {
                return (yy) arrayList.get(i3);
            }
            i3++;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        float f11;
        float f12;
        float f13;
        u4.d1 K;
        int i3;
        int i10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ci.j1 j1Var = this.G;
        if (view == j1Var) {
            int measuredHeight = getMeasuredHeight();
            int alpha = (int) (j1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable = this.U;
            gradientDrawable.setAlpha(alpha);
            if (this.P || this.R != -1) {
                int L0 = this.I.L0();
                if (L0 == -1 || (K = j1Var.K(L0)) == null) {
                    f10 = 2.0f;
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                } else {
                    if (this.P) {
                        i3 = this.r0;
                        i10 = this.L;
                    } else {
                        i3 = this.L;
                        i10 = this.R;
                    }
                    SparseIntArray sparseIntArray = this.p0;
                    int i11 = sparseIntArray.get(i3);
                    int i12 = sparseIntArray.get(i10);
                    f10 = 2.0f;
                    SparseIntArray sparseIntArray2 = this.n0;
                    int i13 = sparseIntArray2.get(i3);
                    int i14 = sparseIntArray2.get(i10);
                    f11 = 0.0f;
                    SparseIntArray sparseIntArray3 = this.o0;
                    sparseIntArray3.get(i3);
                    sparseIntArray3.get(i10);
                    float L = this.O != 0 ? org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.W1(this.Q, i11, i12) : org.telegram.messenger.g0.L(12.0f) + (org.telegram.messenger.g0.W1(this.Q, i11, i12) - (sparseIntArray.get(L0) - K.a.getLeft()));
                    f13 = org.telegram.messenger.g0.W1(this.Q, i13, i14);
                    f12 = L;
                }
            } else {
                u4.d1 K2 = j1Var.K(this.L);
                if (K2 != null) {
                    zy zyVar = (zy) K2.a;
                    f13 = Math.max(org.telegram.messenger.g0.L(16.0f), zyVar.a0 ? org.telegram.messenger.g0.T1(zyVar.j0, zyVar.d, zyVar.y) : zyVar.d);
                    f12 = (int) com.google.android.recaptcha.internal.a.z(zyVar.a0 ? org.telegram.messenger.g0.T1(zyVar.j0 + org.telegram.messenger.g0.L(20.0f), zyVar.getMeasuredWidth(), zyVar.y) : zyVar.getMeasuredWidth(), f13, 2.0f, zyVar.getX());
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
                canvas.translate(j1Var.getTranslationX(), f11);
                canvas.scale(j1Var.getScaleX(), 1.0f, j1Var.getX() + j1Var.getPivotX(), j1Var.getPivotY());
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
            j1Var.g1();
            j1Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public final void e(int i3) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.T == i3 || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        this.T = i3;
        this.G.y0(i3);
    }

    public final void f(yy yyVar, int i3) {
        if (yyVar.f) {
            xy xyVar = this.K;
            if (xyVar != null) {
                ((org.telegram.ui.kw) xyVar).c(yyVar, false);
                return;
            }
            return;
        }
        int i10 = this.L;
        boolean z10 = i10 < i3;
        this.T = -1;
        this.r0 = i10;
        this.s0 = this.M;
        this.L = i3;
        this.M = yyVar.a;
        boolean z11 = this.P;
        lt ltVar = this.w0;
        if (z11) {
            org.telegram.messenger.g0.r(ltVar);
            this.P = false;
        }
        this.q0 = 0.0f;
        this.Q = 0.0f;
        this.P = true;
        setEnabled(false);
        org.telegram.messenger.g0.i3(ltVar, 16L);
        xy xyVar2 = this.K;
        if (xyVar2 != null) {
            ((org.telegram.ui.kw) xyVar2).c(yyVar, z10);
        }
        e(i3);
    }

    public final void g(float f10, int i3) {
        int i10 = this.m0.get(i3, -1);
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
            this.S = i3;
        } else {
            this.R = -1;
            this.S = -1;
        }
        this.Q = f10;
        ci.j1 j1Var = this.G;
        j1Var.g1();
        j1Var.invalidate();
        invalidate();
        e(i10);
        if (f10 >= 1.0f) {
            this.R = -1;
            this.S = -1;
            this.L = i10;
            this.M = i3;
        }
    }

    public int getCurrentTabId() {
        return this.M;
    }

    public int getCurrentTabStableId() {
        return this.l0.get(this.L, -1);
    }

    public int getDefaultTabId() {
        yy d = d();
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

    public tj0 getListView() {
        return this.G;
    }

    public int getSelectorColorKey() {
        return this.b0;
    }

    public Drawable getSelectorDrawable() {
        return this.U;
    }

    public tj0 getTabsContainer() {
        return this.G;
    }

    public int getTabsCount() {
        return this.h.size();
    }

    public final boolean h(int i3) {
        for (int i10 = 0; i10 < this.h.size(); i10++) {
            if (this.l0.get(i10, -1) == i3) {
                this.L = i10;
                this.M = this.k0.get(i10);
                return true;
            }
        }
        return false;
    }

    public final void i(int i3) {
        int i10 = 0;
        while (true) {
            ci.j1 j1Var = this.G;
            if (i10 >= j1Var.getChildCount()) {
                return;
            }
            if (j1Var.getChildAt(i10) instanceof zy) {
                zy zyVar = (zy) j1Var.getChildAt(i10);
                if (zyVar.b.a == i3) {
                    zyVar.b(1.0f, 0);
                    try {
                        zyVar.performHapticFeedback(3);
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
        int i3 = this.H;
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = ((yy) arrayList.get(i10)).a(false);
            sparseIntArray2.put(i10, a10);
            sparseIntArray3.put(i10, ((yy) arrayList.get(i10)).d);
            sparseIntArray.put(i10, (this.O / 2) + i3);
            i3 += org.telegram.messenger.g0.L(24.0f) + a10 + this.O;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        if (this.h0 != i13) {
            this.h0 = i13;
            this.T = -1;
            if (this.P) {
                org.telegram.messenger.g0.r(this.w0);
                this.P = false;
                setEnabled(true);
                xy xyVar = this.K;
                if (xyVar != null) {
                    ((org.telegram.ui.kw) xyVar).b(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = View.MeasureSpec.getSize(i3) - (this.H * 2);
            yy d = d();
            if (d != null) {
                d.b(org.telegram.messenger.bd.M0(2131750808, null));
                int a10 = d.a(false);
                d.b(org.telegram.messenger.bd.M0(this.N > size ? 2131750807 : 2131750808, null));
                int a11 = d.a(false) + (this.N - a10);
                int i11 = this.O;
                int size2 = a11 < size ? (size - a11) / arrayList.size() : 0;
                this.O = size2;
                if (i11 != size2) {
                    this.F = true;
                    ci.j1 j1Var = this.G;
                    u4.m0 itemAnimator = j1Var.getItemAnimator();
                    j1Var.setItemAnimator(null);
                    this.J.f();
                    j1Var.setItemAnimator(itemAnimator);
                    this.F = false;
                }
                j();
                this.i0 = false;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.A0;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i3 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
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
        ci.j1 j1Var = this.G;
        j1Var.g1();
        j1Var.invalidate();
        invalidate();
        xy xyVar = this.K;
        if (xyVar != null) {
            ((org.telegram.ui.kw) xyVar).b(f10);
        }
    }

    public void setBlurredBackground(gh.g gVar) {
        this.z0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(xy xyVar) {
        this.K = xyVar;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.s = true;
        ci.j1 j1Var = this.G;
        j1Var.g1();
        j1Var.invalidate();
        this.J.f();
        invalidate();
        if (this.n || !this.E) {
            return;
        }
        org.telegram.messenger.qr.a0(org.telegram.messenger.h10.t0).y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList T0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).T0();
        int size = T0.size();
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.get(i3);
            if (moVar.e()) {
                tL_messages_updateDialogFiltersOrder.order.add(0);
            } else {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(moVar.a));
            }
        }
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).i3();
        ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).sendRequest(tL_messages_updateDialogFiltersOrder, new ei.u5(20));
        this.E = false;
    }
}
