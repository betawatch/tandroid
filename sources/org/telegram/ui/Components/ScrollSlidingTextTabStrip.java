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
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements tjb {
    public static final /* synthetic */ int p0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public float J;
    public int K;
    public final GradientDrawable L;
    public int M;
    public int N;
    public final s33 O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final pkb a;
    public float a0;
    public ir9 b;
    public float b0;
    public final wjb c;
    public short c0;
    public boolean d;
    public View d0;
    public boolean e;
    public final bg7 e0;
    public boolean f;
    public il0 f0;
    public final Path g0;
    public int h;
    public final RectF h0;
    public final RectF i0;
    public final lm j0;
    public final lm k0;
    public final lm l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public boolean o0;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, wjb wjbVar) {
        super(context);
        this.r = -1;
        this.K = -1;
        this.M = bkb.H8;
        this.N = bkb.I8;
        s33 s33Var = s33.h;
        this.O = s33Var;
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.S = new SparseIntArray(5);
        this.c0 = (short) 200;
        this.e0 = new bg7(this, (byte) 24);
        this.g0 = new Path();
        this.h0 = new RectF();
        this.i0 = new RectF();
        this.j0 = new lm(420L, this, s33Var);
        this.k0 = new lm(420L, this, s33Var);
        this.l0 = new lm(420L, this, s33Var);
        this.n0 = true;
        this.c = wjbVar;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        float N = gl.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        pkb pkbVar = new pkb((byte) 16, context, this);
        this.a = pkbVar;
        pkbVar.setOrientation(0);
        pkbVar.setPadding(gl.L(7.0f), 0, gl.L(7.0f), 0);
        pkbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(pkbVar);
        updateColors();
    }

    public final void a(final int i, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 == 0 && this.r == -1) {
            this.r = i;
        }
        this.P.put(i2, i);
        this.Q.put(i, i2);
        int i3 = this.r;
        if (i3 != -1 && i3 == i) {
            this.n = i2;
            this.y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i);
            sparseArray.delete(i);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new hr9(this, getContext(), i);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(gl.o());
            textView.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
            textView.setOnClickListener(new v0(this, i, (byte) 22));
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: fr9
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    ir9 ir9Var;
                    int i4 = ScrollSlidingTextTabStrip.p0;
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
                    return (scrollSlidingTextTabStrip.o0 || (ir9Var = scrollSlidingTextTabStrip.b) == null || !ir9Var.q2(i, view)) ? false : true;
                }
            });
            kk7.i(textView);
        }
        textView.setText(vu3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = gl.L(32.0f) + ((int) Math.ceil(je5.h(r7, textView.getPaint())));
        this.a.addView(textView, nme.o(0, -1));
        this.s += L;
        this.S.put(i2, L);
        updateColors();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b() {
        float e = this.j0.e(false, 1.0f);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.i0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(gl.L(7.0f), gl.L(7.0f));
        RectF rectF2 = this.h0;
        if (e >= 1.0f) {
            rectF2.set(rectF);
        } else {
            gl.X1(rectF2, rectF, e, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.g0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        il0 il0Var = this.f0;
        if (il0Var != null) {
            il0Var.setAlpha(kk7.d4);
            this.f0.setBounds(((int) rectF.left) - gl.L(7.0f), 0, gl.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        pkb pkbVar = this.a;
        int childCount = pkbVar.getChildCount();
        int i = 0;
        while (true) {
            sparseIntArray = this.R;
            sparseIntArray2 = this.S;
            if (i >= childCount) {
                break;
            }
            TextView textView = (TextView) pkbVar.getChildAt(i);
            textView.setTag(Integer.valueOf(this.n == i ? this.M : this.N));
            textView.setTextColor(e(bkb.v0(this.n == i ? this.M : this.N, this.c)));
            if (this.e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i) != sparseIntArray2.get(i)) {
                    textView.requestLayout();
                }
            } else if (i == 0) {
                int i2 = textView.getLayoutParams().width;
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
                if (i2 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i++;
        }
        sparseIntArray.clear();
        for (int i3 = 0; i3 < sparseIntArray2.size(); i3++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i3), sparseIntArray2.valueAt(i3));
        }
    }

    public final boolean d(int i) {
        return this.Q.get(i, -1) != -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f0 != null) {
            if (this.j0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f0.X = this.l0.d(this.n0);
            this.f0.draw(canvas);
            canvas.clipPath(this.g0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.k0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        pkb pkbVar = this.a;
        if (view != pkbVar) {
            return super.drawChild(canvas, view, j);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        int measuredHeight = getMeasuredHeight();
        float f = this.w + this.a0;
        float f2 = this.x + f + this.b0;
        View childAt = pkbVar.getChildAt(this.n);
        if (this.o0 && childAt != null) {
            f += childAt.getTranslationX();
            f2 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.L;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (pkbVar.getAlpha() * alpha));
        gradientDrawable.setBounds(gl.L(4.0f) + getPaddingLeft() + ((int) f), gl.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f2)) - gl.L(4.0f), (measuredHeight - getPaddingBottom()) - gl.L(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return drawChild;
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            pkb pkbVar = this.a;
            int childCount = pkbVar.getChildCount();
            SparseIntArray sparseIntArray = this.P;
            if (i >= childCount) {
                sparseIntArray.clear();
                this.Q.clear();
                this.R.clear();
                this.S.clear();
                pkbVar.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i), pkbVar.getChildAt(i));
            i++;
        }
    }

    public final void g(View view, int i, int i2) {
        ir9 ir9Var;
        if (i2 >= 0) {
            if (view == null && this.I) {
                return;
            }
            int i3 = this.n;
            if (i2 == i3 && (ir9Var = this.b) != null) {
                ir9Var.B();
                return;
            }
            boolean z = i3 < i2;
            this.K = -1;
            this.U = i3;
            this.n = i2;
            this.r = i;
            boolean z2 = this.I;
            bg7 bg7Var = this.e0;
            if (z2) {
                gl.r(bg7Var);
                this.I = false;
            }
            this.T = 0.0f;
            this.I = true;
            this.E = this.w;
            this.F = this.x;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.H = textView.getMeasuredWidth();
                this.G = ug8.g(textView.getMeasuredWidth(), this.H, 2, textView.getLeft());
            }
            setEnabled(false);
            gl.e3(bg7Var, 16L);
            ir9 ir9Var2 = this.b;
            if (ir9Var2 != null) {
                ir9Var2.a(i, z);
            }
            h(i2, true);
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.n;
    }

    public int getCurrentTabId() {
        return this.r;
    }

    public int getFirstTabId() {
        return this.P.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.a.getChildCount(); i++) {
            arrayList.add(Integer.valueOf(this.P.get(i)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i, boolean z) {
        int i2;
        if (this.h == 0 || this.K == i) {
            return;
        }
        this.K = i;
        pkb pkbVar = this.a;
        TextView textView = (TextView) pkbVar.getChildAt(i);
        if (textView != null) {
            int scrollX = getScrollX();
            View childAt = pkbVar.getChildAt(i - 1);
            View childAt2 = pkbVar.getChildAt(i + 1);
            int left = pkbVar.getLeft() + (childAt != null ? childAt.getLeft() : textView.getLeft());
            int left2 = pkbVar.getLeft() + (childAt2 != null ? childAt2.getRight() : textView.getRight());
            int L = gl.L(7.0f) + getPaddingLeft() + scrollX;
            int width = ((getWidth() + scrollX) - getPaddingRight()) - gl.L(7.0f);
            if (left < L) {
                i2 = (scrollX + left) - L;
            } else if (left2 <= width) {
                return;
            } else {
                i2 = (scrollX + left2) - width;
            }
            if (z) {
                smoothScrollTo(i2, 0);
            } else {
                scrollTo(i2, 0);
            }
        }
    }

    public final void i(float f, int i) {
        int i2;
        int i3 = this.Q.get(i, -1);
        if (i3 < 0 || (i2 = this.n) == i3) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        pkb pkbVar = this.a;
        TextView textView = (TextView) pkbVar.getChildAt(i2);
        TextView textView2 = (TextView) pkbVar.getChildAt(i3);
        if (textView != null && textView2 != null) {
            textView.getLayout();
            this.F = textView.getMeasuredWidth();
            this.E = ug8.g(textView.getMeasuredWidth(), this.F, 2, textView.getLeft());
            textView2.getLayout();
            this.H = textView2.getMeasuredWidth();
            this.G = ug8.g(textView2.getMeasuredWidth(), this.H, 2, textView2.getLeft());
            j(textView2, textView, f);
            if (f >= 1.0f) {
                textView.setTag(Integer.valueOf(this.N));
                textView2.setTag(Integer.valueOf(this.M));
            }
            h(pkbVar.indexOfChild(textView2), true);
        }
        if (f >= 1.0f) {
            this.n = i3;
            this.r = i;
        }
    }

    public final void j(TextView textView, TextView textView2, float f) {
        int i = this.M;
        wjb wjbVar = this.c;
        int e = e(bkb.v0(i, wjbVar));
        int e2 = e(bkb.v0(this.N, wjbVar));
        int red = Color.red(e);
        int green = Color.green(e);
        int blue = Color.blue(e);
        int alpha = Color.alpha(e);
        int red2 = Color.red(e2);
        int green2 = Color.green(e2);
        int blue2 = Color.blue(e2);
        int alpha2 = Color.alpha(e2);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f) + alpha), (int) (((red2 - red) * f) + red), (int) (((green2 - green) * f) + green), (int) (((blue2 - blue) * f) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f) + alpha2), (int) (((red - red2) * f) + red2), (int) (((green - green2) * f) + green2), (int) (((blue - blue2) * f) + blue2)));
        this.w = (int) (((this.G - r14) * f) + this.E);
        this.x = (int) (((this.H - r14) * f) + this.F);
        invalidate();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = i3 - i;
        if (this.y != i6) {
            this.y = i6;
            this.K = -1;
            if (this.I) {
                gl.r(this.e0);
                this.I = false;
                setEnabled(true);
                ir9 ir9Var = this.b;
                if (ir9Var != null) {
                    ir9Var.g(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i7 = this.x;
                int g = ug8.g(measuredWidth, i7, 2, left);
                this.w = g;
                int i8 = this.V;
                if (i8 > 0 && (i5 = this.W) > 0) {
                    if (i8 != g || i5 != i7) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new bn(this, i8 - g, i5 - i7, (byte) 4));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(s33.f);
                        ofFloat.start();
                    }
                    this.V = 0;
                    this.W = 0;
                }
            }
        }
        b();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - gl.L(22.0f);
        pkb pkbVar = this.a;
        int childCount = pkbVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = pkbVar.getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f = layoutParams.weight;
            int i4 = layoutParams.width;
            boolean z = this.e;
            SparseIntArray sparseIntArray = this.S;
            if (z) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i3);
            } else {
                int i5 = this.s;
                if (i5 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i3 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = gl.R1(1.0f / childCount, (1.0f / i5) * sparseIntArray.get(i3), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f - layoutParams.weight) > 0.001f || i4 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = pkbVar.getWeightSum();
        if (childCount == 1 || this.s > size) {
            pkbVar.setWeightSum(0.0f);
        } else {
            pkbVar.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - pkbVar.getWeightSum()) > 0.1f) {
            pkbVar.requestLayout();
        }
        super.onMeasure(i, i2);
        this.f = getMeasuredWidth() < View.MeasureSpec.getSize(i);
        b();
    }

    public void setAnimationIdicatorProgress(float f) {
        this.J = f;
        int i = this.n;
        pkb pkbVar = this.a;
        TextView textView = (TextView) pkbVar.getChildAt(i);
        TextView textView2 = (TextView) pkbVar.getChildAt(this.U);
        if (textView2 == null || textView == null) {
            return;
        }
        j(textView, textView2, f);
        if (f >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.N));
            textView.setTag(Integer.valueOf(this.M));
        }
        ir9 ir9Var = this.b;
        if (ir9Var != null) {
            ir9Var.g(f);
        }
    }

    public void setBlurredBackground(il0 il0Var) {
        this.f0 = il0Var;
        il0Var.setCallback(this);
    }

    public void setDelegate(ir9 ir9Var) {
        this.b = ir9Var;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        pkb pkbVar = this.a;
        int childCount = pkbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            pkbVar.getChildAt(i).setEnabled(z);
        }
    }

    public void setInitialTabId(int i) {
        this.m0 = true;
        this.r = i;
        int i2 = this.Q.get(i);
        if (((TextView) this.a.getChildAt(i2)) != null) {
            this.n = i2;
            this.y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z) {
        if (z == this.n0) {
            return;
        }
        this.n0 = z;
        setPadding(gl.L(z ? 0.0f : 6.0f), getPaddingTop(), gl.L(this.n0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.h0.set(this.i0);
            this.j0.e(true, 0.0f);
            this.k0.e(true, gl.L(this.n0 ? 6.0f : -6.0f));
        }
        b();
    }

    public void setReordering(boolean z) {
        if (this.o0 == z) {
            return;
        }
        this.o0 = z;
        gl.c0(this.a, new bm0((byte) 12));
    }

    public void setUseMinimalWidth(boolean z) {
        this.e = z;
        this.a.setLayoutParams(new FrameLayout.LayoutParams(this.e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z) {
        this.d = z;
    }

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar;
        pkb pkbVar = this.a;
        int childCount = pkbVar.getChildCount();
        int i = 0;
        while (true) {
            wjbVar = this.c;
            if (i >= childCount) {
                break;
            }
            TextView textView = (TextView) pkbVar.getChildAt(i);
            textView.setTextColor(e(bkb.v0(this.n == i ? this.M : this.N, wjbVar)));
            textView.setBackground(new InsetDrawable((Drawable) bkb.f0(bkb.p1(0.15f, e(bkb.v0(this.M, wjbVar))), 7, gl.L(14.0f)), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f)));
            i++;
        }
        this.L.setColor(bkb.p1(0.15f, e(bkb.v0(this.M, wjbVar))));
        il0 il0Var = this.f0;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f0 || super.verifyDrawable(drawable);
    }

    public int e(int i) {
        return i;
    }
}
