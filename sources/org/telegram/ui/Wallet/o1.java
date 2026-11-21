package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements x10 {
    public final /* synthetic */ h2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.e c;
    public final /* synthetic */ hi.e d;
    public final /* synthetic */ l2 e;
    public final /* synthetic */ d3 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 h;

    public /* synthetic */ o1(h2 h2Var, boolean[] zArr, hi.e eVar, hi.e eVar2, l2 l2Var, d3 d3Var, boolean[] zArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = h2Var;
        this.b = zArr;
        this.c = eVar;
        this.d = eVar2;
        this.e = l2Var;
        this.f = d3Var;
        this.g = zArr2;
        this.h = h6Var;
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
            hi.e eVar = this.c;
            eVar.setEnabled(false);
            hi.e eVar2 = this.d;
            eVar2.setEnabled(false);
            (bool.booleanValue() ? eVar2 : eVar).setLoading(true);
            this.e.f(h2Var, bool.booleanValue(), new u1(eVar, eVar2, this.f, this.g, this.h, h2Var, zArr));
        }
    }
}
