package org.telegram.messenger.voip;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoCapturerDevice b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h(VideoCapturerDevice videoCapturerDevice, int i7, long j3) {
        this.b = videoCapturerDevice;
        this.d = i7;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onStateChanged$6(this.d, this.c);
                break;
            default:
                this.b.lambda$onStateChanged$7(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ h(VideoCapturerDevice videoCapturerDevice, long j3, int i7) {
        this.b = videoCapturerDevice;
        this.c = j3;
        this.d = i7;
    }
}
