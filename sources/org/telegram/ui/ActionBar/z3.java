package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.an0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public z3(an0 an0Var, an0 an0Var2, an0 an0Var3) {
        this.a = 1;
        this.b = an0Var;
        this.c = an0Var2;
        this.d = an0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i7, i10, i11, i12);
                Rect rect2 = (Rect) this.c;
                rect2.set(i13, i14, i15, i16);
                l4 l4Var = (l4) this.d;
                j4 j4Var = l4Var.b;
                if (j4Var.f() && !rect.equals(rect2)) {
                    l4Var.h = true;
                    if (j4Var.f()) {
                        l4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((an0) this.b).setProgress(org.telegram.ui.h5.n1);
                ((an0) this.c).setProgress(org.telegram.ui.h5.o1);
                ((an0) this.d).setProgress(org.telegram.ui.h5.p1);
                break;
        }
    }

    public z3(l4 l4Var) {
        this.a = 0;
        this.d = l4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
