package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zp0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Rect b;
    public final /* synthetic */ sq0 c;

    public zp0(sq0 sq0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = sq0Var;
                this.b = new Rect();
                break;
            default:
                this.c = sq0Var;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sq0 sq0Var;
        org.telegram.ui.ActionBar.p1 p1Var;
        sq0 sq0Var2;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.a) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (p1Var = (sq0Var = this.c).J0) != null && p1Var.isShowing()) {
                    Rect rect = this.b;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sq0Var.J0.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = (sq0Var2 = this.c).J0) != null && p1Var2.isShowing()) {
                    Rect rect2 = this.b;
                    view.getHitRect(rect2);
                    if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        sq0Var2.J0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
