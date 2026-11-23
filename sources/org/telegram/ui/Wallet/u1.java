package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.u60;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements y10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ hi.e c;
    public final /* synthetic */ d3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 e;
    public final /* synthetic */ h2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ u1(hi.e eVar, hi.e eVar2, l2 l2Var, h2 h2Var, d3 d3Var, org.telegram.ui.ActionBar.h6 h6Var, p pVar) {
        this.b = eVar;
        this.c = eVar2;
        this.g = l2Var;
        this.f = h2Var;
        this.d = d3Var;
        this.e = h6Var;
        this.h = pVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l2 l2Var = (l2) this.g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.e eVar = this.b;
                eVar.setEnabled(false);
                hi.e eVar2 = this.c;
                eVar2.setEnabled(false);
                (bool.booleanValue() ? eVar2 : eVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                d3 d3Var = this.d;
                org.telegram.ui.ActionBar.h6 h6Var = this.e;
                h2 h2Var = this.f;
                l2Var.f(h2Var, booleanValue, new u60(eVar, eVar2, d3Var, h6Var, pVar, h2Var, 3));
                break;
            default:
                boolean[] zArr = (boolean[]) this.g;
                boolean[] zArr2 = (boolean[]) this.h;
                String str = (String) obj;
                hi.e eVar3 = this.b;
                boolean z10 = false;
                eVar3.setLoading(false);
                hi.e eVar4 = this.c;
                eVar4.setLoading(false);
                d3 d3Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        lc.d0(str, d3Var2.F, this.e);
                        h2 h2Var2 = this.f;
                        eVar3.setEnabled(!h2Var2.n && zArr2[0]);
                        if (!h2Var2.n && !h2Var2.o) {
                            z10 = true;
                        }
                        eVar4.setEnabled(z10);
                        break;
                    } else {
                        lc.c0(str);
                        break;
                    }
                } else {
                    d3Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u1(hi.e eVar, hi.e eVar2, d3 d3Var, boolean[] zArr, org.telegram.ui.ActionBar.h6 h6Var, h2 h2Var, boolean[] zArr2) {
        this.b = eVar;
        this.c = eVar2;
        this.d = d3Var;
        this.g = zArr;
        this.e = h6Var;
        this.f = h2Var;
        this.h = zArr2;
    }
}
