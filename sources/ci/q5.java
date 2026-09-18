package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        qg.o1 o1Var = qbVar.l1;
        paint.setAlpha((int) ((1.0f - qbVar.t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + qbVar.T0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        qg.t1 t1Var = qbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), qbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), qbVar.t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), qbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), qbVar.t1));
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
