package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y0 extends FrameLayout {
    public final /* synthetic */ mt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mt0 mt0Var, Context context) {
        super(context);
        this.a = mt0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mt0 mt0Var = this.a;
        Paint paint = mt0Var.y1;
        k2 k2Var = mt0Var.r1;
        paint.setAlpha((int) ((1.0f - mt0Var.A1) * k2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        k2Var.b(rectF);
        float translationY = k2Var.getTranslationY() + mt0Var.Z0.getTranslationY() + k2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        q2 q2Var = mt0Var.s1;
        rectF.set(AndroidUtilities.lerp(f10, q2Var.getLeft(), mt0Var.A1), AndroidUtilities.lerp(rectF.top + translationY, q2Var.getTop() - q2Var.getTranslationY(), mt0Var.A1), AndroidUtilities.lerp(rectF.right, q2Var.getRight(), mt0Var.A1), AndroidUtilities.lerp(translationY + rectF.bottom, q2Var.getBottom() - q2Var.getTranslationY(), mt0Var.A1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mt0Var.A1));
        Paint paint2 = mt0Var.z1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mt0Var.A1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mt0 mt0Var = this.a;
            if (mt0Var.B1) {
                mt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
