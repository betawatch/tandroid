package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Utilities.Callback {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ei.d c;
    public final /* synthetic */ ei.d d;
    public final /* synthetic */ f2 e;
    public final /* synthetic */ j2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 h;

    public /* synthetic */ k1(b2 b2Var, boolean[] zArr, ei.d dVar, ei.d dVar2, f2 f2Var, j2 j2Var, boolean[] zArr2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = b2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = f2Var;
        this.f = j2Var;
        this.g = zArr2;
        this.h = d6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        b2 b2Var = this.a;
        if (b2Var.m || b2Var.n) {
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
            this.e.e(b2Var, bool.booleanValue(), new q1(dVar, dVar2, this.f, this.g, this.h, b2Var, zArr));
        }
    }
}
