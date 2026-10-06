package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mb mbVar = this.a;
        Paint paint = mbVar.r1;
        qg.o1 o1Var = mbVar.l1;
        paint.setAlpha((int) ((1.0f - mbVar.t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + mbVar.T0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        qg.t1 t1Var = mbVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), mbVar.t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), mbVar.t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), mbVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), mbVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, mbVar.t1));
        Paint paint2 = mbVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * mbVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            mb mbVar = this.a;
            if (mbVar.u1) {
                mbVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
