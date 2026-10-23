package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ah(NotificationsController notificationsController, ArrayList arrayList, int i10) {
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
