package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ org.telegram.ui.ActionBar.j6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 e;

    public /* synthetic */ hd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
        this.d = j6Var;
        this.e = i6Var;
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
