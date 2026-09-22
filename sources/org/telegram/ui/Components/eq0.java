package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class eq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ wq0 c;

    public eq0(wq0 wq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = wq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = wq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wq0 wq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        wq0 wq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (wq0Var = this.c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (wq0Var2 = this.c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
