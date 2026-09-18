package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public hf(org.telegram.ui.lq0 lq0Var) {
        this.c = lq0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jf jfVar;
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (jfVar = chatActivityEnterView.N0) != null && jfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.lq0 lq0Var = (org.telegram.ui.lq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (o1Var = lq0Var.I) != null && o1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lq0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.cr0 cr0Var = (org.telegram.ui.cr0) this.c;
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = cr0Var.m0) != null && o1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cr0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public hf(org.telegram.ui.cr0 cr0Var) {
        this.c = cr0Var;
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
