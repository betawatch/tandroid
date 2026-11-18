package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ f10(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.mp.u1(f40Var.o1.a).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new v00(f40Var, 10));
                break;
            default:
                f40 f40Var2 = this.b;
                if (updates == null) {
                    f40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.mp.u1(f40Var2.o1.a).V3(updates, false);
                    break;
                }
        }
    }
}
