// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hy0 extends dl7 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ ny0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(ny0 ny0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.n0 = ny0Var;
        this.m0 = z;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ny0 ny0Var = this.n0;
        ny0Var.S0(canvas, this);
        super.dispatchDraw(canvas);
        ny0Var.R0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            ny0 ny0Var = this.n0;
            if (y < ny0Var.s0.getBounds().top) {
                ny0Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // dl7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        ny0 ny0Var = this.n0;
        ny0Var.q1 = size;
        ny0Var.O0(i, i2);
        if (this.m0) {
            i2 = View.MeasureSpec.makeMeasureSpec(ny0Var.q1, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
