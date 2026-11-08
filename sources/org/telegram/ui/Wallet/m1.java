package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ y2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ a2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m1(fi.d dVar, fi.d dVar2, e2 e2Var, a2 a2Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = e2Var;
        this.f = a2Var;
        this.d = y2Var;
        this.e = f6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar = this.b;
                dVar.setEnabled(false);
                fi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                y2 y2Var = this.d;
                org.telegram.ui.ActionBar.f6 f6Var = this.e;
                a2 a2Var = this.f;
                e2Var.f(a2Var, booleanValue, new t60(dVar, dVar2, y2Var, f6Var, gVar, a2Var, 3));
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
                y2 y2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        hc.c0(str, y2Var2.E, this.e);
                        a2 a2Var2 = this.f;
                        dVar3.setEnabled(!a2Var2.n && zArr2[0]);
                        if (!a2Var2.n && !a2Var2.o) {
                            z9 = true;
                        }
                        dVar4.setEnabled(z9);
                        break;
                    } else {
                        hc.b0(str);
                        break;
                    }
                } else {
                    y2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(fi.d dVar, fi.d dVar2, y2 y2Var, boolean[] zArr, org.telegram.ui.ActionBar.f6 f6Var, a2 a2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = y2Var;
        this.g = zArr;
        this.e = f6Var;
        this.f = a2Var;
        this.h = zArr2;
    }
}
