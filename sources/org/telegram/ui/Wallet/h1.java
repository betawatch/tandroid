package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements c20 {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ fi.d d;
    public final /* synthetic */ f2 e;
    public final /* synthetic */ z2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 h;

    public /* synthetic */ h1(b2 b2Var, boolean[] zArr, fi.d dVar, fi.d dVar2, f2 f2Var, z2 z2Var, boolean[] zArr2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = b2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = f2Var;
        this.f = z2Var;
        this.g = zArr2;
        this.h = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.a;
        if (b2Var.m || b2Var.n) {
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
            this.e.f(b2Var, bool.booleanValue(), new n1(dVar, dVar2, this.f, this.g, this.h, b2Var, zArr));
        }
    }
}
