package lh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ yf.r0 c;
    public final /* synthetic */ va d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(va vaVar, Context context, yf.r0 r0Var) {
        super(context);
        this.d = vaVar;
        this.c = r0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = vaVar.t1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        va vaVar = this.d;
        yf.p1 p1Var = vaVar.w1;
        Paint paint = vaVar.u1;
        Paint paint2 = vaVar.t1;
        Paint paint3 = vaVar.v1;
        barView = vaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        g5 g5Var = vaVar.s1;
        rectF.set(AndroidUtilities.lerp(left, g5Var.getLeft(), vaVar.z1), AndroidUtilities.lerp(barView.getTop(), g5Var.getTop(), vaVar.z1), AndroidUtilities.lerp(barView.getRight(), g5Var.getRight(), vaVar.z1), AndroidUtilities.lerp(barView.getBottom(), g5Var.getBottom(), vaVar.z1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), vaVar.z1);
        canvas2.drawRoundRect(rectF, lerp, lerp, vaVar.A1);
        if (barView.getChildCount() < 1 || vaVar.z1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof zf.o1) {
            childAt = ((zf.o1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - vaVar.z1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x8 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = p1Var.a;
            int i11 = vaVar.V0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? vaVar.g1 : i11 == 2 ? vaVar.h1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof zf.o1) {
                    childAt2 = ((zf.o1) viewGroup).getColorClickableView();
                }
                x8 = AndroidUtilities.lerp(x8, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), vaVar.W0);
                y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), vaVar.W0);
            }
            if (g5Var != null && g5Var.getChildCount() > 0) {
                View childAt3 = g5Var.getChildAt(0);
                x8 = AndroidUtilities.lerp(x8, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (g5Var.getX() - barView.getLeft()), vaVar.z1);
                y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (g5Var.getY() - barView.getTop()), vaVar.z1);
                i10 = i0.b.d(vaVar.z1, p1Var.a, this.c.b(0));
            }
            float f10 = x8;
            float f11 = y10;
            if (f10 != this.a || f11 != this.b) {
                this.a = f10;
                this.b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (g5Var != null && g5Var.getChildCount() > 0) {
                View childAt4 = g5Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), vaVar.z1);
            }
            float f12 = min;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(i10);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(i10);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float dp = f12 - AndroidUtilities.dp(3.0f);
            if (g5Var != null && g5Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, vaVar.z1);
            }
            zf.i1.x1(f10, f11, dp, paint.getColor(), canvas2);
            if (g5Var != null && g5Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * vaVar.z1));
                canvas2.drawCircle(f10, f11, org.telegram.ui.Cells.pa.b(1.0f, vaVar.z1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        f5 f5Var = this.d.Q0;
        if (f5Var != null) {
            f5Var.invalidate();
        }
    }
}
