package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c20 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ c20(b50 b50Var, int i10) {
        this.a = i10;
        this.b = b50Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                b50 b50Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.vp.r1(b50Var.k1.a).L3(updates, false);
                }
                org.telegram.messenger.i0.g3(new t10(b50Var, 10));
                break;
            default:
                b50 b50Var2 = this.b;
                if (updates == null) {
                    b50Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.vp.r1(b50Var2.k1.a).L3(updates, false);
                    break;
                }
        }
    }
}
