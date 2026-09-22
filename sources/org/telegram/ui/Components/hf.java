package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public hf(org.telegram.ui.jq0 jq0Var) {
        this.c = jq0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        jf jfVar;
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
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
                org.telegram.ui.jq0 jq0Var = (org.telegram.ui.jq0) this.c;
                if (motionEvent.getActionMasked() == 0 && (n1Var = jq0Var.I) != null && n1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jq0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ar0 ar0Var = (org.telegram.ui.ar0) this.c;
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = ar0Var.m0) != null && n1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ar0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public hf(org.telegram.ui.ar0 ar0Var) {
        this.c = ar0Var;
    }

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
