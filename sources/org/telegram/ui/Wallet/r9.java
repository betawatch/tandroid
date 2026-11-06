package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ r9(x9 x9Var, int i7) {
        this.a = i7;
        this.b = x9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                x9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                x9 x9Var = this.b;
                if (!x9Var.isFinished && (iVar = x9Var.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        x9Var.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new s9(x9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
