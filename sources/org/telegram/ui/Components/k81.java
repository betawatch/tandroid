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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class k81 extends FrameLayout {
    public static final /* synthetic */ int p0 = 0;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public int J;
    public int K;
    public final GradientDrawable L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public float T;
    public final nr U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float a;
    public final SparseIntArray a0;
    public Utilities.Callback2Return b;
    public final SparseIntArray b0;
    public final TextPaint c;
    public float c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public int e0;
    public final Paint f;
    public final tl0 f0;
    public final org.telegram.ui.ActionBar.f6 g0;
    public final ArrayList h;
    public ValueAnimator h0;
    public Utilities.Callback2Return i0;
    public boolean j0;
    public f2.e0 k0;
    public f81 l0;
    public float m0;
    public boolean n;
    public final Paint n0;
    public pg.b o0;
    public int r;
    public boolean s;
    public final lh.e1 v;
    public final org.telegram.ui.br w;
    public final g81 x;
    public j81 y;

    public k81(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
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
        this.D = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.j6.Gh;
        this.N = org.telegram.ui.ActionBar.j6.Fh;
        this.O = org.telegram.ui.ActionBar.j6.Eh;
        this.P = org.telegram.ui.ActionBar.j6.Hh;
        this.Q = org.telegram.ui.ActionBar.j6.s8;
        this.U = nr.h;
        int i11 = 5;
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.a0 = new SparseIntArray(5);
        this.b0 = new SparseIntArray(5);
        this.f0 = new tl0(this, 4);
        this.n0 = new Paint(1);
        this.g0 = f6Var;
        this.B = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        int i12 = 9;
        textPaint.setTextSize(AndroidUtilities.dp((i10 == 9 || i10 == 10 || i10 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.M, f6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        lh.e1 e1Var = new lh.e1(this, context, 23);
        this.v = e1Var;
        e1Var.setOverScrollMode(2);
        if (z4) {
            e1Var.setItemAnimator(null);
        } else {
            ((f2.l) e1Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            e1Var.setSelectorType(9);
            e1Var.setSelectorRadius(6);
        } else {
            e1Var.setSelectorType(i10 == 10 ? 9 : i10);
            if (i10 == 3) {
                e1Var.setSelectorRadius(0);
            } else {
                e1Var.setSelectorRadius(6);
            }
        }
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.P, f6Var));
        org.telegram.ui.br brVar = new org.telegram.ui.br((ViewGroup) this, i11);
        this.w = brVar;
        e1Var.setLayoutManager(brVar);
        e1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        g81 g81Var = new g81(this, context);
        this.x = g81Var;
        g81Var.C(z4);
        e1Var.setAdapter(g81Var);
        e1Var.setOnItemClickListener(new d81(this));
        e1Var.setOnItemLongClickListener(new d81(this));
        e1Var.setOnScrollListener(new lb0(this, i12));
        if (i10 == 9 || i10 == 10) {
            addView(e1Var, k7.b6.e(-2, -1, 1));
        } else {
            addView(e1Var, k7.b6.c(-1.0f, -1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.D == -1) {
            this.D = i10;
        }
        this.V.put(size, i10);
        this.W.put(i10, size);
        int i11 = this.D;
        if (i11 != -1 && i11 == i10) {
            this.C = size;
        }
        h81 h81Var = new h81();
        h81Var.a = i10;
        h81Var.b = charSequence;
        this.E = org.telegram.messenger.y3.C(this.r * 2, h81Var.a(this.c), this.E);
        arrayList.add(h81Var);
    }

    public final void b(boolean z4, boolean z10) {
        this.S = z4;
        int i10 = 0;
        lh.e1 e1Var = this.v;
        if (z10) {
            while (i10 < e1Var.getChildCount()) {
                e1Var.getChildAt(i10).animate().alpha(z4 ? 0.0f : 1.0f).scaleX(z4 ? 0.0f : 1.0f).scaleY(z4 ? 0.0f : 1.0f).setInterpolator(nr.f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                childAt.setScaleX(z4 ? 0.0f : 1.0f);
                childAt.setScaleY(z4 ? 0.0f : 1.0f);
                childAt.setAlpha(z4 ? 0.0f : 1.0f);
                i10++;
            }
            this.T = z4 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.K == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.K = i10;
        lh.e1 e1Var = this.v;
        if (e1Var.getVisibility() == 8 || e1Var.getMeasuredWidth() == 0) {
            AndroidUtilities.runOnUIThread(new hm(this, i10, 10), 100L);
        } else {
            e1Var.x0(i10);
        }
    }

    public final void d(int i10, int i11) {
        int i12 = this.C;
        boolean z4 = i12 < i11;
        this.K = -1;
        this.d0 = i12;
        this.e0 = this.D;
        j81 j81Var = this.y;
        if (j81Var != null) {
            c81 c81Var = ((l81) ((o2.o) j81Var).b).I;
        }
        this.C = i11;
        this.D = i10;
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.G) {
            this.G = false;
        }
        this.c0 = 0.0f;
        this.H = 0.0f;
        this.G = true;
        setEnabled(false);
        j81 j81Var2 = this.y;
        if (j81Var2 != null) {
            l81 l81Var = (l81) ((o2.o) j81Var2).b;
            l81Var.y = z4;
            View[] viewArr = l81Var.e;
            l81Var.d = i11;
            l81Var.I(1);
            l81Var.y(i11, z4);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z4) {
                    l81Var.E(view2, measuredWidth);
                } else {
                    l81Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.C);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new h61(2, this));
        this.h0.setDuration(250L);
        this.h0.setInterpolator(nr.f);
        this.h0.addListener(new nd0(this, 28));
        this.h0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int L0;
        f2.l1 K;
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        boolean drawChild = super.drawChild(canvas, view, j10);
        lh.e1 e1Var = this.v;
        if (view == e1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z4 = this.S;
            if (z4) {
                float f10 = this.T;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.1f;
                    this.T = f11;
                    if (f11 > 1.0f) {
                        this.T = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (e1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.L;
                    gradientDrawable.setAlpha(alpha);
                    i10 = 0;
                    if (this.G && this.I == -1) {
                        f2.l1 K2 = e1Var.K(this.C);
                        if (K2 != null) {
                            i81 i81Var = (i81) K2.a;
                            i13 = i81Var.b;
                            dp = (int) (i81Var.getX() + ((i81Var.getMeasuredWidth() - i13) / 2));
                            int i15 = i13;
                            i10 = dp;
                            i14 = i15;
                        }
                        i14 = 0;
                    } else {
                        L0 = this.w.L0();
                        if (L0 != -1 && (K = e1Var.K(L0)) != null) {
                            if (this.G) {
                                i11 = this.C;
                                i12 = this.I;
                            } else {
                                i11 = this.d0;
                                i12 = this.C;
                            }
                            SparseIntArray sparseIntArray = this.b0;
                            int i16 = sparseIntArray.get(i11);
                            int i17 = sparseIntArray.get(i12);
                            SparseIntArray sparseIntArray2 = this.a0;
                            int i18 = sparseIntArray2.get(i11);
                            int i19 = sparseIntArray2.get(i12);
                            if (this.F == 0) {
                                dp = AndroidUtilities.dp(this.r) + ((int) (((i17 - i16) * this.H) + i16));
                            } else {
                                dp = AndroidUtilities.dp(this.r) + (((int) (((i17 - i16) * this.H) + i16)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i13 = (int) (((i19 - i18) * this.H) + i18);
                            int i152 = i13;
                            i10 = dp;
                            i14 = i152;
                        }
                        i14 = 0;
                    }
                    int x10 = (int) (e1Var.getX() + i10);
                    if (i14 != 0) {
                        int i20 = this.B;
                        if (i20 != 9 && i20 != 10) {
                            float f12 = x10;
                            float f13 = i14;
                            this.m0 = f13;
                            float f14 = this.a;
                            if (f14 != 1.0f) {
                                x10 = (int) AndroidUtilities.lerp(f12, f12, f14);
                                i14 = (int) AndroidUtilities.lerp(this.m0, f13, this.a);
                            }
                            if (i20 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.T * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), i14 + x10, (int) ((this.T * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f15 = this.F / 2.0f;
                            int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - AndroidUtilities.dp(12.5f)) - f15), dp2, (int) (AndroidUtilities.dp(12.5f) + x10 + i14 + f15), AndroidUtilities.dp(28.0f) + dp2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.c.getColor());
                        Paint paint = this.n0;
                        paint.setColor(l1);
                        float f16 = measuredHeight / 2.0f;
                        float dp3 = AndroidUtilities.dp(26.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f17 = dp3 / 2.0f;
                        rectF.set(x10 - AndroidUtilities.dp(12.0f), f16 - f17, AndroidUtilities.dp(12.0f) + x10 + i14, f16 + f17);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    }
                }
            }
            if (!z4) {
                float f18 = this.T;
                if (f18 != 0.0f) {
                    float f19 = f18 - 0.12f;
                    this.T = f19;
                    if (f19 < 0.0f) {
                        this.T = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (e1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.L;
            gradientDrawable2.setAlpha(alpha2);
            i10 = 0;
            if (this.G) {
            }
            L0 = this.w.L0();
            if (L0 != -1) {
                if (this.G) {
                }
                SparseIntArray sparseIntArray3 = this.b0;
                int i162 = sparseIntArray3.get(i11);
                int i172 = sparseIntArray3.get(i12);
                SparseIntArray sparseIntArray22 = this.a0;
                int i182 = sparseIntArray22.get(i11);
                int i192 = sparseIntArray22.get(i12);
                if (this.F == 0) {
                }
                i13 = (int) (((i192 - i182) * this.H) + i182);
                int i1522 = i13;
                i10 = dp;
                i14 = i1522;
                int x102 = (int) (e1Var.getX() + i10);
                if (i14 != 0) {
                }
            }
            i14 = 0;
            int x1022 = (int) (e1Var.getX() + i10);
            if (i14 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f10, int i10, int i11);

    public final void f(float f10, int i10) {
        int i11 = this.W.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.I = i11;
            this.J = i10;
        } else {
            this.I = -1;
            this.J = -1;
        }
        this.H = f10;
        this.v.f1();
        invalidate();
        c(i11);
        if (f10 >= 1.0f) {
            this.I = -1;
            this.J = -1;
            this.C = i11;
            this.D = i10;
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.H;
    }

    public int getCurrentPosition() {
        return this.C;
    }

    public int getCurrentTabId() {
        return this.D;
    }

    public int getFirstTabId() {
        return this.V.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.d0;
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public sl0 getTabsContainer() {
        return this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.R != i14) {
            this.R = i14;
            this.K = -1;
            if (this.G) {
                AndroidUtilities.cancelRunOnUIThread(this.f0);
                this.G = false;
                setEnabled(true);
                j81 j81Var = this.y;
                if (j81Var != null) {
                    ((o2.o) j81Var).q(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
            int i13 = this.F;
            if (arrayList.size() == 1 || (i12 = this.B) == 9 || i12 == 10) {
                this.F = 0;
            } else {
                int i14 = this.E;
                this.F = i14 < size ? (size - i14) / arrayList.size() : 0;
            }
            if (i13 != this.F) {
                this.s = true;
                this.x.l();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.b0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.a0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a2 = ((h81) arrayList.get(i15)).a(this.c);
                sparseIntArray2.put(i15, a2);
                sparseIntArray.put(i15, (this.F / 2) + dp);
                dp += AndroidUtilities.dp(this.r * 2) + a2 + this.F;
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

    public void setAnimationIdicatorProgress(float f10) {
        this.H = f10;
        this.v.f1();
        invalidate();
        j81 j81Var = this.y;
        if (j81Var != null) {
            ((o2.o) j81Var).q(f10);
        }
    }

    public void setBlurredBackground(pg.b bVar) {
        this.o0 = bVar;
        setBackground(bVar);
    }

    public void setDelegate(j81 j81Var) {
        this.y = j81Var;
    }

    public void setIsEditing(boolean z4) {
        this.n = z4;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.i0 = callback2Return;
    }

    public void setReordering(boolean z4) {
        if (this.j0 == z4) {
            return;
        }
        this.j0 = z4;
        if (z4 && this.k0 == null) {
            this.k0 = new f2.e0(new oh.f(this, 5));
        }
        if (this.j0 && this.l0 == null) {
            f81 f81Var = new f81(this);
            this.l0 = f81Var;
            f81Var.m = false;
            f81Var.C = false;
            f81Var.o(nr.h);
            this.l0.n(350L);
        }
        f2.e0 e0Var = this.k0;
        lh.e1 e1Var = this.v;
        if (e0Var != null) {
            e0Var.d(z4 ? e1Var : null);
        }
        e1Var.setItemAnimator(z4 ? this.l0 : null);
        AndroidUtilities.forEachViews((RecyclerView) e1Var, (h5.d) new org.telegram.ui.pc(2, this, z4));
    }
}
