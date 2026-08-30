package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class af implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public af(org.telegram.ui.pp0 pp0Var) {
        this.c = pp0Var;
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
                org.telegram.ui.pp0 pp0Var = (org.telegram.ui.pp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = pp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pp0Var.F.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = fq0Var.j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        fq0Var.j0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public af(org.telegram.ui.fq0 fq0Var) {
        this.c = fq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
