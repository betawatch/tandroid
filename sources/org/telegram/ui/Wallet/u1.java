package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.ui.Components.lc;
import org.telegram.ui.u60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ d3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;
    public final /* synthetic */ h2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ u1(hi.d dVar, hi.d dVar2, l2 l2Var, h2 h2Var, d3 d3Var, org.telegram.ui.ActionBar.i6 i6Var, p pVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = l2Var;
        this.f = h2Var;
        this.d = d3Var;
        this.e = i6Var;
        this.h = pVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l2 l2Var = (l2) this.g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.d dVar = this.b;
                dVar.setEnabled(false);
                hi.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                d3 d3Var = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.e;
                h2 h2Var = this.f;
                l2Var.f(h2Var, booleanValue, new u60(dVar, dVar2, d3Var, i6Var, pVar, h2Var, 3));
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
                d3 d3Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        lc.d0(str, d3Var2.F, this.e);
                        h2 h2Var2 = this.f;
                        dVar3.setEnabled(!h2Var2.n && zArr2[0]);
                        if (!h2Var2.n && !h2Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
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

    public /* synthetic */ u1(hi.d dVar, hi.d dVar2, d3 d3Var, boolean[] zArr, org.telegram.ui.ActionBar.i6 i6Var, h2 h2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = d3Var;
        this.g = zArr;
        this.e = i6Var;
        this.f = h2Var;
        this.h = zArr2;
    }
}
