package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;

    public /* synthetic */ hd(BaseController baseController, long j3, long j10, int i10) {
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
