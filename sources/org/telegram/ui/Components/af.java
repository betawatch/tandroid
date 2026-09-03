package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class af implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public af(org.telegram.ui.wp0 wp0Var) {
        this.c = wp0Var;
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
                org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var = wp0Var.F) != null && p1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wp0Var.F.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = mq0Var.j0) != null && p1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.j0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public af(org.telegram.ui.mq0 mq0Var) {
        this.c = mq0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
