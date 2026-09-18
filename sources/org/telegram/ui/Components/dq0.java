package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class dq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ vq0 c;

    public dq0(vq0 vq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = vq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = vq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vq0 vq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        vq0 vq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (vq0Var = this.c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (vq0Var2 = this.c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
