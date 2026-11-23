package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class nm extends c8.oa {
    public org.telegram.messenger.gj a;
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

    @Override // c8.oa
    public final void a() {
        org.telegram.messenger.gj gjVar = this.a;
        bn bnVar = this.h;
        if (gjVar != null) {
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
        org.telegram.messenger.g0.g3(new bh(this, 9));
    }

    @Override // c8.oa
    public final void c() {
        bn bnVar = this.h;
        bnVar.fa = bnVar.getNotificationCenter().q(bn.sd, bnVar.fa, true);
        zj zjVar = bnVar.Ta;
        if (zjVar.n) {
            zjVar.d();
        }
    }

    @Override // c8.oa
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            r1Var.setDelegate(null);
            r1Var.setResourcesProvider(null);
        }
    }
}
