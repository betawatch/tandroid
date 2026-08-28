package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float P;
    public float Q;
    public final org.telegram.ui.Components.pc R;
    public boolean S;

    public e6(g6 g6Var, Context context) {
        super(context, g6Var.C1);
        this.R = new org.telegram.ui.Components.pc(this);
        this.S = true;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.R.a(0.05f);
        if (a2 < 1.0f) {
            canvas.save();
            canvas.scale(a2, a2, this.P, this.Q);
        }
        super.dispatchDraw(canvas);
        if (a2 < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.R;
        if (action == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            pcVar.c(this.S);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            pcVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
