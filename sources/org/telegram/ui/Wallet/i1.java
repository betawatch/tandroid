package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Utilities.Callback {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ci.d c;
    public final /* synthetic */ ci.d d;
    public final /* synthetic */ d2 e;
    public final /* synthetic */ h2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h;

    public /* synthetic */ i1(z1 z1Var, boolean[] zArr, ci.d dVar, ci.d dVar2, d2 d2Var, h2 h2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = z1Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = d2Var;
        this.f = h2Var;
        this.g = zArr2;
        this.h = e6Var;
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
            ci.d dVar = this.c;
            dVar.setEnabled(false);
            ci.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.e(z1Var, bool.booleanValue(), new o1(dVar, dVar2, this.f, this.g, this.h, z1Var, zArr));
        }
    }
}
