package org.telegram.messenger;

import zf.r;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ r c;

    public /* synthetic */ ab(MessagesController messagesController, r rVar, int i10) {
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
