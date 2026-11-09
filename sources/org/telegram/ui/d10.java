package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ d10(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.qp.s1(e40Var.k1.a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new u00(e40Var, 9));
                break;
            default:
                e40 e40Var2 = this.b;
                if (updates == null) {
                    e40Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.qp.s1(e40Var2.k1.a).O3(updates, false);
                    break;
                }
        }
    }
}
