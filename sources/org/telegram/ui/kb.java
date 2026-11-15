package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kb extends c8.ma {
    public org.telegram.messenger.gj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ lb f;

    public kb(lb lbVar) {
        this.f = lbVar;
    }

    @Override // c8.ma
    public final void a() {
        org.telegram.messenger.gj gjVar = this.a;
        lb lbVar = this.f;
        if (gjVar != null) {
            int indexOf = lbVar.p0.indexOf(gjVar) + lbVar.F.f;
            if (indexOf >= 0) {
                lbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            lbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.h3(new fq0(this, 21));
    }

    @Override // c8.ma
    public final void c() {
        lb lbVar = this.f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override // c8.ma
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
