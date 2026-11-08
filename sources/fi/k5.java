package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k5 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ sg.l0 c;
    public final /* synthetic */ x9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(x9 x9Var, Context context, sg.l0 l0Var) {
        super(context);
        this.d = x9Var;
        this.c = l0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = x9Var.g1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        x9 x9Var = this.d;
        sg.j1 j1Var = x9Var.j1;
        Paint paint = x9Var.h1;
        Paint paint2 = x9Var.g1;
        Paint paint3 = x9Var.i1;
        barView = x9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        int left = barView.getLeft();
        w4 w4Var = x9Var.f1;
        rectF.set(org.telegram.messenger.g0.W1(x9Var.m1, left, w4Var.getLeft()), org.telegram.messenger.g0.W1(x9Var.m1, barView.getTop(), w4Var.getTop()), org.telegram.messenger.g0.W1(x9Var.m1, barView.getRight(), w4Var.getRight()), org.telegram.messenger.g0.W1(x9Var.m1, barView.getBottom(), w4Var.getBottom()));
        float W1 = org.telegram.messenger.g0.W1(x9Var.m1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        canvas2.drawRoundRect(rectF, W1, W1, x9Var.n1);
        if (barView.getChildCount() < 1 || x9Var.m1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof tg.e1) {
            childAt = ((tg.e1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - x9Var.m1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i7 = j1Var.a;
            int i10 = x9Var.I0;
            View view = childAt;
            if (i10 != -1) {
                ViewGroup viewGroup = i10 == 0 ? x9Var.T0 : i10 == 2 ? x9Var.U0 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof tg.e1) {
                    childAt2 = ((tg.e1) viewGroup).getColorClickableView();
                }
                x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), x9Var.J0);
                y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), x9Var.J0);
            }
            if (w4Var != null && w4Var.getChildCount() > 0) {
                View childAt3 = w4Var.getChildAt(0);
                x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (w4Var.getX() - barView.getLeft()), x9Var.m1);
                y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (w4Var.getY() - barView.getTop()), x9Var.m1);
                i7 = i0.a.f(x9Var.m1, j1Var.a, this.c.b(0));
            }
            float f10 = x10;
            float f11 = y10;
            if (f10 != this.a || f11 != this.b) {
                this.a = f10;
                this.b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
            if (w4Var != null && w4Var.getChildCount() > 0) {
                View childAt4 = w4Var.getChildAt(0);
                min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), x9Var.m1);
            }
            float f12 = min;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i7);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i7);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float L = f12 - org.telegram.messenger.g0.L(3.0f);
            if (w4Var != null && w4Var.getSelectedColorIndex() != 0) {
                L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, x9Var.m1);
            }
            tg.y0.A1(f10, f11, L, paint.getColor(), canvas2);
            if (w4Var != null && w4Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * x9Var.m1));
                canvas2.drawCircle(f10, f11, com.google.android.recaptcha.internal.a.v(1.0f, x9Var.m1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        v4 v4Var = this.d.D0;
        if (v4Var != null) {
            v4Var.invalidate();
        }
    }
}
