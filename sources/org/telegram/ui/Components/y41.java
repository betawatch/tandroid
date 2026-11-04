package org.telegram.ui.Components;

import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y41 implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ k4.j c;

    public y41(k4.j jVar, View view) {
        this.c = jVar;
        q1.g gVar = new q1.g((Object) view, (q1.e) q1.g.p, 0.0f);
        jVar.b = gVar;
        gVar.m.a(1.0f);
        ((q1.g) jVar.b).m.b(350.0f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Point point = org.telegram.messenger.g0.q;
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
        k4.j jVar = this.c;
        ((q1.g) jVar.b).d();
        if (view.getVisibility() != 0) {
            view.setTranslationY(0.0f);
            return;
        }
        ((q1.g) jVar.b).m.i = 0.0f;
        view.setTranslationY((i14 - i10) + 0.0f);
        ((q1.g) jVar.b).h();
    }
}
