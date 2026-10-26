package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e5 extends FrameLayout {
    public final /* synthetic */ ta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(ta taVar, Context context) {
        super(context);
        this.a = taVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ta taVar = this.a;
        Paint paint = taVar.g1;
        sg.q1 q1Var = taVar.a1;
        paint.setAlpha((int) ((1.0f - taVar.i1) * q1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        float translationY = q1Var.getTranslationY() + taVar.I0.getTranslationY() + q1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        sg.v1 v1Var = taVar.b1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), taVar.i1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), taVar.i1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), taVar.i1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), taVar.i1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, taVar.i1));
        Paint paint2 = taVar.h1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * taVar.i1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ta taVar = this.a;
            if (taVar.j1) {
                taVar.M0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
