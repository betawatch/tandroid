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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qb0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.f6 H;
    public int I;
    public final w5 J;
    public final w5 K;
    public final LinearLayout.LayoutParams a;
    public final di.n5 b;
    public c5.g c;
    public final LinearLayout d;
    public c5.k e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public qb0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new di.n5(1, this);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.w = 436207616;
        this.x = false;
        this.y = org.telegram.messenger.g0.L(52.0f);
        this.D = org.telegram.messenger.g0.L(8.0f);
        this.E = org.telegram.messenger.g0.L(2.0f);
        this.F = org.telegram.messenger.g0.L(12.0f);
        this.G = org.telegram.messenger.g0.L(24.0f);
        this.I = 0;
        xq xqVar = xq.h;
        this.J = new w5(this, 350L, xqVar);
        this.K = new w5(this, 350L, xqVar);
        this.H = f6Var;
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

    public static void a(qb0 qb0Var, int i7, int i10) {
        View childAt;
        if (qb0Var.f == 0 || (childAt = qb0Var.d.getChildAt(i7)) == null) {
            return;
        }
        int left = childAt.getLeft() + i10;
        if (i7 > 0 || i10 > 0) {
            left -= qb0Var.y;
        }
        if (left != qb0Var.I) {
            qb0Var.I = left;
            qb0Var.scrollTo(left, 0);
        }
    }

    public final void b(int i7, CharSequence charSequence) {
        pb0 pb0Var = new pb0(this, getContext(), i7);
        pb0Var.setTextSize(1, 14.0f);
        pb0Var.setTypeface(org.telegram.messenger.g0.o());
        pb0Var.setTextColor(c(0.6f));
        pb0Var.setFocusable(true);
        pb0Var.setGravity(17);
        pb0Var.setText(charSequence);
        c8.ka.b(pb0Var, 0.025f, 1.2f);
        pb0Var.setOnClickListener(new ai.v(this, i7, 15));
        pb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(pb0Var, c8.ha.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        pb0Var.setSelected(i7 == this.h);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.H), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i7 = 0; i7 < this.f; i7++) {
            if (this.e.getAdapter() instanceof ax) {
                ((ax) this.e.getAdapter()).getClass();
                b(i7, this.e.getAdapter().d(i7));
            } else {
                b(i7, this.e.getAdapter().d(i7));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        int i7 = 0;
        while (i7 < this.f) {
            View childAt = this.d.getChildAt(i7);
            childAt.setLayoutParams(this.a);
            if (this.x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof ax) {
                ((ax) this.e.getAdapter()).getClass();
                int L = org.telegram.messenger.g0.L(i7 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i10 = this.G;
                childAt.setPadding(i10, 0, i10, 0);
            }
            i7++;
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
        float e10;
        float e11;
        int i7;
        if (isInEditMode() || this.f == 0) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i10 = this.E;
        LinearLayout linearLayout = this.d;
        Paint paint = this.r;
        if (i10 != 0) {
            paint.setColor(this.w);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
            float f10 = this.E / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f11 = this.n;
            w5 w5Var = this.K;
            w5 w5Var2 = this.J;
            if (f11 <= 0.0f || (i7 = this.h) >= this.f - 1) {
                e10 = w5Var2.e(false, paddingLeft);
                e11 = w5Var.e(false, right);
            } else {
                View childAt2 = linearLayout.getChildAt(i7 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f12 = this.n;
                float f13 = 1.0f - f12;
                e10 = (paddingLeft * f13) + (paddingLeft2 * f12);
                e11 = (f13 * right) + (f12 * right2);
                w5Var2.e(true, e10);
                w5Var.e(true, e11);
                if (childAt instanceof pb0) {
                    pb0 pb0Var = (pb0) childAt;
                    pb0Var.setTextColor(pb0Var.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.n)));
                }
                if (childAt2 instanceof pb0) {
                    pb0 pb0Var2 = (pb0) childAt2;
                    pb0Var2.setTextColor(pb0Var2.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.n)));
                }
            }
            if (this.D != 0) {
                paint.setColor(this.s);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(e10 - org.telegram.messenger.g0.L(11.0f), getPaddingTop(), e11 + org.telegram.messenger.g0.L(11.0f), height - getPaddingBottom());
                rectF2.offset(getPaddingLeft(), 0.0f);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.x || View.MeasureSpec.getMode(i7) == 0) {
            return;
        }
        this.d.measure(getMeasuredWidth() | TLObject.FLAG_30, i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (this.x) {
            return;
        }
        post(new ob0(this, 0));
    }

    public void setDividerPadding(int i7) {
        this.F = i7;
        invalidate();
    }

    public void setIndicatorColor(int i7) {
        this.s = i7;
        invalidate();
    }

    public void setIndicatorColorResource(int i7) {
        this.s = getResources().getColor(i7);
        invalidate();
    }

    public void setIndicatorHeight(int i7) {
        this.D = i7;
        invalidate();
    }

    public void setOnPageChangeListener(c5.g gVar) {
        this.c = gVar;
    }

    public void setScrollOffset(int i7) {
        this.y = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z9) {
        this.x = z9;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i7) {
        this.G = i7;
        e();
    }

    public void setUnderlineColor(int i7) {
        this.w = i7;
        invalidate();
    }

    public void setUnderlineColorResource(int i7) {
        this.w = getResources().getColor(i7);
        invalidate();
    }

    public void setUnderlineHeight(int i7) {
        this.E = i7;
        invalidate();
    }

    public void setViewPager(c5.k kVar) {
        this.e = kVar;
        if (kVar.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        kVar.setOnPageChangeListener(this.b);
        d();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
            try {
                View childAt = linearLayout.getChildAt(i7);
                childAt.setSelected(childAt.isSelected());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
