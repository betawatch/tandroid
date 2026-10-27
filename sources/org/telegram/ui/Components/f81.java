package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f81 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ k6.c c;

    public f81(k6.c cVar, View view) {
        this.c = cVar;
        o1.j jVar = new o1.j(view, o1.h.n, 0.0f);
        cVar.c = jVar;
        jVar.u.a(1.0f);
        ((o1.j) cVar.c).u.b(350.0f);
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
        k6.c cVar = this.c;
        ((o1.j) cVar.c).c();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.j) cVar.c).u.i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.j) cVar.c).h();
    }
}
