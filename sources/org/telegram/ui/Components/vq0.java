package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ nr0 c;

    public vq0(nr0 nr0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = nr0Var;
                this.b = new Rect();
                break;
            default:
                this.c = nr0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nr0 nr0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        nr0 nr0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (nr0Var = this.c).K0) != null && o1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var.K0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (nr0Var2 = this.c).K0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nr0Var2.K0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
