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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m61 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int t0 = 0;
    public l61 E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public float L;
    public int M;
    public int N;
    public int O;
    public final GradientDrawable P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public float a;
    public float a0;
    public org.telegram.messenger.o10 b;
    public final xq b0;
    public final TextPaint c;
    public final SparseIntArray c0;
    public final TextPaint d;
    public final SparseIntArray d0;
    public final TextPaint e;
    public final SparseIntArray e0;
    public final Paint f;
    public final SparseIntArray f0;
    public float g0;
    public final ArrayList h;
    public int h0;
    public int i0;
    public final lt j0;
    public final org.telegram.ui.ActionBar.e6 k0;
    public ValueAnimator l0;
    public org.telegram.messenger.o10 m0;
    public boolean n;
    public boolean n0;
    public u4.y o0;
    public i61 p0;
    public float q0;
    public int r;
    public final Paint r0;
    public boolean s;
    public gh.g s0;
    public final ci.j1 w;
    public final kg.f0 x;
    public final org.telegram.ui.n4 y;

    public m61(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        boolean z11;
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
        this.H = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.Q = org.telegram.ui.ActionBar.k6.ui;
        this.R = org.telegram.ui.ActionBar.k6.ti;
        this.S = org.telegram.ui.ActionBar.k6.si;
        this.T = org.telegram.ui.ActionBar.k6.vi;
        this.U = org.telegram.ui.ActionBar.k6.s8;
        this.b0 = xq.h;
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        this.f0 = new SparseIntArray(5);
        this.j0 = new lt(this, 16);
        this.r0 = new Paint(1);
        this.k0 = e6Var;
        this.F = i3;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L((i3 == 9 || i3 == 10 || i3 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.Q, e6Var));
        int i11 = 8;
        int i12 = 7;
        if (i3 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            z11 = true;
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            z11 = true;
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        ci.j1 j1Var = new ci.j1(29, context, this);
        this.w = j1Var;
        j1Var.setOverScrollMode(2);
        if (z10) {
            j1Var.setItemAnimator(null);
        } else {
            ((u4.k) j1Var.getItemAnimator()).C = false;
        }
        if (i3 == -2) {
            j1Var.setSelectorType(9);
            j1Var.setSelectorRadius(6);
        } else {
            j1Var.setSelectorType(i3 == 10 ? 9 : i3);
            if (i3 == i10) {
                j1Var.setSelectorRadius(0);
            } else {
                j1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.r6.m(j1Var, 20, this.T, e6Var);
        kg.f0 f0Var = new kg.f0((ViewGroup) this, i11);
        this.x = f0Var;
        j1Var.setLayoutManager(f0Var);
        j1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        j1Var.setClipToPadding(false);
        j1Var.setDrawSelectorBehind(z11);
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(i12, this, context);
        this.y = n4Var;
        n4Var.C(z10);
        j1Var.setAdapter(n4Var);
        j1Var.setOnItemClickListener(new g61(this));
        j1Var.setOnItemLongClickListener(new g61(this));
        j1Var.setOnScrollListener(new ji(this, 22));
        if (i3 == 9 || i3 == 10) {
            addView(j1Var, b8.mf.e(-2, -1, 1));
        } else {
            addView(j1Var, b8.mf.c(-1.0f, -1));
        }
    }

    public final void a(int i3, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i3;
        }
        this.c0.put(size, i3);
        this.d0.put(i3, size);
        int i10 = this.H;
        if (i10 != -1 && i10 == i3) {
            this.G = size;
        }
        j61 j61Var = new j61();
        j61Var.a = i3;
        j61Var.b = charSequence;
        this.I = org.telegram.messenger.k5.C(this.r * 2, j61Var.a(this.c), this.I);
        arrayList.add(j61Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.W = z10;
        int i3 = 0;
        ci.j1 j1Var = this.w;
        if (z11) {
            while (i3 < j1Var.getChildCount()) {
                j1Var.getChildAt(i3).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(xq.f).setDuration(220L).start();
                i3++;
            }
        } else {
            while (i3 < j1Var.getChildCount()) {
                View childAt = j1Var.getChildAt(i3);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i3++;
            }
            this.a0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i3) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.O == i3 || i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        this.O = i3;
        ci.j1 j1Var = this.w;
        if (j1Var.getVisibility() == 8 || j1Var.getMeasuredWidth() == 0) {
            org.telegram.messenger.g0.i3(new o2(this, i3, 11), 100L);
        } else {
            j1Var.y0(i3);
        }
    }

    public final void d(int i3, int i10) {
        int i11 = this.G;
        boolean z10 = i11 < i10;
        this.O = -1;
        this.h0 = i11;
        this.i0 = this.H;
        this.G = i10;
        this.H = i3;
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.K) {
            this.K = false;
        }
        this.g0 = 0.0f;
        this.L = 0.0f;
        this.K = true;
        setEnabled(false);
        l61 l61Var = this.E;
        if (l61Var != null) {
            n61 n61Var = (n61) ((y00) l61Var).a;
            n61Var.E = z10;
            View[] viewArr = n61Var.e;
            n61Var.d = i10;
            n61Var.K(1);
            n61Var.y(i10, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    n61Var.E(view2, measuredWidth);
                } else {
                    n61Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new m41(2, this));
        this.l0.setDuration(250L);
        this.l0.setInterpolator(xq.f);
        this.l0.addListener(new j01(this, 7));
        this.l0.start();
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
        int i3;
        int L0;
        u4.d1 K;
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        boolean drawChild = super.drawChild(canvas, view, j10);
        ci.j1 j1Var = this.w;
        if (view == j1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z10 = this.W;
            if (z10) {
                float f10 = this.a0;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.1f;
                    this.a0 = f11;
                    if (f11 > 1.0f) {
                        this.a0 = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (j1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.P;
                    gradientDrawable.setAlpha(alpha);
                    i3 = 0;
                    if (this.K && this.M == -1) {
                        u4.d1 K2 = j1Var.K(this.G);
                        if (K2 != null) {
                            k61 k61Var = (k61) K2.a;
                            i12 = k61Var.b;
                            L = (int) (k61Var.getX() + ((k61Var.getMeasuredWidth() - i12) / 2));
                            int i14 = i12;
                            i3 = L;
                            i13 = i14;
                        }
                        i13 = 0;
                    } else {
                        L0 = this.x.L0();
                        if (L0 != -1 && (K = j1Var.K(L0)) != null) {
                            if (this.K) {
                                i10 = this.G;
                                i11 = this.M;
                            } else {
                                i10 = this.h0;
                                i11 = this.G;
                            }
                            SparseIntArray sparseIntArray = this.f0;
                            int i15 = sparseIntArray.get(i10);
                            int i16 = sparseIntArray.get(i11);
                            SparseIntArray sparseIntArray2 = this.e0;
                            int i17 = sparseIntArray2.get(i10);
                            int i18 = sparseIntArray2.get(i11);
                            if (this.J == 0) {
                                L = org.telegram.messenger.g0.L(this.r) + ((int) (((i16 - i15) * this.L) + i15));
                            } else {
                                L = org.telegram.messenger.g0.L(this.r) + (((int) (((i16 - i15) * this.L) + i15)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i12 = (int) (((i18 - i17) * this.L) + i17);
                            int i142 = i12;
                            i3 = L;
                            i13 = i142;
                        }
                        i13 = 0;
                    }
                    int x10 = (int) (j1Var.getX() + i3);
                    if (i13 != 0) {
                        int i19 = this.F;
                        if (i19 != 9 && i19 != 10) {
                            float f12 = x10;
                            float f13 = i13;
                            this.q0 = f13;
                            float f14 = this.a;
                            if (f14 != 1.0f) {
                                x10 = (int) org.telegram.messenger.g0.T1(f12, f12, f14);
                                i13 = (int) org.telegram.messenger.g0.T1(this.q0, f13, this.a);
                            }
                            if (i19 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.a0 * Math.round(org.telegram.messenger.g0.p * 4.0f)) + (measuredHeight - Math.round(org.telegram.messenger.g0.p * 4.0f))), i13 + x10, (int) ((this.a0 * Math.round(org.telegram.messenger.g0.p * 4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f15 = this.J / 2.0f;
                            int L2 = (measuredHeight / 2) - org.telegram.messenger.g0.L(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - org.telegram.messenger.g0.L(12.5f)) - f15), L2, (int) (org.telegram.messenger.g0.L(12.5f) + x10 + i13 + f15), org.telegram.messenger.g0.L(28.0f) + L2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, this.c.getColor());
                        Paint paint = this.r0;
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
            if (!z10) {
                float f18 = this.a0;
                if (f18 != 0.0f) {
                    float f19 = f18 - 0.12f;
                    this.a0 = f19;
                    if (f19 < 0.0f) {
                        this.a0 = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (j1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.P;
            gradientDrawable2.setAlpha(alpha2);
            i3 = 0;
            if (this.K) {
            }
            L0 = this.x.L0();
            if (L0 != -1) {
                if (this.K) {
                }
                SparseIntArray sparseIntArray3 = this.f0;
                int i152 = sparseIntArray3.get(i10);
                int i162 = sparseIntArray3.get(i11);
                SparseIntArray sparseIntArray22 = this.e0;
                int i172 = sparseIntArray22.get(i10);
                int i182 = sparseIntArray22.get(i11);
                if (this.J == 0) {
                }
                i12 = (int) (((i182 - i172) * this.L) + i172);
                int i1422 = i12;
                i3 = L;
                i13 = i1422;
                int x102 = (int) (j1Var.getX() + i3);
                if (i13 != 0) {
                }
            }
            i13 = 0;
            int x1022 = (int) (j1Var.getX() + i3);
            if (i13 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f10, int i3, int i10);

    public final void f(float f10, int i3) {
        int i10 = this.d0.get(i3, -1);
        if (i10 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.M = i10;
            this.N = i3;
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        this.w.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = i3;
        }
    }

    public final void g(int i3, int i10, int i11, int i12, int i13) {
        this.Q = i3;
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.P.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.k0));
    }

    public float getAnimatingIndicatorProgress() {
        return this.L;
    }

    public int getCurrentPosition() {
        return this.G;
    }

    public int getCurrentTabId() {
        return this.H;
    }

    public int getFirstTabId() {
        return this.c0.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.h0;
    }

    public Drawable getSelectorDrawable() {
        return this.P;
    }

    public tj0 getTabsContainer() {
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        if (this.V != i13) {
            this.V = i13;
            this.O = -1;
            if (this.K) {
                org.telegram.messenger.g0.r(this.j0);
                this.K = false;
                setEnabled(true);
                l61 l61Var = this.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(7.0f)) - org.telegram.messenger.g0.L(7.0f);
            int i12 = this.J;
            if (arrayList.size() == 1 || (i11 = this.F) == 9 || i11 == 10) {
                this.J = 0;
            } else {
                int i13 = this.I;
                this.J = i13 < size ? (size - i13) / arrayList.size() : 0;
            }
            if (i12 != this.J) {
                this.s = true;
                this.y.f();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.f0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.e0;
            sparseIntArray2.clear();
            int L = org.telegram.messenger.g0.L(7.0f);
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                int a10 = ((j61) arrayList.get(i14)).a(this.c);
                sparseIntArray2.put(i14, a10);
                sparseIntArray.put(i14, (this.J / 2) + L);
                L += org.telegram.messenger.g0.L(this.r * 2) + a10 + this.J;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.L = f10;
        this.w.g1();
        invalidate();
        l61 l61Var = this.E;
        if (l61Var != null) {
            ((y00) l61Var).x(f10);
        }
    }

    public void setBlurredBackground(gh.g gVar) {
        this.s0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(l61 l61Var) {
        this.E = l61Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.o10 o10Var) {
        this.b = o10Var;
    }

    public void setPreTabClick(org.telegram.messenger.o10 o10Var) {
        this.m0 = o10Var;
    }

    public void setReordering(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        if (z10 && this.o0 == null) {
            this.o0 = new u4.y(new fi.c(this, 8));
        }
        if (this.n0 && this.p0 == null) {
            i61 i61Var = new i61(this);
            this.p0 = i61Var;
            i61Var.m = false;
            i61Var.C = false;
            i61Var.o(xq.h);
            this.p0.n(350L);
        }
        u4.y yVar = this.o0;
        ci.j1 j1Var = this.w;
        if (yVar != null) {
            yVar.h(z10 ? j1Var : null);
        }
        j1Var.setItemAnimator(z10 ? this.p0 : null);
        org.telegram.messenger.g0.d0(j1Var, new ci.b8(6, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        gh.g gVar = this.s0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(this.Q, this.k0));
        }
        ci.j1 j1Var = this.w;
        if (j1Var != null) {
            j1Var.g1();
            j1Var.invalidate();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
