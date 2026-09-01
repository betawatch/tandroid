package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g5 extends b5 {
    @Override // org.telegram.ui.b5
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.c, false, this.d);
    }

    @Override // org.telegram.ui.b5
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.c).id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z4 = this.g;
            if (z4) {
                if (z4) {
                    this.g = false;
                    this.b.removeObserver(this.a, this.e);
                }
                this.f.accept(userFull);
            }
        }
    }
}
