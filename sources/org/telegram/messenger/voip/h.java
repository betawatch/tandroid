package org.telegram.messenger.voip;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ h(VideoCapturerDevice videoCapturerDevice, int i10) {
        this.a = i10;
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
