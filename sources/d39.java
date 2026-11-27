// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d39 extends de0 {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ e39 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d39(e39 e39Var, Context context, int i) {
        super(context);
        this.I = e39Var;
        this.H = i;
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        e39 e39Var = this.I;
        a82 a82Var = e39Var.F;
        w57 w57Var = e39.I;
        if (!this.H) {
            super.onDraw(canvas);
        } else {
            a82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            t6b.h(e39Var.E, canvas, getImageReceiver(), a82Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
