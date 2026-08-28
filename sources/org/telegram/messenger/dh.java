package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dh(int i9, int i10, int i11) {
        this.a = i11;
        this.b = i9;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$login$11(this.b, this.c);
                break;
            case 1:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(this.b, this.c);
                break;
            case 2:
                ConnectionsManager.lambda$onConnectionStateChanged$15(this.b, this.c);
                break;
            default:
                ConnectionsManager.getInstance(this.b).cancelRequest(this.c, true);
                break;
        }
    }
}
