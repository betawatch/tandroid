package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wn0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ mo0 c;

    public wn0(mo0 mo0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = mo0Var;
                this.b = new Rect();
                break;
            default:
                this.c = mo0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mo0 mo0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        mo0 mo0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (mo0Var = this.c).B2) != null && g1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var.B2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (mo0Var2 = this.c).B2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mo0Var2.B2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
