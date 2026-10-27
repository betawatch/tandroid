package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ ha(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
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
                this.b.lambda$processUpdateArray$424(this.d, this.c);
                break;
            default:
                this.b.lambda$getDifference$355(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ ha(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
        this.d = j10;
    }
}
