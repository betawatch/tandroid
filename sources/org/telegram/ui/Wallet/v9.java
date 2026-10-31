package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ v9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.n0 n0Var;
        switch (this.a) {
            case 0:
                ba.d0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ba baVar = this.b;
                if (!baVar.isFinished && (n0Var = baVar.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.i0.v1(n0Var);
                        baVar.l0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new w9(baVar, 1));
                        break;
                    }
                }
                break;
        }
    }
}
