package nh;

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
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ ag.h1 c;
    public final /* synthetic */ ja d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(ja jaVar, Context context, ag.h1 h1Var) {
        super(context);
        this.d = jaVar;
        this.c = h1Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = jaVar.t1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ja jaVar = this.d;
        ag.k2 k2Var = jaVar.w1;
        Paint paint = jaVar.u1;
        Paint paint2 = jaVar.t1;
        Paint paint3 = jaVar.v1;
        barView = jaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        x4 x4Var = jaVar.s1;
        rectF.set(AndroidUtilities.lerp(left, x4Var.getLeft(), jaVar.z1), AndroidUtilities.lerp(barView.getTop(), x4Var.getTop(), jaVar.z1), AndroidUtilities.lerp(barView.getRight(), x4Var.getRight(), jaVar.z1), AndroidUtilities.lerp(barView.getBottom(), x4Var.getBottom(), jaVar.z1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), jaVar.z1);
        canvas2.drawRoundRect(rectF, lerp, lerp, jaVar.A1);
        if (barView.getChildCount() < 1 || jaVar.z1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof bg.n2) {
            childAt = ((bg.n2) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - jaVar.z1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x4 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y8 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = k2Var.a;
            int i11 = jaVar.V0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? jaVar.g1 : i11 == 2 ? jaVar.h1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof bg.n2) {
                    childAt2 = ((bg.n2) viewGroup).getColorClickableView();
                }
                x4 = AndroidUtilities.lerp(x4, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), jaVar.W0);
                y8 = AndroidUtilities.lerp(y8, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), jaVar.W0);
            }
            if (x4Var != null && x4Var.getChildCount() > 0) {
                View childAt3 = x4Var.getChildAt(0);
                x4 = AndroidUtilities.lerp(x4, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (x4Var.getX() - barView.getLeft()), jaVar.z1);
                y8 = AndroidUtilities.lerp(y8, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (x4Var.getY() - barView.getTop()), jaVar.z1);
                i10 = i0.a.d(jaVar.z1, k2Var.a, this.c.b(0));
            }
            float f9 = x4;
            float f10 = y8;
            if (f9 != this.a || f10 != this.b) {
                this.a = f9;
                this.b = f10;
                paint2.setShader(new SweepGradient(f9, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (x4Var != null && x4Var.getChildCount() > 0) {
                View childAt4 = x4Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), jaVar.z1);
            }
            float f11 = min;
            rectF.set(f9 - f11, f10 - f11, f9 + f11, f10 + f11);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float dp = f11 - AndroidUtilities.dp(3.0f);
            if (x4Var != null && x4Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, jaVar.z1);
            }
            bg.h2.x1(f9, f10, dp, paint.getColor(), canvas2);
            if (x4Var != null && x4Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * jaVar.z1));
                canvas2.drawCircle(f9, f10, th.b(1.0f, jaVar.z1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        w4 w4Var = this.d.Q0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
    }
}
