package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class jq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ br0 c;

    public jq0(br0 br0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = br0Var;
                this.b = new Rect();
                break;
            default:
                this.c = br0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        br0 br0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        br0 br0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (br0Var = this.c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        br0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (br0Var2 = this.c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        br0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
