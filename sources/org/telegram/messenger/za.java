package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ za(MessagesController messagesController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdates$384(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$404(this.c);
                break;
            case 2:
                this.b.lambda$processUpdateArray$403(this.c);
                break;
            case 3:
                this.b.lambda$checkChatInviter$374(this.c);
                break;
            case 4:
                this.b.lambda$processUpdates$383(this.c);
                break;
            case 5:
                this.b.lambda$getChannelDifference$342(this.c);
                break;
            case 6:
                this.b.lambda$reloadMentionsCountForChannels$221(this.c);
                break;
            default:
                this.b.lambda$checkChatInviter$373(this.c);
                break;
        }
    }
}
