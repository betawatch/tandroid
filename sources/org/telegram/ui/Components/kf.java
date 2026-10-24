package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public kf(org.telegram.ui.vp0 vp0Var) {
        this.c = vp0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        lf lfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (lfVar = chatActivityEnterView.N0) != null && lfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.vp0 vp0Var = (org.telegram.ui.vp0) this.c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = vp0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        vp0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = mq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        mq0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public kf(org.telegram.ui.mq0 mq0Var) {
        this.c = mq0Var;
    }

    public kf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
