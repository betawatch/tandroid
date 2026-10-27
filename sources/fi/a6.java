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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ rg.s0 c;
    public final /* synthetic */ ta d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(ta taVar, Context context, rg.s0 s0Var) {
        super(context);
        this.d = taVar;
        this.c = s0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = taVar.m1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ta taVar = this.d;
        rg.q1 q1Var = taVar.p1;
        Paint paint = taVar.n1;
        Paint paint2 = taVar.m1;
        Paint paint3 = taVar.o1;
        barView = taVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        f5 f5Var = taVar.l1;
        rectF.set(AndroidUtilities.lerp(left, f5Var.getLeft(), taVar.s1), AndroidUtilities.lerp(barView.getTop(), f5Var.getTop(), taVar.s1), AndroidUtilities.lerp(barView.getRight(), f5Var.getRight(), taVar.s1), AndroidUtilities.lerp(barView.getBottom(), f5Var.getBottom(), taVar.s1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), taVar.s1);
        canvas2.drawRoundRect(rectF, lerp, lerp, taVar.t1);
        if (barView.getChildCount() < 1 || taVar.s1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof sg.p1) {
            childAt = ((sg.p1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - taVar.s1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x9 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = q1Var.a;
            int i11 = taVar.O0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? taVar.Z0 : i11 == 2 ? taVar.a1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof sg.p1) {
                    childAt2 = ((sg.p1) viewGroup).getColorClickableView();
                }
                x9 = AndroidUtilities.lerp(x9, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), taVar.P0);
                y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), taVar.P0);
            }
            if (f5Var != null && f5Var.getChildCount() > 0) {
                View childAt3 = f5Var.getChildAt(0);
                x9 = AndroidUtilities.lerp(x9, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (f5Var.getX() - barView.getLeft()), taVar.s1);
                y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (f5Var.getY() - barView.getTop()), taVar.s1);
                i10 = i0.a.f(taVar.s1, q1Var.a, this.c.b(0));
            }
            float f7 = x9;
            float f10 = y3;
            if (f7 != this.a || f10 != this.b) {
                this.a = f7;
                this.b = f10;
                paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (f5Var != null && f5Var.getChildCount() > 0) {
                View childAt4 = f5Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), taVar.s1);
            }
            float f11 = min;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float dp = f11 - AndroidUtilities.dp(3.0f);
            if (f5Var != null && f5Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, taVar.s1);
            }
            sg.j1.D1(f7, f10, dp, paint.getColor(), canvas2);
            if (f5Var != null && f5Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * taVar.s1));
                canvas2.drawCircle(f7, f10, ic.a.d(1.0f, taVar.s1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        e5 e5Var = this.d.J0;
        if (e5Var != null) {
            e5Var.invalidate();
        }
    }
}
