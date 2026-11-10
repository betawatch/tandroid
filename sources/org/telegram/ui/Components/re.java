package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class re implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.ls c;

    public re(org.telegram.ui.pm0 pm0Var) {
        this.c = pm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        se seVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (seVar = chatActivityEnterView.N0) != null && seVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.pm0 pm0Var = (org.telegram.ui.pm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = pm0Var.I) != null && g1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        pm0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = an0Var.m0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        an0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public re(org.telegram.ui.an0 an0Var) {
        this.c = an0Var;
    }

    public re(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
