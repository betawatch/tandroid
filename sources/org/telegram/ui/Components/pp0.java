package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pp0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ hq0 c;

    public pp0(hq0 hq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = hq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = hq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        hq0 hq0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        hq0 hq0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (hq0Var = this.c).J0) != null && n1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (hq0Var2 = this.c).J0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
