package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ha(MessagesController messagesController, long j3, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
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

    public /* synthetic */ ha(MessagesController messagesController, ArrayList arrayList, long j3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.d = arrayList;
        this.c = j3;
    }
}
