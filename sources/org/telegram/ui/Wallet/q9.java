package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ q9(w9 w9Var, int i7) {
        this.a = i7;
        this.b = w9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                w9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w9 w9Var = this.b;
                if (!w9Var.isFinished && (iVar = w9Var.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
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
