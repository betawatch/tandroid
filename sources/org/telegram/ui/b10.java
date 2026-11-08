package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b10 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ b10(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                c40 c40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(c40Var.k1.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new s00(c40Var, 9));
                break;
            default:
                c40 c40Var2 = this.b;
                if (updates == null) {
                    c40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.qp.s1(c40Var2.k1.a).O3(updates, false);
                    break;
                }
        }
    }
}
