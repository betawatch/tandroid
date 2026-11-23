package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e10 implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ e10(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(e40Var.o1.a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new u00(e40Var, 10));
                break;
            default:
                e40 e40Var2 = this.b;
                if (updates == null) {
                    e40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.mp.u1(e40Var2.o1.a).V3(updates, false);
                    break;
                }
        }
    }
}
