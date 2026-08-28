package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g5 extends FrameLayout {
    public final /* synthetic */ ya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(ya yaVar, Context context) {
        super(context);
        this.a = yaVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ya yaVar = this.a;
        Paint paint = yaVar.n1;
        yf.o1 o1Var = yaVar.h1;
        paint.setAlpha((int) ((1.0f - yaVar.p1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + yaVar.P0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        yf.t1 t1Var = yaVar.i1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), yaVar.p1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), yaVar.p1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), yaVar.p1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), yaVar.p1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, yaVar.p1));
        Paint paint2 = yaVar.o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * yaVar.p1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ya yaVar = this.a;
            if (yaVar.q1) {
                yaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
