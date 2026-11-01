package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b20 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a50 b;

    public /* synthetic */ b20(a50 a50Var, int i10) {
        this.a = i10;
        this.b = a50Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        switch (this.a) {
            case 0:
                a50 a50Var = this.b;
                if (updates != null) {
                    org.telegram.messenger.wp.r1(a50Var.k1.a).L3(updates, false);
                }
                org.telegram.messenger.i0.g3(new s10(a50Var, 10));
                break;
            default:
                a50 a50Var2 = this.b;
                if (updates == null) {
                    a50Var2.getClass();
                    break;
                } else {
                    org.telegram.messenger.wp.r1(a50Var2.k1.a).L3(updates, false);
                    break;
                }
        }
    }
}
