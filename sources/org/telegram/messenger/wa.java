package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                this.b.lambda$processUpdates$382(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$400(this.c);
                break;
            case 2:
                this.b.lambda$checkChatInviter$372(this.c);
                break;
            case 3:
                this.b.lambda$processUpdates$381(this.c);
                break;
            case 4:
                this.b.lambda$processUpdateArray$401(this.c);
                break;
            case 5:
                this.b.lambda$getChannelDifference$340(this.c);
                break;
            case 6:
                this.b.lambda$reloadMentionsCountForChannels$221(this.c);
                break;
            default:
                this.b.lambda$checkChatInviter$371(this.c);
                break;
        }
    }
}
