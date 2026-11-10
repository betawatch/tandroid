package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e10 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ e10(f40 f40Var, int i7) {
        this.a = i7;
        this.b = f40Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(f40Var.n1.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new v00(f40Var, 9));
                break;
            default:
                f40 f40Var2 = this.b;
                if (updates == null) {
                    f40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.qp.s1(f40Var2.n1.a).O3(updates, false);
                    break;
                }
        }
    }
}
