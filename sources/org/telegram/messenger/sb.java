package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ sb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadGlobalNotificationsSettings$201(this.c);
                break;
            case 1:
                this.b.lambda$reloadReactionsNotifySettings$203(this.c);
                break;
            case 2:
                this.b.lambda$getContentSettings$504(this.c);
                break;
            case 3:
                this.b.lambda$loadSuggestedFilters$24(this.c);
                break;
            case 4:
                this.b.lambda$loadHintDialogs$194(this.c);
                break;
            case 5:
                this.b.lambda$loadUnreadDialogs$360(this.c);
                break;
            default:
                this.b.lambda$loadSignUpNotificationsSettings$205(this.c);
                break;
        }
    }
}
