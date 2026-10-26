package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
