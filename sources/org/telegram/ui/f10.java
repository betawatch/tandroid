package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ f10(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.np.u1(f40Var.o1.a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new v00(f40Var, 10));
                break;
            default:
                f40 f40Var2 = this.b;
                if (updates == null) {
                    f40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.np.u1(f40Var2.o1.a).V3(updates, false);
                    break;
                }
        }
    }
}
