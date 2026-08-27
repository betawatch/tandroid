package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f5 extends FrameLayout {
    public final /* synthetic */ va a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(va vaVar, Context context) {
        super(context);
        this.a = vaVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        va vaVar = this.a;
        Paint paint = vaVar.n1;
        zf.o1 o1Var = vaVar.h1;
        paint.setAlpha((int) ((1.0f - vaVar.p1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + vaVar.P0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f10 = rectF.left;
        zf.t1 t1Var = vaVar.i1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), vaVar.p1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), vaVar.p1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), vaVar.p1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), vaVar.p1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, vaVar.p1));
        Paint paint2 = vaVar.o1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * vaVar.p1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            va vaVar = this.a;
            if (vaVar.q1) {
                vaVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
