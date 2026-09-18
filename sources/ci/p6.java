package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class p6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float T;
    public float U;
    public final org.telegram.ui.Components.wc V;
    public boolean W;

    public p6(r6 r6Var, Context context) {
        super(context, r6Var.G1);
        this.V = new org.telegram.ui.Components.wc(this);
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
        org.telegram.ui.Components.wc wcVar = this.V;
        if (action == 0) {
            this.T = motionEvent.getX();
            this.U = motionEvent.getY();
            wcVar.c(this.W);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            wcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
