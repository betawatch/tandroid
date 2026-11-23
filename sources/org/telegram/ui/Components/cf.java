package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.fs c;

    public cf(org.telegram.ui.om0 om0Var) {
        this.c = om0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        df dfVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (dfVar = chatActivityEnterView.O0) != null && dfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.om0 om0Var = (org.telegram.ui.om0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = om0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        om0Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = an0Var.n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        an0Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public cf(org.telegram.ui.an0 an0Var) {
        this.c = an0Var;
    }

    public cf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
