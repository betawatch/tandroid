package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.u5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ u7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(u7 u7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = u7Var;
        this.c = e6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        u7 u7Var = this.d;
        float max = Math.max(0.0f, u7Var.I0());
        boolean z10 = max < ((float) org.telegram.messenger.g0.m);
        org.telegram.ui.Components.u5 u5Var = this.b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, u5Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(u7Var.u0, T1, getWidth() - u7Var.u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - u5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        u7Var.r1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(u7Var.u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.m, getWidth() - u7Var.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        u7 u7Var = this.d;
        if (y10 >= u7Var.I0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        u7Var.dismiss();
        return true;
    }
}
