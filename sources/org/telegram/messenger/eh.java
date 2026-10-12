package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
