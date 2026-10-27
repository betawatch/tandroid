package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        sg.p1 p1Var = taVar.a1;
        paint.setAlpha((int) ((1.0f - taVar.i1) * p1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        float translationY = p1Var.getTranslationY() + taVar.I0.getTranslationY() + p1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        sg.u1 u1Var = taVar.b1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), taVar.i1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), taVar.i1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), taVar.i1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), taVar.i1));
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
