package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f5 extends a5 {
    @Override // org.telegram.ui.a5
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.a5
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
