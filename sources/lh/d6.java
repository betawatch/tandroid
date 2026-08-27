package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d6 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public float P;
    public float Q;
    public final org.telegram.ui.Components.nc R;
    public boolean S;

    public d6(f6 f6Var, Context context) {
        super(context, f6Var.C1);
        this.R = new org.telegram.ui.Components.nc(this);
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
        org.telegram.ui.Components.nc ncVar = this.R;
        if (action == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            ncVar.c(this.S);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ncVar.c(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
