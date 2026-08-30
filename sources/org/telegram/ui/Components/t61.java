package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t61 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ n7.qa c;

    public t61(n7.qa qaVar, View view) {
        this.c = qaVar;
        o1.j jVar = new o1.j(view, o1.h.n, 0.0f);
        qaVar.c = jVar;
        jVar.u.a(1.0f);
        ((o1.j) qaVar.c).u.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Point point = AndroidUtilities.displaySize;
        boolean z4 = point.x > point.y;
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z4) {
            this.a = Boolean.valueOf(z4);
            this.b = true;
        }
        if (i15 == 0 || i15 == i11 || this.b) {
            this.b = false;
            return;
        }
        n7.qa qaVar = this.c;
        ((o1.j) qaVar.c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.j) qaVar.c).u.i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.j) qaVar.c).f();
    }
}
