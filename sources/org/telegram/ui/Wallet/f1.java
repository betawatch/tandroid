package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements z10 {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ hi.d d;
    public final /* synthetic */ d2 e;
    public final /* synthetic */ w2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h;

    public /* synthetic */ f1(z1 z1Var, boolean[] zArr, hi.d dVar, hi.d dVar2, d2 d2Var, w2 w2Var, boolean[] zArr2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = z1Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = d2Var;
        this.f = w2Var;
        this.g = zArr2;
        this.h = e6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.a;
        if (z1Var.m || z1Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            hi.d dVar = this.c;
            dVar.setEnabled(false);
            hi.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.f(z1Var, bool.booleanValue(), new l1(dVar, dVar2, this.f, this.g, this.h, z1Var, zArr));
        }
    }
}
