package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class q7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.d6 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;
    public final /* synthetic */ t7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(t7 t7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = t7Var;
        this.c = h6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        t7 t7Var = this.d;
        float max = Math.max(0.0f, t7Var.J0());
        boolean z10 = max < ((float) org.telegram.messenger.g0.m);
        org.telegram.ui.Components.d6 d6Var = this.b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, d6Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(t7Var.u0, T1, getWidth() - t7Var.u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - d6Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        t7Var.r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(t7Var.u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.m, getWidth() - t7Var.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        t7 t7Var = this.d;
        if (y10 >= t7Var.J0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        t7Var.dismiss();
        return true;
    }
}
