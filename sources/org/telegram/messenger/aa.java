package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ aa(MessagesController messagesController, long j10, ArrayList arrayList, int i10) {
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

    public /* synthetic */ aa(MessagesController messagesController, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
        this.d = j10;
    }
}
