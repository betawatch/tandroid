package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d5 extends y4 {
    @Override // org.telegram.ui.y4
    public final void a() {
        org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).g3((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.y4
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.c).id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z9 = this.g;
            if (z9) {
                if (z9) {
                    this.g = false;
                    this.b.n(this.a, this.e);
                }
                this.f.accept(userFull);
            }
        }
    }
}
