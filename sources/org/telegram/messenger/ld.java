package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;

    public /* synthetic */ ld(BaseController baseController, long j10, long j11, int i10) {
        this.a = i10;
        this.d = baseController;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.b, this.c);
                break;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.b, this.c);
                break;
        }
    }
}
