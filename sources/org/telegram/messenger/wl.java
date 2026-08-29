package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebProxyTransport b;

    public /* synthetic */ wl(WebProxyTransport webProxyTransport, int i10) {
        this.a = i10;
        this.b = webProxyTransport;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.createWebView();
                break;
            case 1:
                this.b.drainOutbound();
                break;
            case 2:
                this.b.lambda$stopInternal$0();
                break;
            case 3:
                this.b.lambda$failCarrier$4();
                break;
            default:
                this.b.acceptLoop();
                break;
        }
    }
}
