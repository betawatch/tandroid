package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public final /* synthetic */ nb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(nb nbVar, Context context) {
        super(context);
        this.a = nbVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nb nbVar = this.a;
        Paint paint = nbVar.r1;
        qg.p1 p1Var = nbVar.l1;
        paint.setAlpha((int) ((1.0f - nbVar.t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + nbVar.T0.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        qg.u1 u1Var = nbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), nbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), nbVar.t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), nbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), nbVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, nbVar.t1));
        Paint paint2 = nbVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * nbVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            nb nbVar = this.a;
            if (nbVar.u1) {
                nbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
