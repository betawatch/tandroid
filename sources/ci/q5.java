package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        qg.p1 p1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + qbVar.T0.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        qg.u1 u1Var = qbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), qbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), qbVar.t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), qbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), qbVar.t1));
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
