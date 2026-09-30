package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class o6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final org.telegram.ui.Components.zc V;
    public boolean W;

    public o6(q6 q6Var, Context context) {
        super(context, q6Var.G1);
        this.V = new org.telegram.ui.Components.zc(this);
        this.W = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.V.a(0.05f);
        if (a2 < 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, this.T, this.U);
        }
        super.dispatchDraw(canvas);
        if (a2 < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Components.zc zcVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            zcVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
