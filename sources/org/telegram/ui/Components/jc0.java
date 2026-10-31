package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jc0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.p6 H;
    public int I;
    public final t5 J;
    public final t5 K;
    public final LinearLayout.LayoutParams a;
    public final hc0 b;
    public z4.e c;
    public final LinearLayout d;
    public z4.g e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public jc0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = new hc0(0, this);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.w = 436207616;
        this.x = false;
        this.y = org.telegram.messenger.i0.L(52.0f);
        this.D = org.telegram.messenger.i0.L(8.0f);
        this.E = org.telegram.messenger.i0.L(2.0f);
        this.F = org.telegram.messenger.i0.L(12.0f);
        this.G = org.telegram.messenger.i0.L(24.0f);
        this.I = 0;
        gr grVar = gr.h;
        this.J = new t5(this, 350L, grVar);
        this.K = new t5(this, 350L, grVar);
        this.H = p6Var;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.a = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void a(jc0 jc0Var, int i10, int i11) {
        View childAt;
        if (jc0Var.f == 0 || (childAt = jc0Var.d.getChildAt(i10)) == null) {
            return;
        }
        int left = childAt.getLeft() + i11;
        if (i10 > 0 || i11 > 0) {
            left -= jc0Var.y;
        }
        if (left != jc0Var.I) {
            jc0Var.I = left;
            jc0Var.scrollTo(left, 0);
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        ic0 ic0Var = new ic0(this, getContext(), i10);
        ic0Var.setTextSize(1, 14.0f);
        ic0Var.setTypeface(org.telegram.messenger.i0.o());
        ic0Var.setTextColor(c(0.6f));
        ic0Var.setFocusable(true);
        ic0Var.setGravity(17);
        ic0Var.setText(charSequence);
        w7.e6.b(ic0Var, 0.025f, 1.2f);
        ic0Var.setOnClickListener(new bh.f(this, i10, 10));
        ic0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        this.d.addView(ic0Var, w7.b6.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        ic0Var.setSelected(i10 == this.h);
    }

    public final int c(float f7) {
        return i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f; i10++) {
            if (this.e.getAdapter() instanceof ox) {
                ((ox) this.e.getAdapter()).getClass();
                b(i10, this.e.getAdapter().d(i10));
            } else {
                b(i10, this.e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        int i10 = 0;
        while (i10 < this.f) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.a);
            if (this.x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof ox) {
                ((ox) this.e.getAdapter()).getClass();
                int L = org.telegram.messenger.i0.L(i10 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i11 = this.G;
                childAt.setPadding(i11, 0, i11, 0);
            }
            i10++;
        }
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getIndicatorColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.D;
    }

    public int getScrollOffset() {
        return this.y;
    }

    public boolean getShouldExpand() {
        return this.x;
    }

    public int getTabPaddingLeftRight() {
        return this.G;
    }

    public int getUnderlineColor() {
        return this.w;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e;
        float e7;
        int i10;
        if (isInEditMode() || this.f == 0) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i11 = this.E;
        LinearLayout linearLayout = this.d;
        Paint paint = this.r;
        if (i11 != 0) {
            paint.setColor(this.w);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
            float f7 = this.E / 2.0f;
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f10 = this.n;
            t5 t5Var = this.K;
            t5 t5Var2 = this.J;
            if (f10 <= 0.0f || (i10 = this.h) >= this.f - 1) {
                e = t5Var2.e(false, paddingLeft);
                e7 = t5Var.e(false, right);
            } else {
                View childAt2 = linearLayout.getChildAt(i10 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f11 = this.n;
                float f12 = 1.0f - f11;
                e = (paddingLeft * f12) + (paddingLeft2 * f11);
                e7 = (f12 * right) + (f11 * right2);
                t5Var2.e(true, e);
                t5Var.e(true, e7);
                if (childAt instanceof ic0) {
                    ic0 ic0Var = (ic0) childAt;
                    ic0Var.setTextColor(ic0Var.a.c(org.telegram.messenger.i0.T1(0.6f, 0.8f, 1.0f - this.n)));
                }
                if (childAt2 instanceof ic0) {
                    ic0 ic0Var2 = (ic0) childAt2;
                    ic0Var2.setTextColor(ic0Var2.a.c(org.telegram.messenger.i0.T1(0.6f, 0.8f, this.n)));
                }
            }
            if (this.D != 0) {
                paint.setColor(this.s);
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(e - org.telegram.messenger.i0.L(11.0f), getPaddingTop(), e7 + org.telegram.messenger.i0.L(11.0f), height - getPaddingBottom());
                rectF2.offset(getPaddingLeft(), 0.0f);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.x || View.MeasureSpec.getMode(i10) == 0) {
            return;
        }
        this.d.measure(getMeasuredWidth() | TLObject.FLAG_30, i11);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.x) {
            return;
        }
        post(new eb0(this, 3));
    }

    public void setDividerPadding(int i10) {
        this.F = i10;
        invalidate();
    }

    public void setIndicatorColor(int i10) {
        this.s = i10;
        invalidate();
    }

    public void setIndicatorColorResource(int i10) {
        this.s = getResources().getColor(i10);
        invalidate();
    }

    public void setIndicatorHeight(int i10) {
        this.D = i10;
        invalidate();
    }

    public void setOnPageChangeListener(z4.e eVar) {
        this.c = eVar;
    }

    public void setScrollOffset(int i10) {
        this.y = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.G = i10;
        e();
    }

    public void setUnderlineColor(int i10) {
        this.w = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.w = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        this.E = i10;
        invalidate();
    }

    public void setViewPager(z4.g gVar) {
        this.e = gVar;
        if (gVar.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        gVar.setOnPageChangeListener(this.b);
        d();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            try {
                View childAt = linearLayout.getChildAt(i10);
                childAt.setSelected(childAt.isSelected());
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
