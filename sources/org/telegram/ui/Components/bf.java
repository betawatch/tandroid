package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bf implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.fs c;

    public bf(org.telegram.ui.qm0 qm0Var) {
        this.c = qm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        cf cfVar;
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
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
                if (motionEvent.getActionMasked() == 0 && (h1Var = qm0Var.J) != null && h1Var.isShowing()) {
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
                if (motionEvent.getActionMasked() == 0 && (h1Var2 = cn0Var.n0) != null && h1Var2.isShowing()) {
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
