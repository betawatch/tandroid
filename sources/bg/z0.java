package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z0 extends FrameLayout {
    public final /* synthetic */ ws0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ws0 ws0Var, Context context) {
        super(context);
        this.a = ws0Var;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ws0 ws0Var = this.a;
        Paint paint = ws0Var.x1;
        n2 n2Var = ws0Var.q1;
        paint.setAlpha((int) ((1.0f - ws0Var.z1) * n2Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        n2Var.b(rectF);
        float translationY = n2Var.getTranslationY() + ws0Var.Y0.getTranslationY() + n2Var.getTop() + r4.getTop();
        float f9 = rectF.left;
        t2 t2Var = ws0Var.r1;
        rectF.set(AndroidUtilities.lerp(f9, t2Var.getLeft(), ws0Var.z1), AndroidUtilities.lerp(rectF.top + translationY, t2Var.getTop() - t2Var.getTranslationY(), ws0Var.z1), AndroidUtilities.lerp(rectF.right, t2Var.getRight(), ws0Var.z1), AndroidUtilities.lerp(translationY + rectF.bottom, t2Var.getBottom() - t2Var.getTranslationY(), ws0Var.z1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ws0Var.z1));
        Paint paint2 = ws0Var.y1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ws0Var.z1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ws0 ws0Var = this.a;
            if (ws0Var.A1) {
                ws0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
