package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ t9(z9 z9Var, int i7) {
        this.a = i7;
        this.b = z9Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                z9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                z9 z9Var = this.b;
                if (!z9Var.isFinished && (iVar = z9Var.O) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        z9Var.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new u9(z9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
