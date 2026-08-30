package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebProxyTransport b;

    public /* synthetic */ am(WebProxyTransport webProxyTransport, int i10) {
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
