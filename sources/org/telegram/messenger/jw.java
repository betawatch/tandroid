package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw b;
    public final /* synthetic */ long c;

    public /* synthetic */ jw(pw pwVar, long j10, int i10) {
        this.a = i10;
        this.b = pwVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2;
        long j10 = this.c;
        int i12 = 1;
        pw pwVar = this.b;
        switch (i10) {
            case 0:
                a0.h hVar = pwVar.getMessagesController().Q;
                long j11 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    pwVar.getMessagesController().R.l(dialog.id);
                }
                pwVar.getMessagesStorage().a.c(new jw(pwVar, j11, i12));
                is messagesStorage = pwVar.getMessagesStorage();
                messagesStorage.a.c(new hq(messagesStorage, 1, j11, 1));
                pwVar.getNotificationCenter().k(3, new Object[0]);
                pwVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                break;
            case 1:
                i0.g3(new jw(pwVar, j10, i11));
                break;
            case 2:
                pt notificationsController = pwVar.getNotificationsController();
                long j12 = this.c;
                notificationsController.L(null, j12, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                pwVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                pwVar.getMessagesController().X(0, j10, false);
                break;
        }
    }
}
