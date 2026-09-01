package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class up0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ mq0 c;

    public up0(mq0 mq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = mq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = mq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mq0 mq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        mq0 mq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (mq0Var = this.c).G0) != null && p1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.G0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (mq0Var2 = this.c).G0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var2.G0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
