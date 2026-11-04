package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.u5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ v7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(v7 v7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = v7Var;
        this.c = e6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        v7 v7Var = this.d;
        float max = Math.max(0.0f, v7Var.I0());
        boolean z10 = max < ((float) org.telegram.messenger.g0.m);
        org.telegram.ui.Components.u5 u5Var = this.b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, u5Var.d(z10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(v7Var.u0, T1, getWidth() - v7Var.u0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - u5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        v7Var.o1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(v7Var.u0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.m, getWidth() - v7Var.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y9 = motionEvent.getY();
        v7 v7Var = this.d;
        if (y9 >= v7Var.I0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        v7Var.dismiss();
        return true;
    }
}
