package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class xv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw b;
    public final /* synthetic */ long c;

    public /* synthetic */ xv(dw dwVar, long j3, int i7) {
        this.a = i7;
        this.b = dwVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        long j3 = this.c;
        int i11 = 1;
        dw dwVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = dwVar.getMessagesController().Q;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    dwVar.getMessagesController().R.l(dialog.id);
                }
                dwVar.getMessagesStorage().a.c(new xv(dwVar, j10, i11));
                yr messagesStorage = dwVar.getMessagesStorage();
                messagesStorage.a.c(new aq(messagesStorage, 1, j10, 1));
                dwVar.getNotificationCenter().k(3, new Object[0]);
                dwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                break;
            case 1:
                g0.h3(new xv(dwVar, j3, i10));
                break;
            case 2:
                dt notificationsController = dwVar.getNotificationsController();
                long j11 = this.c;
                notificationsController.L(null, j11, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                dwVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                dwVar.getMessagesController().X(0, j3, false);
                break;
        }
    }
}
