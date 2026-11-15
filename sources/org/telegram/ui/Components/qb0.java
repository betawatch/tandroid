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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qb0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final org.telegram.ui.ActionBar.e6 I;
    public int J;
    public final u5 K;
    public final u5 L;
    public final LinearLayout.LayoutParams a;
    public final fi.f5 b;
    public c5.h c;
    public final LinearLayout d;
    public c5.l e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public qb0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new fi.f5(1, this);
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
        er erVar = er.h;
        this.K = new u5(this, 350L, erVar);
        this.L = new u5(this, 350L, erVar);
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

    public static void a(qb0 qb0Var, int i7, int i10) {
        View childAt;
        if (qb0Var.f == 0 || (childAt = qb0Var.d.getChildAt(i7)) == null) {
            return;
        }
        int left = childAt.getLeft() + i10;
        if (i7 > 0 || i10 > 0) {
            left -= qb0Var.y;
        }
        if (left != qb0Var.J) {
            qb0Var.J = left;
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
        c8.na.b(pb0Var, 0.025f, 1.2f);
        pb0Var.setOnClickListener(new ci.q(this, i7, 15));
        pb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        this.d.addView(pb0Var, c8.ja.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        pb0Var.setSelected(i7 == this.h);
    }

    public final int c(float f10) {
        return i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Nl, this.I), (int) (f10 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i7 = 0; i7 < this.f; i7++) {
            if (this.e.getAdapter() instanceof fx) {
                ((fx) this.e.getAdapter()).getClass();
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
            } else if (this.e.getAdapter() instanceof fx) {
                ((fx) this.e.getAdapter()).getClass();
                int L = org.telegram.messenger.g0.L(i7 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i10 = this.H;
                childAt.setPadding(i10, 0, i10, 0);
            }
            i7++;
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
        int i7;
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
            if (f11 <= 0.0f || (i7 = this.h) >= this.f - 1) {
                e10 = u5Var2.e(false, paddingLeft);
                e11 = u5Var.e(false, right);
            } else {
                View childAt2 = linearLayout.getChildAt(i7 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f12 = this.n;
                float f13 = 1.0f - f12;
                e10 = (paddingLeft * f13) + (paddingLeft2 * f12);
                e11 = (f13 * right) + (f12 * right2);
                u5Var2.e(true, e10);
                u5Var.e(true, e11);
                if (childAt instanceof pb0) {
                    pb0 pb0Var = (pb0) childAt;
                    pb0Var.setTextColor(pb0Var.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, 1.0f - this.n)));
                }
                if (childAt2 instanceof pb0) {
                    pb0 pb0Var2 = (pb0) childAt2;
                    pb0Var2.setTextColor(pb0Var2.a.c(org.telegram.messenger.g0.T1(0.6f, 0.8f, this.n)));
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
        post(new wa0(this, 2));
    }

    public void setDividerPadding(int i7) {
        this.G = i7;
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
        this.E = i7;
        invalidate();
    }

    public void setOnPageChangeListener(c5.h hVar) {
        this.c = hVar;
    }

    public void setScrollOffset(int i7) {
        this.y = i7;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.x = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i7) {
        this.H = i7;
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
        this.F = i7;
        invalidate();
    }

    public void setViewPager(c5.l lVar) {
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

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
