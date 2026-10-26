package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ca implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ ca(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markAllTopicsAsRead$7(this.c, this.d);
                break;
            case 1:
                this.b.lambda$deleteMessagesByPush$370(this.c, this.d);
                break;
            case 2:
                this.b.lambda$generateJoinMessage$369(this.d, this.c);
                break;
            case 3:
                this.b.lambda$getDifference$356(this.d, this.c);
                break;
            case 4:
                this.b.lambda$processUpdateArray$423(this.d, this.c);
                break;
            default:
                this.b.lambda$getDifference$355(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ ca(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
        this.d = j10;
    }
}
