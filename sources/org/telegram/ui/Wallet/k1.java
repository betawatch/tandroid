package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.n60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gi.d b;
    public final /* synthetic */ gi.d c;
    public final /* synthetic */ x2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ y1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k1(gi.d dVar, gi.d dVar2, c2 c2Var, y1 y1Var, x2 x2Var, org.telegram.ui.ActionBar.e6 e6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = c2Var;
        this.f = y1Var;
        this.d = x2Var;
        this.e = e6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                c2 c2Var = (c2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                gi.d dVar = this.b;
                dVar.setEnabled(false);
                gi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                x2 x2Var = this.d;
                org.telegram.ui.ActionBar.e6 e6Var = this.e;
                y1 y1Var = this.f;
                c2Var.f(y1Var, booleanValue, new n60(dVar, dVar2, x2Var, e6Var, gVar, y1Var, 3));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                gi.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                gi.d dVar4 = this.c;
                dVar4.setLoading(false);
                x2 x2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        fc.c0(str, x2Var2.F, this.e);
                        y1 y1Var2 = this.f;
                        dVar3.setEnabled(!y1Var2.n && zArr2[0]);
                        if (!y1Var2.n && !y1Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        fc.b0(str);
                        break;
                    }
                } else {
                    x2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k1(gi.d dVar, gi.d dVar2, x2 x2Var, boolean[] zArr, org.telegram.ui.ActionBar.e6 e6Var, y1 y1Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = x2Var;
        this.g = zArr;
        this.e = e6Var;
        this.f = y1Var;
        this.h = zArr2;
    }
}
