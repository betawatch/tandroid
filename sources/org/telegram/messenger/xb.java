package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ xb(MessagesController messagesController, TLObject tLObject, int i10) {
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
                this.b.lambda$getContentSettings$507(this.c);
                break;
            case 3:
                this.b.lambda$loadSuggestedFilters$24(this.c);
                break;
            case 4:
                this.b.lambda$loadUnreadDialogs$362(this.c);
                break;
            case 5:
                this.b.lambda$loadHintDialogs$194(this.c);
                break;
            default:
                this.b.lambda$loadSignUpNotificationsSettings$205(this.c);
                break;
        }
    }
}
