package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
