package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.gs c;

    public bf(org.telegram.ui.qm0 qm0Var) {
        this.c = qm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cf cfVar;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (motionEvent.getActionMasked() == 0 && (cfVar = chatActivityEnterView.O0) != null && cfVar.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var = qm0Var.J) != null && g1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        qm0Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.cn0 cn0Var = (org.telegram.ui.cn0) this.c;
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = cn0Var.n0) != null && g1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        cn0Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public bf(org.telegram.ui.cn0 cn0Var) {
        this.c = cn0Var;
    }

    public bf(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
