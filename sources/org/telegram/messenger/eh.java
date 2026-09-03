package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ eh(NotificationsController notificationsController, ArrayList arrayList, int i10) {
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
