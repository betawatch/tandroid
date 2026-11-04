package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jb extends b8.of {
    public org.telegram.messenger.zi a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ kb f;

    public jb(kb kbVar) {
        this.f = kbVar;
    }

    @Override // b8.of
    public final void a() {
        org.telegram.messenger.zi ziVar = this.a;
        kb kbVar = this.f;
        if (ziVar != null) {
            int indexOf = kbVar.p0.indexOf(ziVar) + kbVar.F.f;
            if (indexOf >= 0) {
                kbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            kbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        kbVar.W = true;
        kbVar.i1();
        org.telegram.messenger.g0.h3(new xp0(this, 21));
    }

    @Override // b8.of
    public final void c() {
        kb kbVar = this.f;
        kbVar.L0 = kbVar.getNotificationCenter().q(kb.S0, kbVar.L0, true);
    }

    @Override // b8.of
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
