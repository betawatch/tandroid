package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lq0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ er0 c;

    public lq0(er0 er0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = er0Var;
                this.b = new Rect();
                break;
            default:
                this.c = er0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        er0 er0Var;
        org.telegram.ui.ActionBar.m1 m1Var;
        er0 er0Var2;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m1Var = (er0Var = this.c).K0) != null && m1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        er0Var.K0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = (er0Var2 = this.c).K0) != null && m1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        er0Var2.K0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
