package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationController b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ r5(LocationController locationController, Integer num, int i10) {
        this.a = i10;
        this.b = locationController;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onConnected$2(this.c);
                break;
            default:
                this.b.lambda$onConnected$1(this.c);
                break;
        }
    }
}
