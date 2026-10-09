package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.e90;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ci.d b;
    public final /* synthetic */ ci.d c;
    public final /* synthetic */ h2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ z1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o1(ci.d dVar, ci.d dVar2, d2 d2Var, z1 z1Var, h2 h2Var, org.telegram.ui.ActionBar.e6 e6Var, k kVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = d2Var;
        this.f = z1Var;
        this.d = h2Var;
        this.e = e6Var;
        this.h = kVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.g;
                k kVar = (k) this.h;
                Boolean bool = (Boolean) obj;
                ci.d dVar = this.b;
                dVar.setEnabled(false);
                ci.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                h2 h2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.e;
                z1 z1Var = this.f;
                d2Var.e(z1Var, booleanValue, new e90(dVar, dVar2, h2Var, e6Var, kVar, z1Var, 4));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ci.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                ci.d dVar4 = this.c;
                dVar4.setLoading(false);
                h2 h2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        ad.c0(str, h2Var2.topBulletinContainer, this.e);
                        z1 z1Var2 = this.f;
                        dVar3.setEnabled(!z1Var2.n && zArr2[0]);
                        if (!z1Var2.n && !z1Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        ad.b0(str);
                        break;
                    }
                } else {
                    h2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o1(ci.d dVar, ci.d dVar2, h2 h2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, z1 z1Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = h2Var;
        this.g = zArr;
        this.e = e6Var;
        this.f = z1Var;
        this.h = zArr2;
    }
}
