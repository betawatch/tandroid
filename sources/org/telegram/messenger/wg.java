package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ wg(NotificationsController notificationsController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = notificationsController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$forceShowPopupForReply$7(this.c);
                break;
            case 1:
                this.b.lambda$processReadMessages$21(this.c);
                break;
            case 2:
                this.b.lambda$processDialogsUpdateRead$29(this.c);
                break;
            case 3:
                this.b.lambda$removeDeletedMessagesFromNotifications$9(this.c);
                break;
            default:
                this.b.lambda$removeDeletedHisoryFromNotifications$12(this.c);
                break;
        }
    }
}
