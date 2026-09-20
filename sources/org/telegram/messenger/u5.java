package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationSharingService b;

    public /* synthetic */ u5(LocationSharingService locationSharingService, int i10) {
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
