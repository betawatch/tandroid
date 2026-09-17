package org.telegram.messenger.voip;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
