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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lb0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.e6 I;
    public int J;
    public final u5 K;
    public final u5 L;
    public final LinearLayout.LayoutParams a;
    public final ei.n5 b;
    public b5.h c;
    public final LinearLayout d;
    public b5.l e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public lb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new ei.n5(1, this);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.w = 436207616;
        this.x = false;
        this.y = org.telegram.messenger.g0.L(52.0f);
        this.E = org.telegram.messenger.g0.L(8.0f);
        this.F = org.telegram.messenger.g0.L(2.0f);
        this.G = org.telegram.messenger.g0.L(12.0f);
        this.H = org.telegram.messenger.g0.L(24.0f);
        this.J = 0;
        xq xqVar = xq.h;
        this.K = new u5(this, 350L, xqVar);
        this.L = new u5(this, 350L, xqVar);
        this.I = e6Var;
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

    public static void a(lb0 lb0Var, int i3, int i10) {
        View childAt;
        if (lb0Var.f == 0 || (childAt = lb0Var.d.getChildAt(i3)) == null) {
            return;
        }
        int left = childAt.getLeft() + i10;
        if (i3 > 0 || i10 > 0) {
            left -= lb0Var.y;
        }
        if (left != lb0Var.J) {
            lb0Var.J = left;
            lb0Var.scrollTo(left, 0);
        }
    }

    public final void b(int i3, CharSequence charSequence) {
        kb0 kb0Var = new kb0(this, getContext(), i3);
        kb0Var.setTextSize(1, 14.0f);
        kb0Var.setTypeface(org.telegram.messenger.g0.o());
        kb0Var.setTextColor(c(0.6f));
        kb0Var.setFocusable(true);
        kb0Var.setGravity(17);
        kb0Var.setText(charSequence);
        b8.pf.b(kb0Var, 0.025f, 1.2f);
        kb0Var.setOnClickListener(new bi.q(this, i3, 15));
        kb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(kb0Var, b8.mf.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        kb0Var.setSelected(i3 == this.h);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, this.I), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i3 = 0; i3 < this.f; i3++) {
            if (this.e.getAdapter() instanceof yw) {
                ((yw) this.e.getAdapter()).getClass();
                b(i3, this.e.getAdapter().d(i3));
            } else {
                b(i3, this.e.getAdapter().d(i3));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(this, 5));
    }

    public final void e() {
        int i3 = 0;
        while (i3 < this.f) {
            View childAt = this.d.getChildAt(i3);
            childAt.setLayoutParams(this.a);
            if (this.x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof yw) {
                ((yw) this.e.getAdapter()).getClass();
                int L = org.telegram.messenger.g0.L(i3 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i10 = this.H;
                childAt.setPadding(i10, 0, i10, 0);
            }
            i3++;
        }
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getIndicatorColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.E;
    }

    public int getScrollOffset() {
        return this.y;
    }

    public boolean getShouldExpand() {
        return this.x;
    }

    public int getTabPaddingLeftRight() {
        return this.H;
    }

    public int getUnderlineColor() {
        return this.w;
    }

    public int getUnderlineHeight() {
        return this.F;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e10;
        float e11;
        int i3;
        if (isInEditMode() || this.f == 0) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i10 = this.F;
        LinearLayout linearLayout = this.d;
        Paint paint = this.r;
        if (i10 != 0) {
            paint.setColor(this.w);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
            float f10 = this.F / 2.0f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f11 = this.n;
            u5 u5Var = this.L;
            u5 u5Var2 = this.K;
            if (f11 <= 0.0f || (i3 = this.h) >= this.f - 1) {
                e10 = u5Var2.e(false, paddingLeft);
                e11 = u5Var.e(false, right);
            } else {
                View childAt2 = linearLayout.getChildAt(i3 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f12 = this.n;
                float f13 = 1.0f - f12;
                e10 = (paddingLeft * f13) + (paddingLeft2 * f12);
                e11 = (f13 * right) + (f12 * right2);
                u5Var2.e(true, e10);
                u5Var.e(true, e11);
                if (childAt instanceof kb0) {
                    kb0 kb0Var = (kb0) childAt;
                    kb0Var.setTextColor(kb0Var.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.n)));
                }
                if (childAt2 instanceof kb0) {
                    kb0 kb0Var2 = (kb0) childAt2;
                    kb0Var2.setTextColor(kb0Var2.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.n)));
                }
            }
            if (this.E != 0) {
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (!this.x || View.MeasureSpec.getMode(i3) == 0) {
            return;
        }
        this.d.measure(getMeasuredWidth() | TLObject.FLAG_30, i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (this.x) {
            return;
        }
        post(new jb0(this, 0));
    }

    public void setDividerPadding(int i3) {
        this.G = i3;
        invalidate();
    }

    public void setIndicatorColor(int i3) {
        this.s = i3;
        invalidate();
    }

    public void setIndicatorColorResource(int i3) {
        this.s = getResources().getColor(i3);
        invalidate();
    }

    public void setIndicatorHeight(int i3) {
        this.E = i3;
        invalidate();
    }

    public void setOnPageChangeListener(b5.h hVar) {
        this.c = hVar;
    }

    public void setScrollOffset(int i3) {
        this.y = i3;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i3) {
        this.H = i3;
        e();
    }

    public void setUnderlineColor(int i3) {
        this.w = i3;
        invalidate();
    }

    public void setUnderlineColorResource(int i3) {
        this.w = getResources().getColor(i3);
        invalidate();
    }

    public void setUnderlineHeight(int i3) {
        this.F = i3;
        invalidate();
    }

    public void setViewPager(b5.l lVar) {
        this.e = lVar;
        if (lVar.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        lVar.setOnPageChangeListener(this.b);
        d();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            try {
                View childAt = linearLayout.getChildAt(i3);
                childAt.setSelected(childAt.isSelected());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
