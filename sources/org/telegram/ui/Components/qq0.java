package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ ir0 c;

    public qq0(ir0 ir0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = ir0Var;
                this.b = new Rect();
                break;
            default:
                this.c = ir0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ir0 ir0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        ir0 ir0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (ir0Var = this.c).J0) != null && m1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ir0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (ir0Var2 = this.c).J0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ir0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
