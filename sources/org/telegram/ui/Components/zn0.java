package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zn0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ po0 c;

    public zn0(po0 po0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = po0Var;
                this.b = new Rect();
                break;
            default:
                this.c = po0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        po0 po0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        po0 po0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (po0Var = this.c).F2) != null && g1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        po0Var.F2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (po0Var2 = this.c).F2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        po0Var2.F2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
