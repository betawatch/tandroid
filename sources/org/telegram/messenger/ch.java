package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
