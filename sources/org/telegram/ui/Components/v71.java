package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class v71 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int s0 = 0;
    public u71 D;
    public final int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public float K;
    public int L;
    public int M;
    public int N;
    public final GradientDrawable O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public float W;
    public float a;
    public final gr a0;
    public org.telegram.messenger.k20 b;
    public final SparseIntArray b0;
    public final TextPaint c;
    public final SparseIntArray c0;
    public final TextPaint d;
    public final SparseIntArray d0;
    public final TextPaint e;
    public final SparseIntArray e0;
    public final Paint f;
    public float f0;
    public int g0;
    public final ArrayList h;
    public int h0;
    public final ew i0;
    public final org.telegram.ui.ActionBar.p6 j0;
    public ValueAnimator k0;
    public org.telegram.messenger.k20 l0;
    public boolean m0;
    public boolean n;
    public s4.x n0;
    public r71 o0;
    public float p0;
    public final Paint q0;
    public int r;
    public vg.f r0;
    public boolean s;
    public final ag.b1 w;
    public final org.telegram.ui.br x;
    public final fg.j y;

    public v71(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i11;
        int i12;
        this.a = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.h = new ArrayList();
        this.r = 16;
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.t6.ui;
        this.Q = org.telegram.ui.ActionBar.t6.ti;
        this.R = org.telegram.ui.ActionBar.t6.si;
        this.S = org.telegram.ui.ActionBar.t6.vi;
        this.T = org.telegram.ui.ActionBar.t6.s8;
        this.a0 = gr.h;
        int i13 = 5;
        this.b0 = new SparseIntArray(5);
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        this.i0 = new ew(this, 15);
        this.q0 = new Paint(1);
        this.j0 = p6Var;
        this.E = i10;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L((i10 == 9 || i10 == 10 || i10 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.P, p6Var));
        int i14 = 8;
        if (i10 == -2) {
            float N = org.telegram.messenger.i0.N(13.0f);
            i11 = 7;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i12 = 3;
        } else {
            i11 = 7;
            float N2 = org.telegram.messenger.i0.N(3.0f);
            i12 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ag.b1 b1Var = new ag.b1(this, context, 24);
        this.w = b1Var;
        b1Var.setOverScrollMode(2);
        if (z10) {
            b1Var.setItemAnimator(null);
        } else {
            ((s4.j) b1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            b1Var.setSelectorType(9);
            b1Var.setSelectorRadius(6);
        } else {
            b1Var.setSelectorType(i10 == 10 ? 9 : i10);
            if (i10 == i12) {
                b1Var.setSelectorRadius(0);
            } else {
                b1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.a7.m(b1Var, 20, this.S, p6Var);
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, i11);
        this.x = brVar;
        b1Var.setLayoutManager(brVar);
        b1Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        fg.j jVar = new fg.j(i14, this, context);
        this.y = jVar;
        jVar.C(z10);
        b1Var.setAdapter(jVar);
        b1Var.setOnItemClickListener(new p71(this));
        b1Var.setOnItemLongClickListener(new p71(this));
        b1Var.setOnScrollListener(new bu0(this, i13));
        if (i10 == 9 || i10 == 10) {
            addView(b1Var, w7.b6.e(-2, -1, 1));
        } else {
            addView(b1Var, w7.b6.c(-1.0f, -1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i10;
        }
        this.b0.put(size, i10);
        this.c0.put(i10, size);
        int i11 = this.G;
        if (i11 != -1 && i11 == i10) {
            this.F = size;
        }
        s71 s71Var = new s71();
        s71Var.a = i10;
        s71Var.b = charSequence;
        this.H = org.telegram.messenger.m5.C(this.r * 2, s71Var.a(this.c), this.H);
        arrayList.add(s71Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.V = z10;
        int i10 = 0;
        ag.b1 b1Var = this.w;
        if (z11) {
            while (i10 < b1Var.getChildCount()) {
                b1Var.getChildAt(i10).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(gr.f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i10);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i10++;
            }
            this.W = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.N == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.N = i10;
        ag.b1 b1Var = this.w;
        if (b1Var.getVisibility() == 8 || b1Var.getMeasuredWidth() == 0) {
            org.telegram.messenger.i0.h3(new qq(this, i10, 6), 100L);
        } else {
            b1Var.y0(i10);
        }
    }

    public final void d(int i10, int i11) {
        int i12 = this.F;
        boolean z10 = i12 < i11;
        this.N = -1;
        this.g0 = i12;
        this.h0 = this.G;
        this.F = i11;
        this.G = i10;
        ValueAnimator valueAnimator = this.k0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.J) {
            this.J = false;
        }
        this.f0 = 0.0f;
        this.K = 0.0f;
        this.J = true;
        setEnabled(false);
        u71 u71Var = this.D;
        if (u71Var != null) {
            w71 w71Var = (w71) ((n2.u) u71Var).b;
            w71Var.D = z10;
            View[] viewArr = w71Var.e;
            w71Var.d = i11;
            w71Var.K(1);
            w71Var.z(i11, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    w71Var.F(view2, measuredWidth);
                } else {
                    w71Var.F(view2, -measuredWidth);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k0 = ofFloat;
        ofFloat.addUpdateListener(new v51(2, this));
        this.k0.setDuration(250L);
        this.k0.setInterpolator(gr.f);
        this.k0.addListener(new p11(this, 7));
        this.k0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int L0;
        s4.c1 K;
        int i11;
        int i12;
        int L;
        int i13;
        int i14;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ag.b1 b1Var = this.w;
        if (view == b1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z10 = this.V;
            if (z10) {
                float f7 = this.W;
                if (f7 != 1.0f) {
                    float f10 = f7 + 0.1f;
                    this.W = f10;
                    if (f10 > 1.0f) {
                        this.W = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (b1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.O;
                    gradientDrawable.setAlpha(alpha);
                    i10 = 0;
                    if (this.J && this.L == -1) {
                        s4.c1 K2 = b1Var.K(this.F);
                        if (K2 != null) {
                            t71 t71Var = (t71) K2.a;
                            i13 = t71Var.b;
                            L = (int) (t71Var.getX() + ((t71Var.getMeasuredWidth() - i13) / 2));
                            int i15 = i13;
                            i10 = L;
                            i14 = i15;
                        }
                        i14 = 0;
                    } else {
                        L0 = this.x.L0();
                        if (L0 != -1 && (K = b1Var.K(L0)) != null) {
                            if (this.J) {
                                i11 = this.F;
                                i12 = this.L;
                            } else {
                                i11 = this.g0;
                                i12 = this.F;
                            }
                            SparseIntArray sparseIntArray = this.e0;
                            int i16 = sparseIntArray.get(i11);
                            int i17 = sparseIntArray.get(i12);
                            SparseIntArray sparseIntArray2 = this.d0;
                            int i18 = sparseIntArray2.get(i11);
                            int i19 = sparseIntArray2.get(i12);
                            if (this.I == 0) {
                                L = org.telegram.messenger.i0.L(this.r) + ((int) (((i17 - i16) * this.K) + i16));
                            } else {
                                L = org.telegram.messenger.i0.L(this.r) + (((int) (((i17 - i16) * this.K) + i16)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i13 = (int) (((i19 - i18) * this.K) + i18);
                            int i152 = i13;
                            i10 = L;
                            i14 = i152;
                        }
                        i14 = 0;
                    }
                    int x10 = (int) (b1Var.getX() + i10);
                    if (i14 != 0) {
                        int i20 = this.E;
                        if (i20 != 9 && i20 != 10) {
                            float f11 = x10;
                            float f12 = i14;
                            this.p0 = f12;
                            float f13 = this.a;
                            if (f13 != 1.0f) {
                                x10 = (int) org.telegram.messenger.i0.T1(f11, f11, f13);
                                i14 = (int) org.telegram.messenger.i0.T1(this.p0, f12, this.a);
                            }
                            if (i20 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.W * Math.round(org.telegram.messenger.i0.p * 4.0f)) + (measuredHeight - Math.round(org.telegram.messenger.i0.p * 4.0f))), i14 + x10, (int) ((this.W * Math.round(org.telegram.messenger.i0.p * 4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f14 = this.I / 2.0f;
                            int L2 = (measuredHeight / 2) - org.telegram.messenger.i0.L(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - org.telegram.messenger.i0.L(12.5f)) - f14), L2, (int) (org.telegram.messenger.i0.L(12.5f) + x10 + i14 + f14), org.telegram.messenger.i0.L(28.0f) + L2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, this.c.getColor());
                        Paint paint = this.q0;
                        paint.setColor(r12);
                        float f15 = measuredHeight / 2.0f;
                        float L3 = org.telegram.messenger.i0.L(26.0f);
                        RectF rectF = org.telegram.messenger.i0.P;
                        float f16 = L3 / 2.0f;
                        rectF.set(x10 - org.telegram.messenger.i0.L(12.0f), f15 - f16, org.telegram.messenger.i0.L(12.0f) + x10 + i14, f15 + f16);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    }
                }
            }
            if (!z10) {
                float f17 = this.W;
                if (f17 != 0.0f) {
                    float f18 = f17 - 0.12f;
                    this.W = f18;
                    if (f18 < 0.0f) {
                        this.W = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (b1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.O;
            gradientDrawable2.setAlpha(alpha2);
            i10 = 0;
            if (this.J) {
            }
            L0 = this.x.L0();
            if (L0 != -1) {
                if (this.J) {
                }
                SparseIntArray sparseIntArray3 = this.e0;
                int i162 = sparseIntArray3.get(i11);
                int i172 = sparseIntArray3.get(i12);
                SparseIntArray sparseIntArray22 = this.d0;
                int i182 = sparseIntArray22.get(i11);
                int i192 = sparseIntArray22.get(i12);
                if (this.I == 0) {
                }
                i13 = (int) (((i192 - i182) * this.K) + i182);
                int i1522 = i13;
                i10 = L;
                i14 = i1522;
                int x102 = (int) (b1Var.getX() + i10);
                if (i14 != 0) {
                }
            }
            i14 = 0;
            int x1022 = (int) (b1Var.getX() + i10);
            if (i14 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f7, int i10, int i11);

    public final void f(float f7, int i10) {
        int i11 = this.c0.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            this.L = i11;
            this.M = i10;
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f7;
        this.w.g1();
        invalidate();
        c(i11);
        if (f7 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = i10;
        }
    }

    public final void g(int i10, int i11, int i12, int i13, int i14) {
        this.P = i10;
        this.Q = i11;
        this.R = i12;
        this.S = i13;
        this.T = i14;
        this.O.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.j0));
    }

    public float getAnimatingIndicatorProgress() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.F;
    }

    public int getCurrentTabId() {
        return this.G;
    }

    public int getFirstTabId() {
        return this.b0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.g0;
    }

    public Drawable getSelectorDrawable() {
        return this.O;
    }

    public tk0 getTabsContainer() {
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.U != i14) {
            this.U = i14;
            this.N = -1;
            if (this.J) {
                org.telegram.messenger.i0.r(this.i0);
                this.J = false;
                setEnabled(true);
                u71 u71Var = this.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(7.0f)) - org.telegram.messenger.i0.L(7.0f);
            int i13 = this.I;
            if (arrayList.size() == 1 || (i12 = this.E) == 9 || i12 == 10) {
                this.I = 0;
            } else {
                int i14 = this.H;
                this.I = i14 < size ? (size - i14) / arrayList.size() : 0;
            }
            if (i13 != this.I) {
                this.s = true;
                this.y.f();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.d0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.i0.L(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a2 = ((s71) arrayList.get(i15)).a(this.c);
                sparseIntArray2.put(i15, a2);
                sparseIntArray.put(i15, (this.I / 2) + L);
                L += org.telegram.messenger.i0.L(this.r * 2) + a2 + this.I;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.K = f7;
        this.w.g1();
        invalidate();
        u71 u71Var = this.D;
        if (u71Var != null) {
            ((n2.u) u71Var).J(f7);
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.r0 = fVar;
        setBackground(fVar);
    }

    public void setDelegate(u71 u71Var) {
        this.D = u71Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.k20 k20Var) {
        this.b = k20Var;
    }

    public void setPreTabClick(org.telegram.messenger.k20 k20Var) {
        this.l0 = k20Var;
    }

    public void setReordering(boolean z10) {
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.n0 == null) {
            this.n0 = new s4.x(new org.telegram.ui.ja(this, 7));
        }
        if (this.m0 && this.o0 == null) {
            r71 r71Var = new r71(this);
            this.o0 = r71Var;
            r71Var.m = false;
            r71Var.C = false;
            r71Var.o(gr.h);
            this.o0.n(350L);
        }
        s4.x xVar = this.n0;
        ag.b1 b1Var = this.w;
        if (xVar != null) {
            xVar.h(z10 ? b1Var : null);
        }
        b1Var.setItemAnimator(z10 ? this.o0 : null);
        org.telegram.messenger.i0.d0(b1Var, new org.telegram.ui.nc(2, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        vg.f fVar = this.r0;
        if (fVar != null) {
            fVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(this.P, this.j0));
        }
        ag.b1 b1Var = this.w;
        if (b1Var != null) {
            b1Var.g1();
            b1Var.invalidate();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
