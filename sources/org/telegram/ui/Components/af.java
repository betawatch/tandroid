package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class af implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public af(org.telegram.ui.rp0 rp0Var) {
        this.c = rp0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.K0) != null && bfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.K0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.rp0 rp0Var = (org.telegram.ui.rp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = rp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        rp0Var.F.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = hq0Var.j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hq0Var.j0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public af(org.telegram.ui.hq0 hq0Var) {
        this.c = hq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
