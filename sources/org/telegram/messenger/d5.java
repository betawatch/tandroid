package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d5(int i10, String str, long j10, long j11) {
        this.a = 0;
        this.d = i10;
        this.e = str;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ImageLoader.5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, this.b, this.c);
                break;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.b, this.c, this.d);
                break;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.b, this.c, this.d);
                break;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ d5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = i10;
    }
}
