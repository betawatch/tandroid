package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ei.d c;
    public final /* synthetic */ ei.d d;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ i2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 h;

    public /* synthetic */ j1(a2 a2Var, boolean[] zArr, ei.d dVar, ei.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = a2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f = i2Var;
        this.g = zArr2;
        this.h = g6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.a;
        if (a2Var.m || a2Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            ei.d dVar = this.c;
            dVar.setEnabled(false);
            ei.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.e(a2Var, bool.booleanValue(), new p1(dVar, dVar2, this.f, this.g, this.h, a2Var, zArr));
        }
    }
}
