package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ er0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(er0 er0Var, Context context) {
        super(context);
        this.c = er0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = er0Var.q1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        er0 er0Var = this.c;
        ig.q1 q1Var = er0Var.t1;
        Paint paint = er0Var.r1;
        Paint paint2 = er0Var.q1;
        Paint paint3 = er0Var.s1;
        barView = er0Var.getBarView();
        Rect rect = org.telegram.messenger.i0.Q;
        int left = barView.getLeft();
        m0 m0Var = er0Var.p1;
        rect.set(org.telegram.messenger.i0.W1(er0Var.w1, left, m0Var.getLeft()), org.telegram.messenger.i0.W1(er0Var.w1, barView.getTop(), m0Var.getTop()), org.telegram.messenger.i0.W1(er0Var.w1, barView.getRight(), m0Var.getRight()), org.telegram.messenger.i0.W1(er0Var.w1, barView.getBottom(), m0Var.getBottom()));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        float W1 = org.telegram.messenger.i0.W1(er0Var.w1, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(24.0f));
        if (er0Var.L1 != null) {
            rect.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
            er0Var.L1.q(W1);
            er0Var.L1.setBounds(rect);
            er0Var.L1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, W1, W1, er0Var.x1);
        }
        if (barView.getChildCount() < 1 || er0Var.w1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof t1) {
            childAt = ((t1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - er0Var.w1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = q1Var.a;
            int i11 = er0Var.Q0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? er0Var.c1 : i11 == 2 ? er0Var.d1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof t1) {
                    childAt2 = ((t1) viewGroup).getColorClickableView();
                }
                x10 = org.telegram.messenger.i0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), er0Var.R0);
                y3 = org.telegram.messenger.i0.T1(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), er0Var.R0);
            }
            if (m0Var != null && m0Var.getChildCount() > 0) {
                View childAt3 = m0Var.getChildAt(0);
                x10 = org.telegram.messenger.i0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (m0Var.getX() - barView.getLeft()), er0Var.w1);
                y3 = org.telegram.messenger.i0.T1(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (m0Var.getY() - barView.getTop()), er0Var.w1);
                i10 = i0.b.f(er0Var.w1, q1Var.a, er0Var.E1.b(0));
            }
            float f7 = x10;
            float f10 = y3;
            if (f7 != this.a || f10 != this.b) {
                this.a = f7;
                this.b = f10;
                paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.i0.L(0.5f);
            if (m0Var != null && m0Var.getChildCount() > 0) {
                View childAt4 = m0Var.getChildAt(0);
                min = org.telegram.messenger.i0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.i0.L(2.0f), er0Var.w1);
            }
            float f11 = min;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float L = f11 - org.telegram.messenger.i0.L(3.0f);
            if (m0Var != null && m0Var.getSelectedColorIndex() != 0) {
                L = org.telegram.messenger.i0.T1(f11 - org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(2.0f) + f11, er0Var.w1);
            }
            n1.A1(f7, f10, L, paint.getColor(), canvas2);
            if (m0Var != null && m0Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * er0Var.w1));
                canvas2.drawCircle(f7, f10, sc.e.z(1.0f, er0Var.w1, paint3.getStrokeWidth() + org.telegram.messenger.i0.L(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        l0 l0Var = this.c.M0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }
}
