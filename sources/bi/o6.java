package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o6 extends FrameLayout {
    public final /* synthetic */ ad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(ad adVar, Context context) {
        super(context);
        this.a = adVar;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ad adVar = this.a;
        Paint paint = adVar.r1;
        pg.o1 o1Var = adVar.l1;
        paint.setAlpha((int) ((1.0f - adVar.t1) * o1Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        float translationY = o1Var.getTranslationY() + adVar.T0.getTranslationY() + o1Var.getTop() + r4.getTop();
        float f7 = rectF.left;
        pg.t1 t1Var = adVar.m1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), adVar.t1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), adVar.t1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), adVar.t1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), adVar.t1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, adVar.t1));
        Paint paint2 = adVar.s1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * adVar.t1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ad adVar = this.a;
            if (adVar.u1) {
                adVar.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
