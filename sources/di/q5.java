package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class q5 extends FrameLayout {
    public final /* synthetic */ rb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(rb rbVar, Context context) {
        super(context);
        this.a = rbVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rb rbVar = this.a;
        Paint paint = rbVar.r1;
        rg.q1 q1Var = rbVar.l1;
        paint.setAlpha((int) ((1.0f - rbVar.t1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + rbVar.T0.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        rg.v1 v1Var = rbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), rbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), rbVar.t1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), rbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), rbVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, rbVar.t1));
        Paint paint2 = rbVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * rbVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            rb rbVar = this.a;
            if (rbVar.u1) {
                rbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
