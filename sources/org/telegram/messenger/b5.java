package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b5(int i10, String str, long j10, long j11) {
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

    public /* synthetic */ b5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = i10;
    }
}
