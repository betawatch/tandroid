package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class ch implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ch(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = notificationsController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$removeDeletedHisoryFromNotifications$11(this.c);
                break;
            case 1:
                this.b.lambda$processReadMessages$20(this.c);
                break;
            case 2:
                this.b.lambda$forceShowPopupForReply$6(this.c);
                break;
            case 3:
                this.b.lambda$removeDeletedMessagesFromNotifications$8(this.c);
                break;
            default:
                this.b.lambda$processDialogsUpdateRead$28(this.c);
                break;
        }
    }
}
