package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ x5(LocationSharingService locationSharingService, int i10) {
        this.a = i10;
        this.b = locationSharingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onCreate$1();
                break;
            default:
                this.b.lambda$didReceivedNotification$2();
                break;
        }
    }
}
