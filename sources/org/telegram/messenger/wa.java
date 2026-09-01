package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ wa(MessagesController messagesController, TLObject tLObject, int i10) {
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
