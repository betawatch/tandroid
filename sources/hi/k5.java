package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k5 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float U;
    public float V;
    public final dc W;
    public boolean a0;

    public k5(m5 m5Var, Context context) {
        super(context, m5Var.q1);
        this.W = new dc(this);
        this.a0 = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.W.a(0.05f);
        if (a10 < 1.0f) {
            canvas.save();
            canvas.scale(a10, a10, this.U, this.V);
        }
        super.dispatchDraw(canvas);
        if (a10 < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        dc dcVar = this.W;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            dcVar.c(this.a0);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
