package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int o0 = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final pr N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final cc1 a;
    public float a0;
    public lm0 b;
    public long b0;
    public final org.telegram.ui.ActionBar.f6 c;
    public View c0;
    public boolean d;
    public final org.telegram.ui.Cells.l7 d0;
    public boolean e;
    public dh.d e0;
    public boolean f;
    public final Path f0;
    public final RectF g0;
    public int h;
    public final RectF h0;
    public final e6 i0;
    public final e6 j0;
    public final e6 k0;
    public boolean l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.j6.I8;
        this.M = org.telegram.ui.ActionBar.j6.J8;
        pr prVar = pr.h;
        this.N = prVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.b0 = 200L;
        this.d0 = new org.telegram.ui.Cells.l7(this, 22);
        this.f0 = new Path();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new e6(this, 420L, prVar);
        this.j0 = new e6(this, 420L, prVar);
        this.k0 = new e6(this, 420L, prVar);
        this.m0 = true;
        this.c = f6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        cc1 cc1Var = new cc1(this, context, 9);
        this.a = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        cc1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(cc1Var);
        d();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.r == -1) {
            this.r = i10;
        }
        this.O.put(i11, i10);
        this.P.put(i10, i11);
        int i12 = this.r;
        if (i12 != -1 && i12 == i10) {
            this.n = i11;
            this.x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new km0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new di.o4(this, i10, 13));
            textView.setOnLongClickListener(new kh.g(this, i10, 1));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(di.f4.g(r6, textView.getPaint())));
        this.a.addView(textView, w7.x5.n(0, -1));
        this.s += dp;
        this.R.put(i11, dp);
        d();
    }

    public final void b() {
        float d = this.i0.d(1.0f, false);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.h0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.g0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        dh.d dVar = this.e0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.e0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.e0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        cc1 cc1Var = this.a;
        int childCount = cc1Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) cc1Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.n == i10 ? this.L : this.M));
            textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(this.n == i10 ? this.L : this.M, this.c)));
            if (this.e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i10) != sparseIntArray2.get(i10)) {
                    textView.requestLayout();
                }
            } else if (i10 == 0) {
                int i11 = textView.getLayoutParams().width;
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
                if (i11 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i10++;
        }
        sparseIntArray.clear();
        for (int i12 = 0; i12 < sparseIntArray2.size(); i12++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i12), sparseIntArray2.valueAt(i12));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        cc1 cc1Var = this.a;
        int childCount = cc1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.f6 f6Var = this.c;
            if (i10 >= childCount) {
                this.K.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.L, f6Var))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) cc1Var.getChildAt(i10);
                textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(this.n == i10 ? this.L : this.M, f6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.L, f6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.e0 != null) {
            if (this.i0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.e0.n = this.k0.e(this.m0);
            this.e0.draw(canvas);
            canvas.clipPath(this.f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.j0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cc1 cc1Var = this.a;
        if (view != cc1Var) {
            return super.drawChild(canvas, view, j3);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        int measuredHeight = getMeasuredHeight();
        float f7 = this.v + this.W;
        float f10 = this.w + f7 + this.a0;
        View childAt = cc1Var.getChildAt(this.n);
        if (this.n0 && childAt != null) {
            f7 += childAt.getTranslationX();
            f10 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.K;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (cc1Var.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f7), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    public final boolean e(int i10) {
        return this.P.get(i10, -1) != -1;
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            cc1 cc1Var = this.a;
            int childCount = cc1Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                cc1Var.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), cc1Var.getChildAt(i10));
            i10++;
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.n;
    }

    public int getCurrentTabId() {
        return this.r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.O.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        lm0 lm0Var;
        if (i11 >= 0) {
            if (view == null && this.H) {
                return;
            }
            int i12 = this.n;
            if (i11 == i12 && (lm0Var = this.b) != null) {
                lm0Var.C();
                return;
            }
            boolean z10 = i12 < i11;
            this.J = -1;
            this.T = i12;
            this.n = i11;
            this.r = i10;
            boolean z11 = this.H;
            org.telegram.ui.Cells.l7 l7Var = this.d0;
            if (z11) {
                AndroidUtilities.cancelRunOnUIThread(l7Var);
                this.H = false;
            }
            this.S = 0.0f;
            this.H = true;
            this.y = this.v;
            this.E = this.w;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.G = textView.getMeasuredWidth();
                this.F = i2.g.C(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(l7Var, 16L);
            lm0 lm0Var2 = this.b;
            if (lm0Var2 != null) {
                lm0Var2.b(i10, z10);
            }
            i(i11, true);
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h == 0 || this.J == i10) {
            return;
        }
        this.J = i10;
        TextView textView = (TextView) this.a.getChildAt(i10);
        if (textView == null) {
            return;
        }
        int scrollX = getScrollX();
        int left = textView.getLeft();
        int measuredWidth = textView.getMeasuredWidth();
        if (left - AndroidUtilities.dp(50.0f) < scrollX) {
            if (z10) {
                smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            } else {
                scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            }
        }
        int i11 = left + measuredWidth;
        if (AndroidUtilities.dp(21.0f) + i11 > getWidth() + scrollX) {
            if (z10) {
                smoothScrollTo(i11, 0);
            } else {
                scrollTo(i11, 0);
            }
        }
    }

    public final void j(float f7, int i10) {
        int i11;
        int i12 = this.P.get(i10, -1);
        if (i12 >= 0 && (i11 = this.n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            cc1 cc1Var = this.a;
            TextView textView = (TextView) cc1Var.getChildAt(i11);
            TextView textView2 = (TextView) cc1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.y = i2.g.C(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = i2.g.C(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                k(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                i(cc1Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.n = i12;
                this.r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        int f10 = f(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int f11 = f(org.telegram.ui.ActionBar.j6.v0(this.M, f6Var));
        int red = Color.red(f10);
        int green = Color.green(f10);
        int blue = Color.blue(f10);
        int alpha = Color.alpha(f10);
        int red2 = Color.red(f11);
        int green2 = Color.green(f11);
        int blue2 = Color.blue(f11);
        int alpha2 = Color.alpha(f11);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f7) + alpha), (int) (((red2 - red) * f7) + red), (int) (((green2 - green) * f7) + green), (int) (((blue2 - blue) * f7) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f7) + alpha2), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2)));
        this.v = (int) (((this.F - r14) * f7) + this.y);
        this.w = (int) (((this.G - r14) * f7) + this.E);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.x != i15) {
            this.x = i15;
            this.J = -1;
            if (this.H) {
                AndroidUtilities.cancelRunOnUIThread(this.d0);
                this.H = false;
                setEnabled(true);
                lm0 lm0Var = this.b;
                if (lm0Var != null) {
                    lm0Var.D0(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.w;
                int C = i2.g.C(measuredWidth, i16, 2, left);
                this.v = C;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != C || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new di.d5(this, i17 - C, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(pr.f);
                        ofFloat.start();
                    }
                    this.U = 0;
                    this.V = 0;
                }
            }
        }
        b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        cc1 cc1Var = this.a;
        int childCount = cc1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = cc1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f7 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z10 = this.e;
            SparseIntArray sparseIntArray = this.R;
            if (z10) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.s;
                if (i14 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i12 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i14) * sparseIntArray.get(i12), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f7 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = cc1Var.getWeightSum();
        if (childCount == 1 || this.s > size) {
            cc1Var.setWeightSum(0.0f);
        } else {
            cc1Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - cc1Var.getWeightSum()) > 0.1f) {
            cc1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.n;
        cc1 cc1Var = this.a;
        TextView textView = (TextView) cc1Var.getChildAt(i10);
        TextView textView2 = (TextView) cc1Var.getChildAt(this.T);
        if (textView2 == null || textView == null) {
            return;
        }
        k(textView, textView2, f7);
        if (f7 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.M));
            textView.setTag(Integer.valueOf(this.L));
        }
        lm0 lm0Var = this.b;
        if (lm0Var != null) {
            lm0Var.D0(f7);
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.e0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(lm0 lm0Var) {
        this.b = lm0Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        cc1 cc1Var = this.a;
        int childCount = cc1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            cc1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.l0 = true;
        this.r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.a.getChildAt(i11)) != null) {
            this.n = i11;
            this.x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        if (z10 == this.m0) {
            return;
        }
        this.m0 = z10;
        setPadding(AndroidUtilities.dp(z10 ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.m0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.g0.set(this.h0);
            this.i0.d(0.0f, true);
            this.j0.d(AndroidUtilities.dp(this.m0 ? 6.0f : -6.0f), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        AndroidUtilities.forEachViews(this.a, new bi.f(19));
    }

    public void setUseMinimalWidth(boolean z10) {
        this.e = z10;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(this.e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }

    public int f(int i10) {
        return i10;
    }
}
