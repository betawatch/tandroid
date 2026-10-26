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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wd0 extends HorizontalScrollView implements org.telegram.ui.ActionBar.p6 {
    public int E;
    public int F;
    public int G;
    public final org.telegram.ui.ActionBar.u6 H;
    public int I;
    public final h6 J;
    public final h6 K;
    public final LinearLayout.LayoutParams a;
    public final di.w5 b;
    public a5.i c;
    public final LinearLayout d;
    public a5.m e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int v;
    public boolean w;
    public int x;
    public int y;

    public wd0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.b = new di.w5(1, this);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.v = 436207616;
        this.w = false;
        this.x = AndroidUtilities.dp(52.0f);
        this.y = AndroidUtilities.dp(8.0f);
        this.E = AndroidUtilities.dp(2.0f);
        this.F = AndroidUtilities.dp(12.0f);
        this.G = AndroidUtilities.dp(24.0f);
        this.I = 0;
        ds dsVar = ds.h;
        this.J = new h6(this, 350L, dsVar);
        this.K = new h6(this, 350L, dsVar);
        this.H = u6Var;
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

    public static void a(wd0 wd0Var, int i10, int i11) {
        View childAt;
        if (wd0Var.f == 0 || (childAt = wd0Var.d.getChildAt(i10)) == null) {
            return;
        }
        int left = childAt.getLeft() + i11;
        if (i10 > 0 || i11 > 0) {
            left -= wd0Var.x;
        }
        if (left != wd0Var.I) {
            wd0Var.I = left;
            wd0Var.scrollTo(left, 0);
        }
    }

    public final void b(int i10, CharSequence charSequence) {
        vd0 vd0Var = new vd0(this, getContext(), i10);
        vd0Var.setTextSize(1, 14.0f);
        vd0Var.setTypeface(AndroidUtilities.bold());
        vd0Var.setTextColor(c(0.6f));
        vd0Var.setFocusable(true);
        vd0Var.setGravity(17);
        vd0Var.setText(charSequence);
        gb1.c(vd0Var, 0.025f, 1.2f);
        vd0Var.setOnClickListener(new ai.w(this, i10, 16));
        vd0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.addView(vd0Var, gb1.o(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        vd0Var.setSelected(i10 == this.h);
    }

    public final int c(float f7) {
        return i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, this.H), (int) (f7 * 255.0f));
    }

    public final void d() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i10 = 0; i10 < this.f; i10++) {
            if (this.e.getAdapter() instanceof ud0) {
                ((ud0) this.e.getAdapter()).getClass();
                b(i10, this.e.getAdapter().d(i10));
            } else {
                b(i10, this.e.getAdapter().d(i10));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(this, 5));
    }

    public final void e() {
        int i10 = 0;
        while (i10 < this.f) {
            View childAt = this.d.getChildAt(i10);
            childAt.setLayoutParams(this.a);
            if (this.w) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof ud0) {
                ((ky) ((ud0) this.e.getAdapter())).getClass();
                int dp = AndroidUtilities.dp(i10 == 1 ? 12.0f : 18.0f);
                childAt.setPadding(dp, 0, dp, 0);
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
        return this.y;
    }

    public int getScrollOffset() {
        return this.x;
    }

    public boolean getShouldExpand() {
        return this.w;
    }

    public int getTabPaddingLeftRight() {
        return this.G;
    }

    public int getUnderlineColor() {
        return this.v;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d;
        float d10;
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
            paint.setColor(this.v);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, height - this.E, linearLayout.getWidth(), height);
            float f7 = this.E / 2.0f;
            canvas.drawRoundRect(rectF, f7, f7, paint);
        }
        View childAt = linearLayout.getChildAt(this.h);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f10 = this.n;
            h6 h6Var = this.K;
            h6 h6Var2 = this.J;
            if (f10 <= 0.0f || (i10 = this.h) >= this.f - 1) {
                d = h6Var2.d(paddingLeft, false);
                d10 = h6Var.d(right, false);
            } else {
                View childAt2 = linearLayout.getChildAt(i10 + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f11 = this.n;
                float f12 = 1.0f - f11;
                d = (paddingLeft * f12) + (paddingLeft2 * f11);
                d10 = (f12 * right) + (f11 * right2);
                h6Var2.d(d, true);
                h6Var.d(d10, true);
                if (childAt instanceof vd0) {
                    vd0 vd0Var = (vd0) childAt;
                    vd0Var.setTextColor(vd0Var.a.c(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.n)));
                }
                if (childAt2 instanceof vd0) {
                    vd0 vd0Var2 = (vd0) childAt2;
                    vd0Var2.setTextColor(vd0Var2.a.c(AndroidUtilities.lerp(0.6f, 0.8f, this.n)));
                }
            }
            if (this.y != 0) {
                paint.setColor(this.s);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(d - AndroidUtilities.dp(11.0f), getPaddingTop(), d10 + AndroidUtilities.dp(11.0f), height - getPaddingBottom());
                rectF2.offset(getPaddingLeft(), 0.0f);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.w || View.MeasureSpec.getMode(i10) == 0) {
            return;
        }
        this.d.measure(getMeasuredWidth() | TLObject.FLAG_30, i11);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.w) {
            return;
        }
        post(new wa0(this, 5));
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
        this.y = i10;
        invalidate();
    }

    public void setOnPageChangeListener(a5.i iVar) {
        this.c = iVar;
    }

    public void setScrollOffset(int i10) {
        this.x = i10;
        invalidate();
    }

    public void setShouldExpand(boolean z10) {
        this.w = z10;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i10) {
        this.G = i10;
        e();
    }

    public void setUnderlineColor(int i10) {
        this.v = i10;
        invalidate();
    }

    public void setUnderlineColorResource(int i10) {
        this.v = getResources().getColor(i10);
        invalidate();
    }

    public void setUnderlineHeight(int i10) {
        this.E = i10;
        invalidate();
    }

    public void setViewPager(a5.m mVar) {
        this.e = mVar;
        if (mVar.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        mVar.setOnPageChangeListener(this.b);
        d();
    }

    @Override // org.telegram.ui.ActionBar.p6
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
                FileLog.e(e);
                return;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
