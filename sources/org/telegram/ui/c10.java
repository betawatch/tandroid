package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c10 implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ c10(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                c40 c40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.np.s1(c40Var.o1.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new s00(c40Var, 10));
                break;
            default:
                c40 c40Var2 = this.b;
                if (updates == null) {
                    c40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.np.s1(c40Var2.o1.a).O3(updates, false);
                    break;
                }
        }
    }
}
