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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class m71 extends FrameLayout {
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
    public final gr T;
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
    public final ju0 e0;
    public final Paint f;
    public final org.telegram.ui.ActionBar.b6 f0;
    public ValueAnimator g0;
    public final ArrayList h;
    public Utilities.Callback2Return h0;
    public boolean i0;
    public f2.h0 j0;
    public h71 k0;
    public float l0;
    public final Paint m0;
    public boolean n;
    public kg.d n0;
    public int r;
    public boolean s;
    public final gh.f1 v;
    public final of.g0 w;
    public final i71 x;
    public l71 y;

    public m71(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
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
        this.L = org.telegram.ui.ActionBar.f6.Gh;
        this.M = org.telegram.ui.ActionBar.f6.Fh;
        this.N = org.telegram.ui.ActionBar.f6.Eh;
        this.O = org.telegram.ui.ActionBar.f6.Hh;
        this.P = org.telegram.ui.ActionBar.f6.s8;
        this.T = gr.h;
        this.U = new SparseIntArray(5);
        this.V = new SparseIntArray(5);
        this.W = new SparseIntArray(5);
        this.a0 = new SparseIntArray(5);
        this.e0 = new ju0(this, 2);
        this.m0 = new Paint(1);
        this.f0 = b6Var;
        this.A = i9;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp((i9 == 9 || i9 == 10 || i9 == -2) ? 14.0f : 15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint3.setStyle(Paint.Style.STROKE);
        textPaint3.setStrokeCap(Paint.Cap.ROUND);
        textPaint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        gradientDrawable.setColor(org.telegram.ui.ActionBar.f6.v0(this.L, b6Var));
        int i10 = 6;
        if (i9 == -2) {
            float dpf2 = AndroidUtilities.dpf2(13.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        } else {
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{dpf22, dpf22, dpf22, dpf22, 0.0f, 0.0f, 0.0f, 0.0f});
        }
        setHorizontalScrollBarEnabled(false);
        gh.f1 f1Var = new gh.f1(this, context, 25);
        this.v = f1Var;
        f1Var.setOverScrollMode(2);
        if (z10) {
            f1Var.setItemAnimator(null);
        } else {
            ((f2.n) f1Var.getItemAnimator()).C = false;
        }
        if (i9 == -2) {
            f1Var.setSelectorType(9);
            f1Var.setSelectorRadius(6);
        } else {
            f1Var.setSelectorType(i9 == 10 ? 9 : i9);
            if (i9 == 3) {
                f1Var.setSelectorRadius(0);
            } else {
                f1Var.setSelectorRadius(6);
            }
        }
        f1Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(this.O, b6Var));
        of.g0 g0Var = new of.g0((ViewGroup) this, i10);
        this.w = g0Var;
        f1Var.setLayoutManager(g0Var);
        f1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setDrawSelectorBehind(true);
        i71 i71Var = new i71(this, context);
        this.x = i71Var;
        i71Var.C(z10);
        f1Var.setAdapter(i71Var);
        f1Var.setOnItemClickListener(new f71(this));
        f1Var.setOnItemLongClickListener(new f71(this));
        f1Var.setOnScrollListener(new kn(this, 15));
        if (i9 == 9 || i9 == 10) {
            addView(f1Var, g7.e6.e(-2, -1, 1));
        } else {
            addView(f1Var, g7.e6.c(-1.0f, -1));
        }
    }

    public final void a(int i9, CharSequence charSequence) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size == 0 && this.C == -1) {
            this.C = i9;
        }
        this.U.put(size, i9);
        this.V.put(i9, size);
        int i10 = this.C;
        if (i10 != -1 && i10 == i9) {
            this.B = size;
        }
        j71 j71Var = new j71();
        j71Var.a = i9;
        j71Var.b = charSequence;
        this.D = org.telegram.messenger.l0.C(this.r * 2, j71Var.a(this.c), this.D);
        arrayList.add(j71Var);
    }

    public final void b(boolean z10, boolean z11) {
        this.R = z10;
        int i9 = 0;
        gh.f1 f1Var = this.v;
        if (z11) {
            while (i9 < f1Var.getChildCount()) {
                f1Var.getChildAt(i9).animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).setInterpolator(gr.f).setDuration(220L).start();
                i9++;
            }
        } else {
            while (i9 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i9);
                childAt.setScaleX(z10 ? 0.0f : 1.0f);
                childAt.setScaleY(z10 ? 0.0f : 1.0f);
                childAt.setAlpha(z10 ? 0.0f : 1.0f);
                i9++;
            }
            this.S = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void c(int i9) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty() || this.J == i9 || i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        this.J = i9;
        gh.f1 f1Var = this.v;
        if (f1Var.getVisibility() == 8 || f1Var.getMeasuredWidth() == 0) {
            AndroidUtilities.runOnUIThread(new qd(this, i9, 11), 100L);
        } else {
            f1Var.x0(i9);
        }
    }

    public final void d(int i9, int i10) {
        int i11 = this.B;
        boolean z10 = i11 < i10;
        this.J = -1;
        this.c0 = i11;
        this.d0 = this.C;
        l71 l71Var = this.y;
        if (l71Var != null) {
            e71 e71Var = ((n71) ((n2.p) l71Var).b).H;
        }
        this.B = i10;
        this.C = i9;
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
        l71 l71Var2 = this.y;
        if (l71Var2 != null) {
            n71 n71Var = (n71) ((n2.p) l71Var2).b;
            n71Var.y = z10;
            View[] viewArr = n71Var.e;
            n71Var.d = i10;
            n71Var.I(1);
            n71Var.y(i10, z10);
            View view = viewArr[0];
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = viewArr[1];
            if (view2 != null) {
                if (z10) {
                    n71Var.E(view2, measuredWidth);
                } else {
                    n71Var.E(view2, -measuredWidth);
                }
            }
        }
        c(this.B);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new j51(2, this));
        this.g0.setDuration(250L);
        this.g0.setInterpolator(gr.f);
        this.g0.addListener(new y11(this, 5));
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
        int i9;
        int L0;
        f2.q1 K;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        boolean drawChild = super.drawChild(canvas, view, j10);
        gh.f1 f1Var = this.v;
        if (view == f1Var) {
            int measuredHeight = getMeasuredHeight();
            boolean z10 = this.R;
            if (z10) {
                float f10 = this.S;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.1f;
                    this.S = f11;
                    if (f11 > 1.0f) {
                        this.S = 1.0f;
                    }
                    invalidate();
                    int alpha = (int) (f1Var.getAlpha() * 255.0f);
                    GradientDrawable gradientDrawable = this.K;
                    gradientDrawable.setAlpha(alpha);
                    i9 = 0;
                    if (this.F && this.H == -1) {
                        f2.q1 K2 = f1Var.K(this.B);
                        if (K2 != null) {
                            k71 k71Var = (k71) K2.a;
                            i12 = k71Var.b;
                            dp = (int) (k71Var.getX() + ((k71Var.getMeasuredWidth() - i12) / 2));
                            int i14 = i12;
                            i9 = dp;
                            i13 = i14;
                        }
                        i13 = 0;
                    } else {
                        L0 = this.w.L0();
                        if (L0 != -1 && (K = f1Var.K(L0)) != null) {
                            if (this.F) {
                                i10 = this.B;
                                i11 = this.H;
                            } else {
                                i10 = this.c0;
                                i11 = this.B;
                            }
                            SparseIntArray sparseIntArray = this.a0;
                            int i15 = sparseIntArray.get(i10);
                            int i16 = sparseIntArray.get(i11);
                            SparseIntArray sparseIntArray2 = this.W;
                            int i17 = sparseIntArray2.get(i10);
                            int i18 = sparseIntArray2.get(i11);
                            if (this.E == 0) {
                                dp = AndroidUtilities.dp(this.r) + ((int) (((i16 - i15) * this.G) + i15));
                            } else {
                                dp = AndroidUtilities.dp(this.r) + (((int) (((i16 - i15) * this.G) + i15)) - (sparseIntArray.get(L0) - K.a.getLeft()));
                            }
                            i12 = (int) (((i18 - i17) * this.G) + i17);
                            int i142 = i12;
                            i9 = dp;
                            i13 = i142;
                        }
                        i13 = 0;
                    }
                    int x10 = (int) (f1Var.getX() + i9);
                    if (i13 != 0) {
                        int i19 = this.A;
                        if (i19 != 9 && i19 != 10) {
                            float f12 = x10;
                            float f13 = i13;
                            this.l0 = f13;
                            float f14 = this.a;
                            if (f14 != 1.0f) {
                                x10 = (int) AndroidUtilities.lerp(f12, f12, f14);
                                i13 = (int) AndroidUtilities.lerp(this.l0, f13, this.a);
                            }
                            if (i19 != -2) {
                                gradientDrawable.setBounds(x10, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + (measuredHeight - AndroidUtilities.dpr(4.0f))), i13 + x10, (int) ((this.S * AndroidUtilities.dpr(4.0f)) + measuredHeight));
                                gradientDrawable.draw(canvas);
                                return drawChild;
                            }
                            float f15 = this.E / 2.0f;
                            int dp2 = (measuredHeight / 2) - AndroidUtilities.dp(14.0f);
                            gradientDrawable.setBounds((int) ((x10 - AndroidUtilities.dp(12.5f)) - f15), dp2, (int) (AndroidUtilities.dp(12.5f) + x10 + i13 + f15), AndroidUtilities.dp(28.0f) + dp2);
                            gradientDrawable.setAlpha(31);
                            gradientDrawable.draw(canvas);
                            return drawChild;
                        }
                        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, this.c.getColor());
                        Paint paint = this.m0;
                        paint.setColor(l1);
                        float f16 = measuredHeight / 2.0f;
                        float dp3 = AndroidUtilities.dp(26.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f17 = dp3 / 2.0f;
                        rectF.set(x10 - AndroidUtilities.dp(12.0f), f16 - f17, AndroidUtilities.dp(12.0f) + x10 + i13, f16 + f17);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    }
                }
            }
            if (!z10) {
                float f18 = this.S;
                if (f18 != 0.0f) {
                    float f19 = f18 - 0.12f;
                    this.S = f19;
                    if (f19 < 0.0f) {
                        this.S = 0.0f;
                    }
                    invalidate();
                }
            }
            int alpha2 = (int) (f1Var.getAlpha() * 255.0f);
            GradientDrawable gradientDrawable2 = this.K;
            gradientDrawable2.setAlpha(alpha2);
            i9 = 0;
            if (this.F) {
            }
            L0 = this.w.L0();
            if (L0 != -1) {
                if (this.F) {
                }
                SparseIntArray sparseIntArray3 = this.a0;
                int i152 = sparseIntArray3.get(i10);
                int i162 = sparseIntArray3.get(i11);
                SparseIntArray sparseIntArray22 = this.W;
                int i172 = sparseIntArray22.get(i10);
                int i182 = sparseIntArray22.get(i11);
                if (this.E == 0) {
                }
                i12 = (int) (((i182 - i172) * this.G) + i172);
                int i1422 = i12;
                i9 = dp;
                i13 = i1422;
                int x102 = (int) (f1Var.getX() + i9);
                if (i13 != 0) {
                }
            }
            i13 = 0;
            int x1022 = (int) (f1Var.getX() + i9);
            if (i13 != 0) {
            }
        }
        return drawChild;
    }

    public abstract void e(float f10, int i9, int i10);

    public final void f(float f10, int i9) {
        int i10 = this.V.get(i9, -1);
        if (i10 < 0) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            this.H = i10;
            this.I = i9;
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i10;
            this.C = i9;
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

    public wk0 getTabsContainer() {
        return this.v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int i13 = i11 - i9;
        if (this.Q != i13) {
            this.Q = i13;
            this.J = -1;
            if (this.F) {
                AndroidUtilities.cancelRunOnUIThread(this.e0);
                this.F = false;
                setEnabled(true);
                l71 l71Var = this.y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(1.0f);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int size = (View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(7.0f)) - AndroidUtilities.dp(7.0f);
            int i12 = this.E;
            if (arrayList.size() == 1 || (i11 = this.A) == 9 || i11 == 10) {
                this.E = 0;
            } else {
                int i13 = this.D;
                this.E = i13 < size ? (size - i13) / arrayList.size() : 0;
            }
            if (i12 != this.E) {
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
            for (int i14 = 0; i14 < size2; i14++) {
                int a2 = ((j71) arrayList.get(i14)).a(this.c);
                sparseIntArray2.put(i14, a2);
                sparseIntArray.put(i14, (this.E / 2) + dp);
                dp += AndroidUtilities.dp(this.r * 2) + a2 + this.E;
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.G = f10;
        this.v.f1();
        invalidate();
        l71 l71Var = this.y;
        if (l71Var != null) {
            ((n2.p) l71Var).F(f10);
        }
    }

    public void setBlurredBackground(kg.d dVar) {
        this.n0 = dVar;
        setBackground(dVar);
    }

    public void setDelegate(l71 l71Var) {
        this.y = l71Var;
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
            this.j0 = new f2.h0(new jh.f(this, 5));
        }
        if (this.i0 && this.k0 == null) {
            h71 h71Var = new h71(this);
            this.k0 = h71Var;
            h71Var.m = false;
            h71Var.C = false;
            h71Var.o(gr.h);
            this.k0.n(350L);
        }
        f2.h0 h0Var = this.j0;
        gh.f1 f1Var = this.v;
        if (h0Var != null) {
            h0Var.d(z10 ? f1Var : null);
        }
        f1Var.setItemAnimator(z10 ? this.k0 : null);
        AndroidUtilities.forEachViews((RecyclerView) f1Var, (d5.d) new org.telegram.ui.kc(2, this, z10));
    }
}
