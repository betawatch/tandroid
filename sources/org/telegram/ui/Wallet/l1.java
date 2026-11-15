package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.cc;
import org.telegram.ui.r60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ w2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ z1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l1(hi.d dVar, hi.d dVar2, d2 d2Var, z1 z1Var, w2 w2Var, org.telegram.ui.ActionBar.e6 e6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = d2Var;
        this.f = z1Var;
        this.d = w2Var;
        this.e = e6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                hi.d dVar = this.b;
                dVar.setEnabled(false);
                hi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                w2 w2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.e;
                z1 z1Var = this.f;
                d2Var.f(z1Var, booleanValue, new r60(dVar, dVar2, w2Var, e6Var, gVar, z1Var, 3));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                hi.d dVar4 = this.c;
                dVar4.setLoading(false);
                w2 w2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        cc.c0(str, w2Var2.F, this.e);
                        z1 z1Var2 = this.f;
                        dVar3.setEnabled(!z1Var2.n && zArr2[0]);
                        if (!z1Var2.n && !z1Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        cc.b0(str);
                        break;
                    }
                } else {
                    w2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l1(hi.d dVar, hi.d dVar2, w2 w2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, z1 z1Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = w2Var;
        this.g = zArr;
        this.e = e6Var;
        this.f = z1Var;
        this.h = zArr2;
    }
}
