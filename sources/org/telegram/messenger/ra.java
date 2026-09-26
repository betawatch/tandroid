package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;

    public /* synthetic */ ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$didReceivedNotification$46(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$didReceivedNotification$48(this.c, this.d, this.e);
                break;
        }
    }
}
