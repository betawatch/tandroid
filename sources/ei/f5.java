package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        rg.o1 o1Var = xaVar.l1;
        paint.setAlpha((int) ((1.0f - xaVar.t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + xaVar.T0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        rg.t1 t1Var = xaVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), xaVar.t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), xaVar.t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), xaVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), xaVar.t1));
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
                xaVar.O0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
