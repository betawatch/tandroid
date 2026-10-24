package org.telegram.messenger;

import zf.r;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ r c;

    public /* synthetic */ db(MessagesController messagesController, r rVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$402(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$405(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$407(this.c);
                break;
        }
    }
}
