package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v51 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.Cells.e3 c;

    public v51(org.telegram.ui.Cells.e3 e3Var, View view) {
        this.c = e3Var;
        o1.j jVar = new o1.j(view, o1.h.n, 0.0f);
        e3Var.c = jVar;
        jVar.u.a(1.0f);
        ((o1.j) e3Var.c).u.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x > point.y;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z10) {
            this.a = Boolean.valueOf(z10);
            this.b = true;
        }
        if (i14 == 0 || i14 == i10 || this.b) {
            this.b = false;
            return;
        }
        org.telegram.ui.Cells.e3 e3Var = this.c;
        ((o1.j) e3Var.c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.j) e3Var.c).u.i = 0.0f;
        view.setTranslationY((i14 - i10) + 0.0f);
        ((o1.j) e3Var.c).f();
    }
}
