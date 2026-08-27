package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zo0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ sp0 c;

    public zo0(sp0 sp0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = sp0Var;
                this.b = new Rect();
                break;
            default:
                this.c = sp0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sp0 sp0Var;
        org.telegram.ui.ActionBar.n1 n1Var;
        sp0 sp0Var2;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n1Var = (sp0Var = this.c).F0) != null && n1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sp0Var.F0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = (sp0Var2 = this.c).F0) != null && n1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sp0Var2.F0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
