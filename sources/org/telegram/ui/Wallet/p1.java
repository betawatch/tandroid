package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.j90;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ di.d c;
    public final /* synthetic */ i2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;
    public final /* synthetic */ a2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p1(di.d dVar, di.d dVar2, e2 e2Var, a2 a2Var, i2 i2Var, org.telegram.ui.ActionBar.c6 c6Var, l lVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = e2Var;
        this.f = a2Var;
        this.d = i2Var;
        this.e = c6Var;
        this.h = lVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.g;
                l lVar = (l) this.h;
                Boolean bool = (Boolean) obj;
                di.d dVar = this.b;
                dVar.setEnabled(false);
                di.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                i2 i2Var = this.d;
                org.telegram.ui.ActionBar.c6 c6Var = this.e;
                a2 a2Var = this.f;
                e2Var.e(a2Var, booleanValue, new j90(dVar, dVar2, i2Var, c6Var, lVar, a2Var, 4));
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
                i2 i2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        zc.c0(str, i2Var2.topBulletinContainer, this.e);
                        a2 a2Var2 = this.f;
                        dVar3.setEnabled(!a2Var2.n && zArr2[0]);
                        if (!a2Var2.n && !a2Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        zc.b0(str);
                        break;
                    }
                } else {
                    i2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p1(di.d dVar, di.d dVar2, i2 i2Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var, a2 a2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = i2Var;
        this.g = zArr;
        this.e = c6Var;
        this.f = a2Var;
        this.h = zArr2;
    }
}
