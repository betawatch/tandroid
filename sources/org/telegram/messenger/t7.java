package org.telegram.messenger;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseController e;

    public /* synthetic */ t7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j3;
        this.c = j10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.b, this.c, this.d);
                break;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.b, this.c, this.d);
                break;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.b, this.c, this.d);
                break;
        }
    }
}
