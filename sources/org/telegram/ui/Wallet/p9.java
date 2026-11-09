package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ p9(v9 v9Var, int i7) {
        this.a = i7;
        this.b = v9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                v9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                v9 v9Var = this.b;
                if (!v9Var.isFinished && (iVar = v9Var.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        v9Var.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new q9(v9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
