package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ne implements View.OnTouchListener {
    public final /* synthetic */ int a = 0;
    public final Rect b = new Rect();
    public final /* synthetic */ org.telegram.messenger.us c;

    public ne(org.telegram.ui.yn0 yn0Var) {
        this.c = yn0Var;
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
                org.telegram.ui.yn0 yn0Var = (org.telegram.ui.yn0) this.c;
                if (motionEvent.getActionMasked() == 0 && (k1Var = yn0Var.I) != null && k1Var.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        yn0Var.I.d(true);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.c;
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = lo0Var.m0) != null && k1Var2.isShowing()) {
                    Rect rect3 = this.b;
                    view.getHitRect(rect3);
                    if (!rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        lo0Var.m0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public ne(org.telegram.ui.lo0 lo0Var) {
        this.c = lo0Var;
    }

    public ne(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
