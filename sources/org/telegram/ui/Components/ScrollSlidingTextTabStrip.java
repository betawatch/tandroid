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
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int o0 = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final gr N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final org.telegram.ui.u71 a;
    public float a0;
    public xl0 b;
    public long b0;
    public final org.telegram.ui.ActionBar.p6 c;
    public View c0;
    public boolean d;
    public final ew d0;
    public boolean e;
    public vg.f e0;
    public boolean f;
    public final Path f0;
    public final RectF g0;
    public int h;
    public final RectF h0;
    public final t5 i0;
    public final t5 j0;
    public final t5 k0;
    public boolean l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.t6.I8;
        this.M = org.telegram.ui.ActionBar.t6.J8;
        gr grVar = gr.h;
        this.N = grVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.b0 = 200L;
        this.d0 = new ew(this, 11);
        this.f0 = new Path();
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new t5(this, 420L, grVar);
        this.j0 = new t5(this, 420L, grVar);
        this.k0 = new t5(this, 420L, grVar);
        this.m0 = true;
        this.c = p6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float N = org.telegram.messenger.i0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 10);
        this.a = u71Var;
        u71Var.setOrientation(0);
        u71Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        u71Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(u71Var);
        updateColors();
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
            this.y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new wl0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            textView.setOnClickListener(new bh.f(this, i10, 12));
            textView.setOnLongClickListener(new bh.j(this, i10, 1));
            org.telegram.messenger.zs.i(textView);
        }
        textView.setText(org.telegram.messenger.k6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.i0.L(32.0f) + ((int) Math.ceil(vh.p2.g(r7, textView.getPaint())));
        this.a.addView(textView, w7.b6.o(0, -1));
        this.s += L;
        this.R.put(i11, L);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    public final void b() {
        float e = this.i0.e(false, 1.0f);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.h0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        RectF rectF2 = this.g0;
        if (e >= 1.0f) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.i0.Z1(rectF2, rectF, e, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        vg.f fVar = this.e0;
        if (fVar != null) {
            fVar.setAlpha(org.telegram.messenger.zs.e4);
            this.e0.setBounds(((int) rectF.left) - org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.e0.q(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        org.telegram.ui.u71 u71Var = this.a;
        int childCount = u71Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) u71Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.n == i10 ? this.L : this.M));
            textView.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(this.n == i10 ? this.L : this.M, this.c)));
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
        return this.P.get(i10, -1) != -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.e0 != null) {
            if (this.i0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.e0.R = this.k0.d(this.m0);
            this.e0.draw(canvas);
            canvas.clipPath(this.f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.j0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.u71 u71Var = this.a;
        if (view != u71Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        int measuredHeight = getMeasuredHeight();
        float f7 = this.w + this.W;
        float f10 = this.x + f7 + this.a0;
        View childAt = u71Var.getChildAt(this.n);
        if (this.n0 && childAt != null) {
            f7 += childAt.getTranslationX();
            f10 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.K;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (u71Var.getAlpha() * alpha));
        gradientDrawable.setBounds(org.telegram.messenger.i0.L(4.0f) + getPaddingLeft() + ((int) f7), org.telegram.messenger.i0.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - org.telegram.messenger.i0.L(4.0f), (measuredHeight - getPaddingBottom()) - org.telegram.messenger.i0.L(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            org.telegram.ui.u71 u71Var = this.a;
            int childCount = u71Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                u71Var.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), u71Var.getChildAt(i10));
            i10++;
        }
    }

    public final void g(View view, int i10, int i11) {
        xl0 xl0Var;
        if (i11 >= 0) {
            if (view == null && this.H) {
                return;
            }
            int i12 = this.n;
            if (i11 == i12 && (xl0Var = this.b) != null) {
                xl0Var.D();
                return;
            }
            boolean z10 = i12 < i11;
            this.J = -1;
            this.T = i12;
            this.n = i11;
            this.r = i10;
            boolean z11 = this.H;
            ew ewVar = this.d0;
            if (z11) {
                org.telegram.messenger.i0.r(ewVar);
                this.H = false;
            }
            this.S = 0.0f;
            this.H = true;
            this.D = this.w;
            this.E = this.x;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.G = textView.getMeasuredWidth();
                this.F = i0.a.u(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
            }
            setEnabled(false);
            org.telegram.messenger.i0.h3(ewVar, 16L);
            xl0 xl0Var2 = this.b;
            if (xl0Var2 != null) {
                xl0Var2.d(i10, z10);
            }
            h(i11, true);
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
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

    public final void h(int i10, boolean z10) {
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
        if (left - org.telegram.messenger.i0.L(50.0f) < scrollX) {
            if (z10) {
                smoothScrollTo(left - org.telegram.messenger.i0.L(50.0f), 0);
                return;
            } else {
                scrollTo(left - org.telegram.messenger.i0.L(50.0f), 0);
                return;
            }
        }
        int i11 = left + measuredWidth;
        if (org.telegram.messenger.i0.L(21.0f) + i11 > getWidth() + scrollX) {
            if (z10) {
                smoothScrollTo(i11, 0);
            } else {
                scrollTo(i11, 0);
            }
        }
    }

    public final void i(float f7, int i10) {
        int i11;
        int i12 = this.P.get(i10, -1);
        if (i12 >= 0 && (i11 = this.n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            org.telegram.ui.u71 u71Var = this.a;
            TextView textView = (TextView) u71Var.getChildAt(i11);
            TextView textView2 = (TextView) u71Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.D = i0.a.u(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = i0.a.u(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                j(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                h(u71Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.n = i12;
                this.r = i10;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        int e = e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int e7 = e(org.telegram.ui.ActionBar.t6.w0(this.M, p6Var));
        int red = Color.red(e);
        int green = Color.green(e);
        int blue = Color.blue(e);
        int alpha = Color.alpha(e);
        int red2 = Color.red(e7);
        int green2 = Color.green(e7);
        int blue2 = Color.blue(e7);
        int alpha2 = Color.alpha(e7);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f7) + alpha), (int) (((red2 - red) * f7) + red), (int) (((green2 - green) * f7) + green), (int) (((blue2 - blue) * f7) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f7) + alpha2), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2)));
        this.w = (int) (((this.F - r14) * f7) + this.D);
        this.x = (int) (((this.G - r14) * f7) + this.E);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.y != i15) {
            this.y = i15;
            this.J = -1;
            if (this.H) {
                org.telegram.messenger.i0.r(this.d0);
                this.H = false;
                setEnabled(true);
                xl0 xl0Var = this.b;
                if (xl0Var != null) {
                    xl0Var.E0(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.x;
                int u10 = i0.a.u(measuredWidth, i16, 2, left);
                this.w = u10;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != u10 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new jg.a0(this, i17 - u10, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(gr.f);
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
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(22.0f);
        org.telegram.ui.u71 u71Var = this.a;
        int childCount = u71Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = u71Var.getChildAt(i12);
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
                    layoutParams.weight = org.telegram.messenger.i0.T1(1.0f / childCount, (1.0f / i14) * sparseIntArray.get(i12), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f7 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = u71Var.getWeightSum();
        if (childCount == 1 || this.s > size) {
            u71Var.setWeightSum(0.0f);
        } else {
            u71Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - u71Var.getWeightSum()) > 0.1f) {
            u71Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.n;
        org.telegram.ui.u71 u71Var = this.a;
        TextView textView = (TextView) u71Var.getChildAt(i10);
        TextView textView2 = (TextView) u71Var.getChildAt(this.T);
        if (textView2 == null || textView == null) {
            return;
        }
        j(textView, textView2, f7);
        if (f7 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.M));
            textView.setTag(Integer.valueOf(this.L));
        }
        xl0 xl0Var = this.b;
        if (xl0Var != null) {
            xl0Var.E0(f7);
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.e0 = fVar;
        fVar.setCallback(this);
    }

    public void setDelegate(xl0 xl0Var) {
        this.b = xl0Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        org.telegram.ui.u71 u71Var = this.a;
        int childCount = u71Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            u71Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.l0 = true;
        this.r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.a.getChildAt(i11)) != null) {
            this.n = i11;
            this.y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        if (z10 == this.m0) {
            return;
        }
        this.m0 = z10;
        setPadding(org.telegram.messenger.i0.L(z10 ? 0.0f : 6.0f), getPaddingTop(), org.telegram.messenger.i0.L(this.m0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.g0.set(this.h0);
            this.i0.e(true, 0.0f);
            this.j0.e(true, org.telegram.messenger.i0.L(this.m0 ? 6.0f : -6.0f));
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        org.telegram.messenger.i0.c0(this.a, new ag.z0(2));
    }

    public void setUseMinimalWidth(boolean z10) {
        this.e = z10;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(this.e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.u71 u71Var = this.a;
        int childCount = u71Var.getChildCount();
        int i10 = 0;
        while (true) {
            p6Var = this.c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) u71Var.getChildAt(i10);
            textView.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(this.n == i10 ? this.L : this.M, p6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.15f, e(org.telegram.ui.ActionBar.t6.w0(this.L, p6Var))), 7, org.telegram.messenger.i0.L(14.0f)), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f)));
            i10++;
        }
        this.K.setColor(org.telegram.ui.ActionBar.t6.r1(0.15f, e(org.telegram.ui.ActionBar.t6.w0(this.L, p6Var))));
        vg.f fVar = this.e0;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }

    public int e(int i10) {
        return i10;
    }
}
