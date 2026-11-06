package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ z2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ b2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ n1(fi.d dVar, fi.d dVar2, f2 f2Var, b2 b2Var, z2 z2Var, org.telegram.ui.ActionBar.f6 f6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = f2Var;
        this.f = b2Var;
        this.d = z2Var;
        this.e = f6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar = this.b;
                dVar.setEnabled(false);
                fi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                z2 z2Var = this.d;
                org.telegram.ui.ActionBar.f6 f6Var = this.e;
                b2 b2Var = this.f;
                f2Var.f(b2Var, booleanValue, new t60(dVar, dVar2, z2Var, f6Var, gVar, b2Var, 3));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                fi.d dVar3 = this.b;
                boolean z9 = false;
                dVar3.setLoading(false);
                fi.d dVar4 = this.c;
                dVar4.setLoading(false);
                z2 z2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        hc.c0(str, z2Var2.E, this.e);
                        b2 b2Var2 = this.f;
                        dVar3.setEnabled(!b2Var2.n && zArr2[0]);
                        if (!b2Var2.n && !b2Var2.o) {
                            z9 = true;
                        }
                        dVar4.setEnabled(z9);
                        break;
                    } else {
                        hc.b0(str);
                        break;
                    }
                } else {
                    z2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n1(fi.d dVar, fi.d dVar2, z2 z2Var, boolean[] zArr, org.telegram.ui.ActionBar.f6 f6Var, b2 b2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = z2Var;
        this.g = zArr;
        this.e = f6Var;
        this.f = b2Var;
        this.h = zArr2;
    }
}
