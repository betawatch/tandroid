package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ wa(MessagesController messagesController, ArrayList arrayList, int i10) {
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
                this.b.lambda$processUpdateArray$402(this.c);
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
