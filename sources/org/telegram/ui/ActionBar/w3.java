package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public w3(pm0 pm0Var, pm0 pm0Var2, pm0 pm0Var3) {
        this.a = 1;
        this.b = pm0Var;
        this.c = pm0Var2;
        this.d = pm0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i3, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
                k4 k4Var = (k4) this.d;
                i4 i4Var = k4Var.b;
                if (i4Var.f() && !rect.equals(rect2)) {
                    k4Var.h = true;
                    if (i4Var.f()) {
                        k4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((pm0) this.b).setProgress(org.telegram.ui.j5.k1);
                ((pm0) this.c).setProgress(org.telegram.ui.j5.l1);
                ((pm0) this.d).setProgress(org.telegram.ui.j5.m1);
                break;
        }
    }

    public w3(k4 k4Var) {
        this.a = 0;
        this.d = k4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
