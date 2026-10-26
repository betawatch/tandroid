package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class yb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ yb(MessagesController messagesController, TLObject tLObject, int i10) {
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
                this.b.lambda$loadSuggestedFilters$24(this.c);
                break;
            case 3:
                this.b.lambda$loadUnreadDialogs$362(this.c);
                break;
            case 4:
                this.b.lambda$loadHintDialogs$194(this.c);
                break;
            case 5:
                this.b.lambda$loadSignUpNotificationsSettings$205(this.c);
                break;
            default:
                this.b.lambda$getContentSettings$506(this.c);
                break;
        }
    }
}
