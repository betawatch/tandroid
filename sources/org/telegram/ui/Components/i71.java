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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class i71 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int t0 = 0;
    public h71 E;
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
    public org.telegram.messenger.r10 b;
    public final nr b0;
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
    public final ik j0;
    public final org.telegram.ui.ActionBar.h6 k0;
    public ValueAnimator l0;
    public org.telegram.messenger.r10 m0;
    public boolean n;
    public boolean n0;
    public v4.z o0;
    public e71 p0;
    public float q0;
    public int r;
    public final Paint r0;
    public boolean s;
    public fh.g s0;
    public final di.b1 w;
    public final jg.i0 x;
    public final org.telegram.ui.l4 y;

    public i71(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
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
        this.Q = org.telegram.ui.ActionBar.m6.xi;
        this.R = org.telegram.ui.ActionBar.m6.wi;
        this.S = org.telegram.ui.ActionBar.m6.vi;
        this.T = org.telegram.ui.ActionBar.m6.yi;
        this.U = org.telegram.ui.ActionBar.m6.s8;
        this.b0 = nr.h;
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        this.f0 = new SparseIntArray(5);
        this.j0 = new ik(this, 20);
        this.r0 = new Paint(1);
        this.k0 = h6Var;
        this.F = i7;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L((i7 == 9 || i7 == 10 || i7 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.P = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.m6.w0(this.Q, h6Var));
        int i11 = 8;
        int i12 = 7;
        if (i7 == -2) {
            float N = org.telegram.messenger.g0.N(13.0f);
            gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
            i10 = 3;
        } else {
            float N2 = org.telegram.messenger.g0.N(3.0f);
            i10 = 3;
            gradientDrawable.setCornerRadii(new float[]{N2, N2, N2, N2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        di.b1 b1Var = new di.b1(29, context, this);
        this.w = b1Var;
        b1Var.setOverScrollMode(2);
        if (z10) {
            b1Var.setItemAnimator(null);
        } else {
            ((v4.k) b1Var.getItemAnimator()).C = false;
        }
        if (i7 == -2) {
            b1Var.setSelectorType(9);
            b1Var.setSelectorRadius(6);
        } else {
            b1Var.setSelectorType(i7 == 10 ? 9 : i7);
            if (i7 == i10) {
                b1Var.setSelectorRadius(0);
            } else {
                b1Var.setSelectorRadius(6);
            }
        }
        org.telegram.ui.ActionBar.t6.l(b1Var, 20, this.T, h6Var);
        jg.i0 i0Var = new jg.i0((ViewGroup) this, i11);
        this.x = i0Var;
        b1Var.setLayoutManager(i0Var);
        b1Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        b1Var.setClipToPadding(false);
        b1Var.setDrawSelectorBehind(true);
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(i12, this, context);
        this.y = l4Var;
        l4Var.C(z10);
        b1Var.setAdapter(l4Var);
        b1Var.setOnItemClickListener(new c71(this));
        b1Var.setOnItemLongClickListener(new c71(this));
        b1Var.setOnScrollListener(new oa(this, 23));
        if (i7 == 9 || i7 == 10) {
            addView(b1Var, c8.ma.e(-2, -1, 1));
        } else {
            addView(b1Var, c8.ma.c(-1.0f, -1));
        }
    }

    public final void a(int i7, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.H == -1) {
            this.H = i7;
        }
        this.c0.put(size, i7);
        this.d0.put(i7, size);
        int i10 = this.H;
        if (i10 != -1 && i10 == i7) {
            this.G = size;
        }
        f71 f71Var = new f71();
        f71Var.a = i7;
        f71Var.b = charSequence;
        this.I = org.telegram.messenger.f3.C(this.r * 2, f71Var.a(this.c), this.I);
        arrayList.add(f71Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.W = z10;
        int i7 = 0;
        di.b1 b1Var = this.w;
        if (z11) {
            while (i7 < b1Var.getChildCount()) {
                b1Var.getChildAt(i7).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(nr.f).setDuration(220L).start();
                i7++;
            }
        } else {
            while (i7 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i7);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i7++;
            }
            this.a0 = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c() {
        this.h.clear();
        this.c0.clear();
        this.d0.clear();
        this.e0.clear();
        this.f0.clear();
        this.I = 0;
    }

    public final void d(int i7) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.O == i7 || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.O = i7;
        di.b1 b1Var = this.w;
        if (b1Var.getVisibility() == 8 || b1Var.getMeasuredWidth() == 0) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(this, i7, 17), 100L);
        } else {
            b1Var.y0(i7);
        }
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
        v4.f1 K;
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        boolean drawChild = super.drawChild(canvas, view, j3);
        di.b1 b1Var = this.w;
        if (view == b1Var) {
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
                    int alpha = (int) (b1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.P;
                    gradientDrawable.setAlpha(alpha);
                    i7 = 0;
                    if (this.K && this.M == -1) {
                        v4.f1 K2 = b1Var.K(this.G);
                        if (K2 != null) {
                            g71 g71Var = (g71) K2.a;
                            i12 = g71Var.b;
                            L = (int) (g71Var.getX() + ((g71Var.getMeasuredWidth() - i12) / 2));
                            int i14 = i12;
                            i7 = L;
                            i13 = i14;
                        }
                        i13 = 0;
                    } else {
                        L0 = this.x.L0();
                        if (L0 != -1 && (K = b1Var.K(L0)) != null) {
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
                            i7 = L;
                            i13 = i142;
                        }
                        i13 = 0;
                    }
                    int x10 = (int) (b1Var.getX() + i7);
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
                        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, this.c.getColor());
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
            int alpha2 = (int) (b1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.P;
            gradientDrawable2.setAlpha(alpha2);
            i7 = 0;
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
                i7 = L;
                i13 = i1422;
                int x102 = (int) (b1Var.getX() + i7);
                if (i13 != 0) {
                }
            }
            i13 = 0;
            int x1022 = (int) (b1Var.getX() + i7);
            if (i13 != 0) {
            }
        }
        return drawChild;
    }

    public final void e(int i7, int i10) {
        int i11 = this.G;
        boolean z10 = i11 < i10;
        this.O = -1;
        this.h0 = i11;
        this.i0 = this.H;
        h71 h71Var = this.E;
        if (h71Var != null) {
            h71Var.o();
        }
        this.G = i10;
        this.H = i7;
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
        h71 h71Var2 = this.E;
        if (h71Var2 != null) {
            h71Var2.a(i10, z10);
        }
        d(this.G);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new i51(2, this));
        this.l0.setDuration(250L);
        this.l0.setInterpolator(nr.f);
        this.l0.addListener(new u11(this, 6));
        this.l0.start();
    }

    public void f(float f10, int i7, int i10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        this.G = i7;
        SparseIntArray sparseIntArray = this.c0;
        this.H = sparseIntArray.get(i7);
        if (f10 > 0.0f) {
            h71 h71Var = this.E;
            if (h71Var != null) {
                h71Var.o();
            }
            this.M = i10;
            this.N = sparseIntArray.get(i10);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        this.w.g1();
        invalidate();
        d(i7);
        if (f10 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        h71 h71Var2 = this.E;
        if (h71Var2 != null) {
            h71Var2.c();
        }
    }

    public final void g(float f10, int i7) {
        int i10 = this.d0.get(i7, -1);
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
            this.N = i7;
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f10;
        this.w.g1();
        invalidate();
        d(i10);
        if (f10 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = i7;
        }
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

    public ek0 getTabsContainer() {
        return this.w;
    }

    public final void h(int i7, int i10, int i11, int i12, int i13) {
        this.Q = i7;
        this.R = i10;
        this.S = i11;
        this.T = i12;
        this.U = i13;
        this.P.setColor(org.telegram.ui.ActionBar.m6.w0(i7, this.k0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (this.V != i13) {
            this.V = i13;
            this.O = -1;
            if (this.K) {
                org.telegram.messenger.g0.r(this.j0);
                this.K = false;
                setEnabled(true);
                h71 h71Var = this.E;
                if (h71Var != null) {
                    h71Var.g(1.0f);
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
                int a10 = ((f71) arrayList.get(i14)).a(this.c);
                sparseIntArray2.put(i14, a10);
                sparseIntArray.put(i14, (this.J / 2) + L);
                L += org.telegram.messenger.g0.L(this.r * 2) + a10 + this.J;
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
        this.L = f10;
        this.w.g1();
        invalidate();
        h71 h71Var = this.E;
        if (h71Var != null) {
            h71Var.g(f10);
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.s0 = gVar;
        setBackground(gVar);
    }

    public void setDelegate(h71 h71Var) {
        this.E = h71Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.w.g1();
        invalidate();
    }

    public void setOnTabLongClick(org.telegram.messenger.r10 r10Var) {
        this.b = r10Var;
    }

    public void setPreTabClick(org.telegram.messenger.r10 r10Var) {
        this.m0 = r10Var;
    }

    public void setReordering(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        if (z10 && this.o0 == null) {
            this.o0 = new v4.z(new gi.c(this, 8));
        }
        if (this.n0 && this.p0 == null) {
            e71 e71Var = new e71(this);
            this.p0 = e71Var;
            e71Var.m = false;
            e71Var.C = false;
            e71Var.o(nr.h);
            this.p0.n(350L);
        }
        v4.z zVar = this.o0;
        di.b1 b1Var = this.w;
        if (zVar != null) {
            zVar.h(z10 ? b1Var : null);
        }
        b1Var.setItemAnimator(z10 ? this.p0 : null);
        org.telegram.messenger.g0.d0(b1Var, new ai.w2(7, this, z10));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        fh.g gVar = this.s0;
        if (gVar != null) {
            gVar.updateColors();
        }
        GradientDrawable gradientDrawable = this.P;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(org.telegram.ui.ActionBar.m6.w0(this.Q, this.k0));
        }
        di.b1 b1Var = this.w;
        if (b1Var != null) {
            b1Var.g1();
            b1Var.invalidate();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
