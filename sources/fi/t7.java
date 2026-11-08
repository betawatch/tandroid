package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout {
    public final Paint a;
    public final org.telegram.ui.Components.w5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ w7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(w7 w7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = w7Var;
        this.c = f6Var;
        this.a = new Paint(1);
        this.b = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.c);
        Paint paint = this.a;
        paint.setColor(w02);
        w7 w7Var = this.d;
        float max = Math.max(0.0f, w7Var.I0());
        boolean z9 = max < ((float) org.telegram.messenger.g0.m);
        org.telegram.ui.Components.w5 w5Var = this.b;
        float T1 = org.telegram.messenger.g0.T1(max, 0.0f, w5Var.d(z9));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(w7Var.t0, T1, getWidth() - w7Var.t0, org.telegram.messenger.g0.L(14.0f) + getHeight());
        float L = (1.0f - w5Var.c) * org.telegram.messenger.g0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        w7Var.n1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m, org.telegram.messenger.g0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(w7Var.t0, org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.m, getWidth() - w7Var.t0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        w7 w7Var = this.d;
        if (y10 >= w7Var.I0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        w7Var.dismiss();
        return true;
    }
}
