// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gz0 extends xk7 {
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ mz0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(mz0 mz0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.t0 = mz0Var;
        this.s0 = z;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mz0 mz0Var = this.t0;
        mz0Var.R0(canvas, this);
        super.dispatchDraw(canvas);
        mz0Var.Q0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            mz0 mz0Var = this.t0;
            if (y < mz0Var.s0.getBounds().top) {
                mz0Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // xk7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        mz0 mz0Var = this.t0;
        mz0Var.q1 = size;
        mz0Var.N0(i, i2);
        if (this.s0) {
            i2 = View.MeasureSpec.makeMeasureSpec(mz0Var.q1, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
