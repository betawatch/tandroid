package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 e;

    public /* synthetic */ ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tLObject;
        this.d = i6Var;
        this.e = h6Var;
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
