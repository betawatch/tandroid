package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z4(int i10, String str, long j10, long j11) {
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

    public /* synthetic */ z4(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.c = j11;
        this.d = i10;
    }
}
