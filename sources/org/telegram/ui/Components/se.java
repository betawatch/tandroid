package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class se implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.ls c;

    public se(org.telegram.ui.om0 om0Var) {
        this.c = om0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        te teVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (teVar = chatActivityEnterView.N0) != null && teVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.N0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.om0 om0Var = (org.telegram.ui.om0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = om0Var.I) != null && g1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        om0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.zm0 zm0Var = (org.telegram.ui.zm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = zm0Var.m0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zm0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public se(org.telegram.ui.zm0 zm0Var) {
        this.c = zm0Var;
    }

    public se(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
