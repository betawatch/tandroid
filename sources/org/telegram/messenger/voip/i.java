package org.telegram.messenger.voip;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoCapturerDevice b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ i(VideoCapturerDevice videoCapturerDevice, int i10, long j3) {
        this.b = videoCapturerDevice;
        this.d = i10;
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

    public /* synthetic */ i(VideoCapturerDevice videoCapturerDevice, long j3, int i10) {
        this.b = videoCapturerDevice;
        this.c = j3;
        this.d = i10;
    }
}
