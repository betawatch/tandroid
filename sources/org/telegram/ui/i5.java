package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i5 extends d5 {
    @Override // org.telegram.ui.d5
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.d5
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
