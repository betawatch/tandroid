package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ko0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ ap0 c;

    public ko0(ap0 ap0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = ap0Var;
                this.b = new Rect();
                break;
            default:
                this.c = ap0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ap0 ap0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        ap0 ap0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (ap0Var = this.c).F2) != null && g1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ap0Var.F2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (ap0Var2 = this.c).F2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ap0Var2.F2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
