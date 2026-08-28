package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ x9(MessagesController messagesController, long j10, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = messagesController;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$markAllTopicsAsRead$7(this.d, this.c);
                break;
            case 1:
                this.b.lambda$generateJoinMessage$368(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getDifference$354(this.c, this.d);
                break;
            case 3:
                this.b.lambda$processUpdateArray$418(this.c, this.d);
                break;
            case 4:
                this.b.lambda$deleteMessagesByPush$369(this.d, this.c);
                break;
            default:
                this.b.lambda$getDifference$355(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ x9(MessagesController messagesController, ArrayList arrayList, long j10, int i9) {
        this.a = i9;
        this.b = messagesController;
        this.d = arrayList;
        this.c = j10;
    }
}
