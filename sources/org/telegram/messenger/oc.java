package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oc(int i10, MessagesController messagesController, boolean z4) {
        this.a = i10;
        this.b = messagesController;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkPromoInfo$164(this.c);
                break;
            default:
                this.b.lambda$removeFolderTemporarily$480(this.c);
                break;
        }
    }
}
