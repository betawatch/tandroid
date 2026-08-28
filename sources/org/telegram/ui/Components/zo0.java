package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zo0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ rp0 c;

    public zo0(rp0 rp0Var, int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.c = rp0Var;
                this.b = new Rect();
                break;
            default:
                this.c = rp0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rp0 rp0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        rp0 rp0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (rp0Var = this.c).F0) != null && o1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var.F0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (rp0Var2 = this.c).F0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var2.F0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
