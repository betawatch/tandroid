package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class gd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;

    public /* synthetic */ gd(BaseController baseController, long j3, long j10, int i10) {
        this.a = i10;
        this.d = baseController;
        this.b = j3;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.b, this.c);
                break;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.b, this.c);
                break;
        }
    }
}
