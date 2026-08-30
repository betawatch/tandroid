package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public final /* synthetic */ ft0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ft0 ft0Var, Context context) {
        super(context);
        this.a = ft0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ft0 ft0Var = this.a;
        Paint paint = ft0Var.y1;
        k2 k2Var = ft0Var.r1;
        paint.setAlpha((int) ((1.0f - ft0Var.A1) * k2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        k2Var.b(rectF);
        float translationY = k2Var.getTranslationY() + ft0Var.Z0.getTranslationY() + k2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        q2 q2Var = ft0Var.s1;
        rectF.set(AndroidUtilities.lerp(f10, q2Var.getLeft(), ft0Var.A1), AndroidUtilities.lerp(rectF.top + translationY, q2Var.getTop() - q2Var.getTranslationY(), ft0Var.A1), AndroidUtilities.lerp(rectF.right, q2Var.getRight(), ft0Var.A1), AndroidUtilities.lerp(translationY + rectF.bottom, q2Var.getBottom() - q2Var.getTranslationY(), ft0Var.A1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ft0Var.A1));
        Paint paint2 = ft0Var.z1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ft0Var.A1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ft0 ft0Var = this.a;
            if (ft0Var.B1) {
                ft0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
