package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class cq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ uq0 c;

    public cq0(uq0 uq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = uq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = uq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        uq0 uq0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        uq0 uq0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (uq0Var = this.c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        uq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (uq0Var2 = this.c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        uq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
