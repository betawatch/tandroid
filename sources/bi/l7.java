package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l7 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ og.x0 c;
    public final /* synthetic */ ad d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(ad adVar, Context context, og.x0 x0Var) {
        super(context);
        this.d = adVar;
        this.c = x0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = adVar.x1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ad adVar = this.d;
        og.v1 v1Var = adVar.A1;
        Paint paint = adVar.y1;
        Paint paint2 = adVar.x1;
        Paint paint3 = adVar.z1;
        barView = adVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        p6 p6Var = adVar.w1;
        rectF.set(AndroidUtilities.lerp(left, p6Var.getLeft(), adVar.D1), AndroidUtilities.lerp(barView.getTop(), p6Var.getTop(), adVar.D1), AndroidUtilities.lerp(barView.getRight(), p6Var.getRight(), adVar.D1), AndroidUtilities.lerp(barView.getBottom(), p6Var.getBottom(), adVar.D1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), adVar.D1);
        canvas2.drawRoundRect(rectF, lerp, lerp, adVar.E1);
        if (barView.getChildCount() < 1 || adVar.D1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof pg.o1) {
            childAt = ((pg.o1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - adVar.D1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int i10 = v1Var.a;
            int i11 = adVar.Z0;
            View view = childAt;
            if (i11 != -1) {
                ViewGroup viewGroup = i11 == 0 ? adVar.k1 : i11 == 2 ? adVar.l1 : null;
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof pg.o1) {
                    childAt2 = ((pg.o1) viewGroup).getColorClickableView();
                }
                x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), adVar.a1);
                y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), adVar.a1);
            }
            if (p6Var != null && p6Var.getChildCount() > 0) {
                View childAt3 = p6Var.getChildAt(0);
                x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (p6Var.getX() - barView.getLeft()), adVar.D1);
                y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (p6Var.getY() - barView.getTop()), adVar.D1);
                i10 = i0.a.d(adVar.D1, v1Var.a, this.c.b(0));
            }
            float f7 = x10;
            float f10 = y3;
            if (f7 != this.a || f10 != this.b) {
                this.a = f7;
                this.b = f10;
                paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (p6Var != null && p6Var.getChildCount() > 0) {
                View childAt4 = p6Var.getChildAt(0);
                min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), adVar.D1);
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
            if (p6Var != null && p6Var.getSelectedColorIndex() != 0) {
                dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, adVar.D1);
            }
            pg.i1.w1(f7, f10, dp, paint.getColor(), canvas2);
            if (p6Var != null && p6Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * adVar.D1));
                canvas2.drawCircle(f7, f10, com.google.android.gms.internal.vision.e2.a(1.0f, adVar.D1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        o6 o6Var = this.d.U0;
        if (o6Var != null) {
            o6Var.invalidate();
        }
    }
}
