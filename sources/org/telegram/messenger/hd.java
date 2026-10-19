package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;

    public /* synthetic */ hd(BaseController baseController, long j10, long j11, int i10) {
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
