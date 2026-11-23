package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jo0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ zo0 c;

    public jo0(zo0 zo0Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = zo0Var;
                this.b = new Rect();
                break;
            default:
                this.c = zo0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zo0 zo0Var;
        org.telegram.ui.ActionBar.g1 g1Var;
        zo0 zo0Var2;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (g1Var = (zo0Var = this.c).F2) != null && g1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zo0Var.F2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = (zo0Var2 = this.c).F2) != null && g1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        zo0Var2.F2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
