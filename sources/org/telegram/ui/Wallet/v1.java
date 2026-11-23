package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.kc;
import org.telegram.ui.t60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements w10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ hi.e c;
    public final /* synthetic */ e3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;
    public final /* synthetic */ i2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ v1(hi.e eVar, hi.e eVar2, m2 m2Var, i2 i2Var, e3 e3Var, org.telegram.ui.ActionBar.i6 i6Var, p pVar) {
        this.b = eVar;
        this.c = eVar2;
        this.g = m2Var;
        this.f = i2Var;
        this.d = e3Var;
        this.e = i6Var;
        this.h = pVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                m2 m2Var = (m2) this.g;
                p pVar = (p) this.h;
                Boolean bool = (Boolean) obj;
                hi.e eVar = this.b;
                eVar.setEnabled(false);
                hi.e eVar2 = this.c;
                eVar2.setEnabled(false);
                (bool.booleanValue() ? eVar2 : eVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                e3 e3Var = this.d;
                org.telegram.ui.ActionBar.i6 i6Var = this.e;
                i2 i2Var = this.f;
                m2Var.f(i2Var, booleanValue, new t60(eVar, eVar2, e3Var, i6Var, pVar, i2Var, 3));
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
                e3 e3Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        kc.d0(str, e3Var2.F, this.e);
                        i2 i2Var2 = this.f;
                        eVar3.setEnabled(!i2Var2.n && zArr2[0]);
                        if (!i2Var2.n && !i2Var2.o) {
                            z10 = true;
                        }
                        eVar4.setEnabled(z10);
                        break;
                    } else {
                        kc.c0(str);
                        break;
                    }
                } else {
                    e3Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v1(hi.e eVar, hi.e eVar2, e3 e3Var, boolean[] zArr, org.telegram.ui.ActionBar.i6 i6Var, i2 i2Var, boolean[] zArr2) {
        this.b = eVar;
        this.c = eVar2;
        this.d = e3Var;
        this.g = zArr;
        this.e = i6Var;
        this.f = i2Var;
        this.h = zArr2;
    }
}
