package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w0 extends FrameLayout {
    public final /* synthetic */ ht0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ht0 ht0Var, Context context) {
        super(context);
        this.a = ht0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ht0 ht0Var = this.a;
        Paint paint = ht0Var.y1;
        i2 i2Var = ht0Var.r1;
        paint.setAlpha((int) ((1.0f - ht0Var.A1) * i2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        float translationY = i2Var.getTranslationY() + ht0Var.Z0.getTranslationY() + i2Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        o2 o2Var = ht0Var.s1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), ht0Var.A1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), ht0Var.A1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), ht0Var.A1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), ht0Var.A1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ht0Var.A1));
        Paint paint2 = ht0Var.z1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ht0Var.A1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ht0 ht0Var = this.a;
            if (ht0Var.B1) {
                ht0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
