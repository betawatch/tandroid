package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yo0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ op0 c;

    public yo0(op0 op0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = op0Var;
                this.b = new Rect();
                break;
            default:
                this.c = op0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        op0 op0Var;
        org.telegram.ui.ActionBar.k1 k1Var;
        op0 op0Var2;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (k1Var = (op0Var = this.c).B2) != null && k1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        op0Var.B2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = (op0Var2 = this.c).B2) != null && k1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        op0Var2.B2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
