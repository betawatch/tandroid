package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements c20 {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ fi.d d;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ y2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 h;

    public /* synthetic */ g1(a2 a2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, e2 e2Var, y2 y2Var, boolean[] zArr2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = a2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f = y2Var;
        this.g = zArr2;
        this.h = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.a;
        if (a2Var.m || a2Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            fi.d dVar = this.c;
            dVar.setEnabled(false);
            fi.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.f(a2Var, bool.booleanValue(), new m1(dVar, dVar2, this.f, this.g, this.h, a2Var, zArr));
        }
    }
}
