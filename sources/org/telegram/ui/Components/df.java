package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class df implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public df(org.telegram.ui.hp0 hp0Var) {
        this.c = hp0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ef efVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (efVar = chatActivityEnterView.J0) != null && efVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.hp0 hp0Var = (org.telegram.ui.hp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = hp0Var.E) != null && o1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hp0Var.E.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = zp0Var.i0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zp0Var.i0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public df(org.telegram.ui.zp0 zp0Var) {
        this.c = zp0Var;
    }

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
