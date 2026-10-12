package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ jr0 c;

    public rq0(jr0 jr0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = jr0Var;
                this.b = new Rect();
                break;
            default:
                this.c = jr0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jr0 jr0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        jr0 jr0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (jr0Var = this.c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jr0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (jr0Var2 = this.c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jr0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
