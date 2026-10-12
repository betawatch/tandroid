package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.j90;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ di.d c;
    public final /* synthetic */ h2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ z1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ o1(di.d dVar, di.d dVar2, d2 d2Var, z1 z1Var, h2 h2Var, org.telegram.ui.ActionBar.c6 c6Var, k kVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = d2Var;
        this.f = z1Var;
        this.d = h2Var;
        this.e = c6Var;
        this.h = kVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.g;
                k kVar = (k) this.h;
                Boolean bool = (Boolean) obj;
                di.d dVar = this.b;
                dVar.setEnabled(false);
                di.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                h2 h2Var = this.d;
                org.telegram.ui.ActionBar.c6 c6Var = this.e;
                z1 z1Var = this.f;
                d2Var.e(z1Var, booleanValue, new j90(dVar, dVar2, h2Var, c6Var, kVar, z1Var, 4));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                di.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                di.d dVar4 = this.c;
                dVar4.setLoading(false);
                h2 h2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        zc.c0(str, h2Var2.topBulletinContainer, this.e);
                        z1 z1Var2 = this.f;
                        dVar3.setEnabled(!z1Var2.n && zArr2[0]);
                        if (!z1Var2.n && !z1Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        zc.b0(str);
                        break;
                    }
                } else {
                    h2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o1(di.d dVar, di.d dVar2, h2 h2Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var, z1 z1Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = h2Var;
        this.g = zArr;
        this.e = c6Var;
        this.f = z1Var;
        this.h = zArr2;
    }
}
