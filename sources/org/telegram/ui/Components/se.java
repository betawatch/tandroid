package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class se implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.is c;

    public se(org.telegram.ui.nm0 nm0Var) {
        this.c = nm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        te teVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (teVar = chatActivityEnterView.O0) != null && teVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.nm0 nm0Var = (org.telegram.ui.nm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = nm0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        nm0Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ym0 ym0Var = (org.telegram.ui.ym0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = ym0Var.n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ym0Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public se(org.telegram.ui.ym0 ym0Var) {
        this.c = ym0Var;
    }

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
