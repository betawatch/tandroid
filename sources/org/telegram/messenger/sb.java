package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
