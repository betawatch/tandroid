package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e5 extends z4 {
    @Override // org.telegram.ui.z4
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.z4
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.c).id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.g;
            if (z10) {
                if (z10) {
                    this.g = false;
                    this.b.removeObserver(this.a, this.e);
                }
                this.f.accept(userFull);
            }
        }
    }
}
