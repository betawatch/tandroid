package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f5 extends FrameLayout {
    public final /* synthetic */ xa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(xa xaVar, Context context) {
        super(context);
        this.a = xaVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xa xaVar = this.a;
        Paint paint = xaVar.r1;
        rg.p1 p1Var = xaVar.l1;
        paint.setAlpha((int) ((1.0f - xaVar.t1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + xaVar.T0.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        rg.u1 u1Var = xaVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), xaVar.t1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), xaVar.t1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), xaVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), xaVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, xaVar.t1));
        Paint paint2 = xaVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * xaVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            xa xaVar = this.a;
            if (xaVar.u1) {
                xaVar.N0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
