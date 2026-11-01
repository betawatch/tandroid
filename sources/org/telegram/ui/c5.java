package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c5 extends x4 {
    @Override // org.telegram.ui.x4
    public final void a() {
        org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).e3((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.x4
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.c).id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.g;
            if (z10) {
                if (z10) {
                    this.g = false;
                    this.b.n(this.a, this.e);
                }
                this.f.accept(userFull);
            }
        }
    }
}
