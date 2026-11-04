package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yn0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ oo0 c;

    public yn0(oo0 oo0Var, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.c = oo0Var;
                this.b = new Rect();
                break;
            default:
                this.c = oo0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oo0 oo0Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        oo0 oo0Var2;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (f1Var = (oo0Var = this.c).C2) != null && f1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oo0Var.C2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = (oo0Var2 = this.c).C2) != null && f1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oo0Var2.C2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
