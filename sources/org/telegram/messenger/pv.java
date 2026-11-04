package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ long c;

    public /* synthetic */ pv(vv vvVar, long j10, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 2;
        long j10 = this.c;
        int i11 = 1;
        vv vvVar = this.b;
        switch (i3) {
            case 0:
                a0.h hVar = vvVar.getMessagesController().R;
                long j11 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    vvVar.getMessagesController().S.l(dialog.id);
                }
                vvVar.getMessagesStorage().a.c(new pv(vvVar, j11, i11));
                qr messagesStorage = vvVar.getMessagesStorage();
                messagesStorage.a.c(new rp(messagesStorage, 1, j11, 1));
                vvVar.getNotificationCenter().k(3, new Object[0]);
                vvVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                break;
            case 1:
                g0.h3(new pv(vvVar, j10, i10));
                break;
            case 2:
                us notificationsController = vvVar.getNotificationsController();
                long j12 = this.c;
                notificationsController.L(null, j12, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                vvVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                vvVar.getMessagesController().X(0, j10, false);
                break;
        }
    }
}
