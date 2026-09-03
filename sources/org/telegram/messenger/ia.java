package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ia(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$397(this.c);
                break;
            case 1:
                this.b.lambda$processUpdates$379(this.c);
                break;
            case 2:
                this.b.lambda$processUpdates$378(this.c);
                break;
            case 3:
                this.b.lambda$getChannelDifference$341(this.c);
                break;
            case 4:
                this.b.lambda$processUpdateArray$398(this.c);
                break;
            case 5:
                this.b.lambda$checkChatInviter$372(this.c);
                break;
            case 6:
                this.b.lambda$reloadMentionsCountForChannels$222(this.c);
                break;
            default:
                this.b.lambda$checkChatInviter$373(this.c);
                break;
        }
    }
}
