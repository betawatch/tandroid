package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ba0 implements yp {
    public final /* synthetic */ cy a;
    public final /* synthetic */ int b;

    public ba0(cy cyVar, int i10) {
        this.a = cyVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.yp
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override // org.telegram.ui.yp
    public final void a(TLRPC.User user) {
    }
}
