package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
