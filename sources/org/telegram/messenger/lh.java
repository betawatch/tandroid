package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class lh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ lh(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
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
