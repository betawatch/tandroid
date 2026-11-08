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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class u61 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final /* synthetic */ int s0 = 0;
    public t61 D;
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
    public final xq a0;
    public org.telegram.messenger.w10 b;
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
    public final et i0;
    public final org.telegram.ui.ActionBar.f6 j0;
    public ValueAnimator k0;
    public org.telegram.messenger.w10 l0;
    public boolean m0;
    public boolean n;
    public v4.y n0;
    public q61 o0;
    public float p0;
    public final Paint q0;
    public int r;
    public fh.g r0;
    public boolean s;
    public final bi.q1 w;
    public final jg.i0 x;
    public final org.telegram.ui.l4 y;

    public u61(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        boolean z10;
        int i10;
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
        this.P = org.telegram.ui.ActionBar.k6.ui;
        this.Q = org.telegram.ui.ActionBar.k6.ti;
        this.R = org.telegram.ui.ActionBar.k6.si;
        this.S = org.telegram.ui.ActionBar.k6.vi;
        this.T = org.telegram.ui.ActionBar.k6.s8;
        this.a0 = xq.h;
        this.b0 = new SparseIntArray(5);
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        this.i0 = new et(this, 17);
        this.q0 = new Paint(1);
        this.j0 = f6Var;
        this.E = i7;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L((i7 == 9 || i7 == 10 || i7 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.P, f6Var));
        int i11 = 8;
        int i12 = 7;
        if (i7 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            z10 = true;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            z10 = true;
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        bi.q1 q1Var = new bi.q1(29, context, this);
        this.w = q1Var;
        q1Var.setOverScrollMode(2);
        if (z9) {
            q1Var.setItemAnimator(null);
        } else {
            ((v4.k) q1Var.getItemAnimator()).C = false;
        }
        if (i7 == -2) {
            q1Var.setSelectorType(9);
            q1Var.setSelectorRadius(6);
        } else {
            q1Var.setSelectorType(i7 == 10 ? 9 : i7);
            if (i7 == i10) {
                q1Var.setSelectorRadius(0);
            } else {
                q1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.r6.m(q1Var, 20, this.S, f6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, i11);
        this.x = i0Var;
        q1Var.setLayoutManager(i0Var);
        q1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        q1Var.setClipToPadding(false);
        q1Var.setDrawSelectorBehind(z10);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i12, this, context);
        this.y = l4Var;
        l4Var.C(z9);
        q1Var.setAdapter(l4Var);
        q1Var.setOnItemClickListener(new o61(this));
        q1Var.setOnItemLongClickListener(new o61(this));
        q1Var.setOnScrollListener(new ui(this, 20));
        if (i7 == 9 || i7 == 10) {
            addView(q1Var, c8.ha.e(-2, -1, 1));
        } else {
            addView(q1Var, c8.ha.c(-1.0f, -1));
        }
    }

    public final void a(int i7, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.G == -1) {
            this.G = i7;
        }
        this.b0.put(size, i7);
        this.c0.put(i7, size);
        int i10 = this.G;
        if (i10 != -1 && i10 == i7) {
            this.F = size;
        }
        r61 r61Var = new r61();
        r61Var.a = i7;
        r61Var.b = charSequence;
        this.H = org.telegram.messenger.k5.C(this.r * 2, r61Var.a(this.c), this.H);
        arrayList.add(r61Var);
    }

    public final void b(boolean z9, boolean z10) {
        this.V = z9;
        int i7 = 0;
        bi.q1 q1Var = this.w;
        if (z10) {
            while (i7 < q1Var.getChildCount()) {
                q1Var.getChildAt(i7).animate().alpha(z9 ? 0.0f : 1.0f).scaleX(z9 ? 0.0f : 1.0f).scaleY(z9 ? 0.0f : 1.0f).setInterpolator(xq.f).setDuration(220L).start();
                i7++;
            }
        } else {
            while (i7 < q1Var.getChildCount()) {
                View childAt = q1Var.getChildAt(i7);
                childAt.setScaleX(z9 ? 0.0f : 1.0f);
                childAt.setScaleY(z9 ? 0.0f : 1.0f);
                childAt.setAlpha(z9 ? 0.0f : 1.0f);
                i7++;
            }
            this.W = z9 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i7) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.N == i7 || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.N = i7;
        bi.q1 q1Var = this.w;
        if (q1Var.getVisibility() == 8 || q1Var.getMeasuredWidth() == 0) {
            org.telegram.messenger.g0.i3(new r2(this, i7, 11), 100L);
        } else {
            q1Var.y0(i7);
        }
    }

    public final void d(int i7, int i10) {
        int i11 = this.F;
        int i12 = 0;
        boolean z9 = i11 < i10;
        this.N = -1;
        this.g0 = i11;
        this.h0 = this.G;
        this.F = i10;
        this.G = i7;
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
        t61 t61Var = this.D;
        if (t61Var != null) {
            v61 v61Var = (v61) ((n) t61Var).a;
            v61Var.D = z9;
            View[] viewArr = v61Var.e;
            v61Var.d = i10;
            v61Var.K(1);
            v61Var.z(i10, z9);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z9) {
                    v61Var.F(view2, measuredWidth);
                } else {
                    v61Var.F(view2, -measuredWidth);
                }
            }
        }
        c(this.F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k0 = ofFloat;
        ofFloat.addUpdateListener(new n61(this, i12));
        this.k0.setDuration(250L);
        this.k0.setInterpolator(xq.f);
        this.k0.addListener(new f11(this, 6));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        int L0;
        v4.d1 K;
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        boolean drawChild = super.drawChild(canvas, view, j3);
        bi.q1 q1Var = this.w;
        if (view == q1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z9 = this.V;
            if (z9) {
                float f10 = this.W;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.1f;
                    this.W = f11;
                    if (f11 > 1.0f) {
                        this.W = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (q1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.O;
                    gradientDrawable.setAlpha(alpha);
                    i7 = 0;
                    if (this.J && this.L == -1) {
                        v4.d1 K2 = q1Var.K(this.F);
                        if (K2 != null) {
                            s61 s61Var = (s61) K2.a;
                            i12 = s61Var.b;
                            L = (int) (s61Var.getX() + ((s61Var.getMeasuredWidth() - i12) / 2));
                            int i14 = i12;
                            i7 = L;
                            i13 = i14;
                        }
                        i13 = 0;
                    } else {
                        L0 = this.x.L0();
                        if (L0 != -1 && (K = q1Var.K(L0)) != null) {
                            if (this.J) {
                                i10 = this.F;
                                i11 = this.L;
                            } else {
                                i10 = this.g0;
                                i11 = this.F;
                            }
                            SparseIntArray sparseIntArray = this.e0;
                            int i15 = sparseIntArray.get(i10);
                            int i16 = sparseIntArray.get(i11);
                            SparseIntArray sparseIntArray2 = this.d0;
                            int i17 = sparseIntArray2.get(i10);
                            int i18 = sparseIntArray2.get(i11);
                            if (this.I == 0) {
                                L = org.telegram.messenger.g0.L(this.r) + ((int) (((i16 - i15) * this.K) + i15));
                            } else {
                                L = org.telegram.messenger.g0.L(this.r) + (((int) (((i16 - i15) * this.K) + i15)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i12 = (int) (((i18 - i17) * this.K) + i17);
                            int i142 = i12;
                            i7 = L;
                            i13 = i142;
                        }
                        i13 = 0;
                    }
                    int x10 = (int) (q1Var.getX() + i7);
                    if (i13 != 0) {
                        int i19 = this.E;
                        if (i19 != 9 && i19 != 10) {
                            float f12 = x10;
                            float f13 = i13;
                            this.p0 = f13;
                            float f14 = this.a;
                            if (f14 != 1.0f) {
                                x10 = (int) org.telegram.messenger.g0.T1(f12, f12, f14);
                                i13 = (int) org.telegram.messenger.g0.T1(this.p0, f13, this.a);
                            }
                            if (i19 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.W * Math.round(org.telegram.messenger.g0.p * 4.0f)) + (measuredHeight - Math.round(org.telegram.messenger.g0.p * 4.0f))), i13 + x10, (int) ((this.W * Math.round(org.telegram.messenger.g0.p * 4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f15 = this.I / 2.0f;
                            int L2 = (measuredHeight / 2) - org.telegram.messenger.g0.L(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - org.telegram.messenger.g0.L(12.5f)) - f15), L2, (int) (org.telegram.messenger.g0.L(12.5f) + x10 + i13 + f15), org.telegram.messenger.g0.L(28.0f) + L2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, this.c.getColor());
                        Paint paint = this.q0;
                        paint.setColor(r12);
                        float f16 = measuredHeight / 2.0f;
                        float L3 = org.telegram.messenger.g0.L(26.0f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f17 = L3 / 2.0f;
                        rectF.set(x10 - org.telegram.messenger.g0.L(12.0f), f16 - f17, org.telegram.messenger.g0.L(12.0f) + x10 + i13, f16 + f17);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    }
                }
            }
            if (!z9) {
                float f18 = this.W;
                if (f18 != 0.0f) {
                    float f19 = f18 - 0.12f;
                    this.W = f19;
                    if (f19 < 0.0f) {
                        this.W = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (q1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.O;
            gradientDrawable2.setAlpha(alpha2);
            i7 = 0;
            if (this.J) {
            }
            L0 = this.x.L0();
            if (L0 != -1) {
                if (this.J) {
                }
                SparseIntArray sparseIntArray3 = this.e0;
                int i152 = sparseIntArray3.get(i10);
                int i162 = sparseIntArray3.get(i11);
                SparseIntArray sparseIntArray22 = this.d0;
                int i172 = sparseIntArray22.get(i10);
                int i182 = sparseIntArray22.get(i11);
                if (this.I == 0) {
                }
                i12 = (int) (((i182 - i172) * this.K) + i172);
                int i1422 = i12;
                i7 = L;
                i13 = i1422;
                int x102 = (int) (q1Var.getX() + i7);
                if (i13 != 0) {
                }
            }
            i13 = 0;
            int x1022 = (int) (q1Var.getX() + i7);
            if (i13 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f10, int i7, int i10);

    public final void f(float f10, int i7) {
        int i10 = this.c0.get(i7, -1);
        if (i10 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.L = i10;
            this.M = i7;
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.w.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i10;
            this.G = i7;
        }
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.P = i7;
        this.Q = i10;
        this.R = i11;
        this.S = i12;
        this.T = i13;
        this.O.setColor(org.telegram.ui.ActionBar.k6.w0(i7, this.j0));
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

    public pj0 getTabsContainer() {
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.U != i13) {
            this.U = i13;
            this.N = -1;
            if (this.J) {
                org.telegram.messenger.g0.r(this.i0);
                this.J = false;
                setEnabled(true);
                t61 t61Var = this.D;
                if (t61Var != null) {
                    ((n) t61Var).y(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(7.0f)) - org.telegram.messenger.g0.L(7.0f);
            int i12 = this.I;
            if (arrayList.size() == 1 || (i11 = this.E) == 9 || i11 == 10) {
                this.I = 0;
            } else {
                int i13 = this.H;
                this.I = i13 < size ? (size - i13) / arrayList.size() : 0;
            }
            if (i12 != this.I) {
                this.s = true;
                this.y.f();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.d0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                int a10 = ((r61) arrayList.get(i14)).a(this.c);
                sparseIntArray2.put(i14, a10);
                sparseIntArray.put(i14, (this.I / 2) + L);
                L += org.telegram.messenger.g0.L(this.r * 2) + a10 + this.I;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.K = f10;
        this.w.g1();
        invalidate();
        t61 t61Var = this.D;
        if (t61Var != null) {
            ((n) t61Var).y(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.r0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(t61 t61Var) {
        this.D = t61Var;
    }

    public void setIsEditing(boolean z9) {
        this.n = z9;
        this.w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.w10 w10Var) {
        this.b = w10Var;
    }

    public void setPreTabClick(org.telegram.messenger.w10 w10Var) {
        this.l0 = w10Var;
    }

    public void setReordering(boolean z9) {
        if (this.m0 == z9) {
            return;
        }
        this.m0 = z9;
        if (z9 && this.n0 == null) {
            this.n0 = new v4.y(new ei.d(this, 8));
        }
        if (this.m0 && this.o0 == null) {
            q61 q61Var = new q61(this);
            this.o0 = q61Var;
            q61Var.m = false;
            q61Var.C = false;
            q61Var.o(xq.h);
            this.o0.n(350L);
        }
        v4.y yVar = this.n0;
        bi.q1 q1Var = this.w;
        if (yVar != null) {
            yVar.h(z9 ? q1Var : null);
        }
        q1Var.setItemAnimator(z9 ? this.o0 : null);
        org.telegram.messenger.g0.d0(q1Var, new bi.b9(6, this, z9));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        fh.g gVar = this.r0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.O;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.P, this.j0));
        }
        bi.q1 q1Var = this.w;
        if (q1Var != null) {
            q1Var.g1();
            q1Var.invalidate();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
