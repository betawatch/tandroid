package org.telegram.messenger.voip;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoCapturerDevice b;

    public /* synthetic */ i(VideoCapturerDevice videoCapturerDevice, int i10) {
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
