package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements u10 {
    public final /* synthetic */ y1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ gi.d c;
    public final /* synthetic */ gi.d d;
    public final /* synthetic */ c2 e;
    public final /* synthetic */ x2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h;

    public /* synthetic */ e1(y1 y1Var, boolean[] zArr, gi.d dVar, gi.d dVar2, c2 c2Var, x2 x2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = y1Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = c2Var;
        this.f = x2Var;
        this.g = zArr2;
        this.h = e6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        y1 y1Var = this.a;
        if (y1Var.m || y1Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            gi.d dVar = this.c;
            dVar.setEnabled(false);
            gi.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.f(y1Var, bool.booleanValue(), new k1(dVar, dVar2, this.f, this.g, this.h, y1Var, zArr));
        }
    }
}
