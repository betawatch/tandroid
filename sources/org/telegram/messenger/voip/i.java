package org.telegram.messenger.voip;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ i(VideoCapturerDevice videoCapturerDevice, int i7) {
        this.a = i7;
        this.b = videoCapturerDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onDestroy$8();
                break;
            default:
                this.b.lambda$onDestroy$9();
                break;
        }
    }
}
