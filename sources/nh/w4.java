package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w4 extends FrameLayout {
    public final /* synthetic */ ja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(ja jaVar, Context context) {
        super(context);
        this.a = jaVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ja jaVar = this.a;
        Paint paint = jaVar.n1;
        bg.n2 n2Var = jaVar.h1;
        paint.setAlpha((int) ((1.0f - jaVar.p1) * n2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        n2Var.b(rectF);
        float translationY = n2Var.getTranslationY() + jaVar.P0.getTranslationY() + n2Var.getTop() + r4.getTop();
        float f9 = rectF.left;
        bg.t2 t2Var = jaVar.i1;
        rectF.set(AndroidUtilities.lerp(f9, t2Var.getLeft(), jaVar.p1), AndroidUtilities.lerp(rectF.top + translationY, t2Var.getTop() - t2Var.getTranslationY(), jaVar.p1), AndroidUtilities.lerp(rectF.right, t2Var.getRight(), jaVar.p1), AndroidUtilities.lerp(translationY + rectF.bottom, t2Var.getBottom() - t2Var.getTranslationY(), jaVar.p1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, jaVar.p1));
        Paint paint2 = jaVar.o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * jaVar.p1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ja jaVar = this.a;
            if (jaVar.q1) {
                jaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
