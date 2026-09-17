package org.telegram.messenger;

import yf.r;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ r c;

    public /* synthetic */ pa(MessagesController messagesController, r rVar, int i10) {
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
