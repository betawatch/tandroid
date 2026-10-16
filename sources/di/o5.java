package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o5 extends FrameLayout {
    public final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mb mbVar = this.a;
        Paint paint = mbVar.r1;
        rg.q1 q1Var = mbVar.l1;
        paint.setAlpha((int) ((1.0f - mbVar.t1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + mbVar.T0.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        rg.v1 v1Var = mbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), mbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), mbVar.t1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), mbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), mbVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mbVar.t1));
        Paint paint2 = mbVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mbVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mb mbVar = this.a;
            if (mbVar.u1) {
                mbVar.O0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
