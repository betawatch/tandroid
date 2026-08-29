package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kp0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ dq0 c;

    public kp0(dq0 dq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = dq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = dq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dq0 dq0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        dq0 dq0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (dq0Var = this.c).F0) != null && o1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dq0Var.F0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (dq0Var2 = this.c).F0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dq0Var2.F0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
