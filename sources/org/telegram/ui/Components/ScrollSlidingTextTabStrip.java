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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {
    public static final /* synthetic */ int k0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public final GradientDrawable G;
    public int H;
    public int I;
    public final jr J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public long U;
    public View V;
    public final rk0 W;
    public final ua1 a;
    public ng.d a0;
    public jm0 b;
    public final Path b0;
    public final org.telegram.ui.ActionBar.c6 c;
    public final RectF c0;
    public boolean d;
    public final RectF d0;
    public boolean e;
    public final d6 e0;
    public boolean f;
    public final d6 f0;
    public final d6 g0;
    public int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = -1;
        this.F = -1;
        this.H = org.telegram.ui.ActionBar.g6.I8;
        this.I = org.telegram.ui.ActionBar.g6.J8;
        jr jrVar = jr.h;
        this.J = jrVar;
        this.K = new SparseIntArray(5);
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.U = 200L;
        this.W = new rk0(this, 2);
        this.b0 = new Path();
        this.c0 = new RectF();
        this.d0 = new RectF();
        this.e0 = new d6(this, 420L, jrVar);
        this.f0 = new d6(this, 420L, jrVar);
        this.g0 = new d6(this, 420L, jrVar);
        this.i0 = true;
        this.c = c6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.G = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ua1 ua1Var = new ua1(this, context, 11);
        this.a = ua1Var;
        ua1Var.setOrientation(0);
        ua1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ua1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ua1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.r == -1) {
            this.r = i10;
        }
        this.K.put(i11, i10);
        this.L.put(i10, i11);
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
            textView = new im0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new jh.y0(this, i10, 12));
            textView.setOnLongClickListener(new gm0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(nh.t3.g(r6, textView.getPaint())));
        this.a.addView(textView, i7.f6.n(0, -1));
        this.s += dp;
        this.N.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.e0.d(1.0f, false);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.d0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.c0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.b0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        ng.d dVar = this.a0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.a0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.a0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        ua1 ua1Var = this.a;
        int childCount = ua1Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.M;
            sparseIntArray2 = this.N;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) ua1Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.n == i10 ? this.H : this.I));
            textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.n == i10 ? this.H : this.I, this.c)));
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

    public final boolean d(int i10) {
        return this.L.get(i10, -1) != -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.a0 != null) {
            if (this.e0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.a0.n = this.g0.e(this.i0);
            this.a0.draw(canvas);
            canvas.clipPath(this.b0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ua1 ua1Var = this.a;
        if (view != ua1Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        int measuredHeight = getMeasuredHeight();
        float f9 = this.v + this.S;
        float f10 = this.w + f9 + this.T;
        View childAt = ua1Var.getChildAt(this.n);
        if (this.j0 && childAt != null) {
            f9 += childAt.getTranslationX();
            f10 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.G;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (ua1Var.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f9), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        ua1 ua1Var = this.a;
        int childCount = ua1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.c6 c6Var = this.c;
            if (i10 >= childCount) {
                this.G.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) ua1Var.getChildAt(i10);
                textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.n == i10 ? this.H : this.I, c6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ua1 ua1Var = this.a;
            int childCount = ua1Var.getChildCount();
            SparseIntArray sparseIntArray = this.K;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.L.clear();
                this.M.clear();
                this.N.clear();
                ua1Var.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), ua1Var.getChildAt(i10));
            i10++;
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.E;
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
        return this.K.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.G;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.K.get(i10)));
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
        jm0 jm0Var;
        if (i11 >= 0) {
            if (view == null && this.D) {
                return;
            }
            int i12 = this.n;
            if (i11 == i12 && (jm0Var = this.b) != null) {
                jm0Var.x();
                return;
            }
            boolean z10 = i12 < i11;
            this.F = -1;
            this.P = i12;
            this.n = i11;
            this.r = i10;
            boolean z11 = this.D;
            rk0 rk0Var = this.W;
            if (z11) {
                AndroidUtilities.cancelRunOnUIThread(rk0Var);
                this.D = false;
            }
            this.O = 0.0f;
            this.D = true;
            this.y = this.v;
            this.A = this.w;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.C = textView.getMeasuredWidth();
                this.B = j7.l1.e(textView.getMeasuredWidth(), this.C, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(rk0Var, 16L);
            jm0 jm0Var2 = this.b;
            if (jm0Var2 != null) {
                jm0Var2.e(i10, z10);
            }
            i(i11, true);
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h == 0 || this.F == i10) {
            return;
        }
        this.F = i10;
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

    public final void j(float f9, int i10) {
        int i11;
        int i12 = this.L.get(i10, -1);
        if (i12 >= 0 && (i11 = this.n) != i12) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            } else if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            ua1 ua1Var = this.a;
            TextView textView = (TextView) ua1Var.getChildAt(i11);
            TextView textView2 = (TextView) ua1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.A = textView.getMeasuredWidth();
                this.y = j7.l1.e(textView.getMeasuredWidth(), this.A, 2, textView.getLeft());
                textView2.getLayout();
                this.C = textView2.getMeasuredWidth();
                this.B = j7.l1.e(textView2.getMeasuredWidth(), this.C, 2, textView2.getLeft());
                k(textView2, textView, f9);
                if (f9 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.I));
                    textView2.setTag(Integer.valueOf(this.H));
                }
                i(ua1Var.indexOfChild(textView2), true);
            }
            if (f9 >= 1.0f) {
                this.n = i12;
                this.r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f9) {
        int i10 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        int f10 = f(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int f11 = f(org.telegram.ui.ActionBar.g6.v0(this.I, c6Var));
        int red = Color.red(f10);
        int green = Color.green(f10);
        int blue = Color.blue(f10);
        int alpha = Color.alpha(f10);
        int red2 = Color.red(f11);
        int green2 = Color.green(f11);
        int blue2 = Color.blue(f11);
        int alpha2 = Color.alpha(f11);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f9) + alpha), (int) (((red2 - red) * f9) + red), (int) (((green2 - green) * f9) + green), (int) (((blue2 - blue) * f9) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f9) + alpha2), (int) (((red - red2) * f9) + red2), (int) (((green - green2) * f9) + green2), (int) (((blue - blue2) * f9) + blue2)));
        this.v = (int) (((this.B - r14) * f9) + this.y);
        this.w = (int) (((this.C - r14) * f9) + this.A);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.x != i15) {
            this.x = i15;
            this.F = -1;
            if (this.D) {
                AndroidUtilities.cancelRunOnUIThread(this.W);
                this.D = false;
                setEnabled(true);
                jm0 jm0Var = this.b;
                if (jm0Var != null) {
                    jm0Var.u0(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.w;
                int e10 = j7.l1.e(measuredWidth, i16, 2, left);
                this.v = e10;
                int i17 = this.Q;
                if (i17 > 0 && (i14 = this.R) > 0) {
                    if (i17 != e10 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new bg.h0(this, i17 - e10, i14 - i16, 4));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(jr.f);
                        ofFloat.start();
                    }
                    this.Q = 0;
                    this.R = 0;
                }
            }
        }
        b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        ua1 ua1Var = this.a;
        int childCount = ua1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ua1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f9 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z10 = this.e;
            SparseIntArray sparseIntArray = this.N;
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
            if (Math.abs(f9 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = ua1Var.getWeightSum();
        if (childCount == 1 || this.s > size) {
            ua1Var.setWeightSum(0.0f);
        } else {
            ua1Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - ua1Var.getWeightSum()) > 0.1f) {
            ua1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f9) {
        this.E = f9;
        int i10 = this.n;
        ua1 ua1Var = this.a;
        TextView textView = (TextView) ua1Var.getChildAt(i10);
        TextView textView2 = (TextView) ua1Var.getChildAt(this.P);
        if (textView2 == null || textView == null) {
            return;
        }
        k(textView, textView2, f9);
        if (f9 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.I));
            textView.setTag(Integer.valueOf(this.H));
        }
        jm0 jm0Var = this.b;
        if (jm0Var != null) {
            jm0Var.u0(f9);
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.a0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(jm0 jm0Var) {
        this.b = jm0Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ua1 ua1Var = this.a;
        int childCount = ua1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ua1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.h0 = true;
        this.r = i10;
        int i11 = this.L.get(i10);
        if (((TextView) this.a.getChildAt(i11)) != null) {
            this.n = i11;
            this.x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        if (z10 == this.i0) {
            return;
        }
        this.i0 = z10;
        setPadding(AndroidUtilities.dp(z10 ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.i0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.c0.set(this.d0);
            this.e0.d(0.0f, true);
            this.f0.d(AndroidUtilities.dp(this.i0 ? 6.0f : -6.0f), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        AndroidUtilities.forEachViews(this.a, new l4.x0(18));
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
        return drawable == this.a0 || super.verifyDrawable(drawable);
    }

    public int f(int i10) {
        return i10;
    }
}
