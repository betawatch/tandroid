package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements x10 {
    public final /* synthetic */ h2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ hi.d d;
    public final /* synthetic */ l2 e;
    public final /* synthetic */ d3 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 h;

    public /* synthetic */ o1(h2 h2Var, boolean[] zArr, hi.d dVar, hi.d dVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = h2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = l2Var;
        this.f = d3Var;
        this.g = zArr2;
        this.h = i6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        h2 h2Var = this.a;
        if (h2Var.m || h2Var.n) {
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
            this.e.f(h2Var, bool.booleanValue(), new u1(dVar, dVar2, this.f, this.g, this.h, h2Var, zArr));
        }
    }
}
