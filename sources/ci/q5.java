package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class q5 extends FrameLayout {
    public final /* synthetic */ qb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(qb qbVar, Context context) {
        super(context);
        this.a = qbVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        qb qbVar = this.a;
        Paint paint = qbVar.r1;
        qg.r1 r1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.t1) * r1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        float translationY = r1Var.getTranslationY() + qbVar.T0.getTranslationY() + r1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        qg.w1 w1Var = qbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), qbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), qbVar.t1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), qbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), qbVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, qbVar.t1));
        Paint paint2 = qbVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * qbVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            qb qbVar = this.a;
            if (qbVar.u1) {
                qbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
