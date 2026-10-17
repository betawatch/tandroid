package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ w9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteMessagesByPush$368(this.c, this.d);
                break;
            case 1:
                this.b.lambda$markAllTopicsAsRead$7(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getDifference$353(this.d, this.c);
                break;
            case 3:
                this.b.lambda$generateJoinMessage$367(this.d, this.c);
                break;
            case 4:
                this.b.lambda$processUpdateArray$421(this.d, this.c);
                break;
            default:
                this.b.lambda$getDifference$354(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ w9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
        this.d = j10;
    }
}
