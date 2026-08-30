package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseController e;

    public /* synthetic */ w7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
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
