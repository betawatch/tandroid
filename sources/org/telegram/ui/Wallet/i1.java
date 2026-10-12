package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Utilities.Callback {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ di.d c;
    public final /* synthetic */ di.d d;
    public final /* synthetic */ d2 e;
    public final /* synthetic */ h2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 h;

    public /* synthetic */ i1(z1 z1Var, boolean[] zArr, di.d dVar, di.d dVar2, d2 d2Var, h2 h2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = z1Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = d2Var;
        this.f = h2Var;
        this.g = zArr2;
        this.h = c6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.a;
        if (z1Var.m || z1Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            di.d dVar = this.c;
            dVar.setEnabled(false);
            di.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.e(z1Var, bool.booleanValue(), new o1(dVar, dVar2, this.f, this.g, this.h, z1Var, zArr));
        }
    }
}
