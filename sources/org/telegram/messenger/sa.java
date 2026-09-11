package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ sa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadHintDialogs$195(this.c);
                break;
            case 1:
                this.b.lambda$getContentSettings$501(this.c);
                break;
            case 2:
                this.b.lambda$reloadReactionsNotifySettings$204(this.c);
                break;
            case 3:
                this.b.lambda$loadGlobalNotificationsSettings$202(this.c);
                break;
            case 4:
                this.b.lambda$loadUnreadDialogs$361(this.c);
                break;
            case 5:
                this.b.lambda$loadSuggestedFilters$24(this.c);
                break;
            default:
                this.b.lambda$loadSignUpNotificationsSettings$206(this.c);
                break;
        }
    }
}
