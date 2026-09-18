package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qp0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ iq0 c;

    public qp0(iq0 iq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = iq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = iq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        iq0 iq0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        iq0 iq0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (iq0Var = this.c).J0) != null && o1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        iq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (iq0Var2 = this.c).J0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        iq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
