package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d5 extends y4 {
    @Override // org.telegram.ui.y4
    public final void a() {
        org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).n3((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.y4
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
