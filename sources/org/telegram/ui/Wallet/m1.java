package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.r70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vh.d b;
    public final /* synthetic */ vh.d c;
    public final /* synthetic */ y2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 e;
    public final /* synthetic */ a2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m1(vh.d dVar, vh.d dVar2, e2 e2Var, a2 a2Var, y2 y2Var, org.telegram.ui.ActionBar.p6 p6Var, g gVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = e2Var;
        this.f = a2Var;
        this.d = y2Var;
        this.e = p6Var;
        this.h = gVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.g;
                g gVar = (g) this.h;
                Boolean bool = (Boolean) obj;
                vh.d dVar = this.b;
                dVar.setEnabled(false);
                vh.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                y2 y2Var = this.d;
                org.telegram.ui.ActionBar.p6 p6Var = this.e;
                a2 a2Var = this.f;
                e2Var.f(a2Var, booleanValue, new r70(dVar, dVar2, y2Var, p6Var, gVar, a2Var, 3));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                vh.d dVar3 = this.b;
                boolean z10 = false;
                dVar3.setLoading(false);
                vh.d dVar4 = this.c;
                dVar4.setLoading(false);
                y2 y2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        cc.c0(str, y2Var2.E, this.e);
                        a2 a2Var2 = this.f;
                        dVar3.setEnabled(!a2Var2.n && zArr2[0]);
                        if (!a2Var2.n && !a2Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        cc.b0(str);
                        break;
                    }
                } else {
                    y2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(vh.d dVar, vh.d dVar2, y2 y2Var, boolean[] zArr, org.telegram.ui.ActionBar.p6 p6Var, a2 a2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = y2Var;
        this.g = zArr;
        this.e = p6Var;
        this.f = a2Var;
        this.h = zArr2;
    }
}
