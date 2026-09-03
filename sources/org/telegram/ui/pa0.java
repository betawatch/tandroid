package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pa0 implements hq {
    public final /* synthetic */ py a;
    public final /* synthetic */ int b;

    public pa0(py pyVar, int i10) {
        this.a = pyVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.hq
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.a.removeSelfFromStack();
        NotificationCenter.getInstance(this.b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override // org.telegram.ui.hq
    public final void a(TLRPC.User user) {
    }
}
