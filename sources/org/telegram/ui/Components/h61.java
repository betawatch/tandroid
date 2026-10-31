package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h61 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ li.k c;

    public h61(li.k kVar, View view) {
        this.c = kVar;
        o1.j jVar = new o1.j((Object) view, (o1.h) o1.j.p, 0.0f);
        kVar.c = jVar;
        jVar.m.a(1.0f);
        ((o1.j) kVar.c).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Point point = org.telegram.messenger.i0.q;
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
        li.k kVar = this.c;
        ((o1.j) kVar.c).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((o1.j) kVar.c).m.i = 0.0f;
        view.setTranslationY((i15 - i11) + 0.0f);
        ((o1.j) kVar.c).h();
    }
}
