package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class mc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mc(int i10, MessagesController messagesController, boolean z10) {
        this.a = i10;
        this.b = messagesController;
        this.c = z10;
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
