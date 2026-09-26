package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class lf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public lf(org.telegram.ui.cq0 cq0Var) {
        this.c = cq0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        mf mfVar;
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (mfVar = chatActivityEnterView.N0) != null && mfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (m1Var = cq0Var.I) != null && m1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cq0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.tq0 tq0Var = (org.telegram.ui.tq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = tq0Var.m0) != null && m1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tq0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public lf(org.telegram.ui.tq0 tq0Var) {
        this.c = tq0Var;
    }

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
