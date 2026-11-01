package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ v9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.n0 n0Var;
        switch (this.a) {
            case 0:
                ba.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ba baVar = this.b;
                if (!baVar.isFinished && (n0Var = baVar.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.i0.v1(n0Var);
                        baVar.m0(null, user);
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
