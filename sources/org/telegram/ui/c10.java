package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
