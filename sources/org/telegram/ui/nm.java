package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nm extends c8.ra {
    public org.telegram.messenger.fj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ bn h;

    public nm(bn bnVar) {
        this.h = bnVar;
    }

    @Override // c8.ra
    public final void a() {
        org.telegram.messenger.fj fjVar = this.a;
        bn bnVar = this.h;
        if (fjVar != null) {
            bnVar.D0.T();
            int indexOf = bnVar.M6.indexOf(this.a) + bnVar.D0.K;
            if (indexOf >= 0) {
                bnVar.C0.i1(indexOf, (int) ((this.e + this.g) - bnVar.P9), this.f);
            }
        } else {
            bnVar.D0.T();
            bnVar.C0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        bnVar.B3 = true;
        bnVar.Gd(false);
        org.telegram.messenger.g0.g3(new ch(this, 9));
    }

    @Override // c8.ra
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.n) {
            zjVar.d();
        }
    }

    @Override // c8.ra
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            r1Var.setDelegate(null);
            r1Var.setResourcesProvider(null);
        }
    }
}
