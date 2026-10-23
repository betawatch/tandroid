package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
import org.telegram.ui.l80;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ ei.d c;
    public final /* synthetic */ j2 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 e;
    public final /* synthetic */ b2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ q1(ei.d dVar, ei.d dVar2, f2 f2Var, b2 b2Var, j2 j2Var, org.telegram.ui.ActionBar.d6 d6Var, h hVar) {
        this.b = dVar;
        this.c = dVar2;
        this.g = f2Var;
        this.f = b2Var;
        this.d = j2Var;
        this.e = d6Var;
        this.h = hVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.g;
                h hVar = (h) this.h;
                Boolean bool = (Boolean) obj;
                ei.d dVar = this.b;
                dVar.setEnabled(false);
                ei.d dVar2 = this.c;
                dVar2.setEnabled(false);
                (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
                boolean booleanValue = bool.booleanValue();
                j2 j2Var = this.d;
                org.telegram.ui.ActionBar.d6 d6Var = this.e;
                b2 b2Var = this.f;
                f2Var.e(b2Var, booleanValue, new l80(dVar, dVar2, j2Var, d6Var, hVar, b2Var, 4));
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
                j2 j2Var2 = this.d;
                if (str != null) {
                    if (!zArr[0]) {
                        xc.c0(str, j2Var2.topBulletinContainer, this.e);
                        b2 b2Var2 = this.f;
                        dVar3.setEnabled(!b2Var2.n && zArr2[0]);
                        if (!b2Var2.n && !b2Var2.o) {
                            z10 = true;
                        }
                        dVar4.setEnabled(z10);
                        break;
                    } else {
                        xc.b0(str);
                        break;
                    }
                } else {
                    j2Var2.dismiss();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q1(ei.d dVar, ei.d dVar2, j2 j2Var, boolean[] zArr, org.telegram.ui.ActionBar.d6 d6Var, b2 b2Var, boolean[] zArr2) {
        this.b = dVar;
        this.c = dVar2;
        this.d = j2Var;
        this.g = zArr;
        this.e = d6Var;
        this.f = b2Var;
        this.h = zArr2;
    }
}
