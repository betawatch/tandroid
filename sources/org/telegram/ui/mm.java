package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class mm extends c8.ja {
    public org.telegram.messenger.ij a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ an h;

    public mm(an anVar) {
        this.h = anVar;
    }

    @Override // c8.ja
    public final void a() {
        org.telegram.messenger.ij ijVar = this.a;
        an anVar = this.h;
        if (ijVar != null) {
            anVar.C0.T();
            int indexOf = anVar.K6.indexOf(this.a) + anVar.C0.J;
            if (indexOf >= 0) {
                anVar.B0.i1(indexOf, (int) ((this.e + this.g) - anVar.L9), this.f);
            }
        } else {
            anVar.C0.T();
            anVar.B0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        anVar.A3 = true;
        anVar.Cd(false);
        org.telegram.messenger.g0.h3(new bh(this, 9));
    }

    @Override // c8.ja
    public final void c() {
        an anVar = this.h;
        anVar.ba = anVar.getNotificationCenter().q(an.od, anVar.ba, true);
        yj yjVar = anVar.Pa;
        if (yjVar.n) {
            yjVar.d();
        }
    }

    @Override // c8.ja
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
