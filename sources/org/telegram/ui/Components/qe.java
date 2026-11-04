package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qe implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.cs c;

    public qe(org.telegram.ui.hm0 hm0Var) {
        this.c = hm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        re reVar;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (reVar = chatActivityEnterView.O0) != null && reVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.hm0 hm0Var = (org.telegram.ui.hm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (f1Var = hm0Var.J) != null && f1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hm0Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = sm0Var.n0) != null && f1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sm0Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public qe(org.telegram.ui.sm0 sm0Var) {
        this.c = sm0Var;
    }

    public qe(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
