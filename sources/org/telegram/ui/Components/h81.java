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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class h81 extends FrameLayout {
    public static final /* synthetic */ int s0 = 0;
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
    public final pr a0;
    public Utilities.Callback2Return b;
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
    public final org.telegram.ui.Cells.l7 i0;
    public final org.telegram.ui.ActionBar.f6 j0;
    public ValueAnimator k0;
    public Utilities.Callback2Return l0;
    public boolean m0;
    public boolean n;
    public s4.y n0;
    public d81 o0;
    public float p0;
    public final Paint q0;
    public int r;
    public dh.d r0;
    public boolean s;
    public final bi.o0 v;
    public final hg.j0 w;
    public final ng.g x;
    public g81 y;

    public h81(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
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
        this.G = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = org.telegram.ui.ActionBar.j6.Gh;
        this.Q = org.telegram.ui.ActionBar.j6.Fh;
        this.R = org.telegram.ui.ActionBar.j6.Eh;
        this.S = org.telegram.ui.ActionBar.j6.Hh;
        this.T = org.telegram.ui.ActionBar.j6.s8;
        this.a0 = pr.h;
        this.b0 = new SparseIntArray(5);
        this.c0 = new SparseIntArray(5);
        this.d0 = new SparseIntArray(5);
        this.e0 = new SparseIntArray(5);
        int i11 = 25;
        this.i0 = new org.telegram.ui.Cells.l7(this, i11);
        this.q0 = new Paint(1);
        this.j0 = f6Var;
        this.E = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        int i12 = 9;
        textPaint.setTextSize(AndroidUtilities.dp((i10 == 9 || i10 == 10 || i10 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.O = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.j6.v0(this.P, f6Var));
        int i13 = 6;
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        bi.o0 o0Var = new bi.o0(this, context, i11);
        this.v = o0Var;
        o0Var.setOverScrollMode(2);
        if (z10) {
            o0Var.setItemAnimator(null);
        } else {
            ((s4.j) o0Var.getItemAnimator()).C = false;
        }
        if (i10 == -2) {
            o0Var.setSelectorType(9);
            o0Var.setSelectorRadius(6);
        } else {
            o0Var.setSelectorType(i10 == 10 ? 9 : i10);
            if (i10 == 3) {
                o0Var.setSelectorRadius(0);
            } else {
                o0Var.setSelectorRadius(6);
            }
        }
        o0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(this.S, f6Var));
        hg.j0 j0Var = new hg.j0((ViewGroup) this, i13);
        this.w = j0Var;
        o0Var.setLayoutManager(j0Var);
        o0Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        o0Var.setClipToPadding(false);
        o0Var.setDrawSelectorBehind(true);
        ng.g gVar = new ng.g(this, context);
        this.x = gVar;
        gVar.C(z10);
        o0Var.setAdapter(gVar);
        o0Var.setOnItemClickListener(new b81(this));
        o0Var.setOnItemLongClickListener(new b81(this));
        o0Var.setOnScrollListener(new lb0(this, i12));
        if (i10 == 9 || i10 == 10) {
            addView(o0Var, w7.x5.e(-2, -1, 1));
        } else {
            addView(o0Var, w7.x5.c(-1.0f, -1));
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
        e81 e81Var = new e81();
        e81Var.a = i10;
        e81Var.b = charSequence;
        this.H = org.telegram.messenger.w1.C(this.r * 2, e81Var.a(this.c), this.H);
        arrayList.add(e81Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.V = z10;
        int i10 = 0;
        bi.o0 o0Var = this.v;
        if (z11) {
            while (i10 < o0Var.getChildCount()) {
                o0Var.getChildAt(i10).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(pr.f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i10);
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
        bi.o0 o0Var = this.v;
        if (o0Var.getVisibility() == 8 || o0Var.getMeasuredWidth() == 0) {
            AndroidUtilities.runOnUIThread(new m8(this, i10, 13), 100L);
        } else {
            o0Var.x0(i10);
        }
    }

    public final void d(int i10, int i11) {
        int i12 = this.F;
        boolean z10 = i12 < i11;
        this.N = -1;
        this.g0 = i12;
        this.h0 = this.G;
        g81 g81Var = this.y;
        if (g81Var != null) {
            a81 a81Var = ((i81) ((k2.g0) g81Var).b).L;
        }
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
        g81 g81Var2 = this.y;
        if (g81Var2 != null) {
            i81 i81Var = (i81) ((k2.g0) g81Var2).b;
            i81Var.y = z10;
            View[] viewArr = i81Var.e;
            i81Var.d = i11;
            i81Var.I(1);
            i81Var.y(i11, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    i81Var.E(view2, measuredWidth);
                } else {
                    i81Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.F);
        int i13 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k0 = ofFloat;
        ofFloat.addUpdateListener(new e61(i13, this));
        this.k0.setDuration(250L);
        this.k0.setInterpolator(pr.f);
        this.k0.addListener(new k61(this, i13));
        this.k0.start();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        int L0;
        s4.c1 K;
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        boolean drawChild = super.drawChild(canvas, view, j3);
        bi.o0 o0Var = this.v;
        if (view == o0Var) {
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
                    int alpha = (int) (o0Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.O;
                    gradientDrawable.setAlpha(alpha);
                    i10 = 0;
                    if (this.J && this.L == -1) {
                        s4.c1 K2 = o0Var.K(this.F);
                        if (K2 != null) {
                            f81 f81Var = (f81) K2.a;
                            i13 = f81Var.b;
                            dp = (int) (f81Var.getX() + ((f81Var.getMeasuredWidth() - i13) / 2));
                            int i15 = i13;
                            i10 = dp;
                            i14 = i15;
                        }
                        i14 = 0;
                    } else {
                        L0 = this.w.L0();
                        if (L0 != -1 && (K = o0Var.K(L0)) != null) {
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
                                dp = AndroidUtilities.dp(this.r) + ((int) (((i17 - i16) * this.K) + i16));
                            } else {
                                dp = AndroidUtilities.dp(this.r) + (((int) (((i17 - i16) * this.K) + i16)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i13 = (int) (((i19 - i18) * this.K) + i18);
                            int i152 = i13;
                            i10 = dp;
                            i14 = i152;
                        }
                        i14 = 0;
                    }
                    int x10 = (int) (o0Var.getX() + i10);
                    if (i14 != 0) {
                        int i20 = this.E;
                        if (i20 != 9 && i20 != 10) {
                            float f11 = x10;
                            float f12 = i14;
                            this.p0 = f12;
                            float f13 = this.a;
                            if (f13 != 1.0f) {
                                x10 = (int) AndroidUtilities.lerp(f11, f11, f13);
                                i14 = (int) AndroidUtilities.lerp(this.p0, f12, this.a);
                            }
                            if (i20 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.W * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), i14 + x10, (int) ((this.W * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f14 = this.I / 2.0f;
                            int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - AndroidUtilities.dp(12.5f)) - f14), dp2, (int) (AndroidUtilities.dp(12.5f) + x10 + i14 + f14), AndroidUtilities.dp(28.0f) + dp2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.c.getColor());
                        Paint paint = this.q0;
                        paint.setColor(l1);
                        float f15 = measuredHeight / 2.0f;
                        float dp3 = AndroidUtilities.dp(26.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f16 = dp3 / 2.0f;
                        rectF.set(x10 - AndroidUtilities.dp(12.0f), f15 - f16, AndroidUtilities.dp(12.0f) + x10 + i14, f15 + f16);
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
            int alpha2 = (int) (o0Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.O;
            gradientDrawable2.setAlpha(alpha2);
            i10 = 0;
            if (this.J) {
            }
            L0 = this.w.L0();
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
                i10 = dp;
                i14 = i1522;
                int x102 = (int) (o0Var.getX() + i10);
                if (i14 != 0) {
                }
            }
            i14 = 0;
            int x1022 = (int) (o0Var.getX() + i10);
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
        this.v.e1();
        invalidate();
        c(i11);
        if (f7 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = i10;
        }
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

    public ll0 getTabsContainer() {
        return this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.U != i14) {
            this.U = i14;
            this.N = -1;
            if (this.J) {
                AndroidUtilities.cancelRunOnUIThread(this.i0);
                this.J = false;
                setEnabled(true);
                g81 g81Var = this.y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(1.0f);
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
            int i13 = this.I;
            if (arrayList.size() == 1 || (i12 = this.E) == 9 || i12 == 10) {
                this.I = 0;
            } else {
                int i14 = this.H;
                this.I = i14 < size ? (size - i14) / arrayList.size() : 0;
            }
            if (i13 != this.I) {
                this.s = true;
                this.x.l();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.e0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.d0;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a2 = ((e81) arrayList.get(i15)).a(this.c);
                sparseIntArray2.put(i15, a2);
                sparseIntArray.put(i15, (this.I / 2) + dp);
                dp += AndroidUtilities.dp(this.r * 2) + a2 + this.I;
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
        this.v.e1();
        invalidate();
        g81 g81Var = this.y;
        if (g81Var != null) {
            ((k2.g0) g81Var).A(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.r0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(g81 g81Var) {
        this.y = g81Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.v.e1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.l0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (z10 && this.n0 == null) {
            this.n0 = new s4.y(new ci.f(this, 5));
        }
        if (this.m0 && this.o0 == null) {
            d81 d81Var = new d81(this);
            this.o0 = d81Var;
            d81Var.m = false;
            d81Var.C = false;
            d81Var.o(pr.h);
            this.o0.n(350L);
        }
        s4.y yVar = this.n0;
        bi.o0 o0Var = this.v;
        if (yVar != null) {
            yVar.d(z10 ? o0Var : null);
        }
        o0Var.setItemAnimator(z10 ? this.o0 : null);
        AndroidUtilities.forEachViews((RecyclerView) o0Var, (e2.h) new m4.s0(3, this, z10));
    }
}
