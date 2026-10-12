package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ z9(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
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

    public /* synthetic */ z9(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
        this.d = j10;
    }
}
