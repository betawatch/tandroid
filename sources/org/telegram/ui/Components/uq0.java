package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ mr0 c;

    public uq0(mr0 mr0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = mr0Var;
                this.b = new Rect();
                break;
            default:
                this.c = mr0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mr0 mr0Var;
        org.telegram.ui.ActionBar.o1 o1Var;
        mr0 mr0Var2;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (o1Var = (mr0Var = this.c).K0) != null && o1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var.K0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = (mr0Var2 = this.c).K0) != null && o1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mr0Var2.K0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
