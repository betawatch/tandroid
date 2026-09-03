package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tp0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ lq0 c;

    public tp0(lq0 lq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = lq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = lq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lq0 lq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        lq0 lq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (lq0Var = this.c).G0) != null && p1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.G0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (lq0Var2 = this.c).G0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var2.G0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
