package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ ei.d c;
    public final /* synthetic */ i2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ a2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p1(ei.d dVar, ei.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.g6 g6Var, h hVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = e2Var;
        this.f = a2Var;
        this.d = i2Var;
        this.e = g6Var;
        this.h = hVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.g;
                h hVar = (h) this.h;
                Boolean bool = (Boolean) obj;
                ei.d dVar = this.b;
                dVar.setEnabled(false);
                ei.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.g6 g6Var = this.e;
                a2 a2Var = this.f;
                e2Var.e(a2Var, booleanValue, new r80(dVar, dVar2, i2Var, g6Var, hVar, a2Var, 4));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                ei.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                ei.d dVar4 = this.c;
                dVar4.setLoading(false);
                i2 i2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        xc.c0(str, i2Var2.topBulletinContainer, this.e);
                        a2 a2Var2 = this.f;
                        dVar3.setEnabled(!a2Var2.n && zArr2[0]);
                        if (!a2Var2.n && !a2Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        xc.b0(str);
                        break;
                    }
                } else {
                    i2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p1(ei.d dVar, ei.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.g6 g6Var, a2 a2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = i2Var;
        this.g = zArr;
        this.e = g6Var;
        this.f = a2Var;
        this.h = zArr2;
    }
}
