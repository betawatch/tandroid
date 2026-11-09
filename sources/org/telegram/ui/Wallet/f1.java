package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements c20 {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ fi.d d;
    public final /* synthetic */ d2 e;
    public final /* synthetic */ x2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 h;

    public /* synthetic */ f1(z1 z1Var, boolean[] zArr, fi.d dVar, fi.d dVar2, d2 d2Var, x2 x2Var, boolean[] zArr2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = z1Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = d2Var;
        this.f = x2Var;
        this.g = zArr2;
        this.h = g6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        z1 z1Var = this.a;
        if (z1Var.m || z1Var.n) {
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
            this.e.f(z1Var, bool.booleanValue(), new l1(dVar, dVar2, this.f, this.g, this.h, z1Var, zArr));
        }
    }
}
