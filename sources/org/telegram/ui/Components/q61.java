package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q61 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ n7.a1 c;

    public q61(n7.a1 a1Var, View view) {
        this.c = a1Var;
        o1.k kVar = new o1.k(view, o1.h.n, 0.0f);
        a1Var.c = kVar;
        kVar.u.a(1.0f);
        ((o1.k) a1Var.c).u.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.x > point.y;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z10) {
            this.a = Boolean.valueOf(z10);
            this.b = true;
        }
        if (i15 == 0 || i15 == i11 || this.b) {
            this.b = false;
            return;
        }
        n7.a1 a1Var = this.c;
        ((o1.k) a1Var.c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.k) a1Var.c).u.i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.k) a1Var.c).f();
    }
}
