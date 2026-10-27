package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ org.telegram.ui.ActionBar.x6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.w6 e;

    public /* synthetic */ hd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.x6 x6Var, org.telegram.ui.ActionBar.w6 w6Var, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
        this.d = x6Var;
        this.e = w6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$didReceivedNotification$47(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$didReceivedNotification$45(this.c, this.d, this.e);
                break;
        }
    }
}
