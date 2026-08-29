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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class y71 extends FrameLayout {
    public static final /* synthetic */ int o0 = 0;
    public final int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public float G;
    public int H;
    public int I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public final jr T;
    public final SparseIntArray U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public float a;
    public final SparseIntArray a0;
    public Utilities.Callback2Return b;
    public float b0;
    public final TextPaint c;
    public int c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public final rk0 e0;
    public final Paint f;
    public final org.telegram.ui.ActionBar.c6 f0;
    public ValueAnimator g0;
    public final ArrayList h;
    public Utilities.Callback2Return h0;
    public boolean i0;
    public f2.e0 j0;
    public t71 k0;
    public float l0;
    public final Paint m0;
    public boolean n;
    public ng.d n0;
    public int r;
    public boolean s;
    public final jh.e1 v;
    public final org.telegram.ui.vq w;
    public final u71 x;
    public x71 y;

    public y71(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
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
        this.C = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.g6.Gh;
        this.M = org.telegram.ui.ActionBar.g6.Fh;
        this.N = org.telegram.ui.ActionBar.g6.Eh;
        this.O = org.telegram.ui.ActionBar.g6.Hh;
        this.P = org.telegram.ui.ActionBar.g6.s8;
        this.T = jr.h;
        int i11 = 5;
        this.U = new SparseIntArray(5);
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.a0 = new SparseIntArray(5);
        this.e0 = new rk0(this, i11);
        this.m0 = new Paint(1);
        this.f0 = c6Var;
        this.A = i10;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp((i10 == 9 || i10 == 10 || i10 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.g6.v0(this.L, c6Var));
        if (i10 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        jh.e1 e1Var = new jh.e1(this, context, 24);
        this.v = e1Var;
        e1Var.setOverScrollMode(2);
        if (z10) {
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
        e1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(this.O, c6Var));
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, i11);
        this.w = vqVar;
        e1Var.setLayoutManager(vqVar);
        e1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setDrawSelectorBehind(true);
        u71 u71Var = new u71(this, context);
        this.x = u71Var;
        u71Var.C(z10);
        e1Var.setAdapter(u71Var);
        e1Var.setOnItemClickListener(new r71(this));
        e1Var.setOnItemLongClickListener(new r71(this));
        e1Var.setOnScrollListener(new h00(this, 11));
        if (i10 == 9 || i10 == 10) {
            addView(e1Var, i7.f6.e(-2, -1, 1));
        } else {
            addView(e1Var, i7.f6.c(-1.0f, -1));
        }
    }

    public final void a(int i10, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.C == -1) {
            this.C = i10;
        }
        this.U.put(size, i10);
        this.V.put(i10, size);
        int i11 = this.C;
        if (i11 != -1 && i11 == i10) {
            this.B = size;
        }
        v71 v71Var = new v71();
        v71Var.a = i10;
        v71Var.b = charSequence;
        this.D = org.telegram.messenger.x3.C(this.r * 2, v71Var.a(this.c), this.D);
        arrayList.add(v71Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.R = z10;
        int i10 = 0;
        jh.e1 e1Var = this.v;
        if (z11) {
            while (i10 < e1Var.getChildCount()) {
                e1Var.getChildAt(i10).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(jr.f).setDuration(220L).start();
                i10++;
            }
        } else {
            while (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i10++;
            }
            this.S = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.J == i10 || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.J = i10;
        jh.e1 e1Var = this.v;
        if (e1Var.getVisibility() == 8 || e1Var.getMeasuredWidth() == 0) {
            AndroidUtilities.runOnUIThread(new i8(this, i10, 13), 100L);
        } else {
            e1Var.x0(i10);
        }
    }

    public final void d(int i10, int i11) {
        int i12 = this.B;
        boolean z10 = i12 < i11;
        this.J = -1;
        this.c0 = i12;
        this.d0 = this.C;
        x71 x71Var = this.y;
        if (x71Var != null) {
            q71 q71Var = ((z71) ((n) x71Var).b).H;
        }
        this.B = i11;
        this.C = i10;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.F) {
            this.F = false;
        }
        this.b0 = 0.0f;
        this.G = 0.0f;
        this.F = true;
        setEnabled(false);
        x71 x71Var2 = this.y;
        if (x71Var2 != null) {
            z71 z71Var = (z71) ((n) x71Var2).b;
            z71Var.y = z10;
            View[] viewArr = z71Var.e;
            z71Var.d = i11;
            z71Var.I(1);
            z71Var.y(i11, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    z71Var.E(view2, measuredWidth);
                } else {
                    z71Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.B);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new v51(2, this));
        this.g0.setDuration(250L);
        this.g0.setInterpolator(jr.f);
        this.g0.addListener(new p11(this, 7));
        this.g0.start();
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
        f2.n1 K;
        int i11;
        int i12;
        int dp;
        int i13;
        int i14;
        boolean drawChild = super.drawChild(canvas, view, j10);
        jh.e1 e1Var = this.v;
        if (view == e1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z10 = this.R;
            if (z10) {
                float f9 = this.S;
                if (f9 != 1.0f) {
                    float f10 = f9 + 0.1f;
                    this.S = f10;
                    if (f10 > 1.0f) {
                        this.S = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (e1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.K;
                    gradientDrawable.setAlpha(alpha);
                    i10 = 0;
                    if (this.F && this.H == -1) {
                        f2.n1 K2 = e1Var.K(this.B);
                        if (K2 != null) {
                            w71 w71Var = (w71) K2.a;
                            i13 = w71Var.b;
                            dp = (int) (w71Var.getX() + ((w71Var.getMeasuredWidth() - i13) / 2));
                            int i15 = i13;
                            i10 = dp;
                            i14 = i15;
                        }
                        i14 = 0;
                    } else {
                        L0 = this.w.L0();
                        if (L0 != -1 && (K = e1Var.K(L0)) != null) {
                            if (this.F) {
                                i11 = this.B;
                                i12 = this.H;
                            } else {
                                i11 = this.c0;
                                i12 = this.B;
                            }
                            SparseIntArray sparseIntArray = this.a0;
                            int i16 = sparseIntArray.get(i11);
                            int i17 = sparseIntArray.get(i12);
                            SparseIntArray sparseIntArray2 = this.W;
                            int i18 = sparseIntArray2.get(i11);
                            int i19 = sparseIntArray2.get(i12);
                            if (this.E == 0) {
                                dp = AndroidUtilities.dp(this.r) + ((int) (((i17 - i16) * this.G) + i16));
                            } else {
                                dp = AndroidUtilities.dp(this.r) + (((int) (((i17 - i16) * this.G) + i16)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i13 = (int) (((i19 - i18) * this.G) + i18);
                            int i152 = i13;
                            i10 = dp;
                            i14 = i152;
                        }
                        i14 = 0;
                    }
                    int x4 = (int) (e1Var.getX() + i10);
                    if (i14 != 0) {
                        int i20 = this.A;
                        if (i20 != 9 && i20 != 10) {
                            float f11 = x4;
                            float f12 = i14;
                            this.l0 = f12;
                            float f13 = this.a;
                            if (f13 != 1.0f) {
                                x4 = (int) AndroidUtilities.lerp(f11, f11, f13);
                                i14 = (int) AndroidUtilities.lerp(this.l0, f12, this.a);
                            }
                            if (i20 != -2) {
                                gradientDrawable.setBounds(x4, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), i14 + x4, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f14 = this.E / 2.0f;
                            int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                            gradientDrawable.setBounds((int) ((x4 - AndroidUtilities.dp(12.5f)) - f14), dp2, (int) (AndroidUtilities.dp(12.5f) + x4 + i14 + f14), AndroidUtilities.dp(28.0f) + dp2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, this.c.getColor());
                        Paint paint = this.m0;
                        paint.setColor(l1);
                        float f15 = measuredHeight / 2.0f;
                        float dp3 = AndroidUtilities.dp(26.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f16 = dp3 / 2.0f;
                        rectF.set(x4 - AndroidUtilities.dp(12.0f), f15 - f16, AndroidUtilities.dp(12.0f) + x4 + i14, f15 + f16);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    }
                }
            }
            if (!z10) {
                float f17 = this.S;
                if (f17 != 0.0f) {
                    float f18 = f17 - 0.12f;
                    this.S = f18;
                    if (f18 < 0.0f) {
                        this.S = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (e1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.K;
            gradientDrawable2.setAlpha(alpha2);
            i10 = 0;
            if (this.F) {
            }
            L0 = this.w.L0();
            if (L0 != -1) {
                if (this.F) {
                }
                SparseIntArray sparseIntArray3 = this.a0;
                int i162 = sparseIntArray3.get(i11);
                int i172 = sparseIntArray3.get(i12);
                SparseIntArray sparseIntArray22 = this.W;
                int i182 = sparseIntArray22.get(i11);
                int i192 = sparseIntArray22.get(i12);
                if (this.E == 0) {
                }
                i13 = (int) (((i192 - i182) * this.G) + i182);
                int i1522 = i13;
                i10 = dp;
                i14 = i1522;
                int x42 = (int) (e1Var.getX() + i10);
                if (i14 != 0) {
                }
            }
            i14 = 0;
            int x422 = (int) (e1Var.getX() + i10);
            if (i14 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f9, int i10, int i11);

    public final void f(float f9, int i10) {
        int i11 = this.V.get(i10, -1);
        if (i11 < 0) {
            return;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f9 > 0.0f) {
            this.H = i11;
            this.I = i10;
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f9;
        this.v.f1();
        invalidate();
        c(i11);
        if (f9 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i11;
            this.C = i10;
        }
    }

    public float getAnimatingIndicatorProgress() {
        return this.G;
    }

    public int getCurrentPosition() {
        return this.B;
    }

    public int getCurrentTabId() {
        return this.C;
    }

    public int getFirstTabId() {
        return this.U.get(0, 0);
    }

    public int getPreviousPosition() {
        return this.c0;
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public jl0 getTabsContainer() {
        return this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (this.Q != i14) {
            this.Q = i14;
            this.J = -1;
            if (this.F) {
                AndroidUtilities.cancelRunOnUIThread(this.e0);
                this.F = false;
                setEnabled(true);
                x71 x71Var = this.y;
                if (x71Var != null) {
                    ((n) x71Var).j(1.0f);
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
            int i13 = this.E;
            if (arrayList.size() == 1 || (i12 = this.A) == 9 || i12 == 10) {
                this.E = 0;
            } else {
                int i14 = this.D;
                this.E = i14 < size ? (size - i14) / arrayList.size() : 0;
            }
            if (i13 != this.E) {
                this.s = true;
                this.x.l();
                this.s = false;
            }
            SparseIntArray sparseIntArray = this.a0;
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.W;
            sparseIntArray2.clear();
            int dp = AndroidUtilities.dp(7.0f);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                int a2 = ((v71) arrayList.get(i15)).a(this.c);
                sparseIntArray2.put(i15, a2);
                sparseIntArray.put(i15, (this.E / 2) + dp);
                dp += AndroidUtilities.dp(this.r * 2) + a2 + this.E;
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

    public void setAnimationIdicatorProgress(float f9) {
        this.G = f9;
        this.v.f1();
        invalidate();
        x71 x71Var = this.y;
        if (x71Var != null) {
            ((n) x71Var).j(f9);
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.n0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(x71 x71Var) {
        this.y = x71Var;
    }

    public void setIsEditing(boolean z10) {
        this.n = z10;
        this.v.f1();
        invalidate();
    }

    public void setOnTabLongClick(Utilities.Callback2Return<Integer, View, Boolean> callback2Return) {
        this.b = callback2Return;
    }

    public void setPreTabClick(Utilities.Callback2Return<Integer, Integer, Boolean> callback2Return) {
        this.h0 = callback2Return;
    }

    public void setReordering(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        if (z10 && this.j0 == null) {
            this.j0 = new f2.e0(new mh.f(this, 5));
        }
        if (this.i0 && this.k0 == null) {
            t71 t71Var = new t71(this);
            this.k0 = t71Var;
            t71Var.m = false;
            t71Var.C = false;
            t71Var.o(jr.h);
            this.k0.n(350L);
        }
        f2.e0 e0Var = this.j0;
        jh.e1 e1Var = this.v;
        if (e0Var != null) {
            e0Var.d(z10 ? e1Var : null);
        }
        e1Var.setItemAnimator(z10 ? this.k0 : null);
        AndroidUtilities.forEachViews((RecyclerView) e1Var, (f5.d) new org.telegram.ui.jc(2, this, z10));
    }
}
