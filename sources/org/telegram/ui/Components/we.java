package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class we implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public we(org.telegram.ui.jp0 jp0Var) {
        this.c = jp0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xe xeVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (xeVar = chatActivityEnterView.J0) != null && xeVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.J0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.jp0 jp0Var = (org.telegram.ui.jp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = jp0Var.E) != null && n1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jp0Var.E.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.aq0 aq0Var = (org.telegram.ui.aq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = aq0Var.i0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        aq0Var.i0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public we(org.telegram.ui.aq0 aq0Var) {
        this.c = aq0Var;
    }

    public we(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
