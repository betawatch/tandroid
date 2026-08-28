package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class af implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public af(org.telegram.ui.ip0 ip0Var) {
        this.c = ip0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bf bfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (bfVar = chatActivityEnterView.J0) != null && bfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) this.c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = ip0Var.E) != null && o1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ip0Var.E.d(true);
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

    public af(org.telegram.ui.zp0 zp0Var) {
        this.c = zp0Var;
    }

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
