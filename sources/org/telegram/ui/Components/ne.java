package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ne implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.vs c;

    public ne(org.telegram.ui.wn0 wn0Var) {
        this.c = wn0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oe oeVar;
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (oeVar = chatActivityEnterView.N0) != null && oeVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.wn0 wn0Var = (org.telegram.ui.wn0) this.c;
                if (motionEvent.getActionMasked() == 0 && (k1Var = wn0Var.I) != null && k1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wn0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.jo0 jo0Var = (org.telegram.ui.jo0) this.c;
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = jo0Var.m0) != null && k1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        jo0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public ne(org.telegram.ui.jo0 jo0Var) {
        this.c = jo0Var;
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
