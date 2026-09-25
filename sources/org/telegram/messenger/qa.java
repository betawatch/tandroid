package org.telegram.messenger;

import yf.r;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ r c;

    public /* synthetic */ qa(MessagesController messagesController, r rVar, int i10) {
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
                this.b.lambda$processUpdateArray$404(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$399(this.c);
                break;
        }
    }
}
