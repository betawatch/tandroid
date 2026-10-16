package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ di.d c;
    public final /* synthetic */ di.d d;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ i2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 h;

    public /* synthetic */ j1(a2 a2Var, boolean[] zArr, di.d dVar, di.d dVar2, e2 e2Var, i2 i2Var, boolean[] zArr2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = a2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f = i2Var;
        this.g = zArr2;
        this.h = c6Var;
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
            di.d dVar = this.c;
            dVar.setEnabled(false);
            di.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.e(a2Var, bool.booleanValue(), new p1(dVar, dVar2, this.f, this.g, this.h, a2Var, zArr));
        }
    }
}
