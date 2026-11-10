package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ s9(y9 y9Var, int i7) {
        this.a = i7;
        this.b = y9Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        ah.i iVar;
        switch (this.a) {
            case 0:
                y9.e0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y9 y9Var = this.b;
                if (!y9Var.isFinished && (iVar = y9Var.N) != null) {
                    if (user != null) {
                        org.telegram.messenger.g0.v1(iVar);
                        y9Var.m0(null, user);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new t9(y9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
