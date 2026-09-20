package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f71 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.Cells.f3 c;

    public f71(org.telegram.ui.Cells.f3 f3Var, View view) {
        this.c = f3Var;
        o1.k kVar = new o1.k(view, o1.h.n, 0.0f);
        f3Var.c = kVar;
        kVar.u.a(1.0f);
        ((o1.k) f3Var.c).u.b(350.0f);
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
        org.telegram.ui.Cells.f3 f3Var = this.c;
        ((o1.k) f3Var.c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.k) f3Var.c).u.i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.k) f3Var.c).f();
    }
}
