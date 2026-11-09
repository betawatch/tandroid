package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.hc;
import org.telegram.ui.v60;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ fi.d c;
    public final /* synthetic */ x2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ z1 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l1(fi.d dVar, fi.d dVar2, d2 d2Var, z1 z1Var, x2 x2Var, org.telegram.ui.ActionBar.g6 g6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = d2Var;
        this.f = z1Var;
        this.d = x2Var;
        this.e = g6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                fi.d dVar = this.b;
                dVar.setEnabled(false);
                fi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                x2 x2Var = this.d;
                org.telegram.ui.ActionBar.g6 g6Var = this.e;
                z1 z1Var = this.f;
                d2Var.f(z1Var, booleanValue, new v60(dVar, dVar2, x2Var, g6Var, gVar, z1Var, 3));
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
                x2 x2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        hc.c0(str, x2Var2.E, this.e);
                        z1 z1Var2 = this.f;
                        dVar3.setEnabled(!z1Var2.n && zArr2[0]);
                        if (!z1Var2.n && !z1Var2.o) {
                            z9 = true;
                        }
                        dVar4.setEnabled(z9);
                        break;
                    } else {
                        hc.b0(str);
                        break;
                    }
                } else {
                    x2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l1(fi.d dVar, fi.d dVar2, x2 x2Var, boolean[] zArr, org.telegram.ui.ActionBar.g6 g6Var, z1 z1Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = x2Var;
        this.g = zArr;
        this.e = g6Var;
        this.f = z1Var;
        this.h = zArr2;
    }
}
