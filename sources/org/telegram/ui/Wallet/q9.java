package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ q9(w9 w9Var, int i3) {
        this.a = i3;
        this.b = w9Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        bh.g gVar;
        switch (this.a) {
            case 0:
                w9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w9 w9Var = this.b;
                if (!w9Var.isFinished && (gVar = w9Var.O) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(gVar);
                        w9Var.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new r9(w9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
